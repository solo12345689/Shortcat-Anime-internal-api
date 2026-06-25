.class public final LB4/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LB4/b$a;


# instance fields
.field private final a:LG4/h;

.field private final b:Ljava/util/List;

.field private final c:I

.field private final d:LG4/h;

.field private final e:LH4/h;

.field private final f:Lv4/b;

.field private final g:Z


# direct methods
.method public constructor <init>(LG4/h;Ljava/util/List;ILG4/h;LH4/h;Lv4/b;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB4/c;->a:LG4/h;

    .line 5
    .line 6
    iput-object p2, p0, LB4/c;->b:Ljava/util/List;

    .line 7
    .line 8
    iput p3, p0, LB4/c;->c:I

    .line 9
    .line 10
    iput-object p4, p0, LB4/c;->d:LG4/h;

    .line 11
    .line 12
    iput-object p5, p0, LB4/c;->e:LH4/h;

    .line 13
    .line 14
    iput-object p6, p0, LB4/c;->f:Lv4/b;

    .line 15
    .line 16
    iput-boolean p7, p0, LB4/c;->g:Z

    .line 17
    .line 18
    return-void
.end method

.method private final a(LG4/h;LB4/b;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, LG4/h;->l()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LB4/c;->a:LG4/h;

    .line 6
    .line 7
    invoke-virtual {v1}, LG4/h;->l()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "Interceptor \'"

    .line 12
    .line 13
    if-ne v0, v1, :cond_4

    .line 14
    .line 15
    invoke-virtual {p1}, LG4/h;->m()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v1, LG4/j;->a:LG4/j;

    .line 20
    .line 21
    if-eq v0, v1, :cond_3

    .line 22
    .line 23
    invoke-virtual {p1}, LG4/h;->M()LI4/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v1, p0, LB4/c;->a:LG4/h;

    .line 28
    .line 29
    invoke-virtual {v1}, LG4/h;->M()LI4/a;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-ne v0, v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, LG4/h;->z()Landroidx/lifecycle/k;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v1, p0, LB4/c;->a:LG4/h;

    .line 40
    .line 41
    invoke-virtual {v1}, LG4/h;->z()Landroidx/lifecycle/k;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-ne v0, v1, :cond_1

    .line 46
    .line 47
    invoke-virtual {p1}, LG4/h;->K()LH4/i;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-object v0, p0, LB4/c;->a:LG4/h;

    .line 52
    .line 53
    invoke-virtual {v0}, LG4/h;->K()LH4/i;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-ne p1, v0, :cond_0

    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string p2, "\' cannot modify the request\'s size resolver. Use `Interceptor.Chain.withSize` instead."

    .line 72
    .line 73
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p2

    .line 90
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string p2, "\' cannot modify the request\'s lifecycle."

    .line 102
    .line 103
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p2

    .line 120
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string p2, "\' cannot modify the request\'s target."

    .line 132
    .line 133
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 141
    .line 142
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw p2

    .line 150
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string p2, "\' cannot set the request\'s data to null."

    .line 162
    .line 163
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw p2

    .line 180
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    const-string p2, "\' cannot modify the request\'s context."

    .line 192
    .line 193
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw p2
.end method

.method private final b(ILG4/h;LH4/h;)LB4/c;
    .locals 8

    .line 1
    new-instance v0, LB4/c;

    .line 2
    .line 3
    iget-object v1, p0, LB4/c;->a:LG4/h;

    .line 4
    .line 5
    iget-object v2, p0, LB4/c;->b:Ljava/util/List;

    .line 6
    .line 7
    iget-object v6, p0, LB4/c;->f:Lv4/b;

    .line 8
    .line 9
    iget-boolean v7, p0, LB4/c;->g:Z

    .line 10
    .line 11
    move v3, p1

    .line 12
    move-object v4, p2

    .line 13
    move-object v5, p3

    .line 14
    invoke-direct/range {v0 .. v7}, LB4/c;-><init>(LG4/h;Ljava/util/List;ILG4/h;LH4/h;Lv4/b;Z)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method static synthetic d(LB4/c;ILG4/h;LH4/h;ILjava/lang/Object;)LB4/c;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    iget p1, p0, LB4/c;->c:I

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, LB4/c;->c()LG4/h;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 16
    .line 17
    if-eqz p4, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0}, LB4/c;->getSize()LH4/h;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    :cond_2
    invoke-direct {p0, p1, p2, p3}, LB4/c;->b(ILG4/h;LH4/h;)LB4/c;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method


# virtual methods
.method public c()LG4/h;
    .locals 1

    .line 1
    iget-object v0, p0, LB4/c;->d:LG4/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Lv4/b;
    .locals 1

    .line 1
    iget-object v0, p0, LB4/c;->f:Lv4/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LB4/c;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public g(LG4/h;LZd/e;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, LB4/c$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LB4/c$a;

    .line 7
    .line 8
    iget v1, v0, LB4/c$a;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LB4/c$a;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LB4/c$a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LB4/c$a;-><init>(LB4/c;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LB4/c$a;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LB4/c$a;->e:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, LB4/c$a;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, LB4/b;

    .line 41
    .line 42
    iget-object v0, v0, LB4/c$a;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, LB4/c;

    .line 45
    .line 46
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object v4, p0

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget p2, p0, LB4/c;->c:I

    .line 63
    .line 64
    if-lez p2, :cond_3

    .line 65
    .line 66
    iget-object v2, p0, LB4/c;->b:Ljava/util/List;

    .line 67
    .line 68
    sub-int/2addr p2, v3

    .line 69
    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    check-cast p2, LB4/b;

    .line 74
    .line 75
    invoke-direct {p0, p1, p2}, LB4/c;->a(LG4/h;LB4/b;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    iget-object p2, p0, LB4/c;->b:Ljava/util/List;

    .line 79
    .line 80
    iget v2, p0, LB4/c;->c:I

    .line 81
    .line 82
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    check-cast p2, LB4/b;

    .line 87
    .line 88
    iget v2, p0, LB4/c;->c:I

    .line 89
    .line 90
    add-int/lit8 v5, v2, 0x1

    .line 91
    .line 92
    const/4 v8, 0x4

    .line 93
    const/4 v9, 0x0

    .line 94
    const/4 v7, 0x0

    .line 95
    move-object v4, p0

    .line 96
    move-object v6, p1

    .line 97
    invoke-static/range {v4 .. v9}, LB4/c;->d(LB4/c;ILG4/h;LH4/h;ILjava/lang/Object;)LB4/c;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iput-object v4, v0, LB4/c$a;->a:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object p2, v0, LB4/c$a;->b:Ljava/lang/Object;

    .line 104
    .line 105
    iput v3, v0, LB4/c$a;->e:I

    .line 106
    .line 107
    invoke-interface {p2, p1, v0}, LB4/b;->intercept(LB4/b$a;LZd/e;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-ne p1, v1, :cond_4

    .line 112
    .line 113
    return-object v1

    .line 114
    :cond_4
    move-object v0, p2

    .line 115
    move-object p2, p1

    .line 116
    move-object p1, v0

    .line 117
    move-object v0, v4

    .line 118
    :goto_1
    check-cast p2, LG4/i;

    .line 119
    .line 120
    invoke-virtual {p2}, LG4/i;->b()LG4/h;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-direct {v0, v1, p1}, LB4/c;->a(LG4/h;LB4/b;)V

    .line 125
    .line 126
    .line 127
    return-object p2
.end method

.method public getSize()LH4/h;
    .locals 1

    .line 1
    iget-object v0, p0, LB4/c;->e:LH4/h;

    .line 2
    .line 3
    return-object v0
.end method
