package ltd.matrixstudios.itemizer.menu.types;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lltd/matrixstudios/itemizer/menu/types/TextEditorMenu;", "Lltd/matrixstudios/itemizer/menu/pagination/PaginatedMenu;", "lines", "Ljava/util/LinkedList;", "", "player", "Lorg/bukkit/entity/Player;", "(Ljava/util/LinkedList;Lorg/bukkit/entity/Player;)V", "getPlayer", "()Lorg/bukkit/entity/Player;", "getHeaderItems", "", "", "Lltd/matrixstudios/itemizer/menu/Button;", "getPagesButtons", "getTitle", "onSave", "", "CreateNewLineButton", "LineButton", "Itemizer"})
public abstract class TextEditorMenu extends ltd.matrixstudios.itemizer.menu.pagination.PaginatedMenu {
    private final java.util.LinkedList<java.lang.String> lines = null;
    @org.jetbrains.annotations.NotNull()
    private final org.bukkit.entity.Player player = null;
    
    public TextEditorMenu(@org.jetbrains.annotations.NotNull()
    java.util.LinkedList<java.lang.String> lines, @org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        super(0, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.entity.Player getPlayer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.Integer, ltd.matrixstudios.itemizer.menu.Button> getPagesButtons(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    public abstract void onSave(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    java.util.LinkedList<java.lang.String> lines);
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.Integer, ltd.matrixstudios.itemizer.menu.Button> getHeaderItems(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lltd/matrixstudios/itemizer/menu/types/TextEditorMenu$LineButton;", "Lltd/matrixstudios/itemizer/menu/Button;", "line", "", "totalStrings", "Ljava/util/LinkedList;", "menu", "Lltd/matrixstudios/itemizer/menu/types/TextEditorMenu;", "(Ljava/lang/String;Ljava/util/LinkedList;Lltd/matrixstudios/itemizer/menu/types/TextEditorMenu;)V", "getLine", "()Ljava/lang/String;", "getMenu", "()Lltd/matrixstudios/itemizer/menu/types/TextEditorMenu;", "getTotalStrings", "()Ljava/util/LinkedList;", "getData", "", "player", "Lorg/bukkit/entity/Player;", "getDescription", "", "getDisplayName", "getMaterial", "Lorg/bukkit/Material;", "onClick", "", "slot", "", "type", "Lorg/bukkit/event/inventory/ClickType;", "Itemizer"})
    public static final class LineButton extends ltd.matrixstudios.itemizer.menu.Button {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String line = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.LinkedList<java.lang.String> totalStrings = null;
        @org.jetbrains.annotations.NotNull()
        private final ltd.matrixstudios.itemizer.menu.types.TextEditorMenu menu = null;
        
        public LineButton(@org.jetbrains.annotations.NotNull()
        java.lang.String line, @org.jetbrains.annotations.NotNull()
        java.util.LinkedList<java.lang.String> totalStrings, @org.jetbrains.annotations.NotNull()
        ltd.matrixstudios.itemizer.menu.types.TextEditorMenu menu) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLine() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.LinkedList<java.lang.String> getTotalStrings() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ltd.matrixstudios.itemizer.menu.types.TextEditorMenu getMenu() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.bukkit.Material getMaterial(@org.jetbrains.annotations.NotNull()
        org.bukkit.entity.Player player) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.util.List<java.lang.String> getDescription(@org.jetbrains.annotations.NotNull()
        org.bukkit.entity.Player player) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.String getDisplayName(@org.jetbrains.annotations.NotNull()
        org.bukkit.entity.Player player) {
            return null;
        }
        
        @java.lang.Override()
        public short getData(@org.jetbrains.annotations.NotNull()
        org.bukkit.entity.Player player) {
            return 0;
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        org.bukkit.entity.Player player, int slot, @org.jetbrains.annotations.NotNull()
        org.bukkit.event.inventory.ClickType type) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lltd/matrixstudios/itemizer/menu/types/TextEditorMenu$CreateNewLineButton;", "Lltd/matrixstudios/itemizer/menu/Button;", "lines", "Ljava/util/LinkedList;", "", "menu", "Lltd/matrixstudios/itemizer/menu/types/TextEditorMenu;", "(Ljava/util/LinkedList;Lltd/matrixstudios/itemizer/menu/types/TextEditorMenu;)V", "getLines", "()Ljava/util/LinkedList;", "getMenu", "()Lltd/matrixstudios/itemizer/menu/types/TextEditorMenu;", "getData", "", "player", "Lorg/bukkit/entity/Player;", "getDescription", "", "getDisplayName", "getMaterial", "Lorg/bukkit/Material;", "onClick", "", "slot", "", "type", "Lorg/bukkit/event/inventory/ClickType;", "Itemizer"})
    public static final class CreateNewLineButton extends ltd.matrixstudios.itemizer.menu.Button {
        @org.jetbrains.annotations.NotNull()
        private final java.util.LinkedList<java.lang.String> lines = null;
        @org.jetbrains.annotations.NotNull()
        private final ltd.matrixstudios.itemizer.menu.types.TextEditorMenu menu = null;
        
        public CreateNewLineButton(@org.jetbrains.annotations.NotNull()
        java.util.LinkedList<java.lang.String> lines, @org.jetbrains.annotations.NotNull()
        ltd.matrixstudios.itemizer.menu.types.TextEditorMenu menu) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.LinkedList<java.lang.String> getLines() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ltd.matrixstudios.itemizer.menu.types.TextEditorMenu getMenu() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.bukkit.Material getMaterial(@org.jetbrains.annotations.NotNull()
        org.bukkit.entity.Player player) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.util.List<java.lang.String> getDescription(@org.jetbrains.annotations.NotNull()
        org.bukkit.entity.Player player) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.String getDisplayName(@org.jetbrains.annotations.NotNull()
        org.bukkit.entity.Player player) {
            return null;
        }
        
        @java.lang.Override()
        public short getData(@org.jetbrains.annotations.NotNull()
        org.bukkit.entity.Player player) {
            return 0;
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        org.bukkit.entity.Player player, int slot, @org.jetbrains.annotations.NotNull()
        org.bukkit.event.inventory.ClickType type) {
        }
    }
}