package utilidades;

public class PdfUtils {
    private static String Template =
            "<html>" +
            "<body>" +
            "PDF Template" +
            "{content}" +
            "</body>" +
            "</html>";

    public byte[] generarPdf(String texto) {
        //Suponer que tenemos un método que genera una salida en PDF a partir de un texto genérico
        //y que de alguna manera utiliza el template.
        return Template.replace("{content}", texto).getBytes();
    }
}
