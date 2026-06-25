.class public final Lc3/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LU2/r;


# instance fields
.field private final a:J

.field private final b:LU2/r;


# direct methods
.method public constructor <init>(JLU2/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lc3/e;->a:J

    .line 5
    .line 6
    iput-object p3, p0, Lc3/e;->b:LU2/r;

    .line 7
    .line 8
    return-void
.end method

.method static synthetic a(Lc3/e;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc3/e;->a:J

    .line 2
    .line 3
    return-wide v0
.end method


# virtual methods
.method public e(II)LU2/O;
    .locals 1

    .line 1
    iget-object v0, p0, Lc3/e;->b:LU2/r;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LU2/r;->e(II)LU2/O;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public p()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc3/e;->b:LU2/r;

    .line 2
    .line 3
    invoke-interface {v0}, LU2/r;->p()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public t(LU2/J;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc3/e;->b:LU2/r;

    .line 2
    .line 3
    new-instance v1, Lc3/e$a;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p1}, Lc3/e$a;-><init>(Lc3/e;LU2/J;LU2/J;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, LU2/r;->t(LU2/J;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
