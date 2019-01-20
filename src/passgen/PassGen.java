package passgen;
import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader;

public class PassGen {

    public static void main(String[] args)throws IOException {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));         
PapollGenerator passgen = new PapollGenerator();
        int size = Integer.parseInt(reader.readLine());
            System.out.println(passgen.generatePswd(size));
    }
}

