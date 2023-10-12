package tugas;

import tugas.bfs.BreadthFirstSearch;
import tugas.dls.DepthLimitedSearch;
import tugas.ucs.NodeUCS;
import tugas.ucs.UniformCostSearch;

public class MainTest {
    public static void main(String[] args) {
        Node jampangKulon = new Node("Jampang Kulon");
        Node cikarang = new Node("Cikarang");
        Node nagraksari = new Node("Nagraksari");
        Node ciparay = new Node("Ciparay");

        jampangKulon.addTetangga(cikarang);
        jampangKulon.addTetangga(nagraksari);
        jampangKulon.addTetangga(ciparay);

        System.out.println("BFS");
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.search(jampangKulon, nagraksari);
        System.out.println();

        System.out.println("DLS");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        dls.setLimit(1);
        dls.search(jampangKulon, nagraksari);
        System.out.println();

        NodeUCS jkUCS = new NodeUCS(jampangKulon, 0);
        NodeUCS ckUCS = new NodeUCS(cikarang, 1);
        NodeUCS cpUCS = new NodeUCS(ciparay, 3);
        NodeUCS ngUCS = new NodeUCS(nagraksari, 4);

        jampangKulon.addTetangga(cikarang);
        jampangKulon.addTetangga(ciparay);
        jampangKulon.addTetangga(nagraksari);

        System.out.println("UCS");
        UniformCostSearch ucs = new UniformCostSearch();
        ucs.search(jkUCS, ngUCS);
        System.out.println();


    }
}
