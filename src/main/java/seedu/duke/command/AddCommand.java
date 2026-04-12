package seedu.duke.command;

import seedu.duke.budget.Budget;
import seedu.duke.transaction.Expense;
import seedu.duke.transaction.Income;
import seedu.duke.transaction.Transaction;
import seedu.duke.transactionlist.TransactionList;
import seedu.duke.ui.Ui;
import seedu.duke.undoredo.UndoRedoManager;
import seedu.duke.category.CategoryManager;


import java.time.LocalDate;

public class AddCommand extends Command {
    private static final double LARGE_AMOUNT_THRESHOLD = 1_000_000.0;
    private final String category;
    private final double amount;
    private final String description;
    private final LocalDate date;
    private final UndoRedoManager undoRedoManager;

    public AddCommand(String category, double amount, String description, LocalDate date,
                      UndoRedoManager undoRedoManager) {
        assert category != null && !category.isBlank() : "Category should not be null or blank";
        assert amount > 0 : "Amount should be positive";
        assert description != null : "Description should not be null";
        assert date != null : "Date should not be null";
        assert undoRedoManager != null : "UndoRedoManager should not be null";
        this.category = category;
        this.amount = amount;
        this.description = description;
        this.date = date;
        this.undoRedoManager = undoRedoManager;
    }

    @Override
    public void execute(TransactionList list, Budget budget, Ui ui) {
        Transaction transaction = null;
        if (Income.VALID_CATEGORIES.contains(category.toLowerCase())) {
            transaction = new Income(category.toLowerCase(), amount, description, date);
        } else if (CategoryManager.getInstance().isValidExpenseCategory(category)) {
            transaction = new Expense(category.toLowerCase(), amount, description, date);
        }

        if (transaction != null) {
            if (transaction instanceof Income && amount > LARGE_AMOUNT_THRESHOLD) {
                ui.showMessage(String.format(
                        "Warning: Are you sure you earned $%.2f? Transaction added.", amount));
            } else if (transaction instanceof Expense && amount > LARGE_AMOUNT_THRESHOLD) {
                ui.showMessage(String.format(
                        "Warning: Are you sure you spent $%.2f? Transaction added.", amount));
            }
            list.add(transaction);
            undoRedoManager.recordAdd(transaction, list.size() - 1);
            ui.showMessage("Added: " + transaction);
        } else {
            ui.showMessage("Invalid category '" + category + "'."
                    + " Valid expense categories: "
                    + CategoryManager.getInstance().getAllExpenseCategories()
                    + " Valid income categories: " + Income.VALID_CATEGORIES);
        }
    }

    /** @return boolean — always true, this command modifies the transaction list. */
    @Override
    public boolean isMutating() {
        return true;
    }

}
