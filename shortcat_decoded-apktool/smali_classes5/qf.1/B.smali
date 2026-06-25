.class public abstract Lqf/B;
.super Lqf/A;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final b:Lqf/d0;


# direct methods
.method public constructor <init>(Lqf/d0;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lqf/A;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lqf/B;->b:Lqf/d0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic R0(Z)Lqf/M0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lqf/B;->U0(Z)Lqf/d0;

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
    invoke-virtual {p0, p1}, Lqf/B;->V0(Lqf/r0;)Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public U0(Z)Lqf/d0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqf/A;->O0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lqf/B;->W0()Lqf/d0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Lqf/d0;->U0(Z)Lqf/d0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0}, Lqf/A;->M0()Lqf/r0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p1, v0}, Lqf/d0;->V0(Lqf/r0;)Lqf/d0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
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
    invoke-virtual {p0}, Lqf/A;->M0()Lqf/r0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lqf/f0;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1}, Lqf/f0;-><init>(Lqf/d0;Lqf/r0;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    return-object p0
.end method

.method protected W0()Lqf/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/B;->b:Lqf/d0;

    .line 2
    .line 3
    return-object v0
.end method
