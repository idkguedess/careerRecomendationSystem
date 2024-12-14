package hpi.ulpgc.model;

public class FreelanceListing {
    private String title;
    private String category;
    private String description;
    private Double price;
    private String location;
    private User postedBy;

    public FreelanceListing(String title, String category, String description, Double price, String location, User postedBy) {
        this.title = title;
        this.category = category;
        this.description = description;
        this.price = price;
        this.location = location;
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
        return location;
    }

    public User getPostedBy() {
        return postedBy;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPostedBy(User postedBy) {
        this.postedBy = postedBy;
    }
}