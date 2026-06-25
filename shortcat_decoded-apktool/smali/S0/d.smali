.class public final LS0/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lt/F;

.field private b:J

.field private c:J

.field private d:J

.field private e:J

.field private f:[F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lt/p;->c()Lt/F;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LS0/d;->a:Lt/F;

    .line 9
    .line 10
    const-wide/16 v0, -0x1

    .line 11
    .line 12
    iput-wide v0, p0, LS0/d;->b:J

    .line 13
    .line 14
    sget-object v0, Li1/n;->b:Li1/n$a;

    .line 15
    .line 16
    invoke-virtual {v0}, Li1/n$a;->b()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    iput-wide v1, p0, LS0/d;->c:J

    .line 21
    .line 22
    invoke-virtual {v0}, Li1/n$a;->b()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    iput-wide v0, p0, LS0/d;->d:J

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(J)V
    .locals 12

    .line 1
    iget-object p1, p0, LS0/d;->a:Lt/F;

    .line 2
    .line 3
    iget-object p2, p1, Lt/o;->c:[Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p1, p1, Lt/o;->a:[J

    .line 6
    .line 7
    array-length v0, p1

    .line 8
    add-int/lit8 v0, v0, -0x2

    .line 9
    .line 10
    if-ltz v0, :cond_3

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    move v2, v1

    .line 14
    :goto_0
    aget-wide v3, p1, v2

    .line 15
    .line 16
    not-long v5, v3

    .line 17
    const/4 v7, 0x7

    .line 18
    shl-long/2addr v5, v7

    .line 19
    and-long/2addr v5, v3

    .line 20
    const-wide v7, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    and-long/2addr v5, v7

    .line 26
    cmp-long v5, v5, v7

    .line 27
    .line 28
    if-eqz v5, :cond_2

    .line 29
    .line 30
    sub-int v5, v2, v0

    .line 31
    .line 32
    not-int v5, v5

    .line 33
    ushr-int/lit8 v5, v5, 0x1f

    .line 34
    .line 35
    const/16 v6, 0x8

    .line 36
    .line 37
    rsub-int/lit8 v5, v5, 0x8

    .line 38
    .line 39
    move v7, v1

    .line 40
    :goto_1
    if-ge v7, v5, :cond_1

    .line 41
    .line 42
    const-wide/16 v8, 0xff

    .line 43
    .line 44
    and-long/2addr v8, v3

    .line 45
    const-wide/16 v10, 0x80

    .line 46
    .line 47
    cmp-long v8, v8, v10

    .line 48
    .line 49
    if-gez v8, :cond_0

    .line 50
    .line 51
    shl-int/lit8 v8, v2, 0x3

    .line 52
    .line 53
    add-int/2addr v8, v7

    .line 54
    aget-object v8, p2, v8

    .line 55
    .line 56
    invoke-static {v8}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    shr-long/2addr v3, v6

    .line 60
    add-int/lit8 v7, v7, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    if-ne v5, v6, :cond_3

    .line 64
    .line 65
    :cond_2
    if-eq v2, v0, :cond_3

    .line 66
    .line 67
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    return-void
.end method

.method public final c(IJJJ)V
    .locals 0

    .line 1
    iget-object p2, p0, LS0/d;->a:Lt/F;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Lt/o;->c(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-wide v0, p0, LS0/d;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final e()Lt/F;
    .locals 1

    .line 1
    iget-object v0, p0, LS0/d;->a:Lt/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(J)V
    .locals 12

    .line 1
    iget-wide v0, p0, LS0/d;->b:J

    .line 2
    .line 3
    cmp-long p1, v0, p1

    .line 4
    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object p1, p0, LS0/d;->a:Lt/F;

    .line 9
    .line 10
    iget-object p2, p1, Lt/o;->c:[Ljava/lang/Object;

    .line 11
    .line 12
    iget-object p1, p1, Lt/o;->a:[J

    .line 13
    .line 14
    array-length v0, p1

    .line 15
    add-int/lit8 v0, v0, -0x2

    .line 16
    .line 17
    if-ltz v0, :cond_4

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    move v2, v1

    .line 21
    :goto_0
    aget-wide v3, p1, v2

    .line 22
    .line 23
    not-long v5, v3

    .line 24
    const/4 v7, 0x7

    .line 25
    shl-long/2addr v5, v7

    .line 26
    and-long/2addr v5, v3

    .line 27
    const-wide v7, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    and-long/2addr v5, v7

    .line 33
    cmp-long v5, v5, v7

    .line 34
    .line 35
    if-eqz v5, :cond_3

    .line 36
    .line 37
    sub-int v5, v2, v0

    .line 38
    .line 39
    not-int v5, v5

    .line 40
    ushr-int/lit8 v5, v5, 0x1f

    .line 41
    .line 42
    const/16 v6, 0x8

    .line 43
    .line 44
    rsub-int/lit8 v5, v5, 0x8

    .line 45
    .line 46
    move v7, v1

    .line 47
    :goto_1
    if-ge v7, v5, :cond_2

    .line 48
    .line 49
    const-wide/16 v8, 0xff

    .line 50
    .line 51
    and-long/2addr v8, v3

    .line 52
    const-wide/16 v10, 0x80

    .line 53
    .line 54
    cmp-long v8, v8, v10

    .line 55
    .line 56
    if-gez v8, :cond_1

    .line 57
    .line 58
    shl-int/lit8 v8, v2, 0x3

    .line 59
    .line 60
    add-int/2addr v8, v7

    .line 61
    aget-object v8, p2, v8

    .line 62
    .line 63
    invoke-static {v8}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    shr-long/2addr v3, v6

    .line 67
    add-int/lit8 v7, v7, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    if-ne v5, v6, :cond_4

    .line 71
    .line 72
    :cond_3
    if-eq v2, v0, :cond_4

    .line 73
    .line 74
    add-int/lit8 v2, v2, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    const-wide p1, 0x7fffffffffffffffL

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    cmp-long v0, p1, p1

    .line 83
    .line 84
    if-nez v0, :cond_5

    .line 85
    .line 86
    const-wide/16 p1, -0x1

    .line 87
    .line 88
    :cond_5
    iput-wide p1, p0, LS0/d;->b:J

    .line 89
    .line 90
    return-void
.end method

.method public final g(JJ[FII)Z
    .locals 4

    .line 1
    iget-wide v0, p0, LS0/d;->c:J

    .line 2
    .line 3
    invoke-static {p3, p4, v0, v1}, Li1/n;->j(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iput-wide p3, p0, LS0/d;->c:J

    .line 11
    .line 12
    move p3, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p3, 0x0

    .line 15
    :goto_0
    iget-wide v2, p0, LS0/d;->d:J

    .line 16
    .line 17
    invoke-static {p1, p2, v2, v3}, Li1/n;->j(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result p4

    .line 21
    if-nez p4, :cond_1

    .line 22
    .line 23
    iput-wide p1, p0, LS0/d;->d:J

    .line 24
    .line 25
    move p3, v1

    .line 26
    :cond_1
    if-eqz p5, :cond_2

    .line 27
    .line 28
    iput-object p5, p0, LS0/d;->f:[F

    .line 29
    .line 30
    move p3, v1

    .line 31
    :cond_2
    int-to-long p1, p6

    .line 32
    const/16 p4, 0x20

    .line 33
    .line 34
    shl-long/2addr p1, p4

    .line 35
    int-to-long p4, p7

    .line 36
    const-wide p6, 0xffffffffL

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    and-long/2addr p4, p6

    .line 42
    or-long/2addr p1, p4

    .line 43
    iget-wide p4, p0, LS0/d;->e:J

    .line 44
    .line 45
    cmp-long p4, p1, p4

    .line 46
    .line 47
    if-eqz p4, :cond_3

    .line 48
    .line 49
    iput-wide p1, p0, LS0/d;->e:J

    .line 50
    .line 51
    return v1

    .line 52
    :cond_3
    return p3
.end method
