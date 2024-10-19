public class SameLine {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String FirstWord, SecondWord;

        System.out.print("Please enter a word:");
        FirstWord = scan.nextLine();
        System.out.print("Please enter another word:");
        SecondWord = scan.nextLine();
        System.out.print("You have typed in: " + FirstWord + " " + SecondWord);
        scan.close();
    }
}