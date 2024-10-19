public class D3Example2 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        java.util.Random random = new java.util.Random();
        int queuePos = random.nextInt(5001) + 5000;
        
        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("For 'Checking your balance', please enter 1");
            System.out.println("For 'Purchases', please enter 2");
            System.out.println("For 'Refunds', please enter 3");
            System.out.println("For 'Queries about the warranty', please enter 4");
            System.out.println("For 'Returning faulty goods', please enter 5");
            System.out.println("For any other query, please enter 0");
            System.out.println("To exit, please enter -1");

            int choice = scan.nextInt();
            
            if (choice == -1) {
                System.out.println("Exiting the system. Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: $0.00.\nT_T");
                    break;
                case 2:
                    System.out.println("Thank you for purchasing the NVIDIA Overkill 5900 Ti!");
                    break;
                case 3:
                    System.out.println("We are not offering refunds on our NVIDIA Overkill series at this time.\nI'm sorry for the inconvenience.");
                    break;
                case 4:
                    System.out.println("For help with anything that's not a FAQ, please go listen to some pre-recorded messages or read something written by an AI.");
                    break;
                case 5:
                    System.out.println("Yeah, nah, we're not giving you your money back...");
                    break;
                case 6:
                    System.out.println("He'll be back from his break in about 2 hours.\nYour position in the queue is: " + queuePos + "\nYour call is valuable to us.");
                    queuePos++;
                    break;
                default:
                    System.out.println("That is not a valid option, please try again");
                    break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        scan.close();
    }
}
