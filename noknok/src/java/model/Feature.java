package model;

/**
 *
 * @author PC
 */
public class Feature {
    private int id ;
    private String url;

    public Feature() {
    }

    public Feature(int id, String url) {
        this.id = id;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    
    
}
