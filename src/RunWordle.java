import java.util.Scanner;

public class RunWordle
{
    public static void main(String args[]) {
        String g1;
        String g2;
        String g3;
        String g4;
        String g5;
        String g6;

        Wordle answer = new Wordle();
        char[] ans = answer.getArr(answer);

//      for(int c=0; c < answer.length ; c++) {
//            System.out.println(ans[c]);
//       }
        Scanner s = new Scanner(System.in);
        System.out.print("guess: ");
        String guess = s.next();

        // not working properly
        while (answer.attempt < 7) {


            if ((guess.length() == 5) && (!(guess.contains(" ")))) {
                answer.attempt++;
                g1 = guess;
                System.out.println("g1 logged");
                guess = "";
            } else {
                System.out.println("Invalid entry. New Guess: ");
                guess = s.next();
            }

        }
    }
}
