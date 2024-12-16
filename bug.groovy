def list = [1, 2, 3]

println list.class // prints class java.util.ArrayList

list.each { println it }

list << 4

println list // prints [1, 2, 3, 4]

list.add(5)

println list // prints [1, 2, 3, 4, 5]