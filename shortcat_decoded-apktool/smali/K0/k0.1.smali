.class public abstract LK0/k0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Landroidx/compose/ui/e$c;Lie/a;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getOwnerScope$ui_release()LK0/l0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LK0/l0;

    .line 8
    .line 9
    move-object v1, p0

    .line 10
    check-cast v1, LK0/j0;

    .line 11
    .line 12
    invoke-direct {v0, v1}, LK0/l0;-><init>(LK0/j0;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroidx/compose/ui/e$c;->setOwnerScope$ui_release(LK0/l0;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {p0}, LK0/k;->o(LK0/j;)LK0/p0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p0}, LK0/p0;->getSnapshotObserver()LK0/r0;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object v1, LK0/l0;->b:LK0/l0$b;

    .line 27
    .line 28
    invoke-virtual {v1}, LK0/l0$b;->a()Lkotlin/jvm/functions/Function1;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {p0, v0, v1, p1}, LK0/r0;->i(LK0/q0;Lkotlin/jvm/functions/Function1;Lie/a;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
