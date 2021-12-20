/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act1Tablejava.Tabeljava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Belinda merlansyah
 */
@Controller

public class controller {
    @RequestMapping("/datawarga")
    public String getTable(Model Table){
        
        
        ArrayList<List<String>> data = new ArrayList();
        
        data.add(Arrays.asList("111", "Belinda", "2344220011","Surakarta"));
        data.add(Arrays.asList("222", "Merlansyah", "235520022","Yogyakarta")); 
        data.add(Arrays.asList("333", "Neymar", "236620033","Jakarta"));
        data.add(Arrays.asList("444", "muhammad", "237720044","Riau"));   
        data.add(Arrays.asList("555", "Barik", "238820055","Bandung"));   
        data.add(Arrays.asList("666", "zulfa", "239920066","Bengkulu"));
        data.add(Arrays.asList("777", "salsabila", "243320011","Makkasar"));
        data.add(Arrays.asList("888", "Anggi", "244420022","Surabaya"));
        data.add(Arrays.asList("999", "Hasian", "245520033","Banjarmasin"));
        data.add(Arrays.asList("100", "Alberta", "246620044","Denpasar"));
        data.add(Arrays.asList("101", "Aziz", "256620055","Kalimantan"));
        data.add(Arrays.asList("102", "Alfi", "256620066","Sulawesi"));
        data.add(Arrays.asList("103", "Anwar", "267720088","Boyolali"));
        data.add(Arrays.asList("104", "Nugraha", "268820099","Klaten"));
        data.add(Arrays.asList("105", "Fajri", "27990088","Karaganyar"));
        data.add(Arrays.asList("106", "Arga", "278820066","Sulawesi"));
        data.add(Arrays.asList("107", "Damas", "276620044","Ngawi"));
        data.add(Arrays.asList("108", "Ronald", "287720022","Kulon progo"));
        data.add(Arrays.asList("109", "Zidny", "289920044","Cirebon"));
        data.add(Arrays.asList("200", "Fadhilah", "285520066","Bekasi"));
        Table.addAttribute("tabel", data);
        
        return "tableviewear";
    }
}
