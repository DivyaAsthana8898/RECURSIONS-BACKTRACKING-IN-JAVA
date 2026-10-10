public class FindingTheFirstAndTheLastOccurence {
    public static int first = -1;
    public static int last = -1;

    public static void solve(String str, int index,char element) {
        if (index == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current = str.charAt(index);
        if (current == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        solve(str, index+1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        solve(str,0,'a');
    }
}
