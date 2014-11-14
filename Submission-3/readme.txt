This readme covers the status of the project as of 14th November at Submission #3.

The application currently has no GUI and executes only on the terminal.The database access currently occurs in a distributed manner,which will later be integrated into a single class.Sport registration is limited to Cricket only as of now.This will be expanded to cover all the others as well.The database is assumed to be created. The tables are created and populated dynamically. The under development GUI will make the application very intuitive.

The class status:
Complete:
bank.java
interface proceedings
Sport.java
SpreeTest.java
inventory.java
Spree.java

Incomplete classes:
participant.java
nonParticipant.java
eventManager.java
convener.java
nonSportEvent.java

Unavailable features:
Registering for any sport apart from cricket(Main registration is available)
Informal Events schedule(Class is ready, database table not available)
Reimbursement(exact conditions equired E.G.date)
Dynamic allocation of accomodation

Partially Unavailable:
Seeing schedule,scores and standings if database is not populated completely(Adding is available for Event Manager)

Known Issues:
Database Exception may interfere with the menu

