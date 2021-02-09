import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private final LocalDateTime start;
    public Gigasecond(LocalDateTime moment) {
        start = moment;
    }
    public Gigasecond(LocalDate moment) {
        this(moment.atTime(0,0));
    }
    public LocalDateTime getDateTime() {
        return start.plusSeconds(BigInteger.valueOf(10).pow(9).longValue());
    }
}
