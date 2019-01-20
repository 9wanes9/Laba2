package passgen;
import java.util.Random;
public class PapollGenerator {
     static char[] generatePswd(int len){
        String Symbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random rnd = new Random();
        char[] password = new char[len];
        for (int i = 0; i < len; i++)
        {
            password[i] = Symbols.charAt(rnd.nextInt(Symbols.length()));
}
        return password;
}
}

