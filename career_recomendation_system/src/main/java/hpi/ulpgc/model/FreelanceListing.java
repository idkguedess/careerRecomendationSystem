package hpi.ulpgc.model;

public class FreelanceListing {
    private String title;
    private String category;
    private String description;
    private Double price;
    private String Location;
    private String postedBy;

    public void FreelanceListing(String title, String category, String description, Double price, String Location, String postedBy) {
        this.title = title;
        this.category = category;
        this.description = description;
        this.price = price;
        this.Location = Location;
        this.postedBy = postedBy;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getLocation() {
        return Location;
    }

    public String getPostedBy() {
        return postedBy;
    }
}
