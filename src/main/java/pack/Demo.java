package pack;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        double totalCredit = 0, totalGrade = 0.0;
        ArrayList<MyClass> myClasses = initClasses();
        for (MyClass c : myClasses) {
            totalCredit += c.getCredit();
            totalGrade += getGPA(c.getScore(), c.getCredit());
        }
        System.out.println("GPA IS " + totalGrade / totalCredit);
    }

    public static ArrayList<MyClass> initClasses() {
        ArrayList<MyClass> classes = new ArrayList<>();
        classes.add(new MyClass("a-", 1));
        classes.add(new MyClass("b+", 2));
        classes.add(new MyClass("b+", 1));
        classes.add(new MyClass(97.0, 2));
        classes.add(new MyClass(99.0, 3));
        classes.add(new MyClass("a", 2));
        classes.add(new MyClass(98.0, 5));
        classes.add(new MyClass(91.0, 4));
        classes.add(new MyClass(88.0, 1));
        classes.add(new MyClass("b-", 0.5));
        classes.add(new MyClass("a", 0.5));
        return classes;
    }

    public static double getGPA(Object score, double credit) {
        if (score.getClass() == String.class)
            return getGPA((String) score, credit);
        return getGPA((double) score, credit);
    }

    public static double getGPA(String score, double credit) {
        if (credit > 0) {
            String upperCase = score.trim().toUpperCase();
            switch (upperCase) {
                case "A":
                    return credit * 4.0;
                case "A-":
                    return credit * 3.7;
                case "B+":
                    return credit * 3.3;
                case "B":
                    return credit * 3.0;
                case "B-":
                    return credit * 2.7;
                case "C+":
                    return credit * 2.3;
                case "C":
                    return credit * 2.0;
                case "C-":
                    return credit * 1.7;
                case "D+":
                    return credit * 1.3;
                case "D":
                    return credit * 1.0;
                case "F":
                    return credit * 0.0;
            }
        }
        return -1.0;
    }

    public static double getGPA(double score, double credit) {
        if (credit > 0) {
            if (score > 100)
                return -1.0;
            if (score >= 90)
                return credit * 4.0;
            if (score >= 85)
                return credit * 3.7;
            if (score >= 81)
                return credit * 3.3;
            if (score >= 78)
                return credit * 3.0;
            if (score >= 75)
                return credit * 2.7;
            if (score >= 71)
                return credit * 2.3;
            if (score >= 68)
                return credit * 2.0;
            if (score >= 65)
                return credit * 1.7;
            if (score >= 61)
                return credit * 1.3;
            if (score >= 60)
                return credit * 1.0;
            if (score >= 0)
                return credit * 0.0;
            else {
                return -1.0;
            }
        } else
            return -1.0;
    }

}
