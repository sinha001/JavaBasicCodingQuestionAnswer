/*
 * WAP to receives 4 strings as command line argmuents and then display then as per following pattern...
 * <arg0>
 * <arg0><arg1>
 * <arg0><arg1><arg2>
 * <arg0><arg1><arg2><arg3>
 */
public class StringPatternUsingCLA {

    public static void main(String[] args) {
        String pat1 = args[0];
        String pat2 = pat1 + args[1];
        String pat3 = pat2 + args[2];
        String pat4 = pat3 + args[3];

        System.out.println(pat1);
        System.out.println(pat2);
        System.out.println(pat3);
        System.out.println(pat4);
    }

}
