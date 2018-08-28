package HomeWork5;

import java.util.Random;

public class Base {

    private static final int CONCAT_CYCLES = 100000;
    static Random random = new Random();
//    public static String randomStr = Integer.toString(random.nextInt());

    public static void main(String[] args) {
        testStringPerformance();
        testStringBuilderPerformance();
        testStringBufferPerformance();
    }

    private static void testStringPerformance() {

        long beginTime = System.currentTimeMillis();

        String tmp = "";
        for(int i=0;i<CONCAT_CYCLES;i++) {
            tmp = tmp.concat(Integer.toString(random.nextInt()));
        }
        long timePastMs = System.currentTimeMillis() - beginTime;

        System.out.println("String concatenation took " + timePastMs + "ms");
    }

    private static void testStringBuilderPerformance() {







        long beginTime = System.currentTimeMillis();

        StringBuilder b = new StringBuilder();
        String tmp = "Hello";
        for(int i=0; i<CONCAT_CYCLES; i++) {
            b.append(tmp).append(random);
        }
        long timePastMs = System.currentTimeMillis() - beginTime;

        System.out.println("StringBuilder concatenation took " + timePastMs + "ms");
    }

    private static void testStringBufferPerformance() {

        long beginTime = System.currentTimeMillis();

        StringBuffer f = new StringBuffer();
        String tmp = "Hello";
        for(int i=0; i<CONCAT_CYCLES; i++) {
            f.append(tmp).append(random);
        }
        long timePastMs = System.currentTimeMillis() - beginTime;

        System.out.println("StringBuffer concatenation took " + timePastMs + "ms");

    }

}


