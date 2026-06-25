.class public final Lio/sentry/p3$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/p3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lio/sentry/j1;Lio/sentry/ILogger;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/sentry/p3$a;->b(Lio/sentry/j1;Lio/sentry/ILogger;)Lio/sentry/p3;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(Lio/sentry/j1;Lio/sentry/ILogger;)Lio/sentry/p3;
    .locals 12

    .line 1
    invoke-interface {p1}, Lio/sentry/j1;->x()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move-object v2, v0

    .line 6
    move-object v3, v2

    .line 7
    move-object v4, v3

    .line 8
    move-object v5, v4

    .line 9
    move-object v6, v5

    .line 10
    move-object v7, v6

    .line 11
    move-object v8, v7

    .line 12
    move-object v9, v8

    .line 13
    :goto_0
    invoke-interface {p1}, Lio/sentry/j1;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget-object v10, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 18
    .line 19
    if-ne v1, v10, :cond_9

    .line 20
    .line 21
    invoke-interface {p1}, Lio/sentry/j1;->r0()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v10

    .line 32
    const/4 v11, -0x1

    .line 33
    sparse-switch v10, :sswitch_data_0

    .line 34
    .line 35
    .line 36
    goto/16 :goto_1

    .line 37
    .line 38
    :sswitch_0
    const-string v10, "trace_id"

    .line 39
    .line 40
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v10

    .line 44
    if-nez v10, :cond_0

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    const/4 v11, 0x7

    .line 48
    goto :goto_1

    .line 49
    :sswitch_1
    const-string v10, "attributes"

    .line 50
    .line 51
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    if-nez v10, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const/4 v11, 0x6

    .line 59
    goto :goto_1

    .line 60
    :sswitch_2
    const-string v10, "value"

    .line 61
    .line 62
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v10

    .line 66
    if-nez v10, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    const/4 v11, 0x5

    .line 70
    goto :goto_1

    .line 71
    :sswitch_3
    const-string v10, "timestamp"

    .line 72
    .line 73
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v10

    .line 77
    if-nez v10, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    const/4 v11, 0x4

    .line 81
    goto :goto_1

    .line 82
    :sswitch_4
    const-string v10, "unit"

    .line 83
    .line 84
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    if-nez v10, :cond_4

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    const/4 v11, 0x3

    .line 92
    goto :goto_1

    .line 93
    :sswitch_5
    const-string v10, "type"

    .line 94
    .line 95
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    if-nez v10, :cond_5

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_5
    const/4 v11, 0x2

    .line 103
    goto :goto_1

    .line 104
    :sswitch_6
    const-string v10, "name"

    .line 105
    .line 106
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    if-nez v10, :cond_6

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_6
    const/4 v11, 0x1

    .line 114
    goto :goto_1

    .line 115
    :sswitch_7
    const-string v10, "span_id"

    .line 116
    .line 117
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    if-nez v10, :cond_7

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_7
    const/4 v11, 0x0

    .line 125
    :goto_1
    packed-switch v11, :pswitch_data_0

    .line 126
    .line 127
    .line 128
    if-nez v0, :cond_8

    .line 129
    .line 130
    new-instance v0, Ljava/util/HashMap;

    .line 131
    .line 132
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 133
    .line 134
    .line 135
    :cond_8
    invoke-interface {p1, p2, v0, v1}, Lio/sentry/j1;->l1(Lio/sentry/ILogger;Ljava/util/Map;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :pswitch_0
    new-instance v1, Lio/sentry/protocol/x$a;

    .line 140
    .line 141
    invoke-direct {v1}, Lio/sentry/protocol/x$a;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-interface {p1, p2, v1}, Lio/sentry/j1;->C0(Lio/sentry/ILogger;Lio/sentry/r0;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    check-cast v1, Lio/sentry/protocol/x;

    .line 149
    .line 150
    move-object v2, v1

    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :pswitch_1
    new-instance v1, Lio/sentry/l3$a;

    .line 154
    .line 155
    invoke-direct {v1}, Lio/sentry/l3$a;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-interface {p1, p2, v1}, Lio/sentry/j1;->k1(Lio/sentry/ILogger;Lio/sentry/r0;)Ljava/util/Map;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    move-object v7, v1

    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :pswitch_2
    invoke-interface {p1}, Lio/sentry/j1;->q0()Ljava/lang/Double;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    move-object v6, v1

    .line 170
    goto/16 :goto_0

    .line 171
    .line 172
    :pswitch_3
    invoke-interface {p1}, Lio/sentry/j1;->q0()Ljava/lang/Double;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    move-object v3, v1

    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :pswitch_4
    invoke-interface {p1}, Lio/sentry/j1;->i1()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    move-object v9, v1

    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :pswitch_5
    invoke-interface {p1}, Lio/sentry/j1;->i1()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    move-object v5, v1

    .line 191
    goto/16 :goto_0

    .line 192
    .line 193
    :pswitch_6
    invoke-interface {p1}, Lio/sentry/j1;->i1()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    move-object v4, v1

    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :pswitch_7
    new-instance v1, Lio/sentry/Y3$a;

    .line 201
    .line 202
    invoke-direct {v1}, Lio/sentry/Y3$a;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-interface {p1, p2, v1}, Lio/sentry/j1;->C0(Lio/sentry/ILogger;Lio/sentry/r0;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    check-cast v1, Lio/sentry/Y3;

    .line 210
    .line 211
    move-object v8, v1

    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :cond_9
    invoke-interface {p1}, Lio/sentry/j1;->I()V

    .line 215
    .line 216
    .line 217
    if-eqz v2, :cond_e

    .line 218
    .line 219
    if-eqz v3, :cond_d

    .line 220
    .line 221
    if-eqz v5, :cond_c

    .line 222
    .line 223
    if-eqz v4, :cond_b

    .line 224
    .line 225
    if-eqz v6, :cond_a

    .line 226
    .line 227
    new-instance v1, Lio/sentry/p3;

    .line 228
    .line 229
    invoke-direct/range {v1 .. v6}, Lio/sentry/p3;-><init>(Lio/sentry/protocol/x;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v1, v7}, Lio/sentry/p3;->a(Ljava/util/Map;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1, v8}, Lio/sentry/p3;->b(Lio/sentry/Y3;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1, v9}, Lio/sentry/p3;->c(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, v0}, Lio/sentry/p3;->d(Ljava/util/Map;)V

    .line 242
    .line 243
    .line 244
    return-object v1

    .line 245
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 246
    .line 247
    const-string v0, "Missing required field \"value\""

    .line 248
    .line 249
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    sget-object v1, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 253
    .line 254
    invoke-interface {p2, v1, v0, p1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 255
    .line 256
    .line 257
    throw p1

    .line 258
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 259
    .line 260
    const-string v0, "Missing required field \"name\""

    .line 261
    .line 262
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    sget-object v1, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 266
    .line 267
    invoke-interface {p2, v1, v0, p1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 268
    .line 269
    .line 270
    throw p1

    .line 271
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 272
    .line 273
    const-string v0, "Missing required field \"type\""

    .line 274
    .line 275
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    sget-object v1, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 279
    .line 280
    invoke-interface {p2, v1, v0, p1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 281
    .line 282
    .line 283
    throw p1

    .line 284
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 285
    .line 286
    const-string v0, "Missing required field \"timestamp\""

    .line 287
    .line 288
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    sget-object v1, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 292
    .line 293
    invoke-interface {p2, v1, v0, p1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 294
    .line 295
    .line 296
    throw p1

    .line 297
    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 298
    .line 299
    const-string v0, "Missing required field \"trace_id\""

    .line 300
    .line 301
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    sget-object v1, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 305
    .line 306
    invoke-interface {p2, v1, v0, p1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 307
    .line 308
    .line 309
    throw p1

    .line 310
    nop

    .line 311
    :sswitch_data_0
    .sparse-switch
        -0x77ea41d0 -> :sswitch_7
        0x337a8b -> :sswitch_6
        0x368f3a -> :sswitch_5
        0x36d984 -> :sswitch_4
        0x3492916 -> :sswitch_3
        0x6ac9171 -> :sswitch_2
        0x182da957 -> :sswitch_1
        0x4bb73e55 -> :sswitch_0
    .end sparse-switch

    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
