.class public final Lio/sentry/y0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field public final a:Lio/sentry/A0;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/A0;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lio/sentry/A0;-><init>(I)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/y0;->a:Lio/sentry/A0;

    .line 10
    .line 11
    return-void
.end method

.method private b(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/util/Collection;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lio/sentry/k1;->B()Lio/sentry/k1;

    .line 2
    .line 3
    .line 4
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, p1, p2, v0}, Lio/sentry/y0;->a(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-interface {p1}, Lio/sentry/k1;->y()Lio/sentry/k1;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private c(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/util/Date;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p3}, Lio/sentry/l;->h(Ljava/util/Date;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-interface {p1, p3}, Lio/sentry/k1;->f(Ljava/lang/String;)Lio/sentry/k1;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    move-exception p3

    .line 10
    sget-object v0, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 11
    .line 12
    const-string v1, "Error when serializing Date"

    .line 13
    .line 14
    invoke-interface {p2, v0, v1, p3}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Lio/sentry/k1;->l()Lio/sentry/k1;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private d(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/util/Map;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Lio/sentry/k1;->x()Lio/sentry/k1;

    .line 2
    .line 3
    .line 4
    invoke-interface {p3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    instance-of v2, v1, Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    move-object v2, v1

    .line 27
    check-cast v2, Ljava/lang/String;

    .line 28
    .line 29
    invoke-interface {p1, v2}, Lio/sentry/k1;->e(Ljava/lang/String;)Lio/sentry/k1;

    .line 30
    .line 31
    .line 32
    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p0, p1, p2, v1}, Lio/sentry/y0;->a(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-interface {p1}, Lio/sentry/k1;->I()Lio/sentry/k1;

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method private e(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/util/TimeZone;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p3}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-interface {p1, p3}, Lio/sentry/k1;->f(Ljava/lang/String;)Lio/sentry/k1;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    move-exception p3

    .line 10
    sget-object v0, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 11
    .line 12
    const-string v1, "Error when serializing TimeZone"

    .line 13
    .line 14
    invoke-interface {p2, v0, v1, p3}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Lio/sentry/k1;->l()Lio/sentry/k1;

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public a(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/lang/Object;)V
    .locals 5

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Lio/sentry/k1;->l()Lio/sentry/k1;

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    instance-of v0, p3, Ljava/lang/Character;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    check-cast p3, Ljava/lang/Character;

    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/lang/Character;->charValue()C

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-static {p2}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-interface {p1, p2}, Lio/sentry/k1;->f(Ljava/lang/String;)Lio/sentry/k1;

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    instance-of v0, p3, Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    check-cast p3, Ljava/lang/String;

    .line 30
    .line 31
    invoke-interface {p1, p3}, Lio/sentry/k1;->f(Ljava/lang/String;)Lio/sentry/k1;

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    instance-of v0, p3, Ljava/lang/Boolean;

    .line 36
    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    check-cast p3, Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    invoke-interface {p1, p2}, Lio/sentry/k1;->d(Z)Lio/sentry/k1;

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_3
    instance-of v0, p3, Ljava/lang/Number;

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    check-cast p3, Ljava/lang/Number;

    .line 54
    .line 55
    invoke-interface {p1, p3}, Lio/sentry/k1;->i(Ljava/lang/Number;)Lio/sentry/k1;

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_4
    instance-of v0, p3, Ljava/util/Date;

    .line 60
    .line 61
    if-eqz v0, :cond_5

    .line 62
    .line 63
    check-cast p3, Ljava/util/Date;

    .line 64
    .line 65
    invoke-direct {p0, p1, p2, p3}, Lio/sentry/y0;->c(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/util/Date;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_5
    instance-of v0, p3, Ljava/util/TimeZone;

    .line 70
    .line 71
    if-eqz v0, :cond_6

    .line 72
    .line 73
    check-cast p3, Ljava/util/TimeZone;

    .line 74
    .line 75
    invoke-direct {p0, p1, p2, p3}, Lio/sentry/y0;->e(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/util/TimeZone;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_6
    instance-of v0, p3, Lio/sentry/B0;

    .line 80
    .line 81
    if-eqz v0, :cond_7

    .line 82
    .line 83
    check-cast p3, Lio/sentry/B0;

    .line 84
    .line 85
    invoke-interface {p3, p1, p2}, Lio/sentry/B0;->serialize(Lio/sentry/k1;Lio/sentry/ILogger;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_7
    instance-of v0, p3, Ljava/util/Collection;

    .line 90
    .line 91
    if-eqz v0, :cond_8

    .line 92
    .line 93
    check-cast p3, Ljava/util/Collection;

    .line 94
    .line 95
    invoke-direct {p0, p1, p2, p3}, Lio/sentry/y0;->b(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_8
    instance-of v0, p3, [Z

    .line 100
    .line 101
    const/4 v1, 0x0

    .line 102
    if-eqz v0, :cond_a

    .line 103
    .line 104
    new-instance v0, Ljava/util/ArrayList;

    .line 105
    .line 106
    check-cast p3, [Z

    .line 107
    .line 108
    array-length v2, p3

    .line 109
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 110
    .line 111
    .line 112
    array-length v2, p3

    .line 113
    :goto_0
    if-ge v1, v2, :cond_9

    .line 114
    .line 115
    aget-boolean v3, p3, v1

    .line 116
    .line 117
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    add-int/lit8 v1, v1, 0x1

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_9
    invoke-direct {p0, p1, p2, v0}, Lio/sentry/y0;->b(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_a
    instance-of v0, p3, [B

    .line 132
    .line 133
    if-eqz v0, :cond_c

    .line 134
    .line 135
    new-instance v0, Ljava/util/ArrayList;

    .line 136
    .line 137
    check-cast p3, [B

    .line 138
    .line 139
    array-length v2, p3

    .line 140
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 141
    .line 142
    .line 143
    array-length v2, p3

    .line 144
    :goto_1
    if-ge v1, v2, :cond_b

    .line 145
    .line 146
    aget-byte v3, p3, v1

    .line 147
    .line 148
    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    add-int/lit8 v1, v1, 0x1

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_b
    invoke-direct {p0, p1, p2, v0}, Lio/sentry/y0;->b(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_c
    instance-of v0, p3, [S

    .line 163
    .line 164
    if-eqz v0, :cond_e

    .line 165
    .line 166
    new-instance v0, Ljava/util/ArrayList;

    .line 167
    .line 168
    check-cast p3, [S

    .line 169
    .line 170
    array-length v2, p3

    .line 171
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 172
    .line 173
    .line 174
    array-length v2, p3

    .line 175
    :goto_2
    if-ge v1, v2, :cond_d

    .line 176
    .line 177
    aget-short v3, p3, v1

    .line 178
    .line 179
    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    add-int/lit8 v1, v1, 0x1

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_d
    invoke-direct {p0, p1, p2, v0}, Lio/sentry/y0;->b(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :cond_e
    instance-of v0, p3, [C

    .line 194
    .line 195
    if-eqz v0, :cond_10

    .line 196
    .line 197
    new-instance v0, Ljava/util/ArrayList;

    .line 198
    .line 199
    check-cast p3, [C

    .line 200
    .line 201
    array-length v2, p3

    .line 202
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 203
    .line 204
    .line 205
    array-length v2, p3

    .line 206
    :goto_3
    if-ge v1, v2, :cond_f

    .line 207
    .line 208
    aget-char v3, p3, v1

    .line 209
    .line 210
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    add-int/lit8 v1, v1, 0x1

    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_f
    invoke-direct {p0, p1, p2, v0}, Lio/sentry/y0;->b(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :cond_10
    instance-of v0, p3, [I

    .line 225
    .line 226
    if-eqz v0, :cond_12

    .line 227
    .line 228
    new-instance v0, Ljava/util/ArrayList;

    .line 229
    .line 230
    check-cast p3, [I

    .line 231
    .line 232
    array-length v2, p3

    .line 233
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 234
    .line 235
    .line 236
    array-length v2, p3

    .line 237
    :goto_4
    if-ge v1, v2, :cond_11

    .line 238
    .line 239
    aget v3, p3, v1

    .line 240
    .line 241
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    add-int/lit8 v1, v1, 0x1

    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_11
    invoke-direct {p0, p1, p2, v0}, Lio/sentry/y0;->b(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 252
    .line 253
    .line 254
    return-void

    .line 255
    :cond_12
    instance-of v0, p3, [J

    .line 256
    .line 257
    if-eqz v0, :cond_14

    .line 258
    .line 259
    new-instance v0, Ljava/util/ArrayList;

    .line 260
    .line 261
    check-cast p3, [J

    .line 262
    .line 263
    array-length v2, p3

    .line 264
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 265
    .line 266
    .line 267
    array-length v2, p3

    .line 268
    :goto_5
    if-ge v1, v2, :cond_13

    .line 269
    .line 270
    aget-wide v3, p3, v1

    .line 271
    .line 272
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    add-int/lit8 v1, v1, 0x1

    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_13
    invoke-direct {p0, p1, p2, v0}, Lio/sentry/y0;->b(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 283
    .line 284
    .line 285
    return-void

    .line 286
    :cond_14
    instance-of v0, p3, [F

    .line 287
    .line 288
    if-eqz v0, :cond_16

    .line 289
    .line 290
    new-instance v0, Ljava/util/ArrayList;

    .line 291
    .line 292
    check-cast p3, [F

    .line 293
    .line 294
    array-length v2, p3

    .line 295
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 296
    .line 297
    .line 298
    array-length v2, p3

    .line 299
    :goto_6
    if-ge v1, v2, :cond_15

    .line 300
    .line 301
    aget v3, p3, v1

    .line 302
    .line 303
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    add-int/lit8 v1, v1, 0x1

    .line 311
    .line 312
    goto :goto_6

    .line 313
    :cond_15
    invoke-direct {p0, p1, p2, v0}, Lio/sentry/y0;->b(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 314
    .line 315
    .line 316
    return-void

    .line 317
    :cond_16
    instance-of v0, p3, [D

    .line 318
    .line 319
    if-eqz v0, :cond_18

    .line 320
    .line 321
    new-instance v0, Ljava/util/ArrayList;

    .line 322
    .line 323
    check-cast p3, [D

    .line 324
    .line 325
    array-length v2, p3

    .line 326
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 327
    .line 328
    .line 329
    array-length v2, p3

    .line 330
    :goto_7
    if-ge v1, v2, :cond_17

    .line 331
    .line 332
    aget-wide v3, p3, v1

    .line 333
    .line 334
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    add-int/lit8 v1, v1, 0x1

    .line 342
    .line 343
    goto :goto_7

    .line 344
    :cond_17
    invoke-direct {p0, p1, p2, v0}, Lio/sentry/y0;->b(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 345
    .line 346
    .line 347
    return-void

    .line 348
    :cond_18
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-eqz v0, :cond_19

    .line 357
    .line 358
    check-cast p3, [Ljava/lang/Object;

    .line 359
    .line 360
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 361
    .line 362
    .line 363
    move-result-object p3

    .line 364
    invoke-direct {p0, p1, p2, p3}, Lio/sentry/y0;->b(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 365
    .line 366
    .line 367
    return-void

    .line 368
    :cond_19
    instance-of v0, p3, Ljava/util/Map;

    .line 369
    .line 370
    if-eqz v0, :cond_1a

    .line 371
    .line 372
    check-cast p3, Ljava/util/Map;

    .line 373
    .line 374
    invoke-direct {p0, p1, p2, p3}, Lio/sentry/y0;->d(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/util/Map;)V

    .line 375
    .line 376
    .line 377
    return-void

    .line 378
    :cond_1a
    instance-of v0, p3, Ljava/util/Locale;

    .line 379
    .line 380
    if-eqz v0, :cond_1b

    .line 381
    .line 382
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object p2

    .line 386
    invoke-interface {p1, p2}, Lio/sentry/k1;->f(Ljava/lang/String;)Lio/sentry/k1;

    .line 387
    .line 388
    .line 389
    return-void

    .line 390
    :cond_1b
    instance-of v0, p3, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 391
    .line 392
    if-eqz v0, :cond_1c

    .line 393
    .line 394
    check-cast p3, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 395
    .line 396
    invoke-static {p3}, Lio/sentry/util/o;->a(Ljava/util/concurrent/atomic/AtomicIntegerArray;)Ljava/util/List;

    .line 397
    .line 398
    .line 399
    move-result-object p3

    .line 400
    invoke-direct {p0, p1, p2, p3}, Lio/sentry/y0;->b(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/util/Collection;)V

    .line 401
    .line 402
    .line 403
    return-void

    .line 404
    :cond_1c
    instance-of v0, p3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 405
    .line 406
    if-eqz v0, :cond_1d

    .line 407
    .line 408
    check-cast p3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 409
    .line 410
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 411
    .line 412
    .line 413
    move-result p2

    .line 414
    invoke-interface {p1, p2}, Lio/sentry/k1;->d(Z)Lio/sentry/k1;

    .line 415
    .line 416
    .line 417
    return-void

    .line 418
    :cond_1d
    instance-of v0, p3, Ljava/net/URI;

    .line 419
    .line 420
    if-eqz v0, :cond_1e

    .line 421
    .line 422
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object p2

    .line 426
    invoke-interface {p1, p2}, Lio/sentry/k1;->f(Ljava/lang/String;)Lio/sentry/k1;

    .line 427
    .line 428
    .line 429
    return-void

    .line 430
    :cond_1e
    instance-of v0, p3, Ljava/net/InetAddress;

    .line 431
    .line 432
    if-eqz v0, :cond_1f

    .line 433
    .line 434
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object p2

    .line 438
    invoke-interface {p1, p2}, Lio/sentry/k1;->f(Ljava/lang/String;)Lio/sentry/k1;

    .line 439
    .line 440
    .line 441
    return-void

    .line 442
    :cond_1f
    instance-of v0, p3, Ljava/util/UUID;

    .line 443
    .line 444
    if-eqz v0, :cond_20

    .line 445
    .line 446
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object p2

    .line 450
    invoke-interface {p1, p2}, Lio/sentry/k1;->f(Ljava/lang/String;)Lio/sentry/k1;

    .line 451
    .line 452
    .line 453
    return-void

    .line 454
    :cond_20
    instance-of v0, p3, Ljava/util/Currency;

    .line 455
    .line 456
    if-eqz v0, :cond_21

    .line 457
    .line 458
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object p2

    .line 462
    invoke-interface {p1, p2}, Lio/sentry/k1;->f(Ljava/lang/String;)Lio/sentry/k1;

    .line 463
    .line 464
    .line 465
    return-void

    .line 466
    :cond_21
    instance-of v0, p3, Ljava/util/Calendar;

    .line 467
    .line 468
    if-eqz v0, :cond_22

    .line 469
    .line 470
    check-cast p3, Ljava/util/Calendar;

    .line 471
    .line 472
    invoke-static {p3}, Lio/sentry/util/o;->d(Ljava/util/Calendar;)Ljava/util/Map;

    .line 473
    .line 474
    .line 475
    move-result-object p3

    .line 476
    invoke-direct {p0, p1, p2, p3}, Lio/sentry/y0;->d(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/util/Map;)V

    .line 477
    .line 478
    .line 479
    return-void

    .line 480
    :cond_22
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    .line 485
    .line 486
    .line 487
    move-result v0

    .line 488
    if-eqz v0, :cond_23

    .line 489
    .line 490
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object p2

    .line 494
    invoke-interface {p1, p2}, Lio/sentry/k1;->f(Ljava/lang/String;)Lio/sentry/k1;

    .line 495
    .line 496
    .line 497
    return-void

    .line 498
    :cond_23
    :try_start_0
    iget-object v0, p0, Lio/sentry/y0;->a:Lio/sentry/A0;

    .line 499
    .line 500
    invoke-virtual {v0, p3, p2}, Lio/sentry/A0;->d(Ljava/lang/Object;Lio/sentry/ILogger;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object p3

    .line 504
    invoke-virtual {p0, p1, p2, p3}, Lio/sentry/y0;->a(Lio/sentry/k1;Lio/sentry/ILogger;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 505
    .line 506
    .line 507
    return-void

    .line 508
    :catch_0
    move-exception p3

    .line 509
    sget-object v0, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 510
    .line 511
    const-string v1, "Failed serializing unknown object."

    .line 512
    .line 513
    invoke-interface {p2, v0, v1, p3}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 514
    .line 515
    .line 516
    const-string p2, "[OBJECT]"

    .line 517
    .line 518
    invoke-interface {p1, p2}, Lio/sentry/k1;->f(Ljava/lang/String;)Lio/sentry/k1;

    .line 519
    .line 520
    .line 521
    return-void
.end method
