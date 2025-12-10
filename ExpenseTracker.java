import java.util.*;    //Arrays (CO2)
import java.time.LocalDate;

class Expense { //CO4
    private String description;  //String (CO3)
    private double amount;
    private String category; //String (CO3)
    private LocalDate date;

    public Expense(String description, double amount, String category, LocalDate date) { //CO4
        this.description = description;   //String (CO3)
        this.amount = amount;
        this.category = category;  //String (CO3)
        this.date = date;
    }

    public String getDescription() { return description; }  //String (CO3) //CO4
    public double getAmount() { return amount; }                           //CO4
    public String getCategory() { return category; }   //String (CO3)      //CO4
    public LocalDate getDate() { return date; }                            //CO4

    @Override
    public String toString() {    //String (CO3)  //CO5 Polymorphism
        return String.format("Date: %s, Description: %s, Amount: %.2f, Category: %s", date, description, amount, category);
    }
}

public class ExpenseTracker {   //CO4 
    private static List<Expense> expenses = new ArrayList<>();     //Arrays (CO2)  //CO6
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) { //String (CO3)
        while (true) {   //LOOP (CO1)
            System.out.println("\nExpense Tracker Menu:");  //String (CO3)
            System.out.println("1. Add Expense");  //String (CO3)
            System.out.println("2. View All Expenses");  //String (CO3)
            System.out.println("3. View Total Expenses");  //String (CO3)
            System.out.println("4. View Expenses by Category");  //String (CO3)
            System.out.println("5. Exit");  //String (CO3)
            System.out.print("Choose an option: ");  //String (CO3)
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addExpense(); //CO4
                    break;
                case 2:
                    viewAllExpenses(); //CO4
                    break;
                case 3:
                    viewTotalExpenses(); //CO4
                    break;
                case 4:
                    viewExpensesByCategory(); //CO4
                    break;
                case 5:
                    System.out.println("Exiting...");  //String (CO3)
                    return;
                default:
                    System.out.println("Invalid option. Try again.");  //String (CO3)
            }
        }
    }

    private static void addExpense() { //CO4  //CO6
        System.out.print("Enter description: ");  //String (CO3)
        String description = scanner.nextLine();  //String (CO3)
        System.out.print("Enter amount: ");  //String (CO3)
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter category: ");  //String (CO3)
        String category = scanner.nextLine();  //String (CO3)
        System.out.print("Enter date (YYYY-MM-DD): ");  //String (CO3)
        String dateStr = scanner.nextLine();  //String (CO3)
        LocalDate date = LocalDate.parse(dateStr);  //String (CO3)

        expenses.add(new Expense(description, amount, category, date));//Arrays (CO2) //CO4 (Object creation)
        System.out.println("Expense added successfully!");  //String (CO3)
    }

    private static void viewAllExpenses() { //CO4
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");  //String (CO3)
            return;
        }
        System.out.println("All Expenses:");  //String (CO3)
        for (Expense e : expenses) { //LOOP CO1)  //Arrays(CO2)
            System.out.println(e);
        }
    }

    private static void viewTotalExpenses() { //CO4  //CO6
        double total = expenses.stream().mapToDouble(Expense::getAmount).sum();   //Arrays (CO2)
        System.out.printf("Total Expenses: %.2f\n", total);  //String (CO3)
    }

    private static void viewExpensesByCategory() { //CO4
        System.out.print("Enter category: ");  //String (CO3)
        String category = scanner.nextLine();  //String (CO3)
        List<Expense> filtered = new ArrayList<>(); //Arrays (CO2) //CO6
        for (Expense e : expenses) {   //LOOP (CO1)    //Arrays (CO2)
            if (e.getCategory().equalsIgnoreCase(category)) {   //String (CO3)
                filtered.add(e);       //Arrays (CO2)
            }
        }
        if (filtered.isEmpty()) {       //Arrays (CO2)
            System.out.println("No expenses found in this category.");  //String (CO3)
            return;
        }
        System.out.println("Expenses in category '" + category + "':");  //String (CO3)
        for (Expense e : filtered) { //LOOP(CO1)   //Arrays (CO2)
            System.out.println(e);
        }
    }
}