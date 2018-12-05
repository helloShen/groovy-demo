class MethodClosureDemo {
	int limit

	MethodClosureDemo(int limit) {
		this.limit = limit
	}

	boolean validate(String value) {
		return value.length() <= limit
	}
}

MethodClosureDemo lessThanSeven = new MethodClosureDemo(6);
MethodClosureDemo lessThanSix = new MethodClosureDemo(5);

// using & operator to define a closure 
Closure closureLessThanSeven = lessThanSeven.&validate

def words = ['long string', 'medium', 'short', 'tiny']

assert 'medium' == words.find(closureLessThanSeven)
assert 'short' == words.find(lessThanSix.&validate)
