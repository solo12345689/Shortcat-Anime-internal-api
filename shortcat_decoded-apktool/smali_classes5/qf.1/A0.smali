.class public final Lqf/A0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqf/A0$a;,
        Lqf/A0$b;
    }
.end annotation


# static fields
.field public static final f:Lqf/A0$a;


# instance fields
.field private final a:Lqf/F;

.field private final b:Lqf/x0;

.field private final c:Lpf/f;

.field private final d:Lkotlin/Lazy;

.field private final e:Lpf/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lqf/A0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lqf/A0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lqf/A0;->f:Lqf/A0$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lqf/F;Lqf/x0;)V
    .locals 1

    const-string v0, "projectionComputer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lqf/A0;->a:Lqf/F;

    .line 3
    iput-object p2, p0, Lqf/A0;->b:Lqf/x0;

    .line 4
    new-instance p1, Lpf/f;

    const-string p2, "Type parameter upper bound erasure results"

    invoke-direct {p1, p2}, Lpf/f;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lqf/A0;->c:Lpf/f;

    .line 5
    new-instance p2, Lqf/y0;

    invoke-direct {p2, p0}, Lqf/y0;-><init>(Lqf/A0;)V

    invoke-static {p2}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Lqf/A0;->d:Lkotlin/Lazy;

    .line 6
    new-instance p2, Lqf/z0;

    invoke-direct {p2, p0}, Lqf/z0;-><init>(Lqf/A0;)V

    invoke-virtual {p1, p2}, Lpf/f;->h(Lkotlin/jvm/functions/Function1;)Lpf/g;

    move-result-object p1

    const-string p2, "createMemoizedFunction(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lqf/A0;->e:Lpf/g;

    return-void
.end method

.method public synthetic constructor <init>(Lqf/F;Lqf/x0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 7
    new-instance p2, Lqf/x0;

    const/4 p3, 0x0

    invoke-direct {p2, p3, p3}, Lqf/x0;-><init>(ZZ)V

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2}, Lqf/A0;-><init>(Lqf/F;Lqf/x0;)V

    return-void
.end method

.method static synthetic a(Lqf/A0;)Lsf/i;
    .locals 0

    .line 1
    invoke-static {p0}, Lqf/A0;->c(Lqf/A0;)Lsf/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic b(Lqf/A0;Lqf/A0$b;)Lqf/S;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lqf/A0;->f(Lqf/A0;Lqf/A0$b;)Lqf/S;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c(Lqf/A0;)Lsf/i;
    .locals 1

    .line 1
    sget-object v0, Lsf/k;->U0:Lsf/k;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    filled-new-array {p0}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {v0, p0}, Lsf/l;->d(Lsf/k;[Ljava/lang/String;)Lsf/i;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method private final d(Lqf/G;)Lqf/S;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lqf/G;->a()Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-static {p1}, Lvf/d;->D(Lqf/S;)Lqf/S;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object p1

    .line 15
    :cond_1
    :goto_0
    invoke-direct {p0}, Lqf/A0;->h()Lsf/i;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method private static final f(Lqf/A0;Lqf/A0$b;)Lqf/S;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lqf/A0$b;->b()Lye/m0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lqf/A0$b;->a()Lqf/G;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0, v0, p1}, Lqf/A0;->g(Lye/m0;Lqf/G;)Lqf/S;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method private final g(Lye/m0;Lqf/G;)Lqf/S;
    .locals 7

    .line 1
    invoke-virtual {p2}, Lqf/G;->c()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Lye/m0;->a()Lye/m0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-direct {p0, p2}, Lqf/A0;->d(Lqf/G;)Lqf/S;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    invoke-interface {p1}, Lye/h;->p()Lqf/d0;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "getDefaultType(...)"

    .line 27
    .line 28
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v0}, Lvf/d;->l(Lqf/S;Ljava/util/Set;)Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/Iterable;

    .line 36
    .line 37
    const/16 v2, 0xa

    .line 38
    .line 39
    invoke-static {v1, v2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    invoke-static {v3}, LUd/S;->e(I)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    const/16 v4, 0x10

    .line 48
    .line 49
    invoke-static {v3, v4}, Loe/j;->e(II)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 54
    .line 55
    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Lye/m0;

    .line 73
    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-nez v5, :cond_1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    invoke-static {v3, p2}, Lqf/J0;->t(Lye/m0;Lqf/G;)Lqf/B0;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    const-string v6, "makeStarProjection(...)"

    .line 88
    .line 89
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    :goto_1
    iget-object v5, p0, Lqf/A0;->a:Lqf/F;

    .line 94
    .line 95
    invoke-virtual {p2, p1}, Lqf/G;->d(Lye/m0;)Lqf/G;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    invoke-virtual {p0, v3, v6}, Lqf/A0;->e(Lye/m0;Lqf/G;)Lqf/S;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-virtual {v5, v3, p2, p0, v6}, Lqf/F;->a(Lye/m0;Lqf/G;Lqf/A0;Lqf/S;)Lqf/B0;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    :goto_2
    invoke-interface {v3}, Lye/m0;->l()Lqf/v0;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-static {v3, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {v3}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-virtual {v3}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_3
    sget-object v0, Lqf/w0;->c:Lqf/w0$a;

    .line 128
    .line 129
    const/4 v1, 0x2

    .line 130
    const/4 v3, 0x0

    .line 131
    const/4 v5, 0x0

    .line 132
    invoke-static {v0, v4, v5, v1, v3}, Lqf/w0$a;->e(Lqf/w0$a;Ljava/util/Map;ZILjava/lang/Object;)Lqf/w0;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {v0}, Lqf/G0;->g(Lqf/E0;)Lqf/G0;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    const-string v1, "create(...)"

    .line 141
    .line 142
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-interface {p1}, Lye/m0;->getUpperBounds()Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    const-string v1, "getUpperBounds(...)"

    .line 150
    .line 151
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-direct {p0, v0, p1, p2}, Lqf/A0;->i(Lqf/G0;Ljava/util/List;Lqf/G;)Ljava/util/Set;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    move-object v0, p1

    .line 159
    check-cast v0, Ljava/util/Collection;

    .line 160
    .line 161
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-nez v0, :cond_7

    .line 166
    .line 167
    iget-object p2, p0, Lqf/A0;->b:Lqf/x0;

    .line 168
    .line 169
    invoke-virtual {p2}, Lqf/x0;->a()Z

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    if-nez p2, :cond_5

    .line 174
    .line 175
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 176
    .line 177
    .line 178
    move-result p2

    .line 179
    const/4 v0, 0x1

    .line 180
    if-ne p2, v0, :cond_4

    .line 181
    .line 182
    check-cast p1, Ljava/lang/Iterable;

    .line 183
    .line 184
    invoke-static {p1}, LUd/u;->L0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    check-cast p1, Lqf/S;

    .line 189
    .line 190
    return-object p1

    .line 191
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 192
    .line 193
    const-string p2, "Should only be one computed upper bound if no need to intersect all bounds"

    .line 194
    .line 195
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw p1

    .line 199
    :cond_5
    check-cast p1, Ljava/lang/Iterable;

    .line 200
    .line 201
    invoke-static {p1}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    new-instance p2, Ljava/util/ArrayList;

    .line 206
    .line 207
    invoke-static {p1, v2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 212
    .line 213
    .line 214
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-eqz v0, :cond_6

    .line 223
    .line 224
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    check-cast v0, Lqf/S;

    .line 229
    .line 230
    invoke-virtual {v0}, Lqf/S;->Q0()Lqf/M0;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_6
    invoke-static {p2}, Lrf/d;->a(Ljava/util/Collection;)Lqf/M0;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    return-object p1

    .line 243
    :cond_7
    invoke-direct {p0, p2}, Lqf/A0;->d(Lqf/G;)Lqf/S;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    return-object p1
.end method

.method private final h()Lsf/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/A0;->d:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lsf/i;

    .line 8
    .line 9
    return-object v0
.end method

.method private final i(Lqf/G0;Ljava/util/List;Lqf/G;)Ljava/util/Set;
    .locals 5

    .line 1
    invoke-static {}, LUd/a0;->b()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_4

    .line 14
    .line 15
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lqf/S;

    .line 20
    .line 21
    invoke-virtual {v1}, Lqf/S;->N0()Lqf/v0;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v2}, Lqf/v0;->p()Lye/h;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    instance-of v3, v2, Lye/e;

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    sget-object v2, Lqf/A0;->f:Lqf/A0$a;

    .line 34
    .line 35
    invoke-virtual {p3}, Lqf/G;->c()Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iget-object v4, p0, Lqf/A0;->b:Lqf/x0;

    .line 40
    .line 41
    invoke-virtual {v4}, Lqf/x0;->b()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-virtual {v2, v1, p1, v3, v4}, Lqf/A0$a;->a(Lqf/S;Lqf/G0;Ljava/util/Set;Z)Lqf/S;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    instance-of v1, v2, Lye/m0;

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    invoke-virtual {p3}, Lqf/G;->c()Ljava/util/Set;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    const/4 v3, 0x1

    .line 68
    if-ne v1, v3, :cond_2

    .line 69
    .line 70
    invoke-direct {p0, p3}, Lqf/A0;->d(Lqf/G;)Lqf/S;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    check-cast v2, Lye/m0;

    .line 79
    .line 80
    invoke-interface {v2}, Lye/m0;->getUpperBounds()Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const-string v2, "getUpperBounds(...)"

    .line 85
    .line 86
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-direct {p0, p1, v1, p3}, Lqf/A0;->i(Lqf/G0;Ljava/util/List;Lqf/G;)Ljava/util/Set;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, Ljava/util/Collection;

    .line 94
    .line 95
    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 96
    .line 97
    .line 98
    :cond_3
    :goto_0
    iget-object v1, p0, Lqf/A0;->b:Lqf/x0;

    .line 99
    .line 100
    invoke-virtual {v1}, Lqf/x0;->a()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_0

    .line 105
    .line 106
    :cond_4
    invoke-static {v0}, LUd/a0;->a(Ljava/util/Set;)Ljava/util/Set;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    return-object p1
.end method


# virtual methods
.method public final e(Lye/m0;Lqf/G;)Lqf/S;
    .locals 2

    .line 1
    const-string v0, "typeParameter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "typeAttr"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqf/A0;->e:Lpf/g;

    .line 12
    .line 13
    new-instance v1, Lqf/A0$b;

    .line 14
    .line 15
    invoke-direct {v1, p1, p2}, Lqf/A0$b;-><init>(Lye/m0;Lqf/G;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string p2, "invoke(...)"

    .line 23
    .line 24
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast p1, Lqf/S;

    .line 28
    .line 29
    return-object p1
.end method
