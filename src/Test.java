import java.util.List;

/**
 * 测试类
 * 
 * @author Fancye
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 注意此处的包路径，使用的是客户端生成的类，而不是服务端的类
		com.fancye.client.TestServiceService service = new com.fancye.client.TestServiceService();
		com.fancye.client.TestServiceDelegate portType = service.getWs();
		
		// 调用服务端暴露出来的方法s
		List<String> list = portType.getList("Fancye");
		System.out.println(list);

		portType.sayHello();
		portType.sayHelloToPersion("Fancye");
	}

}
