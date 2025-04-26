
public class PhotoManger {


	    LinkedList<Photo> allPhotos;
	    public int tagsNum;

	    // Constructor to initialize the photo manager
	    public PhotoManager() {
	        allPhotos = new LinkedList<Photo>();
	    }

	    // Returns the list of all photos managed
	    public LinkedList<Photo> getPhotos() {
	        return allPhotos;
	    }

	    // Adds a new photo if it doesn't already exist
	    public void addPhoto(Photo p) {
	        if (photoExists(p)) {
	            return; // avoid duplicates
	        }
	        allPhotos.insert(p);
	    }

	    // Deletes a photo based on its path
	    public void deletePhoto(String path) {
	        if (allPhotos.empty()) {
	            return;
	        }

	        allPhotos.findFirst();
	        while (!allPhotos.last()) {
	            if (allPhotos.retrieve().getPath().equals(path)) {
	                allPhotos.remove();
	                break;
	            }
	            allPhotos.findNext();
	        }

	        // Check the last photo as well
	        if (allPhotos.retrieve().getPath().equals(path)) {
	            allPhotos.remove();
	        }
	    }

	    // Helper method to check if a photo already exists
	    public boolean photoExists(Photo p) {
	        if (allPhotos.empty()) {
	            return false;
	        }

	        allPhotos.findFirst();
	        while (!allPhotos.last()) {
	            if (allPhotos.retrieve().getPath().equals(p.getPath())) {
	                return true;
	            }
	            allPhotos.findNext();
	        }

	        // Check the last photo separately
	        return allPhotos.retrieve().getPath().equals(p.getPath());
	    }
	}




