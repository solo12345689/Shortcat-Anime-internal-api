.class public final Lib/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LUb/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lib/d$a;
    }
.end annotation


# static fields
.field public static final Companion:Lib/d$a;

.field private static final a:Ljava/util/List;

.field private static final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 46

    .line 1
    new-instance v0, Lib/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lib/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lib/d;->Companion:Lib/d$a;

    .line 8
    .line 9
    new-instance v0, Lexpo/modules/logbox/ExpoLogBoxPackage;

    .line 10
    .line 11
    invoke-direct {v0}, Lexpo/modules/logbox/ExpoLogBoxPackage;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lexpo/modules/linking/ExpoLinkingPackage;

    .line 15
    .line 16
    invoke-direct {v2}, Lexpo/modules/linking/ExpoLinkingPackage;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v3, Lexpo/modules/localization/LocalizationPackage;

    .line 20
    .line 21
    invoke-direct {v3}, Lexpo/modules/localization/LocalizationPackage;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance v4, Lexpo/modules/adapters/react/ReactAdapterPackage;

    .line 25
    .line 26
    invoke-direct {v4}, Lexpo/modules/adapters/react/ReactAdapterPackage;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v5, Lexpo/modules/core/BasePackage;

    .line 30
    .line 31
    invoke-direct {v5}, Lexpo/modules/core/BasePackage;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v6, Lexpo/modules/kotlin/edgeToEdge/EdgeToEdgePackage;

    .line 35
    .line 36
    invoke-direct {v6}, Lexpo/modules/kotlin/edgeToEdge/EdgeToEdgePackage;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance v7, Lexpo/modules/notifications/NotificationsPackage;

    .line 40
    .line 41
    invoke-direct {v7}, Lexpo/modules/notifications/NotificationsPackage;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance v8, Lexpo/modules/systemui/SystemUIPackage;

    .line 45
    .line 46
    invoke-direct {v8}, Lexpo/modules/systemui/SystemUIPackage;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance v9, Lexpo/modules/updates/UpdatesPackage;

    .line 50
    .line 51
    invoke-direct {v9}, Lexpo/modules/updates/UpdatesPackage;-><init>()V

    .line 52
    .line 53
    .line 54
    new-instance v10, Lexpo/modules/webbrowser/WebBrowserPackage;

    .line 55
    .line 56
    invoke-direct {v10}, Lexpo/modules/webbrowser/WebBrowserPackage;-><init>()V

    .line 57
    .line 58
    .line 59
    const/16 v11, 0xa

    .line 60
    .line 61
    new-array v11, v11, [Lsb/g;

    .line 62
    .line 63
    const/4 v12, 0x0

    .line 64
    aput-object v0, v11, v12

    .line 65
    .line 66
    const/4 v0, 0x1

    .line 67
    aput-object v2, v11, v0

    .line 68
    .line 69
    const/4 v0, 0x2

    .line 70
    aput-object v3, v11, v0

    .line 71
    .line 72
    const/4 v0, 0x3

    .line 73
    aput-object v4, v11, v0

    .line 74
    .line 75
    const/4 v0, 0x4

    .line 76
    aput-object v5, v11, v0

    .line 77
    .line 78
    const/4 v0, 0x5

    .line 79
    aput-object v6, v11, v0

    .line 80
    .line 81
    const/4 v0, 0x6

    .line 82
    aput-object v7, v11, v0

    .line 83
    .line 84
    const/4 v0, 0x7

    .line 85
    aput-object v8, v11, v0

    .line 86
    .line 87
    const/16 v0, 0x8

    .line 88
    .line 89
    aput-object v9, v11, v0

    .line 90
    .line 91
    const/16 v0, 0x9

    .line 92
    .line 93
    aput-object v10, v11, v0

    .line 94
    .line 95
    invoke-static {v11}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    sput-object v0, Lib/d;->a:Ljava/util/List;

    .line 100
    .line 101
    const-class v0, LOd/e;

    .line 102
    .line 103
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    const-class v0, LBb/e;

    .line 108
    .line 109
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    const-class v0, Llb/a;

    .line 114
    .line 115
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    const-class v0, Lmb/b;

    .line 120
    .line 121
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    const-class v0, Lnb/l;

    .line 126
    .line 127
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    const-class v0, Lob/a;

    .line 132
    .line 133
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    const-class v0, Lexpo/modules/crypto/a;

    .line 138
    .line 139
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    const-class v0, Lxb/b;

    .line 144
    .line 145
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    const-class v0, Lzb/a;

    .line 150
    .line 151
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    const-class v0, LAb/c;

    .line 156
    .line 157
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    const-class v0, LCb/i;

    .line 162
    .line 163
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 164
    .line 165
    .line 166
    move-result-object v12

    .line 167
    const-class v0, LDb/k;

    .line 168
    .line 169
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 170
    .line 171
    .line 172
    move-result-object v13

    .line 173
    const-class v0, LFb/b;

    .line 174
    .line 175
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 176
    .line 177
    .line 178
    move-result-object v14

    .line 179
    const-class v0, LFb/c;

    .line 180
    .line 181
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 182
    .line 183
    .line 184
    move-result-object v15

    .line 185
    const-class v0, LGb/b;

    .line 186
    .line 187
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 188
    .line 189
    .line 190
    move-result-object v16

    .line 191
    const-class v0, LIb/g;

    .line 192
    .line 193
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 194
    .line 195
    .line 196
    move-result-object v17

    .line 197
    const-class v0, LTb/e;

    .line 198
    .line 199
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 200
    .line 201
    .line 202
    move-result-object v18

    .line 203
    const-class v0, Lxc/a;

    .line 204
    .line 205
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 206
    .line 207
    .line 208
    move-result-object v19

    .line 209
    const-class v0, Lyc/a;

    .line 210
    .line 211
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 212
    .line 213
    .line 214
    move-result-object v20

    .line 215
    const-class v0, Lzc/g;

    .line 216
    .line 217
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 218
    .line 219
    .line 220
    move-result-object v21

    .line 221
    const-class v0, LCc/b;

    .line 222
    .line 223
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 224
    .line 225
    .line 226
    move-result-object v22

    .line 227
    const-class v0, LEc/b;

    .line 228
    .line 229
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 230
    .line 231
    .line 232
    move-result-object v23

    .line 233
    const-class v0, Lexpo/modules/notifications/notifications/categories/a;

    .line 234
    .line 235
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 236
    .line 237
    .line 238
    move-result-object v24

    .line 239
    const-class v0, LHc/i;

    .line 240
    .line 241
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 242
    .line 243
    .line 244
    move-result-object v25

    .line 245
    const-class v0, LHc/l;

    .line 246
    .line 247
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 248
    .line 249
    .line 250
    move-result-object v26

    .line 251
    const-class v0, LLc/a;

    .line 252
    .line 253
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 254
    .line 255
    .line 256
    move-result-object v27

    .line 257
    const-class v0, LNc/a;

    .line 258
    .line 259
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 260
    .line 261
    .line 262
    move-result-object v28

    .line 263
    const-class v0, LVc/c;

    .line 264
    .line 265
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 266
    .line 267
    .line 268
    move-result-object v29

    .line 269
    const-class v0, LRc/c;

    .line 270
    .line 271
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 272
    .line 273
    .line 274
    move-result-object v30

    .line 275
    const-class v0, LTc/c;

    .line 276
    .line 277
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 278
    .line 279
    .line 280
    move-result-object v31

    .line 281
    const-class v0, LWc/e;

    .line 282
    .line 283
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 284
    .line 285
    .line 286
    move-result-object v32

    .line 287
    const-class v0, Lad/a;

    .line 288
    .line 289
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 290
    .line 291
    .line 292
    move-result-object v33

    .line 293
    const-class v0, Lcd/a;

    .line 294
    .line 295
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 296
    .line 297
    .line 298
    move-result-object v34

    .line 299
    const-class v0, LHc/e;

    .line 300
    .line 301
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 302
    .line 303
    .line 304
    move-result-object v35

    .line 305
    const-class v0, Ldd/a;

    .line 306
    .line 307
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 308
    .line 309
    .line 310
    move-result-object v36

    .line 311
    const-class v0, Led/i;

    .line 312
    .line 313
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 314
    .line 315
    .line 316
    move-result-object v37

    .line 317
    const-class v0, Lgd/f;

    .line 318
    .line 319
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 320
    .line 321
    .line 322
    move-result-object v38

    .line 323
    const-class v0, Lhd/e;

    .line 324
    .line 325
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 326
    .line 327
    .line 328
    move-result-object v39

    .line 329
    const-class v0, Ljd/b;

    .line 330
    .line 331
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 332
    .line 333
    .line 334
    move-result-object v40

    .line 335
    const-class v0, Lld/a;

    .line 336
    .line 337
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 338
    .line 339
    .line 340
    move-result-object v41

    .line 341
    const-class v0, Lexpo/modules/updates/UpdatesModule;

    .line 342
    .line 343
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 344
    .line 345
    .line 346
    move-result-object v42

    .line 347
    const-class v0, Lexpo/modules/video/a;

    .line 348
    .line 349
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 350
    .line 351
    .line 352
    move-result-object v43

    .line 353
    const-class v0, LNd/l;

    .line 354
    .line 355
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 356
    .line 357
    .line 358
    move-result-object v44

    .line 359
    const-class v0, Lmd/f;

    .line 360
    .line 361
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 362
    .line 363
    .line 364
    move-result-object v45

    .line 365
    filled-new-array/range {v2 .. v45}, [Lkotlin/Pair;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-static {v0}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    sput-object v0, Lib/d;->b:Ljava/util/Map;

    .line 374
    .line 375
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getModulesMap$cp()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lib/d;->b:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getPackagesList$cp()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lib/d;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getPackageList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lsb/g;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lib/d;->Companion:Lib/d$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lib/d$a;->a()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public getModulesMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lgc/c;",
            ">;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lib/d;->b:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public getServices()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Lexpo/modules/kotlin/services/Service;",
            ">;>;"
        }
    .end annotation

    .line 1
    const-class v0, Lexpo/modules/constants/ConstantsService;

    .line 2
    .line 3
    invoke-static {v0}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
