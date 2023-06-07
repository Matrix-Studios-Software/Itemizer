package ltd.matrixstudios.itemizer.builder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\r\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\u00020\u00002\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00002\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r\"\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0006J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012J\u0014\u0010\u001f\u001a\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120!J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lltd/matrixstudios/itemizer/builder/ItemBuilder;", "", "material", "Lorg/bukkit/Material;", "(Lorg/bukkit/Material;)V", "amount", "", "(Lorg/bukkit/Material;I)V", "item", "Lorg/bukkit/inventory/ItemStack;", "(Lorg/bukkit/inventory/ItemStack;)V", "addFlags", "flags", "", "Lorg/bukkit/inventory/ItemFlag;", "([Lorg/bukkit/inventory/ItemFlag;)Lltd/matrixstudios/itemizer/builder/ItemBuilder;", "addToLore", "parts", "", "([Ljava/lang/String;)Lltd/matrixstudios/itemizer/builder/ItemBuilder;", "build", "color", "Lorg/bukkit/Color;", "data", "", "enchant", "enchantment", "Lorg/bukkit/enchantments/Enchantment;", "level", "name", "displayName", "setLore", "l", "", "unenchant", "Companion", "Itemizer"})
public final class ItemBuilder {
    private final org.bukkit.inventory.ItemStack item = null;
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.itemizer.builder.ItemBuilder.Companion Companion = null;
    
    public ItemBuilder(@org.jetbrains.annotations.NotNull()
    org.bukkit.inventory.ItemStack item) {
        super();
    }
    
    public ItemBuilder(@org.jetbrains.annotations.NotNull()
    org.bukkit.Material material) {
        super();
    }
    
    public ItemBuilder(@org.jetbrains.annotations.NotNull()
    org.bukkit.Material material, int amount) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.itemizer.builder.ItemBuilder amount(int amount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.itemizer.builder.ItemBuilder data(short data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.itemizer.builder.ItemBuilder enchant(@org.jetbrains.annotations.NotNull()
    org.bukkit.enchantments.Enchantment enchantment, int level) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.itemizer.builder.ItemBuilder unenchant(@org.jetbrains.annotations.NotNull()
    org.bukkit.enchantments.Enchantment enchantment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.itemizer.builder.ItemBuilder name(@org.jetbrains.annotations.Nullable()
    java.lang.String displayName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.itemizer.builder.ItemBuilder addToLore(@org.jetbrains.annotations.NotNull()
    java.lang.String... parts) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.itemizer.builder.ItemBuilder setLore(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.String> l) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.itemizer.builder.ItemBuilder color(@org.jetbrains.annotations.NotNull()
    org.bukkit.Color color) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.itemizer.builder.ItemBuilder addFlags(@org.jetbrains.annotations.NotNull()
    org.bukkit.inventory.ItemFlag... flags) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.inventory.ItemStack build() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final ltd.matrixstudios.itemizer.builder.ItemBuilder of(@org.jetbrains.annotations.NotNull()
    org.bukkit.Material material) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final ltd.matrixstudios.itemizer.builder.ItemBuilder of(@org.jetbrains.annotations.NotNull()
    org.bukkit.Material material, int amount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final ltd.matrixstudios.itemizer.builder.ItemBuilder copyOf(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.itemizer.builder.ItemBuilder builder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final ltd.matrixstudios.itemizer.builder.ItemBuilder copyOf(@org.jetbrains.annotations.NotNull()
    org.bukkit.inventory.ItemStack item) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lltd/matrixstudios/itemizer/builder/ItemBuilder$Companion;", "", "()V", "copyOf", "Lltd/matrixstudios/itemizer/builder/ItemBuilder;", "builder", "item", "Lorg/bukkit/inventory/ItemStack;", "of", "material", "Lorg/bukkit/Material;", "amount", "", "Itemizer"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final ltd.matrixstudios.itemizer.builder.ItemBuilder of(@org.jetbrains.annotations.NotNull()
        org.bukkit.Material material) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final ltd.matrixstudios.itemizer.builder.ItemBuilder of(@org.jetbrains.annotations.NotNull()
        org.bukkit.Material material, int amount) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final ltd.matrixstudios.itemizer.builder.ItemBuilder copyOf(@org.jetbrains.annotations.NotNull()
        ltd.matrixstudios.itemizer.builder.ItemBuilder builder) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final ltd.matrixstudios.itemizer.builder.ItemBuilder copyOf(@org.jetbrains.annotations.NotNull()
        org.bukkit.inventory.ItemStack item) {
            return null;
        }
    }
}