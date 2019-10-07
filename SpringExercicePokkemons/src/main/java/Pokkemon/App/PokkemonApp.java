package Pokkemon.App;


import Pokkemon.AppConfig;
import Pokkemon.model.PokkemonType;
import Pokkemon.repository.PokkemonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PokkemonApp {
    public static void main(String[] args) {


    ConfigurableApplicationContext ctx = SpringApplication.run ( AppConfig.class,args);
            //SpringApplication.run(AppConfig.class,args);
    PokkemonRepository pr = ctx.getBean ("pokkemonRepository",PokkemonRepository.class);


    PokkemonType pokkemonType = new PokkemonType ();
        pokkemonType.setBaseAttack (10);
        pokkemonType.setBaseDefense (20);
        pokkemonType.setBaseHitPoints (50);
        pokkemonType.setBeschrijving ("Heavy");
        pokkemonType.setTypeName ("Diglet");
   // pr.CreatePokkemonType (pokkemonType);
}
}