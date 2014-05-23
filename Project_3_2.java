/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris
 */
public class Project_3_2 {
    static int x = 3;
    static int y = 2;
    static int z = 12;
    
    public static void main(String[] args)  {
        
        while(z>8)  {
            ChangeYZ();
        }
        
        if(x==4)    {
            ChangeX();
        }
        
        if(z==4) {
            ChangeX();
        }
        else    {
            ChangeYZ();
        }
    
        System.out.println("x\ty\tz\t");
        System.out.println(x + "\t" + y + "\t" + z);
        
    }
    
    public static void ChangeYZ()   {
        y=y+2;
        z=z-4;
       
    }
    
    public static void ChangeX()    {
        x=x +1;
        y = y-1;
    }
    
}
