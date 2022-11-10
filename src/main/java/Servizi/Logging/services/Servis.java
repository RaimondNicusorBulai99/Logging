package Servizi.Logging.services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Servis {
    Logger logg = LoggerFactory.getLogger(Servis.class);

    public String calculateExp(int customInt1, int customInt2) {
        try {
            logg.info(String.format("Starting randomService - randomInt1 : %d  randomInt2 : %d", customInt1, customInt2));
            double int1 = Math.getExponent(customInt1);
            double int2 = Math.getExponent(customInt2);
            return String.format("int1 = %f  int2 = %f", int1, int2);
        } finally {
            logg.info("Ending ransomService");
        }
    }
}