.class public abstract Lw/r;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(F)Lw/m;
    .locals 1

    .line 1
    new-instance v0, Lw/m;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lw/m;-><init>(F)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final b(FF)Lw/n;
    .locals 1

    .line 1
    new-instance v0, Lw/n;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lw/n;-><init>(FF)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final c(FFF)Lw/o;
    .locals 1

    .line 1
    new-instance v0, Lw/o;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lw/o;-><init>(FFF)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final d(FFFF)Lw/p;
    .locals 1

    .line 1
    new-instance v0, Lw/p;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lw/p;-><init>(FFFF)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final e(Lw/q;)Lw/q;
    .locals 4

    .line 1
    invoke-static {p0}, Lw/r;->g(Lw/q;)Lw/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lw/q;->b()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Lw/q;->a(I)F

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-virtual {v0, v2, v3}, Lw/q;->e(IF)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-object v0
.end method

.method public static final f(Lw/q;Lw/q;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lw/q;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Lw/q;->a(I)F

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-virtual {p0, v1, v2}, Lw/q;->e(IF)V

    .line 13
    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void
.end method

.method public static final g(Lw/q;)Lw/q;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lw/q;->c()Lw/q;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance"

    .line 6
    .line 7
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method
