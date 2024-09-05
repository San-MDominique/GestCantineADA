package ci.atos.gestcantine.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class MenuDTO {
    private Long id;
    private Date creationDate;
    private PlatDTO plat;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public PlatDTO getPlat() {
        return plat;
    }

    public void setPlat(PlatDTO plat) {
        this.plat = plat;
    }
}

