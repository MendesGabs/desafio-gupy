import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra = sc.nextLine();

        int contador = 0;
        String[] palavraVetor = palavra.split("");

        int ocorrencias = 0;
        boolean currencyExists = false;

        for (int i = 0; i < palavraVetor.length; i++) {
            if (palavraVetor[i].toLowerCase().equals("a")){
                ocorrencias++;
                currencyExists = true;
            }
        }
        if (currencyExists == true){
            System.out.println("A letra a existe na palavra digitada");
            System.out.println("quantidade de ocorrencias" + ocorrencias);

        }else{
            System.out.println("a letra a nao existe na palavra digitada");
        }




    sc.close();
    }
}
