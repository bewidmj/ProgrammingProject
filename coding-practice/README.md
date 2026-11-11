# Coding Practice Collection

These are curated exercises consolidated from the previous project folders. Each Java
file is linked below by functionality. This collection is separate from the original
programs in [`src/`](../src/README.md).

## Algorithms

- [BinarySearch.java](./java-practice-exercises/algorithms/BinarySearch.java) — Searches a sorted integer array for a target using binary search.
- [Fibonacci.java](./java-practice-exercises/algorithms/Fibonacci.java) — Generates Fibonacci numbers iteratively.
- [FibonacciRecursion.java](./java-practice-exercises/algorithms/FibonacciRecursion.java) — Generates Fibonacci numbers with recursion.
- [MaxDiff.java](./java-practice-exercises/algorithms/MaxDiff.java) — Brute-force maximum-difference exercise; the current loop overwrites the result rather than retaining the maximum, so its result is not reliably the maximum difference.
- [MaximumDifference.java](./java-practice-exercises/algorithms/MaximumDifference.java) — Prints array minimum/maximum and compares an overall range with a buy-before-sell style difference.
- [RecursiveSummationDemo.java](./java-practice-exercises/algorithms/RecursiveSummationDemo.java) — Recursively adds the integers from a given input down to the base case (which returns 5 for 1).

## Data structures

- [SinglyLinkedList.java](./java-practice-exercises/data_structures/SinglyLinkedList.java) — Demonstrates linked-list insertion, removal, traversal, and length counting; several operations assume a non-empty list.
- [Solution.java](./java-practice-exercises/data_structures/Solution.java) — Attempts to add two numbers stored in linked lists by converting them to integers; the current result-list construction has logic errors and can overflow for large values.

## Tree validation

- [TreeValidator.java](./java-practice-exercises/tree_validation/TreeValidator.java) — Checks parent-child pairs for one parent per child, at most two children per parent, and one root; it does not verify connectivity or cycles.
- [TreeValidatorSimple.java](./java-practice-exercises/tree_validation/TreeValidatorSimple.java) — A second implementation of the same parent-count and root checks, with the same cycle/connectivity limitation.
- [TreeValidatorAnother.java](./java-practice-exercises/tree_validation/TreeValidatorAnother.java) — Validates parent counts and child limits, then uses depth-first traversal to detect cycles and disconnected nodes.

## Strings

- [CountNonRepeatingChars.java](./java-practice-exercises/strings/CountNonRepeatingChars.java) — Counts characters that occur exactly once.
- [ValidPalindrome.java](./java-practice-exercises/strings/ValidPalindrome.java) — Checks whether a string is a palindrome.
- [CaseInsensitiveWordFrequencyCounter.java](./java-practice-exercises/strings/CaseInsensitiveWordFrequencyCounter.java) — Counts sample words after converting them to uppercase; currently stores the counts without printing or returning them.

## Collections and object models

- [Employee.java](./java-practice-exercises/collections/Employee.java) — Employee model with ID, name, salary, department, and value-based equality.
- [ComparableEmployee.java](./java-practice-exercises/collections/ComparableEmployee.java) — Employee model whose natural ordering compares IDs.
- [AddressEmployee.java](./java-practice-exercises/collections/AddressEmployee.java) — Employee model with an address list; its getter returns a shallow copy.
- [SortByMapValue.java](./java-practice-exercises/collections/SortByMapValue.java) — Sorts employee map entries by salary descending and employee name ascending.
- [Sorting.java](./java-practice-exercises/collections/Sorting.java) — Demonstrates sorting employees by salary; the current example list is empty.
- [EmployeeSalaryAndNameSortingDemo.java](./java-practice-exercises/collections/EmployeeSalaryAndNameSortingDemo.java) — Creates sample employees and sorts them by salary and then name.
- [EmployeeSalaryComparator.java](./java-practice-exercises/collections/EmployeeSalaryComparator.java) — Commented-out comparator example for sorting employees by salary descending.
- [StudentFilteringAndGroupingDemo.java](./java-practice-exercises/collections/StudentFilteringAndGroupingDemo.java) — Filters students by marks, sorts by name, and groups the remaining students by age.
- [CandyExchangeAndEmployeeSortingDemo.java](./java-practice-exercises/collections/CandyExchangeAndEmployeeSortingDemo.java) — Calculates a candy-wrapper exchange total and contains an employee sorting example; the employee set is empty.
- [MapValueSortingAndStringSlicingDemo.java](./java-practice-exercises/collections/MapValueSortingAndStringSlicingDemo.java) — Shows map-entry sorting and string slicing; its sample map is empty.

## Concurrency

- [ProducerConsumerProblem.java](./java-practice-exercises/concurrency/ProducerConsumerProblem.java) — Runs producers and consumers against a bounded blocking queue.
- [Item.java](./java-practice-exercises/concurrency/Item.java) — Creates numbered sample items for the producer-consumer queue.
- [ThreadsProgram.java](./java-practice-exercises/concurrency/ThreadsProgram.java) — Intended to print even and odd numbers from two threads; it currently does not compile because it catches an `InterruptedException` that is not thrown inside the `try` block.

## Java basics and design

- [LearnStatic.java](./java-practice-exercises/java_basics/LearnStatic.java) — Demonstrates static method behavior and method hiding in a class hierarchy.
- [HelloWorldDemo.java](./java-practice-exercises/java_basics/HelloWorldDemo.java) — Minimal program that prints “Hello World”.
- [VendingMachineDemo.java](./java-practice-exercises/vending_machine/VendingMachineDemo.java) — Sketches a vending machine that selects and removes a product when the supplied money is sufficient; its product list is never initialized, so it fails at runtime.

## Known gaps

- `ThreadsProgram.java` is currently uncompilable as noted above.
- `VendingMachineDemo.java` needs product inventory initialization and handling for a missing matching product.
- Several examples are intentionally small or incomplete practice exercises; descriptions above call out the main known limitations.
