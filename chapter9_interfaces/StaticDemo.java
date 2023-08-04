public class StaticDemo {

   // a static initialization block, executed once when the class is loaded
   static {
      System.out.println("Class StaticDemo loading...");
   }

   // a constant
   static final long ONE_DAY_IN_MILLIS = 24 * 60 * 60 * 1000;

   // a static field
   static int instanceCounter;

   // a second static initialization block
   // static members are processed in the order they appear in the class
   static {
      // we can now access the static fields initialized above
      System.out.println("ONE_DAY_IN_MILLIS=" + ONE_DAY_IN_MILLIS
      + " instanceCounter=" + instanceCounter);
   }

   // An instance initialization block.
   // Instance blocks are executed each time a class instance is created,
   // after the parent constructor, but before any own constructors.
   {
      StaticDemo.instanceCounter++; // or just instanceCounter++;
      System.out.println("instanceCounter=" + instanceCounter);
   }

   public static void main(String[] args) {
      System.out.println("Starting StaticDemo");
      new StaticDemo();
      new StaticDemo();
      new StaticDemo();

      // Class StaticDemo loading...
      // ONE_DAY_IN_MILLIS=86400000 instanceCounter=0
      // Starting StaticDemo
      // instanceCounter=1
      // instanceCounter=2
      // instanceCounter=3
   }
}