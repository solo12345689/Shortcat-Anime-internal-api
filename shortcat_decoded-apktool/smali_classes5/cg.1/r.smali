.class public abstract Lcg/r;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static volatile a:Landroid/content/Intent;


# direct methods
.method public static a(Landroid/content/Context;)Landroid/content/Intent;
    .locals 10

    .line 1
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, -0x1

    .line 23
    sparse-switch v2, :sswitch_data_0

    .line 24
    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :sswitch_0
    const-string v2, "samsung"

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    goto/16 :goto_0

    .line 37
    .line 38
    :cond_0
    const/16 v4, 0xd

    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :sswitch_1
    const-string v2, "coloros"

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    goto/16 :goto_0

    .line 51
    .line 52
    :cond_1
    const/16 v4, 0xc

    .line 53
    .line 54
    goto/16 :goto_0

    .line 55
    .line 56
    :sswitch_2
    const-string v2, "redmi"

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_2

    .line 63
    .line 64
    goto/16 :goto_0

    .line 65
    .line 66
    :cond_2
    const/16 v4, 0xb

    .line 67
    .line 68
    goto/16 :goto_0

    .line 69
    .line 70
    :sswitch_3
    const-string v2, "nokia"

    .line 71
    .line 72
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_3

    .line 77
    .line 78
    goto/16 :goto_0

    .line 79
    .line 80
    :cond_3
    const/16 v4, 0xa

    .line 81
    .line 82
    goto/16 :goto_0

    .line 83
    .line 84
    :sswitch_4
    const-string v2, "meizu"

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_4

    .line 91
    .line 92
    goto/16 :goto_0

    .line 93
    .line 94
    :cond_4
    const/16 v4, 0x9

    .line 95
    .line 96
    goto/16 :goto_0

    .line 97
    .line 98
    :sswitch_5
    const-string v2, "honor"

    .line 99
    .line 100
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_5

    .line 105
    .line 106
    goto/16 :goto_0

    .line 107
    .line 108
    :cond_5
    const/16 v4, 0x8

    .line 109
    .line 110
    goto/16 :goto_0

    .line 111
    .line 112
    :sswitch_6
    const-string v2, "vivo"

    .line 113
    .line 114
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_6

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_6
    const/4 v4, 0x7

    .line 122
    goto :goto_0

    .line 123
    :sswitch_7
    const-string v2, "oppo"

    .line 124
    .line 125
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-nez v0, :cond_7

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_7
    const/4 v4, 0x6

    .line 133
    goto :goto_0

    .line 134
    :sswitch_8
    const-string v2, "letv"

    .line 135
    .line 136
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-nez v0, :cond_8

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_8
    const/4 v4, 0x5

    .line 144
    goto :goto_0

    .line 145
    :sswitch_9
    const-string v2, "asus"

    .line 146
    .line 147
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-nez v0, :cond_9

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_9
    const/4 v4, 0x4

    .line 155
    goto :goto_0

    .line 156
    :sswitch_a
    const-string v2, "htc"

    .line 157
    .line 158
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-nez v0, :cond_a

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_a
    const/4 v4, 0x3

    .line 166
    goto :goto_0

    .line 167
    :sswitch_b
    const-string v2, "xiaomi"

    .line 168
    .line 169
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-nez v0, :cond_b

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_b
    const/4 v4, 0x2

    .line 177
    goto :goto_0

    .line 178
    :sswitch_c
    const-string v2, "huawei"

    .line 179
    .line 180
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-nez v0, :cond_c

    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_c
    const/4 v4, 0x1

    .line 188
    goto :goto_0

    .line 189
    :sswitch_d
    const-string v2, "oneplus"

    .line 190
    .line 191
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-nez v0, :cond_d

    .line 196
    .line 197
    goto :goto_0

    .line 198
    :cond_d
    move v4, v3

    .line 199
    :goto_0
    packed-switch v4, :pswitch_data_0

    .line 200
    .line 201
    .line 202
    goto/16 :goto_1

    .line 203
    .line 204
    :pswitch_0
    const-string v0, "com.samsung.android.lool"

    .line 205
    .line 206
    const-string v1, "com.samsung.android.sm.ui.battery.BatteryActivity"

    .line 207
    .line 208
    invoke-static {v0, v1}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    const-string v1, "com.samsung.android.sm"

    .line 213
    .line 214
    const-string v2, "com.samsung.android.sm.ui.battery.BatteryActivity"

    .line 215
    .line 216
    invoke-static {v1, v2}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    const-string v2, "com.samsung.android.lool"

    .line 221
    .line 222
    const-string v4, "com.samsung.android.sm.battery.ui.BatteryActivity"

    .line 223
    .line 224
    invoke-static {v2, v4}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    filled-new-array {v0, v1, v2}, [Landroid/content/Intent;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    goto/16 :goto_1

    .line 237
    .line 238
    :pswitch_1
    const-string v0, "com.evenwell.powersaving.g3"

    .line 239
    .line 240
    const-string v1, "com.evenwell.powersaving.g3.exception.PowerSaverExceptionActivity"

    .line 241
    .line 242
    invoke-static {v0, v1}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    filled-new-array {v0}, [Landroid/content/Intent;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    goto/16 :goto_1

    .line 255
    .line 256
    :pswitch_2
    const-string v0, "com.meizu.safe"

    .line 257
    .line 258
    const-string v1, "com.meizu.safe.security.SHOW_APPSEC"

    .line 259
    .line 260
    invoke-static {v0, v1}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    const-string v1, "android.intent.category.DEFAULT"

    .line 265
    .line 266
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    filled-new-array {v0}, [Landroid/content/Intent;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    goto/16 :goto_1

    .line 279
    .line 280
    :pswitch_3
    const-string v0, "com.huawei.systemmanager"

    .line 281
    .line 282
    const-string v1, "com.huawei.systemmanager.optimize.process.ProtectActivity"

    .line 283
    .line 284
    invoke-static {v0, v1}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    filled-new-array {v0}, [Landroid/content/Intent;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    goto/16 :goto_1

    .line 297
    .line 298
    :pswitch_4
    const-string v0, "com.iqoo.secure"

    .line 299
    .line 300
    const-string v1, "com.iqoo.secure.ui.phoneoptimize.AddWhiteListActivity"

    .line 301
    .line 302
    invoke-static {v0, v1}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    const-string v1, "com.vivo.permissionmanager"

    .line 307
    .line 308
    const-string v2, "com.vivo.permissionmanager.activity.BgStartUpManagerActivity"

    .line 309
    .line 310
    invoke-static {v1, v2}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    const-string v2, "com.iqoo.secure"

    .line 315
    .line 316
    const-string v4, "com.iqoo.secure.ui.phoneoptimize.BgStartUpManager"

    .line 317
    .line 318
    invoke-static {v2, v4}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    filled-new-array {v0, v1, v2}, [Landroid/content/Intent;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    goto/16 :goto_1

    .line 331
    .line 332
    :pswitch_5
    const-string v0, "com.coloros.safecenter"

    .line 333
    .line 334
    const-string v1, "com.coloros.safecenter.permission.startup.StartupAppListActivity"

    .line 335
    .line 336
    invoke-static {v0, v1}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    const-string v0, "com.oppo.safe"

    .line 341
    .line 342
    const-string v1, "com.oppo.safe.permission.startup.StartupAppListActivity"

    .line 343
    .line 344
    invoke-static {v0, v1}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 345
    .line 346
    .line 347
    move-result-object v5

    .line 348
    const-string v0, "com.coloros.safecenter"

    .line 349
    .line 350
    const-string v1, "com.coloros.safecenter.startupapp.StartupAppListActivity"

    .line 351
    .line 352
    invoke-static {v0, v1}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    const-string v1, "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"

    .line 357
    .line 358
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 359
    .line 360
    .line 361
    move-result-object v6

    .line 362
    const-string v0, "com.coloros.oppoguardelf"

    .line 363
    .line 364
    const-string v1, "com.coloros.powermanager.fuelgaue.PowerUsageModelActivity"

    .line 365
    .line 366
    invoke-static {v0, v1}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 367
    .line 368
    .line 369
    move-result-object v7

    .line 370
    const-string v0, "com.coloros.oppoguardelf"

    .line 371
    .line 372
    const-string v1, "com.coloros.powermanager.fuelgaue.PowerSaverModeActivity"

    .line 373
    .line 374
    invoke-static {v0, v1}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 375
    .line 376
    .line 377
    move-result-object v8

    .line 378
    const-string v0, "com.coloros.oppoguardelf"

    .line 379
    .line 380
    const-string v1, "com.coloros.powermanager.fuelgaue.PowerConsumptionActivity"

    .line 381
    .line 382
    invoke-static {v0, v1}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 383
    .line 384
    .line 385
    move-result-object v9

    .line 386
    filled-new-array/range {v4 .. v9}, [Landroid/content/Intent;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    goto/16 :goto_1

    .line 395
    .line 396
    :pswitch_6
    const-string v0, "com.letv.android.letvsafe"

    .line 397
    .line 398
    const-string v1, "com.letv.android.letvsafe.AutobootManageActivity"

    .line 399
    .line 400
    invoke-static {v0, v1}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    const-string v1, "mobilemanager://function/entry/AutoStart"

    .line 405
    .line 406
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    filled-new-array {v0}, [Landroid/content/Intent;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    goto/16 :goto_1

    .line 423
    .line 424
    :pswitch_7
    const-string v0, "com.asus.mobilemanager"

    .line 425
    .line 426
    const-string v1, "com.asus.mobilemanager.powersaver.PowerSaverSettings"

    .line 427
    .line 428
    invoke-static {v0, v1}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    const-string v1, "com.asus.mobilemanager"

    .line 433
    .line 434
    const-string v2, "com.asus.mobilemanager.autostart.AutoStartActivity"

    .line 435
    .line 436
    invoke-static {v1, v2}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    const-string v2, "com.asus.mobilemanager"

    .line 441
    .line 442
    const-string v4, "com.asus.mobilemanager.entry.FunctionActivity"

    .line 443
    .line 444
    invoke-static {v2, v4}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    const-string v4, "mobilemanager://function/entry/AutoStart"

    .line 449
    .line 450
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 451
    .line 452
    .line 453
    move-result-object v4

    .line 454
    invoke-virtual {v2, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    filled-new-array {v0, v1, v2}, [Landroid/content/Intent;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    goto :goto_1

    .line 467
    :pswitch_8
    const-string v0, "com.htc.pitroad"

    .line 468
    .line 469
    const-string v1, "com.htc.pitroad.landingpage.activity.LandingPageActivity"

    .line 470
    .line 471
    invoke-static {v0, v1}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    filled-new-array {v0}, [Landroid/content/Intent;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    goto :goto_1

    .line 484
    :pswitch_9
    const-string v0, "com.miui.securitycenter"

    .line 485
    .line 486
    const-string v1, "com.miui.permcenter.autostart.AutoStartManagementActivity"

    .line 487
    .line 488
    invoke-static {v0, v1}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    filled-new-array {v0}, [Landroid/content/Intent;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    goto :goto_1

    .line 501
    :pswitch_a
    const-string v0, "com.huawei.systemmanager"

    .line 502
    .line 503
    const-string v1, "com.huawei.systemmanager.optimize.process.ProtectActivity"

    .line 504
    .line 505
    invoke-static {v0, v1}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    const-string v1, "com.huawei.systemmanager"

    .line 510
    .line 511
    const-string v2, "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity"

    .line 512
    .line 513
    invoke-static {v1, v2}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    const-string v2, "com.huawei.systemmanager"

    .line 518
    .line 519
    const-string v4, "com.huawei.systemmanager.appcontrol.activity.StartupAppControlActivity"

    .line 520
    .line 521
    invoke-static {v2, v4}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    filled-new-array {v0, v1, v2}, [Landroid/content/Intent;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    goto :goto_1

    .line 534
    :pswitch_b
    const-string v0, "com.oneplus.security"

    .line 535
    .line 536
    const-string v1, "com.oneplus.security.chainlaunch.view.ChainLaunchAppListActivity"

    .line 537
    .line 538
    invoke-static {v0, v1}, Lcg/r;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    filled-new-array {v0}, [Landroid/content/Intent;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 551
    .line 552
    .line 553
    move-result v0

    .line 554
    if-ge v3, v0, :cond_f

    .line 555
    .line 556
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    check-cast v0, Landroid/content/Intent;

    .line 561
    .line 562
    invoke-static {p0, v0}, Lcg/k;->d(Landroid/content/Context;Landroid/content/Intent;)Z

    .line 563
    .line 564
    .line 565
    move-result v2

    .line 566
    if-eqz v2, :cond_e

    .line 567
    .line 568
    const-class v2, Lcg/r;

    .line 569
    .line 570
    monitor-enter v2

    .line 571
    :try_start_0
    sput-object v0, Lcg/r;->a:Landroid/content/Intent;

    .line 572
    .line 573
    monitor-exit v2

    .line 574
    return-object v0

    .line 575
    :catchall_0
    move-exception v0

    .line 576
    move-object p0, v0

    .line 577
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 578
    throw p0

    .line 579
    :cond_e
    add-int/lit8 v3, v3, 0x1

    .line 580
    .line 581
    goto :goto_1

    .line 582
    :cond_f
    const/4 p0, 0x0

    .line 583
    return-object p0

    .line 584
    nop

    .line 585
    :sswitch_data_0
    .sparse-switch
        -0x4eb36700 -> :sswitch_d
        -0x47e95e19 -> :sswitch_c
        -0x2d450b45 -> :sswitch_b
        0x194d7 -> :sswitch_a
        0x2dd650 -> :sswitch_9
        0x32a1bb -> :sswitch_8
        0x3427a0 -> :sswitch_7
        0x373cac -> :sswitch_6
        0x5edac6a -> :sswitch_5
        0x62f84cc -> :sswitch_4
        0x6422d62 -> :sswitch_3
        0x675e5ed -> :sswitch_2
        0x3898f087 -> :sswitch_1
        0x6f28bffa -> :sswitch_0
    .end sparse-switch

    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_9
        :pswitch_5
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/content/ComponentName;

    .line 7
    .line 8
    invoke-direct {v1, p0, p1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
