
package biblioteca;

import Elements.Prestamos;
import biblioteca.clase2;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import biblioteca.libros;
public class prestamos extends JPanel implements ActionListener {
  Date fechaingresada;
    JLabel texto1 ;
         JLabel texto2;
         JScrollPane scrolle;
          JScrollPane scroll;
          JFrame pantalla_masiva;
         JLabel texto3;
         JLabel texto4;
         JComboBox lista1 ;
    JTextField caj1,caj2,caj3;
       JTable tablap;
       
    DefaultTableModel mod;
       JButton bot,boton2;
    Object[] newr;
   
    int counter;
   
     public prestamos(){
        
    setLayout(null);
    newr =new Object[100];
    
    counter=0;
    componentespresta();
    cajs();
    tabla();
    boton();
  //   setBackground(Color.blue);

}
   public void componentespresta(){
         texto1 = new JLabel(); //creo el objeto de mi etiqueta
          texto2 = new JLabel();
          texto3 = new JLabel();
          
    texto4 = new JLabel();
texto1.setText("Usuario");//le asigno el texto que tendra mi etiqueta
texto1.setBounds(10, 10, 50, 20);//le asigno la posicion que tendra mi etiqueta
texto2.setText("Libro");//le asigno el texto que tendra mi etiqueta
texto2.setBounds(10, 70, 50, 20);//le asigno la posicion que tendra mi etiqueta
texto3.setText("Fecha ");//le asigno el texto que tendra mi etiqueta
texto3.setBounds(10, 130, 90, 20);//le asigno la posicion que tendra mi etiqueta
texto4.setText("Entrega ");//le asigno el texto que tendra mi etiqueta
texto4.setBounds(10, 144, 90, 20);//le asigno la posicion que tendra mi etiqueta

add(texto1);//le añado el texto 1 a mi etiqueta 
add(texto2);//le añado el texto 1 a mi etiqueta 
add(texto3);//le añado el texto 1 a mi etiqueta 
add(texto4);
}
   
   
   public void cajs(){

       caj1=new JTextField();
       caj2=new JTextField();
       caj3=new JTextField();
       
       caj1.setBounds(70, 10, 150, 25);
        
  caj1.addKeyListener(new KeyListener() {//aqui llamo a los metodos abstractos que posee el keylistener
    @Override
    public void keyTyped(KeyEvent e) {//kytyped me ayuda a saber que caracter esta ingresando a la caja de texto
       char c= e.getKeyChar();//aqui obtengo el caracter que esta entrando en el teclado
          if(!Character.isDigit(c)){ //si lo que ingresamos es un caracter entonces se consumira y no aparecera en la caja
    e.consume();
           caj1.setBackground(Color.orange);
          }else{//si los caracteres ingresados son numeros entonces volvera al color blanco 
     caj1.setBackground(Color.white);} }
    @Override
   public void keyPressed(KeyEvent e) {}
   @Override
   public void keyReleased(KeyEvent e) {}} );
  
  
       caj2.setBounds(70, 70, 150, 25);
       
       
       caj2.addKeyListener(new KeyListener() {//aqui llamo a los metodos abstractos que posee el keylistener
    @Override
    public void keyTyped(KeyEvent e) {//kytyped me ayuda a saber que caracter esta ingresando a la caja de texto
       char c= e.getKeyChar();//aqui obtengo el caracter que esta entrando en el teclado
          if(!Character.isDigit(c)){ //si lo que ingresamos es un caracter entonces se consumira y no aparecera en la caja
    e.consume();
           caj2.setBackground(Color.red);}else{//si los caracteres ingresados son numeros entonces volvera al color blanco 
     caj2.setBackground(Color.white);} }
    @Override
   public void keyPressed(KeyEvent e) {}
   @Override
   public void keyReleased(KeyEvent e) {}} );
  
          caj3.setBounds(70, 140, 150, 25);
       add(caj3);
       add(caj1);
       add(caj2);
     }
   
   
   public void listapres(){
    lista1 = new JComboBox();
         
   
   }
   
   public void tabla(){
    

 mod = new DefaultTableModel(); // defino el modelo de mi tabla

mod.addColumn("Nombre usuario");//agrego los titulos de mi tabla 
mod.addColumn("Libro");
mod.addColumn("Fecha enrega");
mod.addColumn("Status");

 

        tablap = new JTable(mod);
       scroll = new JScrollPane(tablap);// añado mi tabla al scroll(permitira que el scrool se ajuste a las nesecidades de la tabla)
        tablap.setBounds(250, 40, 800, 400);//defino la posicion de mi tabla
        scroll.setBounds(250, 40, 800, 400);//defino la posicion de mi scroll
     
        add(scroll);

}
   public void rellenar(){

       
       
       
       
       
       

   }
   
   
   
   
   
   
   public void boton() {
        
bot = new JButton();// creo mi boton 
       bot.setText("Prestar libro");//le asigno el texto que tendra mi boton
       bot.setBounds(60,200 ,150, 30);//le doy posicion a mi boton 
      add(bot);
         bot.addActionListener(this);//le permitimos al boton 1 er escuchado en el metodo
           bot.addActionListener(new ActionListener() {
         
         
         public void actionPerformed(ActionEvent en) {
             try{
       if(counter<100){
  int idl = Integer.parseInt(caj1.getText().toString());//aqui convierto el strig a int y obtengo el dato ingresado
  
  
  
  
  
  
   // String ide= caj2.getText().toString();//obtengo el texto ingresado a la caja libro
    //String autor= caj3.getText().toString();//obtengo el texto ingresado a la caja autor
  //  String tipo= (String) lista.getSelectedItem();//aqui convierto el strig a int y obtengo el dato ingre
    int ide = Integer.parseInt(caj2.getText().toString());//obtengo el texto seleccionado a la lista desplegable
    String fecha= caj3.getText().toString();//obtengo el texto ingresado a la caja autor
    
   
     SimpleDateFormat fechh = new SimpleDateFormat("dd/MM/YYYY");
             Date fechahoy = new Date();
             libros obg = new libros();
             clase2 usu = new clase2();
    Date fechaconv = conversordate(fecha);
    
//    
//    for(int i=0; i<obg.tabla.getRowCount();i++){
//                                    
//                                    if(obg.tabla.getValueAt(i,0).equals(idl)){
//    
    
    
                                for(int i=0; i<obg.arrt.length;i++){
                                     for(int j=0; j<usu.arrtu.length;j++){
                                         
                                        
                                    if(obg.arrt[i]==ide){
                                         if(usu.arrtu[j]==idl){
                                        
  
//    JOptionPane.showMessageDialog(null, "existe"); 
//        mod.removeRow(i);
   if(fechaconv != null){
      if(fechahoy.compareTo(fechaconv)<= 0){
       Object[] newr ={idl,ide,stringadate(fechaconv),"prestado"};//introduzco los datos ingresados al objeto array
 mod.addRow(newr);// introduzco el objeto array a la tabla
  reportes.mod3.addRow(newr);
 counter++;//el contador sera igual a contador + 1
      }else{ Object[] newr ={idl,ide,stringadate(fechaconv),"entregado"};//introduzco los datos ingresados al objeto array
 mod.addRow(newr);// introduzco el objeto array a la tabla
  reportes.mod3.addRow(newr);
 counter++;//el contador sera igual a contador + 1
      } }else{
       JOptionPane.showMessageDialog(null, "El formato es dd/mm/yyyy"); 
  }
   
                                }
                                                                }
                                
                                }  }
       
                                
                                
       

       
       }else {
   JOptionPane.showMessageDialog(null, "LIMITE DE REGISTROS");
  }}catch(Exception ex){JOptionPane.showMessageDialog(null, "Hacen falta datos");} } });
           
           
           
           
           
           
           
           
           
           
           
           
           
 boton2 = new JButton();// creo mi boton 
     boton2.setText("Carga masiva");//le asigno el texto que tendra mi boton
     boton2.setBounds(60,250 ,150, 30);//le doy posicion a mi boton 
    add(boton2);
      boton2.addActionListener(this);//le permitimos al boton 1 er escuchado en el metodo       boton2.addActionListener(new ActionListener() {
        boton2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent en) {
    
  // JOptionPane.showMessageDialog(null, "concedido");
  pantalla_masiva = new JFrame("Carga Masiva");
                pantalla_masiva.setSize(300,300);
                pantalla_masiva.setBackground(Color.white);
                pantalla_masiva.setLayout(null);
  pantalla_masiva.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent windowEvent){
                       pantalla_masiva.setVisible(false);
                    }        
                 }); 
                
                JTextArea datos_c = new JTextArea(30,30);
                datos_c.setEditable(true);
                datos_c.setVisible(true);
                 scrolle = new JScrollPane(datos_c);
                scrolle.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                scrolle.setBounds(10,10,270,200);
                scrolle.setVisible(true);
  
   JButton cargar = new JButton("Cargar");
                cargar.setBounds(180, 220, 100, 30);
                cargar.setBackground(Color.white);
                cargar.setFont(new Font("Ubuntu", Font.BOLD, 15));
                cargar.setBorder(BorderFactory.createLineBorder(Color.black));
                cargar.setVisible(true);
  cargar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(counter<100){
                            String datos_carga = datos_c.getText();
                    
                            Object jsonObyeto = JSONValue.parse(datos_carga); //obtengo la informacion 
                            JSONObject obyeto = (JSONObject) jsonObyeto; //se la doy a mi objeto 
                       
                            Object jsonarrayobyeto = obyeto.get("Prestamos");//ccedo a l clave
                            JSONArray arrayobyeto = (JSONArray) jsonarrayobyeto;
                            for(Object obyeto_inarray: arrayobyeto)
                            {
                                JSONObject obyeto_value = (JSONObject) obyeto_inarray;
Prestamos prestamo_nuevo=new Prestamos();


 Long idLibro=(Long) obyeto_value.get("IDLibro");
    prestamo_nuevo.idLibro =  idLibro.intValue();
    
Long id_prestamo=(Long) obyeto_value.get("IDUsuario");
 prestamo_nuevo.idUsuario =  id_prestamo.intValue();
 
 String id_fecha = (String) obyeto_value.get("FechaEntrega");
 
 
   SimpleDateFormat fechh = new SimpleDateFormat("dd/MM/YYYY");
             Date fechahoy = new Date();
             libros obg = new libros();
             clase2 usu = new clase2();
    Date fechaconv = conversordate(id_fecha);
 
    
//    
//    Object[] values = {String.valueOf(prestamo_nuevo.idLibro),String.valueOf(prestamo_nuevo.idUsuario),id_fecha,0 };
//     mod.addRow(values); 
//      reportes.mod3.addRow(values);
//     counter++;//el contador sera igual a contador +1
 if(fechaconv != null){
      if(fechahoy.compareTo(fechaconv)<= 0){
       Object[] newr ={String.valueOf(prestamo_nuevo.idLibro),String.valueOf(prestamo_nuevo.idUsuario),stringadate(fechaconv),"prestado"};//introduzco los datos ingresados al objeto array
 mod.addRow(newr);// introduzco el objeto array a la tabla
  reportes.mod3.addRow(newr);
 counter++;//el contador sera igual a contador + 1
      }else{ Object[] newr ={String.valueOf(prestamo_nuevo.idLibro),String.valueOf(prestamo_nuevo.idUsuario),stringadate(fechaconv),"entregado"};//introduzco los datos ingresados al objeto array
 mod.addRow(newr);// introduzco el objeto array a la tabla
  reportes.mod3.addRow(newr);
 counter++;//el contador sera igual a contador + 1
      } }else{
       JOptionPane.showMessageDialog(null, "El formato es dd/mm/yyyy"); 
  }  }
                            pantalla_masiva.setVisible(false);
                            change();}else {
          JOptionPane.showMessageDialog(null, "LIMITE DE REGISTROS");//de lo contrario aparecera una ventana emergente con el siguiente mensaje
  }}  });
  pantalla_masiva.add(scrolle);//la ventana scrolle se añadira a la pantalla de carga masiva 
                pantalla_masiva.add(cargar);//el boton se añadira a la pantalla de carga masiva
  pantalla_masiva.setLocationRelativeTo(null); //Center screen
                pantalla_masiva.setVisible(true);//permitiremos que la pantalla aparezca 
    }


         });        
}
   
   
   public static Date conversordate(String fecha){
     SimpleDateFormat fech = new SimpleDateFormat("dd/MM/yyyy");
          Date f =null;
      try{
//     
      f=fech.parse(fecha);
     
      
     }catch(Exception e){
//       
     JOptionPane.showMessageDialog(null, "Formato de fecha no valido");
     }     return f;
//       
// 
   }
//   
   public static String stringadate(Date fecha){
    SimpleDateFormat fech = new SimpleDateFormat("dd/MM/yyyy");
       return fech.format(fecha);
             
   
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
        /*
        int idl = Integer.parseInt(caj1.getText().toString());//aqui convierto el strig a int y obtengo el dato ingresado
   // String ide= caj2.getText().toString();//obtengo el texto ingresado a la caja libro
    //String autor= caj3.getText().toString();//obtengo el texto ingresado a la caja autor
  //  String tipo= (String) lista.getSelectedItem();//aqui convierto el strig a int y obtengo el dato ingresado
    int ide = Integer.parseInt(caj2.getText().toString());//obtengo el texto seleccionado a la lista desplegable
    String fecha= caj3.getText().toString();//obtengo el texto ingresado a la caja autor
 Object[] newr ={idl,ide,fecha};//introduzco los datos ingresados al objeto array
 mod.addRow(newr);// introduzco el objeto array a la tabla*/
    }
        
    
}
