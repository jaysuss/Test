/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.bootstrap;

/**
 *
 * @author jomahony
 */
import guru.springframework.domain.OtherThing;
import guru.springframework.repositories.OtherThingRepository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class OtherThingLoader implements ApplicationListener<ContextRefreshedEvent>{
  private OtherThingRepository otherThingRepository;
  private Logger log = LogManager.getLogger(OtherThingLoader.class);


    @Autowired
    public void setOtherThingRepository(OtherThingRepository otherThingRepository) {
        this.otherThingRepository = otherThingRepository;
    }
  
  @Override
  public void onApplicationEvent(ContextRefreshedEvent e) {
    OtherThing otherThing = new OtherThing();
    otherThing.setDescription("Other Thing One");
    otherThing.setImageUrl("Another URL");
    otherThing.setVersion(1);
    otherThingRepository.save(otherThing);
    
    log.info("==> ==> Saved Other Thing - id: " + otherThing.getId());
  }
  
}
