package cc.co.evenprime.bukkit.nocheat.config;


/**
 * These are the default settings for NoCheat. They will be used
 * in addition to/in replacement of configurations given in the
 * config.yml file
 * 
 */
public class DefaultConfiguration extends NoCheatConfiguration {

    public DefaultConfiguration() {

        this.options().header("Main configuration file for NoCheat.");

        /** LOGGING **/
        set(ConfPaths.LOGGING_ACTIVE, true);
        set(ConfPaths.LOGGING_SHOWACTIVECHECKS, false);
        set(ConfPaths.LOGGING_PREFIX, "&4NC&f: ");
        set(ConfPaths.LOGGING_FILENAME, "nocheat.log");
        set(ConfPaths.LOGGING_LOGTOFILE, true);
        set(ConfPaths.LOGGING_LOGTOCONSOLE, true);
        set(ConfPaths.LOGGING_LOGTOINGAMECHAT, true);

        /*** INVENTORY ***/
        set(ConfPaths.INVENTORY_DROP_CHECK, true);
        set(ConfPaths.INVENTORY_DROP_TIMEFRAME, 20);
        set(ConfPaths.INVENTORY_DROP_LIMIT, 100);
        set(ConfPaths.INVENTORY_DROP_ACTIONS, "log:drop:0:1:cif cmd:kick");

        /*** MOVING ***/
        set(ConfPaths.MOVING_RUNFLY_CHECK, true);
        set(ConfPaths.MOVING_RUNFLY_ALLOWFASTSNEAKING, false);
        set(ConfPaths.MOVING_RUNFLY_ACTIONS, "log:moveshort:3:5:f cancel vl>100 log:moveshort:0:5:if cancel vl>400 log:movelong:0:5:cif cancel");

        set(ConfPaths.MOVING_RUNFLY_CHECKNOFALL, true);
        set(ConfPaths.MOVING_RUNFLY_NOFALLACTIONS, "log:nofall:0:5:cif cancel");

        set(ConfPaths.MOVING_RUNFLY_FLYING_ALLOWALWAYS, false);
        set(ConfPaths.MOVING_RUNFLY_FLYING_ALLOWINCREATIVE, true);
        set(ConfPaths.MOVING_RUNFLY_FLYING_SPEEDLIMITHORIZONTAL, 60);
        set(ConfPaths.MOVING_RUNFLY_FLYING_SPEEDLIMITVERTICAL, 100);
        set(ConfPaths.MOVING_RUNFLY_FLYING_HEIGHTLIMIT, 250);
        set(ConfPaths.MOVING_RUNFLY_FLYING_ACTIONS, "log:moveshort:3:5:f cancel vl>100 log:moveshort:0:5:if cancel vl>400 log:movelong:0:5:cif cancel");

        set(ConfPaths.MOVING_MOREPACKETS_CHECK, true);
        set(ConfPaths.MOVING_MOREPACKETS_ACTIONS, "log:morepackets:3:2:f cancel vl>30 log:morepackets:0:2:if cancel vl>60 log:morepackets:0:2:cif cancel");

        /*** BLOCKBREAK ***/

        set(ConfPaths.BLOCKBREAK_REACH_CHECK, true);
        set(ConfPaths.BLOCKBREAK_REACH_ACTIONS, "cancel vl>5 log:bbreach:0:2:if cancel");

        set(ConfPaths.BLOCKBREAK_DIRECTION_CHECK, true);
        set(ConfPaths.BLOCKBREAK_DIRECTION_PRECISION, 50);
        set(ConfPaths.BLOCKBREAK_DIRECTION_PENALTYTIME, 300);
        set(ConfPaths.BLOCKBREAK_DIRECTION_ACTIONS, "cancel vl>10 log:bbdirection:0:5:cif cancel");

        set(ConfPaths.BLOCKBREAK_NOSWING_CHECK, true);
        set(ConfPaths.BLOCKBREAK_NOSWING_ACTIONS, "log:bbnoswing:0:2:cif cancel");

        /*** BLOCKPLACE ***/

        set(ConfPaths.BLOCKPLACE_REACH_CHECK, true);
        set(ConfPaths.BLOCKPLACE_REACH_ACTIONS, "cancel vl>5 log:bpreach:0:2:cif cancel");

        set(ConfPaths.BLOCKPLACE_DIRECTION_CHECK, true);
        set(ConfPaths.BLOCKPLACE_DIRECTION_PRECISION, 75);
        set(ConfPaths.BLOCKPLACE_DIRECTION_PENALTYTIME, 100);
        set(ConfPaths.BLOCKPLACE_DIRECTION_ACTIONS, "cancel vl>10 log:bpdirection:0:3:cif cancel");

        /*** CHAT ***/
        set(ConfPaths.CHAT_COLOR_CHECK, true);
        set(ConfPaths.CHAT_COLOR_ACTIONS, "log:color:0:1:cif cancel");

        set(ConfPaths.CHAT_SPAM_CHECK, true);
        set(ConfPaths.CHAT_SPAM_WHITELIST, "");
        set(ConfPaths.CHAT_SPAM_TIMEFRAME, 5);
        set(ConfPaths.CHAT_SPAM_LIMIT, 5);
        set(ConfPaths.CHAT_SPAM_ACTIONS, "log:spam:0:5:cif cancel vl>50 log:spam:0:5:cif cancel cmd:kick");

        /*** FIGHT ***/

        set(ConfPaths.FIGHT_DIRECTION_CHECK, true);
        set(ConfPaths.FIGHT_DIRECTION_PRECISION, 75);
        set(ConfPaths.FIGHT_DIRECTION_PENALTYTIME, 500);
        set(ConfPaths.FIGHT_DIRECTION_ACTIONS, "cancel vl>5 log:fdirection:3:5:f cancel vl>20 log:fdirection:0:5:cf cancel vl>50 log:fdirection:0:5:cif cancel");

        set(ConfPaths.FIGHT_NOSWING_CHECK, true);
        set(ConfPaths.FIGHT_NOSWING_ACTIONS, "log:fnoswing:0:5:cif cancel");

        set(ConfPaths.STRINGS + ".drop", "[player] failed [check]: Tried to drop more items than allowed. VL [violations]");
        set(ConfPaths.STRINGS + ".moveshort", "[player] failed [check]. VL [violations]");
        set(ConfPaths.STRINGS + ".movelong", "[player] in [world] at [location] moving to [locationto] over distance [movedistance] failed check [check]. Total violation level so far [violations]");
        set(ConfPaths.STRINGS + ".nofall", "[player] failed [check]: tried to avoid fall damage for ~[falldistance] blocks. VL [violations]");
        set(ConfPaths.STRINGS + ".morepackets", "[player] failed [check]: Sent [packets] more packets than expected. Total violation level [violations]");
        set(ConfPaths.STRINGS + ".bbreach", "[player] failed [check]: tried to interact with a block over distance [reachdistance]. VL [violations]");
        set(ConfPaths.STRINGS + ".bbdirection", "[player] failed [check]: tried to interact with a block out of line of sight. VL [violations]");
        set(ConfPaths.STRINGS + ".bbnoswing", "[player] failed [check]: Didn't swing arm. VL [violations]");
        set(ConfPaths.STRINGS + ".bpreach", "[player] failed [check]: tried to interact with a block over distance [reachdistance]. VL [violations]");
        set(ConfPaths.STRINGS + ".bpdirection", "[player] failed [check]: tried to interact with a block out of line of sight. VL [violations]");
        set(ConfPaths.STRINGS + ".color", "[player] failed [check]: Sent colored chat message '[text]'. VL [violations]");
        set(ConfPaths.STRINGS + ".spam", "[player] failed [check]: Last sent message '[text]'. VL [violations]");
        set(ConfPaths.STRINGS + ".fdirection", "[player] failed [check]: tried to interact with a block out of line of sight. VL [violations]");
        set(ConfPaths.STRINGS + ".fnoswing", "[player] failed [check]: Didn't swing arm. VL [violations]");
        set(ConfPaths.STRINGS + ".kick", "kick [player]");

        // Update internal factory based on all the new entries to the "actions" section
        regenerateActionLists();
    }
}
