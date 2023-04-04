Use this file to record your reflection on this assignment.

- Which methods did you decide to `overload`, and why?

Library class: 
Since the Library class does not have the overrided toString() method, I created 2 overloaded constructors for it, which corresponds to the 2 overloading constructors of the Building class. So that Library can inherit the toString() method from the Building class.

House class:
I created 2 overloaded constructors for this class. One only takes in name as a parameter, the other takes in both the name and the address. Every other parameters are set to default values. I did so because this class has a overrided toString() method that is different from the Building class. Therefore, I tried to not use inheritance for the default/overloaded constructor (param: name), and use inheritance for the second overloaded constructor (param: name, address). I wanted to explore the idea of inhertance and overload.

Cafe class: 
I only created one overloaded constructor and one overloaded method for the Cafe class. For the overloaded constructor, there is no nFloors and hasElevator, because nFloors is set to 1 (as in the Building class), and therefore does not need an elevator (hasElevator = false). For the full constructor, I think it is likely to have a super big Cafe (like Starbucks?) that has several floors and an elevator. 
For the overloaded sellCoffee method: if the customer only wants a cup of tab water for free, then the only thing the Cafe is giving off is a cup. So the only parameter is nCups.


- What worked, what didn't, what advice would you give someone taking this course in the future?
I was confused by the instructions when I looked at the assignment, so I asked for tutors' help. Asher and Allison helped me on Monday. They explained and demonstrated override and overload to me. They are so helpful so I recommend students in the future to ask for help when not understanding the instruction.