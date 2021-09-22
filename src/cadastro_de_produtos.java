public class cadastro_de_produtos {
    public static void main(String[] args) {
        cabecalho();
        imprimeMenu();
    }

    static void cabecalho() {
        System.out.println("***** Cadastro de produtos *****");
    }
    static void imprimeMenu(){
        System.out.println("\t1 - Cadastrar produto");
        System.out.println("\t2 - Cadastrar categoria");
        System.out.println("\t0 - Sair");
    }
}
