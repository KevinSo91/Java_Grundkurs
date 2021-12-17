import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Zeitangabe{
    public static void main(String[] args){
        LocalDate jetzt = LocalDate.now();
        DateTimeFormatter meineFormatierung = DateTimeFormatter.ofPattern("EEEE, d. MMMM yyyy");
        String ZeitJetzt = meineFormatierung.format(jetzt);
        System.out.println("Heute ist " + ZeitJetzt);
    }

   
}