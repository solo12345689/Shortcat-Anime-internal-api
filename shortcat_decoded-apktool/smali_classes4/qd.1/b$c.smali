.class public final Lqd/b$c;
.super LM3/h;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqd/b;-><init>(LM3/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Lqd/b;


# direct methods
.method constructor <init>(LM3/q;Lqd/b;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lqd/b$c;->d:Lqd/b;

    .line 2
    .line 3
    invoke-direct {p0, p1}, LM3/h;-><init>(LM3/q;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "UPDATE OR ABORT `assets` SET `key` = ?,`type` = ?,`id` = ?,`url` = ?,`headers` = ?,`extra_request_headers` = ?,`metadata` = ?,`download_time` = ?,`relative_path` = ?,`hash` = ?,`hash_type` = ?,`expected_hash` = ?,`marked_for_deletion` = ? WHERE `id` = ?"

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic i(LS3/k;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lrd/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lqd/b$c;->l(LS3/k;Lrd/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected l(LS3/k;Lrd/a;)V
    .locals 4

    .line 1
    const-string v0, "statement"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "entity"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lrd/a;->j()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-interface {p1, v1}, LS3/i;->I1(I)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-interface {p1, v1, v0}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {p2}, Lrd/a;->r()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v1, 0x2

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    invoke-interface {p1, v1}, LS3/i;->I1(I)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-interface {p1, v1, v0}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_1
    const/4 v0, 0x3

    .line 40
    invoke-virtual {p2}, Lrd/a;->i()J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    invoke-interface {p1, v0, v1, v2}, LS3/i;->m1(IJ)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Lrd/a;->s()Landroid/net/Uri;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v1, p0, Lqd/b$c;->d:Lqd/b;

    .line 52
    .line 53
    invoke-static {v1}, Lqd/b;->r(Lqd/b;)Lpd/b;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1, v0}, Lpd/b;->m(Landroid/net/Uri;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const/4 v1, 0x4

    .line 62
    if-nez v0, :cond_2

    .line 63
    .line 64
    invoke-interface {p1, v1}, LS3/i;->I1(I)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    invoke-interface {p1, v1, v0}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :goto_2
    invoke-virtual {p2}, Lrd/a;->h()Lorg/json/JSONObject;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object v1, p0, Lqd/b$c;->d:Lqd/b;

    .line 76
    .line 77
    invoke-static {v1}, Lqd/b;->r(Lqd/b;)Lpd/b;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1, v0}, Lpd/b;->f(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const/4 v1, 0x5

    .line 86
    if-nez v0, :cond_3

    .line 87
    .line 88
    invoke-interface {p1, v1}, LS3/i;->I1(I)V

    .line 89
    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_3
    invoke-interface {p1, v1, v0}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :goto_3
    invoke-virtual {p2}, Lrd/a;->d()Lorg/json/JSONObject;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iget-object v1, p0, Lqd/b$c;->d:Lqd/b;

    .line 100
    .line 101
    invoke-static {v1}, Lqd/b;->r(Lqd/b;)Lpd/b;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1, v0}, Lpd/b;->f(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const/4 v1, 0x6

    .line 110
    if-nez v0, :cond_4

    .line 111
    .line 112
    invoke-interface {p1, v1}, LS3/i;->I1(I)V

    .line 113
    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_4
    invoke-interface {p1, v1, v0}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :goto_4
    invoke-virtual {p2}, Lrd/a;->l()Lorg/json/JSONObject;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    iget-object v1, p0, Lqd/b$c;->d:Lqd/b;

    .line 124
    .line 125
    invoke-static {v1}, Lqd/b;->r(Lqd/b;)Lpd/b;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v1, v0}, Lpd/b;->f(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    const/4 v1, 0x7

    .line 134
    if-nez v0, :cond_5

    .line 135
    .line 136
    invoke-interface {p1, v1}, LS3/i;->I1(I)V

    .line 137
    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_5
    invoke-interface {p1, v1, v0}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :goto_5
    invoke-virtual {p2}, Lrd/a;->a()Ljava/util/Date;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    iget-object v1, p0, Lqd/b$c;->d:Lqd/b;

    .line 148
    .line 149
    invoke-static {v1}, Lqd/b;->r(Lqd/b;)Lpd/b;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v1, v0}, Lpd/b;->b(Ljava/util/Date;)Ljava/lang/Long;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    const/16 v1, 0x8

    .line 158
    .line 159
    if-nez v0, :cond_6

    .line 160
    .line 161
    invoke-interface {p1, v1}, LS3/i;->I1(I)V

    .line 162
    .line 163
    .line 164
    goto :goto_6

    .line 165
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 166
    .line 167
    .line 168
    move-result-wide v2

    .line 169
    invoke-interface {p1, v1, v2, v3}, LS3/i;->m1(IJ)V

    .line 170
    .line 171
    .line 172
    :goto_6
    invoke-virtual {p2}, Lrd/a;->m()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    const/16 v1, 0x9

    .line 177
    .line 178
    if-nez v0, :cond_7

    .line 179
    .line 180
    invoke-interface {p1, v1}, LS3/i;->I1(I)V

    .line 181
    .line 182
    .line 183
    goto :goto_7

    .line 184
    :cond_7
    invoke-interface {p1, v1, v0}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 185
    .line 186
    .line 187
    :goto_7
    invoke-virtual {p2}, Lrd/a;->f()[B

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    const/16 v1, 0xa

    .line 192
    .line 193
    if-nez v0, :cond_8

    .line 194
    .line 195
    invoke-interface {p1, v1}, LS3/i;->I1(I)V

    .line 196
    .line 197
    .line 198
    goto :goto_8

    .line 199
    :cond_8
    invoke-interface {p1, v1, v0}, LS3/i;->p1(I[B)V

    .line 200
    .line 201
    .line 202
    :goto_8
    iget-object v0, p0, Lqd/b$c;->d:Lqd/b;

    .line 203
    .line 204
    invoke-static {v0}, Lqd/b;->r(Lqd/b;)Lpd/b;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {p2}, Lrd/a;->g()Lsd/a;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-virtual {v0, v1}, Lpd/b;->c(Lsd/a;)I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    const/16 v1, 0xb

    .line 217
    .line 218
    int-to-long v2, v0

    .line 219
    invoke-interface {p1, v1, v2, v3}, LS3/i;->m1(IJ)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p2}, Lrd/a;->c()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    const/16 v1, 0xc

    .line 227
    .line 228
    if-nez v0, :cond_9

    .line 229
    .line 230
    invoke-interface {p1, v1}, LS3/i;->I1(I)V

    .line 231
    .line 232
    .line 233
    goto :goto_9

    .line 234
    :cond_9
    invoke-interface {p1, v1, v0}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 235
    .line 236
    .line 237
    :goto_9
    invoke-virtual {p2}, Lrd/a;->k()Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    const/16 v1, 0xd

    .line 242
    .line 243
    int-to-long v2, v0

    .line 244
    invoke-interface {p1, v1, v2, v3}, LS3/i;->m1(IJ)V

    .line 245
    .line 246
    .line 247
    const/16 v0, 0xe

    .line 248
    .line 249
    invoke-virtual {p2}, Lrd/a;->i()J

    .line 250
    .line 251
    .line 252
    move-result-wide v1

    .line 253
    invoke-interface {p1, v0, v1, v2}, LS3/i;->m1(IJ)V

    .line 254
    .line 255
    .line 256
    return-void
.end method
