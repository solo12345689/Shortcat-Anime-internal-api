.class public Llh/g;
.super Llh/e;


# instance fields
.field final d:[B

.field final e:[[S

.field final f:[[S

.field final g:[[S

.field final h:[[S

.field final i:[[[S

.field final j:[[[S

.field final k:[[[S

.field final l:[[[S

.field final m:[[[S

.field final n:[[[S

.field final o:[[[S

.field private final p:[B

.field private q:[B


# direct methods
.method public constructor <init>(Llh/f;[B)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x1

    .line 1
    invoke-direct {v0, v3, v1}, Llh/e;-><init>(ZLlh/f;)V

    invoke-virtual {v1}, Llh/f;->i()Llh/j;

    move-result-object v4

    sget-object v5, Llh/j;->c:Llh/j;

    const/4 v6, 0x0

    if-ne v4, v5, :cond_0

    invoke-virtual {v1}, Llh/f;->b()I

    move-result v3

    invoke-static {v2, v6, v3}, LOh/a;->m([BII)[B

    move-result-object v3

    iput-object v3, v0, Llh/g;->p:[B

    invoke-virtual {v1}, Llh/f;->b()I

    move-result v4

    invoke-virtual {v1}, Llh/f;->b()I

    move-result v5

    invoke-virtual {v1}, Llh/f;->c()I

    move-result v6

    add-int/2addr v5, v6

    invoke-static {v2, v4, v5}, LOh/a;->m([BII)[B

    move-result-object v2

    iput-object v2, v0, Llh/g;->d:[B

    new-instance v4, Llh/d;

    invoke-direct {v4, v1, v3, v2}, Llh/d;-><init>(Llh/f;[B[B)V

    invoke-virtual {v4}, Llh/d;->d()Llh/g;

    move-result-object v1

    iget-object v2, v1, Llh/g;->q:[B

    iput-object v2, v0, Llh/g;->q:[B

    iget-object v2, v1, Llh/g;->e:[[S

    iput-object v2, v0, Llh/g;->e:[[S

    iget-object v2, v1, Llh/g;->f:[[S

    iput-object v2, v0, Llh/g;->f:[[S

    iget-object v2, v1, Llh/g;->g:[[S

    iput-object v2, v0, Llh/g;->g:[[S

    iget-object v2, v1, Llh/g;->h:[[S

    iput-object v2, v0, Llh/g;->h:[[S

    iget-object v2, v1, Llh/g;->i:[[[S

    iput-object v2, v0, Llh/g;->i:[[[S

    iget-object v2, v1, Llh/g;->j:[[[S

    iput-object v2, v0, Llh/g;->j:[[[S

    iget-object v2, v1, Llh/g;->k:[[[S

    iput-object v2, v0, Llh/g;->k:[[[S

    iget-object v2, v1, Llh/g;->l:[[[S

    iput-object v2, v0, Llh/g;->l:[[[S

    iget-object v2, v1, Llh/g;->m:[[[S

    iput-object v2, v0, Llh/g;->m:[[[S

    iget-object v2, v1, Llh/g;->n:[[[S

    iput-object v2, v0, Llh/g;->n:[[[S

    iget-object v1, v1, Llh/g;->o:[[[S

    iput-object v1, v0, Llh/g;->o:[[[S

    return-void

    :cond_0
    invoke-virtual {v1}, Llh/f;->h()I

    move-result v4

    invoke-virtual {v1}, Llh/f;->f()I

    move-result v5

    invoke-virtual {v1}, Llh/f;->g()I

    move-result v7

    const/4 v8, 0x2

    new-array v9, v8, [I

    aput v7, v9, v3

    aput v5, v9, v6

    sget-object v10, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-static {v10, v9}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [[S

    iput-object v9, v0, Llh/g;->e:[[S

    new-array v11, v8, [I

    aput v5, v11, v3

    aput v4, v11, v6

    invoke-static {v10, v11}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [[S

    iput-object v11, v0, Llh/g;->f:[[S

    new-array v12, v8, [I

    aput v7, v12, v3

    aput v4, v12, v6

    invoke-static {v10, v12}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, [[S

    iput-object v12, v0, Llh/g;->h:[[S

    new-array v13, v8, [I

    aput v7, v13, v3

    aput v5, v13, v6

    invoke-static {v10, v13}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, [[S

    iput-object v13, v0, Llh/g;->g:[[S

    const/4 v14, 0x3

    new-array v15, v14, [I

    aput v4, v15, v8

    aput v4, v15, v3

    aput v5, v15, v6

    invoke-static {v10, v15}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, [[[S

    iput-object v15, v0, Llh/g;->i:[[[S

    move/from16 v16, v8

    new-array v8, v14, [I

    aput v5, v8, v16

    aput v4, v8, v3

    aput v5, v8, v6

    invoke-static {v10, v8}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [[[S

    iput-object v8, v0, Llh/g;->j:[[[S

    move/from16 v17, v3

    new-array v3, v14, [I

    aput v4, v3, v16

    aput v4, v3, v17

    aput v7, v3, v6

    invoke-static {v10, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [[[S

    iput-object v3, v0, Llh/g;->k:[[[S

    move/from16 v18, v6

    new-array v6, v14, [I

    aput v5, v6, v16

    aput v4, v6, v17

    aput v7, v6, v18

    invoke-static {v10, v6}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [[[S

    iput-object v6, v0, Llh/g;->l:[[[S

    new-array v1, v14, [I

    aput v7, v1, v16

    aput v4, v1, v17

    aput v7, v1, v18

    invoke-static {v10, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[[S

    iput-object v1, v0, Llh/g;->m:[[[S

    new-array v4, v14, [I

    aput v5, v4, v16

    aput v5, v4, v17

    aput v7, v4, v18

    invoke-static {v10, v4}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [[[S

    iput-object v4, v0, Llh/g;->n:[[[S

    new-array v14, v14, [I

    aput v7, v14, v16

    aput v5, v14, v17

    aput v7, v14, v18

    invoke-static {v10, v14}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [[[S

    iput-object v5, v0, Llh/g;->o:[[[S

    const/4 v7, 0x0

    iput-object v7, v0, Llh/g;->p:[B

    invoke-virtual/range {p1 .. p1}, Llh/f;->c()I

    move-result v7

    move/from16 v10, v18

    invoke-static {v2, v10, v7}, LOh/a;->m([BII)[B

    move-result-object v7

    iput-object v7, v0, Llh/g;->d:[B

    array-length v7, v7

    invoke-static {v9, v2, v7}, Llh/i;->h([[S[BI)I

    move-result v9

    add-int/2addr v7, v9

    invoke-static {v11, v2, v7}, Llh/i;->h([[S[BI)I

    move-result v9

    add-int/2addr v7, v9

    invoke-static {v12, v2, v7}, Llh/i;->h([[S[BI)I

    move-result v9

    add-int/2addr v7, v9

    invoke-static {v13, v2, v7}, Llh/i;->h([[S[BI)I

    move-result v9

    add-int/2addr v7, v9

    move/from16 v9, v17

    invoke-static {v15, v2, v7, v9}, Llh/i;->i([[[S[BIZ)I

    move-result v10

    add-int/2addr v7, v10

    const/4 v10, 0x0

    invoke-static {v8, v2, v7, v10}, Llh/i;->i([[[S[BIZ)I

    move-result v8

    add-int/2addr v7, v8

    invoke-static {v3, v2, v7, v9}, Llh/i;->i([[[S[BIZ)I

    move-result v3

    add-int/2addr v7, v3

    invoke-static {v6, v2, v7, v10}, Llh/i;->i([[[S[BIZ)I

    move-result v3

    add-int/2addr v7, v3

    invoke-static {v1, v2, v7, v10}, Llh/i;->i([[[S[BIZ)I

    move-result v1

    add-int/2addr v7, v1

    invoke-static {v4, v2, v7, v9}, Llh/i;->i([[[S[BIZ)I

    move-result v1

    add-int/2addr v7, v1

    invoke-static {v5, v2, v7, v10}, Llh/i;->i([[[S[BIZ)I

    move-result v1

    add-int/2addr v7, v1

    array-length v1, v2

    invoke-static {v2, v7, v1}, LOh/a;->m([BII)[B

    move-result-object v1

    iput-object v1, v0, Llh/g;->q:[B

    return-void
.end method

.method constructor <init>(Llh/f;[B[[S[[S[[S[[S[[[S[[[S[[[S[[[S[[[S[[[S[[[S[B)V
    .locals 1

    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0, p1}, Llh/e;-><init>(ZLlh/f;)V

    const/4 p1, 0x0

    iput-object p1, p0, Llh/g;->p:[B

    iput-object p14, p0, Llh/g;->q:[B

    invoke-virtual {p2}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Llh/g;->d:[B

    invoke-static {p3}, Llh/i;->a([[S)[[S

    move-result-object p1

    iput-object p1, p0, Llh/g;->e:[[S

    invoke-static {p4}, Llh/i;->a([[S)[[S

    move-result-object p1

    iput-object p1, p0, Llh/g;->f:[[S

    invoke-static {p5}, Llh/i;->a([[S)[[S

    move-result-object p1

    iput-object p1, p0, Llh/g;->g:[[S

    invoke-static {p6}, Llh/i;->a([[S)[[S

    move-result-object p1

    iput-object p1, p0, Llh/g;->h:[[S

    invoke-static {p7}, Llh/i;->b([[[S)[[[S

    move-result-object p1

    iput-object p1, p0, Llh/g;->i:[[[S

    invoke-static {p8}, Llh/i;->b([[[S)[[[S

    move-result-object p1

    iput-object p1, p0, Llh/g;->j:[[[S

    invoke-static {p9}, Llh/i;->b([[[S)[[[S

    move-result-object p1

    iput-object p1, p0, Llh/g;->k:[[[S

    invoke-static {p10}, Llh/i;->b([[[S)[[[S

    move-result-object p1

    iput-object p1, p0, Llh/g;->l:[[[S

    invoke-static {p11}, Llh/i;->b([[[S)[[[S

    move-result-object p1

    iput-object p1, p0, Llh/g;->m:[[[S

    invoke-static {p12}, Llh/i;->b([[[S)[[[S

    move-result-object p1

    iput-object p1, p0, Llh/g;->n:[[[S

    invoke-static {p13}, Llh/i;->b([[[S)[[[S

    move-result-object p1

    iput-object p1, p0, Llh/g;->o:[[[S

    return-void
.end method


# virtual methods
.method public c()[B
    .locals 4

    .line 1
    invoke-virtual {p0}, Llh/e;->b()Llh/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Llh/f;->i()Llh/j;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Llh/j;->c:Llh/j;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Llh/g;->p:[B

    .line 14
    .line 15
    iget-object v1, p0, Llh/g;->d:[B

    .line 16
    .line 17
    invoke-static {v0, v1}, LOh/a;->h([B[B)[B

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :cond_0
    iget-object v0, p0, Llh/g;->d:[B

    .line 23
    .line 24
    iget-object v1, p0, Llh/g;->e:[[S

    .line 25
    .line 26
    invoke-static {v1}, Llh/i;->e([[S)[B

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v0, v1}, LOh/a;->h([B[B)[B

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v1, p0, Llh/g;->f:[[S

    .line 35
    .line 36
    invoke-static {v1}, Llh/i;->e([[S)[B

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v0, v1}, LOh/a;->h([B[B)[B

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v1, p0, Llh/g;->h:[[S

    .line 45
    .line 46
    invoke-static {v1}, Llh/i;->e([[S)[B

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v0, v1}, LOh/a;->h([B[B)[B

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v1, p0, Llh/g;->g:[[S

    .line 55
    .line 56
    invoke-static {v1}, Llh/i;->e([[S)[B

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v0, v1}, LOh/a;->h([B[B)[B

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v1, p0, Llh/g;->i:[[[S

    .line 65
    .line 66
    const/4 v2, 0x1

    .line 67
    invoke-static {v1, v2}, Llh/i;->f([[[SZ)[B

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {v0, v1}, LOh/a;->h([B[B)[B

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object v1, p0, Llh/g;->j:[[[S

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    invoke-static {v1, v3}, Llh/i;->f([[[SZ)[B

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v0, v1}, LOh/a;->h([B[B)[B

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iget-object v1, p0, Llh/g;->k:[[[S

    .line 87
    .line 88
    invoke-static {v1, v2}, Llh/i;->f([[[SZ)[B

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v0, v1}, LOh/a;->h([B[B)[B

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget-object v1, p0, Llh/g;->l:[[[S

    .line 97
    .line 98
    invoke-static {v1, v3}, Llh/i;->f([[[SZ)[B

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-static {v0, v1}, LOh/a;->h([B[B)[B

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-object v1, p0, Llh/g;->m:[[[S

    .line 107
    .line 108
    invoke-static {v1, v3}, Llh/i;->f([[[SZ)[B

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-static {v0, v1}, LOh/a;->h([B[B)[B

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    iget-object v1, p0, Llh/g;->n:[[[S

    .line 117
    .line 118
    invoke-static {v1, v2}, Llh/i;->f([[[SZ)[B

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-static {v0, v1}, LOh/a;->h([B[B)[B

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget-object v1, p0, Llh/g;->o:[[[S

    .line 127
    .line 128
    invoke-static {v1, v3}, Llh/i;->f([[[SZ)[B

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-static {v0, v1}, LOh/a;->h([B[B)[B

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    return-object v0
.end method

.method public getEncoded()[B
    .locals 2

    .line 1
    invoke-virtual {p0}, Llh/e;->b()Llh/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Llh/f;->i()Llh/j;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Llh/j;->c:Llh/j;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Llh/g;->p:[B

    .line 14
    .line 15
    iget-object v1, p0, Llh/g;->d:[B

    .line 16
    .line 17
    invoke-static {v0, v1}, LOh/a;->h([B[B)[B

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :cond_0
    invoke-virtual {p0}, Llh/g;->c()[B

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, Llh/g;->q:[B

    .line 27
    .line 28
    invoke-static {v0, v1}, LOh/a;->h([B[B)[B

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
.end method
