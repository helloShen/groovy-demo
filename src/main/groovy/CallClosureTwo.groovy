def benchmark (repeat, Closure worker) {
	start = System.currentTimeMillis()
	repeat.times{ worker(it) } 
	end = System.currentTimeMillis()
	return end - start
}

slow = benchmark(10000) { (int) it / 2 }
fast = benchmark(10000) { it.intdiv(2) }

assert slow / fast > 3
