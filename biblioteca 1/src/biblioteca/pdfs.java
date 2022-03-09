/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import static biblioteca.libros.j;
import static biblioteca.libros.path;
import static biblioteca.libros.pp;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class pdfs extends libros {
    
    
    
    public void pdftabla() {

 path = "";
 j=new JFileChooser();
j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
int x=j.showSaveDialog(this);
if(x==JFileChooser.APPROVE_OPTION){
path=j.getSelectedFile().getPath();


}

    document = new Document();
    try{
         PdfWriter.getInstance(document,new FileOutputStream(path+"abc.pdf"));
          document.open();
     pp= new  PdfPTable(7);
    
pp.addCell("Nombre Libro");
pp.addCell("Autor");
pp.addCell("Tipo");
pp.addCell("Copias");
pp.addCell("Disponibles");
 pp.addCell("Ocupados");
 for(int i=0;i<tabla.getRowCount();i++){
 
     String id = tabla.getValueAt(i, 0).toString();
     String nom = tabla.getValueAt(i, 1).toString();
     String au = tabla.getValueAt(i, 2).toString();
     String tip = tabla.getValueAt(i, 3).toString();
     String cop = tabla.getValueAt(i, 4).toString();
     String dis = tabla.getValueAt(i, 5).toString();
     String ocu = tabla.getValueAt(i, 6).toString();
     
     
     pp.addCell(id);
     pp.addCell(nom);
     pp.addCell(au);
     pp.addCell(tip);
     pp.addCell(cop);
     pp.addCell(dis);
     pp.addCell(ocu);
     
     
     
     
 }
      document.add(pp);
   
     
    }catch(Exception epp){
    
  JOptionPane.showMessageDialog(null, "error");
    
    
    }
            document.close();
}

    
}
