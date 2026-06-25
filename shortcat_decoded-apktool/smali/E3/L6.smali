.class abstract LE3/L6;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LF3/g$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LF3/g$e;

    .line 2
    .line 3
    const-string v1, "androidx.media3.session.MediaLibraryService"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LF3/g$e;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LE3/L6;->a:LF3/g$e;

    .line 10
    .line 11
    return-void
.end method

.method public static a(LF3/v;LF3/v;)Z
    .locals 5

    .line 1
    const/4 v0, 0x7

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, LF3/v;->o()I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    if-ne v3, v0, :cond_0

    .line 11
    .line 12
    move v3, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v3, v1

    .line 15
    :goto_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, LF3/v;->o()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-ne v4, v0, :cond_1

    .line 22
    .line 23
    move v0, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v0, v1

    .line 26
    :goto_1
    if-eqz v3, :cond_3

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    invoke-static {p0}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, LF3/v;

    .line 35
    .line 36
    invoke-virtual {v0}, LF3/v;->g()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-static {p1}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, LF3/v;

    .line 45
    .line 46
    invoke-virtual {v3}, LF3/v;->g()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-ne v0, v3, :cond_2

    .line 51
    .line 52
    invoke-static {p0}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, LF3/v;

    .line 57
    .line 58
    invoke-virtual {p0}, LF3/v;->h()Ljava/lang/CharSequence;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p1}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, LF3/v;

    .line 67
    .line 68
    invoke-virtual {p1}, LF3/v;->h()Ljava/lang/CharSequence;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-eqz p0, :cond_2

    .line 77
    .line 78
    return v2

    .line 79
    :cond_2
    return v1

    .line 80
    :cond_3
    if-ne v3, v0, :cond_4

    .line 81
    .line 82
    return v2

    .line 83
    :cond_4
    return v1
.end method

.method public static b(LE3/W6;LE3/W6;)Z
    .locals 2

    .line 1
    iget-object p0, p0, LE3/W6;->a:Lq2/P$e;

    .line 2
    .line 3
    iget v0, p0, Lq2/P$e;->c:I

    .line 4
    .line 5
    iget-object p1, p1, LE3/W6;->a:Lq2/P$e;

    .line 6
    .line 7
    iget v1, p1, Lq2/P$e;->c:I

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget v0, p0, Lq2/P$e;->f:I

    .line 12
    .line 13
    iget v1, p1, Lq2/P$e;->f:I

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    iget v0, p0, Lq2/P$e;->i:I

    .line 18
    .line 19
    iget v1, p1, Lq2/P$e;->i:I

    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    iget p0, p0, Lq2/P$e;->j:I

    .line 24
    .line 25
    iget p1, p1, Lq2/P$e;->j:I

    .line 26
    .line 27
    if-ne p0, p1, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public static c(JJ)I
    .locals 4

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v2, p0, v0

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v2, :cond_2

    .line 10
    .line 11
    cmp-long v0, p2, v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-wide/16 v0, 0x0

    .line 17
    .line 18
    cmp-long v0, p2, v0

    .line 19
    .line 20
    const/16 v1, 0x64

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lt2/a0;->f1(JJ)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-static {p0, v3, v1}, Lt2/a0;->r(III)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :cond_2
    :goto_0
    return v3
.end method

.method public static d(I)[I
    .locals 2

    .line 1
    new-array v0, p0, [I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, p0, :cond_0

    .line 5
    .line 6
    aput v1, v0, v1

    .line 7
    .line 8
    add-int/lit8 v1, v1, 0x1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    return-object v0
.end method

.method public static e(LE3/M6;JJJ)J
    .locals 2

    .line 1
    iget-object v0, p0, LE3/M6;->c:LE3/W6;

    .line 2
    .line 3
    sget-object v1, LE3/W6;->l:LE3/W6;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LE3/W6;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, LE3/M6;->c:LE3/W6;

    .line 12
    .line 13
    iget-wide v0, v0, LE3/W6;->c:J

    .line 14
    .line 15
    cmp-long p3, p3, v0

    .line 16
    .line 17
    if-gez p3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p3, 0x0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    const/4 p3, 0x1

    .line 23
    :goto_1
    iget-boolean p4, p0, LE3/M6;->v:Z

    .line 24
    .line 25
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    if-nez p4, :cond_3

    .line 31
    .line 32
    if-nez p3, :cond_2

    .line 33
    .line 34
    cmp-long p3, p1, v0

    .line 35
    .line 36
    if-nez p3, :cond_4

    .line 37
    .line 38
    :cond_2
    iget-object p0, p0, LE3/M6;->c:LE3/W6;

    .line 39
    .line 40
    iget-object p0, p0, LE3/W6;->a:Lq2/P$e;

    .line 41
    .line 42
    iget-wide p0, p0, Lq2/P$e;->g:J

    .line 43
    .line 44
    return-wide p0

    .line 45
    :cond_3
    if-nez p3, :cond_5

    .line 46
    .line 47
    cmp-long p3, p1, v0

    .line 48
    .line 49
    if-eqz p3, :cond_5

    .line 50
    .line 51
    :cond_4
    return-wide p1

    .line 52
    :cond_5
    cmp-long p1, p5, v0

    .line 53
    .line 54
    if-eqz p1, :cond_6

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_6
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 58
    .line 59
    .line 60
    move-result-wide p1

    .line 61
    iget-object p3, p0, LE3/M6;->c:LE3/W6;

    .line 62
    .line 63
    iget-wide p3, p3, LE3/W6;->c:J

    .line 64
    .line 65
    sub-long p5, p1, p3

    .line 66
    .line 67
    :goto_2
    iget-object p1, p0, LE3/M6;->c:LE3/W6;

    .line 68
    .line 69
    iget-object p2, p1, LE3/W6;->a:Lq2/P$e;

    .line 70
    .line 71
    iget-wide p2, p2, Lq2/P$e;->g:J

    .line 72
    .line 73
    long-to-float p4, p5

    .line 74
    iget-object p0, p0, LE3/M6;->g:Lq2/O;

    .line 75
    .line 76
    iget p0, p0, Lq2/O;->a:F

    .line 77
    .line 78
    mul-float/2addr p4, p0

    .line 79
    float-to-long p4, p4

    .line 80
    add-long/2addr p2, p4

    .line 81
    iget-wide p0, p1, LE3/W6;->d:J

    .line 82
    .line 83
    cmp-long p4, p0, v0

    .line 84
    .line 85
    if-eqz p4, :cond_7

    .line 86
    .line 87
    invoke-static {p2, p3, p0, p1}, Ljava/lang/Math;->min(JJ)J

    .line 88
    .line 89
    .line 90
    move-result-wide p0

    .line 91
    return-wide p0

    .line 92
    :cond_7
    return-wide p2
.end method

.method public static f(Lq2/P$b;Lq2/P$b;)Lq2/P$b;
    .locals 3

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    new-instance v0, Lq2/P$b$a;

    .line 7
    .line 8
    invoke-direct {v0}, Lq2/P$b$a;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-virtual {p0}, Lq2/P$b;->g()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ge v1, v2, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lq2/P$b;->f(I)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {p1, v2}, Lq2/P$b;->c(I)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lq2/P$b;->f(I)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v0, v2}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 33
    .line 34
    .line 35
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-virtual {v0}, Lq2/P$b$a;->f()Lq2/P$b;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_3
    :goto_1
    sget-object p0, Lq2/P$b;->b:Lq2/P$b;

    .line 44
    .line 45
    return-object p0
.end method

.method public static g(LE3/M6;LE3/M6;LE3/M6$c;Lq2/P$b;)LE3/M6;
    .locals 1

    .line 1
    iget-boolean v0, p2, LE3/M6$c;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x11

    .line 6
    .line 7
    invoke-virtual {p3, v0}, Lq2/P$b;->c(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LE3/M6;->j:Lq2/Y;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, LE3/M6;->u(Lq2/Y;)LE3/M6;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :cond_0
    iget-boolean p2, p2, LE3/M6$c;->b:Z

    .line 20
    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    const/16 p2, 0x1e

    .line 24
    .line 25
    invoke-virtual {p3, p2}, Lq2/P$b;->c(I)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    iget-object p0, p0, LE3/M6;->D:Lq2/h0;

    .line 32
    .line 33
    invoke-virtual {p1, p0}, LE3/M6;->b(Lq2/h0;)LE3/M6;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_1
    return-object p1
.end method

.method public static h(Ljava/util/List;)Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return-object v0
.end method

.method public static i(Lq2/P;LE3/h3$i;)V
    .locals 4

    .line 1
    iget v0, p1, LE3/h3$i;->b:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/16 v3, 0x14

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    invoke-interface {p0, v3}, Lq2/P;->k(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object p1, p1, LE3/h3$i;->a:LP9/u;

    .line 17
    .line 18
    invoke-interface {p0, p1, v1}, Lq2/P;->L(Ljava/util/List;Z)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v0, p1, LE3/h3$i;->a:LP9/u;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_3

    .line 29
    .line 30
    iget-object p1, p1, LE3/h3$i;->a:LP9/u;

    .line 31
    .line 32
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lq2/C;

    .line 37
    .line 38
    invoke-interface {p0, p1, v1}, Lq2/P;->d0(Lq2/C;Z)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    invoke-interface {p0, v3}, Lq2/P;->k(I)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget-object v0, p1, LE3/h3$i;->a:LP9/u;

    .line 49
    .line 50
    iget v1, p1, LE3/h3$i;->b:I

    .line 51
    .line 52
    iget-wide v2, p1, LE3/h3$i;->c:J

    .line 53
    .line 54
    invoke-interface {p0, v0, v1, v2, v3}, Lq2/P;->D0(Ljava/util/List;IJ)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    iget-object v0, p1, LE3/h3$i;->a:LP9/u;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_3

    .line 65
    .line 66
    iget-object v0, p1, LE3/h3$i;->a:LP9/u;

    .line 67
    .line 68
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Lq2/C;

    .line 73
    .line 74
    iget-wide v1, p1, LE3/h3$i;->c:J

    .line 75
    .line 76
    invoke-interface {p0, v0, v1, v2}, Lq2/P;->f0(Lq2/C;J)V

    .line 77
    .line 78
    .line 79
    :cond_3
    return-void
.end method
