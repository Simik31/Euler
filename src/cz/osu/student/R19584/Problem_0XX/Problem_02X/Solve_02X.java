package cz.osu.student.R19584.Problem_0XX.Problem_02X;

import SharedCodeBase.COLOR;

import java.util.Date;

public class Solve_02X {

    public static void all() {
        for(long id = 20; id < 30; id++) problem(id);
    }

    public static void problem(long id) {
        String color = COLOR.GREEN;
        long time, answer = -1, start_time = new Date().getTime();
        if (id == 20) answer = Problem_020.main();
        else if (id == 21) answer = Problem_021.main();
        else if (id == 22) answer = Problem_022.main();
        else if (id == 23) answer = Problem_023.main();
        else if (id == 24) answer = Problem_024.main();
        else if (id == 25) answer = Problem_025.main();
        else if (id == 26) answer = Problem_026.main();
        else if (id == 27) answer = Problem_027.main();
        else if (id == 28) answer = Problem_028.main();
        else if (id == 29) answer = Problem_029.main();
        time = new Date().getTime() - start_time;
        if(time > 999) color = COLOR.ORANGE;
        else if(time > 499) color = COLOR.YELLOW;
        System.out.printf("[*] Problem %,3d:  %,21d\t%s[Time %s: %4dms]%s\n", id, answer, color, (time > 1000 ? ">>" : "OK"), time, COLOR.RESET);
    }
}