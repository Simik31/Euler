package cz.osu.student.R19584.Problem_0XX.Problem_09X;

import SharedCodeBase.COLOR;

import java.util.Date;

public class Solve_09X {

    public static void all() {
        for(long id = 90; id < 100; id++) problem(id);
    }

    public static void problem(long id) {
        String color = COLOR.GREEN;
        long time, answer = -1, start_time = new Date().getTime();
        if (id == 90) answer = Problem_090.main();
        else if (id == 91) answer = Problem_091.main();
        else if (id == 92) answer = Problem_092.main();
        else if (id == 93) answer = Problem_093.main();
        else if (id == 94) answer = Problem_094.main();
        else if (id == 95) answer = Problem_095.main();
        else if (id == 96) answer = Problem_096.main();
        else if (id == 97) answer = Problem_097.main();
        else if (id == 98) answer = Problem_098.main();
        else if (id == 99) answer = Problem_099.main();
        time = new Date().getTime() - start_time;
        if(time > 999) color = COLOR.ORANGE;
        else if(time > 499) color = COLOR.YELLOW;
        System.out.printf("[*] Problem %,3d:  %,21d\t%s[Time %s: %4dms]%s\n", id, answer, color, (time > 1000 ? ">>" : "OK"), time, COLOR.RESET);
    }
}