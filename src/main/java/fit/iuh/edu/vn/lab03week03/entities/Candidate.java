package fit.iuh.edu.vn.lab03week03.entities;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@Table(name = "candidate")
public class Candidate {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "can_id")
    private long id;
    @Getter
    private String name;
    @Getter
    private String phone;
    @Getter
    private String address;
    @Getter
    private String email;

    @OneToMany(mappedBy = "candidate")
    private List<LevelCan> levelCan;

    public Candidate() {
    }

    public Candidate(long id, String name, String phone, String address, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public Candidate(String name, String phone, String address, String email) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<LevelCan> getLevelCan() {
        return levelCan;
    }

    public void setLevelCan(List<LevelCan> levelCan) {
        this.levelCan = levelCan;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
