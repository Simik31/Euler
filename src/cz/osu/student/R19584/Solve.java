package cz.osu.student.R19584;

import cz.osu.student.R19584.Problem_0XX.Solve_0XX;
import cz.osu.student.R19584.Problem_2XX.Solve_2XX;

public class Solve {

    public static void all() {
        Solve_0XX.all();
        //Solve_2XX.all();
    }

    public static void problem(long id) {
        if(id < 100) Solve_0XX.problem(id);
        if(id == 206) Solve_2XX.problem(id);
    }

}
