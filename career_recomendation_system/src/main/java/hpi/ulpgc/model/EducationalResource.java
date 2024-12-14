package hpi.ulpgc.model;

public class EducationalResource {
    private String title;
    private ResourceCategory category;
    private String description;

    public EducationalResource(String title, ResourceCategory category, String description) {
        this.title = title;
        this.category = category;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public ResourceCategory getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(ResourceCategory category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
