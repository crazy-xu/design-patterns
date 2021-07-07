package pattern.adapter.general.clazz;

/**
 * @author crazy.you
 * @Title: AdapterTest
 * @Package pattern.adapter.general.clazz
 * @Description: 适配器模式--类适配器模式
 */
public class AdapterTest {

    public static void main(String[] args) {

        // 通过适配器创建一个目标接口
        Target adapter = new Adapter();
        // 执行目标接口实现类的业务操作
        int result = adapter.request();
        System.out.println(result);
    }
}
