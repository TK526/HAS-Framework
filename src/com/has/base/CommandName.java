package com.has.base;

/**
 * Contains all the final static CommandName objects, also responsible for representing a commands name
 * CommandName.class
 * 
 * @author Ufuk BOMBAR
 * @since 28.04.2018 01:40
 * @version 1.0
 */
public class CommandName
{
    /* Base Non-Device Commands */
    public static final CommandName GET_CONFIG = new CommandName( "GET_CONFIG" );
    public static final CommandName GET_OPTIONS = new CommandName( "GET_OPTIONS" );
    public static final CommandName ENABLE_DEVELOPER_SESSION = new CommandName( "ENABLE_DEVELOPER_SESSION" );
    public static final CommandName CREATE_NOTIFICATION = new CommandName( "CREATE_NOTIFICATION" ); // Server to Client command

    /* Device Commands */
    public static final CommandName GET_TEMPERATURE = new CommandName( "GET_TEMPERATURE" );
    public static final CommandName GET_DISTANCE = new CommandName( "GET_DISTANCE" );
    public static final CommandName GET_INTRUSION_TIMESTAMP = new CommandName( "GET_INTRUSION_TIMESTAMP" );
    public static final CommandName GET_BUTTON_STATE = new CommandName( "GET_BUTTON_STATE" );
    public static final CommandName GET_LIGHT_INTENSITY = new CommandName( "GET_LIGHT_INTENSITY" );
    public static final CommandName SET_LIGHT_STATE = new CommandName( "SET_LIGHT_STATE" );
    public static final CommandName GET_LIGHT_STATE = new CommandName( "GET_LIGHT_STATE" );
    public static final CommandName SET_FAN_STATE = new CommandName( "SET_FAN_STATE" );
    public static final CommandName GET_FAN_STATE = new CommandName( "GET_FAN_STATE" );
    public static final CommandName GET_HEATER_STATE = new CommandName( "GET_HEATER_STATE" );
    public static final CommandName SET_HEATER_STATE = new CommandName( "SET_HEATER_STATE" );
    public static final CommandName GET_CAMERA_STATE = new CommandName( "GET_CAMERA_STATE" );
    public static final CommandName SET_CAMERA_STATE = new CommandName( "SET_CAMERA_STATE" );
    public static final CommandName GET_CAMERA_IMAGE = new CommandName( "GET_CAMERA_IMAGE" );
    public static final CommandName RECORD_FOR = new CommandName( "RECORD_FOR" );
    public static final CommandName GET_LPG_CONCENTRATION = new CommandName( "GET_LPG_CONCENTRATION" );
    public static final CommandName GET_METHANE_CONCENTRATION = new CommandName( "GET_METHANE_CONCENTRATION" );
    public static final CommandName GET_ETHANE_CONCENTRATION = new CommandName( "GET_ETHANE_CONCENTRATION" );
    public static final CommandName GET_PROPANE_CONCENTRATION = new CommandName( "GET_PROPANE_CONCENTRATION" );
    public static final CommandName GET_CO2_CONCENTRATION = new CommandName( "GET_CO2_CONCENTRATION" );
    public static final CommandName GET_SMOKE_CONCENTRATION = new CommandName( "GET_SMOKE_CONCENTRATION" );
    public static final CommandName GET_GAS_CONCENTRATION = new CommandName( "GET_GAS_CONCENTRATION" );

    /* Database Commands */
    public static final CommandName GET_TEMP_DATA = new CommandName( "GET_TEMP_DATA" );
    public static final CommandName GET_GAS_DATA = new CommandName( "GET_GAS_DATA" );
    public static final CommandName GET_CONSUMPTION_DATA = new CommandName( "GET_CONSUMPTION_DATA" );
    public static final CommandName UPDATE_CONSUMPTION_DATABASE = new CommandName( "UPDATE_CONSUMPTION_DATABASE" );
    

    /* Developer Commands */
    public static final CommandName SET_TEMPERATURE = new CommandName( "SET_TEMPERATURE" );
    public static final CommandName SET_DISTANCE = new CommandName( "SET_DISTANCE" );
    public static final CommandName SET_INTRUSION_TIMESTAMP = new CommandName( "SET_INTRUSION_TIMESTAMP" );
    public static final CommandName SET_BUTTON_STATE = new CommandName( "SET_BUTTON_STATE" );
    public static final CommandName SET_LIGHT_INTENSITY = new CommandName( "SET_LIGHT_INTENSITY" );
    public static final CommandName SET_CAMERA_IMAGE = new CommandName( "SET_CAMERA_IMAGE" );
    public static final CommandName SET_LPG_CONCENTRATION = new CommandName( "SET_LPG_CONCENTRATION" );
    public static final CommandName SET_METHANE_CONCENTRATION = new CommandName( "SET_METHANE_CONCENTRATION" );
    public static final CommandName SET_ETHANE_CONCENTRATION = new CommandName( "SET_ETHANE_CONCENTRATION" );
    public static final CommandName SET_PROPANE_CONCENTRATION = new CommandName( "SET_PROPANE_CONCENTRATION" );
    public static final CommandName SET_CO2_CONCENTRATION = new CommandName( "SET_CO2_CONCENTRATION" );
    public static final CommandName SET_SMOKE_CONCENTRATION = new CommandName( "SET_SMOKE_CONCENTRATION" );
    public static final CommandName SET_GAS_CONCENTRATION = new CommandName( "SET_GAS_CONCENTRATION" );

    public static final CommandName RESET_DATABASE = new CommandName( "RESET_DATABASE" );
    public static final CommandName RUN_DATABASE_QUERY = new CommandName( "RUN_DATABASE_QUERY" );
    public static final CommandName SET_TEMP_DATA = new CommandName( "SET_TEMP_DATA" );
    public static final CommandName SET_GAS_DATA = new CommandName( "SET_GAS_DATA" );
    public static final CommandName SET_CONSUMPTION_DATA = new CommandName( "SET_CONSUMPTION_DATA" );

    private final String type;

    public CommandName( String type )
    {
        this.type = type;
    }

    public String type()
    {
        return type;
    }

    @Override
    public boolean equals( Object obj )
    {
        if ( obj instanceof DataType )
            return this.type.equals( ((CommandName) obj ).type );
        else if ( obj instanceof String )
            return this.type.equals( ((String) obj ) );
        else
            return false;
    }

    @Override
    public String toString()
    {
        return type;
    }
}