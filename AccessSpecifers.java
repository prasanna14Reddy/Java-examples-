public class AccessSpecifers
{
      private String book_Name,book_Author;
      private double price;
       //getting book info using parameter
       public void getBookInfo(String bn,String aut,double p)
       {
    	  book_Name=bn;
    	  book_Author=aut;
    	  price=p;
       }
       public void disBookDet()
       {
    	   System.out.println(book_Name+" "+book_Author+" "+price);
       }
	public static void main(String[] args) {
	
           Example8 ob=new Example8();
           ob.getBookInfo("How to success", "xxxx",250);
           ob.disBookDet();
	}

}
