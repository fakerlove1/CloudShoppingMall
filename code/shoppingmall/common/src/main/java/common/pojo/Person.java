package common.pojo;



/**
 *  是 用户的 信息
 */


public class Person {

    private int user_id;
    private String user_name;
    private String user_password;
    private Double user_money;
    private int user_lev;
    private String user_email;
    private String user_address;
    private String user_banner_img;
    private String user_telephone;
    private String user_introduce;
    private int user_gender;

    @Override
    public String toString() {
        return "Person{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_money=" + user_money +
                ", user_lev=" + user_lev +
                ", user_email='" + user_email + '\'' +
                ", user_address='" + user_address + '\'' +
                ", user_banner_img='" + user_banner_img + '\'' +
                ", user_telephone='" + user_telephone + '\'' +
                ", user_introduce='" + user_introduce + '\'' +
                ", user_gender=" + user_gender +
                '}';
    }

    public Person(int user_id, String user_name, String user_password, Double user_money, int user_lev, String user_email, String user_address, String user_banner_img, String user_telephone, String user_introduce, int user_gender) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_money = user_money;
        this.user_lev = user_lev;
        this.user_email = user_email;
        this.user_address = user_address;
        this.user_banner_img = user_banner_img;
        this.user_telephone = user_telephone;
        this.user_introduce = user_introduce;
        this.user_gender = user_gender;
    }

    public int getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(int user_gender) {
        this.user_gender = user_gender;
    }

    public Person() {
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Double getUser_money() {
        return user_money;
    }

    public void setUser_money(Double user_money) {
        this.user_money = user_money;
    }

    public int getUser_lev() {
        return user_lev;
    }

    public void setUser_lev(int user_lev) {
        this.user_lev = user_lev;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getUser_banner_img() {
        return user_banner_img;
    }

    public void setUser_banner_img(String user_banner_img) {
        this.user_banner_img = user_banner_img;
    }

    public String getUser_telephone() {
        return user_telephone;
    }

    public void setUser_telephone(String user_telephone) {
        this.user_telephone = user_telephone;
    }

    public String getUser_introduce() {
        return user_introduce;
    }

    public void setUser_introduce(String user_introduce) {
        this.user_introduce = user_introduce;
    }
}
