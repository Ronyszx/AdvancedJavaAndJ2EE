public class enumerationsSwitchEx {
    public enum week{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    };
    public static void main(String[] args){
        week w = week.TUESDAY;
        switch (w){
            case MONDAY: System.out.println(week.MONDAY);
            break;
            case TUESDAY: System.out.println(week.TUESDAY);
            break;
            default: System.out.println("Wrong");
        }
    }
}
