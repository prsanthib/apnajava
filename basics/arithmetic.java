/*TYPES OF OPERATORS IN JAVA
ARITHEMATIC(UNARY/BINARY)
LOGICAL 
RELATIONAL
BINARY
ASSIGNMENT
BITWISE
BINARY OPERATORS MEANS OPERATORS THAT NEED 2 OPERANDS +,-,*,/,%
UNARY OPERATORE NEEDS ONLY SINGLE OPERAND ++,-- */
class arithmetic
{
public static void main(String args[])
{
int a = 10;
int b = 20;
int c = a--;
System.out.println(a+b+"HELLO WORLD");
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a/b);
System.out.println(b%a);
System.out.println(a--);
System.out.println(a++);
System.out.println(++a);
System.out.println(--a);
System.out.println(c); // first prints c = 10; and changes a as 9
}
}