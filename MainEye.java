import java.io.*;

import static java.lang.Math.*;

public class MainEye {
    public static final String FILE_OUTPUT_NAME = "output.txt";
    public static final double SUMMON_CHANCE = 420;
    public static final int DOUBLE_AFTER_THIS_MANY = 420;
    public static final int NUMBER_OF_PLAYERS = 10000;
    public static final int ZEALOTS_PER_PLAYER = 1000;

    public static void main(String[] args) throws IOException {
        File f = new File(FILE_OUTPUT_NAME);
        PrintWriter writer = new PrintWriter(new FileWriter(f));
        for (int i = 1; i <= NUMBER_OF_PLAYERS; i++) {
            writer.print(i + "\t" + summon(ZEALOTS_PER_PLAYER));
            writer.println();
            if (i % Math.max((NUMBER_OF_PLAYERS / 10), 1) == 0) {
                System.out.println("Finished player " + i);
            }
        }
        writer.close();
    }

    public static int summon(int zealotsEach) {
        int summoningEyes = 0;
        int numSinceLastSpecial = 0;
        double mSummon_Chance = SUMMON_CHANCE;
        for (int i = 0; i < zealotsEach; i++) {
            if (Math.ceil(random() * mSummon_Chance) == 5) { // this means we got a summoning eye
                summoningEyes++;
                numSinceLastSpecial = 0;
            }
            if (numSinceLastSpecial >= DOUBLE_AFTER_THIS_MANY) {
                mSummon_Chance = SUMMON_CHANCE / 2;
            } else {
                mSummon_Chance = SUMMON_CHANCE;
            }
            numSinceLastSpecial++;
        }
        return summoningEyes;
    }
}
