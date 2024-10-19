public class ReverseOrder {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String FirstWord, SecondWord;
        
        System.out.print("Please key in a word: ");
        FirstWord = scan.nextLine();
        
        System.out.print("Now please key in another: ");
        SecondWord = scan.nextLine();
        
        System.out.println(SecondWord + "\n" + FirstWord);

        scan.close();
    }
}
