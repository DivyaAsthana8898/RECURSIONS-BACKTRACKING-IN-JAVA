import java.util.ArrayList;

public class SubsetsUsingRecursions {
    static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.println(subset.get(i) + "");
        }
        System.out.println();
    }

    static void solve(int n, ArrayList<Integer> subsets) {
        if (n == 0) {
            printSubset(subsets);
            return ;
        }
        // ADDED
        subsets.add(n);
        solve(n - 1, subsets);

        //not added; Backtracked;
        subsets.remove(subsets.size() - 1);
        solve(n - 1, subsets);
    }


    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subsets = new ArrayList<>();
        solve(n,subsets);

    }
}
