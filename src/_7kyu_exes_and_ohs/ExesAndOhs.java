package _7kyu_exes_and_ohs;

class ExesAndOhs {

    static boolean getXO(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == 'X' || str.charAt(i) == 'x') ++counter;
            if (str.charAt(i) == 'O' || str.charAt(i) == 'o') --counter;
        }

        return counter == 0;
    }
}