import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(manAgeAndTemperature2(34, 23));
        System.out.println(manAgeAndTemperature2(25, 34));
        System.out.println(manAgeAndTemperature2(20, 19));
        System.out.println(manAgeAndTemperature2(0, 100));
        System.out.println(manAgeAndTemperature2(61, 56));

        System.out.println("=============");
        System.out.println( manAgeAndTemperature2(generateRandomAge(),generateRandomAge()));
        System.out.println( manAgeAndTemperature2(generateRandomAge(),generateRandomAge()));
        System.out.println( manAgeAndTemperature2(generateRandomAge(),generateRandomAge()));
        System.out.println( manAgeAndTemperature2(generateRandomAge(),generateRandomAge()));
        System.out.println( manAgeAndTemperature2(generateRandomAge(),generateRandomAge()));
    }

    public static String manAgeAndTemperature2(int manAge, int Temperature) {
        if (manAge >= 20 && manAge <= 45 && Temperature >= -20 && Temperature <= 30) {
            return "можно идти гулять";
        } else if (manAge < 20 && Temperature <= 28 && Temperature >= 0) {
            return "можно идти гулять";
        } else if (manAge >= 45 && Temperature >= 10 && Temperature <= 25) {
            return " можно идти гулять";
        } else {
            return "остовайтесь дома";
        }
    }
 // дз на собразительность
    public static int generateRandomAge() {
        Random random = new Random();
        int minAge = 0;
        int maxAge = 40;

        int randomAge = random.nextInt(maxAge - minAge + 1) + minAge;
        return randomAge;
    }
}
