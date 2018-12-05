log1 = ''
(1..10).each{num -> log1 += num}
assert log1 == '12345678910'

log2 = ''
(1..10).each{log2 += it}
assert log2 == '12345678910'


