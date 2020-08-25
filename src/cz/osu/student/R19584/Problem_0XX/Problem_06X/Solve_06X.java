package cz.osu.student.R19584.Problem_0XX.Problem_06X;

import SharedCodeBase.COLOR;

import java.util.Date;

public class Solve_06X {

    public static void all() {
        for(long id = 60; id < 70; id++) problem(id);
    }

    public static void problem(long id) {
        String color = COLOR.GREEN;
        long time, answer = -1, start_time = new Date().getTime();
        if (id == 60) answer = Problem_060.main();
        else if (id == 61) answer = Problem_061.main();
        else if (id == 62) answer = Problem_062.main();
        else if (id == 63) answer = Problem_063.main();
        else if (id == 64) answer = Problem_064.main();
        else if (id == 65) answer = Problem_065.main();
        else if (id == 66) answer = Problem_066.main();
        else if (id == 67) answer = Problem_067.main();
        else if (id == 68) answer = Problem_068.main();
        else if (id == 69) answer = Problem_069.main();
        time = new Date().getTime() - start_time;
        if(time > 999) color = COLOR.ORANGE;
        else if(time > 499) color = COLOR.YELLOW;
        System.out.printf("[*] Problem %,3d:  %,21d\t%s[Time %s: %4dms]%s\n", id, answer, color, (time > 1000 ? ">>" : "OK"), time, COLOR.RESET);
    }
}