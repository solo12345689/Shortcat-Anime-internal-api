.class public final Lcom/facebook/react/devsupport/Y$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/devsupport/v$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/Y;->E0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/devsupport/Y;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/Y;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/Y$d;->a:Lcom/facebook/react/devsupport/Y;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic f(Lcom/facebook/react/devsupport/Y;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/Y$d;->i(Lcom/facebook/react/devsupport/Y;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lcom/facebook/react/devsupport/Y;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/Y$d;->h(Lcom/facebook/react/devsupport/Y;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final h(Lcom/facebook/react/devsupport/Y;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/Y;->F()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final i(Lcom/facebook/react/devsupport/Y;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Lc7/f;->B()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y$d;->a:Lcom/facebook/react/devsupport/Y;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/Y;->q0(Lcom/facebook/react/devsupport/Y;Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y$d;->a:Lcom/facebook/react/devsupport/Y;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/facebook/react/devsupport/Y;->m0(Lcom/facebook/react/devsupport/Y;)Ld7/i;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ld7/i;->j()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y$d;->a:Lcom/facebook/react/devsupport/Y;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/facebook/react/devsupport/Y;->m0(Lcom/facebook/react/devsupport/Y;)Ld7/i;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Ld7/i;->p()V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y$d;->a:Lcom/facebook/react/devsupport/Y;

    .line 2
    .line 3
    new-instance v1, Lcom/facebook/react/devsupport/a0;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lcom/facebook/react/devsupport/a0;-><init>(Lcom/facebook/react/devsupport/Y;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/devsupport/InspectorFlags;->getFuseboxEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y$d;->a:Lcom/facebook/react/devsupport/Y;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/Y;->u0()Lcom/facebook/react/devsupport/v;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/v;->m()V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y$d;->a:Lcom/facebook/react/devsupport/Y;

    .line 17
    .line 18
    new-instance v1, Lcom/facebook/react/devsupport/Z;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lcom/facebook/react/devsupport/Z;-><init>(Lcom/facebook/react/devsupport/Y;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y$d;->a:Lcom/facebook/react/devsupport/Y;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/Y;->q0(Lcom/facebook/react/devsupport/Y;Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y$d;->a:Lcom/facebook/react/devsupport/Y;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/facebook/react/devsupport/Y;->m0(Lcom/facebook/react/devsupport/Y;)Ld7/i;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ld7/i;->h()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y$d;->a:Lcom/facebook/react/devsupport/Y;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/facebook/react/devsupport/Y;->m0(Lcom/facebook/react/devsupport/Y;)Ld7/i;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Ld7/i;->q()V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public e()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y$d;->a:Lcom/facebook/react/devsupport/Y;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/devsupport/Y;->k0(Lcom/facebook/react/devsupport/Y;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
