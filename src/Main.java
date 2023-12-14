//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String anno = data.format(DateTimeFormatter.ofPattern("yyyy"));
        String mese = data.format(DateTimeFormatter.ofPattern("MMMM",Locale.ITALY));
        String giorno = data.format(DateTimeFormatter.ofPattern("dd"));
        String giornoSettimana = data.format(DateTimeFormatter.ofPattern("EEEE", Locale.ITALY));

        System.out.println(anno);
        System.out.println(mese);
        System.out.println(giorno);
        System.out.println(giornoSettimana);

    }
}