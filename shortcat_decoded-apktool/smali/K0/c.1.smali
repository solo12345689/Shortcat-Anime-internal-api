.class public final LK0/c;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/E;
.implements LK0/t;
.implements LK0/A0;
.implements LK0/v0;
.implements LJ0/h;
.implements LJ0/k;
.implements LK0/s0;
.implements LK0/D;
.implements LK0/v;
.implements Lq0/d;
.implements Lq0/k;
.implements Lq0/m;
.implements LK0/q0;
.implements Lp0/d;


# instance fields
.field private a:Landroidx/compose/ui/e$b;

.field private b:Z

.field private c:LJ0/a;

.field private d:Ljava/util/HashSet;

.field private e:LI0/p;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/e$b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LK0/h0;->f(Landroidx/compose/ui/e$b;)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p0, v0}, Landroidx/compose/ui/e$c;->setKindSet$ui_release(I)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, LK0/c;->b:Z

    .line 15
    .line 16
    new-instance p1, Ljava/util/HashSet;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, LK0/c;->d:Ljava/util/HashSet;

    .line 22
    .line 23
    return-void
.end method

.method private final G1(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "initializeModifier called on unattached node"

    .line 8
    .line 9
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 13
    .line 14
    const/16 v1, 0x20

    .line 15
    .line 16
    invoke-static {v1}, LK0/g0;->a(I)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    and-int/2addr v1, v2

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    instance-of v1, v0, LJ0/d;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    new-instance v1, LK0/c$a;

    .line 32
    .line 33
    invoke-direct {v1, p0}, LK0/c$a;-><init>(LK0/c;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v1}, Landroidx/compose/ui/e$c;->sideEffect(Lie/a;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    instance-of v1, v0, LJ0/j;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    move-object v1, v0

    .line 44
    check-cast v1, LJ0/j;

    .line 45
    .line 46
    invoke-direct {p0, v1}, LK0/c;->L1(LJ0/j;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    const/4 v1, 0x4

    .line 50
    invoke-static {v1}, LK0/g0;->a(I)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    and-int/2addr v1, v2

    .line 59
    if-eqz v1, :cond_3

    .line 60
    .line 61
    if-nez p1, :cond_3

    .line 62
    .line 63
    invoke-static {p0}, LK0/H;->a(LK0/E;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    const/4 v1, 0x2

    .line 67
    invoke-static {v1}, LK0/g0;->a(I)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    and-int/2addr v1, v2

    .line 76
    if-eqz v1, :cond_5

    .line 77
    .line 78
    invoke-static {p0}, LK0/d;->c(LK0/c;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_4

    .line 83
    .line 84
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getCoordinator$ui_release()LK0/e0;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    move-object v2, v1

    .line 92
    check-cast v2, LK0/F;

    .line 93
    .line 94
    invoke-virtual {v2, p0}, LK0/F;->O3(LK0/E;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, LK0/e0;->e3()V

    .line 98
    .line 99
    .line 100
    :cond_4
    if-nez p1, :cond_5

    .line 101
    .line 102
    invoke-static {p0}, LK0/H;->a(LK0/E;)V

    .line 103
    .line 104
    .line 105
    invoke-static {p0}, LK0/k;->n(LK0/j;)LK0/J;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p1}, LK0/J;->R0()V

    .line 110
    .line 111
    .line 112
    :cond_5
    instance-of p1, v0, LI0/L;

    .line 113
    .line 114
    if-eqz p1, :cond_6

    .line 115
    .line 116
    move-object p1, v0

    .line 117
    check-cast p1, LI0/L;

    .line 118
    .line 119
    invoke-static {p0}, LK0/k;->n(LK0/j;)LK0/J;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-interface {p1, v1}, LI0/L;->d(LI0/K;)V

    .line 124
    .line 125
    .line 126
    :cond_6
    const/16 p1, 0x80

    .line 127
    .line 128
    invoke-static {p1}, LK0/g0;->a(I)I

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 132
    .line 133
    .line 134
    const/16 p1, 0x100

    .line 135
    .line 136
    invoke-static {p1}, LK0/g0;->a(I)I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    and-int/2addr p1, v1

    .line 145
    if-eqz p1, :cond_7

    .line 146
    .line 147
    instance-of p1, v0, LI0/G;

    .line 148
    .line 149
    if-eqz p1, :cond_7

    .line 150
    .line 151
    invoke-static {p0}, LK0/d;->c(LK0/c;)Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-eqz p1, :cond_7

    .line 156
    .line 157
    invoke-static {p0}, LK0/k;->n(LK0/j;)LK0/J;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {p1}, LK0/J;->R0()V

    .line 162
    .line 163
    .line 164
    :cond_7
    const/16 p1, 0x10

    .line 165
    .line 166
    invoke-static {p1}, LK0/g0;->a(I)I

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    and-int/2addr p1, v1

    .line 175
    if-eqz p1, :cond_8

    .line 176
    .line 177
    instance-of p1, v0, LE0/J;

    .line 178
    .line 179
    if-eqz p1, :cond_8

    .line 180
    .line 181
    check-cast v0, LE0/J;

    .line 182
    .line 183
    invoke-interface {v0}, LE0/J;->g()LE0/I;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getCoordinator$ui_release()LK0/e0;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {p1, v0}, LE0/I;->f(LI0/p;)V

    .line 192
    .line 193
    .line 194
    :cond_8
    const/16 p1, 0x8

    .line 195
    .line 196
    invoke-static {p1}, LK0/g0;->a(I)I

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    and-int/2addr p1, v0

    .line 205
    if-eqz p1, :cond_9

    .line 206
    .line 207
    invoke-static {p0}, LK0/k;->o(LK0/j;)LK0/p0;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-interface {p1}, LK0/p0;->H()V

    .line 212
    .line 213
    .line 214
    :cond_9
    return-void
.end method

.method private final J1()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "unInitializeModifier called on unattached node"

    .line 8
    .line 9
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 13
    .line 14
    const/16 v1, 0x20

    .line 15
    .line 16
    invoke-static {v1}, LK0/g0;->a(I)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    and-int/2addr v1, v2

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    instance-of v1, v0, LJ0/j;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-static {p0}, LK0/k;->o(LK0/j;)LK0/p0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, LK0/p0;->getModifierLocalManager()LJ0/f;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    move-object v2, v0

    .line 40
    check-cast v2, LJ0/j;

    .line 41
    .line 42
    invoke-interface {v2}, LJ0/j;->getKey()LJ0/l;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v1, p0, v2}, LJ0/f;->d(LK0/c;LJ0/c;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    instance-of v1, v0, LJ0/d;

    .line 50
    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    check-cast v0, LJ0/d;

    .line 54
    .line 55
    invoke-static {}, LK0/d;->a()LK0/d$a;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v0, v1}, LJ0/d;->f(LJ0/k;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    const/16 v0, 0x8

    .line 63
    .line 64
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    and-int/2addr v0, v1

    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    invoke-static {p0}, LK0/k;->o(LK0/j;)LK0/p0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-interface {v0}, LK0/p0;->H()V

    .line 80
    .line 81
    .line 82
    :cond_3
    return-void
.end method

.method private final L1(LJ0/j;)V
    .locals 2

    .line 1
    iget-object v0, p0, LK0/c;->c:LJ0/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {p1}, LJ0/j;->getKey()LJ0/l;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, LJ0/a;->a(LJ0/c;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p1}, LJ0/a;->c(LJ0/j;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, LK0/k;->o(LK0/j;)LK0/p0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, LK0/p0;->getModifierLocalManager()LJ0/f;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {p1}, LJ0/j;->getKey()LJ0/l;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {v0, p0, p1}, LJ0/f;->f(LK0/c;LJ0/c;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    new-instance v0, LJ0/a;

    .line 35
    .line 36
    invoke-direct {v0, p1}, LJ0/a;-><init>(LJ0/j;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, LK0/c;->c:LJ0/a;

    .line 40
    .line 41
    invoke-static {p0}, LK0/d;->c(LK0/c;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-static {p0}, LK0/k;->o(LK0/j;)LK0/p0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-interface {v0}, LK0/p0;->getModifierLocalManager()LJ0/f;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-interface {p1}, LJ0/j;->getKey()LJ0/l;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {v0, p0, p1}, LJ0/f;->a(LK0/c;LJ0/c;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    return-void
.end method


# virtual methods
.method public final E1()Landroidx/compose/ui/e$b;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F1()Ljava/util/HashSet;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/c;->d:Ljava/util/HashSet;

    .line 2
    .line 3
    return-object v0
.end method

.method public final H1()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LK0/c;->b:Z

    .line 3
    .line 4
    invoke-static {p0}, LK0/u;->a(LK0/t;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public I(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final I1(Landroidx/compose/ui/e$b;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, LK0/c;->J1()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iput-object p1, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 11
    .line 12
    invoke-static {p1}, LK0/h0;->f(Landroidx/compose/ui/e$b;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {p0, p1}, Landroidx/compose/ui/e$c;->setKindSet$ui_release(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-direct {p0, p1}, LK0/c;->G1(Z)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public J0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final K1()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LK0/c;->d:Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, LK0/k;->o(LK0/j;)LK0/p0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, LK0/p0;->getSnapshotObserver()LK0/r0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {}, LK0/d;->b()Lkotlin/jvm/functions/Function1;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, LK0/c$b;

    .line 25
    .line 26
    invoke-direct {v2, p0}, LK0/c$b;-><init>(LK0/c;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p0, v1, v2}, LK0/r0;->i(LK0/q0;Lkotlin/jvm/functions/Function1;Lie/a;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public L(LI0/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/c;->e:LI0/p;

    .line 2
    .line 3
    return-void
.end method

.method public P0(Landroidx/compose/ui/focus/i;)V
    .locals 2

    .line 1
    iget-object v0, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 2
    .line 3
    const-string v1, "applyFocusProperties called on wrong node"

    .line 4
    .line 5
    invoke-static {v1}, LH0/a;->b(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lq0/i;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lq0/i;-><init>(Landroidx/compose/ui/focus/i;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    throw p1
.end method

.method public S(LE0/q;LE0/s;J)V
    .locals 2

    .line 1
    iget-object v0, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, LE0/J;

    .line 9
    .line 10
    invoke-interface {v0}, LE0/J;->g()LE0/I;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1, p2, p3, p4}, LE0/I;->e(LE0/q;LE0/s;J)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public W0(Lq0/n;)V
    .locals 1

    .line 1
    iget-object p1, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 2
    .line 3
    const-string v0, "onFocusEvent called on wrong node"

    .line 4
    .line 5
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    throw p1
.end method

.method public Y(LR0/C;)V
    .locals 2

    .line 1
    iget-object v0, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, LR0/q;

    .line 9
    .line 10
    invoke-interface {v0}, LR0/q;->e()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration"

    .line 15
    .line 16
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    check-cast p1, Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->d(Landroidx/compose/ui/semantics/SemanticsConfiguration;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public a1()V
    .locals 2

    .line 1
    iget-object v0, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, LE0/J;

    .line 9
    .line 10
    invoke-interface {v0}, LE0/J;->g()LE0/I;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, LE0/I;->d()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public b(Li1/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, LI0/H;

    .line 9
    .line 10
    invoke-interface {v0, p1, p2}, LI0/H;->b(Li1/d;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public draw(Lu0/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Lp0/i;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Lp0/i;->draw(Lu0/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public f()J
    .locals 2

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p0, v0}, LK0/k;->i(LK0/j;I)LK0/e0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LK0/e0;->a()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-static {v0, v1}, Li1/s;->d(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    return-wide v0
.end method

.method public f0()Z
    .locals 2

    .line 1
    iget-object v0, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, LE0/J;

    .line 9
    .line 10
    invoke-interface {v0}, LE0/J;->g()LE0/I;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, LE0/I;->a()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public getDensity()Li1/d;
    .locals 1

    .line 1
    invoke-static {p0}, LK0/k;->n(LK0/j;)LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/J;->R()Li1/d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getLayoutDirection()Li1/t;
    .locals 1

    .line 1
    invoke-static {p0}, LK0/k;->n(LK0/j;)LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/J;->getLayoutDirection()Li1/t;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public h0()LJ0/g;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/c;->c:LJ0/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-static {}, LJ0/i;->a()LJ0/g;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public j(LJ0/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, LK0/c;->d:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x20

    .line 7
    .line 8
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    const-string v1, "visitAncestors called on an unattached node"

    .line 23
    .line 24
    invoke-static {v1}, LH0/a;->b(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {p0}, LK0/k;->n(LK0/j;)LK0/J;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    :goto_0
    if-eqz v2, :cond_b

    .line 40
    .line 41
    invoke-virtual {v2}, LK0/J;->t0()LK0/c0;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    and-int/2addr v3, v0

    .line 54
    const/4 v4, 0x0

    .line 55
    if-eqz v3, :cond_9

    .line 56
    .line 57
    :goto_1
    if-eqz v1, :cond_9

    .line 58
    .line 59
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    and-int/2addr v3, v0

    .line 64
    if-eqz v3, :cond_8

    .line 65
    .line 66
    move-object v3, v1

    .line 67
    move-object v5, v4

    .line 68
    :goto_2
    if-eqz v3, :cond_8

    .line 69
    .line 70
    instance-of v6, v3, LJ0/h;

    .line 71
    .line 72
    if-eqz v6, :cond_1

    .line 73
    .line 74
    check-cast v3, LJ0/h;

    .line 75
    .line 76
    invoke-interface {v3}, LJ0/h;->h0()LJ0/g;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-virtual {v6, p1}, LJ0/g;->a(LJ0/c;)Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-eqz v6, :cond_7

    .line 85
    .line 86
    invoke-interface {v3}, LJ0/h;->h0()LJ0/g;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0, p1}, LJ0/g;->b(LJ0/c;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1

    .line 95
    :cond_1
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    and-int/2addr v6, v0

    .line 100
    if-eqz v6, :cond_7

    .line 101
    .line 102
    instance-of v6, v3, LK0/m;

    .line 103
    .line 104
    if-eqz v6, :cond_7

    .line 105
    .line 106
    move-object v6, v3

    .line 107
    check-cast v6, LK0/m;

    .line 108
    .line 109
    invoke-virtual {v6}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    const/4 v7, 0x0

    .line 114
    move v8, v7

    .line 115
    :goto_3
    const/4 v9, 0x1

    .line 116
    if-eqz v6, :cond_6

    .line 117
    .line 118
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    and-int/2addr v10, v0

    .line 123
    if-eqz v10, :cond_5

    .line 124
    .line 125
    add-int/lit8 v8, v8, 0x1

    .line 126
    .line 127
    if-ne v8, v9, :cond_2

    .line 128
    .line 129
    move-object v3, v6

    .line 130
    goto :goto_4

    .line 131
    :cond_2
    if-nez v5, :cond_3

    .line 132
    .line 133
    new-instance v5, La0/c;

    .line 134
    .line 135
    const/16 v9, 0x10

    .line 136
    .line 137
    new-array v9, v9, [Landroidx/compose/ui/e$c;

    .line 138
    .line 139
    invoke-direct {v5, v9, v7}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 140
    .line 141
    .line 142
    :cond_3
    if-eqz v3, :cond_4

    .line 143
    .line 144
    invoke-virtual {v5, v3}, La0/c;->c(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-object v3, v4

    .line 148
    :cond_4
    invoke-virtual {v5, v6}, La0/c;->c(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    :cond_5
    :goto_4
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    goto :goto_3

    .line 156
    :cond_6
    if-ne v8, v9, :cond_7

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_7
    invoke-static {v5}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    goto :goto_2

    .line 164
    :cond_8
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    goto :goto_1

    .line 169
    :cond_9
    invoke-virtual {v2}, LK0/J;->A0()LK0/J;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    if-eqz v2, :cond_a

    .line 174
    .line 175
    invoke-virtual {v2}, LK0/J;->t0()LK0/c0;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    if-eqz v1, :cond_a

    .line 180
    .line 181
    invoke-virtual {v1}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    goto/16 :goto_0

    .line 186
    .line 187
    :cond_a
    move-object v1, v4

    .line 188
    goto/16 :goto_0

    .line 189
    .line 190
    :cond_b
    invoke-virtual {p1}, LJ0/c;->a()Lie/a;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    return-object p1
.end method

.method public maxIntrinsicHeight(LI0/m;LI0/l;I)I
    .locals 2

    .line 1
    iget-object v0, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, LI0/v;

    .line 9
    .line 10
    invoke-interface {v0, p1, p2, p3}, LI0/v;->maxIntrinsicHeight(LI0/m;LI0/l;I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public maxIntrinsicWidth(LI0/m;LI0/l;I)I
    .locals 2

    .line 1
    iget-object v0, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, LI0/v;

    .line 9
    .line 10
    invoke-interface {v0, p1, p2, p3}, LI0/v;->maxIntrinsicWidth(LI0/m;LI0/l;I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
    .locals 2

    .line 1
    iget-object v0, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, LI0/v;

    .line 9
    .line 10
    invoke-interface {v0, p1, p2, p3, p4}, LI0/v;->measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public minIntrinsicHeight(LI0/m;LI0/l;I)I
    .locals 2

    .line 1
    iget-object v0, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, LI0/v;

    .line 9
    .line 10
    invoke-interface {v0, p1, p2, p3}, LI0/v;->minIntrinsicHeight(LI0/m;LI0/l;I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public minIntrinsicWidth(LI0/m;LI0/l;I)I
    .locals 2

    .line 1
    iget-object v0, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, LI0/v;

    .line 9
    .line 10
    invoke-interface {v0, p1, p2, p3}, LI0/v;->minIntrinsicWidth(LI0/m;LI0/l;I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public onAttach()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, LK0/c;->G1(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public onDensityChange()V
    .locals 1

    .line 1
    iget-object v0, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 2
    .line 3
    instance-of v0, v0, LE0/J;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LK0/c;->a1()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public onDetach()V
    .locals 0

    .line 1
    invoke-direct {p0}, LK0/c;->J1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onMeasureResultChanged()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LK0/c;->b:Z

    .line 3
    .line 4
    invoke-static {p0}, LK0/u;->a(LK0/t;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public p(LI0/p;)V
    .locals 2

    .line 1
    iget-object v0, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, LI0/G;

    .line 9
    .line 10
    invoke-interface {v0, p1}, LI0/G;->p(LI0/p;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public u1()Z
    .locals 2

    .line 1
    iget-object v0, p0, LK0/c;->a:Landroidx/compose/ui/e$b;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, LE0/J;

    .line 9
    .line 10
    invoke-interface {v0}, LE0/J;->g()LE0/I;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, LE0/I;->c()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method
