package ltd.matrixstudios.itemizer.menu.buttons

import ltd.matrixstudios.itemizer.menu.Button
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType
import org.bukkit.inventory.ItemStack

class ItemStackButton(val itemStack: ItemStack) : Button() {
    override fun getMaterial(player: Player): Material {
        TODO("Not yet implemented")
    }

    override fun getButtonItem(player: Player): ItemStack? {
        return itemStack
    }

    override fun getDescription(player: Player): MutableList<String>? {
        TODO("Not yet implemented")
    }

    override fun getDisplayName(player: Player): String? {
        TODO("Not yet implemented")
    }

    override fun getData(player: Player): Short {
        TODO("Not yet implemented")
    }

    override fun onClick(player: Player, slot: Int, type: ClickType) {
        return
    }
}