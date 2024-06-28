package oht.club.member;

import oht.club.member.enums.Lane;
import oht.club.member.enums.Tier;

import java.time.LocalDateTime;

public class Member {

    public Long id;
    public int age;
    public Lane mainPosition;
    public Lane secondPosition;
    public Tier tier;
    public String name;
    public double sensoryTier;

    public Member(Long id, int age, Lane mainPosition, Lane secondPosition, Tier tier, String name, double sensoryTier) {
        this.id = id;
        this.age = age;
        this.mainPosition = mainPosition;
        this.secondPosition = secondPosition;
        this.tier = tier;
        this.name = name;
        this.sensoryTier = sensoryTier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Lane getMainPosition() {
        return mainPosition;
    }

    public void setMainPosition(Lane mainPosition) {
        this.mainPosition = mainPosition;
    }

    public Lane getSecondPosition() {
        return secondPosition;
    }

    public void setSecondPosition(Lane secondPosition) {
        this.secondPosition = secondPosition;
    }

    public Tier getTier() {
        return tier;
    }

    public void setTier(Tier tier) {
        this.tier = tier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSensoryTier() {
        return sensoryTier;
    }

    public void setSensoryTier(double sensoryTier) {
        this.sensoryTier = sensoryTier;
    }
}
