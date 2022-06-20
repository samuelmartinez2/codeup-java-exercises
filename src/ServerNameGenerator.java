import org.w3c.dom.ls.LSOutput;
//import java.util.concurrent.ThreadLocalRandom
import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {


    static String[] adj = {"acidic", "adorable", "aggressive","alert", "brave", "cruel", "friendly", "nasty", "perfect", "lazy" };
    static String[] Noun = {"bed", "cat","movie","train","book","phone","pen","king","hero","water"};


public static String randomAdj(int num){
    return adj[num];
}

public static String randomNoun(int num){
    return Noun[num];
}



    public static void main(String[] args){
        Random randie = new Random();
//        System.out.println(randie.nextInt(adj.length));

        System.out.format("your new name will be %n "+randomAdj(randie.nextInt(adj.length))+" - " + randomNoun(randie.nextInt(Noun.length)) +"%n");
        System.out.printf("your new name will be %n %s - %s %n", randomAdj(randie.nextInt(adj.length)),randomNoun(randie.nextInt(Noun.length)));


//        System.out.println(randie.nextInt());


    }


   //**************** //end of Class********
}
