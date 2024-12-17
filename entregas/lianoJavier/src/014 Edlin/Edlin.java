import java.util.Scanner;

class Edlin {
        public static void main(String[] args) {
                String[] texto = getTexto();

                int linea = 0;
                boolean cerrarBucle = false;
                do {
                        imprimirTexto(texto, linea);

                        String seleccion = pedirComando();

                        if (seleccion.equalsIgnoreCase("x"))
                        linea = cambiarLinea();

                        if (seleccion.equalsIgnoreCase("e"))
                        editarTexto(pedirEdicion(), texto, linea);

                        if (seleccion.equalsIgnoreCase("d"))
                        editarTexto("", texto, linea);
                        
                        if (seleccion.equalsIgnoreCase("q"))
                        cerrarBucle = true;
                } while (!cerrarBucle);
        }

        static int cambiarLinea() {
                int linea = pedirLinea();
                return linea;
        }

        static String pedirComando() {
                return new Scanner(System.in).nextLine();
        }

        static void editarTexto(String edicion, String[] texto, int posicion) {
                texto[posicion] = edicion;
        }

        static String[] getTexto() {

                String[] texto = {
                                "This is Edlin",
                                "-------------",
                                "You can edit this file with the keys listed",
                                "x: cambiar linea",
                                "e: editar linea",
                                "q: salir",
                                "",
                                "",
                                "",
                                ""
                };

                return texto;

        }

        static String pedirEdicion() {
                return new Scanner(System.in).nextLine();
        }

        static int pedirLinea() {
                return new Scanner(System.in).nextInt();
        }

        static void imprimirTexto(String[] texto, int lineaSeleccionada) {
                for (int linea = 0; linea < texto.length; linea++) {
                        System.out.print(linea == lineaSeleccionada ? "*" : " ");
                        System.out.print(linea+": ");
                        System.out.println(texto[linea]);
                }
        }
}
