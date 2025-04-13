package chatapp;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {
   Login login = new Login(); 

@Test
public void testUsernameCorrect() {
assertTrue(login.checkName("nt_wa"));
}

@Test
public void testUsernameIncorrect() {
assertFalse(login.checkName("ntw_na"));
}

@Test
public void testPasswordCorrect() {
assertTrue(login.checkPasswordComplexity("1cEyfla&mez"));
}

@Test
public void testPasswordIncorrect() {
assertFalse(login.checkPasswordComplexity("1ccey789"));
}

@Test
public void testPhoneNumberCorrect() {
assertTrue(login.checkCellPhoneNumber("+27634897463"));
}

@Test
public void testPhoneNumberIncorrect() {
assertFalse(login.checkCellPhoneNumber("0634897463"));
}

@Test
public void testLoginSuccess() {
login.registerUser("nt_wa", "1cEyfla&me", "+27634897463");
assertTrue(login.loginUser("nt_wa", "1cEyfla&mez"));
}

@Test
public void testLoginFail() {
login.registerUser("ntw_na", "1ccey789", "0634897463");
assertFalse(login.loginUser("ntw_na", "1ceey789"));
}
}






