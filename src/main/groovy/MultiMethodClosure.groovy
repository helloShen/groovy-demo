class MultiMethodClosureDemo {
	int foo(String str) {
		return str.length()
	}

	int foo(List list) {
		return list.size()
	}

	int foo(int x, int y) {
		return x + y
	}
}

MultiMethodClosureDemo obj = new MultiMethodClosureDemo()

Closure closure = obj.&foo

assert closure('HelloWorld') == 10 
assert closure([1,2,3,4,5]) == 5
assert closure(1,2) == 3
