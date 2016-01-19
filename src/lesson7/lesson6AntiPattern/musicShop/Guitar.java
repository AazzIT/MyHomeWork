package lesson7.lesson6AntiPattern.musicShop;

public class Guitar extends MusicalInstrument {
    public static final String GUITAR_NAME = "Guitar";

    public Guitar() {
        super.name = GUITAR_NAME; //здесь Хардкод "Guitar" в константу хотя смысл этого загадочен %)
    }
    //разве что использовать эту константу еще где-то в других классах
}
