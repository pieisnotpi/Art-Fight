package com.pieisnotpi.artoff;

public class Defaults
{
    public static final String
        adjectives =
            "#COMMENTS always start with a '#'\n" +
            "#Each adjective contains a prefix [p(number)]\n" +
            "#This number refers to the prefixes in the prefixes.txt file, with '0' being the first entry\n" +
            "#Other than that, adjectives may be added and removed as pleased. Improper setup may cause crashes or improper grammar, so make backups!\n" +
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
            "[p0]fancy\n";

    public static final String
        nouns =
            "#COMMENTS always start with a '#'\n" +
            "#Each noun contains a prefix [p(number)]\n" +
            "#This number refers to the prefixes in the prefixes.txt file, with '0' being the first entry\n" +
            "#Other than that, nouns may be added and removed as pleased. Improper setup may cause crashes or improper grammar, so make backups!\n" +
            "[p3]Gary Busey\n" +
            "[p0]dog\n" +
            "[p0]Waffle House\n" +
            "[p0]cat\n" +
            "[p0]mattress\n" +
            "[p0]cloud\n" +
            "[p0]horse\n" +
            "[p3]Jeff\n" +
            "[p0]house\n" +
            "[p0]hand\n" +
            "[p1]alien\n" +
            "[p0]computer\n" +
            "[p0]piece of paper\n" +
            "[p0]lamp\n" +
            "[p0]pirate ship\n" +
            "[p0]dolphin\n" +
            "[p2]Hulk\n" +
            "[p0]child\n" +
            "[p0]butt\n" +
            "[p0]narwhal\n" +
            "[p3]John Cena\n" +
            "[p0]car\n" +
            "[p0]ghost\n" +
            "[p0]unicorn\n" +
            "[p3]Kermit\n" +
            "[p0]pig\n" +
            "[p0]flying spaghetti monster\n" +
            "[p0]shark\n" +
            "[p0]slug\n" +
            "[p0]mountain\n" +
            "[p0]couch\n" +
            "[p0]clown\n" +
            "[p0]piece of toast\n" +
            "[p1]apple\n";

    public static final String
        prompts =
            "#COMMENTS always start with a '#'\n" +
            "#NOUNS to be randomized are indicated with '[noun]', adjectives with '[adj]'\n" +
            "#NOUNS or ADJECTIVES may be given the ',p' suffix to add prefixes (as specified in prefixes.txt) to nouns/adjectives\n" +
            "#This appears as '[noun,p]' or '[adj,p]'\n" +
            "#EXAMPLE: [noun] = flying spaghetti monster, [noun,p] = a flying spaghetti monster\n" +
            "#EXAMPLE 2: [noun] = Hulk, [noun,p] = the Hulk" +
            "#Capitalizing 'noun' or 'adj' enables forced capitalization within prompts\n" +
            "#Example: [noun] = flying spaghetti monster, [Noun] = Flying Spaghetti Monster\n" +
            "#Other than that, prompts may be added and removed as pleased. Improper setup may cause crashes or improper grammar, so make backups!\n" +
            "A frankly far too [adj] [noun]\n" +
            "[noun,p] riding [adj,p] [noun]\n" +
            "[noun,p]'s [adj] [noun]\n" +
            "[adj,p] [noun] fighting [adj,p] [noun]\n" +
            "The lovechild between [noun,p] and [noun,p]\n" +
            "If [noun,p] was never [adj]\n" +
            "[noun,p], but instead of being [adj], they're always [adj]\n" +
            "If [noun,p] and [noun,p] were [adj] friends\n" +
            "[adj,p] TV show hosted by [noun,p]\n" +
            "The next hit app: [Adj] [Noun]\n" +
            "The newest pageant: The Annual [Adj] [Noun] Pageant\n" +
            "[adj,p], [adj], [noun]\n" +
            "The kind've thing only [adj,p] [noun] would invent\n" +
            "[noun,p] that's always [adj]\n";

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
