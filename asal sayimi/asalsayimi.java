public class asalsayimi {
  public static void main(String[] args) {
    int number=20;
    boolean b =false;
    for (int i =2;i<number;i++){
      if(number%i==0){

        b=true;
        break;
      }

    }
    if(b==false){
      System.out.println("sayi asladir");
    }
    else{
      System.out.println("sayi asal degil");
    }
  }
}
