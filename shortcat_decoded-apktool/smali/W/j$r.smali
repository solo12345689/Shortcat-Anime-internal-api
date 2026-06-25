.class final LW/j$r;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW/j;->u(Landroidx/compose/ui/e;Ls0/t0;Ls0/E1;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls0/E1;

.field final synthetic b:Ls0/t0;


# direct methods
.method constructor <init>(Ls0/E1;Ls0/t0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LW/j$r;->a:Ls0/E1;

    .line 2
    .line 3
    iput-object p2, p0, LW/j$r;->b:Ls0/t0;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lp0/f;

    invoke-virtual {p0, p1}, LW/j$r;->invoke(Lp0/f;)Lp0/j;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lp0/f;)Lp0/j;
    .locals 4

    .line 2
    iget-object v0, p0, LW/j$r;->a:Ls0/E1;

    invoke-virtual {p1}, Lp0/f;->f()J

    move-result-wide v1

    invoke-virtual {p1}, Lp0/f;->getLayoutDirection()Li1/t;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3, p1}, Ls0/E1;->createOutline-Pq9zytI(JLi1/t;Li1/d;)Ls0/i1;

    move-result-object v0

    .line 3
    new-instance v1, LW/j$r$a;

    iget-object v2, p0, LW/j$r;->b:Ls0/t0;

    invoke-direct {v1, v0, v2}, LW/j$r$a;-><init>(Ls0/i1;Ls0/t0;)V

    invoke-virtual {p1, v1}, Lp0/f;->j(Lkotlin/jvm/functions/Function1;)Lp0/j;

    move-result-object p1

    return-object p1
.end method
