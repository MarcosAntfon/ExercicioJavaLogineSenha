import java.util.Scanner;

public class ExercicioLogineSenha {

    //Login e senha
	
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        // 1) Informe o seu login
        
        System.out.println("login> ");
        String login = in.nextLine();
        
        // 2) Informe a sua senha
        
        System.out.println("senha> ");
        String senha = in.nextLine();
        
        // 3) Armazenar em variaveis o login e a senha
        // 4) Verificar se o login e a senha est�o corretos
        // login == "claudio"
        // Estamos comparando uma inst�ncia(objeto) com uma string
        
        if(login.equals("claudio") && senha.equals("123456789-09")){
        	
            System.out.printf("Usu�rio %s logado com sucesso.", login);
            
        }else{
        	
            System.out.println("Login ou senha inv�lidos!");
        }
    }
}