package TourLab09;

public class Main {
    public static void main(String[] args) {
        SingleTour singleTour = new SingleTour("Japan",4000,40,20);
        System.out.println(singleTour.getName());
        System.out.println(singleTour.getPrice());
        System.out.println(singleTour.getAvailableSeats());

        Tour tour = new PackageTour("Special Price",
                new SingleTour("Tokyo",400,40,20),
                new SingleTour("Osaka",450,100,40));
        System.out.println(tour.getName());
        System.out.println(tour.getPrice());
        System.out.println(tour.getAvailableSeats());
    }


}