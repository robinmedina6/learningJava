import java.util.Scanner;
public class Login{
  public static void main(String args[]){
    Scanner entrada = new Scanner(System.in);
    String inputUsername = "", inputPassword = "" , savedUsername = "robinson", savedPassword = "medina";
    System.out.println("enter username and then password");
    inputUsername= entrada.nextLine();
    inputPassword= entrada.nextLine();
    if(savedUsername.equals(inputUsername) && savedPassword.equals(inputPassword)){
      System.out.println("Loggin Successfully");
    }else{
      System.out.println("Incorrect Username or password");
    
    }
    
  }


}