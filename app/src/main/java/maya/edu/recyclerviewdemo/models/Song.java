package maya.edu.recyclerviewdemo.models;

/**
 * Created by מאיה מסיקה on 13/07/16.
 */
public class Song {

    private  String title;
    private String description;
    private int imageResID;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResID() {
        return imageResID;
    }

    public void setImageResID(int imageResID) {
        this.imageResID = imageResID;
    }

    public Song(String title, String description, int imageResID) {
        this.title = title;
        this.description = description;
        this.imageResID = imageResID;
    }


}
