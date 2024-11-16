import java.util.Scanner;

class adivinacion {
  public static void main(String[] args) {
    final int NUMERO_MAXIMO = 100, NUMERO_MINIMO = 1;

    int numeroOrdenador = eleccionOrdenador(NUMERO_MAXIMO, NUMERO_MINIMO);

    int numeroUsuario;
    int intento = 0;
    boolean acierta;
    do {
      numeroUsuario = eleccionUsuario(NUMERO_MAXIMO, NUMERO_MINIMO);
      intento++;
      acierta = numeroOrdenador == numeroUsuario;
    } while (!acierta || intento <= 4);

    imprimirResumen(acierta, numeroUsuario, numeroOrdenador);

  }

  private static int eleccionOrdenador(int numeroMaximo, int numeroMinimo) {
    return (int) ((Math.random() * numeroMaximo - numeroMinimo + 1) + numeroMinimo);
  }

  private static int eleccionUsuario(int numeroMaximo, int numeroMinimo) {
    int numero;
    boolean numeroCorrecto;
    System.out.println("Elija un número entre 1 y 100. Ambos incluidos.");

    Scanner input = new Scanner(System.in);
    do {
      numero = input.nextInt();

      numeroCorrecto = numero >= numeroMinimo && numero <= numeroMaximo;
      if (!numeroCorrecto)
        System.out.println("Numero no valido.");
    } while (!numeroCorrecto);
    input.close();

    return numero;
  }

  private static void imprimirResumen(boolean acierta, int numeroUsuario, int numeroOrdenador) {
    String resultado = "No has acertado";
    if (acierta)
      resultado = "Acertaste!";
    System.out.println(resultado);
    System.out.println("Numero elegido por el Jugador: " + numeroUsuario);
    System.out.println("Numero elegido por el Ordenador: " + numeroOrdenador);
  }

}
