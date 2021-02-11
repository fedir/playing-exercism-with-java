
import java.util.stream.Collectors;

class ResistorColor {
    
    String[] resistors = {
        "black", 
        "brown", 
        "red", 
        "orange",
        "yellow",
        "green",
        "blue",
        "violet",
        "grey",
        "white"  
    };
    
    int colorCode(String color) {
        int colorId = 0;
        for (int i = 0; i < resistors.length; i++) {
            if (resistors[i] == color ) {
                colorId = i;
            }
        }
        return  colorId;
    }

	String[] colors() {
        return resistors;

    }
}