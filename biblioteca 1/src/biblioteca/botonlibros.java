///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package biblioteca;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JButton;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//import javax.swing.ScrollPaneConstants;
//
//public class botonlibros extends libros implements ActionListener{
//    public void botonn(){
//        
//   boton2 = new JButton();// creo mi boton 
//      boton2.setText("registrar libro");//le asigno el texto que tendra mi boton
//      boton2.setBounds(60,360 ,150, 30);//le doy posicion a mi boton 
//     add(boton2);
//       boton2.addActionListener(this);//le permitimos al boton 1 er escuchado en el metodo
//        boton1.addActionListener(new ActionListener() {
//        
//        
//        public void actionPerformed(ActionEvent e) {
////    /* if(counter<100)
////                {
////                    String[] values =  {"Libro 1","Libro", "Universidad de San Carlos de Guatemala","50"};
////                    Table_LibrosInformacion[counter] = values;
////                    change();
////                    counter++;
////                }*/
////            
////     
////         
////         
////         
////         
////                JFrame pantalla_masiva = new JFrame("Carga Masiva");
////                pantalla_masiva.setSize(300,300);
////                pantalla_masiva.setBackground(Color.white);
////                pantalla_masiva.setLayout(null);
////                pantalla_masiva.addWindowListener(new WindowAdapter() {
////                    public void windowClosing(WindowEvent windowEvent){
////                       pantalla_masiva.setVisible(false);
////                    }        
////                 }); 
////                
////                JTextArea datos_c = new JTextArea(20,20);
////                datos_c.setEditable(true);
////                datos_c.setVisible(true);
////                scrolle = new JScrollPane(datos_c);
////                scrolle.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
////                scrolle.setBounds(10,10,270,200);
////                scrolle.setVisible(true);
////                
////
////                JButton cargar = new JButton("Cargar");
////                cargar.setBounds(180, 220, 100, 30);
////                cargar.setBackground(Color.white);
////                cargar.setFont(new Font("Ubuntu", Font.BOLD, 15));
////                cargar.setBorder(BorderFactory.createLineBorder(Color.black));
////                cargar.setVisible(true);
////                cargar.addActionListener(new ActionListener() {
////                    @Override
////                    public void actionPerformed(ActionEvent e) {
////                        if(counter<100){
////                            String datos_carga = datos_c.getText();
////                    
////                            Object jsonObyeto = JSONValue.parse(datos_carga); //obtengo la informacion 
////                            JSONObject obyeto = (JSONObject) jsonObyeto; //se la doy a mi objeto 
////                       
////                            Object jsonarrayobyeto = obyeto.get("Libros");//ccedo a l clave
////                            JSONArray arrayobyeto = (JSONArray) jsonarrayobyeto;
////                            for(Object obyeto_inarray: arrayobyeto)
////                            {
////                                JSONObject obyeto_value = (JSONObject) obyeto_inarray;
////Libros libro_nuevo=new Libros();
////libro_nuevo.titulo = (String) obyeto_value.get("Titulo");
////
////Long id_libro=(Long) obyeto_value.get("ID");
////    libro_nuevo.idLibro =  id_libro.intValue();
////    
////    libro_nuevo.autor = (String) obyeto_value.get("Autor");
////    
////    Long copias=(Long) obyeto_value.get("Copias");
////    libro_nuevo.copias =  id_libro.intValue();
////    Long disponible=(Long) obyeto_value.get("Disponible");
////    libro_nuevo.disponible =  id_libro.intValue();
////    Long ocupados=(Long) obyeto_value.get("Ocupados");
////    libro_nuevo.ocupados =  id_libro.intValue();
////       Long Tipo=(Long) obyeto_value.get("Tipo");
////    libro_nuevo.tipo =  id_libro.intValue();
//////    String[] values = {libro_nuevo.titulo,getTipoLibro(libro_nuevo.tipo),libro_nuevo.autor,String.valueOf(libro_nuevo.disponible)};
//////   newr[counter]=values;
////   Object[] newr ={libro_nuevo.titulo,getTipoLibro(libro_nuevo.tipo),libro_nuevo.autor,String.valueOf(libro_nuevo.disponible)};//introduzco los datos ingresados al objeto array
////  
////                                counter++;
////                            }
////                            pantalla_masiva.setVisible(false);change();
////                        }
////                        
////                    }
////        
////                });
////
////                pantalla_masiva.add(scrolle);
////                pantalla_masiva.add(cargar);
////                pantalla_masiva.setLocationRelativeTo(null); //Center screen
////                pantalla_masiva.setVisible(true);
////         
////             
////             
////             
////             
////             
////             
////             
////             
////             
////             
////             
////             
////             
////             
////             
////         }});
////         
////         
////            add(scrolle);
////        add(boton2);
////        
//  }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//      
//    }
//    
//}
