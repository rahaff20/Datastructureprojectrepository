
public class Album {
	  private String name;
	    private String condition;
	    private PhotoManager manager;
	    private int totalComparisons = 0;

	    // Constructor to create a new Album with a name, a condition, and a linked PhotoManager
	    public Album(String name, String condition, PhotoManager manager) {
	        this.name = name;
	        this.condition = condition;
	        this.manager = manager;
	    }

	    // Returns the name of the album
	    public String getName() {
	        return name;
	    }

	    // Returns the condition set for the album
	    public String getCondition() {
	        return condition;
	    }

	    // Returns the PhotoManager associated with this album
	    public PhotoManager getManager() {
	        return manager;
	    }
	}


