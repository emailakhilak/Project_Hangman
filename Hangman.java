import java.util.*;

class Hangman{
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc=new Scanner(System.in);
        String wordfirst="Hangman";
        String word=wordfirst.toLowerCase();
        char[] letters=word.toCharArray();
        System.out.println("Welcome to Hangman!\nYou have six guesses\nWord:");
        char[] display=new char[word.length()];
        Arrays.fill(display, '_');
        for(int i=0;i<display.length;i++){
            System.out.print(display[i]+" ");
        }
        System.out.println();

        for(int i=0;i<6;i++){
        char guess=sc.next().charAt(0);
        boolean flag=false;
        for(int j=0;j<letters.length;j++){
        if(guess==letters[j]){
        display[j]=guess;
        flag = true;
          }
        }
        if(flag) 
        System.out.println("Correct guess!\n");
        else 
        System.out.println("Wrong guess!\n");
        for (int k = 0; k < display.length; k++) {
        System.out.print(display[k] + " ");
        }
        System.out.println();
        }
    }
}
