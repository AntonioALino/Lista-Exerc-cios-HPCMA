import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidadeRegistrada;

        System.out.println("Quantos animais você deseja registrar?");
        quantidadeRegistrada = scanner.nextInt();

        for (int i = 0; i < quantidadeRegistrada; i++){
            System.out.print("Deseja registrar um cachorro ou gato?");
            String opcaoEscolhida = scanner.next();

            if (opcaoEscolhida.equals("cachorro")){

                System.out.print("Insira o nome do cachorro: ");
                String nome = scanner.next();
                System.out.print("Insira a idade do cachorro: ");
                int idade = scanner.nextInt();
                System.out.print("Insira a raça do cachorro: ");
                String raca = scanner.next();

                Animal animal = new Cachorro(nome, idade, raca);

                System.out.println();
                System.out.print(animal);

            } else if (opcaoEscolhida.equals("gato")) {

                System.out.print("Insira o nome do gato: ");
                String nome = scanner.next();
                System.out.print("Insira a idade do gato: ");
                int idade = scanner.nextInt();
                System.out.print("Insira o tipo de pelagem do gato: ");
                String pelagem = scanner.next();

                Animal animal = new Gato(nome, idade, pelagem);

                System.out.println();
                System.out.print(animal);
            } else {
                System.out.println("Esse animal não esta disponível no banco de dados.");
            }
            {
                
            }

        }





    }
}