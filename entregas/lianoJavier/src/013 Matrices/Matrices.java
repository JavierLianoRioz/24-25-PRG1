class Matrices {
  public static void main(String[] args) {
    int[][] mapa = {
      {0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0}
    };

    dibujar(mapa);
  }

  private static void dibujar(int[][] mundo) {
    String pixel;
    final String BORDE = "=";
    System.out.println(BORDE.repeat(mundo[0].length));
    for (int row = 0; row < mundo.length; row++) {
      for (int column = 0; column < mundo[row].length; column++) {
        pixel = ""+mundo[row][column];
        System.out.print(pixel);
      }
      System.out.println();
    }
    System.out.println(BORDE.repeat(mundo[mundo.length - 1].length));
  }
}
