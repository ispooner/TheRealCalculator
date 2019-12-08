# TheRealCalculator

This is the second project that I've made. It goes over constrained layouts as well as how to create a separate layout for landscape and portrait so that extra functionality can be revealed in the calculator upon changing the orientation. 
This was also a learning experience in regards to creating functions for listeners in the UI. Using this method it's much easier to create listeners that can listen to multiple buttons. It also reduces the total amount of code that needs to be written. using this method it also becomes possible to write a listener that can listen to buttons that don't exist. This is due to Android using ints as IDs. Since these ints are unique they don't overlap and can be used to listen to multiple buttons with the same name.

All that's left to do is to polish the app by actually adding extra functionality upon changing the screen orientation. Next, there is some polishing to be done around the functionality of the equals button. Finally, I would like to come back and add a ViewModel so that state can be saved through an orientation change. Overall, I think it's a decent attempt for the aproximately 5 hours I spent on the actual coding. 
