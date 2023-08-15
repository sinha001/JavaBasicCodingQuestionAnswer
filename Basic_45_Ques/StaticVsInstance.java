/*
 * 1. Demo Class..
 * 2. Demo Method - two variables, one variable where we initialize value using another method calling...
 * 3. We use class obj as a reference to see the real difference of static and instance and 
 *    Calculate avg by calling another method which is declared in the same class. 
 * 4. maximum(a,b)-1st method, calcAvg(a,b)-2nd method
 */

public class StaticVsInstance {
    static int alpha = 1;

    public void demoTest() {
        int x = 78;
        int y = 89;
        int z = StaticVsInstance.maximum(x, y);

        System.out.println("The larger one is : " + z);
        StaticVsInstance s1 = new StaticVsInstance();

        double res = s1.calcAvg(x, y);

        System.out.println("The Avg is :" + res);
        System.out.println("Static member has value : " + StaticVsInstance.alpha);
    }

    public static int maximum(int a, int b) {
        if (a > b)
            return a;
        return b;
    }

    public double calcAvg(int a, int b) {
        double b1 = (a + b) / 2.0;
        return b1;
    }

    public static void main(String args[]) {
        StaticVsInstance s1 = new StaticVsInstance();
        s1.demoTest();
    }
}