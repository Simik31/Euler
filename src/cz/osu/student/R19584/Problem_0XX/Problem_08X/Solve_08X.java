package cz.osu.student.R19584.Problem_0XX.Problem_08X;

import java.util.Date;

public class Solve_08X {

    public static void all() {
        for(long id = 80; id < 90; id++) problem(id);
    }

    public static void problem(long id) {
        long time, answer = -1, start_time = new Date().getTime();
        if (id == 80) answer = Problem_080.main();
        else if (id == 81) answer = Problem_081.main();
        else if (id == 82) answer = Problem_082.main();
        else if (id == 83) answer = Problem_083.main();
        else if (id == 84) answer = Problem_084.main();
        else if (id == 85) answer = Problem_085.main();
        else if (id == 86) answer = Problem_086.main();
        else if (id == 87) answer = Problem_087.main();
        else if (id == 88) answer = Problem_088.main();
        else if (id == 89) answer = Problem_089.main();
        time = new Date().getTime() - start_time;
        System.out.printf("[*] Problem %,3d:  %,15d\t[Time %s: %4dms]\n", id, answer, (time > 1000 ? ">>" : "OK"), time);
    }
}