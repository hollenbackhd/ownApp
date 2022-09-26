package com.example.pokedex.data

import com.example.pokedex.R
import com.example.pokedex.model.entries


class Datasource {
    fun loadEntries(): List<entries> {
        return listOf<entries>(
            entries(R.string.bulbasaur),
            entries(R.string.charmander),
            entries(R.string.squirtle),
            entries(R.string.chikorita),
            entries(R.string.cyndaquil),
            entries(R.string.totodile),
            entries(R.string.treecko),
            entries(R.string.torchic),
            entries(R.string.mudkip),
            entries(R.string.turtwig),
            entries(R.string.chimchar),
            entries(R.string.piplub),
            entries(R.string.rowlet),
            entries(R.string.litten),
            entries(R.string.popplio),
            entries(R.string.snivy),
            entries(R.string.tepig),
            entries(R.string.oshawott),
            entries(R.string.chespin),
            entries(R.string.fennekin),
            entries(R.string.froakie),
            entries(R.string.grookey),
            entries(R.string.scorbunny),
            entries(R.string.sobble),
            entries(R.string.sprigatito),
            entries(R.string.fuecoco),
            entries(R.string.quaxly)

            )
    }
}