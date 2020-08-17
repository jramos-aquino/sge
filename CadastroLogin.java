import java.util.Scanner;

public class CadastroLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Strings
        String nome;
        String sobrenome;
        String senha = null;

        // Entradas do usuário
        System.out.println("Escreva seu primeiro nome: ");
        nome = scanner.nextLine();

        System.out.println("Escreva seu último nome: ");
        sobrenome = scanner.nextLine();


        boolean senhaInvalida = false;

        while (senhaInvalida == false) {
            System.out.println("Crie uma senha: ");
            System.out.println("(Sua senha deve conter no mínimo 8 caracteres, 1 letra maiúscula, 1 letra minúscula, 1 números e 1 caractere especial)");
            senha = scanner.nextLine();

            if (senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+") && senha.length() > 7) {
                senhaInvalida = true;
                System.out.println("Cadastro realizado com sucesso!");
            } else {
                System.out.println("A senha não corresponde os requisitos, tente novamente!");
            }
        }

        //Criação do nome do usuário após o cadastro efetuado
        String nomeUsuario = nome.charAt(0) + "_" + sobrenome;
        System.out.println("Seu nome de usuário é : " + nomeUsuario);

        //Validação de login
        boolean loginValido = false;
        while (loginValido == false) {
            System.out.println("Informe o nome do Usuário: ");
            String login = scanner.nextLine();
            System.out.println("Informe sua Senha: ");
            String password = scanner.nextLine();

            if (login.equals(nomeUsuario) && password.equals(senha)) {
                System.out.println("Login realizado com sucesso!");
                loginValido = true;
            } else {
                System.out.println("login incorreto, tente novamente.");
            }
        }


    }
}
