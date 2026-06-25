.class final LK0/e0$g;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK0/e0;->D2()Lkotlin/jvm/functions/Function2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK0/e0;

.field final synthetic b:Lie/a;


# direct methods
.method constructor <init>(LK0/e0;Lie/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/e0$g;->a:LK0/e0;

    .line 2
    .line 3
    iput-object p2, p0, LK0/e0$g;->b:Lie/a;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Ls0/j0;Lv0/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, LK0/e0$g;->a:LK0/e0;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/e0;->L1()LK0/J;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LK0/J;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LK0/e0$g;->a:LK0/e0;

    .line 14
    .line 15
    invoke-static {v0, p1}, LK0/e0;->m2(LK0/e0;Ls0/j0;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, LK0/e0$g;->a:LK0/e0;

    .line 19
    .line 20
    invoke-static {p1, p2}, LK0/e0;->n2(LK0/e0;Lv0/c;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, LK0/e0$g;->a:LK0/e0;

    .line 24
    .line 25
    invoke-static {p1}, LK0/e0;->j2(LK0/e0;)LK0/r0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object p2, p0, LK0/e0$g;->a:LK0/e0;

    .line 30
    .line 31
    invoke-static {}, LK0/e0;->g2()Lkotlin/jvm/functions/Function1;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v1, p0, LK0/e0$g;->b:Lie/a;

    .line 36
    .line 37
    invoke-virtual {p1, p2, v0, v1}, LK0/r0;->i(LK0/q0;Lkotlin/jvm/functions/Function1;Lie/a;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, LK0/e0$g;->a:LK0/e0;

    .line 41
    .line 42
    const/4 p2, 0x0

    .line 43
    invoke-static {p1, p2}, LK0/e0;->o2(LK0/e0;Z)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    iget-object p1, p0, LK0/e0$g;->a:LK0/e0;

    .line 48
    .line 49
    const/4 p2, 0x1

    .line 50
    invoke-static {p1, p2}, LK0/e0;->o2(LK0/e0;Z)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ls0/j0;

    .line 2
    .line 3
    check-cast p2, Lv0/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LK0/e0$g;->a(Ls0/j0;Lv0/c;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object p1
.end method
