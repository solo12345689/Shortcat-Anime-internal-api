.class final LK0/V$e;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK0/V;->f2(JFLkotlin/jvm/functions/Function1;Lv0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK0/V;

.field final synthetic b:LK0/p0;

.field final synthetic c:J


# direct methods
.method constructor <init>(LK0/V;LK0/p0;J)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/V$e;->a:LK0/V;

    .line 2
    .line 3
    iput-object p2, p0, LK0/V$e;->b:LK0/p0;

    .line 4
    .line 5
    iput-wide p3, p0, LK0/V$e;->c:J

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/V$e;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 9

    .line 2
    iget-object v0, p0, LK0/V$e;->a:LK0/V;

    invoke-static {v0}, LK0/V;->x1(LK0/V;)LK0/J;

    move-result-object v0

    invoke-static {v0}, LK0/P;->a(LK0/J;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, LK0/V$e;->a:LK0/V;

    invoke-static {v0}, LK0/V;->y1(LK0/V;)LK0/O;

    move-result-object v0

    invoke-virtual {v0}, LK0/O;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, LK0/V$e;->a:LK0/V;

    invoke-static {v0}, LK0/V;->z1(LK0/V;)LK0/e0;

    move-result-object v0

    invoke-virtual {v0}, LK0/e0;->P2()LK0/e0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LK0/e0;->I2()LK0/U;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LK0/T;->O1()Landroidx/compose/ui/layout/s$a;

    move-result-object v1

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, LK0/V$e;->a:LK0/V;

    invoke-static {v0}, LK0/V;->z1(LK0/V;)LK0/e0;

    move-result-object v0

    invoke-virtual {v0}, LK0/e0;->P2()LK0/e0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LK0/T;->O1()Landroidx/compose/ui/layout/s$a;

    move-result-object v1

    :cond_1
    :goto_0
    if-nez v1, :cond_2

    .line 6
    iget-object v0, p0, LK0/V$e;->b:LK0/p0;

    invoke-interface {v0}, LK0/p0;->getPlacementScope()Landroidx/compose/ui/layout/s$a;

    move-result-object v1

    :cond_2
    move-object v2, v1

    .line 7
    iget-object v0, p0, LK0/V$e;->a:LK0/V;

    iget-wide v4, p0, LK0/V$e;->c:J

    invoke-static {v0}, LK0/V;->z1(LK0/V;)LK0/e0;

    move-result-object v0

    invoke-virtual {v0}, LK0/e0;->I2()LK0/U;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/s$a;->U(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;JFILjava/lang/Object;)V

    return-void
.end method
