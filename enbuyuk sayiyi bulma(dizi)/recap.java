public class recap {
  public static void main(String[] args) {
    double[] sayilar={1,55,66,2,85,21,93,29,91,30};
    double toplam=0;
    double sayi=0;
    for(double a :sayilar){
      if(sayi<a){
        sayi=a;
      }
      toplam+=a;
    }
    System.out.println("en buyuks sayi: "+String.valueOf(sayi));
    System.out.println("toplam: "+String.valueOf(toplam));
  }
}
