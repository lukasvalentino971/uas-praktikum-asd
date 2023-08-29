public class LinkedListKendaraan{
    NodeKendaraan_13 head;
    int size;

    LinkedListKendaraan(){
        head = null ;
        size = 0 ;
    }

    boolean isEmpty(){
        return head == null;
    }

    void addFirst(Kendaraan_13 data){
        if(isEmpty()){
            head = new NodeKendaraan_13(null, data, null);
        }else{
            NodeKendaraan_13 newNode = new NodeKendaraan_13(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(Kendaraan_13 data){
        if(isEmpty()){
            addFirst(data);
        }else{
            NodeKendaraan_13 current = head;
            while(current.next != null){
                current = current.next;
            }
            NodeKendaraan_13 newNode = new NodeKendaraan_13(current, data, null);
            current.next = newNode;
            size++;
        }
    }
// String tnkb, String nama, String jenis, int cc, int tahun, int bulanHarus
    void printKendaraan(){
        if(!isEmpty()){
            System.out.println("");
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Daftar Kendaraan ");
            System.out.println("++++++++++++++++++++++++");
            System.out.println("|TNKB.\t|Nama\t|Jenis\t|CC\t|Tahun\t|Bulan|");
            NodeKendaraan_13 tmp = head;
            while(tmp != null){
                System.out.println("|"+tmp.data.tnkb+"\t"+tmp.data.nama+"\t|"+tmp.data.jenis+"\t|"+tmp.data.cc+"\t|"+tmp.data.tahun+"\t|"+tmp.data.bulanHarus);
                tmp = tmp.next;
            }
        }else{
            System.out.println("Linked List Kosong");
        }    
    }

    /*int cekKendaraan(int kd){
        NodeKendaraan_13 current = head;
            while(current.data.tnkb != kd){
                current = current.next;
            }
    }
    */
	
	int cekKendaraan(int kd){
        NodeKendaraan_13 current = head;
            while(current.data.tnkb != kd){
                current = current.next;
            }
    }
	


    double totalPembayaran(int kd, int jml){
        double total = 0;
        if(isEmpty()){
            System.out.println("LinkedListKososong");
        }else{
            NodeBarang current = head;
            while(current.data.tnkb != kd){
                current = current.next;
            }
            total += current.data.harga * jml;
        }
        return total;
    }





    





}