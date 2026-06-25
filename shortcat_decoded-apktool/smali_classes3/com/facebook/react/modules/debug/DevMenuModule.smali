.class public final Lcom/facebook/react/modules/debug/DevMenuModule;
.super Lcom/facebook/fbreact/specs/NativeDevMenuSpec;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/debug/DevMenuModule$a;
    }
.end annotation

.annotation runtime Lk7/a;
    name = "DevMenu"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0019\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0011\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/facebook/react/modules/debug/DevMenuModule;",
        "Lcom/facebook/fbreact/specs/NativeDevMenuSpec;",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "reactContext",
        "Lc7/f;",
        "devSupportManager",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;Lc7/f;)V",
        "LTd/L;",
        "show",
        "()V",
        "reload",
        "",
        "enabled",
        "setProfilingEnabled",
        "(Z)V",
        "setHotLoadingEnabled",
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
.field public static final Companion:Lcom/facebook/react/modules/debug/DevMenuModule$a;

.field public static final NAME:Ljava/lang/String; = "DevMenu"


# instance fields
.field private final devSupportManager:Lc7/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/modules/debug/DevMenuModule$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/modules/debug/DevMenuModule$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/modules/debug/DevMenuModule;->Companion:Lcom/facebook/react/modules/debug/DevMenuModule$a;

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
    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeDevMenuSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lcom/facebook/react/modules/debug/DevMenuModule;->devSupportManager:Lc7/f;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/modules/debug/DevMenuModule;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/modules/debug/DevMenuModule;->reload$lambda$0(Lcom/facebook/react/modules/debug/DevMenuModule;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final reload$lambda$0(Lcom/facebook/react/modules/debug/DevMenuModule;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/debug/DevMenuModule;->devSupportManager:Lc7/f;

    .line 2
    .line 3
    invoke-interface {p0}, Lc7/f;->B()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public reload()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/debug/DevMenuModule;->devSupportManager:Lc7/f;

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
    new-instance v0, Lcom/facebook/react/modules/debug/a;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lcom/facebook/react/modules/debug/a;-><init>(Lcom/facebook/react/modules/debug/DevMenuModule;)V

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

.method public setHotLoadingEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/debug/DevMenuModule;->devSupportManager:Lc7/f;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lc7/f;->c(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setProfilingEnabled(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public show()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/debug/DevMenuModule;->devSupportManager:Lc7/f;

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
    iget-object v0, p0, Lcom/facebook/react/modules/debug/DevMenuModule;->devSupportManager:Lc7/f;

    .line 10
    .line 11
    invoke-interface {v0}, Lc7/f;->F()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
