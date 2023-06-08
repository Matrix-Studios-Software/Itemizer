package ltd.matrixstudios.itemizer.commands.menu.sub

import ltd.matrixstudios.itemizer.commands.menu.sub.buttons.enchants.EnchantButton
import ltd.matrixstudios.itemizer.menu.Button
import ltd.matrixstudios.itemizer.menu.Menu
import ltd.matrixstudios.itemizer.menu.buttons.ItemStackButton
import ltd.matrixstudios.itemizer.menu.buttons.PlaceholderButton
import ltd.matrixstudios.itemizer.util.Chat
import org.bukkit.enchantments.Enchantment
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

class EnchantMenu(val player: Player, val itemStack: ItemStack): Menu(player) {

    init {
        placeholder = true
        staticSize = 45
    }

    private val lines = arrayOf(13, 22, 31)

    fun getAvailableEnchants() : MutableList<Enchantment> {
        val enchantments = mutableListOf<Enchantment>()

        for (enchantment in Enchantment.values()) {
            if (!enchantment.canEnchantItem(itemStack) && (enchantment.itemTarget != null /*nulls on older versions*/ && !enchantment.itemTarget.includes(itemStack))) continue


            enchantments.add(enchantment)
        }

        return enchantments
    }


    override fun getButtons(player: Player): MutableMap<Int, Button> {
        return hashMapOf<Int, Button>().apply {
            this[20] = ItemStackButton(itemStack)


            val show = arrayListOf<Button>().also { array ->
                array.addAll(getAvailableEnchants().map { EnchantButton(it, itemStack) })
            }

            var index = 0
            for (line in lines) {
                for (i in 0..3) {
                    val button = show.getOrNull(index++) ?: continue

                    this[line + i] = button
                }
            }
        }
    }

    override fun getTitle(player: Player): String {
        return Chat.format("&7Adding New Enchantments")
    }
}