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
        
        int potega1 = (int)Math.pow(a,b);
        int potega2 = (int)Math.pow(b,a);

        int suma = potega1 + potega2;
        
        System.out.println("Suma  poteg liczb " + a + " i " + b + " wynosi " + suma); 
    
  }
}