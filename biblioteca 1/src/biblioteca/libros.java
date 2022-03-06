package biblioteca;

import Elements.Libros;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class libros extends JPanel implements ActionListener  {
    JScrollPane scrolle;
  JLabel texto1,texto2,texto3,texto4,texto5;
     JTextField cajas1,cajas2,cajas3,cajas4,cajas5;
     JPanel panellibros;
    public static JTable tabla;
    JButton boton1,boton2;JScrollPane scroll;
    JComboBox lista ;
    DefaultTableModel mod;
    JFrame pantalla_masiva;
   Object[] newr;
 
     int counter;
    public libros(){
   
       
    setLayout(null);
//   setBackground(Color.red);
 newr =new Object[100]; //mi objeto solo podra almeacenar 100 libros
 counter = 0;//inicializo mi contador
componentes();//lamo al metodo componentes
cajasdetexto();//lamo al metodo cajas e testo 
listadesplegable();//llamo al metodo de lista desplegable
boton();//llamo al metodo boton 

tabla(); }
public void componentes(){
    
texto1= new JLabel();//creo el objeto de mi etiqueta
texto2 = new JLabel();
texto3 = new JLabel();
texto4 = new JLabel();
texto5 = new JLabel();
texto1.setText("ID Libro");//le asigno el texto que tendra mi etiqueta
texto1.setBounds(10, 10, 50, 20);//le asigno la posicion que tendra mi etiqueta
texto2.setText("Libro");//le asigno el texto que tendra mi etiqueta
texto2.setBounds(10, 70, 50, 20);//le asigno la posicion que tendra mi etiqueta
texto3.setText("Autor");//le asigno el texto que tendra mi etiqueta
texto3.setBounds(10, 130, 50, 20);//le asigno la posicion que tendra mi etiqueta
texto4.setText("copias");//le asigno el texto que tendra mi etiqueta
texto4.setBounds(10, 190, 50, 20);//le asigno la posicion que tendra mi etiqueta
texto5.setText("Tipo");//le asigno el texto que tendra mi etiqueta
texto5.setBounds(10, 250, 50, 20);//le asigno la posicion que tendra mi etiqueta
add(texto1);//le añado el texto 1 a mi etiqueta 
add(texto2);//le añado el texto 1 a mi etiqueta 
add(texto3);//le añado el texto 1 a mi etiqueta 
add(texto4);//le añado el texto 1 a mi etiqueta 
add(texto5);//le añado el texto 1 a mi etiqueta 

}
 
public void cajasdetexto(){
    
 cajas1 = new JTextField();//creo mi caja de texto 

    cajas1.setBounds(60, 10, 150, 25);//le doy una posicion a mi caja'*'
   
  cajas1.addKeyListener(new KeyListener() {//aqui llamo a los metodos abstractos que posee el keylistener
    @Override
    public void keyTyped(KeyEvent ei) {//kytyped me ayuda a saber que caracter esta ingresando a la caja de texto
       char c= ei.getKeyChar();//aqui obtengo el caracter que esta entrando en el teclado
          if(!Character.isDigit(c)){ //si lo que ingresamos es un caracter entonces se consumira y no aparecera en la caja
    ei.consume();
           cajas1.setBackground(Color.red);}else{//si los caracteres ingresados son numeros entonces volvera al color blanco 
     cajas1.setBackground(Color.white);} }
    @Override
   public void keyPressed(KeyEvent ei) {}
   @Override
   public void keyReleased(KeyEvent ei) {}} );

  
     cajas2 = new JTextField();//creo mi caja de texto 
    cajas2.setBounds(60, 70, 150, 25);//le doy una posicion a mi caja'*'
   
    cajas3 = new JTextField();//creo mi caja de texto 
    cajas3.setBounds(60, 130, 150, 25);//le doy una posicion a mi caja'*'
   
    
     cajas4 = new JTextField();//creo mi caja de texto 
    cajas4.setBounds(60, 190, 150, 25);//le doy una posicion a mi caja'*'
   cajas4.addKeyListener(new KeyListener() {//aqui llamo a los metodos abstractos que posee el keylistener
     @Override
     public void keyTyped(KeyEvent ei) {//kytyped me ayuda a saber que caracter esta ingresando a la caja de texto
         char c= ei.getKeyChar();//aqui obtengo el caracter que esta entrando en el teclado
            if(!Character.isDigit(c)){ //si lo que ingresamos es un caracter entonces se consumira y no aparecera en la caja
     ei.consume();
            cajas4.setBackground(Color.red);}
            else {//si los caracteres ingresados son numeros entonces volvera al color blanco 
      cajas4.setBackground(Color.white);} }
     @Override
     public void keyPressed(KeyEvent ei) {}
     @Override
     public void keyReleased(KeyEvent ei) {}} );
    add(cajas1);//agrego mi caja a el panel
     
add(cajas2);
add(cajas3);
add(cajas4);
}
public void listadesplegable(){
    
    String [] arr={"1","2","3"};//creo mi array
lista = new JComboBox(arr);//creo mi lista desplegable
lista.setBounds(60, 250, 100, 20);//posiciono mi lista desplegable
add(lista);

}
public void tabla(){
    

 mod = new DefaultTableModel(); // defino el modelo de mi tabla

mod.addColumn("ID Libro");//agrego los titulos de mi tabla 
mod.addColumn("Nombre Libro");
mod.addColumn("Autor");
mod.addColumn("Tipo");
mod.addColumn("Copias");
mod.addColumn("Disponibles");
 mod.addColumn("Ocupados");
 


        JTable tabla = new JTable(mod);
       scroll = new JScrollPane(tabla);
        tabla.setBounds(250, 40, 800, 400);
        scroll.setBounds(250, 40, 800, 400);
     
        add(scroll);

}



public void boton(){
    
boton1 = new JButton();// creo mi boton 
       boton1.setText("registrar libro");//le asigno el texto que tendra mi boton
       boton1.setBounds(60,300 ,150, 30);//le doy posicion a mi boton 
        boton1.setBackground(Color.white);//le damos un estilo y color al boton 
         boton1.setFont(new Font("Ubuntu", Font.BOLD, 15));
      add(boton1);
         boton1.addActionListener(this);//le permitimos al boton 1 er escuchado en el metodo
         boton1.addActionListener(new ActionListener() {
         
         
         public void actionPerformed(ActionEvent en) {
             
             try{
       if(counter<100){
   int id = Integer.parseInt(cajas1.getText().toString());//aqui convierto el strig a int y obtengo el dato ingresado
    String libro= cajas2.getText().toString();//obtengo el texto ingresado a la caja libro
    String autor= cajas3.getText().toString();//obtengo el texto ingresado a la caja autor
  
   String t= (String) lista.getSelectedItem();//aqui convierto el strig a int y obtengo el dato ingresado
 //  Object[] f={t};
   
     int tipo = Integer.parseInt(t.toString());//convierto a tipo entero el carcter de mi lista desplegable
  String r= getTipoLibro(tipo);//aqui evaluo mi variable tipo en el metodo getTipoLibro
   
   int copi = Integer.parseInt(cajas4.getText().toString());//obtengo el texto seleccionado a la lista desplegable
   
 //  int dis = Integer.parseInt(cajas5.getText().toString());//obtengo el texto seleccionado a la lista desplegable
   
   
Object[] newr ={id,libro,autor,r,copi,copi,0};//introduzco los datos ingresados al objeto array
 mod.addRow(newr);// introduzco el objeto array a la tabla
 counter++;//el contador sera igual a contador + 1
       }else {
                         
  JOptionPane.showMessageDialog(null, "Se ha llegado al limite de registros");  }
             }catch(Exception ex){
             
               JOptionPane.showMessageDialog(null, "Hacen falta datos");
             }
         
         
         } });
         
         
         
         
     boton2 = new JButton();// creo mi boton 
     boton2.setText("Carga masiva");//le asigno el texto que tendra mi boton
     boton2.setBounds(60,360 ,150, 30);//le doy posicion a mi boton 
      boton2.setBackground(Color.white);//le damos un estilo y color al boton 
       boton2.setFont(new Font("Ubuntu", Font.BOLD, 15));//le damos un interlineado mas grueso a el borde y letra del boton 
    add(boton2);
      boton2.addActionListener(this);//le permitimos al boton 1 er escuchado en el metodo       boton2.addActionListener(new ActionListener() {
        boton2.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent en) {
pantalla_masiva = new JFrame("Carga Masiva");//creo mi ventana de carga masiv 
                pantalla_masiva.setSize(300,300);//le doy una posicion a mi ventana 
                pantalla_masiva.setBackground(Color.white);//le doy un estilo y color 
                pantalla_masiva.setLayout(null);//desactivo el estilo y funciones predeterminadas
  pantalla_masiva.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent windowEvent){
                       pantalla_masiva.setVisible(false);
                    }}); 
                
                JTextArea datos_c = new JTextArea(30,30);// creo mi ventana de texto 
                datos_c.setEditable(true);//le permitimos ser editable
                datos_c.setVisible(true);//le permitimos ser visible 
                 scrolle = new JScrollPane(datos_c);//creo mi panel scroll y se lo asigno a mi area de texto
                scrolle.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);//definimos el estilo del scroll
                scrolle.setBounds(10,10,270,200);//le damos una posicion al scroll
                scrolle.setVisible(true);//le permitimos ser visible al scrolle
  
   JButton cargar = new JButton("Cargar");//creo mi boton el cual tendra el nombre "cargar "
                cargar.setBounds(180, 220, 100, 30);//le damos una posicion al boton 
               cargar.setBackground(Color.white);//le damos un estilo y color al boton 
                cargar.setFont(new Font("Ubuntu", Font.BOLD, 15));
                cargar.setBorder(BorderFactory.createLineBorder(Color.black));//le damos un interlineado mas grueso a el borde del boton y las lertras
                cargar.setVisible(true);//le permitimos ser visible al boton 
  cargar.addActionListener(new ActionListener() {//le permitimos al boton compezar una accion 
                    @Override
                    public void actionPerformed(ActionEvent e) {//compezamos a declarar la accion que tendra el boton 
                        if(counter<100){
                            String datos_carga = datos_c.getText();
                    
                            Object jsonObyeto = JSONValue.parse(datos_carga); //obtengo la informacion 
                            JSONObject obyeto = (JSONObject) jsonObyeto; //se la doy a mi objeto 
                       
                            Object jsonarrayobyeto = obyeto.get("Libros");//ccedo a l clave
                            JSONArray arrayobyeto = (JSONArray) jsonarrayobyeto;
                            for(Object obyeto_inarray: arrayobyeto)
                            {
                                JSONObject obyeto_value = (JSONObject) obyeto_inarray;
Libros libro_nuevo=new Libros();
Long id_libro=(Long) obyeto_value.get("ID");
   libro_nuevo.idLibro =  id_libro.intValue();
    libro_nuevo.titulo = (String) obyeto_value.get("Titulo");
    libro_nuevo.autor = (String) obyeto_value.get("Autor");
    
    
    
      Long disponible=(Long) obyeto_value.get("Disponible");
    libro_nuevo.disponible =  id_libro.intValue();
    
    
    Long copias=(Long) obyeto_value.get("Copias");
    libro_nuevo.copias =  id_libro.intValue();
   
    Long ocupados=(Long) obyeto_value.get("Ocupados");
    libro_nuevo.ocupados =  id_libro.intValue(); 
    
       Long Tipo=(Long) obyeto_value.get("Tipo");
    libro_nuevo.tipo =  id_libro.intValue();
    
    String[] values = {String.valueOf(libro_nuevo.idLibro),libro_nuevo.titulo,libro_nuevo.autor,getTipoLibro(libro_nuevo.tipo),String.valueOf(libro_nuevo.copias),String.valueOf(libro_nuevo.disponible),String.valueOf(libro_nuevo.ocupados)};
     mod.addRow(values);
  
                                counter++;//el contador sera igual a contador +1
                                
                                

                            }
                            pantalla_masiva.setVisible(false);
                            change();
                           
        
                        }else {
                         
  JOptionPane.showMessageDialog(null, "LIMITE DE REGISTROS");//de lo contrario aparecera una ventana emergente con el siguiente mensaje
 
        
                        }
                        
                    }
        
                });
  
  pantalla_masiva.add(scrolle);//la ventana scrolle se añadira a la pantalla de carga masiva 
                pantalla_masiva.add(cargar);//el boton se añadira a la pantalla de carga masiva
  pantalla_masiva.setLocationRelativeTo(null); //Center screen
                pantalla_masiva.setVisible(true);//permitiremos que la pantalla aparezca 
    }


         });
         

        
                                       
        
        
}





 public String getTipoLibro(int tipo){
      switch(tipo){
          case 1: 
              
              return "Libro";
          case 2: 
              
              return "Revista";
          case 3: 
              
              return "Libros Electronicos";
              default: 
              
              return "";
      
      
      }  
    }
 
 
 public void change()
    {
//        add.remove(scrolle);
        JTable tabla = new JTable(mod);
       tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        scrolle = new JScrollPane(tabla);
        scrolle.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrolle.setBounds(300,10,670,400);
        scrolle.setVisible(true);
      
    }





    @Override
    public void actionPerformed(ActionEvent ent) {
        
    }


 
    


 

 




}
