
package biblioteca;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;  
import org.json.simple.JSONValue;
import Elements.Usuario;
import java.awt.Color;
import java.applet.Applet;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class clase2 extends JFrame implements ActionListener { 

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     public Usuario[] usuarios;
         public Usuario usuario_logeado;
    JPanel panel;
//private static String  nombre = "";
 JButton boton1;
 public String n;
 //  public JPasswordField password;
     JButton boton2; 
     JTextField caja1;   
     public static String nombre = "";
     JPasswordField caja2;
       int counter;
 public clase2(){
     counter = 0;
     usuarios = new Usuario[50];
        ventana();
        etiquetas();
      botones();
 cajasdetexto();}
 private void ventana(){
     
        this.setSize(500,500);
        setTitle("LOGIN");//nombre de la ventana
          setLocationRelativeTo(null);//centre la ventana
          etiquetas();// made a llamar el metodo panel
         setDefaultCloseOperation(EXIT_ON_CLOSE);  }

    
    private void etiquetas(){
        // panel.setBackground(Color.red);
    panel = new JPanel();//creo mi panel
    panel.setLayout(null);//desactive el diseño predeterminado
    this.getContentPane().add(panel);//agrego mi panel a mi ventana
    
    
    
    JLabel etiqueta = new JLabel();//creo mi etiqueta
    etiqueta.setText("Usuario");//le asigne lo que dira mi etiqueta
    etiqueta.setBounds(50, 50, 50, 100);//defino su posicion una vez deactivado el layout
     panel.add(etiqueta); //agregue mi etiqueta al panel
     
       JLabel etiqueta2 = new JLabel();//creo mi etiqueta
    etiqueta2.setText("contraseña");//le asigne lo que dira mi etiqueta
    etiqueta2.setBounds(50, 150, 100, 50);//defino su posicion una vez deactivado el layout
     panel.add(etiqueta2); //agregue mi etiqueta al panel
    }
    
    
    public void cajasdetexto(){
       
      
    caja1 = new JTextField();//creo mi caja de texto 
    caja1.setBounds(100, 95, 300, 20);//le doy una posicion a mi caja'*'
  
    panel.add(caja1);//agrego mi caja a el panel
    
    
    
    caja2 = new JPasswordField(8);
    caja2.setBounds(118, 165, 300, 20);
       
         
    panel.add(caja2); 
    
     
               
    }
    
    
 
    
    
    
    
    
    
    
     public void botones(){
       
       boton1 = new JButton();// creo mi boton 
       boton1.setText("Iniciar sesion");//le asigno el texto que tendra mi boton
       boton1.setBounds(180,250 ,150, 30);//le doy posicion a mi boton 
         panel.add(boton1);//añado mi boton a el panel
         boton1.addActionListener(this);//le permitimos al boton 1 er escuchado en el metodo
         boton1.addActionListener(new ActionListener() {
             @Override
            public void actionPerformed(ActionEvent e) {
   
           nombre = caja1.getText();
               
               reportes ventana = new reportes();
               
               
            String usuario = caja1.getText();
            String passwords = caja2.getText();
     //       JOptionPane.showMessageDialog(null, "aqui añadire una accion");
                
               usuario_logeado = new Usuario();
               for(Usuario user : usuarios)
               {
                   if(user != null)
                 {
                        System.out.println(user.getUsername().trim().equals(usuario.trim()));
                       System.out.println(user.getPassword().trim().equals(passwords.trim()));
                       if(user.getUsername().trim().equals(usuario.trim()) && user.getPassword().trim().equals(passwords.trim()))
                       {
                          usuario_logeado = user;
                          break;
                 }
                   }
              }
               caja1.setText("");
               caja2.setText("");
               if(usuario_logeado.getIdUsuario()!= -1)
               {
                   //&& (caja1.getText().equals("D123") && caja2.getText().equals("123"))
                   System.out.println("ID Usuario: "+usuario_logeado.getIdUsuario());
                   if((usuario_logeado.getTipo() == 1 )) { 
                       clase3 obj2 =  new clase3();
obj2.setVisible(true);
                   clase2.this.setVisible(false); 
                   
                   }
                   else {JOptionPane.showMessageDialog(null, "Usuario Normal - Acceso Restringido", "Su usuario no posee los permisos necesarios", JOptionPane.INFORMATION_MESSAGE);
                    }
              }else{JOptionPane.showMessageDialog(null, "No Existe un usuario con las credenciales indicadas", "Error al Iniciar Sesion", JOptionPane.ERROR_MESSAGE);
              }  
            
            } });
         
         
         
         
         
         
          boton2 = new JButton();// creo mi boton 
       boton2.setText("carga masiva");//le asigno el texto que tendra mi boton
       boton2.setBounds(320,400 ,130, 30);//le doy posicion a mi boton 
         panel.add(boton2);//añado mi boton a el panel
         boton2.addActionListener(this);//le permito al boton 2 ser escuchado en el evento 
//           
         boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame pantalla_masiva = new JFrame("Carga Masiva");
                pantalla_masiva.setSize(300,300);
               pantalla_masiva.setBackground(Color.white);
               pantalla_masiva.setLayout(null);
               pantalla_masiva.addWindowListener(new WindowAdapter() {
                   public void windowClosing(WindowEvent windowEvent){
                      pantalla_masiva.setVisible(false);
                   }        
                 }); 
                
                JTextArea datos_c = new JTextArea(20,20);
                datos_c.setEditable(true);
                datos_c.setVisible(true);
                JScrollPane scroll = new JScrollPane(datos_c);
                scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                scroll.setBounds(10,10,270,200);
                scroll.setVisible(true);
//
                JButton cargar = new JButton("Cargar");
                cargar.setBounds(180, 220, 100, 30);
                cargar.setBackground(Color.white);
                cargar.setFont(new Font("Ubuntu", Font.BOLD, 15));
               cargar.setBorder(BorderFactory.createLineBorder(Color.black));
               cargar.setVisible(true);
                cargar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        
                        
                        
                        
                      
                        
                        
                        
                        if(counter<usuarios.length){
                            String datos_carga = datos_c.getText();
                    
                            Object jsonObyeto = JSONValue.parse(datos_carga); 
                            JSONObject obyeto = (JSONObject) jsonObyeto; 
                            
                            Object jsonarrayobyeto = obyeto.get("Usuarios");
                            JSONArray arrayobyeto = (JSONArray) jsonarrayobyeto;
                            for(Object obyeto_inarray: arrayobyeto)
                            {
                                if(counter==usuarios.length)break;
                                JSONObject obyeto_value = (JSONObject) obyeto_inarray;
                                Usuario nuevo_usuario = new Usuario();

                                nuevo_usuario.setUsername((String) obyeto_value.get("Usuario"));
                                nuevo_usuario.setPassword((String) obyeto_value.get("Password"));
                                nuevo_usuario.setEscuela((String) obyeto_value.get("Carrera"));
                                nuevo_usuario.setFacultad((String) obyeto_value.get("Facultad"));
                                Long value_tipo = (Long) obyeto_value.get("Tipo");
                                nuevo_usuario.setTipo(value_tipo.intValue());
                                Long value_id = (Long) obyeto_value.get("ID");
                                nuevo_usuario.setIdUsuario(value_id.intValue());
//    
                                System.out.println("ID: "+ (Long) obyeto_value.get("ID"));
                                System.out.println("Usuario: "+ (String) obyeto_value.get("Usuario"));
                                System.out.println("Password: "+ (String) obyeto_value.get("Password"));
                                System.out.println("Tipo: "+ (Long) obyeto_value.get("Tipo"));
                                System.out.println("Facultad: "+ (String) obyeto_value.get("Facultad"));
                                System.out.println("Carrera: "+ (String) obyeto_value.get("Carrera"));
                                System.out.println("------------------------------------");
                                usuarios[counter] = nuevo_usuario;
                                
                                
                                
                                counter++;
                           }
                            pantalla_masiva.setVisible(false);
//////JOptionPane.showMessageDialog(null, "No Existe un usuario con las credenciales indicadas", "Error al Iniciar Sesion", JOptionPane.ERROR_MESSAGE);
                   }
       }
               });

               pantalla_masiva.add(scroll);
               pantalla_masiva.add(cargar);
               pantalla_masiva.setLocationRelativeTo(null); //Center screen
               pantalla_masiva.setVisible(true);
          }});
             
             
             
             
             
             
             
             
             
             
             
          }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    
//    public void actionPerformed(ActionEvent evento){ /*en este metodo abstracto añadire las acciones del boton */
//        String nombre,contraseña;
//        int validacion=0;
//        
//     if(evento.getSource()==boton1){ //en este if añadire las acciones si se llega a ejecutar el boton 1*/
//    // JOptionPane.showMessageDialog(null, "aqui añadire una accion"); --
//    nombre = caja1.getText().trim();//en esta linea obtendre los datos ingresados en usuario 
//     contraseña = caja2.getText().trim();//en esta linea obtendre los datos ingresados en contraaseña 
// //  JOptionPane.showMessageDialog(null, "su nombre es"+nombre+" y "+contraseña); --
// //caja1.getText().equals("D123") && caja2.getText().equals("123")--
// 
// 
// 
// if(caja1.getText().equals("D123") && caja2.getText().equals("123")){//si ingrreso el usuario y contraseña en mi caja de texto, sera true
//  caja1.setBackground(Color.WHITE);//mi caja de texto de nombre cambiara a color blanco 
// caja2.setBackground(Color.WHITE);//mi caja de texto de contraseña cambiara a color blanco 
//// JOptionPane.showMessageDialog(null, "concedido");
// clase3 obj2 =  new clase3();
//obj2.setVisible(true);
// }else  if(caja1.getText().equals("") && caja2.equals(" ")){
//      caja1.setBackground(Color.WHITE);
// caja2.setBackground(Color.red);
//validacion++;}
// else  if(caja2.equals("")){
// caja2.setBackground(Color.red);
//validacion++;}
// else  if(caja1.equals("")){
// caja1.setBackground(Color.red);
//validacion++;}
// else{
// caja1.setBackground(Color.red);
// caja2.setBackground(Color.red);
// validacion++;}
//
//     
//     
//     
//     
//     
//     
//     
//     
//     
//     
//     
//     }
//     
//     
//     
//     
//     
//     
//    if(evento.getSource()==boton2){ /*en este if añadire las acciones si se llega a ejecutar el boton 2*/
//    // JOptionPane.showMessageDialog(null, "aqui añadire una accion 2");
//       
//    
//     }
//    
//    }
//    

    @Override
    public void actionPerformed(ActionEvent en) {
 
    }
    
    
    

}
 