package cz.osu.student.R19584.Problem_0XX.Problem_00X;

import SharedCodeBase.COLOR;

import java.util.Date;

public class Solve_00X {

    public static void all() {
        for(long id = 1; id < 10; id++) problem(id);
    }

    public static void problem(long id) {
        String color = COLOR.GREEN;
        long time, answer = -1, start_time = new Date().getTime();
             if (id == 1) answer = Problem_001.main();
        else if (id == 2) answer = Problem_002.main();
        else if (id == 3) answer = Problem_003.main();
        else if (id == 4) answer = Problem_004.main();
        else if (id == 5) answer = Problem_005.main();
        else if (id == 6) answer = Problem_006.main();
        else if (id == 7) answer = Problem_007.main();
        else if (id == 8) answer = Problem_008.main();
        else if (id == 9) answer = Problem_009.main();
        time = new Date().getTime() - start_time;
        if(time > 999) color = COLOR.ORANGE;
        else if(time > 499) color = COLOR.YELLOW;
        System.out.printf("[*] Problem %,3d:  %,21d\t%s[Time %s: %4dms]%s\n", id, answer, color, (time > 1000 ? ">>" : "OK"), time, COLOR.RESET);
    }
}
