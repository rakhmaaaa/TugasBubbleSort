import java.util.Scanner;

public class sortNama {
    private String[] data;
    public sortNama(){

    }
    public String[] getData() {
        return data;
    }
    public void setData(String[] data) { this.data = data;}

    public void sortData(){
        String[] nama = new String[50];
        Scanner input = new Scanner(System.in);
        try {
            for (int index = 0; index <= 49; index++){
                System.out.println("Masukkan Nama : ");
                nama[index] = input.nextLine();
                setData(nama);

                for (int i = 0; i < this.data.length; i++){
                    for (int j = i + 1; j < this.data.length - (i + 1); j++){
                        if (this.data[j].compareToIgnoreCase(this.data[i]) < 0){
                            String temp = this.data[i];
                            this.data[i] = this.data[j];
                            this.data[j] =  temp;
                        }
                    }
                }
                for (String datum : this.data) {
                    System.out.println(datum + " ");
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void PrintData(){
        for (String datum : this.data){
            System.out.println(datum + " ");
        }
    }

    public static void main(String[] args) {
        String[] s = new String[0];
        sortNama _mySort = new sortNama();
        _mySort.setData(s);
        _mySort.sortData();
        _mySort.PrintData();


    }
}
