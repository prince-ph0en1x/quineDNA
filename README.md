# quineDNA

This personal project is an amalgamation of several of my favourite programming topics.
It integrates quines, genetic programming, fractals and cellular automata.

---

## Versions

### Legend

<img src="https://github.com/prince-ph0en1x/quineDNA/blob/master/legend.png" width="350">

* Each circle represent a cell of various types, and exists physically as a .java code file when the simulation is run.
* The various notations used for depicting how each version works is shows below.
* The above structures, when *dark* denote the first generating block (which might be unique like in v5), while when *faded* depict the repetation block in the subsequent generations.
* *Solid grey* arrows denote asexual breeding, *red/blue* arrows denote sexual breeding by crossover, while *dashed grey* arrows denote inter-organism growth from zygote.

### V1 : Asexual Unicellular Budding

<img src="https://github.com/prince-ph0en1x/quineDNA/blob/master/v1.png" width="350">

### V2 : Asexual Unicellular Binary Division

<img src="https://github.com/prince-ph0en1x/quineDNA/blob/master/v2.png" width="350">

### V3 : Asexual Multicellular Budding

<img src="https://github.com/prince-ph0en1x/quineDNA/blob/master/v3.png" width="350">

### V4 : Asexual Multicellular Binary Division

<img src="https://github.com/prince-ph0en1x/quineDNA/blob/master/v4.png" width="350">

### V5 : Sexual Inbreeding

<img src="https://github.com/prince-ph0en1x/quineDNA/blob/master/v5.png" width="350">

---

## FAQs

* All quines are non-cheating quines (they don't read their source code)
* DNA of every cell is same in all generation if no mutation (no information is lost/modified)
* 1 quine program represent 1 cell's properties
* G - Cell's Generation Number
* simEndGen - Number of generations to simulate
* T - Type ID, cell belongs to what type of Tissue (0- zygote, 1- brain, 2- body, 3-gamate)
* size array determines the structure of the organism, how many cells of what type and how they evolve from the zygote
* gamates are different from other cells. A female gamate gets input phenotype from a male gamate for crossover to zygotes of next generation
* Organism ID is odd for female (and initial asexual zygote) and even for male, and subsequent pairing (can be thought of as pair by closeness)

---

## TBDs

* Add cell aging
* Add meaningfull phenotype string
* Add mutation
* Add random pairing
* Add random number signifying reproductive probability per organism based on favourable environment
* Can the java file make the script file too as Ouroboros
* Radiation harden
* Mutate parts of core DNA (not only phenotype) to produce new organisms like mutating size array body and brain cell numbers to change the organism structure

---

## Useful Links

* http://nautil.us/issue/48/chaos/nature-the-it-wizard-rp
* https://www.quinapalus.com/wires11.html
* https://github.com/coolwanglu/quine-chameleon
* https://github.com/mame/quine-relay
* https://github.com/prince-ph0en1x/Quines
* https://en.wikipedia.org/wiki/Quine_(computing)
* https://stackoverflow.com/questions/105725/how-to-write-a-self-reproducing-code-prints-the-source-on-exec
* http://www.ooblick.com/software/evolve/
* https://www.nyx.net/~gthompso/quine.htm

---

## License

The MIT License applies to *all* resources in this repository.

The MIT License (MIT)

Copyright (c) 2017, 2018, 2019, 2020, 2021 Aritra Sarkar (@prince-ph0en1x)

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

---
