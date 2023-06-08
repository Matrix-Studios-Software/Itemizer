package ltd.matrixstudios.itemizer.commands.menu.sub

import ltd.matrixstudios.itemizer.commands.menu.sub.buttons.enchants.EnchantButton
import ltd.matrixstudios.itemizer.commands.menu.sub.buttons.enchants.EnchantWithLevelButton
import ltd.matrixstudios.itemizer.menu.Button
import ltd.matrixstudios.itemizer.menu.Menu
import ltd.matrixstudios.itemizer.menu.buttons.ItemStackButton
import ltd.matrixstudios.itemizer.menu.buttons.PlaceholderButton
import ltd.matrixstudios.itemizer.menu.buttons.SimpleActionButton
import ltd.matrixstudios.itemizer.util.Chat
import ltd.matrixstudios.itemizer.util.InputPrompt
import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

class EnchantLevelMenu(val player: Player, val itemStack: ItemStack, val enchantment: Enchantment): Menu(player) {

    init {
        placeholder = true
        staticSize = 45
    }

    private val lines = arrayOf(13, 22, 31)

    fun getAvailableEnchantLevels() : MutableList<Int> {
        val enchantments = mutableListOf<Int>()

        for (int in 1 until enchantment.maxLevel + 1) enchantments.add(int)

        return enchantments
    }


    override fun getButtons(player: Player): MutableMap<Int, Button> {
        return hashMapOf<Int, Button>().apply {
            this[20] = ItemStackButton(itemStack)
            this[36] = SimpleActionButton(Material.ARROW, mutableListOf(), Chat.format("&aNavigate Back"), 0).setBody { player, i, clickType ->  EnchantMenu(player, itemStack).openMenu() }
            this[11] = SimpleActionButton(Material.NAME_TAG, mutableListOf(
                " ",
                Chat.format("&7Is your enchantment level &ctoo high"),
                Chat.format("&7for this item type? &aNo problem! &7You can choose"),
                Chat.format("&7a custom level here"),
                " "
            ), Chat.format("&aCustom Level"), 0).setBody { player, i, clickType ->
                InputPrompt()
                    .withText(Chat.format("&7Enter a new &alevel &7to add to this enchantment"))
                    .acceptInput {
                        var int: Int = 1

                        try {
                            int = Integer.parseInt(it)
                        } catch (e: Exception)
                        {
                            player.sendMessage(Chat.format("&cInvalid value"))
                            return@acceptInput
                        }

                        itemStack.addUnsafeEnchantment(enchantment, int)
                        player.updateInventory()
                        player.sendMessage(Chat.format("&aAdded a new unsafe enchantment to your item!"))
                    }.start(player)
            }


            val show = arrayListOf<Button>().also { array ->
                array.addAll(getAvailableEnchantLevels().map { EnchantWithLevelButton(itemStack, enchantment, it) })
            }

            var index = 0
            for (line in lines) {
                for (i in 0..2) {
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