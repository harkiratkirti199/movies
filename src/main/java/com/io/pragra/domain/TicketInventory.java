package com.io.pragra.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class TicketInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Movie movie;

    private Long inventoryCount;

}
