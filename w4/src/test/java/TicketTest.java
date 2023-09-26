import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

public class TicketTest {
    Ticket ticket = new Ticket();
    @Test
    void test1(){
        assertEquals(ticket.buyTicket(LocalTime.of(15,50)), "Ve tiet kiem");
    }
    @Test
    void test2(){
        assertEquals(ticket.buyTicket(LocalTime.of(1,0)), "Ve thuong");
    }
}
