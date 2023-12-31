#TaxiApp

Process Class:
Manages user inputs using a Scanner.
Calculates the cost based on distance, age, and travel type.
Provides a method to display the total cost of the taxi ride.

Main Class:
Serves as the entry point for the taxi fare calculation system.
Creates an instance of the Process class to handle the fare calculation process.
Executes the steps of setting distance, age, travel type, and finally, obtaining and displaying the total cost of the ride.
The setDistance, setAge, and setTravelType methods manage user inputs and adjust the cost based on specific criteria:

setDistance: Calculates the initial cost based on the distance traveled (assuming 10 units of currency per kilometer).
setAge: Offers discounts based on age—50% off for children under 12, a 10% discount for ages 25-65, and a 30% discount for ages over 65.
setTravelType: Adjusts the cost by a factor of 1.6 (or 16/10) for round trip tickets.
The getTotalCost method simply displays the calculated total cost to the user.

This system provides a basic representation of a taxi fare calculation based on distance, age, and travel type.
 
