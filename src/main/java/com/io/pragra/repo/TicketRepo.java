package com.io.pragra.repo;

import com.io.pragra.domain.TicketInventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<TicketInventory, Long> {
}
