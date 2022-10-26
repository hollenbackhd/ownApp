package com.example.pokedex.data

import com.example.pokedex.R
import com.example.pokedex.model.entries

class GameEntries {
    fun gameEntries(): List<entries> {
        return listOf<entries>(
            entries(R.string.bulbasaur, R.drawable.bulbasaur_silpic),
            entries(R.string.charmander, R.drawable.charmander_silpic),
            entries(R.string.squirtle, R.drawable.squirtle_silpic),
            entries(R.string.chikorita, R.drawable.chikorita_silpic),
            entries(R.string.cyndaquil, R.drawable.cyndaquil_silpic),
            entries(R.string.totodile, R.drawable.totodile_silpic),
            entries(R.string.treecko, R.drawable.treecko_silpic),
            entries(R.string.torchic, R.drawable.torchic_silpic),
            entries(R.string.mudkip, R.drawable.mudkip_silpic),
            entries(R.string.turtwig, R.drawable.turtwig_silpic),
            entries(R.string.chimchar, R.drawable.chimchar_silpic),
            entries(R.string.piplub, R.drawable.piplub_silpic),
            entries(R.string.rowlet, R.drawable.rowlet_silpic),
            entries(R.string.litten, R.drawable.litten_silpic),
            entries(R.string.popplio, R.drawable.popplio_silpic),
            entries(R.string.snivy, R.drawable.snivy_silpic),
            entries(R.string.tepig, R.drawable.tepig_silpic),
            entries(R.string.oshawott, R.drawable.oshawott_silpic),
            entries(R.string.chespin, R.drawable.chespin_silpic),
            entries(R.string.fennekin, R.drawable.fennekin_silpic),
            entries(R.string.froakie, R.drawable.froakie_silpic),
            entries(R.string.grookey, R.drawable.grookey_silpic),
            entries(R.string.scorbunny, R.drawable.scorbunny_silpic),
            entries(R.string.sobble, R.drawable.sobble_silpic)

        )
    }

}