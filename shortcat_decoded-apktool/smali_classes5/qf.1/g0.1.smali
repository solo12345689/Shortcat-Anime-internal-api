.class public final Lqf/g0;
.super Lqf/A;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lqf/K0;


# instance fields
.field private final b:Lqf/d0;

.field private final c:Lqf/S;


# direct methods
.method public constructor <init>(Lqf/d0;Lqf/S;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "enhancement"

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
    iput-object p1, p0, Lqf/g0;->b:Lqf/d0;

    .line 15
    .line 16
    iput-object p2, p0, Lqf/g0;->c:Lqf/S;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public bridge synthetic H0()Lqf/M0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqf/g0;->Z0()Lqf/d0;

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
    invoke-virtual {p0, p1}, Lqf/g0;->a1(Lrf/g;)Lqf/g0;

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
    invoke-virtual {p0, p1}, Lqf/g0;->U0(Z)Lqf/d0;

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
    invoke-virtual {p0, p1}, Lqf/g0;->a1(Lrf/g;)Lqf/g0;

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
    invoke-virtual {p0, p1}, Lqf/g0;->V0(Lqf/r0;)Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public U0(Z)Lqf/d0;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lqf/g0;->Z0()Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lqf/d0;->U0(Z)Lqf/d0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lqf/g0;->j0()Lqf/S;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lqf/S;->Q0()Lqf/M0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1, p1}, Lqf/M0;->R0(Z)Lqf/M0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {v0, p1}, Lqf/L0;->d(Lqf/M0;Lqf/S;)Lqf/M0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    .line 26
    .line 27
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    check-cast p1, Lqf/d0;

    .line 31
    .line 32
    return-object p1
.end method

.method public V0(Lqf/r0;)Lqf/d0;
    .locals 1

    .line 1
    const-string v0, "newAttributes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lqf/g0;->Z0()Lqf/d0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lqf/d0;->V0(Lqf/r0;)Lqf/d0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0}, Lqf/g0;->j0()Lqf/S;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {p1, v0}, Lqf/L0;->d(Lqf/M0;Lqf/S;)Lqf/M0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    .line 23
    .line 24
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast p1, Lqf/d0;

    .line 28
    .line 29
    return-object p1
.end method

.method protected W0()Lqf/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/g0;->b:Lqf/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic X0(Lrf/g;)Lqf/d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lqf/g0;->a1(Lrf/g;)Lqf/g0;

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
    invoke-virtual {p0, p1}, Lqf/g0;->b1(Lqf/d0;)Lqf/g0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public Z0()Lqf/d0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqf/g0;->W0()Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public a1(Lrf/g;)Lqf/g0;
    .locals 3

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lqf/g0;

    .line 7
    .line 8
    invoke-virtual {p0}, Lqf/g0;->W0()Lqf/d0;

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
    invoke-virtual {p0}, Lqf/g0;->j0()Lqf/S;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p1, v2}, Lrf/g;->h(Luf/i;)Lqf/S;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {v0, v1, p1}, Lqf/g0;-><init>(Lqf/d0;Lqf/S;)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public b1(Lqf/d0;)Lqf/g0;
    .locals 2

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lqf/g0;

    .line 7
    .line 8
    invoke-virtual {p0}, Lqf/g0;->j0()Lqf/S;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, p1, v1}, Lqf/g0;-><init>(Lqf/d0;Lqf/S;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public j0()Lqf/S;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/g0;->c:Lqf/S;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "[@EnhancedForWarnings("

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lqf/g0;->j0()Lqf/S;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, ")] "

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lqf/g0;->Z0()Lqf/d0;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
.end method
