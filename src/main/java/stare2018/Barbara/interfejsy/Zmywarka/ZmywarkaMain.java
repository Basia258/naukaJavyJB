package stare2018.Barbara.interfejsy.Zmywarka;

public class ZmywarkaMain {

    public static void main(String[] args) {

        Zmywarka zmywarkaDoNaczyn = new ZmywarkaWhirlpool();
        Talerz talerzDoUmycia = new Talerz();
        Kubek kubekDoUmycia = new Kubek();

        zmywarkaDoNaczyn.umyj(talerzDoUmycia);
        zmywarkaDoNaczyn.umyj(kubekDoUmycia);

        }}