import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

    int inputFibo = sc.nextInt();

        ArrayList<Integer> fibo = new ArrayList<>();
        fibo.add(0);
        fibo.add(1);

        for (int i = 0; i < inputFibo; i++) {
            int resultado = 0;
            for (int j = fibo.toArray().length -2; j < fibo.toArray().length; j++) {
                resultado = resultado + fibo.get(j);
            }
            fibo.add(resultado);
        }
        if (fibo.contains(inputFibo)){
            System.out.println("O valor digitado: " + "existe na sequencia");
        }else {
            System.out.println("o valor digitado : "+ "nao existe na sequencia fibonacci" );
        }

    }
}