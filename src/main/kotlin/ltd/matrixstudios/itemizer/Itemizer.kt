package ltd.matrixstudios.itemizer

import co.aikar.commands.PaperCommandManager
import ltd.matrixstudios.itemizer.commands.ItemizerCommand
import ltd.matrixstudios.itemizer.menu.listener.MenuListener
import org.bukkit.plugin.java.JavaPlugin

class Itemizer : JavaPlugin() {

    companion object {
        lateinit var instance: Itemizer
    }

    override fun onEnable() {
        instance = this

        server.pluginManager.registerEvents(MenuListener(), this)

        val commandManager = PaperCommandManager(this)

        commandManager.registerCommand(ItemizerCommand())
    }
}