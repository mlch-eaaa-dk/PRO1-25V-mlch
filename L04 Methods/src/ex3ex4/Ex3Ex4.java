package ex3ex4;

public class Ex3Ex4 {
    public static void main(String[] args) {
        String institution = institution(0);
        System.out.println("Age is 0, institution is " + institution);

        institution = institution(2);
        System.out.println("Age is 2, institution is " + institution);

        institution = institution(3);
        System.out.println("Age is 3, institution is " + institution);

        institution = institution(6);
        System.out.println("Age is 6, institution is " + institution);

        institution = institution(17);
        System.out.println("Age is 17, institution is " + institution);

        System.out.println();
        //-------------------------------------------------

        String team = team(false, 7);
        System.out.println("Girl, age 7, team is " + team);

        team = team(false,87);
        System.out.println("Girl, age 8, team is " + team);

        team = team(true, 7);
        System.out.println("Boy, age 7, team is " + team);

        team = team(true, 8);
        System.out.println("Boy, age 8, team is " + team);
    }

    public static String institution(int age) {
        String institutionName;
        if (age == 0) {
            institutionName = "Home";
        } else if (age <= 2) {
            institutionName = "Nursery";
        } else if (age <= 5) {
            institutionName = "Kindergarten";
        } else if (age <= 16) {
            institutionName = "School";
        } else {
            institutionName = "Out of school";
        }
        return institutionName;
    }

    public static String team(boolean isGirl, int age) {
        String teamName;
        if (isGirl) { // girl
            if (age < 8) {
                teamName = "Tumbling girls";
            } else {
                teamName = "Springy girls";
            }
        } else { // boy
            if (age < 8) {
                teamName = "Young cubs";
            } else {
                teamName = "Cool boys";
            }
        }
        return teamName;
    }
}
