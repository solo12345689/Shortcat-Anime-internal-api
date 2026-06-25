.class public final LM2/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LM2/Q;


# instance fields
.field private final a:LU2/u;

.field private b:LU2/p;

.field private c:LU2/q;


# direct methods
.method public constructor <init>(LU2/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM2/d;->a:LU2/u;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic g(LU2/p;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-interface {p0}, LU2/p;->i()LU2/p;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, LM2/d;->b:LU2/p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, LU2/p;->a()V

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, LM2/d;->b:LU2/p;

    .line 10
    .line 11
    :cond_0
    iput-object v1, p0, LM2/d;->c:LU2/q;

    .line 12
    .line 13
    return-void
.end method

.method public b(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, LM2/d;->b:LU2/p;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LU2/p;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3, p4}, LU2/p;->b(JJ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public c(Lq2/m;Landroid/net/Uri;Ljava/util/Map;JJLU2/r;)V
    .locals 7

    .line 1
    new-instance v1, LU2/j;

    .line 2
    .line 3
    move-object v2, p1

    .line 4
    move-wide v3, p4

    .line 5
    move-wide v5, p6

    .line 6
    invoke-direct/range {v1 .. v6}, LU2/j;-><init>(Lq2/m;JJ)V

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, LM2/d;->c:LU2/q;

    .line 10
    .line 11
    iget-object p1, p0, LM2/d;->b:LU2/p;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object p1, p0, LM2/d;->a:LU2/u;

    .line 17
    .line 18
    invoke-interface {p1, p2, p3}, LU2/u;->d(Landroid/net/Uri;Ljava/util/Map;)[LU2/p;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    array-length p3, p1

    .line 23
    invoke-static {p3}, LP9/u;->u(I)LP9/u$a;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    array-length p4, p1

    .line 28
    const/4 p5, 0x0

    .line 29
    const/4 p6, 0x1

    .line 30
    if-ne p4, p6, :cond_1

    .line 31
    .line 32
    aget-object p1, p1, p5

    .line 33
    .line 34
    iput-object p1, p0, LM2/d;->b:LU2/p;

    .line 35
    .line 36
    goto/16 :goto_6

    .line 37
    .line 38
    :cond_1
    array-length p4, p1

    .line 39
    move p7, p5

    .line 40
    :goto_0
    if-ge p7, p4, :cond_7

    .line 41
    .line 42
    aget-object v0, p1, p7

    .line 43
    .line 44
    :try_start_0
    invoke-interface {v0, v1}, LU2/p;->f(LU2/q;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    iput-object v0, p0, LM2/d;->b:LU2/p;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    invoke-static {p6}, Lt2/a;->g(Z)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v1}, LU2/q;->g()V

    .line 56
    .line 57
    .line 58
    goto :goto_5

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    move-object p1, v0

    .line 61
    goto :goto_3

    .line 62
    :cond_2
    :try_start_1
    invoke-interface {v0}, LU2/p;->l()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p3, v0}, LP9/u$a;->j(Ljava/lang/Iterable;)LP9/u$a;
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, LM2/d;->b:LU2/p;

    .line 70
    .line 71
    if-nez v0, :cond_4

    .line 72
    .line 73
    invoke-interface {v1}, LU2/q;->getPosition()J

    .line 74
    .line 75
    .line 76
    move-result-wide v5

    .line 77
    cmp-long v0, v5, v3

    .line 78
    .line 79
    if-nez v0, :cond_3

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    move v0, p5

    .line 83
    goto :goto_2

    .line 84
    :cond_4
    :goto_1
    move v0, p6

    .line 85
    :goto_2
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v1}, LU2/q;->g()V

    .line 89
    .line 90
    .line 91
    goto :goto_4

    .line 92
    :goto_3
    iget-object p2, p0, LM2/d;->b:LU2/p;

    .line 93
    .line 94
    if-nez p2, :cond_5

    .line 95
    .line 96
    invoke-interface {v1}, LU2/q;->getPosition()J

    .line 97
    .line 98
    .line 99
    move-result-wide p2

    .line 100
    cmp-long p2, p2, v3

    .line 101
    .line 102
    if-nez p2, :cond_6

    .line 103
    .line 104
    :cond_5
    move p5, p6

    .line 105
    :cond_6
    invoke-static {p5}, Lt2/a;->g(Z)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v1}, LU2/q;->g()V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :catch_0
    iget-object v0, p0, LM2/d;->b:LU2/p;

    .line 113
    .line 114
    if-nez v0, :cond_4

    .line 115
    .line 116
    invoke-interface {v1}, LU2/q;->getPosition()J

    .line 117
    .line 118
    .line 119
    move-result-wide v5

    .line 120
    cmp-long v0, v5, v3

    .line 121
    .line 122
    if-nez v0, :cond_3

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :goto_4
    add-int/lit8 p7, p7, 0x1

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_7
    :goto_5
    iget-object p4, p0, LM2/d;->b:LU2/p;

    .line 129
    .line 130
    if-eqz p4, :cond_8

    .line 131
    .line 132
    :goto_6
    iget-object p1, p0, LM2/d;->b:LU2/p;

    .line 133
    .line 134
    invoke-interface {p1, p8}, LU2/p;->c(LU2/r;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_8
    new-instance p4, LM2/o0;

    .line 139
    .line 140
    new-instance p5, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    const-string p6, "None of the available extractors ("

    .line 146
    .line 147
    invoke-virtual {p5, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string p6, ", "

    .line 151
    .line 152
    invoke-static {p6}, LO9/g;->g(Ljava/lang/String;)LO9/g;

    .line 153
    .line 154
    .line 155
    move-result-object p6

    .line 156
    invoke-static {p1}, LP9/u;->x([Ljava/lang/Object;)LP9/u;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    new-instance p7, LM2/c;

    .line 161
    .line 162
    invoke-direct {p7}, LM2/c;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-static {p1, p7}, LP9/A;->k(Ljava/util/List;LO9/f;)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p6, p1}, LO9/g;->d(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string p1, ") could read the stream."

    .line 177
    .line 178
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    check-cast p2, Landroid/net/Uri;

    .line 190
    .line 191
    invoke-virtual {p3}, LP9/u$a;->k()LP9/u;

    .line 192
    .line 193
    .line 194
    move-result-object p3

    .line 195
    invoke-direct {p4, p1, p2, p3}, LM2/o0;-><init>(Ljava/lang/String;Landroid/net/Uri;Ljava/util/List;)V

    .line 196
    .line 197
    .line 198
    throw p4
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, LM2/d;->b:LU2/p;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-interface {v0}, LU2/p;->i()LU2/p;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    instance-of v1, v0, Ln3/f;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    check-cast v0, Ln3/f;

    .line 15
    .line 16
    invoke-virtual {v0}, Ln3/f;->m()V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
.end method

.method public e()J
    .locals 2

    .line 1
    iget-object v0, p0, LM2/d;->c:LU2/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LU2/q;->getPosition()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/16 v0, -0x1

    .line 11
    .line 12
    return-wide v0
.end method

.method public f(LU2/I;)I
    .locals 2

    .line 1
    iget-object v0, p0, LM2/d;->b:LU2/p;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LU2/p;

    .line 8
    .line 9
    iget-object v1, p0, LM2/d;->c:LU2/q;

    .line 10
    .line 11
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, LU2/q;

    .line 16
    .line 17
    invoke-interface {v0, v1, p1}, LU2/p;->h(LU2/q;LU2/I;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method
