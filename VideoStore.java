public class VideoStore {
    private Video[] store;
    private int count;

    public VideoStore(int size) {
        store = new Video[size];
        count = 0;
    }

    public void addVideo(String name) {
        if (count < store.length) {
            store[count++] = new Video(name);
            System.out.println("Video \"" + name + "\" added successfully.");
        } else {
            System.out.println("Store is full.");
        }
    }

    public void doCheckout(String name) {
        Video video = findVideo(name);
        if (video != null) {
            video.doCheckout();
            System.out.println("Video \"" + name + "\" checked out successfully.");
        } else {
            System.out.println("Video \"" + name + "\" not found.");
        }
    }

    public void doReturn(String name) {
        Video video = findVideo(name);
        if (video != null) {
            video.doReturn();
            System.out.println("Video \"" + name + "\" returned successfully.");
        } else {
            System.out.println("Video \"" + name + "\" not found.");
        }
    }

    public void receiveRating(String name, int rating) {
        Video video = findVideo(name);
        if (video != null) {
            video.receiveRating(rating);
            System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
        } else {
            System.out.println("Video \"" + name + "\" not found.");
        }
    }

    public void listInventory() {
        System.out.println("Video Name\tCheckout Status\tRating");
        for (int i = 0; i < count; i++) {
            Video video = store[i];
            System.out.println(video.getName() + "\t" + video.getCheckout() + "\t" + video.getRating());
        }
    }

    private Video findVideo(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                return store[i];
            }
        }
        return null;
    }
}
