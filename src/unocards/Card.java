

package unocards;

/**
 *
 * @author Samira Diragen
 */
public class Card {

        public enum Colour {RED, YELLOW,GREEN,BLUE};
        public enum Value{ZERO,ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,SKIP, REVERSE, DRAW_TWO,DRAW_FOUR,WILDCARD};
        private final Colour color;
        private final Value value;
        
        public Card(Colour s, Value gVal)
        {
           color=s;
           value= gVal;
        }
	public Value getValue() {
		return this.value;
	}

	
	public Colour getColour() {
		return this.color;
        }
}

