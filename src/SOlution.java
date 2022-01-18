



import java.util.Scanner;

public class SOlution
{

    // Desarrolla un programa java que pida al usuario que introduzca dos números enteros: la base y el exponente.
    //
    //Los posibles valores de la base estarán entre 1 y 10 y los del exponente entre 1 y 4. Si los valores
    // introducidos están fuera de rango, el programa debe indicarlo y no hacer nada más.
    //
    //Si los valores están en rango, hay que calcular la base elevada al exponente, en un método aparte que
    // utilice un bucle for para el cálculo. Y presentar el resultado por pantalla.

    public class Exponente {

        public static void main(String args[]) {

            Scanner sc1 = new Scanner(System.in);

            Scanner sc2 = new Scanner (System.in);

            System.out.println("Introduce la base (0 a 11): ");

            int base = sc1.nextInt();

            System.out.println("Introduce el exponente: ");

            int exp = sc2.nextInt();

            if (base>0 && base <11 && exp>0 && exp<5){

                System.out.println ("Los valores estan dentro de rango");

                System.out.println ("La base: " + base +  "El exponente:" + exp);

                System.out.println (" El resultado es "+baseExponente (base,exp));

            }else {

                System.out.println("Al menos uno de los valores está fuera de rango");

            }

            sc1.close();sc2.close();

        }

        private static int baseExponente (int b, int e){

            int result = 1;

            for (int i=1;i<=e;i++){

                result = result * b;

            }

            return result;

        }

    }

}
