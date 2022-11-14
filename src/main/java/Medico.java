public class Medico {
    private String nombre;
    private int edad;
    private String rut;
    private String especialidad;

    public Medico(String nombre, int edad, String rut,String especialidad) {
        this.nombre=nombre;
        this.edad=edad;
        this.rut=rut;
        this.especialidad=especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRut() {
        return rut;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}