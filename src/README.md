# Original Java Programs

This directory contains original practice and interview programs, organized by
functionality. It is separate from the curated exercises in
[`coding-practice/`](../coding-practice/README.md).

## Algorithms

- [LongestSequence.java](./algorithms/LongestSequence.java) — Finds the length of the longest run of consecutive integers in an array.
- [MatchTarget.java](./algorithms/MatchTarget.java) — Finds two indices whose array values add up to a target.
- [MaxDiff.java](./algorithms/MaxDiff.java) — Tries every ordered pair to calculate a difference; currently overwrites the result for each pair instead of retaining the maximum.
- [MaxDiff2.java](./algorithms/MaxDiff2.java) — Compares brute-force and optimized maximum-difference approaches, including the buy-before-sell (ordered) variant.
- [MaxSumSlidingWin.java](./algorithms/MaxSumSlidingWin.java) — Finds the largest sum among contiguous windows of a fixed size.
- [MoveZerosToFront.java](./algorithms/MoveZerosToFront.java) — Moves all zeros to the front of a result list and keeps nonzero values in their original order.
- [NextGreaterElement.java](./algorithms/NextGreaterElement.java) — Finds the first greater value to the right of each array element, or `-1`.
- [OddEven.java](./algorithms/OddEven.java) — Classifies an integer as odd or even.
- [TwoSum.java](./algorithms/TwoSum.java) — Returns indices of two values that sum to a target using a hash map.
- [TwoSum2.java](./algorithms/TwoSum2.java) — Alternate two-sum implementation that returns matching indices.
- [TwoSumPractice.java](./algorithms/TwoSumPractice.java) — Finds and prints index pairs whose values sum to a target.

## Strings

- [CountNonRepChars.java](./strings/CountNonRepChars.java) — Counts characters that occur exactly once.
- [FirstNonRepCh.java](./strings/FirstNonRepCh.java) — Finds the first non-repeating character with basic and optimized approaches.
- [FirstNonRepChar.java](./strings/FirstNonRepChar.java) — Uses insertion-ordered counts to find the first unique character; an unfinished `Long.` expression currently prevents compilation.
- [FirstNonRepeatingChar.java](./strings/FirstNonRepeatingChar.java) — Counts characters in insertion order and returns the first character with count one.
- [LongestSubPractice.java](./strings/LongestSubPractice.java) — Practices finding the longest substring without repeated characters and a first-unique-substring helper.
- [LongestSubPractice2.java](./strings/LongestSubPractice2.java) — Finds the length and content of a longest substring without repeating characters.
- [LongestSubStr.java](./strings/LongestSubStr.java) — Sliding-window exercise for the longest substring without repeated characters.
- [LongestSubstribngWithoutRep.java](./strings/LongestSubstribngWithoutRep.java) — Finds a longest substring without repeated characters.
- [LongestSubstring.java](./strings/LongestSubstring.java) — Returns the length of a longest non-repeating substring.
- [LongestUniqueSubstring.java](./strings/LongestUniqueSubstring.java) — Computes the length of the longest substring with unique characters.
- [PrintSubstrings.java](./strings/PrintSubstrings.java) — Prints substrings of a sample string.
- [PrintSubstrings2.java](./strings/PrintSubstrings2.java) — Brute-force alternate for generating substrings.
- [ValidParan.java](./strings/ValidParan.java) — Checks whether parentheses, braces, and brackets are balanced with a stack.
- [ValidParanthesis.java](./strings/ValidParanthesis.java) — Checks bracket nesting using a stack and a bracket-pair map.
- [ValidParanthesys.java](./strings/ValidParanthesys.java) — Validates balanced parentheses, braces, and brackets, including odd-length input rejection.

## Data structures

- [LinkedListProgram.java](./data_structures/LinkedListProgram.java) — Starts a linked-list node exercise; it references `node1` before declaration, so it currently does not compile.
- [LinkedListRevesrsePrac.java](./data_structures/LinkedListRevesrsePrac.java) — Linked-list reversal practice; a stray `6` prevents compilation, and the loop does not process the tail node.
- [Node.java](./data_structures/Node.java) — Basic singly linked-list node shared by the reversal examples.
- [ReverseLinkedList.java](./data_structures/ReverseLinkedList.java) — Reverses a singly linked list iteratively and prints both versions.

## Collections

- [Employee.java](./collections/Employee.java) — Employee data model with name, salary, and department.
- [EmpProg1.java](./collections/EmpProg1.java) — Creates sample employees, prints them, then increases their salaries by a percentage.
- [SortedMapExample.java](./collections/SortedMapExample.java) — Demonstrates ordering map entries by key and by value.

## Concurrency

- [DeadLock.java](./concurrency/DeadLock.java) — Demonstrates threads acquiring locks in conflicting orders.
- [EvenOdd.java](./concurrency/EvenOdd.java) — Uses two threads to print even and odd numbers.
- [OddEvenPrinterDemo.java](./concurrency/OddEvenPrinterDemo.java) — Uses synchronized methods and `wait`/`notify` to print odd and even numbers in sequence.
- [OddEvenThreads.java](./concurrency/OddEvenThreads.java) — Another shared-counter odd/even printer using synchronization.
- [ProducerConsumer.java](./concurrency/ProducerConsumer.java) — Producer and consumer coordinate using a synchronized one-item buffer.
- [ProducerConsumerMonitorDemo.java](./concurrency/ProducerConsumerMonitorDemo.java) — Starts continuous producer and consumer threads against a monitor-based buffer.
- [ThreadMonitorWaitDemo.java](./concurrency/ThreadMonitorWaitDemo.java) — Demonstrates `wait` calls on thread objects; the current code does not establish a useful notification protocol.
- [ThreadsPractice.java](./concurrency/ThreadsPractice.java) — Runs concurrent increments against an `AtomicInteger`.

## Finance and payments

- [ATM.java](./finance/ATM.java) — Applies deposits and attempts withdrawals using available banknote denominations.
- [CoinSystem.java](./finance/CoinSystem.java) — Calculates change from inserted coins using a greedy denomination strategy.
- [InterviewMaxProfit.java](./finance/InterviewMaxProfit.java) — Calculates maximum single-transaction stock profit and includes a separate list-removal example.
- [MaxProfit.java](./finance/MaxProfit.java) — Finds the largest profit from one buy followed by one sell in a price sequence.
- [SimpleInterestCalculator.java](./finance/SimpleInterestCalculator.java) — Implements simple and compound interest calculations; `main` calls a missing `calculateTotalAmount` method, so the file currently does not compile.

## Java basics

- [Factorial.java](./java_basics/Factorial.java) — Calculates factorial iteratively and recursively.
- [FactorialCalculator.java](./java_basics/FactorialCalculator.java) — Demonstrates iterative, recursive, and tail-recursive factorial methods with input validation.
- [factRecursive.java](./java_basics/factRecursive.java) — Small recursive factorial example.

## Design patterns

- [Singleton.java](./design_patterns/Singleton.java) — Demonstrates singleton instance access and clone handling.

## Functional programming

- [FunctionalInterfaceType.java](./functional/FunctionalInterfaceType.java) — Functional interface used by the interview notes.
- [FunctionalProgrammingInterviewNotes.java](./functional/FunctionalProgrammingInterviewNotes.java) — Commented examples and notes on stream frequency counting, functional interfaces, strategy patterns, and builders; no example code is currently active.

## Database notes

- [TradeHashingNotes.java](./database/TradeHashingNotes.java) — Notes on `Trade` hash codes, map keys, and an employee SQL query; this is not a complete Java program.
