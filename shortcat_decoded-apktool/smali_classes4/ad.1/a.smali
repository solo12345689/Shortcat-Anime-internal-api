.class public final Lad/a;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lbd/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lad/a;",
        "Lgc/c;",
        "Lbd/a;",
        "<init>",
        "()V",
        "LUb/u;",
        "promise",
        "Lcom/google/firebase/messaging/FirebaseMessaging;",
        "y",
        "(LUb/u;)Lcom/google/firebase/messaging/FirebaseMessaging;",
        "",
        "token",
        "LTd/L;",
        "a",
        "(Ljava/lang/String;)V",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
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

.method public static final synthetic x(Lad/a;LUb/u;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lad/a;->y(LUb/u;)Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final y(LUb/u;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->t()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    .line 4
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p1

    .line 6
    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v3, "Make sure to complete the guide at https://docs.expo.dev/push-notifications/fcm-credentials/ : "

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "E_REGISTRATION_FAILED"

    .line 29
    .line 30
    invoke-interface {p1, v2, v1, v0}, LUb/u;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    return-object p1
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "token"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget-object v0, LTd/u;->b:LTd/u$a;

    .line 7
    .line 8
    const-string v0, "onDevicePushToken"

    .line 9
    .line 10
    const-string v1, "devicePushToken"

    .line 11
    .line 12
    invoke-static {v1, p1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, LUd/S;->f(Lkotlin/Pair;)Ljava/util/Map;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, v0, p1}, Lgc/c;->t(Ljava/lang/String;Ljava/util/Map;)V

    .line 21
    .line 22
    .line 23
    sget-object p1, LTd/L;->a:LTd/L;

    .line 24
    .line 25
    invoke-static {p1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    sget-object v0, LTd/u;->b:LTd/u$a;

    .line 31
    .line 32
    invoke-static {p1}, LTd/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public n()Lgc/e;
    .locals 15

    .line 1
    const-class v0, LUb/u;

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
    const-string v2, "ExpoPushTokenManager"

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Lgc/a;->s(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v2, "onDevicePushToken"

    .line 65
    .line 66
    filled-new-array {v2}, [Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v1, v2}, Lhc/f;->d([Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Lgc/a;->w()Ljava/util/Map;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    sget-object v3, Lbc/e;->a:Lbc/e;

    .line 78
    .line 79
    new-instance v4, Lbc/a;

    .line 80
    .line 81
    new-instance v5, Lad/a$i;

    .line 82
    .line 83
    invoke-direct {v5, p0}, Lad/a$i;-><init>(Lad/a;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {v4, v3, v5}, Lbc/a;-><init>(Lbc/e;Lie/a;)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Lgc/a;->w()Ljava/util/Map;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    sget-object v3, Lbc/e;->b:Lbc/e;

    .line 97
    .line 98
    new-instance v4, Lbc/a;

    .line 99
    .line 100
    new-instance v5, Lad/a$j;

    .line 101
    .line 102
    invoke-direct {v5, p0}, Lad/a$j;-><init>(Lad/a;)V

    .line 103
    .line 104
    .line 105
    invoke-direct {v4, v3, v5}, Lbc/a;-><init>(Lbc/e;Lie/a;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    const-string v2, "getDevicePushTokenAsync"

    .line 112
    .line 113
    invoke-static {v0, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    const-class v4, Ljava/lang/String;

    .line 118
    .line 119
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 120
    .line 121
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 122
    .line 123
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 124
    .line 125
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 126
    .line 127
    const-class v9, LTd/L;

    .line 128
    .line 129
    const/4 v10, 0x0

    .line 130
    if-eqz v3, :cond_0

    .line 131
    .line 132
    :try_start_1
    new-instance v3, Ldc/f;

    .line 133
    .line 134
    new-array v11, v10, [Lpc/b;

    .line 135
    .line 136
    new-instance v12, Lad/a$c;

    .line 137
    .line 138
    invoke-direct {v12, p0, v1}, Lad/a$c;-><init>(Lad/a;Lgc/d;)V

    .line 139
    .line 140
    .line 141
    invoke-direct {v3, v2, v11, v12}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 142
    .line 143
    .line 144
    goto/16 :goto_1

    .line 145
    .line 146
    :catchall_0
    move-exception v0

    .line 147
    goto/16 :goto_4

    .line 148
    .line 149
    :cond_0
    invoke-virtual {v1}, Lhc/f;->m()Lpc/X;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    sget-object v11, Lpc/d;->a:Lpc/d;

    .line 154
    .line 155
    new-instance v12, Lkotlin/Pair;

    .line 156
    .line 157
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 158
    .line 159
    .line 160
    move-result-object v13

    .line 161
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 162
    .line 163
    invoke-direct {v12, v13, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v11}, Lpc/d;->a()Ljava/util/Map;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    invoke-interface {v11, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v11

    .line 174
    check-cast v11, Lpc/b;

    .line 175
    .line 176
    if-nez v11, :cond_1

    .line 177
    .line 178
    sget-object v11, Lad/a$d;->a:Lad/a$d;

    .line 179
    .line 180
    new-instance v12, Lpc/b;

    .line 181
    .line 182
    new-instance v13, Lpc/M;

    .line 183
    .line 184
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 185
    .line 186
    .line 187
    move-result-object v14

    .line 188
    invoke-direct {v13, v14, v10, v11}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 189
    .line 190
    .line 191
    invoke-direct {v12, v13, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 192
    .line 193
    .line 194
    move-object v11, v12

    .line 195
    :cond_1
    filled-new-array {v11}, [Lpc/b;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    new-instance v11, Lad/a$e;

    .line 200
    .line 201
    invoke-direct {v11, p0, v1}, Lad/a$e;-><init>(Lad/a;Lgc/d;)V

    .line 202
    .line 203
    .line 204
    invoke-static {v9, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v12

    .line 208
    if-eqz v12, :cond_2

    .line 209
    .line 210
    new-instance v12, Ldc/l;

    .line 211
    .line 212
    invoke-direct {v12, v2, v3, v11}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 213
    .line 214
    .line 215
    :goto_0
    move-object v3, v12

    .line 216
    goto :goto_1

    .line 217
    :cond_2
    invoke-static {v9, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v12

    .line 221
    if-eqz v12, :cond_3

    .line 222
    .line 223
    new-instance v12, Ldc/h;

    .line 224
    .line 225
    invoke-direct {v12, v2, v3, v11}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 226
    .line 227
    .line 228
    goto :goto_0

    .line 229
    :cond_3
    invoke-static {v9, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v12

    .line 233
    if-eqz v12, :cond_4

    .line 234
    .line 235
    new-instance v12, Ldc/i;

    .line 236
    .line 237
    invoke-direct {v12, v2, v3, v11}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 238
    .line 239
    .line 240
    goto :goto_0

    .line 241
    :cond_4
    invoke-static {v9, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v12

    .line 245
    if-eqz v12, :cond_5

    .line 246
    .line 247
    new-instance v12, Ldc/j;

    .line 248
    .line 249
    invoke-direct {v12, v2, v3, v11}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 250
    .line 251
    .line 252
    goto :goto_0

    .line 253
    :cond_5
    invoke-static {v9, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v12

    .line 257
    if-eqz v12, :cond_6

    .line 258
    .line 259
    new-instance v12, Ldc/n;

    .line 260
    .line 261
    invoke-direct {v12, v2, v3, v11}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 262
    .line 263
    .line 264
    goto :goto_0

    .line 265
    :cond_6
    new-instance v12, Ldc/s;

    .line 266
    .line 267
    invoke-direct {v12, v2, v3, v11}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 268
    .line 269
    .line 270
    goto :goto_0

    .line 271
    :goto_1
    invoke-virtual {v1}, Lhc/f;->k()Ljava/util/Map;

    .line 272
    .line 273
    .line 274
    move-result-object v11

    .line 275
    invoke-interface {v11, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    const-string v2, "unregisterForNotificationsAsync"

    .line 279
    .line 280
    invoke-static {v0, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    if-eqz v3, :cond_7

    .line 285
    .line 286
    new-instance v0, Ldc/f;

    .line 287
    .line 288
    new-array v3, v10, [Lpc/b;

    .line 289
    .line 290
    new-instance v4, Lad/a$f;

    .line 291
    .line 292
    invoke-direct {v4, p0}, Lad/a$f;-><init>(Lad/a;)V

    .line 293
    .line 294
    .line 295
    invoke-direct {v0, v2, v3, v4}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 296
    .line 297
    .line 298
    goto/16 :goto_3

    .line 299
    .line 300
    :cond_7
    invoke-virtual {v1}, Lhc/f;->m()Lpc/X;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    sget-object v11, Lpc/d;->a:Lpc/d;

    .line 305
    .line 306
    new-instance v12, Lkotlin/Pair;

    .line 307
    .line 308
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 309
    .line 310
    .line 311
    move-result-object v13

    .line 312
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 313
    .line 314
    invoke-direct {v12, v13, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v11}, Lpc/d;->a()Ljava/util/Map;

    .line 318
    .line 319
    .line 320
    move-result-object v11

    .line 321
    invoke-interface {v11, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v11

    .line 325
    check-cast v11, Lpc/b;

    .line 326
    .line 327
    if-nez v11, :cond_8

    .line 328
    .line 329
    sget-object v11, Lad/a$g;->a:Lad/a$g;

    .line 330
    .line 331
    new-instance v12, Lpc/b;

    .line 332
    .line 333
    new-instance v13, Lpc/M;

    .line 334
    .line 335
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    invoke-direct {v13, v0, v10, v11}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 340
    .line 341
    .line 342
    invoke-direct {v12, v13, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 343
    .line 344
    .line 345
    move-object v11, v12

    .line 346
    :cond_8
    filled-new-array {v11}, [Lpc/b;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    new-instance v3, Lad/a$h;

    .line 351
    .line 352
    invoke-direct {v3, p0}, Lad/a$h;-><init>(Lad/a;)V

    .line 353
    .line 354
    .line 355
    invoke-static {v9, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v8

    .line 359
    if-eqz v8, :cond_9

    .line 360
    .line 361
    new-instance v4, Ldc/l;

    .line 362
    .line 363
    invoke-direct {v4, v2, v0, v3}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 364
    .line 365
    .line 366
    :goto_2
    move-object v0, v4

    .line 367
    goto :goto_3

    .line 368
    :cond_9
    invoke-static {v9, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v7

    .line 372
    if-eqz v7, :cond_a

    .line 373
    .line 374
    new-instance v4, Ldc/h;

    .line 375
    .line 376
    invoke-direct {v4, v2, v0, v3}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 377
    .line 378
    .line 379
    goto :goto_2

    .line 380
    :cond_a
    invoke-static {v9, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v6

    .line 384
    if-eqz v6, :cond_b

    .line 385
    .line 386
    new-instance v4, Ldc/i;

    .line 387
    .line 388
    invoke-direct {v4, v2, v0, v3}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 389
    .line 390
    .line 391
    goto :goto_2

    .line 392
    :cond_b
    invoke-static {v9, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v5

    .line 396
    if-eqz v5, :cond_c

    .line 397
    .line 398
    new-instance v4, Ldc/j;

    .line 399
    .line 400
    invoke-direct {v4, v2, v0, v3}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 401
    .line 402
    .line 403
    goto :goto_2

    .line 404
    :cond_c
    invoke-static {v9, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v4

    .line 408
    if-eqz v4, :cond_d

    .line 409
    .line 410
    new-instance v4, Ldc/n;

    .line 411
    .line 412
    invoke-direct {v4, v2, v0, v3}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 413
    .line 414
    .line 415
    goto :goto_2

    .line 416
    :cond_d
    new-instance v4, Ldc/s;

    .line 417
    .line 418
    invoke-direct {v4, v2, v0, v3}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 419
    .line 420
    .line 421
    goto :goto_2

    .line 422
    :goto_3
    invoke-virtual {v1}, Lhc/f;->k()Ljava/util/Map;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v1}, Lgc/a;->u()Lgc/e;

    .line 430
    .line 431
    .line 432
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 433
    invoke-static {}, LX3/a;->f()V

    .line 434
    .line 435
    .line 436
    return-object v0

    .line 437
    :goto_4
    invoke-static {}, LX3/a;->f()V

    .line 438
    .line 439
    .line 440
    throw v0
.end method
