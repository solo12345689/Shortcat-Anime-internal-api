.class public final LSe/e$b;
.super LZe/i$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSe/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private d:I

.field private e:I

.field private f:Ljava/util/List;

.field private g:Ljava/util/List;

.field private h:Ljava/util/List;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LZe/i$c;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x6

    .line 5
    iput v0, p0, LSe/e$b;->e:I

    .line 6
    .line 7
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 8
    .line 9
    iput-object v0, p0, LSe/e$b;->f:Ljava/util/List;

    .line 10
    .line 11
    iput-object v0, p0, LSe/e$b;->g:Ljava/util/List;

    .line 12
    .line 13
    iput-object v0, p0, LSe/e$b;->h:Ljava/util/List;

    .line 14
    .line 15
    invoke-direct {p0}, LSe/e$b;->B()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private A()V
    .locals 3

    .line 1
    iget v0, p0, LSe/e$b;->d:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v2, p0, LSe/e$b;->g:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LSe/e$b;->g:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, LSe/e$b;->d:I

    .line 17
    .line 18
    or-int/2addr v0, v1

    .line 19
    iput v0, p0, LSe/e$b;->d:I

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method private B()V
    .locals 0

    .line 1
    return-void
.end method

.method static synthetic r()LSe/e$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/e$b;->v()LSe/e$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static v()LSe/e$b;
    .locals 1

    .line 1
    new-instance v0, LSe/e$b;

    .line 2
    .line 3
    invoke-direct {v0}, LSe/e$b;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private x()V
    .locals 3

    .line 1
    iget v0, p0, LSe/e$b;->d:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v2, p0, LSe/e$b;->h:Ljava/util/List;

    .line 11
    .line 12
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, LSe/e$b;->h:Ljava/util/List;

    .line 16
    .line 17
    iget v0, p0, LSe/e$b;->d:I

    .line 18
    .line 19
    or-int/2addr v0, v1

    .line 20
    iput v0, p0, LSe/e$b;->d:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method private y()V
    .locals 3

    .line 1
    iget v0, p0, LSe/e$b;->d:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v2, p0, LSe/e$b;->f:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LSe/e$b;->f:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, LSe/e$b;->d:I

    .line 17
    .line 18
    or-int/2addr v0, v1

    .line 19
    iput v0, p0, LSe/e$b;->d:I

    .line 20
    .line 21
    :cond_0
    return-void
.end method


# virtual methods
.method public C(LSe/e;)LSe/e$b;
    .locals 2

    .line 1
    invoke-static {}, LSe/e;->M()LSe/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p1}, LSe/e;->T()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, LSe/e;->O()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, v0}, LSe/e$b;->E(I)LSe/e$b;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-static {p1}, LSe/e;->C(LSe/e;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    iget-object v0, p0, LSe/e$b;->f:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-static {p1}, LSe/e;->C(LSe/e;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, LSe/e$b;->f:Ljava/util/List;

    .line 44
    .line 45
    iget v0, p0, LSe/e$b;->d:I

    .line 46
    .line 47
    and-int/lit8 v0, v0, -0x3

    .line 48
    .line 49
    iput v0, p0, LSe/e$b;->d:I

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-direct {p0}, LSe/e$b;->y()V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, LSe/e$b;->f:Ljava/util/List;

    .line 56
    .line 57
    invoke-static {p1}, LSe/e;->C(LSe/e;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 62
    .line 63
    .line 64
    :cond_3
    :goto_0
    invoke-static {p1}, LSe/e;->E(LSe/e;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_5

    .line 73
    .line 74
    iget-object v0, p0, LSe/e$b;->g:Ljava/util/List;

    .line 75
    .line 76
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    invoke-static {p1}, LSe/e;->E(LSe/e;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iput-object v0, p0, LSe/e$b;->g:Ljava/util/List;

    .line 87
    .line 88
    iget v0, p0, LSe/e$b;->d:I

    .line 89
    .line 90
    and-int/lit8 v0, v0, -0x5

    .line 91
    .line 92
    iput v0, p0, LSe/e$b;->d:I

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    invoke-direct {p0}, LSe/e$b;->A()V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, LSe/e$b;->g:Ljava/util/List;

    .line 99
    .line 100
    invoke-static {p1}, LSe/e;->E(LSe/e;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 105
    .line 106
    .line 107
    :cond_5
    :goto_1
    invoke-static {p1}, LSe/e;->G(LSe/e;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-nez v0, :cond_7

    .line 116
    .line 117
    iget-object v0, p0, LSe/e$b;->h:Ljava/util/List;

    .line 118
    .line 119
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_6

    .line 124
    .line 125
    invoke-static {p1}, LSe/e;->G(LSe/e;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iput-object v0, p0, LSe/e$b;->h:Ljava/util/List;

    .line 130
    .line 131
    iget v0, p0, LSe/e$b;->d:I

    .line 132
    .line 133
    and-int/lit8 v0, v0, -0x9

    .line 134
    .line 135
    iput v0, p0, LSe/e$b;->d:I

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_6
    invoke-direct {p0}, LSe/e$b;->x()V

    .line 139
    .line 140
    .line 141
    iget-object v0, p0, LSe/e$b;->h:Ljava/util/List;

    .line 142
    .line 143
    invoke-static {p1}, LSe/e;->G(LSe/e;)Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 148
    .line 149
    .line 150
    :cond_7
    :goto_2
    invoke-virtual {p0, p1}, LZe/i$c;->q(LZe/i$d;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, LZe/i$b;->i()LZe/d;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-static {p1}, LSe/e;->J(LSe/e;)LZe/d;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {v0, p1}, LZe/d;->c(LZe/d;)LZe/d;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {p0, p1}, LZe/i$b;->k(LZe/d;)LZe/i$b;

    .line 166
    .line 167
    .line 168
    return-object p0
.end method

.method public D(LZe/e;LZe/g;)LSe/e$b;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, LSe/e;->l:LZe/r;

    .line 3
    .line 4
    invoke-interface {v1, p1, p2}, LZe/r;->b(LZe/e;LZe/g;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, LSe/e;
    :try_end_0
    .catch LZe/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, LSe/e$b;->C(LSe/e;)LSe/e$b;

    .line 13
    .line 14
    .line 15
    :cond_0
    return-object p0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception p1

    .line 19
    :try_start_1
    invoke-virtual {p1}, LZe/k;->a()LZe/p;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    check-cast p2, LSe/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 26
    :catchall_1
    move-exception p1

    .line 27
    move-object v0, p2

    .line 28
    :goto_0
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0, v0}, LSe/e$b;->C(LSe/e;)LSe/e$b;

    .line 31
    .line 32
    .line 33
    :cond_1
    throw p1
.end method

.method public E(I)LSe/e$b;
    .locals 1

    .line 1
    iget v0, p0, LSe/e$b;->d:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, LSe/e$b;->d:I

    .line 6
    .line 7
    iput p1, p0, LSe/e$b;->e:I

    .line 8
    .line 9
    return-object p0
.end method

.method public bridge synthetic build()LZe/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LSe/e$b;->s()LSe/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LSe/e$b;->u()LSe/e$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic j(LZe/i;)LZe/i$b;
    .locals 0

    .line 1
    check-cast p1, LSe/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LSe/e$b;->C(LSe/e;)LSe/e$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public s()LSe/e;
    .locals 2

    .line 1
    invoke-virtual {p0}, LSe/e$b;->t()LSe/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LSe/e;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-static {v0}, LZe/a$a;->h(LZe/p;)LZe/v;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    throw v0
.end method

.method public t()LSe/e;
    .locals 4

    .line 1
    new-instance v0, LSe/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LSe/e;-><init>(LZe/i$c;LSe/a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, LSe/e$b;->d:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    and-int/2addr v1, v2

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :goto_0
    iget v1, p0, LSe/e$b;->e:I

    .line 16
    .line 17
    invoke-static {v0, v1}, LSe/e;->B(LSe/e;I)I

    .line 18
    .line 19
    .line 20
    iget v1, p0, LSe/e$b;->d:I

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    and-int/2addr v1, v3

    .line 24
    if-ne v1, v3, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, LSe/e$b;->f:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, p0, LSe/e$b;->f:Ljava/util/List;

    .line 33
    .line 34
    iget v1, p0, LSe/e$b;->d:I

    .line 35
    .line 36
    and-int/lit8 v1, v1, -0x3

    .line 37
    .line 38
    iput v1, p0, LSe/e$b;->d:I

    .line 39
    .line 40
    :cond_1
    iget-object v1, p0, LSe/e$b;->f:Ljava/util/List;

    .line 41
    .line 42
    invoke-static {v0, v1}, LSe/e;->D(LSe/e;Ljava/util/List;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    iget v1, p0, LSe/e$b;->d:I

    .line 46
    .line 47
    const/4 v3, 0x4

    .line 48
    and-int/2addr v1, v3

    .line 49
    if-ne v1, v3, :cond_2

    .line 50
    .line 51
    iget-object v1, p0, LSe/e$b;->g:Ljava/util/List;

    .line 52
    .line 53
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iput-object v1, p0, LSe/e$b;->g:Ljava/util/List;

    .line 58
    .line 59
    iget v1, p0, LSe/e$b;->d:I

    .line 60
    .line 61
    and-int/lit8 v1, v1, -0x5

    .line 62
    .line 63
    iput v1, p0, LSe/e$b;->d:I

    .line 64
    .line 65
    :cond_2
    iget-object v1, p0, LSe/e$b;->g:Ljava/util/List;

    .line 66
    .line 67
    invoke-static {v0, v1}, LSe/e;->F(LSe/e;Ljava/util/List;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    iget v1, p0, LSe/e$b;->d:I

    .line 71
    .line 72
    const/16 v3, 0x8

    .line 73
    .line 74
    and-int/2addr v1, v3

    .line 75
    if-ne v1, v3, :cond_3

    .line 76
    .line 77
    iget-object v1, p0, LSe/e$b;->h:Ljava/util/List;

    .line 78
    .line 79
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iput-object v1, p0, LSe/e$b;->h:Ljava/util/List;

    .line 84
    .line 85
    iget v1, p0, LSe/e$b;->d:I

    .line 86
    .line 87
    and-int/lit8 v1, v1, -0x9

    .line 88
    .line 89
    iput v1, p0, LSe/e$b;->d:I

    .line 90
    .line 91
    :cond_3
    iget-object v1, p0, LSe/e$b;->h:Ljava/util/List;

    .line 92
    .line 93
    invoke-static {v0, v1}, LSe/e;->H(LSe/e;Ljava/util/List;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    invoke-static {v0, v2}, LSe/e;->I(LSe/e;I)I

    .line 97
    .line 98
    .line 99
    return-object v0
.end method

.method public u()LSe/e$b;
    .locals 2

    .line 1
    invoke-static {}, LSe/e$b;->v()LSe/e$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LSe/e$b;->t()LSe/e;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, LSe/e$b;->C(LSe/e;)LSe/e$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public bridge synthetic y1(LZe/e;LZe/g;)LZe/p$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LSe/e$b;->D(LZe/e;LZe/g;)LSe/e$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
