.class Lcom/facebook/react/uimanager/j0$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/j0;->z(IJJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Ljava/util/ArrayList;

.field final synthetic c:Ljava/util/ArrayDeque;

.field final synthetic d:Ljava/util/ArrayList;

.field final synthetic e:J

.field final synthetic f:J

.field final synthetic g:J

.field final synthetic h:J

.field final synthetic i:Lcom/facebook/react/uimanager/j0;


# direct methods
.method constructor <init>(Lcom/facebook/react/uimanager/j0;ILjava/util/ArrayList;Ljava/util/ArrayDeque;Ljava/util/ArrayList;JJJJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/uimanager/j0$a;->i:Lcom/facebook/react/uimanager/j0;

    .line 2
    .line 3
    iput p2, p0, Lcom/facebook/react/uimanager/j0$a;->a:I

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/uimanager/j0$a;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/facebook/react/uimanager/j0$a;->c:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/facebook/react/uimanager/j0$a;->d:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-wide p6, p0, Lcom/facebook/react/uimanager/j0$a;->e:J

    .line 12
    .line 13
    iput-wide p8, p0, Lcom/facebook/react/uimanager/j0$a;->f:J

    .line 14
    .line 15
    iput-wide p10, p0, Lcom/facebook/react/uimanager/j0$a;->g:J

    .line 16
    .line 17
    iput-wide p12, p0, Lcom/facebook/react/uimanager/j0$a;->h:J

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public run()V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "DispatchUI"

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    invoke-static {v2, v3, v0}, LU7/b;->a(JLjava/lang/String;)LU7/b$a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v4, "BatchId"

    .line 12
    .line 13
    iget v5, v1, Lcom/facebook/react/uimanager/j0$a;->a:I

    .line 14
    .line 15
    invoke-virtual {v0, v4, v5}, LU7/b$a;->a(Ljava/lang/String;I)LU7/b$a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, LU7/b$a;->c()V

    .line 20
    .line 21
    .line 22
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    iget-object v0, v1, Lcom/facebook/react/uimanager/j0$a;->b:Ljava/util/ArrayList;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    move-object v7, v0

    .line 45
    check-cast v7, Lcom/facebook/react/uimanager/j0$g;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 46
    .line 47
    :try_start_1
    invoke-interface {v7}, Lcom/facebook/react/uimanager/j0$g;->d()V
    :try_end_1
    .catch Lcom/facebook/react/bridge/RetryableMountingLayerException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    :try_start_2
    invoke-static {}, Lcom/facebook/react/uimanager/j0;->x()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-static {v7, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_1
    move-exception v0

    .line 61
    goto/16 :goto_4

    .line 62
    .line 63
    :catch_0
    move-exception v0

    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :catch_1
    move-exception v0

    .line 67
    invoke-interface {v7}, Lcom/facebook/react/uimanager/j0$g;->a()I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    if-nez v8, :cond_0

    .line 72
    .line 73
    invoke-interface {v7}, Lcom/facebook/react/uimanager/j0$g;->c()V

    .line 74
    .line 75
    .line 76
    iget-object v0, v1, Lcom/facebook/react/uimanager/j0$a;->i:Lcom/facebook/react/uimanager/j0;

    .line 77
    .line 78
    invoke-static {v0}, Lcom/facebook/react/uimanager/j0;->l(Lcom/facebook/react/uimanager/j0;)Ljava/util/ArrayList;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    invoke-static {}, Lcom/facebook/react/uimanager/j0;->x()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    new-instance v8, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    .line 91
    .line 92
    invoke-direct {v8, v0}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v7, v8}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    iget-object v0, v1, Lcom/facebook/react/uimanager/j0$a;->c:Ljava/util/ArrayDeque;

    .line 100
    .line 101
    if-eqz v0, :cond_2

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    if-eqz v6, :cond_2

    .line 112
    .line 113
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    check-cast v6, Lcom/facebook/react/uimanager/j0$r;

    .line 118
    .line 119
    invoke-interface {v6}, Lcom/facebook/react/uimanager/j0$r;->b()V

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_2
    iget-object v0, v1, Lcom/facebook/react/uimanager/j0$a;->d:Ljava/util/ArrayList;

    .line 124
    .line 125
    if-eqz v0, :cond_3

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_3

    .line 136
    .line 137
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    check-cast v6, Lcom/facebook/react/uimanager/j0$r;

    .line 142
    .line 143
    invoke-interface {v6}, Lcom/facebook/react/uimanager/j0$r;->b()V

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_3
    iget-object v0, v1, Lcom/facebook/react/uimanager/j0$a;->i:Lcom/facebook/react/uimanager/j0;

    .line 148
    .line 149
    invoke-static {v0}, Lcom/facebook/react/uimanager/j0;->b(Lcom/facebook/react/uimanager/j0;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_4

    .line 154
    .line 155
    iget-object v0, v1, Lcom/facebook/react/uimanager/j0$a;->i:Lcom/facebook/react/uimanager/j0;

    .line 156
    .line 157
    invoke-static {v0}, Lcom/facebook/react/uimanager/j0;->i(Lcom/facebook/react/uimanager/j0;)J

    .line 158
    .line 159
    .line 160
    move-result-wide v6

    .line 161
    cmp-long v0, v6, v2

    .line 162
    .line 163
    if-nez v0, :cond_4

    .line 164
    .line 165
    iget-object v0, v1, Lcom/facebook/react/uimanager/j0$a;->i:Lcom/facebook/react/uimanager/j0;

    .line 166
    .line 167
    iget-wide v6, v1, Lcom/facebook/react/uimanager/j0$a;->e:J

    .line 168
    .line 169
    invoke-static {v0, v6, v7}, Lcom/facebook/react/uimanager/j0;->q(Lcom/facebook/react/uimanager/j0;J)V

    .line 170
    .line 171
    .line 172
    iget-object v0, v1, Lcom/facebook/react/uimanager/j0$a;->i:Lcom/facebook/react/uimanager/j0;

    .line 173
    .line 174
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 175
    .line 176
    .line 177
    move-result-wide v6

    .line 178
    invoke-static {v0, v6, v7}, Lcom/facebook/react/uimanager/j0;->p(Lcom/facebook/react/uimanager/j0;J)V

    .line 179
    .line 180
    .line 181
    iget-object v0, v1, Lcom/facebook/react/uimanager/j0$a;->i:Lcom/facebook/react/uimanager/j0;

    .line 182
    .line 183
    iget-wide v6, v1, Lcom/facebook/react/uimanager/j0$a;->f:J

    .line 184
    .line 185
    invoke-static {v0, v6, v7}, Lcom/facebook/react/uimanager/j0;->s(Lcom/facebook/react/uimanager/j0;J)V

    .line 186
    .line 187
    .line 188
    iget-object v0, v1, Lcom/facebook/react/uimanager/j0$a;->i:Lcom/facebook/react/uimanager/j0;

    .line 189
    .line 190
    iget-wide v6, v1, Lcom/facebook/react/uimanager/j0$a;->g:J

    .line 191
    .line 192
    invoke-static {v0, v6, v7}, Lcom/facebook/react/uimanager/j0;->r(Lcom/facebook/react/uimanager/j0;J)V

    .line 193
    .line 194
    .line 195
    iget-object v0, v1, Lcom/facebook/react/uimanager/j0$a;->i:Lcom/facebook/react/uimanager/j0;

    .line 196
    .line 197
    invoke-static {v0, v4, v5}, Lcom/facebook/react/uimanager/j0;->u(Lcom/facebook/react/uimanager/j0;J)V

    .line 198
    .line 199
    .line 200
    iget-object v0, v1, Lcom/facebook/react/uimanager/j0$a;->i:Lcom/facebook/react/uimanager/j0;

    .line 201
    .line 202
    invoke-static {v0}, Lcom/facebook/react/uimanager/j0;->h(Lcom/facebook/react/uimanager/j0;)J

    .line 203
    .line 204
    .line 205
    move-result-wide v4

    .line 206
    invoke-static {v0, v4, v5}, Lcom/facebook/react/uimanager/j0;->t(Lcom/facebook/react/uimanager/j0;J)V

    .line 207
    .line 208
    .line 209
    iget-object v0, v1, Lcom/facebook/react/uimanager/j0$a;->i:Lcom/facebook/react/uimanager/j0;

    .line 210
    .line 211
    iget-wide v4, v1, Lcom/facebook/react/uimanager/j0$a;->h:J

    .line 212
    .line 213
    invoke-static {v0, v4, v5}, Lcom/facebook/react/uimanager/j0;->v(Lcom/facebook/react/uimanager/j0;J)V

    .line 214
    .line 215
    .line 216
    const-string v8, "delayBeforeDispatchViewUpdates"

    .line 217
    .line 218
    iget-object v0, v1, Lcom/facebook/react/uimanager/j0$a;->i:Lcom/facebook/react/uimanager/j0;

    .line 219
    .line 220
    invoke-static {v0}, Lcom/facebook/react/uimanager/j0;->i(Lcom/facebook/react/uimanager/j0;)J

    .line 221
    .line 222
    .line 223
    move-result-wide v4

    .line 224
    const-wide/32 v12, 0xf4240

    .line 225
    .line 226
    .line 227
    mul-long v10, v4, v12

    .line 228
    .line 229
    const-wide/16 v6, 0x0

    .line 230
    .line 231
    const/4 v9, 0x0

    .line 232
    invoke-static/range {v6 .. v11}, LU7/a;->b(JLjava/lang/String;IJ)V

    .line 233
    .line 234
    .line 235
    const-string v16, "delayBeforeDispatchViewUpdates"

    .line 236
    .line 237
    iget-object v0, v1, Lcom/facebook/react/uimanager/j0$a;->i:Lcom/facebook/react/uimanager/j0;

    .line 238
    .line 239
    invoke-static {v0}, Lcom/facebook/react/uimanager/j0;->j(Lcom/facebook/react/uimanager/j0;)J

    .line 240
    .line 241
    .line 242
    move-result-wide v4

    .line 243
    mul-long v18, v4, v12

    .line 244
    .line 245
    const-wide/16 v14, 0x0

    .line 246
    .line 247
    const/16 v17, 0x0

    .line 248
    .line 249
    invoke-static/range {v14 .. v19}, LU7/a;->h(JLjava/lang/String;IJ)V

    .line 250
    .line 251
    .line 252
    const-string v6, "delayBeforeBatchRunStart"

    .line 253
    .line 254
    iget-object v0, v1, Lcom/facebook/react/uimanager/j0$a;->i:Lcom/facebook/react/uimanager/j0;

    .line 255
    .line 256
    invoke-static {v0}, Lcom/facebook/react/uimanager/j0;->j(Lcom/facebook/react/uimanager/j0;)J

    .line 257
    .line 258
    .line 259
    move-result-wide v4

    .line 260
    mul-long v8, v4, v12

    .line 261
    .line 262
    const-wide/16 v4, 0x0

    .line 263
    .line 264
    const/4 v7, 0x0

    .line 265
    invoke-static/range {v4 .. v9}, LU7/a;->b(JLjava/lang/String;IJ)V

    .line 266
    .line 267
    .line 268
    const-string v16, "delayBeforeBatchRunStart"

    .line 269
    .line 270
    iget-object v0, v1, Lcom/facebook/react/uimanager/j0$a;->i:Lcom/facebook/react/uimanager/j0;

    .line 271
    .line 272
    invoke-static {v0}, Lcom/facebook/react/uimanager/j0;->k(Lcom/facebook/react/uimanager/j0;)J

    .line 273
    .line 274
    .line 275
    move-result-wide v4

    .line 276
    mul-long v18, v4, v12

    .line 277
    .line 278
    const-wide/16 v14, 0x0

    .line 279
    .line 280
    const/16 v17, 0x0

    .line 281
    .line 282
    invoke-static/range {v14 .. v19}, LU7/a;->h(JLjava/lang/String;IJ)V

    .line 283
    .line 284
    .line 285
    :cond_4
    iget-object v0, v1, Lcom/facebook/react/uimanager/j0$a;->i:Lcom/facebook/react/uimanager/j0;

    .line 286
    .line 287
    invoke-static {v0}, Lcom/facebook/react/uimanager/j0;->d(Lcom/facebook/react/uimanager/j0;)Lcom/facebook/react/uimanager/y;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/y;->e()V

    .line 292
    .line 293
    .line 294
    iget-object v0, v1, Lcom/facebook/react/uimanager/j0$a;->i:Lcom/facebook/react/uimanager/j0;

    .line 295
    .line 296
    invoke-static {v0}, Lcom/facebook/react/uimanager/j0;->m(Lcom/facebook/react/uimanager/j0;)LD7/a;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    if-eqz v0, :cond_5

    .line 301
    .line 302
    iget-object v0, v1, Lcom/facebook/react/uimanager/j0$a;->i:Lcom/facebook/react/uimanager/j0;

    .line 303
    .line 304
    invoke-static {v0}, Lcom/facebook/react/uimanager/j0;->m(Lcom/facebook/react/uimanager/j0;)LD7/a;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-interface {v0}, LD7/a;->a()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 309
    .line 310
    .line 311
    :cond_5
    invoke-static {v2, v3}, LU7/a;->i(J)V

    .line 312
    .line 313
    .line 314
    return-void

    .line 315
    :goto_3
    :try_start_3
    iget-object v4, v1, Lcom/facebook/react/uimanager/j0$a;->i:Lcom/facebook/react/uimanager/j0;

    .line 316
    .line 317
    const/4 v5, 0x1

    .line 318
    invoke-static {v4, v5}, Lcom/facebook/react/uimanager/j0;->n(Lcom/facebook/react/uimanager/j0;Z)V

    .line 319
    .line 320
    .line 321
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 322
    :goto_4
    invoke-static {v2, v3}, LU7/a;->i(J)V

    .line 323
    .line 324
    .line 325
    throw v0
.end method
