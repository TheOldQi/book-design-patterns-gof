package com.qixiafei.book.design.patterns.gof.facade.trip;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/14 11:40</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class TripFacade {

    private KongfuRestaurant kongfuRestaurant = new KongfuRestaurant();
    private QuanJuDeRestaurant quanJuDeRestaurant = new QuanJuDeRestaurant();
    private HomeInHotel homeInHotel = new HomeInHotel();
    private PekingHotel pekingHotel = new PekingHotel();

    public void eat(String food) {
        if (food.equals("chicken")) {
            kongfuRestaurant.orderChicken();
        } else if (food.equals("egg")) {
            kongfuRestaurant.egg();
        } else if (food.equals("roastDuck")) {
            quanJuDeRestaurant.roastDuc();
        } else if (food.equals("fryBall")) {
            quanJuDeRestaurant.fryBall();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void sleep(double budget) {
        if (budget > 5000) {
            pekingHotel.reservationRoom();
        } else {
            homeInHotel.reservationRoom();
        }
    }
}
