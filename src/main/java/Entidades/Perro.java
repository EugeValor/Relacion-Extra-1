package Entidades;

/**
 *
 * @author 54343
 */
public class Perro {
   private String nombre, raza, tamaño;
    private Integer edad;

    public Perro() {
    }

    public Perro(String nombre, String raza, String tamaño, Integer edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamaño = tamaño;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", tama\u00f1o=" + tamaño + ", edad=" + edad + '}';
    }
    
      
}
