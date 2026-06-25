.class public abstract Lh0/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static synthetic a()Lh0/m;
    .locals 1

    .line 1
    invoke-static {}, Lh0/o;->c()Lh0/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static final b(LY/m;I)Lh0/g;
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
    const-string v1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:57)"

    .line 9
    .line 10
    const v2, 0xebd1ab

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p1, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const p1, 0x753e2915

    .line 17
    .line 18
    .line 19
    invoke-interface {p0, p1}, LY/m;->V(I)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    new-array p1, p1, [Ljava/lang/Object;

    .line 24
    .line 25
    sget-object v0, Lh0/m;->e:Lh0/m$a;

    .line 26
    .line 27
    invoke-virtual {v0}, Lh0/m$a;->a()Lh0/v;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {p0}, LY/m;->D()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    sget-object v2, LY/m;->a:LY/m$a;

    .line 36
    .line 37
    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-ne v1, v2, :cond_1

    .line 42
    .line 43
    new-instance v1, Lh0/n;

    .line 44
    .line 45
    invoke-direct {v1}, Lh0/n;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-interface {p0, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    check-cast v1, Lie/a;

    .line 52
    .line 53
    const/16 v2, 0x180

    .line 54
    .line 55
    invoke-static {p1, v0, v1, p0, v2}, Lh0/d;->d([Ljava/lang/Object;Lh0/v;Lie/a;LY/m;I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Lh0/m;

    .line 60
    .line 61
    invoke-static {}, Lh0/s;->g()LY/b1;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-interface {p0, v0}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Lh0/p;

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lh0/m;->s(Lh0/p;)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p0}, LY/m;->O()V

    .line 75
    .line 76
    .line 77
    invoke-static {}, LY/w;->L()Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_2

    .line 82
    .line 83
    invoke-static {}, LY/w;->T()V

    .line 84
    .line 85
    .line 86
    :cond_2
    return-object p1
.end method

.method private static final c()Lh0/m;
    .locals 3

    .line 1
    new-instance v0, Lh0/m;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v1, v2, v1}, Lh0/m;-><init>(Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
