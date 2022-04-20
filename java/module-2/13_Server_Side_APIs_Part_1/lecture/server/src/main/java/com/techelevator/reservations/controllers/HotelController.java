package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.model.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HotelController {

    private HotelDao hotelDao;
    private ReservationDao reservationDao;

    public HotelController() {
        this.hotelDao = new MemoryHotelDao();
        this.reservationDao = new MemoryReservationDao(hotelDao);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {
        return hotelDao.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        return hotelDao.get(id);
    }

    /**
    * List all reservations
     * @return a list of all the reservations in the system
    */

    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservation(){

        return reservationDao.findAll();
    }

/**
 * return reservation by ID
 * @param id of the reservation
 * @return all of the info of the reservation
 */

    @RequestMapping(path = "/reservations/{id}", method = RequestMethod.GET)
    public Reservation getReservation (@PathVariable int id) {
        return reservationDao.get(id);
    }


    /**
     * List reservations by hotel
     * @param id of the hotel
     * @return a list of all reservations by hotel
     */

    @RequestMapping(path = "/hotels/{id}/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservationByHotel (@PathVariable int id){
        return reservationDao.findByHotel(id);
    }

    /**
     * add a new reservation to a hotel
     *
     * @body reservation object
     * @return the created reservation
     */

    @RequestMapping(path= "/reservations", method = RequestMethod.POST)
    public Reservation newReservation(@RequestBody Reservation reservation){
        return reservationDao.create(reservation, reservation.getHotelID());
    }

    /**
     * @param state the state to filter by
     * @param city cuty to filter by
     * @return a list of hotels that match the city and state
     *
     */

    @RequestMapping(path= "/filter", method = RequestMethod.GET)
    public List<Hotel> filterByCityState (@RequestParam String state, @RequestParam(required = false) String city) {
        List<Hotel> filteredHotels = new ArrayList<>();
        List<Hotel> allHotels = list();

        for (Hotel hotel : allHotels) {
            if (city != null) {
                if (hotel.getAddress().getCity().toLowerCase().equals(city.toLowerCase())) {
                    filteredHotels.add(hotel);
                }
            } else {
                if (hotel.getAddress().getState().toLowerCase().equals(state.toLowerCase())) {
                    filteredHotels.add(hotel);
                }
            }

        }
        return filteredHotels;
    }



}
