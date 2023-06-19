import conicas2.*;
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        circunferencia_grupo2 circunferencia = new circunferencia_grupo2(25, 60);
        Elipse elipse = new Elipse(24.15, 12.67);
        hiperbole hiperbole = new hiperbole(8, 24);
        Parabola_Equipo2 parabola = new Parabola_Equipo2(0, 0, 45, 23, 73);

        do{
            System.out.println("\n*** MENU ***");
            System.out.println("\n1. Circunferencia");
            System.out.println("2. Elipse");
            System.out.println("3. Hiperbole");
            System.out.println("4. Parabola");
            System.out.println("5. Salir");
            System.out.print("\nSelecciona una opcion del menu: ");
            menu = sc.nextInt();

            switch (menu){
                case 1:{
                    System.out.println("\n*** CIRCUNFERENCIA ***");
                    System.out.println("\nPerimetro: " + circunferencia.perimetro_cir());
                    System.out.println("Area: " + circunferencia.area_cir());
                    System.out.println("Angulo Inscrito: " + circunferencia.angulo_inscrito_cir());
                    break;
                }
                case 2:{
                    System.out.println("\n*** ELIPSE ***");
                    System.out.println("\nPerimetro: " + elipse.perimetro_elipse());
                    System.out.println("Area: " + elipse.area_elipse());
                    break;
                }
                case 3:{
                    System.out.println("\n*** HIPERBOLE ***");
                    System.out.println();
                    hiperbole.variables();
                    break;
                }
                case 4:{
                    System.out.println("\n*** PARABOLA ***");
                    parabola.Parabola_Equipo2_VerticeX(45, 23);
                    parabola.Parabola_Equipo2_VerticeY(45, 23, 73);
                    System.out.println();
                    parabola.Parabola_Equipo2_ImpVer();
                    break;
                }
                case 5:{
                    System.out.println("Gracias por usar el menu!");
                    break;
                }
                default:
                    System.out.println("Opcion no disponible del menu!");
            }
        }while(menu != 5);
    }
}