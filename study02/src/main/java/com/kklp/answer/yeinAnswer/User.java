package main.java.com.kklp.answer.yeinAnswer;

public class User {

    LoginRepository loginRepository = new LoginRepository();

    private String id;

    private String pwd;

    private String name;

    // 기본 생성자
    public User() {}

    // 전체 초기화 생성자
    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}