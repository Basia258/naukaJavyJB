package nowe2020.JavaDlaPoczatkujacych.rozdzial_drugi;

public class TwierdzeniePitagorasa {
    public static void main(String[] args) {
        double a, b, c;

        a = 12;
        b = 43;

        c = Math.sqrt(a*a + b*b);
        System.out.println("przeciw prostokątna c: " + c + " podczas gdy a wynosi: " + a + " a b jest równe: " + b);
    }
}
