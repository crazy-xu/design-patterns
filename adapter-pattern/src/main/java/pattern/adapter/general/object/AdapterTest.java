package pattern.adapter.general.object;

/**
 * @author crazy.you
 * @Title: AdapterTest
 * @Package pattern.adapter.general.object
 * @Description: 适配器模式--对象适配器模式
 */
public class AdapterTest {

    public static void main(String[] args) {

        // 对象适配器，将对象传进去
        Target adapter = new Adapter(new Adaptee());
        // 执行目标接口实现类的业务操作
        int result = adapter.request();
        System.out.println(result);
    }
}
