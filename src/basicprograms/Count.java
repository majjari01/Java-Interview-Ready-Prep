package basicprograms;

import java.util.Scanner;

public class Count {
    int rep=0;
    public static void main(String[] args){
        try(Scanner in = new Scanner(System.in)){
        System.out.println("enter the number: ");
        Count call=new Count();
        long i=call.countRep(in.nextLong());
        System.out.println(i);}
    }
    private int countRep(long num){
        while(num>0){
        num = num/10;
            rep++;
        }
       return rep;
    }
}

/**
 Alright — let’s break this down in **three steps**:

 1. **Review your code & spot issues**
 2. **Enhance with best practices**
 3. **Explain why these changes matter (interview perspective)**

 ---

 ## **1. Review & Issues in Current Code**

 Your code works, but there are a few things to improve:

 * **`Scanner` not closed** → Potential resource leak.
 * **Magic logic in loop** → You’re using `num = num / 10` which works, but could be replaced with a cleaner API (e.g., `String.valueOf(num).length()` or `Math.log10` for learning purposes).
 * **`rep` is an instance variable** → This makes it **stateful** across multiple calls unnecessarily. Better to make it **method-local**.
 * **Method name** → `countRep` is not descriptive enough; something like `countDigits` is clearer.
 * **Input validation** → No handling for negative numbers or zero.
 * **Return type mismatch** → You return `int`, but `main` stores it in a `long` (conversion is unnecessary).
 * **Code readability** → Could benefit from comments and clearer variable names.

 ---

 ## **2. Enhanced Version**

 ```java
 import java.util.Scanner;

 public class Count {

 public static void main(String[] args) {
 try (Scanner scanner = new Scanner(System.in)) {
 System.out.print("Enter a number: ");
 long number = scanner.nextLong();
 int digitCount = countDigits(number);
 System.out.println("Number of digits: " + digitCount);
 }
 }

 /**
 * Counts the digits in the given number.
 * Handles zero and negative numbers as well.
 */
//private static int countDigits(long num) {
//    if (num == 0) return 1; // Special case for zero
//    num = Math.abs(num);    // Handle negative numbers
//    int count = 0;
//    while (num > 0) {
//        num /= 10;
//        count++;
//    }
//    return count;
//}
//}
//        ```
//
//        ---
//
//        ## **3. What’s Better Now?**
//
//        | **Improvement**                          | **Why It’s Better**                               |
//        | ---------------------------------------- | ------------------------------------------------- |
//        | **Closed Scanner in try-with-resources** | Prevents memory leaks.                            |
//        | **Method-local `count`**                 | Avoids unwanted state; method is now thread-safe. |
//        | **Static utility method**                | Makes it reusable without creating an object.     |
//        | **Descriptive naming** (`countDigits`)   | Improves code readability.                        |
//        | **Handles negative & zero cases**        | Makes method robust for all inputs.               |
//        | **No unnecessary type conversion**       | Keeps types consistent (`int` for digit count).   |
//        | **Added comments**                       | Easier for others (or future you) to understand.  |
//
//        ---
//
//        ## **Interview Pointers**
//
//        * **If asked to optimize** → Mention that for large numbers, `Math.log10(Math.abs(num)) + 1` can give digit count in O(1) instead of O(n).
//        * **If asked about OOP impact** → Explain why you made the method static (utility method, stateless).
//        * **If asked about input validation** → Show that you considered negative numbers and zero edge cases.
//        * **If asked about performance** → State that loop method is fine for reasonable inputs, but logarithm approach can be faster for huge numbers.
//
//        ---
// */