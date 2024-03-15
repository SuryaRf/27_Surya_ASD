// package BruteForceDivideConquer.minggu5;
// public class Faktorial27 {
//     public int nilai;

//     public int faktorialBF(int n){
//         int fakto = 1;
//         for(int i = 1; i <= n; i++){
//             fakto = fakto * i;
//         }
//         return fakto;
//     }

//     public int faktorialDC(int n){
//         if(n == 1){
//             return 1;
//         }else{
//             int fakto = n * faktorialDC(n-1);
//             return fakto;
//         }
//     }
//MODIF 2


     //WHILE LOOP
    // public int faktorialBF(int n){
    //     int fakto = 1;
    //     int i = 1;
    //     while(i <= n){
    //       fakto = fakto * i;
    //       i++;
    //     }
    //     return fakto;
    // }
        // DO- While
    // public int faktorialBF(int n){
    //     int fakto = 1;
    //     int i = 1;
    //     do{
    //       fakto = fakto * i;
    //       i++;
    //     }while(i <= n);
    //     return fakto;
    //   }
    
// }
// MODIF 1


package BruteForceDivideConquer.minggu5;
class Faktorial27 {

    public int nilai;
  
    public Faktorial27(int nilai) {
      this.nilai = nilai;
    }
  
    public int faktorialBF() {
      int fakto = 1;
      for (int i = 1; i <= nilai; i++) {
        fakto = fakto * i;
      }
      return fakto;
    }
  
    public int faktorialDC() {
      if (nilai == 1) {
        return 1;
      } else {
        int fakto = nilai * faktorialDC();
        return fakto;
      }
    }
  }

//MODIF 3
