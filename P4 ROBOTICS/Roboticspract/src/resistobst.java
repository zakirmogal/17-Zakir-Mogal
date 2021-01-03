import ch.aplu.robotsim.*; 

import ch.aplu.util.*; 

public class resistobst 

{ 

  public resistobst() 

  { 

    LegoRobot robot = new LegoRobot(); 

    Gear g = new Gear(); 

     

    TouchSensor ts1 = new TouchSensor(SensorPort.S1); 

    TouchSensor ts2 = new TouchSensor(SensorPort.S2); 

    robot.addPart(g); 

    robot.addPart(ts1); 

    robot.addPart(ts2); 

    g.forward(); 

    while(!QuitPane.quit()) 

    { 

      Boolean t1 = ts1.isPressed(); 

      Boolean t2 = ts2.isPressed(); 

      if(t1 && t2) 

      { 

        g.backward(500); 

        g.left(400); 

        g.forward(); 

      } 

      else 

      { 

        if(t1) 

        { 

          g.backward(500); 

          g.left(400); 

          g.forward(); 

           

        } 

        else 

        { 

          if(t2) 

          { 

            g.backward(500); 

            g.right(100); 

            g.forward(); 

          } 

        } 

      } 

      Tools.delay(20); 

    } 

    robot.exit(); 

  } 

  public static void main(String [] args) 

  { 

    new resistobst(); 

  } 

  static 

  { 

    RobotContext.setLocation(10,10); 

    RobotContext.setStartDirection(5); 

    RobotContext.setStartPosition(100,240); 

    RobotContext.useObstacle(RobotContext.channel); 

  } 

} 

 