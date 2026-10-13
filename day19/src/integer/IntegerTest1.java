package integer;

public class IntegerTest1 {
    public static void main(String[] args) {
        Integer integer = new Integer(12);
        System.out.println(integer);

        Integer i1 = new Integer("123");
        System.out.println(i1);

        System.out.println("================");

        Integer i3 = Integer.valueOf(123);
        System.out.println(i3);

        Integer i4 = Integer.valueOf("123");
        System.out.println(i4);
    }
}
