package ltd.matrixstudios.itemizer.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\r\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u001c\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lltd/matrixstudios/itemizer/util/InputPrompt;", "Lorg/bukkit/conversations/StringPrompt;", "()V", "charLimit", "", "fail", "Lkotlin/Function1;", "", "", "promptText", "regex", "Lkotlin/text/Regex;", "use", "acceptInput", "Lorg/bukkit/conversations/Prompt;", "context", "Lorg/bukkit/conversations/ConversationContext;", "input", "getPromptText", "onFail", "start", "player", "Lorg/bukkit/entity/Player;", "withLimit", "limit", "withRegex", "withText", "text", "Itemizer"})
public final class InputPrompt extends org.bukkit.conversations.StringPrompt {
    private java.lang.String promptText;
    private int charLimit = -1;
    private kotlin.text.Regex regex;
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> use;
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> fail;
    
    public InputPrompt() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.itemizer.util.InputPrompt withText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.itemizer.util.InputPrompt withLimit(int limit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.itemizer.util.InputPrompt withRegex(@org.jetbrains.annotations.NotNull()
    kotlin.text.Regex regex) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.itemizer.util.InputPrompt acceptInput(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> use) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.itemizer.util.InputPrompt onFail(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> use) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getPromptText(@org.jetbrains.annotations.NotNull()
    org.bukkit.conversations.ConversationContext context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.bukkit.conversations.Prompt acceptInput(@org.jetbrains.annotations.NotNull()
    org.bukkit.conversations.ConversationContext context, @org.jetbrains.annotations.Nullable()
    java.lang.String input) {
        return null;
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
}