import java.util.*;
import java.io.*;
/*
@author: @iMosher
@description: This is a helper class for my wordle game. It picks a random word from a text file dictionary.
 */
public class RandomWordPicker {
    String dict;


    public static String getWord(){
        String FILENAME = "C:\\Users\\Ian\\IdeaProjects\\Wordle\\src\\WordleDictionary.txt";
        String[] dict = readDictionary(FILENAME);
        return chooseRandomWord(dict);
        //System.out.println("random word is:" + randomWord);

    }
    //Read in dictionary from text file
    private static String[] readDictionary(String FILENAME){
        List<String> words = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(FILENAME))){
            String line;
            while((line = br.readLine()) != null) {
                words.add(line.trim());
            }
        } catch (IOException e) {
            System.out.println("Error Loading Dictionary");
            e.printStackTrace();
        }
        //convert to array
        return words.toArray(new String[0]);
    }

    private static String chooseRandomWord(String[] words){
        //only operate on a Dictionary that is not empty
        if (words != null && words.length > 0 ) {
            Random rand = new Random();
            int randId = rand.nextInt(words.length);
            return words[randId];
        }
        else{return "";}

    }

}



