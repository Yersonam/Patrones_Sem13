    package Observer;

    import java.util.ArrayList;
    import java.util.List;

    public class Subject {
        private List<Observador> observadores = new ArrayList<>();
        private double estado;
        private String name;
        public double getEstado() {
            return estado;
        }
        public void setEstado(double estado) {
            this.estado = estado;
            notificarObservadores();
        }
        public double[] obtenerResultados(double estado) {
            this.estado = estado;
            double[] resultados = new double[observadores.size()];
            for (int i = 0; i < observadores.size(); i++) {
                Observador observador = observadores.get(i);
                resultados[i] = observador.actualizar();
            }
            return resultados;
        }

        public void agregar(Observador observador) {
            observadores.add(observador);
        }

        public void eliminar(Observador observador) {
            observadores.remove(observador);
        }

        public void notificarObservadores() {
            for (Observador observador : observadores) {
                observador.actualizar();
            }
        }

        public String[] obtenerMoneda(){
            String[] nombres = new String[observadores.size()];
            for (int i = 0; i < observadores.size(); i++) {
                nombres[i] = observadores.get(i).moneda();
            }
            return nombres;

        }

        public List<Observador> getObservadores() {
            return observadores;
        }
    }
