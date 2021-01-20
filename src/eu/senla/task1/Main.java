package eu.senla.task1;

public class Main {

    public static void main(String[] args) {
        Number number = new Number();
        number.setA((byte) 17);
        System.out.println(number.getA());
        int i = 127;
        Float j = new Float(32);
        String p = j.toString();
        byte k = (byte) i;
        float l = (float) i;
        System.out.println(k);// int to byte
        System.out.println(l);// int to float
        System.out.println(p);// Float to String

        double x = 232.4;
        int z = (int) x;
        System.out.println(z);// double to int

        Boolean u = true;
        String y = u.toString();// Boolean to String
        System.out.println(y);

        number.setaByte((byte) 66);
        double r = (double) number.getaByte();// byte to double
        System.out.println(r);
        String q = String.valueOf(r);// double to String
        System.out.println(q);

        number.setD((long) 32767);
        short m = (short) number.getD();// long to short
        System.out.println(m);
    }
}
