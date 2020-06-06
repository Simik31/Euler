package cz.osu.student.R19584;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        long start_time, problem_id, problems_coded = 718;

        System.out.print("[*] Which problem do you want to solve (0 = all): ");
        problem_id = new Scanner(System.in).nextInt();

        start_time = new Date().getTime();

        if(problem_id == 0) Solve.all();
        else if(problem_id <= problems_coded) Solve.problem(problem_id);
        else System.out.println("Invalid problem ID " + problem_id);

        System.out.printf("\n[*] DONE IN: %,4dms\n", new Date().getTime() - start_time);
    }
}
