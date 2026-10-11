public class countPaths {
    static  int solve(int i,int j,int n ,int m) {
        if (i == n || j == m) {
            return 0;
        }
        if ( i == n - 1 && j == m - 1 ){
            return 1;
        }
        int downPath = solve(i+1,j,n,m);
        int rightPath = solve(i,j+1,n,m);
        int result  =  downPath+ rightPath;
        return  result;
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int total = solve(0,0,n,m);
        System.out.println(total);

    }
}
