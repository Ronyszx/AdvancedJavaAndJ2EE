public class autoboxNunbox {
    public static void main(String[] args) {
        int a = 50;
        Integer b = new Integer(a);
        System.out.println(a + "This is autoBoxing " + b);

        if (b < 100) {
            System.out.println(b);
        }

        Integer c = 20;
        int d = c;
        System.out.println(c + "This is unboxing" + c);
    }

}
