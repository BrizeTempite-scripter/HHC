public class sayilaribulma {
  public static void main(String[] args) {
    int[] sayilar ={1,2,5,7,9,0};
    int aranacak =5;
    boolean b =false;
    for(int a :sayilar){
      if(a==aranacak){
        b=true;
        break;
      }
    }
    if (b){
      System.out.println("sayi mevcut");
    }
    else {
      System.out.println("sayi bulumamaktadir");
    }
  }
}
