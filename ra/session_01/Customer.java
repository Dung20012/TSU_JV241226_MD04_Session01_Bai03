package ra.session_01;

import java.util.Date;

public class Customer {
    private int id;
    private String name;
    private Date birthday;
    private String address;
    private String image;

    public Customer() {
    }

    public Customer(int id, String name, Date birthday, String address, String image) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
