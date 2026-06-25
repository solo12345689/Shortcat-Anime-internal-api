.class final LK/i$h;
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

.field final synthetic b:La1/U;

.field final synthetic c:La1/J;


# direct methods
.method constructor <init>(LK/y;La1/U;La1/J;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/i$h;->a:LK/y;

    .line 2
    .line 3
    iput-object p2, p0, LK/i$h;->b:La1/U;

    .line 4
    .line 5
    iput-object p3, p0, LK/i$h;->c:La1/J;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lu0/f;

    invoke-virtual {p0, p1}, LK/i$h;->invoke(Lu0/f;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lu0/f;)V
    .locals 13

    .line 2
    iget-object v0, p0, LK/i$h;->a:LK/y;

    invoke-virtual {v0}, LK/y;->j()LK/Z;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v3, p0, LK/i$h;->b:La1/U;

    iget-object v1, p0, LK/i$h;->a:LK/y;

    iget-object v8, p0, LK/i$h;->c:La1/J;

    .line 3
    invoke-interface {p1}, Lu0/f;->n1()Lu0/d;

    move-result-object p1

    invoke-interface {p1}, Lu0/d;->b()Ls0/j0;

    move-result-object v2

    move-object p1, v1

    .line 4
    sget-object v1, LK/L;->a:LK/L$a;

    .line 5
    invoke-virtual {p1}, LK/y;->q()J

    move-result-wide v4

    .line 6
    invoke-virtual {p1}, LK/y;->c()J

    move-result-wide v6

    .line 7
    invoke-virtual {v0}, LK/Z;->f()LU0/T0;

    move-result-object v9

    .line 8
    invoke-virtual {p1}, LK/y;->f()Ls0/k1;

    move-result-object v10

    .line 9
    invoke-virtual {p1}, LK/y;->p()J

    move-result-wide v11

    .line 10
    invoke-virtual/range {v1 .. v12}, LK/L$a;->b(Ls0/j0;La1/U;JJLa1/J;LU0/T0;Ls0/k1;J)V

    :cond_0
    return-void
.end method
