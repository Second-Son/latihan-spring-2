package springDi;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import latihanSpring2.service.HitungVolumeServices;

public class MainVolume {
	public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(
                new ClassPathResource("appconfig2.xml"));
        HitungVolumeServices d1 = (HitungVolumeServices)
                factory.getBean("hitungVol");
        System.out.println(d1.hitungLuasLingkaran(10,10));
    }
}
