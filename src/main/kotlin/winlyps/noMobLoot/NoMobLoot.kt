package winlyps.noMobLoot

import org.bukkit.plugin.java.JavaPlugin

class NoMobLoot : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doMobLoot", "false")
        }
        logger.info("NoMobLoot plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doMobLoot", "true")
            logger.info("NoMobLoot plugin has been disabled.")
        }
    }
}