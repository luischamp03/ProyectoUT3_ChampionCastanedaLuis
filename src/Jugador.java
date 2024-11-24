public class Jugador {

    //Atributos privados
    private String nombre;
    private int puntos;
    private Pregunta preguntaActual;

    //Constructor
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.preguntaActual = null;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPuntos() {
        return this.puntos;
    }

    public void asignarPregunta(Pregunta pregunta) {
        this.preguntaActual = pregunta;
    }

    //Metodo para responder la pregunta en base a la opcion ingresada por el jugador
    public void responder(int opcion) {
        if (this.preguntaActual != null) {
            if (this.preguntaActual.esCorrecta(opcion)) {
                this.puntos++;
                System.out.println("Respuesta correcta. ¡Has ganado un punto!");
            } else {
                System.out.println("Respuesta incorrecta.");
            }
        } else {
            System.out.println("No hay pregunta asignada");
        }
        System.out.println("----------------");
    }

    //Metodo para mostrar la pregunta asignada al jugador
    public void mostrarPregunta() {
        if (this.preguntaActual != null) {
            System.out.println("Turno de " + this.getNombre());
            this.preguntaActual.mostrarPregunta();
        } else {
            System.out.println("No hay pregunta asignada");
        }
    }

    //Metodo para mostrar los puntos del jugador
    public void mostrarPuntos() {
        System.out.println(this.getNombre() + ": " + this.getPuntos() + " puntos.");
    }


}
