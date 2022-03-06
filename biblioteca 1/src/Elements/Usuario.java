
package Elements;

public class Usuario {
     private String username;  //declaro las variables donde estara el nombre
    private String password;//declaro la varible donde estara la contraseña 
    private int idUsuario;//declaro la varibale donde estara el id de usuario 
    private int tipo;//declaro la variable donde estara el tipo usuario
    private String Facultad;//declaro la variable donde estara la facultad
    private String Escuela;//declaro la variable donde estara la escuela del usuario
    
    public Usuario(){
        username = "";
        password = "";
        idUsuario = -1;
        tipo = -1;
        Facultad = "";
        Escuela = "";
    }
    
    
      public Usuario(String username, String password, int idUsuario, int tipo, String facultad, String escuela) {
        this.username = username;
        this.password = password;
        this.idUsuario = idUsuario;
        this.tipo = tipo;
        Facultad = facultad;
        Escuela = escuela;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getTipo() {
        return tipo;
    }
    public String getTipoInfo()
    {
        return (tipo==1)? "Administrador": "Usuario";
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String facultad) {
        Facultad = facultad;
    }
    public String getEscuela() {
        return Escuela;
    } 
    public void setEscuela(String escuela) {
        Escuela = escuela;
    }
}
