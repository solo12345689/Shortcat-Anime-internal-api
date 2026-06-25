.class public abstract LC/W;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Landroidx/compose/ui/e;LC/P;)Landroidx/compose/ui/e;
    .locals 3

    .line 1
    new-instance v0, LC/m;

    .line 2
    .line 3
    invoke-static {}, Landroidx/compose/ui/platform/T0;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v1, LC/W$a;

    .line 10
    .line 11
    invoke-direct {v1, p1}, LC/W$a;-><init>(LC/P;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/T0;->a()Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    sget-object v2, LC/W$b;->a:LC/W$b;

    .line 20
    .line 21
    invoke-direct {v0, p1, v1, v2}, LC/m;-><init>(LC/P;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LC/P;)Landroidx/compose/ui/e;
    .locals 3

    .line 1
    new-instance v0, LC/m;

    .line 2
    .line 3
    invoke-static {}, Landroidx/compose/ui/platform/T0;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v1, LC/W$c;

    .line 10
    .line 11
    invoke-direct {v1, p1}, LC/W$c;-><init>(LC/P;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/T0;->a()Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    sget-object v2, LC/W$d;->a:LC/W$d;

    .line 20
    .line 21
    invoke-direct {v0, p1, v1, v2}, LC/m;-><init>(LC/P;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method
