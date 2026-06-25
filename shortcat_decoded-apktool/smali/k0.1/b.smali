.class public abstract Lk0/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LY/D1;)Ljava/util/List;
    .locals 4

    .line 1
    invoke-virtual {p0}, LY/D1;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, LY/D1;->x()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    new-instance v0, Lk0/u;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lk0/u;-><init>(LY/D1;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, LY/D1;->u()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {p0}, LY/D1;->y()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    :goto_0
    if-ltz v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, LY/D1;->z()LY/E1;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3, v1}, LY/E1;->L(I)LY/h0;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v0, v3, v2}, Lk0/a;->f(LY/h0;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v1}, LY/D1;->a(I)LY/b;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {p0, v1}, LY/D1;->Q(I)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {v0}, Lk0/a;->i()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_1
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0
.end method

.method public static final b(LY/H1;Ljava/lang/Object;ILjava/lang/Integer;)Ljava/util/List;
    .locals 3

    .line 1
    invoke-virtual {p0}, LY/H1;->Y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_5

    .line 6
    .line 7
    invoke-virtual {p0}, LY/H1;->b0()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    new-instance v0, Lk0/y;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lk0/y;-><init>(LY/H1;)V

    .line 16
    .line 17
    .line 18
    if-eqz p3, :cond_0

    .line 19
    .line 20
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, LY/H1;->a0()I

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    if-gez p3, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, p2}, LY/H1;->C0(I)I

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0}, LY/H1;->a0()I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    :goto_0
    if-nez p1, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0, p2}, LY/H1;->i0(I)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :cond_2
    :goto_1
    if-ltz p2, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0, p2}, LY/H1;->b1(I)LY/h0;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1, p1}, Lk0/a;->f(LY/h0;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p2}, LY/H1;->B(I)LY/b;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-ltz p3, :cond_3

    .line 64
    .line 65
    invoke-virtual {p0, p3}, LY/H1;->C0(I)I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    move v2, p3

    .line 70
    move p3, p2

    .line 71
    move p2, v2

    .line 72
    goto :goto_1

    .line 73
    :cond_3
    move p2, p3

    .line 74
    goto :goto_1

    .line 75
    :cond_4
    invoke-virtual {v0}, Lk0/a;->i()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :cond_5
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0
.end method

.method public static synthetic c(LY/H1;Ljava/lang/Object;ILjava/lang/Integer;ILjava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, LY/H1;->Z()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 16
    .line 17
    if-eqz p4, :cond_2

    .line 18
    .line 19
    move-object p3, v0

    .line 20
    :cond_2
    invoke-static {p0, p1, p2, p3}, Lk0/b;->b(LY/H1;Ljava/lang/Object;ILjava/lang/Integer;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static final d(LY/E1;Lkotlin/jvm/functions/Function1;)Lk0/q;
    .locals 5

    .line 1
    invoke-virtual {p0}, LY/E1;->F()LY/D1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    new-instance v1, Lkotlin/jvm/internal/L;

    .line 6
    .line 7
    invoke-direct {v1}, Lkotlin/jvm/internal/L;-><init>()V

    .line 8
    .line 9
    .line 10
    :goto_0
    iget v2, v1, Lkotlin/jvm/internal/L;->a:I

    .line 11
    .line 12
    invoke-virtual {p0}, LY/E1;->u()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x0

    .line 17
    if-ge v2, v3, :cond_3

    .line 18
    .line 19
    iget v2, v1, Lkotlin/jvm/internal/L;->a:I

    .line 20
    .line 21
    invoke-virtual {v0, v2}, LY/D1;->K(I)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iget v2, v1, Lkotlin/jvm/internal/L;->a:I

    .line 28
    .line 29
    invoke-virtual {v0, v2}, LY/D1;->M(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    new-instance p0, Lk0/q;

    .line 46
    .line 47
    iget p1, v1, Lkotlin/jvm/internal/L;->a:I

    .line 48
    .line 49
    invoke-direct {p0, p1, v4}, Lk0/q;-><init>(ILjava/lang/Integer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, LY/D1;->d()V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :catchall_0
    move-exception p0

    .line 57
    goto :goto_2

    .line 58
    :cond_0
    :try_start_1
    iget v2, v1, Lkotlin/jvm/internal/L;->a:I

    .line 59
    .line 60
    invoke-virtual {v0, v2}, LY/D1;->V(I)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    const/4 v3, 0x0

    .line 65
    :goto_1
    if-ge v3, v2, :cond_2

    .line 66
    .line 67
    iget v4, v1, Lkotlin/jvm/internal/L;->a:I

    .line 68
    .line 69
    invoke-virtual {v0, v4, v3}, LY/D1;->C(II)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-interface {p1, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-eqz v4, :cond_1

    .line 84
    .line 85
    new-instance p0, Lk0/q;

    .line 86
    .line 87
    iget p1, v1, Lkotlin/jvm/internal/L;->a:I

    .line 88
    .line 89
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-direct {p0, p1, v1}, Lk0/q;-><init>(ILjava/lang/Integer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, LY/D1;->d()V

    .line 97
    .line 98
    .line 99
    return-object p0

    .line 100
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    :try_start_2
    iget v2, v1, Lkotlin/jvm/internal/L;->a:I

    .line 104
    .line 105
    add-int/lit8 v2, v2, 0x1

    .line 106
    .line 107
    iput v2, v1, Lkotlin/jvm/internal/L;->a:I

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_3
    sget-object p0, LTd/L;->a:LTd/L;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 111
    .line 112
    invoke-virtual {v0}, LY/D1;->d()V

    .line 113
    .line 114
    .line 115
    return-object v4

    .line 116
    :goto_2
    invoke-virtual {v0}, LY/D1;->d()V

    .line 117
    .line 118
    .line 119
    throw p0
.end method

.method public static final e(LY/E1;LY/y;)Ljava/lang/Integer;
    .locals 2

    .line 1
    invoke-virtual {p0}, LY/E1;->F()LY/D1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :try_start_0
    invoke-virtual {p0}, LY/D1;->x()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {p0, p1, v1, v0}, Lk0/b;->f(LY/D1;LY/y;II)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    invoke-virtual {p0}, LY/D1;->d()V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    invoke-virtual {p0}, LY/D1;->d()V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method private static final f(LY/D1;LY/y;II)Ljava/lang/Integer;
    .locals 4

    .line 1
    :goto_0
    const/4 v0, 0x0

    .line 2
    if-ge p2, p3, :cond_3

    .line 3
    .line 4
    invoke-virtual {p0, p2}, LY/D1;->F(I)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    add-int/2addr v1, p2

    .line 9
    invoke-virtual {p0, p2}, LY/D1;->G(I)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, p2}, LY/D1;->D(I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/16 v3, 0xce

    .line 20
    .line 21
    if-ne v2, v3, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, p2}, LY/D1;->E(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {}, LY/w;->H()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-virtual {p0, p2, v2}, LY/D1;->C(II)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    instance-of v3, v2, LY/s$a;

    .line 43
    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    move-object v0, v2

    .line 47
    check-cast v0, LY/s$a;

    .line 48
    .line 49
    :cond_0
    if-eqz v0, :cond_1

    .line 50
    .line 51
    invoke-virtual {v0}, LY/s$a;->a()LY/s$b;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :cond_1
    invoke-virtual {p0, p2}, LY/D1;->e(I)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    add-int/lit8 p2, p2, 0x1

    .line 73
    .line 74
    invoke-static {p0, p1, p2, v1}, Lk0/b;->f(LY/D1;LY/y;II)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    if-eqz p2, :cond_2

    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :cond_2
    move p2, v1

    .line 90
    goto :goto_0

    .line 91
    :cond_3
    return-object v0
.end method

.method public static final g(LY/D1;ILjava/lang/Object;)Ljava/util/List;
    .locals 5

    .line 1
    new-instance v0, Lk0/u;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lk0/u;-><init>(LY/D1;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, LY/D1;->Q(I)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p0, p1}, LY/D1;->a(I)LY/b;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    :goto_0
    if-ltz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, LY/D1;->z()LY/E1;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3, p1}, LY/E1;->L(I)LY/h0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p1, p2}, Lk0/a;->f(LY/h0;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    if-ltz v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0, v1}, LY/D1;->a(I)LY/b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0, v1}, LY/D1;->Q(I)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    move-object v4, v2

    .line 38
    move-object v2, p1

    .line 39
    move p1, v1

    .line 40
    move v1, p2

    .line 41
    move-object p2, v4

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move p1, v1

    .line 44
    move-object p2, v2

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {v0}, Lk0/a;->i()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method
