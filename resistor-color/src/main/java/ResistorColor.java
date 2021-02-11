
import java.util.List;

class ResistorColor {
    String[] resistors = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };

    int colorCode(String color) {
        return List.of(resistors).indexOf(color);
    }

    String[] colors() {
        return resistors;
    }
}