.class La6/c$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:La6/c;


# direct methods
.method constructor <init>(La6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, La6/c$a;->a:La6/c;

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
    .locals 3

    .line 1
    iget-object v0, p0, La6/c$a;->a:La6/c;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, La6/c$a;->a:La6/c;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {v1, v2}, La6/c;->o(La6/c;Z)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, La6/c$a;->a:La6/c;

    .line 11
    .line 12
    invoke-static {v1}, La6/c;->p(La6/c;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v1, p0, La6/c$a;->a:La6/c;

    .line 19
    .line 20
    invoke-static {v1}, La6/c;->i(La6/c;)La6/c$b;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, La6/c$a;->a:La6/c;

    .line 27
    .line 28
    invoke-static {v1}, La6/c;->i(La6/c;)La6/c$b;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {v1}, La6/c$b;->i()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    iget-object v1, p0, La6/c$a;->a:La6/c;

    .line 39
    .line 40
    invoke-static {v1}, La6/c;->q(La6/c;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    :goto_0
    monitor-exit v0

    .line 44
    return-void

    .line 45
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    throw v1
.end method
