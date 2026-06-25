.class public abstract Lw/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Lw/i;Lw/s0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lw/n0;
    .locals 6

    .line 1
    new-instance v0, Lw/n0;

    .line 2
    .line 3
    invoke-interface {p1}, Lw/s0;->a()Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1, p4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    move-object v5, p4

    .line 12
    check-cast v5, Lw/q;

    .line 13
    .line 14
    move-object v1, p0

    .line 15
    move-object v2, p1

    .line 16
    move-object v3, p2

    .line 17
    move-object v4, p3

    .line 18
    invoke-direct/range {v0 .. v5}, Lw/n0;-><init>(Lw/i;Lw/s0;Ljava/lang/Object;Ljava/lang/Object;Lw/q;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static final b(Lw/d;)J
    .locals 4

    .line 1
    invoke-interface {p0}, Lw/d;->d()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/32 v2, 0xf4240

    .line 6
    .line 7
    .line 8
    div-long/2addr v0, v2

    .line 9
    return-wide v0
.end method
