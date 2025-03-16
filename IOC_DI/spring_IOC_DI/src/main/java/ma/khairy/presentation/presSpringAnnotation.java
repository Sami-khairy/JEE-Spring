package ma.khairy.presentation;

import ma.khairy.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ma.khairy");//scanner les classes de ce package et creer les Beans
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calcul());

    }
}
