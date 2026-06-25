.class public final Lsf/i;
.super Lqf/d0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final b:Lqf/v0;

.field private final c:Ljf/k;

.field private final d:Lsf/k;

.field private final e:Ljava/util/List;

.field private final f:Z

.field private final g:[Ljava/lang/String;

.field private final h:Ljava/lang/String;


# direct methods
.method public varargs constructor <init>(Lqf/v0;Ljf/k;Lsf/k;Ljava/util/List;Z[Ljava/lang/String;)V
    .locals 1

    const-string v0, "constructor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lqf/d0;-><init>()V

    .line 4
    iput-object p1, p0, Lsf/i;->b:Lqf/v0;

    .line 5
    iput-object p2, p0, Lsf/i;->c:Ljf/k;

    .line 6
    iput-object p3, p0, Lsf/i;->d:Lsf/k;

    .line 7
    iput-object p4, p0, Lsf/i;->e:Ljava/util/List;

    .line 8
    iput-boolean p5, p0, Lsf/i;->f:Z

    .line 9
    iput-object p6, p0, Lsf/i;->g:[Ljava/lang/String;

    .line 10
    sget-object p1, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    invoke-virtual {p3}, Lsf/k;->b()Ljava/lang/String;

    move-result-object p1

    array-length p2, p6

    invoke-static {p6, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    array-length p3, p2

    invoke-static {p2, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "format(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lsf/i;->h:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lqf/v0;Ljf/k;Lsf/k;Ljava/util/List;Z[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    .line 1
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    move-result-object p4

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p7, 0x10

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, p5

    move-object v6, p6

    .line 2
    invoke-direct/range {v0 .. v6}, Lsf/i;-><init>(Lqf/v0;Ljf/k;Lsf/k;Ljava/util/List;Z[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public L0()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/i;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public M0()Lqf/r0;
    .locals 1

    .line 1
    sget-object v0, Lqf/r0;->b:Lqf/r0$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqf/r0$a;->k()Lqf/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public N0()Lqf/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/i;->b:Lqf/v0;

    .line 2
    .line 3
    return-object v0
.end method

.method public O0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lsf/i;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic P0(Lrf/g;)Lqf/S;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lsf/i;->Y0(Lrf/g;)Lsf/i;

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
    invoke-virtual {p0, p1}, Lsf/i;->U0(Z)Lqf/d0;

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
    invoke-virtual {p0, p1}, Lsf/i;->Y0(Lrf/g;)Lsf/i;

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
    invoke-virtual {p0, p1}, Lsf/i;->V0(Lqf/r0;)Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public U0(Z)Lqf/d0;
    .locals 7

    .line 1
    new-instance v0, Lsf/i;

    .line 2
    .line 3
    invoke-virtual {p0}, Lsf/i;->N0()Lqf/v0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lsf/i;->o()Ljf/k;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, p0, Lsf/i;->d:Lsf/k;

    .line 12
    .line 13
    invoke-virtual {p0}, Lsf/i;->L0()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    iget-object v5, p0, Lsf/i;->g:[Ljava/lang/String;

    .line 18
    .line 19
    array-length v6, v5

    .line 20
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    move-object v6, v5

    .line 25
    check-cast v6, [Ljava/lang/String;

    .line 26
    .line 27
    move v5, p1

    .line 28
    invoke-direct/range {v0 .. v6}, Lsf/i;-><init>(Lqf/v0;Ljf/k;Lsf/k;Ljava/util/List;Z[Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v0
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
    return-object p0
.end method

.method public final W0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/i;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final X0()Lsf/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/i;->d:Lsf/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public Y0(Lrf/g;)Lsf/i;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final Z0(Ljava/util/List;)Lsf/i;
    .locals 8

    .line 1
    const-string v0, "newArguments"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lsf/i;

    .line 7
    .line 8
    invoke-virtual {p0}, Lsf/i;->N0()Lqf/v0;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p0}, Lsf/i;->o()Ljf/k;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    iget-object v4, p0, Lsf/i;->d:Lsf/k;

    .line 17
    .line 18
    invoke-virtual {p0}, Lsf/i;->O0()Z

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    iget-object v0, p0, Lsf/i;->g:[Ljava/lang/String;

    .line 23
    .line 24
    array-length v5, v0

    .line 25
    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    move-object v7, v0

    .line 30
    check-cast v7, [Ljava/lang/String;

    .line 31
    .line 32
    move-object v5, p1

    .line 33
    invoke-direct/range {v1 .. v7}, Lsf/i;-><init>(Lqf/v0;Ljf/k;Lsf/k;Ljava/util/List;Z[Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v1
.end method

.method public o()Ljf/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lsf/i;->c:Ljf/k;

    .line 2
    .line 3
    return-object v0
.end method
