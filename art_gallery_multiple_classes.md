# Art Gallery

You have been approached by a digital art gallery to build a piece of software to help them manage their artwork and sell pieces to customers. 

The aim of this lab is to plan and create an object-oriented model of an art gallery, with artwork, artists and customers.

Start off by drawing your UML diagram. Make sure you create a separate file for each class and a separate test file for each class. 

## MVP
 - A `Gallery` should have a `name`, a `till` and a collection of `stock` that contains `Artwork` objects.
 - A piece of `Artwork` should have a `title`, an `artist`, and a `price`.
 - An `Artist` should have a `name`.
 - A `Customer` should have a `name` and a `wallet`.
 - A `Customer` should be able to buy an `Artwork` from the `Gallery`, reducing the money in their `wallet` and increasing the money in the `Gallery` till. 

 ## Extensions
 - When an `Artwork` is purchased, it should transfer from the `Gallery` `stock` collection to the `Customer`'s `artCollection`.
 - Give the `Gallery` the ability to calculate the value of its collection with a `stock_take()` method.

 
Please remember to git commit and push to GitHub regularly (choose one person to host the remote version of your code and use CodeTogether to take turns driving/navigating).
