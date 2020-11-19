/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan62.oo.livingthing;

import model.Human;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program living thing
 */
public class PBOIF210119053Latihan62OOLivingThing {

    public static void main(String[] args) {
        Human human = new Human();
        human.setNama("Dean Ghifari Faturrahman ");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
    
}
