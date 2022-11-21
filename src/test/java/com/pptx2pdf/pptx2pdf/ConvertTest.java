package com.pptx2pdf.pptx2pdf;

import com.yeokhengmeng.docstopdfconverter.PptxToPDFConverter;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

@SpringBootTest
public class ConvertTest {

    @Test
    public void convert2pdf() throws Exception {
        final File file = new File("src/test/resources/ex.pptx");
        final File out = new File("out.pdf");
        final FileInputStream fileInputStream = new FileInputStream(file);
        final FileOutputStream fileOutputStream = new FileOutputStream(out);
        final PptxToPDFConverter pptxToPDFConverter = new PptxToPDFConverter(fileInputStream, fileOutputStream, false, true);
        pptxToPDFConverter.convert();
    }
}
