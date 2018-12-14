/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.services;

import guru.springframework.domain.OtherThing;
import guru.springframework.domain.OtherThing;
import guru.springframework.repositories.OtherThingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jomahony
 */
@Service
public class OtherThingServiceImpl implements OtherThingService{
  private OtherThingRepository otherThingRepository;
  
  @Autowired
  public void setOtherThingRepository(OtherThingRepository otherThingRepository) {
      this.otherThingRepository = otherThingRepository;
  }  
  @Override
  public Iterable<OtherThing> listAllOtherThings() {
    return otherThingRepository.findAll();
  }

  @Override
  public OtherThing getOtherThingId(Integer id) {
    return otherThingRepository.findById(id).orElse(null);
  }

  @Override
  public OtherThing saveOtherThing(OtherThing otherThing) {
    return otherThingRepository.save(otherThing);
  }
  
}
