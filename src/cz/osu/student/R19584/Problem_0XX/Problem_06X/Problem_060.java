package cz.osu.student.R19584.Problem_0XX.Problem_06X;

/*

The primes 3, 7, 109, and 673, are quite remarkable. By taking any two primes and concatenating them in any order the result will always be prime. For example, taking 7 and 109, both 7109 and 1097 are prime. The sum of these four primes, 792, represents the lowest sum for a set of four primes with this property.

Find the lowest sum for a set of five primes for which any two primes concatenate to produce another prime.

 */

import SharedCodeBase.Prime;

import java.util.ArrayList;

public class Problem_060 {

    public static long main() {
        long prime_1, prime_2, prime_3, prime_4, prime_5;
        ArrayList<Long> primes = Prime.get_in_range(13, 8500);
        for(int prime_id_1 = 0; prime_id_1 < primes.size() - 4; prime_id_1++) {
            prime_1 = primes.get(prime_id_1);
            for(int prime_id_2 = prime_id_1 + 1; prime_id_2 < primes.size() - 3; prime_id_2++) {
                prime_2 = primes.get(prime_id_2);
                if(Prime.check(prime_1 + "" + prime_2) && Prime.check(prime_2 + "" + prime_1)) {
                    for (int prime_id_3 = prime_id_2 + 1; prime_id_3 < primes.size() - 2; prime_id_3++) {
                        prime_3 = primes.get(prime_id_3);
                        if (Prime.check(prime_1 + "" + prime_3) && Prime.check(prime_2 + "" + prime_3) && Prime.check(prime_3 + "" + prime_1) && Prime.check(prime_3 + "" + prime_2)) {
                            for (int prime_id_4 = prime_id_3 + 1; prime_id_4 < primes.size() - 1; prime_id_4++) {
                                prime_4 = primes.get(prime_id_4);
                                if (Prime.check(prime_1 + "" + prime_4) && Prime.check(prime_2 + "" + prime_4) && Prime.check(prime_3 + "" + prime_4) && Prime.check(prime_4 + "" + prime_1) && Prime.check(prime_4 + "" + prime_2) && Prime.check(prime_4 + "" + prime_3)) {
                                    for (int prime_id_5 = prime_id_4 + 1; prime_id_5 < primes.size(); prime_id_5++) {
                                        prime_5 = primes.get(prime_id_5);
                                        if (Prime.check(prime_1 + "" + prime_5) && Prime.check(prime_2 + "" + prime_5) && Prime.check(prime_3 + "" + prime_5) && Prime.check(prime_4 + "" + prime_5) && Prime.check(prime_5 + "" + prime_1) && Prime.check(prime_5 + "" + prime_2) && Prime.check(prime_5 + "" + prime_3) && Prime.check(prime_5 + "" + prime_4)) return prime_1 + prime_2 + prime_3 + prime_4 + prime_5;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
}
