.class public final LE/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LF/f;


# instance fields
.field private final a:LE/I;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LE/I;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE/e;->a:LE/I;

    .line 5
    .line 6
    return-void
.end method

.method private final f(LE/s;)I
    .locals 11

    .line 1
    invoke-interface {p1}, LE/s;->a()Lz/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lz/q;->a:Lz/q;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v2

    .line 13
    :goto_0
    invoke-interface {p1}, LE/s;->i()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v3, LE/e$a;

    .line 18
    .line 19
    invoke-direct {v3, v0, v1}, LE/e$a;-><init>(ZLjava/util/List;)V

    .line 20
    .line 21
    .line 22
    move v4, v2

    .line 23
    move v5, v4

    .line 24
    move v6, v5

    .line 25
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    if-ge v4, v7, :cond_4

    .line 30
    .line 31
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-interface {v3, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    check-cast v7, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    const/4 v8, -0x1

    .line 46
    if-ne v7, v8, :cond_1

    .line 47
    .line 48
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move v8, v2

    .line 52
    :goto_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    if-ge v4, v9, :cond_3

    .line 57
    .line 58
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    invoke-interface {v3, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    check-cast v9, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    if-ne v9, v7, :cond_3

    .line 73
    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    check-cast v9, LE/k;

    .line 81
    .line 82
    invoke-interface {v9}, LE/k;->a()J

    .line 83
    .line 84
    .line 85
    move-result-wide v9

    .line 86
    invoke-static {v9, v10}, Li1/r;->f(J)I

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    goto :goto_3

    .line 91
    :cond_2
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    check-cast v9, LE/k;

    .line 96
    .line 97
    invoke-interface {v9}, LE/k;->a()J

    .line 98
    .line 99
    .line 100
    move-result-wide v9

    .line 101
    invoke-static {v9, v10}, Li1/r;->g(J)I

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    :goto_3
    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    add-int/lit8 v4, v4, 0x1

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_3
    add-int/2addr v5, v8

    .line 113
    add-int/lit8 v6, v6, 0x1

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    div-int/2addr v5, v6

    .line 117
    invoke-interface {p1}, LE/s;->h()I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    add-int/2addr v5, p1

    .line 122
    return v5
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget-object v0, p0, LE/e;->a:LE/I;

    .line 2
    .line 3
    invoke-virtual {v0}, LE/I;->s()LE/s;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, LE/s;->i()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, LUd/u;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, LE/k;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, LE/k;->getIndex()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return v0
.end method

.method public b(I)F
    .locals 7

    .line 1
    iget-object v0, p0, LE/e;->a:LE/I;

    .line 2
    .line 3
    invoke-virtual {v0}, LE/I;->s()LE/s;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, LE/s;->i()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return p1

    .line 19
    :cond_0
    invoke-interface {v0}, LE/s;->i()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    move v4, v3

    .line 29
    :goto_0
    if-ge v4, v2, :cond_2

    .line 30
    .line 31
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    move-object v6, v5

    .line 36
    check-cast v6, LE/k;

    .line 37
    .line 38
    invoke-interface {v6}, LE/k;->getIndex()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-ne v6, p1, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/4 v5, 0x0

    .line 49
    :goto_1
    check-cast v5, LE/k;

    .line 50
    .line 51
    if-nez v5, :cond_5

    .line 52
    .line 53
    iget-object v1, p0, LE/e;->a:LE/I;

    .line 54
    .line 55
    invoke-virtual {v1}, LE/I;->B()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-direct {p0, v0}, LE/e;->f(LE/s;)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-virtual {p0}, LE/e;->d()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    const/4 v4, 0x1

    .line 68
    if-ge p1, v2, :cond_3

    .line 69
    .line 70
    move v3, v4

    .line 71
    :cond_3
    invoke-virtual {p0}, LE/e;->d()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    sub-int/2addr p1, v2

    .line 76
    add-int/lit8 v2, v1, -0x1

    .line 77
    .line 78
    if-eqz v3, :cond_4

    .line 79
    .line 80
    const/4 v4, -0x1

    .line 81
    :cond_4
    mul-int/2addr v2, v4

    .line 82
    add-int/2addr p1, v2

    .line 83
    div-int/2addr p1, v1

    .line 84
    mul-int/2addr v0, p1

    .line 85
    int-to-float p1, v0

    .line 86
    invoke-virtual {p0}, LE/e;->g()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    int-to-float v0, v0

    .line 91
    sub-float/2addr p1, v0

    .line 92
    return p1

    .line 93
    :cond_5
    invoke-interface {v0}, LE/s;->a()Lz/q;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    sget-object v0, Lz/q;->a:Lz/q;

    .line 98
    .line 99
    if-ne p1, v0, :cond_6

    .line 100
    .line 101
    invoke-interface {v5}, LE/k;->c()J

    .line 102
    .line 103
    .line 104
    move-result-wide v0

    .line 105
    invoke-static {v0, v1}, Li1/n;->l(J)I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    goto :goto_2

    .line 110
    :cond_6
    invoke-interface {v5}, LE/k;->c()J

    .line 111
    .line 112
    .line 113
    move-result-wide v0

    .line 114
    invoke-static {v0, v1}, Li1/n;->k(J)I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    :goto_2
    int-to-float p1, p1

    .line 119
    return p1
.end method

.method public c(Lz/u;II)V
    .locals 1

    .line 1
    iget-object p1, p0, LE/e;->a:LE/I;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-virtual {p1, p2, p3, v0}, LE/I;->I(IIZ)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public d()I
    .locals 1

    .line 1
    iget-object v0, p0, LE/e;->a:LE/I;

    .line 2
    .line 3
    invoke-virtual {v0}, LE/I;->o()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public e(Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, LE/e;->a:LE/I;

    .line 2
    .line 3
    const/4 v4, 0x1

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    move-object v2, p1

    .line 7
    move-object v3, p2

    .line 8
    invoke-static/range {v0 .. v5}, Lz/x;->d(Lz/x;Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 20
    .line 21
    return-object p1
.end method

.method public g()I
    .locals 1

    .line 1
    iget-object v0, p0, LE/e;->a:LE/I;

    .line 2
    .line 3
    invoke-virtual {v0}, LE/I;->p()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
