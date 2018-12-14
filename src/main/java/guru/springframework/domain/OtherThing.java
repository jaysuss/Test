/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.domain;

/**
 *
 * @author jomahony
 */
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class OtherThing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private String otherThingId;
    private String description;
    private String imageUrl;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }  
    
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    } 
    
    public String getOtherThingId() {
        return otherThingId;
    }

    public void setOtherThingId(String otherThingId) {
        this.otherThingId = otherThingId;
    }    
}
