package springassignmentQ2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

        public static ApplicationContext context;
        public static void main(String[] args) {
                context= new ClassPathXmlApplicationContext("getAnswer.xml");
                Question question1=(Question) context.getBean("question1");
                question1.getanswers();
        }
}