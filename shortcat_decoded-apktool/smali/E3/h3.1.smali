.class public LE3/h3;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE3/h3$d;,
        LE3/h3$g;,
        LE3/h3$h;,
        LE3/h3$c;,
        LE3/h3$f;,
        LE3/h3$e;,
        LE3/h3$i;,
        LE3/h3$b;
    }
.end annotation


# static fields
.field private static final b:Ljava/lang/Object;

.field private static final c:Ljava/util/HashMap;


# instance fields
.field private final a:LE3/I3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LE3/h3;->b:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LE3/h3;->c:Ljava/util/HashMap;

    .line 14
    .line 15
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lq2/P;Landroid/app/PendingIntent;LP9/u;LP9/u;LP9/u;LE3/h3$d;Landroid/os/Bundle;Landroid/os/Bundle;Lt2/h;ZZI)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v1, LE3/h3;->b:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v1

    .line 7
    :try_start_0
    sget-object v0, LE3/h3;->c:Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    invoke-virtual/range {p0 .. p14}, LE3/h3;->b(Landroid/content/Context;Ljava/lang/String;Lq2/P;Landroid/app/PendingIntent;LP9/u;LP9/u;LP9/u;LE3/h3$d;Landroid/os/Bundle;Landroid/os/Bundle;Lt2/h;ZZI)LE3/I3;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, LE3/h3;->a:LE3/I3;

    .line 24
    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    move-object p1, v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    new-instance p3, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string p4, "Session ID must be unique. ID="

    .line 37
    .line 38
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :goto_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    throw p1
.end method

.method static k(Landroid/net/Uri;)LE3/h3;
    .locals 4

    .line 1
    sget-object v0, LE3/h3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, LE3/h3;->c:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, LE3/h3;

    .line 25
    .line 26
    invoke-virtual {v2}, LE3/h3;->n()Landroid/net/Uri;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-static {v3, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-object v2

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    monitor-exit v0

    .line 41
    const/4 p0, 0x0

    .line 42
    return-object p0

    .line 43
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw p0
.end method


# virtual methods
.method final a()V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/h3;->a:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->M()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method b(Landroid/content/Context;Ljava/lang/String;Lq2/P;Landroid/app/PendingIntent;LP9/u;LP9/u;LP9/u;LE3/h3$d;Landroid/os/Bundle;Landroid/os/Bundle;Lt2/h;ZZI)LE3/I3;
    .locals 15

    .line 1
    new-instance v0, LE3/I3;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object/from16 v2, p1

    .line 5
    .line 6
    move-object/from16 v3, p2

    .line 7
    .line 8
    move-object/from16 v4, p3

    .line 9
    .line 10
    move-object/from16 v5, p4

    .line 11
    .line 12
    move-object/from16 v6, p5

    .line 13
    .line 14
    move-object/from16 v7, p6

    .line 15
    .line 16
    move-object/from16 v8, p7

    .line 17
    .line 18
    move-object/from16 v9, p8

    .line 19
    .line 20
    move-object/from16 v10, p9

    .line 21
    .line 22
    move-object/from16 v11, p10

    .line 23
    .line 24
    move-object/from16 v12, p11

    .line 25
    .line 26
    move/from16 v13, p12

    .line 27
    .line 28
    move/from16 v14, p13

    .line 29
    .line 30
    invoke-direct/range {v0 .. v14}, LE3/I3;-><init>(LE3/h3;Landroid/content/Context;Ljava/lang/String;Lq2/P;Landroid/app/PendingIntent;LP9/u;LP9/u;LP9/u;LE3/h3$d;Landroid/os/Bundle;Landroid/os/Bundle;Lt2/h;ZZ)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public c()LP9/u;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/h3;->a:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->b0()LP9/u;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/h3;->a:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->c0()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method e()LE3/I3;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/h3;->a:LE3/I3;

    .line 2
    .line 3
    return-object v0
.end method

.method final f()Landroid/os/IBinder;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/h3;->a:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->d0()Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public g()LP9/u;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/h3;->a:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->e0()LP9/u;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public h()LE3/h3$g;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/h3;->a:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->f0()LE3/h3$g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final i()Landroid/media/session/MediaSession$Token;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/h3;->a:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->g0()Landroid/media/session/MediaSession$Token;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final j()Lq2/P;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/h3;->a:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->j0()LE3/N6;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lq2/y;->Z0()Lq2/P;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public l()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/h3;->a:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->l0()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final m()LE3/Y6;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/h3;->a:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->m0()LE3/Y6;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method final n()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/h3;->a:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->n0()Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method final o(LE3/q;LE3/h3$g;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/h3;->a:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LE3/I3;->N(LE3/q;LE3/h3$g;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method final p()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE3/h3;->a:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/I3;->t0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final q()V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, LE3/h3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    :try_start_1
    sget-object v1, LE3/h3;->c:Ljava/util/HashMap;

    .line 5
    .line 6
    iget-object v2, p0, LE3/h3;->a:LE3/I3;

    .line 7
    .line 8
    invoke-virtual {v2}, LE3/I3;->c0()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    :try_start_2
    iget-object v0, p0, LE3/h3;->a:LE3/I3;

    .line 17
    .line 18
    invoke-virtual {v0}, LE3/I3;->L0()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 24
    :try_start_4
    throw v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 25
    :catch_0
    return-void
.end method

.method final r(LE3/h3$h;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/h3;->a:LE3/I3;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LE3/I3;->P0(LE3/h3$h;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final s(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/h3;->a:LE3/I3;

    .line 2
    .line 3
    new-instance v1, Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, LE3/I3;->R0(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
