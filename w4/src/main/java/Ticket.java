import java.time.LocalTime;
public class Ticket {
    public String buyTicket (LocalTime time) {
        String ticket;
        if ((time.isAfter(LocalTime.of(0,0))
            && time.isBefore(LocalTime.of(9,30)))
                || (time.isAfter(LocalTime.of(16,0))
                    && time.isBefore(LocalTime.of(19,30)))) {
            ticket = "Ve thuong";
        } else {
            ticket = "Ve tiet kiem";
        }
        return ticket;
    }
}