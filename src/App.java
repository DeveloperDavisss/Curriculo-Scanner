import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Insira seu nome: ");
        String nome = sc.nextLine();
        System.out.print(" Insira seu email: ");
        String email = sc.nextLine();
        System.out.print(" Insira seu numero de telefone: ");
        String telefone = sc.nextLine();
        System.out.print(" Insira  seu Endereco: ");
        String endereco = sc.nextLine();
        System.out.print(" Insira o titulo da sua Profissao: ");
        String profissao = sc.nextLine();
        System.out.print(" Insira sua area de atuacao: ");
        String atuacao = sc.nextLine();

        System.out.println(" \n Resumo");
        System.out.println("-------------------------");
        System.out.println(" Nome: " + nome);
        System.out.println(" E-mail: " + email);
        System.out.println(" Telefone: " + telefone);
        System.out.println(" Endereco: " + endereco);
        System.out.println("-------------------------");
        System.out.println(" Titulo Profissional: " + profissao);
        System.out.println(" Area de atuacao: " + atuacao);

        sc.close();
    }
    
}
