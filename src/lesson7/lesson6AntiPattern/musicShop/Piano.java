package lesson7.lesson6AntiPattern.musicShop;

public class Piano extends MusicalInstrument {
    public static final String PIANO_NAME = "Piano";

    public Piano() {
        super.name = PIANO_NAME; //здесь Хардкод "Piano" в константу хотя смысл этого загадочен %)
    }
}
