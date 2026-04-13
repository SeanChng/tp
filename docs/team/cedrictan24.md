# Cedric Tan's Project Portfolio Page

## Project: MoneyBagProMax

MoneyBagProMax is a command-line personal finance management application that helps users track income and expenses, manage budgets, and gain insights into spending habits through financial statistics.

## Summary of Contributions

### New Feature: Budget Feature

What it does:  
Allows users to set a monthly budget and view budget status, including total expenses, remaining budget, and percentage used.

Justification:  
Helps users monitor spending and avoid exceeding their budget.

Highlights:  
Required filtering transactions by month and integrating budget calculations with transaction data.

### New Feature: Statistics Feature

What it does:  
Displays financial statistics such as total income/expenses, highest/lowest transactions, most frequent category, averages, spending trend, and budget usage.

Justification:  
Provides insights into spending behaviour.

Highlights:  
Used HashMap for aggregation, reduced duplication, and implemented a month-based spending trend.

### Enhancements implemented

- Budget Feature
  - Implemented budget set and budget status
  - Added tracking, persistence (`[BUDGET]`), and validation

- Statistics Feature
  - Implemented stats command and spending trend
  - Returned "Not enough data" when insufficient data

- Core Command Improvements
  - Improved delete handling for empty lists and invalid indices
  - Prevented runtime exceptions via better validation

### Code Contributed

[RepoSense link](https://nus-cs2113-ay2526-s2.github.io/tp-dashboard/?search=cedrictan24&breakdown=true&sort=groupTitle%20dsc&sortWithin=title&since=2026-02-20T00%3A00%3A00&timeframe=commit&mergegroup=&groupSelect=groupByRepos&checkedFileTypes=docs~functional-code~test-code~other&filteredFileName=)

### Contributions to the User Guide (UG)

- Documented list, delete, budget, and stats commands with examples

### Contributions to the Developer Guide (DG)

- Added implementation details for Budget and Statistics features
- Documented spending trend logic and design considerations
- Updated delete and list command documentation
- Created UML diagrams (sequence and class diagrams)

### Contributions to team-based tasks

- Integrated features into the main codebase and ensured consistent validation and error handling

### Review / mentoring contributions

- Reviewed teammates’ PRs for correctness and code quality

### Contributions beyond the project team

- Reported bugs during PE-D with clear reproduction steps and severity classification

### Tools Used

- Gradle, JUnit, Checkstyle, GitHub
