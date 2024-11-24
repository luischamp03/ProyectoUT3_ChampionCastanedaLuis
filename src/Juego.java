public class Juego {

    //Atributos privados
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugador3;
    private Jugador jugador4;
    private int turnoActual;

    //Constructor
    public Juego(Jugador jugador1, Jugador jugador3, Jugador jugador2, Jugador jugador4) {
        this.jugador1 = jugador1;
        this.jugador3 = jugador3;
        this.jugador2 = jugador2;
        this.jugador4 = jugador4;
        this.turnoActual = 1;
    }

    //Metodo para devolver el jugador del turno actual
    public Jugador getJugadorTurnoActual() {
        switch (this.turnoActual) {
            case 1:
                return this.jugador1;
            case 2:
                return this.jugador2;
            case 3:
                return this.jugador3;
            case 4:
                return this.jugador4;
            default:
                return this.jugador1;
        }
    }

    //Metodo para repartir las preguntas a cada jugador de manera aleatoria
    public void repartirPreguntas(Pregunta p1, Pregunta p2, Pregunta p3, Pregunta p4) {
        //Numero aleatorio rango de 1 a 4
        int numAleatorio = (int) (Math.random() * 4) + 1;

        switch (numAleatorio) {
            case 1:
                this.jugador1.asignarPregunta(p1);
                this.jugador2.asignarPregunta(p2);
                this.jugador3.asignarPregunta(p3);
                this.jugador4.asignarPregunta(p4);
                break;
            case 2:
                this.jugador1.asignarPregunta(p2);
                this.jugador2.asignarPregunta(p3);
                this.jugador3.asignarPregunta(p4);
                this.jugador4.asignarPregunta(p1);
                break;
            case 3:
                this.jugador1.asignarPregunta(p3);
                this.jugador2.asignarPregunta(p4);
                this.jugador3.asignarPregunta(p1);
                this.jugador4.asignarPregunta(p2);
                break;
            case 4:
                this.jugador1.asignarPregunta(p4);
                this.jugador2.asignarPregunta(p1);
                this.jugador3.asignarPregunta(p2);
                this.jugador4.asignarPregunta(p3);
                break;
            default:
                this.jugador1.asignarPregunta(p1);
                this.jugador2.asignarPregunta(p2);
                this.jugador3.asignarPregunta(p3);
                this.jugador4.asignarPregunta(p4);
                break;
        }
    }

    //Metodo donde el jugador actual responde la pregunta y se pasa el turno al siguiente jugador
    public void jugarTurno(Jugador jugador, int opcion) {
        jugador.responder(opcion);
        // Si el turno actual es distinto a 4, se aumenta
        if (this.turnoActual != 4) {
            this.turnoActual++;
        } else { // Si es igual a 4, entonces pasa a ser 1
            this.turnoActual = 1;
        }
    }

    public void mostrarResultados() {
        System.out.println("RESULTADOS:");
        this.jugador1.mostrarPuntos();
        this.jugador2.mostrarPuntos();
        this.jugador3.mostrarPuntos();
        this.jugador4.mostrarPuntos();
        System.out.println("----------------");
    }

    //Metodo donde se ordenan a los jugadores en base al puntaje obtenido
    public void comprobarOrdenJugadores() {
        Jugador primero = jugador1;
        Jugador segundo = jugador2;
        Jugador tercero = jugador3;
        Jugador cuarto = jugador4;
        // Variable auxiliar usada para realizar los intercambios
        Jugador jugadorAux;

        // Se comparan los puntos del jugador en primera posición con el segundo
        if (primero.getPuntos() < segundo.getPuntos()) {
            jugadorAux = primero;
            primero = segundo;
            segundo = jugadorAux;
        }

        // Se comparan los puntos del jugador en primera posición con el tercero
        if (primero.getPuntos() < tercero.getPuntos()) {
            jugadorAux = primero;
            primero = tercero;
            tercero = jugadorAux;
        }

        // Se comparan los puntos del jugador en primera posición con el cuarto
        if (primero.getPuntos() < cuarto.getPuntos()) {
            jugadorAux = primero;
            primero = cuarto;
            cuarto = jugadorAux;
        }

        // Se comparan los puntos del jugador en segunda posición con el tercero
        if (segundo.getPuntos() < tercero.getPuntos()) {
            jugadorAux = segundo;
            segundo = tercero;
            tercero = jugadorAux;
        }

        // Se comparan los puntos del jugador en segunda posición con el cuarto
        if (segundo.getPuntos() < cuarto.getPuntos()) {
            jugadorAux = segundo;
            segundo = cuarto;
            cuarto = jugadorAux;
        }

        // Se comparan los puntos del jugador en tercera posición con el cuarto
        if (tercero.getPuntos() < cuarto.getPuntos()) {
            jugadorAux = tercero;
            tercero = cuarto;
            cuarto = jugadorAux;
        }

        // Se muestran los resultados ordenados
        System.out.println("ORDEN FINAL:");
        System.out.println("1. " + primero.getNombre() + " con " + primero.getPuntos() + " puntos.");
        System.out.println("2. " + segundo.getNombre() + " con " + segundo.getPuntos() + " puntos.");
        System.out.println("3. " + tercero.getNombre() + " con " + tercero.getPuntos() + " puntos.");
        System.out.println("4. " + cuarto.getNombre() + " con " + cuarto.getPuntos() + " puntos.");
    }
}
