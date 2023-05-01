package com.elearningweb.library.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(length= 20)
    private String name;
    @Override
    public String toString(){
        return this.name;
    }

}
