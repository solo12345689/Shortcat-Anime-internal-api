.class public final Lcom/facebook/react/devsupport/Y$f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lc7/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/Y;->F0(Ljava/lang/String;Lc7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/devsupport/Y;

.field final synthetic b:Lcom/facebook/react/devsupport/b$a;

.field final synthetic c:Lc7/a;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/Y;Lcom/facebook/react/devsupport/b$a;Lc7/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/Y$f;->a:Lcom/facebook/react/devsupport/Y;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/devsupport/Y$f;->b:Lcom/facebook/react/devsupport/b$a;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/devsupport/Y$f;->c:Lc7/a;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y$f;->a:Lcom/facebook/react/devsupport/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/Y;->A0()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y$f;->a:Lcom/facebook/react/devsupport/Y;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/facebook/react/devsupport/Y;->l0(Lcom/facebook/react/devsupport/Y;)Lc7/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Lc7/c;->a()V

    .line 15
    .line 16
    .line 17
    :cond_0
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->DOWNLOAD_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/facebook/react/devsupport/Y$f;->b:Lcom/facebook/react/devsupport/b$a;

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/facebook/react/devsupport/b$a;->c()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v0, v1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y$f;->c:Lc7/a;

    .line 29
    .line 30
    invoke-interface {v0}, Lc7/a;->a()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y$f;->a:Lcom/facebook/react/devsupport/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/Y;->s0()Lc7/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3}, Lc7/d;->d(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y$f;->a:Lcom/facebook/react/devsupport/Y;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/facebook/react/devsupport/Y;->l0(Lcom/facebook/react/devsupport/Y;)Lc7/c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-interface {v0, p1, p2, p3}, Lc7/c;->b(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    const-string v0, "cause"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y$f;->a:Lcom/facebook/react/devsupport/Y;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/Y;->A0()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y$f;->a:Lcom/facebook/react/devsupport/Y;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/facebook/react/devsupport/Y;->l0(Lcom/facebook/react/devsupport/Y;)Lc7/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0, p1}, Lc7/c;->onFailure(Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    const-string v0, "ReactNative"

    .line 23
    .line 24
    const-string v1, "Unable to download JS bundle"

    .line 25
    .line 26
    invoke-static {v0, v1, p1}, Lz5/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y$f;->a:Lcom/facebook/react/devsupport/Y;

    .line 30
    .line 31
    invoke-static {v0, p1}, Lcom/facebook/react/devsupport/Y;->n0(Lcom/facebook/react/devsupport/Y;Ljava/lang/Exception;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/facebook/react/devsupport/Y$f;->c:Lc7/a;

    .line 35
    .line 36
    invoke-interface {v0, p1}, Lc7/a;->b(Ljava/lang/Exception;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
