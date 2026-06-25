.class public abstract LQ/H;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LQ/F;Ly/i;)Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    new-instance v0, LQ/H$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LQ/H$a;-><init>(LQ/F;Ly/i;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final b(LE0/q;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public static final c(Landroidx/compose/ui/e;LQ/F;)Landroidx/compose/ui/e;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {v0, v1, v2}, Lx/K;->d(IILjava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, LQ/H$b;

    .line 12
    .line 13
    invoke-direct {v0, p1}, LQ/H$b;-><init>(LQ/F;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v2, v0, v1, v2}, Landroidx/compose/ui/c;->c(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lie/o;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method
