public class LinkedListPajak{
    NodePajak_13 head;
    int size;

    LinkedListPajak(){
        head = null;
        size = 0 ;
    }

    boolean isEmpty(){
        return head == null;
    }

    void addFirstPajak(Pajak_13 data){
        if(isEmpty()){
            head = new NodePajak_13(null, data, null);
        }else{
            NodePajak_13 newNode = new NodePajak_13(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLastPajak(Pajak_13 data){
        if(isEmpty()){
            addFirstT(data);
        }else{
            NodePajak_13 current = head;
            while(current.next != null){
                current = current.next;
            }
            NodePajak_13 newNode = new NodePajak_13(current, data, null);
            current.next = newNode;
            size++;
        }
    }
// int kode, int nominal, int denda, int bulan)
    void print(){
        if(!isEmpty()){
            System.out.println("");
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Daftar Transaksi ");
            System.out.println("++++++++++++++++++++++++");
            NodeTransaksi tmp = head;
            while(tmp != null){
                System.out.println("|"+tmp.data.kode+"\t"+tmp.data.nominal+"\t|"+tmp.data.denda+"\t|"+tmp.data.bulan);
                tmp = tmp.next;
            }
            
        }else{
            System.out.println("Linked List Kosong");
        }    
    }

    void Pendapatan(){
        if(!isEmpty()){
            NodePajak_13 tmp = head;
            int total = 0;
            while(tmp !=null){
                total += tmp.data.nominal;
                tmp = tmp.next;
            }
            System.out.println("Pendapatan hari : "+total);
        }else{
            System.out.println("Kososng!!");
        }
    }





    



    
}