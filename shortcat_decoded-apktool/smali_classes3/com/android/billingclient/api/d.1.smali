.class public Lcom/android/billingclient/api/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/billingclient/api/d$b;,
        Lcom/android/billingclient/api/d$c;,
        Lcom/android/billingclient/api/d$a;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Lcom/android/billingclient/api/d$c;

.field private e:Lcom/google/android/gms/internal/play_billing/N;

.field private f:Ljava/util/ArrayList;

.field private g:Z


# direct methods
.method synthetic constructor <init>(LN4/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a()Lcom/android/billingclient/api/d$a;
    .locals 2

    .line 1
    new-instance v0, Lcom/android/billingclient/api/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/android/billingclient/api/d$a;-><init>(LN4/x;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method static bridge synthetic m(Lcom/android/billingclient/api/d;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/d;->a:Z

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic n(Lcom/android/billingclient/api/d;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/billingclient/api/d;->g:Z

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic o(Lcom/android/billingclient/api/d;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/billingclient/api/d;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic p(Lcom/android/billingclient/api/d;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/billingclient/api/d;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic q(Lcom/android/billingclient/api/d;Lcom/google/android/gms/internal/play_billing/N;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/billingclient/api/d;->e:Lcom/google/android/gms/internal/play_billing/N;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic r(Lcom/android/billingclient/api/d;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/billingclient/api/d;->f:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic s(Lcom/android/billingclient/api/d;Lcom/android/billingclient/api/d$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/d$c;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/d$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/billingclient/api/d$c;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public d()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    return-wide v0
.end method

.method final e()Lcom/android/billingclient/api/e;
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->e:Lcom/google/android/gms/internal/play_billing/N;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/android/billingclient/api/d;->e:Lcom/google/android/gms/internal/play_billing/N;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lcom/android/billingclient/api/d$b;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    :goto_0
    iget-object v3, p0, Lcom/android/billingclient/api/d;->e:Lcom/google/android/gms/internal/play_billing/N;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const-string v4, "play_pass_subs"

    .line 29
    .line 30
    const/4 v5, 0x5

    .line 31
    if-ge v2, v3, :cond_3

    .line 32
    .line 33
    iget-object v3, p0, Lcom/android/billingclient/api/d;->e:Lcom/google/android/gms/internal/play_billing/N;

    .line 34
    .line 35
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lcom/android/billingclient/api/d$b;

    .line 40
    .line 41
    invoke-virtual {v3}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/h;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-virtual {v6}, Lcom/android/billingclient/api/h;->f()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-virtual {v0}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/h;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-virtual {v7}, Lcom/android/billingclient/api/h;->f()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-nez v6, :cond_2

    .line 62
    .line 63
    invoke-virtual {v3}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/h;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3}, Lcom/android/billingclient/api/h;->f()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    const-string v0, "All products should have same ProductType."

    .line 79
    .line 80
    invoke-static {v5, v0}, Lcom/android/billingclient/api/W;->a(ILjava/lang/String;)Lcom/android/billingclient/api/e;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    return-object v0

    .line 85
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    invoke-virtual {v0}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/h;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v2}, Lcom/android/billingclient/api/h;->i()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    new-instance v3, Ljava/util/HashMap;

    .line 97
    .line 98
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 99
    .line 100
    .line 101
    new-instance v6, Ljava/util/HashSet;

    .line 102
    .line 103
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 104
    .line 105
    .line 106
    iget-object v7, p0, Lcom/android/billingclient/api/d;->e:Lcom/google/android/gms/internal/play_billing/N;

    .line 107
    .line 108
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    :goto_2
    if-ge v1, v8, :cond_9

    .line 113
    .line 114
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    check-cast v9, Lcom/android/billingclient/api/d$b;

    .line 119
    .line 120
    invoke-virtual {v9}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/h;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    invoke-virtual {v10}, Lcom/android/billingclient/api/h;->g()Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    if-eqz v10, :cond_5

    .line 129
    .line 130
    invoke-virtual {v9}, Lcom/android/billingclient/api/d$b;->c()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    if-eqz v10, :cond_4

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_4
    invoke-virtual {v9}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/h;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, Lcom/android/billingclient/api/h;->e()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    const-string v1, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: %s"

    .line 150
    .line 151
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-static {v5, v0}, Lcom/android/billingclient/api/W;->a(ILjava/lang/String;)Lcom/android/billingclient/api/e;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    return-object v0

    .line 160
    :cond_5
    :goto_3
    invoke-virtual {v9}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/h;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    invoke-virtual {v10}, Lcom/android/billingclient/api/h;->e()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    invoke-virtual {v3, v10}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v10

    .line 172
    if-eqz v10, :cond_6

    .line 173
    .line 174
    invoke-virtual {v9}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/h;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {v0}, Lcom/android/billingclient/api/h;->e()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    const-string v1, "ProductId can not be duplicated. Invalid product id: %s."

    .line 187
    .line 188
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-static {v5, v0}, Lcom/android/billingclient/api/W;->a(ILjava/lang/String;)Lcom/android/billingclient/api/e;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    return-object v0

    .line 197
    :cond_6
    invoke-virtual {v9}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/h;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    invoke-virtual {v10}, Lcom/android/billingclient/api/h;->e()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    invoke-virtual {v3, v10, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/h;

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    invoke-virtual {v10}, Lcom/android/billingclient/api/h;->f()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v10

    .line 216
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v10

    .line 220
    if-nez v10, :cond_8

    .line 221
    .line 222
    invoke-virtual {v9}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/h;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    invoke-virtual {v10}, Lcom/android/billingclient/api/h;->f()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v10

    .line 234
    if-nez v10, :cond_8

    .line 235
    .line 236
    invoke-virtual {v9}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/h;

    .line 237
    .line 238
    .line 239
    move-result-object v9

    .line 240
    invoke-virtual {v9}, Lcom/android/billingclient/api/h;->i()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v9

    .line 244
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v9

    .line 248
    if-eqz v9, :cond_7

    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_7
    const-string v0, "All products must have the same package name."

    .line 252
    .line 253
    invoke-static {v5, v0}, Lcom/android/billingclient/api/W;->a(ILjava/lang/String;)Lcom/android/billingclient/api/e;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    return-object v0

    .line 258
    :cond_8
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 259
    .line 260
    goto/16 :goto_2

    .line 261
    .line 262
    :cond_9
    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    :cond_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    if-eqz v2, :cond_b

    .line 271
    .line 272
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    check-cast v2, Ljava/lang/String;

    .line 277
    .line 278
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    if-eqz v4, :cond_a

    .line 283
    .line 284
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    check-cast v0, Lcom/android/billingclient/api/d$b;

    .line 289
    .line 290
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    const-string v1, "OldProductId must not be one of the products to be purchased. Invalid old product id: %s."

    .line 295
    .line 296
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-static {v5, v0}, Lcom/android/billingclient/api/W;->a(ILjava/lang/String;)Lcom/android/billingclient/api/e;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    return-object v0

    .line 305
    :cond_b
    invoke-virtual {v0}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/h;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-virtual {v1}, Lcom/android/billingclient/api/h;->d()Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-virtual {v0}, Lcom/android/billingclient/api/d$b;->c()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    if-eqz v0, :cond_e

    .line 318
    .line 319
    if-eqz v1, :cond_e

    .line 320
    .line 321
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    :cond_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    if-eqz v2, :cond_d

    .line 330
    .line 331
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    check-cast v2, Lcom/android/billingclient/api/h$b;

    .line 336
    .line 337
    invoke-virtual {v2}, Lcom/android/billingclient/api/h$b;->b()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    if-eqz v3, :cond_c

    .line 346
    .line 347
    goto :goto_5

    .line 348
    :cond_d
    const/4 v2, 0x0

    .line 349
    :goto_5
    if-eqz v2, :cond_e

    .line 350
    .line 351
    invoke-virtual {v2}, Lcom/android/billingclient/api/h$b;->e()Lcom/android/billingclient/api/Z;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    if-eqz v0, :cond_e

    .line 356
    .line 357
    const-string v0, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay."

    .line 358
    .line 359
    invoke-static {v5, v0}, Lcom/android/billingclient/api/W;->a(ILjava/lang/String;)Lcom/android/billingclient/api/e;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    return-object v0

    .line 364
    :cond_e
    sget-object v0, Lcom/android/billingclient/api/W;->i:Lcom/android/billingclient/api/e;

    .line 365
    .line 366
    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/d$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/billingclient/api/d$c;->d()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/d$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/billingclient/api/d$c;->e()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final k()Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/android/billingclient/api/d;->f:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final l()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->e:Lcom/google/android/gms/internal/play_billing/N;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/android/billingclient/api/d;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method final u()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/d;->b:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/android/billingclient/api/d;->c:Ljava/lang/String;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/d$c;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/android/billingclient/api/d$c;->e()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/d$c;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/android/billingclient/api/d$c;->b()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    iget-boolean v0, p0, Lcom/android/billingclient/api/d;->a:Z

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    iget-boolean v0, p0, Lcom/android/billingclient/api/d;->g:Z

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Lcom/android/billingclient/api/d;->e:Lcom/google/android/gms/internal/play_billing/N;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    move v3, v1

    .line 43
    :goto_0
    if-ge v3, v2, :cond_0

    .line 44
    .line 45
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Lcom/android/billingclient/api/d$b;

    .line 50
    .line 51
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    return v1

    .line 55
    :cond_1
    const/4 v0, 0x1

    .line 56
    return v0
.end method
