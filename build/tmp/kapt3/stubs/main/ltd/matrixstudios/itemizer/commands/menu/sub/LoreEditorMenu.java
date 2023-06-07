package ltd.matrixstudios.itemizer.commands.menu.sub;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lltd/matrixstudios/itemizer/commands/menu/sub/LoreEditorMenu;", "Lltd/matrixstudios/itemizer/menu/types/TextEditorMenu;", "l", "Ljava/util/LinkedList;", "", "player", "Lorg/bukkit/entity/Player;", "stack", "Lorg/bukkit/inventory/ItemStack;", "(Ljava/util/LinkedList;Lorg/bukkit/entity/Player;Lorg/bukkit/inventory/ItemStack;)V", "getStack", "()Lorg/bukkit/inventory/ItemStack;", "onSave", "", "lines", "Itemizer"})
public final class LoreEditorMenu extends ltd.matrixstudios.itemizer.menu.types.TextEditorMenu {
    @org.jetbrains.annotations.NotNull()
    private final org.bukkit.inventory.ItemStack stack = null;
    
    public LoreEditorMenu(@org.jetbrains.annotations.NotNull()
    java.util.LinkedList<java.lang.String> l, @org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    org.bukkit.inventory.ItemStack stack) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.inventory.ItemStack getStack() {
        return null;
    }
    
    @java.lang.Override()
    public void onSave(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    java.util.LinkedList<java.lang.String> lines) {
    }
}