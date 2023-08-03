import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;

public class Main {
    public static void main(String[] args) throws IOException {

        File oldFile = new File("C:\\Users\\vanessa.luna\\Desktop\\Prueba XXX.pdf");

        PDDocument document = PDDocument.load(oldFile);

        Splitter splitter = new Splitter();

        List<PDDocument> splitPages = splitter.split(document);

        int num=1;
        for (PDDocument myDoc : splitPages){
            myDoc.save("C:\\Users\\vanessa.luna\\Desktop\\Extraer documento PDF Prueba\\split_0"+num+".pdf");
            num++;
            myDoc.close();
        }

        System.out.println("Split Done");
    }
}
