.class public abstract LK0/B0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z
    .locals 1

    .line 1
    sget-object v0, LR0/l;->a:LR0/l;

    .line 2
    .line 3
    invoke-virtual {v0}, LR0/l;->l()LR0/B;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0, v0}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public static final b(LK0/A0;)V
    .locals 0

    .line 1
    invoke-static {p0}, LK0/k;->n(LK0/j;)LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, LK0/J;->V0()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final c(Landroidx/compose/ui/e$c;Z)Lr0/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getNode()Landroidx/compose/ui/e$c;

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
    sget-object p0, Lr0/h;->e:Lr0/h$a;

    .line 12
    .line 13
    invoke-virtual {p0}, Lr0/h$a;->a()Lr0/h;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    const/16 v0, 0x8

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-static {p0, p1}, LK0/k;->i(LK0/j;I)LK0/e0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, LI0/q;->b(LI0/p;)Lr0/h;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-static {p0, p1}, LK0/k;->i(LK0/j;I)LK0/e0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, LK0/e0;->C3()Lr0/h;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method
