/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.util.Scanner;

/**
 *
 * @author kenny
 */
public class PokeTrader {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

		String[] pokeParty = { "PIKACHU", "CHARMELEON", "GEODUDE", "GYARADOS", "BUTTERFREE", "MANKEY" };

		int x;

		do
		{
			System.out.println("EXCHANGE POKEMON\n");
			System.out.println("\t0. " + pokeParty[0]);
			for ( int i=1; i<pokeParty.length; i++ )
				System.out.println("\t" + i + ". " + pokeParty[i]);

			System.out.println("\nChoose a Pokemon to exchange with " + pokeParty[0] + ". (Or enter 0 to quit.)");
			System.out.print("> ");
			x = keyboard.nextInt();

			// add code here to swap the Pokemon in slot 0 with the Pokemon in slot x
                        String temp=pokeParty[0];
                        pokeParty[0]=pokeParty[x];
                        pokeParty[x]=temp;
                                

		} while ( x > 0 );

    }
    
}
