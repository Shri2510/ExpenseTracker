import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Welcome to Expense Tracker!");
//        ExpenseManager expenseManager = new ExpenseManager();
//        Scanner scan = new Scanner(System.in);

        ExpenseTracker tracker = new ExpenseTracker();
        tracker.start();
//
//        boolean isRunning = true;
//
//        while(isRunning){
//            System.out.println("Welcome to Expense Tracker!");
//            System.out.println("1. Add Expense");
//            System.out.println("2. List Expense");
//            System.out.println("3. Show total");
//            System.out.println("4. Exit");
//
//            System.out.println("Select any above options to proceed...");
//            int choice = scan.nextInt();
//            scan.nextLine();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("Enter expense description: ");
//                    String name = scan.nextLine();
//
//                    System.out.println("Enter expense Category: ");
//                    String type = scan.nextLine();
//
//                    System.out.println("Enter expense Amount: ");
//                    double amount = scan.nextDouble();
//                    scan.nextLine();
//
//                    Expense expense = new Expense(name, type, amount);
//
//                    expenseManager.addExpense(expense);
//                    System.out.println("Expense Added !!!");
//                    break;
//
//                case 2:
//                    expenseManager.listExpenses();
//                    break;
//
//                case 3:
//                    System.out.println("Total: " + "$" + expenseManager.getTotalAmount());
//                    break;
//
//                case 4:
//                    isRunning = false;
//                    System.out.println("Thank You!!!");
//                    break;
//
//                default:
//                    System.out.println("Invalid option. Please try again.");
//            }
//
//        }
//        scan.close();



//        System.out.println("Enter expense description: ");
//        String name = scan.nextLine();
//
//        System.out.println("Enter expense Category: ");
//        String type = scan.nextLine();
//
//        System.out.println("Enter expense Amount: ");
//        double amount = scan.nextDouble();
//
//        System.out.println(name + "|" + type + "|" + amount);


//        Expense expense1 = new Expense(name, type, amount);
//        Expense expense2 = new Expense("Bus", "Transport", 40.0);
//        Expense expense3 = new Expense("Movie", "Entertainment", 500);




//        expenseManager.addExpense(expense1);
//        System.out.println("Expense Added !!!");
//        expenseManager.addExpense(expense2);
//        expenseManager.addExpense(expense3);

//        System.out.println(expense1);
//        System.out.println(expense2);

//        expense.description = "Lunch";
//        expense.category = "Food";
//        expense.amount = 250;
//
//        System.out.println(expense1.getDescription());
//        System.out.println(expense1.getCategory());
//        System.out.println(expense1.getAmount());
//
//        expense.description = "Bus";
//        expense.category = "Transport";
//        expense.amount = 40.0;
//
//        System.out.println(expense2.getDescription());
//        System.out.println(expense2.getCategory());
//        System.out.println(expense2.getAmount());
//
//        System.out.println(expense3.getDescription());
//        System.out.println(expense3.getCategory());
//        System.out.println(expense3.getAmount());

//        System.out.println(expenseManager.getExpenseCount());
//        expenseManager.listExpenses();
//        System.out.println("Total: " + "$" + expenseManager.getTotalAmount());
//        scan.close();


    }
}
