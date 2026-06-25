.class public abstract LK/T;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Landroidx/compose/ui/e;LB/m;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    new-instance p2, LK/T$a;

    .line 4
    .line 5
    invoke-direct {p2, p3, p1}, LK/T$a;-><init>(Lkotlin/jvm/functions/Function1;LB/m;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-static {p0, p3, p2, p1, p3}, Landroidx/compose/ui/c;->c(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lie/o;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    return-object p0
.end method
