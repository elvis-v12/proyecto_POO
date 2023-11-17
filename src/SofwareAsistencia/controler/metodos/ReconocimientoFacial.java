package SofwareAsistencia.controler.metodos;

import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

public class ReconocimientoFacial {

    public static void main(String[] args) {
        // Cargar la biblioteca OpenCV
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.load("C:/Users/Elvis/Downloads/opencv/build/java/x64/opencv_java480.dll");  // Ajusta la ruta según tu configuración

        // Cargar el clasificador de caras (ajusta la ruta según tu configuración)
        CascadeClassifier faceCascade = new CascadeClassifier("C:/Users/Elvis/Downloads/opencv/build/etc/haarcascades/haarcascade_frontalface_default.xml");


        // Verificar si el clasificador de caras se cargó correctamente
        if (faceCascade.empty()) {
            System.err.println("Error: No se pudo cargar el clasificador de caras.");
            return;
        }

        // Cargar la imagen en la que deseas realizar el reconocimiento facial (ajusta la ruta según tu configuración)
        String imagePath = "C:/Users/Elvis/Downloads/free.jpeg";
        Mat image = Imgcodecs.imread(imagePath);

        // Verificar si la imagen se cargó correctamente
        if (image.empty()) {
            System.err.println("Error: No se pudo cargar la imagen: " + imagePath);
            return;
        }

        // Convertir la imagen a escala de grises
        Mat grayImage = new Mat();
        Imgproc.cvtColor(image, grayImage, Imgproc.COLOR_BGR2GRAY);

        // Detectar caras en la imagen
        MatOfRect faceDetections = new MatOfRect();
        faceCascade.detectMultiScale(grayImage, faceDetections);

        // Dibujar un rectángulo alrededor de cada cara detectada
        for (Rect rect : faceDetections.toArray()) {
            Imgproc.rectangle(image, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height),
                    new Scalar(0, 255, 0), 2);
        }

        // Guardar la imagen con los rectángulos dibujados
           String outputImagePath = "C:/ruta/completa/a/tu/imagen_con_caras.jpg";
        Imgcodecs.imwrite(outputImagePath, image);
        
        System.out.println("Reconocimiento facial completado. Imagen guardada con rectángulos dibujados en: " + outputImagePath);
    }
}
