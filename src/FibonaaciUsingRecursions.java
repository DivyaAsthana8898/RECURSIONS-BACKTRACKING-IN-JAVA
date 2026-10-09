public class FibonaaciUsingRecursions {
   static void printFib(int a, int b,int n){
       // base case
       if(n == 0){
           return;
       }
       int c = a+b;
       System.out.println(c);
       // new call
       printFib(b,c,n-1);
   }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
         int n = 7;
         printFib(a,b,n-2);
    }
}
