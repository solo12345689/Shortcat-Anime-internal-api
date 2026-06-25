.class public abstract LK/K;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lw/i;

.field private static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    sget-object v0, LK/K$b;->a:LK/K$b;

    .line 2
    .line 3
    invoke-static {v0}, Lw/j;->f(Lkotlin/jvm/functions/Function1;)Lw/S;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v5, 0x6

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    invoke-static/range {v1 .. v6}, Lw/j;->e(Lw/C;Lw/b0;JILjava/lang/Object;)Lw/M;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, LK/K;->a:Lw/i;

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    int-to-float v0, v0

    .line 20
    invoke-static {v0}, Li1/h;->n(F)F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    sput v0, LK/K;->b:F

    .line 25
    .line 26
    return-void
.end method

.method public static final a(Landroidx/compose/ui/e;LK/y;La1/U;La1/J;Ls0/h0;Z)Landroidx/compose/ui/e;
    .locals 0

    .line 1
    if-eqz p5, :cond_0

    .line 2
    .line 3
    new-instance p5, LK/K$a;

    .line 4
    .line 5
    invoke-direct {p5, p4, p1, p2, p3}, LK/K$a;-><init>(Ls0/h0;LK/y;La1/U;La1/J;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    const/4 p2, 0x0

    .line 10
    invoke-static {p0, p2, p5, p1, p2}, Landroidx/compose/ui/c;->c(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lie/o;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    return-object p0
.end method

.method public static final b()F
    .locals 1

    .line 1
    sget v0, LK/K;->b:F

    .line 2
    .line 3
    return v0
.end method
