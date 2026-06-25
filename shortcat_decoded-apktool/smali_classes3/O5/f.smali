.class public LO5/f;
.super LS5/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final t:Lz6/t;

.field private final u:LO5/h;

.field private v:Ly5/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;LO5/h;Lz6/t;Ljava/util/Set;Ljava/util/Set;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p4, p5}, LS5/b;-><init>(Landroid/content/Context;Ljava/util/Set;Ljava/util/Set;)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LO5/f;->t:Lz6/t;

    .line 5
    .line 6
    iput-object p2, p0, LO5/f;->u:LO5/h;

    .line 7
    .line 8
    return-void
.end method

.method public static F(LS5/b$c;)LK6/b$c;
    .locals 3

    .line 1
    sget-object v0, LO5/f$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_2

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    sget-object p0, LK6/b$c;->e:LK6/b$c;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 22
    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v2, "Cache level"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p0, "is not supported. "

    .line 37
    .line 38
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_1
    sget-object p0, LK6/b$c;->c:LK6/b$c;

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_2
    sget-object p0, LK6/b$c;->b:LK6/b$c;

    .line 53
    .line 54
    return-object p0
.end method

.method private G()Ls5/d;
    .locals 3

    .line 1
    invoke-virtual {p0}, LS5/b;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LK6/b;

    .line 6
    .line 7
    iget-object v1, p0, LO5/f;->t:Lz6/t;

    .line 8
    .line 9
    invoke-virtual {v1}, Lz6/t;->r()Lx6/k;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, LK6/b;->l()LK6/d;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, LS5/b;->d()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v1, v0, v2}, Lx6/k;->b(LK6/b;Ljava/lang/Object;)Ls5/d;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :cond_0
    invoke-virtual {p0}, LS5/b;->d()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-interface {v1, v0, v2}, Lx6/k;->a(LK6/b;Ljava/lang/Object;)Ls5/d;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0

    .line 41
    :cond_1
    const/4 v0, 0x0

    .line 42
    return-object v0
.end method


# virtual methods
.method protected H(LY5/a;Ljava/lang/String;LK6/b;Ljava/lang/Object;LS5/b$c;)LI5/c;
    .locals 6

    .line 1
    iget-object v0, p0, LO5/f;->t:Lz6/t;

    .line 2
    .line 3
    invoke-static {p5}, LO5/f;->F(LS5/b$c;)LK6/b$c;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    invoke-virtual {p0, p1}, LO5/f;->I(LY5/a;)LG6/e;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    move-object v5, p2

    .line 12
    move-object v1, p3

    .line 13
    move-object v2, p4

    .line 14
    invoke-virtual/range {v0 .. v5}, Lz6/t;->m(LK6/b;Ljava/lang/Object;LK6/b$c;LG6/e;Ljava/lang/String;)LI5/c;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method protected I(LY5/a;)LG6/e;
    .locals 1

    .line 1
    instance-of v0, p1, LO5/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LO5/e;

    .line 6
    .line 7
    invoke-virtual {p1}, LO5/e;->q0()LG6/e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return-object p1
.end method

.method protected J()LO5/e;
    .locals 7

    .line 1
    invoke-static {}, LL6/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "PipelineDraweeControllerBuilder#obtainController"

    .line 8
    .line 9
    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    :try_start_0
    invoke-virtual {p0}, LS5/b;->n()LY5/a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {}, LS5/b;->c()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    instance-of v1, v0, LO5/e;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    check-cast v0, LO5/e;

    .line 25
    .line 26
    :goto_0
    move-object v1, v0

    .line 27
    goto :goto_1

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    goto :goto_2

    .line 30
    :cond_1
    iget-object v0, p0, LO5/f;->u:LO5/h;

    .line 31
    .line 32
    invoke-virtual {v0}, LO5/h;->c()LO5/e;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    goto :goto_0

    .line 37
    :goto_1
    invoke-virtual {p0, v1, v3}, LS5/b;->w(LY5/a;Ljava/lang/String;)Ly5/n;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-direct {p0}, LO5/f;->G()Ls5/d;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {p0}, LS5/b;->d()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    iget-object v6, p0, LO5/f;->v:Ly5/f;

    .line 50
    .line 51
    invoke-virtual/range {v1 .. v6}, LO5/e;->s0(Ly5/n;Ljava/lang/String;Ls5/d;Ljava/lang/Object;Ly5/f;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-virtual {v1, v0, p0}, LO5/e;->t0(Ll6/g;LS5/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    invoke-static {}, LL6/b;->d()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-static {}, LL6/b;->b()V

    .line 65
    .line 66
    .line 67
    :cond_2
    return-object v1

    .line 68
    :goto_2
    invoke-static {}, LL6/b;->d()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    invoke-static {}, LL6/b;->b()V

    .line 75
    .line 76
    .line 77
    :cond_3
    throw v0
.end method

.method public K(Ll6/g;)LO5/f;
    .locals 0

    .line 1
    invoke-virtual {p0}, LS5/b;->p()LS5/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LO5/f;

    .line 6
    .line 7
    return-object p1
.end method

.method protected bridge synthetic g(LY5/a;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;LS5/b$c;)LI5/c;
    .locals 0

    .line 1
    check-cast p3, LK6/b;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, LO5/f;->H(LY5/a;Ljava/lang/String;LK6/b;Ljava/lang/Object;LS5/b$c;)LI5/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method protected bridge synthetic v()LS5/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO5/f;->J()LO5/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
