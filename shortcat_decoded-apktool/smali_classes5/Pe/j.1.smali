.class public final LPe/j;
.super Lqf/A;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lqf/a0;


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
    iput-object p1, p0, LPe/j;->b:Lqf/d0;

    .line 10
    .line 11
    return-void
.end method

.method private final Z0(Lqf/d0;)Lqf/d0;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Lqf/d0;->U0(Z)Lqf/d0;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-static {p1}, Lvf/d;->y(Lqf/S;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    new-instance p1, LPe/j;

    .line 14
    .line 15
    invoke-direct {p1, v0}, LPe/j;-><init>(Lqf/d0;)V

    .line 16
    .line 17
    .line 18
    return-object p1
.end method


# virtual methods
.method public F0()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public O0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public bridge synthetic R0(Z)Lqf/M0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LPe/j;->U0(Z)Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public T(Lqf/S;)Lqf/S;
    .locals 2

    .line 1
    const-string v0, "replacement"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lqf/S;->Q0()Lqf/M0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lvf/d;->y(Lqf/S;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lqf/J0;->l(Lqf/S;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    instance-of v0, p1, Lqf/d0;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    check-cast p1, Lqf/d0;

    .line 28
    .line 29
    invoke-direct {p0, p1}, LPe/j;->Z0(Lqf/d0;)Lqf/d0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_1
    instance-of v0, p1, Lqf/I;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    move-object v0, p1

    .line 39
    check-cast v0, Lqf/I;

    .line 40
    .line 41
    invoke-virtual {v0}, Lqf/I;->V0()Lqf/d0;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-direct {p0, v1}, LPe/j;->Z0(Lqf/d0;)Lqf/d0;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0}, Lqf/I;->W0()Lqf/d0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-direct {p0, v0}, LPe/j;->Z0(Lqf/d0;)Lqf/d0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v1, v0}, Lqf/V;->e(Lqf/d0;Lqf/d0;)Lqf/M0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {p1}, Lqf/L0;->a(Lqf/S;)Lqf/S;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {v0, p1}, Lqf/L0;->d(Lqf/M0;Lqf/S;)Lqf/M0;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1

    .line 70
    :cond_2
    new-instance p1, LTd/r;

    .line 71
    .line 72
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 73
    .line 74
    .line 75
    throw p1
.end method

.method public bridge synthetic T0(Lqf/r0;)Lqf/M0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LPe/j;->a1(Lqf/r0;)LPe/j;

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
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, LPe/j;->W0()Lqf/d0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p1, v0}, Lqf/d0;->U0(Z)Lqf/d0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1

    .line 13
    :cond_0
    return-object p0
.end method

.method public bridge synthetic V0(Lqf/r0;)Lqf/d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LPe/j;->a1(Lqf/r0;)LPe/j;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected W0()Lqf/d0;
    .locals 1

    .line 1
    iget-object v0, p0, LPe/j;->b:Lqf/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic Y0(Lqf/d0;)Lqf/A;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LPe/j;->b1(Lqf/d0;)LPe/j;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public a1(Lqf/r0;)LPe/j;
    .locals 2

    .line 1
    const-string v0, "newAttributes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LPe/j;

    .line 7
    .line 8
    invoke-virtual {p0}, LPe/j;->W0()Lqf/d0;

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
    invoke-direct {v0, p1}, LPe/j;-><init>(Lqf/d0;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public b1(Lqf/d0;)LPe/j;
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LPe/j;

    .line 7
    .line 8
    invoke-direct {v0, p1}, LPe/j;-><init>(Lqf/d0;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
