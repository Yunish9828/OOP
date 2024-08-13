import models.Aves;
import models.Mammalia;

public class main {
    public static void main(String[] args) {
        Mammalia cow = new Mammalia();
        cow.getHello();

        Mammalia dog = new Mammalia();
        dog.getBye();

        Aves pigeon = new Aves();
        pigeon.getHello();

        Aves sparrow = new Aves();
        sparrow.getBye();
    }
}


