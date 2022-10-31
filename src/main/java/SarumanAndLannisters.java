public class SarumanAndLannisters {

    public static void main(String args[]) {
        int countOfInfantrymenLannisters = 100; // изменяемая переменная, количество человек может меняться
        System.out.println("У Ланнистеров было " + countOfInfantrymenLannisters + " пехотинца(ев)." );

        int countOfOrcsSaruman = 200; // изменяемая переменная, количество человек может меняться
        System.out.println("У Сарумана было " + countOfOrcsSaruman + " орка(ов).");

        int totalCountOfLannistersAndOrcsSaruman = countOfInfantrymenLannisters + countOfOrcsSaruman;
        System.out.println("Всего пехоты в союзе Ланнистеров и Сарумана было " + totalCountOfLannistersAndOrcsSaruman + " человек(а).");
    }

}
