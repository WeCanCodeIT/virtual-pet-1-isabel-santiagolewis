public class VirtualPet{
    public String name;
    private int hungerLevel = (int)(Math.random()*100);
    private int thirstLevel=(int)(Math.random()*100);
    private int boredomLevel=(int)(Math.random()*100);
    private int energyLevel=(int)(Math.random()*100);
    private boolean isCooperative=true;

    public VirtualPet(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHungerLevel() {
        return hungerLevel;
    }
    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }
    public int getThirstLevel() {
        return thirstLevel;
    }
    public void setThirstLevel(int thirstLevel) {
        this.thirstLevel = thirstLevel;
    }
    public int getBoredomLevel() {
        return boredomLevel;
    }
    public void setBoredomLevel(int boredomLevel) {
        this.boredomLevel = boredomLevel;
    }
    public int isEnergyLevel() {
        return energyLevel;
    }
    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
    
    public void feedPet(){
        if (isCooperative){
            this.hungerLevel -= 30;
            System.out.println();
            System.out.println("Num, Num, Num..."+this.name+" is eating.");

            System.out.println("	        --                                                                                          	");
            System.out.println("	       ----                             ---                                                         	");
            System.out.println("	      ------                   ------------------      -------                                      	");
            System.out.println("	     ---------             ---------------------------------------------=++=-                       	");
            System.out.println("	     ------------       -----------------------------------------------+***+---                     	");
            System.out.println("	       ------------------::::::---------------------------------------+*++*=-----                   	");
            System.out.println("	       ----------------::::::::::-------------------:::::::----------+*+**+------                   	");
            System.out.println("	       --------------- :::::::::::-----------------::::::::::-------=*+*+*+----=+=                  	");
            System.out.println("	         -----------   ::::::::::::---------------:::::::::::-------++**+*+---#*-                   	");
            System.out.println("	           - -- ---    ::::::::::::---------------:::::::::::-------**++***-----                    	");
            System.out.println("	                        :::::::::::---------------::::::::::-----  **+**++*=-----                   	");
            System.out.println("	                        :::::::::::--  -----------::::::::::-      **+*+**+=------                  	");
            System.out.println("	                        ::::::::::---   ----------::::::::::       *+*+**+=-------                  	");
            System.out.println("	                        ::::::::::---        -----:::::::::        **+***--=+----*#                 	");
            System.out.println("	                       ::::::::::----           --:::::::::                --==--*#                 	");
            System.out.println("	                      ::::::::::----             ---:::::::                                         	");
            System.out.println("	                    ::::::::::----               ----::::::                         #               	");
            System.out.println("	                    ::::::::-----                -----:::::                   ###***###***          	");
            System.out.println("	                    :::::: ------                 -----:::::                  *##**##***# ***       	");
            System.out.println("	                    :::::- ------                 -----:::::                -+**#%%##***##*--:      	");
            System.out.println("	                    ::::::  -----                 ----- :::::-             ----=-----===------      	");
            System.out.println("	                     ::::::- -------               ------::::::             --====---==---====      	");
            System.out.println("	                      :::::   ------               ------ :::::             --===+---------=+       	");

            System.out.println(this.name+" has finished their bowl. "+this.name+"'s Hunger level has been reduced to: "+this.hungerLevel);
            System.out.println();
        }
    }

    public void givePetWater(){
        if (isCooperative){
            this.thirstLevel -= 30;
            System.out.println();
            System.out.println("SLUR, SLUR, SLURRRRP..."+this.name+" is drinking the water.");

            System.out.println("	                ______    ____	");
            System.out.println("	               :  ;;;;\\__/:  ;\\	");
            System.out.println("	                \\;__/.... :  _/;	");
            System.out.println("	               ___:__ ..__\\_/__;	");
            System.out.println("	               |  ## `--'   ##|;	");
            System.out.println("	               |_____/~;\\_____|;	");
            System.out.println("	                 /~~~_ _ ~~   /	");
            System.out.println("	                 // (_:_)   \\\\	");
            System.out.println("	           _     // ,'~ `,_\\\\~\\_	");
            System.out.println("	          //     ~~`,---,'~~~   \\	");
            System.out.println("	 ___     //         ~~~~      ;; \\_  __	");
            System.out.println("	/_\\/____::_        ,(:;:  __    ;; \\/;;\\  __	");
            System.out.println("	\\_/) _  :: (       ; ;;:    \\    / ;:;;::-,-'	");
            System.out.println("	   |[-]_::-|       : :;;:   /  * | ;:;;:;'	");
            System.out.println("	   | :__:: |       :.`,:::  : +  : /___:'	");
            System.out.println("	   |[_ ] [\\|       ;. ;--`:_:.  *| /   /	");
            System.out.println("	   |__| |_]|    ,-' . :uu-'/     \\|UUU/	");
            System.out.println("	   |_______|   ;_|_|_/    :_;_;_;_:	");
            System.out.println("	    [=====]	");

            System.out.println(this.name+" has finished their water bowl. "+this.name+"'s Thirst level has been reduced to: "+this.thirstLevel);
            System.out.println();
        }
    }

    public void playWithPet(){
        if (isCooperative){
            this.boredomLevel -= 30;
            System.out.println();
            System.out.println("Whoosh, whoosh, whoosh... "+this.name+" loves playing fetch!");

            System.out.println(	"	                                                    /)	"	)	;
            System.out.println(	"	                                              o__^^/_/)	"	)	;
            System.out.println(	"	                                               \\ ' \\`-'     ___	"	)	;
            System.out.println(	"	                                                `|  \\______/--'`	"	)	;
            System.out.println(	"	                                                 |         \\	"	)	;
            System.out.println(	"	                                               ././-------,.\\ 	"	)	;
            System.out.println(	"	                                   _	"	)	;
            System.out.println(	"	                                (\\ \\)	"	)	;
            System.out.println(	"	                              o__^\\/     ,	"	)	;
            System.out.println(	"	                               \\ ' \\    <   _  _	"	)	;
            System.out.println(	"	 '  .                          `|  \\____\\   -   -	"	)	;
            System.out.println(	"	       '      . .      ()        |        )  _   _	"	)	;
            System.out.println(	"	         `.'       `.'         .//---_/-_/ _  _	"	)	;
            System.out.println(	"		"	)	;
            System.out.println(	"	                        (\\	"	)	;
            System.out.println(	"	                       (\\_\\^^__o   .	"	)	;
            System.out.println(	"	                       `-'\\ ` /   `(	"	)	;
            System.out.println(	"	                          |  \\_____|	"	)	;
            System.out.println(	"	                          |        |                _	"	)	;
            System.out.println(	"	                        ./`,----./~|     .   .   . - ()	"	)	;
            System.out.println(	"		"	)	;
            System.out.println(	"	                                                        (\\	"	)	;
            System.out.println(	"	                                                       (\\_\\_^__o	"	)	;
            System.out.println(	"	                                                ___     `-'/ `_/	"	)	;
            System.out.println(	"	                                               '`--\\______/  |	"	)	;
            System.out.println(	"	                                          '        /         |	"	)	;
            System.out.println(	"	                                      `    .  '  -`/.------'\\^-'	"	)	;

            System.out.println(this.name+"'s Boredom level has been reduced to: "+this.boredomLevel);
            System.out.println();
        }
    }

    public void napTime(){
        if (isCooperative){
            this.energyLevel += 30;
            System.out.println();
            System.out.println("ZZZ-Zzzz-ZZzzz-hngGGggh-Ppbhww- zZZzzzZZ . . . Be really quite! " + this.name+" is sleeping! ");
            
            System.out.println("	(                   )            \\ \\	");
            System.out.println("	 \\                 /              \\ \\	");
            System.out.println("	  \\ _ _ _ _ _ _ _ /             ___) )	");
            System.out.println("	           (__)_     ____      /     \\	");
            System.out.println("	              (_)o  /   | \\--._)     /	");
            System.out.println("	                  __|uu | |   \\   \\_ \\	");
            System.out.println("	                 /      | | __ \\  /_) \\	");
            System.out.println("	                (_)_____|_|(____)(_____)	");

            System.out.println(this.name+" is up from their nap! "+this.name+"'s Energy level has replenished to: "+this.energyLevel);
            System.out.println();
        }
    }

    public void tick(){
        int timePassed = (int)(Math.random()*7+2);
        this.hungerLevel += timePassed*5; 
        this.thirstLevel += timePassed*5;
        this.boredomLevel += timePassed*5;
        this.energyLevel -= timePassed*5;
        System.out.print(timePassed+" hours have passed. ");
        displayPetStatus();
    }

    public void displayPetStatus(){
        System.out.println();
        System.out.println("Here are the current stats for "+this.name+":");
        System.out.println("Hunger Level: "+this.hungerLevel);
        System.out.println("Thirst Level: "+this.thirstLevel);
        System.out.println("Boredom Level: "+this.boredomLevel);
        System.out.println("Energy Level: "+this.energyLevel);
        System.out.println();
    }
}