.class public final Lqf/V;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqf/V$b;
    }
.end annotation


# static fields
.field public static final a:Lqf/V;

.field private static final b:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lqf/V;

    .line 2
    .line 3
    invoke-direct {v0}, Lqf/V;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lqf/V;->a:Lqf/V;

    .line 7
    .line 8
    sget-object v0, Lqf/V$a;->a:Lqf/V$a;

    .line 9
    .line 10
    sput-object v0, Lqf/V;->b:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic a(Lqf/v0;Ljava/util/List;Lqf/r0;ZLrf/g;)Lqf/d0;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lqf/V;->l(Lqf/v0;Ljava/util/List;Lqf/r0;ZLrf/g;)Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic b(Lqf/v0;Ljava/util/List;Lqf/r0;ZLjf/k;Lrf/g;)Lqf/d0;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lqf/V;->o(Lqf/v0;Ljava/util/List;Lqf/r0;ZLjf/k;Lrf/g;)Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final c(Lye/l0;Ljava/util/List;)Lqf/d0;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "arguments"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lqf/m0;

    .line 12
    .line 13
    sget-object v1, Lqf/o0$a;->a:Lqf/o0$a;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v0, v1, v2}, Lqf/m0;-><init>(Lqf/o0;Z)V

    .line 17
    .line 18
    .line 19
    sget-object v1, Lqf/n0;->e:Lqf/n0$a;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-virtual {v1, v2, p0, p1}, Lqf/n0$a;->a(Lqf/n0;Lye/l0;Ljava/util/List;)Lqf/n0;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object p1, Lqf/r0;->b:Lqf/r0$a;

    .line 27
    .line 28
    invoke-virtual {p1}, Lqf/r0$a;->k()Lqf/r0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p0, p1}, Lqf/m0;->h(Lqf/n0;Lqf/r0;)Lqf/d0;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method private final d(Lqf/v0;Ljava/util/List;Lrf/g;)Ljf/k;
    .locals 2

    .line 1
    invoke-interface {p1}, Lqf/v0;->p()Lye/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lye/m0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lye/m0;

    .line 10
    .line 11
    invoke-interface {v0}, Lye/h;->p()Lqf/d0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lqf/S;->o()Ljf/k;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    instance-of v1, v0, Lye/e;

    .line 21
    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    if-nez p3, :cond_1

    .line 25
    .line 26
    invoke-static {v0}, Lff/e;->s(Lye/m;)Lye/H;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    invoke-static {p3}, Lff/e;->r(Lye/H;)Lrf/g;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    check-cast v0, Lye/e;

    .line 41
    .line 42
    invoke-static {v0, p3}, LBe/A;->b(Lye/e;Lrf/g;)Ljf/k;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :cond_2
    check-cast v0, Lye/e;

    .line 48
    .line 49
    sget-object v1, Lqf/w0;->c:Lqf/w0$a;

    .line 50
    .line 51
    invoke-virtual {v1, p1, p2}, Lqf/w0$a;->b(Lqf/v0;Ljava/util/List;)Lqf/E0;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {v0, p1, p3}, LBe/A;->a(Lye/e;Lqf/E0;Lrf/g;)Ljf/k;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1

    .line 60
    :cond_3
    instance-of p2, v0, Lye/l0;

    .line 61
    .line 62
    if-eqz p2, :cond_4

    .line 63
    .line 64
    sget-object p1, Lsf/h;->e:Lsf/h;

    .line 65
    .line 66
    check-cast v0, Lye/l0;

    .line 67
    .line 68
    invoke-interface {v0}, Lye/J;->getName()LXe/f;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-virtual {p2}, LXe/f;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    filled-new-array {p2}, [Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    const/4 p3, 0x1

    .line 81
    invoke-static {p1, p3, p2}, Lsf/l;->a(Lsf/h;Z[Ljava/lang/String;)Lsf/g;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    return-object p1

    .line 86
    :cond_4
    instance-of p2, p1, Lqf/Q;

    .line 87
    .line 88
    if-eqz p2, :cond_5

    .line 89
    .line 90
    check-cast p1, Lqf/Q;

    .line 91
    .line 92
    invoke-virtual {p1}, Lqf/Q;->e()Ljf/k;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1

    .line 97
    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    new-instance p3, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    const-string v1, "Unsupported classifier: "

    .line 105
    .line 106
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v0, " for constructor: "

    .line 113
    .line 114
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p2
.end method

.method public static final e(Lqf/d0;Lqf/d0;)Lqf/M0;
    .locals 1

    .line 1
    const-string v0, "lowerBound"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "upperBound"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    new-instance v0, Lqf/J;

    .line 19
    .line 20
    invoke-direct {v0, p0, p1}, Lqf/J;-><init>(Lqf/d0;Lqf/d0;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public static final f(Lqf/r0;Ldf/q;Z)Lqf/d0;
    .locals 4

    .line 1
    const-string v0, "attributes"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "constructor"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lsf/h;->c:Lsf/h;

    .line 16
    .line 17
    const-string v2, "unknown integer literal type"

    .line 18
    .line 19
    filled-new-array {v2}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-static {v1, v3, v2}, Lsf/l;->a(Lsf/h;Z[Ljava/lang/String;)Lsf/g;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {p0, p1, v0, p2, v1}, Lqf/V;->m(Lqf/r0;Lqf/v0;Ljava/util/List;ZLjf/k;)Lqf/d0;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method private final g(Lqf/v0;Lrf/g;Ljava/util/List;)Lqf/V$b;
    .locals 2

    .line 1
    invoke-interface {p1}, Lqf/v0;->p()Lye/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p2, p1}, Lrf/g;->f(Lye/m;)Lye/h;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of v1, p1, Lye/l0;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    new-instance p2, Lqf/V$b;

    .line 20
    .line 21
    check-cast p1, Lye/l0;

    .line 22
    .line 23
    invoke-static {p1, p3}, Lqf/V;->c(Lye/l0;Ljava/util/List;)Lqf/d0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {p2, p1, v0}, Lqf/V$b;-><init>(Lqf/d0;Lqf/v0;)V

    .line 28
    .line 29
    .line 30
    return-object p2

    .line 31
    :cond_1
    invoke-interface {p1}, Lye/h;->l()Lqf/v0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p1, p2}, Lqf/v0;->o(Lrf/g;)Lqf/v0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const-string p2, "refine(...)"

    .line 40
    .line 41
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    new-instance p2, Lqf/V$b;

    .line 45
    .line 46
    invoke-direct {p2, v0, p1}, Lqf/V$b;-><init>(Lqf/d0;Lqf/v0;)V

    .line 47
    .line 48
    .line 49
    return-object p2

    .line 50
    :cond_2
    :goto_0
    return-object v0
.end method

.method public static final h(Lqf/r0;Lye/e;Ljava/util/List;)Lqf/d0;
    .locals 8

    .line 1
    const-string v0, "attributes"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "descriptor"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "arguments"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Lye/h;->l()Lqf/v0;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string p1, "getTypeConstructor(...)"

    .line 21
    .line 22
    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/16 v6, 0x10

    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    move-object v1, p0

    .line 31
    move-object v3, p2

    .line 32
    invoke-static/range {v1 .. v7}, Lqf/V;->k(Lqf/r0;Lqf/v0;Ljava/util/List;ZLrf/g;ILjava/lang/Object;)Lqf/d0;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public static final i(Lqf/r0;Lqf/v0;Ljava/util/List;Z)Lqf/d0;
    .locals 8

    .line 1
    const-string v0, "attributes"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "constructor"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "arguments"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/16 v6, 0x10

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    move-object v1, p0

    .line 21
    move-object v2, p1

    .line 22
    move-object v3, p2

    .line 23
    move v4, p3

    .line 24
    invoke-static/range {v1 .. v7}, Lqf/V;->k(Lqf/r0;Lqf/v0;Ljava/util/List;ZLrf/g;ILjava/lang/Object;)Lqf/d0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static final j(Lqf/r0;Lqf/v0;Ljava/util/List;ZLrf/g;)Lqf/d0;
    .locals 7

    .line 1
    const-string v0, "attributes"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "constructor"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "arguments"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lxf/a;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    if-nez p3, :cond_0

    .line 29
    .line 30
    invoke-interface {p1}, Lqf/v0;->p()Lye/h;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-interface {p1}, Lqf/v0;->p()Lye/h;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p0}, Lye/h;->p()Lqf/d0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string p1, "getDefaultType(...)"

    .line 48
    .line 49
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_0
    sget-object v0, Lqf/V;->a:Lqf/V;

    .line 54
    .line 55
    invoke-direct {v0, p1, p2, p4}, Lqf/V;->d(Lqf/v0;Ljava/util/List;Lrf/g;)Ljf/k;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    new-instance v6, Lqf/T;

    .line 60
    .line 61
    invoke-direct {v6, p1, p2, p0, p3}, Lqf/T;-><init>(Lqf/v0;Ljava/util/List;Lqf/r0;Z)V

    .line 62
    .line 63
    .line 64
    move-object v1, p0

    .line 65
    move-object v2, p1

    .line 66
    move-object v3, p2

    .line 67
    move v4, p3

    .line 68
    invoke-static/range {v1 .. v6}, Lqf/V;->n(Lqf/r0;Lqf/v0;Ljava/util/List;ZLjf/k;Lkotlin/jvm/functions/Function1;)Lqf/d0;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method

.method public static synthetic k(Lqf/r0;Lqf/v0;Ljava/util/List;ZLrf/g;ILjava/lang/Object;)Lqf/d0;
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x10

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lqf/V;->j(Lqf/r0;Lqf/v0;Ljava/util/List;ZLrf/g;)Lqf/d0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final l(Lqf/v0;Ljava/util/List;Lqf/r0;ZLrf/g;)Lqf/d0;
    .locals 1

    .line 1
    const-string v0, "refiner"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lqf/V;->a:Lqf/V;

    .line 7
    .line 8
    invoke-direct {v0, p0, p4, p1}, Lqf/V;->g(Lqf/v0;Lrf/g;Ljava/util/List;)Lqf/V$b;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-virtual {p0}, Lqf/V$b;->a()Lqf/d0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    invoke-virtual {p0}, Lqf/V$b;->b()Lqf/v0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p2, p0, p1, p3, p4}, Lqf/V;->j(Lqf/r0;Lqf/v0;Ljava/util/List;ZLrf/g;)Lqf/d0;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static final m(Lqf/r0;Lqf/v0;Ljava/util/List;ZLjf/k;)Lqf/d0;
    .locals 8

    .line 1
    const-string v0, "attributes"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "constructor"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "arguments"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "memberScope"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Lqf/e0;

    .line 22
    .line 23
    new-instance v2, Lqf/U;

    .line 24
    .line 25
    move-object v5, p0

    .line 26
    move-object v3, p1

    .line 27
    move-object v4, p2

    .line 28
    move v6, p3

    .line 29
    move-object v7, p4

    .line 30
    invoke-direct/range {v2 .. v7}, Lqf/U;-><init>(Lqf/v0;Ljava/util/List;Lqf/r0;ZLjf/k;)V

    .line 31
    .line 32
    .line 33
    move p0, v6

    .line 34
    move-object v6, v2

    .line 35
    move-object v2, v3

    .line 36
    move-object v3, v4

    .line 37
    move v4, p0

    .line 38
    move-object p0, v5

    .line 39
    move-object v5, v7

    .line 40
    invoke-direct/range {v1 .. v6}, Lqf/e0;-><init>(Lqf/v0;Ljava/util/List;ZLjf/k;Lkotlin/jvm/functions/Function1;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lxf/a;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    return-object v1

    .line 50
    :cond_0
    new-instance p1, Lqf/f0;

    .line 51
    .line 52
    invoke-direct {p1, v1, p0}, Lqf/f0;-><init>(Lqf/d0;Lqf/r0;)V

    .line 53
    .line 54
    .line 55
    return-object p1
.end method

.method public static final n(Lqf/r0;Lqf/v0;Ljava/util/List;ZLjf/k;Lkotlin/jvm/functions/Function1;)Lqf/d0;
    .locals 7

    .line 1
    const-string v0, "attributes"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "constructor"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "arguments"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "memberScope"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "refinedTypeFactory"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Lqf/e0;

    .line 27
    .line 28
    move-object v2, p1

    .line 29
    move-object v3, p2

    .line 30
    move v4, p3

    .line 31
    move-object v5, p4

    .line 32
    move-object v6, p5

    .line 33
    invoke-direct/range {v1 .. v6}, Lqf/e0;-><init>(Lqf/v0;Ljava/util/List;ZLjf/k;Lkotlin/jvm/functions/Function1;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lxf/a;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    return-object v1

    .line 43
    :cond_0
    new-instance p1, Lqf/f0;

    .line 44
    .line 45
    invoke-direct {p1, v1, p0}, Lqf/f0;-><init>(Lqf/d0;Lqf/r0;)V

    .line 46
    .line 47
    .line 48
    return-object p1
.end method

.method private static final o(Lqf/v0;Ljava/util/List;Lqf/r0;ZLjf/k;Lrf/g;)Lqf/d0;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lqf/V;->a:Lqf/V;

    .line 7
    .line 8
    invoke-direct {v0, p0, p5, p1}, Lqf/V;->g(Lqf/v0;Lrf/g;Ljava/util/List;)Lqf/V$b;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-virtual {p0}, Lqf/V$b;->a()Lqf/d0;

    .line 17
    .line 18
    .line 19
    move-result-object p5

    .line 20
    if-eqz p5, :cond_1

    .line 21
    .line 22
    return-object p5

    .line 23
    :cond_1
    invoke-virtual {p0}, Lqf/V$b;->b()Lqf/v0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p2, p0, p1, p3, p4}, Lqf/V;->m(Lqf/r0;Lqf/v0;Ljava/util/List;ZLjf/k;)Lqf/d0;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method
