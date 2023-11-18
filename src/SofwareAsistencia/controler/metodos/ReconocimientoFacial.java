package SofwareAsistencia.controler.metodos;

import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import org.opencv.core.*;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;
import org.opencv.videoio.Videoio;
import org.opencv.highgui.HighGui;

public class ReconocimientoFacial {

    private static VideoCapture videoCapture;

    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        // Rutas de archivos
        String classifierPath = "C:/Users/Elvis/Downloads/opencv/build/etc/haarcascades/haarcascade_frontalface_default.xml";

        // Realizar reconocimiento facial desde la cámara
        detectAndDrawFacesRealTime(classifierPath);
    }

    private static void detectAndDrawFacesRealTime(String classifierPath) {
        CascadeClassifier faceCascade = new CascadeClassifier(classifierPath);

        if (faceCascade.empty()) {
            System.err.println("Error: No se pudo cargar el clasificador de caras.");
            return;
        }

        videoCapture = new VideoCapture(0); // 0 represents the default camera
        videoCapture.set(Videoio.CAP_PROP_FRAME_WIDTH, 640); // Set the width of the video frame
        videoCapture.set(Videoio.CAP_PROP_FRAME_HEIGHT, 480); // Set the height of the video frame

        if (!videoCapture.isOpened()) {
            System.err.println("Error: No se pudo abrir la cámara.");
            return;
        }

        Mat frame = new Mat();

        // Crear un formulario para detectar el evento de cierre
        JFrame frameWindow = new JFrame("Reconocimiento Facial");
        frameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Agregar un WindowListener para detectar el cierre de la ventana
        frameWindow.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                releaseResources();
            }
        });

        try {
            // Agregar un shutdown hook para liberar recursos al cerrar la aplicación
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                System.out.println("Shutdown hook ejecutado. Liberando recursos...");
                releaseResources();
            }));

            while (true) {
                videoCapture.read(frame);

                if (frame.empty()) {
                    System.err.println("Error: No se pudo capturar el fotograma.");
                    break;
                }

                Mat grayFrame = new Mat();
                Imgproc.cvtColor(frame, grayFrame, Imgproc.COLOR_BGR2GRAY);

                MatOfRect faceDetections = new MatOfRect();
                faceCascade.detectMultiScale(grayFrame, faceDetections);

                for (Rect rect : faceDetections.toArray()) {
                    Imgproc.rectangle(frame, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height),
                            new Scalar(0, 255, 0), 2);
                }

                // Visualizar la imagen con los rectángulos dibujados
                HighGui.imshow("Reconocimiento Facial", frame);

                if (HighGui.waitKey(30) >= 0) {
                    break;
                }
            }
        } finally {
            // Asegurarse de cerrar la ventana antes de liberar la cámara
            HighGui.destroyAllWindows();

            // Breve pausa para dar tiempo a que la ventana se cierre
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Liberar la cámara al salir del bucle
            releaseResources();
        }
    }

    private static void releaseResources() {
        if (videoCapture != null && videoCapture.isOpened()) {
            System.out.println("Liberando la cámara...");
            videoCapture.release();
        }
        System.exit(0);  // Salir del programa
    }
}
    