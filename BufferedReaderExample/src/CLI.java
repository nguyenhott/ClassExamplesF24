import java.io.BufferedReader;
import java.io.IOException;

public class CLI {

    public void processArgs(String[] args){
        if(args.length == 0){
            //print usage
            return;
        }

        if("-d".equals(args[0])){
            //do something
        }
        else if("-a".equals(args[0])){
            //do something
        }
        else if("-s".equals(args[0])){
            //do something
        }
        else{
            System.out.println("I dont know what to do");
            //print usage
        }

    }

    public void readDatabase(BufferedReader reader) throws IOException {
        String line;
        if(!reader.ready()){
            System.out.println("provide input");
            return;
        }
        for(line = reader.readLine(); line != null; line = reader.readLine())
        {
            if (line.length() == 0)
                continue;   // ignore blank lines
            else
                System.out.println(line);
        }
    }
}
