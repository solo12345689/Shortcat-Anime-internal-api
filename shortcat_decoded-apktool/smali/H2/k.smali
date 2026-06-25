.class public final LH2/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LQ2/o$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH2/k$b;,
        LH2/k$a;
    }
.end annotation


# static fields
.field private static final A:Ljava/util/regex/Pattern;

.field private static final B:Ljava/util/regex/Pattern;

.field private static final C:Ljava/util/regex/Pattern;

.field private static final D:Ljava/util/regex/Pattern;

.field private static final E:Ljava/util/regex/Pattern;

.field private static final F:Ljava/util/regex/Pattern;

.field private static final G:Ljava/util/regex/Pattern;

.field private static final H:Ljava/util/regex/Pattern;

.field private static final I:Ljava/util/regex/Pattern;

.field private static final J:Ljava/util/regex/Pattern;

.field private static final K:Ljava/util/regex/Pattern;

.field private static final L:Ljava/util/regex/Pattern;

.field private static final M:Ljava/util/regex/Pattern;

.field private static final N:Ljava/util/regex/Pattern;

.field private static final O:Ljava/util/regex/Pattern;

.field private static final P:Ljava/util/regex/Pattern;

.field private static final Q:Ljava/util/regex/Pattern;

.field private static final R:Ljava/util/regex/Pattern;

.field private static final S:Ljava/util/regex/Pattern;

.field private static final T:Ljava/util/regex/Pattern;

.field private static final U:Ljava/util/regex/Pattern;

.field private static final V:Ljava/util/regex/Pattern;

.field private static final W:Ljava/util/regex/Pattern;

.field private static final X:Ljava/util/regex/Pattern;

.field private static final Y:Ljava/util/regex/Pattern;

.field private static final Z:Ljava/util/regex/Pattern;

.field private static final a0:Ljava/util/regex/Pattern;

.field private static final b0:Ljava/util/regex/Pattern;

.field private static final c:Ljava/util/regex/Pattern;

.field private static final c0:Ljava/util/regex/Pattern;

.field private static final d:Ljava/util/regex/Pattern;

.field private static final d0:Ljava/util/regex/Pattern;

.field private static final e:Ljava/util/regex/Pattern;

.field private static final e0:Ljava/util/regex/Pattern;

.field private static final f:Ljava/util/regex/Pattern;

.field private static final f0:Ljava/util/regex/Pattern;

.field private static final g:Ljava/util/regex/Pattern;

.field private static final g0:Ljava/util/regex/Pattern;

.field private static final h:Ljava/util/regex/Pattern;

.field private static final h0:Ljava/util/regex/Pattern;

.field private static final i:Ljava/util/regex/Pattern;

.field private static final i0:Ljava/util/regex/Pattern;

.field private static final j:Ljava/util/regex/Pattern;

.field private static final j0:Ljava/util/regex/Pattern;

.field private static final k:Ljava/util/regex/Pattern;

.field private static final k0:Ljava/util/regex/Pattern;

.field private static final l:Ljava/util/regex/Pattern;

.field private static final l0:Ljava/util/regex/Pattern;

.field private static final m:Ljava/util/regex/Pattern;

.field private static final m0:Ljava/util/regex/Pattern;

.field private static final n:Ljava/util/regex/Pattern;

.field private static final n0:Ljava/util/regex/Pattern;

.field private static final o:Ljava/util/regex/Pattern;

.field private static final o0:Ljava/util/regex/Pattern;

.field private static final p:Ljava/util/regex/Pattern;

.field private static final p0:Ljava/util/regex/Pattern;

.field private static final q:Ljava/util/regex/Pattern;

.field private static final q0:Ljava/util/regex/Pattern;

.field private static final r:Ljava/util/regex/Pattern;

.field private static final r0:Ljava/util/regex/Pattern;

.field private static final s:Ljava/util/regex/Pattern;

.field private static final s0:Ljava/util/regex/Pattern;

.field private static final t:Ljava/util/regex/Pattern;

.field private static final t0:Ljava/util/regex/Pattern;

.field private static final u:Ljava/util/regex/Pattern;

.field private static final u0:Ljava/util/regex/Pattern;

.field private static final v:Ljava/util/regex/Pattern;

.field private static final v0:Ljava/util/regex/Pattern;

.field private static final w:Ljava/util/regex/Pattern;

.field private static final x:Ljava/util/regex/Pattern;

.field private static final y:Ljava/util/regex/Pattern;

.field private static final z:Ljava/util/regex/Pattern;


# instance fields
.field private final a:LH2/i;

.field private final b:LH2/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "AVERAGE-BANDWIDTH=(\\d+)\\b"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LH2/k;->c:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "VIDEO=\"((?:.|\u000c)+?)\""

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, LH2/k;->d:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    const-string v0, "AUDIO=\"((?:.|\u000c)+?)\""

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, LH2/k;->e:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    const-string v0, "SUBTITLES=\"((?:.|\u000c)+?)\""

    .line 26
    .line 27
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, LH2/k;->f:Ljava/util/regex/Pattern;

    .line 32
    .line 33
    const-string v0, "CLOSED-CAPTIONS=\"((?:.|\u000c)+?)\""

    .line 34
    .line 35
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, LH2/k;->g:Ljava/util/regex/Pattern;

    .line 40
    .line 41
    const-string v0, "[^-]BANDWIDTH=(\\d+)\\b"

    .line 42
    .line 43
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, LH2/k;->h:Ljava/util/regex/Pattern;

    .line 48
    .line 49
    const-string v0, "CHANNELS=\"((?:.|\u000c)+?)\""

    .line 50
    .line 51
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, LH2/k;->i:Ljava/util/regex/Pattern;

    .line 56
    .line 57
    const-string v0, "VIDEO-RANGE=(SDR|PQ|HLG)"

    .line 58
    .line 59
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, LH2/k;->j:Ljava/util/regex/Pattern;

    .line 64
    .line 65
    const-string v0, "CODECS=\"((?:.|\u000c)+?)\""

    .line 66
    .line 67
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, LH2/k;->k:Ljava/util/regex/Pattern;

    .line 72
    .line 73
    const-string v0, "SUPPLEMENTAL-CODECS=\"((?:.|\u000c)+?)\""

    .line 74
    .line 75
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, LH2/k;->l:Ljava/util/regex/Pattern;

    .line 80
    .line 81
    const-string v0, "RESOLUTION=(\\d+x\\d+)"

    .line 82
    .line 83
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, LH2/k;->m:Ljava/util/regex/Pattern;

    .line 88
    .line 89
    const-string v0, "FRAME-RATE=([\\d\\.]+)\\b"

    .line 90
    .line 91
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sput-object v0, LH2/k;->n:Ljava/util/regex/Pattern;

    .line 96
    .line 97
    const-string v0, "#EXT-X-TARGETDURATION:(\\d+)\\b"

    .line 98
    .line 99
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sput-object v0, LH2/k;->o:Ljava/util/regex/Pattern;

    .line 104
    .line 105
    const-string v0, "DURATION=([\\d\\.]+)\\b"

    .line 106
    .line 107
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sput-object v0, LH2/k;->p:Ljava/util/regex/Pattern;

    .line 112
    .line 113
    const-string v0, "[:,]DURATION=([\\d\\.]+)\\b"

    .line 114
    .line 115
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sput-object v0, LH2/k;->q:Ljava/util/regex/Pattern;

    .line 120
    .line 121
    const-string v0, "PART-TARGET=([\\d\\.]+)\\b"

    .line 122
    .line 123
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    sput-object v0, LH2/k;->r:Ljava/util/regex/Pattern;

    .line 128
    .line 129
    const-string v0, "#EXT-X-VERSION:(\\d+)\\b"

    .line 130
    .line 131
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    sput-object v0, LH2/k;->s:Ljava/util/regex/Pattern;

    .line 136
    .line 137
    const-string v0, "#EXT-X-PLAYLIST-TYPE:(.+)\\b"

    .line 138
    .line 139
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    sput-object v0, LH2/k;->t:Ljava/util/regex/Pattern;

    .line 144
    .line 145
    const-string v0, "CAN-SKIP-UNTIL=([\\d\\.]+)\\b"

    .line 146
    .line 147
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    sput-object v0, LH2/k;->u:Ljava/util/regex/Pattern;

    .line 152
    .line 153
    const-string v0, "CAN-SKIP-DATERANGES"

    .line 154
    .line 155
    invoke-static {v0}, LH2/k;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    sput-object v0, LH2/k;->v:Ljava/util/regex/Pattern;

    .line 160
    .line 161
    const-string v0, "SKIPPED-SEGMENTS=(\\d+)\\b"

    .line 162
    .line 163
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    sput-object v0, LH2/k;->w:Ljava/util/regex/Pattern;

    .line 168
    .line 169
    const-string v0, "[:|,]HOLD-BACK=([\\d\\.]+)\\b"

    .line 170
    .line 171
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    sput-object v0, LH2/k;->x:Ljava/util/regex/Pattern;

    .line 176
    .line 177
    const-string v0, "PART-HOLD-BACK=([\\d\\.]+)\\b"

    .line 178
    .line 179
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    sput-object v0, LH2/k;->y:Ljava/util/regex/Pattern;

    .line 184
    .line 185
    const-string v0, "CAN-BLOCK-RELOAD"

    .line 186
    .line 187
    invoke-static {v0}, LH2/k;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    sput-object v0, LH2/k;->z:Ljava/util/regex/Pattern;

    .line 192
    .line 193
    const-string v0, "#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b"

    .line 194
    .line 195
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    sput-object v0, LH2/k;->A:Ljava/util/regex/Pattern;

    .line 200
    .line 201
    const-string v0, "#EXTINF:([\\d\\.]+)\\b"

    .line 202
    .line 203
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    sput-object v0, LH2/k;->B:Ljava/util/regex/Pattern;

    .line 208
    .line 209
    const-string v0, "#EXTINF:[\\d\\.]+\\b,(.+)"

    .line 210
    .line 211
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    sput-object v0, LH2/k;->C:Ljava/util/regex/Pattern;

    .line 216
    .line 217
    const-string v0, "LAST-MSN=(\\d+)\\b"

    .line 218
    .line 219
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    sput-object v0, LH2/k;->D:Ljava/util/regex/Pattern;

    .line 224
    .line 225
    const-string v0, "LAST-PART=(\\d+)\\b"

    .line 226
    .line 227
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    sput-object v0, LH2/k;->E:Ljava/util/regex/Pattern;

    .line 232
    .line 233
    const-string v0, "TIME-OFFSET=(-?[\\d\\.]+)\\b"

    .line 234
    .line 235
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    sput-object v0, LH2/k;->F:Ljava/util/regex/Pattern;

    .line 240
    .line 241
    const-string v0, "#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b"

    .line 242
    .line 243
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    sput-object v0, LH2/k;->G:Ljava/util/regex/Pattern;

    .line 248
    .line 249
    const-string v0, "BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\""

    .line 250
    .line 251
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    sput-object v0, LH2/k;->H:Ljava/util/regex/Pattern;

    .line 256
    .line 257
    const-string v0, "BYTERANGE-START=(\\d+)\\b"

    .line 258
    .line 259
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    sput-object v0, LH2/k;->I:Ljava/util/regex/Pattern;

    .line 264
    .line 265
    const-string v0, "BYTERANGE-LENGTH=(\\d+)\\b"

    .line 266
    .line 267
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    sput-object v0, LH2/k;->J:Ljava/util/regex/Pattern;

    .line 272
    .line 273
    const-string v0, "METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)"

    .line 274
    .line 275
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    sput-object v0, LH2/k;->K:Ljava/util/regex/Pattern;

    .line 280
    .line 281
    const-string v0, "KEYFORMAT=\"((?:.|\u000c)+?)\""

    .line 282
    .line 283
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    sput-object v0, LH2/k;->L:Ljava/util/regex/Pattern;

    .line 288
    .line 289
    const-string v0, "KEYFORMATVERSIONS=\"((?:.|\u000c)+?)\""

    .line 290
    .line 291
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    sput-object v0, LH2/k;->M:Ljava/util/regex/Pattern;

    .line 296
    .line 297
    const-string v0, "URI=\"((?:.|\u000c)+?)\""

    .line 298
    .line 299
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    sput-object v0, LH2/k;->N:Ljava/util/regex/Pattern;

    .line 304
    .line 305
    const-string v0, "IV=([^,.*]+)"

    .line 306
    .line 307
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    sput-object v0, LH2/k;->O:Ljava/util/regex/Pattern;

    .line 312
    .line 313
    const-string v0, "TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)"

    .line 314
    .line 315
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    sput-object v0, LH2/k;->P:Ljava/util/regex/Pattern;

    .line 320
    .line 321
    const-string v0, "TYPE=(PART|MAP)"

    .line 322
    .line 323
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    sput-object v0, LH2/k;->Q:Ljava/util/regex/Pattern;

    .line 328
    .line 329
    const-string v0, "LANGUAGE=\"((?:.|\u000c)+?)\""

    .line 330
    .line 331
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    sput-object v0, LH2/k;->R:Ljava/util/regex/Pattern;

    .line 336
    .line 337
    const-string v0, "NAME=\"((?:.|\u000c)+?)\""

    .line 338
    .line 339
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    sput-object v0, LH2/k;->S:Ljava/util/regex/Pattern;

    .line 344
    .line 345
    const-string v0, "GROUP-ID=\"((?:.|\u000c)+?)\""

    .line 346
    .line 347
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    sput-object v0, LH2/k;->T:Ljava/util/regex/Pattern;

    .line 352
    .line 353
    const-string v0, "CHARACTERISTICS=\"((?:.|\u000c)+?)\""

    .line 354
    .line 355
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    sput-object v0, LH2/k;->U:Ljava/util/regex/Pattern;

    .line 360
    .line 361
    const-string v0, "INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\""

    .line 362
    .line 363
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    sput-object v0, LH2/k;->V:Ljava/util/regex/Pattern;

    .line 368
    .line 369
    const-string v0, "AUTOSELECT"

    .line 370
    .line 371
    invoke-static {v0}, LH2/k;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    sput-object v0, LH2/k;->W:Ljava/util/regex/Pattern;

    .line 376
    .line 377
    const-string v0, "DEFAULT"

    .line 378
    .line 379
    invoke-static {v0}, LH2/k;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    sput-object v0, LH2/k;->X:Ljava/util/regex/Pattern;

    .line 384
    .line 385
    const-string v0, "FORCED"

    .line 386
    .line 387
    invoke-static {v0}, LH2/k;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    sput-object v0, LH2/k;->Y:Ljava/util/regex/Pattern;

    .line 392
    .line 393
    const-string v0, "INDEPENDENT"

    .line 394
    .line 395
    invoke-static {v0}, LH2/k;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    sput-object v0, LH2/k;->Z:Ljava/util/regex/Pattern;

    .line 400
    .line 401
    const-string v0, "GAP"

    .line 402
    .line 403
    invoke-static {v0}, LH2/k;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    sput-object v0, LH2/k;->a0:Ljava/util/regex/Pattern;

    .line 408
    .line 409
    const-string v0, "PRECISE"

    .line 410
    .line 411
    invoke-static {v0}, LH2/k;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    sput-object v0, LH2/k;->b0:Ljava/util/regex/Pattern;

    .line 416
    .line 417
    const-string v0, "VALUE=\"((?:.|\u000c)+?)\""

    .line 418
    .line 419
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    sput-object v0, LH2/k;->c0:Ljava/util/regex/Pattern;

    .line 424
    .line 425
    const-string v0, "IMPORT=\"((?:.|\u000c)+?)\""

    .line 426
    .line 427
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    sput-object v0, LH2/k;->d0:Ljava/util/regex/Pattern;

    .line 432
    .line 433
    const-string v0, "[:,]ID=\"((?:.|\u000c)+?)\""

    .line 434
    .line 435
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    sput-object v0, LH2/k;->e0:Ljava/util/regex/Pattern;

    .line 440
    .line 441
    const-string v0, "CLASS=\"((?:.|\u000c)+?)\""

    .line 442
    .line 443
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    sput-object v0, LH2/k;->f0:Ljava/util/regex/Pattern;

    .line 448
    .line 449
    const-string v0, "START-DATE=\"((?:.|\u000c)+?)\""

    .line 450
    .line 451
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    sput-object v0, LH2/k;->g0:Ljava/util/regex/Pattern;

    .line 456
    .line 457
    const-string v0, "CUE=\"((?:.|\u000c)+?)\""

    .line 458
    .line 459
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    sput-object v0, LH2/k;->h0:Ljava/util/regex/Pattern;

    .line 464
    .line 465
    const-string v0, "END-DATE=\"((?:.|\u000c)+?)\""

    .line 466
    .line 467
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    sput-object v0, LH2/k;->i0:Ljava/util/regex/Pattern;

    .line 472
    .line 473
    const-string v0, "PLANNED-DURATION=([\\d\\.]+)\\b"

    .line 474
    .line 475
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    sput-object v0, LH2/k;->j0:Ljava/util/regex/Pattern;

    .line 480
    .line 481
    const-string v0, "END-ON-NEXT"

    .line 482
    .line 483
    invoke-static {v0}, LH2/k;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    sput-object v0, LH2/k;->k0:Ljava/util/regex/Pattern;

    .line 488
    .line 489
    const-string v0, "X-ASSET-URI=\"((?:.|\u000c)+?)\""

    .line 490
    .line 491
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    sput-object v0, LH2/k;->l0:Ljava/util/regex/Pattern;

    .line 496
    .line 497
    const-string v0, "X-ASSET-LIST=\"((?:.|\u000c)+?)\""

    .line 498
    .line 499
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    sput-object v0, LH2/k;->m0:Ljava/util/regex/Pattern;

    .line 504
    .line 505
    const-string v0, "X-RESUME-OFFSET=(-?[\\d\\.]+)\\b"

    .line 506
    .line 507
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    sput-object v0, LH2/k;->n0:Ljava/util/regex/Pattern;

    .line 512
    .line 513
    const-string v0, "X-PLAYOUT-LIMIT=([\\d\\.]+)\\b"

    .line 514
    .line 515
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    sput-object v0, LH2/k;->o0:Ljava/util/regex/Pattern;

    .line 520
    .line 521
    const-string v0, "X-SNAP=\"((?:.|\u000c)+?)\""

    .line 522
    .line 523
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    sput-object v0, LH2/k;->p0:Ljava/util/regex/Pattern;

    .line 528
    .line 529
    const-string v0, "X-RESTRICT=\"((?:.|\u000c)+?)\""

    .line 530
    .line 531
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    sput-object v0, LH2/k;->q0:Ljava/util/regex/Pattern;

    .line 536
    .line 537
    const-string v0, "X-CONTENT-MAY-VARY=\"((?:.|\u000c)+?)\""

    .line 538
    .line 539
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    sput-object v0, LH2/k;->r0:Ljava/util/regex/Pattern;

    .line 544
    .line 545
    const-string v0, "X-TIMELINE-OCCUPIES=\"((?:.|\u000c)+?)\""

    .line 546
    .line 547
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    sput-object v0, LH2/k;->s0:Ljava/util/regex/Pattern;

    .line 552
    .line 553
    const-string v0, "X-TIMELINE-STYLE=\"((?:.|\u000c)+?)\""

    .line 554
    .line 555
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    sput-object v0, LH2/k;->t0:Ljava/util/regex/Pattern;

    .line 560
    .line 561
    const-string v0, "\\{\\$([a-zA-Z0-9\\-_]+)\\}"

    .line 562
    .line 563
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    sput-object v0, LH2/k;->u0:Ljava/util/regex/Pattern;

    .line 568
    .line 569
    const-string v0, "\\b(X-[A-Z0-9-]+)="

    .line 570
    .line 571
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    sput-object v0, LH2/k;->v0:Ljava/util/regex/Pattern;

    .line 576
    .line 577
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, LH2/i;->n:LH2/i;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, LH2/k;-><init>(LH2/i;LH2/f;)V

    return-void
.end method

.method public constructor <init>(LH2/i;LH2/f;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LH2/k;->a:LH2/i;

    .line 4
    iput-object p2, p0, LH2/k;->b:LH2/f;

    return-void
.end method

.method private static A(Ljava/lang/String;)LH2/f$h;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, LH2/k;->u:Ljava/util/regex/Pattern;

    .line 4
    .line 5
    const-wide/high16 v2, -0x3c20000000000000L    # -9.223372036854776E18

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3}, LH2/k;->t(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    .line 8
    .line 9
    .line 10
    move-result-wide v4

    .line 11
    cmpl-double v1, v4, v2

    .line 12
    .line 13
    const-wide v6, 0x412e848000000000L    # 1000000.0

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    move-wide v11, v8

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    mul-double/2addr v4, v6

    .line 28
    double-to-long v4, v4

    .line 29
    move-wide v11, v4

    .line 30
    :goto_0
    sget-object v1, LH2/k;->v:Ljava/util/regex/Pattern;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-static {v0, v1, v4}, LH2/k;->s(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    .line 34
    .line 35
    .line 36
    move-result v13

    .line 37
    sget-object v1, LH2/k;->x:Ljava/util/regex/Pattern;

    .line 38
    .line 39
    invoke-static {v0, v1, v2, v3}, LH2/k;->t(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    .line 40
    .line 41
    .line 42
    move-result-wide v14

    .line 43
    cmpl-double v1, v14, v2

    .line 44
    .line 45
    if-nez v1, :cond_1

    .line 46
    .line 47
    move-wide v14, v8

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    mul-double/2addr v14, v6

    .line 50
    double-to-long v14, v14

    .line 51
    :goto_1
    sget-object v1, LH2/k;->y:Ljava/util/regex/Pattern;

    .line 52
    .line 53
    invoke-static {v0, v1, v2, v3}, LH2/k;->t(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    .line 54
    .line 55
    .line 56
    move-result-wide v16

    .line 57
    cmpl-double v1, v16, v2

    .line 58
    .line 59
    if-nez v1, :cond_2

    .line 60
    .line 61
    :goto_2
    move-wide/from16 v16, v8

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_2
    mul-double v1, v16, v6

    .line 65
    .line 66
    double-to-long v8, v1

    .line 67
    goto :goto_2

    .line 68
    :goto_3
    sget-object v1, LH2/k;->z:Ljava/util/regex/Pattern;

    .line 69
    .line 70
    invoke-static {v0, v1, v4}, LH2/k;->s(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    .line 71
    .line 72
    .line 73
    move-result v18

    .line 74
    new-instance v10, LH2/f$h;

    .line 75
    .line 76
    invoke-direct/range {v10 .. v18}, LH2/f$h;-><init>(JZJJZ)V

    .line 77
    .line 78
    .line 79
    return-object v10
.end method

.method private static B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0, p1, p2}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    return-object p2

    .line 8
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v0, "Couldn\'t match "

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p1, " in "

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const/4 p1, 0x0

    .line 38
    invoke-static {p0, p1}, Lq2/L;->c(Ljava/lang/String;Ljava/lang/Throwable;)Lq2/L;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    throw p0
.end method

.method private static C(Ljava/lang/String;Ljava/util/regex/Pattern;)J
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance p1, Ljava/math/BigDecimal;

    .line 8
    .line 9
    invoke-direct {p1, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance p0, Ljava/math/BigDecimal;

    .line 13
    .line 14
    const-wide/32 v0, 0xf4240

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0, v1}, Ljava/math/BigDecimal;-><init>(J)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p0}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/math/BigDecimal;->longValue()J

    .line 25
    .line 26
    .line 27
    move-result-wide p0

    .line 28
    return-wide p0
.end method

.method private static D(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, LH2/k;->u0:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Ljava/lang/StringBuffer;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 10
    .line 11
    .line 12
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1}, Ljava/util/regex/Matcher;->quoteReplacement(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p0, v0, v1}, Ljava/util/regex/Matcher;->appendReplacement(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->appendTail(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method private static E(Ljava/io/BufferedReader;ZI)I
    .locals 1

    .line 1
    :goto_0
    const/4 v0, -0x1

    .line 2
    if-eq p2, v0, :cond_1

    .line 3
    .line 4
    invoke-static {p2}, Ljava/lang/Character;->isWhitespace(I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-static {p2}, Lt2/a0;->N0(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return p2
.end method

.method private static b(Ljava/io/BufferedReader;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xef

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v1, 0xbb

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/16 v1, 0xbf

    .line 23
    .line 24
    if-eq v0, v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    return v2

    .line 33
    :cond_2
    :goto_1
    const/4 v1, 0x1

    .line 34
    invoke-static {p0, v1, v0}, LH2/k;->E(Ljava/io/BufferedReader;ZI)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    move v1, v2

    .line 39
    :goto_2
    const/4 v3, 0x7

    .line 40
    if-ge v1, v3, :cond_4

    .line 41
    .line 42
    const-string v3, "#EXTM3U"

    .line 43
    .line 44
    invoke-virtual {v3, v1}, Ljava/lang/String;->charAt(I)C

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eq v0, v3, :cond_3

    .line 49
    .line 50
    return v2

    .line 51
    :cond_3
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    add-int/lit8 v1, v1, 0x1

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    invoke-static {p0, v2, v0}, LH2/k;->E(Ljava/io/BufferedReader;ZI)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    invoke-static {p0}, Lt2/a0;->N0(I)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    return p0
.end method

.method private static c(Ljava/lang/String;)Ljava/util/regex/Pattern;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p0, "=("

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p0, "NO"

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p0, "|"

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, "YES"

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p0, ")"

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method private static d(Ljava/lang/String;[Lq2/q$b;)Lq2/q;
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    new-array v0, v0, [Lq2/q$b;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    array-length v2, p1

    .line 6
    if-ge v1, v2, :cond_0

    .line 7
    .line 8
    aget-object v2, p1, v1

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-virtual {v2, v3}, Lq2/q$b;->b([B)Lq2/q$b;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    aput-object v2, v0, v1

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Lq2/q;

    .line 21
    .line 22
    invoke-direct {p1, p0, v0}, Lq2/q;-><init>(Ljava/lang/String;[Lq2/q$b;)V

    .line 23
    .line 24
    .line 25
    return-object p1
.end method

.method private static e(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    if-eqz p3, :cond_1

    .line 6
    .line 7
    return-object p3

    .line 8
    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method private static f(Ljava/util/ArrayList;Ljava/lang/String;)LH2/i$b;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, LH2/i$b;

    .line 13
    .line 14
    iget-object v2, v1, LH2/i$b;->d:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method private static g(Ljava/util/ArrayList;Ljava/lang/String;)LH2/i$b;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, LH2/i$b;

    .line 13
    .line 14
    iget-object v2, v1, LH2/i$b;->e:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method private static h(Ljava/util/ArrayList;Ljava/lang/String;)LH2/i$b;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, LH2/i$b;

    .line 13
    .line 14
    iget-object v2, v1, LH2/i$b;->c:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method private static i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {p1, p2}, Lq2/K;->p(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    const/4 p1, 0x1

    .line 10
    if-nez p2, :cond_1

    .line 11
    .line 12
    return p1

    .line 13
    :cond_1
    if-eqz p0, :cond_7

    .line 14
    .line 15
    if-nez p3, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    const-string p2, "PQ"

    .line 19
    .line 20
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_3

    .line 25
    .line 26
    const-string p2, "db1p"

    .line 27
    .line 28
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-eqz p2, :cond_5

    .line 33
    .line 34
    :cond_3
    const-string p2, "SDR"

    .line 35
    .line 36
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_4

    .line 41
    .line 42
    const-string p2, "db2g"

    .line 43
    .line 44
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-eqz p2, :cond_5

    .line 49
    .line 50
    :cond_4
    const-string p2, "HLG"

    .line 51
    .line 52
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-eqz p0, :cond_6

    .line 57
    .line 58
    const-string p0, "db4"

    .line 59
    .line 60
    invoke-virtual {p3, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-nez p0, :cond_6

    .line 65
    .line 66
    :cond_5
    return v0

    .line 67
    :cond_6
    return p1

    .line 68
    :cond_7
    :goto_0
    return v0
.end method

.method private static k(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)LH2/f$b;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string v1, "="

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v2, v0

    .line 27
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/lit8 v3, v2, 0x1

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-ne v0, v3, :cond_0

    .line 35
    .line 36
    move v0, v4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v0, 0x2

    .line 39
    :goto_0
    add-int/2addr v0, v2

    .line 40
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v2, "\""

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, "\"((?:.|\u000c)+?)\""

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {p0, v0, p2}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    new-instance p2, LH2/f$b;

    .line 81
    .line 82
    const/4 v0, 0x0

    .line 83
    invoke-direct {p2, p1, p0, v0}, LH2/f$b;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 84
    .line 85
    .line 86
    return-object p2

    .line 87
    :cond_1
    const-string v1, "0x"

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_3

    .line 94
    .line 95
    const-string v1, "0X"

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_2

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v0, "=([\\d\\.]+)\\b"

    .line 113
    .line 114
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    new-instance v0, LH2/f$b;

    .line 126
    .line 127
    invoke-static {p0, p2}, LH2/k;->l(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    .line 128
    .line 129
    .line 130
    move-result-wide v1

    .line 131
    invoke-direct {v0, p1, v1, v2}, LH2/f$b;-><init>(Ljava/lang/String;D)V

    .line 132
    .line 133
    .line 134
    return-object v0

    .line 135
    :cond_3
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v1, "=(0[xX][A-F0-9]+)"

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {p0, v0, p2}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    new-instance p2, LH2/f$b;

    .line 161
    .line 162
    invoke-direct {p2, p1, p0, v4}, LH2/f$b;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 163
    .line 164
    .line 165
    return-object p2
.end method

.method private static l(Ljava/lang/String;Ljava/util/regex/Pattern;)D
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method private static m(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lq2/q$b;
    .locals 6

    .line 1
    sget-object v0, LH2/k;->M:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    const-string v1, "1"

    .line 4
    .line 5
    invoke-static {p0, v0, v1, p2}, LH2/k;->w(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v2, "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"

    .line 10
    .line 11
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    const/16 v4, 0x2c

    .line 17
    .line 18
    const-string v5, "video/mp4"

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    sget-object p1, LH2/k;->N:Ljava/util/regex/Pattern;

    .line 23
    .line 24
    invoke-static {p0, p1, p2}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance p1, Lq2/q$b;

    .line 29
    .line 30
    sget-object p2, Lq2/k;->d:Ljava/util/UUID;

    .line 31
    .line 32
    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-direct {p1, p2, v5, p0}, Lq2/q$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    .line 45
    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_0
    const-string v2, "com.widevine"

    .line 49
    .line 50
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    new-instance p1, Lq2/q$b;

    .line 57
    .line 58
    sget-object p2, Lq2/k;->d:Ljava/util/UUID;

    .line 59
    .line 60
    const-string v0, "hls"

    .line 61
    .line 62
    invoke-static {p0}, Lt2/a0;->z0(Ljava/lang/String;)[B

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-direct {p1, p2, v0, p0}, Lq2/q$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    .line 67
    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_1
    const-string v2, "com.microsoft.playready"

    .line 71
    .line 72
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_2

    .line 77
    .line 78
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_2

    .line 83
    .line 84
    sget-object p1, LH2/k;->N:Ljava/util/regex/Pattern;

    .line 85
    .line 86
    invoke-static {p0, p1, p2}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    sget-object p1, Lq2/k;->e:Ljava/util/UUID;

    .line 103
    .line 104
    invoke-static {p1, p0}, Lo3/p;->a(Ljava/util/UUID;[B)[B

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    new-instance p2, Lq2/q$b;

    .line 109
    .line 110
    invoke-direct {p2, p1, v5, p0}, Lq2/q$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    .line 111
    .line 112
    .line 113
    return-object p2

    .line 114
    :cond_2
    const/4 p0, 0x0

    .line 115
    return-object p0
.end method

.method private static n(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "SAMPLE-AES-CENC"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "SAMPLE-AES-CTR"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "cbcs"

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    :goto_0
    const-string p0, "cenc"

    .line 22
    .line 23
    return-object p0
.end method

.method private static o(Ljava/lang/String;Ljava/util/regex/Pattern;)I
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static p(Ljava/lang/String;Ljava/util/regex/Pattern;)J
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method private static q(LH2/i;LH2/f;LH2/k$b;Ljava/lang/String;)LH2/f;
    .locals 91

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    iget-boolean v2, v0, LH2/j;->c:Z

    .line 2
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 3
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 4
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 5
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 6
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 7
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 8
    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    new-instance v10, LH2/f$h;

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v18, 0x0

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v13, 0x0

    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct/range {v10 .. v18}, LH2/f$h;-><init>(JZJJZ)V

    .line 10
    new-instance v11, Ljava/util/TreeMap;

    invoke-direct {v11}, Ljava/util/TreeMap;-><init>()V

    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v19, 0x0

    .line 11
    const-string v15, ""

    move-object/from16 v21, v15

    move/from16 v23, v2

    move-wide/from16 v43, v17

    move-wide/from16 v78, v43

    move-wide/from16 v24, v19

    move-wide/from16 v35, v24

    move-wide/from16 v49, v35

    move-wide/from16 v57, v49

    move-wide/from16 v71, v57

    move-wide/from16 v74, v71

    move-wide/from16 v76, v74

    move-wide/from16 v80, v76

    move-object/from16 v37, v21

    move-object/from16 v41, v37

    const/4 v2, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v34, 0x0

    const-wide/16 v38, -0x1

    const/16 v40, 0x0

    const/16 v42, 0x0

    const/16 v45, 0x1

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v53, 0x0

    const/16 v56, 0x0

    const/16 v60, 0x0

    const-wide/16 v69, -0x1

    const/16 v73, 0x0

    move-wide/from16 v19, v78

    move-wide/from16 v21, v19

    move-wide/from16 v16, v80

    const/16 v18, 0x0

    .line 12
    :cond_0
    :goto_0
    invoke-virtual/range {p2 .. p2}, LH2/k$b;->a()Z

    move-result v28

    if-eqz v28, :cond_64

    .line 13
    invoke-virtual/range {p2 .. p2}, LH2/k$b;->b()Ljava/lang/String;

    move-result-object v13

    .line 14
    const-string v12, "#EXT"

    invoke-virtual {v13, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_1

    .line 15
    invoke-interface {v8, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    :cond_1
    const-string v12, "#EXT-X-PLAYLIST-TYPE"

    invoke-virtual {v13, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    const/16 v29, 0x2

    if-eqz v12, :cond_3

    .line 17
    sget-object v12, LH2/k;->t:Ljava/util/regex/Pattern;

    invoke-static {v13, v12, v3}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v12

    .line 18
    const-string v13, "VOD"

    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2

    const/16 v42, 0x1

    goto :goto_0

    .line 19
    :cond_2
    const-string v13, "EVENT"

    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    move/from16 v42, v29

    goto :goto_0

    .line 20
    :cond_3
    const-string v12, "#EXT-X-I-FRAMES-ONLY"

    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    const/16 v73, 0x1

    goto :goto_0

    .line 21
    :cond_4
    const-string v12, "#EXT-X-START"

    invoke-virtual {v13, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    const-wide v30, 0x412e848000000000L    # 1000000.0

    if-eqz v12, :cond_5

    .line 22
    sget-object v12, LH2/k;->F:Ljava/util/regex/Pattern;

    invoke-static {v13, v12}, LH2/k;->l(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    move-result-wide v28

    move-object v12, v8

    move-object/from16 v84, v9

    mul-double v8, v28, v30

    double-to-long v8, v8

    move-wide/from16 v28, v8

    .line 23
    sget-object v8, LH2/k;->b0:Ljava/util/regex/Pattern;

    const/4 v9, 0x0

    .line 24
    invoke-static {v13, v8, v9}, LH2/k;->s(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result v18

    move-object v8, v12

    move-wide/from16 v43, v28

    :goto_1
    move-object/from16 v9, v84

    goto :goto_0

    :cond_5
    move-object v12, v8

    move-object/from16 v84, v9

    .line 25
    const-string v8, "#EXT-X-SERVER-CONTROL"

    invoke-virtual {v13, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 26
    invoke-static {v13}, LH2/k;->A(Ljava/lang/String;)LH2/f$h;

    move-result-object v10

    :goto_2
    move-object v8, v12

    goto :goto_1

    .line 27
    :cond_6
    const-string v8, "#EXT-X-PART-INF"

    invoke-virtual {v13, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_7

    .line 28
    sget-object v8, LH2/k;->r:Ljava/util/regex/Pattern;

    invoke-static {v13, v8}, LH2/k;->l(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    move-result-wide v8

    mul-double v8, v8, v30

    double-to-long v8, v8

    move-wide/from16 v21, v8

    goto :goto_2

    .line 29
    :cond_7
    const-string v8, "#EXT-X-MAP"

    invoke-virtual {v13, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    const-string v9, "@"

    if-eqz v8, :cond_d

    .line 30
    sget-object v8, LH2/k;->N:Ljava/util/regex/Pattern;

    invoke-static {v13, v8, v3}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v28

    .line 31
    sget-object v8, LH2/k;->H:Ljava/util/regex/Pattern;

    invoke-static {v13, v8, v3}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_8

    .line 32
    invoke-static {v8, v9}, Lt2/a0;->v1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    const/16 v83, 0x0

    .line 33
    aget-object v9, v8, v83

    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v38

    .line 34
    array-length v9, v8

    const/4 v13, 0x1

    if-le v9, v13, :cond_8

    .line 35
    aget-object v8, v8, v13

    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v24

    :cond_8
    move-wide/from16 v31, v38

    cmp-long v8, v31, v69

    if-nez v8, :cond_9

    move-wide/from16 v29, v80

    goto :goto_3

    :cond_9
    move-wide/from16 v29, v24

    :goto_3
    if-eqz v60, :cond_a

    if-eqz v34, :cond_b

    :cond_a
    move-object/from16 v9, v27

    goto :goto_4

    .line 36
    :cond_b
    const-string v0, "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128."

    move-object/from16 v9, v27

    invoke-static {v0, v9}, Lq2/L;->c(Ljava/lang/String;Ljava/lang/Throwable;)Lq2/L;

    move-result-object v0

    throw v0

    .line 37
    :goto_4
    new-instance v27, LH2/f$f;

    move-object/from16 v33, v60

    invoke-direct/range {v27 .. v34}, LH2/f$f;-><init>(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V

    if-eqz v8, :cond_c

    add-long v29, v29, v31

    :cond_c
    move-wide/from16 v24, v29

    move-object v8, v12

    move-object/from16 v53, v27

    move-wide/from16 v38, v69

    move-object/from16 v27, v9

    goto/16 :goto_1

    :cond_d
    move-object/from16 v85, v10

    move-object/from16 v87, v12

    move-object/from16 v86, v27

    move-object/from16 v8, v34

    move-object/from16 v10, v60

    .line 38
    const-string v12, "#EXT-X-TARGETDURATION"

    invoke-virtual {v13, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_e

    .line 39
    sget-object v9, LH2/k;->o:Ljava/util/regex/Pattern;

    invoke-static {v13, v9}, LH2/k;->o(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    move-result v9

    int-to-long v12, v9

    const-wide/32 v19, 0xf4240

    mul-long v19, v19, v12

    :goto_5
    move-object/from16 v34, v8

    move-object/from16 v60, v10

    :goto_6
    move-object/from16 v9, v84

    move-object/from16 v10, v85

    move-object/from16 v27, v86

    move-object/from16 v8, v87

    goto/16 :goto_0

    .line 40
    :cond_e
    const-string v12, "#EXT-X-MEDIA-SEQUENCE"

    invoke-virtual {v13, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_f

    .line 41
    sget-object v9, LH2/k;->A:Ljava/util/regex/Pattern;

    invoke-static {v13, v9}, LH2/k;->p(Ljava/lang/String;Ljava/util/regex/Pattern;)J

    move-result-wide v71

    move-object/from16 v34, v8

    move-object/from16 v60, v10

    move-wide/from16 v16, v71

    goto :goto_6

    .line 42
    :cond_f
    const-string v12, "#EXT-X-VERSION"

    invoke-virtual {v13, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_10

    .line 43
    sget-object v9, LH2/k;->s:Ljava/util/regex/Pattern;

    invoke-static {v13, v9}, LH2/k;->o(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    move-result v45

    goto :goto_5

    .line 44
    :cond_10
    const-string v12, "#EXT-X-DEFINE"

    invoke-virtual {v13, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_13

    .line 45
    sget-object v9, LH2/k;->d0:Ljava/util/regex/Pattern;

    invoke-static {v13, v9, v3}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_11

    .line 46
    iget-object v12, v0, LH2/i;->l:Ljava/util/Map;

    invoke-interface {v12, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    if-eqz v12, :cond_12

    .line 47
    invoke-virtual {v3, v9, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    .line 48
    :cond_11
    sget-object v9, LH2/k;->S:Ljava/util/regex/Pattern;

    .line 49
    invoke-static {v13, v9, v3}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    sget-object v12, LH2/k;->c0:Ljava/util/regex/Pattern;

    .line 50
    invoke-static {v13, v12, v3}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v12

    .line 51
    invoke-virtual {v3, v9, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_12
    :goto_7
    move-object/from16 v62, v2

    move-object v2, v4

    move-object v1, v5

    move-object/from16 v63, v7

    move-object v0, v8

    move-object/from16 v89, v11

    move-object/from16 v34, v15

    move-wide/from16 v31, v35

    move-object/from16 v27, v37

    move-object/from16 v88, v41

    :goto_8
    move-object/from16 v59, v53

    move/from16 v30, v56

    move-wide/from16 v11, v71

    move-wide/from16 v28, v74

    move-object/from16 v8, v84

    :goto_9
    const/4 v13, 0x0

    move-wide/from16 v55, v24

    goto/16 :goto_3c

    .line 52
    :cond_13
    const-string v12, "#EXTINF"

    invoke-virtual {v13, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_14

    .line 53
    sget-object v9, LH2/k;->B:Ljava/util/regex/Pattern;

    invoke-static {v13, v9}, LH2/k;->C(Ljava/lang/String;Ljava/util/regex/Pattern;)J

    move-result-wide v74

    .line 54
    sget-object v9, LH2/k;->C:Ljava/util/regex/Pattern;

    move-object/from16 v12, v41

    invoke-static {v13, v9, v12, v3}, LH2/k;->w(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v37

    goto/16 :goto_5

    :cond_14
    move-object/from16 v12, v41

    .line 55
    const-string v0, "#EXT-X-SKIP"

    invoke-virtual {v13, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const-wide/16 v32, 0x1

    if-eqz v0, :cond_1c

    .line 56
    sget-object v0, LH2/k;->w:Ljava/util/regex/Pattern;

    invoke-static {v13, v0}, LH2/k;->o(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    move-result v0

    if-eqz v1, :cond_15

    .line 57
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_15

    const/4 v9, 0x1

    goto :goto_a

    :cond_15
    const/4 v9, 0x0

    :goto_a
    invoke-static {v9}, Lt2/a;->g(Z)V

    .line 58
    invoke-static {v1}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LH2/f;

    move-object/from16 v88, v12

    iget-wide v12, v9, LH2/f;->k:J

    sub-long v12, v16, v12

    long-to-int v9, v12

    add-int/2addr v0, v9

    if-ltz v9, :cond_1b

    .line 59
    iget-object v12, v1, LH2/f;->r:Ljava/util/List;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    if-gt v0, v12, :cond_1b

    move-object/from16 v34, v8

    move-object/from16 v60, v10

    move-wide/from16 v12, v35

    :goto_b
    if-ge v9, v0, :cond_1a

    .line 60
    iget-object v8, v1, LH2/f;->r:Ljava/util/List;

    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LH2/f$f;

    move/from16 v27, v9

    .line 61
    iget-wide v9, v1, LH2/f;->k:J

    cmp-long v9, v16, v9

    if-eqz v9, :cond_16

    .line 62
    iget v9, v1, LH2/f;->j:I

    sub-int v9, v9, v48

    iget v10, v8, LH2/f$g;->d:I

    add-int/2addr v9, v10

    .line 63
    invoke-virtual {v8, v12, v13, v9}, LH2/f$f;->b(JI)LH2/f$f;

    move-result-object v8

    .line 64
    :cond_16
    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    iget-wide v9, v8, LH2/f$g;->c:J

    add-long v57, v12, v9

    .line 66
    iget-wide v9, v8, LH2/f$g;->j:J

    cmp-long v12, v9, v69

    if-eqz v12, :cond_17

    .line 67
    iget-wide v12, v8, LH2/f$g;->i:J

    add-long v24, v12, v9

    .line 68
    :cond_17
    iget v9, v8, LH2/f$g;->d:I

    .line 69
    iget-object v10, v8, LH2/f$g;->b:LH2/f$f;

    .line 70
    iget-object v15, v8, LH2/f$g;->f:Lq2/q;

    .line 71
    iget-object v12, v8, LH2/f$g;->g:Ljava/lang/String;

    .line 72
    iget-object v13, v8, LH2/f$g;->h:Ljava/lang/String;

    move/from16 v28, v0

    if-eqz v13, :cond_18

    .line 73
    invoke-static/range {v71 .. v72}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    .line 74
    :cond_18
    iget-object v0, v8, LH2/f$g;->h:Ljava/lang/String;

    move-object/from16 v34, v0

    :cond_19
    add-long v71, v71, v32

    add-int/lit8 v0, v27, 0x1

    move/from16 v56, v9

    move-object/from16 v53, v10

    move-object/from16 v60, v12

    move-wide/from16 v12, v57

    move v9, v0

    move/from16 v0, v28

    goto :goto_b

    :cond_1a
    move-object/from16 v0, p0

    move-wide/from16 v35, v12

    :goto_c
    move-object/from16 v9, v84

    move-object/from16 v10, v85

    move-object/from16 v27, v86

    move-object/from16 v8, v87

    move-object/from16 v41, v88

    goto/16 :goto_0

    .line 75
    :cond_1b
    new-instance v0, LH2/k$a;

    invoke-direct {v0}, LH2/k$a;-><init>()V

    throw v0

    :cond_1c
    move-object/from16 v88, v12

    .line 76
    const-string v0, "#EXT-X-KEY"

    invoke-virtual {v13, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_21

    .line 77
    sget-object v0, LH2/k;->K:Ljava/util/regex/Pattern;

    invoke-static {v13, v0, v3}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 78
    sget-object v8, LH2/k;->L:Ljava/util/regex/Pattern;

    .line 79
    const-string v9, "identity"

    invoke-static {v13, v8, v9, v3}, LH2/k;->w(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v8

    .line 80
    const-string v10, "NONE"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1d

    .line 81
    invoke-virtual {v11}, Ljava/util/TreeMap;->clear()V

    move-object/from16 v15, v86

    move-object/from16 v34, v15

    move-object/from16 v60, v34

    goto :goto_d

    .line 82
    :cond_1d
    sget-object v10, LH2/k;->O:Ljava/util/regex/Pattern;

    invoke-static {v13, v10, v3}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v10

    .line 83
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1f

    .line 84
    const-string v8, "AES-128"

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 85
    sget-object v0, LH2/k;->N:Ljava/util/regex/Pattern;

    invoke-static {v13, v0, v3}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v60, v0

    move-object/from16 v34, v10

    goto :goto_d

    :cond_1e
    move-object/from16 v34, v10

    move-object/from16 v60, v86

    goto :goto_d

    :cond_1f
    if-nez v14, :cond_20

    .line 86
    invoke-static {v0}, LH2/k;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 87
    :cond_20
    invoke-static {v13, v8, v3}, LH2/k;->m(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lq2/q$b;

    move-result-object v0

    if-eqz v0, :cond_1e

    .line 88
    invoke-virtual {v11, v8, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v34, v10

    move-object/from16 v15, v86

    move-object/from16 v60, v15

    :goto_d
    move-object/from16 v0, p0

    goto :goto_c

    .line 89
    :cond_21
    const-string v0, "#EXT-X-BYTERANGE"

    invoke-virtual {v13, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_23

    .line 90
    sget-object v0, LH2/k;->G:Ljava/util/regex/Pattern;

    invoke-static {v13, v0, v3}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 91
    invoke-static {v0, v9}, Lt2/a0;->v1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/16 v83, 0x0

    .line 92
    aget-object v9, v0, v83

    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v38

    .line 93
    array-length v9, v0

    const/4 v12, 0x1

    if-le v9, v12, :cond_22

    .line 94
    aget-object v0, v0, v12

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v24

    :cond_22
    :goto_e
    move-object/from16 v0, p0

    move-object/from16 v34, v8

    move-object/from16 v60, v10

    goto/16 :goto_c

    :cond_23
    const/4 v12, 0x1

    .line 95
    const-string v0, "#EXT-X-DISCONTINUITY-SEQUENCE"

    invoke-virtual {v13, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    move/from16 v82, v12

    const/16 v12, 0x3a

    if-eqz v0, :cond_24

    .line 96
    invoke-virtual {v13, v12}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v13, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v48

    move-object/from16 v0, p0

    move-object/from16 v34, v8

    move-object/from16 v60, v10

    move-object/from16 v9, v84

    move-object/from16 v10, v85

    move-object/from16 v27, v86

    move-object/from16 v8, v87

    move-object/from16 v41, v88

    const/16 v47, 0x1

    goto/16 :goto_0

    .line 97
    :cond_24
    const-string v0, "#EXT-X-DISCONTINUITY"

    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_25

    add-int/lit8 v56, v56, 0x1

    goto :goto_e

    .line 98
    :cond_25
    const-string v0, "#EXT-X-PROGRAM-DATE-TIME"

    invoke-virtual {v13, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_27

    cmp-long v0, v49, v80

    if-nez v0, :cond_26

    .line 99
    invoke-virtual {v13, v12}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/16 v82, 0x1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v13, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lt2/a0;->d1(Ljava/lang/String;)J

    move-result-wide v12

    invoke-static {v12, v13}, Lt2/a0;->V0(J)J

    move-result-wide v12

    sub-long v49, v12, v35

    goto :goto_e

    :cond_26
    move-object/from16 v62, v2

    move-object v2, v4

    move-object v1, v5

    move-object/from16 v63, v7

    move-object v0, v8

    move-object/from16 v89, v11

    :goto_f
    move-object/from16 v34, v15

    move-wide/from16 v31, v35

    move-object/from16 v27, v37

    goto/16 :goto_8

    .line 100
    :cond_27
    const-string v0, "#EXT-X-GAP"

    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_28

    move-object/from16 v0, p0

    move-object/from16 v34, v8

    move-object/from16 v60, v10

    move-object/from16 v9, v84

    move-object/from16 v10, v85

    move-object/from16 v27, v86

    move-object/from16 v8, v87

    move-object/from16 v41, v88

    const/16 v40, 0x1

    goto/16 :goto_0

    .line 101
    :cond_28
    const-string v0, "#EXT-X-INDEPENDENT-SEGMENTS"

    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_29

    move-object/from16 v0, p0

    move-object/from16 v34, v8

    move-object/from16 v60, v10

    move-object/from16 v9, v84

    move-object/from16 v10, v85

    move-object/from16 v27, v86

    move-object/from16 v8, v87

    move-object/from16 v41, v88

    const/16 v23, 0x1

    goto/16 :goto_0

    .line 102
    :cond_29
    const-string v0, "#EXT-X-ENDLIST"

    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2a

    move-object/from16 v0, p0

    move-object/from16 v34, v8

    move-object/from16 v60, v10

    move-object/from16 v9, v84

    move-object/from16 v10, v85

    move-object/from16 v27, v86

    move-object/from16 v8, v87

    move-object/from16 v41, v88

    const/16 v46, 0x1

    goto/16 :goto_0

    .line 103
    :cond_2a
    const-string v0, "#EXT-X-RENDITION-REPORT"

    invoke-virtual {v13, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2b

    .line 104
    sget-object v0, LH2/k;->D:Ljava/util/regex/Pattern;

    move-object/from16 v89, v11

    move-wide/from16 v11, v69

    invoke-static {v13, v0, v11, v12}, LH2/k;->v(Ljava/lang/String;Ljava/util/regex/Pattern;J)J

    move-result-wide v0

    .line 105
    sget-object v9, LH2/k;->E:Ljava/util/regex/Pattern;

    const/4 v11, -0x1

    invoke-static {v13, v9, v11}, LH2/k;->u(Ljava/lang/String;Ljava/util/regex/Pattern;I)I

    move-result v9

    .line 106
    sget-object v11, LH2/k;->N:Ljava/util/regex/Pattern;

    invoke-static {v13, v11, v3}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v11

    move-object/from16 v12, p3

    .line 107
    invoke-static {v12, v11}, Lt2/Q;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v11

    .line 108
    new-instance v13, LH2/f$e;

    invoke-direct {v13, v11, v0, v1, v9}, LH2/f$e;-><init>(Landroid/net/Uri;JI)V

    invoke-interface {v7, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_10
    move-object/from16 v62, v2

    move-object v2, v4

    move-object v1, v5

    move-object/from16 v63, v7

    move-object v0, v8

    goto/16 :goto_f

    :cond_2b
    move-object/from16 v12, p3

    move-object/from16 v89, v11

    .line 109
    const-string v0, "#EXT-X-PRELOAD-HINT"

    invoke-virtual {v13, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_32

    if-eqz v2, :cond_2c

    :goto_11
    goto :goto_10

    .line 110
    :cond_2c
    sget-object v0, LH2/k;->Q:Ljava/util/regex/Pattern;

    invoke-static {v13, v0, v3}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 111
    const-string v1, "PART"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2d

    goto :goto_11

    .line 112
    :cond_2d
    sget-object v0, LH2/k;->N:Ljava/util/regex/Pattern;

    invoke-static {v13, v0, v3}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v52

    .line 113
    sget-object v0, LH2/k;->I:Ljava/util/regex/Pattern;

    const-wide/16 v11, -0x1

    .line 114
    invoke-static {v13, v0, v11, v12}, LH2/k;->v(Ljava/lang/String;Ljava/util/regex/Pattern;J)J

    move-result-wide v0

    .line 115
    sget-object v9, LH2/k;->J:Ljava/util/regex/Pattern;

    .line 116
    invoke-static {v13, v9, v11, v12}, LH2/k;->v(Ljava/lang/String;Ljava/util/regex/Pattern;J)J

    move-result-wide v64

    move-wide/from16 v11, v71

    .line 117
    invoke-static {v11, v12, v10, v8}, LH2/k;->e(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v61

    if-nez v15, :cond_2e

    .line 118
    invoke-virtual/range {v89 .. v89}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_2e

    .line 119
    invoke-virtual/range {v89 .. v89}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v9

    const/4 v13, 0x0

    new-array v15, v13, [Lq2/q$b;

    invoke-interface {v9, v15}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [Lq2/q$b;

    .line 120
    new-instance v15, Lq2/q;

    invoke-direct {v15, v14, v9}, Lq2/q;-><init>(Ljava/lang/String;[Lq2/q$b;)V

    if-nez v26, :cond_2e

    .line 121
    invoke-static {v14, v9}, LH2/k;->d(Ljava/lang/String;[Lq2/q$b;)Lq2/q;

    move-result-object v9

    move-object/from16 v26, v9

    :cond_2e
    move-object/from16 v59, v15

    const-wide/16 v69, -0x1

    cmp-long v9, v0, v69

    if-eqz v9, :cond_2f

    cmp-long v13, v64, v69

    if-eqz v13, :cond_31

    .line 122
    :cond_2f
    new-instance v51, LH2/f$d;

    if-eqz v9, :cond_30

    move-wide/from16 v62, v0

    goto :goto_12

    :cond_30
    move-wide/from16 v62, v80

    :goto_12
    const/16 v67, 0x0

    const/16 v68, 0x1

    const-wide/16 v54, 0x0

    const/16 v66, 0x0

    move-object/from16 v60, v10

    .line 123
    invoke-direct/range {v51 .. v68}, LH2/f$d;-><init>(Ljava/lang/String;LH2/f$f;JIJLq2/q;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    move-object/from16 v2, v51

    :cond_31
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v34, v8

    move-object/from16 v60, v10

    move-wide/from16 v71, v11

    move-object/from16 v15, v59

    move-object/from16 v9, v84

    move-object/from16 v10, v85

    move-object/from16 v27, v86

    move-object/from16 v8, v87

    move-object/from16 v41, v88

    move-object/from16 v11, v89

    const-wide/16 v69, -0x1

    goto/16 :goto_0

    :cond_32
    move-wide/from16 v11, v71

    .line 124
    const-string v0, "#EXT-X-PART"

    invoke-virtual {v13, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_39

    .line 125
    invoke-static {v11, v12, v10, v8}, LH2/k;->e(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v61

    .line 126
    sget-object v0, LH2/k;->N:Ljava/util/regex/Pattern;

    invoke-static {v13, v0, v3}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v52

    .line 127
    sget-object v0, LH2/k;->p:Ljava/util/regex/Pattern;

    .line 128
    invoke-static {v13, v0}, LH2/k;->l(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    move-result-wide v0

    mul-double v0, v0, v30

    double-to-long v0, v0

    move-wide/from16 v54, v0

    .line 129
    sget-object v0, LH2/k;->Z:Ljava/util/regex/Pattern;

    const/4 v1, 0x0

    .line 130
    invoke-static {v13, v0, v1}, LH2/k;->s(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result v0

    if-eqz v23, :cond_33

    .line 131
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v27

    if-eqz v27, :cond_33

    const/16 v27, 0x1

    goto :goto_13

    :cond_33
    move/from16 v27, v1

    :goto_13
    or-int v67, v0, v27

    .line 132
    sget-object v0, LH2/k;->a0:Ljava/util/regex/Pattern;

    invoke-static {v13, v0, v1}, LH2/k;->s(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result v66

    .line 133
    sget-object v0, LH2/k;->H:Ljava/util/regex/Pattern;

    invoke-static {v13, v0, v3}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_35

    .line 134
    invoke-static {v0, v9}, Lt2/a0;->v1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 135
    aget-object v9, v0, v1

    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v27

    .line 136
    array-length v1, v0

    const/4 v13, 0x1

    if-le v1, v13, :cond_34

    .line 137
    aget-object v0, v0, v13

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v76

    :cond_34
    move-wide/from16 v64, v27

    :goto_14
    const-wide/16 v69, -0x1

    goto :goto_15

    :cond_35
    const-wide/16 v64, -0x1

    goto :goto_14

    :goto_15
    cmp-long v0, v64, v69

    if-nez v0, :cond_36

    move-wide/from16 v62, v80

    goto :goto_16

    :cond_36
    move-wide/from16 v62, v76

    :goto_16
    if-nez v15, :cond_37

    .line 138
    invoke-virtual/range {v89 .. v89}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_37

    .line 139
    invoke-virtual/range {v89 .. v89}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v1

    const/4 v13, 0x0

    new-array v9, v13, [Lq2/q$b;

    invoke-interface {v1, v9}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lq2/q$b;

    .line 140
    new-instance v15, Lq2/q;

    invoke-direct {v15, v14, v1}, Lq2/q;-><init>(Ljava/lang/String;[Lq2/q$b;)V

    if-nez v26, :cond_37

    .line 141
    invoke-static {v14, v1}, LH2/k;->d(Ljava/lang/String;[Lq2/q$b;)Lq2/q;

    move-result-object v1

    move-object/from16 v26, v1

    :cond_37
    move-object/from16 v59, v15

    .line 142
    new-instance v51, LH2/f$d;

    const/16 v68, 0x0

    move-object/from16 v60, v10

    invoke-direct/range {v51 .. v68}, LH2/f$d;-><init>(Ljava/lang/String;LH2/f$f;JIJLq2/q;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    move-object/from16 v13, v51

    move-object/from16 v1, v53

    move/from16 v9, v56

    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-long v57, v57, v54

    if-eqz v0, :cond_38

    add-long v62, v62, v64

    :cond_38
    move-wide/from16 v76, v62

    move-object/from16 v0, p0

    move-object/from16 v53, v1

    move-object/from16 v34, v8

    move/from16 v56, v9

    move-object/from16 v60, v10

    move-wide/from16 v71, v11

    move-object/from16 v15, v59

    move-object/from16 v9, v84

    move-object/from16 v10, v85

    move-object/from16 v27, v86

    move-object/from16 v8, v87

    move-object/from16 v41, v88

    move-object/from16 v11, v89

    const-wide/16 v69, -0x1

    move-object/from16 v1, p1

    goto/16 :goto_0

    :cond_39
    move-object/from16 v1, v53

    move/from16 v9, v56

    .line 143
    const-string v0, "#EXT-X-DATERANGE"

    invoke-virtual {v13, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5d

    sget-object v0, LH2/k;->f0:Ljava/util/regex/Pattern;

    move-object/from16 v59, v1

    move-object/from16 v1, v88

    .line 144
    invoke-static {v13, v0, v1, v3}, LH2/k;->w(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.apple.hls.interstitial"

    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5c

    .line 146
    sget-object v0, LH2/k;->e0:Ljava/util/regex/Pattern;

    invoke-static {v13, v0, v3}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 147
    sget-object v1, LH2/k;->l0:Ljava/util/regex/Pattern;

    invoke-static {v13, v1, v3}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3a

    .line 148
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v27

    move-object/from16 v1, v27

    :goto_17
    move-object/from16 v41, v6

    goto :goto_18

    :cond_3a
    move-object/from16 v1, v86

    goto :goto_17

    .line 149
    :goto_18
    sget-object v6, LH2/k;->m0:Ljava/util/regex/Pattern;

    .line 150
    invoke-static {v13, v6, v3}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3b

    .line 151
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v27

    move-object/from16 v6, v27

    :goto_19
    move/from16 v27, v9

    goto :goto_1a

    :cond_3b
    move-object/from16 v6, v86

    goto :goto_19

    .line 152
    :goto_1a
    sget-object v9, LH2/k;->g0:Ljava/util/regex/Pattern;

    .line 153
    invoke-static {v13, v9, v3}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_3c

    .line 154
    invoke-static {v9}, Lt2/a0;->d1(Ljava/lang/String;)J

    move-result-wide v32

    invoke-static/range {v32 .. v33}, Lt2/a0;->V0(J)J

    move-result-wide v32

    move-object/from16 v60, v14

    move-object/from16 v34, v15

    move-wide/from16 v14, v32

    goto :goto_1b

    :cond_3c
    move-object/from16 v60, v14

    move-object/from16 v34, v15

    move-wide/from16 v14, v78

    .line 155
    :goto_1b
    sget-object v9, LH2/k;->i0:Ljava/util/regex/Pattern;

    .line 156
    invoke-static {v13, v9, v3}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_3d

    .line 157
    invoke-static {v9}, Lt2/a0;->d1(Ljava/lang/String;)J

    move-result-wide v32

    invoke-static/range {v32 .. v33}, Lt2/a0;->V0(J)J

    move-result-wide v32

    move-object/from16 v51, v4

    move-object/from16 v61, v5

    move-wide/from16 v4, v32

    goto :goto_1c

    :cond_3d
    move-object/from16 v51, v4

    move-object/from16 v61, v5

    move-wide/from16 v4, v78

    .line 158
    :goto_1c
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v62, v2

    .line 159
    sget-object v2, LH2/k;->h0:Ljava/util/regex/Pattern;

    invoke-static {v13, v2, v3}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v63, v7

    .line 160
    const-string v7, ","

    if-eqz v2, :cond_41

    .line 161
    invoke-static {v2, v7}, Lt2/a0;->v1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    move-object/from16 v64, v8

    .line 162
    array-length v8, v2

    move-object/from16 v32, v2

    const/4 v2, 0x0

    :goto_1d
    if-ge v2, v8, :cond_42

    aget-object v33, v32, v2

    move/from16 v52, v2

    .line 163
    invoke-virtual/range {v33 .. v33}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 164
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v33

    sparse-switch v33, :sswitch_data_0

    move/from16 v33, v8

    :goto_1e
    const/4 v8, -0x1

    goto :goto_20

    :sswitch_0
    move/from16 v33, v8

    const-string v8, "POST"

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3e

    goto :goto_1f

    :cond_3e
    move/from16 v8, v29

    goto :goto_20

    :sswitch_1
    move/from16 v33, v8

    const-string v8, "ONCE"

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3f

    goto :goto_1f

    :cond_3f
    const/4 v8, 0x1

    goto :goto_20

    :sswitch_2
    move/from16 v33, v8

    const-string v8, "PRE"

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_40

    :goto_1f
    goto :goto_1e

    :cond_40
    const/4 v8, 0x0

    :goto_20
    packed-switch v8, :pswitch_data_0

    goto :goto_21

    .line 165
    :pswitch_0
    invoke-interface {v9, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_21
    add-int/lit8 v2, v52, 0x1

    move/from16 v8, v33

    goto :goto_1d

    :cond_41
    move-object/from16 v64, v8

    .line 166
    :cond_42
    sget-object v2, LH2/k;->q:Ljava/util/regex/Pattern;

    move-object v8, v10

    move-wide/from16 v52, v11

    const-wide/high16 v10, -0x4010000000000000L    # -1.0

    invoke-static {v13, v2, v10, v11}, LH2/k;->t(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    move-result-wide v32

    const-wide/16 v54, 0x0

    cmpl-double v2, v32, v54

    if-ltz v2, :cond_43

    mul-double v10, v32, v30

    double-to-long v10, v10

    goto :goto_22

    :cond_43
    move-wide/from16 v10, v78

    .line 167
    :goto_22
    sget-object v2, LH2/k;->j0:Ljava/util/regex/Pattern;

    move-object/from16 v56, v8

    move-object v12, v9

    const-wide/high16 v8, -0x4010000000000000L    # -1.0

    invoke-static {v13, v2, v8, v9}, LH2/k;->t(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    move-result-wide v32

    cmpl-double v2, v32, v54

    if-ltz v2, :cond_44

    mul-double v8, v32, v30

    double-to-long v8, v8

    goto :goto_23

    :cond_44
    move-wide/from16 v8, v78

    .line 168
    :goto_23
    sget-object v2, LH2/k;->k0:Ljava/util/regex/Pattern;

    move-object/from16 v32, v12

    const/4 v12, 0x0

    invoke-static {v13, v2, v12}, LH2/k;->s(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result v2

    .line 169
    sget-object v12, LH2/k;->n0:Ljava/util/regex/Pattern;

    move-wide/from16 v67, v8

    const-wide/16 v8, 0x1

    .line 170
    invoke-static {v13, v12, v8, v9}, LH2/k;->t(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    move-result-wide v71

    cmpl-double v8, v71, v8

    if-eqz v8, :cond_45

    mul-double v8, v71, v30

    double-to-long v8, v8

    goto :goto_24

    :cond_45
    move-wide/from16 v8, v78

    .line 171
    :goto_24
    sget-object v12, LH2/k;->o0:Ljava/util/regex/Pattern;

    move-wide/from16 v71, v8

    const-wide/high16 v8, -0x4010000000000000L    # -1.0

    invoke-static {v13, v12, v8, v9}, LH2/k;->t(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    move-result-wide v8

    cmpl-double v12, v8, v54

    if-ltz v12, :cond_46

    mul-double v8, v8, v30

    double-to-long v8, v8

    goto :goto_25

    :cond_46
    move-wide/from16 v8, v78

    .line 172
    :goto_25
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    move-wide/from16 v30, v8

    .line 173
    sget-object v8, LH2/k;->p0:Ljava/util/regex/Pattern;

    invoke-static {v13, v8, v3}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_48

    .line 174
    invoke-static {v8, v7}, Lt2/a0;->v1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 175
    array-length v9, v8

    move-object/from16 v33, v8

    const/4 v8, 0x0

    :goto_26
    if-ge v8, v9, :cond_48

    aget-object v54, v33, v8

    move/from16 v55, v8

    .line 176
    invoke-virtual/range {v54 .. v54}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    .line 177
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v54, v9

    const-string v9, "IN"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_47

    const-string v9, "OUT"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_47

    goto :goto_27

    .line 178
    :cond_47
    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_27
    add-int/lit8 v8, v55, 0x1

    move/from16 v9, v54

    goto :goto_26

    .line 179
    :cond_48
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 180
    sget-object v9, LH2/k;->q0:Ljava/util/regex/Pattern;

    .line 181
    invoke-static {v13, v9, v3}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_4a

    .line 182
    invoke-static {v9, v7}, Lt2/a0;->v1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 183
    array-length v9, v7

    move-object/from16 v33, v7

    const/4 v7, 0x0

    :goto_28
    if-ge v7, v9, :cond_4a

    aget-object v54, v33, v7

    move/from16 v55, v7

    .line 184
    invoke-virtual/range {v54 .. v54}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    .line 185
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v54, v9

    const-string v9, "JUMP"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_49

    const-string v9, "SKIP"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_49

    goto :goto_29

    .line 186
    :cond_49
    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_29
    add-int/lit8 v7, v55, 0x1

    move/from16 v9, v54

    goto :goto_28

    .line 187
    :cond_4a
    sget-object v7, LH2/k;->r0:Ljava/util/regex/Pattern;

    .line 188
    invoke-static {v13, v7, v3}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_4b

    .line 189
    const-string v9, "NO"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const/16 v82, 0x1

    xor-int/lit8 v7, v7, 0x1

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    goto :goto_2a

    :cond_4b
    move-object/from16 v7, v86

    .line 190
    :goto_2a
    sget-object v9, LH2/k;->s0:Ljava/util/regex/Pattern;

    .line 191
    invoke-static {v13, v9, v3}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v33, v7

    if-eqz v9, :cond_4d

    .line 192
    const-string v7, "RANGE"

    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v54

    if-eqz v54, :cond_4c

    goto :goto_2b

    .line 193
    :cond_4c
    const-string v7, "POINT"

    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4d

    goto :goto_2b

    :cond_4d
    move-object/from16 v7, v86

    .line 194
    :goto_2b
    sget-object v9, LH2/k;->t0:Ljava/util/regex/Pattern;

    .line 195
    invoke-static {v13, v9, v3}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v54, v7

    if-eqz v9, :cond_4f

    .line 196
    const-string v7, "PRIMARY"

    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v55

    if-eqz v55, :cond_4e

    goto :goto_2c

    .line 197
    :cond_4e
    const-string v7, "HIGHLIGHT"

    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4f

    goto :goto_2c

    :cond_4f
    move-object/from16 v7, v86

    .line 198
    :goto_2c
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v55, v7

    const/16 v7, 0x11

    .line 199
    invoke-virtual {v13, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    .line 200
    sget-object v13, LH2/k;->v0:Ljava/util/regex/Pattern;

    invoke-virtual {v13, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v13

    .line 201
    :goto_2d
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->find()Z

    move-result v65

    if-eqz v65, :cond_59

    move-object/from16 v65, v13

    .line 202
    invoke-virtual/range {v65 .. v65}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v13

    .line 203
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    move-result v66

    sparse-switch v66, :sswitch_data_1

    move-object/from16 v66, v8

    :goto_2e
    const/4 v8, -0x1

    goto/16 :goto_30

    :sswitch_3
    move-object/from16 v66, v8

    const-string v8, "X-ASSET-URI="

    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_50

    goto/16 :goto_2f

    :cond_50
    const/16 v8, 0x8

    goto/16 :goto_30

    :sswitch_4
    move-object/from16 v66, v8

    const-string v8, "X-RESUME-OFFSET="

    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_51

    goto/16 :goto_2f

    :cond_51
    const/4 v8, 0x7

    goto/16 :goto_30

    :sswitch_5
    move-object/from16 v66, v8

    const-string v8, "X-RESTRICT="

    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_52

    goto :goto_2f

    :cond_52
    const/4 v8, 0x6

    goto :goto_30

    :sswitch_6
    move-object/from16 v66, v8

    const-string v8, "X-TIMELINE-OCCUPIES="

    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_53

    goto :goto_2f

    :cond_53
    const/4 v8, 0x5

    goto :goto_30

    :sswitch_7
    move-object/from16 v66, v8

    const-string v8, "X-ASSET-LIST="

    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_54

    goto :goto_2f

    :cond_54
    const/4 v8, 0x4

    goto :goto_30

    :sswitch_8
    move-object/from16 v66, v8

    const-string v8, "X-TIMELINE-STYLE="

    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_55

    goto :goto_2f

    :cond_55
    const/4 v8, 0x3

    goto :goto_30

    :sswitch_9
    move-object/from16 v66, v8

    const-string v8, "X-PLAYOUT-LIMIT="

    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_56

    goto :goto_2f

    :cond_56
    move/from16 v8, v29

    goto :goto_30

    :sswitch_a
    move-object/from16 v66, v8

    const-string v8, "X-CONTENT-MAY-VARY="

    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_57

    goto :goto_2f

    :cond_57
    const/4 v8, 0x1

    goto :goto_30

    :sswitch_b
    move-object/from16 v66, v8

    const-string v8, "X-SNAP="

    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_58

    :goto_2f
    goto :goto_2e

    :cond_58
    const/4 v8, 0x0

    :goto_30
    packed-switch v8, :pswitch_data_1

    .line 204
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v8

    const/16 v82, 0x1

    add-int/lit8 v8, v8, -0x1

    move-object/from16 v90, v12

    const/4 v12, 0x0

    invoke-virtual {v13, v12, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 205
    invoke-static {v7, v8, v3}, LH2/k;->k(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)LH2/f$b;

    move-result-object v8

    .line 206
    invoke-interface {v9, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_31

    :pswitch_1
    move-object/from16 v90, v12

    :goto_31
    move-object/from16 v13, v65

    move-object/from16 v8, v66

    move-object/from16 v12, v90

    goto/16 :goto_2d

    :cond_59
    move-object/from16 v66, v8

    move-object/from16 v90, v12

    move-object/from16 v8, v84

    .line 207
    invoke-virtual {v8, v0}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5a

    .line 208
    invoke-virtual {v8, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LH2/f$c$a;

    goto :goto_32

    .line 209
    :cond_5a
    new-instance v7, LH2/f$c$a;

    invoke-direct {v7, v0}, LH2/f$c$a;-><init>(Ljava/lang/String;)V

    .line 210
    :goto_32
    invoke-virtual {v7, v1}, LH2/f$c$a;->c(Landroid/net/Uri;)LH2/f$c$a;

    move-result-object v1

    .line 211
    invoke-virtual {v1, v6}, LH2/f$c$a;->b(Landroid/net/Uri;)LH2/f$c$a;

    move-result-object v1

    .line 212
    invoke-virtual {v1, v14, v15}, LH2/f$c$a;->o(J)LH2/f$c$a;

    move-result-object v1

    .line 213
    invoke-virtual {v1, v4, v5}, LH2/f$c$a;->h(J)LH2/f$c$a;

    move-result-object v1

    .line 214
    invoke-virtual {v1, v10, v11}, LH2/f$c$a;->g(J)LH2/f$c$a;

    move-result-object v1

    move-wide/from16 v4, v67

    .line 215
    invoke-virtual {v1, v4, v5}, LH2/f$c$a;->j(J)LH2/f$c$a;

    move-result-object v1

    move-object/from16 v12, v32

    .line 216
    invoke-virtual {v1, v12}, LH2/f$c$a;->f(Ljava/util/List;)LH2/f$c$a;

    move-result-object v1

    .line 217
    invoke-virtual {v1, v2}, LH2/f$c$a;->i(Z)LH2/f$c$a;

    move-result-object v1

    move-wide/from16 v4, v71

    .line 218
    invoke-virtual {v1, v4, v5}, LH2/f$c$a;->m(J)LH2/f$c$a;

    move-result-object v1

    move-wide/from16 v4, v30

    .line 219
    invoke-virtual {v1, v4, v5}, LH2/f$c$a;->k(J)LH2/f$c$a;

    move-result-object v1

    move-object/from16 v2, v90

    .line 220
    invoke-virtual {v1, v2}, LH2/f$c$a;->n(Ljava/util/List;)LH2/f$c$a;

    move-result-object v1

    move-object/from16 v2, v66

    .line 221
    invoke-virtual {v1, v2}, LH2/f$c$a;->l(Ljava/util/List;)LH2/f$c$a;

    move-result-object v1

    .line 222
    invoke-virtual {v1, v9}, LH2/f$c$a;->d(Ljava/util/List;)LH2/f$c$a;

    move-result-object v1

    move-object/from16 v7, v33

    .line 223
    invoke-virtual {v1, v7}, LH2/f$c$a;->e(Ljava/lang/Boolean;)LH2/f$c$a;

    move-result-object v1

    move-object/from16 v7, v54

    .line 224
    invoke-virtual {v1, v7}, LH2/f$c$a;->p(Ljava/lang/String;)LH2/f$c$a;

    move-result-object v1

    move-object/from16 v7, v55

    .line 225
    invoke-virtual {v1, v7}, LH2/f$c$a;->q(Ljava/lang/String;)LH2/f$c$a;

    move-result-object v1

    .line 226
    invoke-virtual {v8, v0, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5b
    move/from16 v30, v27

    move-wide/from16 v31, v35

    move-object/from16 v27, v37

    move-object/from16 v6, v41

    move-object/from16 v2, v51

    move-wide/from16 v11, v52

    move-object/from16 v10, v56

    move-object/from16 v14, v60

    move-object/from16 v1, v61

    move-object/from16 v0, v64

    move-wide/from16 v28, v74

    goto/16 :goto_9

    :cond_5c
    :goto_33
    move-object/from16 v62, v2

    move-object/from16 v51, v4

    move-object/from16 v61, v5

    move-object/from16 v41, v6

    move-object/from16 v63, v7

    move-object/from16 v64, v8

    move/from16 v27, v9

    move-object/from16 v56, v10

    move-wide/from16 v52, v11

    move-object/from16 v60, v14

    move-object/from16 v34, v15

    move-object/from16 v8, v84

    goto :goto_34

    :cond_5d
    move-object/from16 v59, v1

    goto :goto_33

    .line 227
    :goto_34
    const-string v0, "#"

    invoke-virtual {v13, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5b

    move-wide/from16 v1, v32

    move-wide/from16 v31, v35

    move-wide/from16 v11, v52

    move-object/from16 v10, v56

    move-object/from16 v0, v64

    .line 228
    invoke-static {v11, v12, v10, v0}, LH2/k;->e(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v35

    add-long v71, v11, v1

    .line 229
    invoke-static {v13, v3}, LH2/k;->D(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v51

    .line 230
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LH2/f$f;

    const-wide/16 v69, -0x1

    cmp-long v5, v38, v69

    if-nez v5, :cond_5e

    move-object/from16 v53, v4

    move-wide/from16 v24, v80

    goto :goto_35

    :cond_5e
    if-eqz v73, :cond_5f

    if-nez v59, :cond_5f

    if-nez v4, :cond_5f

    .line 231
    new-instance v51, LH2/f$f;

    const/16 v57, 0x0

    const/16 v58, 0x0

    const-wide/16 v53, 0x0

    move-object/from16 v52, v1

    move-wide/from16 v55, v24

    invoke-direct/range {v51 .. v58}, LH2/f$f;-><init>(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v4, v51

    .line 232
    invoke-virtual {v2, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v53, v4

    goto :goto_35

    :cond_5f
    move-wide/from16 v55, v24

    move-object/from16 v53, v4

    move-wide/from16 v24, v55

    :goto_35
    if-nez v34, :cond_61

    .line 233
    invoke-virtual/range {v89 .. v89}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_61

    .line 234
    invoke-virtual/range {v89 .. v89}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v4

    const/4 v13, 0x0

    new-array v6, v13, [Lq2/q$b;

    invoke-interface {v4, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Lq2/q$b;

    .line 235
    new-instance v15, Lq2/q;

    move-object/from16 v14, v60

    invoke-direct {v15, v14, v4}, Lq2/q;-><init>(Ljava/lang/String;[Lq2/q$b;)V

    if-nez v26, :cond_60

    .line 236
    invoke-static {v14, v4}, LH2/k;->d(Ljava/lang/String;[Lq2/q$b;)Lq2/q;

    move-result-object v4

    move-object/from16 v33, v15

    :goto_36
    move/from16 v56, v27

    :goto_37
    move-object/from16 v27, v37

    move-wide/from16 v36, v24

    goto :goto_38

    :cond_60
    move-object/from16 v33, v15

    move-object/from16 v4, v26

    goto :goto_36

    :cond_61
    move-object/from16 v14, v60

    const/4 v13, 0x0

    move-object/from16 v4, v26

    move/from16 v56, v27

    move-object/from16 v33, v34

    goto :goto_37

    .line 237
    :goto_38
    new-instance v24, LH2/f$f;

    if-eqz v59, :cond_62

    move-object/from16 v26, v59

    :goto_39
    move-object/from16 v25, v1

    move-object/from16 v34, v10

    move/from16 v30, v56

    move-wide/from16 v28, v74

    goto :goto_3a

    :cond_62
    move-object/from16 v26, v53

    goto :goto_39

    .line 238
    :goto_3a
    invoke-direct/range {v24 .. v41}, LH2/f$f;-><init>(Ljava/lang/String;LH2/f$f;Ljava/lang/String;JIJLq2/q;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V

    move-object/from16 v6, v24

    move-object/from16 v10, v34

    move-object/from16 v1, v61

    .line 239
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-long v57, v31, v28

    .line 240
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    if-eqz v5, :cond_63

    add-long v24, v36, v38

    goto :goto_3b

    :cond_63
    move-wide/from16 v24, v36

    :goto_3b
    move-object/from16 v34, v0

    move-object v5, v1

    move-object/from16 v26, v4

    move-object v9, v8

    move-object/from16 v60, v10

    move/from16 v40, v13

    move/from16 v56, v30

    move-object/from16 v15, v33

    move-wide/from16 v35, v57

    move-object/from16 v53, v59

    move-object/from16 v7, v63

    move-wide/from16 v74, v80

    move-object/from16 v10, v85

    move-object/from16 v27, v86

    move-object/from16 v8, v87

    move-object/from16 v37, v88

    move-object/from16 v41, v37

    move-object/from16 v11, v89

    const-wide/16 v38, -0x1

    const-wide/16 v69, -0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v4, v2

    move-object/from16 v2, v62

    goto/16 :goto_0

    :goto_3c
    move-object v5, v1

    move-object v4, v2

    move-object v9, v8

    move-object/from16 v60, v10

    move-wide/from16 v71, v11

    move-object/from16 v37, v27

    move-wide/from16 v74, v28

    move-wide/from16 v35, v31

    move-object/from16 v15, v34

    move-wide/from16 v24, v55

    move-object/from16 v53, v59

    move-object/from16 v2, v62

    move-object/from16 v7, v63

    move-object/from16 v10, v85

    move-object/from16 v27, v86

    move-object/from16 v8, v87

    move-object/from16 v41, v88

    move-object/from16 v11, v89

    const-wide/16 v69, -0x1

    move-object/from16 v1, p1

    move-object/from16 v34, v0

    move/from16 v56, v30

    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_64
    move-object/from16 v62, v2

    move-object v1, v5

    move-object/from16 v63, v7

    move-object/from16 v87, v8

    move-object v8, v9

    move-object/from16 v85, v10

    const/4 v13, 0x0

    .line 241
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    move v9, v13

    .line 242
    :goto_3d
    invoke-interface/range {v63 .. v63}, Ljava/util/List;->size()I

    move-result v2

    if-ge v9, v2, :cond_68

    move-object/from16 v2, v63

    .line 243
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LH2/f$e;

    .line 244
    iget-wide v4, v3, LH2/f$e;->b:J

    const-wide/16 v69, -0x1

    cmp-long v7, v4, v69

    if-nez v7, :cond_65

    .line 245
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    int-to-long v4, v4

    add-long v4, v16, v4

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v7

    int-to-long v10, v7

    sub-long/2addr v4, v10

    .line 246
    :cond_65
    iget v7, v3, LH2/f$e;->c:I

    const/4 v11, -0x1

    if-ne v7, v11, :cond_67

    cmp-long v10, v21, v78

    if-eqz v10, :cond_67

    .line 247
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_66

    invoke-static {v1}, LP9/x;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LH2/f$f;

    iget-object v7, v7, LH2/f$f;->m:Ljava/util/List;

    goto :goto_3e

    :cond_66
    move-object v7, v6

    .line 248
    :goto_3e
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    const/16 v82, 0x1

    add-int/lit8 v7, v7, -0x1

    goto :goto_3f

    :cond_67
    const/16 v82, 0x1

    .line 249
    :goto_3f
    iget-object v3, v3, LH2/f$e;->a:Landroid/net/Uri;

    new-instance v10, LH2/f$e;

    invoke-direct {v10, v3, v4, v5, v7}, LH2/f$e;-><init>(Landroid/net/Uri;JI)V

    invoke-interface {v0, v3, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v63, v2

    goto :goto_3d

    :cond_68
    const/16 v82, 0x1

    if-eqz v62, :cond_69

    move-object/from16 v2, v62

    .line 250
    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 251
    :cond_69
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 252
    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6a
    :goto_40
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LH2/f$c$a;

    .line 253
    invoke-virtual {v4}, LH2/f$c$a;->a()LH2/f$c;

    move-result-object v4

    if-eqz v4, :cond_6a

    .line 254
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_40

    .line 255
    :cond_6b
    new-instance v5, LH2/f;

    cmp-long v3, v49, v80

    if-eqz v3, :cond_6c

    move/from16 v25, v82

    :goto_41
    move-object/from16 v7, p3

    move-object/from16 v30, v0

    move-object/from16 v27, v1

    move-object/from16 v31, v2

    move-object/from16 v28, v6

    move/from16 v11, v18

    move/from16 v6, v42

    move-wide/from16 v9, v43

    move/from16 v18, v45

    move/from16 v24, v46

    move/from16 v14, v47

    move/from16 v15, v48

    move-wide/from16 v12, v49

    move-object/from16 v29, v85

    move-object/from16 v8, v87

    goto :goto_42

    :cond_6c
    move/from16 v25, v13

    goto :goto_41

    :goto_42
    invoke-direct/range {v5 .. v31}, LH2/f;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLq2/q;Ljava/util/List;Ljava/util/List;LH2/f$h;Ljava/util/Map;Ljava/util/List;)V

    return-object v5

    :sswitch_data_0
    .sparse-switch
        0x13683 -> :sswitch_2
        0x251681 -> :sswitch_1
        0x2590a0 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x7f5b7c02 -> :sswitch_b
        -0x6ddab8e6 -> :sswitch_a
        -0x8e0f436 -> :sswitch_9
        -0x22a979d -> :sswitch_8
        0x17ad642d -> :sswitch_7
        0x32acec39 -> :sswitch_6
        0x57c501cc -> :sswitch_5
        0x6837ce7f -> :sswitch_4
        0x6c2295e3 -> :sswitch_3
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private static r(LH2/k$b;Ljava/lang/String;)LH2/i;
    .locals 36

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    new-instance v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v11, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v4, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v5, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v6, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v7, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v3, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v12, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v8, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    const/4 v10, 0x0

    .line 54
    const/4 v13, 0x0

    .line 55
    :goto_0
    invoke-virtual/range {p0 .. p0}, LH2/k$b;->a()Z

    .line 56
    .line 57
    .line 58
    move-result v14

    .line 59
    const-string v15, "application/x-mpegURL"

    .line 60
    .line 61
    const/16 v16, 0x0

    .line 62
    .line 63
    const-string v9, "/"

    .line 64
    .line 65
    move-object/from16 v17, v7

    .line 66
    .line 67
    if-eqz v14, :cond_14

    .line 68
    .line 69
    invoke-virtual/range {p0 .. p0}, LH2/k$b;->b()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v14

    .line 73
    const-string v7, "#EXT"

    .line 74
    .line 75
    invoke-virtual {v14, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-eqz v7, :cond_0

    .line 80
    .line 81
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    :cond_0
    const-string v7, "#EXT-X-I-FRAME-STREAM-INF"

    .line 85
    .line 86
    invoke-virtual {v14, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    move/from16 v20, v7

    .line 91
    .line 92
    const-string v7, "#EXT-X-DEFINE"

    .line 93
    .line 94
    invoke-virtual {v14, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-eqz v7, :cond_1

    .line 99
    .line 100
    sget-object v7, LH2/k;->S:Ljava/util/regex/Pattern;

    .line 101
    .line 102
    invoke-static {v14, v7, v11}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    sget-object v9, LH2/k;->c0:Ljava/util/regex/Pattern;

    .line 107
    .line 108
    invoke-static {v14, v9, v11}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    invoke-virtual {v11, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_1
    const-string v7, "#EXT-X-INDEPENDENT-SEGMENTS"

    .line 117
    .line 118
    invoke-virtual {v14, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-eqz v7, :cond_2

    .line 123
    .line 124
    move-object/from16 v35, v3

    .line 125
    .line 126
    move-object/from16 v34, v4

    .line 127
    .line 128
    move-object/from16 v33, v5

    .line 129
    .line 130
    move-object/from16 v32, v6

    .line 131
    .line 132
    move-object/from16 v21, v8

    .line 133
    .line 134
    move-object/from16 v30, v12

    .line 135
    .line 136
    const/4 v13, 0x1

    .line 137
    goto/16 :goto_f

    .line 138
    .line 139
    :cond_2
    const-string v7, "#EXT-X-MEDIA"

    .line 140
    .line 141
    invoke-virtual {v14, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    if-eqz v7, :cond_3

    .line 146
    .line 147
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_3
    const-string v7, "#EXT-X-SESSION-KEY"

    .line 152
    .line 153
    invoke-virtual {v14, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    if-eqz v7, :cond_4

    .line 158
    .line 159
    sget-object v7, LH2/k;->L:Ljava/util/regex/Pattern;

    .line 160
    .line 161
    const-string v9, "identity"

    .line 162
    .line 163
    invoke-static {v14, v7, v9, v11}, LH2/k;->w(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    invoke-static {v14, v7, v11}, LH2/k;->m(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lq2/q$b;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    if-eqz v7, :cond_5

    .line 172
    .line 173
    sget-object v9, LH2/k;->K:Ljava/util/regex/Pattern;

    .line 174
    .line 175
    invoke-static {v14, v9, v11}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    invoke-static {v9}, LH2/k;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    new-instance v14, Lq2/q;

    .line 184
    .line 185
    filled-new-array {v7}, [Lq2/q$b;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    invoke-direct {v14, v9, v7}, Lq2/q;-><init>(Ljava/lang/String;[Lq2/q$b;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_4
    const-string v7, "#EXT-X-STREAM-INF"

    .line 197
    .line 198
    invoke-virtual {v14, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    if-nez v7, :cond_6

    .line 203
    .line 204
    if-eqz v20, :cond_5

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_5
    :goto_1
    move-object/from16 v35, v3

    .line 208
    .line 209
    move-object/from16 v34, v4

    .line 210
    .line 211
    move-object/from16 v33, v5

    .line 212
    .line 213
    move-object/from16 v32, v6

    .line 214
    .line 215
    move-object/from16 v21, v8

    .line 216
    .line 217
    move-object/from16 v30, v12

    .line 218
    .line 219
    goto/16 :goto_f

    .line 220
    .line 221
    :cond_6
    :goto_2
    const-string v7, "CLOSED-CAPTIONS=NONE"

    .line 222
    .line 223
    invoke-virtual {v14, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    or-int/2addr v10, v7

    .line 228
    if-eqz v20, :cond_7

    .line 229
    .line 230
    const/16 v7, 0x4000

    .line 231
    .line 232
    :goto_3
    move-object/from16 v21, v8

    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_7
    move/from16 v7, v16

    .line 236
    .line 237
    goto :goto_3

    .line 238
    :goto_4
    sget-object v8, LH2/k;->h:Ljava/util/regex/Pattern;

    .line 239
    .line 240
    invoke-static {v14, v8}, LH2/k;->o(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    .line 241
    .line 242
    .line 243
    move-result v8

    .line 244
    move/from16 v29, v10

    .line 245
    .line 246
    sget-object v10, LH2/k;->c:Ljava/util/regex/Pattern;

    .line 247
    .line 248
    move-object/from16 v30, v12

    .line 249
    .line 250
    const/4 v12, -0x1

    .line 251
    invoke-static {v14, v10, v12}, LH2/k;->u(Ljava/lang/String;Ljava/util/regex/Pattern;I)I

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    sget-object v12, LH2/k;->j:Ljava/util/regex/Pattern;

    .line 256
    .line 257
    invoke-static {v14, v12, v11}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v12

    .line 261
    move/from16 v31, v13

    .line 262
    .line 263
    sget-object v13, LH2/k;->k:Ljava/util/regex/Pattern;

    .line 264
    .line 265
    invoke-static {v14, v13, v11}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v13

    .line 269
    move-object/from16 v32, v6

    .line 270
    .line 271
    sget-object v6, LH2/k;->l:Ljava/util/regex/Pattern;

    .line 272
    .line 273
    invoke-static {v14, v6, v11}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v6

    .line 277
    move-object/from16 v33, v5

    .line 278
    .line 279
    const-string v5, ","

    .line 280
    .line 281
    if-eqz v6, :cond_9

    .line 282
    .line 283
    invoke-static {v6, v5}, Lt2/a0;->w1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v6

    .line 287
    aget-object v6, v6, v16

    .line 288
    .line 289
    invoke-static {v6, v9}, Lt2/a0;->v1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    aget-object v9, v6, v16

    .line 294
    .line 295
    move-object/from16 v22, v9

    .line 296
    .line 297
    array-length v9, v6

    .line 298
    move-object/from16 v23, v6

    .line 299
    .line 300
    const/4 v6, 0x1

    .line 301
    if-le v9, v6, :cond_8

    .line 302
    .line 303
    aget-object v9, v23, v6

    .line 304
    .line 305
    move-object/from16 v35, v3

    .line 306
    .line 307
    move-object/from16 v34, v4

    .line 308
    .line 309
    move-object/from16 v6, v22

    .line 310
    .line 311
    const/4 v4, 0x2

    .line 312
    goto :goto_6

    .line 313
    :cond_8
    move-object/from16 v35, v3

    .line 314
    .line 315
    move-object/from16 v34, v4

    .line 316
    .line 317
    move-object/from16 v6, v22

    .line 318
    .line 319
    const/4 v4, 0x2

    .line 320
    :goto_5
    const/4 v9, 0x0

    .line 321
    goto :goto_6

    .line 322
    :cond_9
    move-object/from16 v35, v3

    .line 323
    .line 324
    move-object/from16 v34, v4

    .line 325
    .line 326
    const/4 v4, 0x2

    .line 327
    const/4 v6, 0x0

    .line 328
    goto :goto_5

    .line 329
    :goto_6
    invoke-static {v13, v4}, Lt2/a0;->U(Ljava/lang/String;I)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    invoke-static {v12, v3, v6, v9}, LH2/k;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 334
    .line 335
    .line 336
    move-result v9

    .line 337
    if-eqz v9, :cond_c

    .line 338
    .line 339
    if-eqz v6, :cond_a

    .line 340
    .line 341
    goto :goto_7

    .line 342
    :cond_a
    move-object v6, v3

    .line 343
    :goto_7
    invoke-static {v13, v4}, Lt2/a0;->V(Ljava/lang/String;I)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    if-eqz v3, :cond_b

    .line 348
    .line 349
    new-instance v4, Ljava/lang/StringBuilder;

    .line 350
    .line 351
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    move-object v13, v3

    .line 368
    goto :goto_8

    .line 369
    :cond_b
    move-object v13, v6

    .line 370
    :cond_c
    :goto_8
    sget-object v3, LH2/k;->m:Ljava/util/regex/Pattern;

    .line 371
    .line 372
    invoke-static {v14, v3, v11}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    if-eqz v3, :cond_f

    .line 377
    .line 378
    const-string v4, "x"

    .line 379
    .line 380
    invoke-static {v3, v4}, Lt2/a0;->v1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    aget-object v4, v3, v16

    .line 385
    .line 386
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 387
    .line 388
    .line 389
    move-result v4

    .line 390
    const/16 v19, 0x1

    .line 391
    .line 392
    aget-object v3, v3, v19

    .line 393
    .line 394
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 395
    .line 396
    .line 397
    move-result v3

    .line 398
    if-lez v4, :cond_e

    .line 399
    .line 400
    if-gtz v3, :cond_d

    .line 401
    .line 402
    goto :goto_9

    .line 403
    :cond_d
    move/from16 v18, v4

    .line 404
    .line 405
    goto :goto_a

    .line 406
    :cond_e
    :goto_9
    const/4 v3, -0x1

    .line 407
    const/16 v18, -0x1

    .line 408
    .line 409
    :goto_a
    move v4, v3

    .line 410
    move/from16 v3, v18

    .line 411
    .line 412
    goto :goto_b

    .line 413
    :cond_f
    const/4 v3, -0x1

    .line 414
    const/4 v4, -0x1

    .line 415
    :goto_b
    sget-object v5, LH2/k;->n:Ljava/util/regex/Pattern;

    .line 416
    .line 417
    invoke-static {v14, v5, v11}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v5

    .line 421
    if-eqz v5, :cond_10

    .line 422
    .line 423
    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 424
    .line 425
    .line 426
    move-result v5

    .line 427
    goto :goto_c

    .line 428
    :cond_10
    const/high16 v5, -0x40800000    # -1.0f

    .line 429
    .line 430
    :goto_c
    sget-object v6, LH2/k;->d:Ljava/util/regex/Pattern;

    .line 431
    .line 432
    invoke-static {v14, v6, v11}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v25

    .line 436
    sget-object v6, LH2/k;->e:Ljava/util/regex/Pattern;

    .line 437
    .line 438
    invoke-static {v14, v6, v11}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v26

    .line 442
    sget-object v6, LH2/k;->f:Ljava/util/regex/Pattern;

    .line 443
    .line 444
    invoke-static {v14, v6, v11}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v27

    .line 448
    sget-object v6, LH2/k;->g:Ljava/util/regex/Pattern;

    .line 449
    .line 450
    invoke-static {v14, v6, v11}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v28

    .line 454
    if-eqz v20, :cond_11

    .line 455
    .line 456
    sget-object v6, LH2/k;->N:Ljava/util/regex/Pattern;

    .line 457
    .line 458
    invoke-static {v14, v6, v11}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v6

    .line 462
    invoke-static {v1, v6}, Lt2/Q;->g(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 463
    .line 464
    .line 465
    move-result-object v6

    .line 466
    :goto_d
    move-object/from16 v23, v6

    .line 467
    .line 468
    goto :goto_e

    .line 469
    :cond_11
    invoke-virtual/range {p0 .. p0}, LH2/k$b;->a()Z

    .line 470
    .line 471
    .line 472
    move-result v6

    .line 473
    if-eqz v6, :cond_13

    .line 474
    .line 475
    invoke-virtual/range {p0 .. p0}, LH2/k$b;->b()Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v6

    .line 479
    invoke-static {v6, v11}, LH2/k;->D(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v6

    .line 483
    invoke-static {v1, v6}, Lt2/Q;->g(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 484
    .line 485
    .line 486
    move-result-object v6

    .line 487
    goto :goto_d

    .line 488
    :goto_e
    new-instance v6, Lq2/x$b;

    .line 489
    .line 490
    invoke-direct {v6}, Lq2/x$b;-><init>()V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 494
    .line 495
    .line 496
    move-result v9

    .line 497
    invoke-virtual {v6, v9}, Lq2/x$b;->i0(I)Lq2/x$b;

    .line 498
    .line 499
    .line 500
    move-result-object v6

    .line 501
    invoke-virtual {v6, v15}, Lq2/x$b;->W(Ljava/lang/String;)Lq2/x$b;

    .line 502
    .line 503
    .line 504
    move-result-object v6

    .line 505
    invoke-virtual {v6, v13}, Lq2/x$b;->U(Ljava/lang/String;)Lq2/x$b;

    .line 506
    .line 507
    .line 508
    move-result-object v6

    .line 509
    invoke-virtual {v6, v10}, Lq2/x$b;->S(I)Lq2/x$b;

    .line 510
    .line 511
    .line 512
    move-result-object v6

    .line 513
    invoke-virtual {v6, v8}, Lq2/x$b;->t0(I)Lq2/x$b;

    .line 514
    .line 515
    .line 516
    move-result-object v6

    .line 517
    invoke-virtual {v6, v3}, Lq2/x$b;->F0(I)Lq2/x$b;

    .line 518
    .line 519
    .line 520
    move-result-object v3

    .line 521
    invoke-virtual {v3, v4}, Lq2/x$b;->h0(I)Lq2/x$b;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    invoke-virtual {v3, v5}, Lq2/x$b;->f0(F)Lq2/x$b;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    invoke-virtual {v3, v7}, Lq2/x$b;->w0(I)Lq2/x$b;

    .line 530
    .line 531
    .line 532
    move-result-object v3

    .line 533
    invoke-virtual {v3}, Lq2/x$b;->P()Lq2/x;

    .line 534
    .line 535
    .line 536
    move-result-object v24

    .line 537
    new-instance v22, LH2/i$b;

    .line 538
    .line 539
    invoke-direct/range {v22 .. v28}, LH2/i$b;-><init>(Landroid/net/Uri;Lq2/x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    move-object/from16 v3, v22

    .line 543
    .line 544
    move-object/from16 v6, v23

    .line 545
    .line 546
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v3

    .line 553
    check-cast v3, Ljava/util/ArrayList;

    .line 554
    .line 555
    if-nez v3, :cond_12

    .line 556
    .line 557
    new-instance v3, Ljava/util/ArrayList;

    .line 558
    .line 559
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v0, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    :cond_12
    new-instance v22, LG2/h$a;

    .line 566
    .line 567
    move/from16 v24, v8

    .line 568
    .line 569
    move/from16 v23, v10

    .line 570
    .line 571
    invoke-direct/range {v22 .. v28}, LG2/h$a;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    move-object/from16 v4, v22

    .line 575
    .line 576
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 577
    .line 578
    .line 579
    move/from16 v10, v29

    .line 580
    .line 581
    move/from16 v13, v31

    .line 582
    .line 583
    :goto_f
    move-object/from16 v7, v17

    .line 584
    .line 585
    move-object/from16 v8, v21

    .line 586
    .line 587
    move-object/from16 v12, v30

    .line 588
    .line 589
    move-object/from16 v6, v32

    .line 590
    .line 591
    move-object/from16 v5, v33

    .line 592
    .line 593
    move-object/from16 v4, v34

    .line 594
    .line 595
    move-object/from16 v3, v35

    .line 596
    .line 597
    goto/16 :goto_0

    .line 598
    .line 599
    :cond_13
    const-string v0, "#EXT-X-STREAM-INF must be followed by another line"

    .line 600
    .line 601
    const/4 v1, 0x0

    .line 602
    invoke-static {v0, v1}, Lq2/L;->c(Ljava/lang/String;Ljava/lang/Throwable;)Lq2/L;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    throw v0

    .line 607
    :cond_14
    move-object/from16 v35, v3

    .line 608
    .line 609
    move-object/from16 v34, v4

    .line 610
    .line 611
    move-object/from16 v33, v5

    .line 612
    .line 613
    move-object/from16 v32, v6

    .line 614
    .line 615
    move-object/from16 v21, v8

    .line 616
    .line 617
    move-object/from16 v30, v12

    .line 618
    .line 619
    move/from16 v31, v13

    .line 620
    .line 621
    new-instance v3, Ljava/util/ArrayList;

    .line 622
    .line 623
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 624
    .line 625
    .line 626
    new-instance v4, Ljava/util/HashSet;

    .line 627
    .line 628
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 629
    .line 630
    .line 631
    move/from16 v5, v16

    .line 632
    .line 633
    :goto_10
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 634
    .line 635
    .line 636
    move-result v6

    .line 637
    if-ge v5, v6, :cond_17

    .line 638
    .line 639
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v6

    .line 643
    check-cast v6, LH2/i$b;

    .line 644
    .line 645
    iget-object v7, v6, LH2/i$b;->a:Landroid/net/Uri;

    .line 646
    .line 647
    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 648
    .line 649
    .line 650
    move-result v7

    .line 651
    if-eqz v7, :cond_16

    .line 652
    .line 653
    iget-object v7, v6, LH2/i$b;->b:Lq2/x;

    .line 654
    .line 655
    iget-object v7, v7, Lq2/x;->l:Lq2/J;

    .line 656
    .line 657
    if-nez v7, :cond_15

    .line 658
    .line 659
    const/4 v7, 0x1

    .line 660
    goto :goto_11

    .line 661
    :cond_15
    move/from16 v7, v16

    .line 662
    .line 663
    :goto_11
    invoke-static {v7}, Lt2/a;->g(Z)V

    .line 664
    .line 665
    .line 666
    new-instance v7, LG2/h;

    .line 667
    .line 668
    iget-object v8, v6, LH2/i$b;->a:Landroid/net/Uri;

    .line 669
    .line 670
    invoke-virtual {v0, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v8

    .line 674
    check-cast v8, Ljava/util/ArrayList;

    .line 675
    .line 676
    invoke-static {v8}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v8

    .line 680
    check-cast v8, Ljava/util/List;

    .line 681
    .line 682
    const/4 v12, 0x0

    .line 683
    invoke-direct {v7, v12, v12, v8}, LG2/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 684
    .line 685
    .line 686
    new-instance v8, Lq2/J;

    .line 687
    .line 688
    const/4 v13, 0x1

    .line 689
    new-array v14, v13, [Lq2/J$a;

    .line 690
    .line 691
    aput-object v7, v14, v16

    .line 692
    .line 693
    invoke-direct {v8, v14}, Lq2/J;-><init>([Lq2/J$a;)V

    .line 694
    .line 695
    .line 696
    iget-object v7, v6, LH2/i$b;->b:Lq2/x;

    .line 697
    .line 698
    invoke-virtual {v7}, Lq2/x;->b()Lq2/x$b;

    .line 699
    .line 700
    .line 701
    move-result-object v7

    .line 702
    invoke-virtual {v7, v8}, Lq2/x$b;->r0(Lq2/J;)Lq2/x$b;

    .line 703
    .line 704
    .line 705
    move-result-object v7

    .line 706
    invoke-virtual {v7}, Lq2/x$b;->P()Lq2/x;

    .line 707
    .line 708
    .line 709
    move-result-object v7

    .line 710
    invoke-virtual {v6, v7}, LH2/i$b;->a(Lq2/x;)LH2/i$b;

    .line 711
    .line 712
    .line 713
    move-result-object v6

    .line 714
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 715
    .line 716
    .line 717
    goto :goto_12

    .line 718
    :cond_16
    const/4 v12, 0x0

    .line 719
    :goto_12
    add-int/lit8 v5, v5, 0x1

    .line 720
    .line 721
    goto :goto_10

    .line 722
    :cond_17
    const/4 v12, 0x0

    .line 723
    move-object v0, v12

    .line 724
    move-object v8, v0

    .line 725
    move/from16 v4, v16

    .line 726
    .line 727
    :goto_13
    invoke-virtual/range {v35 .. v35}, Ljava/util/ArrayList;->size()I

    .line 728
    .line 729
    .line 730
    move-result v5

    .line 731
    if-ge v4, v5, :cond_28

    .line 732
    .line 733
    move-object/from16 v5, v35

    .line 734
    .line 735
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object v6

    .line 739
    check-cast v6, Ljava/lang/String;

    .line 740
    .line 741
    sget-object v7, LH2/k;->T:Ljava/util/regex/Pattern;

    .line 742
    .line 743
    invoke-static {v6, v7, v11}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    move-result-object v7

    .line 747
    sget-object v13, LH2/k;->S:Ljava/util/regex/Pattern;

    .line 748
    .line 749
    invoke-static {v6, v13, v11}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 750
    .line 751
    .line 752
    move-result-object v13

    .line 753
    new-instance v14, Lq2/x$b;

    .line 754
    .line 755
    invoke-direct {v14}, Lq2/x$b;-><init>()V

    .line 756
    .line 757
    .line 758
    new-instance v12, Ljava/lang/StringBuilder;

    .line 759
    .line 760
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 764
    .line 765
    .line 766
    move-object/from16 p0, v0

    .line 767
    .line 768
    const-string v0, ":"

    .line 769
    .line 770
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 771
    .line 772
    .line 773
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 774
    .line 775
    .line 776
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    invoke-virtual {v14, v0}, Lq2/x$b;->j0(Ljava/lang/String;)Lq2/x$b;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    invoke-virtual {v0, v13}, Lq2/x$b;->l0(Ljava/lang/String;)Lq2/x$b;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    invoke-virtual {v0, v15}, Lq2/x$b;->W(Ljava/lang/String;)Lq2/x$b;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    invoke-static {v6}, LH2/k;->z(Ljava/lang/String;)I

    .line 793
    .line 794
    .line 795
    move-result v12

    .line 796
    invoke-virtual {v0, v12}, Lq2/x$b;->A0(I)Lq2/x$b;

    .line 797
    .line 798
    .line 799
    move-result-object v0

    .line 800
    invoke-static {v6, v11}, LH2/k;->y(Ljava/lang/String;Ljava/util/Map;)I

    .line 801
    .line 802
    .line 803
    move-result v12

    .line 804
    invoke-virtual {v0, v12}, Lq2/x$b;->w0(I)Lq2/x$b;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    sget-object v12, LH2/k;->R:Ljava/util/regex/Pattern;

    .line 809
    .line 810
    invoke-static {v6, v12, v11}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 811
    .line 812
    .line 813
    move-result-object v12

    .line 814
    invoke-virtual {v0, v12}, Lq2/x$b;->n0(Ljava/lang/String;)Lq2/x$b;

    .line 815
    .line 816
    .line 817
    move-result-object v0

    .line 818
    sget-object v12, LH2/k;->N:Ljava/util/regex/Pattern;

    .line 819
    .line 820
    invoke-static {v6, v12, v11}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 821
    .line 822
    .line 823
    move-result-object v12

    .line 824
    if-nez v12, :cond_18

    .line 825
    .line 826
    const/4 v12, 0x0

    .line 827
    goto :goto_14

    .line 828
    :cond_18
    invoke-static {v1, v12}, Lt2/Q;->g(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 829
    .line 830
    .line 831
    move-result-object v12

    .line 832
    :goto_14
    new-instance v14, Lq2/J;

    .line 833
    .line 834
    new-instance v1, LG2/h;

    .line 835
    .line 836
    move-object/from16 v20, v3

    .line 837
    .line 838
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 839
    .line 840
    invoke-direct {v1, v7, v13, v3}, LG2/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 841
    .line 842
    .line 843
    move-object/from16 v22, v1

    .line 844
    .line 845
    const/4 v3, 0x1

    .line 846
    new-array v1, v3, [Lq2/J$a;

    .line 847
    .line 848
    aput-object v22, v1, v16

    .line 849
    .line 850
    invoke-direct {v14, v1}, Lq2/J;-><init>([Lq2/J$a;)V

    .line 851
    .line 852
    .line 853
    sget-object v1, LH2/k;->P:Ljava/util/regex/Pattern;

    .line 854
    .line 855
    invoke-static {v6, v1, v11}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v1

    .line 859
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 860
    .line 861
    .line 862
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 863
    .line 864
    .line 865
    move-result v3

    .line 866
    move/from16 v22, v3

    .line 867
    .line 868
    sparse-switch v22, :sswitch_data_0

    .line 869
    .line 870
    .line 871
    :goto_15
    const/4 v1, -0x1

    .line 872
    goto :goto_16

    .line 873
    :sswitch_0
    const-string v3, "VIDEO"

    .line 874
    .line 875
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 876
    .line 877
    .line 878
    move-result v1

    .line 879
    if-nez v1, :cond_19

    .line 880
    .line 881
    goto :goto_15

    .line 882
    :cond_19
    const/4 v1, 0x3

    .line 883
    goto :goto_16

    .line 884
    :sswitch_1
    const-string v3, "AUDIO"

    .line 885
    .line 886
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 887
    .line 888
    .line 889
    move-result v1

    .line 890
    if-nez v1, :cond_1a

    .line 891
    .line 892
    goto :goto_15

    .line 893
    :cond_1a
    const/4 v1, 0x2

    .line 894
    goto :goto_16

    .line 895
    :sswitch_2
    const-string v3, "CLOSED-CAPTIONS"

    .line 896
    .line 897
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 898
    .line 899
    .line 900
    move-result v1

    .line 901
    if-nez v1, :cond_1b

    .line 902
    .line 903
    goto :goto_15

    .line 904
    :cond_1b
    const/4 v1, 0x1

    .line 905
    goto :goto_16

    .line 906
    :sswitch_3
    const-string v3, "SUBTITLES"

    .line 907
    .line 908
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 909
    .line 910
    .line 911
    move-result v1

    .line 912
    if-nez v1, :cond_1c

    .line 913
    .line 914
    goto :goto_15

    .line 915
    :cond_1c
    move/from16 v1, v16

    .line 916
    .line 917
    :goto_16
    packed-switch v1, :pswitch_data_0

    .line 918
    .line 919
    .line 920
    :goto_17
    move-object/from16 v6, v32

    .line 921
    .line 922
    move-object/from16 v3, v33

    .line 923
    .line 924
    goto/16 :goto_1a

    .line 925
    .line 926
    :pswitch_0
    invoke-static {v2, v7}, LH2/k;->h(Ljava/util/ArrayList;Ljava/lang/String;)LH2/i$b;

    .line 927
    .line 928
    .line 929
    move-result-object v1

    .line 930
    if-eqz v1, :cond_1d

    .line 931
    .line 932
    iget-object v1, v1, LH2/i$b;->b:Lq2/x;

    .line 933
    .line 934
    iget-object v3, v1, Lq2/x;->k:Ljava/lang/String;

    .line 935
    .line 936
    const/4 v6, 0x2

    .line 937
    invoke-static {v3, v6}, Lt2/a0;->U(Ljava/lang/String;I)Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v3

    .line 941
    invoke-virtual {v0, v3}, Lq2/x$b;->U(Ljava/lang/String;)Lq2/x$b;

    .line 942
    .line 943
    .line 944
    move-result-object v6

    .line 945
    invoke-static {v3}, Lq2/K;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v3

    .line 949
    invoke-virtual {v6, v3}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    .line 950
    .line 951
    .line 952
    move-result-object v3

    .line 953
    iget v6, v1, Lq2/x;->v:I

    .line 954
    .line 955
    invoke-virtual {v3, v6}, Lq2/x$b;->F0(I)Lq2/x$b;

    .line 956
    .line 957
    .line 958
    move-result-object v3

    .line 959
    iget v6, v1, Lq2/x;->w:I

    .line 960
    .line 961
    invoke-virtual {v3, v6}, Lq2/x$b;->h0(I)Lq2/x$b;

    .line 962
    .line 963
    .line 964
    move-result-object v3

    .line 965
    iget v1, v1, Lq2/x;->z:F

    .line 966
    .line 967
    invoke-virtual {v3, v1}, Lq2/x$b;->f0(F)Lq2/x$b;

    .line 968
    .line 969
    .line 970
    :cond_1d
    if-nez v12, :cond_1e

    .line 971
    .line 972
    goto :goto_17

    .line 973
    :cond_1e
    invoke-virtual {v0, v14}, Lq2/x$b;->r0(Lq2/J;)Lq2/x$b;

    .line 974
    .line 975
    .line 976
    new-instance v1, LH2/i$a;

    .line 977
    .line 978
    invoke-virtual {v0}, Lq2/x$b;->P()Lq2/x;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    invoke-direct {v1, v12, v0, v7, v13}, LH2/i$a;-><init>(Landroid/net/Uri;Lq2/x;Ljava/lang/String;Ljava/lang/String;)V

    .line 983
    .line 984
    .line 985
    move-object/from16 v3, v34

    .line 986
    .line 987
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 988
    .line 989
    .line 990
    goto :goto_17

    .line 991
    :pswitch_1
    move-object/from16 v3, v34

    .line 992
    .line 993
    invoke-static {v2, v7}, LH2/k;->f(Ljava/util/ArrayList;Ljava/lang/String;)LH2/i$b;

    .line 994
    .line 995
    .line 996
    move-result-object v1

    .line 997
    if-eqz v1, :cond_1f

    .line 998
    .line 999
    move-object/from16 v34, v3

    .line 1000
    .line 1001
    iget-object v3, v1, LH2/i$b;->b:Lq2/x;

    .line 1002
    .line 1003
    iget-object v3, v3, Lq2/x;->k:Ljava/lang/String;

    .line 1004
    .line 1005
    move-object/from16 v22, v1

    .line 1006
    .line 1007
    const/4 v1, 0x1

    .line 1008
    invoke-static {v3, v1}, Lt2/a0;->U(Ljava/lang/String;I)Ljava/lang/String;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v3

    .line 1012
    invoke-virtual {v0, v3}, Lq2/x$b;->U(Ljava/lang/String;)Lq2/x$b;

    .line 1013
    .line 1014
    .line 1015
    invoke-static {v3}, Lq2/K;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v3

    .line 1019
    goto :goto_18

    .line 1020
    :cond_1f
    move-object/from16 v22, v1

    .line 1021
    .line 1022
    move-object/from16 v34, v3

    .line 1023
    .line 1024
    const/4 v3, 0x0

    .line 1025
    :goto_18
    sget-object v1, LH2/k;->i:Ljava/util/regex/Pattern;

    .line 1026
    .line 1027
    invoke-static {v6, v1, v11}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v1

    .line 1031
    if-eqz v1, :cond_20

    .line 1032
    .line 1033
    invoke-static {v1, v9}, Lt2/a0;->w1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v6

    .line 1037
    aget-object v6, v6, v16

    .line 1038
    .line 1039
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1040
    .line 1041
    .line 1042
    move-result v6

    .line 1043
    invoke-virtual {v0, v6}, Lq2/x$b;->T(I)Lq2/x$b;

    .line 1044
    .line 1045
    .line 1046
    const-string v6, "audio/eac3"

    .line 1047
    .line 1048
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1049
    .line 1050
    .line 1051
    move-result v6

    .line 1052
    if-eqz v6, :cond_20

    .line 1053
    .line 1054
    const-string v6, "/JOC"

    .line 1055
    .line 1056
    invoke-virtual {v1, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 1057
    .line 1058
    .line 1059
    move-result v1

    .line 1060
    if-eqz v1, :cond_20

    .line 1061
    .line 1062
    const-string v1, "ec+3"

    .line 1063
    .line 1064
    invoke-virtual {v0, v1}, Lq2/x$b;->U(Ljava/lang/String;)Lq2/x$b;

    .line 1065
    .line 1066
    .line 1067
    const-string v3, "audio/eac3-joc"

    .line 1068
    .line 1069
    :cond_20
    invoke-virtual {v0, v3}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    .line 1070
    .line 1071
    .line 1072
    if-eqz v12, :cond_21

    .line 1073
    .line 1074
    invoke-virtual {v0, v14}, Lq2/x$b;->r0(Lq2/J;)Lq2/x$b;

    .line 1075
    .line 1076
    .line 1077
    new-instance v1, LH2/i$a;

    .line 1078
    .line 1079
    invoke-virtual {v0}, Lq2/x$b;->P()Lq2/x;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v0

    .line 1083
    invoke-direct {v1, v12, v0, v7, v13}, LH2/i$a;-><init>(Landroid/net/Uri;Lq2/x;Ljava/lang/String;Ljava/lang/String;)V

    .line 1084
    .line 1085
    .line 1086
    move-object/from16 v3, v33

    .line 1087
    .line 1088
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1089
    .line 1090
    .line 1091
    goto :goto_19

    .line 1092
    :cond_21
    move-object/from16 v3, v33

    .line 1093
    .line 1094
    if-eqz v22, :cond_22

    .line 1095
    .line 1096
    invoke-virtual {v0}, Lq2/x$b;->P()Lq2/x;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v0

    .line 1100
    move-object v8, v0

    .line 1101
    :cond_22
    :goto_19
    move-object/from16 v6, v32

    .line 1102
    .line 1103
    :goto_1a
    move-object/from16 v0, p0

    .line 1104
    .line 1105
    goto/16 :goto_1e

    .line 1106
    .line 1107
    :pswitch_2
    move-object/from16 v3, v33

    .line 1108
    .line 1109
    sget-object v1, LH2/k;->V:Ljava/util/regex/Pattern;

    .line 1110
    .line 1111
    invoke-static {v6, v1, v11}, LH2/k;->B(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v1

    .line 1115
    const-string v6, "CC"

    .line 1116
    .line 1117
    invoke-virtual {v1, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1118
    .line 1119
    .line 1120
    move-result v6

    .line 1121
    if-eqz v6, :cond_23

    .line 1122
    .line 1123
    const/4 v6, 0x2

    .line 1124
    invoke-virtual {v1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v1

    .line 1128
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1129
    .line 1130
    .line 1131
    move-result v1

    .line 1132
    const-string v7, "application/cea-608"

    .line 1133
    .line 1134
    goto :goto_1b

    .line 1135
    :cond_23
    const/4 v6, 0x2

    .line 1136
    const/4 v7, 0x7

    .line 1137
    invoke-virtual {v1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v1

    .line 1141
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1142
    .line 1143
    .line 1144
    move-result v1

    .line 1145
    const-string v7, "application/cea-708"

    .line 1146
    .line 1147
    :goto_1b
    if-nez p0, :cond_24

    .line 1148
    .line 1149
    new-instance v12, Ljava/util/ArrayList;

    .line 1150
    .line 1151
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 1152
    .line 1153
    .line 1154
    goto :goto_1c

    .line 1155
    :cond_24
    move-object/from16 v12, p0

    .line 1156
    .line 1157
    :goto_1c
    invoke-virtual {v0, v7}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v7

    .line 1161
    invoke-virtual {v7, v1}, Lq2/x$b;->Q(I)Lq2/x$b;

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v0}, Lq2/x$b;->P()Lq2/x;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v0

    .line 1168
    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1169
    .line 1170
    .line 1171
    move-object v0, v12

    .line 1172
    move-object/from16 v6, v32

    .line 1173
    .line 1174
    goto :goto_1e

    .line 1175
    :pswitch_3
    move-object/from16 v3, v33

    .line 1176
    .line 1177
    const/4 v6, 0x2

    .line 1178
    invoke-static {v2, v7}, LH2/k;->g(Ljava/util/ArrayList;Ljava/lang/String;)LH2/i$b;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v1

    .line 1182
    if-eqz v1, :cond_25

    .line 1183
    .line 1184
    iget-object v1, v1, LH2/i$b;->b:Lq2/x;

    .line 1185
    .line 1186
    iget-object v1, v1, Lq2/x;->k:Ljava/lang/String;

    .line 1187
    .line 1188
    const/4 v6, 0x3

    .line 1189
    invoke-static {v1, v6}, Lt2/a0;->U(Ljava/lang/String;I)Ljava/lang/String;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v1

    .line 1193
    invoke-virtual {v0, v1}, Lq2/x$b;->U(Ljava/lang/String;)Lq2/x$b;

    .line 1194
    .line 1195
    .line 1196
    invoke-static {v1}, Lq2/K;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v1

    .line 1200
    goto :goto_1d

    .line 1201
    :cond_25
    const/4 v1, 0x0

    .line 1202
    :goto_1d
    if-nez v1, :cond_26

    .line 1203
    .line 1204
    const-string v1, "text/vtt"

    .line 1205
    .line 1206
    :cond_26
    invoke-virtual {v0, v1}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v1

    .line 1210
    invoke-virtual {v1, v14}, Lq2/x$b;->r0(Lq2/J;)Lq2/x$b;

    .line 1211
    .line 1212
    .line 1213
    if-eqz v12, :cond_27

    .line 1214
    .line 1215
    new-instance v1, LH2/i$a;

    .line 1216
    .line 1217
    invoke-virtual {v0}, Lq2/x$b;->P()Lq2/x;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v0

    .line 1221
    invoke-direct {v1, v12, v0, v7, v13}, LH2/i$a;-><init>(Landroid/net/Uri;Lq2/x;Ljava/lang/String;Ljava/lang/String;)V

    .line 1222
    .line 1223
    .line 1224
    move-object/from16 v6, v32

    .line 1225
    .line 1226
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1227
    .line 1228
    .line 1229
    goto :goto_1a

    .line 1230
    :cond_27
    move-object/from16 v6, v32

    .line 1231
    .line 1232
    const-string v0, "HlsPlaylistParser"

    .line 1233
    .line 1234
    const-string v1, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"

    .line 1235
    .line 1236
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1237
    .line 1238
    .line 1239
    goto/16 :goto_1a

    .line 1240
    .line 1241
    :goto_1e
    add-int/lit8 v4, v4, 0x1

    .line 1242
    .line 1243
    move-object/from16 v1, p1

    .line 1244
    .line 1245
    move-object/from16 v33, v3

    .line 1246
    .line 1247
    move-object/from16 v35, v5

    .line 1248
    .line 1249
    move-object/from16 v32, v6

    .line 1250
    .line 1251
    move-object/from16 v3, v20

    .line 1252
    .line 1253
    const/4 v12, 0x0

    .line 1254
    goto/16 :goto_13

    .line 1255
    .line 1256
    :cond_28
    move-object/from16 p0, v0

    .line 1257
    .line 1258
    move-object/from16 v20, v3

    .line 1259
    .line 1260
    move-object/from16 v6, v32

    .line 1261
    .line 1262
    move-object/from16 v3, v33

    .line 1263
    .line 1264
    if-eqz v10, :cond_29

    .line 1265
    .line 1266
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 1267
    .line 1268
    move-object v9, v0

    .line 1269
    goto :goto_1f

    .line 1270
    :cond_29
    move-object/from16 v9, p0

    .line 1271
    .line 1272
    :goto_1f
    new-instance v0, LH2/i;

    .line 1273
    .line 1274
    move-object/from16 v1, p1

    .line 1275
    .line 1276
    move-object v5, v3

    .line 1277
    move-object/from16 v7, v17

    .line 1278
    .line 1279
    move-object/from16 v3, v20

    .line 1280
    .line 1281
    move-object/from16 v2, v21

    .line 1282
    .line 1283
    move-object/from16 v12, v30

    .line 1284
    .line 1285
    move/from16 v10, v31

    .line 1286
    .line 1287
    move-object/from16 v4, v34

    .line 1288
    .line 1289
    invoke-direct/range {v0 .. v12}, LH2/i;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lq2/x;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;)V

    .line 1290
    .line 1291
    .line 1292
    return-object v0

    .line 1293
    :sswitch_data_0
    .sparse-switch
        -0x392db8c5 -> :sswitch_3
        -0x13dc6572 -> :sswitch_2
        0x3bba3b6 -> :sswitch_1
        0x4de1c5b -> :sswitch_0
    .end sparse-switch

    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static s(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string p1, "YES"

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_0
    return p2
.end method

.method private static t(Ljava/lang/String;Ljava/util/regex/Pattern;D)D
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 23
    .line 24
    .line 25
    move-result-wide p0

    .line 26
    return-wide p0

    .line 27
    :cond_0
    return-wide p2
.end method

.method private static u(Ljava/lang/String;Ljava/util/regex/Pattern;I)I
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_0
    return p2
.end method

.method private static v(Ljava/lang/String;Ljava/util/regex/Pattern;J)J
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 23
    .line 24
    .line 25
    move-result-wide p0

    .line 26
    return-wide p0

    .line 27
    :cond_0
    return-wide p2
.end method

.method private static w(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    move-object p2, p0

    .line 21
    check-cast p2, Ljava/lang/String;

    .line 22
    .line 23
    :cond_0
    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-nez p0, :cond_2

    .line 28
    .line 29
    if-nez p2, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-static {p2, p3}, LH2/k;->D(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_2
    :goto_0
    return-object p2
.end method

.method private static x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0, p2}, LH2/k;->w(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method private static y(Ljava/lang/String;Ljava/util/Map;)I
    .locals 1

    .line 1
    sget-object v0, LH2/k;->U:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    invoke-static {p0, v0, p1}, LH2/k;->x(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    return v0

    .line 15
    :cond_0
    const-string p1, ","

    .line 16
    .line 17
    invoke-static {p0, p1}, Lt2/a0;->v1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "public.accessibility.describes-video"

    .line 22
    .line 23
    invoke-static {p0, p1}, Lt2/a0;->u([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    const/16 v0, 0x200

    .line 30
    .line 31
    :cond_1
    const-string p1, "public.accessibility.transcribes-spoken-dialog"

    .line 32
    .line 33
    invoke-static {p0, p1}, Lt2/a0;->u([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    or-int/lit16 v0, v0, 0x1000

    .line 40
    .line 41
    :cond_2
    const-string p1, "public.accessibility.describes-music-and-sound"

    .line 42
    .line 43
    invoke-static {p0, p1}, Lt2/a0;->u([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    or-int/lit16 v0, v0, 0x400

    .line 50
    .line 51
    :cond_3
    const-string p1, "public.easy-to-read"

    .line 52
    .line 53
    invoke-static {p0, p1}, Lt2/a0;->u([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_4

    .line 58
    .line 59
    or-int/lit16 p0, v0, 0x2000

    .line 60
    .line 61
    return p0

    .line 62
    :cond_4
    return v0
.end method

.method private static z(Ljava/lang/String;)I
    .locals 3

    .line 1
    sget-object v0, LH2/k;->X:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, LH2/k;->s(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sget-object v2, LH2/k;->Y:Ljava/util/regex/Pattern;

    .line 9
    .line 10
    invoke-static {p0, v2, v1}, LH2/k;->s(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    or-int/lit8 v0, v0, 0x2

    .line 17
    .line 18
    :cond_0
    sget-object v2, LH2/k;->W:Ljava/util/regex/Pattern;

    .line 19
    .line 20
    invoke-static {p0, v2, v1}, LH2/k;->s(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    or-int/lit8 p0, v0, 0x4

    .line 27
    .line 28
    return p0

    .line 29
    :cond_1
    return v0
.end method


# virtual methods
.method public bridge synthetic a(Landroid/net/Uri;Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LH2/k;->j(Landroid/net/Uri;Ljava/io/InputStream;)LH2/j;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public j(Landroid/net/Uri;Ljava/io/InputStream;)LH2/j;
    .locals 4

    .line 1
    new-instance v0, Ljava/io/BufferedReader;

    .line 2
    .line 3
    new-instance v1, Ljava/io/InputStreamReader;

    .line 4
    .line 5
    invoke-direct {v1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Ljava/util/ArrayDeque;

    .line 12
    .line 13
    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-static {v0}, LH2/k;->b(Ljava/io/BufferedReader;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_5

    .line 22
    .line 23
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_4

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-string v3, "#EXT-X-STREAM-INF"

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    invoke-interface {p2, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    new-instance v1, LH2/k$b;

    .line 52
    .line 53
    invoke-direct {v1, p2, v0}, LH2/k$b;-><init>(Ljava/util/Queue;Ljava/io/BufferedReader;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {v1, p1}, LH2/k;->r(LH2/k$b;Ljava/lang/String;)LH2/i;

    .line 61
    .line 62
    .line 63
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    invoke-static {v0}, Lt2/a0;->p(Ljava/io/Closeable;)V

    .line 65
    .line 66
    .line 67
    return-object p1

    .line 68
    :catchall_0
    move-exception p1

    .line 69
    goto :goto_2

    .line 70
    :cond_1
    :try_start_1
    const-string v3, "#EXT-X-TARGETDURATION"

    .line 71
    .line 72
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-nez v3, :cond_3

    .line 77
    .line 78
    const-string v3, "#EXT-X-MEDIA-SEQUENCE"

    .line 79
    .line 80
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-nez v3, :cond_3

    .line 85
    .line 86
    const-string v3, "#EXTINF"

    .line 87
    .line 88
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-nez v3, :cond_3

    .line 93
    .line 94
    const-string v3, "#EXT-X-KEY"

    .line 95
    .line 96
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-nez v3, :cond_3

    .line 101
    .line 102
    const-string v3, "#EXT-X-BYTERANGE"

    .line 103
    .line 104
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-nez v3, :cond_3

    .line 109
    .line 110
    const-string v3, "#EXT-X-DISCONTINUITY"

    .line 111
    .line 112
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-nez v3, :cond_3

    .line 117
    .line 118
    const-string v3, "#EXT-X-DISCONTINUITY-SEQUENCE"

    .line 119
    .line 120
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-nez v3, :cond_3

    .line 125
    .line 126
    const-string v3, "#EXT-X-ENDLIST"

    .line 127
    .line 128
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_2

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_2
    invoke-interface {p2, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_3
    :goto_1
    invoke-interface {p2, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    iget-object v1, p0, LH2/k;->a:LH2/i;

    .line 143
    .line 144
    iget-object v2, p0, LH2/k;->b:LH2/f;

    .line 145
    .line 146
    new-instance v3, LH2/k$b;

    .line 147
    .line 148
    invoke-direct {v3, p2, v0}, LH2/k$b;-><init>(Ljava/util/Queue;Ljava/io/BufferedReader;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-static {v1, v2, v3, p1}, LH2/k;->q(LH2/i;LH2/f;LH2/k$b;Ljava/lang/String;)LH2/f;

    .line 156
    .line 157
    .line 158
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 159
    invoke-static {v0}, Lt2/a0;->p(Ljava/io/Closeable;)V

    .line 160
    .line 161
    .line 162
    return-object p1

    .line 163
    :cond_4
    invoke-static {v0}, Lt2/a0;->p(Ljava/io/Closeable;)V

    .line 164
    .line 165
    .line 166
    const-string p1, "Failed to parse the playlist, could not identify any tags."

    .line 167
    .line 168
    invoke-static {p1, v2}, Lq2/L;->c(Ljava/lang/String;Ljava/lang/Throwable;)Lq2/L;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    throw p1

    .line 173
    :cond_5
    :try_start_2
    const-string p1, "Input does not start with the #EXTM3U header."

    .line 174
    .line 175
    invoke-static {p1, v2}, Lq2/L;->c(Ljava/lang/String;Ljava/lang/Throwable;)Lq2/L;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 180
    :goto_2
    invoke-static {v0}, Lt2/a0;->p(Ljava/io/Closeable;)V

    .line 181
    .line 182
    .line 183
    throw p1
.end method
