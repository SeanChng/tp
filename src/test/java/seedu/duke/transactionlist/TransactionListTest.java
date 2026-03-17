package seedu.duke.transactionlist;

import org.junit.jupiter.api.Test;
import seedu.duke.transaction.Expense;
import seedu.duke.transaction.Transaction;
import static org.junit.jupiter.api.Assertions.*;

public class TransactionListTest {

    @Test
    public void add_transaction_sizeIncreases() {
        TransactionList list = new TransactionList();
        Expense expense = new Expense("food", 5.0);
        list.add(expense);
        assertEquals(1, list.size());
    }

    @Test
    public void get_validIndex_returnsCorrectTransaction() {
        TransactionList list = new TransactionList();
        Expense expense = new Expense("food", 5.0);
        list.add(expense);
        Transaction result = list.get(0);
        assertEquals(expense, result);
    }

    @Test
    public void remove_validIndex_transactionRemoved() {
        TransactionList list = new TransactionList();
        Expense expense1 = new Expense("food", 5.0);
        Expense expense2 = new Expense("transport", 2.0);

        list.add(expense1);
        list.add(expense2);
        Transaction removed = list.remove(0);
        assertEquals(expense1, removed);
        assertEquals(1, list.size());
        assertEquals(expense2, list.get(0));
    }

    @Test
    public void isEmpty_newList_returnsTrue() {
        TransactionList list = new TransactionList();
        assertTrue(list.isEmpty());
    }

    @Test
    public void isEmpty_afterAdd_returnsFalse() {
        TransactionList list = new TransactionList();
        list.add(new Expense("food", 5.0));
        assertFalse(list.isEmpty());
    }

    @Test
    public void size_multipleAdds_returnsCorrectSize() {
        TransactionList list = new TransactionList();

        list.add(new Expense("food", 5.0));
        list.add(new Expense("transport", 2.0));
        list.add(new Expense("rent", 100.0));

        assertEquals(3, list.size());
    }

    @Test
    public void remove_lastTransaction_removedCorrectly() {
        TransactionList list = new TransactionList();

        Expense expense1 = new Expense("food", 5.0);
        Expense expense2 = new Expense("transport", 2.0);

        list.add(expense1);
        list.add(expense2);

        Transaction removed = list.remove(1);

        assertEquals(expense2, removed);
        assertEquals(1, list.size());
    }

    @Test
    public void remove_onlyTransaction_listBecomesEmpty() {
        TransactionList list = new TransactionList();

        list.add(new Expense("food", 5.0));

        list.remove(0);

        assertTrue(list.isEmpty());
    }

    @Test
    public void remove_negativeIndex_throwsAssertionError() {
        TransactionList list = new TransactionList();

        list.add(new Expense("food", 5.0));

        assertThrows(AssertionError.class, () -> list.remove(-1));
    }

    @Test
    public void remove_indexOutOfBounds_throwsAssertionError() {
        TransactionList list = new TransactionList();

        list.add(new Expense("food", 5.0));

        assertThrows(AssertionError.class, () -> list.remove(5));
    }
}
