.class public final LM2/v;
.super LM2/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM2/v$b;
    }
.end annotation


# instance fields
.field private final h:J

.field private i:Lq2/C;


# direct methods
.method private constructor <init>(Lq2/C;JLM2/t;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LM2/a;-><init>()V

    .line 3
    iput-object p1, p0, LM2/v;->i:Lq2/C;

    .line 4
    iput-wide p2, p0, LM2/v;->h:J

    return-void
.end method

.method synthetic constructor <init>(Lq2/C;JLM2/t;LM2/v$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, LM2/v;-><init>(Lq2/C;JLM2/t;)V

    return-void
.end method


# virtual methods
.method protected A(Lw2/F;)V
    .locals 8

    .line 1
    new-instance v0, LM2/f0;

    .line 2
    .line 3
    iget-wide v1, p0, LM2/v;->h:J

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    invoke-virtual {p0}, LM2/v;->a()Lq2/C;

    .line 7
    .line 8
    .line 9
    move-result-object v7

    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    invoke-direct/range {v0 .. v7}, LM2/f0;-><init>(JZZZLjava/lang/Object;Lq2/C;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, LM2/a;->B(Lq2/Y;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method protected C()V
    .locals 0

    .line 1
    return-void
.end method

.method public declared-synchronized a()Lq2/C;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LM2/v;->i:Lq2/C;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public e(Lq2/C;)Z
    .locals 4

    .line 1
    iget-object p1, p1, Lq2/C;->b:Lq2/C$h;

    .line 2
    .line 3
    invoke-virtual {p0}, LM2/v;->a()Lq2/C;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lq2/C;->b:Lq2/C$h;

    .line 8
    .line 9
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lq2/C$h;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iget-object v1, p1, Lq2/C$h;->a:Landroid/net/Uri;

    .line 18
    .line 19
    iget-object v2, v0, Lq2/C$h;->a:Landroid/net/Uri;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-object v1, p1, Lq2/C$h;->b:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v0, v0, Lq2/C$h;->b:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iget-wide v0, p1, Lq2/C$h;->j:J

    .line 38
    .line 39
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    cmp-long p1, v0, v2

    .line 45
    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    invoke-static {v0, v1}, Lt2/a0;->V0(J)J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    iget-wide v2, p0, LM2/v;->h:J

    .line 53
    .line 54
    cmp-long p1, v0, v2

    .line 55
    .line 56
    if-nez p1, :cond_1

    .line 57
    .line 58
    :cond_0
    const/4 p1, 0x1

    .line 59
    return p1

    .line 60
    :cond_1
    const/4 p1, 0x0

    .line 61
    return p1
.end method

.method public f(LM2/D$b;LQ2/b;J)LM2/C;
    .locals 0

    .line 1
    invoke-virtual {p0}, LM2/v;->a()Lq2/C;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p1, Lq2/C;->b:Lq2/C$h;

    .line 6
    .line 7
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object p2, p1, Lq2/C;->b:Lq2/C$h;

    .line 11
    .line 12
    iget-object p2, p2, Lq2/C$h;->b:Ljava/lang/String;

    .line 13
    .line 14
    const-string p3, "Externally loaded mediaItems require a MIME type."

    .line 15
    .line 16
    invoke-static {p2, p3}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    new-instance p2, LM2/u;

    .line 20
    .line 21
    iget-object p1, p1, Lq2/C;->b:Lq2/C$h;

    .line 22
    .line 23
    iget-object p3, p1, Lq2/C$h;->a:Landroid/net/Uri;

    .line 24
    .line 25
    iget-object p1, p1, Lq2/C$h;->b:Ljava/lang/String;

    .line 26
    .line 27
    const/4 p4, 0x0

    .line 28
    invoke-direct {p2, p3, p1, p4}, LM2/u;-><init>(Landroid/net/Uri;Ljava/lang/String;LM2/t;)V

    .line 29
    .line 30
    .line 31
    return-object p2
.end method

.method public declared-synchronized j(Lq2/C;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, LM2/v;->i:Lq2/C;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public l()V
    .locals 0

    .line 1
    return-void
.end method

.method public m(LM2/C;)V
    .locals 0

    .line 1
    check-cast p1, LM2/u;

    .line 2
    .line 3
    invoke-virtual {p1}, LM2/u;->m()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
