package circularArrayRotation;

import org.junit.Before;
import org.junit.Test;
import test.CircularArrayRotation;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class CircularArrayRotationTest {

    CircularArrayRotation circularArrayRotation;

    @Before
    public void setup(){
        this.circularArrayRotation = new CircularArrayRotation();
    }

    @Test
    public void test() throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputstr = classLoader.getResourceAsStream("circularArrayRotation/input.txt");
        Scanner s = new Scanner(inputstr);
        int[] a = null;
        int rotation;
        String[] line1 = s.nextLine().split(" ");
        a = new int[Integer.parseInt(line1[0])];
        rotation = Integer.parseInt(line1[1]);
        String[] nums = s.nextLine().split(" ");
        for (int it = 0; it < nums.length; it++) {
            a[it] = Integer.parseInt(nums[it]);
        }
        List<Integer> list = new ArrayList<>();
        while (s.hasNext()) {
            list.add(Integer.parseInt(s.nextLine()));
        }
        int[] q = new int[list.size()];
        for (int it = 0; it < list.size(); it++) {
            q[it] = list.get(it);
        }
        s.close();
        int[] ret = this.circularArrayRotation.circularArrayRotation(a, rotation, q);

        int[] test = new int[q.length];
        int i = 0;
        inputstr.close();
        inputstr = classLoader.getResourceAsStream("circularArrayRotation/test.txt");

        s = new Scanner(inputstr);
        while (s.hasNext()) {
            test[i] = Integer.parseInt(s.nextLine());
            i++;
        }

        for (int it = 0; it < test.length; it++) {
            assertEquals(ret[it] , test[it]);
        }
        inputstr.close();
    }
}
