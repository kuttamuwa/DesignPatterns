package structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToplamUtil {
    public static Double findToplam(ArrayList<Toplanabilir> toplanabilirs) {
        Double toplam = Double.valueOf(0);

        for (Toplanabilir toplanabilir : toplanabilirs) {
            toplam += toplanabilir.getToplamFiyat();
        }
        return toplam;
    }
}
