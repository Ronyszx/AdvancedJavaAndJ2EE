public class enumerations {
    /*So i will basically be printing out enums with the following methods values(), valueOf(), ordinal()*/
    public enum week{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
    public static void main(String[] args){
        for(week w: week.values()){
            System.out.println(w);
        }
        System.out.println("The value of week day:"+ week.valueOf("SUNDAY"));
        System.out.println(("The value of week day:"+ week.valueOf("SUNDAY").ordinal()));
    }
}
