package integer;

public class IntegerTest3 {
    public static void main(String[] args) {
        Integer i1 = new Integer(4);
        Integer i2 = Integer.valueOf(4);
        Integer integer = Integer.valueOf("4");
        System.out.println(i2 == integer);


        int num = i1.intValue();
        System.out.println(num);

        Integer i = 4;
        int i3 = i;
        System.out.println(i);
        System.out.println(i3);
    }
}
