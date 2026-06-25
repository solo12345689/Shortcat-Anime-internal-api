.class public final LY/s;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY/s$a;,
        LY/s$b;
    }
.end annotation


# instance fields
.field private A:Z

.field private B:I

.field private C:I

.field private D:I

.field private E:Z

.field private final F:LY/s$c;

.field private final G:Ljava/util/ArrayList;

.field private H:Z

.field private I:Z

.field private J:LY/D1;

.field private K:LY/E1;

.field private L:LY/H1;

.field private M:Z

.field private N:LY/U0;

.field private O:LZ/a;

.field private final P:LZ/b;

.field private Q:LY/b;

.field private R:LZ/c;

.field private S:LY/C1;

.field private final T:Lk0/h;

.field private final U:LZd/i;

.field private V:Z

.field private W:J

.field private X:Lk0/e;

.field private final b:LY/d;

.field private final c:LY/y;

.field private final d:LY/E1;

.field private final e:Ljava/util/Set;

.field private f:LZ/a;

.field private g:LZ/a;

.field private final h:LY/K;

.field private final i:LY/B;

.field private final j:Ljava/util/ArrayList;

.field private k:LY/T0;

.field private l:I

.field private m:I

.field private n:I

.field private final o:LY/i0;

.field private p:[I

.field private q:Lt/D;

.field private r:Z

.field private s:Z

.field private t:Z

.field private final u:Ljava/util/List;

.field private final v:LY/i0;

.field private w:LY/U0;

.field private x:Lt/F;

.field private y:Z

.field private final z:LY/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LY/d;LY/y;LY/E1;Ljava/util/Set;LZ/a;LZ/a;LY/K;LY/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY/s;->b:LY/d;

    .line 5
    .line 6
    iput-object p2, p0, LY/s;->c:LY/y;

    .line 7
    .line 8
    iput-object p3, p0, LY/s;->d:LY/E1;

    .line 9
    .line 10
    iput-object p4, p0, LY/s;->e:Ljava/util/Set;

    .line 11
    .line 12
    iput-object p5, p0, LY/s;->f:LZ/a;

    .line 13
    .line 14
    iput-object p6, p0, LY/s;->g:LZ/a;

    .line 15
    .line 16
    iput-object p7, p0, LY/s;->h:LY/K;

    .line 17
    .line 18
    iput-object p8, p0, LY/s;->i:LY/B;

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    const/4 p4, 0x1

    .line 22
    invoke-static {p1, p4, p1}, LY/g2;->c(Ljava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object p5

    .line 26
    iput-object p5, p0, LY/s;->j:Ljava/util/ArrayList;

    .line 27
    .line 28
    new-instance p5, LY/i0;

    .line 29
    .line 30
    invoke-direct {p5}, LY/i0;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p5, p0, LY/s;->o:LY/i0;

    .line 34
    .line 35
    new-instance p5, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {p5}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p5, p0, LY/s;->u:Ljava/util/List;

    .line 41
    .line 42
    new-instance p5, LY/i0;

    .line 43
    .line 44
    invoke-direct {p5}, LY/i0;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p5, p0, LY/s;->v:LY/i0;

    .line 48
    .line 49
    invoke-static {}, Lg0/n;->a()Lg0/m;

    .line 50
    .line 51
    .line 52
    move-result-object p5

    .line 53
    iput-object p5, p0, LY/s;->w:LY/U0;

    .line 54
    .line 55
    new-instance p5, LY/i0;

    .line 56
    .line 57
    invoke-direct {p5}, LY/i0;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p5, p0, LY/s;->z:LY/i0;

    .line 61
    .line 62
    const/4 p5, -0x1

    .line 63
    iput p5, p0, LY/s;->B:I

    .line 64
    .line 65
    invoke-virtual {p2}, LY/y;->f()Z

    .line 66
    .line 67
    .line 68
    move-result p5

    .line 69
    const/4 p6, 0x0

    .line 70
    if-nez p5, :cond_1

    .line 71
    .line 72
    invoke-virtual {p2}, LY/y;->d()Z

    .line 73
    .line 74
    .line 75
    move-result p5

    .line 76
    if-eqz p5, :cond_0

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    move p5, p6

    .line 80
    goto :goto_1

    .line 81
    :cond_1
    :goto_0
    move p5, p4

    .line 82
    :goto_1
    iput-boolean p5, p0, LY/s;->E:Z

    .line 83
    .line 84
    new-instance p5, LY/s$c;

    .line 85
    .line 86
    invoke-direct {p5, p0}, LY/s$c;-><init>(LY/s;)V

    .line 87
    .line 88
    .line 89
    iput-object p5, p0, LY/s;->F:LY/s$c;

    .line 90
    .line 91
    invoke-static {p1, p4, p1}, LY/g2;->c(Ljava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)Ljava/util/ArrayList;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iput-object p1, p0, LY/s;->G:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {p3}, LY/E1;->F()LY/D1;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1}, LY/D1;->d()V

    .line 102
    .line 103
    .line 104
    iput-object p1, p0, LY/s;->J:LY/D1;

    .line 105
    .line 106
    new-instance p1, LY/E1;

    .line 107
    .line 108
    invoke-direct {p1}, LY/E1;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2}, LY/y;->f()Z

    .line 112
    .line 113
    .line 114
    move-result p3

    .line 115
    if-eqz p3, :cond_2

    .line 116
    .line 117
    invoke-virtual {p1}, LY/E1;->l()V

    .line 118
    .line 119
    .line 120
    :cond_2
    invoke-virtual {p2}, LY/y;->d()Z

    .line 121
    .line 122
    .line 123
    move-result p3

    .line 124
    if-eqz p3, :cond_3

    .line 125
    .line 126
    invoke-virtual {p1}, LY/E1;->i()V

    .line 127
    .line 128
    .line 129
    :cond_3
    iput-object p1, p0, LY/s;->K:LY/E1;

    .line 130
    .line 131
    invoke-virtual {p1}, LY/E1;->G()LY/H1;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p1, p4}, LY/H1;->J(Z)V

    .line 136
    .line 137
    .line 138
    iput-object p1, p0, LY/s;->L:LY/H1;

    .line 139
    .line 140
    new-instance p1, LZ/b;

    .line 141
    .line 142
    iget-object p3, p0, LY/s;->f:LZ/a;

    .line 143
    .line 144
    invoke-direct {p1, p0, p3}, LZ/b;-><init>(LY/s;LZ/a;)V

    .line 145
    .line 146
    .line 147
    iput-object p1, p0, LY/s;->P:LZ/b;

    .line 148
    .line 149
    iget-object p1, p0, LY/s;->K:LY/E1;

    .line 150
    .line 151
    invoke-virtual {p1}, LY/E1;->F()LY/D1;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    :try_start_0
    invoke-virtual {p1, p6}, LY/D1;->a(I)LY/b;

    .line 156
    .line 157
    .line 158
    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 159
    invoke-virtual {p1}, LY/D1;->d()V

    .line 160
    .line 161
    .line 162
    iput-object p3, p0, LY/s;->Q:LY/b;

    .line 163
    .line 164
    new-instance p1, LZ/c;

    .line 165
    .line 166
    invoke-direct {p1}, LZ/c;-><init>()V

    .line 167
    .line 168
    .line 169
    iput-object p1, p0, LY/s;->R:LZ/c;

    .line 170
    .line 171
    new-instance p1, Lk0/h;

    .line 172
    .line 173
    invoke-direct {p1, p0}, Lk0/h;-><init>(LY/s;)V

    .line 174
    .line 175
    .line 176
    iput-object p1, p0, LY/s;->T:Lk0/h;

    .line 177
    .line 178
    invoke-virtual {p2}, LY/y;->j()LZd/i;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p0}, LY/s;->K0()Lk0/h;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    if-eqz p2, :cond_4

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_4
    sget-object p2, LZd/j;->a:LZd/j;

    .line 190
    .line 191
    :goto_2
    invoke-interface {p1, p2}, LZd/i;->w(LZd/i;)LZd/i;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    iput-object p1, p0, LY/s;->U:LZd/i;

    .line 196
    .line 197
    return-void

    .line 198
    :catchall_0
    move-exception p2

    .line 199
    invoke-virtual {p1}, LY/D1;->d()V

    .line 200
    .line 201
    .line 202
    throw p2
.end method

.method private final A0(ZLY/T0;)V
    .locals 2

    .line 1
    iget-object v0, p0, LY/s;->j:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, LY/s;->k:LY/T0;

    .line 4
    .line 5
    invoke-static {v0, v1}, LY/g2;->j(Ljava/util/ArrayList;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, LY/s;->k:LY/T0;

    .line 9
    .line 10
    iget-object p2, p0, LY/s;->o:LY/i0;

    .line 11
    .line 12
    iget v0, p0, LY/s;->m:I

    .line 13
    .line 14
    invoke-virtual {p2, v0}, LY/i0;->h(I)V

    .line 15
    .line 16
    .line 17
    iget-object p2, p0, LY/s;->o:LY/i0;

    .line 18
    .line 19
    iget v0, p0, LY/s;->n:I

    .line 20
    .line 21
    invoke-virtual {p2, v0}, LY/i0;->h(I)V

    .line 22
    .line 23
    .line 24
    iget-object p2, p0, LY/s;->o:LY/i0;

    .line 25
    .line 26
    iget v0, p0, LY/s;->l:I

    .line 27
    .line 28
    invoke-virtual {p2, v0}, LY/i0;->h(I)V

    .line 29
    .line 30
    .line 31
    const/4 p2, 0x0

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    iput p2, p0, LY/s;->l:I

    .line 35
    .line 36
    :cond_0
    iput p2, p0, LY/s;->m:I

    .line 37
    .line 38
    iput p2, p0, LY/s;->n:I

    .line 39
    .line 40
    return-void
.end method

.method private final A1()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LY/s;->n:I

    .line 3
    .line 4
    iget-object v0, p0, LY/s;->d:LY/E1;

    .line 5
    .line 6
    invoke-virtual {v0}, LY/E1;->F()LY/D1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, LY/s;->J:LY/D1;

    .line 11
    .line 12
    const/16 v0, 0x64

    .line 13
    .line 14
    invoke-direct {p0, v0}, LY/s;->w1(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, LY/s;->c:LY/y;

    .line 18
    .line 19
    invoke-virtual {v0}, LY/y;->t()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, LY/s;->c:LY/y;

    .line 23
    .line 24
    invoke-virtual {v0}, LY/y;->i()LY/U0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p0, LY/s;->z:LY/i0;

    .line 29
    .line 30
    iget-boolean v2, p0, LY/s;->y:Z

    .line 31
    .line 32
    invoke-static {v2}, LY/w;->f(Z)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {v1, v2}, LY/i0;->h(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, LY/s;->U(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    iput-boolean v1, p0, LY/s;->y:Z

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    iput-object v1, p0, LY/s;->N:LY/U0;

    .line 47
    .line 48
    iget-boolean v1, p0, LY/s;->r:Z

    .line 49
    .line 50
    if-nez v1, :cond_0

    .line 51
    .line 52
    iget-object v1, p0, LY/s;->c:LY/y;

    .line 53
    .line 54
    invoke-virtual {v1}, LY/y;->e()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    iput-boolean v1, p0, LY/s;->r:Z

    .line 59
    .line 60
    :cond_0
    iget-boolean v1, p0, LY/s;->E:Z

    .line 61
    .line 62
    if-nez v1, :cond_1

    .line 63
    .line 64
    iget-object v1, p0, LY/s;->c:LY/y;

    .line 65
    .line 66
    invoke-virtual {v1}, LY/y;->f()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    iput-boolean v1, p0, LY/s;->E:Z

    .line 71
    .line 72
    :cond_1
    iget-boolean v1, p0, LY/s;->E:Z

    .line 73
    .line 74
    if-eqz v1, :cond_2

    .line 75
    .line 76
    invoke-static {}, Lk0/j;->c()LY/D;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>"

    .line 81
    .line 82
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    new-instance v2, LY/j2;

    .line 86
    .line 87
    invoke-virtual {p0}, LY/s;->K0()Lk0/h;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-direct {v2, v3}, LY/j2;-><init>(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v0, v1, v2}, LY/U0;->x(LY/D;LY/n2;)LY/U0;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    :cond_2
    iput-object v0, p0, LY/s;->w:LY/U0;

    .line 99
    .line 100
    invoke-static {}, Lk0/o;->c()LY/b1;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v0, v1}, LY/J;->b(LY/U0;LY/D;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Ljava/util/Set;

    .line 109
    .line 110
    if-eqz v0, :cond_3

    .line 111
    .line 112
    invoke-virtual {p0}, LY/s;->E()Lk0/e;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    iget-object v1, p0, LY/s;->c:LY/y;

    .line 120
    .line 121
    invoke-virtual {v1, v0}, LY/y;->p(Ljava/util/Set;)V

    .line 122
    .line 123
    .line 124
    :cond_3
    iget-object v0, p0, LY/s;->c:LY/y;

    .line 125
    .line 126
    invoke-virtual {v0}, LY/y;->g()J

    .line 127
    .line 128
    .line 129
    move-result-wide v0

    .line 130
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    invoke-direct {p0, v0}, LY/s;->w1(I)V

    .line 135
    .line 136
    .line 137
    return-void
.end method

.method private final B0(LY/f1;)V
    .locals 1

    .line 1
    iget v0, p0, LY/s;->D:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LY/f1;->P(I)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LY/s;->h:LY/K;

    .line 7
    .line 8
    invoke-virtual {p1}, LY/K;->a()Lk0/l;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final C0(IZ)V
    .locals 1

    .line 1
    iget-object v0, p0, LY/s;->j:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, LY/g2;->i(Ljava/util/ArrayList;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LY/T0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, LY/T0;->a()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    add-int/lit8 p2, p2, 0x1

    .line 18
    .line 19
    invoke-virtual {v0, p2}, LY/T0;->l(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iput-object v0, p0, LY/s;->k:LY/T0;

    .line 23
    .line 24
    iget-object p2, p0, LY/s;->o:LY/i0;

    .line 25
    .line 26
    invoke-virtual {p2}, LY/i0;->g()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    add-int/2addr p2, p1

    .line 31
    iput p2, p0, LY/s;->l:I

    .line 32
    .line 33
    iget-object p2, p0, LY/s;->o:LY/i0;

    .line 34
    .line 35
    invoke-virtual {p2}, LY/i0;->g()I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    iput p2, p0, LY/s;->n:I

    .line 40
    .line 41
    iget-object p2, p0, LY/s;->o:LY/i0;

    .line 42
    .line 43
    invoke-virtual {p2}, LY/i0;->g()I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    add-int/2addr p2, p1

    .line 48
    iput p2, p0, LY/s;->m:I

    .line 49
    .line 50
    return-void
.end method

.method private final D0(LY/f1;)Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    iget-object v0, p0, LY/s;->h:LY/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/K;->a()Lk0/l;

    .line 4
    .line 5
    .line 6
    iget v0, p0, LY/s;->D:I

    .line 7
    .line 8
    invoke-virtual {p1, v0}, LY/f1;->f(I)Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method private final E0()V
    .locals 1

    .line 1
    iget-object v0, p0, LY/s;->P:LZ/b;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ/b;->n()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY/s;->j:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-static {v0}, LY/g2;->e(Ljava/util/ArrayList;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-string v0, "Start/end imbalance"

    .line 15
    .line 16
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-direct {p0}, LY/s;->i0()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private final E1(II)V
    .locals 7

    .line 1
    invoke-direct {p0, p1}, LY/s;->J1(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eq v0, p2, :cond_3

    .line 6
    .line 7
    if-gez p1, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, LY/s;->q:Lt/D;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lt/D;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v0, v3, v1, v2}, Lt/D;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, LY/s;->q:Lt/D;

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v0, p1, p2}, Lt/D;->r(II)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    iget-object v0, p0, LY/s;->p:[I

    .line 28
    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 32
    .line 33
    invoke-virtual {v0}, LY/D1;->x()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    new-array v1, v0, [I

    .line 38
    .line 39
    const/4 v5, 0x6

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v2, -0x1

    .line 42
    const/4 v3, 0x0

    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-static/range {v1 .. v6}, LUd/n;->x([IIIIILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iput-object v1, p0, LY/s;->p:[I

    .line 48
    .line 49
    move-object v0, v1

    .line 50
    :cond_2
    aput p2, v0, p1

    .line 51
    .line 52
    :cond_3
    return-void
.end method

.method private final F0()V
    .locals 2

    .line 1
    new-instance v0, LY/E1;

    .line 2
    .line 3
    invoke-direct {v0}, LY/E1;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p0, LY/s;->E:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, LY/E1;->l()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, LY/s;->c:LY/y;

    .line 14
    .line 15
    invoke-virtual {v1}, LY/y;->d()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, LY/E1;->i()V

    .line 22
    .line 23
    .line 24
    :cond_1
    iput-object v0, p0, LY/s;->K:LY/E1;

    .line 25
    .line 26
    invoke-virtual {v0}, LY/E1;->G()LY/H1;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-virtual {v0, v1}, LY/H1;->J(Z)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, LY/s;->L:LY/H1;

    .line 35
    .line 36
    return-void
.end method

.method private final F1(II)V
    .locals 5

    .line 1
    invoke-direct {p0, p1}, LY/s;->J1(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eq v0, p2, :cond_3

    .line 6
    .line 7
    sub-int/2addr p2, v0

    .line 8
    iget-object v0, p0, LY/s;->j:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {v0}, LY/g2;->d(Ljava/util/ArrayList;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/lit8 v0, v0, -0x1

    .line 15
    .line 16
    :goto_0
    const/4 v1, -0x1

    .line 17
    if-eq p1, v1, :cond_3

    .line 18
    .line 19
    invoke-direct {p0, p1}, LY/s;->J1(I)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    add-int/2addr v2, p2

    .line 24
    invoke-direct {p0, p1, v2}, LY/s;->E1(II)V

    .line 25
    .line 26
    .line 27
    move v3, v0

    .line 28
    :goto_1
    if-ge v1, v3, :cond_1

    .line 29
    .line 30
    iget-object v4, p0, LY/s;->j:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-static {v4, v3}, LY/g2;->h(Ljava/util/ArrayList;I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, LY/T0;

    .line 37
    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    invoke-virtual {v4, p1, v2}, LY/T0;->n(II)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    add-int/lit8 v3, v3, -0x1

    .line 47
    .line 48
    move v0, v3

    .line 49
    goto :goto_2

    .line 50
    :cond_0
    add-int/lit8 v3, v3, -0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    :goto_2
    if-gez p1, :cond_2

    .line 54
    .line 55
    iget-object p1, p0, LY/s;->J:LY/D1;

    .line 56
    .line 57
    invoke-virtual {p1}, LY/D1;->u()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    iget-object v1, p0, LY/s;->J:LY/D1;

    .line 63
    .line 64
    invoke-virtual {v1, p1}, LY/D1;->K(I)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_3

    .line 69
    .line 70
    iget-object v1, p0, LY/s;->J:LY/D1;

    .line 71
    .line 72
    invoke-virtual {v1, p1}, LY/D1;->Q(I)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    goto :goto_0

    .line 77
    :cond_3
    return-void
.end method

.method private final G1(LY/U0;LY/U0;)LY/U0;
    .locals 2

    .line 1
    invoke-interface {p1}, LY/U0;->builder()LY/U0$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, LY/U0$a;->build()LY/U0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/16 v0, 0xcc

    .line 13
    .line 14
    invoke-static {}, LY/w;->G()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-direct {p0, v0, v1}, LY/s;->x1(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p1}, LY/s;->H1(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p2}, LY/s;->H1(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, LY/s;->w0()V

    .line 28
    .line 29
    .line 30
    return-object p1
.end method

.method private final H1(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LY/s;->W0()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, LY/s;->I1(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private final J1(I)I
    .locals 3

    .line 1
    if-gez p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, LY/s;->q:Lt/D;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lt/j;->a(I)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lt/j;->c(I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_0
    return v1

    .line 20
    :cond_1
    iget-object v0, p0, LY/s;->p:[I

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    aget v0, v0, p1

    .line 25
    .line 26
    if-ltz v0, :cond_2

    .line 27
    .line 28
    return v0

    .line 29
    :cond_2
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, LY/D1;->O(I)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    return p1
.end method

.method private final K1()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LY/s;->t:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "A call to createNode(), emitNode() or useNode() expected was not expected"

    .line 6
    .line 7
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, LY/s;->t:Z

    .line 12
    .line 13
    return-void
.end method

.method private final L0(LY/D1;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1}, LY/D1;->u()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1, v0}, LY/D1;->M(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method private final L1()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LY/s;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "A call to createNode(), emitNode() or useNode() expected"

    .line 6
    .line 7
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method private final N0(LY/D1;I)I
    .locals 2

    .line 1
    invoke-virtual {p1, p2}, LY/D1;->H(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1, p2}, LY/D1;->E(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    instance-of p2, p1, Ljava/lang/Enum;

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    check-cast p1, Ljava/lang/Enum;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1

    .line 29
    :cond_1
    const/4 p1, 0x0

    .line 30
    return p1

    .line 31
    :cond_2
    invoke-virtual {p1, p2}, LY/D1;->D(I)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/16 v1, 0xcf

    .line 36
    .line 37
    if-ne v0, v1, :cond_4

    .line 38
    .line 39
    invoke-virtual {p1, p2}, LY/D1;->A(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_4

    .line 44
    .line 45
    sget-object p2, LY/m;->a:LY/m$a;

    .line 46
    .line 47
    invoke-virtual {p2}, LY/m$a;->a()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-eqz p2, :cond_3

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    return p1

    .line 63
    :cond_4
    :goto_0
    return v0
.end method

.method private final O0(Ljava/util/List;)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v9, v1, LY/s;->P:LZ/b;

    .line 4
    .line 5
    iget-object v0, v1, LY/s;->g:LZ/a;

    .line 6
    .line 7
    invoke-virtual {v9}, LZ/b;->o()LZ/a;

    .line 8
    .line 9
    .line 10
    move-result-object v10

    .line 11
    :try_start_0
    invoke-virtual {v9, v0}, LZ/b;->T(LZ/a;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v1, LY/s;->P:LZ/b;

    .line 15
    .line 16
    invoke-virtual {v0}, LZ/b;->R()V

    .line 17
    .line 18
    .line 19
    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    const/4 v11, 0x0

    .line 24
    move v12, v11

    .line 25
    :goto_0
    if-ge v12, v0, :cond_3

    .line 26
    .line 27
    move-object/from16 v13, p1

    .line 28
    .line 29
    :try_start_1
    invoke-interface {v13, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lkotlin/Pair;

    .line 34
    .line 35
    invoke-virtual {v2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, LY/y0;

    .line 40
    .line 41
    invoke-virtual {v2}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, LY/y0;

    .line 46
    .line 47
    invoke-virtual {v3}, LY/y0;->a()LY/b;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v3}, LY/y0;->g()LY/E1;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v5, v4}, LY/E1;->d(LY/b;)I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    new-instance v14, Lg0/k;

    .line 60
    .line 61
    const/4 v6, 0x1

    .line 62
    const/4 v7, 0x0

    .line 63
    invoke-direct {v14, v11, v6, v7}, Lg0/k;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 64
    .line 65
    .line 66
    iget-object v6, v1, LY/s;->P:LZ/b;

    .line 67
    .line 68
    invoke-virtual {v6, v14, v4}, LZ/b;->e(Lg0/k;LY/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_d

    .line 69
    .line 70
    .line 71
    if-nez v2, :cond_1

    .line 72
    .line 73
    :try_start_2
    invoke-virtual {v3}, LY/y0;->g()LY/E1;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    iget-object v4, v1, LY/s;->K:LY/E1;

    .line 78
    .line 79
    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_0

    .line 84
    .line 85
    invoke-direct {v1}, LY/s;->m0()V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    move-object v2, v9

    .line 91
    move-object v3, v10

    .line 92
    goto/16 :goto_9

    .line 93
    .line 94
    :cond_0
    :goto_1
    invoke-virtual {v3}, LY/y0;->g()LY/E1;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v2}, LY/E1;->F()LY/D1;

    .line 99
    .line 100
    .line 101
    move-result-object v15
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 102
    :try_start_3
    invoke-virtual {v15, v5}, LY/D1;->R(I)V

    .line 103
    .line 104
    .line 105
    iget-object v2, v1, LY/s;->P:LZ/b;

    .line 106
    .line 107
    invoke-virtual {v2, v5}, LZ/b;->z(I)V

    .line 108
    .line 109
    .line 110
    new-instance v2, LZ/a;

    .line 111
    .line 112
    invoke-direct {v2}, LZ/a;-><init>()V

    .line 113
    .line 114
    .line 115
    new-instance v6, LY/n;

    .line 116
    .line 117
    invoke-direct {v6, v1, v2, v15, v3}, LY/n;-><init>(LY/s;LZ/a;LY/D1;LY/y0;)V

    .line 118
    .line 119
    .line 120
    const/16 v7, 0xf

    .line 121
    .line 122
    const/4 v8, 0x0

    .line 123
    move-object v3, v2

    .line 124
    const/4 v2, 0x0

    .line 125
    move-object v4, v3

    .line 126
    const/4 v3, 0x0

    .line 127
    move-object v5, v4

    .line 128
    const/4 v4, 0x0

    .line 129
    move-object/from16 v16, v5

    .line 130
    .line 131
    const/4 v5, 0x0

    .line 132
    move-object/from16 v11, v16

    .line 133
    .line 134
    invoke-static/range {v1 .. v8}, LY/s;->f1(LY/s;LY/Q;LY/Q;Ljava/lang/Integer;Ljava/util/List;Lie/a;ILjava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    iget-object v2, v1, LY/s;->P:LZ/b;

    .line 138
    .line 139
    invoke-virtual {v2, v11, v14}, LZ/b;->s(LZ/a;Lg0/k;)V

    .line 140
    .line 141
    .line 142
    sget-object v2, LTd/L;->a:LTd/L;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 143
    .line 144
    :try_start_4
    invoke-virtual {v15}, LY/D1;->d()V

    .line 145
    .line 146
    .line 147
    move/from16 v18, v0

    .line 148
    .line 149
    move-object/from16 v19, v9

    .line 150
    .line 151
    move-object/from16 v20, v10

    .line 152
    .line 153
    move/from16 v17, v12

    .line 154
    .line 155
    goto/16 :goto_2

    .line 156
    .line 157
    :catchall_1
    move-exception v0

    .line 158
    invoke-virtual {v15}, LY/D1;->d()V

    .line 159
    .line 160
    .line 161
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 162
    :cond_1
    :try_start_5
    iget-object v5, v1, LY/s;->c:LY/y;

    .line 163
    .line 164
    invoke-virtual {v5, v2}, LY/y;->n(LY/y0;)LY/x0;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    invoke-virtual {v2}, LY/y0;->g()LY/E1;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    invoke-virtual {v2}, LY/y0;->a()LY/b;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    invoke-static {v6, v8}, LY/w;->g(LY/E1;LY/b;)Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v11

    .line 180
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 181
    .line 182
    .line 183
    move-result v15
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_d

    .line 184
    if-nez v15, :cond_2

    .line 185
    .line 186
    :try_start_6
    iget-object v15, v1, LY/s;->P:LZ/b;

    .line 187
    .line 188
    invoke-virtual {v15, v11, v14}, LZ/b;->b(Ljava/util/List;Lg0/k;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3}, LY/y0;->g()LY/E1;

    .line 192
    .line 193
    .line 194
    move-result-object v15

    .line 195
    iget-object v7, v1, LY/s;->d:LY/E1;

    .line 196
    .line 197
    invoke-static {v15, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v7

    .line 201
    if-eqz v7, :cond_2

    .line 202
    .line 203
    iget-object v7, v1, LY/s;->d:LY/E1;

    .line 204
    .line 205
    invoke-virtual {v7, v4}, LY/E1;->d(LY/b;)I

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    invoke-direct {v1, v4}, LY/s;->J1(I)I

    .line 210
    .line 211
    .line 212
    move-result v7

    .line 213
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 214
    .line 215
    .line 216
    move-result v11

    .line 217
    add-int/2addr v7, v11

    .line 218
    invoke-direct {v1, v4, v7}, LY/s;->E1(II)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 219
    .line 220
    .line 221
    :cond_2
    :try_start_7
    iget-object v4, v1, LY/s;->P:LZ/b;

    .line 222
    .line 223
    iget-object v7, v1, LY/s;->c:LY/y;

    .line 224
    .line 225
    invoke-virtual {v4, v5, v7, v2, v3}, LZ/b;->c(LY/x0;LY/y;LY/y0;LY/y0;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v6}, LY/E1;->F()LY/D1;

    .line 229
    .line 230
    .line 231
    move-result-object v7
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_d

    .line 232
    :try_start_8
    iget-object v11, v1, LY/s;->J:LY/D1;

    .line 233
    .line 234
    iget-object v15, v1, LY/s;->p:[I

    .line 235
    .line 236
    iget-object v4, v1, LY/s;->x:Lt/F;

    .line 237
    .line 238
    const/4 v5, 0x0

    .line 239
    iput-object v5, v1, LY/s;->p:[I

    .line 240
    .line 241
    iput-object v5, v1, LY/s;->x:Lt/F;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_c

    .line 242
    .line 243
    :try_start_9
    iput-object v7, v1, LY/s;->J:LY/D1;

    .line 244
    .line 245
    invoke-virtual {v6, v8}, LY/E1;->d(LY/b;)I

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    invoke-virtual {v7, v5}, LY/D1;->R(I)V

    .line 250
    .line 251
    .line 252
    iget-object v6, v1, LY/s;->P:LZ/b;

    .line 253
    .line 254
    invoke-virtual {v6, v5}, LZ/b;->z(I)V

    .line 255
    .line 256
    .line 257
    new-instance v8, LZ/a;

    .line 258
    .line 259
    invoke-direct {v8}, LZ/a;-><init>()V

    .line 260
    .line 261
    .line 262
    iget-object v5, v1, LY/s;->P:LZ/b;

    .line 263
    .line 264
    invoke-virtual {v5}, LZ/b;->o()LZ/a;

    .line 265
    .line 266
    .line 267
    move-result-object v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_b

    .line 268
    :try_start_a
    invoke-virtual {v5, v8}, LZ/b;->T(LZ/a;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 269
    .line 270
    .line 271
    move-object/from16 v16, v7

    .line 272
    .line 273
    :try_start_b
    iget-object v7, v1, LY/s;->P:LZ/b;

    .line 274
    .line 275
    move/from16 v17, v12

    .line 276
    .line 277
    invoke-virtual {v7}, LZ/b;->p()Z

    .line 278
    .line 279
    .line 280
    move-result v12
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 281
    move/from16 v18, v0

    .line 282
    .line 283
    const/4 v0, 0x0

    .line 284
    :try_start_c
    invoke-virtual {v7, v0}, LZ/b;->U(Z)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2}, LY/y0;->h()V

    .line 288
    .line 289
    .line 290
    move-object v0, v2

    .line 291
    invoke-virtual {v0}, LY/y0;->b()LY/Q;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    invoke-virtual {v3}, LY/y0;->b()LY/Q;

    .line 296
    .line 297
    .line 298
    move-result-object v19

    .line 299
    invoke-virtual/range {v16 .. v16}, LY/D1;->k()I

    .line 300
    .line 301
    .line 302
    move-result v20

    .line 303
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 304
    .line 305
    .line 306
    move-result-object v20

    .line 307
    invoke-virtual {v0}, LY/y0;->d()Ljava/util/List;

    .line 308
    .line 309
    .line 310
    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 311
    move-object/from16 v21, v6

    .line 312
    .line 313
    :try_start_d
    new-instance v6, LY/o;

    .line 314
    .line 315
    invoke-direct {v6, v1, v3}, LY/o;-><init>(LY/s;LY/y0;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 316
    .line 317
    .line 318
    move-object v13, v4

    .line 319
    move-object/from16 v3, v19

    .line 320
    .line 321
    move-object/from16 v4, v20

    .line 322
    .line 323
    move-object/from16 v19, v9

    .line 324
    .line 325
    move-object/from16 v20, v10

    .line 326
    .line 327
    move-object/from16 v10, v21

    .line 328
    .line 329
    move-object v9, v5

    .line 330
    move-object v5, v0

    .line 331
    :try_start_e
    invoke-direct/range {v1 .. v6}, LY/s;->e1(LY/Q;LY/Q;Ljava/lang/Integer;Ljava/util/List;Lie/a;)Ljava/lang/Object;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 332
    .line 333
    .line 334
    :try_start_f
    invoke-virtual {v7, v12}, LZ/b;->U(Z)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 335
    .line 336
    .line 337
    :try_start_10
    invoke-virtual {v9, v10}, LZ/b;->T(LZ/a;)V

    .line 338
    .line 339
    .line 340
    iget-object v0, v1, LY/s;->P:LZ/b;

    .line 341
    .line 342
    invoke-virtual {v0, v8, v14}, LZ/b;->s(LZ/a;Lg0/k;)V

    .line 343
    .line 344
    .line 345
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 346
    .line 347
    :try_start_11
    iput-object v11, v1, LY/s;->J:LY/D1;

    .line 348
    .line 349
    iput-object v15, v1, LY/s;->p:[I

    .line 350
    .line 351
    iput-object v13, v1, LY/s;->x:Lt/F;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    .line 352
    .line 353
    :try_start_12
    invoke-virtual/range {v16 .. v16}, LY/D1;->d()V

    .line 354
    .line 355
    .line 356
    :goto_2
    iget-object v0, v1, LY/s;->P:LZ/b;

    .line 357
    .line 358
    invoke-virtual {v0}, LZ/b;->W()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    .line 359
    .line 360
    .line 361
    add-int/lit8 v12, v17, 0x1

    .line 362
    .line 363
    move/from16 v0, v18

    .line 364
    .line 365
    move-object/from16 v9, v19

    .line 366
    .line 367
    move-object/from16 v10, v20

    .line 368
    .line 369
    const/4 v11, 0x0

    .line 370
    goto/16 :goto_0

    .line 371
    .line 372
    :catchall_2
    move-exception v0

    .line 373
    :goto_3
    move-object/from16 v2, v19

    .line 374
    .line 375
    move-object/from16 v3, v20

    .line 376
    .line 377
    goto/16 :goto_9

    .line 378
    .line 379
    :catchall_3
    move-exception v0

    .line 380
    goto :goto_8

    .line 381
    :catchall_4
    move-exception v0

    .line 382
    goto :goto_7

    .line 383
    :catchall_5
    move-exception v0

    .line 384
    goto :goto_6

    .line 385
    :catchall_6
    move-exception v0

    .line 386
    goto :goto_4

    .line 387
    :catchall_7
    move-exception v0

    .line 388
    move-object v13, v4

    .line 389
    move-object/from16 v19, v9

    .line 390
    .line 391
    move-object/from16 v20, v10

    .line 392
    .line 393
    move-object/from16 v10, v21

    .line 394
    .line 395
    move-object v9, v5

    .line 396
    goto :goto_4

    .line 397
    :catchall_8
    move-exception v0

    .line 398
    move-object v13, v4

    .line 399
    move-object/from16 v19, v9

    .line 400
    .line 401
    move-object/from16 v20, v10

    .line 402
    .line 403
    move-object v9, v5

    .line 404
    move-object v10, v6

    .line 405
    :goto_4
    :try_start_13
    invoke-virtual {v7, v12}, LZ/b;->U(Z)V

    .line 406
    .line 407
    .line 408
    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_5

    .line 409
    :catchall_9
    move-exception v0

    .line 410
    move-object v13, v4

    .line 411
    :goto_5
    move-object/from16 v19, v9

    .line 412
    .line 413
    move-object/from16 v20, v10

    .line 414
    .line 415
    move-object v9, v5

    .line 416
    move-object v10, v6

    .line 417
    goto :goto_6

    .line 418
    :catchall_a
    move-exception v0

    .line 419
    move-object v13, v4

    .line 420
    move-object/from16 v16, v7

    .line 421
    .line 422
    goto :goto_5

    .line 423
    :goto_6
    :try_start_14
    invoke-virtual {v9, v10}, LZ/b;->T(LZ/a;)V

    .line 424
    .line 425
    .line 426
    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    .line 427
    :catchall_b
    move-exception v0

    .line 428
    move-object v13, v4

    .line 429
    move-object/from16 v16, v7

    .line 430
    .line 431
    move-object/from16 v19, v9

    .line 432
    .line 433
    move-object/from16 v20, v10

    .line 434
    .line 435
    :goto_7
    :try_start_15
    iput-object v11, v1, LY/s;->J:LY/D1;

    .line 436
    .line 437
    iput-object v15, v1, LY/s;->p:[I

    .line 438
    .line 439
    iput-object v13, v1, LY/s;->x:Lt/F;

    .line 440
    .line 441
    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_3

    .line 442
    :catchall_c
    move-exception v0

    .line 443
    move-object/from16 v16, v7

    .line 444
    .line 445
    move-object/from16 v19, v9

    .line 446
    .line 447
    move-object/from16 v20, v10

    .line 448
    .line 449
    :goto_8
    :try_start_16
    invoke-virtual/range {v16 .. v16}, LY/D1;->d()V

    .line 450
    .line 451
    .line 452
    throw v0

    .line 453
    :catchall_d
    move-exception v0

    .line 454
    move-object/from16 v19, v9

    .line 455
    .line 456
    move-object/from16 v20, v10

    .line 457
    .line 458
    goto :goto_3

    .line 459
    :cond_3
    move-object/from16 v19, v9

    .line 460
    .line 461
    move-object/from16 v20, v10

    .line 462
    .line 463
    iget-object v0, v1, LY/s;->P:LZ/b;

    .line 464
    .line 465
    invoke-virtual {v0}, LZ/b;->h()V

    .line 466
    .line 467
    .line 468
    iget-object v0, v1, LY/s;->P:LZ/b;

    .line 469
    .line 470
    const/4 v2, 0x0

    .line 471
    invoke-virtual {v0, v2}, LZ/b;->z(I)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_2

    .line 472
    .line 473
    .line 474
    move-object/from16 v2, v19

    .line 475
    .line 476
    move-object/from16 v3, v20

    .line 477
    .line 478
    invoke-virtual {v2, v3}, LZ/b;->T(LZ/a;)V

    .line 479
    .line 480
    .line 481
    return-void

    .line 482
    :goto_9
    invoke-virtual {v2, v3}, LZ/b;->T(LZ/a;)V

    .line 483
    .line 484
    .line 485
    throw v0
.end method

.method private static final P0(LY/s;LZ/a;LY/D1;LY/y0;)LTd/L;
    .locals 8

    .line 1
    iget-object v0, p0, LY/s;->P:LZ/b;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ/b;->o()LZ/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    :try_start_0
    invoke-virtual {v0, p1}, LZ/b;->T(LZ/a;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, LY/s;->J:LY/D1;

    .line 11
    .line 12
    iget-object v2, p0, LY/s;->p:[I

    .line 13
    .line 14
    iget-object v3, p0, LY/s;->x:Lt/F;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    iput-object v4, p0, LY/s;->p:[I

    .line 18
    .line 19
    iput-object v4, p0, LY/s;->x:Lt/F;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    :try_start_1
    iput-object p2, p0, LY/s;->J:LY/D1;

    .line 22
    .line 23
    iget-object p2, p0, LY/s;->P:LZ/b;

    .line 24
    .line 25
    invoke-virtual {p2}, LZ/b;->p()Z

    .line 26
    .line 27
    .line 28
    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 29
    const/4 v6, 0x0

    .line 30
    :try_start_2
    invoke-virtual {p2, v6}, LZ/b;->U(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p3}, LY/y0;->c()LY/w0;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p3}, LY/y0;->e()LY/U0;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-virtual {p3}, LY/y0;->f()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    const/4 v7, 0x1

    .line 45
    invoke-direct {p0, v4, v6, p3, v7}, LY/s;->T0(LY/w0;LY/U0;Ljava/lang/Object;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 46
    .line 47
    .line 48
    :try_start_3
    invoke-virtual {p2, v5}, LZ/b;->U(Z)V

    .line 49
    .line 50
    .line 51
    sget-object p2, LTd/L;->a:LTd/L;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 52
    .line 53
    :try_start_4
    iput-object p1, p0, LY/s;->J:LY/D1;

    .line 54
    .line 55
    iput-object v2, p0, LY/s;->p:[I

    .line 56
    .line 57
    iput-object v3, p0, LY/s;->x:Lt/F;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 58
    .line 59
    invoke-virtual {v0, v1}, LZ/b;->T(LZ/a;)V

    .line 60
    .line 61
    .line 62
    sget-object p0, LTd/L;->a:LTd/L;

    .line 63
    .line 64
    return-object p0

    .line 65
    :catchall_0
    move-exception p0

    .line 66
    goto :goto_1

    .line 67
    :catchall_1
    move-exception p2

    .line 68
    goto :goto_0

    .line 69
    :catchall_2
    move-exception p3

    .line 70
    :try_start_5
    invoke-virtual {p2, v5}, LZ/b;->U(Z)V

    .line 71
    .line 72
    .line 73
    throw p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 74
    :goto_0
    :try_start_6
    iput-object p1, p0, LY/s;->J:LY/D1;

    .line 75
    .line 76
    iput-object v2, p0, LY/s;->p:[I

    .line 77
    .line 78
    iput-object v3, p0, LY/s;->x:Lt/F;

    .line 79
    .line 80
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 81
    :goto_1
    invoke-virtual {v0, v1}, LZ/b;->T(LZ/a;)V

    .line 82
    .line 83
    .line 84
    throw p0
.end method

.method private static final Q0(LY/s;LY/y0;)LTd/L;
    .locals 3

    .line 1
    invoke-virtual {p1}, LY/y0;->c()LY/w0;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, LY/y0;->e()LY/U0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1}, LY/y0;->f()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {p0, v2, v0, p1, v1}, LY/s;->T0(LY/w0;LY/U0;Ljava/lang/Object;Z)V

    .line 15
    .line 16
    .line 17
    sget-object p0, LTd/L;->a:LTd/L;

    .line 18
    .line 19
    return-object p0
.end method

.method private final S0(I)I
    .locals 0

    .line 1
    rsub-int/lit8 p1, p1, -0x2

    .line 2
    .line 3
    return p1
.end method

.method private final T0(LY/w0;LY/U0;Ljava/lang/Object;Z)V
    .locals 12

    .line 1
    const v0, 0x78cc281

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0, p1}, LY/s;->H(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p3}, LY/s;->H1(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LY/s;->o()J

    .line 11
    .line 12
    .line 13
    move-result-wide v9

    .line 14
    int-to-long v0, v0

    .line 15
    const/4 v11, 0x0

    .line 16
    :try_start_0
    iput-wide v0, p0, LY/s;->W:J

    .line 17
    .line 18
    invoke-virtual {p0}, LY/s;->e()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    const/4 v3, 0x1

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, LY/s;->L:LY/H1;

    .line 27
    .line 28
    invoke-static {v0, v1, v3, v11}, LY/H1;->r0(LY/H1;IILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    move-object p1, v0

    .line 34
    goto/16 :goto_3

    .line 35
    .line 36
    :cond_0
    :goto_0
    invoke-virtual {p0}, LY/s;->e()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 44
    .line 45
    invoke-virtual {v0}, LY/D1;->l()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    move v1, v3

    .line 56
    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-direct {p0, p2}, LY/s;->j1(LY/U0;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    invoke-static {}, LY/w;->C()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sget-object v4, LY/g0;->a:LY/g0$a;

    .line 66
    .line 67
    invoke-virtual {v4}, LY/g0$a;->a()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    const/16 v5, 0xca

    .line 72
    .line 73
    invoke-direct {p0, v5, v0, v4, p2}, LY/s;->v1(ILjava/lang/Object;ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iput-object v11, p0, LY/s;->N:LY/U0;

    .line 77
    .line 78
    invoke-virtual {p0}, LY/s;->e()Z

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    if-eqz p2, :cond_4

    .line 83
    .line 84
    if-nez p4, :cond_4

    .line 85
    .line 86
    iput-boolean v3, p0, LY/s;->M:Z

    .line 87
    .line 88
    iget-object p2, p0, LY/s;->L:LY/H1;

    .line 89
    .line 90
    invoke-virtual {p2}, LY/H1;->a0()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-virtual {p2, v0}, LY/H1;->C0(I)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-virtual {p2, v0}, LY/H1;->B(I)LY/b;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    new-instance v0, LY/y0;

    .line 103
    .line 104
    invoke-virtual {p0}, LY/s;->H0()LY/B;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    iget-object v4, p0, LY/s;->K:LY/E1;

    .line 109
    .line 110
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-direct {p0}, LY/s;->n0()LY/U0;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    const/4 v8, 0x0

    .line 119
    move-object v1, p1

    .line 120
    move-object v2, p3

    .line 121
    invoke-direct/range {v0 .. v8}, LY/y0;-><init>(LY/w0;Ljava/lang/Object;LY/Q;LY/E1;LY/b;Ljava/util/List;LY/U0;Ljava/util/List;)V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, LY/s;->c:LY/y;

    .line 125
    .line 126
    invoke-virtual {p1, v0}, LY/y;->l(LY/y0;)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_4
    iget-boolean v0, p0, LY/s;->y:Z

    .line 131
    .line 132
    iput-boolean v1, p0, LY/s;->y:Z

    .line 133
    .line 134
    new-instance v1, LY/s$d;

    .line 135
    .line 136
    invoke-direct {v1, p1, p3}, LY/s$d;-><init>(LY/w0;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    const p1, 0x12d6006f

    .line 140
    .line 141
    .line 142
    invoke-static {p1, v3, v1}, Lg0/i;->b(IZLjava/lang/Object;)Lg0/b;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-static {p0, p1}, Lg0/j;->a(LY/m;Lkotlin/jvm/functions/Function2;)V

    .line 147
    .line 148
    .line 149
    iput-boolean v0, p0, LY/s;->y:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    .line 151
    :goto_2
    invoke-direct {p0}, LY/s;->w0()V

    .line 152
    .line 153
    .line 154
    iput-object v11, p0, LY/s;->N:LY/U0;

    .line 155
    .line 156
    iput-wide v9, p0, LY/s;->W:J

    .line 157
    .line 158
    invoke-virtual {p0}, LY/s;->S()V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :goto_3
    :try_start_1
    new-instance p2, LY/r;

    .line 163
    .line 164
    invoke-direct {p2, p0}, LY/r;-><init>(LY/s;)V

    .line 165
    .line 166
    .line 167
    invoke-static {p1, p2}, Lk0/d;->b(Ljava/lang/Throwable;Lie/a;)Ljava/lang/Throwable;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 172
    :catchall_1
    move-exception v0

    .line 173
    move-object p1, v0

    .line 174
    invoke-direct {p0}, LY/s;->w0()V

    .line 175
    .line 176
    .line 177
    iput-object v11, p0, LY/s;->N:LY/U0;

    .line 178
    .line 179
    iput-wide v9, p0, LY/s;->W:J

    .line 180
    .line 181
    invoke-virtual {p0}, LY/s;->S()V

    .line 182
    .line 183
    .line 184
    throw p1
.end method

.method private static final U0(LY/s;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-direct {p0}, LY/s;->p0()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic W(LY/s;LY/y0;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY/s;->Q0(LY/s;LY/y0;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic X(LY/s;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, LY/s;->t0(LY/s;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic Y(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY/s;->t1(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final Y0(LY/D1;I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, LY/D1;->M(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public static synthetic Z(LY/s;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, LY/s;->U0(LY/s;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final Z0(IIII)I
    .locals 2

    .line 1
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, LY/D1;->Q(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    :goto_0
    if-eq v0, p3, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, LY/s;->J:LY/D1;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, LY/D1;->K(I)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, LY/s;->J:LY/D1;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, LY/D1;->Q(I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p3, p0, LY/s;->J:LY/D1;

    .line 25
    .line 26
    invoke-virtual {p3, v0}, LY/D1;->K(I)Z

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    if-eqz p3, :cond_1

    .line 31
    .line 32
    const/4 p4, 0x0

    .line 33
    :cond_1
    if-ne v0, p2, :cond_2

    .line 34
    .line 35
    return p4

    .line 36
    :cond_2
    invoke-direct {p0, v0}, LY/s;->J1(I)I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    iget-object v1, p0, LY/s;->J:LY/D1;

    .line 41
    .line 42
    invoke-virtual {v1, p2}, LY/D1;->O(I)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    sub-int/2addr p3, p2

    .line 47
    add-int/2addr p3, p4

    .line 48
    :cond_3
    if-ge p4, p3, :cond_5

    .line 49
    .line 50
    if-eq v0, p1, :cond_5

    .line 51
    .line 52
    add-int/lit8 v0, v0, 0x1

    .line 53
    .line 54
    :goto_1
    if-ge v0, p1, :cond_5

    .line 55
    .line 56
    iget-object p2, p0, LY/s;->J:LY/D1;

    .line 57
    .line 58
    invoke-virtual {p2, v0}, LY/D1;->F(I)I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    add-int/2addr p2, v0

    .line 63
    if-lt p1, p2, :cond_3

    .line 64
    .line 65
    iget-object v1, p0, LY/s;->J:LY/D1;

    .line 66
    .line 67
    invoke-virtual {v1, v0}, LY/D1;->K(I)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    const/4 v0, 0x1

    .line 74
    goto :goto_2

    .line 75
    :cond_4
    invoke-direct {p0, v0}, LY/s;->J1(I)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    :goto_2
    add-int/2addr p4, v0

    .line 80
    move v0, p2

    .line 81
    goto :goto_1

    .line 82
    :cond_5
    return p4
.end method

.method public static synthetic a0(LY/s;LZ/a;LY/D1;LY/y0;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LY/s;->P0(LY/s;LZ/a;LY/D1;LY/y0;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final b0()V
    .locals 3

    .line 1
    invoke-direct {p0}, LY/s;->i0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LY/s;->j:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-static {v0}, LY/g2;->a(Ljava/util/ArrayList;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LY/s;->o:LY/i0;

    .line 10
    .line 11
    invoke-virtual {v0}, LY/i0;->a()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LY/s;->v:LY/i0;

    .line 15
    .line 16
    invoke-virtual {v0}, LY/i0;->a()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, LY/s;->z:LY/i0;

    .line 20
    .line 21
    invoke-virtual {v0}, LY/i0;->a()V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, LY/s;->x:Lt/F;

    .line 26
    .line 27
    iget-object v0, p0, LY/s;->R:LZ/c;

    .line 28
    .line 29
    invoke-virtual {v0}, LZ/c;->a()V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    int-to-long v1, v0

    .line 34
    iput-wide v1, p0, LY/s;->W:J

    .line 35
    .line 36
    iput v0, p0, LY/s;->C:I

    .line 37
    .line 38
    iput-boolean v0, p0, LY/s;->t:Z

    .line 39
    .line 40
    iput-boolean v0, p0, LY/s;->V:Z

    .line 41
    .line 42
    iput-boolean v0, p0, LY/s;->A:Z

    .line 43
    .line 44
    iput-boolean v0, p0, LY/s;->H:Z

    .line 45
    .line 46
    iput-boolean v0, p0, LY/s;->s:Z

    .line 47
    .line 48
    const/4 v0, -0x1

    .line 49
    iput v0, p0, LY/s;->B:I

    .line 50
    .line 51
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 52
    .line 53
    invoke-virtual {v0}, LY/D1;->i()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_0

    .line 58
    .line 59
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 60
    .line 61
    invoke-virtual {v0}, LY/D1;->d()V

    .line 62
    .line 63
    .line 64
    :cond_0
    iget-object v0, p0, LY/s;->L:LY/H1;

    .line 65
    .line 66
    invoke-virtual {v0}, LY/H1;->Y()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_1

    .line 71
    .line 72
    invoke-direct {p0}, LY/s;->F0()V

    .line 73
    .line 74
    .line 75
    :cond_1
    return-void
.end method

.method public static final synthetic c0(LY/s;)I
    .locals 0

    .line 1
    iget p0, p0, LY/s;->C:I

    .line 2
    .line 3
    return p0
.end method

.method private final c1(I)I
    .locals 3

    .line 1
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LY/D1;->Q(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v0, p1, :cond_1

    .line 11
    .line 12
    iget-object v2, p0, LY/s;->J:LY/D1;

    .line 13
    .line 14
    invoke-virtual {v2, v0}, LY/D1;->H(I)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    :cond_0
    iget-object v2, p0, LY/s;->J:LY/D1;

    .line 23
    .line 24
    invoke-virtual {v2, v0}, LY/D1;->F(I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v0, v2

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return v1
.end method

.method public static final synthetic d0(LY/s;)LY/y;
    .locals 0

    .line 1
    iget-object p0, p0, LY/s;->c:LY/y;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e0(LY/s;)LY/E1;
    .locals 0

    .line 1
    iget-object p0, p0, LY/s;->d:LY/E1;

    .line 2
    .line 3
    return-object p0
.end method

.method private final e1(LY/Q;LY/Q;Ljava/lang/Integer;Ljava/util/List;Lie/a;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-boolean v0, p0, LY/s;->H:Z

    .line 2
    .line 3
    iget v1, p0, LY/s;->l:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    :try_start_0
    iput-boolean v2, p0, LY/s;->H:Z

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iput v2, p0, LY/s;->l:I

    .line 10
    .line 11
    invoke-interface {p4}, Ljava/util/Collection;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    :goto_0
    if-ge v2, v3, :cond_1

    .line 16
    .line 17
    invoke-interface {p4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    check-cast v4, Lkotlin/Pair;

    .line 22
    .line 23
    invoke-virtual {v4}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    check-cast v5, LY/f1;

    .line 28
    .line 29
    invoke-virtual {v4}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0, v5, v4}, LY/s;->B1(LY/f1;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    goto :goto_3

    .line 41
    :cond_0
    const/4 v4, 0x0

    .line 42
    invoke-virtual {p0, v5, v4}, LY/s;->B1(LY/f1;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    if-eqz p1, :cond_3

    .line 49
    .line 50
    if-eqz p3, :cond_2

    .line 51
    .line 52
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/4 p3, -0x1

    .line 58
    :goto_2
    invoke-interface {p1, p2, p3, p5}, LY/Q;->m(LY/Q;ILie/a;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-nez p1, :cond_4

    .line 63
    .line 64
    :cond_3
    invoke-interface {p5}, Lie/a;->invoke()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    :cond_4
    iput-boolean v0, p0, LY/s;->H:Z

    .line 69
    .line 70
    iput v1, p0, LY/s;->l:I

    .line 71
    .line 72
    return-object p1

    .line 73
    :goto_3
    iput-boolean v0, p0, LY/s;->H:Z

    .line 74
    .line 75
    iput v1, p0, LY/s;->l:I

    .line 76
    .line 77
    throw p1
.end method

.method public static final synthetic f0(LY/s;I)V
    .locals 0

    .line 1
    iput p1, p0, LY/s;->C:I

    .line 2
    .line 3
    return-void
.end method

.method static synthetic f1(LY/s;LY/Q;LY/Q;Ljava/lang/Integer;Ljava/util/List;Lie/a;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p7, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    and-int/lit8 p7, p6, 0x4

    .line 13
    .line 14
    if-eqz p7, :cond_2

    .line 15
    .line 16
    move-object p3, v0

    .line 17
    :cond_2
    and-int/lit8 p6, p6, 0x8

    .line 18
    .line 19
    if-eqz p6, :cond_3

    .line 20
    .line 21
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p4

    .line 25
    :cond_3
    invoke-direct/range {p0 .. p5}, LY/s;->e1(LY/Q;LY/Q;Ljava/lang/Integer;Ljava/util/List;Lie/a;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method private final g0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LY/s;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, LY/f1;

    .line 10
    .line 11
    invoke-virtual {p0}, LY/s;->H0()LY/B;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v2}, LY/f1;-><init>(LY/h1;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, LY/s;->G:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {v1, v0}, LY/g2;->j(Ljava/util/ArrayList;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, LY/s;->I1(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0}, LY/s;->B0(LY/f1;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    iget-object v0, p0, LY/s;->u:Ljava/util/List;

    .line 34
    .line 35
    iget-object v2, p0, LY/s;->J:LY/D1;

    .line 36
    .line 37
    invoke-virtual {v2}, LY/D1;->u()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-static {v0, v2}, LY/w;->n(Ljava/util/List;I)LY/k0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v2, p0, LY/s;->J:LY/D1;

    .line 46
    .line 47
    invoke-virtual {v2}, LY/D1;->L()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    sget-object v3, LY/m;->a:LY/m$a;

    .line 52
    .line 53
    invoke-virtual {v3}, LY/m$a;->a()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    new-instance v2, LY/f1;

    .line 64
    .line 65
    invoke-virtual {p0}, LY/s;->H0()LY/B;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-direct {v2, v3}, LY/f1;-><init>(LY/h1;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v2}, LY/s;->I1(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"

    .line 80
    .line 81
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    check-cast v2, LY/f1;

    .line 85
    .line 86
    :goto_0
    const/4 v1, 0x0

    .line 87
    const/4 v3, 0x1

    .line 88
    if-nez v0, :cond_4

    .line 89
    .line 90
    invoke-virtual {v2}, LY/f1;->l()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_2

    .line 95
    .line 96
    invoke-virtual {v2, v1}, LY/f1;->G(Z)V

    .line 97
    .line 98
    .line 99
    :cond_2
    if-eqz v0, :cond_3

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    move v0, v1

    .line 103
    goto :goto_2

    .line 104
    :cond_4
    :goto_1
    move v0, v3

    .line 105
    :goto_2
    invoke-virtual {v2, v0}, LY/f1;->I(Z)V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, LY/s;->G:Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-static {v0, v2}, LY/g2;->j(Ljava/util/ArrayList;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    invoke-direct {p0, v2}, LY/s;->B0(LY/f1;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, LY/f1;->m()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_5

    .line 121
    .line 122
    invoke-virtual {v2, v1}, LY/f1;->H(Z)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v3}, LY/f1;->L(Z)V

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, LY/s;->P:LZ/b;

    .line 129
    .line 130
    invoke-virtual {v0, v2}, LZ/b;->X(LY/f1;)V

    .line 131
    .line 132
    .line 133
    iget-boolean v0, p0, LY/s;->A:Z

    .line 134
    .line 135
    if-nez v0, :cond_5

    .line 136
    .line 137
    invoke-virtual {v2}, LY/f1;->r()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_5

    .line 142
    .line 143
    iput-boolean v3, p0, LY/s;->A:Z

    .line 144
    .line 145
    invoke-virtual {v2, v3}, LY/f1;->K(Z)V

    .line 146
    .line 147
    .line 148
    :cond_5
    return-void
.end method

.method private final g1()V
    .locals 15

    .line 1
    iget-boolean v0, p0, LY/s;->H:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, LY/s;->H:Z

    .line 5
    .line 6
    iget-object v2, p0, LY/s;->J:LY/D1;

    .line 7
    .line 8
    invoke-virtual {v2}, LY/D1;->u()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    iget-object v3, p0, LY/s;->J:LY/D1;

    .line 13
    .line 14
    invoke-virtual {v3, v2}, LY/D1;->F(I)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    add-int/2addr v3, v2

    .line 19
    iget v4, p0, LY/s;->l:I

    .line 20
    .line 21
    invoke-virtual {p0}, LY/s;->o()J

    .line 22
    .line 23
    .line 24
    move-result-wide v5

    .line 25
    iget v7, p0, LY/s;->m:I

    .line 26
    .line 27
    iget v8, p0, LY/s;->n:I

    .line 28
    .line 29
    iget-object v9, p0, LY/s;->u:Ljava/util/List;

    .line 30
    .line 31
    iget-object v10, p0, LY/s;->J:LY/D1;

    .line 32
    .line 33
    invoke-virtual {v10}, LY/D1;->k()I

    .line 34
    .line 35
    .line 36
    move-result v10

    .line 37
    invoke-static {v9, v10, v3}, LY/w;->h(Ljava/util/List;II)LY/k0;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    const/4 v10, 0x0

    .line 42
    move v11, v2

    .line 43
    :goto_0
    if-eqz v9, :cond_1

    .line 44
    .line 45
    invoke-virtual {v9}, LY/k0;->b()I

    .line 46
    .line 47
    .line 48
    move-result v12

    .line 49
    invoke-virtual {v9}, LY/k0;->c()LY/f1;

    .line 50
    .line 51
    .line 52
    move-result-object v13

    .line 53
    iget-object v14, p0, LY/s;->u:Ljava/util/List;

    .line 54
    .line 55
    invoke-static {v14, v12}, LY/w;->n(Ljava/util/List;I)LY/k0;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v9}, LY/k0;->d()Z

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    if-eqz v9, :cond_0

    .line 63
    .line 64
    iget-object v9, p0, LY/s;->J:LY/D1;

    .line 65
    .line 66
    invoke-virtual {v9, v12}, LY/D1;->R(I)V

    .line 67
    .line 68
    .line 69
    iget-object v9, p0, LY/s;->J:LY/D1;

    .line 70
    .line 71
    invoke-virtual {v9}, LY/D1;->k()I

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    invoke-direct {p0, v11, v9, v2}, LY/s;->k1(III)V

    .line 76
    .line 77
    .line 78
    invoke-direct {p0, v12, v9, v2, v4}, LY/s;->Z0(IIII)I

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    iput v10, p0, LY/s;->l:I

    .line 83
    .line 84
    invoke-direct {p0, v9}, LY/s;->c1(I)I

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    iput v10, p0, LY/s;->n:I

    .line 89
    .line 90
    iget-object v10, p0, LY/s;->J:LY/D1;

    .line 91
    .line 92
    invoke-virtual {v10, v9}, LY/D1;->Q(I)I

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    invoke-direct {p0, v10, v2, v5, v6}, LY/s;->l0(IIJ)J

    .line 97
    .line 98
    .line 99
    move-result-wide v10

    .line 100
    iput-wide v10, p0, LY/s;->W:J

    .line 101
    .line 102
    const/4 v10, 0x0

    .line 103
    iput-object v10, p0, LY/s;->N:LY/U0;

    .line 104
    .line 105
    invoke-virtual {v13, p0}, LY/f1;->e(LY/m;)V

    .line 106
    .line 107
    .line 108
    iput-object v10, p0, LY/s;->N:LY/U0;

    .line 109
    .line 110
    iget-object v10, p0, LY/s;->J:LY/D1;

    .line 111
    .line 112
    invoke-virtual {v10, v2}, LY/D1;->S(I)V

    .line 113
    .line 114
    .line 115
    move v10, v1

    .line 116
    move v11, v9

    .line 117
    goto :goto_1

    .line 118
    :cond_0
    iget-object v9, p0, LY/s;->G:Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-static {v9, v13}, LY/g2;->j(Ljava/util/ArrayList;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    iget-object v9, p0, LY/s;->h:LY/K;

    .line 124
    .line 125
    invoke-virtual {v9}, LY/K;->a()Lk0/l;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v13}, LY/f1;->B()V

    .line 129
    .line 130
    .line 131
    iget-object v9, p0, LY/s;->G:Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-static {v9}, LY/g2;->i(Ljava/util/ArrayList;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    :goto_1
    iget-object v9, p0, LY/s;->u:Ljava/util/List;

    .line 137
    .line 138
    iget-object v12, p0, LY/s;->J:LY/D1;

    .line 139
    .line 140
    invoke-virtual {v12}, LY/D1;->k()I

    .line 141
    .line 142
    .line 143
    move-result v12

    .line 144
    invoke-static {v9, v12, v3}, LY/w;->h(Ljava/util/List;II)LY/k0;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    goto :goto_0

    .line 149
    :cond_1
    if-eqz v10, :cond_2

    .line 150
    .line 151
    invoke-direct {p0, v11, v2, v2}, LY/s;->k1(III)V

    .line 152
    .line 153
    .line 154
    iget-object v1, p0, LY/s;->J:LY/D1;

    .line 155
    .line 156
    invoke-virtual {v1}, LY/D1;->U()V

    .line 157
    .line 158
    .line 159
    invoke-direct {p0, v2}, LY/s;->J1(I)I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    add-int/2addr v4, v1

    .line 164
    iput v4, p0, LY/s;->l:I

    .line 165
    .line 166
    add-int/2addr v7, v1

    .line 167
    iput v7, p0, LY/s;->m:I

    .line 168
    .line 169
    iput v8, p0, LY/s;->n:I

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_2
    invoke-direct {p0}, LY/s;->r1()V

    .line 173
    .line 174
    .line 175
    :goto_2
    iput-wide v5, p0, LY/s;->W:J

    .line 176
    .line 177
    iput-boolean v0, p0, LY/s;->H:Z

    .line 178
    .line 179
    return-void
.end method

.method private final h1()V
    .locals 1

    .line 1
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/D1;->k()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-direct {p0, v0}, LY/s;->n1(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LY/s;->P:LZ/b;

    .line 11
    .line 12
    invoke-virtual {v0}, LZ/b;->P()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private final i0()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LY/s;->k:LY/T0;

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, LY/s;->l:I

    .line 6
    .line 7
    iput v0, p0, LY/s;->m:I

    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    iput-wide v1, p0, LY/s;->W:J

    .line 12
    .line 13
    iput-boolean v0, p0, LY/s;->t:Z

    .line 14
    .line 15
    iget-object v0, p0, LY/s;->P:LZ/b;

    .line 16
    .line 17
    invoke-virtual {v0}, LZ/b;->S()V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, LY/s;->G:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-static {v0}, LY/g2;->a(Ljava/util/ArrayList;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, LY/s;->j0()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private final i1(LY/b;)V
    .locals 3

    .line 1
    iget-object v0, p0, LY/s;->R:LZ/c;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ/c;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LY/s;->P:LZ/b;

    .line 10
    .line 11
    iget-object v1, p0, LY/s;->K:LY/E1;

    .line 12
    .line 13
    invoke-virtual {v0, p1, v1}, LZ/b;->t(LY/b;LY/E1;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, p0, LY/s;->P:LZ/b;

    .line 18
    .line 19
    iget-object v1, p0, LY/s;->K:LY/E1;

    .line 20
    .line 21
    iget-object v2, p0, LY/s;->R:LZ/c;

    .line 22
    .line 23
    invoke-virtual {v0, p1, v1, v2}, LZ/b;->u(LY/b;LY/E1;LZ/c;)V

    .line 24
    .line 25
    .line 26
    new-instance p1, LZ/c;

    .line 27
    .line 28
    invoke-direct {p1}, LZ/c;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, LY/s;->R:LZ/c;

    .line 32
    .line 33
    return-void
.end method

.method private final j0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LY/s;->p:[I

    .line 3
    .line 4
    iput-object v0, p0, LY/s;->q:Lt/D;

    .line 5
    .line 6
    return-void
.end method

.method private final j1(LY/U0;)V
    .locals 4

    .line 1
    iget-object v0, p0, LY/s;->x:Lt/F;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lt/F;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v0, v3, v1, v2}, Lt/F;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, LY/s;->x:Lt/F;

    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, LY/s;->J:LY/D1;

    .line 16
    .line 17
    invoke-virtual {v1}, LY/D1;->k()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {v0, v1, p1}, Lt/F;->s(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private final k1(III)V
    .locals 2

    .line 1
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3}, LY/w;->m(LY/D1;III)I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    :goto_0
    if-lez p1, :cond_1

    .line 8
    .line 9
    if-eq p1, p3, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, p1}, LY/D1;->K(I)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, LY/s;->P:LZ/b;

    .line 18
    .line 19
    invoke-virtual {v1}, LZ/b;->A()V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {v0, p1}, LY/D1;->Q(I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-direct {p0, p2, p3}, LY/s;->u0(II)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private final l0(IIJ)J
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    int-to-long v1, v0

    .line 3
    const/4 v3, 0x3

    .line 4
    move v4, v0

    .line 5
    :goto_0
    if-ltz p1, :cond_3

    .line 6
    .line 7
    if-ne p1, p2, :cond_0

    .line 8
    .line 9
    invoke-static {p3, p4, v4}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    :goto_1
    xor-long/2addr p1, v1

    .line 14
    return-wide p1

    .line 15
    :cond_0
    iget-object v5, p0, LY/s;->J:LY/D1;

    .line 16
    .line 17
    invoke-direct {p0, v5, p1}, LY/s;->N0(LY/D1;I)I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    const v6, 0x78cc281

    .line 22
    .line 23
    .line 24
    if-ne v5, v6, :cond_1

    .line 25
    .line 26
    int-to-long p1, v5

    .line 27
    invoke-static {p1, p2, v4}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    iget-object v6, p0, LY/s;->J:LY/D1;

    .line 33
    .line 34
    invoke-virtual {v6, p1}, LY/D1;->H(I)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_2

    .line 39
    .line 40
    move v6, v0

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    invoke-direct {p0, p1}, LY/s;->c1(I)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    :goto_2
    int-to-long v7, v5

    .line 47
    invoke-static {v7, v8, v3}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 48
    .line 49
    .line 50
    move-result-wide v7

    .line 51
    xor-long/2addr v1, v7

    .line 52
    int-to-long v5, v6

    .line 53
    invoke-static {v5, v6, v4}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 54
    .line 55
    .line 56
    move-result-wide v5

    .line 57
    xor-long/2addr v1, v5

    .line 58
    add-int/lit8 v3, v3, 0x6

    .line 59
    .line 60
    rem-int/lit8 v3, v3, 0x40

    .line 61
    .line 62
    add-int/lit8 v4, v4, 0x6

    .line 63
    .line 64
    rem-int/lit8 v4, v4, 0x40

    .line 65
    .line 66
    iget-object v5, p0, LY/s;->J:LY/D1;

    .line 67
    .line 68
    invoke-virtual {v5, p1}, LY/D1;->Q(I)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    goto :goto_0

    .line 73
    :cond_3
    return-wide v1
.end method

.method private final l1()LY/b;
    .locals 4

    .line 1
    invoke-virtual {p0}, LY/s;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v0, p0, LY/s;->L:LY/H1;

    .line 9
    .line 10
    invoke-static {v0}, LY/w;->K(LY/H1;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, LY/s;->L:LY/H1;

    .line 17
    .line 18
    invoke-virtual {v0}, LY/H1;->Z()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    add-int/lit8 v0, v0, -0x1

    .line 23
    .line 24
    iget-object v1, p0, LY/s;->L:LY/H1;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, LY/H1;->C0(I)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    :goto_0
    move v3, v1

    .line 31
    move v1, v0

    .line 32
    move v0, v3

    .line 33
    iget-object v2, p0, LY/s;->L:LY/H1;

    .line 34
    .line 35
    invoke-virtual {v2}, LY/H1;->a0()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eq v0, v2, :cond_0

    .line 40
    .line 41
    if-ltz v0, :cond_0

    .line 42
    .line 43
    iget-object v1, p0, LY/s;->L:LY/H1;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, LY/H1;->C0(I)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object v0, p0, LY/s;->L:LY/H1;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, LY/H1;->B(I)LY/b;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0

    .line 57
    :cond_1
    return-object v1

    .line 58
    :cond_2
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 59
    .line 60
    invoke-static {v0}, LY/w;->J(LY/D1;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 67
    .line 68
    invoke-virtual {v0}, LY/D1;->k()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    add-int/lit8 v0, v0, -0x1

    .line 73
    .line 74
    iget-object v1, p0, LY/s;->J:LY/D1;

    .line 75
    .line 76
    invoke-virtual {v1, v0}, LY/D1;->Q(I)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    :goto_1
    move v3, v1

    .line 81
    move v1, v0

    .line 82
    move v0, v3

    .line 83
    iget-object v2, p0, LY/s;->J:LY/D1;

    .line 84
    .line 85
    invoke-virtual {v2}, LY/D1;->u()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eq v0, v2, :cond_3

    .line 90
    .line 91
    if-ltz v0, :cond_3

    .line 92
    .line 93
    iget-object v1, p0, LY/s;->J:LY/D1;

    .line 94
    .line 95
    invoke-virtual {v1, v0}, LY/D1;->Q(I)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    goto :goto_1

    .line 100
    :cond_3
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, LY/D1;->a(I)LY/b;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    return-object v0

    .line 107
    :cond_4
    return-object v1
.end method

.method private final m0()V
    .locals 1

    .line 1
    iget-object v0, p0, LY/s;->L:LY/H1;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/H1;->Y()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "Check failed"

    .line 10
    .line 11
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-direct {p0}, LY/s;->F0()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private final m1()V
    .locals 4

    .line 1
    iget-object v0, p0, LY/s;->d:LY/E1;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/E1;->n()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, LY/s;->H0()LY/B;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, LY/B;->Y()V

    .line 14
    .line 15
    .line 16
    new-instance v0, LZ/a;

    .line 17
    .line 18
    invoke-direct {v0}, LZ/a;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, LY/s;->O:LZ/a;

    .line 22
    .line 23
    iget-object v1, p0, LY/s;->d:LY/E1;

    .line 24
    .line 25
    invoke-virtual {v1}, LY/E1;->F()LY/D1;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :try_start_0
    iput-object v1, p0, LY/s;->J:LY/D1;

    .line 30
    .line 31
    iget-object v2, p0, LY/s;->P:LZ/b;

    .line 32
    .line 33
    invoke-virtual {v2}, LZ/b;->o()LZ/a;

    .line 34
    .line 35
    .line 36
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    :try_start_1
    invoke-virtual {v2, v0}, LZ/b;->T(LZ/a;)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    invoke-direct {p0, v0}, LY/s;->n1(I)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, LY/s;->P:LZ/b;

    .line 45
    .line 46
    invoke-virtual {v0}, LZ/b;->M()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 47
    .line 48
    .line 49
    :try_start_2
    invoke-virtual {v2, v3}, LZ/b;->T(LZ/a;)V

    .line 50
    .line 51
    .line 52
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 53
    .line 54
    invoke-virtual {v1}, LY/D1;->d()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    goto :goto_0

    .line 60
    :catchall_1
    move-exception v0

    .line 61
    :try_start_3
    invoke-virtual {v2, v3}, LZ/b;->T(LZ/a;)V

    .line 62
    .line 63
    .line 64
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 65
    :goto_0
    invoke-virtual {v1}, LY/D1;->d()V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_0
    return-void
.end method

.method private final n0()LY/U0;
    .locals 1

    .line 1
    iget-object v0, p0, LY/s;->N:LY/U0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 7
    .line 8
    invoke-virtual {v0}, LY/D1;->u()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-direct {p0, v0}, LY/s;->o0(I)LY/U0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method private final n1(I)V
    .locals 3

    .line 1
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LY/D1;->K(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, LY/s;->P:LZ/b;

    .line 10
    .line 11
    invoke-virtual {v1}, LZ/b;->i()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, LY/s;->P:LZ/b;

    .line 15
    .line 16
    iget-object v2, p0, LY/s;->J:LY/D1;

    .line 17
    .line 18
    invoke-virtual {v2, p1}, LY/D1;->M(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v1, v2}, LZ/b;->w(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    invoke-static {p0, p1, p1, v0, v1}, LY/s;->o1(LY/s;IIZI)I

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, LY/s;->P:LZ/b;

    .line 30
    .line 31
    invoke-virtual {p1}, LZ/b;->i()V

    .line 32
    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-object p1, p0, LY/s;->P:LZ/b;

    .line 37
    .line 38
    invoke-virtual {p1}, LZ/b;->A()V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method private final o0(I)LY/U0;
    .locals 5

    .line 1
    invoke-virtual {p0}, LY/s;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"

    .line 6
    .line 7
    const/16 v2, 0xca

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, LY/s;->M:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, LY/s;->L:LY/H1;

    .line 16
    .line 17
    invoke-virtual {v0}, LY/H1;->a0()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :goto_0
    if-lez v0, :cond_1

    .line 22
    .line 23
    iget-object v3, p0, LY/s;->L:LY/H1;

    .line 24
    .line 25
    invoke-virtual {v3, v0}, LY/H1;->f0(I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-ne v3, v2, :cond_0

    .line 30
    .line 31
    iget-object v3, p0, LY/s;->L:LY/H1;

    .line 32
    .line 33
    invoke-virtual {v3, v0}, LY/H1;->g0(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-static {}, LY/w;->C()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    iget-object p1, p0, LY/s;->L:LY/H1;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, LY/H1;->d0(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    check-cast p1, LY/U0;

    .line 57
    .line 58
    iput-object p1, p0, LY/s;->N:LY/U0;

    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_0
    iget-object v3, p0, LY/s;->L:LY/H1;

    .line 62
    .line 63
    invoke-virtual {v3, v0}, LY/H1;->C0(I)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 69
    .line 70
    invoke-virtual {v0}, LY/D1;->x()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-lez v0, :cond_5

    .line 75
    .line 76
    :goto_1
    if-lez p1, :cond_5

    .line 77
    .line 78
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 79
    .line 80
    invoke-virtual {v0, p1}, LY/D1;->D(I)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-ne v0, v2, :cond_4

    .line 85
    .line 86
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 87
    .line 88
    invoke-virtual {v0, p1}, LY/D1;->E(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {}, LY/w;->C()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    iget-object v0, p0, LY/s;->x:Lt/F;

    .line 103
    .line 104
    if-eqz v0, :cond_2

    .line 105
    .line 106
    invoke-virtual {v0, p1}, Lt/o;->c(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, LY/U0;

    .line 111
    .line 112
    if-nez v0, :cond_3

    .line 113
    .line 114
    :cond_2
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 115
    .line 116
    invoke-virtual {v0, p1}, LY/D1;->A(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    move-object v0, p1

    .line 124
    check-cast v0, LY/U0;

    .line 125
    .line 126
    :cond_3
    iput-object v0, p0, LY/s;->N:LY/U0;

    .line 127
    .line 128
    return-object v0

    .line 129
    :cond_4
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 130
    .line 131
    invoke-virtual {v0, p1}, LY/D1;->Q(I)I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    goto :goto_1

    .line 136
    :cond_5
    iget-object p1, p0, LY/s;->w:LY/U0;

    .line 137
    .line 138
    iput-object p1, p0, LY/s;->N:LY/U0;

    .line 139
    .line 140
    return-object p1
.end method

.method private static final o1(LY/s;IIZI)I
    .locals 9

    .line 1
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, LY/D1;->G(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_4

    .line 10
    .line 11
    invoke-virtual {v0, p2}, LY/D1;->D(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {v0, p2}, LY/D1;->E(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    const/16 p4, 0xce

    .line 20
    .line 21
    if-ne p1, p4, :cond_2

    .line 22
    .line 23
    invoke-static {}, LY/w;->H()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0, p2, v2}, LY/D1;->C(II)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    instance-of p3, p1, LY/s$a;

    .line 38
    .line 39
    if-eqz p3, :cond_0

    .line 40
    .line 41
    check-cast p1, LY/s$a;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 p1, 0x0

    .line 45
    :goto_0
    if-eqz p1, :cond_1

    .line 46
    .line 47
    invoke-virtual {p1}, LY/s$a;->a()LY/s$b;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, LY/s$b;->x()Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Ljava/lang/Iterable;

    .line 56
    .line 57
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result p3

    .line 65
    if-eqz p3, :cond_1

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    check-cast p3, LY/s;

    .line 72
    .line 73
    invoke-direct {p3}, LY/s;->m1()V

    .line 74
    .line 75
    .line 76
    iget-object p4, p0, LY/s;->c:LY/y;

    .line 77
    .line 78
    invoke-virtual {p3}, LY/s;->H0()LY/B;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    invoke-virtual {p4, p3}, LY/y;->s(LY/Q;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    invoke-virtual {v0, p2}, LY/D1;->O(I)I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    return p0

    .line 91
    :cond_2
    invoke-virtual {v0, p2}, LY/D1;->K(I)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-eqz p0, :cond_3

    .line 96
    .line 97
    return v3

    .line 98
    :cond_3
    invoke-virtual {v0, p2}, LY/D1;->O(I)I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    return p0

    .line 103
    :cond_4
    invoke-virtual {v0, p2}, LY/D1;->e(I)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_c

    .line 108
    .line 109
    invoke-virtual {v0, p2}, LY/D1;->F(I)I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    add-int/2addr v1, p2

    .line 114
    add-int/lit8 v4, p2, 0x1

    .line 115
    .line 116
    move v5, v2

    .line 117
    :goto_2
    if-ge v4, v1, :cond_a

    .line 118
    .line 119
    invoke-virtual {v0, v4}, LY/D1;->K(I)Z

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    if-eqz v6, :cond_5

    .line 124
    .line 125
    iget-object v7, p0, LY/s;->P:LZ/b;

    .line 126
    .line 127
    invoke-virtual {v7}, LZ/b;->i()V

    .line 128
    .line 129
    .line 130
    iget-object v7, p0, LY/s;->P:LZ/b;

    .line 131
    .line 132
    invoke-virtual {v0, v4}, LY/D1;->M(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    invoke-virtual {v7, v8}, LZ/b;->w(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_5
    if-nez v6, :cond_7

    .line 140
    .line 141
    if-eqz p3, :cond_6

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_6
    move v7, v2

    .line 145
    goto :goto_4

    .line 146
    :cond_7
    :goto_3
    move v7, v3

    .line 147
    :goto_4
    if-eqz v6, :cond_8

    .line 148
    .line 149
    move v8, v2

    .line 150
    goto :goto_5

    .line 151
    :cond_8
    add-int v8, p4, v5

    .line 152
    .line 153
    :goto_5
    invoke-static {p0, p1, v4, v7, v8}, LY/s;->o1(LY/s;IIZI)I

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    add-int/2addr v5, v7

    .line 158
    if-eqz v6, :cond_9

    .line 159
    .line 160
    iget-object v6, p0, LY/s;->P:LZ/b;

    .line 161
    .line 162
    invoke-virtual {v6}, LZ/b;->i()V

    .line 163
    .line 164
    .line 165
    iget-object v6, p0, LY/s;->P:LZ/b;

    .line 166
    .line 167
    invoke-virtual {v6}, LZ/b;->A()V

    .line 168
    .line 169
    .line 170
    :cond_9
    invoke-virtual {v0, v4}, LY/D1;->F(I)I

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    add-int/2addr v4, v6

    .line 175
    goto :goto_2

    .line 176
    :cond_a
    invoke-virtual {v0, p2}, LY/D1;->K(I)Z

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    if-eqz p0, :cond_b

    .line 181
    .line 182
    return v3

    .line 183
    :cond_b
    return v5

    .line 184
    :cond_c
    invoke-virtual {v0, p2}, LY/D1;->K(I)Z

    .line 185
    .line 186
    .line 187
    move-result p0

    .line 188
    if-eqz p0, :cond_d

    .line 189
    .line 190
    return v3

    .line 191
    :cond_d
    invoke-virtual {v0, p2}, LY/D1;->O(I)I

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    return p0
.end method

.method private final p0()Ljava/util/List;
    .locals 7

    .line 1
    iget-boolean v0, p0, LY/s;->E:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, LY/s;->L:LY/H1;

    .line 16
    .line 17
    const/4 v5, 0x7

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-static/range {v1 .. v6}, Lk0/b;->c(LY/H1;Ljava/lang/Object;ILjava/lang/Integer;ILjava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, LY/s;->J:LY/D1;

    .line 30
    .line 31
    invoke-static {v1}, Lk0/b;->a(LY/D1;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, LY/s;->a1()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 43
    .line 44
    .line 45
    return-object v0
.end method

.method private final q1()V
    .locals 2

    .line 1
    iget v0, p0, LY/s;->m:I

    .line 2
    .line 3
    iget-object v1, p0, LY/s;->J:LY/D1;

    .line 4
    .line 5
    invoke-virtual {v1}, LY/D1;->T()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v0, v1

    .line 10
    iput v0, p0, LY/s;->m:I

    .line 11
    .line 12
    return-void
.end method

.method private final r1()V
    .locals 1

    .line 1
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/D1;->v()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput v0, p0, LY/s;->m:I

    .line 8
    .line 9
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 10
    .line 11
    invoke-virtual {v0}, LY/D1;->U()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final s0(Lt/P;Lkotlin/jvm/functions/Function2;)V
    .locals 6

    .line 1
    iget-boolean v0, p0, LY/s;->H:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Reentrant composition is not supported"

    .line 6
    .line 7
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, LY/s;->h:LY/K;

    .line 11
    .line 12
    invoke-virtual {v0}, LY/K;->a()Lk0/l;

    .line 13
    .line 14
    .line 15
    sget-object v0, Lg0/x;->a:Lg0/x;

    .line 16
    .line 17
    const-string v1, "Compose:recompose"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lg0/x;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :try_start_0
    invoke-static {}, Li0/v;->M()Li0/l;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Li0/l;->i()J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    iput v2, p0, LY/s;->D:I

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    iput-object v2, p0, LY/s;->x:Lt/F;

    .line 39
    .line 40
    invoke-virtual {p0, p1}, LY/s;->D1(Lt/P;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    iput p1, p0, LY/s;->l:I

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    iput-boolean v2, p0, LY/s;->H:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 48
    .line 49
    :try_start_1
    invoke-direct {p0}, LY/s;->A1()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, LY/s;->W0()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    if-eq v3, p2, :cond_1

    .line 57
    .line 58
    if-eqz p2, :cond_1

    .line 59
    .line 60
    invoke-virtual {p0, p2}, LY/s;->I1(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception p2

    .line 65
    goto/16 :goto_3

    .line 66
    .line 67
    :cond_1
    :goto_0
    iget-object v4, p0, LY/s;->F:LY/s$c;

    .line 68
    .line 69
    invoke-static {}, LY/U1;->b()La0/c;

    .line 70
    .line 71
    .line 72
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    :try_start_2
    invoke-virtual {v5, v4}, La0/c;->c(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    const/16 v4, 0xc8

    .line 77
    .line 78
    if-eqz p2, :cond_2

    .line 79
    .line 80
    invoke-static {}, LY/w;->D()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-direct {p0, v4, v3}, LY/s;->x1(ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0, p2}, Lg0/j;->a(LY/m;Lkotlin/jvm/functions/Function2;)V

    .line 88
    .line 89
    .line 90
    invoke-direct {p0}, LY/s;->w0()V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :catchall_1
    move-exception p2

    .line 95
    goto :goto_2

    .line 96
    :cond_2
    iget-boolean p2, p0, LY/s;->s:Z

    .line 97
    .line 98
    if-nez p2, :cond_3

    .line 99
    .line 100
    iget-boolean p2, p0, LY/s;->y:Z

    .line 101
    .line 102
    if-eqz p2, :cond_4

    .line 103
    .line 104
    :cond_3
    if-eqz v3, :cond_4

    .line 105
    .line 106
    sget-object p2, LY/m;->a:LY/m$a;

    .line 107
    .line 108
    invoke-virtual {p2}, LY/m$a;->a()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-static {v3, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    if-nez p2, :cond_4

    .line 117
    .line 118
    invoke-static {}, LY/w;->D()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-direct {p0, v4, p2}, LY/s;->x1(ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    const/4 p2, 0x2

    .line 126
    invoke-static {v3, p2}, Lkotlin/jvm/internal/V;->e(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    check-cast p2, Lkotlin/jvm/functions/Function2;

    .line 131
    .line 132
    invoke-static {p0, p2}, Lg0/j;->a(LY/m;Lkotlin/jvm/functions/Function2;)V

    .line 133
    .line 134
    .line 135
    invoke-direct {p0}, LY/s;->w0()V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_4
    invoke-virtual {p0}, LY/s;->p1()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 140
    .line 141
    .line 142
    :goto_1
    :try_start_3
    invoke-virtual {v5}, La0/c;->p()I

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    sub-int/2addr p2, v2

    .line 147
    invoke-virtual {v5, p2}, La0/c;->y(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    invoke-direct {p0}, LY/s;->y0()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 151
    .line 152
    .line 153
    :try_start_4
    iput-boolean p1, p0, LY/s;->H:Z

    .line 154
    .line 155
    iget-object p1, p0, LY/s;->u:Ljava/util/List;

    .line 156
    .line 157
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 158
    .line 159
    .line 160
    invoke-direct {p0}, LY/s;->m0()V

    .line 161
    .line 162
    .line 163
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 164
    .line 165
    invoke-virtual {v0, v1}, Lg0/x;->b(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :catchall_2
    move-exception p1

    .line 170
    goto :goto_4

    .line 171
    :goto_2
    :try_start_5
    invoke-virtual {v5}, La0/c;->p()I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    sub-int/2addr v0, v2

    .line 176
    invoke-virtual {v5, v0}, La0/c;->y(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 180
    :goto_3
    :try_start_6
    new-instance v0, LY/p;

    .line 181
    .line 182
    invoke-direct {v0, p0}, LY/p;-><init>(LY/s;)V

    .line 183
    .line 184
    .line 185
    invoke-static {p2, v0}, Lk0/d;->b(Ljava/lang/Throwable;Lie/a;)Ljava/lang/Throwable;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 190
    :catchall_3
    move-exception p2

    .line 191
    :try_start_7
    iput-boolean p1, p0, LY/s;->H:Z

    .line 192
    .line 193
    iget-object p1, p0, LY/s;->u:Ljava/util/List;

    .line 194
    .line 195
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 196
    .line 197
    .line 198
    invoke-direct {p0}, LY/s;->b0()V

    .line 199
    .line 200
    .line 201
    invoke-direct {p0}, LY/s;->m0()V

    .line 202
    .line 203
    .line 204
    throw p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 205
    :goto_4
    sget-object p2, Lg0/x;->a:Lg0/x;

    .line 206
    .line 207
    invoke-virtual {p2, v1}, Lg0/x;->b(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    throw p1
.end method

.method private final s1(ILjava/lang/Integer;)Ljava/util/List;
    .locals 1

    .line 1
    iget-boolean v0, p0, LY/s;->E:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-object v0, p0, LY/s;->d:LY/E1;

    .line 11
    .line 12
    invoke-virtual {v0}, LY/E1;->F()LY/D1;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :try_start_0
    invoke-static {v0, p1, p2}, Lk0/b;->g(LY/D1;ILjava/lang/Object;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    invoke-virtual {v0}, LY/D1;->d()V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    invoke-virtual {v0}, LY/D1;->d()V

    .line 26
    .line 27
    .line 28
    throw p1
.end method

.method private static final t0(LY/s;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-direct {p0}, LY/s;->p0()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final t1(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-eq p1, p0, :cond_3

    .line 2
    .line 3
    instance-of v0, p1, LY/w1;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, LY/w1;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p1, v1

    .line 12
    :goto_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, LY/w1;->b()LY/v1;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_1
    if-ne v1, p0, :cond_2

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_2
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 24
    return p0
.end method

.method private final u0(II)V
    .locals 1

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    if-eq p1, p2, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, LY/D1;->Q(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-direct {p0, v0, p2}, LY/s;->u0(II)V

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, LY/s;->J:LY/D1;

    .line 15
    .line 16
    invoke-virtual {p2, p1}, LY/D1;->K(I)Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    iget-object p2, p0, LY/s;->P:LZ/b;

    .line 23
    .line 24
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 25
    .line 26
    invoke-direct {p0, v0, p1}, LY/s;->Y0(LY/D1;I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p2, p1}, LZ/b;->w(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method private final v0(Z)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LY/s;->o:LY/i0;

    .line 4
    .line 5
    invoke-virtual {v1}, LY/i0;->e()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    sub-int/2addr v1, v2

    .line 11
    invoke-virtual {v0}, LY/s;->e()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/16 v4, 0xcf

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v6, 0x3

    .line 19
    if-eqz v3, :cond_3

    .line 20
    .line 21
    iget-object v3, v0, LY/s;->L:LY/H1;

    .line 22
    .line 23
    invoke-virtual {v3}, LY/H1;->a0()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    iget-object v7, v0, LY/s;->L:LY/H1;

    .line 28
    .line 29
    invoke-virtual {v7, v3}, LY/H1;->f0(I)I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    iget-object v8, v0, LY/s;->L:LY/H1;

    .line 34
    .line 35
    invoke-virtual {v8, v3}, LY/H1;->g0(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    iget-object v9, v0, LY/s;->L:LY/H1;

    .line 40
    .line 41
    invoke-virtual {v9, v3}, LY/H1;->d0(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    if-nez v8, :cond_1

    .line 46
    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    if-ne v7, v4, :cond_0

    .line 50
    .line 51
    sget-object v4, LY/m;->a:LY/m$a;

    .line 52
    .line 53
    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-nez v4, :cond_0

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-virtual {v0}, LY/s;->o()J

    .line 68
    .line 69
    .line 70
    move-result-wide v7

    .line 71
    int-to-long v9, v1

    .line 72
    xor-long/2addr v7, v9

    .line 73
    invoke-static {v7, v8, v6}, Ljava/lang/Long;->rotateRight(JI)J

    .line 74
    .line 75
    .line 76
    move-result-wide v7

    .line 77
    int-to-long v3, v3

    .line 78
    xor-long/2addr v3, v7

    .line 79
    invoke-static {v3, v4, v6}, Ljava/lang/Long;->rotateRight(JI)J

    .line 80
    .line 81
    .line 82
    move-result-wide v3

    .line 83
    iput-wide v3, v0, LY/s;->W:J

    .line 84
    .line 85
    goto/16 :goto_4

    .line 86
    .line 87
    :cond_0
    invoke-virtual {v0}, LY/s;->o()J

    .line 88
    .line 89
    .line 90
    move-result-wide v3

    .line 91
    int-to-long v8, v1

    .line 92
    xor-long/2addr v3, v8

    .line 93
    invoke-static {v3, v4, v6}, Ljava/lang/Long;->rotateRight(JI)J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    int-to-long v7, v7

    .line 98
    :goto_0
    xor-long/2addr v3, v7

    .line 99
    invoke-static {v3, v4, v6}, Ljava/lang/Long;->rotateRight(JI)J

    .line 100
    .line 101
    .line 102
    move-result-wide v3

    .line 103
    iput-wide v3, v0, LY/s;->W:J

    .line 104
    .line 105
    goto/16 :goto_4

    .line 106
    .line 107
    :cond_1
    instance-of v1, v8, Ljava/lang/Enum;

    .line 108
    .line 109
    if-eqz v1, :cond_2

    .line 110
    .line 111
    check-cast v8, Ljava/lang/Enum;

    .line 112
    .line 113
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    :goto_1
    invoke-virtual {v0}, LY/s;->o()J

    .line 118
    .line 119
    .line 120
    move-result-wide v3

    .line 121
    int-to-long v7, v5

    .line 122
    xor-long/2addr v3, v7

    .line 123
    invoke-static {v3, v4, v6}, Ljava/lang/Long;->rotateRight(JI)J

    .line 124
    .line 125
    .line 126
    move-result-wide v3

    .line 127
    int-to-long v7, v1

    .line 128
    goto :goto_0

    .line 129
    :cond_2
    invoke-virtual {v8}, Ljava/lang/Object;->hashCode()I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    goto :goto_1

    .line 134
    :cond_3
    iget-object v3, v0, LY/s;->J:LY/D1;

    .line 135
    .line 136
    invoke-virtual {v3}, LY/D1;->u()I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    iget-object v7, v0, LY/s;->J:LY/D1;

    .line 141
    .line 142
    invoke-virtual {v7, v3}, LY/D1;->D(I)I

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    iget-object v8, v0, LY/s;->J:LY/D1;

    .line 147
    .line 148
    invoke-virtual {v8, v3}, LY/D1;->E(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    iget-object v9, v0, LY/s;->J:LY/D1;

    .line 153
    .line 154
    invoke-virtual {v9, v3}, LY/D1;->A(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    if-nez v8, :cond_5

    .line 159
    .line 160
    if-eqz v3, :cond_4

    .line 161
    .line 162
    if-ne v7, v4, :cond_4

    .line 163
    .line 164
    sget-object v4, LY/m;->a:LY/m$a;

    .line 165
    .line 166
    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    if-nez v4, :cond_4

    .line 175
    .line 176
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    invoke-virtual {v0}, LY/s;->o()J

    .line 181
    .line 182
    .line 183
    move-result-wide v7

    .line 184
    int-to-long v9, v1

    .line 185
    xor-long/2addr v7, v9

    .line 186
    invoke-static {v7, v8, v6}, Ljava/lang/Long;->rotateRight(JI)J

    .line 187
    .line 188
    .line 189
    move-result-wide v7

    .line 190
    int-to-long v3, v3

    .line 191
    xor-long/2addr v3, v7

    .line 192
    invoke-static {v3, v4, v6}, Ljava/lang/Long;->rotateRight(JI)J

    .line 193
    .line 194
    .line 195
    move-result-wide v3

    .line 196
    iput-wide v3, v0, LY/s;->W:J

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_4
    invoke-virtual {v0}, LY/s;->o()J

    .line 200
    .line 201
    .line 202
    move-result-wide v3

    .line 203
    int-to-long v8, v1

    .line 204
    xor-long/2addr v3, v8

    .line 205
    invoke-static {v3, v4, v6}, Ljava/lang/Long;->rotateRight(JI)J

    .line 206
    .line 207
    .line 208
    move-result-wide v3

    .line 209
    int-to-long v7, v7

    .line 210
    :goto_2
    xor-long/2addr v3, v7

    .line 211
    invoke-static {v3, v4, v6}, Ljava/lang/Long;->rotateRight(JI)J

    .line 212
    .line 213
    .line 214
    move-result-wide v3

    .line 215
    iput-wide v3, v0, LY/s;->W:J

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_5
    instance-of v1, v8, Ljava/lang/Enum;

    .line 219
    .line 220
    if-eqz v1, :cond_6

    .line 221
    .line 222
    check-cast v8, Ljava/lang/Enum;

    .line 223
    .line 224
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    :goto_3
    invoke-virtual {v0}, LY/s;->o()J

    .line 229
    .line 230
    .line 231
    move-result-wide v3

    .line 232
    int-to-long v7, v5

    .line 233
    xor-long/2addr v3, v7

    .line 234
    invoke-static {v3, v4, v6}, Ljava/lang/Long;->rotateRight(JI)J

    .line 235
    .line 236
    .line 237
    move-result-wide v3

    .line 238
    int-to-long v7, v1

    .line 239
    goto :goto_2

    .line 240
    :cond_6
    invoke-virtual {v8}, Ljava/lang/Object;->hashCode()I

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    goto :goto_3

    .line 245
    :goto_4
    iget v1, v0, LY/s;->m:I

    .line 246
    .line 247
    iget-object v3, v0, LY/s;->k:LY/T0;

    .line 248
    .line 249
    if-eqz v3, :cond_d

    .line 250
    .line 251
    invoke-virtual {v3}, LY/T0;->b()Ljava/util/List;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    if-lez v4, :cond_d

    .line 260
    .line 261
    invoke-virtual {v3}, LY/T0;->b()Ljava/util/List;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    invoke-virtual {v3}, LY/T0;->f()Ljava/util/List;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    invoke-static {v6}, Li0/c;->e(Ljava/util/List;)Ljava/util/Set;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    new-instance v8, Ljava/util/LinkedHashSet;

    .line 274
    .line 275
    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    .line 276
    .line 277
    .line 278
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 279
    .line 280
    .line 281
    move-result v9

    .line 282
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 283
    .line 284
    .line 285
    move-result v10

    .line 286
    move v11, v5

    .line 287
    move v12, v11

    .line 288
    move v13, v12

    .line 289
    :goto_5
    if-ge v11, v10, :cond_c

    .line 290
    .line 291
    invoke-interface {v4, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v14

    .line 295
    check-cast v14, LY/n0;

    .line 296
    .line 297
    invoke-interface {v7, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v15

    .line 301
    if-nez v15, :cond_8

    .line 302
    .line 303
    invoke-virtual {v3, v14}, LY/T0;->g(LY/n0;)I

    .line 304
    .line 305
    .line 306
    move-result v15

    .line 307
    iget-object v2, v0, LY/s;->P:LZ/b;

    .line 308
    .line 309
    invoke-virtual {v3}, LY/T0;->e()I

    .line 310
    .line 311
    .line 312
    move-result v16

    .line 313
    add-int v15, v15, v16

    .line 314
    .line 315
    invoke-virtual {v14}, LY/n0;->c()I

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    invoke-virtual {v2, v15, v5}, LZ/b;->Q(II)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v14}, LY/n0;->b()I

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    const/4 v5, 0x0

    .line 327
    invoke-virtual {v3, v2, v5}, LY/T0;->n(II)Z

    .line 328
    .line 329
    .line 330
    iget-object v2, v0, LY/s;->P:LZ/b;

    .line 331
    .line 332
    invoke-virtual {v14}, LY/n0;->b()I

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    invoke-virtual {v2, v5}, LZ/b;->y(I)V

    .line 337
    .line 338
    .line 339
    iget-object v2, v0, LY/s;->J:LY/D1;

    .line 340
    .line 341
    invoke-virtual {v14}, LY/n0;->b()I

    .line 342
    .line 343
    .line 344
    move-result v5

    .line 345
    invoke-virtual {v2, v5}, LY/D1;->R(I)V

    .line 346
    .line 347
    .line 348
    invoke-direct {v0}, LY/s;->h1()V

    .line 349
    .line 350
    .line 351
    iget-object v2, v0, LY/s;->J:LY/D1;

    .line 352
    .line 353
    invoke-virtual {v2}, LY/D1;->T()I

    .line 354
    .line 355
    .line 356
    iget-object v2, v0, LY/s;->u:Ljava/util/List;

    .line 357
    .line 358
    invoke-virtual {v14}, LY/n0;->b()I

    .line 359
    .line 360
    .line 361
    move-result v5

    .line 362
    invoke-virtual {v14}, LY/n0;->b()I

    .line 363
    .line 364
    .line 365
    move-result v15

    .line 366
    move-object/from16 v17, v4

    .line 367
    .line 368
    iget-object v4, v0, LY/s;->J:LY/D1;

    .line 369
    .line 370
    invoke-virtual {v14}, LY/n0;->b()I

    .line 371
    .line 372
    .line 373
    move-result v14

    .line 374
    invoke-virtual {v4, v14}, LY/D1;->F(I)I

    .line 375
    .line 376
    .line 377
    move-result v4

    .line 378
    add-int/2addr v15, v4

    .line 379
    invoke-static {v2, v5, v15}, LY/w;->o(Ljava/util/List;II)V

    .line 380
    .line 381
    .line 382
    :goto_6
    add-int/lit8 v11, v11, 0x1

    .line 383
    .line 384
    :cond_7
    move-object/from16 v4, v17

    .line 385
    .line 386
    :goto_7
    const/4 v2, 0x1

    .line 387
    const/4 v5, 0x0

    .line 388
    goto :goto_5

    .line 389
    :cond_8
    move-object/from16 v17, v4

    .line 390
    .line 391
    invoke-interface {v8, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v2

    .line 395
    if-eqz v2, :cond_9

    .line 396
    .line 397
    goto :goto_6

    .line 398
    :cond_9
    if-ge v12, v9, :cond_7

    .line 399
    .line 400
    invoke-interface {v6, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    check-cast v2, LY/n0;

    .line 405
    .line 406
    if-eq v2, v14, :cond_b

    .line 407
    .line 408
    invoke-virtual {v3, v2}, LY/T0;->g(LY/n0;)I

    .line 409
    .line 410
    .line 411
    move-result v4

    .line 412
    invoke-interface {v8, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    if-eq v4, v13, :cond_a

    .line 416
    .line 417
    invoke-virtual {v3, v2}, LY/T0;->o(LY/n0;)I

    .line 418
    .line 419
    .line 420
    move-result v5

    .line 421
    iget-object v14, v0, LY/s;->P:LZ/b;

    .line 422
    .line 423
    invoke-virtual {v3}, LY/T0;->e()I

    .line 424
    .line 425
    .line 426
    move-result v15

    .line 427
    add-int/2addr v15, v4

    .line 428
    invoke-virtual {v3}, LY/T0;->e()I

    .line 429
    .line 430
    .line 431
    move-result v18

    .line 432
    move-object/from16 v19, v6

    .line 433
    .line 434
    add-int v6, v13, v18

    .line 435
    .line 436
    invoke-virtual {v14, v15, v6, v5}, LZ/b;->x(III)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v3, v4, v13, v5}, LY/T0;->j(III)V

    .line 440
    .line 441
    .line 442
    goto :goto_8

    .line 443
    :cond_a
    move-object/from16 v19, v6

    .line 444
    .line 445
    goto :goto_8

    .line 446
    :cond_b
    move-object/from16 v19, v6

    .line 447
    .line 448
    add-int/lit8 v11, v11, 0x1

    .line 449
    .line 450
    :goto_8
    add-int/lit8 v12, v12, 0x1

    .line 451
    .line 452
    invoke-virtual {v3, v2}, LY/T0;->o(LY/n0;)I

    .line 453
    .line 454
    .line 455
    move-result v2

    .line 456
    add-int/2addr v13, v2

    .line 457
    move-object/from16 v4, v17

    .line 458
    .line 459
    move-object/from16 v6, v19

    .line 460
    .line 461
    goto :goto_7

    .line 462
    :cond_c
    move-object/from16 v17, v4

    .line 463
    .line 464
    iget-object v2, v0, LY/s;->P:LZ/b;

    .line 465
    .line 466
    invoke-virtual {v2}, LZ/b;->i()V

    .line 467
    .line 468
    .line 469
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    .line 470
    .line 471
    .line 472
    move-result v2

    .line 473
    if-lez v2, :cond_d

    .line 474
    .line 475
    iget-object v2, v0, LY/s;->P:LZ/b;

    .line 476
    .line 477
    iget-object v3, v0, LY/s;->J:LY/D1;

    .line 478
    .line 479
    invoke-virtual {v3}, LY/D1;->m()I

    .line 480
    .line 481
    .line 482
    move-result v3

    .line 483
    invoke-virtual {v2, v3}, LZ/b;->y(I)V

    .line 484
    .line 485
    .line 486
    iget-object v2, v0, LY/s;->J:LY/D1;

    .line 487
    .line 488
    invoke-virtual {v2}, LY/D1;->U()V

    .line 489
    .line 490
    .line 491
    :cond_d
    invoke-virtual {v0}, LY/s;->e()Z

    .line 492
    .line 493
    .line 494
    move-result v2

    .line 495
    if-nez v2, :cond_e

    .line 496
    .line 497
    iget-object v3, v0, LY/s;->J:LY/D1;

    .line 498
    .line 499
    invoke-virtual {v3}, LY/D1;->w()I

    .line 500
    .line 501
    .line 502
    move-result v3

    .line 503
    if-lez v3, :cond_e

    .line 504
    .line 505
    iget-object v4, v0, LY/s;->P:LZ/b;

    .line 506
    .line 507
    invoke-virtual {v4, v3}, LZ/b;->Y(I)V

    .line 508
    .line 509
    .line 510
    :cond_e
    iget v3, v0, LY/s;->l:I

    .line 511
    .line 512
    :goto_9
    iget-object v4, v0, LY/s;->J:LY/D1;

    .line 513
    .line 514
    invoke-virtual {v4}, LY/D1;->I()Z

    .line 515
    .line 516
    .line 517
    move-result v4

    .line 518
    if-nez v4, :cond_f

    .line 519
    .line 520
    iget-object v4, v0, LY/s;->J:LY/D1;

    .line 521
    .line 522
    invoke-virtual {v4}, LY/D1;->k()I

    .line 523
    .line 524
    .line 525
    move-result v4

    .line 526
    invoke-direct {v0}, LY/s;->h1()V

    .line 527
    .line 528
    .line 529
    iget-object v5, v0, LY/s;->J:LY/D1;

    .line 530
    .line 531
    invoke-virtual {v5}, LY/D1;->T()I

    .line 532
    .line 533
    .line 534
    move-result v5

    .line 535
    iget-object v6, v0, LY/s;->P:LZ/b;

    .line 536
    .line 537
    invoke-virtual {v6, v3, v5}, LZ/b;->Q(II)V

    .line 538
    .line 539
    .line 540
    iget-object v5, v0, LY/s;->u:Ljava/util/List;

    .line 541
    .line 542
    iget-object v6, v0, LY/s;->J:LY/D1;

    .line 543
    .line 544
    invoke-virtual {v6}, LY/D1;->k()I

    .line 545
    .line 546
    .line 547
    move-result v6

    .line 548
    invoke-static {v5, v4, v6}, LY/w;->o(Ljava/util/List;II)V

    .line 549
    .line 550
    .line 551
    goto :goto_9

    .line 552
    :cond_f
    if-eqz v2, :cond_11

    .line 553
    .line 554
    if-eqz p1, :cond_10

    .line 555
    .line 556
    iget-object v1, v0, LY/s;->R:LZ/c;

    .line 557
    .line 558
    invoke-virtual {v1}, LZ/c;->c()V

    .line 559
    .line 560
    .line 561
    const/4 v1, 0x1

    .line 562
    :cond_10
    iget-object v3, v0, LY/s;->J:LY/D1;

    .line 563
    .line 564
    invoke-virtual {v3}, LY/D1;->f()V

    .line 565
    .line 566
    .line 567
    iget-object v3, v0, LY/s;->L:LY/H1;

    .line 568
    .line 569
    invoke-virtual {v3}, LY/H1;->a0()I

    .line 570
    .line 571
    .line 572
    move-result v3

    .line 573
    iget-object v4, v0, LY/s;->L:LY/H1;

    .line 574
    .line 575
    invoke-virtual {v4}, LY/H1;->R()I

    .line 576
    .line 577
    .line 578
    iget-object v4, v0, LY/s;->J:LY/D1;

    .line 579
    .line 580
    invoke-virtual {v4}, LY/D1;->t()Z

    .line 581
    .line 582
    .line 583
    move-result v4

    .line 584
    if-nez v4, :cond_15

    .line 585
    .line 586
    invoke-direct {v0, v3}, LY/s;->S0(I)I

    .line 587
    .line 588
    .line 589
    move-result v3

    .line 590
    iget-object v4, v0, LY/s;->L:LY/H1;

    .line 591
    .line 592
    invoke-virtual {v4}, LY/H1;->S()V

    .line 593
    .line 594
    .line 595
    iget-object v4, v0, LY/s;->L:LY/H1;

    .line 596
    .line 597
    const/4 v5, 0x1

    .line 598
    invoke-virtual {v4, v5}, LY/H1;->J(Z)V

    .line 599
    .line 600
    .line 601
    iget-object v4, v0, LY/s;->Q:LY/b;

    .line 602
    .line 603
    invoke-direct {v0, v4}, LY/s;->i1(LY/b;)V

    .line 604
    .line 605
    .line 606
    const/4 v5, 0x0

    .line 607
    iput-boolean v5, v0, LY/s;->V:Z

    .line 608
    .line 609
    iget-object v4, v0, LY/s;->d:LY/E1;

    .line 610
    .line 611
    invoke-virtual {v4}, LY/E1;->isEmpty()Z

    .line 612
    .line 613
    .line 614
    move-result v4

    .line 615
    if-nez v4, :cond_15

    .line 616
    .line 617
    invoke-direct {v0, v3, v5}, LY/s;->E1(II)V

    .line 618
    .line 619
    .line 620
    invoke-direct {v0, v3, v1}, LY/s;->F1(II)V

    .line 621
    .line 622
    .line 623
    goto :goto_a

    .line 624
    :cond_11
    const/4 v5, 0x1

    .line 625
    if-eqz p1, :cond_12

    .line 626
    .line 627
    iget-object v3, v0, LY/s;->P:LZ/b;

    .line 628
    .line 629
    invoke-virtual {v3}, LZ/b;->A()V

    .line 630
    .line 631
    .line 632
    :cond_12
    iget-object v3, v0, LY/s;->P:LZ/b;

    .line 633
    .line 634
    invoke-virtual {v3}, LZ/b;->g()V

    .line 635
    .line 636
    .line 637
    iget-object v3, v0, LY/s;->J:LY/D1;

    .line 638
    .line 639
    invoke-virtual {v3}, LY/D1;->u()I

    .line 640
    .line 641
    .line 642
    move-result v3

    .line 643
    invoke-direct {v0, v3}, LY/s;->J1(I)I

    .line 644
    .line 645
    .line 646
    move-result v4

    .line 647
    if-eq v1, v4, :cond_13

    .line 648
    .line 649
    invoke-direct {v0, v3, v1}, LY/s;->F1(II)V

    .line 650
    .line 651
    .line 652
    :cond_13
    if-eqz p1, :cond_14

    .line 653
    .line 654
    move v1, v5

    .line 655
    :cond_14
    iget-object v3, v0, LY/s;->J:LY/D1;

    .line 656
    .line 657
    invoke-virtual {v3}, LY/D1;->g()V

    .line 658
    .line 659
    .line 660
    iget-object v3, v0, LY/s;->P:LZ/b;

    .line 661
    .line 662
    invoke-virtual {v3}, LZ/b;->i()V

    .line 663
    .line 664
    .line 665
    :cond_15
    :goto_a
    invoke-direct {v0, v1, v2}, LY/s;->C0(IZ)V

    .line 666
    .line 667
    .line 668
    return-void
.end method

.method private final v1(ILjava/lang/Object;ILjava/lang/Object;)V
    .locals 10

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v3

    .line 6
    invoke-direct {p0}, LY/s;->L1()V

    .line 7
    .line 8
    .line 9
    iget v0, p0, LY/s;->n:I

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v1, 0x3

    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    if-eqz p4, :cond_0

    .line 16
    .line 17
    const/16 v2, 0xcf

    .line 18
    .line 19
    if-ne p1, v2, :cond_0

    .line 20
    .line 21
    sget-object v2, LY/m;->a:LY/m$a;

    .line 22
    .line 23
    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {p4, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {p4}, Ljava/lang/Object;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {p0}, LY/s;->o()J

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    invoke-static {v4, v5, v1}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 42
    .line 43
    .line 44
    move-result-wide v4

    .line 45
    int-to-long v8, v2

    .line 46
    xor-long/2addr v4, v8

    .line 47
    invoke-static {v4, v5, v1}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 48
    .line 49
    .line 50
    move-result-wide v1

    .line 51
    int-to-long v4, v0

    .line 52
    xor-long v0, v1, v4

    .line 53
    .line 54
    iput-wide v0, p0, LY/s;->W:J

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_0
    invoke-virtual {p0}, LY/s;->o()J

    .line 58
    .line 59
    .line 60
    move-result-wide v4

    .line 61
    invoke-static {v4, v5, v1}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 62
    .line 63
    .line 64
    move-result-wide v4

    .line 65
    int-to-long v8, p1

    .line 66
    xor-long/2addr v4, v8

    .line 67
    invoke-static {v4, v5, v1}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 68
    .line 69
    .line 70
    move-result-wide v1

    .line 71
    int-to-long v4, v0

    .line 72
    xor-long v0, v1, v4

    .line 73
    .line 74
    :goto_0
    iput-wide v0, p0, LY/s;->W:J

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_1
    instance-of v0, p2, Ljava/lang/Enum;

    .line 78
    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    move-object v0, p2

    .line 82
    check-cast v0, Ljava/lang/Enum;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    :goto_1
    invoke-virtual {p0}, LY/s;->o()J

    .line 89
    .line 90
    .line 91
    move-result-wide v4

    .line 92
    invoke-static {v4, v5, v1}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 93
    .line 94
    .line 95
    move-result-wide v4

    .line 96
    int-to-long v8, v0

    .line 97
    xor-long/2addr v4, v8

    .line 98
    invoke-static {v4, v5, v1}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 99
    .line 100
    .line 101
    move-result-wide v0

    .line 102
    int-to-long v4, v7

    .line 103
    xor-long/2addr v0, v4

    .line 104
    goto :goto_0

    .line 105
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    goto :goto_1

    .line 110
    :goto_2
    const/4 v0, 0x1

    .line 111
    if-nez p2, :cond_3

    .line 112
    .line 113
    iget v1, p0, LY/s;->n:I

    .line 114
    .line 115
    add-int/2addr v1, v0

    .line 116
    iput v1, p0, LY/s;->n:I

    .line 117
    .line 118
    :cond_3
    sget-object v1, LY/g0;->a:LY/g0$a;

    .line 119
    .line 120
    invoke-virtual {v1}, LY/g0$a;->a()I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eq p3, v2, :cond_4

    .line 125
    .line 126
    move v8, v0

    .line 127
    goto :goto_3

    .line 128
    :cond_4
    move v8, v7

    .line 129
    :goto_3
    invoke-virtual {p0}, LY/s;->e()Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    const/4 v9, 0x0

    .line 134
    if-eqz v2, :cond_a

    .line 135
    .line 136
    iget-object p3, p0, LY/s;->J:LY/D1;

    .line 137
    .line 138
    invoke-virtual {p3}, LY/D1;->c()V

    .line 139
    .line 140
    .line 141
    iget-object p3, p0, LY/s;->L:LY/H1;

    .line 142
    .line 143
    invoke-virtual {p3}, LY/H1;->Z()I

    .line 144
    .line 145
    .line 146
    move-result p3

    .line 147
    if-eqz v8, :cond_5

    .line 148
    .line 149
    iget-object p2, p0, LY/s;->L:LY/H1;

    .line 150
    .line 151
    sget-object p4, LY/m;->a:LY/m$a;

    .line 152
    .line 153
    invoke-virtual {p4}, LY/m$a;->a()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p4

    .line 157
    invoke-virtual {p2, p1, p4}, LY/H1;->g1(ILjava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_5
    if-eqz p4, :cond_7

    .line 162
    .line 163
    iget-object v0, p0, LY/s;->L:LY/H1;

    .line 164
    .line 165
    if-nez p2, :cond_6

    .line 166
    .line 167
    sget-object p2, LY/m;->a:LY/m$a;

    .line 168
    .line 169
    invoke-virtual {p2}, LY/m$a;->a()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    :cond_6
    invoke-virtual {v0, p1, p2, p4}, LY/H1;->c1(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_7
    iget-object p4, p0, LY/s;->L:LY/H1;

    .line 178
    .line 179
    if-nez p2, :cond_8

    .line 180
    .line 181
    sget-object p2, LY/m;->a:LY/m$a;

    .line 182
    .line 183
    invoke-virtual {p2}, LY/m$a;->a()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    :cond_8
    invoke-virtual {p4, p1, p2}, LY/H1;->e1(ILjava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :goto_4
    iget-object p2, p0, LY/s;->k:LY/T0;

    .line 191
    .line 192
    if-eqz p2, :cond_9

    .line 193
    .line 194
    new-instance v1, LY/n0;

    .line 195
    .line 196
    invoke-direct {p0, p3}, LY/s;->S0(I)I

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    const/4 v5, -0x1

    .line 201
    const/4 v6, 0x0

    .line 202
    move v2, p1

    .line 203
    invoke-direct/range {v1 .. v6}, LY/n0;-><init>(ILjava/lang/Object;III)V

    .line 204
    .line 205
    .line 206
    iget p1, p0, LY/s;->l:I

    .line 207
    .line 208
    invoke-virtual {p2}, LY/T0;->e()I

    .line 209
    .line 210
    .line 211
    move-result p3

    .line 212
    sub-int/2addr p1, p3

    .line 213
    invoke-virtual {p2, v1, p1}, LY/T0;->i(LY/n0;I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p2, v1}, LY/T0;->h(LY/n0;)Z

    .line 217
    .line 218
    .line 219
    :cond_9
    invoke-direct {p0, v8, v9}, LY/s;->A0(ZLY/T0;)V

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :cond_a
    move v2, p1

    .line 224
    invoke-virtual {v1}, LY/g0$a;->b()I

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    if-eq p3, p1, :cond_b

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_b
    iget-boolean p1, p0, LY/s;->A:Z

    .line 232
    .line 233
    if-eqz p1, :cond_c

    .line 234
    .line 235
    move p1, v0

    .line 236
    goto :goto_6

    .line 237
    :cond_c
    :goto_5
    move p1, v7

    .line 238
    :goto_6
    iget-object p3, p0, LY/s;->k:LY/T0;

    .line 239
    .line 240
    if-nez p3, :cond_e

    .line 241
    .line 242
    iget-object p3, p0, LY/s;->J:LY/D1;

    .line 243
    .line 244
    invoke-virtual {p3}, LY/D1;->n()I

    .line 245
    .line 246
    .line 247
    move-result p3

    .line 248
    if-nez p1, :cond_d

    .line 249
    .line 250
    if-ne p3, v2, :cond_d

    .line 251
    .line 252
    iget-object p3, p0, LY/s;->J:LY/D1;

    .line 253
    .line 254
    invoke-virtual {p3}, LY/D1;->o()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object p3

    .line 258
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result p3

    .line 262
    if-eqz p3, :cond_d

    .line 263
    .line 264
    invoke-direct {p0, v8, p4}, LY/s;->y1(ZLjava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    goto :goto_7

    .line 268
    :cond_d
    new-instance p3, LY/T0;

    .line 269
    .line 270
    iget-object v1, p0, LY/s;->J:LY/D1;

    .line 271
    .line 272
    invoke-virtual {v1}, LY/D1;->h()Ljava/util/List;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    iget v4, p0, LY/s;->l:I

    .line 277
    .line 278
    invoke-direct {p3, v1, v4}, LY/T0;-><init>(Ljava/util/List;I)V

    .line 279
    .line 280
    .line 281
    iput-object p3, p0, LY/s;->k:LY/T0;

    .line 282
    .line 283
    :cond_e
    :goto_7
    iget-object p3, p0, LY/s;->k:LY/T0;

    .line 284
    .line 285
    if-eqz p3, :cond_16

    .line 286
    .line 287
    invoke-virtual {p3, v2, p2}, LY/T0;->d(ILjava/lang/Object;)LY/n0;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    if-nez p1, :cond_10

    .line 292
    .line 293
    if-eqz v1, :cond_10

    .line 294
    .line 295
    invoke-virtual {p3, v1}, LY/T0;->h(LY/n0;)Z

    .line 296
    .line 297
    .line 298
    invoke-virtual {v1}, LY/n0;->b()I

    .line 299
    .line 300
    .line 301
    move-result p1

    .line 302
    invoke-virtual {p3, v1}, LY/T0;->g(LY/n0;)I

    .line 303
    .line 304
    .line 305
    move-result p2

    .line 306
    invoke-virtual {p3}, LY/T0;->e()I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    add-int/2addr p2, v0

    .line 311
    iput p2, p0, LY/s;->l:I

    .line 312
    .line 313
    invoke-virtual {p3, v1}, LY/T0;->m(LY/n0;)I

    .line 314
    .line 315
    .line 316
    move-result p2

    .line 317
    invoke-virtual {p3}, LY/T0;->a()I

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    sub-int v0, p2, v0

    .line 322
    .line 323
    invoke-virtual {p3}, LY/T0;->a()I

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    invoke-virtual {p3, p2, v1}, LY/T0;->k(II)V

    .line 328
    .line 329
    .line 330
    iget-object p2, p0, LY/s;->P:LZ/b;

    .line 331
    .line 332
    invoke-virtual {p2, p1}, LZ/b;->y(I)V

    .line 333
    .line 334
    .line 335
    iget-object p2, p0, LY/s;->J:LY/D1;

    .line 336
    .line 337
    invoke-virtual {p2, p1}, LY/D1;->R(I)V

    .line 338
    .line 339
    .line 340
    if-lez v0, :cond_f

    .line 341
    .line 342
    iget-object p1, p0, LY/s;->P:LZ/b;

    .line 343
    .line 344
    invoke-virtual {p1, v0}, LZ/b;->v(I)V

    .line 345
    .line 346
    .line 347
    :cond_f
    invoke-direct {p0, v8, p4}, LY/s;->y1(ZLjava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    goto :goto_a

    .line 351
    :cond_10
    iget-object p1, p0, LY/s;->J:LY/D1;

    .line 352
    .line 353
    invoke-virtual {p1}, LY/D1;->c()V

    .line 354
    .line 355
    .line 356
    iput-boolean v0, p0, LY/s;->V:Z

    .line 357
    .line 358
    iput-object v9, p0, LY/s;->N:LY/U0;

    .line 359
    .line 360
    invoke-direct {p0}, LY/s;->z0()V

    .line 361
    .line 362
    .line 363
    iget-object p1, p0, LY/s;->L:LY/H1;

    .line 364
    .line 365
    invoke-virtual {p1}, LY/H1;->F()V

    .line 366
    .line 367
    .line 368
    iget-object p1, p0, LY/s;->L:LY/H1;

    .line 369
    .line 370
    invoke-virtual {p1}, LY/H1;->Z()I

    .line 371
    .line 372
    .line 373
    move-result p1

    .line 374
    if-eqz v8, :cond_11

    .line 375
    .line 376
    iget-object p2, p0, LY/s;->L:LY/H1;

    .line 377
    .line 378
    sget-object p4, LY/m;->a:LY/m$a;

    .line 379
    .line 380
    invoke-virtual {p4}, LY/m$a;->a()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object p4

    .line 384
    invoke-virtual {p2, v2, p4}, LY/H1;->g1(ILjava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    goto :goto_8

    .line 388
    :cond_11
    if-eqz p4, :cond_13

    .line 389
    .line 390
    iget-object v0, p0, LY/s;->L:LY/H1;

    .line 391
    .line 392
    if-nez p2, :cond_12

    .line 393
    .line 394
    sget-object p2, LY/m;->a:LY/m$a;

    .line 395
    .line 396
    invoke-virtual {p2}, LY/m$a;->a()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object p2

    .line 400
    :cond_12
    invoke-virtual {v0, v2, p2, p4}, LY/H1;->c1(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    goto :goto_8

    .line 404
    :cond_13
    iget-object p4, p0, LY/s;->L:LY/H1;

    .line 405
    .line 406
    if-nez p2, :cond_14

    .line 407
    .line 408
    sget-object p2, LY/m;->a:LY/m$a;

    .line 409
    .line 410
    invoke-virtual {p2}, LY/m$a;->a()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object p2

    .line 414
    :cond_14
    invoke-virtual {p4, v2, p2}, LY/H1;->e1(ILjava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    :goto_8
    iget-object p2, p0, LY/s;->L:LY/H1;

    .line 418
    .line 419
    invoke-virtual {p2, p1}, LY/H1;->B(I)LY/b;

    .line 420
    .line 421
    .line 422
    move-result-object p2

    .line 423
    iput-object p2, p0, LY/s;->Q:LY/b;

    .line 424
    .line 425
    new-instance v1, LY/n0;

    .line 426
    .line 427
    invoke-direct {p0, p1}, LY/s;->S0(I)I

    .line 428
    .line 429
    .line 430
    move-result v4

    .line 431
    const/4 v5, -0x1

    .line 432
    const/4 v6, 0x0

    .line 433
    invoke-direct/range {v1 .. v6}, LY/n0;-><init>(ILjava/lang/Object;III)V

    .line 434
    .line 435
    .line 436
    iget p1, p0, LY/s;->l:I

    .line 437
    .line 438
    invoke-virtual {p3}, LY/T0;->e()I

    .line 439
    .line 440
    .line 441
    move-result p2

    .line 442
    sub-int/2addr p1, p2

    .line 443
    invoke-virtual {p3, v1, p1}, LY/T0;->i(LY/n0;I)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {p3, v1}, LY/T0;->h(LY/n0;)Z

    .line 447
    .line 448
    .line 449
    new-instance v9, LY/T0;

    .line 450
    .line 451
    new-instance p1, Ljava/util/ArrayList;

    .line 452
    .line 453
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 454
    .line 455
    .line 456
    if-eqz v8, :cond_15

    .line 457
    .line 458
    goto :goto_9

    .line 459
    :cond_15
    iget v7, p0, LY/s;->l:I

    .line 460
    .line 461
    :goto_9
    invoke-direct {v9, p1, v7}, LY/T0;-><init>(Ljava/util/List;I)V

    .line 462
    .line 463
    .line 464
    :cond_16
    :goto_a
    invoke-direct {p0, v8, v9}, LY/s;->A0(ZLY/T0;)V

    .line 465
    .line 466
    .line 467
    return-void
.end method

.method private final w0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LY/s;->v0(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method private final w1(I)V
    .locals 2

    .line 1
    sget-object v0, LY/g0;->a:LY/g0$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/g0$a;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {p0, p1, v1, v0, v1}, LY/s;->v1(ILjava/lang/Object;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final x1(ILjava/lang/Object;)V
    .locals 2

    .line 1
    sget-object v0, LY/g0;->a:LY/g0$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/g0$a;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {p0, p1, p2, v0, v1}, LY/s;->v1(ILjava/lang/Object;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final y0()V
    .locals 1

    .line 1
    invoke-direct {p0}, LY/s;->w0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LY/s;->c:LY/y;

    .line 5
    .line 6
    invoke-virtual {v0}, LY/y;->c()V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, LY/s;->w0()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LY/s;->P:LZ/b;

    .line 13
    .line 14
    invoke-virtual {v0}, LZ/b;->k()V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, LY/s;->E0()V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 21
    .line 22
    invoke-virtual {v0}, LY/D1;->d()V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p0, LY/s;->s:Z

    .line 27
    .line 28
    iget-object v0, p0, LY/s;->z:LY/i0;

    .line 29
    .line 30
    invoke-virtual {v0}, LY/i0;->g()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {v0}, LY/w;->e(I)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iput-boolean v0, p0, LY/s;->y:Z

    .line 39
    .line 40
    return-void
.end method

.method private final y1(ZLjava/lang/Object;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, LY/s;->J:LY/D1;

    .line 4
    .line 5
    invoke-virtual {p1}, LY/D1;->X()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    if-eqz p2, :cond_1

    .line 10
    .line 11
    iget-object p1, p0, LY/s;->J:LY/D1;

    .line 12
    .line 13
    invoke-virtual {p1}, LY/D1;->l()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eq p1, p2, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, LY/s;->P:LZ/b;

    .line 20
    .line 21
    invoke-virtual {p1, p2}, LZ/b;->a0(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    iget-object p1, p0, LY/s;->J:LY/D1;

    .line 25
    .line 26
    invoke-virtual {p1}, LY/D1;->W()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private final z0()V
    .locals 1

    .line 1
    iget-object v0, p0, LY/s;->L:LY/H1;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/H1;->Y()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LY/s;->K:LY/E1;

    .line 10
    .line 11
    invoke-virtual {v0}, LY/E1;->G()LY/H1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LY/s;->L:LY/H1;

    .line 16
    .line 17
    invoke-virtual {v0}, LY/H1;->U0()V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, LY/s;->M:Z

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, LY/s;->N:LY/U0;

    .line 25
    .line 26
    :cond_0
    return-void
.end method


# virtual methods
.method public A()LY/d1;
    .locals 1

    .line 1
    invoke-virtual {p0}, LY/s;->I0()LY/f1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public B()V
    .locals 3

    .line 1
    iget-boolean v0, p0, LY/s;->A:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 7
    .line 8
    invoke-virtual {v0}, LY/D1;->u()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget v2, p0, LY/s;->B:I

    .line 13
    .line 14
    if-ne v0, v2, :cond_0

    .line 15
    .line 16
    const/4 v0, -0x1

    .line 17
    iput v0, p0, LY/s;->B:I

    .line 18
    .line 19
    iput-boolean v1, p0, LY/s;->A:Z

    .line 20
    .line 21
    :cond_0
    invoke-direct {p0, v1}, LY/s;->v0(Z)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final B1(LY/f1;Ljava/lang/Object;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, LY/f1;->h()LY/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v2, p0, LY/s;->J:LY/D1;

    .line 10
    .line 11
    invoke-virtual {v2}, LY/D1;->z()LY/E1;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v0, v2}, LY/b;->d(LY/E1;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-boolean v2, p0, LY/s;->H:Z

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object v2, p0, LY/s;->J:LY/D1;

    .line 24
    .line 25
    invoke-virtual {v2}, LY/D1;->k()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-lt v0, v2, :cond_1

    .line 30
    .line 31
    iget-object v1, p0, LY/s;->u:Ljava/util/List;

    .line 32
    .line 33
    invoke-static {v1, v0, p1, p2}, LY/w;->k(Ljava/util/List;ILY/f1;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    return p1

    .line 38
    :cond_1
    return v1
.end method

.method public C(I)V
    .locals 2

    .line 1
    sget-object v0, LY/g0;->a:LY/g0$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/g0$a;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {p0, p1, v1, v0, v1}, LY/s;->v1(ILjava/lang/Object;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final C1(Ljava/lang/Object;)V
    .locals 3

    .line 1
    instance-of v0, p1, LY/v1;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    new-instance v0, LY/w1;

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, LY/v1;

    .line 9
    .line 10
    invoke-direct {p0}, LY/s;->l1()LY/b;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-direct {v0, v1, v2}, LY/w1;-><init>(LY/v1;LY/b;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, LY/s;->e()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, LY/s;->P:LZ/b;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, LZ/b;->N(LY/w1;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v1, p0, LY/s;->e:Ljava/util/Set;

    .line 29
    .line 30
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-object p1, v0

    .line 34
    :cond_1
    invoke-virtual {p0, p1}, LY/s;->I1(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public D()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LY/s;->X0()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final D1(Lt/P;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, LY/s;->u:Ljava/util/List;

    .line 6
    .line 7
    invoke-static {v2}, LUd/u;->o(Ljava/util/List;)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    :goto_0
    const/4 v3, -0x1

    .line 12
    if-ge v3, v2, :cond_2

    .line 13
    .line 14
    iget-object v3, v0, LY/s;->u:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, LY/k0;

    .line 21
    .line 22
    invoke-virtual {v3}, LY/k0;->c()LY/f1;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v4}, LY/f1;->h()LY/b;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    invoke-virtual {v4}, LY/b;->b()Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_0

    .line 37
    .line 38
    invoke-virtual {v3}, LY/k0;->b()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-virtual {v4}, LY/b;->a()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eq v5, v6, :cond_1

    .line 47
    .line 48
    invoke-virtual {v4}, LY/b;->a()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    invoke-virtual {v3, v4}, LY/k0;->f(I)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    iget-object v3, v0, LY/s;->u:Ljava/util/List;

    .line 57
    .line 58
    invoke-interface {v3, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, -0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    iget-object v2, v1, Lt/c0;->b:[Ljava/lang/Object;

    .line 65
    .line 66
    iget-object v3, v1, Lt/c0;->c:[Ljava/lang/Object;

    .line 67
    .line 68
    iget-object v1, v1, Lt/c0;->a:[J

    .line 69
    .line 70
    array-length v4, v1

    .line 71
    add-int/lit8 v4, v4, -0x2

    .line 72
    .line 73
    if-ltz v4, :cond_7

    .line 74
    .line 75
    const/4 v6, 0x0

    .line 76
    :goto_2
    aget-wide v7, v1, v6

    .line 77
    .line 78
    not-long v9, v7

    .line 79
    const/4 v11, 0x7

    .line 80
    shl-long/2addr v9, v11

    .line 81
    and-long/2addr v9, v7

    .line 82
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    and-long/2addr v9, v11

    .line 88
    cmp-long v9, v9, v11

    .line 89
    .line 90
    if-eqz v9, :cond_6

    .line 91
    .line 92
    sub-int v9, v6, v4

    .line 93
    .line 94
    not-int v9, v9

    .line 95
    ushr-int/lit8 v9, v9, 0x1f

    .line 96
    .line 97
    const/16 v10, 0x8

    .line 98
    .line 99
    rsub-int/lit8 v9, v9, 0x8

    .line 100
    .line 101
    const/4 v11, 0x0

    .line 102
    :goto_3
    if-ge v11, v9, :cond_5

    .line 103
    .line 104
    const-wide/16 v12, 0xff

    .line 105
    .line 106
    and-long/2addr v12, v7

    .line 107
    const-wide/16 v14, 0x80

    .line 108
    .line 109
    cmp-long v12, v12, v14

    .line 110
    .line 111
    if-gez v12, :cond_4

    .line 112
    .line 113
    shl-int/lit8 v12, v6, 0x3

    .line 114
    .line 115
    add-int/2addr v12, v11

    .line 116
    aget-object v13, v2, v12

    .line 117
    .line 118
    aget-object v12, v3, v12

    .line 119
    .line 120
    const-string v14, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"

    .line 121
    .line 122
    invoke-static {v13, v14}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    check-cast v13, LY/f1;

    .line 126
    .line 127
    invoke-virtual {v13}, LY/f1;->h()LY/b;

    .line 128
    .line 129
    .line 130
    move-result-object v14

    .line 131
    if-eqz v14, :cond_4

    .line 132
    .line 133
    invoke-virtual {v14}, LY/b;->a()I

    .line 134
    .line 135
    .line 136
    move-result v14

    .line 137
    iget-object v15, v0, LY/s;->u:Ljava/util/List;

    .line 138
    .line 139
    sget-object v5, LY/A1;->a:LY/A1;

    .line 140
    .line 141
    if-ne v12, v5, :cond_3

    .line 142
    .line 143
    const/4 v12, 0x0

    .line 144
    :cond_3
    new-instance v5, LY/k0;

    .line 145
    .line 146
    invoke-direct {v5, v13, v14, v12}, LY/k0;-><init>(LY/f1;ILjava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    invoke-interface {v15, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    :cond_4
    shr-long/2addr v7, v10

    .line 153
    add-int/lit8 v11, v11, 0x1

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_5
    if-ne v9, v10, :cond_7

    .line 157
    .line 158
    :cond_6
    if-eq v6, v4, :cond_7

    .line 159
    .line 160
    add-int/lit8 v6, v6, 0x1

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_7
    iget-object v1, v0, LY/s;->u:Ljava/util/List;

    .line 164
    .line 165
    invoke-static {}, LY/w;->i()Ljava/util/Comparator;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-static {v1, v2}, LUd/u;->B(Ljava/util/List;Ljava/util/Comparator;)V

    .line 170
    .line 171
    .line 172
    return-void
.end method

.method public E()Lk0/e;
    .locals 2

    .line 1
    iget-object v0, p0, LY/s;->X:Lk0/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LY/A;

    .line 6
    .line 7
    invoke-virtual {p0}, LY/s;->H0()LY/B;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, LY/A;-><init>(LY/x;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LY/s;->X:Lk0/e;

    .line 15
    .line 16
    :cond_0
    return-object v0
.end method

.method public F(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LY/s;->W0()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, LY/s;->I1(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1
.end method

.method public G()V
    .locals 3

    .line 1
    sget-object v0, LY/g0;->a:LY/g0$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/g0$a;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, -0x7f

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {p0, v1, v2, v0, v2}, LY/s;->v1(ILjava/lang/Object;ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final G0()Z
    .locals 1

    .line 1
    iget v0, p0, LY/s;->C:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public H(ILjava/lang/Object;)V
    .locals 2

    .line 1
    sget-object v0, LY/g0;->a:LY/g0$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/g0$a;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {p0, p1, p2, v0, v1}, LY/s;->v1(ILjava/lang/Object;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public H0()LY/B;
    .locals 1

    .line 1
    iget-object v0, p0, LY/s;->i:LY/B;

    .line 2
    .line 3
    return-object v0
.end method

.method public I()V
    .locals 3

    .line 1
    sget-object v0, LY/g0;->a:LY/g0$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/g0$a;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x7d

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {p0, v1, v2, v0, v2}, LY/s;->v1(ILjava/lang/Object;ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, LY/s;->t:Z

    .line 15
    .line 16
    return-void
.end method

.method public final I0()LY/f1;
    .locals 2

    .line 1
    iget-object v0, p0, LY/s;->G:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget v1, p0, LY/s;->C:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, LY/g2;->f(Ljava/util/ArrayList;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-static {v0}, LY/g2;->g(Ljava/util/ArrayList;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, LY/f1;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return-object v0
.end method

.method public final I1(Ljava/lang/Object;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LY/s;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LY/s;->L:LY/H1;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, LY/H1;->j1(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 14
    .line 15
    invoke-virtual {v0}, LY/D1;->r()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 22
    .line 23
    invoke-virtual {v0}, LY/D1;->q()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    add-int/lit8 v0, v0, -0x1

    .line 28
    .line 29
    iget-object v1, p0, LY/s;->P:LZ/b;

    .line 30
    .line 31
    invoke-virtual {v1}, LZ/b;->q()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-object v1, p0, LY/s;->P:LZ/b;

    .line 38
    .line 39
    iget-object v2, p0, LY/s;->J:LY/D1;

    .line 40
    .line 41
    invoke-virtual {v2}, LY/D1;->u()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-virtual {v2, v3}, LY/D1;->a(I)LY/b;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v1, p1, v2, v0}, LZ/b;->Z(Ljava/lang/Object;LY/b;I)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    iget-object v1, p0, LY/s;->P:LZ/b;

    .line 54
    .line 55
    invoke-virtual {v1, p1, v0}, LZ/b;->c0(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    iget-object v0, p0, LY/s;->P:LZ/b;

    .line 60
    .line 61
    iget-object v1, p0, LY/s;->J:LY/D1;

    .line 62
    .line 63
    invoke-virtual {v1}, LY/D1;->u()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-virtual {v1, v2}, LY/D1;->a(I)LY/b;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v0, v1, p1}, LZ/b;->a(LY/b;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public J(ILjava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LY/s;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 8
    .line 9
    invoke-virtual {v0}, LY/D1;->n()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ne v0, p1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 16
    .line 17
    invoke-virtual {v0}, LY/D1;->l()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    iget v0, p0, LY/s;->B:I

    .line 28
    .line 29
    if-gez v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 32
    .line 33
    invoke-virtual {v0}, LY/D1;->k()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iput v0, p0, LY/s;->B:I

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    iput-boolean v0, p0, LY/s;->A:Z

    .line 41
    .line 42
    :cond_0
    sget-object v0, LY/g0;->a:LY/g0$a;

    .line 43
    .line 44
    invoke-virtual {v0}, LY/g0$a;->a()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-direct {p0, p1, v1, v0, p2}, LY/s;->v1(ILjava/lang/Object;ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final J0()LZ/a;
    .locals 1

    .line 1
    iget-object v0, p0, LY/s;->O:LZ/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public K()V
    .locals 1

    .line 1
    iget v0, p0, LY/s;->m:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "No nodes can be emitted before calling skipAndEndGroup"

    .line 11
    .line 12
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-virtual {p0}, LY/s;->e()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_4

    .line 20
    .line 21
    invoke-virtual {p0}, LY/s;->I0()LY/f1;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0}, LY/f1;->C()V

    .line 28
    .line 29
    .line 30
    :cond_2
    iget-object v0, p0, LY/s;->u:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-direct {p0}, LY/s;->r1()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_3
    invoke-direct {p0}, LY/s;->g1()V

    .line 43
    .line 44
    .line 45
    :cond_4
    return-void
.end method

.method public final K0()Lk0/h;
    .locals 1

    .line 1
    iget-boolean v0, p0, LY/s;->E:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LY/s;->T:Lk0/h;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return-object v0
.end method

.method public L([LY/c1;)V
    .locals 6

    .line 1
    invoke-direct {p0}, LY/s;->n0()LY/U0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0xc9

    .line 6
    .line 7
    invoke-static {}, LY/w;->F()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {p0, v1, v2}, LY/s;->x1(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, LY/s;->e()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x1

    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-static {p1, v0, v4, v1, v4}, LY/J;->d([LY/c1;LY/U0;LY/U0;ILjava/lang/Object;)LY/U0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {p0, v0, p1}, LY/s;->G1(LY/U0;LY/U0;)LY/U0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-boolean v2, p0, LY/s;->M:Z

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    iget-object v1, p0, LY/s;->J:LY/D1;

    .line 36
    .line 37
    invoke-virtual {v1, v3}, LY/D1;->B(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"

    .line 42
    .line 43
    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    check-cast v1, LY/U0;

    .line 47
    .line 48
    iget-object v5, p0, LY/s;->J:LY/D1;

    .line 49
    .line 50
    invoke-virtual {v5, v2}, LY/D1;->B(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    check-cast v5, LY/U0;

    .line 58
    .line 59
    invoke-static {p1, v0, v5}, LY/J;->c([LY/c1;LY/U0;LY/U0;)LY/U0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p0}, LY/s;->i()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_2

    .line 68
    .line 69
    iget-boolean v4, p0, LY/s;->A:Z

    .line 70
    .line 71
    if-nez v4, :cond_2

    .line 72
    .line 73
    invoke-static {v5, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-nez v4, :cond_1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    invoke-direct {p0}, LY/s;->q1()V

    .line 81
    .line 82
    .line 83
    move-object p1, v1

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    :goto_0
    invoke-direct {p0, v0, p1}, LY/s;->G1(LY/U0;LY/U0;)LY/U0;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iget-boolean v0, p0, LY/s;->A:Z

    .line 90
    .line 91
    if-nez v0, :cond_4

    .line 92
    .line 93
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_3

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    move v2, v3

    .line 101
    :cond_4
    :goto_1
    move v3, v2

    .line 102
    :goto_2
    if-eqz v3, :cond_5

    .line 103
    .line 104
    invoke-virtual {p0}, LY/s;->e()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-nez v0, :cond_5

    .line 109
    .line 110
    invoke-direct {p0, p1}, LY/s;->j1(LY/U0;)V

    .line 111
    .line 112
    .line 113
    :cond_5
    iget-object v0, p0, LY/s;->z:LY/i0;

    .line 114
    .line 115
    iget-boolean v1, p0, LY/s;->y:Z

    .line 116
    .line 117
    invoke-static {v1}, LY/w;->f(Z)I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-virtual {v0, v1}, LY/i0;->h(I)V

    .line 122
    .line 123
    .line 124
    iput-boolean v3, p0, LY/s;->y:Z

    .line 125
    .line 126
    iput-object p1, p0, LY/s;->N:LY/U0;

    .line 127
    .line 128
    invoke-static {}, LY/w;->C()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    sget-object v1, LY/g0;->a:LY/g0$a;

    .line 133
    .line 134
    invoke-virtual {v1}, LY/g0$a;->a()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    const/16 v2, 0xca

    .line 139
    .line 140
    invoke-direct {p0, v2, v0, v1, p1}, LY/s;->v1(ILjava/lang/Object;ILjava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    return-void
.end method

.method public M()V
    .locals 1

    .line 1
    invoke-direct {p0}, LY/s;->w0()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LY/s;->w0()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LY/s;->z:LY/i0;

    .line 8
    .line 9
    invoke-virtual {v0}, LY/i0;->g()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, LY/w;->e(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput-boolean v0, p0, LY/s;->y:Z

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, LY/s;->N:LY/U0;

    .line 21
    .line 22
    return-void
.end method

.method public final M0()LY/D1;
    .locals 1

    .line 1
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 2
    .line 3
    return-object v0
.end method

.method public N()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LY/s;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean v0, p0, LY/s;->y:Z

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, LY/s;->I0()LY/f1;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, LY/f1;->k()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    return v0

    .line 27
    :cond_1
    :goto_0
    return v1
.end method

.method public O()V
    .locals 0

    .line 1
    invoke-direct {p0}, LY/s;->w0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public P(LY/c1;)V
    .locals 8

    .line 1
    invoke-direct {p0}, LY/s;->n0()LY/U0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0xc9

    .line 6
    .line 7
    invoke-static {}, LY/w;->F()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {p0, v1, v2}, LY/s;->x1(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, LY/s;->D()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sget-object v2, LY/m;->a:LY/m$a;

    .line 19
    .line 20
    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>"

    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    check-cast v1, LY/n2;

    .line 38
    .line 39
    :goto_0
    invoke-virtual {p1}, LY/c1;->b()LY/D;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>"

    .line 44
    .line 45
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>"

    .line 49
    .line 50
    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, p1, v1}, LY/D;->b(LY/c1;LY/n2;)LY/n2;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_1

    .line 62
    .line 63
    invoke-virtual {p0, v3}, LY/s;->u(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-virtual {p0}, LY/s;->e()Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    const/4 v5, 0x1

    .line 71
    const/4 v6, 0x0

    .line 72
    if-eqz v4, :cond_4

    .line 73
    .line 74
    invoke-virtual {p1}, LY/c1;->a()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_2

    .line 79
    .line 80
    invoke-static {v0, v2}, LY/J;->a(LY/U0;LY/D;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-nez p1, :cond_3

    .line 85
    .line 86
    :cond_2
    invoke-interface {v0, v2, v3}, LY/U0;->x(LY/D;LY/n2;)LY/U0;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    :cond_3
    iput-boolean v5, p0, LY/s;->M:Z

    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_4
    iget-object v4, p0, LY/s;->J:LY/D1;

    .line 94
    .line 95
    invoke-virtual {v4}, LY/D1;->k()I

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    invoke-virtual {v4, v7}, LY/D1;->A(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    const-string v7, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"

    .line 104
    .line 105
    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    check-cast v4, LY/U0;

    .line 109
    .line 110
    invoke-virtual {p0}, LY/s;->i()Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-eqz v7, :cond_5

    .line 115
    .line 116
    if-nez v1, :cond_6

    .line 117
    .line 118
    :cond_5
    invoke-virtual {p1}, LY/c1;->a()Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-nez p1, :cond_9

    .line 123
    .line 124
    invoke-static {v0, v2}, LY/J;->a(LY/U0;LY/D;)Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-nez p1, :cond_6

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_6
    if-eqz v1, :cond_7

    .line 132
    .line 133
    iget-boolean p1, p0, LY/s;->y:Z

    .line 134
    .line 135
    if-nez p1, :cond_7

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_7
    iget-boolean p1, p0, LY/s;->y:Z

    .line 139
    .line 140
    if-eqz p1, :cond_8

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_8
    :goto_1
    move-object v0, v4

    .line 144
    goto :goto_3

    .line 145
    :cond_9
    :goto_2
    invoke-interface {v0, v2, v3}, LY/U0;->x(LY/D;LY/n2;)LY/U0;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    :goto_3
    iget-boolean p1, p0, LY/s;->A:Z

    .line 150
    .line 151
    if-nez p1, :cond_b

    .line 152
    .line 153
    if-eq v4, v0, :cond_a

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_a
    move v5, v6

    .line 157
    :cond_b
    :goto_4
    move v6, v5

    .line 158
    :goto_5
    if-eqz v6, :cond_c

    .line 159
    .line 160
    invoke-virtual {p0}, LY/s;->e()Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-nez p1, :cond_c

    .line 165
    .line 166
    invoke-direct {p0, v0}, LY/s;->j1(LY/U0;)V

    .line 167
    .line 168
    .line 169
    :cond_c
    iget-object p1, p0, LY/s;->z:LY/i0;

    .line 170
    .line 171
    iget-boolean v1, p0, LY/s;->y:Z

    .line 172
    .line 173
    invoke-static {v1}, LY/w;->f(Z)I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    invoke-virtual {p1, v1}, LY/i0;->h(I)V

    .line 178
    .line 179
    .line 180
    iput-boolean v6, p0, LY/s;->y:Z

    .line 181
    .line 182
    iput-object v0, p0, LY/s;->N:LY/U0;

    .line 183
    .line 184
    invoke-static {}, LY/w;->C()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    sget-object v1, LY/g0;->a:LY/g0$a;

    .line 189
    .line 190
    invoke-virtual {v1}, LY/g0$a;->a()I

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    const/16 v2, 0xca

    .line 195
    .line 196
    invoke-direct {p0, v2, p1, v1, v0}, LY/s;->v1(ILjava/lang/Object;ILjava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    return-void
.end method

.method public R()LY/y;
    .locals 9

    .line 1
    const/16 v0, 0xce

    .line 2
    .line 3
    invoke-static {}, LY/w;->H()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {p0, v0, v1}, LY/s;->x1(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LY/s;->e()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, LY/s;->L:LY/H1;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x1

    .line 21
    invoke-static {v0, v2, v3, v1}, LY/H1;->r0(LY/H1;IILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, LY/s;->W0()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    instance-of v2, v0, LY/s$a;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    check-cast v0, LY/s$a;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v0, v1

    .line 36
    :goto_0
    if-nez v0, :cond_4

    .line 37
    .line 38
    new-instance v0, LY/s$a;

    .line 39
    .line 40
    new-instance v2, LY/s$b;

    .line 41
    .line 42
    invoke-virtual {p0}, LY/s;->o()J

    .line 43
    .line 44
    .line 45
    move-result-wide v4

    .line 46
    iget-boolean v6, p0, LY/s;->r:Z

    .line 47
    .line 48
    iget-boolean v7, p0, LY/s;->E:Z

    .line 49
    .line 50
    invoke-virtual {p0}, LY/s;->H0()LY/B;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move-object v3, v1

    .line 58
    :goto_1
    if-eqz v3, :cond_3

    .line 59
    .line 60
    invoke-virtual {v3}, LY/B;->O()LY/K;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    :cond_3
    move-object v3, p0

    .line 65
    move-object v8, v1

    .line 66
    invoke-direct/range {v2 .. v8}, LY/s$b;-><init>(LY/s;JZZLY/K;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {v0, v2}, LY/s$a;-><init>(LY/s$b;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0}, LY/s;->I1(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    move-object v3, p0

    .line 77
    :goto_2
    invoke-virtual {v0}, LY/s$a;->a()LY/s$b;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-direct {p0}, LY/s;->n0()LY/U0;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v1, v2}, LY/s$b;->A(LY/U0;)V

    .line 86
    .line 87
    .line 88
    invoke-direct {p0}, LY/s;->w0()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, LY/s$a;->a()LY/s$b;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    return-object v0
.end method

.method public R0(Ljava/util/List;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, LY/s;->O0(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LY/s;->i0()V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    invoke-direct {p0}, LY/s;->b0()V

    .line 10
    .line 11
    .line 12
    throw p1
.end method

.method public S()V
    .locals 0

    .line 1
    invoke-direct {p0}, LY/s;->w0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public T()V
    .locals 0

    .line 1
    invoke-direct {p0}, LY/s;->w0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public U(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LY/s;->W0()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, LY/s;->I1(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public V(I)V
    .locals 8

    .line 1
    iget-object v0, p0, LY/s;->k:LY/T0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v0, LY/g0;->a:LY/g0$a;

    .line 7
    .line 8
    invoke-virtual {v0}, LY/g0$a;->a()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-direct {p0, p1, v1, v0, v1}, LY/s;->v1(ILjava/lang/Object;ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-direct {p0}, LY/s;->L1()V

    .line 17
    .line 18
    .line 19
    iget v0, p0, LY/s;->n:I

    .line 20
    .line 21
    invoke-virtual {p0}, LY/s;->o()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    const/4 v4, 0x3

    .line 26
    invoke-static {v2, v3, v4}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    int-to-long v5, p1

    .line 31
    xor-long/2addr v2, v5

    .line 32
    invoke-static {v2, v3, v4}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    int-to-long v4, v0

    .line 37
    xor-long/2addr v2, v4

    .line 38
    iput-wide v2, p0, LY/s;->W:J

    .line 39
    .line 40
    iget v0, p0, LY/s;->n:I

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    add-int/2addr v0, v2

    .line 44
    iput v0, p0, LY/s;->n:I

    .line 45
    .line 46
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 47
    .line 48
    invoke-virtual {p0}, LY/s;->e()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const/4 v4, 0x0

    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    invoke-virtual {v0}, LY/D1;->c()V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, LY/s;->L:LY/H1;

    .line 59
    .line 60
    sget-object v2, LY/m;->a:LY/m$a;

    .line 61
    .line 62
    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v0, p1, v2}, LY/H1;->e1(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p0, v4, v1}, LY/s;->A0(ZLY/T0;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_1
    invoke-virtual {v0}, LY/D1;->n()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-ne v3, p1, :cond_2

    .line 78
    .line 79
    invoke-virtual {v0}, LY/D1;->s()Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-nez v3, :cond_2

    .line 84
    .line 85
    invoke-virtual {v0}, LY/D1;->W()V

    .line 86
    .line 87
    .line 88
    invoke-direct {p0, v4, v1}, LY/s;->A0(ZLY/T0;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_2
    invoke-virtual {v0}, LY/D1;->I()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-nez v3, :cond_3

    .line 97
    .line 98
    iget v3, p0, LY/s;->l:I

    .line 99
    .line 100
    invoke-virtual {v0}, LY/D1;->k()I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    invoke-direct {p0}, LY/s;->h1()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, LY/D1;->T()I

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    iget-object v7, p0, LY/s;->P:LZ/b;

    .line 112
    .line 113
    invoke-virtual {v7, v3, v6}, LZ/b;->Q(II)V

    .line 114
    .line 115
    .line 116
    iget-object v3, p0, LY/s;->u:Ljava/util/List;

    .line 117
    .line 118
    invoke-virtual {v0}, LY/D1;->k()I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    invoke-static {v3, v5, v6}, LY/w;->o(Ljava/util/List;II)V

    .line 123
    .line 124
    .line 125
    :cond_3
    invoke-virtual {v0}, LY/D1;->c()V

    .line 126
    .line 127
    .line 128
    iput-boolean v2, p0, LY/s;->V:Z

    .line 129
    .line 130
    iput-object v1, p0, LY/s;->N:LY/U0;

    .line 131
    .line 132
    invoke-direct {p0}, LY/s;->z0()V

    .line 133
    .line 134
    .line 135
    iget-object v0, p0, LY/s;->L:LY/H1;

    .line 136
    .line 137
    invoke-virtual {v0}, LY/H1;->F()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, LY/H1;->Z()I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    sget-object v3, LY/m;->a:LY/m$a;

    .line 145
    .line 146
    invoke-virtual {v3}, LY/m$a;->a()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v0, p1, v3}, LY/H1;->e1(ILjava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v2}, LY/H1;->B(I)LY/b;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    iput-object p1, p0, LY/s;->Q:LY/b;

    .line 158
    .line 159
    invoke-direct {p0, v4, v1}, LY/s;->A0(ZLY/T0;)V

    .line 160
    .line 161
    .line 162
    return-void
.end method

.method public final V0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY/s;->H:Z

    .line 2
    .line 3
    return v0
.end method

.method public final W0()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, LY/s;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, LY/s;->L1()V

    .line 8
    .line 9
    .line 10
    sget-object v0, LY/m;->a:LY/m$a;

    .line 11
    .line 12
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :cond_0
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 18
    .line 19
    invoke-virtual {v0}, LY/D1;->L()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-boolean v1, p0, LY/s;->A:Z

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    instance-of v1, v0, LY/z1;

    .line 28
    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    sget-object v0, LY/m;->a:LY/m$a;

    .line 32
    .line 33
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_1
    return-object v0
.end method

.method public final X0()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, LY/s;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, LY/s;->L1()V

    .line 8
    .line 9
    .line 10
    sget-object v0, LY/m;->a:LY/m$a;

    .line 11
    .line 12
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :cond_0
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 18
    .line 19
    invoke-virtual {v0}, LY/D1;->L()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-boolean v1, p0, LY/s;->A:Z

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    instance-of v1, v0, LY/z1;

    .line 28
    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    sget-object v0, LY/m;->a:LY/m$a;

    .line 32
    .line 33
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    :cond_1
    instance-of v1, v0, LY/w1;

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    check-cast v0, LY/w1;

    .line 43
    .line 44
    invoke-virtual {v0}, LY/w1;->b()LY/v1;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_2
    return-object v0
.end method

.method public a(Z)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LY/s;->W0()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ljava/lang/Boolean;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return p1

    .line 19
    :cond_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, LY/s;->I1(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    return p1
.end method

.method public final a1()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, LY/s;->c:LY/y;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/y;->h()LY/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, LY/B;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, LY/B;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :cond_1
    invoke-virtual {v0}, LY/B;->P()LY/E1;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, p0, LY/s;->c:LY/y;

    .line 27
    .line 28
    invoke-static {v1, v2}, Lk0/b;->e(LY/E1;LY/y;)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {v0}, LY/B;->P()LY/E1;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, LY/E1;->F()LY/D1;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v0, v1, v2}, Lk0/b;->g(LY/D1;ILjava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    invoke-virtual {v0}, LY/D1;->d()V

    .line 56
    .line 57
    .line 58
    return-object v1

    .line 59
    :catchall_0
    move-exception v1

    .line 60
    invoke-virtual {v0}, LY/D1;->d()V

    .line 61
    .line 62
    .line 63
    throw v1

    .line 64
    :cond_2
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0
.end method

.method public b(F)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LY/s;->W0()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ljava/lang/Float;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    cmpg-float v0, p1, v0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    return p1

    .line 21
    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, LY/s;->I1(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    return p1
.end method

.method public final b1(Lie/a;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LY/s;->H:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Preparing a composition while composing is not supported"

    .line 6
    .line 7
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, LY/s;->H:Z

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :try_start_0
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    iput-boolean v0, p0, LY/s;->H:Z

    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    iput-boolean v0, p0, LY/s;->H:Z

    .line 22
    .line 23
    throw p1
.end method

.method public c(I)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LY/s;->W0()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ljava/lang/Integer;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return p1

    .line 19
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, LY/s;->I1(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    return p1
.end method

.method public d(J)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LY/s;->W0()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ljava/lang/Long;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    cmp-long v0, p1, v0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    return p1

    .line 21
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, LY/s;->I1(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    return p1
.end method

.method public final d1(Lt/P;LY/C1;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LY/s;->f:LZ/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ/a;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "Expected applyChanges() to have been called"

    .line 10
    .line 11
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p1}, La0/g;->f(Lt/P;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-gtz v0, :cond_2

    .line 19
    .line 20
    iget-object v0, p0, LY/s;->u:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget-boolean v0, p0, LY/s;->s:Z

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 p1, 0x0

    .line 34
    return p1

    .line 35
    :cond_2
    :goto_0
    iput-object p2, p0, LY/s;->S:LY/C1;

    .line 36
    .line 37
    const/4 p2, 0x0

    .line 38
    :try_start_0
    invoke-direct {p0, p1, p2}, LY/s;->s0(Lt/P;Lkotlin/jvm/functions/Function2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    iput-object p2, p0, LY/s;->S:LY/C1;

    .line 42
    .line 43
    iget-object p1, p0, LY/s;->f:LZ/a;

    .line 44
    .line 45
    invoke-virtual {p1}, LZ/a;->d()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    return p1

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    iput-object p2, p0, LY/s;->S:LY/C1;

    .line 52
    .line 53
    throw p1
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY/s;->V:Z

    .line 2
    .line 3
    return v0
.end method

.method public f(Z)V
    .locals 2

    .line 1
    iget v0, p0, LY/s;->m:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "No nodes can be emitted before calling dactivateToEndGroup"

    .line 11
    .line 12
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-virtual {p0}, LY/s;->e()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_3

    .line 20
    .line 21
    if-nez p1, :cond_2

    .line 22
    .line 23
    invoke-direct {p0}, LY/s;->r1()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_2
    iget-object p1, p0, LY/s;->J:LY/D1;

    .line 28
    .line 29
    invoke-virtual {p1}, LY/D1;->k()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 34
    .line 35
    invoke-virtual {v0}, LY/D1;->j()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget-object v1, p0, LY/s;->P:LZ/b;

    .line 40
    .line 41
    invoke-virtual {v1}, LZ/b;->d()V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, LY/s;->u:Ljava/util/List;

    .line 45
    .line 46
    invoke-static {v1, p1, v0}, LY/w;->o(Ljava/util/List;II)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, LY/s;->J:LY/D1;

    .line 50
    .line 51
    invoke-virtual {p1}, LY/D1;->U()V

    .line 52
    .line 53
    .line 54
    :cond_3
    return-void
.end method

.method public g(I)LY/m;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LY/s;->V(I)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LY/s;->g0()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public h(Lie/a;)V
    .locals 3

    .line 1
    invoke-direct {p0}, LY/s;->K1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LY/s;->e()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "createNode() can only be called when inserting"

    .line 11
    .line 12
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, LY/s;->o:LY/i0;

    .line 16
    .line 17
    invoke-virtual {v0}, LY/i0;->c()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object v1, p0, LY/s;->L:LY/H1;

    .line 22
    .line 23
    invoke-virtual {v1}, LY/H1;->a0()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {v1, v2}, LY/H1;->B(I)LY/b;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, p0, LY/s;->m:I

    .line 32
    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    iput v2, p0, LY/s;->m:I

    .line 36
    .line 37
    iget-object v2, p0, LY/s;->R:LZ/c;

    .line 38
    .line 39
    invoke-virtual {v2, p1, v0, v1}, LZ/c;->b(Lie/a;ILY/b;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final h0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LY/s;->x:Lt/F;

    .line 3
    .line 4
    return-void
.end method

.method public i()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LY/s;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, LY/s;->A:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-boolean v0, p0, LY/s;->y:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, LY/s;->I0()LY/f1;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, LY/f1;->n()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    iget-boolean v0, p0, LY/s;->s:Z

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    return v0

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    return v0
.end method

.method public j()LY/d;
    .locals 1

    .line 1
    iget-object v0, p0, LY/s;->b:LY/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()LY/B1;
    .locals 6

    .line 1
    iget-object v0, p0, LY/s;->G:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, LY/g2;->f(Ljava/util/ArrayList;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LY/s;->G:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-static {v0}, LY/g2;->i(Ljava/util/ArrayList;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, LY/f1;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, v1

    .line 20
    :goto_0
    const/4 v2, 0x0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0, v2}, LY/f1;->I(Z)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0}, LY/s;->D0(LY/f1;)Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    iget-object v4, p0, LY/s;->P:LZ/b;

    .line 33
    .line 34
    invoke-virtual {p0}, LY/s;->H0()LY/B;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v4, v3, v5}, LZ/b;->f(Lkotlin/jvm/functions/Function1;LY/x;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {v0}, LY/f1;->q()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    invoke-virtual {v0, v2}, LY/f1;->L(Z)V

    .line 48
    .line 49
    .line 50
    iget-object v3, p0, LY/s;->P:LZ/b;

    .line 51
    .line 52
    invoke-virtual {v3, v0}, LZ/b;->j(LY/f1;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v2}, LY/f1;->M(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, LY/f1;->p()Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0, v2}, LY/f1;->K(Z)V

    .line 65
    .line 66
    .line 67
    iput-boolean v2, p0, LY/s;->A:Z

    .line 68
    .line 69
    :cond_2
    if-eqz v0, :cond_6

    .line 70
    .line 71
    invoke-virtual {v0}, LY/f1;->s()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-nez v3, :cond_6

    .line 76
    .line 77
    invoke-virtual {v0}, LY/f1;->t()Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-nez v3, :cond_3

    .line 82
    .line 83
    iget-boolean v3, p0, LY/s;->r:Z

    .line 84
    .line 85
    if-eqz v3, :cond_6

    .line 86
    .line 87
    :cond_3
    invoke-virtual {v0}, LY/f1;->h()LY/b;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    if-nez v1, :cond_5

    .line 92
    .line 93
    invoke-virtual {p0}, LY/s;->e()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_4

    .line 98
    .line 99
    iget-object v1, p0, LY/s;->L:LY/H1;

    .line 100
    .line 101
    invoke-virtual {v1}, LY/H1;->a0()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    invoke-virtual {v1, v3}, LY/H1;->B(I)LY/b;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    goto :goto_1

    .line 110
    :cond_4
    iget-object v1, p0, LY/s;->J:LY/D1;

    .line 111
    .line 112
    invoke-virtual {v1}, LY/D1;->u()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    invoke-virtual {v1, v3}, LY/D1;->a(I)LY/b;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    :goto_1
    invoke-virtual {v0, v1}, LY/f1;->D(LY/b;)V

    .line 121
    .line 122
    .line 123
    :cond_5
    invoke-virtual {v0, v2}, LY/f1;->F(Z)V

    .line 124
    .line 125
    .line 126
    move-object v1, v0

    .line 127
    :cond_6
    invoke-direct {p0, v2}, LY/s;->v0(Z)V

    .line 128
    .line 129
    .line 130
    return-object v1
.end method

.method public final k0(Lt/P;Lkotlin/jvm/functions/Function2;LY/C1;)V
    .locals 1

    .line 1
    iget-object v0, p0, LY/s;->f:LZ/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ/a;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "Expected applyChanges() to have been called"

    .line 10
    .line 11
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iput-object p3, p0, LY/s;->S:LY/C1;

    .line 15
    .line 16
    const/4 p3, 0x0

    .line 17
    :try_start_0
    invoke-direct {p0, p1, p2}, LY/s;->s0(Lt/P;Lkotlin/jvm/functions/Function2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    iput-object p3, p0, LY/s;->S:LY/C1;

    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    iput-object p3, p0, LY/s;->S:LY/C1;

    .line 25
    .line 26
    throw p1
.end method

.method public l()V
    .locals 3

    .line 1
    sget-object v0, LY/g0;->a:LY/g0$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/g0$a;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x7d

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {p0, v1, v2, v0, v2}, LY/s;->v1(ILjava/lang/Object;ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, LY/s;->t:Z

    .line 15
    .line 16
    return-void
.end method

.method public m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LY/s;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LY/s;->R:LZ/c;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, LZ/c;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, LY/s;->P:LZ/b;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, LZ/b;->b0(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public n(LY/D;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-direct {p0}, LY/s;->n0()LY/U0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, LY/J;->b(LY/U0;LY/D;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public o()J
    .locals 2

    .line 1
    iget-wide v0, p0, LY/s;->W:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public p(ZI)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p2, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p2, :cond_4

    .line 5
    .line 6
    invoke-virtual {p0}, LY/s;->e()Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    iget-boolean p2, p0, LY/s;->A:Z

    .line 13
    .line 14
    if-eqz p2, :cond_4

    .line 15
    .line 16
    :cond_0
    iget-object p1, p0, LY/s;->S:LY/C1;

    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    return v0

    .line 21
    :cond_1
    invoke-virtual {p0}, LY/s;->I0()LY/f1;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    if-nez p2, :cond_2

    .line 26
    .line 27
    return v0

    .line 28
    :cond_2
    invoke-interface {p1}, LY/C1;->a()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    invoke-virtual {p2, v0}, LY/f1;->O(Z)V

    .line 35
    .line 36
    .line 37
    iget-boolean p1, p0, LY/s;->A:Z

    .line 38
    .line 39
    invoke-virtual {p2, p1}, LY/f1;->M(Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, v0}, LY/f1;->H(Z)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, LY/s;->P:LZ/b;

    .line 46
    .line 47
    invoke-virtual {p1, p2}, LZ/b;->O(LY/f1;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, LY/s;->c:LY/y;

    .line 51
    .line 52
    invoke-virtual {p1, p2}, LY/y;->r(LY/f1;)V

    .line 53
    .line 54
    .line 55
    return v1

    .line 56
    :cond_3
    return v0

    .line 57
    :cond_4
    if-nez p1, :cond_6

    .line 58
    .line 59
    invoke-virtual {p0}, LY/s;->i()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-nez p1, :cond_5

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_5
    return v1

    .line 67
    :cond_6
    :goto_0
    return v0
.end method

.method public p1()V
    .locals 13

    .line 1
    iget-object v0, p0, LY/s;->u:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, LY/s;->q1()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 14
    .line 15
    invoke-virtual {v0}, LY/D1;->n()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {v0}, LY/D1;->o()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0}, LY/D1;->l()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget v4, p0, LY/s;->n:I

    .line 28
    .line 29
    const/16 v5, 0xcf

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x3

    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    if-ne v1, v5, :cond_1

    .line 38
    .line 39
    sget-object v8, LY/m;->a:LY/m$a;

    .line 40
    .line 41
    invoke-virtual {v8}, LY/m$a;->a()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    invoke-static {v3, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    if-nez v8, :cond_1

    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    invoke-virtual {p0}, LY/s;->o()J

    .line 56
    .line 57
    .line 58
    move-result-wide v9

    .line 59
    invoke-static {v9, v10, v7}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 60
    .line 61
    .line 62
    move-result-wide v9

    .line 63
    int-to-long v11, v8

    .line 64
    xor-long v8, v9, v11

    .line 65
    .line 66
    invoke-static {v8, v9, v7}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 67
    .line 68
    .line 69
    move-result-wide v8

    .line 70
    int-to-long v10, v4

    .line 71
    xor-long/2addr v8, v10

    .line 72
    iput-wide v8, p0, LY/s;->W:J

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_1
    invoke-virtual {p0}, LY/s;->o()J

    .line 76
    .line 77
    .line 78
    move-result-wide v8

    .line 79
    invoke-static {v8, v9, v7}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 80
    .line 81
    .line 82
    move-result-wide v8

    .line 83
    int-to-long v10, v1

    .line 84
    xor-long/2addr v8, v10

    .line 85
    invoke-static {v8, v9, v7}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 86
    .line 87
    .line 88
    move-result-wide v8

    .line 89
    int-to-long v10, v4

    .line 90
    :goto_0
    xor-long/2addr v8, v10

    .line 91
    iput-wide v8, p0, LY/s;->W:J

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_2
    instance-of v8, v2, Ljava/lang/Enum;

    .line 95
    .line 96
    if-eqz v8, :cond_3

    .line 97
    .line 98
    move-object v8, v2

    .line 99
    check-cast v8, Ljava/lang/Enum;

    .line 100
    .line 101
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    :goto_1
    invoke-virtual {p0}, LY/s;->o()J

    .line 106
    .line 107
    .line 108
    move-result-wide v9

    .line 109
    invoke-static {v9, v10, v7}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 110
    .line 111
    .line 112
    move-result-wide v9

    .line 113
    int-to-long v11, v8

    .line 114
    xor-long v8, v9, v11

    .line 115
    .line 116
    invoke-static {v8, v9, v7}, Ljava/lang/Long;->rotateLeft(JI)J

    .line 117
    .line 118
    .line 119
    move-result-wide v8

    .line 120
    int-to-long v10, v6

    .line 121
    goto :goto_0

    .line 122
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    goto :goto_1

    .line 127
    :goto_2
    invoke-virtual {v0}, LY/D1;->J()Z

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    const/4 v9, 0x0

    .line 132
    invoke-direct {p0, v8, v9}, LY/s;->y1(ZLjava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-direct {p0}, LY/s;->g1()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, LY/D1;->g()V

    .line 139
    .line 140
    .line 141
    if-nez v2, :cond_5

    .line 142
    .line 143
    if-eqz v3, :cond_4

    .line 144
    .line 145
    if-ne v1, v5, :cond_4

    .line 146
    .line 147
    sget-object v0, LY/m;->a:LY/m$a;

    .line 148
    .line 149
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-nez v0, :cond_4

    .line 158
    .line 159
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    invoke-virtual {p0}, LY/s;->o()J

    .line 164
    .line 165
    .line 166
    move-result-wide v1

    .line 167
    int-to-long v3, v4

    .line 168
    xor-long/2addr v1, v3

    .line 169
    invoke-static {v1, v2, v7}, Ljava/lang/Long;->rotateRight(JI)J

    .line 170
    .line 171
    .line 172
    move-result-wide v1

    .line 173
    int-to-long v3, v0

    .line 174
    xor-long v0, v1, v3

    .line 175
    .line 176
    invoke-static {v0, v1, v7}, Ljava/lang/Long;->rotateRight(JI)J

    .line 177
    .line 178
    .line 179
    move-result-wide v0

    .line 180
    iput-wide v0, p0, LY/s;->W:J

    .line 181
    .line 182
    return-void

    .line 183
    :cond_4
    invoke-virtual {p0}, LY/s;->o()J

    .line 184
    .line 185
    .line 186
    move-result-wide v2

    .line 187
    int-to-long v4, v4

    .line 188
    xor-long/2addr v2, v4

    .line 189
    invoke-static {v2, v3, v7}, Ljava/lang/Long;->rotateRight(JI)J

    .line 190
    .line 191
    .line 192
    move-result-wide v2

    .line 193
    int-to-long v0, v1

    .line 194
    xor-long/2addr v0, v2

    .line 195
    invoke-static {v0, v1, v7}, Ljava/lang/Long;->rotateRight(JI)J

    .line 196
    .line 197
    .line 198
    move-result-wide v0

    .line 199
    iput-wide v0, p0, LY/s;->W:J

    .line 200
    .line 201
    return-void

    .line 202
    :cond_5
    instance-of v0, v2, Ljava/lang/Enum;

    .line 203
    .line 204
    if-eqz v0, :cond_6

    .line 205
    .line 206
    check-cast v2, Ljava/lang/Enum;

    .line 207
    .line 208
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    invoke-virtual {p0}, LY/s;->o()J

    .line 213
    .line 214
    .line 215
    move-result-wide v1

    .line 216
    int-to-long v3, v6

    .line 217
    xor-long/2addr v1, v3

    .line 218
    invoke-static {v1, v2, v7}, Ljava/lang/Long;->rotateRight(JI)J

    .line 219
    .line 220
    .line 221
    move-result-wide v1

    .line 222
    int-to-long v3, v0

    .line 223
    xor-long v0, v1, v3

    .line 224
    .line 225
    invoke-static {v0, v1, v7}, Ljava/lang/Long;->rotateRight(JI)J

    .line 226
    .line 227
    .line 228
    move-result-wide v0

    .line 229
    iput-wide v0, p0, LY/s;->W:J

    .line 230
    .line 231
    return-void

    .line 232
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    invoke-virtual {p0}, LY/s;->o()J

    .line 237
    .line 238
    .line 239
    move-result-wide v1

    .line 240
    int-to-long v3, v6

    .line 241
    xor-long/2addr v1, v3

    .line 242
    invoke-static {v1, v2, v7}, Ljava/lang/Long;->rotateRight(JI)J

    .line 243
    .line 244
    .line 245
    move-result-wide v1

    .line 246
    int-to-long v3, v0

    .line 247
    xor-long v0, v1, v3

    .line 248
    .line 249
    invoke-static {v0, v1, v7}, Ljava/lang/Long;->rotateRight(JI)J

    .line 250
    .line 251
    .line 252
    move-result-wide v0

    .line 253
    iput-wide v0, p0, LY/s;->W:J

    .line 254
    .line 255
    return-void
.end method

.method public q()LZd/i;
    .locals 1

    .line 1
    iget-object v0, p0, LY/s;->U:LZd/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q0()V
    .locals 1

    .line 1
    iget-object v0, p0, LY/s;->G:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, LY/g2;->a(Ljava/util/ArrayList;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY/s;->u:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LY/s;->f:LZ/a;

    .line 12
    .line 13
    invoke-virtual {v0}, LZ/a;->a()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, LY/s;->x:Lt/F;

    .line 18
    .line 19
    return-void
.end method

.method public r()LY/I;
    .locals 1

    .line 1
    invoke-direct {p0}, LY/s;->n0()LY/U0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final r0()V
    .locals 3

    .line 1
    sget-object v0, Lg0/x;->a:Lg0/x;

    .line 2
    .line 3
    const-string v1, "Compose:Composer.dispose"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lg0/x;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :try_start_0
    iget-object v2, p0, LY/s;->c:LY/y;

    .line 10
    .line 11
    invoke-virtual {v2, p0}, LY/y;->u(LY/m;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, LY/s;->q0()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, LY/s;->j()LY/d;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, LY/d;->clear()V

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    iput-boolean v2, p0, LY/s;->I:Z

    .line 26
    .line 27
    sget-object v2, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lg0/x;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    sget-object v2, Lg0/x;->a:Lg0/x;

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Lg0/x;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    throw v0
.end method

.method public s()V
    .locals 2

    .line 1
    invoke-direct {p0}, LY/s;->K1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LY/s;->e()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "useNode() called while inserting"

    .line 11
    .line 12
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, LY/s;->J:LY/D1;

    .line 16
    .line 17
    invoke-direct {p0, v0}, LY/s;->L0(LY/D1;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, LY/s;->P:LZ/b;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, LZ/b;->w(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-boolean v1, p0, LY/s;->A:Z

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    instance-of v1, v0, LY/i;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iget-object v1, p0, LY/s;->P:LZ/b;

    .line 35
    .line 36
    invoke-virtual {v1, v0}, LZ/b;->d0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public t(Lie/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, LY/s;->P:LZ/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LZ/b;->V(Lie/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public u(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LY/s;->C1(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final u1(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    .line 1
    iget-boolean v0, p0, LY/s;->E:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-object v0, p0, LY/s;->d:LY/E1;

    .line 11
    .line 12
    new-instance v1, LY/q;

    .line 13
    .line 14
    invoke-direct {v1, p1}, LY/q;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lk0/b;->d(LY/E1;Lkotlin/jvm/functions/Function1;)Lk0/q;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Lk0/q;->a()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p1}, Lk0/q;->b()Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {p0, v0, p1}, LY/s;->s1(ILjava/lang/Integer;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0}, LY/s;->a1()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {p1, v0}, LUd/u;->I0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_1
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
.end method

.method public v(LY/d1;)V
    .locals 1

    .line 1
    instance-of v0, p1, LY/f1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LY/f1;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-eqz p1, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-virtual {p1, v0}, LY/f1;->O(Z)V

    .line 13
    .line 14
    .line 15
    :cond_1
    return-void
.end method

.method public w()V
    .locals 1

    .line 1
    invoke-direct {p0}, LY/s;->w0()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LY/s;->w0()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LY/s;->z:LY/i0;

    .line 8
    .line 9
    invoke-virtual {v0}, LY/i0;->g()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, LY/w;->e(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput-boolean v0, p0, LY/s;->y:Z

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, LY/s;->N:LY/U0;

    .line 21
    .line 22
    return-void
.end method

.method public x()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, LY/s;->v0(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final x0()V
    .locals 3

    .line 1
    iget-boolean v0, p0, LY/s;->H:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, LY/s;->B:I

    .line 7
    .line 8
    const/16 v2, 0x64

    .line 9
    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, v1

    .line 15
    :goto_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-string v0, "Cannot disable reuse from root if it was caused by other groups"

    .line 18
    .line 19
    invoke-static {v0}, LY/V0;->a(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    const/4 v0, -0x1

    .line 23
    iput v0, p0, LY/s;->B:I

    .line 24
    .line 25
    iput-boolean v1, p0, LY/s;->A:Z

    .line 26
    .line 27
    return-void
.end method

.method public y()V
    .locals 2

    .line 1
    invoke-direct {p0}, LY/s;->w0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LY/s;->I0()LY/f1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, LY/f1;->t()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {v0, v1}, LY/f1;->E(Z)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public z()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LY/s;->r:Z

    .line 3
    .line 4
    iput-boolean v0, p0, LY/s;->E:Z

    .line 5
    .line 6
    iget-object v0, p0, LY/s;->d:LY/E1;

    .line 7
    .line 8
    invoke-virtual {v0}, LY/E1;->l()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LY/s;->K:LY/E1;

    .line 12
    .line 13
    invoke-virtual {v0}, LY/E1;->l()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LY/s;->L:LY/H1;

    .line 17
    .line 18
    invoke-virtual {v0}, LY/H1;->s1()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final z1()V
    .locals 1

    .line 1
    const/16 v0, 0x64

    .line 2
    .line 3
    iput v0, p0, LY/s;->B:I

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LY/s;->A:Z

    .line 7
    .line 8
    return-void
.end method
