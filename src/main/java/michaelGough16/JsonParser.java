package michaelGough16;

public class JsonParser {
  private String author_name;
  private String author_email;
  private String author_url;

  protected void setAuthorName(String authorName){
    this.author_name = authorName;
  }

  protected void setAuthorEmail(String authorEmail){
    this.author_email = authorEmail;
  }

  protected void setAuthorUrl(String authorUrl){
    this.author_url = authorUrl;
  }

  protected String getAuthorName(){
    return author_name;
  }

  protected String getAuthorEmail(){
    return author_email;
  }

  protected String  getAuthorUrl(){
    return author_url;
  }


}
