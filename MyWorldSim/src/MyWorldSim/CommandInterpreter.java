package MyWorldSim;

public class CommandInterpreter 


{
   private final int GO = 1;
   private final int WALK = 2;
   private final int AMBLE = 3;
   private final int PROWL = 4;
   private final int STRIDE = 5;
   private final int RUN = 6;
   private final int JUMP = 7;
   private final int STAGGER = 8;
   private final int STRUT = 9;
   //throww
   private final int TOSS = 10;
   private final int PITCH = 11;
   //SHOOT
   private final int FIRE = 13;
   private final int LAUNCH = 14;
   //GET           
   private final int LIFT = 15;
   private final int PICKUP = 16;w
   private final int GRAB = 17;
   
   //OPEN
   
   //CLOSE
   private final int SHUT = 1;
   private final int SHUTOFF = 2;
   private final int SHUTUP = 3;

   //SIT
   
   //STAND
   
   //HIT
   private final int SLAP = 1;
   private final int SWAT = 2;
   private final int PUNCH = 3;
   private final int SMACK = 4;
   
   
  //BREAK 
   private final int SMASH = 1;
   private final int SHATTER = 2;
   
   //light 
   
   private final int FLICK = 1;
   private final int LIGHTS = 3;
   private final int TURN = 4;
   private final int SWITCH = 5;

   
   
   //cut 
   private final int SLICE = 1;
   private final int DICE = 2;

   
   
   //LEAVE
   private final int EXIT = 1;

   
   private final int COMMANDS[][]   = {
		   {AMBLE, GO, JUMP, PROWL, RUN, STAGGER, STRIDE, STRUT,STRIDE, STRUT,WALK}
		   {FLICK, PITCH, TOSS},
		   {LIFT, PICKUP}
		   
                                                           }





}
