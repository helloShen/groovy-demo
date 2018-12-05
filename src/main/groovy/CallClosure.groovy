def adder = { x, y -> x + y }
assert adder(3,4) == 7
// call closure from call() method
assert adder.call(7,8) == 15
