package movies;

public class Movie {

    private String name;
    private String category;

    public Movie(String name,  String category) {
        this.name = name;
        this.category = category;
    }

    public String GetName() {
    return this.name;
}
    public String GetCategory() {
    return this.category;
}

    public void SetName(String name) {
    this.name = name;
}

    public void SetCategory(String category) {
    this.category = category;
}




    public static void main(String[] args) {

    Movie hero = new Movie("bob","scary");
    Movie newhero = new Movie("joe","scary");

}


//////////////Class ends//////////
}

