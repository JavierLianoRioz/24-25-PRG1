import java.util.Scanner;

class Batalla {
    public static void main(String[] args) {
        Scanner saltarLinea = new Scanner(System.in);

        int poderGuerrero = 20, poderVampiro = 20;
        int ataqueGuerrero = 2, ataqueVampiro = 4;

        double probabilidadExitoGuerrero = 0.5, probabilidadExitoVampiro = 0.5;

        System.out.print("vida inicial del Guerrero - [" + poderGuerrero + "] ");
        System.out.println("vida inicial del Vampiro - [" + poderVampiro + "]");
        
        boolean vampiroGana;
        boolean guerreroGana;
        
        do {
            int dañoGuerrero = (int) (Math.random() <= probabilidadExitoVampiro ? ataqueVampiro : 0 );
            int dañoVampiro = (int) (Math.random() <= probabilidadExitoGuerrero ? ataqueGuerrero : 0);
            
            System.out.println("");
            System.out.print("daño del Guerrero al vampiro - [" + dañoGuerrero + "] ");
            System.out.println("daño del Vampiro - [" + dañoVampiro + "]");
            
            poderVampiro -= dañoVampiro;
            poderGuerrero -= dañoGuerrero;
            
            System.out.println("");
            System.out.print("vida del Guerrero - [" + poderGuerrero + "] ");
            System.out.println("vida del Vampiro - [" + poderVampiro + "]");
            
            vampiroGana = poderGuerrero <= 0;
            guerreroGana = poderVampiro <= 0;
            saltarLinea.nextLine();
        } while (!(vampiroGana || guerreroGana));

        if (vampiroGana) {
            System.out.println("Ha ganado el vampiro.");
        }

        if (guerreroGana) {
            System.out.println("Ha ganado el guerrero.");
        }
        saltarLinea.close();
    }
}