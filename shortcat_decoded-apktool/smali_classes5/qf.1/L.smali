.class public abstract Lqf/L;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Lqf/S;)Lqf/I;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lqf/S;->Q0()Lqf/M0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType"

    .line 11
    .line 12
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast p0, Lqf/I;

    .line 16
    .line 17
    return-object p0
.end method

.method public static final b(Lqf/S;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lqf/S;->Q0()Lqf/M0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    instance-of p0, p0, Lqf/I;

    .line 11
    .line 12
    return p0
.end method

.method public static final c(Lqf/S;)Lqf/d0;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lqf/S;->Q0()Lqf/M0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    instance-of v0, p0, Lqf/I;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    check-cast p0, Lqf/I;

    .line 15
    .line 16
    invoke-virtual {p0}, Lqf/I;->V0()Lqf/d0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    instance-of v0, p0, Lqf/d0;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    check-cast p0, Lqf/d0;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    new-instance p0, LTd/r;

    .line 29
    .line 30
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 31
    .line 32
    .line 33
    throw p0
.end method

.method public static final d(Lqf/S;)Lqf/d0;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lqf/S;->Q0()Lqf/M0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    instance-of v0, p0, Lqf/I;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    check-cast p0, Lqf/I;

    .line 15
    .line 16
    invoke-virtual {p0}, Lqf/I;->W0()Lqf/d0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    instance-of v0, p0, Lqf/d0;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    check-cast p0, Lqf/d0;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    new-instance p0, LTd/r;

    .line 29
    .line 30
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 31
    .line 32
    .line 33
    throw p0
.end method
