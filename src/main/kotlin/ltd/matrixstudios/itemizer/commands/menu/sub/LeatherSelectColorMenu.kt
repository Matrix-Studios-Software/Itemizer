package ltd.matrixstudios.itemizer.commands.menu.sub

import ltd.matrixstudios.itemizer.commands.menu.sub.buttons.colors.LeatherColorButton
import ltd.matrixstudios.itemizer.commands.menu.sub.buttons.enchants.EnchantButton
import ltd.matrixstudios.itemizer.menu.Button
import ltd.matrixstudios.itemizer.menu.Menu
import ltd.matrixstudios.itemizer.menu.buttons.ItemStackButton
import ltd.matrixstudios.itemizer.menu.buttons.SimpleActionButton
import ltd.matrixstudios.itemizer.util.Chat
import ltd.matrixstudios.itemizer.util.InputPrompt
import org.bukkit.Color
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.LeatherArmorMeta

class LeatherSelectColorMenu(val player: Player, val item: ItemStack) : Menu(player) {

    init {
        staticSize = 45
        placeholder = true
    }
    override fun getButtons(player: Player): MutableMap<Int, Button> {
        val buttons = mutableMapOf<Int, Button>().apply {
            this[20] = ItemStackButton(item)
            this[11] = SimpleActionButton(Material.NETHER_STAR, mutableListOf(
                "",
                Chat.format("&7Click this to manually enter a &cR&aG&9B"),
                Chat.format("&7value to set this item to"),
                ""
            ), Chat.format("&aCustom Color"), 0).setBody { player, i, clickType ->
                InputPrompt()
                    .withText(Chat.format("&7Enter a brand new value to add as a color. Use the #,#,# format"))
                    .acceptInput {
                        val spliterator = it.split(",")
                        val r = Integer.parseInt(spliterator[0])
                        val g = Integer.parseInt(spliterator[1])
                        val b = Integer.parseInt(spliterator[2])

                        val meta = item.itemMeta!!

                        if (meta is LeatherArmorMeta)
                        {
                            meta.setColor(Color.fromRGB(r, g, b))
                        }
                        item.itemMeta = meta

                        player.updateInventory()
                        player.sendMessage(Chat.format("&aUpdated this armor piece!"))
                    }.start(player)

            }

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