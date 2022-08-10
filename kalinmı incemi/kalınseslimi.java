public class kalınseslimi {
  public static void main(String[] args) {
    char karakter='ı';
    char[] kalin={'a','ı','u','o'};
    boolean b =false;
    for (char i :kalin){
      if(karakter==i){
        
        b=true;
      }
    }
    if(b==true){
      System.out.println("harf kalin");
    }
    else{
      System.out.println("harf ince");
    }
  }
}
