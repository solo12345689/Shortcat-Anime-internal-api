.class public final Lqf/a;
.super Lqf/A;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final b:Lqf/d0;

.field private final c:Lqf/d0;


# direct methods
.method public constructor <init>(Lqf/d0;Lqf/d0;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "abbreviation"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lqf/A;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lqf/a;->b:Lqf/d0;

    .line 15
    .line 16
    iput-object p2, p0, Lqf/a;->c:Lqf/d0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final G()Lqf/d0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqf/a;->W0()Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic P0(Lrf/g;)Lqf/S;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lqf/a;->b1(Lrf/g;)Lqf/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic R0(Z)Lqf/M0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lqf/a;->a1(Z)Lqf/a;

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
    invoke-virtual {p0, p1}, Lqf/a;->b1(Lrf/g;)Lqf/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic T0(Lqf/r0;)Lqf/M0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lqf/a;->V0(Lqf/r0;)Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic U0(Z)Lqf/d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lqf/a;->a1(Z)Lqf/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public V0(Lqf/r0;)Lqf/d0;
    .locals 2

    .line 1
    const-string v0, "newAttributes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lqf/a;

    .line 7
    .line 8
    invoke-virtual {p0}, Lqf/a;->W0()Lqf/d0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, p1}, Lqf/d0;->V0(Lqf/r0;)Lqf/d0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v1, p0, Lqf/a;->c:Lqf/d0;

    .line 17
    .line 18
    invoke-direct {v0, p1, v1}, Lqf/a;-><init>(Lqf/d0;Lqf/d0;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method protected W0()Lqf/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/a;->b:Lqf/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic X0(Lrf/g;)Lqf/d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lqf/a;->b1(Lrf/g;)Lqf/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic Y0(Lqf/d0;)Lqf/A;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lqf/a;->c1(Lqf/d0;)Lqf/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final Z0()Lqf/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/a;->c:Lqf/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public a1(Z)Lqf/a;
    .locals 3

    .line 1
    new-instance v0, Lqf/a;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqf/a;->W0()Lqf/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, p1}, Lqf/d0;->U0(Z)Lqf/d0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lqf/a;->c:Lqf/d0;

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Lqf/d0;->U0(Z)Lqf/d0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {v0, v1, p1}, Lqf/a;-><init>(Lqf/d0;Lqf/d0;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public b1(Lrf/g;)Lqf/a;
    .locals 4

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lqf/a;

    .line 7
    .line 8
    invoke-virtual {p0}, Lqf/a;->W0()Lqf/d0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p1, v1}, Lrf/g;->h(Luf/i;)Lqf/S;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    check-cast v1, Lqf/d0;

    .line 22
    .line 23
    iget-object v3, p0, Lqf/a;->c:Lqf/d0;

    .line 24
    .line 25
    invoke-virtual {p1, v3}, Lrf/g;->h(Luf/i;)Lqf/S;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    check-cast p1, Lqf/d0;

    .line 33
    .line 34
    invoke-direct {v0, v1, p1}, Lqf/a;-><init>(Lqf/d0;Lqf/d0;)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public c1(Lqf/d0;)Lqf/a;
    .locals 2

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lqf/a;

    .line 7
    .line 8
    iget-object v1, p0, Lqf/a;->c:Lqf/d0;

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, Lqf/a;-><init>(Lqf/d0;Lqf/d0;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
