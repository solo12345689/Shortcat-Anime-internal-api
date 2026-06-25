.class public LXf/U;
.super LUf/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LWf/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LXf/U$a;,
        LXf/U$b;
    }
.end annotation


# instance fields
.field private final a:LWf/b;

.field private final b:LXf/e0;

.field public final c:LXf/a;

.field private final d:LYf/e;

.field private e:I

.field private f:LXf/U$a;

.field private final g:LWf/g;

.field private final h:LXf/z;


# direct methods
.method public constructor <init>(LWf/b;LXf/e0;LXf/a;LTf/e;LXf/U$a;)V
    .locals 1

    .line 1
    const-string v0, "json"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "mode"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "lexer"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "descriptor"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, LUf/a;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LXf/U;->a:LWf/b;

    .line 25
    .line 26
    iput-object p2, p0, LXf/U;->b:LXf/e0;

    .line 27
    .line 28
    iput-object p3, p0, LXf/U;->c:LXf/a;

    .line 29
    .line 30
    invoke-virtual {p1}, LWf/b;->a()LYf/e;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    iput-object p2, p0, LXf/U;->d:LYf/e;

    .line 35
    .line 36
    const/4 p2, -0x1

    .line 37
    iput p2, p0, LXf/U;->e:I

    .line 38
    .line 39
    iput-object p5, p0, LXf/U;->f:LXf/U$a;

    .line 40
    .line 41
    invoke-virtual {p1}, LWf/b;->f()LWf/g;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, LXf/U;->g:LWf/g;

    .line 46
    .line 47
    invoke-virtual {p1}, LWf/g;->j()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance p1, LXf/z;

    .line 56
    .line 57
    invoke-direct {p1, p4}, LXf/z;-><init>(LTf/e;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    iput-object p1, p0, LXf/U;->h:LXf/z;

    .line 61
    .line 62
    return-void
.end method

.method private final K()V
    .locals 8

    .line 1
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LXf/a;->F()B

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x4

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v2, p0, LXf/U;->c:LXf/a;

    .line 12
    .line 13
    const/4 v6, 0x6

    .line 14
    const/4 v7, 0x0

    .line 15
    const-string v3, "Unexpected leading comma"

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    invoke-static/range {v2 .. v7}, LXf/a;->x(LXf/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 20
    .line 21
    .line 22
    new-instance v0, LTd/k;

    .line 23
    .line 24
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 25
    .line 26
    .line 27
    throw v0
.end method

.method private final L(LTf/e;I)Z
    .locals 5

    .line 1
    iget-object v0, p0, LXf/U;->a:LWf/b;

    .line 2
    .line 3
    invoke-interface {p1, p2}, LTf/e;->p(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {p1, p2}, LTf/e;->n(I)LTf/e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 p2, 0x1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {p1}, LTf/e;->i()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    iget-object v2, p0, LXf/U;->c:LXf/a;

    .line 21
    .line 22
    invoke-virtual {v2, p2}, LXf/a;->N(Z)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    return p2

    .line 29
    :cond_0
    invoke-interface {p1}, LTf/e;->h()LTf/l;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    sget-object v3, LTf/l$b;->a:LTf/l$b;

    .line 34
    .line 35
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const/4 v3, 0x0

    .line 40
    if-eqz v2, :cond_5

    .line 41
    .line 42
    invoke-interface {p1}, LTf/e;->i()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    iget-object v2, p0, LXf/U;->c:LXf/a;

    .line 49
    .line 50
    invoke-virtual {v2, v3}, LXf/a;->N(Z)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    return v3

    .line 57
    :cond_1
    iget-object v2, p0, LXf/U;->c:LXf/a;

    .line 58
    .line 59
    iget-object v4, p0, LXf/U;->g:LWf/g;

    .line 60
    .line 61
    invoke-virtual {v4}, LWf/g;->q()Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    invoke-virtual {v2, v4}, LXf/a;->G(Z)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-nez v2, :cond_2

    .line 70
    .line 71
    return v3

    .line 72
    :cond_2
    invoke-static {p1, v0, v2}, LXf/E;->i(LTf/e;LWf/b;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-virtual {v0}, LWf/b;->f()LWf/g;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, LWf/g;->j()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_3

    .line 85
    .line 86
    invoke-interface {p1}, LTf/e;->i()Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    move p1, p2

    .line 93
    goto :goto_0

    .line 94
    :cond_3
    move p1, v3

    .line 95
    :goto_0
    const/4 v0, -0x3

    .line 96
    if-ne v2, v0, :cond_5

    .line 97
    .line 98
    if-nez v1, :cond_4

    .line 99
    .line 100
    if-eqz p1, :cond_5

    .line 101
    .line 102
    :cond_4
    iget-object p1, p0, LXf/U;->c:LXf/a;

    .line 103
    .line 104
    invoke-virtual {p1}, LXf/a;->o()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    return p2

    .line 108
    :cond_5
    return v3
.end method

.method private final M()I
    .locals 9

    .line 1
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LXf/a;->M()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, LXf/U;->c:LXf/a;

    .line 8
    .line 9
    invoke-virtual {v1}, LXf/a;->e()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, -0x1

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    iget v1, p0, LXf/U;->e:I

    .line 17
    .line 18
    if-eq v1, v2, :cond_1

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v3, p0, LXf/U;->c:LXf/a;

    .line 24
    .line 25
    const/4 v7, 0x6

    .line 26
    const/4 v8, 0x0

    .line 27
    const-string v4, "Expected end of the array or comma"

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    invoke-static/range {v3 .. v8}, LXf/a;->x(LXf/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 32
    .line 33
    .line 34
    new-instance v0, LTd/k;

    .line 35
    .line 36
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_1
    :goto_0
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    iput v1, p0, LXf/U;->e:I

    .line 43
    .line 44
    return v1

    .line 45
    :cond_2
    if-eqz v0, :cond_4

    .line 46
    .line 47
    iget-object v0, p0, LXf/U;->a:LWf/b;

    .line 48
    .line 49
    invoke-virtual {v0}, LWf/b;->f()LWf/g;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, LWf/g;->d()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 61
    .line 62
    const-string v1, "array"

    .line 63
    .line 64
    invoke-static {v0, v1}, LXf/C;->h(LXf/a;Ljava/lang/String;)Ljava/lang/Void;

    .line 65
    .line 66
    .line 67
    new-instance v0, LTd/k;

    .line 68
    .line 69
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :cond_4
    :goto_1
    return v2
.end method

.method private final N()I
    .locals 11

    .line 1
    iget v0, p0, LXf/U;->e:I

    .line 2
    .line 3
    rem-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move v1, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v3

    .line 12
    :goto_0
    const/4 v4, -0x1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    if-eq v0, v4, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 18
    .line 19
    invoke-virtual {v0}, LXf/a;->M()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 25
    .line 26
    const/16 v5, 0x3a

    .line 27
    .line 28
    invoke-virtual {v0, v5}, LXf/a;->l(C)V

    .line 29
    .line 30
    .line 31
    :cond_2
    :goto_1
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 32
    .line 33
    invoke-virtual {v0}, LXf/a;->e()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_7

    .line 38
    .line 39
    if-eqz v1, :cond_6

    .line 40
    .line 41
    iget v0, p0, LXf/U;->e:I

    .line 42
    .line 43
    if-ne v0, v4, :cond_4

    .line 44
    .line 45
    iget-object v5, p0, LXf/U;->c:LXf/a;

    .line 46
    .line 47
    iget v7, v5, LXf/a;->a:I

    .line 48
    .line 49
    if-nez v3, :cond_3

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    const/4 v9, 0x4

    .line 53
    const/4 v10, 0x0

    .line 54
    const-string v6, "Unexpected leading comma"

    .line 55
    .line 56
    const/4 v8, 0x0

    .line 57
    invoke-static/range {v5 .. v10}, LXf/a;->x(LXf/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 58
    .line 59
    .line 60
    new-instance v0, LTd/k;

    .line 61
    .line 62
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :cond_4
    iget-object v1, p0, LXf/U;->c:LXf/a;

    .line 67
    .line 68
    move v0, v3

    .line 69
    iget v3, v1, LXf/a;->a:I

    .line 70
    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_5
    const/4 v5, 0x4

    .line 75
    const/4 v6, 0x0

    .line 76
    const-string v2, "Expected comma after the key-value pair"

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    invoke-static/range {v1 .. v6}, LXf/a;->x(LXf/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 80
    .line 81
    .line 82
    new-instance v0, LTd/k;

    .line 83
    .line 84
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 85
    .line 86
    .line 87
    throw v0

    .line 88
    :cond_6
    :goto_2
    iget v0, p0, LXf/U;->e:I

    .line 89
    .line 90
    add-int/2addr v0, v2

    .line 91
    iput v0, p0, LXf/U;->e:I

    .line 92
    .line 93
    return v0

    .line 94
    :cond_7
    move v0, v3

    .line 95
    if-eqz v0, :cond_9

    .line 96
    .line 97
    iget-object v0, p0, LXf/U;->a:LWf/b;

    .line 98
    .line 99
    invoke-virtual {v0}, LWf/b;->f()LWf/g;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, LWf/g;->d()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_8

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_8
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 111
    .line 112
    const/4 v1, 0x0

    .line 113
    invoke-static {v0, v1, v2, v1}, LXf/C;->i(LXf/a;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 114
    .line 115
    .line 116
    new-instance v0, LTd/k;

    .line 117
    .line 118
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 119
    .line 120
    .line 121
    throw v0

    .line 122
    :cond_9
    :goto_3
    return v4
.end method

.method private final O(LTf/e;)I
    .locals 5

    .line 1
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LXf/a;->M()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    :goto_0
    iget-object v1, p0, LXf/U;->c:LXf/a;

    .line 8
    .line 9
    invoke-virtual {v1}, LXf/a;->e()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz v1, :cond_4

    .line 15
    .line 16
    invoke-direct {p0}, LXf/U;->P()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, LXf/U;->c:LXf/a;

    .line 21
    .line 22
    const/16 v3, 0x3a

    .line 23
    .line 24
    invoke-virtual {v1, v3}, LXf/a;->l(C)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, LXf/U;->a:LWf/b;

    .line 28
    .line 29
    invoke-static {p1, v1, v0}, LXf/E;->i(LTf/e;LWf/b;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v3, -0x3

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    iget-object v2, p0, LXf/U;->g:LWf/g;

    .line 38
    .line 39
    invoke-virtual {v2}, LWf/g;->g()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-direct {p0, p1, v1}, LXf/U;->L(LTf/e;I)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    iget-object v1, p0, LXf/U;->c:LXf/a;

    .line 52
    .line 53
    invoke-virtual {v1}, LXf/a;->M()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    move v2, v4

    .line 58
    goto :goto_1

    .line 59
    :cond_0
    iget-object p1, p0, LXf/U;->h:LXf/z;

    .line 60
    .line 61
    if-eqz p1, :cond_1

    .line 62
    .line 63
    invoke-virtual {p1, v1}, LXf/z;->c(I)V

    .line 64
    .line 65
    .line 66
    :cond_1
    return v1

    .line 67
    :cond_2
    move v1, v4

    .line 68
    :goto_1
    if-eqz v2, :cond_3

    .line 69
    .line 70
    invoke-direct {p0, v0}, LXf/U;->Q(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    goto :goto_0

    .line 75
    :cond_3
    move v0, v1

    .line 76
    goto :goto_0

    .line 77
    :cond_4
    if-eqz v0, :cond_6

    .line 78
    .line 79
    iget-object p1, p0, LXf/U;->a:LWf/b;

    .line 80
    .line 81
    invoke-virtual {p1}, LWf/b;->f()LWf/g;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1}, LWf/g;->d()Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_5

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    iget-object p1, p0, LXf/U;->c:LXf/a;

    .line 93
    .line 94
    const/4 v0, 0x0

    .line 95
    invoke-static {p1, v0, v2, v0}, LXf/C;->i(LXf/a;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 96
    .line 97
    .line 98
    new-instance p1, LTd/k;

    .line 99
    .line 100
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 101
    .line 102
    .line 103
    throw p1

    .line 104
    :cond_6
    :goto_2
    iget-object p1, p0, LXf/U;->h:LXf/z;

    .line 105
    .line 106
    if-eqz p1, :cond_7

    .line 107
    .line 108
    invoke-virtual {p1}, LXf/z;->d()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    return p1

    .line 113
    :cond_7
    const/4 p1, -0x1

    .line 114
    return p1
.end method

.method private final P()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LXf/U;->g:LWf/g;

    .line 2
    .line 3
    invoke-virtual {v0}, LWf/g;->q()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 10
    .line 11
    invoke-virtual {v0}, LXf/a;->r()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 17
    .line 18
    invoke-virtual {v0}, LXf/a;->i()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method private final Q(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LXf/U;->g:LWf/g;

    .line 2
    .line 3
    invoke-virtual {v0}, LWf/g;->k()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, LXf/U;->f:LXf/U$a;

    .line 10
    .line 11
    invoke-direct {p0, v0, p1}, LXf/U;->S(LXf/U$a;Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, LXf/a;->A(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    iget-object p1, p0, LXf/U;->c:LXf/a;

    .line 25
    .line 26
    iget-object v0, p0, LXf/U;->g:LWf/g;

    .line 27
    .line 28
    invoke-virtual {v0}, LWf/g;->q()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p1, v0}, LXf/a;->I(Z)V

    .line 33
    .line 34
    .line 35
    :goto_1
    iget-object p1, p0, LXf/U;->c:LXf/a;

    .line 36
    .line 37
    invoke-virtual {p1}, LXf/a;->M()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1
.end method

.method private final R(LTf/e;)V
    .locals 2

    .line 1
    :cond_0
    invoke-virtual {p0, p1}, LXf/U;->i(LTf/e;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    return-void
.end method

.method private final S(LXf/U$a;Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p1, LXf/U$a;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v1, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    iput-object p2, p1, LXf/U$a;->a:Ljava/lang/String;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :cond_1
    return v0
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LXf/U;->g:LWf/g;

    .line 2
    .line 3
    invoke-virtual {v0}, LWf/g;->q()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 10
    .line 11
    invoke-virtual {v0}, LXf/a;->r()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 17
    .line 18
    invoke-virtual {v0}, LXf/a;->o()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public C(LRf/a;)Ljava/lang/Object;
    .locals 11

    .line 1
    const-string v0, "deserializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    const/4 v2, 0x0

    .line 8
    :try_start_0
    instance-of v0, p1, LVf/b;

    .line 9
    .line 10
    if-eqz v0, :cond_5

    .line 11
    .line 12
    iget-object v0, p0, LXf/U;->a:LWf/b;

    .line 13
    .line 14
    invoke-virtual {v0}, LWf/b;->f()LWf/g;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, LWf/g;->p()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_1

    .line 25
    .line 26
    :cond_0
    move-object v0, p1

    .line 27
    check-cast v0, LVf/b;

    .line 28
    .line 29
    invoke-interface {v0}, LRf/b;->getDescriptor()LTf/e;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v3, p0, LXf/U;->a:LWf/b;

    .line 34
    .line 35
    invoke-static {v0, v3}, LXf/S;->c(LTf/e;LWf/b;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v3, p0, LXf/U;->c:LXf/a;

    .line 40
    .line 41
    iget-object v4, p0, LXf/U;->g:LWf/g;

    .line 42
    .line 43
    invoke-virtual {v4}, LWf/g;->q()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-virtual {v3, v0, v4}, LXf/a;->E(Ljava/lang/String;Z)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    if-nez v3, :cond_4

    .line 52
    .line 53
    invoke-interface {p0}, LWf/h;->d()LWf/b;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, LWf/b;->f()LWf/g;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, LWf/g;->p()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    invoke-interface {p1, p0}, LRf/a;->deserialize(LUf/e;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1

    .line 72
    :catch_0
    move-exception v0

    .line 73
    move-object p1, v0

    .line 74
    goto/16 :goto_2

    .line 75
    .line 76
    :cond_1
    move-object v0, p1

    .line 77
    check-cast v0, LVf/b;

    .line 78
    .line 79
    invoke-interface {v0}, LRf/b;->getDescriptor()LTf/e;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-interface {p0}, LWf/h;->d()LWf/b;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-static {v0, v3}, LXf/S;->c(LTf/e;LWf/b;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-interface {p0}, LWf/h;->g()LWf/i;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    move-object v4, p1

    .line 96
    check-cast v4, LVf/b;

    .line 97
    .line 98
    invoke-interface {v4}, LRf/b;->getDescriptor()LTf/e;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-interface {v4}, LTf/e;->o()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    instance-of v5, v3, LWf/C;

    .line 107
    .line 108
    const/4 v6, -0x1

    .line 109
    if-eqz v5, :cond_3

    .line 110
    .line 111
    check-cast v3, LWf/C;

    .line 112
    .line 113
    invoke-virtual {v3, v0}, LWf/C;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    check-cast v4, LWf/i;

    .line 118
    .line 119
    if-eqz v4, :cond_2

    .line 120
    .line 121
    invoke-static {v4}, LWf/j;->o(LWf/i;)LWf/E;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    if-eqz v4, :cond_2

    .line 126
    .line 127
    invoke-static {v4}, LWf/j;->f(LWf/E;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v4
    :try_end_0
    .catch LRf/c; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    goto :goto_0

    .line 132
    :cond_2
    move-object v4, v2

    .line 133
    :goto_0
    :try_start_1
    check-cast p1, LVf/b;

    .line 134
    .line 135
    invoke-static {p1, p0, v4}, LRf/d;->a(LVf/b;LUf/c;Ljava/lang/String;)LRf/a;

    .line 136
    .line 137
    .line 138
    move-result-object p1
    :try_end_1
    .catch LRf/j; {:try_start_1 .. :try_end_1} :catch_1

    .line 139
    :try_start_2
    const-string v4, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>"

    .line 140
    .line 141
    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {p0}, LWf/h;->d()LWf/b;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-static {v4, v0, v3, p1}, LXf/b0;->b(LWf/b;Ljava/lang/String;LWf/C;LRf/a;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    return-object p1

    .line 153
    :catch_1
    move-exception v0

    .line 154
    move-object p1, v0

    .line 155
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3}, LWf/C;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-static {v6, p1, v0}, LXf/C;->f(ILjava/lang/String;Ljava/lang/CharSequence;)LXf/y;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    throw p1

    .line 171
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 174
    .line 175
    .line 176
    const-string v0, "Expected "

    .line 177
    .line 178
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    const-class v0, LWf/C;

    .line 182
    .line 183
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-interface {v0}, Lpe/d;->v()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string v0, ", but had "

    .line 195
    .line 196
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-interface {v0}, Lpe/d;->v()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-string v0, " as the serialized body of "

    .line 215
    .line 216
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    const-string v0, " at element: "

    .line 223
    .line 224
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 228
    .line 229
    iget-object v0, v0, LXf/a;->b:LXf/F;

    .line 230
    .line 231
    invoke-virtual {v0}, LXf/F;->a()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-static {v6, p1, v0}, LXf/C;->f(ILjava/lang/String;Ljava/lang/CharSequence;)LXf/y;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    throw p1
    :try_end_2
    .catch LRf/c; {:try_start_2 .. :try_end_2} :catch_0

    .line 251
    :cond_4
    :try_start_3
    check-cast p1, LVf/b;

    .line 252
    .line 253
    invoke-static {p1, p0, v3}, LRf/d;->a(LVf/b;LUf/c;Ljava/lang/String;)LRf/a;

    .line 254
    .line 255
    .line 256
    move-result-object p1
    :try_end_3
    .catch LRf/j; {:try_start_3 .. :try_end_3} :catch_2

    .line 257
    :try_start_4
    const-string v3, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>"

    .line 258
    .line 259
    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    new-instance v3, LXf/U$a;

    .line 263
    .line 264
    invoke-direct {v3, v0}, LXf/U$a;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    iput-object v3, p0, LXf/U;->f:LXf/U$a;

    .line 268
    .line 269
    invoke-interface {p1, p0}, LRf/a;->deserialize(LUf/e;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    return-object p1

    .line 274
    :catch_2
    move-exception v0

    .line 275
    move-object p1, v0

    .line 276
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    const/16 v3, 0xa

    .line 284
    .line 285
    invoke-static {v0, v3, v2, v1, v2}, LDf/r;->d1(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    const-string v4, "."

    .line 290
    .line 291
    invoke-static {v0, v4}, LDf/r;->D0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    const-string v0, ""

    .line 303
    .line 304
    invoke-static {p1, v3, v0}, LDf/r;->T0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v8

    .line 308
    iget-object v5, p0, LXf/U;->c:LXf/a;

    .line 309
    .line 310
    const/4 v9, 0x2

    .line 311
    const/4 v10, 0x0

    .line 312
    const/4 v7, 0x0

    .line 313
    invoke-static/range {v5 .. v10}, LXf/a;->x(LXf/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 314
    .line 315
    .line 316
    new-instance p1, LTd/k;

    .line 317
    .line 318
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 319
    .line 320
    .line 321
    throw p1

    .line 322
    :cond_5
    :goto_1
    invoke-interface {p1, p0}, LRf/a;->deserialize(LUf/e;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object p1
    :try_end_4
    .catch LRf/c; {:try_start_4 .. :try_end_4} :catch_0

    .line 326
    return-object p1

    .line 327
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    const-string v3, "at path"

    .line 335
    .line 336
    const/4 v4, 0x0

    .line 337
    invoke-static {v0, v3, v4, v1, v2}, LDf/r;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_6

    .line 342
    .line 343
    throw p1

    .line 344
    :cond_6
    new-instance v0, LRf/c;

    .line 345
    .line 346
    invoke-virtual {p1}, LRf/c;->a()Ljava/util/List;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    new-instance v2, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 353
    .line 354
    .line 355
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    const-string v3, " at path: "

    .line 363
    .line 364
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    iget-object v3, p0, LXf/U;->c:LXf/a;

    .line 368
    .line 369
    iget-object v3, v3, LXf/a;->b:LXf/F;

    .line 370
    .line 371
    invoke-virtual {v3}, LXf/F;->a()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    invoke-direct {v0, v1, v2, p1}, LRf/c;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 383
    .line 384
    .line 385
    throw v0
.end method

.method public D()Z
    .locals 4

    .line 1
    iget-object v0, p0, LXf/U;->h:LXf/z;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, LXf/z;->b()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-static {v0, v1, v3, v2}, LXf/a;->O(LXf/a;ZILjava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    return v3

    .line 25
    :cond_1
    return v1
.end method

.method public E()B
    .locals 10

    .line 1
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LXf/a;->m()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-int v2, v0

    .line 8
    int-to-byte v2, v2

    .line 9
    int-to-long v3, v2

    .line 10
    cmp-long v3, v0, v3

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    iget-object v4, p0, LXf/U;->c:LXf/a;

    .line 16
    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v3, "Failed to parse byte for input \'"

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 v0, 0x27

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    const/4 v8, 0x6

    .line 40
    const/4 v9, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    invoke-static/range {v4 .. v9}, LXf/a;->x(LXf/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 44
    .line 45
    .line 46
    new-instance v0, LTd/k;

    .line 47
    .line 48
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 49
    .line 50
    .line 51
    throw v0
.end method

.method public a()LYf/e;
    .locals 1

    .line 1
    iget-object v0, p0, LXf/U;->d:LYf/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(LTf/e;)LUf/c;
    .locals 7

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LXf/U;->a:LWf/b;

    .line 7
    .line 8
    invoke-static {v0, p1}, LXf/f0;->b(LWf/b;LTf/e;)LXf/e0;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 13
    .line 14
    iget-object v0, v0, LXf/a;->b:LXf/F;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, LXf/F;->c(LTf/e;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 20
    .line 21
    iget-char v1, v3, LXf/e0;->a:C

    .line 22
    .line 23
    invoke-virtual {v0, v1}, LXf/a;->l(C)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, LXf/U;->K()V

    .line 27
    .line 28
    .line 29
    sget-object v0, LXf/U$b;->a:[I

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    aget v0, v0, v1

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    if-eq v0, v1, :cond_1

    .line 39
    .line 40
    const/4 v1, 0x2

    .line 41
    if-eq v0, v1, :cond_1

    .line 42
    .line 43
    const/4 v1, 0x3

    .line 44
    if-eq v0, v1, :cond_1

    .line 45
    .line 46
    iget-object v0, p0, LXf/U;->b:LXf/e0;

    .line 47
    .line 48
    if-ne v0, v3, :cond_0

    .line 49
    .line 50
    iget-object v0, p0, LXf/U;->a:LWf/b;

    .line 51
    .line 52
    invoke-virtual {v0}, LWf/b;->f()LWf/g;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, LWf/g;->j()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_0
    new-instance v1, LXf/U;

    .line 64
    .line 65
    iget-object v2, p0, LXf/U;->a:LWf/b;

    .line 66
    .line 67
    iget-object v4, p0, LXf/U;->c:LXf/a;

    .line 68
    .line 69
    iget-object v6, p0, LXf/U;->f:LXf/U$a;

    .line 70
    .line 71
    move-object v5, p1

    .line 72
    invoke-direct/range {v1 .. v6}, LXf/U;-><init>(LWf/b;LXf/e0;LXf/a;LTf/e;LXf/U$a;)V

    .line 73
    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_1
    move-object v5, p1

    .line 77
    new-instance v1, LXf/U;

    .line 78
    .line 79
    iget-object v2, p0, LXf/U;->a:LWf/b;

    .line 80
    .line 81
    iget-object v4, p0, LXf/U;->c:LXf/a;

    .line 82
    .line 83
    iget-object v6, p0, LXf/U;->f:LXf/U$a;

    .line 84
    .line 85
    invoke-direct/range {v1 .. v6}, LXf/U;-><init>(LWf/b;LXf/e0;LXf/a;LTf/e;LXf/U$a;)V

    .line 86
    .line 87
    .line 88
    return-object v1
.end method

.method public c(LTf/e;)V
    .locals 1

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LXf/U;->a:LWf/b;

    .line 7
    .line 8
    invoke-virtual {v0}, LWf/b;->f()LWf/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, LWf/g;->k()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {p1}, LTf/e;->k()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    invoke-direct {p0, p1}, LXf/U;->R(LTf/e;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object p1, p0, LXf/U;->c:LXf/a;

    .line 28
    .line 29
    invoke-virtual {p1}, LXf/a;->M()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    iget-object p1, p0, LXf/U;->a:LWf/b;

    .line 36
    .line 37
    invoke-virtual {p1}, LWf/b;->f()LWf/g;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, LWf/g;->d()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object p1, p0, LXf/U;->c:LXf/a;

    .line 49
    .line 50
    const-string v0, ""

    .line 51
    .line 52
    invoke-static {p1, v0}, LXf/C;->h(LXf/a;Ljava/lang/String;)Ljava/lang/Void;

    .line 53
    .line 54
    .line 55
    new-instance p1, LTd/k;

    .line 56
    .line 57
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_2
    :goto_0
    iget-object p1, p0, LXf/U;->c:LXf/a;

    .line 62
    .line 63
    iget-object v0, p0, LXf/U;->b:LXf/e0;

    .line 64
    .line 65
    iget-char v0, v0, LXf/e0;->b:C

    .line 66
    .line 67
    invoke-virtual {p1, v0}, LXf/a;->l(C)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, LXf/U;->c:LXf/a;

    .line 71
    .line 72
    iget-object p1, p1, LXf/a;->b:LXf/F;

    .line 73
    .line 74
    invoke-virtual {p1}, LXf/F;->b()V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final d()LWf/b;
    .locals 1

    .line 1
    iget-object v0, p0, LXf/U;->a:LWf/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "deserializer"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LXf/U;->b:LXf/e0;

    .line 12
    .line 13
    sget-object v1, LXf/e0;->e:LXf/e0;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    and-int/lit8 v0, p2, 0x1

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, LXf/U;->c:LXf/a;

    .line 27
    .line 28
    iget-object v1, v1, LXf/a;->b:LXf/F;

    .line 29
    .line 30
    invoke-virtual {v1}, LXf/F;->d()V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, LUf/a;->e(LTf/e;ILRf/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object p2, p0, LXf/U;->c:LXf/a;

    .line 40
    .line 41
    iget-object p2, p2, LXf/a;->b:LXf/F;

    .line 42
    .line 43
    invoke-virtual {p2, p1}, LXf/F;->f(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    return-object p1
.end method

.method public g()LWf/i;
    .locals 3

    .line 1
    new-instance v0, LXf/Q;

    .line 2
    .line 3
    iget-object v1, p0, LXf/U;->a:LWf/b;

    .line 4
    .line 5
    invoke-virtual {v1}, LWf/b;->f()LWf/g;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, LXf/U;->c:LXf/a;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, LXf/Q;-><init>(LWf/g;LXf/a;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, LXf/Q;->e()LWf/i;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public h()I
    .locals 10

    .line 1
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LXf/a;->m()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-int v2, v0

    .line 8
    int-to-long v3, v2

    .line 9
    cmp-long v3, v0, v3

    .line 10
    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    return v2

    .line 14
    :cond_0
    iget-object v4, p0, LXf/U;->c:LXf/a;

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v3, "Failed to parse int for input \'"

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const/16 v0, 0x27

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    const/4 v8, 0x6

    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x0

    .line 42
    invoke-static/range {v4 .. v9}, LXf/a;->x(LXf/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 43
    .line 44
    .line 45
    new-instance v0, LTd/k;

    .line 46
    .line 47
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 48
    .line 49
    .line 50
    throw v0
.end method

.method public i(LTf/e;)I
    .locals 2

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LXf/U;->b:LXf/e0;

    .line 7
    .line 8
    sget-object v1, LXf/U$b;->a:[I

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    aget v0, v1, v0

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    if-eq v0, v1, :cond_0

    .line 21
    .line 22
    invoke-direct {p0}, LXf/U;->M()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-direct {p0, p1}, LXf/U;->O(LTf/e;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-direct {p0}, LXf/U;->N()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    :goto_0
    iget-object v0, p0, LXf/U;->b:LXf/e0;

    .line 37
    .line 38
    sget-object v1, LXf/e0;->e:LXf/e0;

    .line 39
    .line 40
    if-eq v0, v1, :cond_2

    .line 41
    .line 42
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 43
    .line 44
    iget-object v0, v0, LXf/a;->b:LXf/F;

    .line 45
    .line 46
    invoke-virtual {v0, p1}, LXf/F;->g(I)V

    .line 47
    .line 48
    .line 49
    :cond_2
    return p1
.end method

.method public j()Ljava/lang/Void;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public k(LTf/e;)I
    .locals 4

    .line 1
    const-string v0, "enumDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LXf/U;->a:LWf/b;

    .line 7
    .line 8
    invoke-virtual {p0}, LXf/U;->A()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v3, " at path "

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v3, p0, LXf/U;->c:LXf/a;

    .line 23
    .line 24
    iget-object v3, v3, LXf/a;->b:LXf/F;

    .line 25
    .line 26
    invoke-virtual {v3}, LXf/F;->a()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {p1, v0, v1, v2}, LXf/E;->j(LTf/e;LWf/b;Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1
.end method

.method public n()J
    .locals 2

    .line 1
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LXf/a;->m()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public q()S
    .locals 10

    .line 1
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LXf/a;->m()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-int v2, v0

    .line 8
    int-to-short v2, v2

    .line 9
    int-to-long v3, v2

    .line 10
    cmp-long v3, v0, v3

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    iget-object v4, p0, LXf/U;->c:LXf/a;

    .line 16
    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v3, "Failed to parse short for input \'"

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 v0, 0x27

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    const/4 v8, 0x6

    .line 40
    const/4 v9, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    invoke-static/range {v4 .. v9}, LXf/a;->x(LXf/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 44
    .line 45
    .line 46
    new-instance v0, LTd/k;

    .line 47
    .line 48
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 49
    .line 50
    .line 51
    throw v0
.end method

.method public r()F
    .locals 6

    .line 1
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LXf/a;->q()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    :try_start_0
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 8
    .line 9
    .line 10
    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    iget-object v1, p0, LXf/U;->a:LWf/b;

    .line 12
    .line 13
    invoke-virtual {v1}, LWf/b;->f()LWf/g;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, LWf/g;->b()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    return v0

    .line 36
    :cond_0
    iget-object v1, p0, LXf/U;->c:LXf/a;

    .line 37
    .line 38
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v1, v0}, LXf/C;->l(LXf/a;Ljava/lang/Number;)Ljava/lang/Void;

    .line 43
    .line 44
    .line 45
    new-instance v0, LTd/k;

    .line 46
    .line 47
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :cond_1
    return v0

    .line 52
    :catch_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v3, "Failed to parse type \'"

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v3, "float"

    .line 63
    .line 64
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v3, "\' for input \'"

    .line 68
    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const/16 v1, 0x27

    .line 76
    .line 77
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const/4 v4, 0x6

    .line 85
    const/4 v5, 0x0

    .line 86
    const/4 v2, 0x0

    .line 87
    const/4 v3, 0x0

    .line 88
    invoke-static/range {v0 .. v5}, LXf/a;->x(LXf/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 89
    .line 90
    .line 91
    new-instance v0, LTd/k;

    .line 92
    .line 93
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 94
    .line 95
    .line 96
    throw v0
.end method

.method public s()D
    .locals 6

    .line 1
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LXf/a;->q()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    :try_start_0
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 8
    .line 9
    .line 10
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    iget-object v2, p0, LXf/U;->a:LWf/b;

    .line 12
    .line 13
    invoke-virtual {v2}, LWf/b;->f()LWf/g;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, LWf/g;->b()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    return-wide v0

    .line 36
    :cond_0
    iget-object v2, p0, LXf/U;->c:LXf/a;

    .line 37
    .line 38
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v2, v0}, LXf/C;->l(LXf/a;Ljava/lang/Number;)Ljava/lang/Void;

    .line 43
    .line 44
    .line 45
    new-instance v0, LTd/k;

    .line 46
    .line 47
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :cond_1
    return-wide v0

    .line 52
    :catch_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v3, "Failed to parse type \'"

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v3, "double"

    .line 63
    .line 64
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v3, "\' for input \'"

    .line 68
    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const/16 v1, 0x27

    .line 76
    .line 77
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const/4 v4, 0x6

    .line 85
    const/4 v5, 0x0

    .line 86
    const/4 v2, 0x0

    .line 87
    const/4 v3, 0x0

    .line 88
    invoke-static/range {v0 .. v5}, LXf/a;->x(LXf/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 89
    .line 90
    .line 91
    new-instance v0, LTd/k;

    .line 92
    .line 93
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 94
    .line 95
    .line 96
    throw v0
.end method

.method public u()Z
    .locals 1

    .line 1
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LXf/a;->g()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public v()C
    .locals 7

    .line 1
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LXf/a;->q()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :cond_0
    iget-object v1, p0, LXf/U;->c:LXf/a;

    .line 21
    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v3, "Expected single char, but got \'"

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const/16 v0, 0x27

    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const/4 v5, 0x6

    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v3, 0x0

    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-static/range {v1 .. v6}, LXf/a;->x(LXf/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 49
    .line 50
    .line 51
    new-instance v0, LTd/k;

    .line 52
    .line 53
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 54
    .line 55
    .line 56
    throw v0
.end method

.method public z(LTf/e;)LUf/e;
    .locals 2

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LXf/W;->b(LTf/e;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance p1, LXf/x;

    .line 13
    .line 14
    iget-object v0, p0, LXf/U;->c:LXf/a;

    .line 15
    .line 16
    iget-object v1, p0, LXf/U;->a:LWf/b;

    .line 17
    .line 18
    invoke-direct {p1, v0, v1}, LXf/x;-><init>(LXf/a;LWf/b;)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    invoke-super {p0, p1}, LUf/a;->z(LTf/e;)LUf/e;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method
