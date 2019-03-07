Script started on Thu 07 Mar 2019 02:33:10 PM EST
wc25@gold02:~/CS214/labs/06$ cat ac verage.rb
# average.rb averages the values of an array of doubles.
# Precondition: theArray is an array of numbers
# Output: the average of the values in theArray
#
# Begun by: Dr. Adams, for CS 214 at Calvin College.
# Completed by:: David Weonsok Choi
# Date:   3-7-2019
########################################################

###############################################
# sum() sums the values in an array
# Receive: anArray, an array of numbers
# Return: the sum of the values in anArray.
################################################

# Define sum() method here
def sum (aArray)
	total = 0.0
	aArray.each {|x| total += x}
	return total
end

# Document and define average() method here
def average (aArray)
	if aArray.size <= 0 then
		return 0.0
	else
		return (sum(aArray) / aArray.size)
	end
end


def main
   # Define array0 as an Array containing no values
   array0 = []
   # Define array1 as an Array containing 9.0, 8.0, 7.0, 6.0
   array1 = [9.0, 8.0, 7.0, 6.0]

   puts "sum 0 is: #{ sum(array0) }\n"
   puts "sum 1 is: #{ sum(array1) }\n"

   puts "average 0 is: #{ average(array0) }\n"
   puts "average 1 is: #{ average(array1) }\n"
end

main

wc25@gold02:~/CS214/labs/06$ ruby average.jb  rb
sum 0 is: 0.0
sum 1 is: 30.0
average 0 is: 0.0
average 1 is: 7.5
wc25@gold02:~/CS214/labs/06$ exit

Script done on Thu 07 Mar 2019 02:33:35 PM EST
