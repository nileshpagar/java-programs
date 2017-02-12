package codewars;

import static java.math.RoundingMode.CEILING;
import static java.math.BigDecimal.valueOf;

public class TwoFighersOneWinner {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        int attemptsForFighter1 = valueOf(fighter2.health).divide(valueOf(fighter1.damagePerAttack), CEILING).intValue();
        int attemptsForFighter2 = valueOf(fighter1.health).divide(valueOf(fighter2.damagePerAttack), CEILING).intValue();
        if (attemptsForFighter1 < attemptsForFighter2 || (attemptsForFighter1 == attemptsForFighter2 && firstAttacker.equals(fighter1.name)))
            return fighter1.name;
        else if (attemptsForFighter2 < attemptsForFighter1 || (attemptsForFighter1 == attemptsForFighter2 && firstAttacker.equals(fighter2.name))){
            return fighter2.name;
        }
        return null;
    }

}
