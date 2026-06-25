.class public final synthetic Lcom/swmansion/reanimated/keyboard/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/swmansion/reanimated/keyboard/NotifyAboutKeyboardChangeFunction;


# instance fields
.field public final synthetic a:Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;


# direct methods
.method public synthetic constructor <init>(Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/swmansion/reanimated/keyboard/a;->a:Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final call()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/keyboard/a;->a:Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/swmansion/reanimated/keyboard/KeyboardAnimationManager;->notifyAboutKeyboardChange()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
