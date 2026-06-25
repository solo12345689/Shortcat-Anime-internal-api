.class public abstract LY0/B;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(ILY0/L;II)LY0/t;
    .locals 7

    .line 1
    new-instance v0, LY0/f0;

    .line 2
    .line 3
    new-instance v4, LY0/K$d;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v1, v1, [LY0/K$a;

    .line 7
    .line 8
    invoke-direct {v4, v1}, LY0/K$d;-><init>([LY0/K$a;)V

    .line 9
    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    move v1, p0

    .line 13
    move-object v2, p1

    .line 14
    move v3, p2

    .line 15
    move v5, p3

    .line 16
    invoke-direct/range {v0 .. v6}, LY0/f0;-><init>(ILY0/L;ILY0/K$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public static synthetic b(ILY0/L;IIILjava/lang/Object;)LY0/t;
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
    sget-object p3, LY0/F;->a:LY0/F$a;

    .line 26
    .line 27
    invoke-virtual {p3}, LY0/F$a;->b()I

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    :cond_2
    invoke-static {p0, p1, p2, p3}, LY0/B;->a(ILY0/L;II)LY0/t;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method
