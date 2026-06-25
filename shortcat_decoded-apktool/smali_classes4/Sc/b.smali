.class public abstract LSc/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Landroid/net/Uri;JJLZd/e;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    instance-of v1, v0, LSc/b$a;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, LSc/b$a;

    .line 9
    .line 10
    iget v2, v1, LSc/b$a;->b:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, LSc/b$a;->b:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, LSc/b$a;

    .line 23
    .line 24
    invoke-direct {v1, v0}, LSc/b$a;-><init>(LZd/e;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, LSc/b$a;->a:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget v3, v1, LSc/b$a;->b:I

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    if-ne v3, v4, :cond_1

    .line 39
    .line 40
    :try_start_0
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_2
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :try_start_1
    sget-object v0, LTd/u;->b:LTd/u$a;

    .line 56
    .line 57
    add-long v5, p1, p3

    .line 58
    .line 59
    new-instance v7, LSc/b$b;

    .line 60
    .line 61
    const/4 v13, 0x0

    .line 62
    move-object v8, p0

    .line 63
    move-wide v9, p1

    .line 64
    move-wide/from16 v11, p3

    .line 65
    .line 66
    invoke-direct/range {v7 .. v13}, LSc/b$b;-><init>(Landroid/net/Uri;JJLZd/e;)V

    .line 67
    .line 68
    .line 69
    iput v4, v1, LSc/b$a;->b:I

    .line 70
    .line 71
    invoke-static {v5, v6, v7, v1}, LGf/d1;->c(JLkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-ne v0, v2, :cond_3

    .line 76
    .line 77
    return-object v2

    .line 78
    :cond_3
    :goto_1
    check-cast v0, Landroid/graphics/Bitmap;

    .line 79
    .line 80
    invoke-static {v0}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    goto :goto_2

    .line 85
    :catchall_0
    move-exception v0

    .line 86
    move-object p0, v0

    .line 87
    sget-object v0, LTd/u;->b:LTd/u$a;

    .line 88
    .line 89
    invoke-static {p0}, LTd/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {p0}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    :goto_2
    invoke-static {p0}, LTd/u;->g(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_4

    .line 102
    .line 103
    const/4 p0, 0x0

    .line 104
    :cond_4
    return-object p0
.end method

.method public static synthetic b(Landroid/net/Uri;JJLZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    and-int/lit8 p7, p6, 0x2

    .line 2
    .line 3
    const-wide/16 v0, 0x1f40

    .line 4
    .line 5
    if-eqz p7, :cond_0

    .line 6
    .line 7
    move-wide p1, v0

    .line 8
    :cond_0
    and-int/lit8 p6, p6, 0x4

    .line 9
    .line 10
    if-eqz p6, :cond_1

    .line 11
    .line 12
    move-wide p3, v0

    .line 13
    :cond_1
    invoke-static/range {p0 .. p5}, LSc/b;->a(Landroid/net/Uri;JJLZd/e;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
