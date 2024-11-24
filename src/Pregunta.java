public class Pregunta {

    //Atributos privados
    private String pregunta;
    //Categorias: Deporte,Videojuego,Mitologia,Tecnologia
    private String categoria;
    private String opcion1;
    private String opcion2;
    private String opcion3;
    private String opcion4;
    private int respuestaCorrecta;

    //Constructor
    public Pregunta(String pregunta, String categoria, String opcion1, String opcion2, String opcion3, String opcion4, int respuestaCorrecta) {
        this.pregunta = pregunta;
        this.categoria = categoria;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        this.opcion4 = opcion4;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    //Metodo para mostrar pregunta en pantalla
    public void mostrarPregunta() {
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Pregunta: " + this.pregunta);
        System.out.println("1. " + this.opcion1);
        System.out.println("2. " + this.opcion2);
        System.out.println("3. " + this.opcion3);
        System.out.println("4. " + this.opcion4);
        System.out.print("Elige una opción [1-4]: ");
    }

    //Metodo que retorna si la respuesta elegida es correcta o no
    public boolean esCorrecta(int respuesta) {
        if (this.respuestaCorrecta == respuesta) {
            return true;
        } else {
            return false;
        }
    }
}
