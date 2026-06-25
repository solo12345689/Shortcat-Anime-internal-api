.class Lc3/e$a;
.super LU2/A;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc3/e;->t(LU2/J;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:LU2/J;

.field final synthetic c:Lc3/e;


# direct methods
.method constructor <init>(Lc3/e;LU2/J;LU2/J;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc3/e$a;->c:Lc3/e;

    .line 2
    .line 3
    iput-object p3, p0, Lc3/e$a;->b:LU2/J;

    .line 4
    .line 5
    invoke-direct {p0, p2}, LU2/A;-><init>(LU2/J;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public g(J)LU2/J$a;
    .locals 8

    .line 1
    iget-object v0, p0, Lc3/e$a;->b:LU2/J;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LU2/J;->g(J)LU2/J$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance p2, LU2/J$a;

    .line 8
    .line 9
    new-instance v0, LU2/K;

    .line 10
    .line 11
    iget-object v1, p1, LU2/J$a;->a:LU2/K;

    .line 12
    .line 13
    iget-wide v2, v1, LU2/K;->a:J

    .line 14
    .line 15
    iget-wide v4, v1, LU2/K;->b:J

    .line 16
    .line 17
    iget-object v1, p0, Lc3/e$a;->c:Lc3/e;

    .line 18
    .line 19
    invoke-static {v1}, Lc3/e;->a(Lc3/e;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v6

    .line 23
    add-long/2addr v4, v6

    .line 24
    invoke-direct {v0, v2, v3, v4, v5}, LU2/K;-><init>(JJ)V

    .line 25
    .line 26
    .line 27
    new-instance v1, LU2/K;

    .line 28
    .line 29
    iget-object p1, p1, LU2/J$a;->b:LU2/K;

    .line 30
    .line 31
    iget-wide v2, p1, LU2/K;->a:J

    .line 32
    .line 33
    iget-wide v4, p1, LU2/K;->b:J

    .line 34
    .line 35
    iget-object p1, p0, Lc3/e$a;->c:Lc3/e;

    .line 36
    .line 37
    invoke-static {p1}, Lc3/e;->a(Lc3/e;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v6

    .line 41
    add-long/2addr v4, v6

    .line 42
    invoke-direct {v1, v2, v3, v4, v5}, LU2/K;-><init>(JJ)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p2, v0, v1}, LU2/J$a;-><init>(LU2/K;LU2/K;)V

    .line 46
    .line 47
    .line 48
    return-object p2
.end method
