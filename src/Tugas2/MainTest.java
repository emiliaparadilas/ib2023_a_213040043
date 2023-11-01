package Tugas2;

public class MainTest {
    public static void main(String[] args) {
        Node arad = new Node("Arad");;
        Node bucharest = new Node("Bucharest");
        Node ukraina = new Node("Ukraina");
        Node belarus = new Node("Belarus");
        Node moldova = new Node("Moldova");
        Node polandia= new Node("Polandia");
        Node rumania = new Node("Rumania");
        Node bulgaria = new Node("Bulgaria");
        Node slowakia = new Node("Slowakia");
        Node hungaria = new Node("Hungaria");
        Node slovenia = new Node("Slovenia");
        Node kroasia = new Node("Kroasia");
        Node serbia = new Node("Serbia");
        Node montenegro = new Node("Montenegro");
        Node makedoniautara = new Node("Makedonia Utara");
        Node albania = new Node("Albania");
        Node kosova = new Node("Kosovo");
        Node latvia = new Node("Latvia");
        Node lituania = new Node("Lituania");
        Node estonia = new Node("Estonia");


        arad.addTetangga(estonia);
        arad.addTetangga(kosova);
        arad.addTetangga(latvia);

        bucharest.addTetangga(rumania);
        bucharest.addTetangga(makedoniautara);
        bucharest.addTetangga(bulgaria);
        bucharest.addTetangga(lituania);

        belarus.addTetangga(moldova);
        belarus.addTetangga(albania);
        belarus.addTetangga(makedoniautara);

        moldova.addTetangga(kroasia);
        moldova.addTetangga(belarus);

        polandia.addTetangga(slowakia);

        rumania.addTetangga(kosova);
        rumania.addTetangga(ukraina);

        bulgaria.addTetangga(ukraina);

        slowakia.addTetangga(lituania);
        slowakia.addTetangga(polandia);

        hungaria.addTetangga(serbia);
        hungaria.addTetangga(estonia);

        slovenia.addTetangga(latvia);
        slovenia.addTetangga(kroasia);

        kroasia.addTetangga(slovenia);
        kroasia.addTetangga(moldova);

        serbia.addTetangga(hungaria);

        montenegro.addTetangga(estonia);
        montenegro.addTetangga(kosova);

        makedoniautara.addTetangga(albania);
        makedoniautara.addTetangga(belarus);
        makedoniautara.addTetangga(ukraina);

        albania.addTetangga(kosova);
        albania.addTetangga(belarus);
        albania.addTetangga(makedoniautara);

        kosova.addTetangga(arad);
        kosova.addTetangga(montenegro);
        kosova.addTetangga(rumania);
        kosova.addTetangga(albania);

        latvia.addTetangga(arad);
        latvia.addTetangga(slovenia);

        lituania.addTetangga(ukraina);
        lituania.addTetangga(estonia);
        lituania.addTetangga(slowakia);

        estonia.addTetangga(hungaria);
        estonia.addTetangga(lituania);

        System.out.println("DLS");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        dls.setLimit(10);
        dls.search(arad, bucharest);
        System.out.println();
    }
}
