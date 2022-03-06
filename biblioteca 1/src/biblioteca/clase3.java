
package biblioteca;



import java.applet.Applet;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class clase3 extends JFrame implements ActionListener {

   JPanel panellibros;
 JButton boton1;
     
 libros libros;
 prestamos prestamos;
 reportes reportes;
 graficas graficas;
 JTabbedPane paneles; //esto es mi contenedor donde se almacenaran mis paneles 

    public clase3(){
    ventanalibros();
    pestañas();//llamo el metodo pestañas a la clase 

    } 
    private void ventanalibros(){
        this.setSize(1100,600);//tamaño de la ventana proyecto1
        setTitle("proyecto1");//nombre de la ventana proyecto1
          setLocationRelativeTo(null);//centre la ventana proyecto1
         setDefaultCloseOperation(EXIT_ON_CLOSE);  //aqui defino que se cerrara la ejecucion al cerrar el programa
    }
    
    

     private void etiquet(){
  
    panellibros = new JPanel();//creo mi panel
    panellibros.setLayout(null);//desactive el diseño predeterminado
    this.getContentPane().add(panellibros);//agrego mi panel a mi ventana
    
//          panellibros.setBackground(Color.red);
     }
    
     
     
     
     
     private void pestañas(){
         paneles = new JTabbedPane();//creo mi objeto paneles 
         libros = new libros();//creo mi objeto libros
         prestamos = new prestamos();
         reportes = new reportes();
         graficas= new graficas();
         paneles.add("libros",libros);//aqui añad el titulo y la variable a mi pesaña
         paneles.add("prestamos",prestamos);//aqui añad el titulo y la variable a mi pesaña
         paneles.add("reportes",reportes);//aqui añad el titulo y la variable a mi pesaña
         paneles.add("graficas",graficas);//aqui añad el titulo y la variable a mi pesaña
         add(paneles);//agrego la pestaña a la ventana grafica 
     
     }
     
     
    public void actionPerformed(ActionEvent e) {
       
    }
   
    
    
}
