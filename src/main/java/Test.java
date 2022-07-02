import com.alibaba.fastjson.JSON;

//定义测试类
public class Test {
    public static void main(String[] args) {
        User getUser=new User();
        getUser.setId(1L);
        getUser.setName("guest");
        //将java对象序列化为json对象
        String jsonString1= JSON.toJSONString(getUser);
        System.out.println("Json对象："+jsonString1);
        //将json反序列化为java对象
        String jsonString2="{\"id\":2,\"name\":\"root\"}";
        User user = JSON.parseObject(jsonString2,User.class);
        System.out.println("java对象："+user);
        //打印变量类型
        System.out.println(user.getClass().getTypeParameters());

    }
}