.class final Lwe/b$b;
.super Lqf/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwe/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic d:Lwe/b;


# direct methods
.method public constructor <init>(Lwe/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwe/b$b;->d:Lwe/b;

    .line 2
    .line 3
    invoke-static {p1}, Lwe/b;->P0(Lwe/b;)Lpf/n;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p0, p1}, Lqf/b;-><init>(Lpf/n;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public bridge synthetic I()Lye/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwe/b$b;->J()Lwe/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public J()Lwe/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lwe/b$b;->d:Lwe/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public getParameters()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lwe/b$b;->d:Lwe/b;

    .line 2
    .line 3
    invoke-static {v0}, Lwe/b;->O0(Lwe/b;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public bridge synthetic p()Lye/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwe/b$b;->J()Lwe/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public q()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method protected r()Ljava/util/Collection;
    .locals 9

    .line 1
    iget-object v0, p0, Lwe/b$b;->d:Lwe/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lwe/b;->U0()Lwe/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lwe/f$a;->f:Lwe/f$a;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lwe/b;->M0()LXe/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object v2, Lwe/f$b;->f:Lwe/f$b;

    .line 25
    .line 26
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-static {}, Lwe/b;->N0()LXe/b;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v2, LXe/b;

    .line 37
    .line 38
    sget-object v3, Lve/o;->A:LXe/c;

    .line 39
    .line 40
    iget-object v4, p0, Lwe/b$b;->d:Lwe/b;

    .line 41
    .line 42
    invoke-virtual {v4}, Lwe/b;->Q0()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    invoke-virtual {v1, v4}, Lwe/f;->c(I)LXe/f;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-direct {v2, v3, v1}, LXe/b;-><init>(LXe/c;LXe/f;)V

    .line 51
    .line 52
    .line 53
    filled-new-array {v0, v2}, [LXe/b;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    goto :goto_0

    .line 62
    :cond_1
    sget-object v1, Lwe/f$d;->f:Lwe/f$d;

    .line 63
    .line 64
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_2

    .line 69
    .line 70
    invoke-static {}, Lwe/b;->M0()LXe/b;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    goto :goto_0

    .line 79
    :cond_2
    sget-object v2, Lwe/f$c;->f:Lwe/f$c;

    .line 80
    .line 81
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_6

    .line 86
    .line 87
    invoke-static {}, Lwe/b;->N0()LXe/b;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    new-instance v2, LXe/b;

    .line 92
    .line 93
    sget-object v3, Lve/o;->s:LXe/c;

    .line 94
    .line 95
    iget-object v4, p0, Lwe/b$b;->d:Lwe/b;

    .line 96
    .line 97
    invoke-virtual {v4}, Lwe/b;->Q0()I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    invoke-virtual {v1, v4}, Lwe/f;->c(I)LXe/f;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-direct {v2, v3, v1}, LXe/b;-><init>(LXe/c;LXe/f;)V

    .line 106
    .line 107
    .line 108
    filled-new-array {v0, v2}, [LXe/b;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    :goto_0
    iget-object v1, p0, Lwe/b$b;->d:Lwe/b;

    .line 117
    .line 118
    invoke-static {v1}, Lwe/b;->L0(Lwe/b;)Lye/N;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-interface {v1}, Lye/N;->b()Lye/H;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    new-instance v2, Ljava/util/ArrayList;

    .line 127
    .line 128
    const/16 v3, 0xa

    .line 129
    .line 130
    invoke-static {v0, v3}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 135
    .line 136
    .line 137
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    if-eqz v4, :cond_5

    .line 146
    .line 147
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    check-cast v4, LXe/b;

    .line 152
    .line 153
    invoke-static {v1, v4}, Lye/y;->b(Lye/H;LXe/b;)Lye/e;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    if-eqz v5, :cond_4

    .line 158
    .line 159
    invoke-virtual {p0}, Lwe/b$b;->getParameters()Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-interface {v5}, Lye/h;->l()Lqf/v0;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    invoke-interface {v6}, Lqf/v0;->getParameters()Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    invoke-static {v4, v6}, LUd/u;->U0(Ljava/util/List;I)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    new-instance v6, Ljava/util/ArrayList;

    .line 180
    .line 181
    invoke-static {v4, v3}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 186
    .line 187
    .line 188
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    if-eqz v7, :cond_3

    .line 197
    .line 198
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    check-cast v7, Lye/m0;

    .line 203
    .line 204
    new-instance v8, Lqf/D0;

    .line 205
    .line 206
    invoke-interface {v7}, Lye/h;->p()Lqf/d0;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    invoke-direct {v8, v7}, Lqf/D0;-><init>(Lqf/S;)V

    .line 211
    .line 212
    .line 213
    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_3
    sget-object v4, Lqf/r0;->b:Lqf/r0$a;

    .line 218
    .line 219
    invoke-virtual {v4}, Lqf/r0$a;->k()Lqf/r0;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    invoke-static {v4, v5, v6}, Lqf/V;->h(Lqf/r0;Lye/e;Ljava/util/List;)Lqf/d0;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 232
    .line 233
    new-instance v1, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    const-string v2, "Built-in class "

    .line 239
    .line 240
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    const-string v2, " not found"

    .line 247
    .line 248
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw v0

    .line 263
    :cond_5
    invoke-static {v2}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    return-object v0

    .line 268
    :cond_6
    const/4 v0, 0x1

    .line 269
    const/4 v1, 0x0

    .line 270
    invoke-static {v1, v0, v1}, LBf/a;->b(Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 271
    .line 272
    .line 273
    new-instance v0, LTd/k;

    .line 274
    .line 275
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 276
    .line 277
    .line 278
    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwe/b$b;->J()Lwe/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lwe/b;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method protected v()Lye/k0;
    .locals 1

    .line 1
    sget-object v0, Lye/k0$a;->a:Lye/k0$a;

    .line 2
    .line 3
    return-object v0
.end method
