package cz.osu.student.R19584.Problem_0XX.Problem_05X;

import java.util.Date;

public class Solve_05X {

    public static void all() {
        for(long id = 50; id < 60; id++) problem(id);
    }

    public static void problem(long id) {
        long time, answer = -1, start_time = new Date().getTime();
        if (id == 50) answer = Problem_050.main();
        else if (id == 51) answer = Problem_051.main();
        else if (id == 52) answer = Problem_052.main();
        else if (id == 53) answer = Problem_053.main();
        else if (id == 54) answer = Problem_054.main();
        else if (id == 55) answer = Problem_055.main();
        else if (id == 56) answer = Problem_056.main();
        else if (id == 57) answer = Problem_057.main();
        else if (id == 58) answer = Problem_058.main();
        else if (id == 59) answer = Problem_059.main();
        time = new Date().getTime() - start_time;
        System.out.printf("[*] Problem %,3d:  %,15d\t[Time %s: %4dms]\n", id, answer, (time > 1000 ? ">>" : "OK"), time);
    }
}