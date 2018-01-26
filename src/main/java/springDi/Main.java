package springDi;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import latihanSpring2.service.HitungServices;

public class Main {
	public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(
                new ClassPathResource("appconfig.xml"));
        HitungServices d1 = (HitungServices) factory
                .getBean("lingkaran");
        System.out.println(d1.hitungLuas(100));
        /*  HitungServices d2 = (HitungServices)
         factory.getBean("persegi");*/

        //-------------------
        //  System.out.println(d2.hitungLuas(200));
      //  HitungServices d3 = (HitungServices) factory.getBean("hitungLuas");
        //System.out.println(" = " + d3.hitungLuas(1200));
        
        
        
    }
}
