package com.neoteric.ticket.service;

import com.neoteric.ticket.model.Ticket;
import com.neoteric.ticket.model.TicketForm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TicketServiceTest {
    @Test
    public void ticketTest(){
        Ticket ticketForm=new Ticket();
        ticketForm.theaterName="GPR Multiplex";
        ticketForm.movieName="Kalki";
        ticketForm.date="07-07-2024";
        ticketForm.screenName="screen-4";
        ticketForm.noOfTickets=4;
        ticketForm.noOfSeates=4;
        ticketForm.rowNo="D(12-15)";
        ticketForm.ticketPrice=1269;
        ticketForm.availability="yes";

        TicketService service=new TicketService();
        service.getticket(ticketForm);

        TicketForm ticketForm1 = service.getticket(ticketForm);
        Assertions.assertEquals(1269, ticketForm1.price);
        Assertions.assertNotNull(ticketForm1.SeatsAndRow);

        System.out.println(service.getticket(ticketForm));



    }
    @Test

    public void ticketTestLessThanPrice(){
        Ticket ticketForm=new Ticket();
        ticketForm.theaterName="GPR Multiplex";
        ticketForm.movieName="Kalki";
        ticketForm.date="07-07-2024";
        ticketForm.screenName="screen-4";
        ticketForm.noOfTickets=4;
        ticketForm.noOfSeates=4;
        ticketForm.rowNo="D(12-15)";
        ticketForm.ticketPrice=1000;
        ticketForm.availability="yes";

        TicketService service=new TicketService();
        service.getticket(ticketForm);


        Ticket ticketForm1=new Ticket();

         TicketForm t = service.getticket(ticketForm1);
        //Assertions.assertEquals(1000, ticketForm1.price);
        Assertions.assertNull(t);

        //System.out.println(service.getticket(ticketForm));



    }

}