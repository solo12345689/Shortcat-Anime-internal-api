.class final Lr3/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lr3/j;


# static fields
.field private static final c:LP9/K;


# instance fields
.field private final a:LP9/u;

.field private final b:[J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, LP9/K;->c()LP9/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lr3/e;

    .line 6
    .line 7
    invoke-direct {v1}, Lr3/e;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, LP9/K;->d(LO9/f;)LP9/K;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lr3/f;->c:LP9/K;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 14

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x2

    .line 9
    const/4 v2, 0x0

    .line 10
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    if-ne v0, v5, :cond_1

    .line 17
    .line 18
    invoke-static {p1}, LP9/x;->g(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lr3/d;

    .line 23
    .line 24
    iget-wide v6, p1, Lr3/d;->b:J

    .line 25
    .line 26
    invoke-static {v6, v7}, Lr3/f;->f(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v6

    .line 30
    iget-wide v8, p1, Lr3/d;->c:J

    .line 31
    .line 32
    cmp-long v0, v8, v3

    .line 33
    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    iget-object p1, p1, Lr3/d;->a:LP9/u;

    .line 37
    .line 38
    invoke-static {p1}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lr3/f;->a:LP9/u;

    .line 43
    .line 44
    new-array p1, v5, [J

    .line 45
    .line 46
    aput-wide v6, p1, v2

    .line 47
    .line 48
    iput-object p1, p0, Lr3/f;->b:[J

    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    iget-object v0, p1, Lr3/d;->a:LP9/u;

    .line 52
    .line 53
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v0, v3}, LP9/u;->D(Ljava/lang/Object;Ljava/lang/Object;)LP9/u;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, Lr3/f;->a:LP9/u;

    .line 62
    .line 63
    iget-wide v3, p1, Lr3/d;->c:J

    .line 64
    .line 65
    add-long/2addr v3, v6

    .line 66
    new-array p1, v1, [J

    .line 67
    .line 68
    aput-wide v6, p1, v2

    .line 69
    .line 70
    aput-wide v3, p1, v5

    .line 71
    .line 72
    iput-object p1, p0, Lr3/f;->b:[J

    .line 73
    .line 74
    return-void

    .line 75
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    mul-int/2addr v0, v1

    .line 80
    new-array v0, v0, [J

    .line 81
    .line 82
    iput-object v0, p0, Lr3/f;->b:[J

    .line 83
    .line 84
    const-wide v5, 0x7fffffffffffffffL

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    invoke-static {v0, v5, v6}, Ljava/util/Arrays;->fill([JJ)V

    .line 90
    .line 91
    .line 92
    new-instance v0, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    sget-object v1, Lr3/f;->c:LP9/K;

    .line 98
    .line 99
    invoke-static {v1, p1}, LP9/u;->L(Ljava/util/Comparator;Ljava/lang/Iterable;)LP9/u;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    move v1, v2

    .line 104
    :goto_0
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-ge v2, v5, :cond_6

    .line 109
    .line 110
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    check-cast v5, Lr3/d;

    .line 115
    .line 116
    iget-wide v6, v5, Lr3/d;->b:J

    .line 117
    .line 118
    invoke-static {v6, v7}, Lr3/f;->f(J)J

    .line 119
    .line 120
    .line 121
    move-result-wide v6

    .line 122
    iget-wide v8, v5, Lr3/d;->c:J

    .line 123
    .line 124
    add-long/2addr v8, v6

    .line 125
    if-eqz v1, :cond_4

    .line 126
    .line 127
    iget-object v10, p0, Lr3/f;->b:[J

    .line 128
    .line 129
    add-int/lit8 v11, v1, -0x1

    .line 130
    .line 131
    aget-wide v12, v10, v11

    .line 132
    .line 133
    cmp-long v10, v12, v6

    .line 134
    .line 135
    if-gez v10, :cond_2

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_2
    cmp-long v10, v12, v6

    .line 139
    .line 140
    if-nez v10, :cond_3

    .line 141
    .line 142
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v10

    .line 146
    check-cast v10, LP9/u;

    .line 147
    .line 148
    invoke-virtual {v10}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    if-eqz v10, :cond_3

    .line 153
    .line 154
    iget-object v6, v5, Lr3/d;->a:LP9/u;

    .line 155
    .line 156
    invoke-virtual {v0, v11, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_3
    const-string v10, "CuesWithTimingSubtitle"

    .line 161
    .line 162
    const-string v12, "Truncating unsupported overlapping cues."

    .line 163
    .line 164
    invoke-static {v10, v12}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    iget-object v10, p0, Lr3/f;->b:[J

    .line 168
    .line 169
    aput-wide v6, v10, v11

    .line 170
    .line 171
    iget-object v6, v5, Lr3/d;->a:LP9/u;

    .line 172
    .line 173
    invoke-virtual {v0, v11, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_4
    :goto_1
    iget-object v10, p0, Lr3/f;->b:[J

    .line 178
    .line 179
    add-int/lit8 v11, v1, 0x1

    .line 180
    .line 181
    aput-wide v6, v10, v1

    .line 182
    .line 183
    iget-object v1, v5, Lr3/d;->a:LP9/u;

    .line 184
    .line 185
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move v1, v11

    .line 189
    :goto_2
    iget-wide v5, v5, Lr3/d;->c:J

    .line 190
    .line 191
    cmp-long v5, v5, v3

    .line 192
    .line 193
    if-eqz v5, :cond_5

    .line 194
    .line 195
    iget-object v5, p0, Lr3/f;->b:[J

    .line 196
    .line 197
    add-int/lit8 v6, v1, 0x1

    .line 198
    .line 199
    aput-wide v8, v5, v1

    .line 200
    .line 201
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move v1, v6

    .line 209
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 210
    .line 211
    goto :goto_0

    .line 212
    :cond_6
    invoke-static {v0}, LP9/u;->w(Ljava/util/Collection;)LP9/u;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    iput-object p1, p0, Lr3/f;->a:LP9/u;

    .line 217
    .line 218
    return-void
.end method

.method public static synthetic d(Lr3/d;)Ljava/lang/Comparable;
    .locals 2

    .line 1
    iget-wide v0, p0, Lr3/d;->b:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Lr3/f;->f(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private static f(J)J
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p0, v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-wide/16 p0, 0x0

    .line 11
    .line 12
    :cond_0
    return-wide p0
.end method


# virtual methods
.method public a(J)I
    .locals 2

    .line 1
    iget-object v0, p0, Lr3/f;->b:[J

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, p1, p2, v1, v1}, Lt2/a0;->g([JJZZ)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iget-object p2, p0, Lr3/f;->a:LP9/u;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-ge p1, p2, :cond_0

    .line 15
    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p1, -0x1

    .line 18
    return p1
.end method

.method public bridge synthetic b(J)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lr3/f;->e(J)LP9/u;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c(I)J
    .locals 3

    .line 1
    iget-object v0, p0, Lr3/f;->a:LP9/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lr3/f;->b:[J

    .line 16
    .line 17
    aget-wide v1, v0, p1

    .line 18
    .line 19
    return-wide v1
.end method

.method public e(J)LP9/u;
    .locals 3

    .line 1
    iget-object v0, p0, Lr3/f;->b:[J

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v0, p1, p2, v1, v2}, Lt2/a0;->k([JJZZ)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 p2, -0x1

    .line 10
    if-ne p1, p2, :cond_0

    .line 11
    .line 12
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :cond_0
    iget-object p2, p0, Lr3/f;->a:LP9/u;

    .line 18
    .line 19
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, LP9/u;

    .line 24
    .line 25
    return-object p1
.end method

.method public h()I
    .locals 1

    .line 1
    iget-object v0, p0, Lr3/f;->a:LP9/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
