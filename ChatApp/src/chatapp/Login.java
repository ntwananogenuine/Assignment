
package chatapp;

public class Login {
 private String registeredUsername;
    private String registeredPassword;
    private String registeredPhone;

    public boolean checkName(String username) {
    return username.contains("_") && username.length() <= 5;
    }        

    public boolean checkPasswordComplexity(String password){
         boolean hasUpperCase = !password.equals(password.toLowerCase());
         boolean hasNumber = password.matches(".*\\d.*");
         boolean hasSpecialChar = password.matches(".*!@#$%^&*()_:<>//\\{}.*");
         return password.length() >= 8 && hasUpperCase && hasNumber && hasSpecialChar;
}
    public boolean checkCellPhoneNumber(String phone) {
         return phone.startsWith("+27") && phone.length() <=13;
    }        
    public String registerUser(String username, String password, String phone) {  
        if (!checkName(username)) {
        return "Username is not correctly formatted, please ensure that your username consists of an underscore and is no more than 5 characters in length.";
    }
        if (!checkPasswordComplexity(password)) {     
        return "Password is not correctly formatted, please, do ensure that the password consists of at least 8 characters, an upper case, a number, and a special character.";
    }        
        if (!checkCellPhoneNumber(phone)) {        
        return "Cellphone number was incorrectly formatted or does not contain the international code.";   
    }            
    this.registeredUsername = username;   
    this.registeredPassword = password;
    this.registeredPhone = phone;
       
        return "Username successfully captured. \nPassword successfully captured. \nCellphone number successfully added.";
    }      
    public boolean loginUser(String username, String password) {   
        return username.equals(registeredUsername) && password.equals(registeredPassword);
    }    
    public String returnLoginStatus(boolean loginStatus, String firstName, String lastName) {    
        if (loginStatus) {
            return "Welcome " + firstName + " " + lastName + ", it is agreat pleasure to see you again.";
        } else {
            return "Username or password are incorrect please try again.";
     }  
            
            
    }     
        
 }           
  
