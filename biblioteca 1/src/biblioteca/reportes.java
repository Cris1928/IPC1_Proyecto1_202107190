package biblioteca;

import Elements.Usuario;
import biblioteca.clase2;
import biblioteca.libros;
import static biblioteca.libros.pp;

import biblioteca.prestamos;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;

import Elements.Libros;
import static biblioteca.libros.scroll;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.BufferedWriter;
import java.awt.Font;
import javax.swing.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

import com.itextpdf.text.Document;
import java.util.Calendar;
import static java.util.Calendar.DATE;
import java.util.GregorianCalendar;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;

public class reportes extends JPanel implements ActionListener {

    DefaultTableModel model;
    public static Calendar calendar = new GregorianCalendar();
    Calendar fecha = Calendar.getInstance();
    int segundo = fecha.get(Calendar.SECOND);
      int minuto = fecha.get(Calendar.MINUTE);
        boolean verdad=true;
      int hora = fecha.get(Calendar.HOUR);
   String h = Integer.toString(hora);
   String m = Integer.toString(minuto);
   String s = Integer.toString(segundo);
     public static int getDia(){
          
   return calendar.get(calendar.DATE);
      }
     public static int getMes(){
          
   return calendar.get(calendar.MONTH);
      }
    public static int getAño(){
          
   return calendar.get(calendar.YEAR);
      }
      public static int getHora(){
          
   return calendar.get(calendar.HOUR);
      }
       public static int getMinuto(){
          
   return calendar.get(calendar.MINUTE);
      }
       
    
    JButton boton1;
    JLabel etiqueta;
    JScrollPane scrol;
    JTable tablet;
    JComboBox lista;
    public static PdfPTable pp;
     public static PdfPTable ppu;
    public static PdfPTable pp3;
    public static JFileChooser j;
    public static JFileChooser j3;
public static JFileChooser ju;
    public static DefaultTableModel mod2;
    JTable tabla2;

    public static DefaultTableModel mod3;
    JTable tabla3;
      public static DefaultTableModel modu;
    JTable tablau;


    public static String path;
   public static String pathu;
    Document document;
Document documentu;
    public static String path3;

    Document document3;

    public reportes() {
        setLayout(null);
//     libros fff =  new libros();
//               fff.mandar();
        botoness();
        tablet();
        etiquetasreportes();
        lista();

        mod2 = new DefaultTableModel();

        mod2.addColumn("ID Libro");//agrego los titulos de mi tabla 
        mod2.addColumn("Nombre Libro");
        mod2.addColumn("Autor");
        mod2.addColumn("Tipo");
        mod2.addColumn("Copias");
        mod2.addColumn("Disponibles");
        mod2.addColumn("Ocupados");
        tabla2 = new JTable();
        tabla2.setModel(mod2);
        scroll = new JScrollPane(tabla2);
        tabla2.setBounds(250, 40, 800, 400);
        scroll.setBounds(250, 40, 800, 400);
        

        mod3 = new DefaultTableModel(); // defino el modelo de mi tabla

        mod3.addColumn("Nombre usuario");//agrego los titulos de mi tabla 
        mod3.addColumn("Libro");
        mod3.addColumn("Fecha enrega");
        mod3.addColumn("Status");

        tabla3 = new JTable(mod3);
        scroll = new JScrollPane(tabla3);// añado mi tabla al scroll(permitira que el scrool se ajuste a las nesecidades de la tabla)
        tabla3.setBounds(250, 40, 800, 400);//defino la posicion de mi tabla
        scroll.setBounds(250, 40, 800, 400);//defino la posicion de mi scroll

//        add(scroll);
    }

    public void lista() {
        String[] arr = {"usuarios registrados", "libros registrados", "prestamos realizados"};//creo mi array
        lista = new JComboBox(arr);//creo mi lista desplegable
        lista.setBounds(150, 110, 150, 20);//posiciono mi lista desplegable
        add(lista);
    }

    public void etiquetasreportes() {

        etiqueta = new JLabel();
        etiqueta.setText("Tipo de Reporte");//le asigno el texto que tendra mi etiqueta
        etiqueta.setBounds(50, 110, 100, 20);//le asigno la posicion que tendra mi etiqueta
        add(etiqueta);

    }

    public void botoness() {

        boton1 = new JButton();// creo mi boton 
        boton1.setText("Generar");//le asigno el texto que tendra mi boton
        boton1.setBounds(270, 140, 100, 30);//le doy posicion a mi boton 
        boton1.setBackground(Color.white);//le damos un estilo y color al boton 
        boton1.setFont(new Font("Ubuntu", Font.BOLD, 15));
        add(boton1);
        boton1.addActionListener(this);//le permitimos al boton 1 er escuchado en el metodo
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent en) {

                String tipo = lista.getSelectedItem().toString();//obtengo el texto ingresado a la caja autor
                String r = getTipoLibro(tipo);
                
                
                

                clase2 object = new clase2();
                SimpleDateFormat fech = new SimpleDateFormat("dd/MM/YYYY");
                Date fecha = new Date();
//
                Object[] newr = {fech.format(fecha), object.nombre, r};//introduzco los datos ingresados al objeto array
                   

        
                model.addRow(newr);// introduzco el objeto array a la tabla

            }
        });
    }

    public void tablet() {

        model = new DefaultTableModel(); // defino el modelo de mi tabla

        model.addColumn("Fecha generacion");//agrego los titulos de mi tabla 
        model.addColumn("Usuario");
        model.addColumn("Tipo Reporte");

        JTable tabla = new JTable(model);
        scrol = new JScrollPane(tabla);
        tabla.setBounds(430, 40, 600, 400);
        scrol.setBounds(430, 40, 600, 400);

        add(scrol);

    }

//      libros fff =  new libros();
//     
    public String getTipoLibro(String tipo) {
        switch (tipo) {
            case "usuarios registrados":

                return "usuarios registrados";

            case "libros registrados":
//
               fff();
////   

                return "libros registrados";

            case "prestamos realizados":
               fgf();
                //JOptionPane.showMessageDialog(null, "ee");
                return "prestamos realizados";
            default:

                return "";

        }

    }

    public void fff() {

        document = new Document();
        try {
//    
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(document, new FileOutputStream(ruta+"/Desktop/"+getDia()+getMes()+getAño()+h+m+s+".pdf"));
            document.open();
            pp = new PdfPTable(7);
//    
            pp.addCell("ID Libro");
            pp.addCell("Nombre Libro");
            pp.addCell("Autor");
            pp.addCell("Tipo");
            pp.addCell("Copias");
            pp.addCell("Disponibles");
            pp.addCell("Ocupados");
            for (int i = 0; i < tabla2.getRowCount(); i++) {
// 
                String id = tabla2.getValueAt(i, 0).toString();
                String nom = tabla2.getValueAt(i, 1).toString();
                String au = tabla2.getValueAt(i, 2).toString();
                String tip = tabla2.getValueAt(i, 3).toString();
                String cop = tabla2.getValueAt(i, 4).toString();
                String dis = tabla2.getValueAt(i, 5).toString();
                String ocu = tabla2.getValueAt(i, 6).toString();

//     
                pp.addCell(id);
                pp.addCell(nom);
                pp.addCell(au);
                pp.addCell(tip);
                pp.addCell(cop);
                pp.addCell(dis);
                pp.addCell(ocu);
//     
//     
//     
//     
//  
            }
// 
            document.add(pp);
        } catch (Exception epp) {
//    
            JOptionPane.showMessageDialog(null, "error");
//    
//    
        }
        document.close();
verdad=true;

    }

    public void fgf() {

        document3 = new Document();
        try {
//    
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(document3, new FileOutputStream(ruta + "/Desktop/"+getDia()+getAño()+getMes()+h+m+s+".pdf"));
            document3.open();
            pp3 = new PdfPTable(4);
//    
            pp3.addCell("Nombre de usuario");
            pp3.addCell("Libro");
            pp3.addCell("Fecha de entrega");
            pp3.addCell("status");

            for (int i = 0; i < tabla3.getRowCount(); i++) {
// 
                String il = tabla3.getValueAt(i, 0).toString();
                String no = tabla3.getValueAt(i, 1).toString();
                String a = tabla3.getValueAt(i, 2).toString();
                String ti = tabla3.getValueAt(i, 3).toString();

//     
                pp3.addCell(il);
                pp3.addCell(no);
                pp3.addCell(a);
                pp3.addCell(ti);

//     
//     
//     
//     
//  
            }
// 
            document3.add(pp3);
        } catch (Exception epp) {
//    
            JOptionPane.showMessageDialog(null, "error");
//    
//    
        }
        document3.close();
//
verdad=true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
