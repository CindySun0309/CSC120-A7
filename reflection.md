Use this file to record your reflection on this assignment.

- Which methods did you decide to `overload`, and why?

House class:


Library class: 
Since the Library class does not have the overrided toString() method, I created 2 overloaded constructors for it, which corresponds to the 2 overloading constructors of the Building class. So that Library can inherit the toString() method from the Building class.

Cafe class: 
I only created one overloaded constructor and one overloaded method for the Cafe class. For the overloaded constructor, there is no nFloors and hasElevator, because nFloors is set to 1 (as in the Building class), and therefore does not need an elevator (hasElevator = false). For the full constructor, I think it is likely to have a super big Cafe (like Starbucks?) that has several floors and an elevator. 
For the overloaded sellCoffee method: if the customer only wants a cup of tab water for free, then the only thing the Cafe is giving off is a cup. So the only parameter is nCups.


- What worked, what didn't, what advice would you give someone taking this course in the future?
