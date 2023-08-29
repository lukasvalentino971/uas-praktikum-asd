public class NodeKendaraan_13 {
    Kendaraan_13 kendaraan;
    NodeKendaraan_13 prev, next;
    
    NodeKendaraan_13(NodeKendaraan_13 prev, Kendaraan_13 kendaraan, NodeKendaraan_13 next) {
        this.prev = prev;
        this.kendaraan = kendaraan;
        this.next = next;
    }
}