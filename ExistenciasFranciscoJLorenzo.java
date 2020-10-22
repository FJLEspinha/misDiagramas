import java.util.Scanner;

public class ExistenciasFranciscoJLorenzo {
    public static void main(String[] args) {
        int Existencias;
        int Entregadas=0;
        Existencias=3200;
        while (Existencias>=100) {
            System.out.println("Selecciona el nº de existencias a pedir");
            Scanner ped=new Scanner(System.in);
            Entregadas=ped.nextInt();
            Existencias=Existencias-Entregadas;
            System.out.println("Existencias actuales:  "+Existencias);


            
        }
        System.out.println("No existen existencias disponibles");
    }
}
