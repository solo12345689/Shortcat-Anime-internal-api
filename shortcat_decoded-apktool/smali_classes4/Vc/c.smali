.class public final LVc/c;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u0008J\u000f\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "LVc/c;",
        "Lgc/c;",
        "<init>",
        "()V",
        "LUb/u;",
        "promise",
        "LTd/L;",
        "F",
        "(LUb/u;)V",
        "H",
        "I",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
        "LRb/a;",
        "E",
        "()LRb/a;",
        "permissions",
        "Landroid/content/Context;",
        "D",
        "()Landroid/content/Context;",
        "context",
        "expo-notifications_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lgc/c;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic A(LVc/c;LUb/u;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LVc/c;->F(LUb/u;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic B(LVc/c;LUb/u;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LVc/c;->H(LUb/u;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic C(LVc/c;LUb/u;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LVc/c;->I(LUb/u;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final D()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgc/c;->i()LUb/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LUb/d;->B()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lcc/i;

    .line 13
    .line 14
    invoke-direct {v0}, Lcc/i;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method private final E()LRb/a;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lgc/c;->i()LUb/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LUb/d;->z()LRb/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, LBc/a;

    .line 13
    .line 14
    const-class v1, LRb/a;

    .line 15
    .line 16
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {v0, v1}, LBc/a;-><init>(Lpe/d;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method private final F(LUb/u;)V
    .locals 3

    .line 1
    invoke-direct {p0}, LVc/c;->E()LRb/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LVc/a;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, LVc/a;-><init>(LVc/c;LUb/u;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, LVc/d;->a()[Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    array-length v2, p1

    .line 15
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, [Ljava/lang/String;

    .line 20
    .line 21
    invoke-interface {v0, v1, p1}, LRb/a;->a(LRb/c;[Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private static final G(LVc/c;LUb/u;Ljava/util/Map;)V
    .locals 7

    .line 1
    const-string v0, "permissionsMap"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LVc/c;->D()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "from(...)"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/core/app/q;->a()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {v0}, Landroidx/core/app/q;->k()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v2, "importance"

    .line 32
    .line 33
    invoke-static {v2, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, LG1/c;->a([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-direct {p0}, LVc/c;->D()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string v2, "notification"

    .line 50
    .line 51
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    instance-of v2, p0, Landroid/app/NotificationManager;

    .line 56
    .line 57
    if-eqz v2, :cond_0

    .line 58
    .line 59
    check-cast p0, Landroid/app/NotificationManager;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const/4 p0, 0x0

    .line 63
    :goto_0
    if-eqz p0, :cond_1

    .line 64
    .line 65
    const-string v2, "interruptionFilter"

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/app/NotificationManager;->getCurrentInterruptionFilter()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    invoke-virtual {v0, v2, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 72
    .line 73
    .line 74
    :cond_1
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    const/4 v2, 0x0

    .line 79
    const/4 v3, 0x1

    .line 80
    if-eqz p0, :cond_3

    .line 81
    .line 82
    :cond_2
    move p0, v3

    .line 83
    goto :goto_2

    .line 84
    :cond_3
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_2

    .line 97
    .line 98
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    check-cast v4, Ljava/util/Map$Entry;

    .line 103
    .line 104
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    check-cast v4, LRb/b;

    .line 109
    .line 110
    invoke-virtual {v4}, LRb/b;->b()LRb/d;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    sget-object v5, LRb/d;->b:LRb/d;

    .line 115
    .line 116
    if-ne v4, v5, :cond_4

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_4
    move p0, v2

    .line 120
    :goto_2
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-eqz v4, :cond_6

    .line 125
    .line 126
    :cond_5
    move v4, v3

    .line 127
    goto :goto_4

    .line 128
    :cond_6
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    if-eqz v5, :cond_5

    .line 141
    .line 142
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    check-cast v5, Ljava/util/Map$Entry;

    .line 147
    .line 148
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    check-cast v5, LRb/b;

    .line 153
    .line 154
    invoke-virtual {v5}, LRb/b;->b()LRb/d;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    sget-object v6, LRb/d;->d:LRb/d;

    .line 159
    .line 160
    if-ne v5, v6, :cond_7

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_7
    move v4, v2

    .line 164
    :goto_4
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    if-eqz v5, :cond_9

    .line 169
    .line 170
    :cond_8
    move v2, v3

    .line 171
    goto :goto_5

    .line 172
    :cond_9
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    :cond_a
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    if-eqz v5, :cond_8

    .line 185
    .line 186
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    check-cast v5, Ljava/util/Map$Entry;

    .line 191
    .line 192
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    check-cast v5, LRb/b;

    .line 197
    .line 198
    invoke-virtual {v5}, LRb/b;->a()Z

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    if-nez v5, :cond_a

    .line 203
    .line 204
    :goto_5
    if-eqz v4, :cond_b

    .line 205
    .line 206
    sget-object p2, LRb/d;->d:LRb/d;

    .line 207
    .line 208
    invoke-virtual {p2}, LRb/d;->b()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    goto :goto_6

    .line 213
    :cond_b
    if-nez v1, :cond_c

    .line 214
    .line 215
    sget-object p2, LRb/d;->d:LRb/d;

    .line 216
    .line 217
    invoke-virtual {p2}, LRb/d;->b()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    goto :goto_6

    .line 222
    :cond_c
    if-eqz p0, :cond_d

    .line 223
    .line 224
    sget-object p2, LRb/d;->b:LRb/d;

    .line 225
    .line 226
    invoke-virtual {p2}, LRb/d;->b()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p2

    .line 230
    goto :goto_6

    .line 231
    :cond_d
    sget-object p2, LRb/d;->c:LRb/d;

    .line 232
    .line 233
    invoke-virtual {p2}, LRb/d;->b()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p2

    .line 237
    :goto_6
    const-string v1, "expires"

    .line 238
    .line 239
    const-string v3, "never"

    .line 240
    .line 241
    invoke-static {v1, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    const-string v3, "status"

    .line 246
    .line 247
    invoke-static {v3, p2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 248
    .line 249
    .line 250
    move-result-object p2

    .line 251
    const-string v3, "canAskAgain"

    .line 252
    .line 253
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    invoke-static {v3, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    const-string v3, "granted"

    .line 262
    .line 263
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    invoke-static {v3, p0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    const-string v3, "android"

    .line 272
    .line 273
    invoke-static {v3, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    filled-new-array {v1, p2, v2, p0, v0}, [Lkotlin/Pair;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    invoke-static {p0}, LG1/c;->a([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    invoke-interface {p1, p0}, LUb/u;->resolve(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    return-void
.end method

.method private final H(LUb/u;)V
    .locals 6

    .line 1
    invoke-direct {p0}, LVc/c;->D()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "from(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/core/app/q;->a()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    sget-object v2, LRb/d;->b:LRb/d;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object v2, LRb/d;->d:LRb/d;

    .line 24
    .line 25
    :goto_0
    invoke-virtual {v0}, Landroidx/core/app/q;->k()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v3, "importance"

    .line 34
    .line 35
    invoke-static {v3, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, LG1/c;->a([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-direct {p0}, LVc/c;->D()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    const-string v4, "notification"

    .line 52
    .line 53
    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    instance-of v4, v3, Landroid/app/NotificationManager;

    .line 58
    .line 59
    if-eqz v4, :cond_1

    .line 60
    .line 61
    check-cast v3, Landroid/app/NotificationManager;

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    const/4 v3, 0x0

    .line 65
    :goto_1
    if-eqz v3, :cond_2

    .line 66
    .line 67
    const-string v4, "interruptionFilter"

    .line 68
    .line 69
    invoke-virtual {v3}, Landroid/app/NotificationManager;->getCurrentInterruptionFilter()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    :cond_2
    const-string v3, "expires"

    .line 77
    .line 78
    const-string v4, "never"

    .line 79
    .line 80
    invoke-static {v3, v4}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    const-string v4, "status"

    .line 85
    .line 86
    invoke-virtual {v2}, LRb/d;->b()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-static {v4, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    const-string v5, "canAskAgain"

    .line 95
    .line 96
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-static {v5, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    sget-object v5, LRb/d;->b:LRb/d;

    .line 105
    .line 106
    if-ne v2, v5, :cond_3

    .line 107
    .line 108
    const/4 v2, 0x1

    .line 109
    goto :goto_2

    .line 110
    :cond_3
    const/4 v2, 0x0

    .line 111
    :goto_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    const-string v5, "granted"

    .line 116
    .line 117
    invoke-static {v5, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    const-string v5, "android"

    .line 122
    .line 123
    invoke-static {v5, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    filled-new-array {v3, v4, v1, v2, v0}, [Lkotlin/Pair;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v0}, LG1/c;->a([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-interface {p1, v0}, LUb/u;->resolve(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method private final I(LUb/u;)V
    .locals 3

    .line 1
    invoke-direct {p0}, LVc/c;->E()LRb/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LVc/b;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, LVc/b;-><init>(LVc/c;LUb/u;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, LVc/d;->a()[Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    array-length v2, p1

    .line 15
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, [Ljava/lang/String;

    .line 20
    .line 21
    invoke-interface {v0, v1, p1}, LRb/a;->b(LRb/c;[Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private static final J(LVc/c;LUb/u;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LVc/c;->F(LUb/u;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic x(LVc/c;LUb/u;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LVc/c;->G(LVc/c;LUb/u;Ljava/util/Map;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic y(LVc/c;LUb/u;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LVc/c;->J(LVc/c;LUb/u;Ljava/util/Map;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic z(LVc/c;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-direct {p0}, LVc/c;->D()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public n()Lgc/e;
    .locals 10

    .line 1
    const-class v0, Lqb/b;

    .line 2
    .line 3
    const-class v1, LUb/u;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v3, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v2, ".ModuleDefinition"

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v4, "["

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v4, "ExpoModulesCore"

    .line 37
    .line 38
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v4, "] "

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2}, LX3/a;->c(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :try_start_0
    new-instance v2, Lgc/d;

    .line 57
    .line 58
    invoke-direct {v2, p0}, Lgc/d;-><init>(Lgc/c;)V

    .line 59
    .line 60
    .line 61
    const-string v3, "ExpoNotificationPermissionsModule"

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Lgc/a;->s(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v3, "getPermissionsAsync"

    .line 67
    .line 68
    invoke-static {v1, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    const/4 v5, 0x0

    .line 73
    if-eqz v4, :cond_0

    .line 74
    .line 75
    new-instance v1, Ldc/f;

    .line 76
    .line 77
    new-array v4, v5, [Lpc/b;

    .line 78
    .line 79
    new-instance v5, LVc/c$a;

    .line 80
    .line 81
    invoke-direct {v5, p0}, LVc/c$a;-><init>(LVc/c;)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v1, v3, v4, v5}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_1

    .line 88
    .line 89
    :catchall_0
    move-exception v0

    .line 90
    goto/16 :goto_2

    .line 91
    .line 92
    :cond_0
    invoke-virtual {v2}, Lhc/f;->m()Lpc/X;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    sget-object v6, Lpc/d;->a:Lpc/d;

    .line 97
    .line 98
    new-instance v7, Lkotlin/Pair;

    .line 99
    .line 100
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-direct {v7, v8, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6}, Lpc/d;->a()Ljava/util/Map;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    check-cast v6, Lpc/b;

    .line 118
    .line 119
    if-nez v6, :cond_1

    .line 120
    .line 121
    sget-object v6, LVc/c$b;->a:LVc/c$b;

    .line 122
    .line 123
    new-instance v7, Lpc/b;

    .line 124
    .line 125
    new-instance v8, Lpc/M;

    .line 126
    .line 127
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-direct {v8, v1, v5, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 132
    .line 133
    .line 134
    invoke-direct {v7, v8, v4}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 135
    .line 136
    .line 137
    move-object v6, v7

    .line 138
    :cond_1
    filled-new-array {v6}, [Lpc/b;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    new-instance v4, LVc/c$c;

    .line 143
    .line 144
    invoke-direct {v4, p0}, LVc/c$c;-><init>(LVc/c;)V

    .line 145
    .line 146
    .line 147
    const-class v5, LTd/L;

    .line 148
    .line 149
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 150
    .line 151
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    if-eqz v6, :cond_2

    .line 156
    .line 157
    new-instance v5, Ldc/l;

    .line 158
    .line 159
    invoke-direct {v5, v3, v1, v4}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 160
    .line 161
    .line 162
    :goto_0
    move-object v1, v5

    .line 163
    goto :goto_1

    .line 164
    :cond_2
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 165
    .line 166
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    if-eqz v6, :cond_3

    .line 171
    .line 172
    new-instance v5, Ldc/h;

    .line 173
    .line 174
    invoke-direct {v5, v3, v1, v4}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 175
    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_3
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 179
    .line 180
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v6

    .line 184
    if-eqz v6, :cond_4

    .line 185
    .line 186
    new-instance v5, Ldc/i;

    .line 187
    .line 188
    invoke-direct {v5, v3, v1, v4}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 189
    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_4
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 193
    .line 194
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    if-eqz v6, :cond_5

    .line 199
    .line 200
    new-instance v5, Ldc/j;

    .line 201
    .line 202
    invoke-direct {v5, v3, v1, v4}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 203
    .line 204
    .line 205
    goto :goto_0

    .line 206
    :cond_5
    const-class v6, Ljava/lang/String;

    .line 207
    .line 208
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-eqz v5, :cond_6

    .line 213
    .line 214
    new-instance v5, Ldc/n;

    .line 215
    .line 216
    invoke-direct {v5, v3, v1, v4}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 217
    .line 218
    .line 219
    goto :goto_0

    .line 220
    :cond_6
    new-instance v5, Ldc/s;

    .line 221
    .line 222
    invoke-direct {v5, v3, v1, v4}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 223
    .line 224
    .line 225
    goto :goto_0

    .line 226
    :goto_1
    invoke-virtual {v2}, Lhc/f;->k()Ljava/util/Map;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    invoke-interface {v4, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    const-string v1, "requestPermissionsAsync"

    .line 234
    .line 235
    new-instance v3, Ldc/f;

    .line 236
    .line 237
    invoke-virtual {v2}, Lhc/f;->m()Lpc/X;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    sget-object v5, Lpc/d;->a:Lpc/d;

    .line 242
    .line 243
    new-instance v6, Lkotlin/Pair;

    .line 244
    .line 245
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 250
    .line 251
    invoke-direct {v6, v7, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v5}, Lpc/d;->a()Ljava/util/Map;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v5

    .line 262
    check-cast v5, Lpc/b;

    .line 263
    .line 264
    if-nez v5, :cond_7

    .line 265
    .line 266
    sget-object v5, LVc/c$d;->a:LVc/c$d;

    .line 267
    .line 268
    new-instance v6, Lpc/b;

    .line 269
    .line 270
    new-instance v7, Lpc/M;

    .line 271
    .line 272
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    const/4 v8, 0x1

    .line 277
    invoke-direct {v7, v0, v8, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 278
    .line 279
    .line 280
    invoke-direct {v6, v7, v4}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 281
    .line 282
    .line 283
    move-object v5, v6

    .line 284
    :cond_7
    filled-new-array {v5}, [Lpc/b;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    new-instance v4, LVc/c$e;

    .line 289
    .line 290
    invoke-direct {v4, p0}, LVc/c$e;-><init>(LVc/c;)V

    .line 291
    .line 292
    .line 293
    invoke-direct {v3, v1, v0, v4}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2}, Lhc/f;->k()Ljava/util/Map;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v2}, Lgc/a;->u()Lgc/e;

    .line 304
    .line 305
    .line 306
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 307
    invoke-static {}, LX3/a;->f()V

    .line 308
    .line 309
    .line 310
    return-object v0

    .line 311
    :goto_2
    invoke-static {}, LX3/a;->f()V

    .line 312
    .line 313
    .line 314
    throw v0
.end method
