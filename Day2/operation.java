// import java.util.Scanner;

public class operation{
    public static void main(String [] args ){
        
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter Num1");
        
        // int num1 = scanner.nextInt();

        // System.out.println("Enter Num2");
        
        // int num2 = scanner.nextInt();

        // num1 = num2;
        
        // System.out.println("after" + num1 + "," + num2);

        // Boolean st1 = true;
        // Boolean st2 = true;
        // System.out.println(st1&&st2);

        // int a= 5;
        // int b=4;
        // int c=8;

        // if ((a==b) || (b==c)){
        //     System.out.println("True");
        // }else{
        //     System.out.println("False");
        // }

        // for (int i=1 ; i<6; i++){
        //     System.out.println("Abhay");
        // }
        // int i=0;
        // while(i<6){
        //     System.out.println("Abhayguptadev");
        //     i++;
        // }

        // STAR PATTERN
        for (int i =0 ; i<5 ; i++ ){
            System.out.println("*".repeat(i));
        }
        for (int j = 6 ; j > 0 ; j--){
            System.out.println("*".repeat(j));
        }
        // int k = 1;
        // int l = 5;
        // while (k<5){
        //     System.out.println(" ".repeat(l) + "* ".repeat(k));
        //     l-=1;
        //     k+=1;
        // }
        // for (int i = 5 ; i > 0 ;i-- ){
        //     for (int j = 1; j<5-i; j++){
        //         System.out.print(" ");
        //         for (int k = 1 ; k <=2*i-1; k++){
        //             System.out.print("*");
        //         }
        //         System.out.println(" ");
        //     }
        // }
        int n = 5;
        for (int k = 0; k<n ; k++){
            for(int l = 0; l<n-k; l++){
                System.out.print(" ");
        }
        for (int l = 0 ; l<(2*k)-1; l++){
            System.out.print("*");
        }
        System.out.println("");
    }
        for (int i = 1; i<n ; i++ ){
            for (int j = 0; j<i-1 ; j++){
                System.out.print(" ");
            }
        for (int j = 0 ; j<2*(n-i)-1 ; j++){
            System.out.print("*");
        }
        System.out.println("");
        }


    
    }
}