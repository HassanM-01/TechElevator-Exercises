package com.techelevator.reservations.controllers;


import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.exception.HotelNotFoundException;
import com.techelevator.reservations.exception.ReservationNotFoundException;
import com.techelevator.reservations.model.Reservation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservationController {
    private ReservationDao reservationDao;

    public ReservationController (ReservationDao reservationDao){
        this.reservationDao = reservationDao;
    }

    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservations() {
        return reservationDao.findAll();
    }

    @RequestMapping(path = "reservations/{id}", method = RequestMethod.GET)
    public Reservation getReservation(@PathVariable int id) throws ReservationNotFoundException {
        return reservationDao.get(id);
    }

    @RequestMapping(path = "/hotels/{id}/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservationsByHotel(@PathVariable("id") int hotelID) throws HotelNotFoundException {
        return reservationDao.findByHotel(hotelID);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/hotels/{id}/reservations", method = RequestMethod.POST)
    public Reservation addReservation(@RequestBody Reservation reservation, @PathVariable("id") int hotelID)
            throws HotelNotFoundException {
        return reservationDao.create(reservation, hotelID);
    }

    @ResponseStatus (HttpStatus.NOT_FOUND)
    @RequestMapping (path = "reservation/{id}", method = RequestMethod.DELETE)
    public void delete (@PathVariable int id) throws ReservationNotFoundException {

        reservationDao.delete(id);

    }

    @RequestMapping (path = "reservations/{id}", method = RequestMethod.PUT)
    public Reservation update (@RequestBody Reservation reservation, @PathVariable int id) throws ReservationNotFoundException {

        return reservationDao.update(reservation, id);

    }



}

