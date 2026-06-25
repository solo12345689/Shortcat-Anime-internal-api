.class final LK0/V$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK0/V;->Y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK0/V;

.field final synthetic b:LK0/U;


# direct methods
.method constructor <init>(LK0/V;LK0/U;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/V$c;->a:LK0/V;

    .line 2
    .line 3
    iput-object p2, p0, LK0/V$c;->b:LK0/U;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/V$c;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 6

    .line 2
    iget-object v0, p0, LK0/V$c;->a:LK0/V;

    invoke-static {v0}, LK0/V;->u1(LK0/V;)V

    .line 3
    iget-object v0, p0, LK0/V$c;->a:LK0/V;

    sget-object v1, LK0/V$c$a;->a:LK0/V$c$a;

    invoke-virtual {v0, v1}, LK0/V;->C0(Lkotlin/jvm/functions/Function1;)V

    .line 4
    iget-object v0, p0, LK0/V$c;->a:LK0/V;

    invoke-virtual {v0}, LK0/V;->f0()LK0/e0;

    move-result-object v0

    invoke-virtual {v0}, LK0/e0;->I2()LK0/U;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LK0/T;->U1()Z

    move-result v0

    iget-object v2, p0, LK0/V$c;->a:LK0/V;

    .line 5
    invoke-static {v2}, LK0/V;->x1(LK0/V;)LK0/J;

    move-result-object v2

    invoke-virtual {v2}, LK0/J;->P()Ljava/util/List;

    move-result-object v2

    .line 6
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    move v4, v1

    :goto_0
    if-ge v4, v3, :cond_1

    .line 7
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 8
    check-cast v5, LK0/J;

    .line 9
    invoke-virtual {v5}, LK0/J;->w0()LK0/e0;

    move-result-object v5

    invoke-virtual {v5}, LK0/e0;->I2()LK0/U;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5, v0}, LK0/T;->a2(Z)V

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 10
    :cond_1
    iget-object v0, p0, LK0/V$c;->b:LK0/U;

    invoke-virtual {v0}, LK0/U;->M1()LI0/C;

    move-result-object v0

    invoke-interface {v0}, LI0/C;->A()V

    .line 11
    iget-object v0, p0, LK0/V$c;->a:LK0/V;

    invoke-virtual {v0}, LK0/V;->f0()LK0/e0;

    move-result-object v0

    invoke-virtual {v0}, LK0/e0;->I2()LK0/U;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LK0/T;->U1()Z

    iget-object v0, p0, LK0/V$c;->a:LK0/V;

    .line 12
    invoke-static {v0}, LK0/V;->x1(LK0/V;)LK0/J;

    move-result-object v0

    invoke-virtual {v0}, LK0/J;->P()Ljava/util/List;

    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    move v3, v1

    :goto_1
    if-ge v3, v2, :cond_3

    .line 14
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 15
    check-cast v4, LK0/J;

    .line 16
    invoke-virtual {v4}, LK0/J;->w0()LK0/e0;

    move-result-object v4

    invoke-virtual {v4}, LK0/e0;->I2()LK0/U;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4, v1}, LK0/T;->a2(Z)V

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 17
    :cond_3
    iget-object v0, p0, LK0/V$c;->a:LK0/V;

    invoke-static {v0}, LK0/V;->o1(LK0/V;)V

    .line 18
    iget-object v0, p0, LK0/V$c;->a:LK0/V;

    sget-object v1, LK0/V$c$b;->a:LK0/V$c$b;

    invoke-virtual {v0, v1}, LK0/V;->C0(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
