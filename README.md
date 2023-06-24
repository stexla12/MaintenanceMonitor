# MaintenanceMonitor
We are a small hydro-power electricity supplier near Vienna. 
Our customers expect electricity around the clock with a very high service level agreement. It is easy to derive that service times are very important to us. 
Huge monitors were installed that should show the current service message.
"Everything operates as expected" is the default message. But a service operator can set the message manually to something else (e.g., "Service checks: No power until 5:00 pm"). 
A service operator can also reset the message to its default message.

The service should be able to manage a centrally stored message. It should be able to 
- deliver the message to a client
- set it to a message
- reset the message 

# Technical Details
REST-Based server in Java using Spring Boot 3.1.1
