.class public abstract Lr4/b0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static a(Landroid/app/NotificationChannel;)Landroid/os/Bundle;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_d

    .line 3
    .line 4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v2, 0x1a

    .line 7
    .line 8
    if-ge v1, v2, :cond_0

    .line 9
    .line 10
    goto/16 :goto_6

    .line 11
    .line 12
    :cond_0
    new-instance v1, Landroid/os/Bundle;

    .line 13
    .line 14
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Lr4/x;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-string v3, "id"

    .line 22
    .line 23
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, Lr4/C;->a(Landroid/app/NotificationChannel;)Ljava/lang/CharSequence;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v3, "name"

    .line 35
    .line 36
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0}, Lr4/D;->a(Landroid/app/NotificationChannel;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const-string v3, "badge"

    .line 44
    .line 45
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    invoke-static {p0}, Lr4/F;->a(Landroid/app/NotificationChannel;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const-string v3, "bypassDnd"

    .line 53
    .line 54
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0}, Lr4/G;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    invoke-static {p0}, Lr4/G;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const-string v3, "description"

    .line 68
    .line 69
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    invoke-static {p0}, Lr4/H;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    if-eqz v2, :cond_2

    .line 77
    .line 78
    invoke-static {p0}, Lr4/H;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    const-string v3, "groupId"

    .line 83
    .line 84
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    invoke-static {p0}, Lr4/j;->a(Landroid/app/NotificationChannel;)I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    const-string v3, "importance"

    .line 92
    .line 93
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0}, Lr4/I;->a(Landroid/app/NotificationChannel;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    const-string v3, "lights"

    .line 101
    .line 102
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 103
    .line 104
    .line 105
    invoke-static {p0}, Lr4/y;->a(Landroid/app/NotificationChannel;)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    const-string v3, "vibration"

    .line 110
    .line 111
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 112
    .line 113
    .line 114
    invoke-static {p0}, Lr4/j;->a(Landroid/app/NotificationChannel;)I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    const/4 v3, 0x0

    .line 119
    const/4 v4, 0x1

    .line 120
    if-nez v2, :cond_3

    .line 121
    .line 122
    move v2, v4

    .line 123
    goto :goto_0

    .line 124
    :cond_3
    move v2, v3

    .line 125
    :goto_0
    const-string v5, "blocked"

    .line 126
    .line 127
    invoke-virtual {v1, v5, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 128
    .line 129
    .line 130
    invoke-static {p0}, Lr4/l;->a(Landroid/app/NotificationChannel;)Landroid/net/Uri;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    if-eqz v2, :cond_7

    .line 135
    .line 136
    invoke-static {p0}, Lr4/l;->a(Landroid/app/NotificationChannel;)Landroid/net/Uri;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    const-string v5, "soundURI"

    .line 145
    .line 146
    invoke-virtual {v1, v5, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-static {p0}, Lr4/l;->a(Landroid/app/NotificationChannel;)Landroid/net/Uri;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    if-nez v2, :cond_4

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_4
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    const-string v6, "android.resource"

    .line 161
    .line 162
    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    if-eqz v5, :cond_6

    .line 167
    .line 168
    invoke-virtual {v2}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    const-string v6, "ResourceUtils"

    .line 181
    .line 182
    const-string v7, "Loaded sound by resource id. New app builds will fail to play sound. Create a new channel to resolve. Issue #341"

    .line 183
    .line 184
    invoke-static {v6, v7}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    if-eqz v5, :cond_6

    .line 188
    .line 189
    new-instance v6, Landroid/util/TypedValue;

    .line 190
    .line 191
    invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V

    .line 192
    .line 193
    .line 194
    sget-object v7, Lcg/f;->a:Landroid/content/Context;

    .line 195
    .line 196
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    invoke-virtual {v7, v5, v6, v4}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 201
    .line 202
    .line 203
    iget-object v4, v6, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 204
    .line 205
    if-nez v4, :cond_5

    .line 206
    .line 207
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    if-lez v5, :cond_6

    .line 212
    .line 213
    :cond_5
    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    const-string v4, "res/raw/"

    .line 218
    .line 219
    const-string v5, ""

    .line 220
    .line 221
    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 225
    goto :goto_1

    .line 226
    :catch_0
    move-object v0, v2

    .line 227
    :cond_6
    :goto_1
    if-eqz v0, :cond_7

    .line 228
    .line 229
    const-string v2, "sound"

    .line 230
    .line 231
    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    :cond_7
    invoke-static {p0}, Lr4/z;->a(Landroid/app/NotificationChannel;)I

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-eqz v0, :cond_9

    .line 239
    .line 240
    invoke-static {p0}, Lr4/z;->a(Landroid/app/NotificationChannel;)I

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    sget-object v2, Lcg/e;->a:Ljava/util/HashMap;

    .line 245
    .line 246
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    check-cast v2, Ljava/lang/String;

    .line 255
    .line 256
    if-eqz v2, :cond_8

    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 260
    .line 261
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 262
    .line 263
    .line 264
    const-string v4, "#"

    .line 265
    .line 266
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    const/4 v4, 0x2

    .line 274
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    :goto_2
    const-string v0, "lightColor"

    .line 286
    .line 287
    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    :cond_9
    invoke-static {p0}, Lr4/A;->a(Landroid/app/NotificationChannel;)[J

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    if-eqz v0, :cond_b

    .line 295
    .line 296
    array-length v2, v0

    .line 297
    if-lez v2, :cond_b

    .line 298
    .line 299
    :try_start_1
    array-length v2, v0

    .line 300
    new-array v2, v2, [I

    .line 301
    .line 302
    :goto_3
    array-length v4, v0

    .line 303
    if-ge v3, v4, :cond_a

    .line 304
    .line 305
    aget-wide v4, v0, v3

    .line 306
    .line 307
    long-to-int v4, v4

    .line 308
    aput v4, v2, v3

    .line 309
    .line 310
    add-int/lit8 v3, v3, 0x1

    .line 311
    .line 312
    goto :goto_3

    .line 313
    :catch_1
    move-exception v0

    .line 314
    goto :goto_4

    .line 315
    :cond_a
    const-string v0, "vibrationPattern"

    .line 316
    .line 317
    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 318
    .line 319
    .line 320
    goto :goto_5

    .line 321
    :goto_4
    const-string v2, "ChannelManager"

    .line 322
    .line 323
    const-string v3, "Unable to convert Vibration Pattern to Channel Bundle"

    .line 324
    .line 325
    invoke-static {v2, v3, v0}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 326
    .line 327
    .line 328
    :cond_b
    :goto_5
    invoke-static {p0}, Lr4/B;->a(Landroid/app/NotificationChannel;)I

    .line 329
    .line 330
    .line 331
    move-result p0

    .line 332
    const/16 v0, -0x3e8

    .line 333
    .line 334
    if-eq p0, v0, :cond_c

    .line 335
    .line 336
    const-string v0, "visibility"

    .line 337
    .line 338
    invoke-virtual {v1, v0, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 339
    .line 340
    .line 341
    :cond_c
    return-object v1

    .line 342
    :cond_d
    :goto_6
    return-object v0
.end method

.method public static b(Landroid/app/NotificationChannelGroup;)Landroid/os/Bundle;
    .locals 4

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v1, 0x1a

    .line 6
    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Lr4/K;->a(Landroid/app/NotificationChannelGroup;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "id"

    .line 20
    .line 21
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p0}, Lr4/L;->a(Landroid/app/NotificationChannelGroup;)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "name"

    .line 33
    .line 34
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p0}, Lr4/M;->a(Landroid/app/NotificationChannelGroup;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v2, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_1

    .line 59
    .line 60
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-static {v3}, Lr4/N;->a(Ljava/lang/Object;)Landroid/app/NotificationChannel;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {v3}, Lr4/b0;->a(Landroid/app/NotificationChannel;)Landroid/os/Bundle;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    const-string v1, "channels"

    .line 77
    .line 78
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 79
    .line 80
    .line 81
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 82
    .line 83
    const/16 v2, 0x1c

    .line 84
    .line 85
    const-string v3, "blocked"

    .line 86
    .line 87
    if-lt v1, v2, :cond_2

    .line 88
    .line 89
    invoke-static {p0}, Lr4/O;->a(Landroid/app/NotificationChannelGroup;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-virtual {v0, v3, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0}, Lr4/P;->a(Landroid/app/NotificationChannelGroup;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    const-string v1, "description"

    .line 101
    .line 102
    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_2
    const/4 p0, 0x0

    .line 107
    invoke-virtual {v0, v3, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 108
    .line 109
    .line 110
    return-object v0

    .line 111
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 112
    return-object p0
.end method

.method public static c()Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lr4/a0;

    .line 6
    .line 7
    invoke-direct {v1}, Lr4/a0;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Lcom/google/common/util/concurrent/r;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/p;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public static d(Lcg/c;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lr4/X;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lr4/X;-><init>(Lcg/c;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Lcom/google/common/util/concurrent/r;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/p;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static e(Lcg/d;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lr4/W;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lr4/W;-><init>(Lcg/d;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Lcom/google/common/util/concurrent/r;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/p;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static f(Ljava/lang/String;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lr4/U;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lr4/U;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Lcom/google/common/util/concurrent/r;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/p;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static g(Ljava/util/List;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lr4/T;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lr4/T;-><init>(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Lcom/google/common/util/concurrent/r;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/p;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static h()Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lr4/V;

    .line 6
    .line 7
    invoke-direct {v1}, Lr4/V;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Lcom/google/common/util/concurrent/r;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/p;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public static i(Ljava/lang/String;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lr4/Z;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lr4/Z;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Lcom/google/common/util/concurrent/r;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/p;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static j(Ljava/util/List;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lr4/Q;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lr4/Q;-><init>(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Lcom/google/common/util/concurrent/r;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/p;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static k(Lcg/c;)Ljava/lang/Void;
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    invoke-static {}, Lr4/J;->a()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcg/c;->a:Landroid/os/Bundle;

    .line 13
    .line 14
    const-string v3, "id"

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    iget-object v3, p0, Lcg/c;->a:Landroid/os/Bundle;

    .line 24
    .line 25
    const-string v4, "name"

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v3}, Lr4/E;->a(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/app/NotificationChannelGroup;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const/16 v3, 0x1c

    .line 39
    .line 40
    if-lt v0, v3, :cond_1

    .line 41
    .line 42
    iget-object v0, p0, Lcg/c;->a:Landroid/os/Bundle;

    .line 43
    .line 44
    const-string v3, "description"

    .line 45
    .line 46
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    iget-object p0, p0, Lcg/c;->a:Landroid/os/Bundle;

    .line 53
    .line 54
    invoke-virtual {p0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {v1, p0}, Lr4/w;->a(Landroid/app/NotificationChannelGroup;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    sget-object p0, Lcg/f;->a:Landroid/content/Context;

    .line 62
    .line 63
    invoke-static {p0}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0, v1}, Landroidx/core/app/q;->f(Landroid/app/NotificationChannelGroup;)V

    .line 68
    .line 69
    .line 70
    return-object v2
.end method

.method public static l(Lcg/d;)Ljava/lang/Void;
    .locals 8

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    invoke-static {}, Lr4/t;->a()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcg/d;->a:Landroid/os/Bundle;

    .line 13
    .line 14
    const-string v1, "id"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcg/d;->a:Landroid/os/Bundle;

    .line 24
    .line 25
    const-string v3, "name"

    .line 26
    .line 27
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    iget-object v3, p0, Lcg/d;->a:Landroid/os/Bundle;

    .line 35
    .line 36
    const-string v4, "importance"

    .line 37
    .line 38
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    iget-object v3, p0, Lcg/d;->a:Landroid/os/Bundle;

    .line 45
    .line 46
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v3}, Lcg/q;->a(Ljava/lang/Object;)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const/4 v3, 0x3

    .line 60
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    :goto_0
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    invoke-static {v0, v1, v3}, Lr4/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget-object v1, p0, Lcg/d;->a:Landroid/os/Bundle;

    .line 73
    .line 74
    const-string v3, "badge"

    .line 75
    .line 76
    const/4 v4, 0x1

    .line 77
    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-static {v0, v1}, Lr4/k;->a(Landroid/app/NotificationChannel;Z)V

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lcg/d;->a:Landroid/os/Bundle;

    .line 85
    .line 86
    const-string v3, "bypassDnd"

    .line 87
    .line 88
    const/4 v5, 0x0

    .line 89
    invoke-virtual {v1, v3, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-static {v0, v1}, Lr4/n;->a(Landroid/app/NotificationChannel;Z)V

    .line 94
    .line 95
    .line 96
    iget-object v1, p0, Lcg/d;->a:Landroid/os/Bundle;

    .line 97
    .line 98
    const-string v3, "description"

    .line 99
    .line 100
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v0, v1}, Lr4/o;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lcg/d;->a:Landroid/os/Bundle;

    .line 108
    .line 109
    const-string v3, "groupId"

    .line 110
    .line 111
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-static {v0, v1}, Lr4/p;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iget-object v1, p0, Lcg/d;->a:Landroid/os/Bundle;

    .line 119
    .line 120
    const-string v3, "lights"

    .line 121
    .line 122
    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    invoke-static {v0, v1}, Lr4/q;->a(Landroid/app/NotificationChannel;Z)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Lcg/d;->a()Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    if-eqz v1, :cond_2

    .line 134
    .line 135
    invoke-virtual {p0}, Lcg/d;->a()Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    invoke-static {v0, v1}, Lr4/r;->a(Landroid/app/NotificationChannel;I)V

    .line 144
    .line 145
    .line 146
    :cond_2
    iget-object v1, p0, Lcg/d;->a:Landroid/os/Bundle;

    .line 147
    .line 148
    const-string v3, "visibility"

    .line 149
    .line 150
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_3

    .line 155
    .line 156
    iget-object v1, p0, Lcg/d;->a:Landroid/os/Bundle;

    .line 157
    .line 158
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-static {v1}, Lcg/q;->a(Ljava/lang/Object;)I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    goto :goto_1

    .line 167
    :cond_3
    move v1, v5

    .line 168
    :goto_1
    invoke-static {v0, v1}, Lr4/s;->a(Landroid/app/NotificationChannel;I)V

    .line 169
    .line 170
    .line 171
    iget-object v1, p0, Lcg/d;->a:Landroid/os/Bundle;

    .line 172
    .line 173
    const-string v3, "vibration"

    .line 174
    .line 175
    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    invoke-static {v0, v1}, Lr4/u;->a(Landroid/app/NotificationChannel;Z)V

    .line 180
    .line 181
    .line 182
    iget-object v1, p0, Lcg/d;->a:Landroid/os/Bundle;

    .line 183
    .line 184
    const-string v3, "vibrationPattern"

    .line 185
    .line 186
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-nez v1, :cond_4

    .line 191
    .line 192
    new-array v1, v5, [J

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_4
    iget-object v1, p0, Lcg/d;->a:Landroid/os/Bundle;

    .line 196
    .line 197
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    new-array v3, v3, [J

    .line 209
    .line 210
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    if-ge v5, v4, :cond_5

    .line 215
    .line 216
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    check-cast v4, Ljava/lang/Integer;

    .line 221
    .line 222
    invoke-virtual {v4}, Ljava/lang/Integer;->longValue()J

    .line 223
    .line 224
    .line 225
    move-result-wide v6

    .line 226
    aput-wide v6, v3, v5

    .line 227
    .line 228
    add-int/lit8 v5, v5, 0x1

    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_5
    move-object v1, v3

    .line 232
    :goto_3
    array-length v3, v1

    .line 233
    if-lez v3, :cond_6

    .line 234
    .line 235
    invoke-static {v0, v1}, Lr4/v;->a(Landroid/app/NotificationChannel;[J)V

    .line 236
    .line 237
    .line 238
    :cond_6
    iget-object v1, p0, Lcg/d;->a:Landroid/os/Bundle;

    .line 239
    .line 240
    const-string v3, "sound"

    .line 241
    .line 242
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    if-nez v1, :cond_7

    .line 247
    .line 248
    move-object v1, v2

    .line 249
    goto :goto_4

    .line 250
    :cond_7
    iget-object v1, p0, Lcg/d;->a:Landroid/os/Bundle;

    .line 251
    .line 252
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    :goto_4
    if-eqz v1, :cond_a

    .line 257
    .line 258
    iget-object v1, p0, Lcg/d;->a:Landroid/os/Bundle;

    .line 259
    .line 260
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    if-nez v1, :cond_8

    .line 265
    .line 266
    move-object p0, v2

    .line 267
    goto :goto_5

    .line 268
    :cond_8
    iget-object p0, p0, Lcg/d;->a:Landroid/os/Bundle;

    .line 269
    .line 270
    invoke-virtual {p0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    :goto_5
    invoke-static {p0}, Lcg/s;->e(Ljava/lang/String;)Landroid/net/Uri;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    if-eqz p0, :cond_9

    .line 279
    .line 280
    new-instance v1, Landroid/media/AudioAttributes$Builder;

    .line 281
    .line 282
    invoke-direct {v1}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 283
    .line 284
    .line 285
    const/4 v3, 0x5

    .line 286
    invoke-virtual {v1, v3}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    const/4 v3, 0x4

    .line 291
    invoke-virtual {v1, v3}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-virtual {v1}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-static {v0, p0, v1}, Lr4/m;->a(Landroid/app/NotificationChannel;Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    .line 300
    .line 301
    .line 302
    goto :goto_6

    .line 303
    :cond_9
    new-instance p0, Ljava/lang/StringBuilder;

    .line 304
    .line 305
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 306
    .line 307
    .line 308
    const-string v1, "Unable to retrieve sound for channel, sound was specified as: "

    .line 309
    .line 310
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-static {v0}, Lr4/l;->a(Landroid/app/NotificationChannel;)Landroid/net/Uri;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    const-string v1, "ChannelManager"

    .line 325
    .line 326
    invoke-static {v1, p0}, Lapp/notifee/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    goto :goto_6

    .line 330
    :cond_a
    invoke-static {v0, v2, v2}, Lr4/m;->a(Landroid/app/NotificationChannel;Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    .line 331
    .line 332
    .line 333
    :goto_6
    sget-object p0, Lcg/f;->a:Landroid/content/Context;

    .line 334
    .line 335
    invoke-static {p0}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 336
    .line 337
    .line 338
    move-result-object p0

    .line 339
    invoke-virtual {p0, v0}, Landroidx/core/app/q;->e(Landroid/app/NotificationChannel;)V

    .line 340
    .line 341
    .line 342
    return-object v2
.end method

.method public static m(Ljava/lang/String;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lr4/Y;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lr4/Y;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Lcom/google/common/util/concurrent/r;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/p;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static synthetic n(Ljava/util/List;)Ljava/lang/Void;
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcg/c;

    .line 24
    .line 25
    invoke-static {v0}, Lr4/b0;->d(Lcg/c;)Lcom/google/common/util/concurrent/p;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-object v2
.end method

.method public static o()Ljava/util/List;
    .locals 3

    .line 1
    sget-object v0, Lcg/f;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/core/app/q;->n()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    const/16 v2, 0x1a

    .line 20
    .line 21
    if-ge v1, v2, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v2}, Landroidx/core/app/p;->a(Ljava/lang/Object;)Landroid/app/NotificationChannelGroup;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2}, Lr4/b0;->b(Landroid/app/NotificationChannelGroup;)Landroid/os/Bundle;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    return-object v1

    .line 60
    :cond_2
    :goto_1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 61
    .line 62
    return-object v0
.end method

.method public static p(Ljava/lang/String;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    invoke-static {}, Lapp/notifee/core/Notifee;->getListeningExecutorService()Lcom/google/common/util/concurrent/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lr4/S;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lr4/S;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Lcom/google/common/util/concurrent/r;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/p;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static synthetic q(Ljava/util/List;)Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcg/d;

    .line 16
    .line 17
    invoke-static {v0}, Lr4/b0;->e(Lcg/d;)Lcom/google/common/util/concurrent/p;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public static r()Ljava/util/List;
    .locals 3

    .line 1
    sget-object v0, Lcg/f;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/core/app/q;->o()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    const/16 v2, 0x1a

    .line 20
    .line 21
    if-ge v1, v2, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v2}, Lr4/N;->a(Ljava/lang/Object;)Landroid/app/NotificationChannel;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2}, Lr4/b0;->a(Landroid/app/NotificationChannel;)Landroid/os/Bundle;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    return-object v1

    .line 60
    :cond_2
    :goto_1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 61
    .line 62
    return-object v0
.end method

.method public static s(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 1

    .line 1
    sget-object v0, Lcg/f;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Landroidx/core/app/q;->l(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lr4/b0;->a(Landroid/app/NotificationChannel;)Landroid/os/Bundle;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static t(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 1

    .line 1
    sget-object v0, Lcg/f;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Landroidx/core/app/q;->m(Ljava/lang/String;)Landroid/app/NotificationChannelGroup;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lr4/b0;->b(Landroid/app/NotificationChannelGroup;)Landroid/os/Bundle;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static u(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object v0, Lcg/f;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {v0}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0, p0}, Landroidx/core/app/q;->l(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-nez p0, :cond_1

    .line 21
    .line 22
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    invoke-static {p0}, Lr4/j;->a(Landroid/app/NotificationChannel;)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-nez p0, :cond_2

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    const/4 p0, 0x0

    .line 34
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public static v(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object v0, Lcg/f;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {v0}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0, p0}, Landroidx/core/app/q;->l(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method
