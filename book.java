public class book{
    private String id;
    private String title;
    private String author;
    private boolean isIssued;

    //Constructor
    public book(String id, String title, String author, boolean isIssued){
        this.id=id;
        this.title=title;
        this.author=author;
        this.isIssued=false;// it means by default , the book isn't issued.
    }

    //Getters
    public String getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isIssued(){
        return isIssued;
    }
    //Issue the book
    public void issueBook(){
        isIssued=true;
    }
    //Return the book
    public void returnBook(){
        isIssued=false;
    }
    //Book details
    public String toString(){
        return "Id:" + id + " , Title : " + title + " , Author : " + author + " , Issued : " + isIssued;
    }
}