import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    /*
    EACH BLOCK WIL HAVE :

        1. LIST OF PREVIOUS TRANSACTION
        2. HASH OF PREVIOUS BLOCK

        3. IT'S OWN HASH CALCULATED BASED ON (1.) AND (2.)

     */

    ArrayList<Block> blockchain = new ArrayList();
    public static void main(String[] args) {

    String[] genesisTransaction ={"div sent 10 btc to ivan", "ivan sent 10 btc to div"};
        Block genesisBlock = new Block(0, genesisTransaction);
        System.out.println("Hash of genesis block is: ");
        System.out.println(genesisBlock.getBlockHash());

    String[] transaction2 = {"div sent 20 btc to ivan", "ivan sent 30 btc to div"};
        Block block2 = new Block(genesisBlock.getBlockHash(), transaction2);
        System.out.println("Hash of block 2 is: ");
        System.out.println(block2.getBlockHash());

    }
}