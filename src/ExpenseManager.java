import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class ExpenseManager {

    private List<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public int getExpenseCount() {
        return expenses.size();
    }

    public void listExpenses() {
        for (Expense expense : expenses) {
            System.out.println(expense.getId() + "." + " " + expense.getDescription() + " | " + expense.getCategory() + " | " + expense.getAmount());
        }
    }

    public double getTotalAmount(){
        double sum = 0;
        for (Expense expense : expenses){
            sum += expense.getAmount();
        }
        return sum;
    }

    public boolean deleteExpense(int id){
//        for(Expense expense : expenses){
//            if(expense.getId() == id){
//                expense.remo
//            }
//        }
        Iterator<Expense> iterator = expenses.iterator();
        while(iterator.hasNext()){

            Expense expense = iterator.next();

            if(expense.getId() == id){
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public boolean isCategoryPresent(String category){
        for(Expense expense : expenses){
            if(expense.getCategory().equalsIgnoreCase(category)){
                return true;
            }
        }
        return false;
    }


    public void listExpensesByCategory(String category){
        for(Expense expense : expenses){
            if(expense.getCategory().equalsIgnoreCase(category)){
                System.out.println(expense.getId() + "." + expense.getDescription() + " | " + expense.getCategory() + " | " + expense.getAmount());
            }
        }
    }

    public double getTotalAmountByCategory(String category){
        double total = 0;

        for(Expense expense : expenses){
            if(expense.getCategory().equalsIgnoreCase(category)){
                total+=expense.getAmount();
            }
        }
        return total;
    }
}
