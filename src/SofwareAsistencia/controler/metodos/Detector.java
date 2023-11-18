package SofwareAsistencia.controler.metodos;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;

/**
 * Clase para detección de rostros y captura de cámara.
 */
public class Detector {

    // Actualiza la ruta al archivo XML del clasificador
    public static final String CLASSIFIER_PATH = "C:/Users/Elvis/Downloads/opencv/build/etc/haarcascades/haarcascade_frontalface_default.xml";
    private static final int FRAME_WIDTH = 640;
    private static final int FRAME_HEIGHT = 480;

    private int rostros;

    private CascadeClassifier faceCascade;
    private VideoCapture videoCapture;

    public Detector() {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        this.videoCapture = new VideoCapture();
    }

    public int getRostros() {
        return rostros;
    }

    public void iniciarCamara() {
        if (!videoCapture.isOpened()) {
            System.out.println("Error: No se pudo abrir la cámara.");
            return;
        }

        Mat frame = new Mat();
        if (videoCapture.read(frame)) {
            try {
                detectarRostrosEnFrame(frame);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Liberar la memoria asignada para el frame
        frame.release();

        // Cierra la cámara
        videoCapture.release();
    }

    public void detenerCamara() {
        if (videoCapture.isOpened()) {
            videoCapture.release();
        }
    }

    public void detectarRostrosEnFrame(Mat frame) {
        this.faceCascade = new CascadeClassifier(CLASSIFIER_PATH);
        MatOfRect faces = new MatOfRect();
        faceCascade.detectMultiScale(frame, faces, 1.1, 4, 0, new Size(30, 30), new Size());

        this.rostros = faces.toArray().length;

        for (Rect rect : faces.toArray()) {
            Point center = new Point(rect.x + rect.width / 2, rect.y + rect.height / 2);
            Imgproc.circle(frame, center, Math.max(rect.width, rect.height) / 2, new Scalar(0, 0, 255), 4);
        }

        // Guarda la foto con la detección de rostros en una ruta específica
        Imgcodecs.imwrite("C:\\Users\\Elvis\\Documents\\NetBeansProjects\\SofwareMatricula\\foto_con_deteccion.jpg", frame);

        // Liberar memoria para MatOfRect
        faces.release();
    }

    public static void main(String[] args) {
        Detector detector = new Detector();

        // Abre la cámara y toma una foto
        detector.videoCapture.open(0);
        detector.iniciarCamara();

        // Liberar los recursos de la cámara cuando haya terminado
        detector.detenerCamara();
    }
}
