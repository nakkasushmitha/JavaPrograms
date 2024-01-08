package Practiceprog;

public class Alphabeticalorder {
    public static void main(String args[]){
        char char1 = 's';
        char char2 = 'p';

        System.out.println("The alphabetical order of characters is:");

        if(char1<char2){
            System.out.println(char1 + "," + char2);
        }
        else{
            System.out.println(char2 + "," + char1);
        }
    }
}
