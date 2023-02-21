class Example {
   public static void main(String args[]) {
      try {

         int num1 = 30, num2 = 0;
         int output = num1 / num2;
         System.out.println("Result: " + output);
         int a[] = new int[10];
         // Array has only 10 elements
         a[11] = 9;
         int num = Integer.parseInt("XYZ");
         System.out.println(num);
      } catch (ArithmeticException e) {
         System.out.println("You Shouldn't divide a number by zero");
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("ArrayIndexOutOfBounds");
      } catch (NumberFormatException e) {
         System.out.println("Number format exception occurred");
      }
   }
}
