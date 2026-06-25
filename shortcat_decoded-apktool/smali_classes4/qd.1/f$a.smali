.class public final Lqd/f$a;
.super LM3/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqd/f;-><init>(LM3/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Lqd/f;


# direct methods
.method constructor <init>(LM3/q;Lqd/f;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lqd/f$a;->d:Lqd/f;

    .line 2
    .line 3
    invoke-direct {p0, p1}, LM3/i;-><init>(LM3/q;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "INSERT OR ABORT INTO `updates` (`id`,`commit_time`,`runtime_version`,`scope_key`,`manifest`,`url`,`headers`,`launch_asset_id`,`status`,`keep`,`last_accessed`,`successful_launch_count`,`failed_launch_count`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)"

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic i(LS3/k;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lrd/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lqd/f$a;->l(LS3/k;Lrd/d;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected l(LS3/k;Lrd/d;)V
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
    iget-object v0, p0, Lqd/f$a;->d:Lqd/f;

    .line 12
    .line 13
    invoke-static {v0}, Lqd/f;->y(Lqd/f;)Lpd/b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p2}, Lrd/d;->d()Ljava/util/UUID;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Lpd/b;->n(Ljava/util/UUID;)[B

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-interface {p1, v1, v0}, LS3/i;->p1(I[B)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lqd/f$a;->d:Lqd/f;

    .line 30
    .line 31
    invoke-static {v0}, Lqd/f;->y(Lqd/f;)Lpd/b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p2}, Lrd/d;->b()Ljava/util/Date;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Lpd/b;->b(Ljava/util/Date;)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const/4 v1, 0x2

    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    invoke-interface {p1, v1}, LS3/i;->I1(I)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    invoke-interface {p1, v1, v2, v3}, LS3/i;->m1(IJ)V

    .line 55
    .line 56
    .line 57
    :goto_0
    const/4 v0, 0x3

    .line 58
    invoke-virtual {p2}, Lrd/d;->k()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {p1, v0, v1}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/4 v0, 0x4

    .line 66
    invoke-virtual {p2}, Lrd/d;->l()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-interface {p1, v0, v1}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lqd/f$a;->d:Lqd/f;

    .line 74
    .line 75
    invoke-static {v0}, Lqd/f;->y(Lqd/f;)Lpd/b;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p2}, Lrd/d;->i()Lorg/json/JSONObject;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v0, v1}, Lpd/b;->f(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const/4 v1, 0x5

    .line 88
    if-nez v0, :cond_1

    .line 89
    .line 90
    invoke-interface {p1, v1}, LS3/i;->I1(I)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    invoke-interface {p1, v1, v0}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :goto_1
    invoke-virtual {p2}, Lrd/d;->o()Landroid/net/Uri;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iget-object v1, p0, Lqd/f$a;->d:Lqd/f;

    .line 102
    .line 103
    invoke-static {v1}, Lqd/f;->y(Lqd/f;)Lpd/b;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1, v0}, Lpd/b;->m(Landroid/net/Uri;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    const/4 v1, 0x6

    .line 112
    if-nez v0, :cond_2

    .line 113
    .line 114
    invoke-interface {p1, v1}, LS3/i;->I1(I)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_2
    invoke-interface {p1, v1, v0}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 119
    .line 120
    .line 121
    :goto_2
    invoke-virtual {p2}, Lrd/d;->j()Ljava/util/Map;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iget-object v1, p0, Lqd/f$a;->d:Lqd/f;

    .line 126
    .line 127
    invoke-static {v1}, Lqd/f;->y(Lqd/f;)Lpd/b;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v1, v0}, Lpd/b;->i(Ljava/util/Map;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    const/4 v1, 0x7

    .line 136
    if-nez v0, :cond_3

    .line 137
    .line 138
    invoke-interface {p1, v1}, LS3/i;->I1(I)V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_3
    invoke-interface {p1, v1, v0}, LS3/i;->Z0(ILjava/lang/String;)V

    .line 143
    .line 144
    .line 145
    :goto_3
    invoke-virtual {p2}, Lrd/d;->g()Ljava/lang/Long;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    const/16 v1, 0x8

    .line 150
    .line 151
    if-nez v0, :cond_4

    .line 152
    .line 153
    invoke-interface {p1, v1}, LS3/i;->I1(I)V

    .line 154
    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 158
    .line 159
    .line 160
    move-result-wide v2

    .line 161
    invoke-interface {p1, v1, v2, v3}, LS3/i;->m1(IJ)V

    .line 162
    .line 163
    .line 164
    :goto_4
    iget-object v0, p0, Lqd/f$a;->d:Lqd/f;

    .line 165
    .line 166
    invoke-static {v0}, Lqd/f;->y(Lqd/f;)Lpd/b;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {p2}, Lrd/d;->m()Lsd/b;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-virtual {v0, v1}, Lpd/b;->h(Lsd/b;)I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    const/16 v1, 0x9

    .line 179
    .line 180
    int-to-long v2, v0

    .line 181
    invoke-interface {p1, v1, v2, v3}, LS3/i;->m1(IJ)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p2}, Lrd/d;->e()Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    const/16 v1, 0xa

    .line 189
    .line 190
    int-to-long v2, v0

    .line 191
    invoke-interface {p1, v1, v2, v3}, LS3/i;->m1(IJ)V

    .line 192
    .line 193
    .line 194
    iget-object v0, p0, Lqd/f$a;->d:Lqd/f;

    .line 195
    .line 196
    invoke-static {v0}, Lqd/f;->y(Lqd/f;)Lpd/b;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {p2}, Lrd/d;->f()Ljava/util/Date;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-virtual {v0, v1}, Lpd/b;->b(Ljava/util/Date;)Ljava/lang/Long;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    const/16 v1, 0xb

    .line 209
    .line 210
    if-nez v0, :cond_5

    .line 211
    .line 212
    invoke-interface {p1, v1}, LS3/i;->I1(I)V

    .line 213
    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 217
    .line 218
    .line 219
    move-result-wide v2

    .line 220
    invoke-interface {p1, v1, v2, v3}, LS3/i;->m1(IJ)V

    .line 221
    .line 222
    .line 223
    :goto_5
    invoke-virtual {p2}, Lrd/d;->n()I

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    int-to-long v0, v0

    .line 228
    const/16 v2, 0xc

    .line 229
    .line 230
    invoke-interface {p1, v2, v0, v1}, LS3/i;->m1(IJ)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p2}, Lrd/d;->c()I

    .line 234
    .line 235
    .line 236
    move-result p2

    .line 237
    int-to-long v0, p2

    .line 238
    const/16 p2, 0xd

    .line 239
    .line 240
    invoke-interface {p1, p2, v0, v1}, LS3/i;->m1(IJ)V

    .line 241
    .line 242
    .line 243
    return-void
.end method
