import java.util.*;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;


public class ExpenseFileRepository {
    private String fileName = "expenses.txt";

//    File file = new File(fileName);

    public void saveExpenses(List<Expense> expenses) throws IOException {
        // create FileWriter
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Expense expense : expenses) {
                String line = expense.getId() + "|" + expense.getDescription() + "|" + expense.getCategory() + "|" + expense.getAmount();
                writer.write(line);
                writer.write(System.lineSeparator());
            }
        }

    }

    public List<Expense> loadExpenses() throws IOException {

        File file = new File(fileName);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        List<Expense> expenses = new ArrayList<>();

//        FileReader reader = new FileReader(fileName);
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length != 4) {
                    System.out.println("Skipping invalid expense: " + line);
                    continue;
                }
                try {
                    int id = Integer.parseInt(parts[0]);
                    String description = parts[1];
                    String category = parts[2];
                    double amount = Double.parseDouble(parts[3]);

                    Expense expense = new Expense(id, description, category, amount);
                    expenses.add(expense);
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid expense: " + line);
                }
            }

        }
        return expenses;
    }
}
