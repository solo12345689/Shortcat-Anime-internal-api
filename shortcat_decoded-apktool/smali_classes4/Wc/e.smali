.class public LWc/e;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u000c\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158F\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "LWc/e;",
        "Lgc/c;",
        "<init>",
        "()V",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
        "",
        "C",
        "()Ljava/lang/String;",
        "LWc/a;",
        "d",
        "Lkotlin/Lazy;",
        "B",
        "()LWc/a;",
        "installationId",
        "LWc/b;",
        "e",
        "D",
        "()LWc/b;",
        "mRegistrationInfo",
        "Landroid/content/Context;",
        "A",
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
    new-instance v0, LWc/c;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LWc/c;-><init>(LWc/e;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, LWc/e;->d:Lkotlin/Lazy;

    .line 14
    .line 15
    new-instance v0, LWc/d;

    .line 16
    .line 17
    invoke-direct {v0, p0}, LWc/d;-><init>(LWc/e;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, LWc/e;->e:Lkotlin/Lazy;

    .line 25
    .line 26
    return-void
.end method

.method private final D()LWc/b;
    .locals 1

    .line 1
    iget-object v0, p0, LWc/e;->e:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LWc/b;

    .line 8
    .line 9
    return-object v0
.end method

.method private static final E(LWc/e;)LWc/a;
    .locals 1

    .line 1
    new-instance v0, LWc/a;

    .line 2
    .line 3
    invoke-virtual {p0}, LWc/e;->A()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, LWc/a;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private static final F(LWc/e;)LWc/b;
    .locals 1

    .line 1
    new-instance v0, LWc/b;

    .line 2
    .line 3
    invoke-virtual {p0}, LWc/e;->A()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, LWc/b;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static synthetic x(LWc/e;)LWc/b;
    .locals 0

    .line 1
    invoke-static {p0}, LWc/e;->F(LWc/e;)LWc/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic y(LWc/e;)LWc/a;
    .locals 0

    .line 1
    invoke-static {p0}, LWc/e;->E(LWc/e;)LWc/a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic z(LWc/e;)LWc/b;
    .locals 0

    .line 1
    invoke-direct {p0}, LWc/e;->D()LWc/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final A()Landroid/content/Context;
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

.method protected final B()LWc/a;
    .locals 1

    .line 1
    iget-object v0, p0, LWc/e;->d:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LWc/a;

    .line 8
    .line 9
    return-object v0
.end method

.method public C()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, LWc/e;->B()LWc/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LWc/a;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getOrCreateUUID(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public n()Lgc/e;
    .locals 13

    .line 1
    const-class v0, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ".ModuleDefinition"

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v3, "["

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v3, "ExpoModulesCore"

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v3, "] "

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v1}, LX3/a;->c(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :try_start_0
    new-instance v1, Lgc/d;

    .line 55
    .line 56
    invoke-direct {v1, p0}, Lgc/d;-><init>(Lgc/c;)V

    .line 57
    .line 58
    .line 59
    const-string v2, "NotificationsServerRegistrationModule"

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Lgc/a;->s(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v2, "getInstallationIdAsync"

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    new-array v4, v3, [Lpc/b;

    .line 68
    .line 69
    new-instance v5, LWc/e$a;

    .line 70
    .line 71
    invoke-direct {v5, p0}, LWc/e$a;-><init>(LWc/e;)V

    .line 72
    .line 73
    .line 74
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 75
    .line 76
    invoke-static {v0, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    sget-object v8, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 81
    .line 82
    sget-object v9, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 83
    .line 84
    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 85
    .line 86
    if-eqz v7, :cond_0

    .line 87
    .line 88
    :try_start_1
    new-instance v7, Ldc/l;

    .line 89
    .line 90
    invoke-direct {v7, v2, v4, v5}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :catchall_0
    move-exception v0

    .line 95
    goto/16 :goto_2

    .line 96
    .line 97
    :cond_0
    invoke-static {v0, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    if-eqz v7, :cond_1

    .line 102
    .line 103
    new-instance v7, Ldc/h;

    .line 104
    .line 105
    invoke-direct {v7, v2, v4, v5}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    invoke-static {v0, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    if-eqz v7, :cond_2

    .line 114
    .line 115
    new-instance v7, Ldc/i;

    .line 116
    .line 117
    invoke-direct {v7, v2, v4, v5}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_2
    invoke-static {v0, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    if-eqz v7, :cond_3

    .line 126
    .line 127
    new-instance v7, Ldc/j;

    .line 128
    .line 129
    invoke-direct {v7, v2, v4, v5}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_3
    invoke-static {v0, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-eqz v7, :cond_4

    .line 138
    .line 139
    new-instance v7, Ldc/n;

    .line 140
    .line 141
    invoke-direct {v7, v2, v4, v5}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_4
    new-instance v7, Ldc/s;

    .line 146
    .line 147
    invoke-direct {v7, v2, v4, v5}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 148
    .line 149
    .line 150
    :goto_0
    invoke-virtual {v1}, Lhc/f;->k()Ljava/util/Map;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-interface {v4, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    const-string v2, "getRegistrationInfoAsync"

    .line 158
    .line 159
    new-array v4, v3, [Lpc/b;

    .line 160
    .line 161
    new-instance v5, LWc/e$b;

    .line 162
    .line 163
    invoke-direct {v5, p0}, LWc/e$b;-><init>(LWc/e;)V

    .line 164
    .line 165
    .line 166
    new-instance v7, Ldc/s;

    .line 167
    .line 168
    invoke-direct {v7, v2, v4, v5}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Lhc/f;->k()Ljava/util/Map;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    invoke-interface {v4, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    const-string v2, "setRegistrationInfoAsync"

    .line 179
    .line 180
    const-class v4, LUb/u;

    .line 181
    .line 182
    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-eqz v4, :cond_5

    .line 187
    .line 188
    new-instance v0, Ldc/f;

    .line 189
    .line 190
    new-array v3, v3, [Lpc/b;

    .line 191
    .line 192
    new-instance v4, LWc/e$c;

    .line 193
    .line 194
    invoke-direct {v4, p0}, LWc/e$c;-><init>(LWc/e;)V

    .line 195
    .line 196
    .line 197
    invoke-direct {v0, v2, v3, v4}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 198
    .line 199
    .line 200
    goto/16 :goto_1

    .line 201
    .line 202
    :cond_5
    invoke-virtual {v1}, Lhc/f;->m()Lpc/X;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    sget-object v4, Lpc/d;->a:Lpc/d;

    .line 207
    .line 208
    new-instance v5, Lkotlin/Pair;

    .line 209
    .line 210
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 215
    .line 216
    invoke-direct {v5, v7, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v4}, Lpc/d;->a()Ljava/util/Map;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    check-cast v4, Lpc/b;

    .line 228
    .line 229
    if-nez v4, :cond_6

    .line 230
    .line 231
    sget-object v4, LWc/e$d;->a:LWc/e$d;

    .line 232
    .line 233
    new-instance v5, Lpc/b;

    .line 234
    .line 235
    new-instance v7, Lpc/M;

    .line 236
    .line 237
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 238
    .line 239
    .line 240
    move-result-object v11

    .line 241
    const/4 v12, 0x1

    .line 242
    invoke-direct {v7, v11, v12, v4}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 243
    .line 244
    .line 245
    invoke-direct {v5, v7, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 246
    .line 247
    .line 248
    move-object v4, v5

    .line 249
    :cond_6
    filled-new-array {v4}, [Lpc/b;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    new-instance v4, LWc/e$e;

    .line 254
    .line 255
    invoke-direct {v4, p0}, LWc/e$e;-><init>(LWc/e;)V

    .line 256
    .line 257
    .line 258
    const-class v5, LTd/L;

    .line 259
    .line 260
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v6

    .line 264
    if-eqz v6, :cond_7

    .line 265
    .line 266
    new-instance v0, Ldc/l;

    .line 267
    .line 268
    invoke-direct {v0, v2, v3, v4}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 269
    .line 270
    .line 271
    goto :goto_1

    .line 272
    :cond_7
    invoke-static {v5, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v6

    .line 276
    if-eqz v6, :cond_8

    .line 277
    .line 278
    new-instance v0, Ldc/h;

    .line 279
    .line 280
    invoke-direct {v0, v2, v3, v4}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 281
    .line 282
    .line 283
    goto :goto_1

    .line 284
    :cond_8
    invoke-static {v5, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v6

    .line 288
    if-eqz v6, :cond_9

    .line 289
    .line 290
    new-instance v0, Ldc/i;

    .line 291
    .line 292
    invoke-direct {v0, v2, v3, v4}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 293
    .line 294
    .line 295
    goto :goto_1

    .line 296
    :cond_9
    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v6

    .line 300
    if-eqz v6, :cond_a

    .line 301
    .line 302
    new-instance v0, Ldc/j;

    .line 303
    .line 304
    invoke-direct {v0, v2, v3, v4}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 305
    .line 306
    .line 307
    goto :goto_1

    .line 308
    :cond_a
    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    if-eqz v0, :cond_b

    .line 313
    .line 314
    new-instance v0, Ldc/n;

    .line 315
    .line 316
    invoke-direct {v0, v2, v3, v4}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 317
    .line 318
    .line 319
    goto :goto_1

    .line 320
    :cond_b
    new-instance v0, Ldc/s;

    .line 321
    .line 322
    invoke-direct {v0, v2, v3, v4}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 323
    .line 324
    .line 325
    :goto_1
    invoke-virtual {v1}, Lhc/f;->k()Ljava/util/Map;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v1}, Lgc/a;->u()Lgc/e;

    .line 333
    .line 334
    .line 335
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 336
    invoke-static {}, LX3/a;->f()V

    .line 337
    .line 338
    .line 339
    return-object v0

    .line 340
    :goto_2
    invoke-static {}, LX3/a;->f()V

    .line 341
    .line 342
    .line 343
    throw v0
.end method
