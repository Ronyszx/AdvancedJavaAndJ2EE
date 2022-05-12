public class main {
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
    }
}
