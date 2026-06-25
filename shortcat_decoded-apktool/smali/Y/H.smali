.class public abstract LY/H;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static synthetic a(LY/c1;Lkotlin/jvm/functions/Function2;ILY/m;I)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, LY/H;->f(LY/c1;Lkotlin/jvm/functions/Function2;ILY/m;I)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b([LY/c1;Lkotlin/jvm/functions/Function2;ILY/m;I)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, LY/H;->e([LY/c1;Lkotlin/jvm/functions/Function2;ILY/m;I)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final c(LY/c1;Lkotlin/jvm/functions/Function2;LY/m;I)V
    .locals 3

    .line 1
    const v0, -0x8ed3d8b

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-static {}, LY/w;->L()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    const-string v2, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:387)"

    .line 16
    .line 17
    invoke-static {v0, p3, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-interface {p2, p0}, LY/m;->P(LY/c1;)V

    .line 21
    .line 22
    .line 23
    shr-int/lit8 v0, p3, 0x3

    .line 24
    .line 25
    and-int/lit8 v0, v0, 0xe

    .line 26
    .line 27
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {p1, p2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    invoke-interface {p2}, LY/m;->w()V

    .line 35
    .line 36
    .line 37
    invoke-static {}, LY/w;->L()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-static {}, LY/w;->T()V

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-interface {p2}, LY/m;->k()LY/B1;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    if-eqz p2, :cond_2

    .line 51
    .line 52
    new-instance v0, LY/F;

    .line 53
    .line 54
    invoke-direct {v0, p0, p1, p3}, LY/F;-><init>(LY/c1;Lkotlin/jvm/functions/Function2;I)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p2, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void
.end method

.method public static final d([LY/c1;Lkotlin/jvm/functions/Function2;LY/m;I)V
    .locals 3

    .line 1
    const v0, 0x18bf8a0a

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-static {}, LY/w;->L()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    const-string v2, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:367)"

    .line 16
    .line 17
    invoke-static {v0, p3, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-interface {p2, p0}, LY/m;->L([LY/c1;)V

    .line 21
    .line 22
    .line 23
    shr-int/lit8 v0, p3, 0x3

    .line 24
    .line 25
    and-int/lit8 v0, v0, 0xe

    .line 26
    .line 27
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {p1, p2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    invoke-interface {p2}, LY/m;->M()V

    .line 35
    .line 36
    .line 37
    invoke-static {}, LY/w;->L()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-static {}, LY/w;->T()V

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-interface {p2}, LY/m;->k()LY/B1;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    if-eqz p2, :cond_2

    .line 51
    .line 52
    new-instance v0, LY/G;

    .line 53
    .line 54
    invoke-direct {v0, p0, p1, p3}, LY/G;-><init>([LY/c1;Lkotlin/jvm/functions/Function2;I)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p2, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void
.end method

.method private static final e([LY/c1;Lkotlin/jvm/functions/Function2;ILY/m;I)LTd/L;
    .locals 0

    .line 1
    or-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    invoke-static {p2}, LY/g1;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-static {p0, p1, p3, p2}, LY/H;->d([LY/c1;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 8
    .line 9
    .line 10
    sget-object p0, LTd/L;->a:LTd/L;

    .line 11
    .line 12
    return-object p0
.end method

.method private static final f(LY/c1;Lkotlin/jvm/functions/Function2;ILY/m;I)LTd/L;
    .locals 0

    .line 1
    or-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    invoke-static {p2}, LY/g1;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-static {p0, p1, p3, p2}, LY/H;->c(LY/c1;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 8
    .line 9
    .line 10
    sget-object p0, LTd/L;->a:LTd/L;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final g(LY/T1;Lie/a;)LY/b1;
    .locals 1

    .line 1
    new-instance v0, LY/Z;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LY/Z;-><init>(LY/T1;Lie/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic h(LY/T1;Lie/a;ILjava/lang/Object;)LY/b1;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-static {}, LY/U1;->q()LY/T1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    invoke-static {p0, p1}, LY/H;->g(LY/T1;Lie/a;)LY/b1;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static final i(Lkotlin/jvm/functions/Function1;)LY/b1;
    .locals 1

    .line 1
    new-instance v0, LY/O;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LY/O;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final j(Lie/a;)LY/b1;
    .locals 1

    .line 1
    new-instance v0, LY/i2;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LY/i2;-><init>(Lie/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
