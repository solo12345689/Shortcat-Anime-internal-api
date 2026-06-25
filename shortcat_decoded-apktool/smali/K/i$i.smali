.class final LK/i$i;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/i;->a(La1/U;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LU0/Y0;La1/f0;Lkotlin/jvm/functions/Function1;LB/m;Ls0/h0;ZIILa1/t;LK/w;ZZLie/o;LY/m;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK/y;

.field final synthetic b:Z

.field final synthetic c:Z

.field final synthetic d:La1/W;

.field final synthetic e:La1/U;

.field final synthetic f:La1/t;

.field final synthetic g:La1/J;

.field final synthetic h:LQ/F;

.field final synthetic i:LGf/O;

.field final synthetic j:LH/b;


# direct methods
.method constructor <init>(LK/y;ZZLa1/W;La1/U;La1/t;La1/J;LQ/F;LGf/O;LH/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/i$i;->a:LK/y;

    .line 2
    .line 3
    iput-boolean p2, p0, LK/i$i;->b:Z

    .line 4
    .line 5
    iput-boolean p3, p0, LK/i$i;->c:Z

    .line 6
    .line 7
    iput-object p4, p0, LK/i$i;->d:La1/W;

    .line 8
    .line 9
    iput-object p5, p0, LK/i$i;->e:La1/U;

    .line 10
    .line 11
    iput-object p6, p0, LK/i$i;->f:La1/t;

    .line 12
    .line 13
    iput-object p7, p0, LK/i$i;->g:La1/J;

    .line 14
    .line 15
    iput-object p8, p0, LK/i$i;->h:LQ/F;

    .line 16
    .line 17
    iput-object p9, p0, LK/i$i;->i:LGf/O;

    .line 18
    .line 19
    iput-object p10, p0, LK/i$i;->j:LH/b;

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq0/n;

    invoke-virtual {p0, p1}, LK/i$i;->invoke(Lq0/n;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lq0/n;)V
    .locals 12

    .line 2
    iget-object v0, p0, LK/i$i;->a:LK/y;

    invoke-virtual {v0}, LK/y;->e()Z

    move-result v0

    invoke-interface {p1}, Lq0/n;->a()Z

    move-result v1

    if-ne v0, v1, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    iget-object v0, p0, LK/i$i;->a:LK/y;

    invoke-interface {p1}, Lq0/n;->a()Z

    move-result v1

    invoke-virtual {v0, v1}, LK/y;->C(Z)V

    .line 4
    iget-object v0, p0, LK/i$i;->a:LK/y;

    invoke-virtual {v0}, LK/y;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, LK/i$i;->b:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, LK/i$i;->c:Z

    if-nez v0, :cond_1

    .line 5
    iget-object v0, p0, LK/i$i;->d:La1/W;

    .line 6
    iget-object v1, p0, LK/i$i;->a:LK/y;

    .line 7
    iget-object v2, p0, LK/i$i;->e:La1/U;

    .line 8
    iget-object v3, p0, LK/i$i;->f:La1/t;

    .line 9
    iget-object v4, p0, LK/i$i;->g:La1/J;

    .line 10
    invoke-static {v0, v1, v2, v3, v4}, LK/i;->k(La1/W;LK/y;La1/U;La1/t;La1/J;)V

    goto :goto_0

    .line 11
    :cond_1
    iget-object v0, p0, LK/i$i;->a:LK/y;

    invoke-static {v0}, LK/i;->i(LK/y;)V

    .line 12
    :goto_0
    invoke-interface {p1}, Lq0/n;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 13
    iget-object v0, p0, LK/i$i;->a:LK/y;

    invoke-virtual {v0}, LK/y;->j()LK/Z;

    move-result-object v5

    if-eqz v5, :cond_2

    iget-object v0, p0, LK/i$i;->i:LGf/O;

    iget-object v2, p0, LK/i$i;->j:LH/b;

    iget-object v3, p0, LK/i$i;->e:La1/U;

    iget-object v4, p0, LK/i$i;->a:LK/y;

    iget-object v6, p0, LK/i$i;->g:La1/J;

    .line 14
    new-instance v1, LK/i$i$a;

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v7}, LK/i$i$a;-><init>(LH/b;La1/U;LK/y;LK/Z;La1/J;LZd/e;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v8, 0x0

    move-object v6, v0

    move-object v9, v1

    invoke-static/range {v6 .. v11}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 15
    :cond_2
    invoke-interface {p1}, Lq0/n;->a()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, LK/i$i;->h:LQ/F;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, LQ/F;->u(LQ/F;Lr0/f;ILjava/lang/Object;)V

    :cond_3
    :goto_1
    return-void
.end method
