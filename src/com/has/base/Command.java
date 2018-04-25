package com.has.base;

/*
 * Command class which contains commandName and arguments
 * @author Ege Ozan Özyedek
 * @version v1.0
 * @date 24/04/18
 */
public class Command {
  
  //properties
  CommandName commandName;
  DataContainer arguments;
  
  //constructors
  
  /*
   * Command class constructor, gets commandName and arguments and holds them
   * @param commandName, the name of the command
   * @param arguments, DataConatiner which holds the arguments
   */
  public Command( CommandName commandName, DataContainer arguments) {
    
    this.commandName = commandName;
    this.arguments = arguments;
    
  }
  
  //methods
  
  /*
   * A method which returns the arguments of command
   * @return arguments, the property of Command
   */
  public DataContainer getArgument() {
    
    return arguments;
  }
  
  /*
   * A method which returns the name of command
   * @return commandName, the property of Command
   */
  public CommandName getName() {
    
    return commandName;
  }
  
}
