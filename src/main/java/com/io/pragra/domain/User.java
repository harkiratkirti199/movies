package com.io.pragra.domain;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity
@Table(name="table_user")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
    private Long id;

    @Column(length=255)
    @NonNull private String firstName;

    @Column(length=255)
    @NonNull private String lastName;

    @Column(length=255)
    @NonNull private String email;




}
