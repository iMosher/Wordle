import java.util.*;
//@author: @iMosher
//@desc: Creating a copy of the new york times game "wordle" because I want to play it more than once a day.
public class Wordle {
    private String ans;
    int length;
    int attempt = 0;
    private static char[] ansArr;

    //constructors - only need empty
    public Wordle() {
        this.ans = RandomWordPicker.getWord();
        this.length = ans.length();
        this.ansArr = ans.toCharArray();
    }

    public char[] getArr(Wordle w) {
        return Wordle.ansArr;

    }
}
//    public Wordle(int length){
//        this.ans = "";
//        this.length = ans.length();
//    }
