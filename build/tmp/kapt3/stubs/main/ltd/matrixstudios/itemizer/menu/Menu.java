package ltd.matrixstudios.itemizer.menu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00170\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u0003H&J\u0006\u0010\u001b\u001a\u00020\u001cJ\u001c\u0010\u001d\u001a\u00020\f2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00170\u001fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\n\u00a8\u0006 "}, d2 = {"Lltd/matrixstudios/itemizer/menu/Menu;", "", "player", "Lorg/bukkit/entity/Player;", "(Lorg/bukkit/entity/Player;)V", "placeholder", "", "getPlaceholder", "()Z", "setPlaceholder", "(Z)V", "staticSize", "", "getStaticSize", "()Ljava/lang/Integer;", "setStaticSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "stealable", "getStealable", "setStealable", "getAllButtons", "", "Lltd/matrixstudios/itemizer/menu/Button;", "getButtons", "getTitle", "", "openMenu", "", "size", "buttons", "", "Itemizer"})
public abstract class Menu {
    private final org.bukkit.entity.Player player = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer staticSize;
    private boolean placeholder = false;
    private boolean stealable = false;
    
    public Menu(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStaticSize() {
        return null;
    }
    
    public final void setStaticSize(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final boolean getPlaceholder() {
        return false;
    }
    
    public final void setPlaceholder(boolean p0) {
    }
    
    public final boolean getStealable() {
        return false;
    }
    
    public final void setStealable(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.Integer, ltd.matrixstudios.itemizer.menu.Button> getButtons(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getTitle(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player);
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, ltd.matrixstudios.itemizer.menu.Button> getAllButtons() {
        return null;
    }
    
    public int size(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, ? extends ltd.matrixstudios.itemizer.menu.Button> buttons) {
        return 0;
    }
    
    public final void openMenu() {
    }
}