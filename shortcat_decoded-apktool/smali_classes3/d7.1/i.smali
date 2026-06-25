.class public final Ld7/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ld7/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld7/i$a;
    }
.end annotation


# instance fields
.field private final a:Ld7/a;

.field private final b:Lie/a;

.field private c:Z

.field private d:Ld7/l;

.field private e:Lcom/facebook/react/devsupport/inspector/TracingState;

.field private f:I


# direct methods
.method public constructor <init>(Ld7/a;Lie/a;)V
    .locals 1

    .line 1
    const-string v0, "devHelper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onRequestOpenDevTools"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ld7/i;->a:Ld7/a;

    .line 15
    .line 16
    iput-object p2, p0, Ld7/i;->b:Lie/a;

    .line 17
    .line 18
    sget-object p1, Lcom/facebook/react/devsupport/inspector/TracingState;->ENABLED_IN_CDP_MODE:Lcom/facebook/react/devsupport/inspector/TracingState;

    .line 19
    .line 20
    iput-object p1, p0, Ld7/i;->e:Lcom/facebook/react/devsupport/inspector/TracingState;

    .line 21
    .line 22
    return-void
.end method

.method public static synthetic c(Ld7/i;Lcom/facebook/react/devsupport/inspector/TracingState;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ld7/i;->o(Ld7/i;Lcom/facebook/react/devsupport/inspector/TracingState;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Ld7/i;)V
    .locals 0

    .line 1
    invoke-static {p0}, Ld7/i;->k(Ld7/i;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Ld7/i;)V
    .locals 0

    .line 1
    invoke-static {p0}, Ld7/i;->n(Ld7/i;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Ld7/i;)V
    .locals 0

    .line 1
    invoke-static {p0}, Ld7/i;->i(Ld7/i;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic g(Ld7/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ld7/i;->l()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final i(Ld7/i;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ld7/i;->d:Ld7/l;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ld7/l;->j()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method private static final k(Ld7/i;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ld7/i;->a:Ld7/a;

    .line 2
    .line 3
    invoke-interface {v0}, Ld7/a;->a()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v1, p0, Ld7/i;->d:Ld7/l;

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    new-instance v1, Ld7/l;

    .line 15
    .line 16
    new-instance v2, Ld7/i$b;

    .line 17
    .line 18
    invoke-direct {v2, p0}, Ld7/i$b;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v0, v2}, Ld7/l;-><init>(Landroid/content/Context;Lie/a;)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Ld7/i;->d:Ld7/l;

    .line 25
    .line 26
    :cond_1
    iget-object p0, p0, Ld7/i;->d:Ld7/l;

    .line 27
    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0}, Ld7/l;->k()V

    .line 31
    .line 32
    .line 33
    :cond_2
    :goto_0
    return-void
.end method

.method private final l()V
    .locals 2

    .line 1
    iget-object v0, p0, Ld7/i;->e:Lcom/facebook/react/devsupport/inspector/TracingState;

    .line 2
    .line 3
    sget-object v1, Ld7/i$a;->a:[I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    aget v0, v1, v0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v0, LTd/r;

    .line 22
    .line 23
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :cond_1
    iget-object v0, p0, Ld7/i;->a:Ld7/a;

    .line 28
    .line 29
    invoke-interface {v0}, Ld7/a;->d()Ld7/c;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    invoke-interface {v0}, Ld7/d;->resumeBackgroundTrace()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    iget-object v0, p0, Ld7/i;->a:Ld7/a;

    .line 40
    .line 41
    invoke-interface {v0}, Ld7/a;->d()Ld7/c;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-interface {v0}, Ld7/d;->pauseAndAnalyzeBackgroundTrace()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    iget-object v0, p0, Ld7/i;->b:Lie/a;

    .line 54
    .line 55
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    :cond_3
    :goto_0
    return-void
.end method

.method private static final n(Ld7/i;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ld7/i;->d:Ld7/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Ld7/i;->f:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    iput v1, p0, Ld7/i;->f:I

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ld7/l;->l(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p0, p0, Ld7/i;->d:Ld7/l;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Ld7/l;->k()V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method private static final o(Ld7/i;Lcom/facebook/react/devsupport/inspector/TracingState;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld7/i;->d:Ld7/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ld7/l;->m(Lcom/facebook/react/devsupport/inspector/TracingState;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p1, p0, Ld7/i;->d:Ld7/l;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget v0, p0, Ld7/i;->f:I

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ld7/l;->l(I)V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-object p0, p0, Ld7/i;->d:Ld7/l;

    .line 18
    .line 19
    if-eqz p0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0}, Ld7/l;->k()V

    .line 22
    .line 23
    .line 24
    :cond_2
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ld7/e;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Ld7/e;-><init>(Ld7/i;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public b(Lcom/facebook/react/devsupport/inspector/TracingState;)V
    .locals 1

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ld7/i;->e:Lcom/facebook/react/devsupport/inspector/TracingState;

    .line 7
    .line 8
    sget-object v0, Lcom/facebook/react/devsupport/inspector/TracingState;->DISABLED:Lcom/facebook/react/devsupport/inspector/TracingState;

    .line 9
    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput v0, p0, Ld7/i;->f:I

    .line 14
    .line 15
    :cond_0
    new-instance v0, Ld7/g;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1}, Ld7/g;-><init>(Ld7/i;Lcom/facebook/react/devsupport/inspector/TracingState;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final h()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Ld7/i;->c:Z

    .line 3
    .line 4
    new-instance v0, Ld7/f;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ld7/f;-><init>(Ld7/i;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ld7/i;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Ld7/i;->c:Z

    .line 8
    .line 9
    new-instance v0, Ld7/h;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Ld7/h;-><init>(Ld7/i;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ld7/i;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final p()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ld7/i;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Ld7/i;->a:Ld7/a;

    .line 7
    .line 8
    invoke-interface {v0}, Ld7/a;->d()Ld7/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ld7/d;->resumeBackgroundTrace()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ld7/d;->getTracingState()Lcom/facebook/react/devsupport/inspector/TracingState;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0, v0}, Ld7/i;->b(Lcom/facebook/react/devsupport/inspector/TracingState;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    return-void
.end method

.method public final q()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ld7/i;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Ld7/i;->a:Ld7/a;

    .line 7
    .line 8
    invoke-interface {v0}, Ld7/a;->d()Ld7/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ld7/d;->stopBackgroundTrace()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ld7/d;->getTracingState()Lcom/facebook/react/devsupport/inspector/TracingState;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0, v0}, Ld7/i;->b(Lcom/facebook/react/devsupport/inspector/TracingState;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    return-void
.end method
