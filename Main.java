import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {

     Scanner scanner = new Scanner(System.in);
        
        System.out.print("Podaj pierwsza liczbe: ");
        int a = scanner.nextInt();
        
        System.out.print("Podaj druga liczbe: ");
        int b = scanner.nextInt(); 
        
        int suma = a + b;
        
        System.out.println("Suma liczb " + a + " i " + b + " wynosi " + suma); 
    
  }
}