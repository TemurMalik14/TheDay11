public class Day11 {
    public static void Sv1(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                char sign = str.charAt(i);
                boolean letter = (sign >= 'a' && sign <= 'z') || (sign >= 'A' && sign <= 'Z');
                boolean number = (sign >= '0' && sign <= '9');
                if (!letter && !number)
                    System.out.print(sign + " ");
            }
        }
    }

    public static void Sv2(int n) {
        int count;
        int multipication = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                multipication = multipication * i;
                count = i;
                System.out.print(count + " ");
            }
        }
        System.out.println("\ndividable's multipication: " + multipication);
    }

    public static void Sv3(int n) {
        int input = n;
        int reverse = 0;

        for (; n > 0; n = n / 10) {
            int lastnumb = n % 10;
            reverse = reverse * 10 + lastnumb;
        }
        if (input == reverse) {
            System.out.println(input + " is palindrom");
        } else {
            System.out.println(input + " not a palindrom");
        }
    }

    public static void Sv4(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char sign = str.charAt(i);

            if (sign == 'a' || sign == 'e' || sign == 'i' || sign == 'o' || sign == 'u' ||
                    sign == 'A' || sign == 'E' || sign == 'I' || sign == 'O' || sign == 'U') {
                result = result + '*';
            } else {
                result = result + sign;
            }
        }
        System.out.println(result);
    }

    public static void Sv5(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char sign = str.charAt(i);

            if (sign != 'a' && sign != 'e' && sign != 'i' && sign != 'o' && sign != 'u' &&
                    sign != 'A' && sign != 'E' && sign != 'I' && sign != 'O' && sign != 'U') {
                result = result + '+';
            } else {
                result = result + sign;
            }
        }
        System.out.println(result);
    }

    public static void Sv6(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char sign = str.charAt(i);
            char replacedsign = (char) (sign + 1);
            result = result + replacedsign;
        }

        System.out.println(result);
    }

    public static void Sv7(String str) {
        int letters = 0;
        int numbers = 0;
        int signs = 0;

        for (int i = 0; i < str.length(); i++) {
            char sign = str.charAt(i);

            if ((sign >= 'a' && sign <= 'z') || (sign >= 'A' && sign <= 'Z')) {
                letters++;
            } else if (sign >= '0' && sign <= '9') {
                numbers++;
            } else {
                signs++;
            }
        }

        if (letters == numbers && numbers == signs) {
            System.out.println("Ok");
        } else {
            System.out.println("Not");
        }
    }

    public static void Sv8(String str) {
        char first = str.charAt(0);
        char middle = str.charAt(str.length() / 2);
        char last = str.charAt(str.length() - 1);

        System.out.println(first + "" + middle + "" + last);
    }

    public static void Sv9(char sign) {
        if (sign >= '0' && sign <= '9') {
            System.out.println("RAQAM");
        } else if ((sign >= 'a' && sign <= 'z') || (sign >= 'A' && sign <= 'Z')) {
            System.out.println("HARF");
        } else {
            System.out.println("SIMVOL");
        }
    }

    public static void Sv10(int n, char sign) {
        String result = "";

        for (int i = 0; i < n; i++) {
            result = result + sign;
        }

        System.out.println(result);
    }

    public static void Sv11(int n) {
        if (n < 32 || n > 126) {
            System.out.println("Wrong input!");
        } else {
            System.out.println((char) n);
        }
    }

    public static void Sv12(String str) {
        int firstn = -1;
        int secondn = -1;
        int newfoundn = 0;

        for (int i = 0; i < str.length(); i++) {
            char sign = str.charAt(i);

            if (sign >= '0' && sign <= '9') {
                if (newfoundn == 0) {
                    firstn = sign - '0';
                    newfoundn++;
                } else if (newfoundn == 1) {
                    secondn = sign - '0';
                    newfoundn++;
                    break;
                }
            }
        }

        int a = firstn;
        int b = secondn;

        int EKUB = 1;
        int kichik = Math.min(a, b);

        for (int i = kichik; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                EKUB = i;
                break;
            }
        }

        int EKUK = (a * b) / EKUB;

        System.out.println("EKUB=" + EKUB + ", EKUK=" + EKUK);
    }

    public static void Sv13(String str) {
        int lettern = 0;
        int numbers = 0;
        for (int i = 0; i < str.length(); i++) {
            char sign = str.charAt(i);
            if (Character.isLetter(sign)) {
                lettern++;
            } else if (Character.isDigit(sign)) {
                numbers++;
            }
        }
        if (lettern == numbers) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }
    }

    public static void Sv14(String str) {
        int string = str.length();
        int halfstring = str.length() / 2;
        int signcount = 0;
        int lettercount = 0;
        for (int i = 0; i < str.length(); i++) {
            char sign = str.charAt(i);
            if (Character.isLetter(sign)) {
                lettercount++;
            } else if (!Character.isDigit(sign) && !Character.isLetter(sign)) {
                signcount++;
            }
        }
        if (signcount == lettercount) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }
    }
}