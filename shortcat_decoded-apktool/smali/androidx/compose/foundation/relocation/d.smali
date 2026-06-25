.class abstract synthetic Landroidx/compose/foundation/relocation/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final synthetic a(LI0/p;LI0/p;Lr0/h;)Lr0/h;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/relocation/d;->c(LI0/p;LI0/p;Lr0/h;)Lr0/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final b(LK0/j;)LH/a;
    .locals 1

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
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    sget-object v0, Landroidx/compose/foundation/relocation/f;->d:Landroidx/compose/foundation/relocation/f$a;

    .line 14
    .line 15
    invoke-static {p0, v0}, LK0/J0;->a(LK0/j;Ljava/lang/Object;)LK0/I0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, LH/a;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    invoke-static {p0}, LH/d;->b(LK0/j;)LH/a;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_1
    return-object v0
.end method

.method private static final c(LI0/p;LI0/p;Lr0/h;)Lr0/h;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, p1, v0}, LI0/p;->w0(LI0/p;Z)Lr0/h;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Lr0/h;->m()J

    .line 7
    .line 8
    .line 9
    move-result-wide p0

    .line 10
    invoke-virtual {p2, p0, p1}, Lr0/h;->t(J)Lr0/h;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method
