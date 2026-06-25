.class public LHg/h;
.super LHg/b;

# interfaces
.implements LFg/q;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-static {p1}, LHg/h;->r(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sget-object v0, LFg/d;->j:LFg/d;

    .line 6
    .line 7
    invoke-direct {p0, p1, v0}, LHg/b;-><init>(ILFg/d;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static r(I)I
    .locals 3

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x100

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "\'bitStrength\' "

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p0, " not supported for SHAKE"

    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :cond_1
    :goto_0
    return p0
.end method


# virtual methods
.method public a([BI)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LHg/h;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, p1, p2, v0}, LHg/h;->e([BII)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public c()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "SHAKE"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget v1, p0, LHg/b;->f:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, LHg/b;->f:I

    .line 2
    .line 3
    div-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    return v0
.end method

.method public e([BII)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, LHg/h;->s([BII)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, LHg/b;->p()V

    .line 6
    .line 7
    .line 8
    return p1
.end method

.method protected l()LFg/c;
    .locals 1

    .line 1
    iget-object v0, p0, LHg/b;->a:LFg/d;

    .line 2
    .line 3
    invoke-static {p0, v0}, LHg/i;->b(LFg/j;LFg/d;)LFg/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public s([BII)I
    .locals 4

    .line 1
    iget-boolean v0, p0, LHg/b;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0xf

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    invoke-virtual {p0, v0, v1}, LHg/b;->k(II)V

    .line 9
    .line 10
    .line 11
    :cond_0
    int-to-long v0, p3

    .line 12
    const-wide/16 v2, 0x8

    .line 13
    .line 14
    mul-long/2addr v0, v2

    .line 15
    invoke-virtual {p0, p1, p2, v0, v1}, LHg/b;->q([BIJ)V

    .line 16
    .line 17
    .line 18
    return p3
.end method
