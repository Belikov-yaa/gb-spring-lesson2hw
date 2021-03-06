import classes.Clinic;
import classes.DoctorType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Clinic clinic = context.getBean("clinic", Clinic.class);
        clinic.doDoctorVisit(DoctorType.SURGEON);

    }
}
