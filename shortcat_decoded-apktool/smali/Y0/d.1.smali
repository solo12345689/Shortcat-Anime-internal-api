.class public abstract LY0/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Ljava/io/File;LY0/L;ILY0/K$d;)LY0/t;
    .locals 6

    .line 1
    new-instance v0, LY0/b;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move v3, p2

    .line 7
    move-object v4, p3

    .line 8
    invoke-direct/range {v0 .. v5}, LY0/b;-><init>(Ljava/io/File;LY0/L;ILY0/K$d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static synthetic b(Ljava/io/File;LY0/L;ILY0/K$d;ILjava/lang/Object;)LY0/t;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p1, LY0/L;->b:LY0/L$a;

    .line 6
    .line 7
    invoke-virtual {p1}, LY0/L$a;->g()LY0/L;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    and-int/lit8 p5, p4, 0x4

    .line 12
    .line 13
    if-eqz p5, :cond_1

    .line 14
    .line 15
    sget-object p2, LY0/H;->b:LY0/H$a;

    .line 16
    .line 17
    invoke-virtual {p2}, LY0/H$a;->b()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    :cond_1
    and-int/lit8 p4, p4, 0x8

    .line 22
    .line 23
    if-eqz p4, :cond_2

    .line 24
    .line 25
    sget-object p3, LY0/K;->a:LY0/K;

    .line 26
    .line 27
    const/4 p4, 0x0

    .line 28
    new-array p4, p4, [LY0/K$a;

    .line 29
    .line 30
    invoke-virtual {p3, p1, p2, p4}, LY0/K;->a(LY0/L;I[LY0/K$a;)LY0/K$d;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    :cond_2
    invoke-static {p0, p1, p2, p3}, LY0/d;->a(Ljava/io/File;LY0/L;ILY0/K$d;)LY0/t;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public static final c(Ljava/lang/String;Landroid/content/res/AssetManager;LY0/L;ILY0/K$d;)LY0/t;
    .locals 7

    .line 1
    new-instance v0, LY0/a;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    move-object v2, p0

    .line 5
    move-object v1, p1

    .line 6
    move-object v3, p2

    .line 7
    move v4, p3

    .line 8
    move-object v5, p4

    .line 9
    invoke-direct/range {v0 .. v6}, LY0/a;-><init>(Landroid/content/res/AssetManager;Ljava/lang/String;LY0/L;ILY0/K$d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static synthetic d(Ljava/lang/String;Landroid/content/res/AssetManager;LY0/L;ILY0/K$d;ILjava/lang/Object;)LY0/t;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x4

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    sget-object p2, LY0/L;->b:LY0/L$a;

    .line 6
    .line 7
    invoke-virtual {p2}, LY0/L$a;->g()LY0/L;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    :cond_0
    and-int/lit8 p6, p5, 0x8

    .line 12
    .line 13
    if-eqz p6, :cond_1

    .line 14
    .line 15
    sget-object p3, LY0/H;->b:LY0/H$a;

    .line 16
    .line 17
    invoke-virtual {p3}, LY0/H$a;->b()I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    :cond_1
    and-int/lit8 p5, p5, 0x10

    .line 22
    .line 23
    if-eqz p5, :cond_2

    .line 24
    .line 25
    sget-object p4, LY0/K;->a:LY0/K;

    .line 26
    .line 27
    const/4 p5, 0x0

    .line 28
    new-array p5, p5, [LY0/K$a;

    .line 29
    .line 30
    invoke-virtual {p4, p2, p3, p5}, LY0/K;->a(LY0/L;I[LY0/K$a;)LY0/K$d;

    .line 31
    .line 32
    .line 33
    move-result-object p4

    .line 34
    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, LY0/d;->c(Ljava/lang/String;Landroid/content/res/AssetManager;LY0/L;ILY0/K$d;)LY0/t;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method
