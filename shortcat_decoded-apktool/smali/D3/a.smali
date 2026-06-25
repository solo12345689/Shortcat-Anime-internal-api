.class public final LD3/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LU2/p;


# instance fields
.field private final a:Lt2/I;

.field private final b:LU2/L;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lt2/I;

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, v1}, Lt2/I;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LD3/a;->a:Lt2/I;

    .line 11
    .line 12
    new-instance v0, LU2/L;

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    const-string v2, "image/webp"

    .line 16
    .line 17
    invoke-direct {v0, v1, v1, v2}, LU2/L;-><init>(IILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, LD3/a;->b:LU2/L;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    return-void
.end method

.method public b(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, LD3/a;->b:LU2/L;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, LU2/L;->b(JJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(LU2/r;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD3/a;->b:LU2/L;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LU2/L;->c(LU2/r;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f(LU2/q;)Z
    .locals 7

    .line 1
    iget-object v0, p0, LD3/a;->a:Lt2/I;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-virtual {v0, v1}, Lt2/I;->X(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LD3/a;->a:Lt2/I;

    .line 8
    .line 9
    invoke-virtual {v0}, Lt2/I;->f()[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-interface {p1, v0, v2, v1}, LU2/q;->o([BII)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, LD3/a;->a:Lt2/I;

    .line 18
    .line 19
    invoke-virtual {v0}, Lt2/I;->O()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    const-wide/32 v5, 0x52494646

    .line 24
    .line 25
    .line 26
    cmp-long v0, v3, v5

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    return v2

    .line 31
    :cond_0
    invoke-interface {p1, v1}, LU2/q;->k(I)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, LD3/a;->a:Lt2/I;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lt2/I;->X(I)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, LD3/a;->a:Lt2/I;

    .line 40
    .line 41
    invoke-virtual {v0}, Lt2/I;->f()[B

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {p1, v0, v2, v1}, LU2/q;->o([BII)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, LD3/a;->a:Lt2/I;

    .line 49
    .line 50
    invoke-virtual {p1}, Lt2/I;->O()J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    const-wide/32 v3, 0x57454250

    .line 55
    .line 56
    .line 57
    cmp-long p1, v0, v3

    .line 58
    .line 59
    if-nez p1, :cond_1

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    return p1

    .line 63
    :cond_1
    return v2
.end method

.method public h(LU2/q;LU2/I;)I
    .locals 1

    .line 1
    iget-object v0, p0, LD3/a;->b:LU2/L;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LU2/L;->h(LU2/q;LU2/I;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
