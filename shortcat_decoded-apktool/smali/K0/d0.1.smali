.class public abstract LK0/d0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final synthetic a(Landroidx/compose/ui/e;La0/c;La0/c;)La0/c;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LK0/d0;->d(Landroidx/compose/ui/e;La0/c;La0/c;)La0/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(LK0/Y;Landroidx/compose/ui/e$c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LK0/d0;->e(LK0/Y;Landroidx/compose/ui/e$c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final c(Landroidx/compose/ui/e$b;Landroidx/compose/ui/e$b;)I
    .locals 1

    .line 1
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x2

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-static {p0, p1}, Ll0/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_1
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method private static final d(Landroidx/compose/ui/e;La0/c;La0/c;)La0/c;
    .locals 2

    .line 1
    invoke-virtual {p2, p0}, La0/c;->c(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    :goto_0
    invoke-virtual {p2}, La0/c;->p()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    invoke-virtual {p2}, La0/c;->p()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    add-int/lit8 v0, v0, -0x1

    .line 16
    .line 17
    invoke-virtual {p2, v0}, La0/c;->y(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Landroidx/compose/ui/e;

    .line 22
    .line 23
    instance-of v1, v0, Landroidx/compose/ui/a;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    check-cast v0, Landroidx/compose/ui/a;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/compose/ui/a;->a()Landroidx/compose/ui/e;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p2, v1}, La0/c;->c(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Landroidx/compose/ui/a;->c()Landroidx/compose/ui/e;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p2, v0}, La0/c;->c(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    instance-of v1, v0, Landroidx/compose/ui/e$b;

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {p1, v0}, La0/c;->c(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    if-nez p0, :cond_2

    .line 53
    .line 54
    new-instance p0, LK0/d0$a;

    .line 55
    .line 56
    invoke-direct {p0, p1}, LK0/d0$a;-><init>(La0/c;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    move-object v1, p0

    .line 60
    invoke-interface {v0, p0}, Landroidx/compose/ui/e;->all(Lkotlin/jvm/functions/Function1;)Z

    .line 61
    .line 62
    .line 63
    move-object p0, v1

    .line 64
    goto :goto_0

    .line 65
    :cond_3
    return-object p1
.end method

.method private static final e(LK0/Y;Landroidx/compose/ui/e$c;)V
    .locals 1

    .line 1
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, LK0/Y;->update(Landroidx/compose/ui/e$c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
