package ltd.matrixstudios.itemizer.commands.menu

import ltd.matrixstudios.itemizer.commands.menu.sub.EnchantMenu
import ltd.matrixstudios.itemizer.commands.menu.sub.LeatherSelectColorMenu
import ltd.matrixstudios.itemizer.commands.menu.sub.LoreEditorMenu
import ltd.matrixstudios.itemizer.menu.Button
import ltd.matrixstudios.itemizer.menu.Menu
import ltd.matrixstudios.itemizer.menu.buttons.ItemStackButton
import ltd.matrixstudios.itemizer.menu.buttons.PlaceholderButton
import ltd.matrixstudios.itemizer.menu.buttons.SimpleActionButton
import ltd.matrixstudios.itemizer.util.Chat
import ltd.matrixstudios.itemizer.util.InputPrompt
import ltd.matrixstudios.itemizer.util.MaterialCompatibility
import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.LeatherArmorMeta
import java.util.*

class ItemizerMenu(player: Player, val itemStack: ItemStack) : Menu(player) {

    init {
        placeholder = true
        staticSize = 54
    }

    val borderSlots = arrayOf(12, 13, 14, 21, 23, 30, 31, 32)

    override fun getButtons(player: Player): MutableMap<Int, Button> {
        val buttons = mutableMapOf<Int, Button>()
        buttons[22] = ItemStackButton(itemStack)

        for (slot in borderSlots) {
            buttons[slot] = PlaceholderButton(MaterialCompatibility.STAINED_GLASS_PANE, mutableListOf(
                " ",
                Chat.format("&7Modify your ${if (itemStack.hasItemMeta()) Chat.format(itemStack.itemMeta!!.displayName) else Chat.format("&f" + itemStack.type.name)}"),
                Chat.format("&7to your liking using this menu."),
                " ",
                Chat.format("&aEnchanted&7: &r" + if (itemStack.enchantments.isNotEmpty()) "&a✓ Is Enchanted" else "&c✗ Not Enchanted"),
                Chat.format("&aEnchants&7: &e" + (Enchantment.values().count { it.canEnchantItem(itemStack) && itemStack.containsEnchantment(it) }.toString() + "&7/&a" + (Enchantment.values().count { it.canEnchantItem(itemStack)}))),
                Chat.format("&aAmount&7: &f" + itemStack.amount),
                Chat.format("&aDurability&7: &f" + itemStack.durability),
                " "
            ), if (itemStack.hasItemMeta()) Chat.format(itemStack.itemMeta!!.displayName) else Chat.format("&f" + itemStack.type.name), 1)
        }

        buttons[15] = SimpleActionButton(Material.PAPER, mutableListOf(
            " ",
            Chat.format("&7Click here to input a new &aDisplay Name"),
            Chat.format("&7for the item. This input supports all"),
            Chat.format("&cC&6o&el&ao&br &9C&3o&dd&5e&7s"),
            " ",
            Chat.format("&a&lLeft-Click &ato choose a new name")
        ), Chat.format("&aDisplay Name"), 0).setBody { player, i, clickType ->
            InputPrompt()
                .withText(Chat.format("&7Please input a new &aDisplay Name &7to name this item as"))
                .acceptInput {
                    val meta = itemStack.itemMeta!!

                    meta.setDisplayName(Chat.format(it))
                    itemStack.itemMeta = meta
                    player.updateInventory()

                    ItemizerMenu(player, itemStack).openMenu()
                }.start(player)
        }

        buttons[16] = SimpleActionButton(Material.CHEST, mutableListOf(
            " ",
            Chat.format("&7Click here to edit the &aLore"),
            Chat.format("&7for the item. This action will open"),
            Chat.format("&7a &asub-menu"),
            " ",
            Chat.format("&a&lLeft-Click &ato open the menu")
        ), Chat.format("&aLore"), 0).setBody { player, i, clickType ->
            val meta = itemStack.itemMeta!!

            if (!meta.hasLore()) {
                LoreEditorMenu(LinkedList(), player, itemStack).updateMenu()
            } else {
                LoreEditorMenu(LinkedList(meta.lore!!), player, itemStack).updateMenu()
            }
        }

        buttons[24] = SimpleActionButton(Material.REDSTONE_BLOCK, mutableListOf(
            " ",
            Chat.format("&7Click here to input a new &aAmount"),
            Chat.format("&7for the item. This input &cmust &7be a"),
            Chat.format("&apositive integer"),
            " ",
            Chat.format("&a&lLeft-Click &ato state a new amount")
        ), Chat.format("&aAmount"), 0).setBody { player, i, clickType ->
            InputPrompt()
                .withText(Chat.format("&7Please input a new &aAmount &7to set this item to"))
                .acceptInput {
                    var int = 1

                    try {
                        int = Integer.parseInt(it)
                    } catch (e: Exception) {
                        player.sendMessage(Chat.format("&cThis is not a valid integer!"))
                        return@acceptInput
                    }

                    itemStack.amount = int
                    player.updateInventory()

                    ItemizerMenu(player, itemStack).openMenu()
                }.start(player)
        }

        buttons[25] = SimpleActionButton(Material.ANVIL, mutableListOf(
            " ",
            Chat.format("&7Click here to input a new &aDurability"),
            Chat.format("&7for the item. This input &cmust &7be a"),
            Chat.format("&apositive integer"),
            " ",
            Chat.format("&a&lLeft-Click &ato state a new durability")
        ), Chat.format("&aDurability"), 0).setBody { player, i, clickType ->
            InputPrompt()
                .withText(Chat.format("&7Please input a new &aDurability &7to set this item to"))
                .acceptInput {
                    var int = 1

                    try {
                        int = Integer.parseInt(it)
                    } catch (e: Exception) {
                        player.sendMessage(Chat.format("&cThis is not a valid integer!"))
                        return@acceptInput
                    }

                    itemStack.durability = int.toShort()
                    player.updateInventory()

                    ItemizerMenu(player, itemStack).openMenu()
                }.start(player)
        }

        buttons[33] = SimpleActionButton(Material.BOOK, mutableListOf(
            " ",
            Chat.format("&7Click here to select new &aEnchants"),
            Chat.format("&7for the item. This will open a &asub menu"),
            " ",
            Chat.format("&a&lLeft-Click &ato open the menu")
        ), Chat.format("&aEnchants"), 0).setBody { player, i, clickType ->
            EnchantMenu(player, itemStack).openMenu()
        }

        if (itemStack.itemMeta!! is LeatherArmorMeta)
        {
            buttons[34] = SimpleActionButton(Material.LEATHER_CHESTPLATE, mutableListOf(
                " ",
                Chat.format("&7Click here to set the &cC&6o&el&ao&9r"),
                Chat.format("&7of this armor piece."),
                " ",
                Chat.format("&a&lLeft-Click &ato open the menu")
            ), Chat.format("&aSelect Color"), 0).setBody { player, i, clickType ->
                LeatherSelectColorMenu(player, itemStack).openMenu()
            }

        }

        return buttons
    }

    override fun getTitle(player: Player): String {
        return Chat.format("&7Editing Item")

    }
}