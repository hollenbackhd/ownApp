package com.example.pokedex.data

import com.example.pokedex.R
import com.example.pokedex.model.entries


class Datasource {
    fun loadEntries(): List<entries> {
        return listOf<entries>(
            entries(R.string.bulbasaur, R.drawable.bulbasaur_pic),
            entries(R.string.charmander, R.drawable.charmander_pic),
            entries(R.string.squirtle, R.drawable.squirtle_pic),
            entries(R.string.chikorita, R.drawable.chikorita_pic),
            entries(R.string.cyndaquil, R.drawable.cyndaquil_pic),
            entries(R.string.totodile, R.drawable.totodile_pic),
            entries(R.string.treecko, R.drawable.treecko_pic),
            entries(R.string.torchic, R.drawable.torchic_pic),
            entries(R.string.mudkip, R.drawable.mudkip_pic),
            entries(R.string.turtwig, R.drawable.turtwig_pic),
            entries(R.string.chimchar, R.drawable.chimchar_pic),
            entries(R.string.piplub, R.drawable.piplub_pic),
            entries(R.string.rowlet, R.drawable.rowlet_pic),
            entries(R.string.litten, R.drawable.litten_pic),
            entries(R.string.popplio, R.drawable.popplio_pic),
            entries(R.string.snivy, R.drawable.snivy_pic),
            entries(R.string.tepig, R.drawable.tepig_pic),
            entries(R.string.oshawott, R.drawable.oshawott_pic),
            entries(R.string.chespin, R.drawable.chespin_pic),
            entries(R.string.fennekin, R.drawable.fennekin_pic),
            entries(R.string.froakie, R.drawable.froakie_pic),
            entries(R.string.grookey, R.drawable.grookey_pic),
            entries(R.string.scorbunny, R.drawable.scorbunny_pic),
            entries(R.string.sobble, R.drawable.sobble_pic)

            )
    }
}