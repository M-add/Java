import java.util.Random;

public class wwe {
    public static void main(String[] args) {
        String[] wrestlers = {"John Cena", "The Rock", "Stone Cold Steve Austin", "Hulk Hogan", "Undertaker", 
                              "Triple H", "Bret Hart", "Shawn Michaels", "Randy Orton", "Roman Reigns", 
                              "Seth Rollins", "CM Punk", "AJ Styles", "Dean Ambrose", "Eddie Guerrero", 
                              "Rey Mysterio", "Kurt Angle", "Edge", "Batista", "Chris Jericho", 
                              "Kevin Owens", "Samoa Joe", "Finn Balor", "Brock Lesnar", "Goldberg", 
                              "Bray Wyatt", "The Fiend", "Big Show", "Kane", "Daniel Bryan", 
                              "Mick Foley", "Booker T", "Rob Van Dam", "Jeff Hardy", "Matt Hardy", 
                              "Ric Flair", "Sting", "Scott Hall", "Kevin Nash", "X-Pac", 
                              "Kofi Kingston", "Big E", "Xavier Woods", "Bobby Lashley", "Drew McIntyre", 
                              "Sheamus", "Cesaro", "Rusev", "Jinder Mahal", "Randy Savage", 
                              "Ricky Steamboat", "Jake Roberts", "Ted DiBiase", "Mr. Perfect", "Ultimate Warrior", 
                              "British Bulldog", "Owen Hart", "Chris Benoit", "Eddie Guerrero", "Chyna", 
                              "Trish Stratus", "Lita", "Beth Phoenix", "Natalya", "Charlotte Flair", 
                              "Becky Lynch", "Bayley", "Sasha Banks", "Paige", "Asuka", 
                              "Naomi", "Carmella", "Alexa Bliss", "Nia Jax", "Shayna Baszler", 
                              "Bianca Belair", "Brie Bella", "Nikki Bella", "AJ Lee", "Eva Marie", 
                              "Maryse", "Mickie James", "Kelly Kelly", "Michelle McCool", "Layla", 
                              "Kaitlyn", "Emma", "Dana Brooke", "Mandy Rose", "Sonya Deville", 
                              "Ruby Riott", "Liv Morgan", "Sarah Logan", "Tamina", "Nikki Cross"};

        Random random = new Random();
        int index = random.nextInt(wrestlers.length);
        String wrestlerName = wrestlers[index];
        System.out.println("The random WWE wrestler name is: " + wrestlerName);
    }
}
