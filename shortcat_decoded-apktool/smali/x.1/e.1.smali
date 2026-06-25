.class public abstract Lx/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final synthetic a(Ls0/m1;Lr0/j;FZ)Ls0/m1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lx/e;->j(Ls0/m1;Lr0/j;FZ)Ls0/m1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(Lp0/f;)Lp0/j;
    .locals 0

    .line 1
    invoke-static {p0}, Lx/e;->k(Lp0/f;)Lp0/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic c(Lp0/f;Ls0/h0;JJZF)Lp0/j;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lx/e;->l(Lp0/f;Ls0/h0;JJZF)Lp0/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic d(JF)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lx/e;->m(JF)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static final e(Landroidx/compose/ui/e;Lx/g;Ls0/E1;)Landroidx/compose/ui/e;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lx/g;->b()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lx/g;->a()Ls0/h0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p0, v0, p1, p2}, Lx/e;->h(Landroidx/compose/ui/e;FLs0/h0;Ls0/E1;)Landroidx/compose/ui/e;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/e;FJLs0/E1;)Landroidx/compose/ui/e;
    .locals 2

    .line 1
    new-instance v0, Ls0/F1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p2, p3, v1}, Ls0/F1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1, v0, p4}, Lx/e;->h(Landroidx/compose/ui/e;FLs0/h0;Ls0/E1;)Landroidx/compose/ui/e;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static synthetic g(Landroidx/compose/ui/e;FJLs0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x4

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ls0/t1;->a()Ls0/E1;

    .line 6
    .line 7
    .line 8
    move-result-object p4

    .line 9
    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lx/e;->f(Landroidx/compose/ui/e;FJLs0/E1;)Landroidx/compose/ui/e;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/e;FLs0/h0;Ls0/E1;)Landroidx/compose/ui/e;
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/foundation/BorderModifierNodeElement;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, p2, p3, v1}, Landroidx/compose/foundation/BorderModifierNodeElement;-><init>(FLs0/h0;Ls0/E1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private static final i(FLr0/j;)Lr0/j;
    .locals 14

    .line 1
    invoke-virtual {p1}, Lr0/j;->j()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-float v3, v0, p0

    .line 6
    .line 7
    invoke-virtual {p1}, Lr0/j;->d()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sub-float v4, v0, p0

    .line 12
    .line 13
    invoke-virtual {p1}, Lr0/j;->h()J

    .line 14
    .line 15
    .line 16
    move-result-wide v5

    .line 17
    invoke-static {v5, v6, p0}, Lx/e;->m(JF)J

    .line 18
    .line 19
    .line 20
    move-result-wide v5

    .line 21
    invoke-virtual {p1}, Lr0/j;->i()J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    invoke-static {v7, v8, p0}, Lx/e;->m(JF)J

    .line 26
    .line 27
    .line 28
    move-result-wide v7

    .line 29
    invoke-virtual {p1}, Lr0/j;->b()J

    .line 30
    .line 31
    .line 32
    move-result-wide v9

    .line 33
    invoke-static {v9, v10, p0}, Lx/e;->m(JF)J

    .line 34
    .line 35
    .line 36
    move-result-wide v11

    .line 37
    invoke-virtual {p1}, Lr0/j;->c()J

    .line 38
    .line 39
    .line 40
    move-result-wide v9

    .line 41
    invoke-static {v9, v10, p0}, Lx/e;->m(JF)J

    .line 42
    .line 43
    .line 44
    move-result-wide v9

    .line 45
    new-instance v0, Lr0/j;

    .line 46
    .line 47
    const/4 v13, 0x0

    .line 48
    move v2, p0

    .line 49
    move v1, p0

    .line 50
    invoke-direct/range {v0 .. v13}, Lr0/j;-><init>(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    return-object v0
.end method

.method private static final j(Ls0/m1;Lr0/j;FZ)Ls0/m1;
    .locals 2

    .line 1
    invoke-interface {p0}, Ls0/m1;->reset()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-static {p0, p1, v0, v1, v0}, Ls0/m1;->s(Ls0/m1;Lr0/j;Ls0/m1$b;ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    invoke-static {}, Ls0/V;->a()Ls0/m1;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-static {p2, p1}, Lx/e;->i(FLr0/j;)Lr0/j;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p3, p1, v0, v1, v0}, Ls0/m1;->s(Ls0/m1;Lr0/j;Ls0/m1$b;ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Ls0/q1;->a:Ls0/q1$a;

    .line 23
    .line 24
    invoke-virtual {p1}, Ls0/q1$a;->a()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-interface {p0, p0, p3, p1}, Ls0/m1;->m(Ls0/m1;Ls0/m1;I)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    return-object p0
.end method

.method private static final k(Lp0/f;)Lp0/j;
    .locals 1

    .line 1
    sget-object v0, Lx/e$a;->a:Lx/e$a;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lp0/f;->p(Lkotlin/jvm/functions/Function1;)Lp0/j;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private static final l(Lp0/f;Ls0/h0;JJZF)Lp0/j;
    .locals 16

    .line 1
    if-eqz p6, :cond_0

    .line 2
    .line 3
    sget-object v0, Lr0/f;->b:Lr0/f$a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lr0/f$a;->c()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    move-wide v4, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-wide/from16 v4, p2

    .line 12
    .line 13
    :goto_0
    if-eqz p6, :cond_1

    .line 14
    .line 15
    invoke-virtual/range {p0 .. p0}, Lp0/f;->f()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    move-wide v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-wide/from16 v6, p4

    .line 22
    .line 23
    :goto_1
    if-eqz p6, :cond_2

    .line 24
    .line 25
    sget-object v0, Lu0/j;->a:Lu0/j;

    .line 26
    .line 27
    move-object v8, v0

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    new-instance v8, Lu0/k;

    .line 30
    .line 31
    const/16 v14, 0x1e

    .line 32
    .line 33
    const/4 v15, 0x0

    .line 34
    const/4 v10, 0x0

    .line 35
    const/4 v11, 0x0

    .line 36
    const/4 v12, 0x0

    .line 37
    const/4 v13, 0x0

    .line 38
    move/from16 v9, p7

    .line 39
    .line 40
    invoke-direct/range {v8 .. v15}, Lu0/k;-><init>(FFIILs0/n1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 41
    .line 42
    .line 43
    :goto_2
    new-instance v2, Lx/e$b;

    .line 44
    .line 45
    move-object/from16 v3, p1

    .line 46
    .line 47
    invoke-direct/range {v2 .. v8}, Lx/e$b;-><init>(Ls0/h0;JJLu0/g;)V

    .line 48
    .line 49
    .line 50
    move-object/from16 v0, p0

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Lp0/f;->p(Lkotlin/jvm/functions/Function1;)Lp0/j;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0
.end method

.method private static final m(JF)J
    .locals 2

    .line 1
    invoke-static {p0, p1}, Lr0/a;->d(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-float/2addr v0, p2

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {p0, p1}, Lr0/a;->e(J)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    sub-float/2addr p0, p2

    .line 16
    invoke-static {v1, p0}, Ljava/lang/Math;->max(FF)F

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {v0, p0}, Lr0/b;->a(FF)J

    .line 21
    .line 22
    .line 23
    move-result-wide p0

    .line 24
    return-wide p0
.end method
