public class Test
{
   public static void main (String[] args)
   {
      System.out.println (An Emergency Broadcast");
   }
}
/*Introduce the following errors, one at a time.
Note any messages that the compiler produces. Fix the previous error each time.
If no error messages are produced, be prepared to explain why.*/

/*a. Change Test to test.
Error: Main method not found in class test,
please define the main method as: public static void main(String[] args)

b. Change Emergency to emergency:
There wont be any error as the string value is changed which is valid.

c. Remove the first quotation mark in the string.
error: ')' or ',' expected
Test.java:5: error: unclosed string literal
Add back the quotation mark.

d. Change main to man.
Error: Main method not found in class Test, please define the main method as:
   public static void main(String[] args)

e. Change println to bogus:
error: cannot find symbol
      System.out.bogus ("An Emergency Broadcast");

f. Remove the semicolon at the end of the println statement:
Error: ';' expected

g. Remove the last brace in the program:
Error: reached end of file while parsing
*/
