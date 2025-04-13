package chatapp;
public class Message {

    public Message(String string, String hello_how_are_you_doing) {
    }
    
private String senderPhone;
private String receiverPhone;
private String content;
private String status;
//Sent, Received, Read

public Message(String senderPhone, String receiverPhone, String content) {
      this.senderPhone = senderPhone;
      this.receiverPhone = receiverPhone; 
      this.content = content;
      this.status = "Sent";
}
public void markasReceived() {
       this.status = "Received";
}

public void markasRead() {
      this.status = "Recived";
}
public String getStatus() {
     return this.status;
} 

public String displayMessageStaatus() {
     return "Message status" + this.status;
}

    void markAsRead() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean displayMessageStatus() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void markAsReceived() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}

    

