package ltd.matrixstudios.itemizer.commands.menu.sub

import ltd.matrixstudios.itemizer.menu.types.TextEditorMenu
import ltd.matrixstudios.itemizer.util.Chat
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import java.util.*

class LoreEditorMenu(l: LinkedList<String>, player: Player, val stack: ItemStack) : TextEditorMenu(l, player) {

    override fun onSave(player: Player, lines: LinkedList<String>) {
        val s = stack
        val meta = s.itemMeta!!

        meta.lore = lines.map { Chat.format(it) }

        s.itemMeta = meta
        player.updateInventory()

        LoreEditorMenu(lines, player, stack).updateMenu()
    }
}