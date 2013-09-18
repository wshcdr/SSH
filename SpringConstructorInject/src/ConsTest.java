import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class ConsTest {
	public static void main(String args[]){
		Resource rs = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(rs);
		User user = (User)factory.getBean("user");
		System.out.println(user.getName());
		System.out.println(user.getPassword());
}
}
