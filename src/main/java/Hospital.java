import java.util.ArrayList;

public class Hospital {
        private String nombre;
        private ArrayList<Paciente> pacientes;
        private ArrayList<Medico> medico;

        public Hospital(String nombre) {
            this.nombre = nombre;
            this.pacientes = new ArrayList<Paciente>();
            this.medico = new ArrayList<Medico>();
        }

        public String getNombre() {
            return this.nombre;
        }

        public ArrayList getPacientes() {
            return this.pacientes;
        }

        public ArrayList<Medico> getMedicos() {
            return this.medico;
        }

        public void contratarMedico(Medico medico){
            this.medico.add(medico);
        }

        public void despedirMedico(Medico medico){
            this.medico.remove(medico);
        }

    }
