package petclinic.model;

import com.petclinic.petclinic.model.petType;

import java.time.LocalDate;

public class Pet {
    private com.petclinic.petclinic.model.petType petType;
    private Owner owner;
    private LocalDate birthdate;

    public com.petclinic.petclinic.model.petType getPetType() {
        return petType;
    }

    public void setPetType(com.petclinic.petclinic.model.petType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
