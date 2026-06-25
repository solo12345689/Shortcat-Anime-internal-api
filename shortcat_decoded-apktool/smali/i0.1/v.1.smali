.class public abstract Li0/v;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lkotlin/jvm/functions/Function1;

.field private static final b:J

.field private static final c:Lg0/r;

.field private static final d:Ljava/lang/Object;

.field private static e:Li0/p;

.field private static f:J

.field private static final g:Li0/n;

.field private static final h:Li0/M;

.field private static i:Ljava/util/List;

.field private static j:Ljava/util/List;

.field private static final k:Li0/b;

.field private static final l:Li0/l;

.field private static m:Lg0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Li0/s;

    .line 2
    .line 3
    invoke-direct {v0}, Li0/s;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Li0/v;->a:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    new-instance v0, Lg0/r;

    .line 9
    .line 10
    invoke-direct {v0}, Lg0/r;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Li0/v;->c:Lg0/r;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/Object;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Li0/v;->d:Ljava/lang/Object;

    .line 21
    .line 22
    sget-object v0, Li0/p;->e:Li0/p$a;

    .line 23
    .line 24
    invoke-virtual {v0}, Li0/p$a;->a()Li0/p;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sput-object v1, Li0/v;->e:Li0/p;

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-static {v1}, Li0/q;->c(I)J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    int-to-long v4, v1

    .line 36
    add-long/2addr v2, v4

    .line 37
    sput-wide v2, Li0/v;->f:J

    .line 38
    .line 39
    new-instance v1, Li0/n;

    .line 40
    .line 41
    invoke-direct {v1}, Li0/n;-><init>()V

    .line 42
    .line 43
    .line 44
    sput-object v1, Li0/v;->g:Li0/n;

    .line 45
    .line 46
    new-instance v1, Li0/M;

    .line 47
    .line 48
    invoke-direct {v1}, Li0/M;-><init>()V

    .line 49
    .line 50
    .line 51
    sput-object v1, Li0/v;->h:Li0/M;

    .line 52
    .line 53
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    sput-object v1, Li0/v;->i:Ljava/util/List;

    .line 58
    .line 59
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    sput-object v1, Li0/v;->j:Ljava/util/List;

    .line 64
    .line 65
    sget-wide v1, Li0/v;->f:J

    .line 66
    .line 67
    add-long/2addr v4, v1

    .line 68
    sput-wide v4, Li0/v;->f:J

    .line 69
    .line 70
    invoke-virtual {v0}, Li0/p$a;->a()Li0/p;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    new-instance v3, Li0/b;

    .line 75
    .line 76
    invoke-direct {v3, v1, v2, v0}, Li0/b;-><init>(JLi0/p;)V

    .line 77
    .line 78
    .line 79
    sget-object v0, Li0/v;->e:Li0/p;

    .line 80
    .line 81
    invoke-virtual {v3}, Li0/l;->i()J

    .line 82
    .line 83
    .line 84
    move-result-wide v1

    .line 85
    invoke-virtual {v0, v1, v2}, Li0/p;->u(J)Li0/p;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, Li0/v;->e:Li0/p;

    .line 90
    .line 91
    sput-object v3, Li0/v;->k:Li0/b;

    .line 92
    .line 93
    sput-object v3, Li0/v;->l:Li0/l;

    .line 94
    .line 95
    new-instance v0, Lg0/a;

    .line 96
    .line 97
    const/4 v1, 0x0

    .line 98
    invoke-direct {v0, v1}, Lg0/a;-><init>(I)V

    .line 99
    .line 100
    .line 101
    sput-object v0, Li0/v;->m:Lg0/a;

    .line 102
    .line 103
    return-void
.end method

.method public static final synthetic A(J)V
    .locals 0

    .line 1
    sput-wide p0, Li0/v;->f:J

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic B(Li0/p;)V
    .locals 0

    .line 1
    sput-object p0, Li0/v;->e:Li0/p;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic C(Lkotlin/jvm/functions/Function1;)Li0/l;
    .locals 0

    .line 1
    invoke-static {p0}, Li0/v;->i0(Lkotlin/jvm/functions/Function1;)Li0/l;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic D(Li0/l;)V
    .locals 0

    .line 1
    invoke-static {p0}, Li0/v;->o0(Li0/l;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final E(Li0/p;JJ)Li0/p;
    .locals 2

    .line 1
    :goto_0
    invoke-static {p1, p2, p3, p4}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Li0/p;->u(J)Li0/p;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x1

    .line 12
    int-to-long v0, v0

    .line 13
    add-long/2addr p1, v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-object p0
.end method

.method private static final F(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 15

    .line 1
    sget-object v0, Li0/v;->k:Li0/b;

    .line 2
    .line 3
    invoke-static {}, Li0/v;->O()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    invoke-virtual {v0}, Li0/d;->E()Lt/Q;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    sget-object v3, Li0/v;->m:Lg0/a;

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    invoke-virtual {v3, v4}, Lg0/a;->a(I)I

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto/16 :goto_8

    .line 23
    .line 24
    :cond_0
    :goto_0
    invoke-static {v0, p0}, Li0/v;->h0(Li0/b;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    monitor-exit v1

    .line 29
    const/4 v1, 0x0

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    const/4 v3, -0x1

    .line 33
    :try_start_1
    sget-object v4, Li0/v;->i:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    move v6, v1

    .line 40
    :goto_1
    if-ge v6, v5, :cond_1

    .line 41
    .line 42
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 47
    .line 48
    invoke-static {v2}, La0/f;->a(Lt/e0;)Ljava/util/Set;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    invoke-interface {v7, v8, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 53
    .line 54
    .line 55
    add-int/lit8 v6, v6, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :catchall_1
    move-exception p0

    .line 59
    goto :goto_2

    .line 60
    :cond_1
    sget-object v0, Li0/v;->m:Lg0/a;

    .line 61
    .line 62
    invoke-virtual {v0, v3}, Lg0/a;->a(I)I

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :goto_2
    sget-object v0, Li0/v;->m:Lg0/a;

    .line 67
    .line 68
    invoke-virtual {v0, v3}, Lg0/a;->a(I)I

    .line 69
    .line 70
    .line 71
    throw p0

    .line 72
    :cond_2
    :goto_3
    invoke-static {}, Li0/v;->O()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    monitor-enter v0

    .line 77
    :try_start_2
    invoke-static {}, Li0/v;->H()V

    .line 78
    .line 79
    .line 80
    if-eqz v2, :cond_7

    .line 81
    .line 82
    iget-object v3, v2, Lt/e0;->b:[Ljava/lang/Object;

    .line 83
    .line 84
    iget-object v2, v2, Lt/e0;->a:[J

    .line 85
    .line 86
    array-length v4, v2

    .line 87
    add-int/lit8 v4, v4, -0x2

    .line 88
    .line 89
    if-ltz v4, :cond_6

    .line 90
    .line 91
    move v5, v1

    .line 92
    :goto_4
    aget-wide v6, v2, v5

    .line 93
    .line 94
    not-long v8, v6

    .line 95
    const/4 v10, 0x7

    .line 96
    shl-long/2addr v8, v10

    .line 97
    and-long/2addr v8, v6

    .line 98
    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    and-long/2addr v8, v10

    .line 104
    cmp-long v8, v8, v10

    .line 105
    .line 106
    if-eqz v8, :cond_5

    .line 107
    .line 108
    sub-int v8, v5, v4

    .line 109
    .line 110
    not-int v8, v8

    .line 111
    ushr-int/lit8 v8, v8, 0x1f

    .line 112
    .line 113
    const/16 v9, 0x8

    .line 114
    .line 115
    rsub-int/lit8 v8, v8, 0x8

    .line 116
    .line 117
    move v10, v1

    .line 118
    :goto_5
    if-ge v10, v8, :cond_4

    .line 119
    .line 120
    const-wide/16 v11, 0xff

    .line 121
    .line 122
    and-long/2addr v11, v6

    .line 123
    const-wide/16 v13, 0x80

    .line 124
    .line 125
    cmp-long v11, v11, v13

    .line 126
    .line 127
    if-gez v11, :cond_3

    .line 128
    .line 129
    shl-int/lit8 v11, v5, 0x3

    .line 130
    .line 131
    add-int/2addr v11, v10

    .line 132
    aget-object v11, v3, v11

    .line 133
    .line 134
    check-cast v11, Li0/U;

    .line 135
    .line 136
    invoke-static {v11}, Li0/v;->b0(Li0/U;)V

    .line 137
    .line 138
    .line 139
    goto :goto_6

    .line 140
    :catchall_2
    move-exception p0

    .line 141
    goto :goto_7

    .line 142
    :cond_3
    :goto_6
    shr-long/2addr v6, v9

    .line 143
    add-int/lit8 v10, v10, 0x1

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_4
    if-ne v8, v9, :cond_6

    .line 147
    .line 148
    :cond_5
    if-eq v5, v4, :cond_6

    .line 149
    .line 150
    add-int/lit8 v5, v5, 0x1

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_6
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 154
    .line 155
    :cond_7
    monitor-exit v0

    .line 156
    return-object p0

    .line 157
    :goto_7
    monitor-exit v0

    .line 158
    throw p0

    .line 159
    :goto_8
    monitor-exit v1

    .line 160
    throw p0
.end method

.method private static final G()V
    .locals 1

    .line 1
    sget-object v0, Li0/v;->a:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    invoke-static {v0}, Li0/v;->F(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static final H()V
    .locals 7

    .line 1
    sget-object v0, Li0/v;->h:Li0/M;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/M;->e()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    move v4, v3

    .line 10
    :goto_0
    const/4 v5, 0x0

    .line 11
    if-ge v3, v1, :cond_3

    .line 12
    .line 13
    invoke-virtual {v0}, Li0/M;->f()[Lg0/z;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    aget-object v6, v6, v3

    .line 18
    .line 19
    if-eqz v6, :cond_0

    .line 20
    .line 21
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    :cond_0
    if-eqz v5, :cond_2

    .line 26
    .line 27
    check-cast v5, Li0/U;

    .line 28
    .line 29
    invoke-static {v5}, Li0/v;->a0(Li0/U;)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_2

    .line 34
    .line 35
    if-eq v4, v3, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, Li0/M;->f()[Lg0/z;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    aput-object v6, v5, v4

    .line 42
    .line 43
    invoke-virtual {v0}, Li0/M;->d()[I

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v0}, Li0/M;->d()[I

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    aget v6, v6, v3

    .line 52
    .line 53
    aput v6, v5, v4

    .line 54
    .line 55
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 56
    .line 57
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    move v3, v4

    .line 61
    :goto_1
    if-ge v3, v1, :cond_4

    .line 62
    .line 63
    invoke-virtual {v0}, Li0/M;->f()[Lg0/z;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    aput-object v5, v6, v3

    .line 68
    .line 69
    invoke-virtual {v0}, Li0/M;->d()[I

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    aput v2, v6, v3

    .line 74
    .line 75
    add-int/lit8 v3, v3, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    if-eq v4, v1, :cond_5

    .line 79
    .line 80
    invoke-virtual {v0, v4}, Li0/M;->g(I)V

    .line 81
    .line 82
    .line 83
    :cond_5
    return-void
.end method

.method private static final I(Li0/l;Lkotlin/jvm/functions/Function1;Z)Li0/l;
    .locals 8

    .line 1
    instance-of v0, p0, Li0/d;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Li0/Z;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, p0, p1, v1, p2}, Li0/Z;-><init>(Li0/l;Lkotlin/jvm/functions/Function1;ZZ)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_1
    :goto_0
    new-instance v2, Li0/Y;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    check-cast p0, Li0/d;

    .line 20
    .line 21
    :goto_1
    move-object v3, p0

    .line 22
    goto :goto_2

    .line 23
    :cond_2
    const/4 p0, 0x0

    .line 24
    goto :goto_1

    .line 25
    :goto_2
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    move-object v4, p1

    .line 28
    move v7, p2

    .line 29
    invoke-direct/range {v2 .. v7}, Li0/Y;-><init>(Li0/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V

    .line 30
    .line 31
    .line 32
    return-object v2
.end method

.method static synthetic J(Li0/l;Lkotlin/jvm/functions/Function1;ZILjava/lang/Object;)Li0/l;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    and-int/lit8 p3, p3, 0x4

    .line 7
    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    :cond_1
    invoke-static {p0, p1, p2}, Li0/v;->I(Li0/l;Lkotlin/jvm/functions/Function1;Z)Li0/l;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final K(Li0/W;)Li0/W;
    .locals 4

    .line 1
    sget-object v0, Li0/l;->e:Li0/l$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/l$a;->c()Li0/l;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Li0/l;->i()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    invoke-virtual {v1}, Li0/l;->f()Li0/p;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p0, v2, v3, v1}, Li0/v;->d0(Li0/W;JLi0/p;)Li0/W;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    invoke-static {}, Li0/v;->O()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    monitor-enter v1

    .line 26
    :try_start_0
    invoke-virtual {v0}, Li0/l$a;->c()Li0/l;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Li0/l;->i()J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    invoke-virtual {v0}, Li0/l;->f()Li0/p;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {p0, v2, v3, v0}, Li0/v;->d0(Li0/W;JLi0/p;)Li0/W;

    .line 39
    .line 40
    .line 41
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    monitor-exit v1

    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_0
    invoke-static {}, Li0/v;->c0()Ljava/lang/Void;

    .line 47
    .line 48
    .line 49
    new-instance p0, LTd/k;

    .line 50
    .line 51
    invoke-direct {p0}, LTd/k;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    monitor-exit v1

    .line 57
    throw p0

    .line 58
    :cond_1
    return-object v1
.end method

.method public static final L(Li0/W;Li0/l;)Li0/W;
    .locals 3

    .line 1
    invoke-virtual {p1}, Li0/l;->i()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p1}, Li0/l;->f()Li0/p;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {p0, v0, v1, v2}, Li0/v;->d0(Li0/W;JLi0/p;)Li0/W;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-static {}, Li0/v;->O()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    monitor-enter v0

    .line 20
    :try_start_0
    invoke-virtual {p1}, Li0/l;->i()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    invoke-virtual {p1}, Li0/l;->f()Li0/p;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p0, v1, v2, p1}, Li0/v;->d0(Li0/W;JLi0/p;)Li0/W;

    .line 29
    .line 30
    .line 31
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    monitor-exit v0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    invoke-static {}, Li0/v;->c0()Ljava/lang/Void;

    .line 37
    .line 38
    .line 39
    new-instance p0, LTd/k;

    .line 40
    .line 41
    invoke-direct {p0}, LTd/k;-><init>()V

    .line 42
    .line 43
    .line 44
    throw p0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    monitor-exit v0

    .line 47
    throw p0

    .line 48
    :cond_1
    return-object v0
.end method

.method public static final M()Li0/l;
    .locals 1

    .line 1
    sget-object v0, Li0/v;->c:Lg0/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/r;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Li0/l;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Li0/v;->k:Li0/b;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method private static final N(Li0/p;)LTd/L;
    .locals 0

    .line 1
    sget-object p0, LTd/L;->a:LTd/L;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final O()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Li0/v;->d:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final P(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const/4 p1, 0x0

    .line 5
    :goto_0
    if-eqz p0, :cond_1

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    if-eq p0, p1, :cond_1

    .line 10
    .line 11
    new-instance p2, Li0/r;

    .line 12
    .line 13
    invoke-direct {p2, p0, p1}, Li0/r;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    return-object p2

    .line 17
    :cond_1
    if-nez p0, :cond_2

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_2
    return-object p0
.end method

.method static synthetic Q(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZILjava/lang/Object;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x4

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    :cond_0
    invoke-static {p0, p1, p2}, Li0/v;->P(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final R(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LTd/L;
    .locals 0

    .line 1
    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    sget-object p0, LTd/L;->a:LTd/L;

    .line 8
    .line 9
    return-object p0
.end method

.method private static final S(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    if-eq p0, p1, :cond_0

    .line 6
    .line 7
    new-instance v0, Li0/t;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Li0/t;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    if-nez p0, :cond_1

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_1
    return-object p0
.end method

.method private static final T(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LTd/L;
    .locals 0

    .line 1
    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    sget-object p0, LTd/L;->a:LTd/L;

    .line 8
    .line 9
    return-object p0
.end method

.method public static final U(Li0/W;Li0/U;)Li0/W;
    .locals 3

    .line 1
    invoke-static {p1}, Li0/v;->l0(Li0/U;)Li0/W;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-wide v1, 0x7fffffffffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Li0/W;->h(J)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    invoke-virtual {p0, v1, v2}, Li0/W;->d(J)Li0/W;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p1}, Li0/U;->l()Li0/W;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0, v0}, Li0/W;->g(Li0/W;)V

    .line 25
    .line 26
    .line 27
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked"

    .line 28
    .line 29
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1, p0}, Li0/U;->r(Li0/W;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object p0
.end method

.method public static final V(Li0/W;Li0/U;Li0/l;)Li0/W;
    .locals 1

    .line 1
    invoke-static {}, Li0/v;->O()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    invoke-static {p0, p1, p2}, Li0/v;->W(Li0/W;Li0/U;Li0/l;)Li0/W;

    .line 7
    .line 8
    .line 9
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    monitor-exit v0

    .line 11
    return-object p0

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    monitor-exit v0

    .line 14
    throw p0
.end method

.method private static final W(Li0/W;Li0/U;Li0/l;)Li0/W;
    .locals 2

    .line 1
    invoke-static {p0, p1}, Li0/v;->U(Li0/W;Li0/U;)Li0/W;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1, p0}, Li0/W;->c(Li0/W;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Li0/l;->i()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-virtual {p1, v0, v1}, Li0/W;->h(J)V

    .line 13
    .line 14
    .line 15
    return-object p1
.end method

.method public static final X(Li0/l;Li0/U;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Li0/l;->j()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Li0/l;->w(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Li0/l;->k()Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method private static final Y(JLi0/d;Li0/p;)Ljava/util/Map;
    .locals 21

    .line 1
    move-wide/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p2 .. p2}, Li0/d;->E()Lt/Q;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    return-object v3

    .line 11
    :cond_0
    invoke-virtual/range {p2 .. p2}, Li0/l;->f()Li0/p;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual/range {p2 .. p2}, Li0/l;->i()J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    invoke-virtual {v4, v5, v6}, Li0/p;->u(J)Li0/p;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual/range {p2 .. p2}, Li0/d;->F()Li0/p;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {v4, v5}, Li0/p;->t(Li0/p;)Li0/p;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iget-object v5, v2, Lt/e0;->b:[Ljava/lang/Object;

    .line 32
    .line 33
    iget-object v2, v2, Lt/e0;->a:[J

    .line 34
    .line 35
    array-length v6, v2

    .line 36
    add-int/lit8 v6, v6, -0x2

    .line 37
    .line 38
    if-ltz v6, :cond_c

    .line 39
    .line 40
    move-object v9, v3

    .line 41
    const/4 v8, 0x0

    .line 42
    :goto_0
    aget-wide v10, v2, v8

    .line 43
    .line 44
    not-long v12, v10

    .line 45
    const/4 v14, 0x7

    .line 46
    shl-long/2addr v12, v14

    .line 47
    and-long/2addr v12, v10

    .line 48
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    and-long/2addr v12, v14

    .line 54
    cmp-long v12, v12, v14

    .line 55
    .line 56
    if-eqz v12, :cond_a

    .line 57
    .line 58
    sub-int v12, v8, v6

    .line 59
    .line 60
    not-int v12, v12

    .line 61
    ushr-int/lit8 v12, v12, 0x1f

    .line 62
    .line 63
    const/16 v13, 0x8

    .line 64
    .line 65
    rsub-int/lit8 v12, v12, 0x8

    .line 66
    .line 67
    const/4 v14, 0x0

    .line 68
    :goto_1
    if-ge v14, v12, :cond_8

    .line 69
    .line 70
    const-wide/16 v15, 0xff

    .line 71
    .line 72
    and-long/2addr v15, v10

    .line 73
    const-wide/16 v17, 0x80

    .line 74
    .line 75
    cmp-long v15, v15, v17

    .line 76
    .line 77
    if-gez v15, :cond_7

    .line 78
    .line 79
    shl-int/lit8 v15, v8, 0x3

    .line 80
    .line 81
    add-int/2addr v15, v14

    .line 82
    aget-object v15, v5, v15

    .line 83
    .line 84
    check-cast v15, Li0/U;

    .line 85
    .line 86
    move-object/from16 v16, v3

    .line 87
    .line 88
    invoke-interface {v15}, Li0/U;->l()Li0/W;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    move-object/from16 v7, p3

    .line 93
    .line 94
    move/from16 v18, v13

    .line 95
    .line 96
    invoke-static {v3, v0, v1, v7}, Li0/v;->d0(Li0/W;JLi0/p;)Li0/W;

    .line 97
    .line 98
    .line 99
    move-result-object v13

    .line 100
    if-nez v13, :cond_1

    .line 101
    .line 102
    move-object/from16 v19, v2

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_1
    move-object/from16 v19, v2

    .line 106
    .line 107
    invoke-static {v3, v0, v1, v4}, Li0/v;->d0(Li0/W;JLi0/p;)Li0/W;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-nez v2, :cond_2

    .line 112
    .line 113
    :goto_2
    goto :goto_3

    .line 114
    :cond_2
    invoke-static {v13, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v20

    .line 118
    if-nez v20, :cond_6

    .line 119
    .line 120
    invoke-virtual/range {p2 .. p2}, Li0/l;->i()J

    .line 121
    .line 122
    .line 123
    move-result-wide v0

    .line 124
    move-object/from16 v20, v4

    .line 125
    .line 126
    invoke-virtual/range {p2 .. p2}, Li0/l;->f()Li0/p;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-static {v3, v0, v1, v4}, Li0/v;->d0(Li0/W;JLi0/p;)Li0/W;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-eqz v0, :cond_5

    .line 135
    .line 136
    invoke-interface {v15, v2, v13, v0}, Li0/U;->i(Li0/W;Li0/W;Li0/W;)Li0/W;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-eqz v0, :cond_4

    .line 141
    .line 142
    if-nez v9, :cond_3

    .line 143
    .line 144
    new-instance v9, Ljava/util/HashMap;

    .line 145
    .line 146
    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 147
    .line 148
    .line 149
    :cond_3
    move-object v1, v9

    .line 150
    invoke-interface {v9, v13, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-object v9, v1

    .line 154
    goto :goto_4

    .line 155
    :cond_4
    return-object v16

    .line 156
    :cond_5
    invoke-static {}, Li0/v;->c0()Ljava/lang/Void;

    .line 157
    .line 158
    .line 159
    new-instance v0, LTd/k;

    .line 160
    .line 161
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 162
    .line 163
    .line 164
    throw v0

    .line 165
    :cond_6
    :goto_3
    move-object/from16 v20, v4

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_7
    move-object/from16 v7, p3

    .line 169
    .line 170
    move-object/from16 v19, v2

    .line 171
    .line 172
    move-object/from16 v16, v3

    .line 173
    .line 174
    move-object/from16 v20, v4

    .line 175
    .line 176
    move/from16 v18, v13

    .line 177
    .line 178
    :goto_4
    shr-long v10, v10, v18

    .line 179
    .line 180
    add-int/lit8 v14, v14, 0x1

    .line 181
    .line 182
    move-wide/from16 v0, p0

    .line 183
    .line 184
    move-object/from16 v3, v16

    .line 185
    .line 186
    move/from16 v13, v18

    .line 187
    .line 188
    move-object/from16 v2, v19

    .line 189
    .line 190
    move-object/from16 v4, v20

    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_8
    move-object/from16 v7, p3

    .line 194
    .line 195
    move-object/from16 v19, v2

    .line 196
    .line 197
    move-object/from16 v16, v3

    .line 198
    .line 199
    move-object/from16 v20, v4

    .line 200
    .line 201
    move v0, v13

    .line 202
    if-ne v12, v0, :cond_9

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_9
    return-object v9

    .line 206
    :cond_a
    move-object/from16 v7, p3

    .line 207
    .line 208
    move-object/from16 v19, v2

    .line 209
    .line 210
    move-object/from16 v16, v3

    .line 211
    .line 212
    move-object/from16 v20, v4

    .line 213
    .line 214
    :goto_5
    if-eq v8, v6, :cond_b

    .line 215
    .line 216
    add-int/lit8 v8, v8, 0x1

    .line 217
    .line 218
    move-wide/from16 v0, p0

    .line 219
    .line 220
    move-object/from16 v3, v16

    .line 221
    .line 222
    move-object/from16 v2, v19

    .line 223
    .line 224
    move-object/from16 v4, v20

    .line 225
    .line 226
    goto/16 :goto_0

    .line 227
    .line 228
    :cond_b
    return-object v9

    .line 229
    :cond_c
    move-object/from16 v16, v3

    .line 230
    .line 231
    return-object v16
.end method

.method public static final Z(Li0/W;Li0/U;Li0/l;Li0/W;)Li0/W;
    .locals 4

    .line 1
    invoke-virtual {p2}, Li0/l;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Li0/l;->p(Li0/U;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p2}, Li0/l;->i()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-virtual {p3}, Li0/W;->f()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    cmp-long v2, v2, v0

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    return-object p3

    .line 23
    :cond_1
    invoke-static {}, Li0/v;->O()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    monitor-enter v2

    .line 28
    :try_start_0
    invoke-static {p0, p1}, Li0/v;->U(Li0/W;Li0/U;)Li0/W;

    .line 29
    .line 30
    .line 31
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    monitor-exit v2

    .line 33
    invoke-virtual {p0, v0, v1}, Li0/W;->h(J)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p3}, Li0/W;->f()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    const/4 p3, 0x1

    .line 41
    invoke-static {p3}, Li0/q;->c(I)J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    cmp-long p3, v0, v2

    .line 46
    .line 47
    if-eqz p3, :cond_2

    .line 48
    .line 49
    invoke-virtual {p2, p1}, Li0/l;->p(Li0/U;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    return-object p0

    .line 53
    :catchall_0
    move-exception p0

    .line 54
    monitor-exit v2

    .line 55
    throw p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Li0/v;->T(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final a0(Li0/U;)Z
    .locals 13

    .line 1
    invoke-interface {p0}, Li0/U;->l()Li0/W;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Li0/v;->g:Li0/n;

    .line 6
    .line 7
    sget-wide v2, Li0/v;->f:J

    .line 8
    .line 9
    invoke-virtual {v1, v2, v3}, Li0/n;->e(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    move-object v5, v3

    .line 16
    move v6, v4

    .line 17
    :goto_0
    if-eqz v0, :cond_8

    .line 18
    .line 19
    invoke-virtual {v0}, Li0/W;->f()J

    .line 20
    .line 21
    .line 22
    move-result-wide v7

    .line 23
    sget-wide v9, Li0/v;->b:J

    .line 24
    .line 25
    cmp-long v9, v7, v9

    .line 26
    .line 27
    if-eqz v9, :cond_7

    .line 28
    .line 29
    invoke-static {v7, v8, v1, v2}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    if-gez v7, :cond_6

    .line 34
    .line 35
    if-nez v3, :cond_0

    .line 36
    .line 37
    add-int/lit8 v6, v6, 0x1

    .line 38
    .line 39
    move-object v3, v0

    .line 40
    goto :goto_4

    .line 41
    :cond_0
    invoke-virtual {v0}, Li0/W;->f()J

    .line 42
    .line 43
    .line 44
    move-result-wide v7

    .line 45
    invoke-virtual {v3}, Li0/W;->f()J

    .line 46
    .line 47
    .line 48
    move-result-wide v9

    .line 49
    invoke-static {v7, v8, v9, v10}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-gez v7, :cond_1

    .line 54
    .line 55
    move-object v7, v3

    .line 56
    move-object v3, v0

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move-object v7, v0

    .line 59
    :goto_1
    if-nez v5, :cond_5

    .line 60
    .line 61
    invoke-interface {p0}, Li0/U;->l()Li0/W;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    move-object v8, v5

    .line 66
    :goto_2
    if-eqz v5, :cond_4

    .line 67
    .line 68
    invoke-virtual {v5}, Li0/W;->f()J

    .line 69
    .line 70
    .line 71
    move-result-wide v9

    .line 72
    invoke-static {v9, v10, v1, v2}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    if-ltz v9, :cond_2

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_2
    invoke-virtual {v8}, Li0/W;->f()J

    .line 80
    .line 81
    .line 82
    move-result-wide v9

    .line 83
    invoke-virtual {v5}, Li0/W;->f()J

    .line 84
    .line 85
    .line 86
    move-result-wide v11

    .line 87
    invoke-static {v9, v10, v11, v12}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    if-gez v9, :cond_3

    .line 92
    .line 93
    move-object v8, v5

    .line 94
    :cond_3
    invoke-virtual {v5}, Li0/W;->e()Li0/W;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    goto :goto_2

    .line 99
    :cond_4
    move-object v5, v8

    .line 100
    :cond_5
    :goto_3
    sget-wide v8, Li0/v;->b:J

    .line 101
    .line 102
    invoke-virtual {v3, v8, v9}, Li0/W;->h(J)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, v5}, Li0/W;->c(Li0/W;)V

    .line 106
    .line 107
    .line 108
    move-object v3, v7

    .line 109
    goto :goto_4

    .line 110
    :cond_6
    add-int/lit8 v6, v6, 0x1

    .line 111
    .line 112
    :cond_7
    :goto_4
    invoke-virtual {v0}, Li0/W;->e()Li0/W;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    goto :goto_0

    .line 117
    :cond_8
    const/4 p0, 0x1

    .line 118
    if-le v6, p0, :cond_9

    .line 119
    .line 120
    return p0

    .line 121
    :cond_9
    return v4
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Li0/p;)Li0/l;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Li0/v;->j0(Lkotlin/jvm/functions/Function1;Li0/p;)Li0/l;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final b0(Li0/U;)V
    .locals 1

    .line 1
    invoke-static {p0}, Li0/v;->a0(Li0/U;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Li0/v;->h:Li0/M;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Li0/M;->a(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Li0/v;->R(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c0()Ljava/lang/Void;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public static synthetic d(Li0/p;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0}, Li0/v;->N(Li0/p;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final d0(Li0/W;JLi0/p;)Li0/W;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v1, v0

    .line 3
    :goto_0
    if-eqz p0, :cond_2

    .line 4
    .line 5
    invoke-static {p0, p1, p2, p3}, Li0/v;->n0(Li0/W;JLi0/p;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {v1}, Li0/W;->f()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    invoke-virtual {p0}, Li0/W;->f()J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    invoke-static {v2, v3, v4, v5}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-gez v2, :cond_1

    .line 27
    .line 28
    :goto_1
    move-object v1, p0

    .line 29
    :cond_1
    invoke-virtual {p0}, Li0/W;->e()Li0/W;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    if-eqz v1, :cond_3

    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_3
    return-object v0
.end method

.method public static final synthetic e(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Li0/v;->F(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final e0(Li0/W;Li0/U;)Li0/W;
    .locals 4

    .line 1
    sget-object v0, Li0/l;->e:Li0/l$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/l$a;->c()Li0/l;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Li0/l;->g()Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {v1}, Li0/l;->i()J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    invoke-virtual {v1}, Li0/l;->f()Li0/p;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {p0, v2, v3, v1}, Li0/v;->d0(Li0/W;JLi0/p;)Li0/W;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-nez p0, :cond_2

    .line 29
    .line 30
    invoke-static {}, Li0/v;->O()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    monitor-enter p0

    .line 35
    :try_start_0
    invoke-virtual {v0}, Li0/l$a;->c()Li0/l;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {p1}, Li0/U;->l()Li0/W;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string v1, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable"

    .line 44
    .line 45
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Li0/l;->i()J

    .line 49
    .line 50
    .line 51
    move-result-wide v1

    .line 52
    invoke-virtual {v0}, Li0/l;->f()Li0/p;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {p1, v1, v2, v0}, Li0/v;->d0(Li0/W;JLi0/p;)Li0/W;

    .line 57
    .line 58
    .line 59
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    monitor-exit p0

    .line 63
    return-object p1

    .line 64
    :cond_1
    :try_start_1
    invoke-static {}, Li0/v;->c0()Ljava/lang/Void;

    .line 65
    .line 66
    .line 67
    new-instance p1, LTd/k;

    .line 68
    .line 69
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 70
    .line 71
    .line 72
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    monitor-exit p0

    .line 75
    throw p1

    .line 76
    :cond_2
    return-object p0
.end method

.method public static final synthetic f()V
    .locals 0

    .line 1
    invoke-static {}, Li0/v;->G()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final f0(I)V
    .locals 1

    .line 1
    sget-object v0, Li0/v;->g:Li0/n;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Li0/n;->f(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic g()V
    .locals 0

    .line 1
    invoke-static {}, Li0/v;->H()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final g0()Ljava/lang/Void;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "Cannot modify a state object in a read-only snapshot"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public static final synthetic h(Li0/l;Lkotlin/jvm/functions/Function1;Z)Li0/l;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Li0/v;->I(Li0/l;Lkotlin/jvm/functions/Function1;Z)Li0/l;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final h0(Li0/b;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Li0/l;->i()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-object v2, Li0/v;->e:Li0/p;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1}, Li0/p;->n(J)Li0/p;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-wide v2, Li0/v;->f:J

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    int-to-long v4, v4

    .line 19
    add-long/2addr v4, v2

    .line 20
    sput-wide v4, Li0/v;->f:J

    .line 21
    .line 22
    sget-object v4, Li0/v;->e:Li0/p;

    .line 23
    .line 24
    invoke-virtual {v4, v0, v1}, Li0/p;->n(J)Li0/p;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Li0/v;->e:Li0/p;

    .line 29
    .line 30
    invoke-virtual {p0, v2, v3}, Li0/l;->v(J)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Li0/v;->e:Li0/p;

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Li0/l;->u(Li0/p;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-virtual {p0, v0}, Li0/d;->w(I)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-virtual {p0, v0}, Li0/d;->Q(Lt/Q;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Li0/l;->q()V

    .line 47
    .line 48
    .line 49
    sget-object p0, Li0/v;->e:Li0/p;

    .line 50
    .line 51
    invoke-virtual {p0, v2, v3}, Li0/p;->u(J)Li0/p;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    sput-object p0, Li0/v;->e:Li0/p;

    .line 56
    .line 57
    return-object p1
.end method

.method public static final synthetic i()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Li0/v;->i:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final i0(Lkotlin/jvm/functions/Function1;)Li0/l;
    .locals 1

    .line 1
    new-instance v0, Li0/u;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Li0/u;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Li0/v;->F(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Li0/l;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final synthetic j()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    sget-object v0, Li0/v;->a:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final j0(Lkotlin/jvm/functions/Function1;Li0/p;)Li0/l;
    .locals 3

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Li0/l;

    .line 6
    .line 7
    invoke-static {}, Li0/v;->O()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    monitor-enter p1

    .line 12
    :try_start_0
    sget-object v0, Li0/v;->e:Li0/p;

    .line 13
    .line 14
    invoke-virtual {p0}, Li0/l;->i()J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    invoke-virtual {v0, v1, v2}, Li0/p;->u(J)Li0/p;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Li0/v;->e:Li0/p;

    .line 23
    .line 24
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    monitor-exit p1

    .line 27
    return-object p0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    monitor-exit p1

    .line 30
    throw p0
.end method

.method public static final synthetic k()Li0/b;
    .locals 1

    .line 1
    sget-object v0, Li0/v;->k:Li0/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final k0(JLi0/p;)I
    .locals 1

    .line 1
    invoke-virtual {p2, p0, p1}, Li0/p;->r(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    invoke-static {}, Li0/v;->O()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    monitor-enter p2

    .line 10
    :try_start_0
    sget-object v0, Li0/v;->g:Li0/n;

    .line 11
    .line 12
    invoke-virtual {v0, p0, p1}, Li0/n;->a(J)I

    .line 13
    .line 14
    .line 15
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    monitor-exit p2

    .line 17
    return p0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    monitor-exit p2

    .line 20
    throw p0
.end method

.method public static final synthetic l()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Li0/v;->j:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final l0(Li0/U;)Li0/W;
    .locals 9

    .line 1
    invoke-interface {p0}, Li0/U;->l()Li0/W;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Li0/v;->g:Li0/n;

    .line 6
    .line 7
    sget-wide v1, Li0/v;->f:J

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Li0/n;->e(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const/4 v2, 0x1

    .line 14
    int-to-long v2, v2

    .line 15
    sub-long/2addr v0, v2

    .line 16
    sget-object v2, Li0/p;->e:Li0/p$a;

    .line 17
    .line 18
    invoke-virtual {v2}, Li0/p$a;->a()Li0/p;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x0

    .line 23
    move-object v4, v3

    .line 24
    :goto_0
    if-eqz p0, :cond_4

    .line 25
    .line 26
    invoke-virtual {p0}, Li0/W;->f()J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    sget-wide v7, Li0/v;->b:J

    .line 31
    .line 32
    cmp-long v5, v5, v7

    .line 33
    .line 34
    if-nez v5, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-static {p0, v0, v1, v2}, Li0/v;->n0(Li0/W;JLi0/p;)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_3

    .line 42
    .line 43
    if-nez v4, :cond_1

    .line 44
    .line 45
    move-object v4, p0

    .line 46
    goto :goto_2

    .line 47
    :cond_1
    invoke-virtual {p0}, Li0/W;->f()J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    invoke-virtual {v4}, Li0/W;->f()J

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    invoke-static {v0, v1, v2, v3}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-gez v0, :cond_2

    .line 60
    .line 61
    :goto_1
    return-object p0

    .line 62
    :cond_2
    return-object v4

    .line 63
    :cond_3
    :goto_2
    invoke-virtual {p0}, Li0/W;->e()Li0/W;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    goto :goto_0

    .line 68
    :cond_4
    return-object v3
.end method

.method public static final synthetic m()J
    .locals 2

    .line 1
    sget-wide v0, Li0/v;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method private static final m0(JJLi0/p;)Z
    .locals 2

    .line 1
    sget-wide v0, Li0/v;->b:J

    .line 2
    .line 3
    cmp-long v0, p2, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p2, p3, p0, p1}, Lkotlin/jvm/internal/s;->j(JJ)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-gtz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p4, p2, p3}, Li0/p;->p(J)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public static final synthetic n()J
    .locals 2

    .line 1
    sget-wide v0, Li0/v;->f:J

    .line 2
    .line 3
    return-wide v0
.end method

.method private static final n0(Li0/W;JLi0/p;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Li0/W;->f()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {p1, p2, v0, v1, p3}, Li0/v;->m0(JJLi0/p;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public static final synthetic o()Li0/p;
    .locals 1

    .line 1
    sget-object v0, Li0/v;->e:Li0/p;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final o0(Li0/l;)V
    .locals 4

    .line 1
    sget-object v0, Li0/v;->e:Li0/p;

    .line 2
    .line 3
    invoke-virtual {p0}, Li0/l;->i()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0, v1, v2}, Li0/p;->p(J)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "Snapshot is not open: snapshotId="

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Li0/l;->i()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", disposed="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Li0/l;->e()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", applied="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    instance-of v1, p0, Li0/d;

    .line 48
    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    check-cast p0, Li0/d;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const/4 p0, 0x0

    .line 55
    :goto_0
    if-eqz p0, :cond_1

    .line 56
    .line 57
    invoke-virtual {p0}, Li0/d;->D()Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    const-string p0, "read-only"

    .line 67
    .line 68
    :goto_1
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string p0, ", lowestPin="

    .line 72
    .line 73
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-static {}, Li0/v;->O()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    monitor-enter p0

    .line 81
    :try_start_0
    sget-object v1, Li0/v;->g:Li0/n;

    .line 82
    .line 83
    const-wide/16 v2, -0x1

    .line 84
    .line 85
    invoke-virtual {v1, v2, v3}, Li0/n;->e(J)J

    .line 86
    .line 87
    .line 88
    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    monitor-exit p0

    .line 90
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v0

    .line 107
    :catchall_0
    move-exception v0

    .line 108
    monitor-exit p0

    .line 109
    throw v0

    .line 110
    :cond_2
    return-void
.end method

.method public static final synthetic p()Lg0/r;
    .locals 1

    .line 1
    sget-object v0, Li0/v;->c:Lg0/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final p0(Li0/W;Li0/U;Li0/l;)Li0/W;
    .locals 6

    .line 1
    invoke-virtual {p2}, Li0/l;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Li0/l;->p(Li0/U;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p2}, Li0/l;->i()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-virtual {p2}, Li0/l;->f()Li0/p;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {p0, v0, v1, v2}, Li0/v;->d0(Li0/W;JLi0/p;)Li0/W;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_5

    .line 23
    .line 24
    invoke-virtual {p0}, Li0/W;->f()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    invoke-virtual {p2}, Li0/l;->i()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    cmp-long v2, v2, v4

    .line 33
    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    invoke-static {}, Li0/v;->O()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    monitor-enter v2

    .line 42
    :try_start_0
    invoke-interface {p1}, Li0/U;->l()Li0/W;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {p2}, Li0/l;->f()Li0/p;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-static {v3, v0, v1, v4}, Li0/v;->d0(Li0/W;JLi0/p;)Li0/W;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    if-eqz v3, :cond_4

    .line 55
    .line 56
    invoke-virtual {v3}, Li0/W;->f()J

    .line 57
    .line 58
    .line 59
    move-result-wide v4

    .line 60
    cmp-long v0, v4, v0

    .line 61
    .line 62
    if-nez v0, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-static {v3, p1, p2}, Li0/v;->W(Li0/W;Li0/U;Li0/l;)Li0/W;

    .line 66
    .line 67
    .line 68
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    :goto_0
    monitor-exit v2

    .line 70
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord"

    .line 71
    .line 72
    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Li0/W;->f()J

    .line 76
    .line 77
    .line 78
    move-result-wide v0

    .line 79
    const/4 p0, 0x1

    .line 80
    invoke-static {p0}, Li0/q;->c(I)J

    .line 81
    .line 82
    .line 83
    move-result-wide v4

    .line 84
    cmp-long p0, v0, v4

    .line 85
    .line 86
    if-eqz p0, :cond_3

    .line 87
    .line 88
    invoke-virtual {p2, p1}, Li0/l;->p(Li0/U;)V

    .line 89
    .line 90
    .line 91
    :cond_3
    return-object v3

    .line 92
    :catchall_0
    move-exception p0

    .line 93
    goto :goto_1

    .line 94
    :cond_4
    :try_start_1
    invoke-static {}, Li0/v;->c0()Ljava/lang/Void;

    .line 95
    .line 96
    .line 97
    new-instance p0, LTd/k;

    .line 98
    .line 99
    invoke-direct {p0}, LTd/k;-><init>()V

    .line 100
    .line 101
    .line 102
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    :goto_1
    monitor-exit v2

    .line 104
    throw p0

    .line 105
    :cond_5
    invoke-static {}, Li0/v;->c0()Ljava/lang/Void;

    .line 106
    .line 107
    .line 108
    new-instance p0, LTd/k;

    .line 109
    .line 110
    invoke-direct {p0}, LTd/k;-><init>()V

    .line 111
    .line 112
    .line 113
    throw p0
.end method

.method public static final synthetic q(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Li0/v;->P(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic r(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Li0/v;->S(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic s(JLi0/d;Li0/p;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Li0/v;->Y(JLi0/d;Li0/p;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic t(Li0/U;)V
    .locals 0

    .line 1
    invoke-static {p0}, Li0/v;->b0(Li0/U;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic u()Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-static {}, Li0/v;->c0()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static final synthetic v(Li0/W;JLi0/p;)Li0/W;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Li0/v;->d0(Li0/W;JLi0/p;)Li0/W;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic w()Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-static {}, Li0/v;->g0()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static final synthetic x(Li0/b;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Li0/v;->h0(Li0/b;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic y(Ljava/util/List;)V
    .locals 0

    .line 1
    sput-object p0, Li0/v;->i:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic z(Ljava/util/List;)V
    .locals 0

    .line 1
    sput-object p0, Li0/v;->j:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method
