# ☕ Java Practice Programs

A collection of basic Java programs with simple explanations. Great for beginners to practice core concepts.

---

## 1. Hello World

```java
class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

**Explanation:**
`System.out.println()` prints text to the console.

---

## 2. User Input and Output

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("You entered: " + input);
    }
}
```

**Explanation:**
`Scanner` reads input; `nextLine()` reads a full line.

---

## 3–7. Arithmetic Operations

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Add: " + (a + b));
        System.out.println("Subtract: " + (a - b));
        System.out.println("Multiply: " + (a * b));
        System.out.println("Divide: " + (a / b));
        System.out.println("Remainder: " + (a % b));
    }
}
```

---

## 8. Even or Odd

```java
int n = sc.nextInt();

if (n % 2 == 0)
    System.out.println("Even");
else
    System.out.println("Odd");
```

---

## 9. Largest of Two Numbers

```java
if (a > b)
    System.out.println(a + " is largest");
else
    System.out.println(b + " is largest");
```

---

## 10. Smallest of Three Numbers

```java
int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
int smallest = a;

if (b < smallest) smallest = b;
if (c < smallest) smallest = c;

System.out.println("Smallest: " + smallest);
```

---

## 11. Positive, Negative, or Zero

```java
if (n > 0) System.out.println("Positive");
else if (n < 0) System.out.println("Negative");
else System.out.println("Zero");
```

---

## 12. Celsius to Fahrenheit

```java
double c = sc.nextDouble();
double f = (c * 9/5) + 32;

System.out.println(f);
```

---

## 13. Kilometers to Meters

```java
double km = sc.nextDouble();
System.out.println(km * 1000);
```

---

## 14. Minutes to Hours and Minutes

```java
int minutes = sc.nextInt();
int hours = minutes / 60;
int rem = minutes % 60;

System.out.println(hours + " hours " + rem + " minutes");
```

---

## 15. Simple Interest

```java
double p = sc.nextDouble();
double r = sc.nextDouble();
double t = sc.nextDouble();

double si = (p * r * t) / 100;
System.out.println(si);
```

---

## 16. Area of Rectangle

```java
int l = sc.nextInt();
int w = sc.nextInt();

System.out.println(l * w);
```

---

## 17. Area of Circle

```java
double r = sc.nextDouble();
System.out.println(3.14 * r * r);
```

---

## 18. Print 1 to N

```java
int n = sc.nextInt();

for (int i = 1; i <= n; i++)
    System.out.println(i);
```

---

## 19–20. Even Numbers from 1 to N

```java
for (int i = 1; i <= n; i++) {
    if (i % 2 == 0)
        System.out.println(i);
}
```

---

## 21. Sum of First N Numbers

```java
int sum = 0;

for (int i = 1; i <= n; i++)
    sum += i;

System.out.println(sum);
```

---

## 22. Factorial

```java
int fact = 1;

for (int i = 1; i <= n; i++)
    fact *= i;

System.out.println(fact);
```

---

## 23. Reverse a Number

```java
int rev = 0;

while (n != 0) {
    int digit = n % 10;
    rev = rev * 10 + digit;
    n /= 10;
}

System.out.println(rev);
```

---

## 24. Count Digits

```java
int count = 0;

while (n != 0) {
    n /= 10;
    count++;
}

System.out.println(count);
```

---

## 25. Sum of Digits

```java
int sum = 0;

while (n != 0) {
    sum += n % 10;
    n /= 10;
}

System.out.println(sum);
```

---

## 26. Palindrome Number

```java
int original = n, rev = 0;

while (n != 0) {
    rev = rev * 10 + (n % 10);
    n /= 10;
}

if (original == rev)
    System.out.println("Palindrome");
else
    System.out.println("Not Palindrome");
```

---

## 27. Multiplication Table

```java
int n = sc.nextInt();

for (int i = 1; i <= 10; i++)
    System.out.println(n + " x " + i + " = " + (n * i));
```

---

## 28–29. Swap Numbers

### With Temp

```java
int temp = a;
a = b;
b = temp;
```

### Without Temp

```java
a = a + b;
b = a - b;
a = a - b;
```

---

## 30–31. Method Example

```java
class Main {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println(result);
    }
}
```

---

## 32. If-Else Demo

```java
if (n > 10)
    System.out.println("Greater than 10");
else
    System.out.println("Less or equal to 10");
```

---

## 33. Switch Statement

```java
int day = sc.nextInt();

switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Invalid");
}
```

---

## 34. ASCII Value

```java
char ch = sc.next().charAt(0);
int ascii = ch;

System.out.println(ascii);
```

---

## 35–36. Character Checks

```java
if (ch >= 'A' && ch <= 'Z')
    System.out.println("Uppercase");
else
    System.out.println("Lowercase");

char lower = (char)(ch + 32);
System.out.println(lower);
```

---

## 37–42. String Operations

```java
String s1 = "Hello";
String s2 = "World";

System.out.println(s1 + s2);

// length without method
int count = 0;
for (char c : s1.toCharArray()) count++;

// reverse
String rev = "";
for (int i = s1.length() - 1; i >= 0; i--)
    rev += s1.charAt(i);

// equals vs ==
System.out.println(s1.equals(s2));
System.out.println(s1 == s2);
```

---

## 43–44. Class and Object

```java
class Student {
    int id = 1;
    String name = "John";
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.id + " " + s.name);
    }
}
```

---

## 45. Type Casting

```java
double d = 10.5;
int i = (int) d;

System.out.println(i);
```

---

## 46. Scanner Data Types

```java
int a = sc.nextInt();
double b = sc.nextDouble();
String c = sc.next();
```

---

## 47. Pattern

```java
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++)
        System.out.print("* ");
    System.out.println();
}
```

---

## 48. Reverse Numbers

```java
for (int i = n; i >= 1; i--)
    System.out.println(i);
```

---

## 49. Square & Cube

```java
System.out.println(n * n);
System.out.println(n * n * n);
```

---

## 50. Simple Calculator

```java
int a = sc.nextInt();
int b = sc.nextInt();
char op = sc.next().charAt(0);

switch(op) {
    case '+': System.out.println(a + b); break;
    case '-': System.out.println(a - b); break;
    case '*': System.out.println(a * b); break;
    case '/': System.out.println(a / b); break;
    default: System.out.println("Invalid");
}
```

---

## 🚀 Notes

* Covers basics: input/output, loops, conditions, methods, OOP
* Good for beginners
