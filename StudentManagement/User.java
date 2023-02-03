package StudentManagement;

public class User {
    private String userNmae;
    private String phoneNumber;
    private String passWord;

    private  String nationalId;

    public User() {
    }

    public User(String userNmae, String phoneNumber, String passWord, String nationalId) {
        this.userNmae = userNmae;
        this.phoneNumber = phoneNumber;
        this.passWord = passWord;
        this.nationalId = nationalId;
    }

    public String getUserNmae() {
        return userNmae;
    }

    public void setUserNmae(String userNmae) {
        this.userNmae = userNmae;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }
}
