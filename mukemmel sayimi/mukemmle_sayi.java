public class mukemmle_sayi {
  public static void main(String[] args) {
  int number =12;
   int sumer=0;

   for(int i =1;i<number;i++){
    if(number%i==0){
      sumer+=i;
      
    }
   }
   if(sumer==number){
    System.out.println("sayi mukemmel bir sayidir");
   }
   else{
    System.out.println("sayi mukemmel sayi degildir");
   }
  }
  
}
