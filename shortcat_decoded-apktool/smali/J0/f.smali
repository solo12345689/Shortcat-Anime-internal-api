.class public final LJ0/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LK0/p0;

.field private final b:La0/c;

.field private final c:La0/c;

.field private final d:La0/c;

.field private final e:La0/c;

.field private f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LK0/p0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJ0/f;->a:LK0/p0;

    .line 5
    .line 6
    new-instance p1, La0/c;

    .line 7
    .line 8
    const/16 v0, 0x10

    .line 9
    .line 10
    new-array v1, v0, [LK0/c;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {p1, v1, v2}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, LJ0/f;->b:La0/c;

    .line 17
    .line 18
    new-instance p1, La0/c;

    .line 19
    .line 20
    new-array v1, v0, [LJ0/c;

    .line 21
    .line 22
    invoke-direct {p1, v1, v2}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, LJ0/f;->c:La0/c;

    .line 26
    .line 27
    new-instance p1, La0/c;

    .line 28
    .line 29
    new-array v1, v0, [LK0/J;

    .line 30
    .line 31
    invoke-direct {p1, v1, v2}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, LJ0/f;->d:La0/c;

    .line 35
    .line 36
    new-instance p1, La0/c;

    .line 37
    .line 38
    new-array v0, v0, [LJ0/c;

    .line 39
    .line 40
    invoke-direct {p1, v0, v2}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, LJ0/f;->e:La0/c;

    .line 44
    .line 45
    return-void
.end method

.method private final c(Landroidx/compose/ui/e$c;LJ0/c;Ljava/util/Set;)V
    .locals 12

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p1}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const-string v1, "visitSubtreeIf called on an unattached node"

    .line 18
    .line 19
    invoke-static {v1}, LH0/a;->b(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    new-instance v1, La0/c;

    .line 23
    .line 24
    const/16 v2, 0x10

    .line 25
    .line 26
    new-array v3, v2, [Landroidx/compose/ui/e$c;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-direct {v1, v3, v4}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    if-nez v3, :cond_1

    .line 41
    .line 42
    invoke-interface {p1}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {v1, p1, v4}, LK0/k;->a(La0/c;Landroidx/compose/ui/e$c;Z)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v1, v3}, La0/c;->c(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-virtual {v1}, La0/c;->p()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_c

    .line 58
    .line 59
    invoke-virtual {v1}, La0/c;->p()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    const/4 v3, 0x1

    .line 64
    sub-int/2addr p1, v3

    .line 65
    invoke-virtual {v1, p1}, La0/c;->y(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Landroidx/compose/ui/e$c;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    and-int/2addr v5, v0

    .line 76
    if-eqz v5, :cond_b

    .line 77
    .line 78
    move-object v5, p1

    .line 79
    :goto_1
    if-eqz v5, :cond_b

    .line 80
    .line 81
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    and-int/2addr v6, v0

    .line 86
    if-eqz v6, :cond_a

    .line 87
    .line 88
    const/4 v6, 0x0

    .line 89
    move-object v7, v5

    .line 90
    move-object v8, v6

    .line 91
    :goto_2
    if-eqz v7, :cond_a

    .line 92
    .line 93
    instance-of v9, v7, LJ0/h;

    .line 94
    .line 95
    if-eqz v9, :cond_3

    .line 96
    .line 97
    check-cast v7, LJ0/h;

    .line 98
    .line 99
    instance-of v9, v7, LK0/c;

    .line 100
    .line 101
    if-eqz v9, :cond_2

    .line 102
    .line 103
    move-object v9, v7

    .line 104
    check-cast v9, LK0/c;

    .line 105
    .line 106
    invoke-virtual {v9}, LK0/c;->E1()Landroidx/compose/ui/e$b;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    instance-of v10, v10, LJ0/d;

    .line 111
    .line 112
    if-eqz v10, :cond_2

    .line 113
    .line 114
    invoke-virtual {v9}, LK0/c;->F1()Ljava/util/HashSet;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    invoke-virtual {v9, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    if-eqz v9, :cond_2

    .line 123
    .line 124
    invoke-interface {p3, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    :cond_2
    invoke-interface {v7}, LJ0/h;->h0()LJ0/g;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-virtual {v7, p2}, LJ0/g;->a(LJ0/c;)Z

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    if-eqz v7, :cond_9

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_3
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 139
    .line 140
    .line 141
    move-result v9

    .line 142
    and-int/2addr v9, v0

    .line 143
    if-eqz v9, :cond_9

    .line 144
    .line 145
    instance-of v9, v7, LK0/m;

    .line 146
    .line 147
    if-eqz v9, :cond_9

    .line 148
    .line 149
    move-object v9, v7

    .line 150
    check-cast v9, LK0/m;

    .line 151
    .line 152
    invoke-virtual {v9}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    move v10, v4

    .line 157
    :goto_3
    if-eqz v9, :cond_8

    .line 158
    .line 159
    invoke-virtual {v9}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    and-int/2addr v11, v0

    .line 164
    if-eqz v11, :cond_7

    .line 165
    .line 166
    add-int/lit8 v10, v10, 0x1

    .line 167
    .line 168
    if-ne v10, v3, :cond_4

    .line 169
    .line 170
    move-object v7, v9

    .line 171
    goto :goto_4

    .line 172
    :cond_4
    if-nez v8, :cond_5

    .line 173
    .line 174
    new-instance v8, La0/c;

    .line 175
    .line 176
    new-array v11, v2, [Landroidx/compose/ui/e$c;

    .line 177
    .line 178
    invoke-direct {v8, v11, v4}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 179
    .line 180
    .line 181
    :cond_5
    if-eqz v7, :cond_6

    .line 182
    .line 183
    invoke-virtual {v8, v7}, La0/c;->c(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-object v7, v6

    .line 187
    :cond_6
    invoke-virtual {v8, v9}, La0/c;->c(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    :cond_7
    :goto_4
    invoke-virtual {v9}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    goto :goto_3

    .line 195
    :cond_8
    if-ne v10, v3, :cond_9

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_9
    invoke-static {v8}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    goto :goto_2

    .line 203
    :cond_a
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    goto/16 :goto_1

    .line 208
    .line 209
    :cond_b
    invoke-static {v1, p1, v4}, LK0/k;->a(La0/c;Landroidx/compose/ui/e$c;Z)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :cond_c
    return-void
.end method


# virtual methods
.method public final a(LK0/c;LJ0/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ0/f;->b:La0/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La0/c;->c(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LJ0/f;->c:La0/c;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, La0/c;->c(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LJ0/f;->b()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LJ0/f;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LJ0/f;->f:Z

    .line 7
    .line 8
    iget-object v0, p0, LJ0/f;->a:LK0/p0;

    .line 9
    .line 10
    new-instance v1, LJ0/f$a;

    .line 11
    .line 12
    invoke-direct {v1, p0}, LJ0/f$a;-><init>(LJ0/f;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1}, LK0/p0;->F(Lie/a;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final d(LK0/c;LJ0/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ0/f;->d:La0/c;

    .line 2
    .line 3
    invoke-static {p1}, LK0/k;->n(LK0/j;)LK0/J;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, La0/c;->c(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, LJ0/f;->e:La0/c;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, La0/c;->c(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, LJ0/f;->b()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final e()V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LJ0/f;->f:Z

    .line 3
    .line 4
    new-instance v1, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, LJ0/f;->d:La0/c;

    .line 10
    .line 11
    iget-object v3, v2, La0/c;->a:[Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {v2}, La0/c;->p()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    move v4, v0

    .line 18
    :goto_0
    if-ge v4, v2, :cond_1

    .line 19
    .line 20
    aget-object v5, v3, v4

    .line 21
    .line 22
    check-cast v5, LK0/J;

    .line 23
    .line 24
    iget-object v6, p0, LJ0/f;->e:La0/c;

    .line 25
    .line 26
    iget-object v6, v6, La0/c;->a:[Ljava/lang/Object;

    .line 27
    .line 28
    aget-object v6, v6, v4

    .line 29
    .line 30
    check-cast v6, LJ0/c;

    .line 31
    .line 32
    invoke-virtual {v5}, LK0/J;->t0()LK0/c0;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    invoke-virtual {v7}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-eqz v7, :cond_0

    .line 45
    .line 46
    invoke-virtual {v5}, LK0/J;->t0()LK0/c0;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v5}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-direct {p0, v5, v6, v1}, LJ0/f;->c(Landroidx/compose/ui/e$c;LJ0/c;Ljava/util/Set;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    iget-object v2, p0, LJ0/f;->d:La0/c;

    .line 61
    .line 62
    invoke-virtual {v2}, La0/c;->i()V

    .line 63
    .line 64
    .line 65
    iget-object v2, p0, LJ0/f;->e:La0/c;

    .line 66
    .line 67
    invoke-virtual {v2}, La0/c;->i()V

    .line 68
    .line 69
    .line 70
    iget-object v2, p0, LJ0/f;->b:La0/c;

    .line 71
    .line 72
    iget-object v3, v2, La0/c;->a:[Ljava/lang/Object;

    .line 73
    .line 74
    invoke-virtual {v2}, La0/c;->p()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    :goto_1
    if-ge v0, v2, :cond_3

    .line 79
    .line 80
    aget-object v4, v3, v0

    .line 81
    .line 82
    check-cast v4, LK0/c;

    .line 83
    .line 84
    iget-object v5, p0, LJ0/f;->c:La0/c;

    .line 85
    .line 86
    iget-object v5, v5, La0/c;->a:[Ljava/lang/Object;

    .line 87
    .line 88
    aget-object v5, v5, v0

    .line 89
    .line 90
    check-cast v5, LJ0/c;

    .line 91
    .line 92
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_2

    .line 97
    .line 98
    invoke-direct {p0, v4, v5, v1}, LJ0/f;->c(Landroidx/compose/ui/e$c;LJ0/c;Ljava/util/Set;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    iget-object v0, p0, LJ0/f;->b:La0/c;

    .line 105
    .line 106
    invoke-virtual {v0}, La0/c;->i()V

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, LJ0/f;->c:La0/c;

    .line 110
    .line 111
    invoke-virtual {v0}, La0/c;->i()V

    .line 112
    .line 113
    .line 114
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_4

    .line 123
    .line 124
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    check-cast v1, LK0/c;

    .line 129
    .line 130
    invoke-virtual {v1}, LK0/c;->K1()V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_4
    return-void
.end method

.method public final f(LK0/c;LJ0/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ0/f;->b:La0/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La0/c;->c(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LJ0/f;->c:La0/c;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, La0/c;->c(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LJ0/f;->b()V

    .line 12
    .line 13
    .line 14
    return-void
.end method
