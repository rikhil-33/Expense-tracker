# Expense Tracker 💸

> A command-line Java application to track, categorise, and analyse personal expenses.

---

## What it does

Managing personal finances is something most students ignore until it's too late. This CLI app makes it simple — add expenses, view them by category, and see your total spending at a glance.

---

## Features

- ➕ **Add expenses** — description, amount, category, and date
- 📋 **View all expenses** — full list with details
- 🏷️ **Filter by category** — see spending in specific areas (food, transport, etc.)
- 💰 **Total calculator** — instant sum of all recorded expenses

---

## Tech Stack

- **Language:** Java
- **Concepts used:** OOP (Classes, Encapsulation), Collections (ArrayList), Java Streams, LocalDate API, Scanner for CLI input

---

## How to Run

```bash
# Compile
javac ExpenseTracker.java

# Run
java ExpenseTracker
```

---

## Example Usage

```
Expense Tracker Menu:
1. Add Expense
2. View All Expenses
3. View Total Expenses
4. View Expenses by Category
5. Exit

Choose an option: 1
Enter description: Lunch
Enter amount: 120
Enter category: Food
Enter date (YYYY-MM-DD): 2026-05-30
Expense added successfully!
```

---

## What I learned

- Structuring a real Java project with multiple classes
- Using `ArrayList` and Java Streams for data manipulation
- Applying OOP principles: encapsulation, polymorphism (`toString()` override)
- Building a usable CLI experience

---

*Built by [Rikhil Siripurapu](https://github.com/rikhil-33) — KL University, CSE AI/ML*
