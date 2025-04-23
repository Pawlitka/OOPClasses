public class IsbnGenerator {
    private static final Integer ISBN_LENGTH = 13;

    public static String run() {
        String ISBN = "";

        for(int i = 0; i < ISBN_LENGTH; i++) {
            ISBN += getRandomISBNNumberOrLetter();
        }

        return ISBN;
    }

    private static char getRandomISBNNumberOrLetter() {
        Integer deciderNumber = generateRandomNumber();
        Boolean isEven = (deciderNumber / 2) == 0;
        return isEven ? getRandomISBNLetter() : getRandomISBNNumber();
    }

    private static Integer generateRandomNumber() {
        return Integer.valueOf((int) (Math.random() * 10));
    }

    private static char getRandomISBNLetter() {
        return (char)(97 + Math.random() * (122 - 97));
    }

    private static char getRandomISBNNumber() {
        return (char) (48 + Math.random() * (57 - 48));
    }
}
