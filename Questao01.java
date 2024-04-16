import java.util.Scanner; 
import java.util.ArrayList;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Questao01 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner ler = new Scanner(System.in);

        int n, x, contador = 0;
        ArrayList<Integer> total = new ArrayList<Integer>();

        n = ler.nextInt();

        while (n < 1 && n > 100) {

            n = ler.nextInt();

        }

        for (int i = 0; i < n; i++) {

            x = ler.nextInt();

            while (x <= 1 && x >= 10000000) {

                x = ler.nextInt();

            }

            total.add(x);

        }

        for (int j = 0; j < n; j++) {

            for (int index = 2; index <= Math.sqrt(total.get(j)); index++) {

                if (total.get(j) % index == 0) {

                    contador++;

                } else {

                    contador++;

                }
            }
            
            if (contador > 2){
                
                System.out.println(total.get(j) + " nao eh primo");
                
            }else {
                
                System.out.println(total.get(j) + " eh primo");
                
            }

        }

        System.out.println();
    }
}