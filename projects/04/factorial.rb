#! /usr/bin/ruby
# factorial.rb displays factorial of n
#
# Completed by: David Choi
#
# Input:  n, an integer
# Precondition: n >= 1
# Output: n!


if __FILE__ == $0
   print "To calculate n!, enter n: "
   n = gets.chomp.to_f
   answer = 1
   
   for i in 2..n
    answer = answer * i   
   end

   puts "The factorial of #{ n } is #{ answer }"
   puts "\n"
end

