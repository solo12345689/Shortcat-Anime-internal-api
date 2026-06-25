.class public abstract Landroidx/compose/material/ripple/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lx/H;


# instance fields
.field private final a:Z

.field private final b:Landroidx/compose/material/ripple/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(ZLY/h2;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Landroidx/compose/material/ripple/d;->a:Z

    .line 5
    .line 6
    new-instance v0, Landroidx/compose/material/ripple/e;

    .line 7
    .line 8
    new-instance v1, Landroidx/compose/material/ripple/d$a;

    .line 9
    .line 10
    invoke-direct {v1, p2}, Landroidx/compose/material/ripple/d$a;-><init>(LY/h2;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p1, v1}, Landroidx/compose/material/ripple/e;-><init>(ZLie/a;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/compose/material/ripple/d;->b:Landroidx/compose/material/ripple/e;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public abstract b(LB/o$b;LGf/O;)V
.end method

.method public final f(Lu0/f;FJ)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/material/ripple/d;->b:Landroidx/compose/material/ripple/e;

    .line 2
    .line 3
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-boolean p2, p0, Landroidx/compose/material/ripple/d;->a:Z

    .line 10
    .line 11
    invoke-interface {p1}, Lu0/f;->f()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-static {p1, p2, v1, v2}, LT/f;->a(Li1/d;ZJ)F

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-interface {p1, p2}, Li1/d;->l1(F)F

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    :goto_0
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/compose/material/ripple/e;->b(Lu0/f;FJ)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public abstract g(LB/o$b;)V
.end method

.method public final h(LB/j;LGf/O;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/ripple/d;->b:Landroidx/compose/material/ripple/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroidx/compose/material/ripple/e;->c(LB/j;LGf/O;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
