.class public abstract Lqf/A;
.super Lqf/d0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lqf/d0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public L0()Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqf/A;->W0()Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lqf/S;->L0()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public M0()Lqf/r0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqf/A;->W0()Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lqf/S;->M0()Lqf/r0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public N0()Lqf/v0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqf/A;->W0()Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lqf/S;->N0()Lqf/v0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public O0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqf/A;->W0()Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lqf/S;->O0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public bridge synthetic P0(Lrf/g;)Lqf/S;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lqf/A;->X0(Lrf/g;)Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic S0(Lrf/g;)Lqf/M0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lqf/A;->X0(Lrf/g;)Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected abstract W0()Lqf/d0;
.end method

.method public X0(Lrf/g;)Lqf/d0;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lqf/A;->W0()Lqf/d0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1, v0}, Lrf/g;->h(Luf/i;)Lqf/S;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    check-cast p1, Lqf/d0;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lqf/A;->Y0(Lqf/d0;)Lqf/A;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method

.method public abstract Y0(Lqf/d0;)Lqf/A;
.end method

.method public o()Ljf/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqf/A;->W0()Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lqf/S;->o()Ljf/k;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
