.class Lt5/g$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt5/g;-><init>(Lt5/f;Lt5/j;Lt5/g$c;Ls5/c;Ls5/a;Lv5/b;Ljava/util/concurrent/Executor;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lt5/g;


# direct methods
.method constructor <init>(Lt5/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt5/g$a;->a:Lt5/g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lt5/g$a;->a:Lt5/g;

    .line 2
    .line 3
    invoke-static {v0}, Lt5/g;->i(Lt5/g;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lt5/g$a;->a:Lt5/g;

    .line 9
    .line 10
    invoke-static {v1}, Lt5/g;->k(Lt5/g;)Z

    .line 11
    .line 12
    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    iget-object v0, p0, Lt5/g$a;->a:Lt5/g;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-static {v0, v1}, Lt5/g;->j(Lt5/g;Z)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lt5/g$a;->a:Lt5/g;

    .line 21
    .line 22
    invoke-static {v0}, Lt5/g;->h(Lt5/g;)Ljava/util/concurrent/CountDownLatch;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw v1
.end method
