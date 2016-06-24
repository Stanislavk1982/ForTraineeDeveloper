public class ForTraineeDeveloper {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            String out = "";
            if (i % 3 == 0) {
                out += "Fizz";
            }

            if (i % 5 == 0) {
                out += "Bizz";
            }

            if (out.equals("")) {
                out += i;
            }

            System.out.println(out);

        }
    }
}
