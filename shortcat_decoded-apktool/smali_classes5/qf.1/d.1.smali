.class public final Lqf/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Lqf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lqf/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lqf/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lqf/d;->a:Lqf/d;

    .line 7
    .line 8
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

.method private final a(Luf/r;Luf/j;Luf/j;)Z
    .locals 8

    .line 1
    invoke-interface {p1, p2}, Luf/r;->m(Luf/i;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1, p3}, Luf/r;->m(Luf/i;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-ne v0, v1, :cond_6

    .line 11
    .line 12
    invoke-interface {p1, p2}, Luf/r;->b0(Luf/i;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-interface {p1, p3}, Luf/r;->b0(Luf/i;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-ne v0, v1, :cond_6

    .line 21
    .line 22
    invoke-interface {p1, p2}, Luf/r;->q(Luf/j;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-interface {p1, p3}, Luf/r;->q(Luf/j;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-ne v0, v1, :cond_6

    .line 31
    .line 32
    invoke-interface {p1, p2}, Luf/r;->e(Luf/j;)Luf/p;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {p1, p3}, Luf/r;->e(Luf/j;)Luf/p;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {p1, v0, v1}, Luf/r;->j0(Luf/p;Luf/p;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    invoke-interface {p1, p2, p3}, Luf/u;->S(Luf/j;Luf/j;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v1, 0x1

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    return v1

    .line 55
    :cond_1
    invoke-interface {p1, p2}, Luf/r;->m(Luf/i;)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    move v3, v2

    .line 60
    :goto_0
    if-ge v3, v0, :cond_5

    .line 61
    .line 62
    invoke-interface {p1, p2, v3}, Luf/r;->B0(Luf/i;I)Luf/m;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-interface {p1, p3, v3}, Luf/r;->B0(Luf/i;I)Luf/m;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-interface {p1, v4}, Luf/r;->c(Luf/m;)Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    invoke-interface {p1, v5}, Luf/r;->c(Luf/m;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-eq v6, v7, :cond_2

    .line 79
    .line 80
    return v2

    .line 81
    :cond_2
    invoke-interface {p1, v4}, Luf/r;->c(Luf/m;)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-nez v6, :cond_4

    .line 86
    .line 87
    invoke-interface {p1, v4}, Luf/r;->o0(Luf/m;)Luf/v;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    invoke-interface {p1, v5}, Luf/r;->o0(Luf/m;)Luf/v;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    if-eq v6, v7, :cond_3

    .line 96
    .line 97
    return v2

    .line 98
    :cond_3
    invoke-interface {p1, v4}, Luf/r;->m0(Luf/m;)Luf/i;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-interface {p1, v5}, Luf/r;->m0(Luf/m;)Luf/i;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-static {v5}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-direct {p0, p1, v4, v5}, Lqf/d;->c(Luf/r;Luf/i;Luf/i;)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-nez v4, :cond_4

    .line 117
    .line 118
    return v2

    .line 119
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_5
    return v1

    .line 123
    :cond_6
    :goto_1
    return v2
.end method

.method private final c(Luf/r;Luf/i;Luf/i;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p2, p3, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-interface {p1, p2}, Luf/r;->d(Luf/i;)Luf/j;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {p1, p3}, Luf/r;->d(Luf/i;)Luf/j;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-direct {p0, p1, v1, v2}, Lqf/d;->a(Luf/r;Luf/j;Luf/j;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_1
    invoke-interface {p1, p2}, Luf/r;->J0(Luf/i;)Luf/g;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-interface {p1, p3}, Luf/r;->J0(Luf/i;)Luf/g;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    const/4 v1, 0x0

    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    if-eqz p3, :cond_2

    .line 34
    .line 35
    invoke-interface {p1, p2}, Luf/r;->g(Luf/g;)Luf/j;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {p1, p3}, Luf/r;->g(Luf/g;)Luf/j;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-direct {p0, p1, v2, v3}, Lqf/d;->a(Luf/r;Luf/j;Luf/j;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    invoke-interface {p1, p2}, Luf/r;->h(Luf/g;)Luf/j;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-interface {p1, p3}, Luf/r;->h(Luf/g;)Luf/j;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    invoke-direct {p0, p1, p2, p3}, Lqf/d;->a(Luf/r;Luf/j;Luf/j;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    return v0

    .line 64
    :cond_2
    return v1
.end method


# virtual methods
.method public final b(Luf/r;Luf/i;Luf/i;)Z
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "a"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "b"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, p2, p3}, Lqf/d;->c(Luf/r;Luf/i;Luf/i;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
.end method
