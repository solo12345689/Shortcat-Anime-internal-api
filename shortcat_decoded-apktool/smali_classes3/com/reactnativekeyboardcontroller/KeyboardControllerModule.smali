.class public final Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;
.super Lcom/reactnativekeyboardcontroller/NativeKeyboardControllerSpec;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u000b2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\rR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;",
        "Lcom/reactnativekeyboardcontroller/NativeKeyboardControllerSpec;",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "mReactContext",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "",
        "getName",
        "()Ljava/lang/String;",
        "",
        "mode",
        "LTd/L;",
        "setInputMode",
        "(D)V",
        "setDefaultMode",
        "()V",
        "preload",
        "",
        "keepFocus",
        "animated",
        "dismiss",
        "(ZZ)V",
        "direction",
        "setFocusTo",
        "(Ljava/lang/String;)V",
        "eventName",
        "addListener",
        "count",
        "removeListeners",
        "LIa/f;",
        "module",
        "LIa/f;",
        "react-native-keyboard-controller_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final module:LIa/f;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    const-string v0, "mReactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/reactnativekeyboardcontroller/NativeKeyboardControllerSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, LIa/f;

    .line 10
    .line 11
    invoke-direct {v0, p1}, LIa/f;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;->module:LIa/f;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public addListener(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public dismiss(ZZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;->module:LIa/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LIa/f;->f(ZZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "KeyboardController"

    .line 2
    .line 3
    return-object v0
.end method

.method public preload()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;->module:LIa/f;

    .line 2
    .line 3
    invoke-virtual {v0}, LIa/f;->l()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeListeners(D)V
    .locals 0

    .line 1
    return-void
.end method

.method public setDefaultMode()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;->module:LIa/f;

    .line 2
    .line 3
    invoke-virtual {v0}, LIa/f;->m()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setFocusTo(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "direction"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;->module:LIa/f;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LIa/f;->n(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setInputMode(D)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;->module:LIa/f;

    .line 2
    .line 3
    double-to-int p1, p1

    .line 4
    invoke-virtual {v0, p1}, LIa/f;->p(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
