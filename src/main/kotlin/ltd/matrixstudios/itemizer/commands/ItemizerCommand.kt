package ltd.matrixstudios.itemizer.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import ltd.matrixstudios.itemizer.commands.menu.ItemizerMenu
import ltd.matrixstudios.itemizer.util.Chat
import org.bukkit.Material
import org.bukkit.entity.Player

class ItemizerCommand : BaseCommand() {

    @CommandAlias("itemizer")
    @CommandPermission("itemizer.use")
    fun itemizerCommand(player: Player) {
        if (player.inventory.itemInHand == null || player.inventory.itemInHand.type == Material.AIR) {
            player.sendMessage(Chat.format("&cYou must be holding an item to customize it!"))
            return
        }

        ItemizerMenu(player, player.inventory.itemInHand).openMenu()
    }
}