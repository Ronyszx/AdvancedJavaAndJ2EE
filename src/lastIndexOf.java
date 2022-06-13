public class lastIndexOf {
    public static void main(String args[]){

    String s1="this is index of examples"; //there are 2 's' characters in this sentence
        int index1=s1.lastIndexOf('s');//returns last index of 's' char value

    System.out.println(index1);
     int index = s1.lastIndexOf('s',2);

    System.out.println(index);// returns -1
    index = s1.lastIndexOf("of"); // substring search System.out.println(index); //returns 14 O

}}