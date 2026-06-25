.class public final Lcom/facebook/react/modules/debug/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/debug/h$a;
    }
.end annotation


# static fields
.field private static final l:Lcom/facebook/react/modules/debug/h$a;


# instance fields
.field private final a:Lcom/facebook/react/bridge/ReactContext;

.field private b:Landroid/view/Choreographer;

.field private final c:Lcom/facebook/react/modules/debug/d;

.field private d:J

.field private e:J

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:D

.field private k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/modules/debug/h$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/modules/debug/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/modules/debug/h;->l:Lcom/facebook/react/modules/debug/h$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 2

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/facebook/react/modules/debug/h;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 10
    .line 11
    new-instance p1, Lcom/facebook/react/modules/debug/d;

    .line 12
    .line 13
    invoke-direct {p1}, Lcom/facebook/react/modules/debug/d;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/facebook/react/modules/debug/h;->c:Lcom/facebook/react/modules/debug/d;

    .line 17
    .line 18
    const-wide/16 v0, -0x1

    .line 19
    .line 20
    iput-wide v0, p0, Lcom/facebook/react/modules/debug/h;->d:J

    .line 21
    .line 22
    iput-wide v0, p0, Lcom/facebook/react/modules/debug/h;->e:J

    .line 23
    .line 24
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    .line 25
    .line 26
    iput-wide v0, p0, Lcom/facebook/react/modules/debug/h;->j:D

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, p0, Lcom/facebook/react/modules/debug/h;->k:Z

    .line 30
    .line 31
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/modules/debug/h;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/modules/debug/h;->n(Lcom/facebook/react/modules/debug/h;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/modules/debug/h;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/modules/debug/h;->p(Lcom/facebook/react/modules/debug/h;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/modules/debug/h;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    return v0
.end method

.method private final i()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/modules/debug/h;->e:J

    .line 2
    .line 3
    long-to-double v0, v0

    .line 4
    iget-wide v2, p0, Lcom/facebook/react/modules/debug/h;->d:J

    .line 5
    .line 6
    long-to-double v2, v2

    .line 7
    sub-double/2addr v0, v2

    .line 8
    const-wide v2, 0x412e848000000000L    # 1000000.0

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    div-double/2addr v0, v2

    .line 14
    double-to-int v0, v0

    .line 15
    return v0
.end method

.method public static synthetic m(Lcom/facebook/react/modules/debug/h;DILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    iget-wide p1, p0, Lcom/facebook/react/modules/debug/h;->j:D

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/modules/debug/h;->l(D)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static final n(Lcom/facebook/react/modules/debug/h;)V
    .locals 1

    .line 1
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/facebook/react/modules/debug/h;->b:Landroid/view/Choreographer;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method private static final p(Lcom/facebook/react/modules/debug/h;)V
    .locals 1

    .line 1
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/facebook/react/modules/debug/h;->b:Landroid/view/Choreographer;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method


# virtual methods
.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/modules/debug/h;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public final d()I
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/modules/debug/h;->i()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-double v0, v0

    .line 6
    iget-wide v2, p0, Lcom/facebook/react/modules/debug/h;->j:D

    .line 7
    .line 8
    mul-double/2addr v2, v0

    .line 9
    const/16 v0, 0x3e8

    .line 10
    .line 11
    int-to-double v0, v0

    .line 12
    div-double/2addr v2, v0

    .line 13
    const/4 v0, 0x1

    .line 14
    int-to-double v0, v0

    .line 15
    add-double/2addr v2, v0

    .line 16
    double-to-int v0, v2

    .line 17
    return v0
.end method

.method public doFrame(J)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/modules/debug/h;->d:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-wide p1, p0, Lcom/facebook/react/modules/debug/h;->d:J

    .line 10
    .line 11
    :cond_0
    iget-wide v0, p0, Lcom/facebook/react/modules/debug/h;->e:J

    .line 12
    .line 13
    iput-wide p1, p0, Lcom/facebook/react/modules/debug/h;->e:J

    .line 14
    .line 15
    iget-object v2, p0, Lcom/facebook/react/modules/debug/h;->c:Lcom/facebook/react/modules/debug/d;

    .line 16
    .line 17
    invoke-virtual {v2, v0, v1, p1, p2}, Lcom/facebook/react/modules/debug/d;->d(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget p1, p0, Lcom/facebook/react/modules/debug/h;->i:I

    .line 24
    .line 25
    add-int/lit8 p1, p1, 0x1

    .line 26
    .line 27
    iput p1, p0, Lcom/facebook/react/modules/debug/h;->i:I

    .line 28
    .line 29
    :cond_1
    iget p1, p0, Lcom/facebook/react/modules/debug/h;->f:I

    .line 30
    .line 31
    add-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    iput p1, p0, Lcom/facebook/react/modules/debug/h;->f:I

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/h;->d()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iget p2, p0, Lcom/facebook/react/modules/debug/h;->g:I

    .line 40
    .line 41
    sub-int p2, p1, p2

    .line 42
    .line 43
    add-int/lit8 p2, p2, -0x1

    .line 44
    .line 45
    const/4 v0, 0x4

    .line 46
    if-lt p2, v0, :cond_2

    .line 47
    .line 48
    iget p2, p0, Lcom/facebook/react/modules/debug/h;->h:I

    .line 49
    .line 50
    add-int/lit8 p2, p2, 0x1

    .line 51
    .line 52
    iput p2, p0, Lcom/facebook/react/modules/debug/h;->h:I

    .line 53
    .line 54
    :cond_2
    iput p1, p0, Lcom/facebook/react/modules/debug/h;->g:I

    .line 55
    .line 56
    iget-object p1, p0, Lcom/facebook/react/modules/debug/h;->b:Landroid/view/Choreographer;

    .line 57
    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    invoke-virtual {p1, p0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    return-void
.end method

.method public final e()D
    .locals 6

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/modules/debug/h;->e:J

    .line 2
    .line 3
    iget-wide v2, p0, Lcom/facebook/react/modules/debug/h;->d:J

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/h;->g()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    int-to-double v0, v0

    .line 17
    const-wide v2, 0x41cdcd6500000000L    # 1.0E9

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    mul-double/2addr v0, v2

    .line 23
    iget-wide v2, p0, Lcom/facebook/react/modules/debug/h;->e:J

    .line 24
    .line 25
    iget-wide v4, p0, Lcom/facebook/react/modules/debug/h;->d:J

    .line 26
    .line 27
    sub-long/2addr v2, v4

    .line 28
    long-to-double v2, v2

    .line 29
    div-double/2addr v0, v2

    .line 30
    return-wide v0
.end method

.method public final f()D
    .locals 6

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/modules/debug/h;->e:J

    .line 2
    .line 3
    iget-wide v2, p0, Lcom/facebook/react/modules/debug/h;->d:J

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/modules/debug/h;->h()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    int-to-double v0, v0

    .line 17
    const-wide v2, 0x41cdcd6500000000L    # 1.0E9

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    mul-double/2addr v0, v2

    .line 23
    iget-wide v2, p0, Lcom/facebook/react/modules/debug/h;->e:J

    .line 24
    .line 25
    iget-wide v4, p0, Lcom/facebook/react/modules/debug/h;->d:J

    .line 26
    .line 27
    sub-long/2addr v2, v4

    .line 28
    long-to-double v2, v2

    .line 29
    div-double/2addr v0, v2

    .line 30
    return-wide v0
.end method

.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/modules/debug/h;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    return v0
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/modules/debug/h;->k:Z

    .line 2
    .line 3
    return v0
.end method

.method public final k()V
    .locals 2

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/facebook/react/modules/debug/h;->d:J

    .line 4
    .line 5
    iput-wide v0, p0, Lcom/facebook/react/modules/debug/h;->e:J

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/facebook/react/modules/debug/h;->f:I

    .line 9
    .line 10
    iput v0, p0, Lcom/facebook/react/modules/debug/h;->h:I

    .line 11
    .line 12
    iput v0, p0, Lcom/facebook/react/modules/debug/h;->i:I

    .line 13
    .line 14
    return-void
.end method

.method public final l(D)V
    .locals 3

    .line 1
    sget-boolean v0, LY6/a;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/react/modules/debug/h;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 6
    .line 7
    const-class v1, Lcom/facebook/react/uimanager/UIManagerModule;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/facebook/react/uimanager/UIManagerModule;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/facebook/react/modules/debug/h;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/facebook/react/bridge/ReactContext;->isBridgeless()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, Lcom/facebook/react/modules/debug/h;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/facebook/react/bridge/ReactContext;->getCatalystInstance()Lcom/facebook/react/bridge/CatalystInstance;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v2, p0, Lcom/facebook/react/modules/debug/h;->c:Lcom/facebook/react/modules/debug/d;

    .line 30
    .line 31
    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/CatalystInstance;->addBridgeIdleDebugListener(Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;)V

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    iput-boolean v1, p0, Lcom/facebook/react/modules/debug/h;->k:Z

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v1, 0x1

    .line 39
    iput-boolean v1, p0, Lcom/facebook/react/modules/debug/h;->k:Z

    .line 40
    .line 41
    :goto_0
    if-eqz v0, :cond_1

    .line 42
    .line 43
    iget-object v1, p0, Lcom/facebook/react/modules/debug/h;->c:Lcom/facebook/react/modules/debug/d;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/UIManagerModule;->setViewHierarchyUpdateDebugListener(LD7/a;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    iput-wide p1, p0, Lcom/facebook/react/modules/debug/h;->j:D

    .line 49
    .line 50
    new-instance p1, Lcom/facebook/react/modules/debug/f;

    .line 51
    .line 52
    invoke-direct {p1, p0}, Lcom/facebook/react/modules/debug/f;-><init>(Lcom/facebook/react/modules/debug/h;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final o()V
    .locals 3

    .line 1
    sget-boolean v0, LY6/a;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/react/modules/debug/h;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 6
    .line 7
    const-class v1, Lcom/facebook/react/uimanager/UIManagerModule;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/facebook/react/uimanager/UIManagerModule;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/facebook/react/modules/debug/h;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/facebook/react/bridge/ReactContext;->isBridgeless()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, Lcom/facebook/react/modules/debug/h;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/facebook/react/bridge/ReactContext;->getCatalystInstance()Lcom/facebook/react/bridge/CatalystInstance;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v2, p0, Lcom/facebook/react/modules/debug/h;->c:Lcom/facebook/react/modules/debug/d;

    .line 30
    .line 31
    invoke-interface {v1, v2}, Lcom/facebook/react/bridge/CatalystInstance;->removeBridgeIdleDebugListener(Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    if-eqz v0, :cond_1

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/UIManagerModule;->setViewHierarchyUpdateDebugListener(LD7/a;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    new-instance v0, Lcom/facebook/react/modules/debug/g;

    .line 41
    .line 42
    invoke-direct {v0, p0}, Lcom/facebook/react/modules/debug/g;-><init>(Lcom/facebook/react/modules/debug/h;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 46
    .line 47
    .line 48
    return-void
.end method
