.class public final Lexpo/modules/updates/c$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/updates/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:Lrd/d;

.field private final b:LEf/a;

.field private final c:Lrd/d;

.field private final d:Ljava/lang/Exception;

.field private final e:Z

.field private final f:Z

.field private final g:Ljava/lang/String;

.field private final h:Lexpo/modules/updates/d$a;

.field private final i:Ljava/util/Map;

.field private final j:Ljava/util/Map;

.field private final k:Z

.field private final l:LCd/b;


# direct methods
.method private constructor <init>(Lrd/d;LEf/a;Lrd/d;Ljava/lang/Exception;ZZLjava/lang/String;Lexpo/modules/updates/d$a;Ljava/util/Map;Ljava/util/Map;ZLCd/b;)V
    .locals 1

    const-string v0, "checkOnLaunch"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestHeaders"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialContext"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lexpo/modules/updates/c$c;->a:Lrd/d;

    .line 4
    iput-object p2, p0, Lexpo/modules/updates/c$c;->b:LEf/a;

    .line 5
    iput-object p3, p0, Lexpo/modules/updates/c$c;->c:Lrd/d;

    .line 6
    iput-object p4, p0, Lexpo/modules/updates/c$c;->d:Ljava/lang/Exception;

    .line 7
    iput-boolean p5, p0, Lexpo/modules/updates/c$c;->e:Z

    .line 8
    iput-boolean p6, p0, Lexpo/modules/updates/c$c;->f:Z

    .line 9
    iput-object p7, p0, Lexpo/modules/updates/c$c;->g:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lexpo/modules/updates/c$c;->h:Lexpo/modules/updates/d$a;

    .line 11
    iput-object p9, p0, Lexpo/modules/updates/c$c;->i:Ljava/util/Map;

    .line 12
    iput-object p10, p0, Lexpo/modules/updates/c$c;->j:Ljava/util/Map;

    .line 13
    iput-boolean p11, p0, Lexpo/modules/updates/c$c;->k:Z

    .line 14
    iput-object p12, p0, Lexpo/modules/updates/c$c;->l:LCd/b;

    return-void
.end method

.method public synthetic constructor <init>(Lrd/d;LEf/a;Lrd/d;Ljava/lang/Exception;ZZLjava/lang/String;Lexpo/modules/updates/d$a;Ljava/util/Map;Ljava/util/Map;ZLCd/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p12}, Lexpo/modules/updates/c$c;-><init>(Lrd/d;LEf/a;Lrd/d;Ljava/lang/Exception;ZZLjava/lang/String;Lexpo/modules/updates/d$a;Ljava/util/Map;Ljava/util/Map;ZLCd/b;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lexpo/modules/updates/c$c;->d:Ljava/lang/Exception;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    move v1, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v1, v3

    .line 15
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v4, "isEmergencyLaunch"

    .line 20
    .line 21
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lexpo/modules/updates/c$c;->d:Ljava/lang/Exception;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object v1, v4

    .line 35
    :goto_1
    const-string v5, "emergencyLaunchReason"

    .line 36
    .line 37
    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lexpo/modules/updates/c$c;->c:Lrd/d;

    .line 41
    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    iget-object v1, p0, Lexpo/modules/updates/c$c;->a:Lrd/d;

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-virtual {v1}, Lrd/d;->d()Ljava/util/UUID;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    iget-object v5, p0, Lexpo/modules/updates/c$c;->c:Lrd/d;

    .line 55
    .line 56
    invoke-virtual {v5}, Lrd/d;->d()Ljava/util/UUID;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v1, v5}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    move v1, v3

    .line 66
    :goto_2
    if-eqz v1, :cond_3

    .line 67
    .line 68
    move v1, v2

    .line 69
    goto :goto_3

    .line 70
    :cond_3
    move v1, v3

    .line 71
    :goto_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    const-string v5, "isEmbeddedLaunch"

    .line 76
    .line 77
    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    iget-boolean v1, p0, Lexpo/modules/updates/c$c;->e:Z

    .line 81
    .line 82
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    const-string v5, "isEnabled"

    .line 87
    .line 88
    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, Lexpo/modules/updates/c$c;->b:LEf/a;

    .line 92
    .line 93
    if-eqz v1, :cond_4

    .line 94
    .line 95
    invoke-virtual {v1}, LEf/a;->S()J

    .line 96
    .line 97
    .line 98
    move-result-wide v4

    .line 99
    sget-object v1, LEf/d;->d:LEf/d;

    .line 100
    .line 101
    invoke-static {v4, v5, v1}, LEf/a;->P(JLEf/d;)J

    .line 102
    .line 103
    .line 104
    move-result-wide v4

    .line 105
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    :cond_4
    const-string v1, "launchDuration"

    .line 110
    .line 111
    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    iget-boolean v1, p0, Lexpo/modules/updates/c$c;->f:Z

    .line 115
    .line 116
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    const-string v4, "isUsingEmbeddedAssets"

    .line 121
    .line 122
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    iget-object v1, p0, Lexpo/modules/updates/c$c;->g:Ljava/lang/String;

    .line 126
    .line 127
    const-string v4, ""

    .line 128
    .line 129
    if-nez v1, :cond_5

    .line 130
    .line 131
    move-object v1, v4

    .line 132
    :cond_5
    const-string v5, "runtimeVersion"

    .line 133
    .line 134
    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    iget-object v1, p0, Lexpo/modules/updates/c$c;->h:Lexpo/modules/updates/d$a;

    .line 138
    .line 139
    invoke-virtual {v1}, Lexpo/modules/updates/d$a;->b()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    const-string v5, "checkAutomatically"

    .line 144
    .line 145
    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    iget-object v1, p0, Lexpo/modules/updates/c$c;->i:Ljava/util/Map;

    .line 149
    .line 150
    const-string v5, "expo-channel-name"

    .line 151
    .line 152
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    check-cast v1, Ljava/lang/String;

    .line 157
    .line 158
    if-nez v1, :cond_6

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_6
    move-object v4, v1

    .line 162
    :goto_4
    const-string v1, "channel"

    .line 163
    .line 164
    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    iget-boolean v1, p0, Lexpo/modules/updates/c$c;->k:Z

    .line 168
    .line 169
    if-nez v1, :cond_8

    .line 170
    .line 171
    sget-object v1, Lexpo/modules/updates/UpdatesPackage;->a:Lexpo/modules/updates/UpdatesPackage$a;

    .line 172
    .line 173
    invoke-virtual {v1}, Lexpo/modules/updates/UpdatesPackage$a;->b()Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_7

    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_7
    move v2, v3

    .line 181
    :cond_8
    :goto_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    const-string v2, "shouldDeferToNativeForAPIMethodAvailabilityInDevelopment"

    .line 186
    .line 187
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    iget-object v1, p0, Lexpo/modules/updates/c$c;->l:LCd/b;

    .line 191
    .line 192
    invoke-virtual {v1}, LCd/b;->f()Landroid/os/Bundle;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    const-string v2, "initialContext"

    .line 197
    .line 198
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    iget-object v1, p0, Lexpo/modules/updates/c$c;->a:Lrd/d;

    .line 202
    .line 203
    if-eqz v1, :cond_9

    .line 204
    .line 205
    invoke-virtual {v1}, Lrd/d;->d()Ljava/util/UUID;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    const-string v2, "updateId"

    .line 214
    .line 215
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    iget-object v1, p0, Lexpo/modules/updates/c$c;->a:Lrd/d;

    .line 219
    .line 220
    invoke-virtual {v1}, Lrd/d;->b()Ljava/util/Date;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    .line 225
    .line 226
    .line 227
    move-result-wide v1

    .line 228
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    const-string v2, "commitTime"

    .line 233
    .line 234
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    iget-object v1, p0, Lexpo/modules/updates/c$c;->a:Lrd/d;

    .line 238
    .line 239
    invoke-virtual {v1}, Lrd/d;->i()Lorg/json/JSONObject;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    const-string v2, "manifestString"

    .line 248
    .line 249
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    :cond_9
    iget-object v1, p0, Lexpo/modules/updates/c$c;->j:Ljava/util/Map;

    .line 253
    .line 254
    if-eqz v1, :cond_c

    .line 255
    .line 256
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 257
    .line 258
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 259
    .line 260
    .line 261
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    :cond_a
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    if-eqz v4, :cond_b

    .line 274
    .line 275
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    check-cast v4, Lrd/a;

    .line 280
    .line 281
    invoke-virtual {v4}, Lrd/a;->j()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    if-eqz v5, :cond_a

    .line 286
    .line 287
    invoke-virtual {v4}, Lrd/a;->j()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    invoke-static {v5}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    goto :goto_6

    .line 305
    :cond_b
    const-string v1, "localAssets"

    .line 306
    .line 307
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    :cond_c
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lexpo/modules/updates/c$c;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lexpo/modules/updates/c$c;

    .line 12
    .line 13
    iget-object v1, p0, Lexpo/modules/updates/c$c;->a:Lrd/d;

    .line 14
    .line 15
    iget-object v3, p1, Lexpo/modules/updates/c$c;->a:Lrd/d;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lexpo/modules/updates/c$c;->b:LEf/a;

    .line 25
    .line 26
    iget-object v3, p1, Lexpo/modules/updates/c$c;->b:LEf/a;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lexpo/modules/updates/c$c;->c:Lrd/d;

    .line 36
    .line 37
    iget-object v3, p1, Lexpo/modules/updates/c$c;->c:Lrd/d;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lexpo/modules/updates/c$c;->d:Ljava/lang/Exception;

    .line 47
    .line 48
    iget-object v3, p1, Lexpo/modules/updates/c$c;->d:Ljava/lang/Exception;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-boolean v1, p0, Lexpo/modules/updates/c$c;->e:Z

    .line 58
    .line 59
    iget-boolean v3, p1, Lexpo/modules/updates/c$c;->e:Z

    .line 60
    .line 61
    if-eq v1, v3, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    iget-boolean v1, p0, Lexpo/modules/updates/c$c;->f:Z

    .line 65
    .line 66
    iget-boolean v3, p1, Lexpo/modules/updates/c$c;->f:Z

    .line 67
    .line 68
    if-eq v1, v3, :cond_7

    .line 69
    .line 70
    return v2

    .line 71
    :cond_7
    iget-object v1, p0, Lexpo/modules/updates/c$c;->g:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v3, p1, Lexpo/modules/updates/c$c;->g:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_8

    .line 80
    .line 81
    return v2

    .line 82
    :cond_8
    iget-object v1, p0, Lexpo/modules/updates/c$c;->h:Lexpo/modules/updates/d$a;

    .line 83
    .line 84
    iget-object v3, p1, Lexpo/modules/updates/c$c;->h:Lexpo/modules/updates/d$a;

    .line 85
    .line 86
    if-eq v1, v3, :cond_9

    .line 87
    .line 88
    return v2

    .line 89
    :cond_9
    iget-object v1, p0, Lexpo/modules/updates/c$c;->i:Ljava/util/Map;

    .line 90
    .line 91
    iget-object v3, p1, Lexpo/modules/updates/c$c;->i:Ljava/util/Map;

    .line 92
    .line 93
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_a

    .line 98
    .line 99
    return v2

    .line 100
    :cond_a
    iget-object v1, p0, Lexpo/modules/updates/c$c;->j:Ljava/util/Map;

    .line 101
    .line 102
    iget-object v3, p1, Lexpo/modules/updates/c$c;->j:Ljava/util/Map;

    .line 103
    .line 104
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-nez v1, :cond_b

    .line 109
    .line 110
    return v2

    .line 111
    :cond_b
    iget-boolean v1, p0, Lexpo/modules/updates/c$c;->k:Z

    .line 112
    .line 113
    iget-boolean v3, p1, Lexpo/modules/updates/c$c;->k:Z

    .line 114
    .line 115
    if-eq v1, v3, :cond_c

    .line 116
    .line 117
    return v2

    .line 118
    :cond_c
    iget-object v1, p0, Lexpo/modules/updates/c$c;->l:LCd/b;

    .line 119
    .line 120
    iget-object p1, p1, Lexpo/modules/updates/c$c;->l:LCd/b;

    .line 121
    .line 122
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-nez p1, :cond_d

    .line 127
    .line 128
    return v2

    .line 129
    :cond_d
    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/c$c;->a:Lrd/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, Lexpo/modules/updates/c$c;->b:LEf/a;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    move v2, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {v2}, LEf/a;->S()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    invoke-static {v2, v3}, LEf/a;->E(J)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    :goto_1
    add-int/2addr v0, v2

    .line 29
    mul-int/lit8 v0, v0, 0x1f

    .line 30
    .line 31
    iget-object v2, p0, Lexpo/modules/updates/c$c;->c:Lrd/d;

    .line 32
    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    move v2, v1

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    :goto_2
    add-int/2addr v0, v2

    .line 42
    mul-int/lit8 v0, v0, 0x1f

    .line 43
    .line 44
    iget-object v2, p0, Lexpo/modules/updates/c$c;->d:Ljava/lang/Exception;

    .line 45
    .line 46
    if-nez v2, :cond_3

    .line 47
    .line 48
    move v2, v1

    .line 49
    goto :goto_3

    .line 50
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    :goto_3
    add-int/2addr v0, v2

    .line 55
    mul-int/lit8 v0, v0, 0x1f

    .line 56
    .line 57
    iget-boolean v2, p0, Lexpo/modules/updates/c$c;->e:Z

    .line 58
    .line 59
    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    add-int/2addr v0, v2

    .line 64
    mul-int/lit8 v0, v0, 0x1f

    .line 65
    .line 66
    iget-boolean v2, p0, Lexpo/modules/updates/c$c;->f:Z

    .line 67
    .line 68
    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    add-int/2addr v0, v2

    .line 73
    mul-int/lit8 v0, v0, 0x1f

    .line 74
    .line 75
    iget-object v2, p0, Lexpo/modules/updates/c$c;->g:Ljava/lang/String;

    .line 76
    .line 77
    if-nez v2, :cond_4

    .line 78
    .line 79
    move v2, v1

    .line 80
    goto :goto_4

    .line 81
    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    :goto_4
    add-int/2addr v0, v2

    .line 86
    mul-int/lit8 v0, v0, 0x1f

    .line 87
    .line 88
    iget-object v2, p0, Lexpo/modules/updates/c$c;->h:Lexpo/modules/updates/d$a;

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    add-int/2addr v0, v2

    .line 95
    mul-int/lit8 v0, v0, 0x1f

    .line 96
    .line 97
    iget-object v2, p0, Lexpo/modules/updates/c$c;->i:Ljava/util/Map;

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    add-int/2addr v0, v2

    .line 104
    mul-int/lit8 v0, v0, 0x1f

    .line 105
    .line 106
    iget-object v2, p0, Lexpo/modules/updates/c$c;->j:Ljava/util/Map;

    .line 107
    .line 108
    if-nez v2, :cond_5

    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    :goto_5
    add-int/2addr v0, v1

    .line 116
    mul-int/lit8 v0, v0, 0x1f

    .line 117
    .line 118
    iget-boolean v1, p0, Lexpo/modules/updates/c$c;->k:Z

    .line 119
    .line 120
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    add-int/2addr v0, v1

    .line 125
    mul-int/lit8 v0, v0, 0x1f

    .line 126
    .line 127
    iget-object v1, p0, Lexpo/modules/updates/c$c;->l:LCd/b;

    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    add-int/2addr v0, v1

    .line 134
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/c$c;->a:Lrd/d;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/updates/c$c;->b:LEf/a;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/updates/c$c;->c:Lrd/d;

    .line 6
    .line 7
    iget-object v3, p0, Lexpo/modules/updates/c$c;->d:Ljava/lang/Exception;

    .line 8
    .line 9
    iget-boolean v4, p0, Lexpo/modules/updates/c$c;->e:Z

    .line 10
    .line 11
    iget-boolean v5, p0, Lexpo/modules/updates/c$c;->f:Z

    .line 12
    .line 13
    iget-object v6, p0, Lexpo/modules/updates/c$c;->g:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, p0, Lexpo/modules/updates/c$c;->h:Lexpo/modules/updates/d$a;

    .line 16
    .line 17
    iget-object v8, p0, Lexpo/modules/updates/c$c;->i:Ljava/util/Map;

    .line 18
    .line 19
    iget-object v9, p0, Lexpo/modules/updates/c$c;->j:Ljava/util/Map;

    .line 20
    .line 21
    iget-boolean v10, p0, Lexpo/modules/updates/c$c;->k:Z

    .line 22
    .line 23
    iget-object v11, p0, Lexpo/modules/updates/c$c;->l:LCd/b;

    .line 24
    .line 25
    new-instance v12, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v13, "UpdatesModuleConstants(launchedUpdate="

    .line 31
    .line 32
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v0, ", launchDuration="

    .line 39
    .line 40
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v0, ", embeddedUpdate="

    .line 47
    .line 48
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v0, ", emergencyLaunchException="

    .line 55
    .line 56
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v0, ", isEnabled="

    .line 63
    .line 64
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v0, ", isUsingEmbeddedAssets="

    .line 71
    .line 72
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v0, ", runtimeVersion="

    .line 79
    .line 80
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v0, ", checkOnLaunch="

    .line 87
    .line 88
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v0, ", requestHeaders="

    .line 95
    .line 96
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v0, ", localAssetFiles="

    .line 103
    .line 104
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v0, ", shouldDeferToNativeForAPIMethodAvailabilityInDevelopment="

    .line 111
    .line 112
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v0, ", initialContext="

    .line 119
    .line 120
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v0, ")"

    .line 127
    .line 128
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    return-object v0
.end method
