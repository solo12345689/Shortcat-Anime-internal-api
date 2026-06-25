.class final Lc3/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LU2/p;


# instance fields
.field private final a:Lt2/I;

.field private b:LU2/r;

.field private c:I

.field private d:I

.field private e:I

.field private f:J

.field private g:Lj3/a;

.field private h:LU2/q;

.field private i:Lc3/d;

.field private j:Lo3/n;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lt2/I;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, v1}, Lt2/I;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lc3/b;->a:Lt2/I;

    .line 11
    .line 12
    const-wide/16 v0, -0x1

    .line 13
    .line 14
    iput-wide v0, p0, Lc3/b;->f:J

    .line 15
    .line 16
    return-void
.end method

.method private d(LU2/q;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc3/b;->a:Lt2/I;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Lt2/I;->X(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lc3/b;->a:Lt2/I;

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
    iget-object v0, p0, Lc3/b;->a:Lt2/I;

    .line 18
    .line 19
    invoke-virtual {v0}, Lt2/I;->U()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sub-int/2addr v0, v1

    .line 24
    invoke-interface {p1, v0}, LU2/q;->k(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private e()V
    .locals 4

    .line 1
    iget-object v0, p0, Lc3/b;->b:LU2/r;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LU2/r;

    .line 8
    .line 9
    invoke-interface {v0}, LU2/r;->p()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lc3/b;->b:LU2/r;

    .line 13
    .line 14
    new-instance v1, LU2/J$b;

    .line 15
    .line 16
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2, v3}, LU2/J$b;-><init>(J)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, LU2/r;->t(LU2/J;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x6

    .line 28
    iput v0, p0, Lc3/b;->c:I

    .line 29
    .line 30
    return-void
.end method

.method private static g(Ljava/lang/String;J)Lj3/a;
    .locals 2

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-static {p0}, Lc3/f;->a(Ljava/lang/String;)Lc3/c;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-nez p0, :cond_1

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_1
    invoke-virtual {p0, p1, p2}, Lc3/c;->a(J)Lj3/a;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method private j(Lj3/a;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lc3/b;->b:LU2/r;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LU2/r;

    .line 8
    .line 9
    const/16 v1, 0x400

    .line 10
    .line 11
    const/4 v2, 0x4

    .line 12
    invoke-interface {v0, v1, v2}, LU2/r;->e(II)LU2/O;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Lq2/x$b;

    .line 17
    .line 18
    invoke-direct {v1}, Lq2/x$b;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v2, "image/jpeg"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lq2/x$b;->W(Ljava/lang/String;)Lq2/x$b;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-instance v2, Lq2/J;

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    new-array v3, v3, [Lq2/J$a;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    aput-object p1, v3, v4

    .line 34
    .line 35
    invoke-direct {v2, v3}, Lq2/J;-><init>([Lq2/J$a;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Lq2/x$b;->r0(Lq2/J;)Lq2/x$b;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Lq2/x$b;->P()Lq2/x;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {v0, p1}, LU2/O;->c(Lq2/x;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method private k(LU2/q;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lc3/b;->a:Lt2/I;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Lt2/I;->X(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lc3/b;->a:Lt2/I;

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
    iget-object p1, p0, Lc3/b;->a:Lt2/I;

    .line 18
    .line 19
    invoke-virtual {p1}, Lt2/I;->U()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1
.end method

.method private m(LU2/q;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lc3/b;->a:Lt2/I;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Lt2/I;->X(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lc3/b;->a:Lt2/I;

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
    invoke-interface {p1, v0, v2, v1}, LU2/q;->readFully([BII)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lc3/b;->a:Lt2/I;

    .line 18
    .line 19
    invoke-virtual {p1}, Lt2/I;->U()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iput p1, p0, Lc3/b;->d:I

    .line 24
    .line 25
    const v0, 0xffda

    .line 26
    .line 27
    .line 28
    if-ne p1, v0, :cond_1

    .line 29
    .line 30
    iget-wide v0, p0, Lc3/b;->f:J

    .line 31
    .line 32
    const-wide/16 v2, -0x1

    .line 33
    .line 34
    cmp-long p1, v0, v2

    .line 35
    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    const/4 p1, 0x4

    .line 39
    iput p1, p0, Lc3/b;->c:I

    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    invoke-direct {p0}, Lc3/b;->e()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    const v0, 0xffd0

    .line 47
    .line 48
    .line 49
    if-lt p1, v0, :cond_2

    .line 50
    .line 51
    const v0, 0xffd9

    .line 52
    .line 53
    .line 54
    if-le p1, v0, :cond_3

    .line 55
    .line 56
    :cond_2
    const v0, 0xff01

    .line 57
    .line 58
    .line 59
    if-eq p1, v0, :cond_3

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    iput p1, p0, Lc3/b;->c:I

    .line 63
    .line 64
    :cond_3
    return-void
.end method

.method private n(LU2/q;)V
    .locals 5

    .line 1
    iget v0, p0, Lc3/b;->d:I

    .line 2
    .line 3
    const v1, 0xffe1

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    new-instance v0, Lt2/I;

    .line 10
    .line 11
    iget v1, p0, Lc3/b;->e:I

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lt2/I;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lt2/I;->f()[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget v3, p0, Lc3/b;->e:I

    .line 21
    .line 22
    invoke-interface {p1, v1, v2, v3}, LU2/q;->readFully([BII)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lc3/b;->g:Lj3/a;

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    const-string v1, "http://ns.adobe.com/xap/1.0/"

    .line 30
    .line 31
    invoke-virtual {v0}, Lt2/I;->G()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, Lt2/I;->G()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-interface {p1}, LU2/q;->getLength()J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    invoke-static {v0, v3, v4}, Lc3/b;->g(Ljava/lang/String;J)Lj3/a;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lc3/b;->g:Lj3/a;

    .line 56
    .line 57
    if-eqz p1, :cond_1

    .line 58
    .line 59
    iget-wide v0, p1, Lj3/a;->d:J

    .line 60
    .line 61
    iput-wide v0, p0, Lc3/b;->f:J

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    iget v0, p0, Lc3/b;->e:I

    .line 65
    .line 66
    invoke-interface {p1, v0}, LU2/q;->m(I)V

    .line 67
    .line 68
    .line 69
    :cond_1
    :goto_0
    iput v2, p0, Lc3/b;->c:I

    .line 70
    .line 71
    return-void
.end method

.method private o(LU2/q;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc3/b;->a:Lt2/I;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Lt2/I;->X(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lc3/b;->a:Lt2/I;

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
    invoke-interface {p1, v0, v2, v1}, LU2/q;->readFully([BII)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lc3/b;->a:Lt2/I;

    .line 18
    .line 19
    invoke-virtual {p1}, Lt2/I;->U()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    sub-int/2addr p1, v1

    .line 24
    iput p1, p0, Lc3/b;->e:I

    .line 25
    .line 26
    iput v1, p0, Lc3/b;->c:I

    .line 27
    .line 28
    return-void
.end method

.method private p(LU2/q;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lc3/b;->a:Lt2/I;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt2/I;->f()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-interface {p1, v0, v1, v2, v2}, LU2/q;->e([BIIZ)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-direct {p0}, Lc3/b;->e()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-interface {p1}, LU2/q;->g()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lc3/b;->j:Lo3/n;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    new-instance v0, Lo3/n;

    .line 27
    .line 28
    sget-object v1, Lr3/r$a;->a:Lr3/r$a;

    .line 29
    .line 30
    const/16 v2, 0x8

    .line 31
    .line 32
    invoke-direct {v0, v1, v2}, Lo3/n;-><init>(Lr3/r$a;I)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lc3/b;->j:Lo3/n;

    .line 36
    .line 37
    :cond_1
    new-instance v0, Lc3/d;

    .line 38
    .line 39
    iget-wide v1, p0, Lc3/b;->f:J

    .line 40
    .line 41
    invoke-direct {v0, p1, v1, v2}, Lc3/d;-><init>(LU2/q;J)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lc3/b;->i:Lc3/d;

    .line 45
    .line 46
    iget-object p1, p0, Lc3/b;->j:Lo3/n;

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Lo3/n;->f(LU2/q;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    iget-object p1, p0, Lc3/b;->j:Lo3/n;

    .line 55
    .line 56
    new-instance v0, Lc3/e;

    .line 57
    .line 58
    iget-wide v1, p0, Lc3/b;->f:J

    .line 59
    .line 60
    iget-object v3, p0, Lc3/b;->b:LU2/r;

    .line 61
    .line 62
    invoke-static {v3}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, LU2/r;

    .line 67
    .line 68
    invoke-direct {v0, v1, v2, v3}, Lc3/e;-><init>(JLU2/r;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lo3/n;->c(LU2/r;)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p0}, Lc3/b;->q()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    invoke-direct {p0}, Lc3/b;->e()V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method private q()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc3/b;->g:Lj3/a;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lj3/a;

    .line 8
    .line 9
    invoke-direct {p0, v0}, Lc3/b;->j(Lj3/a;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x5

    .line 13
    iput v0, p0, Lc3/b;->c:I

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc3/b;->j:Lo3/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lo3/n;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public b(JJ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput p1, p0, Lc3/b;->c:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lc3/b;->j:Lo3/n;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget v0, p0, Lc3/b;->c:I

    .line 15
    .line 16
    const/4 v1, 0x5

    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lc3/b;->j:Lo3/n;

    .line 20
    .line 21
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lo3/n;

    .line 26
    .line 27
    invoke-virtual {v0, p1, p2, p3, p4}, Lo3/n;->b(JJ)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public c(LU2/r;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc3/b;->b:LU2/r;

    .line 2
    .line 3
    return-void
.end method

.method public f(LU2/q;)Z
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lc3/b;->k(LU2/q;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0xffd8

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    return v2

    .line 12
    :cond_0
    invoke-direct {p0, p1}, Lc3/b;->k(LU2/q;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, Lc3/b;->d:I

    .line 17
    .line 18
    const v1, 0xffe0

    .line 19
    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    invoke-direct {p0, p1}, Lc3/b;->d(LU2/q;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, p1}, Lc3/b;->k(LU2/q;)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iput p1, p0, Lc3/b;->d:I

    .line 31
    .line 32
    :cond_1
    iget p1, p0, Lc3/b;->d:I

    .line 33
    .line 34
    const v0, 0xffe1

    .line 35
    .line 36
    .line 37
    if-ne p1, v0, :cond_2

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_2
    return v2
.end method

.method public h(LU2/q;LU2/I;)I
    .locals 7

    .line 1
    iget v0, p0, Lc3/b;->c:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_9

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-eq v0, v2, :cond_8

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    if-eq v0, v3, :cond_7

    .line 11
    .line 12
    const/4 v3, 0x4

    .line 13
    if-eq v0, v3, :cond_5

    .line 14
    .line 15
    const/4 v1, 0x5

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x6

    .line 19
    if-ne v0, p1, :cond_0

    .line 20
    .line 21
    const/4 p1, -0x1

    .line 22
    return p1

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    iget-object v0, p0, Lc3/b;->i:Lc3/d;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Lc3/b;->h:LU2/q;

    .line 34
    .line 35
    if-eq p1, v0, :cond_3

    .line 36
    .line 37
    :cond_2
    iput-object p1, p0, Lc3/b;->h:LU2/q;

    .line 38
    .line 39
    new-instance v0, Lc3/d;

    .line 40
    .line 41
    iget-wide v3, p0, Lc3/b;->f:J

    .line 42
    .line 43
    invoke-direct {v0, p1, v3, v4}, Lc3/d;-><init>(LU2/q;J)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lc3/b;->i:Lc3/d;

    .line 47
    .line 48
    :cond_3
    iget-object p1, p0, Lc3/b;->j:Lo3/n;

    .line 49
    .line 50
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Lo3/n;

    .line 55
    .line 56
    iget-object v0, p0, Lc3/b;->i:Lc3/d;

    .line 57
    .line 58
    invoke-virtual {p1, v0, p2}, Lo3/n;->h(LU2/q;LU2/I;)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-ne p1, v2, :cond_4

    .line 63
    .line 64
    iget-wide v0, p2, LU2/I;->a:J

    .line 65
    .line 66
    iget-wide v2, p0, Lc3/b;->f:J

    .line 67
    .line 68
    add-long/2addr v0, v2

    .line 69
    iput-wide v0, p2, LU2/I;->a:J

    .line 70
    .line 71
    :cond_4
    return p1

    .line 72
    :cond_5
    invoke-interface {p1}, LU2/q;->getPosition()J

    .line 73
    .line 74
    .line 75
    move-result-wide v3

    .line 76
    iget-wide v5, p0, Lc3/b;->f:J

    .line 77
    .line 78
    cmp-long v0, v3, v5

    .line 79
    .line 80
    if-eqz v0, :cond_6

    .line 81
    .line 82
    iput-wide v5, p2, LU2/I;->a:J

    .line 83
    .line 84
    return v2

    .line 85
    :cond_6
    invoke-direct {p0, p1}, Lc3/b;->p(LU2/q;)V

    .line 86
    .line 87
    .line 88
    return v1

    .line 89
    :cond_7
    invoke-direct {p0, p1}, Lc3/b;->n(LU2/q;)V

    .line 90
    .line 91
    .line 92
    return v1

    .line 93
    :cond_8
    invoke-direct {p0, p1}, Lc3/b;->o(LU2/q;)V

    .line 94
    .line 95
    .line 96
    return v1

    .line 97
    :cond_9
    invoke-direct {p0, p1}, Lc3/b;->m(LU2/q;)V

    .line 98
    .line 99
    .line 100
    return v1
.end method
