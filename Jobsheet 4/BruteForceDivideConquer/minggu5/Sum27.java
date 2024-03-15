package BruteForceDivideConquer.minggu5;

public class Sum27 {
    public int elemen;
    public double keuntungan[];
    public double total;

    Sum27(int elemen){
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]){
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r){
        if (l==r) {
            return arr[l];
        }else if (l < r) {
            int mid = (l+r)/2;
            double lsum = totalDC(arr, l, mid-1);
            double rsum = totalDC(arr, mid +1, r);
            return lsum + rsum+arr[mid];
        }
        return 0;
    }
}
// package BruteForceDivideConquer.minggu5;

// public class Sum27 {
//     public int elemen;
//     public double keuntungan[];
//     public double total;

//     Sum27(int elemen){
//         this.elemen = elemen;
//         this.keuntungan = new double[elemen];
//         this.total = 0;
//     }

//     String totalBF(double arr[]){
//         for (int i = 0; i < elemen; i++) {
//             total = total + arr[i];
//         }
//         // Menggunakan String.format() untuk membatasi output di belakang koma
//         return String.format("%.2f", total);
//     }

//     String totalDC(double arr[], int l, int r){
//         if (l==r) {
//             return String.format("%.2f", arr[l]);
//         }else if (l < r) {
//             int mid = (l+r)/2;
//             double lsum = Double.parseDouble(totalDC(arr, l, mid-1));
//             double rsum = Double.parseDouble(totalDC(arr, mid +1, r));
//             // Menggunakan String.format() untuk membatasi output di belakang koma
//             return String.format("%.2f", lsum + rsum+arr[mid]);
//         }
//         return "0.00";
//     }
// }
// MODIFIKASI