package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.bindings.Ticket;

public interface TicketRepository  extends JpaRepository<Ticket, Integer>{

}
