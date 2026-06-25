.class abstract synthetic LY/b2;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a()Li0/E;
    .locals 1

    .line 1
    new-instance v0, Li0/E;

    .line 2
    .line 3
    invoke-direct {v0}, Li0/E;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final varargs b([Ljava/lang/Object;)Li0/E;
    .locals 1

    .line 1
    new-instance v0, Li0/E;

    .line 2
    .line 3
    invoke-direct {v0}, Li0/E;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, LUd/n;->V0([Ljava/lang/Object;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Li0/E;->addAll(Ljava/util/Collection;)Z

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static final c()Li0/G;
    .locals 1

    .line 1
    new-instance v0, Li0/G;

    .line 2
    .line 3
    invoke-direct {v0}, Li0/G;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final d(Ljava/lang/Object;LY/T1;)LY/C0;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY/c2;->a(Ljava/lang/Object;LY/T1;)Li0/A;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x2

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-static {}, LY/U1;->q()LY/T1;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    invoke-static {p0, p1}, LY/U1;->h(Ljava/lang/Object;LY/T1;)LY/C0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static final f(Ljava/lang/Object;LY/m;I)LY/h2;
    .locals 3

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:335)"

    .line 9
    .line 10
    const v2, -0x3f14ae72

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    sget-object v0, LY/m;->a:LY/m$a;

    .line 21
    .line 22
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-ne p2, v0, :cond_1

    .line 27
    .line 28
    const/4 p2, 0x2

    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-static {p0, v0, p2, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-interface {p1, p2}, LY/m;->u(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    check-cast p2, LY/C0;

    .line 38
    .line 39
    invoke-interface {p2, p0}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-static {}, LY/w;->L()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    invoke-static {}, LY/w;->T()V

    .line 49
    .line 50
    .line 51
    :cond_2
    return-object p2
.end method
