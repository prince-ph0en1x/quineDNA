# quineDNA


## Links

* http://nautil.us/issue/48/chaos/nature-the-it-wizard-rp
* https://www.quinapalus.com/wires11.html
* https://github.com/coolwanglu/quine-chameleon
* https://github.com/mame/quine-relay
* https://github.com/prince-ph0en1x/Quines

## Notes

C = 1 quine program representing 1 cell's property

	age
		A = system elapsed time since 1st cell of current generation
	env
		R = random number signifying reproductive probability per organism based on favourable environment
	DNA
		P = variety of cells 
		Mi = number of cells per variaty of cells (i = 1 to P)
		M = total cells per organism (summation Mi)
	sim
		N = number of generations to simulate (limit viral run)
		G = current generation


*		if N != 0	A_g(N)		-->		1{A_g(N)}
*		if N != 0	A_g(N)		-->		1{A_g(N-1)}
*		if N != 0	A_g(N)		-->		M{A_g(N-1)}
*		if N != 0	A_g(N)		-->		M1{A_g(N-1)} M2{A_g(N-1)} ... MP{A_g(N-1)}
