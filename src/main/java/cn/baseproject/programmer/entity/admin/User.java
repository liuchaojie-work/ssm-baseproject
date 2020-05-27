package cn.baseproject.programmer.entity.admin;

import org.springframework.stereotype.Component;

/**
 * 用户实体类
 */
@Component
public class User {
    private Long id;//用户id,自增
    private String username;//用户名，登录名
    private String password;//登录密码
    private String photo;//头像地址
    private String gender;//性别，0：未知；1：男；2：女
    private Integer age;//年龄
    private String address;//地址

    public User() {
    }

    public User(Long id, String username, String password, String photo, String gender, Integer age, String address) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.photo = photo;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", photo='" + photo + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
