.class public abstract Landroidx/compose/ui/focus/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Lq0/m;)Z
    .locals 10

    .line 1
    const/16 v0, 0x400

    .line 2
    .line 3
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    move-object v3, v2

    .line 13
    :goto_0
    const/16 v4, 0x10

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    const/4 v6, 0x0

    .line 17
    if-eqz v1, :cond_8

    .line 18
    .line 19
    instance-of v7, v1, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 20
    .line 21
    if-eqz v7, :cond_1

    .line 22
    .line 23
    check-cast v1, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusTargetNode;->J1()Landroidx/compose/ui/focus/i;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {p0}, Landroidx/compose/ui/focus/i;->i()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    invoke-static {v1, v6, v5, v2}, Landroidx/compose/ui/focus/o;->j0(Landroidx/compose/ui/focus/o;IILjava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0

    .line 40
    :cond_0
    sget-object p0, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/compose/ui/focus/d$a;->b()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    sget-object v0, Landroidx/compose/ui/focus/m$a;->a:Landroidx/compose/ui/focus/m$a;

    .line 47
    .line 48
    invoke-static {v1, p0, v0}, Landroidx/compose/ui/focus/w;->k(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    return p0

    .line 53
    :cond_1
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    and-int/2addr v7, v0

    .line 58
    if-eqz v7, :cond_7

    .line 59
    .line 60
    instance-of v7, v1, LK0/m;

    .line 61
    .line 62
    if-eqz v7, :cond_7

    .line 63
    .line 64
    move-object v7, v1

    .line 65
    check-cast v7, LK0/m;

    .line 66
    .line 67
    invoke-virtual {v7}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    move v8, v6

    .line 72
    :goto_1
    if-eqz v7, :cond_6

    .line 73
    .line 74
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    and-int/2addr v9, v0

    .line 79
    if-eqz v9, :cond_5

    .line 80
    .line 81
    add-int/lit8 v8, v8, 0x1

    .line 82
    .line 83
    if-ne v8, v5, :cond_2

    .line 84
    .line 85
    move-object v1, v7

    .line 86
    goto :goto_2

    .line 87
    :cond_2
    if-nez v3, :cond_3

    .line 88
    .line 89
    new-instance v3, La0/c;

    .line 90
    .line 91
    new-array v9, v4, [Landroidx/compose/ui/e$c;

    .line 92
    .line 93
    invoke-direct {v3, v9, v6}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 94
    .line 95
    .line 96
    :cond_3
    if-eqz v1, :cond_4

    .line 97
    .line 98
    invoke-virtual {v3, v1}, La0/c;->c(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-object v1, v2

    .line 102
    :cond_4
    invoke-virtual {v3, v7}, La0/c;->c(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    :cond_5
    :goto_2
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    goto :goto_1

    .line 110
    :cond_6
    if-ne v8, v5, :cond_7

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_7
    invoke-static {v3}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    goto :goto_0

    .line 118
    :cond_8
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-nez v1, :cond_9

    .line 127
    .line 128
    const-string v1, "visitChildren called on an unattached node"

    .line 129
    .line 130
    invoke-static {v1}, LH0/a;->b(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_9
    new-instance v1, La0/c;

    .line 134
    .line 135
    new-array v3, v4, [Landroidx/compose/ui/e$c;

    .line 136
    .line 137
    invoke-direct {v1, v3, v6}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 138
    .line 139
    .line 140
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    if-nez v3, :cond_a

    .line 149
    .line 150
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {v1, p0, v6}, LK0/k;->a(La0/c;Landroidx/compose/ui/e$c;Z)V

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_a
    invoke-virtual {v1, v3}, La0/c;->c(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    :cond_b
    :goto_3
    invoke-virtual {v1}, La0/c;->p()I

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    if-eqz p0, :cond_16

    .line 166
    .line 167
    invoke-virtual {v1}, La0/c;->p()I

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    sub-int/2addr p0, v5

    .line 172
    invoke-virtual {v1, p0}, La0/c;->y(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    check-cast p0, Landroidx/compose/ui/e$c;

    .line 177
    .line 178
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    and-int/2addr v3, v0

    .line 183
    if-nez v3, :cond_c

    .line 184
    .line 185
    invoke-static {v1, p0, v6}, LK0/k;->a(La0/c;Landroidx/compose/ui/e$c;Z)V

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_c
    :goto_4
    if-eqz p0, :cond_b

    .line 190
    .line 191
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    and-int/2addr v3, v0

    .line 196
    if-eqz v3, :cond_15

    .line 197
    .line 198
    move-object v3, v2

    .line 199
    :goto_5
    if-eqz p0, :cond_b

    .line 200
    .line 201
    instance-of v7, p0, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 202
    .line 203
    if-eqz v7, :cond_e

    .line 204
    .line 205
    check-cast p0, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 206
    .line 207
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->J1()Landroidx/compose/ui/focus/i;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-interface {v0}, Landroidx/compose/ui/focus/i;->i()Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-eqz v0, :cond_d

    .line 216
    .line 217
    invoke-static {p0, v6, v5, v2}, Landroidx/compose/ui/focus/o;->j0(Landroidx/compose/ui/focus/o;IILjava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result p0

    .line 221
    return p0

    .line 222
    :cond_d
    sget-object v0, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    .line 223
    .line 224
    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->b()I

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    sget-object v1, Landroidx/compose/ui/focus/m$a;->a:Landroidx/compose/ui/focus/m$a;

    .line 229
    .line 230
    invoke-static {p0, v0, v1}, Landroidx/compose/ui/focus/w;->k(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z

    .line 231
    .line 232
    .line 233
    move-result p0

    .line 234
    return p0

    .line 235
    :cond_e
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 236
    .line 237
    .line 238
    move-result v7

    .line 239
    and-int/2addr v7, v0

    .line 240
    if-eqz v7, :cond_14

    .line 241
    .line 242
    instance-of v7, p0, LK0/m;

    .line 243
    .line 244
    if-eqz v7, :cond_14

    .line 245
    .line 246
    move-object v7, p0

    .line 247
    check-cast v7, LK0/m;

    .line 248
    .line 249
    invoke-virtual {v7}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 250
    .line 251
    .line 252
    move-result-object v7

    .line 253
    move v8, v6

    .line 254
    :goto_6
    if-eqz v7, :cond_13

    .line 255
    .line 256
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 257
    .line 258
    .line 259
    move-result v9

    .line 260
    and-int/2addr v9, v0

    .line 261
    if-eqz v9, :cond_12

    .line 262
    .line 263
    add-int/lit8 v8, v8, 0x1

    .line 264
    .line 265
    if-ne v8, v5, :cond_f

    .line 266
    .line 267
    move-object p0, v7

    .line 268
    goto :goto_7

    .line 269
    :cond_f
    if-nez v3, :cond_10

    .line 270
    .line 271
    new-instance v3, La0/c;

    .line 272
    .line 273
    new-array v9, v4, [Landroidx/compose/ui/e$c;

    .line 274
    .line 275
    invoke-direct {v3, v9, v6}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 276
    .line 277
    .line 278
    :cond_10
    if-eqz p0, :cond_11

    .line 279
    .line 280
    invoke-virtual {v3, p0}, La0/c;->c(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-object p0, v2

    .line 284
    :cond_11
    invoke-virtual {v3, v7}, La0/c;->c(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    :cond_12
    :goto_7
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    goto :goto_6

    .line 292
    :cond_13
    if-ne v8, v5, :cond_14

    .line 293
    .line 294
    goto :goto_5

    .line 295
    :cond_14
    invoke-static {v3}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    goto :goto_5

    .line 300
    :cond_15
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    goto :goto_4

    .line 305
    :cond_16
    return v6
.end method
