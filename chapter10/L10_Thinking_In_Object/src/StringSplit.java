public class StringSplit {
    public static void main(String[] args) {
        String[] tokens = "Java#HTML#Perl".split("#", 0);

        for (String s: tokens) {
            System.out.print(s + " ");
        }

        for (int i = 0; i < tokens.length; i++) {
            System.out.println("\n" + tokens[i]);
        }
    }
}
