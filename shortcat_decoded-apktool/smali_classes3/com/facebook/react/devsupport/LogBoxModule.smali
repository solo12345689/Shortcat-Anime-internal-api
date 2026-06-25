.class public final Lcom/facebook/react/devsupport/LogBoxModule;
.super Lcom/facebook/fbreact/specs/NativeLogBoxSpec;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/LogBoxModule$a;
    }
.end annotation

.annotation runtime Lk7/a;
    name = "LogBox"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0019\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\nR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/facebook/react/devsupport/LogBoxModule;",
        "Lcom/facebook/fbreact/specs/NativeLogBoxSpec;",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "reactContext",
        "Lc7/f;",
        "devSupportManager",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;Lc7/f;)V",
        "LTd/L;",
        "show",
        "()V",
        "hide",
        "invalidate",
        "LU6/g;",
        "surfaceDelegate",
        "LU6/g;",
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
.field public static final Companion:Lcom/facebook/react/devsupport/LogBoxModule$a;

.field public static final NAME:Ljava/lang/String; = "LogBox"


# instance fields
.field private final surfaceDelegate:LU6/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/LogBoxModule$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/LogBoxModule$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/devsupport/LogBoxModule;->Companion:Lcom/facebook/react/devsupport/LogBoxModule$a;

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
    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeLogBoxSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 7
    .line 8
    .line 9
    const-string p1, "LogBox"

    .line 10
    .line 11
    invoke-interface {p2, p1}, Lc7/f;->d(Ljava/lang/String;)LU6/g;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    new-instance p1, Lcom/facebook/react/devsupport/j0;

    .line 18
    .line 19
    invoke-direct {p1, p2}, Lcom/facebook/react/devsupport/j0;-><init>(Lc7/f;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iput-object p1, p0, Lcom/facebook/react/devsupport/LogBoxModule;->surfaceDelegate:LU6/g;

    .line 23
    .line 24
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/devsupport/LogBoxModule;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/LogBoxModule;->invalidate$lambda$2(Lcom/facebook/react/devsupport/LogBoxModule;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/devsupport/LogBoxModule;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/LogBoxModule;->hide$lambda$1(Lcom/facebook/react/devsupport/LogBoxModule;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lcom/facebook/react/devsupport/LogBoxModule;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/LogBoxModule;->show$lambda$0(Lcom/facebook/react/devsupport/LogBoxModule;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final hide$lambda$1(Lcom/facebook/react/devsupport/LogBoxModule;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/LogBoxModule;->surfaceDelegate:LU6/g;

    .line 2
    .line 3
    invoke-interface {p0}, LU6/g;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static final invalidate$lambda$2(Lcom/facebook/react/devsupport/LogBoxModule;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/LogBoxModule;->surfaceDelegate:LU6/g;

    .line 2
    .line 3
    invoke-interface {p0}, LU6/g;->f()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static final show$lambda$0(Lcom/facebook/react/devsupport/LogBoxModule;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/LogBoxModule;->surfaceDelegate:LU6/g;

    .line 2
    .line 3
    invoke-interface {v0}, LU6/g;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/react/devsupport/LogBoxModule;->surfaceDelegate:LU6/g;

    .line 10
    .line 11
    const-string v1, "LogBox"

    .line 12
    .line 13
    invoke-interface {v0, v1}, LU6/g;->e(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object p0, p0, Lcom/facebook/react/devsupport/LogBoxModule;->surfaceDelegate:LU6/g;

    .line 17
    .line 18
    invoke-interface {p0}, LU6/g;->c()V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public hide()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/k0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/k0;-><init>(Lcom/facebook/react/devsupport/LogBoxModule;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public invalidate()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/l0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/l0;-><init>(Lcom/facebook/react/devsupport/LogBoxModule;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public show()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/m0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/m0;-><init>(Lcom/facebook/react/devsupport/LogBoxModule;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method
