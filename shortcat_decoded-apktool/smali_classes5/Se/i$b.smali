.class public final LSe/i$b;
.super LZe/i$b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSe/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private b:I

.field private c:I

.field private d:I

.field private e:LSe/i$c;

.field private f:LSe/r;

.field private g:I

.field private h:Ljava/util/List;

.field private i:Ljava/util/List;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LZe/i$b;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LSe/i$c;->b:LSe/i$c;

    .line 5
    .line 6
    iput-object v0, p0, LSe/i$b;->e:LSe/i$c;

    .line 7
    .line 8
    invoke-static {}, LSe/r;->Y()LSe/r;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, LSe/i$b;->f:LSe/r;

    .line 13
    .line 14
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 15
    .line 16
    iput-object v0, p0, LSe/i$b;->h:Ljava/util/List;

    .line 17
    .line 18
    iput-object v0, p0, LSe/i$b;->i:Ljava/util/List;

    .line 19
    .line 20
    invoke-direct {p0}, LSe/i$b;->u()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method static synthetic m()LSe/i$b;
    .locals 1

    .line 1
    invoke-static {}, LSe/i$b;->r()LSe/i$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static r()LSe/i$b;
    .locals 1

    .line 1
    new-instance v0, LSe/i$b;

    .line 2
    .line 3
    invoke-direct {v0}, LSe/i$b;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private s()V
    .locals 3

    .line 1
    iget v0, p0, LSe/i$b;->b:I

    .line 2
    .line 3
    const/16 v1, 0x20

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
    iget-object v2, p0, LSe/i$b;->h:Ljava/util/List;

    .line 11
    .line 12
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, LSe/i$b;->h:Ljava/util/List;

    .line 16
    .line 17
    iget v0, p0, LSe/i$b;->b:I

    .line 18
    .line 19
    or-int/2addr v0, v1

    .line 20
    iput v0, p0, LSe/i$b;->b:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method private t()V
    .locals 3

    .line 1
    iget v0, p0, LSe/i$b;->b:I

    .line 2
    .line 3
    const/16 v1, 0x40

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
    iget-object v2, p0, LSe/i$b;->i:Ljava/util/List;

    .line 11
    .line 12
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, LSe/i$b;->i:Ljava/util/List;

    .line 16
    .line 17
    iget v0, p0, LSe/i$b;->b:I

    .line 18
    .line 19
    or-int/2addr v0, v1

    .line 20
    iput v0, p0, LSe/i$b;->b:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method private u()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public A(LSe/i$c;)LSe/i$b;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, LSe/i$b;->b:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x4

    .line 7
    .line 8
    iput v0, p0, LSe/i$b;->b:I

    .line 9
    .line 10
    iput-object p1, p0, LSe/i$b;->e:LSe/i$c;

    .line 11
    .line 12
    return-object p0
.end method

.method public B(I)LSe/i$b;
    .locals 1

    .line 1
    iget v0, p0, LSe/i$b;->b:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, LSe/i$b;->b:I

    .line 6
    .line 7
    iput p1, p0, LSe/i$b;->c:I

    .line 8
    .line 9
    return-object p0
.end method

.method public C(I)LSe/i$b;
    .locals 1

    .line 1
    iget v0, p0, LSe/i$b;->b:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x10

    .line 4
    .line 5
    iput v0, p0, LSe/i$b;->b:I

    .line 6
    .line 7
    iput p1, p0, LSe/i$b;->g:I

    .line 8
    .line 9
    return-object p0
.end method

.method public D(I)LSe/i$b;
    .locals 1

    .line 1
    iget v0, p0, LSe/i$b;->b:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iput v0, p0, LSe/i$b;->b:I

    .line 6
    .line 7
    iput p1, p0, LSe/i$b;->d:I

    .line 8
    .line 9
    return-object p0
.end method

.method public bridge synthetic build()LZe/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LSe/i$b;->n()LSe/i;

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
    invoke-virtual {p0}, LSe/i$b;->q()LSe/i$b;

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
    check-cast p1, LSe/i;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LSe/i$b;->v(LSe/i;)LSe/i$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public n()LSe/i;
    .locals 2

    .line 1
    invoke-virtual {p0}, LSe/i$b;->p()LSe/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LSe/i;->e()Z

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

.method public p()LSe/i;
    .locals 5

    .line 1
    new-instance v0, LSe/i;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LSe/i;-><init>(LZe/i$b;LSe/a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, LSe/i$b;->b:I

    .line 8
    .line 9
    and-int/lit8 v2, v1, 0x1

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v3, 0x0

    .line 16
    :goto_0
    iget v2, p0, LSe/i$b;->c:I

    .line 17
    .line 18
    invoke-static {v0, v2}, LSe/i;->s(LSe/i;I)I

    .line 19
    .line 20
    .line 21
    and-int/lit8 v2, v1, 0x2

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    if-ne v2, v4, :cond_1

    .line 25
    .line 26
    or-int/lit8 v3, v3, 0x2

    .line 27
    .line 28
    :cond_1
    iget v2, p0, LSe/i$b;->d:I

    .line 29
    .line 30
    invoke-static {v0, v2}, LSe/i;->t(LSe/i;I)I

    .line 31
    .line 32
    .line 33
    and-int/lit8 v2, v1, 0x4

    .line 34
    .line 35
    const/4 v4, 0x4

    .line 36
    if-ne v2, v4, :cond_2

    .line 37
    .line 38
    or-int/lit8 v3, v3, 0x4

    .line 39
    .line 40
    :cond_2
    iget-object v2, p0, LSe/i$b;->e:LSe/i$c;

    .line 41
    .line 42
    invoke-static {v0, v2}, LSe/i;->u(LSe/i;LSe/i$c;)LSe/i$c;

    .line 43
    .line 44
    .line 45
    and-int/lit8 v2, v1, 0x8

    .line 46
    .line 47
    const/16 v4, 0x8

    .line 48
    .line 49
    if-ne v2, v4, :cond_3

    .line 50
    .line 51
    or-int/lit8 v3, v3, 0x8

    .line 52
    .line 53
    :cond_3
    iget-object v2, p0, LSe/i$b;->f:LSe/r;

    .line 54
    .line 55
    invoke-static {v0, v2}, LSe/i;->v(LSe/i;LSe/r;)LSe/r;

    .line 56
    .line 57
    .line 58
    const/16 v2, 0x10

    .line 59
    .line 60
    and-int/2addr v1, v2

    .line 61
    if-ne v1, v2, :cond_4

    .line 62
    .line 63
    or-int/lit8 v3, v3, 0x10

    .line 64
    .line 65
    :cond_4
    iget v1, p0, LSe/i$b;->g:I

    .line 66
    .line 67
    invoke-static {v0, v1}, LSe/i;->w(LSe/i;I)I

    .line 68
    .line 69
    .line 70
    iget v1, p0, LSe/i$b;->b:I

    .line 71
    .line 72
    const/16 v2, 0x20

    .line 73
    .line 74
    and-int/2addr v1, v2

    .line 75
    if-ne v1, v2, :cond_5

    .line 76
    .line 77
    iget-object v1, p0, LSe/i$b;->h:Ljava/util/List;

    .line 78
    .line 79
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iput-object v1, p0, LSe/i$b;->h:Ljava/util/List;

    .line 84
    .line 85
    iget v1, p0, LSe/i$b;->b:I

    .line 86
    .line 87
    and-int/lit8 v1, v1, -0x21

    .line 88
    .line 89
    iput v1, p0, LSe/i$b;->b:I

    .line 90
    .line 91
    :cond_5
    iget-object v1, p0, LSe/i$b;->h:Ljava/util/List;

    .line 92
    .line 93
    invoke-static {v0, v1}, LSe/i;->y(LSe/i;Ljava/util/List;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    iget v1, p0, LSe/i$b;->b:I

    .line 97
    .line 98
    const/16 v2, 0x40

    .line 99
    .line 100
    and-int/2addr v1, v2

    .line 101
    if-ne v1, v2, :cond_6

    .line 102
    .line 103
    iget-object v1, p0, LSe/i$b;->i:Ljava/util/List;

    .line 104
    .line 105
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iput-object v1, p0, LSe/i$b;->i:Ljava/util/List;

    .line 110
    .line 111
    iget v1, p0, LSe/i$b;->b:I

    .line 112
    .line 113
    and-int/lit8 v1, v1, -0x41

    .line 114
    .line 115
    iput v1, p0, LSe/i$b;->b:I

    .line 116
    .line 117
    :cond_6
    iget-object v1, p0, LSe/i$b;->i:Ljava/util/List;

    .line 118
    .line 119
    invoke-static {v0, v1}, LSe/i;->A(LSe/i;Ljava/util/List;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    invoke-static {v0, v3}, LSe/i;->B(LSe/i;I)I

    .line 123
    .line 124
    .line 125
    return-object v0
.end method

.method public q()LSe/i$b;
    .locals 2

    .line 1
    invoke-static {}, LSe/i$b;->r()LSe/i$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LSe/i$b;->p()LSe/i;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, LSe/i$b;->v(LSe/i;)LSe/i$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public v(LSe/i;)LSe/i$b;
    .locals 2

    .line 1
    invoke-static {}, LSe/i;->G()LSe/i;

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
    invoke-virtual {p1}, LSe/i;->O()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, LSe/i;->H()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, v0}, LSe/i$b;->B(I)LSe/i$b;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, LSe/i;->R()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, LSe/i;->M()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p0, v0}, LSe/i$b;->D(I)LSe/i$b;

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p1}, LSe/i;->N()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, LSe/i;->F()LSe/i$c;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0, v0}, LSe/i$b;->A(LSe/i$c;)LSe/i$b;

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-virtual {p1}, LSe/i;->P()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    invoke-virtual {p1}, LSe/i;->I()LSe/r;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p0, v0}, LSe/i$b;->y(LSe/r;)LSe/i$b;

    .line 58
    .line 59
    .line 60
    :cond_4
    invoke-virtual {p1}, LSe/i;->Q()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    invoke-virtual {p1}, LSe/i;->J()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {p0, v0}, LSe/i$b;->C(I)LSe/i$b;

    .line 71
    .line 72
    .line 73
    :cond_5
    invoke-static {p1}, LSe/i;->x(LSe/i;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_7

    .line 82
    .line 83
    iget-object v0, p0, LSe/i$b;->h:Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_6

    .line 90
    .line 91
    invoke-static {p1}, LSe/i;->x(LSe/i;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iput-object v0, p0, LSe/i$b;->h:Ljava/util/List;

    .line 96
    .line 97
    iget v0, p0, LSe/i$b;->b:I

    .line 98
    .line 99
    and-int/lit8 v0, v0, -0x21

    .line 100
    .line 101
    iput v0, p0, LSe/i$b;->b:I

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_6
    invoke-direct {p0}, LSe/i$b;->s()V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, LSe/i$b;->h:Ljava/util/List;

    .line 108
    .line 109
    invoke-static {p1}, LSe/i;->x(LSe/i;)Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 114
    .line 115
    .line 116
    :cond_7
    :goto_0
    invoke-static {p1}, LSe/i;->z(LSe/i;)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_9

    .line 125
    .line 126
    iget-object v0, p0, LSe/i$b;->i:Ljava/util/List;

    .line 127
    .line 128
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_8

    .line 133
    .line 134
    invoke-static {p1}, LSe/i;->z(LSe/i;)Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    iput-object v0, p0, LSe/i$b;->i:Ljava/util/List;

    .line 139
    .line 140
    iget v0, p0, LSe/i$b;->b:I

    .line 141
    .line 142
    and-int/lit8 v0, v0, -0x41

    .line 143
    .line 144
    iput v0, p0, LSe/i$b;->b:I

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_8
    invoke-direct {p0}, LSe/i$b;->t()V

    .line 148
    .line 149
    .line 150
    iget-object v0, p0, LSe/i$b;->i:Ljava/util/List;

    .line 151
    .line 152
    invoke-static {p1}, LSe/i;->z(LSe/i;)Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 157
    .line 158
    .line 159
    :cond_9
    :goto_1
    invoke-virtual {p0}, LZe/i$b;->i()LZe/d;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {p1}, LSe/i;->C(LSe/i;)LZe/d;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {v0, p1}, LZe/d;->c(LZe/d;)LZe/d;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-virtual {p0, p1}, LZe/i$b;->k(LZe/d;)LZe/i$b;

    .line 172
    .line 173
    .line 174
    return-object p0
.end method

.method public x(LZe/e;LZe/g;)LSe/i$b;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, LSe/i;->n:LZe/r;

    .line 3
    .line 4
    invoke-interface {v1, p1, p2}, LZe/r;->b(LZe/e;LZe/g;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, LSe/i;
    :try_end_0
    .catch LZe/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, LSe/i$b;->v(LSe/i;)LSe/i$b;

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
    check-cast p2, LSe/i;
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
    invoke-virtual {p0, v0}, LSe/i$b;->v(LSe/i;)LSe/i$b;

    .line 31
    .line 32
    .line 33
    :cond_1
    throw p1
.end method

.method public y(LSe/r;)LSe/i$b;
    .locals 3

    .line 1
    iget v0, p0, LSe/i$b;->b:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, LSe/i$b;->f:LSe/r;

    .line 9
    .line 10
    invoke-static {}, LSe/r;->Y()LSe/r;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eq v0, v2, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, LSe/i$b;->f:LSe/r;

    .line 17
    .line 18
    invoke-static {v0}, LSe/r;->z0(LSe/r;)LSe/r$c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0, p1}, LSe/r$c;->C(LSe/r;)LSe/r$c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, LSe/r$c;->t()LSe/r;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, LSe/i$b;->f:LSe/r;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iput-object p1, p0, LSe/i$b;->f:LSe/r;

    .line 34
    .line 35
    :goto_0
    iget p1, p0, LSe/i$b;->b:I

    .line 36
    .line 37
    or-int/2addr p1, v1

    .line 38
    iput p1, p0, LSe/i$b;->b:I

    .line 39
    .line 40
    return-object p0
.end method

.method public bridge synthetic y1(LZe/e;LZe/g;)LZe/p$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LSe/i$b;->x(LZe/e;LZe/g;)LSe/i$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
