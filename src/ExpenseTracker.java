import java.util.Scanner;
import java.io.IOException;
import java.util.List;

public class ExpenseTracker {

    private Scanner scan;
    private ExpenseManager expenseManager;
    private ExpenseFileRepository repository;

    public ExpenseTracker() {
        scan = new Scanner(System.in);
        expenseManager = new ExpenseManager();
        repository = new ExpenseFileRepository();
    }

    public void start() {

        loadExpenses();

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Welcome to Expense Tracker!");
            System.out.println("1. Add Expense");
            System.out.println("2. List Expense");
            System.out.println("3. Delete Expense");
            System.out.println("4. Filter Expense");
            System.out.println("5. Show total by Expense Category");
            System.out.println("6. Show total");
            System.out.println("7. Save to File");
            System.out.println("8. Read from File");
            System.out.println("9. Exit");

            System.out.println("Select any above options to proceed...");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    String name = readText("Enter expense description: ");
//                   String name  = scan.nextLine();

                    String type = readText("Enter expense Category: ");
//                    String type = scan.nextLine();

//                    System.out.println("Enter expense Amount: ");
//                    double amount = scan.nextDouble();
//                    scan.nextLine();
                    double amount = readAmount();
                    Expense expense = new Expense(name, type, amount);

                    expenseManager.addExpense(expense);
                    System.out.println("Expense Added !!!");
                    break;

                case 2:
                    expenseManager.listExpenses();
//                    try {
//                        repository.loadExpenses();
//                    } catch (IOException e){
//                        System.out.println(e);
//                    }
                    break;

                case 3:
                    expenseManager.listExpenses();
                    System.out.println("Enter the Expense id you want deleted: ");
                    int id = scan.nextInt();
                    scan.nextLine();
                    boolean isdeleted = expenseManager.deleteExpense(id);
                    if (isdeleted) {
                        System.out.println("Expense Deleted Successfully");
                        expenseManager.listExpenses();
                    } else {
                        System.out.println("No valid entry found for the provided Expense Id..!!");
                    }
                    break;
                case 4:
                    System.out.println("Filter by which category: ");
                    String filterBy = scan.nextLine();
                    if (expenseManager.isCategoryPresent(filterBy)) {
                        expenseManager.listExpensesByCategory(filterBy);
                    } else {
                        System.out.println("No Expense Found For Category: " + filterBy);
                    }
                    break;

                case 5:
                    System.out.println("Show total by which category: ");
                    String showBy = scan.nextLine();
                    if (expenseManager.isCategoryPresent(showBy)) {
                        System.out.println(showBy + " Total: " + expenseManager.getTotalAmountByCategory(showBy));
                    } else {
                        System.out.println("No Expense Found For Category: " + showBy);
                    }
                    break;

                case 6:
                    System.out.println("Total: " + "$" + expenseManager.getTotalAmount());
                    break;

                case 7:
                    try {
                        repository.saveExpenses(expenseManager.getExpense());
                        System.out.println("Expenses saved successfully.");
                    } catch (IOException e) {
                        System.out.println("Could not save expenses.");
                    }
                    break;

                case 8:
                    try {
                        repository.loadExpenses();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    break;


                case 9:
                    isRunning = false;
                    System.out.println("Thank You!!!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        }

    }

    private double readAmount() {
        while (true) {
            System.out.println("Enter expense Amount: ");
            if (scan.hasNextDouble()) {
                double amount = scan.nextDouble();
                scan.nextLine();

                if (amount > 0) {
                    return amount;
                }
            } else {
                System.out.println("Enter Valid expense Amount...!");
                scan.nextLine();
            }
        }

    }

    private String readText(String message) {
        while (true) {
            System.out.println(message);
            String input = scan.nextLine();

            if (!input.trim().isEmpty()) {
                return input;
            }

            System.out.println("Input cannot be empty..!");

        }
    }

    private void loadExpenses() {
        try {
            List<Expense> expenses = repository.loadExpenses();
            expenseManager.setExpenses(expenses);
            System.out.println("Expenses loaded successfully.");
        } catch (IOException e) {
            System.out.println("Could not load expenses.");
        }
    }


}
