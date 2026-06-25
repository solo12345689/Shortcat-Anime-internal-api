.class public abstract Lz/y;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Lkotlin/jvm/functions/Function1;)Lz/x;
    .locals 1

    .line 1
    new-instance v0, Lz/i;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lz/i;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final b(Lkotlin/jvm/functions/Function1;LY/m;I)Lz/x;
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
    const-string v1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:161)"

    .line 9
    .line 10
    const v2, -0xac19cfe

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    and-int/lit8 p2, p2, 0xe

    .line 17
    .line 18
    invoke-static {p0, p1, p2}, LY/U1;->o(Ljava/lang/Object;LY/m;I)LY/h2;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    sget-object v0, LY/m;->a:LY/m$a;

    .line 27
    .line 28
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-ne p2, v0, :cond_1

    .line 33
    .line 34
    new-instance p2, Lz/y$a;

    .line 35
    .line 36
    invoke-direct {p2, p0}, Lz/y$a;-><init>(LY/h2;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p2}, Lz/y;->a(Lkotlin/jvm/functions/Function1;)Lz/x;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-interface {p1, p2}, LY/m;->u(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    check-cast p2, Lz/x;

    .line 47
    .line 48
    invoke-static {}, LY/w;->L()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    invoke-static {}, LY/w;->T()V

    .line 55
    .line 56
    .line 57
    :cond_2
    return-object p2
.end method
