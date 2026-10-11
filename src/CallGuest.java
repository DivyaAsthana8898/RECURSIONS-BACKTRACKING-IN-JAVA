public class CallGuest {
    static int callGuest(int n){
        if(n <= 1){
            return 1;
        }
        int single = callGuest(n-1) ;
        // with pair ;
        int pair = (n-1) * callGuest(n-2);
        return single + pair;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(callGuest(n));
    }
}
