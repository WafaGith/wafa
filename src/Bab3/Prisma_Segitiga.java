/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab3;

/**
 *
 * @author HP
 */
public class Prisma_Segitiga extends Segitiga{
    double tinggiPrisma, vol;
    double volumePrisma(){
        vol = (Luas()*tinggiPrisma);
        return vol;
    }
            
}
