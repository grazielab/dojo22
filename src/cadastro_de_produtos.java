import java.util.Scanner;

public class cadastro_de_produtos {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        cabecalho();
        imprimeMenu();
        menu();
    }

    static void cabecalho() {
        System.out.println("***** Cadastro de produtos *****");
    }
    static void imprimeMenu(){
        System.out.println("\t1 - Cadastrar produto");
        System.out.println("\t2 - Cadastrar categoria");
        System.out.println("\t0 - Sair");
    }
    static void menu (){
        int opcao = 0;
        System.out.println("Digite a sua opção: ");
        opcao = scan.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Cadastrar produto: ");
                break;
            case 2:
                System.out.println("Cadastrar categoria: ");
                break;
            case 0:
                System.out.println("Programa encerrado!");
                break;
        }
    }
}
