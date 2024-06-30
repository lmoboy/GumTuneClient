package rosegold.gumtuneclient.config.pages;

import cc.polyfrost.oneconfig.config.annotations.Switch;

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
}
