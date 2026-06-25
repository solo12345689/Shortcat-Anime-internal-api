.class final LK0/X$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK0/X;-><init>(LK0/O;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK0/X;


# direct methods
.method constructor <init>(LK0/X;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/X$d;->a:LK0/X;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/X$d;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 7

    .line 2
    iget-object v0, p0, LK0/X$d;->a:LK0/X;

    invoke-virtual {v0}, LK0/X;->R1()LK0/e0;

    move-result-object v0

    invoke-virtual {v0}, LK0/e0;->P2()LK0/e0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LK0/T;->O1()Landroidx/compose/ui/layout/s$a;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v1, v0

    goto :goto_2

    :cond_1
    :goto_1
    iget-object v0, p0, LK0/X$d;->a:LK0/X;

    invoke-virtual {v0}, LK0/X;->L1()LK0/J;

    move-result-object v0

    invoke-static {v0}, LK0/N;->b(LK0/J;)LK0/p0;

    move-result-object v0

    invoke-interface {v0}, LK0/p0;->getPlacementScope()Landroidx/compose/ui/layout/s$a;

    move-result-object v0

    goto :goto_0

    .line 3
    :goto_2
    iget-object v0, p0, LK0/X$d;->a:LK0/X;

    .line 4
    invoke-static {v0}, LK0/X;->z1(LK0/X;)Lkotlin/jvm/functions/Function1;

    move-result-object v6

    .line 5
    invoke-static {v0}, LK0/X;->y1(LK0/X;)Lv0/c;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 6
    invoke-virtual {v0}, LK0/X;->R1()LK0/e0;

    move-result-object v2

    .line 7
    invoke-static {v0}, LK0/X;->E1(LK0/X;)J

    move-result-wide v3

    .line 8
    invoke-static {v0}, LK0/X;->F1(LK0/X;)F

    move-result v6

    .line 9
    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/layout/s$a;->x0(Landroidx/compose/ui/layout/s;JLv0/c;F)V

    return-void

    :cond_2
    if-nez v6, :cond_3

    .line 10
    invoke-virtual {v0}, LK0/X;->R1()LK0/e0;

    move-result-object v2

    invoke-static {v0}, LK0/X;->E1(LK0/X;)J

    move-result-wide v3

    invoke-static {v0}, LK0/X;->F1(LK0/X;)F

    move-result v0

    invoke-virtual {v1, v2, v3, v4, v0}, Landroidx/compose/ui/layout/s$a;->S(Landroidx/compose/ui/layout/s;JF)V

    return-void

    .line 11
    :cond_3
    invoke-virtual {v0}, LK0/X;->R1()LK0/e0;

    move-result-object v2

    .line 12
    invoke-static {v0}, LK0/X;->E1(LK0/X;)J

    move-result-wide v3

    .line 13
    invoke-static {v0}, LK0/X;->F1(LK0/X;)F

    move-result v5

    .line 14
    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/layout/s$a;->w0(Landroidx/compose/ui/layout/s;JFLkotlin/jvm/functions/Function1;)V

    return-void
.end method
