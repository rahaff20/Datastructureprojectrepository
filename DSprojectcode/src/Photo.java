
public class Photo {
    private String path;
    private LinkedList<String> tags;

    // Constructor to initialize a Photo with its file path and tags
    public Photo(String path, LinkedList<String> tags) {
        this.path = path;
        this.tags = tags;
    }

    // Returns the file path of this photo
    public String getPath() {
        return path;
    }

    // Returns the list of tags attached to this photo
    public LinkedList<String> getTags() {
        return tags;
    }

    // Displays the photo's path and its tags (used for checking)
    public void printPhotoDetails() {
        System.out.println("Photo Path: " + path);
        System.out.println("Tags:");
        tags.display();
    }

}
