.class public abstract Lw/j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final synthetic a(Lw/s0;Ljava/lang/Object;)Lw/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lw/j;->b(Lw/s0;Ljava/lang/Object;)Lw/q;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final b(Lw/s0;Ljava/lang/Object;)Lw/q;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-interface {p0}, Lw/s0;->a()Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lw/q;

    .line 14
    .line 15
    return-object p0
.end method

.method public static final c(Lw/i;J)Lw/i;
    .locals 1

    .line 1
    new-instance v0, Lw/i0;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lw/i0;-><init>(Lw/i;J)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final d(Lw/C;Lw/b0;J)Lw/M;
    .locals 6

    .line 1
    new-instance v0, Lw/M;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-wide v3, p2

    .line 7
    invoke-direct/range {v0 .. v5}, Lw/M;-><init>(Lw/C;Lw/b0;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static synthetic e(Lw/C;Lw/b0;JILjava/lang/Object;)Lw/M;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p1, Lw/b0;->a:Lw/b0;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    const/4 p3, 0x0

    .line 13
    const/4 p4, 0x2

    .line 14
    invoke-static {p3, p3, p4, p2}, Lw/k0;->c(IIILkotlin/jvm/internal/DefaultConstructorMarker;)J

    .line 15
    .line 16
    .line 17
    move-result-wide p2

    .line 18
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lw/j;->d(Lw/C;Lw/b0;J)Lw/M;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;)Lw/S;
    .locals 2

    .line 1
    new-instance v0, Lw/S;

    .line 2
    .line 3
    new-instance v1, Lw/S$b;

    .line 4
    .line 5
    invoke-direct {v1}, Lw/S$b;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Lw/S;-><init>(Lw/S$b;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static final g(FFLjava/lang/Object;)Lw/h0;
    .locals 1

    .line 1
    new-instance v0, Lw/h0;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lw/h0;-><init>(FFLjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/high16 p0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p3, 0x2

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const p1, 0x44bb8000    # 1500.0f

    .line 12
    .line 13
    .line 14
    :cond_1
    and-int/lit8 p3, p3, 0x4

    .line 15
    .line 16
    if-eqz p3, :cond_2

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    :cond_2
    invoke-static {p0, p1, p2}, Lw/j;->g(FFLjava/lang/Object;)Lw/h0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static final i(IILw/D;)Lw/r0;
    .locals 1

    .line 1
    new-instance v0, Lw/r0;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lw/r0;-><init>(IILw/D;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic j(IILw/D;ILjava/lang/Object;)Lw/r0;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/16 p0, 0x12c

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p3, 0x2

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    :cond_1
    and-int/lit8 p3, p3, 0x4

    .line 13
    .line 14
    if-eqz p3, :cond_2

    .line 15
    .line 16
    invoke-static {}, Lw/F;->d()Lw/D;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :cond_2
    invoke-static {p0, p1, p2}, Lw/j;->i(IILw/D;)Lw/r0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method
