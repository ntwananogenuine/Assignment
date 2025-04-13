package chatapp;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessageTest {
    
@Test 
public void testMessageStatusFlow() {
Message msg = new Message("+27634897463,", "+27645879988","Hello! How are you doing?");

assertEquals("SENT", msg.getStatus());

msg.markAsReceived();
assertEquals("RECEIVED", msg.getStatus());

msg.markAsRead();
assertEquals("READ", msg.getStatus());
}
}