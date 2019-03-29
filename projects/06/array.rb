# array.rb creates an array, reads values, and prints it back out 
#
# Input: array size, an int, values, ints,
# Output: values stores in the array
#
# Begun by: Prof. Adams, for CS 214 at Calvin College.
# Completed by: David Choi
# Date: 3-11-2019
#################################################################


def printArray(aArray)
  aArray.each{ |x| print x, " "}
end

def readArray(aArray, size)
  puts "Enter the values of the array: "
  for i in 0..size-1 do 
    aArray[i] = gets.to_f
  end
  printArray(aArray)
end

def main
  puts "Enter the size of the array: "
  size = gets.to_i
  aArray = Array.new(size)
  readArray(aArray, size)
end

main