.class public LU4/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LU4/m;
.implements LW4/h$a;
.implements LU4/p$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU4/k$b;,
        LU4/k$a;,
        LU4/k$c;,
        LU4/k$d;
    }
.end annotation


# static fields
.field private static final i:Z


# instance fields
.field private final a:LU4/s;

.field private final b:LU4/o;

.field private final c:LW4/h;

.field private final d:LU4/k$b;

.field private final e:LU4/y;

.field private final f:LU4/k$c;

.field private final g:LU4/k$a;

.field private final h:LU4/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "Engine"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput-boolean v0, LU4/k;->i:Z

    .line 9
    .line 10
    return-void
.end method

.method constructor <init>(LW4/h;LW4/a$a;LX4/a;LX4/a;LX4/a;LX4/a;LU4/s;LU4/o;LU4/a;LU4/k$b;LU4/k$a;LU4/y;Z)V
    .locals 8

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LU4/k;->c:LW4/h;

    .line 4
    new-instance v0, LU4/k$c;

    invoke-direct {v0, p2}, LU4/k$c;-><init>(LW4/a$a;)V

    iput-object v0, p0, LU4/k;->f:LU4/k$c;

    if-nez p9, :cond_0

    .line 5
    new-instance p2, LU4/a;

    move/from16 v1, p13

    invoke-direct {p2, v1}, LU4/a;-><init>(Z)V

    goto :goto_0

    :cond_0
    move-object/from16 p2, p9

    .line 6
    :goto_0
    iput-object p2, p0, LU4/k;->h:LU4/a;

    .line 7
    invoke-virtual {p2, p0}, LU4/a;->f(LU4/p$a;)V

    if-nez p8, :cond_1

    .line 8
    new-instance p2, LU4/o;

    invoke-direct {p2}, LU4/o;-><init>()V

    goto :goto_1

    :cond_1
    move-object/from16 p2, p8

    .line 9
    :goto_1
    iput-object p2, p0, LU4/k;->b:LU4/o;

    if-nez p7, :cond_2

    .line 10
    new-instance p7, LU4/s;

    invoke-direct {p7}, LU4/s;-><init>()V

    .line 11
    :cond_2
    iput-object p7, p0, LU4/k;->a:LU4/s;

    if-nez p10, :cond_3

    .line 12
    new-instance v1, LU4/k$b;

    move-object v7, p0

    move-object v6, p0

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v1 .. v7}, LU4/k$b;-><init>(LX4/a;LX4/a;LX4/a;LX4/a;LU4/m;LU4/p$a;)V

    goto :goto_2

    :cond_3
    move-object/from16 v1, p10

    .line 13
    :goto_2
    iput-object v1, p0, LU4/k;->d:LU4/k$b;

    if-nez p11, :cond_4

    .line 14
    new-instance p2, LU4/k$a;

    invoke-direct {p2, v0}, LU4/k$a;-><init>(LU4/h$e;)V

    goto :goto_3

    :cond_4
    move-object/from16 p2, p11

    .line 15
    :goto_3
    iput-object p2, p0, LU4/k;->g:LU4/k$a;

    if-nez p12, :cond_5

    .line 16
    new-instance p2, LU4/y;

    invoke-direct {p2}, LU4/y;-><init>()V

    goto :goto_4

    :cond_5
    move-object/from16 p2, p12

    .line 17
    :goto_4
    iput-object p2, p0, LU4/k;->e:LU4/y;

    .line 18
    invoke-interface {p1, p0}, LW4/h;->e(LW4/h$a;)V

    return-void
.end method

.method public constructor <init>(LW4/h;LW4/a$a;LX4/a;LX4/a;LX4/a;LX4/a;Z)V
    .locals 14

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v13, p7

    .line 1
    invoke-direct/range {v0 .. v13}, LU4/k;-><init>(LW4/h;LW4/a$a;LX4/a;LX4/a;LX4/a;LX4/a;LU4/s;LU4/o;LU4/a;LU4/k$b;LU4/k$a;LU4/y;Z)V

    return-void
.end method

.method private f(LS4/f;)LU4/p;
    .locals 7

    .line 1
    iget-object v0, p0, LU4/k;->c:LW4/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW4/h;->d(LS4/f;)LU4/v;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_0
    instance-of v0, v2, LU4/p;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    check-cast v2, LU4/p;

    .line 16
    .line 17
    return-object v2

    .line 18
    :cond_1
    new-instance v1, LU4/p;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, 0x1

    .line 22
    move-object v6, p0

    .line 23
    move-object v5, p1

    .line 24
    invoke-direct/range {v1 .. v6}, LU4/p;-><init>(LU4/v;ZZLS4/f;LU4/p$a;)V

    .line 25
    .line 26
    .line 27
    return-object v1
.end method

.method private h(LS4/f;)LU4/p;
    .locals 1

    .line 1
    iget-object v0, p0, LU4/k;->h:LU4/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LU4/a;->e(LS4/f;)LU4/p;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, LU4/p;->b()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-object p1
.end method

.method private i(LS4/f;)LU4/p;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, LU4/k;->f(LS4/f;)LU4/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, LU4/p;->b()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, LU4/k;->h:LU4/a;

    .line 11
    .line 12
    invoke-virtual {v1, p1, v0}, LU4/a;->a(LS4/f;LU4/p;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-object v0
.end method

.method private j(LU4/n;ZJ)LU4/p;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-direct {p0, p1}, LU4/k;->h(LS4/f;)LU4/p;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    if-eqz p2, :cond_2

    .line 10
    .line 11
    sget-boolean v0, LU4/k;->i:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const-string v0, "Loaded resource from active resources"

    .line 16
    .line 17
    invoke-static {v0, p3, p4, p1}, LU4/k;->k(Ljava/lang/String;JLS4/f;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-object p2

    .line 21
    :cond_2
    invoke-direct {p0, p1}, LU4/k;->i(LS4/f;)LU4/p;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    if-eqz p2, :cond_4

    .line 26
    .line 27
    sget-boolean v0, LU4/k;->i:Z

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    const-string v0, "Loaded resource from cache"

    .line 32
    .line 33
    invoke-static {v0, p3, p4, p1}, LU4/k;->k(Ljava/lang/String;JLS4/f;)V

    .line 34
    .line 35
    .line 36
    :cond_3
    return-object p2

    .line 37
    :cond_4
    return-object v0
.end method

.method private static k(Ljava/lang/String;JLS4/f;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p0, " in "

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-static {p1, p2}, Lo5/g;->a(J)D

    .line 15
    .line 16
    .line 17
    move-result-wide p0

    .line 18
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p0, "ms, key: "

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string p1, "Engine"

    .line 34
    .line 35
    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private m(Lcom/bumptech/glide/d;Ljava/lang/Object;LS4/f;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/g;LU4/j;Ljava/util/Map;ZZLS4/h;ZZZZLk5/g;Ljava/util/concurrent/Executor;LU4/n;J)LU4/k$d;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p18

    move-object/from16 v2, p19

    move-object/from16 v4, p20

    move-wide/from16 v9, p21

    .line 1
    iget-object v3, v0, LU4/k;->a:LU4/s;

    move/from16 v8, p17

    invoke-virtual {v3, v4, v8}, LU4/s;->a(LS4/f;Z)LU4/l;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 2
    invoke-virtual {v3, v1, v2}, LU4/l;->d(Lk5/g;Ljava/util/concurrent/Executor;)V

    .line 3
    sget-boolean v2, LU4/k;->i:Z

    if-eqz v2, :cond_0

    .line 4
    const-string v2, "Added to existing load"

    invoke-static {v2, v9, v10, v4}, LU4/k;->k(Ljava/lang/String;JLS4/f;)V

    .line 5
    :cond_0
    new-instance v2, LU4/k$d;

    invoke-direct {v2, v0, v1, v3}, LU4/k$d;-><init>(LU4/k;Lk5/g;LU4/l;)V

    return-object v2

    .line 6
    :cond_1
    iget-object v3, v0, LU4/k;->d:LU4/k$b;

    move/from16 v5, p14

    move/from16 v6, p15

    move/from16 v7, p16

    .line 7
    invoke-virtual/range {v3 .. v8}, LU4/k$b;->a(LS4/f;ZZZZ)LU4/l;

    move-result-object v19

    .line 8
    iget-object v3, v0, LU4/k;->g:LU4/k$a;

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v7, p3

    move/from16 v8, p4

    move/from16 v9, p5

    move-object/from16 v10, p6

    move-object/from16 v11, p7

    move-object/from16 v12, p8

    move-object/from16 v13, p9

    move-object/from16 v14, p10

    move/from16 v15, p11

    move/from16 v16, p12

    move-object/from16 v18, p13

    move/from16 v17, p17

    move-object/from16 v6, p20

    .line 9
    invoke-virtual/range {v3 .. v19}, LU4/k$a;->a(Lcom/bumptech/glide/d;Ljava/lang/Object;LU4/n;LS4/f;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/g;LU4/j;Ljava/util/Map;ZZZLS4/h;LU4/h$b;)LU4/h;

    move-result-object v3

    move-object v4, v6

    move-object/from16 v5, v19

    .line 10
    iget-object v6, v0, LU4/k;->a:LU4/s;

    invoke-virtual {v6, v4, v5}, LU4/s;->c(LS4/f;LU4/l;)V

    .line 11
    invoke-virtual {v5, v1, v2}, LU4/l;->d(Lk5/g;Ljava/util/concurrent/Executor;)V

    .line 12
    invoke-virtual {v5, v3}, LU4/l;->s(LU4/h;)V

    .line 13
    sget-boolean v2, LU4/k;->i:Z

    if-eqz v2, :cond_2

    .line 14
    const-string v2, "Started new load"

    move-wide/from16 v9, p21

    invoke-static {v2, v9, v10, v4}, LU4/k;->k(Ljava/lang/String;JLS4/f;)V

    .line 15
    :cond_2
    new-instance v2, LU4/k$d;

    invoke-direct {v2, v0, v1, v5}, LU4/k$d;-><init>(LU4/k;Lk5/g;LU4/l;)V

    return-object v2
.end method


# virtual methods
.method public declared-synchronized a(LU4/l;LS4/f;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LU4/k;->a:LU4/s;

    .line 3
    .line 4
    invoke-virtual {v0, p2, p1}, LU4/s;->d(LS4/f;LU4/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw p1
.end method

.method public b(LU4/v;)V
    .locals 2

    .line 1
    iget-object v0, p0, LU4/k;->e:LU4/y;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p1, v1}, LU4/y;->a(LU4/v;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public declared-synchronized c(LU4/l;LS4/f;LU4/p;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p3}, LU4/p;->d()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LU4/k;->h:LU4/a;

    .line 11
    .line 12
    invoke-virtual {v0, p2, p3}, LU4/a;->a(LS4/f;LU4/p;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    iget-object p3, p0, LU4/k;->a:LU4/s;

    .line 19
    .line 20
    invoke-virtual {p3, p2, p1}, LU4/s;->d(LS4/f;LU4/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p1
.end method

.method public d(LS4/f;LU4/p;)V
    .locals 1

    .line 1
    iget-object v0, p0, LU4/k;->h:LU4/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LU4/a;->d(LS4/f;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, LU4/p;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, LU4/k;->c:LW4/h;

    .line 13
    .line 14
    invoke-interface {v0, p1, p2}, LW4/h;->c(LS4/f;LU4/v;)LU4/v;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object p1, p0, LU4/k;->e:LU4/y;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p1, p2, v0}, LU4/y;->a(LU4/v;Z)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    iget-object v0, p0, LU4/k;->f:LU4/k$c;

    .line 2
    .line 3
    invoke-virtual {v0}, LU4/k$c;->a()LW4/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, LW4/a;->clear()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public g(Lcom/bumptech/glide/d;Ljava/lang/Object;LS4/f;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/g;LU4/j;Ljava/util/Map;ZZLS4/h;ZZZZLk5/g;Ljava/util/concurrent/Executor;)LU4/k$d;
    .locals 25

    move-object/from16 v2, p0

    .line 1
    sget-boolean v0, LU4/k;->i:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lo5/g;->b()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    .line 2
    :goto_0
    iget-object v3, v2, LU4/k;->b:LU4/o;

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v8, p10

    move-object/from16 v11, p13

    .line 3
    invoke-virtual/range {v3 .. v11}, LU4/o;->a(Ljava/lang/Object;LS4/f;IILjava/util/Map;Ljava/lang/Class;Ljava/lang/Class;LS4/h;)LU4/n;

    move-result-object v3

    .line 4
    monitor-enter p0

    move/from16 v4, p14

    .line 5
    :try_start_0
    invoke-direct {v2, v3, v4, v0, v1}, LU4/k;->j(LU4/n;ZJ)LU4/p;

    move-result-object v5

    if-nez v5, :cond_1

    move-object/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move/from16 v13, p11

    move/from16 v14, p12

    move-object/from16 v15, p13

    move/from16 v17, p15

    move/from16 v18, p16

    move/from16 v19, p17

    move-object/from16 v20, p18

    move-object/from16 v21, p19

    move-wide/from16 v23, v0

    move-object/from16 v22, v3

    move/from16 v16, v4

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    .line 6
    invoke-direct/range {v2 .. v24}, LU4/k;->m(Lcom/bumptech/glide/d;Ljava/lang/Object;LS4/f;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/g;LU4/j;Ljava/util/Map;ZZLS4/h;ZZZZLk5/g;Ljava/util/concurrent/Executor;LU4/n;J)LU4/k$d;

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    move-object v0, v5

    .line 7
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    sget-object v1, LS4/a;->e:LS4/a;

    const/4 v2, 0x0

    move-object/from16 v3, p18

    invoke-interface {v3, v0, v1, v2}, Lk5/g;->b(LU4/v;LS4/a;Z)V

    const/4 v0, 0x0

    return-object v0

    .line 9
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public l(LU4/v;)V
    .locals 1

    .line 1
    instance-of v0, p1, LU4/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LU4/p;

    .line 6
    .line 7
    invoke-virtual {p1}, LU4/p;->e()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    const-string v0, "Cannot release anything but an EngineResource"

    .line 14
    .line 15
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1
.end method
