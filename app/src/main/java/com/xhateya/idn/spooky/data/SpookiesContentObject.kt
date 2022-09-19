package com.xhateya.idn.spooky.data

import com.xhateya.idn.spooky.R

object SpookiesContentObject {
    private val spookyTitle = arrayOf(
        "PSYCHOSIS",
        "BEDTIME",
        "THE RAKE",
        "HERE COMES THE CHILD BRIDE",
        "INFECTED TOWN",
        "NOEND HOUSE",
        "SLENDERMAN",
        "THE SMILING MAN",
        "CANDLE COVE",
        "AUTOPILOT"
    )

    private val spookyReview = arrayOf(
        "Scary",
        "Thrilling",
        "Exciting",
        "Exciting",
        "Thrilling",
        "Scary",
        "Scary",
        "Thrilling",
        "Scary",
        "Exciting"
    )
    private val spookyStories= arrayOf(
        "After all, a sane man would have fallen for the deception long ago.\n" +
                "\n" +
                "The doctor wanted to smile. He wanted to whisper words of encouragement to the delusional man. He wanted to scream, but the nerve filaments wrapped around his head and into his eyes made him do otherwise. His body walked into the cell like a puppet, and told the patient, once more, that he was wrong, and that there was nobody trying to deceive him.",
        "Bedtime is supposed to be a happy event for a tired child; for me it was terrifying. While some children might complain about being put to bed before they have finished watching a film or playing their favourite  video game, when I was a child, night time was something to truly fear. Somewhere in the back of my mind it still is.",
        "As the sun begins to set and the trees huddle together in small dark groups as if shielding themselves against the coming of night, you step quietly and quickly through the carpet of fallen leaves and stray twigs, recognising and noting as you do every rustle, every snap of a branch created by your own footfalls. You note them so that you can distinguish them from the other sounds, the soft rustlings of leaves, the crack of bracken somewhere behind you. You increase your speed knowing that night is not the only thing drawing closer. The sound increases as your pace and heartbeats quicken, you turn and in the fading light catch a single glimpse of the hunched, crawling thing that is pursuing you. Creeping forward like an animal and yet looking so horribly human. You only caught a single glimpse, but then you start to run. One glimpse, is enough.",
        "What could be more horrific than the ritualistic forced marriages between young girls and opportunistic older men held covertly in the US? This story. This story is more horrific than that.Creeping forward like an animal and yet looking so horribly human. You only caught a single glimpse, but then you start to run. One glimpse, is enough.",
        "This series deserves serious credit for a few reasons. One, it’s excellent. Two, it’s long — but the ending delivers. And three, it’s totally unique in that the author wrote three series by three separate Reddit accounts that are all interconnected by one moldy plot line. There’s a guide to all three separate series here\n" +
                ", thankfully.",
        "This little shop of horrors is so revered in the creepypasta community that an entire season of the pasta Zero\n" +
               "series used it as inspiration. Haunted houses are full of sticky fake blood and smoke machines and not much else, right? Well, don’t hold your breath.",
        "Slenderman is perhaps the best-known product of creepypasta. There was that wildly popular Slenderman game\n" +
                "that shot a bunch of “Let’s Play” YouTubers into the spotlight, the real-life Slenderman stabbings that claimed young lives, and now a Slenderman movie\n" +
                ". The only reason good ole’ Slendy isn’t higher up is because the original tall tales leave more legend to be desired. But, alas, the cultural impact is undeniable.",
        "We’ve entered the top 10. If you haven’t met, allow me to introduce you to the Smiling Man. The short film produced in honor of this truly nightmarish meet-up (whether it’s true or fabricated, we’ll never really know) is very well done, but do yourself a favor and read the story first. It’s the kind of encounter everyone can imagine experiencing on the street late at night. So just don’t take walks in the wee hours by yourself, alright?",
        "Here’s another creepypasta entry that made it onto a season of Channel Zero. This fake forum discussion about a childhood TV series is hauntingly well-written and surprisingly simple. Well, except for the nightmare fuel tucked in-between the memories of a shockingly grim show. I’ve read this story at least five separate times, and the ending still gives me goosebumps.",
        "The thing that’s so horrific about “Autopilot” is that it’s based on not one, not two, but tens of true stories that echo exactly what happens here. It’s a terrifying phenomenon, and it could happen to anyone. But maybe, after reading this, it won’t happen to you."

    )

    private val spookyPicture = intArrayOf(
        R.drawable.satu,
        R.drawable.dua,
        R.drawable.tiga,
        R.drawable.empat,
        R.drawable.lima,
        R.drawable.enam,
        R.drawable.tujuh,
        R.drawable.delapan,
        R.drawable.sembilan,
        R.drawable.sepuluh,




    )

    val listContent : ArrayList<SpookiesContent>
    get() {
        val list = arrayListOf<SpookiesContent>()
        for (position in spookyTitle.indices) {
            val spooky = SpookiesContent()
            spooky.title = spookyTitle[position]
            spooky.review= spookyReview[position]
            spooky.stories= spookyStories[position]
            spooky.picture= spookyPicture[position]
            list.add(spooky)
        }
        return list
        }
    }