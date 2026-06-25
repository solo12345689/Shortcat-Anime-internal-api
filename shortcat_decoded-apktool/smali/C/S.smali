.class public abstract LC/S;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(IIII)LC/P;
    .locals 1

    .line 1
    new-instance v0, LC/p;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, LC/p;-><init>(IIII)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final b(LC/P;LY/m;I)LC/A;
    .locals 3

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:244)"

    .line 9
    .line 10
    const v2, -0x58838cba

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance p2, LC/u;

    .line 17
    .line 18
    invoke-static {}, Landroidx/compose/ui/platform/w0;->e()LY/b1;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {p1, v0}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Li1/d;

    .line 27
    .line 28
    invoke-direct {p2, p0, p1}, LC/u;-><init>(LC/P;Li1/d;)V

    .line 29
    .line 30
    .line 31
    invoke-static {}, LY/w;->L()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    invoke-static {}, LY/w;->T()V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-object p2
.end method

.method public static final c(LC/P;Li1/d;)LC/A;
    .locals 1

    .line 1
    new-instance v0, LC/u;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LC/u;-><init>(LC/P;Li1/d;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final d(LC/P;LC/P;)LC/P;
    .locals 1

    .line 1
    new-instance v0, LC/o;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LC/o;-><init>(LC/P;LC/P;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final e(LC/P;I)LC/P;
    .locals 2

    .line 1
    new-instance v0, LC/z;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, LC/z;-><init>(LC/P;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static final f(LC/P;LC/P;)LC/P;
    .locals 1

    .line 1
    new-instance v0, LC/M;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LC/M;-><init>(LC/P;LC/P;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
