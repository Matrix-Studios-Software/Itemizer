package ltd.matrixstudios.itemizer.menu.buttons;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\rH\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u001d\u001a\u00020\rH\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\rH\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\rH\u0016J \u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000fH\u0016J(\u0010\u0013\u001a\u00020\u00002 \u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\fR4\u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006\""}, d2 = {"Lltd/matrixstudios/itemizer/menu/buttons/SimpleActionButton;", "Lltd/matrixstudios/itemizer/menu/Button;", "material", "Lorg/bukkit/Material;", "description", "", "", "name", "data", "", "(Lorg/bukkit/Material;Ljava/util/List;Ljava/lang/String;S)V", "body", "Lkotlin/Function3;", "Lorg/bukkit/entity/Player;", "", "Lorg/bukkit/event/inventory/ClickType;", "", "getBody", "()Lkotlin/jvm/functions/Function3;", "setBody", "(Lkotlin/jvm/functions/Function3;)V", "getData", "()S", "getDescription", "()Ljava/util/List;", "getMaterial", "()Lorg/bukkit/Material;", "getName", "()Ljava/lang/String;", "player", "getDisplayName", "onClick", "slot", "type", "Itemizer"})
public final class SimpleActionButton extends ltd.matrixstudios.itemizer.menu.Button {
    @org.jetbrains.annotations.NotNull()
    private final org.bukkit.Material material = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final short data = 0;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function3<? super org.bukkit.entity.Player, ? super java.lang.Integer, ? super org.bukkit.event.inventory.ClickType, kotlin.Unit> body;
    
    public SimpleActionButton(@org.jetbrains.annotations.NotNull()
    org.bukkit.Material material, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> description, @org.jetbrains.annotations.NotNull()
    java.lang.String name, short data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.Material getMaterial() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final short getData() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function3<org.bukkit.entity.Player, java.lang.Integer, org.bukkit.event.inventory.ClickType, kotlin.Unit> getBody() {
        return null;
    }
    
    public final void setBody(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function3<? super org.bukkit.entity.Player, ? super java.lang.Integer, ? super org.bukkit.event.inventory.ClickType, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.itemizer.menu.buttons.SimpleActionButton setBody(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function3<? super org.bukkit.entity.Player, ? super java.lang.Integer, ? super org.bukkit.event.inventory.ClickType, kotlin.Unit> body) {
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