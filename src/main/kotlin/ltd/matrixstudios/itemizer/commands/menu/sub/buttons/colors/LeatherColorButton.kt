package ltd.matrixstudios.itemizer.commands.menu.sub.buttons.colors

import ltd.matrixstudios.itemizer.builder.ItemBuilder
import ltd.matrixstudios.itemizer.menu.Button
import ltd.matrixstudios.itemizer.util.Chat
import net.md_5.bungee.api.ChatColor
import org.bukkit.Color
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.LeatherArmorMeta

class LeatherColorButton(val color: Color, val itemStack: ItemStack) : Button() {

    override fun getButtonItem(player: Player): ItemStack? {
        return ItemBuilder.copyOf(itemStack).color(color).build()
    }
    override fun getMaterial(player: Player): Material {
        TODO("Not yet implemented")
    }

    override fun getDescription(player: Player): MutableList<String>? {
        val desc = mutableListOf<String>()
        desc.add(" ")
        desc.add(Chat.format("&7Click here to set this armor's"))
        desc.add(Chat.format("&7color"))
        desc.add(" ")
        return desc
    }

    override fun getDisplayName(player: Player): String? {
        return Chat.format("&aNew Dye")
    }

    override fun getData(player: Player): Short {
        TODO("Not yet implemented")
    }

    override fun onClick(player: Player, slot: Int, type: ClickType) {
        val meta = itemStack.itemMeta!!

        if (meta is LeatherArmorMeta)
        {
            meta.setColor(color)
        }
        itemStack.itemMeta = meta

        player.updateInventory()
        player.sendMessage(Chat.format("&aUpdated this armor piece!"))
    }
}