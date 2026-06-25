.class abstract synthetic LH/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LK0/j;Lr0/h;LZd/e;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object p0, LTd/L;->a:LTd/L;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-static {p0}, LK0/k;->l(LK0/j;)LI0/p;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {p0}, Landroidx/compose/foundation/relocation/b;->c(LK0/j;)LH/a;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-nez p0, :cond_1

    .line 23
    .line 24
    sget-object p0, LTd/L;->a:LTd/L;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    new-instance v1, LH/f$a;

    .line 28
    .line 29
    invoke-direct {v1, p1, v0}, LH/f$a;-><init>(Lr0/h;LI0/p;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0, v0, v1, p2}, LH/a;->o1(LI0/p;Lie/a;LZd/e;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-ne p0, p1, :cond_2

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_2
    sget-object p0, LTd/L;->a:LTd/L;

    .line 44
    .line 45
    return-object p0
.end method

.method public static synthetic b(LK0/j;Lr0/h;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1, p2}, LH/e;->a(LK0/j;Lr0/h;LZd/e;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
