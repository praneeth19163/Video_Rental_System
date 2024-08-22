public class Video {
    private String videoName;
    private boolean checkout;
    private int rating;

    public Video(String name) {
        this.videoName = name;
        this.checkout = false;
        this.rating = -1; // Rating not set initially
    }

    public String getName() {
        return videoName;
    }

    public void doCheckout() {
        if (!checkout) {
            checkout = true;
        } else {
            System.out.println("Video already checked out.");
        }
    }

    public void doReturn() {
        if (checkout) {
            checkout = false;
        } else {
            System.out.println("Video was not checked out.");
        }
    }

    public void receiveRating(int rating) {
        if (rating >= 1 && rating <= 10) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating. Please enter a rating between 1 and 10.");
        }
    }

    public int getRating() {
        return rating;
    }

    public boolean getCheckout() {
        return checkout;
    }
}
