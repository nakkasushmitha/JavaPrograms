package Practiceprog;

public class Charactertype {
    public static void main(String args[]){
        char mychar = '@';

        if(Character.isLetter(mychar)){
            System.out.println("It is Alphabet");
        }
        else if (Character.isDigit(mychar)) {
            System.out.println("It is Digit");
        }
        else{
            System.out.println("It is Special Character");
        }
    }
}
