import java.util.Scanner;

public class function {

    static int add(int a , int b ){
        return a + b;
    }
    // justpay
    
    static int sub(int c,int d){
        if (c>d){
            return c-d;
        }
        else{
            return d-c;

        }
    }
    static double mul(double  a , double b){
        return a*b;
    }
    static String display(String name){
        return "Hello "+ name;}
    
    static void greet(String name){
        System.out.println("Wellcome," + name);}

    static int get_number(){
        return 100;
    }
    static int change(int x) {
        x=100;
        return x;        
    }
    
// public static void swap(Object a, Object b) {
//     Object temp = a;
//     a = b;
//     b = temp;}

    

    public static void main(String[] args) {
        // swap(5, 8);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter :  ");
        int num = scanner.nextInt();
        System.out.println(num);
        int re = add(num , 20);
        System.out.println(re);
        int res = sub(20,num);
        System.out.println(res);
        System.out.println(mul(5.6, 5.2));
        System.out.println(display("Abhay"));
        greet("abhay gupta");
        System.out.println(get_number());
        int a = 10;
        change(a);
        // System.out.println(a);
        // Object obj1 = new Object();
        // Object obj2 = new Object();
        // swap(obj1, obj2);

    }
    
}