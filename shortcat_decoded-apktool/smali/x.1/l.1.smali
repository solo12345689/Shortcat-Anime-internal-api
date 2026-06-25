.class public abstract Lx/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:F

.field private static final b:Landroidx/compose/ui/e;

.field private static final c:Landroidx/compose/ui/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x1e

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0}, Li1/h;->n(F)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput v0, Lx/l;->a:F

    .line 9
    .line 10
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 11
    .line 12
    new-instance v1, Lx/l$a;

    .line 13
    .line 14
    invoke-direct {v1}, Lx/l$a;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lp0/g;->a(Landroidx/compose/ui/e;Ls0/E1;)Landroidx/compose/ui/e;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sput-object v1, Lx/l;->b:Landroidx/compose/ui/e;

    .line 22
    .line 23
    new-instance v1, Lx/l$b;

    .line 24
    .line 25
    invoke-direct {v1}, Lx/l$b;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Lp0/g;->a(Landroidx/compose/ui/e;Ls0/E1;)Landroidx/compose/ui/e;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lx/l;->c:Landroidx/compose/ui/e;

    .line 33
    .line 34
    return-void
.end method

.method public static final a(Landroidx/compose/ui/e;Lz/q;)Landroidx/compose/ui/e;
    .locals 1

    .line 1
    sget-object v0, Lz/q;->a:Lz/q;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lx/l;->c:Landroidx/compose/ui/e;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object p1, Lx/l;->b:Landroidx/compose/ui/e;

    .line 9
    .line 10
    :goto_0
    invoke-interface {p0, p1}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static final b()F
    .locals 1

    .line 1
    sget v0, Lx/l;->a:F

    .line 2
    .line 3
    return v0
.end method
