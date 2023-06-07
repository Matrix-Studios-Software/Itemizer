package ltd.matrixstudios.itemizer.util

import org.bukkit.Material
import java.lang.Exception

object MaterialCompatibility {

    var STAINED_GLASS_PANE: Material = try {
        Material.getMaterial("LEGACY_STAINED_GLASS_PANE")!!
    } catch (e: Exception) {
        Material.getMaterial("STAINED_GLASS_PANE")!!
    }

}