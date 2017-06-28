package com.pieisnotpi.artoff;

public class Defaults
{
    public static final String
        adjectives =
            "#COMMENTS always start with a '#'\n" +
            "#ADJECTIVES contain a prefix [p(number)]\n" +
            "#NUMBER refers to the prefixes in the prefixes.txt file, with '0' being the first entry\n" +
            "#OTHERWISE, adjectives may be added and removed as pleased. Improper setup may cause crashes or improper grammar, so make backups!\n" +
            "[p0]giant\n" +
            "[p0]tiny\n" +
            "[p1]incognito\n" +
            "[p0]muscular\n" +
            "[p0]skinny\n" +
            "[p1]overweight\n" +
            "[p0]drunk\n" +
            "[p0]dead\n" +
            "[p0]stoned\n" +
            "[p0]vulgar\n" +
            "[p0]super-powered\n" +
            "[p1]engulfed\n" +
            "[p0]wooden\n" +
            "[p0]sad\n" +
            "[p0]handsome\n" +
            "[p0]hairy\n" +
            "[p0]soaked\n" +
            "[p0]sweaty\n" +
            "[p0]flabbergasted\n" +
            "[p1]enraged\n" +
            "[p1]ugly\n" +
            "[p0]frightened\n" +
            "[p1]overly emotional\n" +
            "[p1]angsty\n" +
            "[p0]nerdy\n" +
            "[p0]friendly\n" +
            "[p0]flamboyant\n" +
            "[p1]ill\n" +
            "[p0]distracted\n" +
            "[p0]self-conscious\n" +
            "[p1]ecstatic\n" +
            "[p0]fancy\n" +
            "[p1]entirely normal\n" +
            "[p0]violent";

    public static final String
        nouns =
            "#COMMENTS always start with a '#'\n" +
            "#NOUNS contain a prefix [p(number)]\n" +
            "#NUMBER refers to the prefixes in the prefixes.txt file, with '0' being the first entry\n" +
            "#NOUNS should be given plural versions, specified with a comma followed by the plural\n" +
            "#SYNTAX appears as [p(number)](singular noun),(plural noun)\n" +
            "#EXAMPLE: [p0]dog,dogs = prefix: a, singular: dog, plural: dogs\n" +
            "#OTHERWISE, nouns may be added and removed as pleased. Improper setup may cause crashes or improper grammar, so make backups!\n" +
            "[p3]Gary Busey,Gary Buseys\n" +
            "[p0]dog,dogs\n" +
            "[p0]Waffle House,Waffle Houses\n" +
            "[p0]cat,cats\n" +
            "[p0]mattress,mattresses\n" +
            "[p0]cloud,clouds\n" +
            "[p0]horse,horses\n" +
            "[p3]Jeff,Jeffs\n" +
            "[p0]house,houses\n" +
            "[p0]hand,hands\n" +
            "[p1]alien,aliens\n" +
            "[p0]computer,computers\n" +
            "[p0]piece of paper,pieces of paper\n" +
            "[p0]lamp,lamps\n" +
            "[p0]pirate ship,pirate ships\n" +
            "[p0]dolphin,dolphins\n" +
            "[p2]Hulk,Hulks\n" +
            "[p0]child,children\n" +
            "[p0]butt,butts\n" +
            "[p0]narwhal,narwhals\n" +
            "[p3]John Cena,John Cenas\n" +
            "[p0]car,cars\n" +
            "[p0]ghost,ghosts\n" +
            "[p0]unicorn,unicorns\n" +
            "[p3]Kermit,Kermits\n" +
            "[p0]pig,pigs\n" +
            "[p0]flying spaghetti monster,flying spaghetti monsters\n" +
            "[p0]shark,sharks\n" +
            "[p0]slug,slugs\n" +
            "[p0]mountain,mountains\n" +
            "[p0]couch,couches\n" +
            "[p0]clown,clowns\n" +
            "[p0]piece of toast,pieces of toast\n" +
            "[p0]lawn chair,lawn chairs\n" +
            "[p0]golf cart,golf carts\n" +
            "[p0]doctor,doctors\n";

    public static final String
        prompts =
            "#COMMENTS always start with a '#'\n" +
            "#NOUNS to be randomized are indicated with '[noun]', adjectives with '[adj]'\n" +
            "#NOUNS or ADJECTIVES can be given prefixes (as specified in prefixes.txt) by adding ',pre' to noun/adjective indicators\n" +
            "#SYNTAX appears as '[noun,pre]' or '[adj,pre]'\n" +
            "#EXAMPLE: [noun] = flying spaghetti monster, [noun,pre] = a flying spaghetti monster\n" +
            "#EXAMPLE 2: [noun] = Hulk, [noun,pre] = the Hulk\n" +
            "#CAPITALIZING 'noun' or 'adj' enables forced capitalization within prompts\n" +
            "#EXAMPLE: [noun] = flying spaghetti monster, [Noun] = Flying Spaghetti Monster\n" +
            "#NOUNS can be made plural by adding ',plural' to a noun indicator\n" +
            "#SYNTAX appears as '[noun,plural]'\n" +
            "#EXAMPLE: [noun] = piece of toast, [noun,plural] = pieces of toast\n" +
            "#OTHERWISE, prompts may be added and removed as pleased. Improper setup may cause crashes or improper grammar, so make backups!\n" +
            "A frankly far too [adj] [noun]\n" +
            "[noun,pre] riding [adj,pre] [noun]\n" +
            "[noun,pre]'s [adj] [noun]\n" +
            "[adj,pre] [noun] fighting [adj,pre] [noun]\n" +
            "The lovechild between [noun,pre] and [noun,pre]\n" +
            "If [noun,pre] was never [adj]\n" +
            "[noun,pre], but instead of being [adj], they're always [adj]\n" +
            "If [noun,pre] and [noun,pre] were [adj] friends\n" +
            "[adj,pre] TV show hosted by [noun,pre]\n" +
            "The next hit app: [Adj] [Noun]\n" +
            "The newest pageant: The Annual [Adj] [Noun] Pageant\n" +
            "[adj,pre] and [adj] [noun]\n" +
            "The kind've thing only [adj,pre] [noun] would invent\n" +
            "[noun,pre] that's always [adj]\n" +
            "[noun,pre] made solely out of [noun,plural] and [noun,plural]\n" +
            "If all [noun,plural] were replaced by [noun,plural]\n";

    public static final String
        prefixes =
            "#COMMENTS always start with a '#'\n" +
            "#PREFIXES are used internally for proper grammar (because real grammar systems are too much work)\n" +
            "#This file shouldn't be modified, unless absolutely necessary, as doing so may cause widespread failures (more widespread than your own, if you can believe it)\n" +
            "#If modifications are necessary, always include a singular space after each prefix. Failure to do so will cause more issues\n" +
            "#To reiterate, don't touch this. Don't. If you must, make backups!\n" +
            "a #[p0]\n" +
            "an #[p1]\n" +
            "the #[p2]\n" +
            (char) 0 + "#[p3] (it's just an invalid character that will get removed)\n";
}
