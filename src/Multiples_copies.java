public class Multiples_copies {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while (i <= 1000) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3 || divisibleBy5) {
                count++;
            }
            i++;
        }
        System.out.println("There are "+ count + " multiples of 3 and 5 in 1000");
    }
}
