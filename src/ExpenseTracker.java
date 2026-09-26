import java.util.Scanner;
public class ExpenseTracker {

    private Scanner scan;
    private ExpenseManager expenseManager;

    public ExpenseTracker(){
        scan = new Scanner(System.in);
        expenseManager = new ExpenseManager();
    }

    public void start(){

        boolean isRunning = true;

        while(isRunning){
            System.out.println("Welcome to Expense Tracker!");
            System.out.println("1. Add Expense");
            System.out.println("2. List Expense");
            System.out.println("3. Show total");
            System.out.println("4. Exit");

            System.out.println("Select any above options to proceed...");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter expense description: ");
                    String name = scan.nextLine();

                    System.out.println("Enter expense Category: ");
                    String type = scan.nextLine();

                    System.out.println("Enter expense Amount: ");
                    double amount = scan.nextDouble();
                    scan.nextLine();

                    Expense expense = new Expense(name, type, amount);

                    expenseManager.addExpense(expense);
                    System.out.println("Expense Added !!!");
                    break;

                case 2:
                    expenseManager.listExpenses();
                    break;

                case 3:
                    System.out.println("Total: " + "$" + expenseManager.getTotalAmount());
                    break;

                case 4:
                    isRunning = false;
                    System.out.println("Thank You!!!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        }

    }


}
