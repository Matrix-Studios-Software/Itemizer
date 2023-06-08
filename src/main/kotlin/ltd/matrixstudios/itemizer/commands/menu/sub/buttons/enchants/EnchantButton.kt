package ltd.matrixstudios.itemizer.commands.menu.sub.buttons.enchants

import ltd.matrixstudios.itemizer.commands.menu.sub.EnchantLevelMenu
import ltd.matrixstudios.itemizer.menu.Button
import ltd.matrixstudios.itemizer.util.Chat
import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType
import org.bukkit.inventory.ItemStack

class EnchantButton(val enchantment: Enchantment, val itemStack: ItemStack) : Button() {
    override fun getMaterial(player: Player): Material {
        return Material.ENCHANTED_BOOK
    }

    override fun getDescription(player: Player): MutableList<String>? {
        val desc = mutableListOf<String>()
        desc.add(" ")
        desc.add(Chat.format("&7Click to view all possible levels in which your"))
        desc.add(Chat.format("${if (itemStack.hasItemMeta()) itemStack.itemMeta!!.displayName else "&f" + itemStack.type.name} &7can be"))
        desc.add(Chat.format("&7enchanted with &a" + enchantment.name))
        desc.add(" ")
        desc.add(Chat.format(if (itemStack.containsEnchantment(enchantment)) "&a✓ Has Enchant &7(Level ${itemStack.getEnchantmentLevel(enchantment)})" else "&c✗ No Enchant"))
        desc.add(" ")
        return desc
    }

    override fun getDisplayName(player: Player): String? {
        return Chat.format("&a" + enchantment.name)
    }

    override fun getData(player: Player): Short {
        return 0
    }

    override fun onClick(player: Player, slot: Int, type: ClickType) {
        EnchantLevelMenu(player, itemStack, enchantment).openMenu()
    }
}