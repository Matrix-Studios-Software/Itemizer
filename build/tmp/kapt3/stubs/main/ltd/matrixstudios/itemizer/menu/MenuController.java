package ltd.matrixstudios.itemizer.menu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006R&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lltd/matrixstudios/itemizer/menu/MenuController;", "", "()V", "menuMap", "Ljava/util/HashMap;", "Ljava/util/UUID;", "Lltd/matrixstudios/itemizer/menu/Menu;", "getMenuMap", "()Ljava/util/HashMap;", "setMenuMap", "(Ljava/util/HashMap;)V", "paginatedMenuMap", "Lltd/matrixstudios/itemizer/menu/pagination/PaginatedMenu;", "getPaginatedMenuMap", "setPaginatedMenuMap", "addToMenuMap", "", "player", "Lorg/bukkit/entity/Player;", "menu", "Itemizer"})
public final class MenuController {
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.itemizer.menu.MenuController INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static java.util.HashMap<java.util.UUID, ltd.matrixstudios.itemizer.menu.Menu> menuMap;
    @org.jetbrains.annotations.NotNull()
    private static java.util.HashMap<java.util.UUID, ltd.matrixstudios.itemizer.menu.pagination.PaginatedMenu> paginatedMenuMap;
    
    private MenuController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.util.UUID, ltd.matrixstudios.itemizer.menu.Menu> getMenuMap() {
        return null;
    }
    
    public final void setMenuMap(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.util.UUID, ltd.matrixstudios.itemizer.menu.Menu> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.util.UUID, ltd.matrixstudios.itemizer.menu.pagination.PaginatedMenu> getPaginatedMenuMap() {
        return null;
    }
    
    public final void setPaginatedMenuMap(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.util.UUID, ltd.matrixstudios.itemizer.menu.pagination.PaginatedMenu> p0) {
    }
    
    public final void addToMenuMap(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.itemizer.menu.Menu menu) {
    }
}