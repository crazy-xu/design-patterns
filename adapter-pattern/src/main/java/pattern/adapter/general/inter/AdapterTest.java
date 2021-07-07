package pattern.adapter.general.inter;

/**
 * @author crazy.you
 * @Title: AdapterTest
 * @Package pattern.adapter.general.clazz
 * @Description: 适配器模式--接口适配器模式
 */
public class AdapterTest {

    public static void main(String[] args) {
        // 接口适配器模式
        Target target = new Adapter(new Adaptee());
        System.out.println("request1：" + target.request1());
        System.out.println("request2：" + target.request2());
        System.out.println("request3：" + target.request3());
        System.out.println("request4：" + target.request4());
    }
}
