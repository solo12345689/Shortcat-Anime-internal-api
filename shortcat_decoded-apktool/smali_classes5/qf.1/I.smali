.class public abstract Lqf/I;
.super Lqf/M0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Luf/g;


# instance fields
.field private final b:Lqf/d0;

.field private final c:Lqf/d0;


# direct methods
.method public constructor <init>(Lqf/d0;Lqf/d0;)V
    .locals 1

    .line 1
    const-string v0, "lowerBound"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "upperBound"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, v0}, Lqf/M0;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lqf/I;->b:Lqf/d0;

    .line 16
    .line 17
    iput-object p2, p0, Lqf/I;->c:Lqf/d0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public L0()Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqf/I;->U0()Lqf/d0;

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
    invoke-virtual {p0}, Lqf/I;->U0()Lqf/d0;

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
    invoke-virtual {p0}, Lqf/I;->U0()Lqf/d0;

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
    invoke-virtual {p0}, Lqf/I;->U0()Lqf/d0;

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

.method public abstract U0()Lqf/d0;
.end method

.method public final V0()Lqf/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/I;->b:Lqf/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final W0()Lqf/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/I;->c:Lqf/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract X0(Laf/n;Laf/w;)Ljava/lang/String;
.end method

.method public o()Ljf/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqf/I;->U0()Lqf/d0;

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

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Laf/n;->k:Laf/n;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Laf/n;->S(Lqf/S;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
