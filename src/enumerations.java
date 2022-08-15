/*
Outside the class
 */
    enum Seasons{
    SUMMER(4), RAINY(6), WINTER(8), SPRING(3);


    private int i;
    Seasons(int i) {
        this.i = i;
    }
}
public class enumerations {
    /*So i will basically be printing out enums with the following methods values(), valueOf(), ordinalOf()*/

    /* An enum is a data type in java which contains fixed set of constants
    They are considered as  classes which have fixed set of constants
    They are static and final implicitly
    They are used to define our own datatype like classes, we can either define them inside or outside the class
    Enums inherit the enum call internally
     */

    /*
    Points to remember:
    Enums inprover type safety
    Enums are easily used in switch statements
    They can be transversed
    They can have fiels, constructor and methods
    They can implement many interfaces but cannot extend other class as they already inherit the enum class
     */

    /*
    enum is a keyword used to define named constants
    Enum is a class present in java.lang package, every enum is a child class to this Enum class
    Enumerations is a interface present in java.util package
     */


    public enum Season {
        SUMMER, WINTER, RAINY, SPRING;
    }

    /*
    values() returns the array of values of the enums
    valueof() return the value of given constant of the enum
    ordinal() return the index value of given constant
     */
    public static void main(String args[]){
        for(Seasons s: Seasons.values()){
            System.out.println(s);
            System.out.println(Seasons.valueOf("WINTER"));
            System.out.println(Seasons.valueOf("WINTER").ordinal());
        }
        System.out.println(Seasons.WINTER.ordinal());

    }
}
