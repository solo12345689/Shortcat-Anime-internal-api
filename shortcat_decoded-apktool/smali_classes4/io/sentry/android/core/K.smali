.class abstract Lio/sentry/android/core/K;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static synthetic a(Lio/sentry/android/core/SentryAndroidOptions;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-static {p0}, Lio/sentry/android/core/cache/f;->W(Lio/sentry/z3;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static synthetic b(Lio/sentry/android/core/SentryAndroidOptions;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/sentry/z3;->getCacheDirPath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lio/sentry/android/core/K;->f(Landroid/content/Context;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static synthetic d(Lio/sentry/android/core/SentryAndroidOptions;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/sentry/z3;->getOutboxPath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lio/sentry/android/core/E0;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static f(Landroid/content/Context;)Ljava/io/File;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v1, "sentry"

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method private static g(Landroid/content/pm/PackageInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "@"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p0, "+"

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method static h(Lio/sentry/android/core/SentryAndroidOptions;Landroid/content/Context;Lio/sentry/android/core/g0;Lio/sentry/util/s;Lio/sentry/android/core/i;Z)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lio/sentry/z3;->getCacheDirPath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lio/sentry/z3;->getEnvelopeDiskCache()Lio/sentry/cache/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v0, v0, Lio/sentry/transport/r;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lio/sentry/android/core/cache/f;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Lio/sentry/android/core/cache/f;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lio/sentry/z3;->setEnvelopeDiskCache(Lio/sentry/cache/g;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Lio/sentry/z3;->getConnectionStatusProvider()Lio/sentry/M;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    instance-of v0, v0, Lio/sentry/I0;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    new-instance v0, Lio/sentry/android/core/internal/util/g;

    .line 32
    .line 33
    invoke-static {}, Lio/sentry/android/core/internal/util/h;->a()Lio/sentry/transport/o;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-direct {v0, p1, p0, p2, v1}, Lio/sentry/android/core/internal/util/g;-><init>(Landroid/content/Context;Lio/sentry/z3;Lio/sentry/android/core/g0;Lio/sentry/transport/o;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lio/sentry/z3;->setConnectionStatusProvider(Lio/sentry/M;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-virtual {p0}, Lio/sentry/z3;->getCacheDirPath()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    new-instance v0, Lio/sentry/cache/t;

    .line 50
    .line 51
    invoke-direct {v0, p0}, Lio/sentry/cache/t;-><init>(Lio/sentry/z3;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lio/sentry/z3;->addScopeObserver(Lio/sentry/Z;)V

    .line 55
    .line 56
    .line 57
    new-instance v0, Lio/sentry/cache/h;

    .line 58
    .line 59
    invoke-direct {v0, p0}, Lio/sentry/cache/h;-><init>(Lio/sentry/z3;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v0}, Lio/sentry/z3;->addOptionsObserver(Lio/sentry/T;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    new-instance v0, Lio/sentry/m;

    .line 66
    .line 67
    invoke-direct {v0, p0}, Lio/sentry/m;-><init>(Lio/sentry/z3;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0}, Lio/sentry/z3;->addEventProcessor(Lio/sentry/C;)V

    .line 71
    .line 72
    .line 73
    new-instance v0, Lio/sentry/android/core/u0;

    .line 74
    .line 75
    invoke-direct {v0, p1, p2, p0}, Lio/sentry/android/core/u0;-><init>(Landroid/content/Context;Lio/sentry/android/core/g0;Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v0}, Lio/sentry/z3;->addEventProcessor(Lio/sentry/C;)V

    .line 79
    .line 80
    .line 81
    new-instance v0, Lio/sentry/android/core/S0;

    .line 82
    .line 83
    invoke-direct {v0, p0, p4}, Lio/sentry/android/core/S0;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/i;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v0}, Lio/sentry/z3;->addEventProcessor(Lio/sentry/C;)V

    .line 87
    .line 88
    .line 89
    new-instance p4, Lio/sentry/android/core/ScreenshotEventProcessor;

    .line 90
    .line 91
    invoke-direct {p4, p0, p2}, Lio/sentry/android/core/ScreenshotEventProcessor;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/g0;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, p4}, Lio/sentry/z3;->addEventProcessor(Lio/sentry/C;)V

    .line 95
    .line 96
    .line 97
    new-instance p4, Lio/sentry/android/core/ViewHierarchyEventProcessor;

    .line 98
    .line 99
    invoke-direct {p4, p0}, Lio/sentry/android/core/ViewHierarchyEventProcessor;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p4}, Lio/sentry/z3;->addEventProcessor(Lio/sentry/C;)V

    .line 103
    .line 104
    .line 105
    new-instance p4, Lio/sentry/android/core/e0;

    .line 106
    .line 107
    invoke-direct {p4, p1, p0, p2}, Lio/sentry/android/core/e0;-><init>(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/g0;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, p4}, Lio/sentry/z3;->addEventProcessor(Lio/sentry/C;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Lio/sentry/z3;->getTransportGate()Lio/sentry/transport/q;

    .line 114
    .line 115
    .line 116
    move-result-object p4

    .line 117
    instance-of p4, p4, Lio/sentry/transport/t;

    .line 118
    .line 119
    if-eqz p4, :cond_3

    .line 120
    .line 121
    new-instance p4, Lio/sentry/android/core/Q;

    .line 122
    .line 123
    invoke-direct {p4, p0}, Lio/sentry/android/core/Q;-><init>(Lio/sentry/z3;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, p4}, Lio/sentry/z3;->setTransportGate(Lio/sentry/transport/q;)V

    .line 127
    .line 128
    .line 129
    :cond_3
    invoke-static {}, Lio/sentry/android/core/performance/h;->q()Lio/sentry/android/core/performance/h;

    .line 130
    .line 131
    .line 132
    move-result-object p4

    .line 133
    invoke-virtual {p0}, Lio/sentry/z3;->getModulesLoader()Lio/sentry/internal/modules/b;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    instance-of v0, v0, Lio/sentry/internal/modules/e;

    .line 138
    .line 139
    if-eqz v0, :cond_4

    .line 140
    .line 141
    new-instance v0, Lio/sentry/android/core/internal/modules/b;

    .line 142
    .line 143
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-direct {v0, p1, v1}, Lio/sentry/android/core/internal/modules/b;-><init>(Landroid/content/Context;Lio/sentry/ILogger;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v0}, Lio/sentry/z3;->setModulesLoader(Lio/sentry/internal/modules/b;)V

    .line 151
    .line 152
    .line 153
    :cond_4
    invoke-virtual {p0}, Lio/sentry/z3;->getDebugMetaLoader()Lio/sentry/internal/debugmeta/a;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    instance-of v0, v0, Lio/sentry/internal/debugmeta/b;

    .line 158
    .line 159
    if-eqz v0, :cond_5

    .line 160
    .line 161
    new-instance v0, Lio/sentry/android/core/internal/debugmeta/a;

    .line 162
    .line 163
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-direct {v0, p1, v1}, Lio/sentry/android/core/internal/debugmeta/a;-><init>(Landroid/content/Context;Lio/sentry/ILogger;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0, v0}, Lio/sentry/z3;->setDebugMetaLoader(Lio/sentry/internal/debugmeta/a;)V

    .line 171
    .line 172
    .line 173
    :cond_5
    invoke-virtual {p0}, Lio/sentry/z3;->getVersionDetector()Lio/sentry/m0;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    instance-of v0, v0, Lio/sentry/i1;

    .line 178
    .line 179
    if-eqz v0, :cond_6

    .line 180
    .line 181
    new-instance v0, Lio/sentry/q;

    .line 182
    .line 183
    invoke-direct {v0, p0}, Lio/sentry/q;-><init>(Lio/sentry/z3;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0, v0}, Lio/sentry/z3;->setVersionDetector(Lio/sentry/m0;)V

    .line 187
    .line 188
    .line 189
    :cond_6
    const-string v0, "androidx.core.view.ScrollingView"

    .line 190
    .line 191
    invoke-virtual {p3, v0, p0}, Lio/sentry/util/s;->f(Ljava/lang/String;Lio/sentry/z3;)Lio/sentry/util/p;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    const-string v1, "androidx.compose.ui.node.Owner"

    .line 196
    .line 197
    invoke-virtual {p3, v1, p0}, Lio/sentry/util/s;->d(Ljava/lang/String;Lio/sentry/z3;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    invoke-virtual {p0}, Lio/sentry/z3;->getGestureTargetLocators()Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    if-eqz v2, :cond_8

    .line 210
    .line 211
    new-instance v2, Ljava/util/ArrayList;

    .line 212
    .line 213
    const/4 v3, 0x2

    .line 214
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 215
    .line 216
    .line 217
    new-instance v3, Lio/sentry/android/core/internal/gestures/a;

    .line 218
    .line 219
    invoke-direct {v3, v0}, Lio/sentry/android/core/internal/gestures/a;-><init>(Lio/sentry/util/p;)V

    .line 220
    .line 221
    .line 222
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    if-eqz v1, :cond_7

    .line 226
    .line 227
    const-string v0, "io.sentry.compose.gestures.ComposeGestureTargetLocator"

    .line 228
    .line 229
    invoke-virtual {p3, v0, p0}, Lio/sentry/util/s;->d(Ljava/lang/String;Lio/sentry/z3;)Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_7

    .line 234
    .line 235
    new-instance v0, Lio/sentry/compose/gestures/ComposeGestureTargetLocator;

    .line 236
    .line 237
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    invoke-direct {v0, v3}, Lio/sentry/compose/gestures/ComposeGestureTargetLocator;-><init>(Lio/sentry/ILogger;)V

    .line 242
    .line 243
    .line 244
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    :cond_7
    invoke-virtual {p0, v2}, Lio/sentry/z3;->setGestureTargetLocators(Ljava/util/List;)V

    .line 248
    .line 249
    .line 250
    :cond_8
    invoke-virtual {p0}, Lio/sentry/z3;->getViewHierarchyExporters()Ljava/util/List;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-eqz v0, :cond_9

    .line 259
    .line 260
    if-eqz v1, :cond_9

    .line 261
    .line 262
    const-string v0, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter"

    .line 263
    .line 264
    invoke-virtual {p3, v0, p0}, Lio/sentry/util/s;->d(Ljava/lang/String;Lio/sentry/z3;)Z

    .line 265
    .line 266
    .line 267
    move-result p3

    .line 268
    if-eqz p3, :cond_9

    .line 269
    .line 270
    new-instance p3, Ljava/util/ArrayList;

    .line 271
    .line 272
    const/4 v0, 0x1

    .line 273
    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 274
    .line 275
    .line 276
    new-instance v0, Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;

    .line 277
    .line 278
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    invoke-direct {v0, v1}, Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;-><init>(Lio/sentry/ILogger;)V

    .line 283
    .line 284
    .line 285
    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    invoke-virtual {p0, p3}, Lio/sentry/z3;->setViewHierarchyExporters(Ljava/util/List;)V

    .line 289
    .line 290
    .line 291
    :cond_9
    invoke-virtual {p0}, Lio/sentry/z3;->getThreadChecker()Lio/sentry/util/thread/a;

    .line 292
    .line 293
    .line 294
    move-result-object p3

    .line 295
    instance-of p3, p3, Lio/sentry/util/thread/b;

    .line 296
    .line 297
    if-eqz p3, :cond_a

    .line 298
    .line 299
    invoke-static {}, Lio/sentry/android/core/internal/util/l;->e()Lio/sentry/android/core/internal/util/l;

    .line 300
    .line 301
    .line 302
    move-result-object p3

    .line 303
    invoke-virtual {p0, p3}, Lio/sentry/z3;->setThreadChecker(Lio/sentry/util/thread/a;)V

    .line 304
    .line 305
    .line 306
    :cond_a
    invoke-virtual {p0}, Lio/sentry/z3;->getSocketTagger()Lio/sentry/g0;

    .line 307
    .line 308
    .line 309
    move-result-object p3

    .line 310
    instance-of p3, p3, Lio/sentry/c1;

    .line 311
    .line 312
    if-eqz p3, :cond_b

    .line 313
    .line 314
    invoke-static {}, Lio/sentry/android/core/N;->c()Lio/sentry/android/core/N;

    .line 315
    .line 316
    .line 317
    move-result-object p3

    .line 318
    invoke-virtual {p0, p3}, Lio/sentry/z3;->setSocketTagger(Lio/sentry/g0;)V

    .line 319
    .line 320
    .line 321
    :cond_b
    invoke-virtual {p0}, Lio/sentry/z3;->getPerformanceCollectors()Ljava/util/List;

    .line 322
    .line 323
    .line 324
    move-result-object p3

    .line 325
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 326
    .line 327
    .line 328
    move-result p3

    .line 329
    if-eqz p3, :cond_c

    .line 330
    .line 331
    new-instance p3, Lio/sentry/android/core/C;

    .line 332
    .line 333
    invoke-direct {p3}, Lio/sentry/android/core/C;-><init>()V

    .line 334
    .line 335
    .line 336
    invoke-virtual {p0, p3}, Lio/sentry/z3;->addPerformanceCollector(Lio/sentry/U;)V

    .line 337
    .line 338
    .line 339
    new-instance p3, Lio/sentry/android/core/w;

    .line 340
    .line 341
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-direct {p3, v0}, Lio/sentry/android/core/w;-><init>(Lio/sentry/ILogger;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {p0, p3}, Lio/sentry/z3;->addPerformanceCollector(Lio/sentry/U;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {p0}, Lio/sentry/android/core/SentryAndroidOptions;->isEnablePerformanceV2()Z

    .line 352
    .line 353
    .line 354
    move-result p3

    .line 355
    if-eqz p3, :cond_c

    .line 356
    .line 357
    new-instance p3, Lio/sentry/android/core/d1;

    .line 358
    .line 359
    invoke-virtual {p0}, Lio/sentry/android/core/SentryAndroidOptions;->getFrameMetricsCollector()Lio/sentry/android/core/internal/util/G;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    const-string v1, "options.getFrameMetricsCollector is required"

    .line 364
    .line 365
    invoke-static {v0, v1}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    check-cast v0, Lio/sentry/android/core/internal/util/G;

    .line 370
    .line 371
    invoke-direct {p3, p0, v0}, Lio/sentry/android/core/d1;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/internal/util/G;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {p0, p3}, Lio/sentry/z3;->addPerformanceCollector(Lio/sentry/U;)V

    .line 375
    .line 376
    .line 377
    :cond_c
    invoke-virtual {p0}, Lio/sentry/z3;->getCompositePerformanceCollector()Lio/sentry/i;

    .line 378
    .line 379
    .line 380
    move-result-object p3

    .line 381
    instance-of p3, p3, Lio/sentry/H0;

    .line 382
    .line 383
    if-eqz p3, :cond_d

    .line 384
    .line 385
    new-instance p3, Lio/sentry/n;

    .line 386
    .line 387
    invoke-direct {p3, p0}, Lio/sentry/n;-><init>(Lio/sentry/z3;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {p0, p3}, Lio/sentry/z3;->setCompositePerformanceCollector(Lio/sentry/i;)V

    .line 391
    .line 392
    .line 393
    :cond_d
    if-eqz p5, :cond_e

    .line 394
    .line 395
    invoke-virtual {p0}, Lio/sentry/z3;->getReplayController()Lio/sentry/z1;

    .line 396
    .line 397
    .line 398
    move-result-object p3

    .line 399
    invoke-interface {p3}, Lio/sentry/z1;->q()Lio/sentry/y1;

    .line 400
    .line 401
    .line 402
    move-result-object p3

    .line 403
    instance-of p3, p3, Lio/sentry/P0;

    .line 404
    .line 405
    if-eqz p3, :cond_e

    .line 406
    .line 407
    invoke-virtual {p0}, Lio/sentry/z3;->getReplayController()Lio/sentry/z1;

    .line 408
    .line 409
    .line 410
    move-result-object p3

    .line 411
    new-instance p5, Lio/sentry/android/replay/a;

    .line 412
    .line 413
    invoke-direct {p5, p0}, Lio/sentry/android/replay/a;-><init>(Lio/sentry/z3;)V

    .line 414
    .line 415
    .line 416
    invoke-interface {p3, p5}, Lio/sentry/z1;->k(Lio/sentry/y1;)V

    .line 417
    .line 418
    .line 419
    :cond_e
    sget-object p3, Lio/sentry/android/core/performance/h;->q:Lio/sentry/util/a;

    .line 420
    .line 421
    invoke-virtual {p3}, Lio/sentry/util/a;->a()Lio/sentry/e0;

    .line 422
    .line 423
    .line 424
    move-result-object p3

    .line 425
    :try_start_0
    invoke-virtual {p4}, Lio/sentry/android/core/performance/h;->j()Lio/sentry/k0;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    invoke-virtual {p4}, Lio/sentry/android/core/performance/h;->i()Lio/sentry/N;

    .line 430
    .line 431
    .line 432
    move-result-object v4

    .line 433
    const/4 p5, 0x0

    .line 434
    invoke-virtual {p4, p5}, Lio/sentry/android/core/performance/h;->x(Lio/sentry/k0;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {p4, p5}, Lio/sentry/android/core/performance/h;->w(Lio/sentry/N;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 438
    .line 439
    .line 440
    if-eqz p3, :cond_f

    .line 441
    .line 442
    invoke-interface {p3}, Lio/sentry/e0;->close()V

    .line 443
    .line 444
    .line 445
    :cond_f
    invoke-virtual {p0}, Lio/sentry/z3;->getCompositePerformanceCollector()Lio/sentry/i;

    .line 446
    .line 447
    .line 448
    move-result-object v5

    .line 449
    move-object v0, p0

    .line 450
    move-object v1, p1

    .line 451
    move-object v2, p2

    .line 452
    invoke-static/range {v0 .. v5}, Lio/sentry/android/core/K;->l(Lio/sentry/android/core/SentryAndroidOptions;Landroid/content/Context;Lio/sentry/android/core/g0;Lio/sentry/k0;Lio/sentry/N;Lio/sentry/i;)V

    .line 453
    .line 454
    .line 455
    return-void

    .line 456
    :catchall_0
    move-exception v0

    .line 457
    move-object p0, v0

    .line 458
    if-eqz p3, :cond_10

    .line 459
    .line 460
    :try_start_1
    invoke-interface {p3}, Lio/sentry/e0;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 461
    .line 462
    .line 463
    goto :goto_0

    .line 464
    :catchall_1
    move-exception v0

    .line 465
    move-object p1, v0

    .line 466
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 467
    .line 468
    .line 469
    :cond_10
    :goto_0
    throw p0
.end method

.method static i(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/g0;Lio/sentry/util/s;Lio/sentry/android/core/i;ZZZZ)V
    .locals 4

    .line 1
    new-instance v0, Lio/sentry/util/p;

    .line 2
    .line 3
    new-instance v1, Lio/sentry/android/core/G;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Lio/sentry/android/core/G;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lio/sentry/util/p;-><init>(Lio/sentry/util/p$a;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lio/sentry/android/core/SendCachedEnvelopeIntegration;

    .line 12
    .line 13
    new-instance v2, Lio/sentry/X1;

    .line 14
    .line 15
    new-instance v3, Lio/sentry/android/core/H;

    .line 16
    .line 17
    invoke-direct {v3, p1}, Lio/sentry/android/core/H;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v2, v3}, Lio/sentry/X1;-><init>(Lio/sentry/U1;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, v2, v0}, Lio/sentry/android/core/SendCachedEnvelopeIntegration;-><init>(Lio/sentry/W1;Lio/sentry/util/p;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v1}, Lio/sentry/z3;->addIntegration(Lio/sentry/p0;)V

    .line 27
    .line 28
    .line 29
    const-string v1, "io.sentry.android.ndk.SentryNdk"

    .line 30
    .line 31
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {p3, v1, v2}, Lio/sentry/util/s;->g(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-instance v2, Lio/sentry/android/core/NdkIntegration;

    .line 40
    .line 41
    invoke-direct {v2, v1}, Lio/sentry/android/core/NdkIntegration;-><init>(Ljava/lang/Class;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v2}, Lio/sentry/z3;->addIntegration(Lio/sentry/p0;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Lio/sentry/android/core/g0;->d()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    const/16 v2, 0x1f

    .line 52
    .line 53
    if-lt v1, v2, :cond_0

    .line 54
    .line 55
    new-instance v1, Lio/sentry/android/core/TombstoneIntegration;

    .line 56
    .line 57
    invoke-direct {v1, p0}, Lio/sentry/android/core/TombstoneIntegration;-><init>(Landroid/content/Context;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v1}, Lio/sentry/z3;->addIntegration(Lio/sentry/p0;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    invoke-static {}, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->b()Lio/sentry/android/core/EnvelopeFileObserverIntegration;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {p1, v1}, Lio/sentry/z3;->addIntegration(Lio/sentry/p0;)V

    .line 68
    .line 69
    .line 70
    new-instance v1, Lio/sentry/android/core/SendCachedEnvelopeIntegration;

    .line 71
    .line 72
    new-instance v2, Lio/sentry/Y1;

    .line 73
    .line 74
    new-instance v3, Lio/sentry/android/core/I;

    .line 75
    .line 76
    invoke-direct {v3, p1}, Lio/sentry/android/core/I;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 77
    .line 78
    .line 79
    invoke-direct {v2, v3}, Lio/sentry/Y1;-><init>(Lio/sentry/U1;)V

    .line 80
    .line 81
    .line 82
    invoke-direct {v1, v2, v0}, Lio/sentry/android/core/SendCachedEnvelopeIntegration;-><init>(Lio/sentry/W1;Lio/sentry/util/p;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v1}, Lio/sentry/z3;->addIntegration(Lio/sentry/p0;)V

    .line 86
    .line 87
    .line 88
    new-instance v0, Lio/sentry/android/core/AppLifecycleIntegration;

    .line 89
    .line 90
    invoke-direct {v0}, Lio/sentry/android/core/AppLifecycleIntegration;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v0}, Lio/sentry/z3;->addIntegration(Lio/sentry/p0;)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0, p2}, Lio/sentry/android/core/U;->a(Landroid/content/Context;Lio/sentry/android/core/g0;)Lio/sentry/p0;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {p1, v0}, Lio/sentry/z3;->addIntegration(Lio/sentry/p0;)V

    .line 101
    .line 102
    .line 103
    instance-of v0, p0, Landroid/app/Application;

    .line 104
    .line 105
    if-eqz v0, :cond_1

    .line 106
    .line 107
    new-instance v0, Lio/sentry/android/core/ActivityLifecycleIntegration;

    .line 108
    .line 109
    move-object v1, p0

    .line 110
    check-cast v1, Landroid/app/Application;

    .line 111
    .line 112
    invoke-direct {v0, v1, p2, p4}, Lio/sentry/android/core/ActivityLifecycleIntegration;-><init>(Landroid/app/Application;Lio/sentry/android/core/g0;Lio/sentry/android/core/i;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v0}, Lio/sentry/z3;->addIntegration(Lio/sentry/p0;)V

    .line 116
    .line 117
    .line 118
    new-instance p4, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;

    .line 119
    .line 120
    invoke-direct {p4, v1}, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;-><init>(Landroid/app/Application;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, p4}, Lio/sentry/z3;->addIntegration(Lio/sentry/p0;)V

    .line 124
    .line 125
    .line 126
    new-instance p4, Lio/sentry/android/core/UserInteractionIntegration;

    .line 127
    .line 128
    invoke-direct {p4, v1, p3}, Lio/sentry/android/core/UserInteractionIntegration;-><init>(Landroid/app/Application;Lio/sentry/util/s;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, p4}, Lio/sentry/z3;->addIntegration(Lio/sentry/p0;)V

    .line 132
    .line 133
    .line 134
    if-eqz p5, :cond_2

    .line 135
    .line 136
    new-instance p3, Lio/sentry/android/fragment/FragmentLifecycleIntegration;

    .line 137
    .line 138
    const/4 p4, 0x1

    .line 139
    invoke-direct {p3, v1, p4, p4}, Lio/sentry/android/fragment/FragmentLifecycleIntegration;-><init>(Landroid/app/Application;ZZ)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, p3}, Lio/sentry/z3;->addIntegration(Lio/sentry/p0;)V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_1
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 147
    .line 148
    .line 149
    move-result-object p3

    .line 150
    sget-object p4, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 151
    .line 152
    const/4 p5, 0x0

    .line 153
    new-array p5, p5, [Ljava/lang/Object;

    .line 154
    .line 155
    const-string v0, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed."

    .line 156
    .line 157
    invoke-interface {p3, p4, v0, p5}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_2
    :goto_0
    if-eqz p6, :cond_3

    .line 161
    .line 162
    new-instance p3, Lio/sentry/android/timber/SentryTimberIntegration;

    .line 163
    .line 164
    invoke-direct {p3}, Lio/sentry/android/timber/SentryTimberIntegration;-><init>()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, p3}, Lio/sentry/z3;->addIntegration(Lio/sentry/p0;)V

    .line 168
    .line 169
    .line 170
    :cond_3
    new-instance p3, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;

    .line 171
    .line 172
    invoke-direct {p3, p0}, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;-><init>(Landroid/content/Context;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1, p3}, Lio/sentry/z3;->addIntegration(Lio/sentry/p0;)V

    .line 176
    .line 177
    .line 178
    new-instance p3, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;

    .line 179
    .line 180
    invoke-direct {p3, p0}, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;-><init>(Landroid/content/Context;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, p3}, Lio/sentry/z3;->addIntegration(Lio/sentry/p0;)V

    .line 184
    .line 185
    .line 186
    new-instance p3, Lio/sentry/android/core/NetworkBreadcrumbsIntegration;

    .line 187
    .line 188
    invoke-direct {p3, p0, p2}, Lio/sentry/android/core/NetworkBreadcrumbsIntegration;-><init>(Landroid/content/Context;Lio/sentry/android/core/g0;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, p3}, Lio/sentry/z3;->addIntegration(Lio/sentry/p0;)V

    .line 192
    .line 193
    .line 194
    if-eqz p7, :cond_4

    .line 195
    .line 196
    new-instance p2, Lio/sentry/android/replay/ReplayIntegration;

    .line 197
    .line 198
    invoke-static {}, Lio/sentry/transport/m;->a()Lio/sentry/transport/o;

    .line 199
    .line 200
    .line 201
    move-result-object p3

    .line 202
    invoke-direct {p2, p0, p3}, Lio/sentry/android/replay/ReplayIntegration;-><init>(Landroid/content/Context;Lio/sentry/transport/o;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1, p2}, Lio/sentry/z3;->addIntegration(Lio/sentry/p0;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1, p2}, Lio/sentry/z3;->setReplayController(Lio/sentry/z1;)V

    .line 209
    .line 210
    .line 211
    :cond_4
    if-eqz p8, :cond_5

    .line 212
    .line 213
    new-instance p2, Lio/sentry/android/distribution/DistributionIntegration;

    .line 214
    .line 215
    invoke-direct {p2, p0}, Lio/sentry/android/distribution/DistributionIntegration;-><init>(Landroid/content/Context;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1, p2}, Lio/sentry/z3;->setDistributionController(Lio/sentry/O;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1, p2}, Lio/sentry/z3;->addIntegration(Lio/sentry/p0;)V

    .line 222
    .line 223
    .line 224
    :cond_5
    invoke-virtual {p1}, Lio/sentry/z3;->getFeedbackOptions()Lio/sentry/a3;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    new-instance p1, Lio/sentry/android/core/SentryAndroidOptions$a;

    .line 229
    .line 230
    invoke-direct {p1}, Lio/sentry/android/core/SentryAndroidOptions$a;-><init>()V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0, p1}, Lio/sentry/a3;->g(Lio/sentry/a3$a;)V

    .line 234
    .line 235
    .line 236
    return-void
.end method

.method static j(Lio/sentry/android/core/SentryAndroidOptions;Landroid/content/Context;Lio/sentry/ILogger;Lio/sentry/android/core/g0;)V
    .locals 2

    .line 1
    const-string v0, "The context is required."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lio/sentry/android/core/p0;->g(Landroid/content/Context;)Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "The options object is required."

    .line 11
    .line 12
    invoke-static {p0, v0}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const-string v0, "The ILogger object is required."

    .line 16
    .line 17
    invoke-static {p2, v0}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p2}, Lio/sentry/z3;->setLogger(Lio/sentry/ILogger;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lio/sentry/android/core/y;

    .line 24
    .line 25
    invoke-direct {v0}, Lio/sentry/android/core/y;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lio/sentry/z3;->setFatalLogger(Lio/sentry/ILogger;)V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lio/sentry/I1;->CURRENT:Lio/sentry/I1;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lio/sentry/z3;->setDefaultScopeType(Lio/sentry/I1;)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lio/sentry/t3;->OFF:Lio/sentry/t3;

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lio/sentry/z3;->setOpenTelemetryMode(Lio/sentry/t3;)V

    .line 39
    .line 40
    .line 41
    new-instance v0, Lio/sentry/android/core/Z0;

    .line 42
    .line 43
    invoke-direct {v0}, Lio/sentry/android/core/Z0;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lio/sentry/z3;->setDateProvider(Lio/sentry/p2;)V

    .line 47
    .line 48
    .line 49
    new-instance v0, Lio/sentry/android/core/internal/util/j;

    .line 50
    .line 51
    invoke-direct {v0}, Lio/sentry/android/core/internal/util/j;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lio/sentry/z3;->setRuntimeManager(Lio/sentry/util/runtime/a;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lio/sentry/z3;->getLogs()Lio/sentry/z3$h;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v1, Lio/sentry/android/core/B;

    .line 62
    .line 63
    invoke-direct {v1}, Lio/sentry/android/core/B;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Lio/sentry/z3$h;->d(Lio/sentry/logger/d;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lio/sentry/z3;->getMetrics()Lio/sentry/z3$i;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    new-instance v1, Lio/sentry/android/core/E;

    .line 74
    .line 75
    invoke-direct {v1}, Lio/sentry/android/core/E;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Lio/sentry/z3$i;->d(Lio/sentry/metrics/d;)V

    .line 79
    .line 80
    .line 81
    const-wide/16 v0, 0xfa0

    .line 82
    .line 83
    invoke-virtual {p0, v0, v1}, Lio/sentry/z3;->setFlushTimeoutMillis(J)V

    .line 84
    .line 85
    .line 86
    new-instance v0, Lio/sentry/android/core/internal/util/G;

    .line 87
    .line 88
    invoke-direct {v0, p1, p2, p3}, Lio/sentry/android/core/internal/util/G;-><init>(Landroid/content/Context;Lio/sentry/ILogger;Lio/sentry/android/core/g0;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v0}, Lio/sentry/android/core/SentryAndroidOptions;->setFrameMetricsCollector(Lio/sentry/android/core/internal/util/G;)V

    .line 92
    .line 93
    .line 94
    invoke-static {p1, p0, p3}, Lio/sentry/android/core/O0;->a(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/g0;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Lio/sentry/z3;->getRuntimeManager()Lio/sentry/util/runtime/a;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    new-instance v0, Lio/sentry/android/core/F;

    .line 102
    .line 103
    invoke-direct {v0, p1}, Lio/sentry/android/core/F;-><init>(Landroid/content/Context;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {p2, v0}, Lio/sentry/util/runtime/a;->a(Lio/sentry/util/runtime/a$a;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    check-cast p2, Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {p0, p2}, Lio/sentry/z3;->setCacheDirPath(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-static {p0, p1, p3}, Lio/sentry/android/core/K;->k(Lio/sentry/android/core/SentryAndroidOptions;Landroid/content/Context;Lio/sentry/android/core/g0;)V

    .line 116
    .line 117
    .line 118
    invoke-static {}, Lio/sentry/android/core/c0;->l()Lio/sentry/android/core/c0;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p1, p0}, Lio/sentry/android/core/c0;->o(Lio/sentry/z3;)V

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method private static k(Lio/sentry/android/core/SentryAndroidOptions;Landroid/content/Context;Lio/sentry/android/core/g0;)V
    .locals 2

    .line 1
    invoke-static {p1, p2}, Lio/sentry/android/core/p0;->p(Landroid/content/Context;Lio/sentry/android/core/g0;)Landroid/content/pm/PackageInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lio/sentry/z3;->getRelease()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static {v0, p2}, Lio/sentry/android/core/p0;->q(Landroid/content/pm/PackageInfo;Lio/sentry/android/core/g0;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {v0, p2}, Lio/sentry/android/core/K;->g(Landroid/content/pm/PackageInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p0, p2}, Lio/sentry/z3;->setRelease(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p2, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 25
    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    const-string v0, "android."

    .line 29
    .line 30
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0, p2}, Lio/sentry/z3;->addInAppInclude(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, Lio/sentry/z3;->getDistinctId()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    if-nez p2, :cond_2

    .line 44
    .line 45
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/z3;->getRuntimeManager()Lio/sentry/util/runtime/a;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    new-instance v0, Lio/sentry/android/core/J;

    .line 50
    .line 51
    invoke-direct {v0, p1}, Lio/sentry/android/core/J;-><init>(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p2, v0}, Lio/sentry/util/runtime/a;->a(Lio/sentry/util/runtime/a$a;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {p0, p1}, Lio/sentry/z3;->setDistinctId(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :catch_0
    move-exception p1

    .line 65
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    sget-object p2, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 70
    .line 71
    const-string v0, "Could not generate distinct Id."

    .line 72
    .line 73
    invoke-interface {p0, p2, v0, p1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    return-void
.end method

.method private static l(Lio/sentry/android/core/SentryAndroidOptions;Landroid/content/Context;Lio/sentry/android/core/g0;Lio/sentry/k0;Lio/sentry/N;Lio/sentry/i;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lio/sentry/z3;->isProfilingEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "options.getFrameMetricsCollector is required"

    .line 6
    .line 7
    if-nez v0, :cond_4

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/sentry/z3;->getProfilesSampleRate()Ljava/lang/Double;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {}, Lio/sentry/g1;->c()Lio/sentry/g1;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1}, Lio/sentry/z3;->setTransactionProfiler(Lio/sentry/k0;)V

    .line 21
    .line 22
    .line 23
    if-eqz p3, :cond_1

    .line 24
    .line 25
    invoke-interface {p3}, Lio/sentry/k0;->close()V

    .line 26
    .line 27
    .line 28
    :cond_1
    if-eqz p4, :cond_3

    .line 29
    .line 30
    invoke-virtual {p0, p4}, Lio/sentry/z3;->setContinuousProfiler(Lio/sentry/N;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p4}, Lio/sentry/N;->f()Lio/sentry/protocol/x;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-interface {p4}, Lio/sentry/N;->isRunning()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    sget-object p1, Lio/sentry/protocol/x;->b:Lio/sentry/protocol/x;

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Lio/sentry/protocol/x;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    invoke-virtual {p0}, Lio/sentry/protocol/x;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-interface {p5, p0}, Lio/sentry/i;->f(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    return-void

    .line 59
    :cond_3
    new-instance v0, Lio/sentry/android/core/v;

    .line 60
    .line 61
    invoke-virtual {p0}, Lio/sentry/android/core/SentryAndroidOptions;->getFrameMetricsCollector()Lio/sentry/android/core/internal/util/G;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p1, v1}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    move-object v2, p1

    .line 70
    check-cast v2, Lio/sentry/android/core/internal/util/G;

    .line 71
    .line 72
    invoke-virtual {p0}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {p0}, Lio/sentry/z3;->getProfilingTracesDirPath()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {p0}, Lio/sentry/z3;->getProfilingTracesHz()I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    invoke-virtual {p0}, Lio/sentry/z3;->getExecutorService()Lio/sentry/d0;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    move-object v1, p2

    .line 89
    invoke-direct/range {v0 .. v6}, Lio/sentry/android/core/v;-><init>(Lio/sentry/android/core/g0;Lio/sentry/android/core/internal/util/G;Lio/sentry/ILogger;Ljava/lang/String;ILio/sentry/d0;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v0}, Lio/sentry/z3;->setContinuousProfiler(Lio/sentry/N;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_4
    :goto_0
    invoke-static {}, Lio/sentry/J0;->a()Lio/sentry/J0;

    .line 97
    .line 98
    .line 99
    move-result-object p5

    .line 100
    invoke-virtual {p0, p5}, Lio/sentry/z3;->setContinuousProfiler(Lio/sentry/N;)V

    .line 101
    .line 102
    .line 103
    if-eqz p4, :cond_5

    .line 104
    .line 105
    const/4 p5, 0x1

    .line 106
    invoke-interface {p4, p5}, Lio/sentry/N;->c(Z)V

    .line 107
    .line 108
    .line 109
    :cond_5
    if-eqz p3, :cond_6

    .line 110
    .line 111
    invoke-virtual {p0, p3}, Lio/sentry/z3;->setTransactionProfiler(Lio/sentry/k0;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_6
    new-instance p3, Lio/sentry/android/core/P;

    .line 116
    .line 117
    invoke-virtual {p0}, Lio/sentry/android/core/SentryAndroidOptions;->getFrameMetricsCollector()Lio/sentry/android/core/internal/util/G;

    .line 118
    .line 119
    .line 120
    move-result-object p4

    .line 121
    invoke-static {p4, v1}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p4

    .line 125
    check-cast p4, Lio/sentry/android/core/internal/util/G;

    .line 126
    .line 127
    invoke-direct {p3, p1, p0, p2, p4}, Lio/sentry/android/core/P;-><init>(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/g0;Lio/sentry/android/core/internal/util/G;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, p3}, Lio/sentry/z3;->setTransactionProfiler(Lio/sentry/k0;)V

    .line 131
    .line 132
    .line 133
    return-void
.end method
