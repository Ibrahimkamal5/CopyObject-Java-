public class Book {
    private String title;
    private int pages;
    private char category;
    static private  int numberOfNumberObject = 0;

   public Book(){
       this.title = "Empty Title";
       this.pages = 10;
       this.category = 'o';
       numberOfNumberObject++;
   }
    public Book(String title , int pages , char category){
//       this.title = title;
//       this.pages = pages;
//       this.category = category;
        setTitle(title);
        setPages(pages);
        setCategory(category);
       numberOfNumberObject++;
    }

    public static int getNumberOfNumberObject(){
       return numberOfNumberObject;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
      if(pages >= 10){
          this.pages = pages;
      } else{
          this.pages = 10;
      }
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
       switch (category){
           case 'C': case 'c':
           case 'O': case 'o':
           case 'F': case 'f':
               this.category = category;
               break;
           default:
               this.category = 'o';
       }
    }

    private double getPagesPrice(){
       return (getPages() * 0.015);
    }
    private double getCategoryPrice(){
       switch (category){
           case 'C': case 'c':
               return 100;
           case 'F': case 'f':
               return 50;
           default:
               return 30;
       }
    }
    public double getBookPrice(){
       return (getPagesPrice() + getCategoryPrice());
    }

    @Override
    public String toString() {
        return (
                " title = " + title
                + "\n pages = " + pages
                + "\n category = " + category
                + "\n Pages Prsice = " + getPagesPrice()
                + "\n Category Price = " + getCategoryPrice()
                + "\n Book Price = " + getBookPrice()
        );
    }

public Book getCopy(){
       Book temp = new Book();
       temp.title = this.title;
       temp.pages = this.pages;
       temp.category = this.category;

       return temp;
}
}
