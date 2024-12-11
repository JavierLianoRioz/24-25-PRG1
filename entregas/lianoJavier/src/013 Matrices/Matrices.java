import java.util.Scanner;

class Matrices {
  public static void main(String[] args) {
    int[][] mapa = getMapa(0);
    int[] coordenadasJugador = getCoordenadas(3, 2);

    boolean isPlaying = true;
    do {
      dibujar(mapa, coordenadasJugador);
      isPlaying = jugabilidad(coordenadasJugador);
    } while (isPlaying);
  }

  static boolean jugabilidad(int[] coordenadasJugador) {
    String entrada = new Scanner(System.in).nextLine();
    move(coordenadasJugador, entrada);
    return !salir(entrada);
  }

  static boolean salir(String entrada) {
    if (entrada.equalsIgnoreCase("ñ"))
      return false;
    return true;
  }

  static void move(int[] coordenadas, String movimiento) {
    if (movimiento.equalsIgnoreCase("w"))
      coordenadas[0] = coordenadas[0] - 1;
    if (movimiento.equalsIgnoreCase("s"))
      coordenadas[0] = coordenadas[0] + 1;
    if (movimiento.equalsIgnoreCase("a"))
      coordenadas[1] = coordenadas[1] - 1;
    if (movimiento.equalsIgnoreCase("d"))
      coordenadas[1] = coordenadas[1] + 1;
  }

  static int getLongitudMaxima(int[][] matriz) {
    int longitudMaxima = matriz[0].length;

    for (int row = 1; row < matriz.length; row++) {
      longitudMaxima = longitudMaxima > matriz[row].length ? longitudMaxima : matriz[row].length;
    }

    return longitudMaxima;
  }

  static int[][] getMapa(int index) {
    final int[][][] MUNDOS = {
        {
            { 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 9, 9, 9, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 },
            { 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 3, 3, 3, 3, 3, 3, 3, 3 },
            { 7, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 7, 3, 3, 3, 3 },
            { 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 2, 2, 3, 3 },
            { 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 7, 7, 2, 2, 3 },
            { 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 8, 7, 7, 2, 3 },
            { 5, 5, 5, 5, 5, 0, 2, 0, 5, 5, 5, 5, 5, 0, 0, 0, 2, 0, 0, 0, 0, 5, 7, 2, 2 },
            { 5, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 5, 0, 0, 0, 2, 0, 0, 0, 0, 8, 7, 7, 2 },
            { 5, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 5, 0, 0, 0, 2, 0, 0, 0, 0, 0, 5, 7, 7 },
            { 5, 0, 1, 1, 1, 0, 2, 0, 1, 1, 1, 0, 5, 8, 8, 8, 2, 8, 8, 8, 8, 5, 5, 7, 7 },
            { 5, 0, 1, 1, 1, 1, 2, 1, 1, 1, 1, 0, 5, 8, 6, 6, 2, 6, 6, 6, 5, 5, 5, 7, 7 },
            { 5, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 5, 6, 6, 6, 2, 6, 5, 5, 5, 5, 5, 7, 7 },
            { 5, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 5, 6, 6, 6, 2, 5, 5, 5, 8, 8, 8, 5, 7 },
            { 5, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 5, 6, 6, 5, 2, 5, 6, 6, 6, 8, 8, 5, 7 },
            { 5, 0, 1, 1, 9, 1, 1, 1, 9, 1, 1, 0, 5, 6, 5, 5, 2, 6, 6, 8, 8, 8, 8, 8, 7 },
            { 5, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 5, 5, 5, 6, 2, 6, 6, 6, 8, 1, 1, 1, 1 },
            { 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 4, 4, 6, 2, 2, 2, 2, 2, 9, 0, 0, 0 },
            { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 6, 6, 8, 8, 8, 8, 1, 0, 0, 0 },
            { 7, 7, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 6, 6, 8, 8, 8, 8, 1, 0, 5, 0 }
        }
    };
    return MUNDOS[index];
  }

  static int[] getCoordenadas(int y, int x) {
    int[] coordenadas = { y, x };
    return coordenadas;
  }

  static void dibujar(int[][] mundo, int[] coordenadasPersonaje) {
    String pixel;

    int anchoMundo = getLongitudMaxima(mundo);

    final String BORDE = parse(99);
    System.out.println(BORDE.repeat(anchoMundo));

    for (int row = 0; row < mundo.length; row++) {

      for (int column = 0; column < mundo[row].length; column++) {
        pixel = parse(mundo[row][column]);

        if (coordenadasPersonaje[0] == row && coordenadasPersonaje[1] == column)
          pixel = parse(100);

        System.out.print(pixel);
      }

      System.out.println();
    }

    System.out.println(BORDE.repeat(anchoMundo));
  }

  static String parse(int value) {
    return switch (value) {
      case 0 -> "   ";
      case 1 -> "[#]";
      case 2 -> " · ";
      case 3 -> "~ ~";
      case 4 -> "'''";
      case 5 -> ":::";
      case 6 -> ", '";
      case 7 -> "/^\\";
      case 8 -> "^Y^";
      case 9 -> ":|:";
      case 99 -> "===";
      case 100 -> "_O_";
      default -> "???";
    };
  };

}
