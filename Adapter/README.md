# Adapter Pattern

**Interfaces:** VehicleMechanic, SeaVehicleMechanic <br/>
**Concrete classes:** GeneralVehicleMechanic, ShipMechanic, SubmarineMechanic <br/>
**Adapter:** VehicleAdapter <br/>

**Scenario:** <br/>
If there is a broken vehicle, it first comes to GeneralVehicleMechanic. <br/>
If its a car, GeneralVehicleMechanic fixes it, <br/>
If its a sea vehicle, GeneralVehicleMechanic sends the vehicle to corresponding mechanic via VehicleAdapter: <br/> 
If its a Ship, its sent to ShipMechanic. 
If its a Submarine, its sent to SubmarineMechanic.
