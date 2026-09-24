import java.util.Scanner;

public class main {
    public static void main( String[] args) {
        Helper help = new Helper();
        help.sayHello();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Number For Table : ");
        int num = scanner.nextInt();
        int re;
        for (int i = 1 ; i<11 ; i++){
            re = num*i;
            System.out.println(re);
        }

        
        System.out.println("Enter Your Marks");
        int mark = scanner.nextInt();
        if (mark>90){
            System.out.println("Grade A");
        }else if (mark<90 && mark >80 ){
            System.err.println("Grade B");
        }else{
            System.out.println("Fail");
        }
        System.out.println("Enter Number between 1-7");

        int day = scanner.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturaday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Number");}
        
    
        System.out.println("Enter First Number");
        double num1 = scanner.nextDouble();
        System.out.println("Enter Second Number");
        double num2 = scanner.nextDouble();
        System.out.println("Your Operation : ");
        char op = scanner.next().charAt(0);
        double result=0;

        switch (op) {
            case '+' -> result = num1+num2;
                
            case '-' -> result = num1- num2;
            case '*' -> result = num1*num2;
            case '/' -> result = num1/num2;
            default -> System.out.println("Invalid Operation");
            }
     System.out.println(result);

     
    }

}
class Helper {
    void sayHello() {
        System.out.println("Hello from Helper!");
    }
}