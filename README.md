## 100 Ways to Die

### What does your program do?

It’s a simple game called 100 Ways to Die. It takes in some info about the user, randomly generates an activity and death event from two lists of strings, and outputs the data to the user inside a tombstone graphic.

![screenshot of final output](https://github.com/samanthagmccormick/javatermproject/blob/master/screenshot-termproject.png)

### Why did you select this kind of program?

I've chosen to create a game because I always find that building something that is entertaining or interesting to me is the best way to immerse myself in a programming endeavor.

### What was the most challenging part of this project for you?

Honestly it was the UI work that I saved for last which was the most challenging to write. First I wrote the classes (a User class, a RandomActivity list and a RandomDeathEvent list), and then using my original proposal steps I wrote the logic of the whole program, just using input to get input and System.out.println() to print output to the console.

Then came the work of replacing everything with JavaFX structure and UI elements. I really hate that trying to create a UI involves learning a basic understanding of the JavaFX API and its dumb UI element classes and realizing that...

### What were the most valuable skills you learned while completing this project?

That I hate JavaFX and I will probably never use it again. Fun facts I learned:

- With JavaFX you can't write regular CSS, you have to prepend every CSS property with an "-fx-" i.e. "-fx-background-color"

- And guess what, some CSS properties are not available, like margin for some reason!

- You can't style Text elements using a CSS class, you have to use .setFont() to set font family, .setFill() to set color, etc.

- A dropdown is referred to as a "Combobox" (WHY?!)

And finally.......

- JavaFX is [not supported in modern browsers](http://stackoverflow.com/questions/19102000/javafx-can-it-really-be-deployed-in-a-browser/39835573#39835573) so I regret the time that I spent having to learn about it in this class and having to work with it on this project :(

