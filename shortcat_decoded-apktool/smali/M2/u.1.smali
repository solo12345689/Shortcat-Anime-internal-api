.class final LM2/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LM2/C;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM2/u$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/net/Uri;

.field private final b:LM2/n0;

.field private final c:[B

.field private final d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final e:Ljava/util/concurrent/atomic/AtomicReference;

.field private final f:Ljava/util/ArrayList;

.field private g:Lcom/google/common/util/concurrent/p;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Ljava/lang/String;LM2/t;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM2/u;->a:Landroid/net/Uri;

    .line 5
    .line 6
    new-instance p3, Lq2/x$b;

    .line 7
    .line 8
    invoke-direct {p3}, Lq2/x$b;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3, p2}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Lq2/x$b;->P()Lq2/x;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    new-instance p3, LM2/n0;

    .line 20
    .line 21
    new-instance v0, Lq2/a0;

    .line 22
    .line 23
    filled-new-array {p2}, [Lq2/x;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-direct {v0, p2}, Lq2/a0;-><init>([Lq2/x;)V

    .line 28
    .line 29
    .line 30
    filled-new-array {v0}, [Lq2/a0;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-direct {p3, p2}, LM2/n0;-><init>([Lq2/a0;)V

    .line 35
    .line 36
    .line 37
    iput-object p3, p0, LM2/u;->b:LM2/n0;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 44
    .line 45
    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, LM2/u;->c:[B

    .line 50
    .line 51
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, LM2/u;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 57
    .line 58
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, LM2/u;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 64
    .line 65
    new-instance p1, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, LM2/u;->f:Ljava/util/ArrayList;

    .line 71
    .line 72
    return-void
.end method

.method static synthetic b(LM2/u;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    iget-object p0, p0, LM2/u;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic e(LM2/u;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    .line 1
    iget-object p0, p0, LM2/u;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic h(LM2/u;)LM2/n0;
    .locals 0

    .line 1
    iget-object p0, p0, LM2/u;->b:LM2/n0;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic j(LM2/u;)[B
    .locals 0

    .line 1
    iget-object p0, p0, LM2/u;->c:[B

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Landroidx/media3/exoplayer/q0;)Z
    .locals 0

    .line 1
    iget-object p1, p0, LM2/u;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    xor-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    return p1
.end method

.method public c()J
    .locals 2

    .line 1
    iget-object v0, p0, LM2/u;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-wide/high16 v0, -0x8000000000000000L

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    return-wide v0
.end method

.method public d(JLA2/Q;)J
    .locals 0

    .line 1
    return-wide p1
.end method

.method public f()J
    .locals 2

    .line 1
    iget-object v0, p0, LM2/u;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-wide/high16 v0, -0x8000000000000000L

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    return-wide v0
.end method

.method public g(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public i(J)J
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, LM2/u;->f:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, LM2/u;->f:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, LM2/u$a;

    .line 17
    .line 18
    invoke-virtual {v1}, LM2/u$a;->a()V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-wide p1
.end method

.method public k()J
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide v0
.end method

.method public l(LM2/C$a;J)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, LM2/C$a;->b(LM2/C;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, LM2/t$a;

    .line 5
    .line 6
    iget-object p2, p0, LM2/u;->a:Landroid/net/Uri;

    .line 7
    .line 8
    invoke-direct {p1, p2}, LM2/t$a;-><init>(Landroid/net/Uri;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    throw p1
.end method

.method public m()V
    .locals 2

    .line 1
    iget-object v0, p0, LM2/u;->g:Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public o()V
    .locals 0

    .line 1
    return-void
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-object v0, p0, LM2/u;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    return v0
.end method

.method public r([LP2/A;[Z[LM2/c0;[ZJ)J
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    if-ge v0, v1, :cond_3

    .line 4
    .line 5
    aget-object v1, p3, v0

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    aget-object v2, p1, v0

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    aget-boolean v2, p2, v0

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    :cond_0
    iget-object v2, p0, LM2/u;->f:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    aput-object v1, p3, v0

    .line 24
    .line 25
    :cond_1
    aget-object v1, p3, v0

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    aget-object v1, p1, v0

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    new-instance v1, LM2/u$a;

    .line 34
    .line 35
    invoke-direct {v1, p0}, LM2/u$a;-><init>(LM2/u;)V

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, LM2/u;->f:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    aput-object v1, p3, v0

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    aput-boolean v1, p4, v0

    .line 47
    .line 48
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    return-wide p5
.end method

.method public s()LM2/n0;
    .locals 1

    .line 1
    iget-object v0, p0, LM2/u;->b:LM2/n0;

    .line 2
    .line 3
    return-object v0
.end method

.method public u(JZ)V
    .locals 0

    .line 1
    return-void
.end method
