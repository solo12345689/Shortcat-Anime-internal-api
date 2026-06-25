.class public final Lx/x;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/h;
.implements Lq0/k;


# instance fields
.field private final a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final E1()LA0/b;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/compose/ui/platform/w0;->j()LY/b1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0}, LK0/i;->a(LK0/h;LY/D;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, LA0/b;

    .line 10
    .line 11
    return-object v0
.end method


# virtual methods
.method public P0(Landroidx/compose/ui/focus/i;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lx/x;->E1()LA0/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LA0/b;->a()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sget-object v1, LA0/a;->b:LA0/a$a;

    .line 10
    .line 11
    invoke-virtual {v1}, LA0/a$a;->b()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v0, v1}, LA0/a;->f(II)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    xor-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    invoke-interface {p1, v0}, Landroidx/compose/ui/focus/i;->g(Z)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public getShouldAutoInvalidate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx/x;->a:Z

    .line 2
    .line 3
    return v0
.end method
