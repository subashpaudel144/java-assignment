

 ## Group Layout:
 
 GroupLayout groups its components and places them in a Container hierarchically. The grouping is done by instances of the Group class.
 Group is an abstract class and two concrete classes which implement this Group class are SequentialGroup and ParallelGroup.
 
 ## No Layout:
 
 Null layout is not a real layout manager. It means that no layout manager is assigned and the components can be put at specific x,y coordinates.
 It is useful for making quick prototypes. But it is not recommended for production because it is not portable. The fixed locations and sizes do not change with the environment (e.g. different fonts on various platforms).
 
