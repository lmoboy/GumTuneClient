package rosegold.gumtuneclient.config.pages;

import cc.polyfrost.oneconfig.config.annotations.Switch;
import cc.polyfrost.oneconfig.config.annotations.Text;

public class MobMacroFilter {
    @Switch(
            name = "Zombies"
    )
    public static boolean zombies = false;

    @Switch(
            name = "Spiders"
    )
    public static boolean spiders = false;

    @Switch(
            name = "Wolves"
    )
    public static boolean wolves = false;

    @Switch(
            name = "Endermen"
    )
    public static boolean endermen = false;

    @Switch(
            name = "Slime"
    )
    public static boolean slime = false;

    @Switch(
            name = "Magma Cube"
    )
    public static boolean magmaCubes = false;

    @Switch(
            name = "Creepers"
    )
    public static boolean creepers = false;

    @Switch(
            name = "SilverFish"
    )
    public static boolean silverfish = false;

    @Switch(
            name = "Endermite"
    )
    public static boolean endermite = false;

    @Switch(
            name = "Skeletons"
    )
    public static boolean skeletons = false;

//    @Switch(
//            name = "Ice Walker"
//    )
//    public static boolean iceWalker = false;
//
//    @Switch(
//            name = "Goblin"
//    )
//    public static boolean goblin = false;
//
//    @Switch(
//            name = "Treasure Hoarder"
//    )
//    public static boolean treasureHoarder = false;
//
//    @Switch(
//            name = "Star Sentry"
//
//    )
//    public static boolean starSentry = false;
}

