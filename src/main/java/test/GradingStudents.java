package test;

public class GradingStudents {

    public int[] gradingStudents(int[] grades) {
        int[] output = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 38) {
                output[i] = grades[i];
            } else {
                int number = grades[i];
                while (true) {
                    if (number % 5 == 0) {
                        boolean cal = number - grades[i] < 3;
                        if (cal) {
                            output[i] = number;
                        } else {
                            output[i] = grades[i];
                        }
                        break;
                    }
                    number++;
                }
            }
        }
        return output;
    }

}
