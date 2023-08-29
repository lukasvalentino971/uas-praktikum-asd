public class NodePajak_13 {
    Pajak_13 pajak;
    NodePajak_13 prev, next;
    
    NodePajak_13(NodePajak_13 prev, Pajak_13 pajak, NodePajak_13 next) {
        this.prev = prev;
        this.pajak = pajak;
        this.next = next;
    }
}