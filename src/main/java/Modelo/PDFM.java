/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.JTable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Leo
 */
public class PDFM {
           
    
    
        public static void generarPDFM(JTable table, String fileName, String titulo) {
        String filePath = "C:\\Users\\Leo\\Documents\\NetBeansProjects\\Multas\\PDFS\\" + fileName;
        Document document = new Document(PageSize.A3);
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            Image logo = Image.getInstance("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Multas\\src\\main\\resource\\Imagenes\\Logo_3.jpg");
            logo.scaleToFit(100, 100);
            logo.setAlignment(Element.ALIGN_LEFT);
            document.add(logo);

            Paragraph title = new Paragraph(titulo);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);

            document.add(new Paragraph("\n"));

            PdfPTable pdfTable = new PdfPTable(table.getColumnCount());
            for (int i = 0; i < table.getColumnCount(); i++) {
                pdfTable.addCell(table.getColumnName(i));
            }

            for (int rows = 0; rows < table.getRowCount(); rows++) {
                for (int cols = 0; cols < table.getColumnCount(); cols++) {
                    pdfTable.addCell(table.getModel().getValueAt(rows, cols).toString());
                }
            }

            document.add(pdfTable);

            writer.setPageEvent(new PdfPageEventHelper() {

                public void onEndPage(PdfWriter writer, Document document) {
                    PdfContentByte cb = writer.getDirectContent();
                    Phrase footer = new Phrase("Fecha y Hora: " + new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date()));
                    cb.beginText();
                    try {
                        cb.setFontAndSize(BaseFont.createFont(BaseFont.HELVETICA, BaseFont.WINANSI, BaseFont.NOT_EMBEDDED), 10);
                    } catch (DocumentException | IOException e) {
                        e.printStackTrace();
                    }
                    cb.showTextAligned(Element.ALIGN_RIGHT, footer.toString(), document.right() - 10, document.bottom() - 10, 0);
                    cb.endText();
                }
            });

            document.close();

            JOptionPane.showMessageDialog(null, "PDF creado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
