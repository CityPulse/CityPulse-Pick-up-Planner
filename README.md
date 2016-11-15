# Pickup-planner
The goal of the Pickup planner system is to provide a pickup service that can be used by fleet managment companies as a travel service for city residents, satisfying their varying travel needs. The front end consists of the Client app and Vehicle app. The Client app allows users to register for the service and issue travel requests. The system backend processes these requests and sends a travel trajectory to the Vehicle app, which visualizes and updates the trips the vehicle should take in order to satisfy the travel requests.

The implementation of the Pickup planner service partially builds on components from the Citypulse framework, i.e. Decision Support and Geospatial Data Infrastructure (GDI). It includes a scheduling and dynamic route optimization algorithm. The system currently uses OpenStreetMap data for Stockholm, but can easily incorporate data for other cities through the GDI.

# Dependencies

Database e.g. PostgreSQL/psycopg2  
Clustering library e.g. Scipy or Scikit-Learn  
Networkx  
ASP solver (Clingo4)   
virtualenv  
Flask  

# Installation

Client and vehicle app: to install, upload the APK on an Android device running at least Android 5.0.   

## Backend

Request Handler: Flask server that accepts connections from the Client and Vehicle apps

Trip Generator and Traffic Handler: run periodically (e.g. through a cron job)

# Running
The instructions for the various components.

## Clustering travel requests

```
python clustering.py
```

## Trip generation

```
clingo ham.lp graph.lp trip_generator.py --opt-mode=optN --quiet=1
```

## Client and Vehicle apps

+ To run these Android apps, install the APK. 
+ Optionally change the configurations for the server and port number in the Configs.java class (located in
com.nicholasgot.citypulse/androidapp/common). Typically, this is the only change that is necessary when the components
are installed on a different machine, assuming the other dependencies are already installed on the machine.
+ Change the Google API keys in the app's build.gradle.
