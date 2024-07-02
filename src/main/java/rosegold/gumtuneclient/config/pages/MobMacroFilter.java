package rosegold.gumtuneclient.config.pages;

import cc.polyfrost.oneconfig.config.annotations.Header;
import cc.polyfrost.oneconfig.config.annotations.Switch;

public class MobMacroFilter {
    @Header(
            text = "Hostile",
            size = 2
    )
    public static boolean hostile;
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
                name = "Skeletons",
                description = "Watchers, obsidian defenders etc"

        )
        public static boolean skeletons = false;

    @Header(
            text = "Passive",
            size = 2
    )
    public static boolean passive;

        @Switch(
                name = "Pigs"
        )
        public static boolean pig = false;
        @Switch(
                name = "Cows"
        )
        public static boolean cow = false;
        @Switch(
                name = "Chickens"
        )
        public static boolean chicken = false;
        @Switch(
                name = "Sheeps"
        )
        public static boolean sheep = false;
    @Header(
            text = "NPC"
    )
    public static boolean NPC;
    @Switch(
            name = "Ice Walker",
            size = 2
    )
    public static boolean iceWalker = false;

    @Switch(
            name = "Goblin"
    )
    public static boolean goblin = false;

    @Switch(
            name = "Treasure Hoarder"
    )
    public static boolean treasureHoarder = false;

    @Switch(
            name = "Star Sentry"

    )
    public static boolean starSentry = false;
}

