package ltd.matrixstudios.itemizer.commands.menu.sub

import ltd.matrixstudios.itemizer.commands.menu.sub.buttons.colors.LeatherColorButton
import ltd.matrixstudios.itemizer.commands.menu.sub.buttons.enchants.EnchantButton
import ltd.matrixstudios.itemizer.menu.Button
import ltd.matrixstudios.itemizer.menu.Menu
import ltd.matrixstudios.itemizer.menu.buttons.ItemStackButton
import org.bukkit.Color
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

class LeatherSelectColorMenu(val player: Player, val item: ItemStack) : Menu(player) {

    init {
        staticSize = 54
        placeholder = true
    }
    override fun getButtons(player: Player): MutableMap<Int, Button> {
        val buttons = mutableMapOf<Int, Button>().apply {
            this[20] = ItemStackButton(item)

            this[13] = LeatherColorButton(Color.RED, item)
            this[14] = LeatherColorButton(Color.ORANGE, item)
            this[15] = LeatherColorButton(Color.YELLOW, item)
            this[16] = LeatherColorButton(Color.GREEN, item)
            this[22] = LeatherColorButton(Color.TEAL, item)
            this[23] = LeatherColorButton(Color.BLUE, item)
            this[24] = LeatherColorButton(Color.PURPLE, item)
            this[25] = LeatherColorButton(Color.WHITE, item)
            this[31] = LeatherColorButton(Color.BLACK, item)
        }

        return buttons
    }

    override fun getTitle(player: Player): String {
        return "Select a Color"
    }
}