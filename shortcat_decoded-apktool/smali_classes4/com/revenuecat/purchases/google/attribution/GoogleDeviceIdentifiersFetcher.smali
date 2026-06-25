.class public final Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ7\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\u000c\u0012\u0004\u0012\u00020\r0\u000bH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00088\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher;",
        "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;",
        "Lcom/revenuecat/purchases/common/Dispatcher;",
        "dispatcher",
        "<init>",
        "(Lcom/revenuecat/purchases/common/Dispatcher;)V",
        "Landroid/app/Application;",
        "applicationContext",
        "",
        "getAdvertisingID",
        "(Landroid/app/Application;)Ljava/lang/String;",
        "Lkotlin/Function1;",
        "",
        "LTd/L;",
        "completion",
        "getDeviceIdentifiers",
        "(Landroid/app/Application;Lkotlin/jvm/functions/Function1;)V",
        "Lcom/revenuecat/purchases/common/Dispatcher;",
        "noPermissionAdvertisingIdValue",
        "Ljava/lang/String;",
        "purchases_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final dispatcher:Lcom/revenuecat/purchases/common/Dispatcher;

.field private final noPermissionAdvertisingIdValue:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/revenuecat/purchases/common/Dispatcher;)V
    .locals 1

    .line 1
    const-string v0, "dispatcher"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher;->dispatcher:Lcom/revenuecat/purchases/common/Dispatcher;

    .line 10
    .line 11
    const-string p1, "00000000-0000-0000-0000-000000000000"

    .line 12
    .line 13
    iput-object p1, p0, Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher;->noPermissionAdvertisingIdValue:Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic a(Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher;Landroid/app/Application;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher;->getDeviceIdentifiers$lambda$0(Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher;Landroid/app/Application;Lkotlin/jvm/functions/Function1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final getAdvertisingID(Landroid/app/Application;)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "[Purchases] - ERROR"

    .line 2
    .line 3
    const-string v1, "[Purchases] - "

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-object v4, p0, Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher;->noPermissionAdvertisingIdValue:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    sget-object p1, Lcom/revenuecat/purchases/common/LogIntent;->WARNING:Lcom/revenuecat/purchases/common/LogIntent;

    .line 29
    .line 30
    new-instance v3, Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1;

    .line 31
    .line 32
    invoke-direct {v3, p1}, Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1;-><init>(Lcom/revenuecat/purchases/common/LogIntent;)V

    .line 33
    .line 34
    .line 35
    sget-object v4, Lcom/revenuecat/purchases/common/LogWrapperKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    aget p1, v4, p1

    .line 42
    .line 43
    packed-switch p1, :pswitch_data_0

    .line 44
    .line 45
    .line 46
    goto/16 :goto_6

    .line 47
    .line 48
    :pswitch_0
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Ljava/lang/String;

    .line 57
    .line 58
    invoke-interface {p1, v0, v3, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_6

    .line 62
    .line 63
    :catch_0
    move-exception p1

    .line 64
    goto/16 :goto_1

    .line 65
    .line 66
    :catch_1
    move-exception p1

    .line 67
    goto/16 :goto_2

    .line 68
    .line 69
    :catch_2
    move-exception p1

    .line 70
    goto/16 :goto_3

    .line 71
    .line 72
    :catch_3
    move-exception p1

    .line 73
    goto/16 :goto_4

    .line 74
    .line 75
    :catch_4
    move-exception p1

    .line 76
    goto/16 :goto_5

    .line 77
    .line 78
    :pswitch_1
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 79
    .line 80
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    sget-object v5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 85
    .line 86
    invoke-virtual {v5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v5, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-gtz v5, :cond_1

    .line 95
    .line 96
    new-instance v5, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    check-cast v3, Ljava/lang/String;

    .line 120
    .line 121
    invoke-interface {v4, p1, v3}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    goto/16 :goto_6

    .line 125
    .line 126
    :pswitch_2
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    check-cast v3, Ljava/lang/String;

    .line 135
    .line 136
    invoke-interface {p1, v0, v3, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    goto/16 :goto_6

    .line 140
    .line 141
    :pswitch_3
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 142
    .line 143
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    sget-object v5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 148
    .line 149
    invoke-virtual {v5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    invoke-virtual {v5, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    if-gtz v5, :cond_1

    .line 158
    .line 159
    new-instance v5, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    check-cast v3, Ljava/lang/String;

    .line 183
    .line 184
    invoke-interface {v4, p1, v3}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_6

    .line 188
    .line 189
    :pswitch_4
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 190
    .line 191
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    sget-object v5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 196
    .line 197
    invoke-virtual {v5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-virtual {v5, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 202
    .line 203
    .line 204
    move-result v5

    .line 205
    if-gtz v5, :cond_1

    .line 206
    .line 207
    new-instance v5, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    check-cast v3, Ljava/lang/String;

    .line 231
    .line 232
    invoke-interface {v4, p1, v3}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    goto/16 :goto_6

    .line 236
    .line 237
    :pswitch_5
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 238
    .line 239
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    sget-object v5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 244
    .line 245
    invoke-virtual {v5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    invoke-virtual {v5, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    if-gtz v5, :cond_1

    .line 254
    .line 255
    new-instance v5, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    check-cast v3, Ljava/lang/String;

    .line 279
    .line 280
    :goto_0
    invoke-interface {v4, p1, v3}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    goto/16 :goto_6

    .line 284
    .line 285
    :pswitch_6
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 286
    .line 287
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    sget-object v5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 292
    .line 293
    invoke-virtual {v5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    invoke-virtual {v5, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    if-gtz v5, :cond_1

    .line 302
    .line 303
    new-instance v5, Ljava/lang/StringBuilder;

    .line 304
    .line 305
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    check-cast v3, Ljava/lang/String;

    .line 327
    .line 328
    goto :goto_0

    .line 329
    :pswitch_7
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 330
    .line 331
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    sget-object v5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 336
    .line 337
    invoke-virtual {v5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 338
    .line 339
    .line 340
    move-result-object v5

    .line 341
    invoke-virtual {v5, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 342
    .line 343
    .line 344
    move-result v5

    .line 345
    if-gtz v5, :cond_1

    .line 346
    .line 347
    new-instance v5, Ljava/lang/StringBuilder;

    .line 348
    .line 349
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    check-cast v3, Ljava/lang/String;

    .line 371
    .line 372
    invoke-interface {v4, p1, v3}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    goto/16 :goto_6

    .line 376
    .line 377
    :pswitch_8
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v3

    .line 385
    check-cast v3, Ljava/lang/String;

    .line 386
    .line 387
    invoke-interface {p1, v0, v3, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 388
    .line 389
    .line 390
    goto/16 :goto_6

    .line 391
    .line 392
    :pswitch_9
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 393
    .line 394
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 395
    .line 396
    .line 397
    move-result-object v4

    .line 398
    sget-object v5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 399
    .line 400
    invoke-virtual {v5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 401
    .line 402
    .line 403
    move-result-object v5

    .line 404
    invoke-virtual {v5, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 405
    .line 406
    .line 407
    move-result v5

    .line 408
    if-gtz v5, :cond_1

    .line 409
    .line 410
    new-instance v5, Ljava/lang/StringBuilder;

    .line 411
    .line 412
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object p1

    .line 422
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object p1

    .line 429
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    check-cast v3, Ljava/lang/String;

    .line 434
    .line 435
    goto/16 :goto_0

    .line 436
    .line 437
    :pswitch_a
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 438
    .line 439
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    sget-object v5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 444
    .line 445
    invoke-virtual {v5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 446
    .line 447
    .line 448
    move-result-object v5

    .line 449
    invoke-virtual {v5, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 450
    .line 451
    .line 452
    move-result v5

    .line 453
    if-gtz v5, :cond_1

    .line 454
    .line 455
    new-instance v5, Ljava/lang/StringBuilder;

    .line 456
    .line 457
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object p1

    .line 467
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object p1

    .line 474
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    check-cast v3, Ljava/lang/String;

    .line 479
    .line 480
    invoke-interface {v4, p1, v3}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    goto/16 :goto_6

    .line 484
    .line 485
    :pswitch_b
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 486
    .line 487
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 488
    .line 489
    .line 490
    move-result-object v4

    .line 491
    sget-object v5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 492
    .line 493
    invoke-virtual {v5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 494
    .line 495
    .line 496
    move-result-object v5

    .line 497
    invoke-virtual {v5, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 498
    .line 499
    .line 500
    move-result v5

    .line 501
    if-gtz v5, :cond_1

    .line 502
    .line 503
    new-instance v5, Ljava/lang/StringBuilder;

    .line 504
    .line 505
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object p1

    .line 515
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object p1

    .line 522
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v3

    .line 526
    check-cast v3, Ljava/lang/String;

    .line 527
    .line 528
    invoke-interface {v4, p1, v3}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 529
    .line 530
    .line 531
    goto/16 :goto_6

    .line 532
    .line 533
    :pswitch_c
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 534
    .line 535
    .line 536
    move-result-object p1

    .line 537
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    check-cast v3, Ljava/lang/String;

    .line 542
    .line 543
    invoke-interface {p1, v0, v3, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 544
    .line 545
    .line 546
    goto/16 :goto_6

    .line 547
    .line 548
    :pswitch_d
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 549
    .line 550
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 551
    .line 552
    .line 553
    move-result-object v4

    .line 554
    sget-object v5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 555
    .line 556
    invoke-virtual {v5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 557
    .line 558
    .line 559
    move-result-object v5

    .line 560
    invoke-virtual {v5, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 561
    .line 562
    .line 563
    move-result v5

    .line 564
    if-gtz v5, :cond_1

    .line 565
    .line 566
    new-instance v5, Ljava/lang/StringBuilder;

    .line 567
    .line 568
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object p1

    .line 578
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object p1

    .line 585
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v3

    .line 589
    check-cast v3, Ljava/lang/String;

    .line 590
    .line 591
    goto/16 :goto_0

    .line 592
    .line 593
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object p1
    :try_end_0
    .catch LO8/g; {:try_start_0 .. :try_end_0} :catch_4
    .catch LO8/h; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_5

    .line 597
    return-object p1

    .line 598
    :catch_5
    sget-object p1, Lcom/revenuecat/purchases/common/LogIntent;->GOOGLE_ERROR:Lcom/revenuecat/purchases/common/LogIntent;

    .line 599
    .line 600
    new-instance v3, Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7;

    .line 601
    .line 602
    invoke-direct {v3, p1}, Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7;-><init>(Lcom/revenuecat/purchases/common/LogIntent;)V

    .line 603
    .line 604
    .line 605
    sget-object v4, Lcom/revenuecat/purchases/common/LogWrapperKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 606
    .line 607
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 608
    .line 609
    .line 610
    move-result p1

    .line 611
    aget p1, v4, p1

    .line 612
    .line 613
    packed-switch p1, :pswitch_data_1

    .line 614
    .line 615
    .line 616
    goto/16 :goto_6

    .line 617
    .line 618
    :pswitch_e
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 619
    .line 620
    .line 621
    move-result-object p1

    .line 622
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v1

    .line 626
    check-cast v1, Ljava/lang/String;

    .line 627
    .line 628
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 629
    .line 630
    .line 631
    goto/16 :goto_6

    .line 632
    .line 633
    :pswitch_f
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 634
    .line 635
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 640
    .line 641
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 642
    .line 643
    .line 644
    move-result-object v4

    .line 645
    invoke-virtual {v4, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 646
    .line 647
    .line 648
    move-result v4

    .line 649
    if-gtz v4, :cond_1

    .line 650
    .line 651
    new-instance v4, Ljava/lang/StringBuilder;

    .line 652
    .line 653
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object p1

    .line 663
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object p1

    .line 670
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v1

    .line 674
    check-cast v1, Ljava/lang/String;

    .line 675
    .line 676
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 677
    .line 678
    .line 679
    goto/16 :goto_6

    .line 680
    .line 681
    :pswitch_10
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 682
    .line 683
    .line 684
    move-result-object p1

    .line 685
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v1

    .line 689
    check-cast v1, Ljava/lang/String;

    .line 690
    .line 691
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 692
    .line 693
    .line 694
    goto/16 :goto_6

    .line 695
    .line 696
    :pswitch_11
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 697
    .line 698
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 703
    .line 704
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 705
    .line 706
    .line 707
    move-result-object v4

    .line 708
    invoke-virtual {v4, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 709
    .line 710
    .line 711
    move-result v4

    .line 712
    if-gtz v4, :cond_1

    .line 713
    .line 714
    new-instance v4, Ljava/lang/StringBuilder;

    .line 715
    .line 716
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 720
    .line 721
    .line 722
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object p1

    .line 726
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 727
    .line 728
    .line 729
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object p1

    .line 733
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v1

    .line 737
    check-cast v1, Ljava/lang/String;

    .line 738
    .line 739
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 740
    .line 741
    .line 742
    goto/16 :goto_6

    .line 743
    .line 744
    :pswitch_12
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 745
    .line 746
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 751
    .line 752
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 753
    .line 754
    .line 755
    move-result-object v4

    .line 756
    invoke-virtual {v4, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 757
    .line 758
    .line 759
    move-result v4

    .line 760
    if-gtz v4, :cond_1

    .line 761
    .line 762
    new-instance v4, Ljava/lang/StringBuilder;

    .line 763
    .line 764
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 768
    .line 769
    .line 770
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 771
    .line 772
    .line 773
    move-result-object p1

    .line 774
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object p1

    .line 781
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v1

    .line 785
    check-cast v1, Ljava/lang/String;

    .line 786
    .line 787
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 788
    .line 789
    .line 790
    goto/16 :goto_6

    .line 791
    .line 792
    :pswitch_13
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 793
    .line 794
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 799
    .line 800
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 801
    .line 802
    .line 803
    move-result-object v4

    .line 804
    invoke-virtual {v4, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 805
    .line 806
    .line 807
    move-result v4

    .line 808
    if-gtz v4, :cond_1

    .line 809
    .line 810
    new-instance v4, Ljava/lang/StringBuilder;

    .line 811
    .line 812
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 813
    .line 814
    .line 815
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 816
    .line 817
    .line 818
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object p1

    .line 822
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 823
    .line 824
    .line 825
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object p1

    .line 829
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v1

    .line 833
    check-cast v1, Ljava/lang/String;

    .line 834
    .line 835
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 836
    .line 837
    .line 838
    goto/16 :goto_6

    .line 839
    .line 840
    :pswitch_14
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 841
    .line 842
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 843
    .line 844
    .line 845
    move-result-object v0

    .line 846
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 847
    .line 848
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 849
    .line 850
    .line 851
    move-result-object v4

    .line 852
    invoke-virtual {v4, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 853
    .line 854
    .line 855
    move-result v4

    .line 856
    if-gtz v4, :cond_1

    .line 857
    .line 858
    new-instance v4, Ljava/lang/StringBuilder;

    .line 859
    .line 860
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 861
    .line 862
    .line 863
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 864
    .line 865
    .line 866
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 867
    .line 868
    .line 869
    move-result-object p1

    .line 870
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 871
    .line 872
    .line 873
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object p1

    .line 877
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    move-result-object v1

    .line 881
    check-cast v1, Ljava/lang/String;

    .line 882
    .line 883
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 884
    .line 885
    .line 886
    goto/16 :goto_6

    .line 887
    .line 888
    :pswitch_15
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 889
    .line 890
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 895
    .line 896
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 897
    .line 898
    .line 899
    move-result-object v4

    .line 900
    invoke-virtual {v4, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 901
    .line 902
    .line 903
    move-result v4

    .line 904
    if-gtz v4, :cond_1

    .line 905
    .line 906
    new-instance v4, Ljava/lang/StringBuilder;

    .line 907
    .line 908
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 909
    .line 910
    .line 911
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 912
    .line 913
    .line 914
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object p1

    .line 918
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 919
    .line 920
    .line 921
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 922
    .line 923
    .line 924
    move-result-object p1

    .line 925
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 926
    .line 927
    .line 928
    move-result-object v1

    .line 929
    check-cast v1, Ljava/lang/String;

    .line 930
    .line 931
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 932
    .line 933
    .line 934
    goto/16 :goto_6

    .line 935
    .line 936
    :pswitch_16
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 937
    .line 938
    .line 939
    move-result-object p1

    .line 940
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v1

    .line 944
    check-cast v1, Ljava/lang/String;

    .line 945
    .line 946
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 947
    .line 948
    .line 949
    goto/16 :goto_6

    .line 950
    .line 951
    :pswitch_17
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 952
    .line 953
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 954
    .line 955
    .line 956
    move-result-object v0

    .line 957
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 958
    .line 959
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 960
    .line 961
    .line 962
    move-result-object v4

    .line 963
    invoke-virtual {v4, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 964
    .line 965
    .line 966
    move-result v4

    .line 967
    if-gtz v4, :cond_1

    .line 968
    .line 969
    new-instance v4, Ljava/lang/StringBuilder;

    .line 970
    .line 971
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 972
    .line 973
    .line 974
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 975
    .line 976
    .line 977
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 978
    .line 979
    .line 980
    move-result-object p1

    .line 981
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 982
    .line 983
    .line 984
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 985
    .line 986
    .line 987
    move-result-object p1

    .line 988
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 989
    .line 990
    .line 991
    move-result-object v1

    .line 992
    check-cast v1, Ljava/lang/String;

    .line 993
    .line 994
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 995
    .line 996
    .line 997
    goto/16 :goto_6

    .line 998
    .line 999
    :pswitch_18
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 1000
    .line 1001
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v0

    .line 1005
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 1006
    .line 1007
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v4

    .line 1011
    invoke-virtual {v4, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 1012
    .line 1013
    .line 1014
    move-result v4

    .line 1015
    if-gtz v4, :cond_1

    .line 1016
    .line 1017
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1018
    .line 1019
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1026
    .line 1027
    .line 1028
    move-result-object p1

    .line 1029
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1033
    .line 1034
    .line 1035
    move-result-object p1

    .line 1036
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v1

    .line 1040
    check-cast v1, Ljava/lang/String;

    .line 1041
    .line 1042
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1043
    .line 1044
    .line 1045
    goto/16 :goto_6

    .line 1046
    .line 1047
    :pswitch_19
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 1048
    .line 1049
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v0

    .line 1053
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 1054
    .line 1055
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v4

    .line 1059
    invoke-virtual {v4, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 1060
    .line 1061
    .line 1062
    move-result v4

    .line 1063
    if-gtz v4, :cond_1

    .line 1064
    .line 1065
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1066
    .line 1067
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1074
    .line 1075
    .line 1076
    move-result-object p1

    .line 1077
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1081
    .line 1082
    .line 1083
    move-result-object p1

    .line 1084
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v1

    .line 1088
    check-cast v1, Ljava/lang/String;

    .line 1089
    .line 1090
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1091
    .line 1092
    .line 1093
    goto/16 :goto_6

    .line 1094
    .line 1095
    :pswitch_1a
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1096
    .line 1097
    .line 1098
    move-result-object p1

    .line 1099
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v1

    .line 1103
    check-cast v1, Ljava/lang/String;

    .line 1104
    .line 1105
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1106
    .line 1107
    .line 1108
    goto/16 :goto_6

    .line 1109
    .line 1110
    :pswitch_1b
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 1111
    .line 1112
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v0

    .line 1116
    sget-object v4, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 1117
    .line 1118
    invoke-virtual {v4}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v4

    .line 1122
    invoke-virtual {v4, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 1123
    .line 1124
    .line 1125
    move-result v4

    .line 1126
    if-gtz v4, :cond_1

    .line 1127
    .line 1128
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1129
    .line 1130
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1137
    .line 1138
    .line 1139
    move-result-object p1

    .line 1140
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1144
    .line 1145
    .line 1146
    move-result-object p1

    .line 1147
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v1

    .line 1151
    check-cast v1, Ljava/lang/String;

    .line 1152
    .line 1153
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1154
    .line 1155
    .line 1156
    goto/16 :goto_6

    .line 1157
    .line 1158
    :goto_1
    sget-object v3, Lcom/revenuecat/purchases/common/LogIntent;->GOOGLE_ERROR:Lcom/revenuecat/purchases/common/LogIntent;

    .line 1159
    .line 1160
    new-instance v4, Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6;

    .line 1161
    .line 1162
    invoke-direct {v4, v3, p1}, Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6;-><init>(Lcom/revenuecat/purchases/common/LogIntent;Ljava/lang/NullPointerException;)V

    .line 1163
    .line 1164
    .line 1165
    sget-object p1, Lcom/revenuecat/purchases/common/LogWrapperKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 1166
    .line 1167
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 1168
    .line 1169
    .line 1170
    move-result v3

    .line 1171
    aget p1, p1, v3

    .line 1172
    .line 1173
    packed-switch p1, :pswitch_data_2

    .line 1174
    .line 1175
    .line 1176
    goto/16 :goto_6

    .line 1177
    .line 1178
    :pswitch_1c
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1179
    .line 1180
    .line 1181
    move-result-object p1

    .line 1182
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v1

    .line 1186
    check-cast v1, Ljava/lang/String;

    .line 1187
    .line 1188
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1189
    .line 1190
    .line 1191
    goto/16 :goto_6

    .line 1192
    .line 1193
    :pswitch_1d
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 1194
    .line 1195
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v0

    .line 1199
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 1200
    .line 1201
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v3

    .line 1205
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 1206
    .line 1207
    .line 1208
    move-result v3

    .line 1209
    if-gtz v3, :cond_1

    .line 1210
    .line 1211
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1212
    .line 1213
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1214
    .line 1215
    .line 1216
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1220
    .line 1221
    .line 1222
    move-result-object p1

    .line 1223
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1227
    .line 1228
    .line 1229
    move-result-object p1

    .line 1230
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v1

    .line 1234
    check-cast v1, Ljava/lang/String;

    .line 1235
    .line 1236
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1237
    .line 1238
    .line 1239
    goto/16 :goto_6

    .line 1240
    .line 1241
    :pswitch_1e
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1242
    .line 1243
    .line 1244
    move-result-object p1

    .line 1245
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v1

    .line 1249
    check-cast v1, Ljava/lang/String;

    .line 1250
    .line 1251
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1252
    .line 1253
    .line 1254
    goto/16 :goto_6

    .line 1255
    .line 1256
    :pswitch_1f
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 1257
    .line 1258
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v0

    .line 1262
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 1263
    .line 1264
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v3

    .line 1268
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 1269
    .line 1270
    .line 1271
    move-result v3

    .line 1272
    if-gtz v3, :cond_1

    .line 1273
    .line 1274
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1275
    .line 1276
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1277
    .line 1278
    .line 1279
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1280
    .line 1281
    .line 1282
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1283
    .line 1284
    .line 1285
    move-result-object p1

    .line 1286
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1287
    .line 1288
    .line 1289
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1290
    .line 1291
    .line 1292
    move-result-object p1

    .line 1293
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v1

    .line 1297
    check-cast v1, Ljava/lang/String;

    .line 1298
    .line 1299
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1300
    .line 1301
    .line 1302
    goto/16 :goto_6

    .line 1303
    .line 1304
    :pswitch_20
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 1305
    .line 1306
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v0

    .line 1310
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 1311
    .line 1312
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v3

    .line 1316
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 1317
    .line 1318
    .line 1319
    move-result v3

    .line 1320
    if-gtz v3, :cond_1

    .line 1321
    .line 1322
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1323
    .line 1324
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1325
    .line 1326
    .line 1327
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1328
    .line 1329
    .line 1330
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1331
    .line 1332
    .line 1333
    move-result-object p1

    .line 1334
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1335
    .line 1336
    .line 1337
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1338
    .line 1339
    .line 1340
    move-result-object p1

    .line 1341
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v1

    .line 1345
    check-cast v1, Ljava/lang/String;

    .line 1346
    .line 1347
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1348
    .line 1349
    .line 1350
    goto/16 :goto_6

    .line 1351
    .line 1352
    :pswitch_21
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 1353
    .line 1354
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v0

    .line 1358
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 1359
    .line 1360
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v3

    .line 1364
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 1365
    .line 1366
    .line 1367
    move-result v3

    .line 1368
    if-gtz v3, :cond_1

    .line 1369
    .line 1370
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1371
    .line 1372
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1373
    .line 1374
    .line 1375
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1376
    .line 1377
    .line 1378
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1379
    .line 1380
    .line 1381
    move-result-object p1

    .line 1382
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1383
    .line 1384
    .line 1385
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1386
    .line 1387
    .line 1388
    move-result-object p1

    .line 1389
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v1

    .line 1393
    check-cast v1, Ljava/lang/String;

    .line 1394
    .line 1395
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1396
    .line 1397
    .line 1398
    goto/16 :goto_6

    .line 1399
    .line 1400
    :pswitch_22
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 1401
    .line 1402
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v0

    .line 1406
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 1407
    .line 1408
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v3

    .line 1412
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 1413
    .line 1414
    .line 1415
    move-result v3

    .line 1416
    if-gtz v3, :cond_1

    .line 1417
    .line 1418
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1419
    .line 1420
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1421
    .line 1422
    .line 1423
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1427
    .line 1428
    .line 1429
    move-result-object p1

    .line 1430
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1431
    .line 1432
    .line 1433
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1434
    .line 1435
    .line 1436
    move-result-object p1

    .line 1437
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v1

    .line 1441
    check-cast v1, Ljava/lang/String;

    .line 1442
    .line 1443
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1444
    .line 1445
    .line 1446
    goto/16 :goto_6

    .line 1447
    .line 1448
    :pswitch_23
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 1449
    .line 1450
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v0

    .line 1454
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 1455
    .line 1456
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v3

    .line 1460
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 1461
    .line 1462
    .line 1463
    move-result v3

    .line 1464
    if-gtz v3, :cond_1

    .line 1465
    .line 1466
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1467
    .line 1468
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1469
    .line 1470
    .line 1471
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1472
    .line 1473
    .line 1474
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1475
    .line 1476
    .line 1477
    move-result-object p1

    .line 1478
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1482
    .line 1483
    .line 1484
    move-result-object p1

    .line 1485
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v1

    .line 1489
    check-cast v1, Ljava/lang/String;

    .line 1490
    .line 1491
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1492
    .line 1493
    .line 1494
    goto/16 :goto_6

    .line 1495
    .line 1496
    :pswitch_24
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1497
    .line 1498
    .line 1499
    move-result-object p1

    .line 1500
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v1

    .line 1504
    check-cast v1, Ljava/lang/String;

    .line 1505
    .line 1506
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1507
    .line 1508
    .line 1509
    goto/16 :goto_6

    .line 1510
    .line 1511
    :pswitch_25
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 1512
    .line 1513
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v0

    .line 1517
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 1518
    .line 1519
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v3

    .line 1523
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 1524
    .line 1525
    .line 1526
    move-result v3

    .line 1527
    if-gtz v3, :cond_1

    .line 1528
    .line 1529
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1530
    .line 1531
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1532
    .line 1533
    .line 1534
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1535
    .line 1536
    .line 1537
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1538
    .line 1539
    .line 1540
    move-result-object p1

    .line 1541
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1542
    .line 1543
    .line 1544
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1545
    .line 1546
    .line 1547
    move-result-object p1

    .line 1548
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1549
    .line 1550
    .line 1551
    move-result-object v1

    .line 1552
    check-cast v1, Ljava/lang/String;

    .line 1553
    .line 1554
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1555
    .line 1556
    .line 1557
    goto/16 :goto_6

    .line 1558
    .line 1559
    :pswitch_26
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 1560
    .line 1561
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v0

    .line 1565
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 1566
    .line 1567
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v3

    .line 1571
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 1572
    .line 1573
    .line 1574
    move-result v3

    .line 1575
    if-gtz v3, :cond_1

    .line 1576
    .line 1577
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1578
    .line 1579
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1580
    .line 1581
    .line 1582
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1583
    .line 1584
    .line 1585
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1586
    .line 1587
    .line 1588
    move-result-object p1

    .line 1589
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1590
    .line 1591
    .line 1592
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1593
    .line 1594
    .line 1595
    move-result-object p1

    .line 1596
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v1

    .line 1600
    check-cast v1, Ljava/lang/String;

    .line 1601
    .line 1602
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1603
    .line 1604
    .line 1605
    goto/16 :goto_6

    .line 1606
    .line 1607
    :pswitch_27
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 1608
    .line 1609
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v0

    .line 1613
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 1614
    .line 1615
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v3

    .line 1619
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 1620
    .line 1621
    .line 1622
    move-result v3

    .line 1623
    if-gtz v3, :cond_1

    .line 1624
    .line 1625
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1626
    .line 1627
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1628
    .line 1629
    .line 1630
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1631
    .line 1632
    .line 1633
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1634
    .line 1635
    .line 1636
    move-result-object p1

    .line 1637
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1638
    .line 1639
    .line 1640
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1641
    .line 1642
    .line 1643
    move-result-object p1

    .line 1644
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v1

    .line 1648
    check-cast v1, Ljava/lang/String;

    .line 1649
    .line 1650
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1651
    .line 1652
    .line 1653
    goto/16 :goto_6

    .line 1654
    .line 1655
    :pswitch_28
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1656
    .line 1657
    .line 1658
    move-result-object p1

    .line 1659
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v1

    .line 1663
    check-cast v1, Ljava/lang/String;

    .line 1664
    .line 1665
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1666
    .line 1667
    .line 1668
    goto/16 :goto_6

    .line 1669
    .line 1670
    :pswitch_29
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 1671
    .line 1672
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v0

    .line 1676
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 1677
    .line 1678
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v3

    .line 1682
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 1683
    .line 1684
    .line 1685
    move-result v3

    .line 1686
    if-gtz v3, :cond_1

    .line 1687
    .line 1688
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1689
    .line 1690
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1691
    .line 1692
    .line 1693
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1694
    .line 1695
    .line 1696
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1697
    .line 1698
    .line 1699
    move-result-object p1

    .line 1700
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1701
    .line 1702
    .line 1703
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1704
    .line 1705
    .line 1706
    move-result-object p1

    .line 1707
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1708
    .line 1709
    .line 1710
    move-result-object v1

    .line 1711
    check-cast v1, Ljava/lang/String;

    .line 1712
    .line 1713
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1714
    .line 1715
    .line 1716
    goto/16 :goto_6

    .line 1717
    .line 1718
    :goto_2
    sget-object v3, Lcom/revenuecat/purchases/common/LogIntent;->GOOGLE_ERROR:Lcom/revenuecat/purchases/common/LogIntent;

    .line 1719
    .line 1720
    new-instance v4, Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5;

    .line 1721
    .line 1722
    invoke-direct {v4, v3, p1}, Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5;-><init>(Lcom/revenuecat/purchases/common/LogIntent;Ljava/io/IOException;)V

    .line 1723
    .line 1724
    .line 1725
    sget-object p1, Lcom/revenuecat/purchases/common/LogWrapperKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 1726
    .line 1727
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 1728
    .line 1729
    .line 1730
    move-result v3

    .line 1731
    aget p1, p1, v3

    .line 1732
    .line 1733
    packed-switch p1, :pswitch_data_3

    .line 1734
    .line 1735
    .line 1736
    goto/16 :goto_6

    .line 1737
    .line 1738
    :pswitch_2a
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1739
    .line 1740
    .line 1741
    move-result-object p1

    .line 1742
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v1

    .line 1746
    check-cast v1, Ljava/lang/String;

    .line 1747
    .line 1748
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1749
    .line 1750
    .line 1751
    goto/16 :goto_6

    .line 1752
    .line 1753
    :pswitch_2b
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 1754
    .line 1755
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v0

    .line 1759
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 1760
    .line 1761
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v3

    .line 1765
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 1766
    .line 1767
    .line 1768
    move-result v3

    .line 1769
    if-gtz v3, :cond_1

    .line 1770
    .line 1771
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1772
    .line 1773
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1774
    .line 1775
    .line 1776
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1777
    .line 1778
    .line 1779
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1780
    .line 1781
    .line 1782
    move-result-object p1

    .line 1783
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1784
    .line 1785
    .line 1786
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1787
    .line 1788
    .line 1789
    move-result-object p1

    .line 1790
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v1

    .line 1794
    check-cast v1, Ljava/lang/String;

    .line 1795
    .line 1796
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1797
    .line 1798
    .line 1799
    goto/16 :goto_6

    .line 1800
    .line 1801
    :pswitch_2c
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1802
    .line 1803
    .line 1804
    move-result-object p1

    .line 1805
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v1

    .line 1809
    check-cast v1, Ljava/lang/String;

    .line 1810
    .line 1811
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1812
    .line 1813
    .line 1814
    goto/16 :goto_6

    .line 1815
    .line 1816
    :pswitch_2d
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 1817
    .line 1818
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1819
    .line 1820
    .line 1821
    move-result-object v0

    .line 1822
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 1823
    .line 1824
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 1825
    .line 1826
    .line 1827
    move-result-object v3

    .line 1828
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 1829
    .line 1830
    .line 1831
    move-result v3

    .line 1832
    if-gtz v3, :cond_1

    .line 1833
    .line 1834
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1835
    .line 1836
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1837
    .line 1838
    .line 1839
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1840
    .line 1841
    .line 1842
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1843
    .line 1844
    .line 1845
    move-result-object p1

    .line 1846
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1847
    .line 1848
    .line 1849
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1850
    .line 1851
    .line 1852
    move-result-object p1

    .line 1853
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1854
    .line 1855
    .line 1856
    move-result-object v1

    .line 1857
    check-cast v1, Ljava/lang/String;

    .line 1858
    .line 1859
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1860
    .line 1861
    .line 1862
    goto/16 :goto_6

    .line 1863
    .line 1864
    :pswitch_2e
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 1865
    .line 1866
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v0

    .line 1870
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 1871
    .line 1872
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v3

    .line 1876
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 1877
    .line 1878
    .line 1879
    move-result v3

    .line 1880
    if-gtz v3, :cond_1

    .line 1881
    .line 1882
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1883
    .line 1884
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1885
    .line 1886
    .line 1887
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1888
    .line 1889
    .line 1890
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1891
    .line 1892
    .line 1893
    move-result-object p1

    .line 1894
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1895
    .line 1896
    .line 1897
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1898
    .line 1899
    .line 1900
    move-result-object p1

    .line 1901
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1902
    .line 1903
    .line 1904
    move-result-object v1

    .line 1905
    check-cast v1, Ljava/lang/String;

    .line 1906
    .line 1907
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1908
    .line 1909
    .line 1910
    goto/16 :goto_6

    .line 1911
    .line 1912
    :pswitch_2f
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 1913
    .line 1914
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v0

    .line 1918
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 1919
    .line 1920
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 1921
    .line 1922
    .line 1923
    move-result-object v3

    .line 1924
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 1925
    .line 1926
    .line 1927
    move-result v3

    .line 1928
    if-gtz v3, :cond_1

    .line 1929
    .line 1930
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1931
    .line 1932
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1933
    .line 1934
    .line 1935
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1936
    .line 1937
    .line 1938
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1939
    .line 1940
    .line 1941
    move-result-object p1

    .line 1942
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1943
    .line 1944
    .line 1945
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1946
    .line 1947
    .line 1948
    move-result-object p1

    .line 1949
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1950
    .line 1951
    .line 1952
    move-result-object v1

    .line 1953
    check-cast v1, Ljava/lang/String;

    .line 1954
    .line 1955
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1956
    .line 1957
    .line 1958
    goto/16 :goto_6

    .line 1959
    .line 1960
    :pswitch_30
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 1961
    .line 1962
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 1963
    .line 1964
    .line 1965
    move-result-object v0

    .line 1966
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 1967
    .line 1968
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 1969
    .line 1970
    .line 1971
    move-result-object v3

    .line 1972
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 1973
    .line 1974
    .line 1975
    move-result v3

    .line 1976
    if-gtz v3, :cond_1

    .line 1977
    .line 1978
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1979
    .line 1980
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1981
    .line 1982
    .line 1983
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1984
    .line 1985
    .line 1986
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1987
    .line 1988
    .line 1989
    move-result-object p1

    .line 1990
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1991
    .line 1992
    .line 1993
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1994
    .line 1995
    .line 1996
    move-result-object p1

    .line 1997
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v1

    .line 2001
    check-cast v1, Ljava/lang/String;

    .line 2002
    .line 2003
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2004
    .line 2005
    .line 2006
    goto/16 :goto_6

    .line 2007
    .line 2008
    :pswitch_31
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 2009
    .line 2010
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2011
    .line 2012
    .line 2013
    move-result-object v0

    .line 2014
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 2015
    .line 2016
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 2017
    .line 2018
    .line 2019
    move-result-object v3

    .line 2020
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 2021
    .line 2022
    .line 2023
    move-result v3

    .line 2024
    if-gtz v3, :cond_1

    .line 2025
    .line 2026
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2027
    .line 2028
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2029
    .line 2030
    .line 2031
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2032
    .line 2033
    .line 2034
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2035
    .line 2036
    .line 2037
    move-result-object p1

    .line 2038
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2039
    .line 2040
    .line 2041
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2042
    .line 2043
    .line 2044
    move-result-object p1

    .line 2045
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v1

    .line 2049
    check-cast v1, Ljava/lang/String;

    .line 2050
    .line 2051
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 2052
    .line 2053
    .line 2054
    goto/16 :goto_6

    .line 2055
    .line 2056
    :pswitch_32
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2057
    .line 2058
    .line 2059
    move-result-object p1

    .line 2060
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2061
    .line 2062
    .line 2063
    move-result-object v1

    .line 2064
    check-cast v1, Ljava/lang/String;

    .line 2065
    .line 2066
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2067
    .line 2068
    .line 2069
    goto/16 :goto_6

    .line 2070
    .line 2071
    :pswitch_33
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 2072
    .line 2073
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2074
    .line 2075
    .line 2076
    move-result-object v0

    .line 2077
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 2078
    .line 2079
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 2080
    .line 2081
    .line 2082
    move-result-object v3

    .line 2083
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 2084
    .line 2085
    .line 2086
    move-result v3

    .line 2087
    if-gtz v3, :cond_1

    .line 2088
    .line 2089
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2090
    .line 2091
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2092
    .line 2093
    .line 2094
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2095
    .line 2096
    .line 2097
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2098
    .line 2099
    .line 2100
    move-result-object p1

    .line 2101
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2102
    .line 2103
    .line 2104
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2105
    .line 2106
    .line 2107
    move-result-object p1

    .line 2108
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2109
    .line 2110
    .line 2111
    move-result-object v1

    .line 2112
    check-cast v1, Ljava/lang/String;

    .line 2113
    .line 2114
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2115
    .line 2116
    .line 2117
    goto/16 :goto_6

    .line 2118
    .line 2119
    :pswitch_34
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 2120
    .line 2121
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2122
    .line 2123
    .line 2124
    move-result-object v0

    .line 2125
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 2126
    .line 2127
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 2128
    .line 2129
    .line 2130
    move-result-object v3

    .line 2131
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 2132
    .line 2133
    .line 2134
    move-result v3

    .line 2135
    if-gtz v3, :cond_1

    .line 2136
    .line 2137
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2138
    .line 2139
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2140
    .line 2141
    .line 2142
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2143
    .line 2144
    .line 2145
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2146
    .line 2147
    .line 2148
    move-result-object p1

    .line 2149
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2150
    .line 2151
    .line 2152
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2153
    .line 2154
    .line 2155
    move-result-object p1

    .line 2156
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2157
    .line 2158
    .line 2159
    move-result-object v1

    .line 2160
    check-cast v1, Ljava/lang/String;

    .line 2161
    .line 2162
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 2163
    .line 2164
    .line 2165
    goto/16 :goto_6

    .line 2166
    .line 2167
    :pswitch_35
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 2168
    .line 2169
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2170
    .line 2171
    .line 2172
    move-result-object v0

    .line 2173
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 2174
    .line 2175
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 2176
    .line 2177
    .line 2178
    move-result-object v3

    .line 2179
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 2180
    .line 2181
    .line 2182
    move-result v3

    .line 2183
    if-gtz v3, :cond_1

    .line 2184
    .line 2185
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2186
    .line 2187
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2188
    .line 2189
    .line 2190
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2191
    .line 2192
    .line 2193
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2194
    .line 2195
    .line 2196
    move-result-object p1

    .line 2197
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2198
    .line 2199
    .line 2200
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2201
    .line 2202
    .line 2203
    move-result-object p1

    .line 2204
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2205
    .line 2206
    .line 2207
    move-result-object v1

    .line 2208
    check-cast v1, Ljava/lang/String;

    .line 2209
    .line 2210
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 2211
    .line 2212
    .line 2213
    goto/16 :goto_6

    .line 2214
    .line 2215
    :pswitch_36
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2216
    .line 2217
    .line 2218
    move-result-object p1

    .line 2219
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2220
    .line 2221
    .line 2222
    move-result-object v1

    .line 2223
    check-cast v1, Ljava/lang/String;

    .line 2224
    .line 2225
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2226
    .line 2227
    .line 2228
    goto/16 :goto_6

    .line 2229
    .line 2230
    :pswitch_37
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 2231
    .line 2232
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2233
    .line 2234
    .line 2235
    move-result-object v0

    .line 2236
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 2237
    .line 2238
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 2239
    .line 2240
    .line 2241
    move-result-object v3

    .line 2242
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 2243
    .line 2244
    .line 2245
    move-result v3

    .line 2246
    if-gtz v3, :cond_1

    .line 2247
    .line 2248
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2249
    .line 2250
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2251
    .line 2252
    .line 2253
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2254
    .line 2255
    .line 2256
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2257
    .line 2258
    .line 2259
    move-result-object p1

    .line 2260
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2261
    .line 2262
    .line 2263
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2264
    .line 2265
    .line 2266
    move-result-object p1

    .line 2267
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2268
    .line 2269
    .line 2270
    move-result-object v1

    .line 2271
    check-cast v1, Ljava/lang/String;

    .line 2272
    .line 2273
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2274
    .line 2275
    .line 2276
    goto/16 :goto_6

    .line 2277
    .line 2278
    :goto_3
    sget-object v3, Lcom/revenuecat/purchases/common/LogIntent;->GOOGLE_ERROR:Lcom/revenuecat/purchases/common/LogIntent;

    .line 2279
    .line 2280
    new-instance v4, Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4;

    .line 2281
    .line 2282
    invoke-direct {v4, v3, p1}, Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4;-><init>(Lcom/revenuecat/purchases/common/LogIntent;Ljava/util/concurrent/TimeoutException;)V

    .line 2283
    .line 2284
    .line 2285
    sget-object p1, Lcom/revenuecat/purchases/common/LogWrapperKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 2286
    .line 2287
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 2288
    .line 2289
    .line 2290
    move-result v3

    .line 2291
    aget p1, p1, v3

    .line 2292
    .line 2293
    packed-switch p1, :pswitch_data_4

    .line 2294
    .line 2295
    .line 2296
    goto/16 :goto_6

    .line 2297
    .line 2298
    :pswitch_38
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2299
    .line 2300
    .line 2301
    move-result-object p1

    .line 2302
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2303
    .line 2304
    .line 2305
    move-result-object v1

    .line 2306
    check-cast v1, Ljava/lang/String;

    .line 2307
    .line 2308
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2309
    .line 2310
    .line 2311
    goto/16 :goto_6

    .line 2312
    .line 2313
    :pswitch_39
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 2314
    .line 2315
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2316
    .line 2317
    .line 2318
    move-result-object v0

    .line 2319
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 2320
    .line 2321
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 2322
    .line 2323
    .line 2324
    move-result-object v3

    .line 2325
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 2326
    .line 2327
    .line 2328
    move-result v3

    .line 2329
    if-gtz v3, :cond_1

    .line 2330
    .line 2331
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2332
    .line 2333
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2334
    .line 2335
    .line 2336
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2337
    .line 2338
    .line 2339
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2340
    .line 2341
    .line 2342
    move-result-object p1

    .line 2343
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2344
    .line 2345
    .line 2346
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2347
    .line 2348
    .line 2349
    move-result-object p1

    .line 2350
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2351
    .line 2352
    .line 2353
    move-result-object v1

    .line 2354
    check-cast v1, Ljava/lang/String;

    .line 2355
    .line 2356
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 2357
    .line 2358
    .line 2359
    goto/16 :goto_6

    .line 2360
    .line 2361
    :pswitch_3a
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2362
    .line 2363
    .line 2364
    move-result-object p1

    .line 2365
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2366
    .line 2367
    .line 2368
    move-result-object v1

    .line 2369
    check-cast v1, Ljava/lang/String;

    .line 2370
    .line 2371
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2372
    .line 2373
    .line 2374
    goto/16 :goto_6

    .line 2375
    .line 2376
    :pswitch_3b
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 2377
    .line 2378
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2379
    .line 2380
    .line 2381
    move-result-object v0

    .line 2382
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 2383
    .line 2384
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 2385
    .line 2386
    .line 2387
    move-result-object v3

    .line 2388
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 2389
    .line 2390
    .line 2391
    move-result v3

    .line 2392
    if-gtz v3, :cond_1

    .line 2393
    .line 2394
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2395
    .line 2396
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2397
    .line 2398
    .line 2399
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2400
    .line 2401
    .line 2402
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2403
    .line 2404
    .line 2405
    move-result-object p1

    .line 2406
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2407
    .line 2408
    .line 2409
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2410
    .line 2411
    .line 2412
    move-result-object p1

    .line 2413
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2414
    .line 2415
    .line 2416
    move-result-object v1

    .line 2417
    check-cast v1, Ljava/lang/String;

    .line 2418
    .line 2419
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 2420
    .line 2421
    .line 2422
    goto/16 :goto_6

    .line 2423
    .line 2424
    :pswitch_3c
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 2425
    .line 2426
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2427
    .line 2428
    .line 2429
    move-result-object v0

    .line 2430
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 2431
    .line 2432
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 2433
    .line 2434
    .line 2435
    move-result-object v3

    .line 2436
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 2437
    .line 2438
    .line 2439
    move-result v3

    .line 2440
    if-gtz v3, :cond_1

    .line 2441
    .line 2442
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2443
    .line 2444
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2445
    .line 2446
    .line 2447
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2448
    .line 2449
    .line 2450
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2451
    .line 2452
    .line 2453
    move-result-object p1

    .line 2454
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2455
    .line 2456
    .line 2457
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2458
    .line 2459
    .line 2460
    move-result-object p1

    .line 2461
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2462
    .line 2463
    .line 2464
    move-result-object v1

    .line 2465
    check-cast v1, Ljava/lang/String;

    .line 2466
    .line 2467
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 2468
    .line 2469
    .line 2470
    goto/16 :goto_6

    .line 2471
    .line 2472
    :pswitch_3d
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 2473
    .line 2474
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2475
    .line 2476
    .line 2477
    move-result-object v0

    .line 2478
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 2479
    .line 2480
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 2481
    .line 2482
    .line 2483
    move-result-object v3

    .line 2484
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 2485
    .line 2486
    .line 2487
    move-result v3

    .line 2488
    if-gtz v3, :cond_1

    .line 2489
    .line 2490
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2491
    .line 2492
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2493
    .line 2494
    .line 2495
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2496
    .line 2497
    .line 2498
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2499
    .line 2500
    .line 2501
    move-result-object p1

    .line 2502
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2503
    .line 2504
    .line 2505
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2506
    .line 2507
    .line 2508
    move-result-object p1

    .line 2509
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2510
    .line 2511
    .line 2512
    move-result-object v1

    .line 2513
    check-cast v1, Ljava/lang/String;

    .line 2514
    .line 2515
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2516
    .line 2517
    .line 2518
    goto/16 :goto_6

    .line 2519
    .line 2520
    :pswitch_3e
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 2521
    .line 2522
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2523
    .line 2524
    .line 2525
    move-result-object v0

    .line 2526
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 2527
    .line 2528
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 2529
    .line 2530
    .line 2531
    move-result-object v3

    .line 2532
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 2533
    .line 2534
    .line 2535
    move-result v3

    .line 2536
    if-gtz v3, :cond_1

    .line 2537
    .line 2538
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2539
    .line 2540
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2541
    .line 2542
    .line 2543
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2544
    .line 2545
    .line 2546
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2547
    .line 2548
    .line 2549
    move-result-object p1

    .line 2550
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2551
    .line 2552
    .line 2553
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2554
    .line 2555
    .line 2556
    move-result-object p1

    .line 2557
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2558
    .line 2559
    .line 2560
    move-result-object v1

    .line 2561
    check-cast v1, Ljava/lang/String;

    .line 2562
    .line 2563
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2564
    .line 2565
    .line 2566
    goto/16 :goto_6

    .line 2567
    .line 2568
    :pswitch_3f
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 2569
    .line 2570
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2571
    .line 2572
    .line 2573
    move-result-object v0

    .line 2574
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 2575
    .line 2576
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 2577
    .line 2578
    .line 2579
    move-result-object v3

    .line 2580
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 2581
    .line 2582
    .line 2583
    move-result v3

    .line 2584
    if-gtz v3, :cond_1

    .line 2585
    .line 2586
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2587
    .line 2588
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2589
    .line 2590
    .line 2591
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2592
    .line 2593
    .line 2594
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2595
    .line 2596
    .line 2597
    move-result-object p1

    .line 2598
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2599
    .line 2600
    .line 2601
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2602
    .line 2603
    .line 2604
    move-result-object p1

    .line 2605
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2606
    .line 2607
    .line 2608
    move-result-object v1

    .line 2609
    check-cast v1, Ljava/lang/String;

    .line 2610
    .line 2611
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 2612
    .line 2613
    .line 2614
    goto/16 :goto_6

    .line 2615
    .line 2616
    :pswitch_40
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2617
    .line 2618
    .line 2619
    move-result-object p1

    .line 2620
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2621
    .line 2622
    .line 2623
    move-result-object v1

    .line 2624
    check-cast v1, Ljava/lang/String;

    .line 2625
    .line 2626
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2627
    .line 2628
    .line 2629
    goto/16 :goto_6

    .line 2630
    .line 2631
    :pswitch_41
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 2632
    .line 2633
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2634
    .line 2635
    .line 2636
    move-result-object v0

    .line 2637
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 2638
    .line 2639
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 2640
    .line 2641
    .line 2642
    move-result-object v3

    .line 2643
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 2644
    .line 2645
    .line 2646
    move-result v3

    .line 2647
    if-gtz v3, :cond_1

    .line 2648
    .line 2649
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2650
    .line 2651
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2652
    .line 2653
    .line 2654
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2655
    .line 2656
    .line 2657
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2658
    .line 2659
    .line 2660
    move-result-object p1

    .line 2661
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2662
    .line 2663
    .line 2664
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2665
    .line 2666
    .line 2667
    move-result-object p1

    .line 2668
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2669
    .line 2670
    .line 2671
    move-result-object v1

    .line 2672
    check-cast v1, Ljava/lang/String;

    .line 2673
    .line 2674
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2675
    .line 2676
    .line 2677
    goto/16 :goto_6

    .line 2678
    .line 2679
    :pswitch_42
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 2680
    .line 2681
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2682
    .line 2683
    .line 2684
    move-result-object v0

    .line 2685
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 2686
    .line 2687
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 2688
    .line 2689
    .line 2690
    move-result-object v3

    .line 2691
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 2692
    .line 2693
    .line 2694
    move-result v3

    .line 2695
    if-gtz v3, :cond_1

    .line 2696
    .line 2697
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2698
    .line 2699
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2700
    .line 2701
    .line 2702
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2703
    .line 2704
    .line 2705
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2706
    .line 2707
    .line 2708
    move-result-object p1

    .line 2709
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2710
    .line 2711
    .line 2712
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2713
    .line 2714
    .line 2715
    move-result-object p1

    .line 2716
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2717
    .line 2718
    .line 2719
    move-result-object v1

    .line 2720
    check-cast v1, Ljava/lang/String;

    .line 2721
    .line 2722
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 2723
    .line 2724
    .line 2725
    goto/16 :goto_6

    .line 2726
    .line 2727
    :pswitch_43
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 2728
    .line 2729
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2730
    .line 2731
    .line 2732
    move-result-object v0

    .line 2733
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 2734
    .line 2735
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 2736
    .line 2737
    .line 2738
    move-result-object v3

    .line 2739
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 2740
    .line 2741
    .line 2742
    move-result v3

    .line 2743
    if-gtz v3, :cond_1

    .line 2744
    .line 2745
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2746
    .line 2747
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2748
    .line 2749
    .line 2750
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2751
    .line 2752
    .line 2753
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2754
    .line 2755
    .line 2756
    move-result-object p1

    .line 2757
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2758
    .line 2759
    .line 2760
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2761
    .line 2762
    .line 2763
    move-result-object p1

    .line 2764
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2765
    .line 2766
    .line 2767
    move-result-object v1

    .line 2768
    check-cast v1, Ljava/lang/String;

    .line 2769
    .line 2770
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 2771
    .line 2772
    .line 2773
    goto/16 :goto_6

    .line 2774
    .line 2775
    :pswitch_44
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2776
    .line 2777
    .line 2778
    move-result-object p1

    .line 2779
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2780
    .line 2781
    .line 2782
    move-result-object v1

    .line 2783
    check-cast v1, Ljava/lang/String;

    .line 2784
    .line 2785
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2786
    .line 2787
    .line 2788
    goto/16 :goto_6

    .line 2789
    .line 2790
    :pswitch_45
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 2791
    .line 2792
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2793
    .line 2794
    .line 2795
    move-result-object v0

    .line 2796
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 2797
    .line 2798
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 2799
    .line 2800
    .line 2801
    move-result-object v3

    .line 2802
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 2803
    .line 2804
    .line 2805
    move-result v3

    .line 2806
    if-gtz v3, :cond_1

    .line 2807
    .line 2808
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2809
    .line 2810
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2811
    .line 2812
    .line 2813
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2814
    .line 2815
    .line 2816
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2817
    .line 2818
    .line 2819
    move-result-object p1

    .line 2820
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2821
    .line 2822
    .line 2823
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2824
    .line 2825
    .line 2826
    move-result-object p1

    .line 2827
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2828
    .line 2829
    .line 2830
    move-result-object v1

    .line 2831
    check-cast v1, Ljava/lang/String;

    .line 2832
    .line 2833
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2834
    .line 2835
    .line 2836
    goto/16 :goto_6

    .line 2837
    .line 2838
    :goto_4
    sget-object v3, Lcom/revenuecat/purchases/common/LogIntent;->GOOGLE_ERROR:Lcom/revenuecat/purchases/common/LogIntent;

    .line 2839
    .line 2840
    new-instance v4, Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3;

    .line 2841
    .line 2842
    invoke-direct {v4, v3, p1}, Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3;-><init>(Lcom/revenuecat/purchases/common/LogIntent;LO8/h;)V

    .line 2843
    .line 2844
    .line 2845
    sget-object p1, Lcom/revenuecat/purchases/common/LogWrapperKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 2846
    .line 2847
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 2848
    .line 2849
    .line 2850
    move-result v3

    .line 2851
    aget p1, p1, v3

    .line 2852
    .line 2853
    packed-switch p1, :pswitch_data_5

    .line 2854
    .line 2855
    .line 2856
    goto/16 :goto_6

    .line 2857
    .line 2858
    :pswitch_46
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2859
    .line 2860
    .line 2861
    move-result-object p1

    .line 2862
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2863
    .line 2864
    .line 2865
    move-result-object v1

    .line 2866
    check-cast v1, Ljava/lang/String;

    .line 2867
    .line 2868
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2869
    .line 2870
    .line 2871
    goto/16 :goto_6

    .line 2872
    .line 2873
    :pswitch_47
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 2874
    .line 2875
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2876
    .line 2877
    .line 2878
    move-result-object v0

    .line 2879
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 2880
    .line 2881
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 2882
    .line 2883
    .line 2884
    move-result-object v3

    .line 2885
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 2886
    .line 2887
    .line 2888
    move-result v3

    .line 2889
    if-gtz v3, :cond_1

    .line 2890
    .line 2891
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2892
    .line 2893
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2894
    .line 2895
    .line 2896
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2897
    .line 2898
    .line 2899
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2900
    .line 2901
    .line 2902
    move-result-object p1

    .line 2903
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2904
    .line 2905
    .line 2906
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2907
    .line 2908
    .line 2909
    move-result-object p1

    .line 2910
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2911
    .line 2912
    .line 2913
    move-result-object v1

    .line 2914
    check-cast v1, Ljava/lang/String;

    .line 2915
    .line 2916
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 2917
    .line 2918
    .line 2919
    goto/16 :goto_6

    .line 2920
    .line 2921
    :pswitch_48
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2922
    .line 2923
    .line 2924
    move-result-object p1

    .line 2925
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2926
    .line 2927
    .line 2928
    move-result-object v1

    .line 2929
    check-cast v1, Ljava/lang/String;

    .line 2930
    .line 2931
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2932
    .line 2933
    .line 2934
    goto/16 :goto_6

    .line 2935
    .line 2936
    :pswitch_49
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 2937
    .line 2938
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2939
    .line 2940
    .line 2941
    move-result-object v0

    .line 2942
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 2943
    .line 2944
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 2945
    .line 2946
    .line 2947
    move-result-object v3

    .line 2948
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 2949
    .line 2950
    .line 2951
    move-result v3

    .line 2952
    if-gtz v3, :cond_1

    .line 2953
    .line 2954
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2955
    .line 2956
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2957
    .line 2958
    .line 2959
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2960
    .line 2961
    .line 2962
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2963
    .line 2964
    .line 2965
    move-result-object p1

    .line 2966
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2967
    .line 2968
    .line 2969
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2970
    .line 2971
    .line 2972
    move-result-object p1

    .line 2973
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2974
    .line 2975
    .line 2976
    move-result-object v1

    .line 2977
    check-cast v1, Ljava/lang/String;

    .line 2978
    .line 2979
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 2980
    .line 2981
    .line 2982
    goto/16 :goto_6

    .line 2983
    .line 2984
    :pswitch_4a
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 2985
    .line 2986
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 2987
    .line 2988
    .line 2989
    move-result-object v0

    .line 2990
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 2991
    .line 2992
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 2993
    .line 2994
    .line 2995
    move-result-object v3

    .line 2996
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 2997
    .line 2998
    .line 2999
    move-result v3

    .line 3000
    if-gtz v3, :cond_1

    .line 3001
    .line 3002
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3003
    .line 3004
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 3005
    .line 3006
    .line 3007
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3008
    .line 3009
    .line 3010
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 3011
    .line 3012
    .line 3013
    move-result-object p1

    .line 3014
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3015
    .line 3016
    .line 3017
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3018
    .line 3019
    .line 3020
    move-result-object p1

    .line 3021
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3022
    .line 3023
    .line 3024
    move-result-object v1

    .line 3025
    check-cast v1, Ljava/lang/String;

    .line 3026
    .line 3027
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 3028
    .line 3029
    .line 3030
    goto/16 :goto_6

    .line 3031
    .line 3032
    :pswitch_4b
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 3033
    .line 3034
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3035
    .line 3036
    .line 3037
    move-result-object v0

    .line 3038
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 3039
    .line 3040
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 3041
    .line 3042
    .line 3043
    move-result-object v3

    .line 3044
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 3045
    .line 3046
    .line 3047
    move-result v3

    .line 3048
    if-gtz v3, :cond_1

    .line 3049
    .line 3050
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3051
    .line 3052
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 3053
    .line 3054
    .line 3055
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3056
    .line 3057
    .line 3058
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 3059
    .line 3060
    .line 3061
    move-result-object p1

    .line 3062
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3063
    .line 3064
    .line 3065
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3066
    .line 3067
    .line 3068
    move-result-object p1

    .line 3069
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3070
    .line 3071
    .line 3072
    move-result-object v1

    .line 3073
    check-cast v1, Ljava/lang/String;

    .line 3074
    .line 3075
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3076
    .line 3077
    .line 3078
    goto/16 :goto_6

    .line 3079
    .line 3080
    :pswitch_4c
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 3081
    .line 3082
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3083
    .line 3084
    .line 3085
    move-result-object v0

    .line 3086
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 3087
    .line 3088
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 3089
    .line 3090
    .line 3091
    move-result-object v3

    .line 3092
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 3093
    .line 3094
    .line 3095
    move-result v3

    .line 3096
    if-gtz v3, :cond_1

    .line 3097
    .line 3098
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3099
    .line 3100
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 3101
    .line 3102
    .line 3103
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3104
    .line 3105
    .line 3106
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 3107
    .line 3108
    .line 3109
    move-result-object p1

    .line 3110
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3111
    .line 3112
    .line 3113
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3114
    .line 3115
    .line 3116
    move-result-object p1

    .line 3117
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3118
    .line 3119
    .line 3120
    move-result-object v1

    .line 3121
    check-cast v1, Ljava/lang/String;

    .line 3122
    .line 3123
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3124
    .line 3125
    .line 3126
    goto/16 :goto_6

    .line 3127
    .line 3128
    :pswitch_4d
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 3129
    .line 3130
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3131
    .line 3132
    .line 3133
    move-result-object v0

    .line 3134
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 3135
    .line 3136
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 3137
    .line 3138
    .line 3139
    move-result-object v3

    .line 3140
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 3141
    .line 3142
    .line 3143
    move-result v3

    .line 3144
    if-gtz v3, :cond_1

    .line 3145
    .line 3146
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3147
    .line 3148
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 3149
    .line 3150
    .line 3151
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3152
    .line 3153
    .line 3154
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 3155
    .line 3156
    .line 3157
    move-result-object p1

    .line 3158
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3159
    .line 3160
    .line 3161
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3162
    .line 3163
    .line 3164
    move-result-object p1

    .line 3165
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3166
    .line 3167
    .line 3168
    move-result-object v1

    .line 3169
    check-cast v1, Ljava/lang/String;

    .line 3170
    .line 3171
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3172
    .line 3173
    .line 3174
    goto/16 :goto_6

    .line 3175
    .line 3176
    :pswitch_4e
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3177
    .line 3178
    .line 3179
    move-result-object p1

    .line 3180
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3181
    .line 3182
    .line 3183
    move-result-object v1

    .line 3184
    check-cast v1, Ljava/lang/String;

    .line 3185
    .line 3186
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 3187
    .line 3188
    .line 3189
    goto/16 :goto_6

    .line 3190
    .line 3191
    :pswitch_4f
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 3192
    .line 3193
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3194
    .line 3195
    .line 3196
    move-result-object v0

    .line 3197
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 3198
    .line 3199
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 3200
    .line 3201
    .line 3202
    move-result-object v3

    .line 3203
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 3204
    .line 3205
    .line 3206
    move-result v3

    .line 3207
    if-gtz v3, :cond_1

    .line 3208
    .line 3209
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3210
    .line 3211
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 3212
    .line 3213
    .line 3214
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3215
    .line 3216
    .line 3217
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 3218
    .line 3219
    .line 3220
    move-result-object p1

    .line 3221
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3222
    .line 3223
    .line 3224
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3225
    .line 3226
    .line 3227
    move-result-object p1

    .line 3228
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3229
    .line 3230
    .line 3231
    move-result-object v1

    .line 3232
    check-cast v1, Ljava/lang/String;

    .line 3233
    .line 3234
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3235
    .line 3236
    .line 3237
    goto/16 :goto_6

    .line 3238
    .line 3239
    :pswitch_50
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 3240
    .line 3241
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3242
    .line 3243
    .line 3244
    move-result-object v0

    .line 3245
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 3246
    .line 3247
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 3248
    .line 3249
    .line 3250
    move-result-object v3

    .line 3251
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 3252
    .line 3253
    .line 3254
    move-result v3

    .line 3255
    if-gtz v3, :cond_1

    .line 3256
    .line 3257
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3258
    .line 3259
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 3260
    .line 3261
    .line 3262
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3263
    .line 3264
    .line 3265
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 3266
    .line 3267
    .line 3268
    move-result-object p1

    .line 3269
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3270
    .line 3271
    .line 3272
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3273
    .line 3274
    .line 3275
    move-result-object p1

    .line 3276
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3277
    .line 3278
    .line 3279
    move-result-object v1

    .line 3280
    check-cast v1, Ljava/lang/String;

    .line 3281
    .line 3282
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3283
    .line 3284
    .line 3285
    goto/16 :goto_6

    .line 3286
    .line 3287
    :pswitch_51
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 3288
    .line 3289
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3290
    .line 3291
    .line 3292
    move-result-object v0

    .line 3293
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 3294
    .line 3295
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 3296
    .line 3297
    .line 3298
    move-result-object v3

    .line 3299
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 3300
    .line 3301
    .line 3302
    move-result v3

    .line 3303
    if-gtz v3, :cond_1

    .line 3304
    .line 3305
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3306
    .line 3307
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 3308
    .line 3309
    .line 3310
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3311
    .line 3312
    .line 3313
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 3314
    .line 3315
    .line 3316
    move-result-object p1

    .line 3317
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3318
    .line 3319
    .line 3320
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3321
    .line 3322
    .line 3323
    move-result-object p1

    .line 3324
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3325
    .line 3326
    .line 3327
    move-result-object v1

    .line 3328
    check-cast v1, Ljava/lang/String;

    .line 3329
    .line 3330
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 3331
    .line 3332
    .line 3333
    goto/16 :goto_6

    .line 3334
    .line 3335
    :pswitch_52
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3336
    .line 3337
    .line 3338
    move-result-object p1

    .line 3339
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3340
    .line 3341
    .line 3342
    move-result-object v1

    .line 3343
    check-cast v1, Ljava/lang/String;

    .line 3344
    .line 3345
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 3346
    .line 3347
    .line 3348
    goto/16 :goto_6

    .line 3349
    .line 3350
    :pswitch_53
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 3351
    .line 3352
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3353
    .line 3354
    .line 3355
    move-result-object v0

    .line 3356
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 3357
    .line 3358
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 3359
    .line 3360
    .line 3361
    move-result-object v3

    .line 3362
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 3363
    .line 3364
    .line 3365
    move-result v3

    .line 3366
    if-gtz v3, :cond_1

    .line 3367
    .line 3368
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3369
    .line 3370
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 3371
    .line 3372
    .line 3373
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3374
    .line 3375
    .line 3376
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 3377
    .line 3378
    .line 3379
    move-result-object p1

    .line 3380
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3381
    .line 3382
    .line 3383
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3384
    .line 3385
    .line 3386
    move-result-object p1

    .line 3387
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3388
    .line 3389
    .line 3390
    move-result-object v1

    .line 3391
    check-cast v1, Ljava/lang/String;

    .line 3392
    .line 3393
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3394
    .line 3395
    .line 3396
    goto/16 :goto_6

    .line 3397
    .line 3398
    :goto_5
    sget-object v3, Lcom/revenuecat/purchases/common/LogIntent;->GOOGLE_ERROR:Lcom/revenuecat/purchases/common/LogIntent;

    .line 3399
    .line 3400
    new-instance v4, Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2;

    .line 3401
    .line 3402
    invoke-direct {v4, v3, p1}, Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2;-><init>(Lcom/revenuecat/purchases/common/LogIntent;LO8/g;)V

    .line 3403
    .line 3404
    .line 3405
    sget-object p1, Lcom/revenuecat/purchases/common/LogWrapperKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 3406
    .line 3407
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 3408
    .line 3409
    .line 3410
    move-result v3

    .line 3411
    aget p1, p1, v3

    .line 3412
    .line 3413
    packed-switch p1, :pswitch_data_6

    .line 3414
    .line 3415
    .line 3416
    goto/16 :goto_6

    .line 3417
    .line 3418
    :pswitch_54
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3419
    .line 3420
    .line 3421
    move-result-object p1

    .line 3422
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3423
    .line 3424
    .line 3425
    move-result-object v1

    .line 3426
    check-cast v1, Ljava/lang/String;

    .line 3427
    .line 3428
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 3429
    .line 3430
    .line 3431
    goto/16 :goto_6

    .line 3432
    .line 3433
    :pswitch_55
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 3434
    .line 3435
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3436
    .line 3437
    .line 3438
    move-result-object v0

    .line 3439
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 3440
    .line 3441
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 3442
    .line 3443
    .line 3444
    move-result-object v3

    .line 3445
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 3446
    .line 3447
    .line 3448
    move-result v3

    .line 3449
    if-gtz v3, :cond_1

    .line 3450
    .line 3451
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3452
    .line 3453
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 3454
    .line 3455
    .line 3456
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3457
    .line 3458
    .line 3459
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 3460
    .line 3461
    .line 3462
    move-result-object p1

    .line 3463
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3464
    .line 3465
    .line 3466
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3467
    .line 3468
    .line 3469
    move-result-object p1

    .line 3470
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3471
    .line 3472
    .line 3473
    move-result-object v1

    .line 3474
    check-cast v1, Ljava/lang/String;

    .line 3475
    .line 3476
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 3477
    .line 3478
    .line 3479
    goto/16 :goto_6

    .line 3480
    .line 3481
    :pswitch_56
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3482
    .line 3483
    .line 3484
    move-result-object p1

    .line 3485
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3486
    .line 3487
    .line 3488
    move-result-object v1

    .line 3489
    check-cast v1, Ljava/lang/String;

    .line 3490
    .line 3491
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 3492
    .line 3493
    .line 3494
    goto/16 :goto_6

    .line 3495
    .line 3496
    :pswitch_57
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 3497
    .line 3498
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3499
    .line 3500
    .line 3501
    move-result-object v0

    .line 3502
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 3503
    .line 3504
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 3505
    .line 3506
    .line 3507
    move-result-object v3

    .line 3508
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 3509
    .line 3510
    .line 3511
    move-result v3

    .line 3512
    if-gtz v3, :cond_1

    .line 3513
    .line 3514
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3515
    .line 3516
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 3517
    .line 3518
    .line 3519
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3520
    .line 3521
    .line 3522
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 3523
    .line 3524
    .line 3525
    move-result-object p1

    .line 3526
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3527
    .line 3528
    .line 3529
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3530
    .line 3531
    .line 3532
    move-result-object p1

    .line 3533
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3534
    .line 3535
    .line 3536
    move-result-object v1

    .line 3537
    check-cast v1, Ljava/lang/String;

    .line 3538
    .line 3539
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 3540
    .line 3541
    .line 3542
    goto/16 :goto_6

    .line 3543
    .line 3544
    :pswitch_58
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 3545
    .line 3546
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3547
    .line 3548
    .line 3549
    move-result-object v0

    .line 3550
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 3551
    .line 3552
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 3553
    .line 3554
    .line 3555
    move-result-object v3

    .line 3556
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 3557
    .line 3558
    .line 3559
    move-result v3

    .line 3560
    if-gtz v3, :cond_1

    .line 3561
    .line 3562
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3563
    .line 3564
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 3565
    .line 3566
    .line 3567
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3568
    .line 3569
    .line 3570
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 3571
    .line 3572
    .line 3573
    move-result-object p1

    .line 3574
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3575
    .line 3576
    .line 3577
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3578
    .line 3579
    .line 3580
    move-result-object p1

    .line 3581
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3582
    .line 3583
    .line 3584
    move-result-object v1

    .line 3585
    check-cast v1, Ljava/lang/String;

    .line 3586
    .line 3587
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 3588
    .line 3589
    .line 3590
    goto/16 :goto_6

    .line 3591
    .line 3592
    :pswitch_59
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 3593
    .line 3594
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3595
    .line 3596
    .line 3597
    move-result-object v0

    .line 3598
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 3599
    .line 3600
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 3601
    .line 3602
    .line 3603
    move-result-object v3

    .line 3604
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 3605
    .line 3606
    .line 3607
    move-result v3

    .line 3608
    if-gtz v3, :cond_1

    .line 3609
    .line 3610
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3611
    .line 3612
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 3613
    .line 3614
    .line 3615
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3616
    .line 3617
    .line 3618
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 3619
    .line 3620
    .line 3621
    move-result-object p1

    .line 3622
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3623
    .line 3624
    .line 3625
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3626
    .line 3627
    .line 3628
    move-result-object p1

    .line 3629
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3630
    .line 3631
    .line 3632
    move-result-object v1

    .line 3633
    check-cast v1, Ljava/lang/String;

    .line 3634
    .line 3635
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3636
    .line 3637
    .line 3638
    goto/16 :goto_6

    .line 3639
    .line 3640
    :pswitch_5a
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 3641
    .line 3642
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3643
    .line 3644
    .line 3645
    move-result-object v0

    .line 3646
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 3647
    .line 3648
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 3649
    .line 3650
    .line 3651
    move-result-object v3

    .line 3652
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 3653
    .line 3654
    .line 3655
    move-result v3

    .line 3656
    if-gtz v3, :cond_1

    .line 3657
    .line 3658
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3659
    .line 3660
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 3661
    .line 3662
    .line 3663
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3664
    .line 3665
    .line 3666
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 3667
    .line 3668
    .line 3669
    move-result-object p1

    .line 3670
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3671
    .line 3672
    .line 3673
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3674
    .line 3675
    .line 3676
    move-result-object p1

    .line 3677
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3678
    .line 3679
    .line 3680
    move-result-object v1

    .line 3681
    check-cast v1, Ljava/lang/String;

    .line 3682
    .line 3683
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3684
    .line 3685
    .line 3686
    goto/16 :goto_6

    .line 3687
    .line 3688
    :pswitch_5b
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 3689
    .line 3690
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3691
    .line 3692
    .line 3693
    move-result-object v0

    .line 3694
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 3695
    .line 3696
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 3697
    .line 3698
    .line 3699
    move-result-object v3

    .line 3700
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 3701
    .line 3702
    .line 3703
    move-result v3

    .line 3704
    if-gtz v3, :cond_1

    .line 3705
    .line 3706
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3707
    .line 3708
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 3709
    .line 3710
    .line 3711
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3712
    .line 3713
    .line 3714
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 3715
    .line 3716
    .line 3717
    move-result-object p1

    .line 3718
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3719
    .line 3720
    .line 3721
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3722
    .line 3723
    .line 3724
    move-result-object p1

    .line 3725
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3726
    .line 3727
    .line 3728
    move-result-object v1

    .line 3729
    check-cast v1, Ljava/lang/String;

    .line 3730
    .line 3731
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3732
    .line 3733
    .line 3734
    goto/16 :goto_6

    .line 3735
    .line 3736
    :pswitch_5c
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3737
    .line 3738
    .line 3739
    move-result-object p1

    .line 3740
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3741
    .line 3742
    .line 3743
    move-result-object v1

    .line 3744
    check-cast v1, Ljava/lang/String;

    .line 3745
    .line 3746
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 3747
    .line 3748
    .line 3749
    goto/16 :goto_6

    .line 3750
    .line 3751
    :pswitch_5d
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 3752
    .line 3753
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3754
    .line 3755
    .line 3756
    move-result-object v0

    .line 3757
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 3758
    .line 3759
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 3760
    .line 3761
    .line 3762
    move-result-object v3

    .line 3763
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 3764
    .line 3765
    .line 3766
    move-result v3

    .line 3767
    if-gtz v3, :cond_1

    .line 3768
    .line 3769
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3770
    .line 3771
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 3772
    .line 3773
    .line 3774
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3775
    .line 3776
    .line 3777
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 3778
    .line 3779
    .line 3780
    move-result-object p1

    .line 3781
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3782
    .line 3783
    .line 3784
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3785
    .line 3786
    .line 3787
    move-result-object p1

    .line 3788
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3789
    .line 3790
    .line 3791
    move-result-object v1

    .line 3792
    check-cast v1, Ljava/lang/String;

    .line 3793
    .line 3794
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3795
    .line 3796
    .line 3797
    goto/16 :goto_6

    .line 3798
    .line 3799
    :pswitch_5e
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 3800
    .line 3801
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3802
    .line 3803
    .line 3804
    move-result-object v0

    .line 3805
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 3806
    .line 3807
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 3808
    .line 3809
    .line 3810
    move-result-object v3

    .line 3811
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 3812
    .line 3813
    .line 3814
    move-result v3

    .line 3815
    if-gtz v3, :cond_1

    .line 3816
    .line 3817
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3818
    .line 3819
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 3820
    .line 3821
    .line 3822
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3823
    .line 3824
    .line 3825
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 3826
    .line 3827
    .line 3828
    move-result-object p1

    .line 3829
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3830
    .line 3831
    .line 3832
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3833
    .line 3834
    .line 3835
    move-result-object p1

    .line 3836
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3837
    .line 3838
    .line 3839
    move-result-object v1

    .line 3840
    check-cast v1, Ljava/lang/String;

    .line 3841
    .line 3842
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3843
    .line 3844
    .line 3845
    goto :goto_6

    .line 3846
    :pswitch_5f
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 3847
    .line 3848
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3849
    .line 3850
    .line 3851
    move-result-object v0

    .line 3852
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 3853
    .line 3854
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 3855
    .line 3856
    .line 3857
    move-result-object v3

    .line 3858
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 3859
    .line 3860
    .line 3861
    move-result v3

    .line 3862
    if-gtz v3, :cond_1

    .line 3863
    .line 3864
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3865
    .line 3866
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 3867
    .line 3868
    .line 3869
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3870
    .line 3871
    .line 3872
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 3873
    .line 3874
    .line 3875
    move-result-object p1

    .line 3876
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3877
    .line 3878
    .line 3879
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3880
    .line 3881
    .line 3882
    move-result-object p1

    .line 3883
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3884
    .line 3885
    .line 3886
    move-result-object v1

    .line 3887
    check-cast v1, Ljava/lang/String;

    .line 3888
    .line 3889
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 3890
    .line 3891
    .line 3892
    goto :goto_6

    .line 3893
    :pswitch_60
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3894
    .line 3895
    .line 3896
    move-result-object p1

    .line 3897
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3898
    .line 3899
    .line 3900
    move-result-object v1

    .line 3901
    check-cast v1, Ljava/lang/String;

    .line 3902
    .line 3903
    invoke-interface {p1, v0, v1, v2}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 3904
    .line 3905
    .line 3906
    goto :goto_6

    .line 3907
    :pswitch_61
    sget-object p1, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 3908
    .line 3909
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 3910
    .line 3911
    .line 3912
    move-result-object v0

    .line 3913
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 3914
    .line 3915
    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 3916
    .line 3917
    .line 3918
    move-result-object v3

    .line 3919
    invoke-virtual {v3, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 3920
    .line 3921
    .line 3922
    move-result v3

    .line 3923
    if-gtz v3, :cond_1

    .line 3924
    .line 3925
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3926
    .line 3927
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 3928
    .line 3929
    .line 3930
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3931
    .line 3932
    .line 3933
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 3934
    .line 3935
    .line 3936
    move-result-object p1

    .line 3937
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3938
    .line 3939
    .line 3940
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3941
    .line 3942
    .line 3943
    move-result-object p1

    .line 3944
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 3945
    .line 3946
    .line 3947
    move-result-object v1

    .line 3948
    check-cast v1, Ljava/lang/String;

    .line 3949
    .line 3950
    invoke-interface {v0, p1, v1}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3951
    .line 3952
    .line 3953
    :cond_1
    :goto_6
    return-object v2

    .line 3954
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x1
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
    .end packed-switch
.end method

.method private static final getDeviceIdentifiers$lambda$0(Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher;Landroid/app/Application;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher;->getAdvertisingID(Landroid/app/Application;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p1, Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$DeviceIdentifiers$GPSAdID;->INSTANCE:Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$DeviceIdentifiers$GPSAdID;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;->getBackendKey()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1, p0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p1, Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$DeviceIdentifiers$IP;->INSTANCE:Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$DeviceIdentifiers$IP;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;->getBackendKey()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "true"

    .line 22
    .line 23
    invoke-static {p1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    sget-object v1, Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$DeviceIdentifiers$DeviceVersion;->INSTANCE:Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$DeviceIdentifiers$DeviceVersion;

    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;->getBackendKey()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    filled-new-array {p0, p1, v0}, [Lkotlin/Pair;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, Lcom/revenuecat/purchases/utils/MapExtensionsKt;->filterNotNullValues(Ljava/util/Map;)Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public getDeviceIdentifiers(Landroid/app/Application;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "applicationContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "completion"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher;->dispatcher:Lcom/revenuecat/purchases/common/Dispatcher;

    .line 12
    .line 13
    new-instance v1, Lcom/revenuecat/purchases/google/attribution/a;

    .line 14
    .line 15
    invoke-direct {v1, p0, p1, p2}, Lcom/revenuecat/purchases/google/attribution/a;-><init>(Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher;Landroid/app/Application;Lkotlin/jvm/functions/Function1;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    const/4 p2, 0x2

    .line 20
    invoke-static {v0, v1, p1, p2, p1}, Lcom/revenuecat/purchases/common/Dispatcher;->enqueue$default(Lcom/revenuecat/purchases/common/Dispatcher;Ljava/lang/Runnable;Lcom/revenuecat/purchases/common/Delay;ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
