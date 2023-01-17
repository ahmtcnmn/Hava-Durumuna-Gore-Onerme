import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        int heat;

        out.print("Lütfen hava sıcaklığını giriniz : ");
        heat = input.nextInt();

        if (heat < 5) out.println("Kayak yapmaya gidebilirsini.");
        if ((heat > 5) && (heat < 30)) out.println("Sinemaya gidebilirisiniz.");
        if ((heat > 15) && (heat < 30)) out.println("Piknik yapmaya gidebilirsiniz.");
        if ((heat > 25) && (heat < 30)) out.println("Yüzmeye gidebilirsiniz.");
        if ((heat > 30) && (heat < 50)) out.print("Adana yaşıyorsanız dışarı çıkmayın !!");

    }
}