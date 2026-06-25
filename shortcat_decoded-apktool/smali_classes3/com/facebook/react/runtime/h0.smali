.class public final Lcom/facebook/react/runtime/h0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/runtime/h0$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/react/runtime/c0;

.field private b:Lcom/facebook/react/common/LifecycleState;


# direct methods
.method public constructor <init>(Lcom/facebook/react/runtime/c0;)V
    .locals 1

    .line 1
    const-string v0, "stateTracker"

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
    iput-object p1, p0, Lcom/facebook/react/runtime/h0;->a:Lcom/facebook/react/runtime/c0;

    .line 10
    .line 11
    sget-object p1, Lcom/facebook/react/common/LifecycleState;->a:Lcom/facebook/react/common/LifecycleState;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/facebook/react/runtime/h0;->b:Lcom/facebook/react/common/LifecycleState;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()Lcom/facebook/react/common/LifecycleState;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/h0;->b:Lcom/facebook/react/common/LifecycleState;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 5

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Lcom/facebook/react/runtime/h0;->b:Lcom/facebook/react/common/LifecycleState;

    .line 4
    .line 5
    sget-object v1, Lcom/facebook/react/runtime/h0$a;->a:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const-string v1, "ReactContext.onHostDestroy()"

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    const/4 v3, 0x0

    .line 17
    if-eq v0, v2, :cond_1

    .line 18
    .line 19
    const/4 v4, 0x3

    .line 20
    if-eq v0, v4, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/runtime/h0;->a:Lcom/facebook/react/runtime/c0;

    .line 24
    .line 25
    invoke-static {v0, v1, v3, v2, v3}, Lcom/facebook/react/runtime/c0;->b(Lcom/facebook/react/runtime/c0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->onHostDestroy()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/runtime/h0;->a:Lcom/facebook/react/runtime/c0;

    .line 33
    .line 34
    const-string v4, "ReactContext.onHostPause()"

    .line 35
    .line 36
    invoke-static {v0, v4, v3, v2, v3}, Lcom/facebook/react/runtime/c0;->b(Lcom/facebook/react/runtime/c0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->onHostPause()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/facebook/react/runtime/h0;->a:Lcom/facebook/react/runtime/c0;

    .line 43
    .line 44
    invoke-static {v0, v1, v3, v2, v3}, Lcom/facebook/react/runtime/c0;->b(Lcom/facebook/react/runtime/c0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->onHostDestroy()V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_0
    sget-object p1, Lcom/facebook/react/common/LifecycleState;->a:Lcom/facebook/react/common/LifecycleState;

    .line 51
    .line 52
    iput-object p1, p0, Lcom/facebook/react/runtime/h0;->b:Lcom/facebook/react/common/LifecycleState;

    .line 53
    .line 54
    return-void
.end method

.method public final c(Lcom/facebook/react/bridge/ReactContext;Landroid/app/Activity;)V
    .locals 5

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Lcom/facebook/react/runtime/h0;->b:Lcom/facebook/react/common/LifecycleState;

    .line 4
    .line 5
    sget-object v1, Lcom/facebook/react/runtime/h0$a;->a:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    const-string v2, "ReactContext.onHostPause()"

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    if-eq v0, v3, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p2, p0, Lcom/facebook/react/runtime/h0;->a:Lcom/facebook/react/runtime/c0;

    .line 24
    .line 25
    invoke-static {p2, v2, v4, v3, v4}, Lcom/facebook/react/runtime/c0;->b(Lcom/facebook/react/runtime/c0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->onHostPause()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/runtime/h0;->a:Lcom/facebook/react/runtime/c0;

    .line 33
    .line 34
    const-string v1, "ReactContext.onHostResume()"

    .line 35
    .line 36
    invoke-static {v0, v1, v4, v3, v4}, Lcom/facebook/react/runtime/c0;->b(Lcom/facebook/react/runtime/c0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p2}, Lcom/facebook/react/bridge/ReactContext;->onHostResume(Landroid/app/Activity;)V

    .line 40
    .line 41
    .line 42
    iget-object p2, p0, Lcom/facebook/react/runtime/h0;->a:Lcom/facebook/react/runtime/c0;

    .line 43
    .line 44
    invoke-static {p2, v2, v4, v3, v4}, Lcom/facebook/react/runtime/c0;->b(Lcom/facebook/react/runtime/c0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->onHostPause()V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_0
    sget-object p1, Lcom/facebook/react/common/LifecycleState;->b:Lcom/facebook/react/common/LifecycleState;

    .line 51
    .line 52
    iput-object p1, p0, Lcom/facebook/react/runtime/h0;->b:Lcom/facebook/react/common/LifecycleState;

    .line 53
    .line 54
    return-void
.end method

.method public final d(Lcom/facebook/react/bridge/ReactContext;Landroid/app/Activity;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/h0;->b:Lcom/facebook/react/common/LifecycleState;

    .line 2
    .line 3
    sget-object v1, Lcom/facebook/react/common/LifecycleState;->c:Lcom/facebook/react/common/LifecycleState;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    if-eqz p1, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/facebook/react/runtime/h0;->a:Lcom/facebook/react/runtime/c0;

    .line 11
    .line 12
    const-string v2, "ReactContext.onHostResume()"

    .line 13
    .line 14
    const/4 v3, 0x2

    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-static {v0, v2, v4, v3, v4}, Lcom/facebook/react/runtime/c0;->b(Lcom/facebook/react/runtime/c0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Lcom/facebook/react/bridge/ReactContext;->onHostResume(Landroid/app/Activity;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iput-object v1, p0, Lcom/facebook/react/runtime/h0;->b:Lcom/facebook/react/common/LifecycleState;

    .line 23
    .line 24
    return-void
.end method

.method public final e(Lcom/facebook/react/bridge/ReactContext;Landroid/app/Activity;)V
    .locals 4

    .line 1
    const-string v0, "currentContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/runtime/h0;->b:Lcom/facebook/react/common/LifecycleState;

    .line 7
    .line 8
    sget-object v1, Lcom/facebook/react/common/LifecycleState;->c:Lcom/facebook/react/common/LifecycleState;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/facebook/react/runtime/h0;->a:Lcom/facebook/react/runtime/c0;

    .line 13
    .line 14
    const-string v1, "ReactContext.onHostResume()"

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-static {v0, v1, v3, v2, v3}, Lcom/facebook/react/runtime/c0;->b(Lcom/facebook/react/runtime/c0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2}, Lcom/facebook/react/bridge/ReactContext;->onHostResume(Landroid/app/Activity;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method
