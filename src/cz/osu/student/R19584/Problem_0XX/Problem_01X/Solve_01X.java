package cz.osu.student.R19584.Problem_0XX.Problem_01X;

import SharedCodeBase.COLOR;

import java.util.Date;

public class Solve_01X {

    public static void all() {
        for(long id = 10; id < 20; id++) problem(id);
    }

    public static void problem(long id) {
        String color = COLOR.GREEN;
        long time, answer = -1, start_time = new Date().getTime();
             if (id == 10) answer = Problem_010.main();
        else if (id == 11) answer = Problem_011.main();
        else if (id == 12) answer = Problem_012.main();
        else if (id == 13) answer = Problem_013.main();
        else if (id == 14) answer = Problem_014.main();
        else if (id == 15) answer = Problem_015.main();
        else if (id == 16) answer = Problem_016.main();
        else if (id == 17) answer = Problem_017.main();
        else if (id == 18) answer = Problem_018.main();
        else if (id == 19) answer = Problem_019.main();
        time = new Date().getTime() - start_time;
        if(time > 999) color = COLOR.ORANGE;
        else if(time > 499) color = COLOR.YELLOW;
        System.out.printf("[*] Problem %,3d:  %,21d\t%s[Time %s: %4dms]%s\n", id, answer, color, (time > 1000 ? ">>" : "OK"), time, COLOR.RESET);
    }
}
