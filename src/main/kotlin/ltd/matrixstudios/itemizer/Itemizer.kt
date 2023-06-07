package ltd.matrixstudios.itemizer

import co.aikar.commands.PaperCommandManager
import ltd.matrixstudios.itemizer.commands.ItemizerCommand
import ltd.matrixstudios.itemizer.menu.listener.MenuListener
import me.lucko.helper.plugin.ExtendedJavaPlugin
import me.lucko.helper.plugin.ap.Plugin

@Plugin(
    name = "Itemizer",
    version = "1.0.0/stable",
    description = "The new easiest way to create Minecraft items!",
    apiVersion = "1.19",
    authors = ["Matrix Studios"]
)
class Itemizer : ExtendedJavaPlugin() {

    companion object {
        lateinit var instance: Itemizer
    }

    override fun enable() {
        instance = this

        server.pluginManager.registerEvents(MenuListener(), this)

        val commandManager = PaperCommandManager(this)

        commandManager.registerCommand(ItemizerCommand())
    }
}