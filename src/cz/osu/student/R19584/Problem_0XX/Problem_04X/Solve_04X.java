package cz.osu.student.R19584.Problem_0XX.Problem_04X;

import SharedCodeBase.COLOR;

import java.util.Date;

public class Solve_04X {

    public static void all() {
        for(long id = 40; id < 50; id++) problem(id);
    }

    public static void problem(long id) {
        String color = COLOR.GREEN;
        long time, answer = -1, start_time = new Date().getTime();
        if (id == 40) answer = Problem_040.main();
        else if (id == 41) answer = Problem_041.main();
        else if (id == 42) answer = Problem_042.main();
        else if (id == 43) answer = Problem_043.main();
        else if (id == 44) answer = Problem_044.main();
        else if (id == 45) answer = Problem_045.main();
        else if (id == 46) answer = Problem_046.main();
        else if (id == 47) answer = Problem_047.main();
        else if (id == 48) answer = Problem_048.main();
        else if (id == 49) answer = Problem_049.main();
        time = new Date().getTime() - start_time;
        if(time > 999) color = COLOR.ORANGE;
        else if(time > 499) color = COLOR.YELLOW;
        System.out.printf("[*] Problem %,3d:  %,21d\t%s[Time %s: %4dms]%s\n", id, answer, color, (time > 1000 ? ">>" : "OK"), time, COLOR.RESET);
    }
}