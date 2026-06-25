.class public abstract LQe/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LSe/o;LUe/d;LUe/h;ZZZ)LQe/A;
    .locals 2

    .line 1
    const-string v0, "proto"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "nameResolver"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "typeTable"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, LVe/a;->d:LZe/i$f;

    .line 17
    .line 18
    const-string v1, "propertySignature"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p0, v0}, LUe/f;->a(LZe/i$d;LZe/i$f;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, LVe/a$d;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    return-object v1

    .line 33
    :cond_0
    if-eqz p3, :cond_2

    .line 34
    .line 35
    sget-object p3, LWe/h;->a:LWe/h;

    .line 36
    .line 37
    invoke-virtual {p3, p0, p1, p2, p5}, LWe/h;->c(LSe/o;LUe/d;LUe/h;Z)LWe/d$a;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-nez p0, :cond_1

    .line 42
    .line 43
    return-object v1

    .line 44
    :cond_1
    sget-object p1, LQe/A;->b:LQe/A$a;

    .line 45
    .line 46
    invoke-virtual {p1, p0}, LQe/A$a;->b(LWe/d;)LQe/A;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_2
    if-eqz p4, :cond_3

    .line 52
    .line 53
    invoke-virtual {v0}, LVe/a$d;->J()Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    sget-object p0, LQe/A;->b:LQe/A$a;

    .line 60
    .line 61
    invoke-virtual {v0}, LVe/a$d;->E()LVe/a$c;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    const-string p3, "getSyntheticMethod(...)"

    .line 66
    .line 67
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p1, p2}, LQe/A$a;->c(LUe/d;LVe/a$c;)LQe/A;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :cond_3
    return-object v1
.end method

.method public static synthetic b(LSe/o;LUe/d;LUe/h;ZZZILjava/lang/Object;)LQe/A;
    .locals 1

    .line 1
    and-int/lit8 p7, p6, 0x8

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p7, :cond_0

    .line 5
    .line 6
    move p3, v0

    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x10

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    move p4, v0

    .line 12
    :cond_1
    and-int/lit8 p6, p6, 0x20

    .line 13
    .line 14
    if-eqz p6, :cond_2

    .line 15
    .line 16
    const/4 p5, 0x1

    .line 17
    :cond_2
    invoke-static/range {p0 .. p5}, LQe/f;->a(LSe/o;LUe/d;LUe/h;ZZZ)LQe/A;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
