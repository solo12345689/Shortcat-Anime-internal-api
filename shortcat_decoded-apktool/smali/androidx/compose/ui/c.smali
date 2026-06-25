.class public abstract Landroidx/compose/ui/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final synthetic a(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/ui/c;->e(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lie/o;)Landroidx/compose/ui/e;
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/ui/b;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroidx/compose/ui/b;-><init>(Lkotlin/jvm/functions/Function1;Lie/o;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lie/o;ILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    invoke-static {}, Landroidx/compose/ui/platform/T0;->a()Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/c;->b(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lie/o;)Landroidx/compose/ui/e;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static final synthetic d(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/ui/c;->g(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final e(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/ui/c$a;->a:Landroidx/compose/ui/c$a;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Landroidx/compose/ui/e;->all(Lkotlin/jvm/functions/Function1;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    const v0, 0x48ae8da7

    .line 11
    .line 12
    .line 13
    invoke-interface {p0, v0}, LY/m;->C(I)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/c$b;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Landroidx/compose/ui/c$b;-><init>(LY/m;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, v0, v1}, Landroidx/compose/ui/e;->foldIn(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Landroidx/compose/ui/e;

    .line 28
    .line 29
    invoke-interface {p0}, LY/m;->T()V

    .line 30
    .line 31
    .line 32
    return-object p1
.end method

.method public static final f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;
    .locals 1

    .line 1
    const v0, 0x1a365f2c

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->V(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, Landroidx/compose/ui/c;->e(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0}, LY/m;->O()V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method

.method public static final g(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    new-instance v0, Landroidx/compose/ui/CompositionLocalMapInjectionElement;

    .line 7
    .line 8
    invoke-interface {p0}, LY/m;->r()LY/I;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Landroidx/compose/ui/CompositionLocalMapInjectionElement;-><init>(LY/I;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
