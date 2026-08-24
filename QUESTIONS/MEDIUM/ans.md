# ☕ Java Medium-Level Programs (51–100)

This README contains **medium-level Java programs with code and explanations** covering OOP, file handling, collections, and mini projects.

---

# 🧠 51. Student Class

```java
class Student {
    String name;
    int roll;
    int marks;

    void display() {
        System.out.println(name + " " + roll + " " + marks);
    }
}
```

**Explanation:** A simple class with properties and a method.

---

# 🏦 52. BankAccount

```java
class BankAccount {
    double balance;

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        balance -= amt;
    }
}
```

**Explanation:** Demonstrates basic methods.

---

# 🔁 53. Constructor Overloading

```java
class Demo {
    Demo() { System.out.println("Default"); }
    Demo(int a) { System.out.println("Value: " + a); }
}
```

**Explanation:** Multiple constructors with different parameters.

---

# 🔁 54. Method Overloading

```java
class Demo {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}
```

**Explanation:** Same method name, different parameters.

---

# 🔄 55. Method Overriding

```java
class A {
    void show() { System.out.println("A"); }
}
class B extends A {
    void show() { System.out.println("B"); }
}
```

**Explanation:** Child class overrides parent method.

---

# 🧩 56. Abstract Class

```java
abstract class Shape {
    abstract void draw();
}
class Circle extends Shape {
    void draw() { System.out.println("Circle"); }
}
```

**Explanation:** Abstract class forces implementation.

---

# 🔌 57. Interface

```java
interface Animal {
    void sound();
}
class Dog implements Animal {
    public void sound() { System.out.println("Bark"); }
}
```

**Explanation:** Interface defines behavior.

---

# 🧬 58–60. Inheritance

```java
class A {}
class B extends A {} // Single

class C extends B {} // Multilevel

class D extends A {} // Hierarchical
```

**Explanation:** Different inheritance types.

---

# 🔒 61. Encapsulation

```java
class Person {
    private int age;

    void setAge(int age) { this.age = age; }
    int getAge() { return age; }
}
```

**Explanation:** Data hiding using getters/setters.

---

# 🔑 62. this Keyword

```java
class Demo {
    int x;
    Demo(int x) { this.x = x; }
}
```

**Explanation:** Refers to current object.

---

# 🔑 63. super Keyword

```java
class A { A() { System.out.println("A"); } }
class B extends A {
    B() { super(); }
}
```

**Explanation:** Calls parent constructor.

---

# ⚡ 64. Static Keyword

```java
class Demo {
    static int count = 0;
}
```

**Explanation:** Shared variable across objects.

---

# 🔐 65. final Keyword

```java
final int x = 10;
```

**Explanation:** Value cannot be changed.

---

# ⚠️ 66. Try-Catch

```java
try {
    int a = 10/0;
} catch (Exception e) {
    System.out.println("Error");
}
```

**Explanation:** Handles runtime errors.

---

# ⚠️ 67. Multiple Exceptions

```java
try {
    int[] a = new int[2];
    a[5] = 10;
} catch (ArithmeticException e) {
} catch (ArrayIndexOutOfBoundsException e) {
}
```

---

# ⚠️ 68. Custom Exception

```java
class MyException extends Exception {}
```

---

# ⚠️ 69. Invalid Input Handling

```java
Scanner sc = new Scanner(System.in);
try {
    int x = sc.nextInt();
} catch (Exception e) {
    System.out.println("Invalid");
}
```

---

# 📂 70–72. File Handling

```java
import java.io.*;

FileWriter fw = new FileWriter("file.txt");
fw.write("Hello");
fw.close();
```

```java
BufferedReader br = new BufferedReader(new FileReader("file.txt"));
System.out.println(br.readLine());
```

```java
FileWriter fw = new FileWriter("file.txt", true); // append
```

---

# 📊 73–74. File Programs

```java
// Copy file
Files.copy(Paths.get("a.txt"), Paths.get("b.txt"));
```

```java
// Count lines
int count = 0;
while (br.readLine() != null) count++;
```

---

# 🔤 75–81. Strings

```java
// Word count
String s = "Hello world";
System.out.println(s.split(" ").length);
```

```java
// Remove spaces
s = s.replace(" ", "");
```

```java
// Replace word
s = s.replace("Hello", "Hi");
```

```java
// Without equals
System.out.println(s1.compareTo(s2) == 0);
```

```java
// Conversion
String str = String.valueOf(10);
int num = Integer.parseInt(str);
```

---

# 🔁 82. Menu Program

```java
switch(choice) {
    case 1: System.out.println("Option1"); break;
}
```

---

# 🧮 83. Calculator

```java
int add(int a, int b) { return a + b; }
```

---

# 📦 84–86. ArrayList

```java
ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.remove(0);

for (int i : list)
    System.out.println(i);
```

---

# 🗂️ 87–89. HashMap

```java
HashMap<Integer,String> map = new HashMap<>();
map.put(1,"A");

System.out.println(map.get(1));

for (int k : map.keySet())
    System.out.println(map.get(k));
```

---

# 🔢 90–91. Sorting

```java
Collections.sort(list);
```

```java
Collections.sort(strings);
```

---

# 👥 92. Objects in List

```java
ArrayList<Student> list = new ArrayList<>();
list.add(new Student());
```

---

# 🔐 93. Login System

```java
if (user.equals("admin") && pass.equals("123"))
    System.out.println("Login success");
```

---

# 📧 94. Email Validation

```java
System.out.println(email.contains("@"));
```

---

# 🔒 95. Password Strength

```java
if (pass.length() >= 8)
    System.out.println("Strong");
```

---

# 🏧 96. ATM

```java
balance += deposit;
balance -= withdraw;
```

---

# 🧾 97. Billing

```java
total += price * qty;
```

---

# 🎓 98. Grade Calculator

```java
if (marks >= 90) System.out.println("A");
```

---

# 💰 99. Simple Interest

```java
double si = (p*r*t)/100;
```

---

# 🧠 100. Quiz Program

```java
if (answer.equals("A"))
    score++;
```

---

# 🚀 Notes

* Covers **OOP + Collections + File Handling**
* Designed for **intermediate learners**
* Focus on **logic + real-world programs**
