package co.com.ps.c3;

public class Persona {
     private String nombre;
     private int edad;
     private String estatura;
    private String id;
    private String orientacionSexual;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrientacionSexual() {
        return orientacionSexual;
    }

    public void setOrientacionSexual(String orientacionSexual) {
        this.orientacionSexual = orientacionSexual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

        public Persona();

        public Persona(String nombre);
        this.nombre=nombre;

    }

    public Persona(String nombre, int edad, String estatura, String id, String orientacionSexual) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.id = id;
        this.orientacionSexual = orientacionSexual;
    }
}
