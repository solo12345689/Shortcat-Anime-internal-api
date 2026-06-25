.class public abstract LHg/a;
.super Ljava/lang/Object;

# interfaces
.implements LFg/j;


# instance fields
.field protected final a:LFg/d;

.field private final b:[B

.field private c:I

.field private d:J


# direct methods
.method protected constructor <init>(LFg/d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    new-array v0, v0, [B

    .line 6
    .line 7
    iput-object v0, p0, LHg/a;->b:[B

    .line 8
    .line 9
    iput-object p1, p0, LHg/a;->a:LFg/d;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput p1, p0, LHg/a;->c:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public b(B)V
    .locals 4

    .line 1
    iget-object v0, p0, LHg/a;->b:[B

    .line 2
    .line 3
    iget v1, p0, LHg/a;->c:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, LHg/a;->c:I

    .line 8
    .line 9
    aput-byte p1, v0, v1

    .line 10
    .line 11
    array-length p1, v0

    .line 12
    if-ne v2, p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-virtual {p0, v0, p1}, LHg/a;->i([BI)V

    .line 16
    .line 17
    .line 18
    iput p1, p0, LHg/a;->c:I

    .line 19
    .line 20
    :cond_0
    iget-wide v0, p0, LHg/a;->d:J

    .line 21
    .line 22
    const-wide/16 v2, 0x1

    .line 23
    .line 24
    add-long/2addr v0, v2

    .line 25
    iput-wide v0, p0, LHg/a;->d:J

    .line 26
    .line 27
    return-void
.end method

.method public f()V
    .locals 3

    .line 1
    iget-wide v0, p0, LHg/a;->d:J

    .line 2
    .line 3
    const/4 v2, 0x3

    .line 4
    shl-long/2addr v0, v2

    .line 5
    const/16 v2, -0x80

    .line 6
    .line 7
    :goto_0
    invoke-virtual {p0, v2}, LHg/a;->b(B)V

    .line 8
    .line 9
    .line 10
    iget v2, p0, LHg/a;->c:I

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0, v0, v1}, LHg/a;->h(J)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, LHg/a;->g()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method protected abstract g()V
.end method

.method protected abstract h(J)V
.end method

.method protected abstract i([BI)V
.end method

.method public j()V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, LHg/a;->d:J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput v0, p0, LHg/a;->c:I

    .line 7
    .line 8
    move v1, v0

    .line 9
    :goto_0
    iget-object v2, p0, LHg/a;->b:[B

    .line 10
    .line 11
    array-length v3, v2

    .line 12
    if-ge v1, v3, :cond_0

    .line 13
    .line 14
    aput-byte v0, v2, v1

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public update([BII)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    .line 3
    .line 4
    .line 5
    move-result p3

    .line 6
    iget v1, p0, LHg/a;->c:I

    .line 7
    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    move v1, v0

    .line 11
    :goto_0
    if-ge v1, p3, :cond_1

    .line 12
    .line 13
    iget-object v2, p0, LHg/a;->b:[B

    .line 14
    .line 15
    iget v3, p0, LHg/a;->c:I

    .line 16
    .line 17
    add-int/lit8 v4, v3, 0x1

    .line 18
    .line 19
    iput v4, p0, LHg/a;->c:I

    .line 20
    .line 21
    add-int/lit8 v5, v1, 0x1

    .line 22
    .line 23
    add-int/2addr v1, p2

    .line 24
    aget-byte v1, p1, v1

    .line 25
    .line 26
    aput-byte v1, v2, v3

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    if-ne v4, v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0, v2, v0}, LHg/a;->i([BI)V

    .line 32
    .line 33
    .line 34
    iput v0, p0, LHg/a;->c:I

    .line 35
    .line 36
    move v0, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    move v1, v5

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v0, v1

    .line 41
    :cond_2
    :goto_1
    add-int/lit8 v1, p3, -0x3

    .line 42
    .line 43
    :goto_2
    if-ge v0, v1, :cond_3

    .line 44
    .line 45
    add-int v2, p2, v0

    .line 46
    .line 47
    invoke-virtual {p0, p1, v2}, LHg/a;->i([BI)V

    .line 48
    .line 49
    .line 50
    add-int/lit8 v0, v0, 0x4

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    :goto_3
    if-ge v0, p3, :cond_4

    .line 54
    .line 55
    iget-object v1, p0, LHg/a;->b:[B

    .line 56
    .line 57
    iget v2, p0, LHg/a;->c:I

    .line 58
    .line 59
    add-int/lit8 v3, v2, 0x1

    .line 60
    .line 61
    iput v3, p0, LHg/a;->c:I

    .line 62
    .line 63
    add-int/lit8 v3, v0, 0x1

    .line 64
    .line 65
    add-int/2addr v0, p2

    .line 66
    aget-byte v0, p1, v0

    .line 67
    .line 68
    aput-byte v0, v1, v2

    .line 69
    .line 70
    move v0, v3

    .line 71
    goto :goto_3

    .line 72
    :cond_4
    iget-wide p1, p0, LHg/a;->d:J

    .line 73
    .line 74
    int-to-long v0, p3

    .line 75
    add-long/2addr p1, v0

    .line 76
    iput-wide p1, p0, LHg/a;->d:J

    .line 77
    .line 78
    return-void
.end method
