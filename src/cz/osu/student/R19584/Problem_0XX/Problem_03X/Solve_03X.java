package cz.osu.student.R19584.Problem_0XX.Problem_03X;

import java.util.Date;

public class Solve_03X {

    public static void all() {
        for(long id = 30; id < 40; id++) problem(id);
    }

    public static void problem(long id) {
        long time, answer = -1, start_time = new Date().getTime();
        if (id == 30) answer = Problem_030.main();
        else if (id == 31) answer = Problem_031.main();
        else if (id == 32) answer = Problem_032.main();
        else if (id == 33) answer = Problem_033.main();
        else if (id == 34) answer = Problem_034.main();
        else if (id == 35) answer = Problem_035.main();
        else if (id == 36) answer = Problem_036.main();
        else if (id == 37) answer = Problem_037.main();
        else if (id == 38) answer = Problem_038.main();
        else if (id == 39) answer = Problem_039.main();
        time = new Date().getTime() - start_time;
        System.out.printf("[*] Problem %,3d:  %,15d\t[Time %s: %4dms]\n", id, answer, (time > 1000 ? ">>" : "OK"), time);
    }
}