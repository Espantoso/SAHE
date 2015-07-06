package com.espantoso.sa.vehicles;

/**
 * Created by Александр on 06.07.2015.
 */
public class Transmission
{
	short NumberOfGears;		//[1 to 4]
	double MaxVelocity;		    //[5.0 to 150.0] (N)
	double EngineAcceleration;	//[0.1 to 10.0] (O)
	double EngineInertia;		//[0.0 to 50.0] (P)
	char DriveType;         	//[F/R/4] (Q)
	char EngineType;	    	//[P/D/E] (R)
}
