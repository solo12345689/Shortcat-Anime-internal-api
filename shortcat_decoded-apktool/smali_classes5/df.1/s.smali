.class public final Ldf/s;
.super Ldf/g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/s$a;,
        Ldf/s$b;
    }
.end annotation


# static fields
.field public static final b:Ldf/s$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldf/s$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldf/s$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldf/s;->b:Ldf/s$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LXe/b;I)V
    .locals 1

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Ldf/f;

    invoke-direct {v0, p1, p2}, Ldf/f;-><init>(LXe/b;I)V

    invoke-direct {p0, v0}, Ldf/s;-><init>(Ldf/f;)V

    return-void
.end method

.method public constructor <init>(Ldf/f;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Ldf/s$b$b;

    invoke-direct {v0, p1}, Ldf/s$b$b;-><init>(Ldf/f;)V

    invoke-direct {p0, v0}, Ldf/s;-><init>(Ldf/s$b;)V

    return-void
.end method

.method public constructor <init>(Ldf/s$b;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Ldf/g;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Lye/H;)Lqf/S;
    .locals 3

    .line 1
    const-string v0, "module"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lqf/r0;->b:Lqf/r0$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lqf/r0$a;->k()Lqf/r0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {p1}, Lye/H;->n()Lve/i;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Lve/i;->F()Lye/e;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "getKClass(...)"

    .line 21
    .line 22
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Lqf/D0;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Ldf/s;->c(Lye/H;)Lqf/S;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {v2, p1}, Lqf/D0;-><init>(Lqf/S;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {v0, v1, p1}, Lqf/V;->h(Lqf/r0;Lye/e;Ljava/util/List;)Lqf/d0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
.end method

.method public final c(Lye/H;)Lqf/S;
    .locals 5

    .line 1
    const-string v0, "module"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ldf/g;->b()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ldf/s$b;

    .line 11
    .line 12
    instance-of v1, v0, Ldf/s$b$a;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ldf/g;->b()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ldf/s$b$a;

    .line 21
    .line 22
    invoke-virtual {p1}, Ldf/s$b$a;->a()Lqf/S;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    instance-of v0, v0, Ldf/s$b$b;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    invoke-virtual {p0}, Ldf/g;->b()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ldf/s$b$b;

    .line 36
    .line 37
    invoke-virtual {v0}, Ldf/s$b$b;->c()Ldf/f;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ldf/f;->a()LXe/b;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0}, Ldf/f;->b()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-static {p1, v1}, Lye/y;->b(Lye/H;LXe/b;)Lye/e;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-nez v2, :cond_1

    .line 54
    .line 55
    sget-object p1, Lsf/k;->h:Lsf/k;

    .line 56
    .line 57
    invoke-virtual {v1}, LXe/b;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {p1, v0}, Lsf/l;->d(Lsf/k;[Ljava/lang/String;)Lsf/i;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :cond_1
    invoke-interface {v2}, Lye/e;->p()Lqf/d0;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const-string v2, "getDefaultType(...)"

    .line 79
    .line 80
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v1}, Lvf/d;->D(Lqf/S;)Lqf/S;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const/4 v2, 0x0

    .line 88
    :goto_0
    if-ge v2, v0, :cond_2

    .line 89
    .line 90
    invoke-interface {p1}, Lye/H;->n()Lve/i;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    sget-object v4, Lqf/N0;->e:Lqf/N0;

    .line 95
    .line 96
    invoke-virtual {v3, v4, v1}, Lve/i;->m(Lqf/N0;Lqf/S;)Lqf/d0;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const-string v3, "getArrayType(...)"

    .line 101
    .line 102
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    add-int/lit8 v2, v2, 0x1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_2
    return-object v1

    .line 109
    :cond_3
    new-instance p1, LTd/r;

    .line 110
    .line 111
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 112
    .line 113
    .line 114
    throw p1
.end method
