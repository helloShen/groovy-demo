current = 1
next = 1
10.times {
	print current + " "
	oldNext = next;
	next += current
	current = oldNext
}
println ""
