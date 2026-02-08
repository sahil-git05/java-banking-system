package model;

public class User {
    private int userId;
    private String name;
    private String address;
    private String phone;
    private String password;

    public User(int userId,String name,String address,String phone,String password){
        this.userId=userId;
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.password=password;

    }
    public int getUserId(){
        return userId;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String address){
    this.address=address;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public boolean validatePassword(String password){
        return this.password.equals(password);
    }
}
