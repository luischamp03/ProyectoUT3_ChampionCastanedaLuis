import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Se inicializan los 4 jugadores
        Jugador Juan = new Jugador("Juan");
        Jugador Pedro = new Jugador("Pedro");
        Jugador Miguel = new Jugador("Miguel");
        Jugador David = new Jugador("David");

        // Se inicializa el juego con los 4 jugadores
        Juego juego = new Juego(Juan, Pedro, Miguel, David);

        // Se crea el scanner
        Scanner scanner = new Scanner(System.in);

        // Categorías: deporte, videojuego, mitologia, tecnologia

        // Creación de preguntas de deporte
        Pregunta p1Deporte = new Pregunta("¿En qué ciudad se celebraron los Juegos Olímpicos de 2016?", "Deporte", "Londres", "Río de Janeiro", "Tokio", "Atenas", 2);
        Pregunta p2Deporte = new Pregunta("¿Qué jugador ha ganado más balones de oro en la historia del fútbol?", "Deporte", "Cristiano Ronaldo", "Lionel Messi", "Johan Cruyff", "Michel Platini", 2);
        Pregunta p3Deporte = new Pregunta("¿Cuál es el club de fútbol con más títulos de la UEFA Champions League?", "Deporte", "FC Barcelona", "Bayern Múnich", "AC Milan", "Real Madrid", 4);
        Pregunta p4Deporte = new Pregunta("¿Cuál es la carrera de ciclismo más importante del mundo?", "Deporte", "Giro de Italia", "Tour de Francia", "Vuelta a España", "París-Roubaix", 2);

        // Creación de preguntas de videojuegos
        Pregunta p1Videojuego = new Pregunta("¿En qué ciudad ficticia se desarrolla Grand Theft Auto V?", "Videojuego", "Liberty City", "Vice City", "San Andreas", "Los Santos", 4);
        Pregunta p2Videojuego = new Pregunta("En Counter-Strike: Global Offensive, ¿Cuál es el nombre del mapa más popular para partidas competitivas?", "Videojuego", "Dust II", "Mirage", "Inferno", "Train", 1);
        Pregunta p3Videojuego = new Pregunta("En League of Legends, ¿Cuál es el nombre del campeón que utiliza un \"Shuriken\" como arma principal?", "Videojuego", "Yasuo", "Zed", "Akali", "Kennen", 2);
        Pregunta p4Videojuego = new Pregunta("¿Qué empresa desarrolló el juego 'Fortnite'?", "Videojuego", "Ubisoft", "Electronic Arts", "Epic Games", "Valve", 3);

        // Creación de preguntas de mitologia
        Pregunta p1Mitologia = new Pregunta(" Según la mitología egipcia, ¿Qué dios tenía la responsabilidad de pesar el corazón de los muertos para determinar su destino en el más allá?", "Mitología", "Osiris", "Anubis", "Horus", "Ra", 2);
        Pregunta p2Mitologia = new Pregunta("En la mitología hindú, ¿Qué dios tiene una cabeza de elefante y es considerado el eliminador de obstáculos?", "Mitología", "Vishnu", "Ganesh", "Shiva", "Brahma", 2);
        Pregunta p3Mitologia = new Pregunta("¿Qué dios griego es conocido por haber liberado a Prometeo de su castigo eterno?", "Mitología", "Hércules", "Zeus", "Hermes", "Apolo", 1);
        Pregunta p4Mitologia = new Pregunta("¿Qué dios romano es considerado el equivalente de Ares, el dios de la guerra en la mitología griega?", "Mitología", "Mercurio", "Júpiter", "Marte", "Saturno", 3);

        // Creación de preguntas de tecnología
        Pregunta p1Tecnologia = new Pregunta("¿Qué significa \"HTML\"?", "Tecnología", "HyperText Markup Language", "HighTech Markup Language", "HyperTransfer Media Language", "HyperTag Meta Language", 1);
        Pregunta p2Tecnologia = new Pregunta("¿Quién es el fundador de Microsoft?", "Tecnología", "Steve Jobs", "Bill Gates", "Larry Page", "Jeff Bezos", 2);
        Pregunta p3Tecnologia = new Pregunta("¿Qué herramienta de control de versiones es ampliamente utilizada en el desarrollo de software?", "Tecnología", "Git", "Docker", "Jenkins", "Apache", 1);
        Pregunta p4Tecnologia = new Pregunta("¿Qué protocolo es utilizado para transferir archivos a través de internet?", "Tecnología", "HTTP", "FTP", "DNS", "SMTP", 2);

        // Variables a usar para el juego
        Jugador jugadorActual;
        int respuesta;

        System.out.println("------JUEGO DE PREGUNTAS-------");

        // CATEGORIA "DEPORTE"
        // Se reparten las 4 preguntas de deporte a los jugadores
        juego.repartirPreguntas(p1Deporte, p2Deporte, p3Deporte, p4Deporte);

        // Turno de jugador1
        jugadorActual = juego.getJugadorTurnoActual();
        jugadorActual.mostrarPregunta();
        respuesta = scanner.nextInt();
        juego.jugarTurno(jugadorActual, respuesta);

        // Turno de jugador2
        jugadorActual = juego.getJugadorTurnoActual();
        jugadorActual.mostrarPregunta();
        respuesta = scanner.nextInt();
        juego.jugarTurno(jugadorActual, respuesta);

        // Turno de jugador3
        jugadorActual = juego.getJugadorTurnoActual();
        jugadorActual.mostrarPregunta();
        respuesta = scanner.nextInt();
        juego.jugarTurno(jugadorActual, respuesta);

        // Turno de jugador4
        jugadorActual = juego.getJugadorTurnoActual();
        jugadorActual.mostrarPregunta();
        respuesta = scanner.nextInt();
        juego.jugarTurno(jugadorActual, respuesta);

        // Se muestran los resultados al terminar el turno de los 4 jugadores
        juego.mostrarResultados();

        //-----------------------------------------------------------------------/

        // CATEGORIA "VIDEOJUEGO"
        // Se reparten las 4 preguntas de videojuego a los jugadores
        juego.repartirPreguntas(p1Videojuego, p2Videojuego, p3Videojuego, p4Videojuego);

        // Turno de jugador1
        jugadorActual = juego.getJugadorTurnoActual();
        jugadorActual.mostrarPregunta();
        respuesta = scanner.nextInt();
        juego.jugarTurno(jugadorActual, respuesta);

        // Turno de jugador2
        jugadorActual = juego.getJugadorTurnoActual();
        jugadorActual.mostrarPregunta();
        respuesta = scanner.nextInt();
        juego.jugarTurno(jugadorActual, respuesta);

        // Turno de jugador3
        jugadorActual = juego.getJugadorTurnoActual();
        jugadorActual.mostrarPregunta();
        respuesta = scanner.nextInt();
        juego.jugarTurno(jugadorActual, respuesta);

        // Turno de jugador4
        jugadorActual = juego.getJugadorTurnoActual();
        jugadorActual.mostrarPregunta();
        respuesta = scanner.nextInt();
        juego.jugarTurno(jugadorActual, respuesta);

        // Se muestran los resultados al terminar el turno de los 4 jugadores
        juego.mostrarResultados();

        //-----------------------------------------------------------------------/

        // CATEGORIA "MITOLOGIA"
        // Se reparten las 4 preguntas de mitologia a los jugadores
        juego.repartirPreguntas(p1Mitologia, p2Mitologia, p3Mitologia, p4Mitologia);

        // Turno de jugador1
        jugadorActual = juego.getJugadorTurnoActual();
        jugadorActual.mostrarPregunta();
        respuesta = scanner.nextInt();
        juego.jugarTurno(jugadorActual, respuesta);

        // Turno de jugador2
        jugadorActual = juego.getJugadorTurnoActual();
        jugadorActual.mostrarPregunta();
        respuesta = scanner.nextInt();
        juego.jugarTurno(jugadorActual, respuesta);

        // Turno de jugador3
        jugadorActual = juego.getJugadorTurnoActual();
        jugadorActual.mostrarPregunta();
        respuesta = scanner.nextInt();
        juego.jugarTurno(jugadorActual, respuesta);

        // Turno de jugador4
        jugadorActual = juego.getJugadorTurnoActual();
        jugadorActual.mostrarPregunta();
        respuesta = scanner.nextInt();
        juego.jugarTurno(jugadorActual, respuesta);

        // Se muestran los resultados al terminar el turno de los 4 jugadores
        juego.mostrarResultados();

        //-----------------------------------------------------------------------/

        // CATEGORIA "TECNOLOGIA"
        // Se reparten las 4 preguntas de tecnologia a los jugadores
        juego.repartirPreguntas(p1Tecnologia, p2Tecnologia, p3Tecnologia, p4Tecnologia);

        // Turno de jugador1
        jugadorActual = juego.getJugadorTurnoActual();
        jugadorActual.mostrarPregunta();
        respuesta = scanner.nextInt();
        juego.jugarTurno(jugadorActual, respuesta);

        // Turno de jugador2
        jugadorActual = juego.getJugadorTurnoActual();
        jugadorActual.mostrarPregunta();
        respuesta = scanner.nextInt();
        juego.jugarTurno(jugadorActual, respuesta);

        // Turno de jugador3
        jugadorActual = juego.getJugadorTurnoActual();
        jugadorActual.mostrarPregunta();
        respuesta = scanner.nextInt();
        juego.jugarTurno(jugadorActual, respuesta);

        // Turno de jugador4
        jugadorActual = juego.getJugadorTurnoActual();
        jugadorActual.mostrarPregunta();
        respuesta = scanner.nextInt();
        juego.jugarTurno(jugadorActual, respuesta);

        // Se muestran los resultados al terminar el turno de los 4 jugadores
        juego.mostrarResultados();

        // Se muestran los resultados de los jugadores ordenados en base a los puntos obtenidos
        juego.comprobarOrdenJugadores();

    }
}
