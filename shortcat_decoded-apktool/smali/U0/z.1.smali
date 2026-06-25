.class public abstract LU0/z;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Ljava/lang/String;LU0/Y0;Ljava/util/List;Li1/d;LY0/u$b;Ljava/util/List;)LU0/y;
    .locals 1

    .line 1
    move-object v0, p4

    .line 2
    move-object p4, p3

    .line 3
    move-object p3, p5

    .line 4
    move-object p5, v0

    .line 5
    invoke-static/range {p0 .. p5}, Ld1/f;->a(Ljava/lang/String;LU0/Y0;Ljava/util/List;Ljava/util/List;Li1/d;LY0/u$b;)LU0/y;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static final b(Ljava/lang/String;LU0/Y0;Ljava/util/List;Ljava/util/List;Li1/d;LY0/u$b;)LU0/y;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Ld1/f;->a(Ljava/lang/String;LU0/Y0;Ljava/util/List;Ljava/util/List;Li1/d;LY0/u$b;)LU0/y;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;LU0/Y0;Ljava/util/List;Ljava/util/List;Li1/d;LY0/u$b;ILjava/lang/Object;)LU0/y;
    .locals 6

    .line 1
    and-int/lit8 p7, p6, 0x4

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :cond_0
    move-object v2, p2

    .line 10
    and-int/lit8 p2, p6, 0x8

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    :cond_1
    move-object v0, p0

    .line 19
    move-object v1, p1

    .line 20
    move-object v3, p3

    .line 21
    move-object v4, p4

    .line 22
    move-object v5, p5

    .line 23
    invoke-static/range {v0 .. v5}, LU0/z;->b(Ljava/lang/String;LU0/Y0;Ljava/util/List;Ljava/util/List;Li1/d;LY0/u$b;)LU0/y;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
