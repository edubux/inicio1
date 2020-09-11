public class Persona {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;
private String apellido;
private int dni;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void ponerApellido(String newApellido){
    apellido= newApellido;
}

int suma(){
    int sumar;
    int a=5;
    int b=4;

    sumar = a + b;

return  sumar;
}

void comer (String comida){
    System.out.println("tomorrow comere: "+ comida);

}
}
