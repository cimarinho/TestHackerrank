package gradingStudents;

import org.junit.Before;
import org.junit.Test;
import test.GradingStudents;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class GradingStudentsTest {

    GradingStudents gradingStudents;

    @Before
    public void stup(){
        this.gradingStudents = new GradingStudents();
    }

    @Test
    public void teste() throws IOException {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputstr = classLoader.getResourceAsStream("gradingStudents/input.txt");
        Scanner s = new Scanner(inputstr);
        int number = Integer.parseInt(s.nextLine());
        String [] line1 = new String[number];
        int i = 0;
        while (s.hasNext()){
            line1[i++] = s.nextLine();
        }

        int[] a = new int[number];;

        for (i = 0  ; i <  number; i++){
            a[i] = Integer.parseInt(line1[i]);
        }

        int[] test = this.gradingStudents.gradingStudents(a);

        assertEquals(75,test[0]);
        assertEquals(67,test[1]);
        assertEquals(40,test[2]);
        assertEquals(33,test[3]);

    }


}
