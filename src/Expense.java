public class Expense {
    private String description;
    private String category;
    private double amount;
    private int id;
    private static int nextId = 1;

    public Expense(String description, String category, double amount) {
        this.id = nextId;
        nextId++;
        this.description = description;
        this.category = category;
        this.amount = amount;
    }

    public Expense(int id, String description, String category, double amount) {
        this.id = id;
        this.description = description;
        this.category = category;
        this.amount = amount;

        if (id >= nextId) {
            nextId = id + 1;
        }
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }
}
