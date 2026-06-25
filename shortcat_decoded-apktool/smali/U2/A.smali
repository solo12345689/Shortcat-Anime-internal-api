.class public abstract LU2/A;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LU2/J;


# instance fields
.field private final a:LU2/J;


# direct methods
.method public constructor <init>(LU2/J;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU2/A;->a:LU2/J;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public g(J)LU2/J$a;
    .locals 1

    .line 1
    iget-object v0, p0, LU2/A;->a:LU2/J;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LU2/J;->g(J)LU2/J$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public k()Z
    .locals 1

    .line 1
    iget-object v0, p0, LU2/A;->a:LU2/J;

    .line 2
    .line 3
    invoke-interface {v0}, LU2/J;->k()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public n()J
    .locals 2

    .line 1
    iget-object v0, p0, LU2/A;->a:LU2/J;

    .line 2
    .line 3
    invoke-interface {v0}, LU2/J;->n()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method
