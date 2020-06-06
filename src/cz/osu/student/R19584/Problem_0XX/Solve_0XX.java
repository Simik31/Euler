package cz.osu.student.R19584.Problem_0XX;

import cz.osu.student.R19584.Problem_0XX.Problem_00X.Solve_00X;
import cz.osu.student.R19584.Problem_0XX.Problem_01X.Solve_01X;
import cz.osu.student.R19584.Problem_0XX.Problem_02X.Solve_02X;
import cz.osu.student.R19584.Problem_0XX.Problem_03X.Solve_03X;
import cz.osu.student.R19584.Problem_0XX.Problem_04X.Solve_04X;
import cz.osu.student.R19584.Problem_0XX.Problem_05X.Solve_05X;
import cz.osu.student.R19584.Problem_0XX.Problem_06X.Solve_06X;
import cz.osu.student.R19584.Problem_0XX.Problem_07X.Solve_07X;
import cz.osu.student.R19584.Problem_0XX.Problem_08X.Solve_08X;
import cz.osu.student.R19584.Problem_0XX.Problem_09X.Solve_09X;

public class Solve_0XX {

    public static void all() {

        Solve_00X.all();
        Solve_01X.all();
        Solve_02X.all();
        Solve_03X.all();
        Solve_04X.all();
        Solve_05X.all();
        Solve_06X.all();
        Solve_07X.all();
        Solve_08X.all();
        Solve_09X.all();

    }

    public static void problem(long id) {
        if(id < 10) Solve_00X.problem(id);
        else if(id < 20) Solve_01X.problem(id);
        else if(id < 30) Solve_02X.problem(id);
        else if(id < 40) Solve_03X.problem(id);
        else if(id < 50) Solve_04X.problem(id);
        else if(id < 60) Solve_05X.problem(id);
        else if(id < 70) Solve_06X.problem(id);
        else if(id < 80) Solve_07X.problem(id);
        else if(id < 90) Solve_08X.problem(id);
        else if(id < 100) Solve_09X.problem(id);
    }

}
