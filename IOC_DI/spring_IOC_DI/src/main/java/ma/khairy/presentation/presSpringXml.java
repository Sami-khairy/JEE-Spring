package ma.khairy.presentation;

import ma.khairy.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presSpringXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        //recuperation du Bean via class v1
//        IMetier metier = (IMetier) context.getBean("metier"); //cast car il return un objet de type Object
        //recuperation du Bean via Interface
        IMetier metier =  context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
