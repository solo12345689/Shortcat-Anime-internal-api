.class public final Lqf/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqf/g$a;
    }
.end annotation


# static fields
.field public static final a:Lqf/g;

.field public static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lqf/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lqf/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lqf/g;->a:Lqf/g;

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

.method private final A(Lqf/u0;Ljava/util/List;)Ljava/util/List;
    .locals 7

    .line 1
    invoke-virtual {p1}, Lqf/u0;->j()Luf/r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x2

    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_3

    .line 13
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_4

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    move-object v3, v2

    .line 33
    check-cast v3, Luf/j;

    .line 34
    .line 35
    invoke-interface {p1, v3}, Luf/r;->n(Luf/j;)Luf/l;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-interface {p1, v3}, Luf/r;->p0(Luf/l;)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/4 v5, 0x0

    .line 44
    :goto_1
    if-ge v5, v4, :cond_3

    .line 45
    .line 46
    invoke-interface {p1, v3, v5}, Luf/r;->H(Luf/l;I)Luf/m;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-interface {p1, v6}, Luf/r;->m0(Luf/m;)Luf/i;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    if-eqz v6, :cond_2

    .line 55
    .line 56
    invoke-interface {p1, v6}, Luf/r;->J0(Luf/i;)Luf/g;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    const/4 v6, 0x0

    .line 62
    :goto_2
    if-nez v6, :cond_1

    .line 63
    .line 64
    add-int/lit8 v5, v5, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-nez p1, :cond_5

    .line 76
    .line 77
    return-object v0

    .line 78
    :cond_5
    :goto_3
    return-object p2
.end method

.method static synthetic a(Ljava/util/Collection;Lqf/u0;Luf/r;Luf/j;Lqf/u0$a;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lqf/g;->x(Ljava/util/Collection;Lqf/u0;Luf/r;Luf/j;Lqf/u0$a;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic b(Lqf/u0;Luf/r;Luf/j;Luf/j;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lqf/g;->y(Lqf/u0;Luf/r;Luf/j;Luf/j;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final c(Lqf/u0;Luf/j;Luf/j;)Ljava/lang/Boolean;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lqf/u0;->j()Luf/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p2}, Luf/r;->H0(Luf/j;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-interface {v0, p3}, Luf/r;->H0(Luf/j;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_0
    invoke-static {v0, p2}, Lqf/g;->f(Luf/r;Luf/j;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-static {v0, p3}, Lqf/g;->f(Luf/r;Luf/j;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_1
    invoke-interface {v0, p2}, Luf/r;->H0(Luf/j;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-static {v0, p1, p2, p3, v1}, Lqf/g;->g(Luf/r;Lqf/u0;Luf/j;Luf/j;Z)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_4

    .line 46
    .line 47
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_2
    invoke-interface {v0, p3}, Luf/r;->H0(Luf/j;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    invoke-static {v0, p2}, Lqf/g;->e(Luf/r;Luf/j;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_3

    .line 61
    .line 62
    const/4 v1, 0x1

    .line 63
    invoke-static {v0, p1, p3, p2, v1}, Lqf/g;->g(Luf/r;Lqf/u0;Luf/j;Luf/j;Z)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    :cond_3
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_4
    return-object v2
.end method

.method private static final d(Luf/r;Luf/j;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Luf/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Luf/d;

    .line 8
    .line 9
    invoke-interface {p0, p1}, Luf/r;->u0(Luf/d;)Luf/c;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p0, p1}, Luf/r;->o(Luf/c;)Luf/m;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p0, p1}, Luf/r;->m0(Luf/m;)Luf/i;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-interface {p0, p1}, Luf/r;->G(Luf/i;)Luf/j;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-interface {p0, p1}, Luf/r;->H0(Luf/j;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    const/4 p1, 0x1

    .line 34
    if-ne p0, p1, :cond_1

    .line 35
    .line 36
    return p1

    .line 37
    :cond_1
    return v1
.end method

.method private static final e(Luf/r;Luf/j;)Z
    .locals 2

    .line 1
    invoke-interface {p0, p1}, Luf/r;->e(Luf/j;)Luf/p;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of v0, p1, Luf/h;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-interface {p0, p1}, Luf/r;->E(Luf/p;)Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/Iterable;

    .line 14
    .line 15
    instance-of v0, p1, Ljava/util/Collection;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    move-object v0, p1

    .line 20
    check-cast v0, Ljava/util/Collection;

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Luf/i;

    .line 44
    .line 45
    invoke-interface {p0, v0}, Luf/r;->d(Luf/i;)Luf/j;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    invoke-interface {p0, v0}, Luf/r;->H0(Luf/j;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/4 v1, 0x1

    .line 56
    if-ne v0, v1, :cond_1

    .line 57
    .line 58
    return v1

    .line 59
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 60
    return p0
.end method

.method private static final f(Luf/r;Luf/j;)Z
    .locals 1

    .line 1
    invoke-interface {p0, p1}, Luf/r;->H0(Luf/j;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0, p1}, Lqf/g;->d(Luf/r;Luf/j;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method private static final g(Luf/r;Lqf/u0;Luf/j;Luf/j;Z)Z
    .locals 9

    .line 1
    invoke-interface {p0, p2}, Luf/r;->N(Luf/j;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, Ljava/lang/Iterable;

    .line 6
    .line 7
    instance-of v0, p2, Ljava/util/Collection;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    move-object v0, p2

    .line 13
    check-cast v0, Ljava/util/Collection;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    return v1

    .line 22
    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_4

    .line 31
    .line 32
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    move-object v5, v0

    .line 37
    check-cast v5, Luf/i;

    .line 38
    .line 39
    invoke-interface {p0, v5}, Luf/r;->G0(Luf/i;)Luf/p;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {p0, p3}, Luf/r;->e(Luf/j;)Luf/p;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    if-eqz p4, :cond_1

    .line 54
    .line 55
    sget-object v2, Lqf/g;->a:Lqf/g;

    .line 56
    .line 57
    const/16 v7, 0x8

    .line 58
    .line 59
    const/4 v8, 0x0

    .line 60
    const/4 v6, 0x0

    .line 61
    move-object v3, p1

    .line 62
    move-object v4, p3

    .line 63
    invoke-static/range {v2 .. v8}, Lqf/g;->v(Lqf/g;Lqf/u0;Luf/i;Luf/i;ZILjava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    move-object v3, p1

    .line 71
    move-object v4, p3

    .line 72
    :cond_2
    move-object p1, v3

    .line 73
    move-object p3, v4

    .line 74
    goto :goto_0

    .line 75
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 76
    return p0

    .line 77
    :cond_4
    return v1
.end method

.method private final h(Lqf/u0;Luf/j;Luf/j;)Ljava/lang/Boolean;
    .locals 12

    .line 1
    invoke-virtual {p1}, Lqf/u0;->j()Luf/r;

    .line 2
    .line 3
    .line 4
    move-result-object v8

    .line 5
    invoke-interface {v8, p2}, Luf/r;->K(Luf/i;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v9, 0x0

    .line 10
    if-nez v0, :cond_15

    .line 11
    .line 12
    invoke-interface {v8, p3}, Luf/r;->K(Luf/i;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_8

    .line 19
    .line 20
    :cond_0
    invoke-interface {v8, p2}, Luf/r;->k(Luf/j;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v10, 0x1

    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    invoke-interface {v8, p3}, Luf/r;->k(Luf/j;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    sget-object v0, Lqf/g;->a:Lqf/g;

    .line 34
    .line 35
    invoke-direct {v0, v8, p2, p3}, Lqf/g;->r(Luf/r;Luf/j;Luf/j;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Lqf/u0;->o()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    :cond_1
    move v9, v10

    .line 48
    :cond_2
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0

    .line 53
    :cond_3
    invoke-interface {v8, p2}, Luf/r;->s(Luf/j;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_14

    .line 58
    .line 59
    invoke-interface {v8, p3}, Luf/r;->s(Luf/j;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    goto/16 :goto_7

    .line 66
    .line 67
    :cond_4
    invoke-interface {v8, p3}, Luf/r;->i0(Luf/j;)Luf/d;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const/4 v11, 0x0

    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    invoke-interface {v8, v0}, Luf/r;->K0(Luf/d;)Luf/i;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    goto :goto_0

    .line 79
    :cond_5
    move-object v1, v11

    .line 80
    :goto_0
    if-eqz v0, :cond_b

    .line 81
    .line 82
    if-eqz v1, :cond_b

    .line 83
    .line 84
    invoke-interface {v8, p3}, Luf/r;->b0(Luf/i;)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_7

    .line 89
    .line 90
    invoke-interface {v8, v1, v10}, Luf/r;->Q(Luf/i;Z)Luf/i;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    :cond_6
    :goto_1
    move-object v3, v1

    .line 95
    goto :goto_2

    .line 96
    :cond_7
    invoke-interface {v8, p3}, Luf/r;->q(Luf/j;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-eqz v3, :cond_6

    .line 101
    .line 102
    invoke-interface {v8, v1}, Luf/r;->y0(Luf/i;)Luf/i;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    goto :goto_1

    .line 107
    :goto_2
    invoke-virtual {p1, p2, v0}, Lqf/u0;->g(Luf/j;Luf/d;)Lqf/u0$b;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sget-object v4, Lqf/g$a;->b:[I

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    aget v0, v4, v0

    .line 118
    .line 119
    if-eq v0, v10, :cond_a

    .line 120
    .line 121
    const/4 v4, 0x2

    .line 122
    if-eq v0, v4, :cond_9

    .line 123
    .line 124
    const/4 v3, 0x3

    .line 125
    if-ne v0, v3, :cond_8

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_8
    new-instance v0, LTd/r;

    .line 129
    .line 130
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 131
    .line 132
    .line 133
    throw v0

    .line 134
    :cond_9
    sget-object v0, Lqf/g;->a:Lqf/g;

    .line 135
    .line 136
    const/16 v5, 0x8

    .line 137
    .line 138
    const/4 v6, 0x0

    .line 139
    const/4 v4, 0x0

    .line 140
    move-object v1, p1

    .line 141
    move-object v2, p2

    .line 142
    invoke-static/range {v0 .. v6}, Lqf/g;->v(Lqf/g;Lqf/u0;Luf/i;Luf/i;ZILjava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_b

    .line 147
    .line 148
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 149
    .line 150
    return-object v0

    .line 151
    :cond_a
    sget-object v0, Lqf/g;->a:Lqf/g;

    .line 152
    .line 153
    const/16 v5, 0x8

    .line 154
    .line 155
    const/4 v6, 0x0

    .line 156
    const/4 v4, 0x0

    .line 157
    move-object v1, p1

    .line 158
    move-object v2, p2

    .line 159
    invoke-static/range {v0 .. v6}, Lqf/g;->v(Lqf/g;Lqf/u0;Luf/i;Luf/i;ZILjava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    return-object v0

    .line 168
    :cond_b
    :goto_3
    invoke-interface {v8, p3}, Luf/r;->e(Luf/j;)Luf/p;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-interface {v8, v0}, Luf/r;->y(Luf/p;)Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_f

    .line 177
    .line 178
    invoke-interface {v8, p3}, Luf/r;->b0(Luf/i;)Z

    .line 179
    .line 180
    .line 181
    invoke-interface {v8, v0}, Luf/r;->E(Luf/p;)Ljava/util/Collection;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    check-cast v0, Ljava/lang/Iterable;

    .line 186
    .line 187
    instance-of v1, v0, Ljava/util/Collection;

    .line 188
    .line 189
    if-eqz v1, :cond_d

    .line 190
    .line 191
    move-object v1, v0

    .line 192
    check-cast v1, Ljava/util/Collection;

    .line 193
    .line 194
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-eqz v1, :cond_d

    .line 199
    .line 200
    :cond_c
    move v9, v10

    .line 201
    goto :goto_4

    .line 202
    :cond_d
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    :cond_e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_c

    .line 211
    .line 212
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    move-object v3, v0

    .line 217
    check-cast v3, Luf/i;

    .line 218
    .line 219
    sget-object v0, Lqf/g;->a:Lqf/g;

    .line 220
    .line 221
    const/16 v5, 0x8

    .line 222
    .line 223
    const/4 v6, 0x0

    .line 224
    const/4 v4, 0x0

    .line 225
    move-object v1, p1

    .line 226
    move-object v2, p2

    .line 227
    invoke-static/range {v0 .. v6}, Lqf/g;->v(Lqf/g;Lqf/u0;Luf/i;Luf/i;ZILjava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-nez v0, :cond_e

    .line 232
    .line 233
    :goto_4
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    return-object v0

    .line 238
    :cond_f
    invoke-interface {v8, p2}, Luf/r;->e(Luf/j;)Luf/p;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    instance-of v1, p2, Luf/d;

    .line 243
    .line 244
    if-nez v1, :cond_12

    .line 245
    .line 246
    invoke-interface {v8, v0}, Luf/r;->y(Luf/p;)Z

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    if-eqz v1, :cond_13

    .line 251
    .line 252
    invoke-interface {v8, v0}, Luf/r;->E(Luf/p;)Ljava/util/Collection;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    check-cast v0, Ljava/lang/Iterable;

    .line 257
    .line 258
    instance-of v1, v0, Ljava/util/Collection;

    .line 259
    .line 260
    if-eqz v1, :cond_10

    .line 261
    .line 262
    move-object v1, v0

    .line 263
    check-cast v1, Ljava/util/Collection;

    .line 264
    .line 265
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    if-eqz v1, :cond_10

    .line 270
    .line 271
    goto :goto_5

    .line 272
    :cond_10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    if-eqz v1, :cond_12

    .line 281
    .line 282
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    check-cast v1, Luf/i;

    .line 287
    .line 288
    instance-of v1, v1, Luf/d;

    .line 289
    .line 290
    if-nez v1, :cond_11

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_12
    :goto_5
    sget-object v0, Lqf/g;->a:Lqf/g;

    .line 294
    .line 295
    invoke-virtual {p1}, Lqf/u0;->j()Luf/r;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-direct {v0, v1, p3, p2}, Lqf/g;->o(Luf/r;Luf/i;Luf/i;)Luf/q;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    if-eqz v0, :cond_13

    .line 304
    .line 305
    invoke-interface {v8, p3}, Luf/r;->e(Luf/j;)Luf/p;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-interface {v8, v0, v1}, Luf/r;->U(Luf/q;Luf/p;)Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-eqz v0, :cond_13

    .line 314
    .line 315
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 316
    .line 317
    return-object v0

    .line 318
    :cond_13
    :goto_6
    return-object v11

    .line 319
    :cond_14
    :goto_7
    invoke-virtual {p1}, Lqf/u0;->o()Z

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    return-object v0

    .line 328
    :cond_15
    :goto_8
    invoke-virtual {p1}, Lqf/u0;->n()Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-eqz v0, :cond_16

    .line 333
    .line 334
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 335
    .line 336
    return-object v0

    .line 337
    :cond_16
    invoke-interface {v8, p2}, Luf/r;->b0(Luf/i;)Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_17

    .line 342
    .line 343
    invoke-interface {v8, p3}, Luf/r;->b0(Luf/i;)Z

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    if-nez v0, :cond_17

    .line 348
    .line 349
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 350
    .line 351
    return-object v0

    .line 352
    :cond_17
    sget-object v0, Lqf/d;->a:Lqf/d;

    .line 353
    .line 354
    invoke-interface {v8, p2, v9}, Luf/r;->f(Luf/j;Z)Luf/j;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    invoke-interface {v8, p3, v9}, Luf/r;->f(Luf/j;Z)Luf/j;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    invoke-virtual {v0, v8, v1, v2}, Lqf/d;->b(Luf/r;Luf/i;Luf/i;)Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    return-object v0
.end method

.method private final i(Lqf/u0;Luf/j;Luf/p;)Ljava/util/List;
    .locals 6

    .line 1
    invoke-virtual {p1}, Lqf/u0;->j()Luf/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p2, p3}, Luf/r;->V(Luf/j;Luf/p;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    invoke-interface {v0, p3}, Luf/r;->I0(Luf/p;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0, p2}, Luf/r;->x(Luf/j;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_1
    invoke-interface {v0, p3}, Luf/r;->v0(Luf/p;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    invoke-interface {v0, p2}, Luf/r;->e(Luf/j;)Luf/p;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {v0, p1, p3}, Luf/r;->j0(Luf/p;Luf/p;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    sget-object p1, Luf/b;->a:Luf/b;

    .line 46
    .line 47
    invoke-interface {v0, p2, p1}, Luf/r;->Z(Luf/j;Luf/b;)Luf/j;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    move-object p2, p1

    .line 55
    :goto_0
    invoke-static {p2}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1

    .line 60
    :cond_3
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1

    .line 65
    :cond_4
    new-instance v1, LAf/j;

    .line 66
    .line 67
    invoke-direct {v1}, LAf/j;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Lqf/u0;->k()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lqf/u0;->h()Ljava/util/ArrayDeque;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Lqf/u0;->i()Ljava/util/Set;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, p2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    :goto_1
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    if-nez p2, :cond_b

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    check-cast p2, Luf/j;

    .line 101
    .line 102
    invoke-static {p2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v3, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_5

    .line 110
    .line 111
    sget-object v4, Luf/b;->a:Luf/b;

    .line 112
    .line 113
    invoke-interface {v0, p2, v4}, Luf/r;->Z(Luf/j;Luf/b;)Luf/j;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    if-nez v4, :cond_6

    .line 118
    .line 119
    move-object v4, p2

    .line 120
    :cond_6
    invoke-interface {v0, v4}, Luf/r;->e(Luf/j;)Luf/p;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-interface {v0, v5, p3}, Luf/r;->j0(Luf/p;Luf/p;)Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-eqz v5, :cond_7

    .line 129
    .line 130
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    sget-object v4, Lqf/u0$c$c;->a:Lqf/u0$c$c;

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_7
    invoke-interface {v0, v4}, Luf/r;->m(Luf/i;)I

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    if-nez v5, :cond_8

    .line 141
    .line 142
    sget-object v4, Lqf/u0$c$b;->a:Lqf/u0$c$b;

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_8
    invoke-virtual {p1}, Lqf/u0;->j()Luf/r;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-interface {v5, v4}, Luf/r;->E0(Luf/j;)Lqf/u0$c;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    :goto_2
    sget-object v5, Lqf/u0$c$c;->a:Lqf/u0$c$c;

    .line 154
    .line 155
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    if-nez v5, :cond_9

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_9
    const/4 v4, 0x0

    .line 163
    :goto_3
    if-nez v4, :cond_a

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_a
    invoke-virtual {p1}, Lqf/u0;->j()Luf/r;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    invoke-interface {v5, p2}, Luf/r;->e(Luf/j;)Luf/p;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    invoke-interface {v5, p2}, Luf/r;->E(Luf/p;)Ljava/util/Collection;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    if-eqz v5, :cond_5

    .line 187
    .line 188
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    check-cast v5, Luf/i;

    .line 193
    .line 194
    invoke-virtual {v4, p1, v5}, Lqf/u0$c;->a(Lqf/u0;Luf/i;)Luf/j;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    invoke-virtual {v2, v5}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_b
    invoke-virtual {p1}, Lqf/u0;->e()V

    .line 203
    .line 204
    .line 205
    return-object v1
.end method

.method private final j(Lqf/u0;Luf/j;Luf/p;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lqf/g;->i(Lqf/u0;Luf/j;Luf/p;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-direct {p0, p1, p2}, Lqf/g;->A(Lqf/u0;Ljava/util/List;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method private final k(Lqf/u0;Luf/i;Luf/i;Z)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Lqf/u0;->j()Luf/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, p2}, Lqf/u0;->q(Luf/i;)Luf/i;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p1, p2}, Lqf/u0;->p(Luf/i;)Luf/i;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p1, p3}, Lqf/u0;->q(Luf/i;)Luf/i;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-virtual {p1, p3}, Lqf/u0;->p(Luf/i;)Luf/i;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-virtual {p1}, Lqf/u0;->m()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {v0, p2}, Luf/r;->e0(Luf/i;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-interface {v0, p3}, Luf/r;->w0(Luf/i;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    sget-object v1, Lqf/g;->a:Lqf/g;

    .line 40
    .line 41
    invoke-interface {v0, p2}, Luf/r;->J0(Luf/i;)Luf/g;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-static {p2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, p2}, Luf/r;->g(Luf/g;)Luf/j;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-interface {v0, p3}, Luf/r;->d(Luf/i;)Luf/j;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    invoke-static {p3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-interface {v0, p3}, Luf/r;->f0(Luf/j;)Luf/k;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    invoke-direct {v1, p1, p2, p3, p4}, Lqf/g;->k(Lqf/u0;Luf/i;Luf/i;Z)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    return p1

    .line 68
    :cond_0
    sget-object v1, Lqf/g;->a:Lqf/g;

    .line 69
    .line 70
    invoke-interface {v0, p2}, Luf/r;->v(Luf/i;)Luf/j;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-interface {v0, p3}, Luf/r;->G(Luf/i;)Luf/j;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-direct {v1, p1, v2, v3}, Lqf/g;->h(Lqf/u0;Luf/j;Luf/j;)Ljava/lang/Boolean;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    if-eqz v2, :cond_1

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-virtual {p1, p2, p3, p4}, Lqf/u0;->c(Luf/i;Luf/i;Z)Ljava/lang/Boolean;

    .line 89
    .line 90
    .line 91
    return v0

    .line 92
    :cond_1
    invoke-virtual {p1, p2, p3, p4}, Lqf/u0;->c(Luf/i;Luf/i;Z)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object p4

    .line 96
    if-eqz p4, :cond_2

    .line 97
    .line 98
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    return p1

    .line 103
    :cond_2
    invoke-interface {v0, p2}, Luf/r;->v(Luf/i;)Luf/j;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-interface {v0, p3}, Luf/r;->G(Luf/i;)Luf/j;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    invoke-direct {v1, p1, p2, p3}, Lqf/g;->w(Lqf/u0;Luf/j;Luf/j;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    return p1
.end method

.method private final o(Luf/r;Luf/i;Luf/i;)Luf/q;
    .locals 6

    .line 1
    invoke-interface {p1, p2}, Luf/r;->m(Luf/i;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    const/4 v3, 0x0

    .line 8
    if-ge v2, v0, :cond_6

    .line 9
    .line 10
    invoke-interface {p1, p2, v2}, Luf/r;->B0(Luf/i;I)Luf/m;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    invoke-interface {p1, v4}, Luf/r;->c(Luf/m;)Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    if-nez v5, :cond_0

    .line 19
    .line 20
    move-object v3, v4

    .line 21
    :cond_0
    if-eqz v3, :cond_5

    .line 22
    .line 23
    invoke-interface {p1, v3}, Luf/r;->m0(Luf/m;)Luf/i;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_1
    invoke-interface {p1, v3}, Luf/r;->v(Luf/i;)Luf/j;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-interface {p1, v4}, Luf/r;->l(Luf/i;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    invoke-interface {p1, p3}, Luf/r;->v(Luf/i;)Luf/j;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-interface {p1, v4}, Luf/r;->l(Luf/i;)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    const/4 v4, 0x1

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move v4, v1

    .line 53
    :goto_1
    invoke-static {v3, p3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-nez v5, :cond_4

    .line 58
    .line 59
    if-eqz v4, :cond_3

    .line 60
    .line 61
    invoke-interface {p1, v3}, Luf/r;->G0(Luf/i;)Luf/p;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-interface {p1, p3}, Luf/r;->G0(Luf/i;)Luf/p;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_3

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    invoke-direct {p0, p1, v3, p3}, Lqf/g;->o(Luf/r;Luf/i;Luf/i;)Luf/q;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    if-eqz v3, :cond_5

    .line 81
    .line 82
    return-object v3

    .line 83
    :cond_4
    :goto_2
    invoke-interface {p1, p2}, Luf/r;->G0(Luf/i;)Luf/p;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-interface {p1, p2, v2}, Luf/r;->g0(Luf/p;I)Luf/q;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1

    .line 92
    :cond_5
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_6
    return-object v3
.end method

.method private final p(Lqf/u0;Luf/j;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Lqf/u0;->j()Luf/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p2}, Luf/r;->e(Luf/j;)Luf/p;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, Luf/r;->I0(Luf/p;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, v1}, Luf/r;->q0(Luf/p;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_0
    invoke-interface {v0, p2}, Luf/r;->e(Luf/j;)Luf/p;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v0, v1}, Luf/r;->q0(Luf/p;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    return v2

    .line 32
    :cond_1
    invoke-virtual {p1}, Lqf/u0;->k()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lqf/u0;->h()Ljava/util/ArrayDeque;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lqf/u0;->i()Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-nez p2, :cond_7

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    check-cast p2, Luf/j;

    .line 63
    .line 64
    invoke-static {p2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v3, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_2

    .line 72
    .line 73
    invoke-interface {v0, p2}, Luf/r;->x(Luf/j;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_3

    .line 78
    .line 79
    sget-object v4, Lqf/u0$c$c;->a:Lqf/u0$c$c;

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    sget-object v4, Lqf/u0$c$b;->a:Lqf/u0$c$b;

    .line 83
    .line 84
    :goto_1
    sget-object v5, Lqf/u0$c$c;->a:Lqf/u0$c$c;

    .line 85
    .line 86
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-nez v5, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    const/4 v4, 0x0

    .line 94
    :goto_2
    if-nez v4, :cond_5

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_5
    invoke-virtual {p1}, Lqf/u0;->j()Luf/r;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-interface {v5, p2}, Luf/r;->e(Luf/j;)Luf/p;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-interface {v5, p2}, Luf/r;->E(Luf/p;)Ljava/util/Collection;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_2

    .line 118
    .line 119
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    check-cast v5, Luf/i;

    .line 124
    .line 125
    invoke-virtual {v4, p1, v5}, Lqf/u0$c;->a(Lqf/u0;Luf/i;)Luf/j;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-interface {v0, v5}, Luf/r;->e(Luf/j;)Luf/p;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-interface {v0, v6}, Luf/r;->q0(Luf/p;)Z

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    if-eqz v6, :cond_6

    .line 138
    .line 139
    invoke-virtual {p1}, Lqf/u0;->e()V

    .line 140
    .line 141
    .line 142
    return v2

    .line 143
    :cond_6
    invoke-virtual {v1, v5}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_7
    invoke-virtual {p1}, Lqf/u0;->e()V

    .line 148
    .line 149
    .line 150
    const/4 p1, 0x0

    .line 151
    return p1
.end method

.method private final q(Luf/r;Luf/i;)Z
    .locals 1

    .line 1
    invoke-interface {p1, p2}, Luf/r;->G0(Luf/i;)Luf/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1, v0}, Luf/r;->B(Luf/p;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p1, p2}, Luf/r;->a0(Luf/i;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p1, p2}, Luf/r;->w0(Luf/i;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-interface {p1, p2}, Luf/r;->T(Luf/i;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-interface {p1, p2}, Luf/r;->A0(Luf/i;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :cond_0
    const/4 p1, 0x0

    .line 38
    return p1
.end method

.method private final r(Luf/r;Luf/j;Luf/j;)Z
    .locals 3

    .line 1
    invoke-interface {p1, p2}, Luf/r;->e(Luf/j;)Luf/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1, p3}, Luf/r;->e(Luf/j;)Luf/p;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    invoke-interface {p1, p2}, Luf/r;->q(Luf/j;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-interface {p1, p3}, Luf/r;->q(Luf/j;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    return v2

    .line 26
    :cond_1
    invoke-interface {p1, p2}, Luf/r;->b0(Luf/i;)Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eqz p2, :cond_2

    .line 31
    .line 32
    invoke-interface {p1, p3}, Luf/r;->b0(Luf/i;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    return v2

    .line 39
    :cond_2
    const/4 p1, 0x1

    .line 40
    return p1
.end method

.method public static synthetic v(Lqf/g;Lqf/u0;Luf/i;Luf/i;ZILjava/lang/Object;)Z
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lqf/g;->u(Lqf/u0;Luf/i;Luf/i;Z)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method private final w(Lqf/u0;Luf/j;Luf/j;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v0}, Lqf/u0;->j()Luf/r;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    sget-boolean v4, Lqf/g;->b:Z

    .line 12
    .line 13
    if-eqz v4, :cond_1

    .line 14
    .line 15
    invoke-interface {v3, v1}, Luf/r;->a(Luf/j;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    invoke-interface {v3, v1}, Luf/r;->e(Luf/j;)Luf/p;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-interface {v3, v4}, Luf/r;->y(Luf/p;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    invoke-virtual/range {p1 .. p2}, Lqf/u0;->l(Luf/i;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    :cond_0
    invoke-interface {v3, v2}, Luf/r;->a(Luf/j;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Lqf/u0;->l(Luf/i;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    :cond_1
    sget-object v4, Lqf/c;->a:Lqf/c;

    .line 46
    .line 47
    invoke-virtual {v4, v0, v1, v2}, Lqf/c;->d(Lqf/u0;Luf/j;Luf/j;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    const/4 v5, 0x0

    .line 52
    if-nez v4, :cond_2

    .line 53
    .line 54
    return v5

    .line 55
    :cond_2
    sget-object v4, Lqf/g;->a:Lqf/g;

    .line 56
    .line 57
    invoke-direct {v4, v0, v1, v2}, Lqf/g;->c(Lqf/u0;Luf/j;Luf/j;)Ljava/lang/Boolean;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    if-eqz v6, :cond_3

    .line 62
    .line 63
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    const/4 v4, 0x4

    .line 68
    const/4 v5, 0x0

    .line 69
    const/4 v3, 0x0

    .line 70
    invoke-static/range {v0 .. v5}, Lqf/u0;->d(Lqf/u0;Luf/i;Luf/i;ZILjava/lang/Object;)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    return v6

    .line 74
    :cond_3
    invoke-interface {v3, v2}, Luf/r;->e(Luf/j;)Luf/p;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-interface {v3, v1}, Luf/r;->e(Luf/j;)Luf/p;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-interface {v3, v7, v6}, Luf/r;->j0(Luf/p;Luf/p;)Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    const/4 v8, 0x1

    .line 87
    if-eqz v7, :cond_4

    .line 88
    .line 89
    invoke-interface {v3, v6}, Luf/r;->t(Luf/p;)I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    if-nez v7, :cond_4

    .line 94
    .line 95
    return v8

    .line 96
    :cond_4
    invoke-interface {v3, v2}, Luf/r;->e(Luf/j;)Luf/p;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    invoke-interface {v3, v7}, Luf/r;->I(Luf/p;)Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    if-eqz v7, :cond_5

    .line 105
    .line 106
    return v8

    .line 107
    :cond_5
    invoke-virtual {v4, v0, v1, v6}, Lqf/g;->n(Lqf/u0;Luf/j;Luf/p;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    const/16 v9, 0xa

    .line 116
    .line 117
    if-le v7, v8, :cond_8

    .line 118
    .line 119
    invoke-virtual {v0}, Lqf/u0;->j()Luf/r;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    instance-of v11, v7, Luf/t;

    .line 124
    .line 125
    if-eqz v11, :cond_6

    .line 126
    .line 127
    check-cast v7, Luf/t;

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_6
    const/4 v7, 0x0

    .line 131
    :goto_0
    if-eqz v7, :cond_8

    .line 132
    .line 133
    invoke-interface {v7}, Luf/t;->L()Z

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-ne v7, v8, :cond_8

    .line 138
    .line 139
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 140
    .line 141
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v11

    .line 152
    if-eqz v11, :cond_a

    .line 153
    .line 154
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v11

    .line 158
    check-cast v11, Luf/j;

    .line 159
    .line 160
    invoke-virtual {v0, v11}, Lqf/u0;->p(Luf/i;)Luf/i;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    invoke-interface {v3, v12}, Luf/r;->d(Luf/i;)Luf/j;

    .line 165
    .line 166
    .line 167
    move-result-object v12

    .line 168
    if-nez v12, :cond_7

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_7
    move-object v11, v12

    .line 172
    :goto_2
    invoke-interface {v7, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_8
    new-instance v7, Ljava/util/ArrayList;

    .line 177
    .line 178
    invoke-static {v4, v9}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 179
    .line 180
    .line 181
    move-result v11

    .line 182
    invoke-direct {v7, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 183
    .line 184
    .line 185
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 190
    .line 191
    .line 192
    move-result v11

    .line 193
    if-eqz v11, :cond_a

    .line 194
    .line 195
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v11

    .line 199
    check-cast v11, Luf/j;

    .line 200
    .line 201
    invoke-virtual {v0, v11}, Lqf/u0;->p(Luf/i;)Luf/i;

    .line 202
    .line 203
    .line 204
    move-result-object v12

    .line 205
    invoke-interface {v3, v12}, Luf/r;->d(Luf/i;)Luf/j;

    .line 206
    .line 207
    .line 208
    move-result-object v12

    .line 209
    if-nez v12, :cond_9

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_9
    move-object v11, v12

    .line 213
    :goto_4
    invoke-interface {v7, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_a
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    if-eqz v4, :cond_14

    .line 222
    .line 223
    if-eq v4, v8, :cond_13

    .line 224
    .line 225
    new-instance v4, Luf/a;

    .line 226
    .line 227
    invoke-interface {v3, v6}, Luf/r;->t(Luf/p;)I

    .line 228
    .line 229
    .line 230
    move-result v11

    .line 231
    invoke-direct {v4, v11}, Luf/a;-><init>(I)V

    .line 232
    .line 233
    .line 234
    invoke-interface {v3, v6}, Luf/r;->t(Luf/p;)I

    .line 235
    .line 236
    .line 237
    move-result v11

    .line 238
    move v12, v5

    .line 239
    move v13, v12

    .line 240
    :goto_5
    if-ge v12, v11, :cond_11

    .line 241
    .line 242
    if-nez v13, :cond_c

    .line 243
    .line 244
    invoke-interface {v3, v6, v12}, Luf/r;->g0(Luf/p;I)Luf/q;

    .line 245
    .line 246
    .line 247
    move-result-object v13

    .line 248
    invoke-interface {v3, v13}, Luf/r;->t0(Luf/q;)Luf/v;

    .line 249
    .line 250
    .line 251
    move-result-object v13

    .line 252
    sget-object v14, Luf/v;->c:Luf/v;

    .line 253
    .line 254
    if-eq v13, v14, :cond_b

    .line 255
    .line 256
    goto :goto_6

    .line 257
    :cond_b
    move v13, v5

    .line 258
    goto :goto_7

    .line 259
    :cond_c
    :goto_6
    move v13, v8

    .line 260
    :goto_7
    if-nez v13, :cond_10

    .line 261
    .line 262
    new-instance v14, Ljava/util/ArrayList;

    .line 263
    .line 264
    invoke-static {v7, v9}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 265
    .line 266
    .line 267
    move-result v15

    .line 268
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 269
    .line 270
    .line 271
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 272
    .line 273
    .line 274
    move-result-object v15

    .line 275
    :goto_8
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result v16

    .line 279
    if-eqz v16, :cond_f

    .line 280
    .line 281
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v16

    .line 285
    move-object/from16 v5, v16

    .line 286
    .line 287
    check-cast v5, Luf/j;

    .line 288
    .line 289
    move/from16 v16, v8

    .line 290
    .line 291
    invoke-interface {v3, v5, v12}, Luf/r;->X(Luf/j;I)Luf/m;

    .line 292
    .line 293
    .line 294
    move-result-object v8

    .line 295
    if-eqz v8, :cond_e

    .line 296
    .line 297
    invoke-interface {v3, v8}, Luf/r;->o0(Luf/m;)Luf/v;

    .line 298
    .line 299
    .line 300
    move-result-object v9

    .line 301
    sget-object v10, Luf/v;->d:Luf/v;

    .line 302
    .line 303
    if-ne v9, v10, :cond_d

    .line 304
    .line 305
    goto :goto_9

    .line 306
    :cond_d
    const/4 v8, 0x0

    .line 307
    :goto_9
    if-eqz v8, :cond_e

    .line 308
    .line 309
    invoke-interface {v3, v8}, Luf/r;->m0(Luf/m;)Luf/i;

    .line 310
    .line 311
    .line 312
    move-result-object v8

    .line 313
    if-eqz v8, :cond_e

    .line 314
    .line 315
    invoke-interface {v14, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move/from16 v8, v16

    .line 319
    .line 320
    const/4 v5, 0x0

    .line 321
    const/16 v9, 0xa

    .line 322
    .line 323
    goto :goto_8

    .line 324
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 325
    .line 326
    new-instance v3, Ljava/lang/StringBuilder;

    .line 327
    .line 328
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 329
    .line 330
    .line 331
    const-string v4, "Incorrect type: "

    .line 332
    .line 333
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    const-string v4, ", subType: "

    .line 340
    .line 341
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    const-string v1, ", superType: "

    .line 348
    .line 349
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    throw v0

    .line 367
    :cond_f
    move/from16 v16, v8

    .line 368
    .line 369
    invoke-interface {v3, v14}, Luf/r;->F(Ljava/util/Collection;)Luf/i;

    .line 370
    .line 371
    .line 372
    move-result-object v5

    .line 373
    invoke-interface {v3, v5}, Luf/r;->l0(Luf/i;)Luf/m;

    .line 374
    .line 375
    .line 376
    move-result-object v5

    .line 377
    invoke-virtual {v4, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    goto :goto_a

    .line 381
    :cond_10
    move/from16 v16, v8

    .line 382
    .line 383
    :goto_a
    add-int/lit8 v12, v12, 0x1

    .line 384
    .line 385
    move/from16 v8, v16

    .line 386
    .line 387
    const/4 v5, 0x0

    .line 388
    const/16 v9, 0xa

    .line 389
    .line 390
    goto/16 :goto_5

    .line 391
    .line 392
    :cond_11
    move/from16 v16, v8

    .line 393
    .line 394
    if-nez v13, :cond_12

    .line 395
    .line 396
    sget-object v1, Lqf/g;->a:Lqf/g;

    .line 397
    .line 398
    invoke-virtual {v1, v0, v4, v2}, Lqf/g;->s(Lqf/u0;Luf/l;Luf/j;)Z

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    if-eqz v1, :cond_12

    .line 403
    .line 404
    return v16

    .line 405
    :cond_12
    new-instance v1, Lqf/e;

    .line 406
    .line 407
    invoke-direct {v1, v7, v0, v3, v2}, Lqf/e;-><init>(Ljava/util/Collection;Lqf/u0;Luf/r;Luf/j;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0, v1}, Lqf/u0;->r(Lkotlin/jvm/functions/Function1;)Z

    .line 411
    .line 412
    .line 413
    move-result v0

    .line 414
    return v0

    .line 415
    :cond_13
    sget-object v1, Lqf/g;->a:Lqf/g;

    .line 416
    .line 417
    invoke-static {v7}, LUd/u;->l0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    check-cast v4, Luf/j;

    .line 422
    .line 423
    invoke-interface {v3, v4}, Luf/r;->n(Luf/j;)Luf/l;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    invoke-virtual {v1, v0, v3, v2}, Lqf/g;->s(Lqf/u0;Luf/l;Luf/j;)Z

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    return v0

    .line 432
    :cond_14
    sget-object v2, Lqf/g;->a:Lqf/g;

    .line 433
    .line 434
    invoke-direct {v2, v0, v1}, Lqf/g;->p(Lqf/u0;Luf/j;)Z

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    return v0
.end method

.method private static final x(Ljava/util/Collection;Lqf/u0;Luf/r;Luf/j;Lqf/u0$a;)LTd/L;
    .locals 2

    .line 1
    const-string v0, "$this$runForkingPoint"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Luf/j;

    .line 21
    .line 22
    new-instance v1, Lqf/f;

    .line 23
    .line 24
    invoke-direct {v1, p1, p2, v0, p3}, Lqf/f;-><init>(Lqf/u0;Luf/r;Luf/j;Luf/j;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p4, v1}, Lqf/u0$a;->a(Lie/a;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    sget-object p0, LTd/L;->a:LTd/L;

    .line 32
    .line 33
    return-object p0
.end method

.method private static final y(Lqf/u0;Luf/r;Luf/j;Luf/j;)Z
    .locals 1

    .line 1
    sget-object v0, Lqf/g;->a:Lqf/g;

    .line 2
    .line 3
    invoke-interface {p1, p2}, Luf/r;->n(Luf/j;)Luf/l;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p0, p1, p3}, Lqf/g;->s(Lqf/u0;Luf/l;Luf/j;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private final z(Luf/r;Luf/i;Luf/i;Luf/p;)Z
    .locals 1

    .line 1
    invoke-interface {p1, p2}, Luf/r;->d(Luf/i;)Luf/j;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    instance-of p4, p2, Luf/d;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p4, :cond_2

    .line 9
    .line 10
    check-cast p2, Luf/d;

    .line 11
    .line 12
    invoke-interface {p1, p2}, Luf/r;->n0(Luf/d;)Z

    .line 13
    .line 14
    .line 15
    move-result p4

    .line 16
    if-nez p4, :cond_2

    .line 17
    .line 18
    invoke-interface {p1, p2}, Luf/r;->u0(Luf/d;)Luf/c;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    invoke-interface {p1, p4}, Luf/r;->o(Luf/c;)Luf/m;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    invoke-interface {p1, p4}, Luf/r;->c(Luf/m;)Z

    .line 27
    .line 28
    .line 29
    move-result p4

    .line 30
    if-nez p4, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-interface {p1, p2}, Luf/r;->D0(Luf/d;)Luf/b;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    sget-object p4, Luf/b;->a:Luf/b;

    .line 38
    .line 39
    if-eq p2, p4, :cond_1

    .line 40
    .line 41
    return v0

    .line 42
    :cond_1
    invoke-interface {p1, p3}, Luf/r;->G0(Luf/i;)Luf/p;

    .line 43
    .line 44
    .line 45
    :cond_2
    :goto_0
    return v0
.end method


# virtual methods
.method public final l(Luf/v;Luf/v;)Luf/v;
    .locals 1

    .line 1
    const-string v0, "declared"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "useSite"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Luf/v;->d:Luf/v;

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    return-object p2

    .line 16
    :cond_0
    if-ne p2, v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    if-ne p1, p2, :cond_2

    .line 20
    .line 21
    :goto_0
    return-object p1

    .line 22
    :cond_2
    const/4 p1, 0x0

    .line 23
    return-object p1
.end method

.method public final m(Lqf/u0;Luf/i;Luf/i;)Z
    .locals 11

    .line 1
    const-string v0, "state"

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
    invoke-virtual {p1}, Lqf/u0;->j()Luf/r;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x1

    .line 21
    if-ne p2, p3, :cond_0

    .line 22
    .line 23
    return v1

    .line 24
    :cond_0
    sget-object v2, Lqf/g;->a:Lqf/g;

    .line 25
    .line 26
    invoke-direct {v2, v0, p2}, Lqf/g;->q(Luf/r;Luf/i;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const/4 v9, 0x0

    .line 31
    if-eqz v3, :cond_5

    .line 32
    .line 33
    invoke-direct {v2, v0, p3}, Lqf/g;->q(Luf/r;Luf/i;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_5

    .line 38
    .line 39
    invoke-virtual {p1, p2}, Lqf/u0;->q(Luf/i;)Luf/i;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {p1, v3}, Lqf/u0;->p(Luf/i;)Luf/i;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {p1, p3}, Lqf/u0;->q(Luf/i;)Luf/i;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {p1, v4}, Lqf/u0;->p(Luf/i;)Luf/i;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-interface {v0, v3}, Luf/r;->v(Luf/i;)Luf/j;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-interface {v0, v3}, Luf/r;->G0(Luf/i;)Luf/p;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-interface {v0, v4}, Luf/r;->G0(Luf/i;)Luf/p;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    invoke-interface {v0, v6, v7}, Luf/r;->j0(Luf/p;Luf/p;)Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-nez v6, :cond_1

    .line 72
    .line 73
    return v9

    .line 74
    :cond_1
    invoke-interface {v0, v5}, Luf/r;->m(Luf/i;)I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-nez v6, :cond_5

    .line 79
    .line 80
    invoke-interface {v0, v3}, Luf/r;->O(Luf/i;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-nez p1, :cond_4

    .line 85
    .line 86
    invoke-interface {v0, v4}, Luf/r;->O(Luf/i;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_2

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    invoke-interface {v0, v5}, Luf/r;->b0(Luf/i;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    invoke-interface {v0, v4}, Luf/r;->v(Luf/i;)Luf/j;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-interface {v0, p2}, Luf/r;->b0(Luf/i;)Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    if-ne p1, p2, :cond_3

    .line 106
    .line 107
    return v1

    .line 108
    :cond_3
    return v9

    .line 109
    :cond_4
    :goto_0
    return v1

    .line 110
    :cond_5
    const/16 v7, 0x8

    .line 111
    .line 112
    const/4 v8, 0x0

    .line 113
    const/4 v6, 0x0

    .line 114
    move-object v3, p1

    .line 115
    move-object v4, p2

    .line 116
    move-object v5, p3

    .line 117
    invoke-static/range {v2 .. v8}, Lqf/g;->v(Lqf/g;Lqf/u0;Luf/i;Luf/i;ZILjava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_6

    .line 122
    .line 123
    const/16 v7, 0x8

    .line 124
    .line 125
    const/4 v8, 0x0

    .line 126
    const/4 v6, 0x0

    .line 127
    move-object v10, v5

    .line 128
    move-object v5, v4

    .line 129
    move-object v4, v10

    .line 130
    invoke-static/range {v2 .. v8}, Lqf/g;->v(Lqf/g;Lqf/u0;Luf/i;Luf/i;ZILjava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-eqz p1, :cond_6

    .line 135
    .line 136
    return v1

    .line 137
    :cond_6
    return v9
.end method

.method public final n(Lqf/u0;Luf/j;Luf/p;)Ljava/util/List;
    .locals 6

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "subType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "superConstructor"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lqf/u0;->j()Luf/r;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0, p2}, Luf/r;->x(Luf/j;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    sget-object v0, Lqf/g;->a:Lqf/g;

    .line 27
    .line 28
    invoke-direct {v0, p1, p2, p3}, Lqf/g;->j(Lqf/u0;Luf/j;Luf/p;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_0
    invoke-interface {v0, p3}, Luf/r;->I0(Luf/p;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v0, p3}, Luf/r;->D(Luf/p;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    sget-object v0, Lqf/g;->a:Lqf/g;

    .line 46
    .line 47
    invoke-direct {v0, p1, p2, p3}, Lqf/g;->i(Lqf/u0;Luf/j;Luf/p;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1

    .line 52
    :cond_1
    new-instance v1, LAf/j;

    .line 53
    .line 54
    invoke-direct {v1}, LAf/j;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lqf/u0;->k()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lqf/u0;->h()Ljava/util/ArrayDeque;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lqf/u0;->i()Ljava/util/Set;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, p2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-nez p2, :cond_6

    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    check-cast p2, Luf/j;

    .line 88
    .line 89
    invoke-static {p2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v3, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_2

    .line 97
    .line 98
    invoke-interface {v0, p2}, Luf/r;->x(Luf/j;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-eqz v4, :cond_3

    .line 103
    .line 104
    invoke-virtual {v1, p2}, LAf/j;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    sget-object v4, Lqf/u0$c$c;->a:Lqf/u0$c$c;

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    sget-object v4, Lqf/u0$c$b;->a:Lqf/u0$c$b;

    .line 111
    .line 112
    :goto_1
    sget-object v5, Lqf/u0$c$c;->a:Lqf/u0$c$c;

    .line 113
    .line 114
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-nez v5, :cond_4

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    const/4 v4, 0x0

    .line 122
    :goto_2
    if-nez v4, :cond_5

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_5
    invoke-virtual {p1}, Lqf/u0;->j()Luf/r;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-interface {v5, p2}, Luf/r;->e(Luf/j;)Luf/p;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    invoke-interface {v5, p2}, Luf/r;->E(Luf/p;)Ljava/util/Collection;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    if-eqz v5, :cond_2

    .line 146
    .line 147
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    check-cast v5, Luf/i;

    .line 152
    .line 153
    invoke-virtual {v4, p1, v5}, Lqf/u0$c;->a(Lqf/u0;Luf/i;)Luf/j;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-virtual {v2, v5}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_6
    invoke-virtual {p1}, Lqf/u0;->e()V

    .line 162
    .line 163
    .line 164
    new-instance p2, Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_7

    .line 178
    .line 179
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    check-cast v1, Luf/j;

    .line 184
    .line 185
    sget-object v2, Lqf/g;->a:Lqf/g;

    .line 186
    .line 187
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    invoke-direct {v2, p1, v1, p3}, Lqf/g;->j(Lqf/u0;Luf/j;Luf/p;)Ljava/util/List;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-static {p2, v1}, LUd/u;->D(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 195
    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_7
    return-object p2
.end method

.method public final s(Lqf/u0;Luf/l;Luf/j;)Z
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v7, p2

    .line 4
    .line 5
    move-object/from16 v8, p3

    .line 6
    .line 7
    const-string v0, "<this>"

    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "capturedSubArguments"

    .line 13
    .line 14
    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v0, "superType"

    .line 18
    .line 19
    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lqf/u0;->j()Luf/r;

    .line 23
    .line 24
    .line 25
    move-result-object v9

    .line 26
    invoke-interface {v9, v8}, Luf/r;->e(Luf/j;)Luf/p;

    .line 27
    .line 28
    .line 29
    move-result-object v10

    .line 30
    invoke-interface {v9, v7}, Luf/r;->p0(Luf/l;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-interface {v9, v10}, Luf/r;->t(Luf/p;)I

    .line 35
    .line 36
    .line 37
    move-result v11

    .line 38
    const/4 v12, 0x0

    .line 39
    if-ne v0, v11, :cond_a

    .line 40
    .line 41
    invoke-interface {v9, v8}, Luf/r;->m(Luf/i;)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eq v0, v2, :cond_0

    .line 46
    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :cond_0
    move v13, v12

    .line 50
    :goto_0
    const/4 v0, 0x1

    .line 51
    if-ge v13, v11, :cond_9

    .line 52
    .line 53
    invoke-interface {v9, v8, v13}, Luf/r;->B0(Luf/i;I)Luf/m;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-interface {v9, v2}, Luf/r;->m0(Luf/m;)Luf/i;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-nez v3, :cond_1

    .line 62
    .line 63
    goto/16 :goto_2

    .line 64
    .line 65
    :cond_1
    invoke-interface {v9, v7, v13}, Luf/r;->H(Luf/l;I)Luf/m;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-interface {v9, v4}, Luf/r;->o0(Luf/m;)Luf/v;

    .line 70
    .line 71
    .line 72
    sget-object v5, Luf/v;->d:Luf/v;

    .line 73
    .line 74
    invoke-interface {v9, v4}, Luf/r;->m0(Luf/m;)Luf/i;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    sget-object v6, Lqf/g;->a:Lqf/g;

    .line 82
    .line 83
    invoke-interface {v9, v10, v13}, Luf/r;->g0(Luf/p;I)Luf/q;

    .line 84
    .line 85
    .line 86
    move-result-object v14

    .line 87
    invoke-interface {v9, v14}, Luf/r;->t0(Luf/q;)Luf/v;

    .line 88
    .line 89
    .line 90
    move-result-object v14

    .line 91
    invoke-interface {v9, v2}, Luf/r;->o0(Luf/m;)Luf/v;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v6, v14, v2}, Lqf/g;->l(Luf/v;Luf/v;)Luf/v;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    if-nez v2, :cond_2

    .line 100
    .line 101
    invoke-virtual {v1}, Lqf/u0;->n()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    return v0

    .line 106
    :cond_2
    if-ne v2, v5, :cond_3

    .line 107
    .line 108
    invoke-direct {v6, v9, v4, v3, v10}, Lqf/g;->z(Luf/r;Luf/i;Luf/i;Luf/p;)Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-nez v5, :cond_7

    .line 113
    .line 114
    invoke-direct {v6, v9, v3, v4, v10}, Lqf/g;->z(Luf/r;Luf/i;Luf/i;Luf/p;)Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-eqz v5, :cond_3

    .line 119
    .line 120
    goto/16 :goto_2

    .line 121
    .line 122
    :cond_3
    invoke-static {v1}, Lqf/u0;->a(Lqf/u0;)I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    const/16 v14, 0x64

    .line 127
    .line 128
    if-gt v5, v14, :cond_8

    .line 129
    .line 130
    invoke-static {v1}, Lqf/u0;->a(Lqf/u0;)I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    add-int/2addr v5, v0

    .line 135
    invoke-static {v1, v5}, Lqf/u0;->b(Lqf/u0;I)V

    .line 136
    .line 137
    .line 138
    sget-object v5, Lqf/g$a;->a:[I

    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    aget v2, v5, v2

    .line 145
    .line 146
    if-eq v2, v0, :cond_6

    .line 147
    .line 148
    const/4 v0, 0x2

    .line 149
    if-eq v2, v0, :cond_5

    .line 150
    .line 151
    const/4 v0, 0x3

    .line 152
    if-ne v2, v0, :cond_4

    .line 153
    .line 154
    const/16 v5, 0x8

    .line 155
    .line 156
    move-object v0, v6

    .line 157
    const/4 v6, 0x0

    .line 158
    move-object v2, v4

    .line 159
    const/4 v4, 0x0

    .line 160
    move-object v15, v3

    .line 161
    move-object v3, v2

    .line 162
    move-object v2, v15

    .line 163
    invoke-static/range {v0 .. v6}, Lqf/g;->v(Lqf/g;Lqf/u0;Luf/i;Luf/i;ZILjava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    move-object/from16 v1, p1

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_4
    new-instance v0, LTd/r;

    .line 171
    .line 172
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 173
    .line 174
    .line 175
    throw v0

    .line 176
    :cond_5
    move-object v2, v3

    .line 177
    move-object v3, v4

    .line 178
    move-object v0, v6

    .line 179
    const/16 v5, 0x8

    .line 180
    .line 181
    const/4 v6, 0x0

    .line 182
    const/4 v4, 0x0

    .line 183
    move-object v1, v3

    .line 184
    move-object v3, v2

    .line 185
    move-object v2, v1

    .line 186
    move-object/from16 v1, p1

    .line 187
    .line 188
    invoke-static/range {v0 .. v6}, Lqf/g;->v(Lqf/g;Lqf/u0;Luf/i;Luf/i;ZILjava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    goto :goto_1

    .line 193
    :cond_6
    move-object v2, v3

    .line 194
    move-object v3, v4

    .line 195
    move-object v0, v6

    .line 196
    invoke-virtual {v0, v1, v3, v2}, Lqf/g;->m(Lqf/u0;Luf/i;Luf/i;)Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    :goto_1
    invoke-static {v1}, Lqf/u0;->a(Lqf/u0;)I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    add-int/lit8 v2, v2, -0x1

    .line 205
    .line 206
    invoke-static {v1, v2}, Lqf/u0;->b(Lqf/u0;I)V

    .line 207
    .line 208
    .line 209
    if-nez v0, :cond_7

    .line 210
    .line 211
    return v12

    .line 212
    :cond_7
    :goto_2
    add-int/lit8 v13, v13, 0x1

    .line 213
    .line 214
    goto/16 :goto_0

    .line 215
    .line 216
    :cond_8
    move-object v3, v4

    .line 217
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 218
    .line 219
    new-instance v1, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 222
    .line 223
    .line 224
    const-string v2, "Arguments depth is too high. Some related argument: "

    .line 225
    .line 226
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    throw v0

    .line 244
    :cond_9
    return v0

    .line 245
    :cond_a
    :goto_3
    return v12
.end method

.method public final t(Lqf/u0;Luf/i;Luf/i;)Z
    .locals 8

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "subType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "superType"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/16 v6, 0x8

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
    move-object v4, p3

    .line 24
    invoke-static/range {v1 .. v7}, Lqf/g;->v(Lqf/g;Lqf/u0;Luf/i;Luf/i;ZILjava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1
.end method

.method public final u(Lqf/u0;Luf/i;Luf/i;Z)Z
    .locals 1

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "subType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "superType"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    if-ne p2, p3, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_0
    invoke-virtual {p1, p2, p3}, Lqf/u0;->f(Luf/i;Luf/i;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    return p1

    .line 28
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lqf/g;->k(Lqf/u0;Luf/i;Luf/i;Z)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1
.end method
