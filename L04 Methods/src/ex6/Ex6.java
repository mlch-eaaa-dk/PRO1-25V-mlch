package ex6;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your choice of Scissor(0), Rock(1) or paper(2) ?");
        int userNo = scanner.nextInt();
        System.out.println("Your choice: " + numberToName(userNo));

        int computerNo = (int) (Math.random() * 3);
        System.out.println("Computer's choice: " + numberToName(computerNo));

        String result = result(userNo, computerNo);

        System.out.println("*** " + result + " ***");
    }

    // Pre: 0 <= no <= 2
    public static String numberToName(int no) {
        if (no == 0) return "Scissors";
        else if (no == 1) return "Rock";
        else return "Paper";
    }

    public static String result(int userNo, int computerNo) {
        String result;
        if (userNo == computerNo) {
            result = "It is a draw";
        } else if (userNo - computerNo == 1 || userNo - computerNo == -2) {
            result = "You won";
        } else {
            result = "Computer won";
        }
        return result;
    }
}

// main():
// prompt user for her choice (1, 2 or 3)
// read user choice
// print user's choice (Scissors, Rock or Paper)
// calculate computer choice (1, 2 or 3)
// print computer's choice (Scissors, Rock or Paper)
// calculate result from user choice and computer choice
// print result

// calcResult(computerNo, userNo):
// if userNo == computerNo
//    result is: draw
// else if userNo - computerNo == 1 or userNo - computerNo == -2
//    result is: user wins
// else
//    result is: computer wins
// return result
