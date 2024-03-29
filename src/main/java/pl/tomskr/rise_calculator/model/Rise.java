package pl.tomskr.rise_calculator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Data Model for



@Entity
public class Rise {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    
    private Long riseLevel;
    private String riseDescription;

    private Long strengthIncrease;
//    private Long dexterityIncrease;
//    private Long constitutionIncrease;
//    private Long intelligenceIncrease;
//    private Long wisdomIncrease;
//    private Long charismaIncrease;

    public Rise() {
    }

    public Rise(Long riseLevel, String riseDescription) {
        this.riseLevel = riseLevel;
        this.riseDescription = riseDescription;
    }

    public Rise(Long riseLevel, String riseDescription, Long strengthIncrease) {
        this.riseLevel = riseLevel;
        this.riseDescription = riseDescription;
        this.strengthIncrease = strengthIncrease;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getRiseLevel() {
        return riseLevel;
    }

    public void setRiseLevel(Long riseLevel) {
        this.riseLevel = riseLevel;
    }

    public String getRiseDescription() {
        return riseDescription;
    }

    public void setRiseDescription(String riseDescription) {
        this.riseDescription = riseDescription;
    }

    public Long getStrengthIncrease() {
        return strengthIncrease;
    }

    public void setStrengthIncrease(Long strengthIncrease) {
        this.strengthIncrease = strengthIncrease;
    }

//    public Long getDexterityIncrease() {
//        return dexterityIncrease;
//    }
//
//    public void setDexterityIncrease(Long dexterityIncrease) {
//        this.dexterityIncrease = dexterityIncrease;
//    }
//
//    public Long getConstitutionIncrease() {
//        return constitutionIncrease;
//    }
//
//    public void setConstitutionIncrease(Long constitutionIncrease) {
//        this.constitutionIncrease = constitutionIncrease;
//    }
//
//    public Long getIntelligenceIncrease() {
//        return intelligenceIncrease;
//    }
//
//    public void setIntelligenceIncrease(Long intelligenceIncrease) {
//        this.intelligenceIncrease = intelligenceIncrease;
//    }
//
//    public Long getWisdomIncrease() {
//        return wisdomIncrease;
//    }
//
//    public void setWisdomIncrease(Long wisdomIncrease) {
//        this.wisdomIncrease = wisdomIncrease;
//    }
//
//    public Long getCharismaIncrease() {
//        return charismaIncrease;
//    }
//
//    public void setCharismaIncrease(Long charismaIncrease) {
//        this.charismaIncrease = charismaIncrease;
//    }


    @Override
    public String toString() {
        return "Rise{" +
                "Id=" + Id +
                ", riseLevel=" + riseLevel +
                ", riseDescription='" + riseDescription + '\'' +
                ", strengthIncrease=" + strengthIncrease +
                '}';
    }
}
