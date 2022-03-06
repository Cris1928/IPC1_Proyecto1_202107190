
package biblioteca;

import Elements.Usuario;
import biblioteca.clase2;
import biblioteca.prestamos;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class reportes  extends JPanel implements ActionListener  {
    DefaultTableModel model;
    JButton boton1;
    JLabel etiqueta;
    JScrollPane scrol;
    JTable tablet;
    JComboBox lista ;
     public reportes(){
    setLayout(null);
    botoness();
    tablet();
    etiquetasreportes();
    lista();
    }
     public void lista(){
 String [] arr={"usuarios registrados","libros registrados","prestamos realizados"};//creo mi array
lista = new JComboBox(arr);//creo mi lista desplegable
lista.setBounds(150, 110, 150, 20);//posiciono mi lista desplegable
add(lista);
}
       public void etiquetasreportes(){
         
         etiqueta = new JLabel();
         etiqueta.setText("Tipo de Reporte");//le asigno el texto que tendra mi etiqueta
etiqueta.setBounds(50, 110, 100, 20);//le asigno la posicion que tendra mi etiqueta
         add(etiqueta);
      
     }
       
       
       
       
       
     public void botoness(){
     
     boton1 = new JButton();// creo mi boton 
       boton1.setText("Generar");//le asigno el texto que tendra mi boton
       boton1.setBounds(270,140 ,100, 30);//le doy posicion a mi boton 
        boton1.setBackground(Color.white);//le damos un estilo y color al boton 
         boton1.setFont(new Font("Ubuntu", Font.BOLD, 15));
      add(boton1);
         boton1.addActionListener(this);//le permitimos al boton 1 er escuchado en el metodo
         boton1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent en) {
             
         String tipo= lista.getSelectedItem().toString();//obtengo el texto ingresado a la caja autor
              String r= getTipoLibro(tipo);
            
             clase2 object = new clase2();
             SimpleDateFormat fech = new SimpleDateFormat("dd/MM/YYYY");
             Date fecha = new Date();

       Object[] newr ={fech.format(fecha),object.nombre,r};//introduzco los datos ingresados al objeto array
model.addRow(newr);// introduzco el objeto array a la tabla
         
         } });
     }
     
     public void tablet(){
    

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

     
     
     
     
   public String getTipoLibro(String tipo){
      switch(tipo){
          case "usuarios registrados": 
           //    JOptionPane.showMessageDialog(null, "ee");
              return "usuarios registrados";
          case "libros registrados": 
             //  JOptionPane.showMessageDialog(null, "ee");
              return "libros registrados";
          case "prestamos realizados": 
               //JOptionPane.showMessageDialog(null, "ee");
              return "prestamos realizados";
              default: 
              
            return "";
      
      
      }  
        
    }
     
     
     
     

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     
     
}
