public class autoboxNunbox {
    /*
    The automatic conversion or primitive data type into its equivalent wrapper type is auto-boxing
     */

    public static void main(String[] args) {
        int a = 50;
        Integer i = new Integer(a);
        Integer j = new Integer(10);
        System.out.println(i + " " + j);


    /*
        The opposite function is autounboxing
     */

        for(int k =0; k< j; k++  ){
            System.out.println(j);
        }

    }
}
