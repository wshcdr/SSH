import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class SetterTest {
	public static void main(String args[]){
		Resource rs = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(rs);
		UpperAction upper = (UpperAction)factory.getBean("userAction");
		System.out.println(upper.getMsg());
		
	}

}
