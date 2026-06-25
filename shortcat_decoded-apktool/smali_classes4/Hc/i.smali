.class public LHc/i;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LHc/m;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u000f\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "LHc/i;",
        "Lgc/c;",
        "LHc/m;",
        "<init>",
        "()V",
        "Lqb/b;",
        "groupOptions",
        "",
        "D",
        "(Lqb/b;)Ljava/lang/String;",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
        "LIc/e;",
        "d",
        "Lkotlin/Lazy;",
        "k",
        "()LIc/e;",
        "groupManager",
        "LJc/d;",
        "e",
        "h",
        "()LJc/d;",
        "groupSerializer",
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


# instance fields
.field private final d:Lkotlin/Lazy;

.field private final e:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lgc/c;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LHc/g;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LHc/g;-><init>(LHc/i;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, LHc/i;->d:Lkotlin/Lazy;

    .line 14
    .line 15
    new-instance v0, LHc/h;

    .line 16
    .line 17
    invoke-direct {v0, p0}, LHc/h;-><init>(LHc/i;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, LHc/i;->e:Lkotlin/Lazy;

    .line 25
    .line 26
    return-void
.end method

.method public static final synthetic A(LHc/i;)LJc/d;
    .locals 0

    .line 1
    invoke-direct {p0}, LHc/i;->h()LJc/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic B(LHc/i;Lqb/b;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LHc/i;->D(Lqb/b;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final D(Lqb/b;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lqb/b;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "getString(...)"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method private static final E(LHc/i;)LIc/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgc/c;->i()LUb/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LUb/d;->C()LUb/s;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, LHc/i;->C(LUb/s;)LHc/n;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, LHc/n;->k()LIc/e;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method private static final F(LHc/i;)LJc/d;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgc/c;->i()LUb/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LUb/d;->C()LUb/s;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, LHc/i;->C(LUb/s;)LHc/n;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, LHc/n;->h()LJc/d;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method private final h()LJc/d;
    .locals 1

    .line 1
    iget-object v0, p0, LHc/i;->e:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LJc/d;

    .line 8
    .line 9
    return-object v0
.end method

.method private final k()LIc/e;
    .locals 1

    .line 1
    iget-object v0, p0, LHc/i;->d:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LIc/e;

    .line 8
    .line 9
    return-object v0
.end method

.method public static synthetic x(LHc/i;)LJc/d;
    .locals 0

    .line 1
    invoke-static {p0}, LHc/i;->F(LHc/i;)LJc/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic y(LHc/i;)LIc/e;
    .locals 0

    .line 1
    invoke-static {p0}, LHc/i;->E(LHc/i;)LIc/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic z(LHc/i;)LIc/e;
    .locals 0

    .line 1
    invoke-direct {p0}, LHc/i;->k()LIc/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public C(LUb/s;)LHc/n;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LHc/m$a;->a(LHc/m;LUb/s;)LHc/n;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public n()Lgc/e;
    .locals 13

    .line 1
    const-class v0, Lqb/b;

    .line 2
    .line 3
    const-class v1, LUb/u;

    .line 4
    .line 5
    const-class v2, Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v4, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v3, ".ModuleDefinition"

    .line 20
    .line 21
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    new-instance v4, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v5, "["

    .line 34
    .line 35
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v5, "ExpoModulesCore"

    .line 39
    .line 40
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v5, "] "

    .line 44
    .line 45
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-static {v3}, LX3/a;->c(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :try_start_0
    new-instance v3, Lgc/d;

    .line 59
    .line 60
    invoke-direct {v3, p0}, Lgc/d;-><init>(Lgc/c;)V

    .line 61
    .line 62
    .line 63
    const-string v4, "ExpoNotificationChannelGroupManager"

    .line 64
    .line 65
    invoke-virtual {v3, v4}, Lgc/a;->s(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v4, "getNotificationChannelGroupAsync"

    .line 69
    .line 70
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    const/4 v6, 0x0

    .line 75
    if-eqz v5, :cond_0

    .line 76
    .line 77
    new-instance v5, Ldc/f;

    .line 78
    .line 79
    new-array v7, v6, [Lpc/b;

    .line 80
    .line 81
    new-instance v8, LHc/i$b;

    .line 82
    .line 83
    invoke-direct {v8, p0}, LHc/i$b;-><init>(LHc/i;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {v5, v4, v7, v8}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :catchall_0
    move-exception v0

    .line 91
    goto/16 :goto_3

    .line 92
    .line 93
    :cond_0
    invoke-virtual {v3}, Lhc/f;->m()Lpc/X;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    sget-object v7, Lpc/d;->a:Lpc/d;

    .line 98
    .line 99
    new-instance v8, Lkotlin/Pair;

    .line 100
    .line 101
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-direct {v8, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v7}, Lpc/d;->a()Ljava/util/Map;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    check-cast v7, Lpc/b;

    .line 119
    .line 120
    if-nez v7, :cond_1

    .line 121
    .line 122
    sget-object v7, LHc/i$c;->a:LHc/i$c;

    .line 123
    .line 124
    new-instance v8, Lpc/b;

    .line 125
    .line 126
    new-instance v9, Lpc/M;

    .line 127
    .line 128
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    invoke-direct {v9, v10, v6, v7}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 133
    .line 134
    .line 135
    invoke-direct {v8, v9, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 136
    .line 137
    .line 138
    move-object v7, v8

    .line 139
    :cond_1
    filled-new-array {v7}, [Lpc/b;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    new-instance v7, LHc/i$d;

    .line 144
    .line 145
    invoke-direct {v7, p0}, LHc/i$d;-><init>(LHc/i;)V

    .line 146
    .line 147
    .line 148
    new-instance v8, Ldc/s;

    .line 149
    .line 150
    invoke-direct {v8, v4, v5, v7}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 151
    .line 152
    .line 153
    move-object v5, v8

    .line 154
    :goto_0
    invoke-virtual {v3}, Lhc/f;->k()Ljava/util/Map;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    invoke-interface {v7, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    const-string v4, "getNotificationChannelGroupsAsync"

    .line 162
    .line 163
    new-array v5, v6, [Lpc/b;

    .line 164
    .line 165
    new-instance v7, LHc/i$e;

    .line 166
    .line 167
    invoke-direct {v7, p0}, LHc/i$e;-><init>(LHc/i;)V

    .line 168
    .line 169
    .line 170
    new-instance v8, Ldc/s;

    .line 171
    .line 172
    invoke-direct {v8, v4, v5, v7}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3}, Lhc/f;->k()Ljava/util/Map;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    invoke-interface {v5, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    const-string v4, "setNotificationChannelGroupAsync"

    .line 183
    .line 184
    invoke-virtual {v3}, Lhc/f;->m()Lpc/X;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    sget-object v7, Lpc/d;->a:Lpc/d;

    .line 189
    .line 190
    new-instance v8, Lkotlin/Pair;

    .line 191
    .line 192
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 193
    .line 194
    .line 195
    move-result-object v9

    .line 196
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 197
    .line 198
    invoke-direct {v8, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v7}, Lpc/d;->a()Ljava/util/Map;

    .line 202
    .line 203
    .line 204
    move-result-object v9

    .line 205
    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    check-cast v8, Lpc/b;

    .line 210
    .line 211
    if-nez v8, :cond_2

    .line 212
    .line 213
    sget-object v8, LHc/i$f;->a:LHc/i$f;

    .line 214
    .line 215
    new-instance v9, Lpc/b;

    .line 216
    .line 217
    new-instance v11, Lpc/M;

    .line 218
    .line 219
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 220
    .line 221
    .line 222
    move-result-object v12

    .line 223
    invoke-direct {v11, v12, v6, v8}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 224
    .line 225
    .line 226
    invoke-direct {v9, v11, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 227
    .line 228
    .line 229
    move-object v8, v9

    .line 230
    :cond_2
    new-instance v9, Lkotlin/Pair;

    .line 231
    .line 232
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 233
    .line 234
    .line 235
    move-result-object v11

    .line 236
    invoke-direct {v9, v11, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v7}, Lpc/d;->a()Ljava/util/Map;

    .line 240
    .line 241
    .line 242
    move-result-object v11

    .line 243
    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v9

    .line 247
    check-cast v9, Lpc/b;

    .line 248
    .line 249
    if-nez v9, :cond_3

    .line 250
    .line 251
    sget-object v9, LHc/i$g;->a:LHc/i$g;

    .line 252
    .line 253
    new-instance v11, Lpc/b;

    .line 254
    .line 255
    new-instance v12, Lpc/M;

    .line 256
    .line 257
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-direct {v12, v0, v6, v9}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 262
    .line 263
    .line 264
    invoke-direct {v11, v12, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 265
    .line 266
    .line 267
    move-object v9, v11

    .line 268
    :cond_3
    filled-new-array {v8, v9}, [Lpc/b;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    new-instance v5, LHc/i$h;

    .line 273
    .line 274
    invoke-direct {v5, p0}, LHc/i$h;-><init>(LHc/i;)V

    .line 275
    .line 276
    .line 277
    new-instance v8, Ldc/s;

    .line 278
    .line 279
    invoke-direct {v8, v4, v0, v5}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v3}, Lhc/f;->k()Ljava/util/Map;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-interface {v0, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    const-string v0, "deleteNotificationChannelGroupAsync"

    .line 290
    .line 291
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v1

    .line 295
    if-eqz v1, :cond_4

    .line 296
    .line 297
    new-instance v1, Ldc/f;

    .line 298
    .line 299
    new-array v2, v6, [Lpc/b;

    .line 300
    .line 301
    new-instance v4, LHc/i$i;

    .line 302
    .line 303
    invoke-direct {v4, p0}, LHc/i$i;-><init>(LHc/i;)V

    .line 304
    .line 305
    .line 306
    invoke-direct {v1, v0, v2, v4}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 307
    .line 308
    .line 309
    goto/16 :goto_2

    .line 310
    .line 311
    :cond_4
    invoke-virtual {v3}, Lhc/f;->m()Lpc/X;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    new-instance v4, Lkotlin/Pair;

    .line 316
    .line 317
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    invoke-direct {v4, v5, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v7}, Lpc/d;->a()Ljava/util/Map;

    .line 325
    .line 326
    .line 327
    move-result-object v5

    .line 328
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    check-cast v4, Lpc/b;

    .line 333
    .line 334
    if-nez v4, :cond_5

    .line 335
    .line 336
    sget-object v4, LHc/i$j;->a:LHc/i$j;

    .line 337
    .line 338
    new-instance v5, Lpc/b;

    .line 339
    .line 340
    new-instance v7, Lpc/M;

    .line 341
    .line 342
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 343
    .line 344
    .line 345
    move-result-object v8

    .line 346
    invoke-direct {v7, v8, v6, v4}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 347
    .line 348
    .line 349
    invoke-direct {v5, v7, v1}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 350
    .line 351
    .line 352
    move-object v4, v5

    .line 353
    :cond_5
    filled-new-array {v4}, [Lpc/b;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    new-instance v4, LHc/i$a;

    .line 358
    .line 359
    invoke-direct {v4, p0}, LHc/i$a;-><init>(LHc/i;)V

    .line 360
    .line 361
    .line 362
    const-class v5, LTd/L;

    .line 363
    .line 364
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 365
    .line 366
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result v6

    .line 370
    if-eqz v6, :cond_6

    .line 371
    .line 372
    new-instance v2, Ldc/l;

    .line 373
    .line 374
    invoke-direct {v2, v0, v1, v4}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 375
    .line 376
    .line 377
    :goto_1
    move-object v1, v2

    .line 378
    goto :goto_2

    .line 379
    :cond_6
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 380
    .line 381
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v6

    .line 385
    if-eqz v6, :cond_7

    .line 386
    .line 387
    new-instance v2, Ldc/h;

    .line 388
    .line 389
    invoke-direct {v2, v0, v1, v4}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 390
    .line 391
    .line 392
    goto :goto_1

    .line 393
    :cond_7
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 394
    .line 395
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v6

    .line 399
    if-eqz v6, :cond_8

    .line 400
    .line 401
    new-instance v2, Ldc/i;

    .line 402
    .line 403
    invoke-direct {v2, v0, v1, v4}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 404
    .line 405
    .line 406
    goto :goto_1

    .line 407
    :cond_8
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 408
    .line 409
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v6

    .line 413
    if-eqz v6, :cond_9

    .line 414
    .line 415
    new-instance v2, Ldc/j;

    .line 416
    .line 417
    invoke-direct {v2, v0, v1, v4}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 418
    .line 419
    .line 420
    goto :goto_1

    .line 421
    :cond_9
    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    if-eqz v2, :cond_a

    .line 426
    .line 427
    new-instance v2, Ldc/n;

    .line 428
    .line 429
    invoke-direct {v2, v0, v1, v4}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 430
    .line 431
    .line 432
    goto :goto_1

    .line 433
    :cond_a
    new-instance v2, Ldc/s;

    .line 434
    .line 435
    invoke-direct {v2, v0, v1, v4}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 436
    .line 437
    .line 438
    goto :goto_1

    .line 439
    :goto_2
    invoke-virtual {v3}, Lhc/f;->k()Ljava/util/Map;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v3}, Lgc/a;->u()Lgc/e;

    .line 447
    .line 448
    .line 449
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 450
    invoke-static {}, LX3/a;->f()V

    .line 451
    .line 452
    .line 453
    return-object v0

    .line 454
    :goto_3
    invoke-static {}, LX3/a;->f()V

    .line 455
    .line 456
    .line 457
    throw v0
.end method
