import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {

    private List<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public int getExpenseCount() {
        return expenses.size();
    }

    public void listExpenses() {
        int counter = 1;
        for (Expense expense : expenses) {
            System.out.println(counter + "." + " " + expense.getDescription() + " | " + expense.getCategory() + " | " + expense.getAmount());
            counter++;
        }
    }

    public double getTotalAmount(){
        double sum = 0;
        for (Expense expense : expenses){
            sum += expense.getAmount();
        }
        return sum;
    }
}
