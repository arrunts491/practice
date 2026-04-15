public class StudentGradeCalculator {
    public static void main(String[] args) {

        int s1 = 80;
        int s2 = 75;
        int s3 = 90;

        int total = s1 + s2 + s3;
        double average = total / 3.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Average = " + average);

        if (average >= 90)
            System.out.println("Grade: A");
        else if (average >= 75)
            System.out.println("Grade: B");
        else if (average >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Fail");
    }
}

