.class Llh/d;
.super Ljava/lang/Object;


# instance fields
.field private A:[[[S

.field private B:[[[S

.field private a:Ljava/security/SecureRandom;

.field private b:Llh/j;

.field private c:Llh/f;

.field d:Llh/a;

.field private e:I

.field private f:I

.field private g:I

.field private h:[B

.field private i:[B

.field private j:[[S

.field private k:[[S

.field private l:[[S

.field private m:[[S

.field private n:[[S

.field private o:[[[S

.field private p:[[[S

.field private q:[[[S

.field private r:[[[S

.field private s:[[[S

.field private t:[[[S

.field private u:[[[S

.field private v:[[[S

.field private w:[[[S

.field private x:[[[S

.field private y:[[[S

.field private z:[[[S


# direct methods
.method public constructor <init>(Llh/f;[B[B)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Llh/a;

    .line 5
    .line 6
    invoke-direct {v0}, Llh/a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Llh/d;->d:Llh/a;

    .line 10
    .line 11
    iput-object p1, p0, Llh/d;->c:Llh/f;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Llh/d;->a:Ljava/security/SecureRandom;

    .line 15
    .line 16
    invoke-virtual {p1}, Llh/f;->i()Llh/j;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Llh/d;->b:Llh/j;

    .line 21
    .line 22
    iput-object p2, p0, Llh/d;->i:[B

    .line 23
    .line 24
    iput-object p3, p0, Llh/d;->h:[B

    .line 25
    .line 26
    iget-object p1, p0, Llh/d;->c:Llh/f;

    .line 27
    .line 28
    invoke-virtual {p1}, Llh/f;->h()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iput p1, p0, Llh/d;->e:I

    .line 33
    .line 34
    iget-object p1, p0, Llh/d;->c:Llh/f;

    .line 35
    .line 36
    invoke-virtual {p1}, Llh/f;->f()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iput p1, p0, Llh/d;->f:I

    .line 41
    .line 42
    iget-object p1, p0, Llh/d;->c:Llh/f;

    .line 43
    .line 44
    invoke-virtual {p1}, Llh/f;->g()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iput p1, p0, Llh/d;->g:I

    .line 49
    .line 50
    return-void
.end method

.method private a()V
    .locals 6

    .line 1
    iget-object v0, p0, Llh/d;->v:[[[S

    .line 2
    .line 3
    invoke-static {v0}, Llh/i;->b([[[S)[[[S

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Llh/d;->o:[[[S

    .line 8
    .line 9
    iget v0, p0, Llh/d;->f:I

    .line 10
    .line 11
    new-array v0, v0, [[[S

    .line 12
    .line 13
    iput-object v0, p0, Llh/d;->p:[[[S

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    move v1, v0

    .line 17
    :goto_0
    iget v2, p0, Llh/d;->f:I

    .line 18
    .line 19
    if-ge v1, v2, :cond_0

    .line 20
    .line 21
    iget-object v2, p0, Llh/d;->p:[[[S

    .line 22
    .line 23
    iget-object v3, p0, Llh/d;->d:Llh/a;

    .line 24
    .line 25
    iget-object v4, p0, Llh/d;->v:[[[S

    .line 26
    .line 27
    aget-object v4, v4, v1

    .line 28
    .line 29
    invoke-virtual {v3, v4}, Llh/a;->b([[S)[[S

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    aput-object v3, v2, v1

    .line 34
    .line 35
    iget-object v2, p0, Llh/d;->p:[[[S

    .line 36
    .line 37
    iget-object v3, p0, Llh/d;->d:Llh/a;

    .line 38
    .line 39
    aget-object v4, v2, v1

    .line 40
    .line 41
    iget-object v5, p0, Llh/d;->k:[[S

    .line 42
    .line 43
    invoke-virtual {v3, v4, v5}, Llh/a;->c([[S[[S)[[S

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    aput-object v3, v2, v1

    .line 48
    .line 49
    iget-object v2, p0, Llh/d;->p:[[[S

    .line 50
    .line 51
    iget-object v3, p0, Llh/d;->d:Llh/a;

    .line 52
    .line 53
    aget-object v4, v2, v1

    .line 54
    .line 55
    iget-object v5, p0, Llh/d;->w:[[[S

    .line 56
    .line 57
    aget-object v5, v5, v1

    .line 58
    .line 59
    invoke-virtual {v3, v4, v5}, Llh/a;->a([[S[[S)[[S

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    aput-object v3, v2, v1

    .line 64
    .line 65
    add-int/lit8 v1, v1, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget v1, p0, Llh/d;->g:I

    .line 69
    .line 70
    new-array v2, v1, [[[S

    .line 71
    .line 72
    iput-object v2, p0, Llh/d;->r:[[[S

    .line 73
    .line 74
    new-array v2, v1, [[[S

    .line 75
    .line 76
    iput-object v2, p0, Llh/d;->s:[[[S

    .line 77
    .line 78
    new-array v2, v1, [[[S

    .line 79
    .line 80
    iput-object v2, p0, Llh/d;->t:[[[S

    .line 81
    .line 82
    new-array v1, v1, [[[S

    .line 83
    .line 84
    iput-object v1, p0, Llh/d;->u:[[[S

    .line 85
    .line 86
    iget-object v1, p0, Llh/d;->x:[[[S

    .line 87
    .line 88
    invoke-static {v1}, Llh/i;->b([[[S)[[[S

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iput-object v1, p0, Llh/d;->q:[[[S

    .line 93
    .line 94
    :goto_1
    iget v1, p0, Llh/d;->g:I

    .line 95
    .line 96
    if-ge v0, v1, :cond_1

    .line 97
    .line 98
    iget-object v1, p0, Llh/d;->d:Llh/a;

    .line 99
    .line 100
    iget-object v2, p0, Llh/d;->x:[[[S

    .line 101
    .line 102
    aget-object v2, v2, v0

    .line 103
    .line 104
    invoke-virtual {v1, v2}, Llh/a;->b([[S)[[S

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    iget-object v2, p0, Llh/d;->r:[[[S

    .line 109
    .line 110
    iget-object v3, p0, Llh/d;->d:Llh/a;

    .line 111
    .line 112
    iget-object v4, p0, Llh/d;->k:[[S

    .line 113
    .line 114
    invoke-virtual {v3, v1, v4}, Llh/a;->c([[S[[S)[[S

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    aput-object v3, v2, v0

    .line 119
    .line 120
    iget-object v2, p0, Llh/d;->r:[[[S

    .line 121
    .line 122
    iget-object v3, p0, Llh/d;->d:Llh/a;

    .line 123
    .line 124
    aget-object v4, v2, v0

    .line 125
    .line 126
    iget-object v5, p0, Llh/d;->y:[[[S

    .line 127
    .line 128
    aget-object v5, v5, v0

    .line 129
    .line 130
    invoke-virtual {v3, v4, v5}, Llh/a;->a([[S[[S)[[S

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    aput-object v3, v2, v0

    .line 135
    .line 136
    iget-object v2, p0, Llh/d;->s:[[[S

    .line 137
    .line 138
    iget-object v3, p0, Llh/d;->d:Llh/a;

    .line 139
    .line 140
    iget-object v4, p0, Llh/d;->n:[[S

    .line 141
    .line 142
    invoke-virtual {v3, v1, v4}, Llh/a;->c([[S[[S)[[S

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    aput-object v1, v2, v0

    .line 147
    .line 148
    iget-object v1, p0, Llh/d;->d:Llh/a;

    .line 149
    .line 150
    iget-object v2, p0, Llh/d;->y:[[[S

    .line 151
    .line 152
    aget-object v2, v2, v0

    .line 153
    .line 154
    iget-object v3, p0, Llh/d;->m:[[S

    .line 155
    .line 156
    invoke-virtual {v1, v2, v3}, Llh/a;->c([[S[[S)[[S

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    iget-object v2, p0, Llh/d;->s:[[[S

    .line 161
    .line 162
    iget-object v3, p0, Llh/d;->d:Llh/a;

    .line 163
    .line 164
    aget-object v4, v2, v0

    .line 165
    .line 166
    invoke-virtual {v3, v4, v1}, Llh/a;->a([[S[[S)[[S

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    aput-object v1, v2, v0

    .line 171
    .line 172
    iget-object v1, p0, Llh/d;->s:[[[S

    .line 173
    .line 174
    iget-object v2, p0, Llh/d;->d:Llh/a;

    .line 175
    .line 176
    aget-object v3, v1, v0

    .line 177
    .line 178
    iget-object v4, p0, Llh/d;->z:[[[S

    .line 179
    .line 180
    aget-object v4, v4, v0

    .line 181
    .line 182
    invoke-virtual {v2, v3, v4}, Llh/a;->a([[S[[S)[[S

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    aput-object v2, v1, v0

    .line 187
    .line 188
    iget-object v1, p0, Llh/d;->d:Llh/a;

    .line 189
    .line 190
    iget-object v2, p0, Llh/d;->x:[[[S

    .line 191
    .line 192
    aget-object v2, v2, v0

    .line 193
    .line 194
    iget-object v3, p0, Llh/d;->k:[[S

    .line 195
    .line 196
    invoke-virtual {v1, v2, v3}, Llh/a;->c([[S[[S)[[S

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    iget-object v2, p0, Llh/d;->d:Llh/a;

    .line 201
    .line 202
    iget-object v3, p0, Llh/d;->y:[[[S

    .line 203
    .line 204
    aget-object v3, v3, v0

    .line 205
    .line 206
    invoke-virtual {v2, v1, v3}, Llh/a;->a([[S[[S)[[S

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    iget-object v2, p0, Llh/d;->d:Llh/a;

    .line 211
    .line 212
    iget-object v3, p0, Llh/d;->k:[[S

    .line 213
    .line 214
    invoke-virtual {v2, v3}, Llh/a;->f([[S)[[S

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    iget-object v3, p0, Llh/d;->t:[[[S

    .line 219
    .line 220
    iget-object v4, p0, Llh/d;->d:Llh/a;

    .line 221
    .line 222
    invoke-virtual {v4, v2, v1}, Llh/a;->c([[S[[S)[[S

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    aput-object v1, v3, v0

    .line 227
    .line 228
    iget-object v1, p0, Llh/d;->t:[[[S

    .line 229
    .line 230
    iget-object v3, p0, Llh/d;->d:Llh/a;

    .line 231
    .line 232
    aget-object v4, v1, v0

    .line 233
    .line 234
    iget-object v5, p0, Llh/d;->A:[[[S

    .line 235
    .line 236
    aget-object v5, v5, v0

    .line 237
    .line 238
    invoke-virtual {v3, v4, v5}, Llh/a;->a([[S[[S)[[S

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    aput-object v3, v1, v0

    .line 243
    .line 244
    iget-object v1, p0, Llh/d;->t:[[[S

    .line 245
    .line 246
    iget-object v3, p0, Llh/d;->d:Llh/a;

    .line 247
    .line 248
    aget-object v4, v1, v0

    .line 249
    .line 250
    invoke-virtual {v3, v4}, Llh/a;->e([[S)[[S

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    aput-object v3, v1, v0

    .line 255
    .line 256
    iget-object v1, p0, Llh/d;->u:[[[S

    .line 257
    .line 258
    iget-object v3, p0, Llh/d;->d:Llh/a;

    .line 259
    .line 260
    iget-object v4, p0, Llh/d;->s:[[[S

    .line 261
    .line 262
    aget-object v4, v4, v0

    .line 263
    .line 264
    invoke-virtual {v3, v2, v4}, Llh/a;->c([[S[[S)[[S

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    aput-object v2, v1, v0

    .line 269
    .line 270
    iget-object v1, p0, Llh/d;->d:Llh/a;

    .line 271
    .line 272
    iget-object v2, p0, Llh/d;->y:[[[S

    .line 273
    .line 274
    aget-object v2, v2, v0

    .line 275
    .line 276
    invoke-virtual {v1, v2}, Llh/a;->f([[S)[[S

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    iget-object v3, p0, Llh/d;->n:[[S

    .line 281
    .line 282
    invoke-virtual {v1, v2, v3}, Llh/a;->c([[S[[S)[[S

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    iget-object v2, p0, Llh/d;->u:[[[S

    .line 287
    .line 288
    iget-object v3, p0, Llh/d;->d:Llh/a;

    .line 289
    .line 290
    aget-object v4, v2, v0

    .line 291
    .line 292
    invoke-virtual {v3, v4, v1}, Llh/a;->a([[S[[S)[[S

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    aput-object v1, v2, v0

    .line 297
    .line 298
    iget-object v1, p0, Llh/d;->d:Llh/a;

    .line 299
    .line 300
    iget-object v2, p0, Llh/d;->A:[[[S

    .line 301
    .line 302
    aget-object v2, v2, v0

    .line 303
    .line 304
    invoke-virtual {v1, v2}, Llh/a;->b([[S)[[S

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    iget-object v2, p0, Llh/d;->d:Llh/a;

    .line 309
    .line 310
    iget-object v3, p0, Llh/d;->m:[[S

    .line 311
    .line 312
    invoke-virtual {v2, v1, v3}, Llh/a;->c([[S[[S)[[S

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    iget-object v2, p0, Llh/d;->u:[[[S

    .line 317
    .line 318
    iget-object v3, p0, Llh/d;->d:Llh/a;

    .line 319
    .line 320
    aget-object v4, v2, v0

    .line 321
    .line 322
    invoke-virtual {v3, v4, v1}, Llh/a;->a([[S[[S)[[S

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    aput-object v1, v2, v0

    .line 327
    .line 328
    iget-object v1, p0, Llh/d;->u:[[[S

    .line 329
    .line 330
    iget-object v2, p0, Llh/d;->d:Llh/a;

    .line 331
    .line 332
    aget-object v3, v1, v0

    .line 333
    .line 334
    iget-object v4, p0, Llh/d;->B:[[[S

    .line 335
    .line 336
    aget-object v4, v4, v0

    .line 337
    .line 338
    invoke-virtual {v2, v3, v4}, Llh/a;->a([[S[[S)[[S

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    aput-object v2, v1, v0

    .line 343
    .line 344
    add-int/lit8 v0, v0, 0x1

    .line 345
    .line 346
    goto/16 :goto_1

    .line 347
    .line 348
    :cond_1
    return-void
.end method

.method private b()V
    .locals 3

    .line 1
    iget-object v0, p0, Llh/d;->d:Llh/a;

    .line 2
    .line 3
    iget-object v1, p0, Llh/d;->k:[[S

    .line 4
    .line 5
    iget-object v2, p0, Llh/d;->m:[[S

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Llh/a;->c([[S[[S)[[S

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Llh/d;->d:Llh/a;

    .line 12
    .line 13
    iget-object v2, p0, Llh/d;->l:[[S

    .line 14
    .line 15
    invoke-virtual {v1, v0, v2}, Llh/a;->a([[S[[S)[[S

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Llh/d;->n:[[S

    .line 20
    .line 21
    return-void
.end method

.method private c()V
    .locals 4

    .line 1
    new-instance v0, Llh/c;

    .line 2
    .line 3
    iget-object v1, p0, Llh/d;->h:[B

    .line 4
    .line 5
    iget-object v2, p0, Llh/d;->c:Llh/f;

    .line 6
    .line 7
    invoke-virtual {v2}, Llh/f;->a()LFg/j;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v0, v1, v2}, Llh/c;-><init>([BLFg/j;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Llh/c;

    .line 15
    .line 16
    iget-object v2, p0, Llh/d;->i:[B

    .line 17
    .line 18
    iget-object v3, p0, Llh/d;->c:Llh/f;

    .line 19
    .line 20
    invoke-virtual {v3}, Llh/f;->a()LFg/j;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-direct {v1, v2, v3}, Llh/c;-><init>([BLFg/j;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v0}, Llh/d;->f(Ljava/security/SecureRandom;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0}, Llh/d;->b()V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0, v1}, Llh/d;->e(Ljava/security/SecureRandom;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Llh/d;->d:Llh/a;

    .line 37
    .line 38
    iget-object v1, p0, Llh/d;->j:[[S

    .line 39
    .line 40
    iget-object v2, p0, Llh/d;->x:[[[S

    .line 41
    .line 42
    iget-object v3, p0, Llh/d;->v:[[[S

    .line 43
    .line 44
    invoke-virtual {v0, v1, v2, v3}, Llh/a;->d([[S[[[S[[[S)[[[S

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Llh/d;->v:[[[S

    .line 49
    .line 50
    iget-object v0, p0, Llh/d;->d:Llh/a;

    .line 51
    .line 52
    iget-object v1, p0, Llh/d;->j:[[S

    .line 53
    .line 54
    iget-object v2, p0, Llh/d;->y:[[[S

    .line 55
    .line 56
    iget-object v3, p0, Llh/d;->w:[[[S

    .line 57
    .line 58
    invoke-virtual {v0, v1, v2, v3}, Llh/a;->d([[S[[[S[[[S)[[[S

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, Llh/d;->w:[[[S

    .line 63
    .line 64
    invoke-direct {p0}, Llh/d;->a()V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method private e(Ljava/security/SecureRandom;)V
    .locals 5

    .line 1
    iget v0, p0, Llh/d;->f:I

    .line 2
    .line 3
    iget v1, p0, Llh/d;->e:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-static {p1, v0, v1, v1, v2}, Llh/i;->c(Ljava/security/SecureRandom;IIIZ)[[[S

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Llh/d;->v:[[[S

    .line 11
    .line 12
    iget v0, p0, Llh/d;->f:I

    .line 13
    .line 14
    iget v1, p0, Llh/d;->e:I

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static {p1, v0, v1, v0, v3}, Llh/i;->c(Ljava/security/SecureRandom;IIIZ)[[[S

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Llh/d;->w:[[[S

    .line 22
    .line 23
    iget v0, p0, Llh/d;->g:I

    .line 24
    .line 25
    iget v1, p0, Llh/d;->e:I

    .line 26
    .line 27
    invoke-static {p1, v0, v1, v1, v2}, Llh/i;->c(Ljava/security/SecureRandom;IIIZ)[[[S

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Llh/d;->x:[[[S

    .line 32
    .line 33
    iget v0, p0, Llh/d;->g:I

    .line 34
    .line 35
    iget v1, p0, Llh/d;->e:I

    .line 36
    .line 37
    iget v4, p0, Llh/d;->f:I

    .line 38
    .line 39
    invoke-static {p1, v0, v1, v4, v3}, Llh/i;->c(Ljava/security/SecureRandom;IIIZ)[[[S

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Llh/d;->y:[[[S

    .line 44
    .line 45
    iget v0, p0, Llh/d;->g:I

    .line 46
    .line 47
    iget v1, p0, Llh/d;->e:I

    .line 48
    .line 49
    invoke-static {p1, v0, v1, v0, v3}, Llh/i;->c(Ljava/security/SecureRandom;IIIZ)[[[S

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Llh/d;->z:[[[S

    .line 54
    .line 55
    iget v0, p0, Llh/d;->g:I

    .line 56
    .line 57
    iget v1, p0, Llh/d;->f:I

    .line 58
    .line 59
    invoke-static {p1, v0, v1, v1, v2}, Llh/i;->c(Ljava/security/SecureRandom;IIIZ)[[[S

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, Llh/d;->A:[[[S

    .line 64
    .line 65
    iget v0, p0, Llh/d;->g:I

    .line 66
    .line 67
    iget v1, p0, Llh/d;->f:I

    .line 68
    .line 69
    invoke-static {p1, v0, v1, v0, v3}, Llh/i;->c(Ljava/security/SecureRandom;IIIZ)[[[S

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Llh/d;->B:[[[S

    .line 74
    .line 75
    return-void
.end method

.method private f(Ljava/security/SecureRandom;)V
    .locals 2

    .line 1
    iget v0, p0, Llh/d;->f:I

    .line 2
    .line 3
    iget v1, p0, Llh/d;->g:I

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, Llh/i;->d(Ljava/security/SecureRandom;II)[[S

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Llh/d;->j:[[S

    .line 10
    .line 11
    iget v0, p0, Llh/d;->e:I

    .line 12
    .line 13
    iget v1, p0, Llh/d;->f:I

    .line 14
    .line 15
    invoke-static {p1, v0, v1}, Llh/i;->d(Ljava/security/SecureRandom;II)[[S

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Llh/d;->k:[[S

    .line 20
    .line 21
    iget v0, p0, Llh/d;->e:I

    .line 22
    .line 23
    iget v1, p0, Llh/d;->g:I

    .line 24
    .line 25
    invoke-static {p1, v0, v1}, Llh/i;->d(Ljava/security/SecureRandom;II)[[S

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Llh/d;->l:[[S

    .line 30
    .line 31
    iget v0, p0, Llh/d;->f:I

    .line 32
    .line 33
    iget v1, p0, Llh/d;->g:I

    .line 34
    .line 35
    invoke-static {p1, v0, v1}, Llh/i;->d(Ljava/security/SecureRandom;II)[[S

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Llh/d;->m:[[S

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method d()Llh/g;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Llh/d;->h:[B

    .line 4
    .line 5
    invoke-static {v1}, LOh/a;->f([B)[B

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iput-object v1, v0, Llh/d;->h:[B

    .line 10
    .line 11
    iget-object v1, v0, Llh/d;->i:[B

    .line 12
    .line 13
    invoke-static {v1}, LOh/a;->f([B)[B

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iput-object v1, v0, Llh/d;->i:[B

    .line 18
    .line 19
    invoke-direct {v0}, Llh/d;->c()V

    .line 20
    .line 21
    .line 22
    new-instance v2, Llh/g;

    .line 23
    .line 24
    iget-object v3, v0, Llh/d;->c:Llh/f;

    .line 25
    .line 26
    iget-object v4, v0, Llh/d;->h:[B

    .line 27
    .line 28
    iget-object v5, v0, Llh/d;->j:[[S

    .line 29
    .line 30
    iget-object v6, v0, Llh/d;->k:[[S

    .line 31
    .line 32
    iget-object v7, v0, Llh/d;->m:[[S

    .line 33
    .line 34
    iget-object v8, v0, Llh/d;->n:[[S

    .line 35
    .line 36
    iget-object v9, v0, Llh/d;->o:[[[S

    .line 37
    .line 38
    iget-object v10, v0, Llh/d;->p:[[[S

    .line 39
    .line 40
    iget-object v11, v0, Llh/d;->q:[[[S

    .line 41
    .line 42
    iget-object v12, v0, Llh/d;->r:[[[S

    .line 43
    .line 44
    iget-object v13, v0, Llh/d;->s:[[[S

    .line 45
    .line 46
    iget-object v14, v0, Llh/d;->t:[[[S

    .line 47
    .line 48
    iget-object v15, v0, Llh/d;->u:[[[S

    .line 49
    .line 50
    const/16 v16, 0x0

    .line 51
    .line 52
    invoke-direct/range {v2 .. v16}, Llh/g;-><init>(Llh/f;[B[[S[[S[[S[[S[[[S[[[S[[[S[[[S[[[S[[[S[[[S[B)V

    .line 53
    .line 54
    .line 55
    return-object v2
.end method
