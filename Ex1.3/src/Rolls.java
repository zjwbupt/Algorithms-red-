public class Rolls {
    int T = Integer.parseInt(args[0]);
    int SIDES = 6;
    Counter[] rolls = new Counter[SIDES+1];
    for (int i=1; i<= SIDES; i++)
        rolls[i] = new Counter(i +"'s")
}
