import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordScramble {
    /**
     * @param solution current word
     * @param remaining remaining letters
     */

    public static void permutation(StringBuilder solution, StringBuilder remaining){
        // TO DO
        if(remaining.length()==0){
            System.out.println(solution.toString());
        }
        else{
            for(int i = 0; i < remaining.length(); i++){
                //choose
                char ch = remaining.charAt(i);
                solution.append(ch);
                remaining.deleteCharAt(i);

                //explore
                permutation(solution, remaining);
                //unchoose
                solution.deleteCharAt(solution.length()-1);
                remaining.insert(i, ch);

            }

        }

    }

    public static void main(String [] args){

        StringBuilder word = new StringBuilder("DOG");

        StringBuilder empty = new StringBuilder("");

        permutation(empty, word);

    }

}

