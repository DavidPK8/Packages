import conicas2.*;
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        circunferencia_grupo2 circunferencia = new circunferencia_grupo2(25, 60);

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
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
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