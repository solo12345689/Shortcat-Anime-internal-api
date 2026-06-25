.class final LK0/T$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LI0/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK0/T;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private a:Z

.field private b:J

.field private c:J

.field final synthetic d:LK0/T;


# direct methods
.method public constructor <init>(LK0/T;)V
    .locals 2

    .line 1
    iput-object p1, p0, LK0/T$c;->d:LK0/T;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object p1, Li1/n;->b:Li1/n$a;

    .line 7
    .line 8
    invoke-virtual {p1}, Li1/n$a;->a()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iput-wide v0, p0, LK0/T$c;->b:J

    .line 13
    .line 14
    sget-object p1, Li1/r;->b:Li1/r$a;

    .line 15
    .line 16
    invoke-virtual {p1}, Li1/r$a;->a()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iput-wide v0, p0, LK0/T$c;->c:J

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public A0(Landroidx/compose/ui/layout/y;F)V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/T$c;->d:LK0/T;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LK0/T;->X1(Landroidx/compose/ui/layout/y;F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, LK0/T$c;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LK0/T$c;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public getDensity()F
    .locals 1

    .line 1
    iget-object v0, p0, LK0/T$c;->d:LK0/T;

    .line 2
    .line 3
    invoke-interface {v0}, Li1/d;->getDensity()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final j()J
    .locals 2

    .line 1
    iget-wide v0, p0, LK0/T$c;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public j1()F
    .locals 1

    .line 1
    iget-object v0, p0, LK0/T$c;->d:LK0/T;

    .line 2
    .line 3
    invoke-interface {v0}, Li1/l;->j1()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final p(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LK0/T$c;->a:Z

    .line 2
    .line 3
    return-void
.end method

.method public final q(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LK0/T$c;->b:J

    .line 2
    .line 3
    return-void
.end method

.method public x()LI0/p;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LK0/T$c;->a:Z

    .line 3
    .line 4
    iget-object v0, p0, LK0/T$c;->d:LK0/T;

    .line 5
    .line 6
    invoke-virtual {v0}, LK0/T;->x()LI0/p;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-wide v1, p0, LK0/T$c;->b:J

    .line 11
    .line 12
    sget-object v3, Li1/n;->b:Li1/n$a;

    .line 13
    .line 14
    invoke-virtual {v3}, Li1/n$a;->a()J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    invoke-static {v1, v2, v3, v4}, Li1/n;->j(JJ)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-static {v0}, LI0/q;->g(LI0/p;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    invoke-static {v1, v2}, Li1/o;->d(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    iput-wide v1, p0, LK0/T$c;->b:J

    .line 33
    .line 34
    invoke-interface {v0}, LI0/p;->a()J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    iput-wide v1, p0, LK0/T$c;->c:J

    .line 39
    .line 40
    :cond_0
    iget-object v1, p0, LK0/T$c;->d:LK0/T;

    .line 41
    .line 42
    invoke-virtual {v1}, LK0/T;->L1()LK0/J;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1}, LK0/J;->d0()LK0/O;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, LK0/O;->H()V

    .line 51
    .line 52
    .line 53
    return-object v0
.end method

.method public final z(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LK0/T$c;->c:J

    .line 2
    .line 3
    return-void
.end method
