.class public final Lcom/facebook/react/modules/image/ImageLoaderModule$d;
.super LI5/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/image/ImageLoaderModule;->prefetchImage(Ljava/lang/String;DLcom/facebook/react/bridge/Promise;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/modules/image/ImageLoaderModule;

.field final synthetic b:I

.field final synthetic c:Lcom/facebook/react/bridge/Promise;


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/image/ImageLoaderModule;ILcom/facebook/react/bridge/Promise;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$d;->a:Lcom/facebook/react/modules/image/ImageLoaderModule;

    .line 2
    .line 3
    iput p2, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$d;->b:I

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$d;->c:Lcom/facebook/react/bridge/Promise;

    .line 6
    .line 7
    invoke-direct {p0}, LI5/b;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method protected e(LI5/c;)V
    .locals 3

    .line 1
    const-string v0, "dataSource"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$d;->a:Lcom/facebook/react/modules/image/ImageLoaderModule;

    .line 7
    .line 8
    iget v1, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$d;->b:I

    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/facebook/react/modules/image/ImageLoaderModule;->access$removeRequest(Lcom/facebook/react/modules/image/ImageLoaderModule;I)LI5/c;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$d;->c:Lcom/facebook/react/bridge/Promise;

    .line 14
    .line 15
    const-string v1, "E_PREFETCH_FAILURE"

    .line 16
    .line 17
    invoke-interface {p1}, LI5/c;->c()Ljava/lang/Throwable;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, LI5/c;->close()Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    invoke-interface {p1}, LI5/c;->close()Z

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method protected f(LI5/c;)V
    .locals 3

    .line 1
    const-string v0, "dataSource"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, LI5/c;->isFinished()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$d;->a:Lcom/facebook/react/modules/image/ImageLoaderModule;

    .line 14
    .line 15
    iget v1, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$d;->b:I

    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/facebook/react/modules/image/ImageLoaderModule;->access$removeRequest(Lcom/facebook/react/modules/image/ImageLoaderModule;I)LI5/c;

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$d;->c:Lcom/facebook/react/bridge/Promise;

    .line 21
    .line 22
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, LI5/c;->close()Z

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception v0

    .line 34
    :try_start_1
    iget-object v1, p0, Lcom/facebook/react/modules/image/ImageLoaderModule$d;->c:Lcom/facebook/react/bridge/Promise;

    .line 35
    .line 36
    const-string v2, "E_PREFETCH_FAILURE"

    .line 37
    .line 38
    invoke-interface {v1, v2, v0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    .line 41
    invoke-interface {p1}, LI5/c;->close()Z

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :goto_0
    invoke-interface {p1}, LI5/c;->close()Z

    .line 46
    .line 47
    .line 48
    throw v0
.end method
