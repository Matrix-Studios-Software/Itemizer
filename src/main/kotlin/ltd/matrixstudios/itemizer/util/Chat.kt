package ltd.matrixstudios.itemizer.util

import net.md_5.bungee.api.ChatColor
import java.util.regex.Matcher
import java.util.regex.Pattern

object Chat {

    fun format(message: String): String {
        val HEX_PATTERN: Pattern = Pattern.compile("&#(\\w{5}[0-9a-f])")
        val matcher: Matcher = HEX_PATTERN.matcher(message)
        val buffer = StringBuffer()
        while (matcher.find()) {
            matcher.appendReplacement(buffer, ChatColor.of("#" + matcher.group(1)).toString())
        }
        return ChatColor.translateAlternateColorCodes('&', matcher.appendTail(buffer).toString())
    }
}