public class enumMoreMethods {
    public enum apple{
        KASHMIRIA_APPLE, RED_APPLE, GREEN_APPLE
    };
    public static void main(String args[]){
        apple ap, ap2, ap3;
        for(apple a: apple.values()){
            System.out.println(a+" "+a.ordinal());
        }
        ap = apple.KASHMIRIA_APPLE;
        ap2 = apple.RED_APPLE;
        ap3 = apple.KASHMIRIA_APPLE;

        if(ap.compareTo(ap2)<0){
            System.out.println(ap +"Comes before a2 "+ap2);
        }
        if(ap.compareTo(ap2)>0){
            System.out.println(ap2+ "Comes before a1"+ ap);
        }
        if(ap.compareTo(ap3)==0){
            System.out.println("they are equal");
        }
        if(ap.equals(ap2)){
            System.out.println("equals ap ap2");
        }
        if(ap.equals(ap3)){
            System.out.println("equals ap ap3");
        }
        if (ap == ap3){
            System.out.println("equals ap == ap3");
        }

    }

}
