# Cedric Tan's Project Portfolio Page

## Project: MoneyBagProMax

MoneyBagProMax is a command-line personal finance management application designed to help users track income and expenses, manage budgets, and gain insights into spending habits through financial statistics. The user interacts with it using a CLI, and the application is written in Java.

Given below are my contributions to the project.

---

## Summary of Contributions

### New Feature: Budget Feature
What it does:  
Allows the user to set a monthly budget and view the current budget status, including total expenses for the month, remaining budget, and percentage of budget used.

Justification:  
This feature improves the product significantly because users can monitor their monthly spending and avoid exceeding their budget.

Highlights:  
This feature required filtering transactions by month using transaction dates and integrating the budget calculation with the statistics feature. The implementation required changes to the TransactionList and StatsCommand to ensure budget usage is calculated correctly.

---

### New Feature: Statistics Feature
What it does:  
Displays financial statistics such as highest expense, lowest expense, highest income, most frequent category, average spending per category, spending trend, and budget usage.

Justification:  
This feature provides users with useful insights into their spending habits, allowing them to better manage their finances.

Highlights:  
The implementation required the use of data structures such as HashMap to calculate category frequency and averages. It also required refactoring existing code to avoid duplication when calculating highest and lowest transactions.

---

### Enhancements implemented

- Budget Feature
    - Implemented budget set and budget status
    - Added budget tracking (remaining amount, percentage used)
    - Implemented persistence using [BUDGET] format
    - Added validation for invalid inputs (zero, negative, excessively large values)

- Statistics Feature
    - Implemented stats command to provide financial insights (totals, highest/lowest transactions, category analysis)
    - Designed spending trend feature using month-based aggregation
    - Ensured correctness by returning "Not enough data" when insufficient data is present

- Core Command Improvements
    - Enhanced delete command to handle empty list and invalid indices
    - Improved error handling to prevent runtime exceptions

### Code Contributed
[Cedric's RepoSense](https://nus-cs2113-ay2526-s2.github.io/tp-dashboard/?search=cedrictan24&breakdown=true&sort=groupTitle%20dsc&sortWithin=title&since=2026-02-20T00%3A00%3A00&timeframe=commit&mergegroup=&groupSelect=groupByRepos&checkedFileTypes=docs~functional-code~test-code~other&filteredFileName=)

---

### Contributions to the User Guide
I contributed the following sections to the User Guide:
- List command
- Delete command
- Budget command
- Stats command

Each section includes the command format, examples, and explanations.

---

### Contributions to the Developer Guide (DG)

- Added implementation details for:
    - Budget feature (including persistence and validation)
    - Statistics feature (including spending trend logic)

- Documented design decisions such as:
    - month-based aggregation for spending trend computation
    - separation of concerns between StatsCommand and TransactionList

- Updated documentation for core commands:
    - delete command (index validation and empty list handling)
    - list command (interaction with `TransactionList`)

- Created and refined UML diagrams:
    - sequence diagrams for command execution flow
    - class diagrams for Budget and Statistics features

---

### Contributions to team-based tasks

- Integrated features into the main codebase
- Ensured consistency in validation and error handling

---

### Review / mentoring contributions

- Reviewed teammates’ PRs and provided feedback on code quality and correctness

---

### Contributions beyond the project team

- Reported bugs during PE-D with clear reproduction steps and severity classification
---

### Tools Used
- Gradle for build automation
- JUnit for unit testing
- Checkstyle for code quality
- GitHub for version control and pull request management
