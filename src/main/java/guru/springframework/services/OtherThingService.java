/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.services;

/**
 *
 * @author jomahony
 */

import guru.springframework.domain.OtherThing;
public interface OtherThingService {
    Iterable<OtherThing> listAllOtherThings();

    OtherThing getOtherThingId(Integer id);

    OtherThing saveOtherThing(OtherThing otherThing);  
  
}
