package com.io.pragra.domain;

import lombok.*;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @NonNull private User user;

    @OneToOne
    @NonNull private Movie movie;

    private Date orderDate;

}
