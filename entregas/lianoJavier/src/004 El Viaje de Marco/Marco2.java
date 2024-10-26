import java.util.Scanner;

class Marco2 {
    public static void main(String[] args) {
        Scanner entradaConsola = new Scanner(System.in);

        System.out.println(
                "En Génova, al norte de Italia, reside una familia con dos hijos de dieciocho y once años. La madre se ve obligada a marchar a Argentina para encontrar trabajo sirviendo en una casa. Durante un tiempo la familia recibe, por escrito, noticias de la madre, pero al cabo de un año las cartas cesan, luego de una en la que se daba cuenta de problemas de salud, con lo que se crea una situación de preocupación e incertidumbre.");
        System.out.println(
                "Tras tratar de conseguir noticias a través del Consulado italiano en Buenos Aires, a los dos años de la partida de la madre, el más pequeño de los dos hijos, Marco, decide afrontar, salvando las iniciales reticencias de su padre, el largo viaje de veintisiete días que entonces debían sufrir los emigrantes a bordo de grandes buques mercantes.");
        System.out.println(
                "A su llegada a la capital argentina no consigue encontrar a su madre, pues la familia para la que trabaja ha trasladado su residencia a Córdoba. Tras pasar una noche en Buenos Aires, Marco inicia el recorrido...");

        double distancia = 350;
        int dia = 1;

        do {
            entradaConsola.nextLine();

            final double PROBABILIDAD_LLUVIA_FUERTE_MARCO = 0.1, PROBABILIDAD_LLUVIA_NORMAL_MARCO = 0.4;
            final double REDUCCION_DE_VELOCIDAD_POR_LLUVIA_FUERTE = 0.25,
                    REDUCCION_DE_VELOCIDAD_POR_LLUVIA_MEDIA = 0.75;
            double reduccionDeVelocidadPorLluvia;
            boolean LlueveFuerte = Math.random() <= PROBABILIDAD_LLUVIA_FUERTE_MARCO;
            boolean LlueveNormal = Math.random() <= PROBABILIDAD_LLUVIA_NORMAL_MARCO;
            if (LlueveFuerte) {
                reduccionDeVelocidadPorLluvia = REDUCCION_DE_VELOCIDAD_POR_LLUVIA_FUERTE;
            } else if (LlueveNormal) {
                reduccionDeVelocidadPorLluvia = REDUCCION_DE_VELOCIDAD_POR_LLUVIA_MEDIA;
            } else {
                reduccionDeVelocidadPorLluvia = 1;
            }

            final double VELOCIDAD_MAXIMA_MARCO = 15, VELOCIDAD_MINIMA_MARCO = 10;
            double velocidadMarco = (Math.random() * (VELOCIDAD_MAXIMA_MARCO - VELOCIDAD_MINIMA_MARCO)
                    - VELOCIDAD_MINIMA_MARCO)
                    * reduccionDeVelocidadPorLluvia;

            final double TIEMPO_MAXIMO_MARCO = 10, TIEMPO_MINIMO_MARCO = 8;
            double tiempoMarco = Math.random() * (TIEMPO_MAXIMO_MARCO - TIEMPO_MINIMO_MARCO) - TIEMPO_MINIMO_MARCO;

            double distanciaRecorridaMarco = velocidadMarco * tiempoMarco;

            distancia -= distanciaRecorridaMarco;

            distancia = distancia > 0 ? distancia : 0;

            System.out.println("DÍA " + dia);
            if (LlueveFuerte) {
                System.out.println("Hoy ha llovido bastante.");
            }
            if (LlueveNormal) {
                System.out.println("Ha llovido un poco.");
            }
            if (!(LlueveFuerte || LlueveNormal)) {
                System.out.println("Ha hecho buen día.");
            }
            System.out.println("Distancia recorrida por Marco - [" + distanciaRecorridaMarco + "] km.");
            System.out.println("Distancia entre ellos - [" + distancia + "] km.");
            System.out.println("");

            dia++;
        } while (distancia > 0);

        entradaConsola.close();
    }
}