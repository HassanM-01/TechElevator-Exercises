package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDao dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDao();
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public List<Auction> list() {
//
//        return dao.list();
//    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) {
        return dao.get(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Auction newAuction(@RequestBody Auction auction) {
        return dao.create(auction);
    }

//    @RequestMapping( method = RequestMethod.GET)
//    public List<Auction> filterByTitle(@RequestParam(value="title_like", defaultValue = "") String title) {
//       // List<Auction> filteredAuctions = new ArrayList<>();
//
//        if (title != null){
//            return dao.searchByTitle(title);
//        } else {
//           return  dao.list();
//        }
//
//    }

    @RequestMapping( method = RequestMethod.GET)
    public List<Auction> filterByTitle(@RequestParam(value="title_like", defaultValue = "") String title, @RequestParam (value = "currentBid_lte", defaultValue = "0") double currentBid_lte ) {

        if (!title.equals("") && currentBid_lte != 0){

            return dao.searchByTitleAndPrice(title, currentBid_lte);

        } else if (!title.equals("")){

            return  dao.searchByTitle(title);

        } else if (currentBid_lte != 0){

            return dao.searchByPrice(currentBid_lte);
        }

        else return dao.list();

    }




}