package ltd.matrixstudios.itemizer.commands.menu.sub.buttons.enchants

import ltd.matrixstudios.itemizer.builder.ItemBuilder
import ltd.matrixstudios.itemizer.menu.Button
import ltd.matrixstudios.itemizer.util.Chat
import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType
import org.bukkit.inventory.ItemStack

class EnchantWithLevelButton(val itemstack: ItemStack, val enchantment: Enchantment, val level: Int) : Button() {

    override fun getButtonItem(player: Player): ItemStack {
        return ItemBuilder.of(Material.ENCHANTED_BOOK)
            .amount(if (level < 64) level else 64)
            .setLore(getDescription(player)
                .toMutableList())
            .name(getDisplayName(player))
            .build()
    }

    override fun getMaterial(player: Player): Material {
        TODO()
    }

    override fun getDescription(player: Player): MutableList<String> {
        val desc = mutableListOf<String>()
        desc.add(" ")
        desc.add(Chat.format("&7You are adding enchantment &a" + enchantment.name))
        desc.add(Chat.format("&7with a level of &a$level"))
        desc.add(" ")
        desc.add(Chat.format("&a&lLeft-Click &ato add enchantment!"))
        return desc
    }

    override fun getDisplayName(player: Player): String? {
        return Chat.format("&a" + enchantment.name + " &7(Level " + level + ")")
    }

    override fun getData(player: Player): Short {
        return 0
    }

    override fun onClick(player: Player, slot: Int, type: ClickType) {
        itemstack.addEnchantment(enchantment, level)
        player.sendMessage(Chat.format("&aAdded ${enchantment.name} with level " + level))
        player.updateInventory()
    }
}