package propiedades;

public class PdfUtils extends utilidades.PdfUtils {
    public static String Template =
            "<html>" +
                    "<body>" +
                    "PDF Template definido por el usuario" +
                    "{content}" +
                    "</body>" +
                    "</html>";

    public byte[] generarPdf(String texto) {
        return super.generarPdf(texto);
    }
}
