package cz.osu.student.R19584.Problem_0XX.Problem_07X;

import java.util.Date;

public class Solve_07X {

    public static void all() {
        for(long id = 70; id < 80; id++) problem(id);
    }

    public static void problem(long id) {
        long time, answer = -1, start_time = new Date().getTime();
        if (id == 70) answer = Problem_070.main();
        else if (id == 71) answer = Problem_071.main();
        else if (id == 72) answer = Problem_072.main();
        else if (id == 73) answer = Problem_073.main();
        else if (id == 74) answer = Problem_074.main();
        else if (id == 75) answer = Problem_075.main();
        else if (id == 76) answer = Problem_076.main();
        else if (id == 77) answer = Problem_077.main();
        else if (id == 78) answer = Problem_078.main();
        else if (id == 79) answer = Problem_079.main();
        time = new Date().getTime() - start_time;
        System.out.printf("[*] Problem %,3d:  %,15d\t[Time %s: %4dms]\n", id, answer, (time > 1000 ? ">>" : "OK"), time);
    }
}