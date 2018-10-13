package sequenceEquation;

import org.junit.Before;
import org.junit.Test;
import test.SequenceEquation;

import java.io.InputStream;
import java.util.Scanner;

public class SequenceEquationTest {

    SequenceEquation sequenceEquation;

    @Before
    public void setup() {
        this.sequenceEquation = new SequenceEquation();
    }

    @Test
    public void test() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputstr = classLoader.getResourceAsStream("sequenceEquation/input.txt");
        Scanner scanner = new Scanner(inputstr);
        scanner.nextLine();
        String[] lista = scanner.nextLine().split(" ");

        int[] p = new int[lista.length];

        for (int i = 0; i < lista.length; i++) {
            p[i] = Integer.parseInt(lista[i]);
        }

        int[] result = this.sequenceEquation.permutationEquation(p);


        scanner.close();

    }

}
