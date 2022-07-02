//Demo演示FastJson反序列化过程
public class User {
    //定义用户类
    private Long id;
    private String name;
    //提交set get方法

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}