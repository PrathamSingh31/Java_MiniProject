import java.sql.SQLOutput;

public class Methods {
////    static void greet(){
////        System.out.println("hello");
////    }
//   public static void main(String[] args){
////       greet();
////       addNumbers(5,10);
////       int result = add(5,4);
////       System.out.println(result);
////         int result= methodOverloading(8,5);
////
////         System.out.println(result);
////         System.out.println(methodOverloading(5,1,2));
//       System.out.println(fact(5));
//        }
//
//    static void addNumbers(int a, int b){
//        int sum = a + b;
//        System.out.println(sum);
//    }
//
//    static int add(int a, int b){  // return is used
//       return a+b;
//    }
//
//    static int methodOverloading(int a, int b){
//       return a * b ;
//    }
//
//    static int methodOverloading(int a, int b, int c){
//        return a * b * c ;
//    }
//
//
//static int fact(int n){
//       if (n==1){
//           return 1;
//       }
//       return n*fact(n-1);
//}



    static void modifyValue(int num) {
        num = num + 10;
        System.out.println("Inside method: " + num);
    }

    public static void main(String[] args) {
        int a = 5;
        modifyValue(a);
        System.out.println("Outside method: " + a);
    }




}
