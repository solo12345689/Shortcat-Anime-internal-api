.class public final Lcom/facebook/react/modules/debug/DevSettingsModule;
.super Lcom/facebook/fbreact/specs/NativeDevSettingsSpec;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/debug/DevSettingsModule$a;
    }
.end annotation

.annotation runtime Lk7/a;
    name = "DevSettings"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0010\u0006\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B\u0019\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\nJ\u0017\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\nJ\u0017\u0010\u0018\u001a\u00020\u00082\u0006\u0010\u0017\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\nJ\u0017\u0010\u001b\u001a\u00020\u00082\u0006\u0010\u001a\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u0013J\u0017\u0010\u001d\u001a\u00020\u00082\u0006\u0010\u001c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u000eJ\u0017\u0010 \u001a\u00020\u00082\u0006\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\"\u00a8\u0006%"
    }
    d2 = {
        "Lcom/facebook/react/modules/debug/DevSettingsModule;",
        "Lcom/facebook/fbreact/specs/NativeDevSettingsSpec;",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "reactContext",
        "Lc7/f;",
        "devSupportManager",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;Lc7/f;)V",
        "LTd/L;",
        "reload",
        "()V",
        "",
        "reason",
        "reloadWithReason",
        "(Ljava/lang/String;)V",
        "onFastRefresh",
        "",
        "isHotLoadingEnabled",
        "setHotLoadingEnabled",
        "(Z)V",
        "isProfilingEnabled",
        "setProfilingEnabled",
        "toggleElementInspector",
        "title",
        "addMenuItem",
        "openDebugger",
        "enabled",
        "setIsShakeToShowDevMenuEnabled",
        "eventName",
        "addListener",
        "",
        "count",
        "removeListeners",
        "(D)V",
        "Lc7/f;",
        "Companion",
        "a",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/facebook/react/modules/debug/DevSettingsModule$a;

.field public static final NAME:Ljava/lang/String; = "DevSettings"


# instance fields
.field private final devSupportManager:Lc7/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/modules/debug/DevSettingsModule$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/modules/debug/DevSettingsModule$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/modules/debug/DevSettingsModule;->Companion:Lcom/facebook/react/modules/debug/DevSettingsModule$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lc7/f;)V
    .locals 1

    .line 1
    const-string v0, "devSupportManager"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeDevSettingsSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lcom/facebook/react/modules/debug/DevSettingsModule;->devSupportManager:Lc7/f;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/modules/debug/DevSettingsModule;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/modules/debug/DevSettingsModule;->reload$lambda$0(Lcom/facebook/react/modules/debug/DevSettingsModule;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final addMenuItem$lambda$2(Lcom/facebook/react/modules/debug/DevSettingsModule;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/facebook/react/bridge/ReadableMapBuilder;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/facebook/react/bridge/ReadableMapBuilder;-><init>(Lcom/facebook/react/bridge/WritableMap;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "title"

    .line 11
    .line 12
    invoke-virtual {v1, v2, p1}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const-string p1, "didPressMenuItem"

    .line 22
    .line 23
    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/modules/debug/DevSettingsModule;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/modules/debug/DevSettingsModule;->addMenuItem$lambda$2(Lcom/facebook/react/modules/debug/DevSettingsModule;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final reload$lambda$0(Lcom/facebook/react/modules/debug/DevSettingsModule;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/debug/DevSettingsModule;->devSupportManager:Lc7/f;

    .line 2
    .line 3
    invoke-interface {p0}, Lc7/f;->B()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public addListener(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "eventName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addMenuItem(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "title"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/modules/debug/DevSettingsModule;->devSupportManager:Lc7/f;

    .line 7
    .line 8
    new-instance v1, Lcom/facebook/react/modules/debug/b;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lcom/facebook/react/modules/debug/b;-><init>(Lcom/facebook/react/modules/debug/DevSettingsModule;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, p1, v1}, Lc7/f;->w(Ljava/lang/String;Lc7/e;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onFastRefresh()V
    .locals 0

    .line 1
    return-void
.end method

.method public openDebugger()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/debug/DevSettingsModule;->devSupportManager:Lc7/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-static {v0, v1, v2, v1}, Lc7/f;->G(Lc7/f;Ljava/lang/String;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public reload()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/debug/DevSettingsModule;->devSupportManager:Lc7/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lc7/f;->m()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lcom/facebook/react/modules/debug/c;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lcom/facebook/react/modules/debug/c;-><init>(Lcom/facebook/react/modules/debug/DevSettingsModule;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public reloadWithReason(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "reason"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/DevSettingsModule;->reload()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public removeListeners(D)V
    .locals 0

    .line 1
    return-void
.end method

.method public setHotLoadingEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/debug/DevSettingsModule;->devSupportManager:Lc7/f;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lc7/f;->c(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setIsShakeToShowDevMenuEnabled(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public setProfilingEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/debug/DevSettingsModule;->devSupportManager:Lc7/f;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lc7/f;->i(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public toggleElementInspector()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/debug/DevSettingsModule;->devSupportManager:Lc7/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lc7/f;->g()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
