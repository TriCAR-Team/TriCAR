/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro_empleado;

/**
 *
 * @author Rachel
 */
public class Empleados {
    int id;             
    String nombre; 
    int edad; 
    String genero;
    int num_bus; 
    String empleado; 
    int num_empleado; 
    int num_ruta;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }

    public int getNum_ruta() {
        return num_ruta;
    }

    public void setNum_ruta(int num_ruta) {
        this.num_ruta = num_ruta;
    }
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public int getNum_bus() {
        return num_bus;
    }

    public void setNum_bus(int num_bus) {
        this.num_bus = num_bus;
    }
   
    
}
