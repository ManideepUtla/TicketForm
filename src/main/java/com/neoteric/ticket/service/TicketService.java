package com.neoteric.ticket.service;

import com.neoteric.ticket.model.Ticket;
import com.neoteric.ticket.model.TicketForm;

public class TicketService {

    public TicketForm getticket(Ticket ticketForm){

        TicketForm ticketForm1=null;


        if(ticketForm.noOfTickets == 4) {
            ticketForm1 = new TicketForm();


            ticketForm1.movieName = ticketForm.movieName;
            ticketForm1.price = ticketForm.ticketPrice;
            ticketForm1.SeatsAndRow = "D(12-15)";
        }
        return ticketForm1;
    }
}
