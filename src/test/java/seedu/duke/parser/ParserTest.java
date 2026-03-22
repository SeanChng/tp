package seedu.duke.parser;

import seedu.duke.MoneyBagProMaxException;
import seedu.duke.command.Command;
import seedu.duke.command.SortCommand;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

// structure of test names: methodToTest_input_expectedOutput
class ParserTest {

    @Test
    public void parse_sortByDate_returnsSortCommand() throws MoneyBagProMaxException {
        Parser parser = new Parser();
        Command command = parser.parse("sort by/date");
        assertInstanceOf(SortCommand.class, command);
    }

    @Test
    public void parse_sortByAmount_returnsSortCommand() throws MoneyBagProMaxException {
        Parser parser = new Parser();
        Command command = parser.parse("sort by/amount");
        assertInstanceOf(SortCommand.class, command);
    }

    @Test
    public void parse_sortByCategory_returnsSortCommand() throws MoneyBagProMaxException {
        Parser parser = new Parser();
        Command command = parser.parse("sort by/category");
        assertInstanceOf(SortCommand.class, command);
    }

    @Test
    public void parse_sortNoArguments_throwsException() {
        Parser parser = new Parser();
        assertThrows(MoneyBagProMaxException.class, () -> parser.parse("sort"));
    }

    @Test
    public void parse_sortInvalidCriteria_throwsException() {
        Parser parser = new Parser();
        assertThrows(MoneyBagProMaxException.class, () -> parser.parse("sort by/invalid"));
    }

    @Test
    public void parse_sortMissingByPrefix_throwsException() {
        Parser parser = new Parser();
        assertThrows(MoneyBagProMaxException.class, () -> parser.parse("sort date"));
    }
}
