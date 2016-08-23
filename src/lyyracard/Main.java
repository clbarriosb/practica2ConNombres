/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyyracard;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        
        LyyraCard cardPekka = new LyyraCard(20, "Pekka");
        LyyraCard cardBrian = new LyyraCard(30, "Brian" );
               
        cardPekka.payGourmet();
        System.out.println(cardPekka);
        
        cardBrian.payEconomical();
        System.out.println(cardBrian);
        
        cardPekka.loadMoney(20);
        System.out.println(cardPekka);
        
        cardBrian.payGourmet();
        System.out.println(cardBrian);
        
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        System.out.println(cardPekka);
        
        cardBrian.loadMoney(50);
        System.out.println(cardBrian);        
        
    }
    
}
