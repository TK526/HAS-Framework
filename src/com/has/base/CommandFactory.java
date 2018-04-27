package com.has.base;

/**
 * Contains all the static function wrappers for creatibg a command
 * CommandFactory.class
 * 
 * @author Ufuk BOMBAR
 * @since 28.04.2018 01:41
 * @version 1.0
 */
public class CommandFactory
{
    public static Command createGetConfigCommand()
    {
        DataContainer dc = new DataContainer( new DataStructure() );
        Command cmd = new Command( CommandName.GET_CONFIG, dc );
        return cmd;
    }

    public static Command createGetOptionsCommand()
    {
        DataContainer dc = new DataContainer( new DataStructure() );
        Command cmd = new Command( CommandName.GET_OPTIONS, dc );
        return cmd;
    }

    public static Command createGetTemparatureCommand( int deviceID )
    {
        DataContainer dc = new DataContainer( new DataStructure( DataType.INT ) );
        dc.setData( 0, deviceID );
        Command cmd = new Command( CommandName.GET_TEMPERATURE, dc );
        return cmd;
    }

    //TODO: write this function for all other commands.
}