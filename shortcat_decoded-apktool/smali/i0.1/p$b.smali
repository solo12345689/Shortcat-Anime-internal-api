.class final Li0/p$b;
.super Lkotlin/coroutines/jvm/internal/k;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li0/p;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field c:I

.field d:I

.field private synthetic e:Ljava/lang/Object;

.field final synthetic f:Li0/p;


# direct methods
.method constructor <init>(Li0/p;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li0/p$b;->f:Li0/p;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILZd/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(LCf/k;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Li0/p$b;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Li0/p$b;

    .line 6
    .line 7
    sget-object p2, LTd/L;->a:LTd/L;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Li0/p$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 2

    .line 1
    new-instance v0, Li0/p$b;

    .line 2
    .line 3
    iget-object v1, p0, Li0/p$b;->f:Li0/p;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Li0/p$b;-><init>(Li0/p;LZd/e;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Li0/p$b;->e:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LCf/k;

    .line 2
    .line 3
    check-cast p2, LZd/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Li0/p$b;->a(LCf/k;LZd/e;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Li0/p$b;->d:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v6, 0x3

    .line 11
    const/4 v7, 0x2

    .line 12
    const/16 v8, 0x40

    .line 13
    .line 14
    const/4 v9, 0x0

    .line 15
    const-wide/16 v10, 0x0

    .line 16
    .line 17
    const/4 v12, 0x1

    .line 18
    if-eqz v2, :cond_3

    .line 19
    .line 20
    if-eq v2, v12, :cond_2

    .line 21
    .line 22
    if-eq v2, v7, :cond_1

    .line 23
    .line 24
    if-ne v2, v6, :cond_0

    .line 25
    .line 26
    iget v2, v0, Li0/p$b;->b:I

    .line 27
    .line 28
    iget-object v7, v0, Li0/p$b;->e:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v7, LCf/k;

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const-wide/16 v18, 0x1

    .line 36
    .line 37
    goto/16 :goto_6

    .line 38
    .line 39
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v1

    .line 47
    :cond_1
    iget v2, v0, Li0/p$b;->b:I

    .line 48
    .line 49
    iget-object v13, v0, Li0/p$b;->e:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v13, LCf/k;

    .line 52
    .line 53
    invoke-static/range {p1 .. p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const-wide/16 v18, 0x1

    .line 57
    .line 58
    goto/16 :goto_3

    .line 59
    .line 60
    :cond_2
    iget v2, v0, Li0/p$b;->c:I

    .line 61
    .line 62
    iget v13, v0, Li0/p$b;->b:I

    .line 63
    .line 64
    iget-object v14, v0, Li0/p$b;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v14, [J

    .line 67
    .line 68
    iget-object v15, v0, Li0/p$b;->e:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v15, LCf/k;

    .line 71
    .line 72
    invoke-static/range {p1 .. p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    const-wide/16 v18, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    invoke-static/range {p1 .. p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-object v2, v0, Li0/p$b;->e:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, LCf/k;

    .line 84
    .line 85
    iget-object v13, v0, Li0/p$b;->f:Li0/p;

    .line 86
    .line 87
    invoke-static {v13}, Li0/p;->b(Li0/p;)[J

    .line 88
    .line 89
    .line 90
    move-result-object v13

    .line 91
    if-eqz v13, :cond_6

    .line 92
    .line 93
    array-length v14, v13

    .line 94
    move-object v15, v2

    .line 95
    move v2, v14

    .line 96
    move-object v14, v13

    .line 97
    move v13, v9

    .line 98
    :goto_0
    if-ge v13, v2, :cond_5

    .line 99
    .line 100
    aget-wide v16, v14, v13

    .line 101
    .line 102
    const-wide/16 v18, 0x1

    .line 103
    .line 104
    invoke-static/range {v16 .. v17}, Lkotlin/coroutines/jvm/internal/b;->e(J)Ljava/lang/Long;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    iput-object v15, v0, Li0/p$b;->e:Ljava/lang/Object;

    .line 109
    .line 110
    iput-object v14, v0, Li0/p$b;->a:Ljava/lang/Object;

    .line 111
    .line 112
    iput v13, v0, Li0/p$b;->b:I

    .line 113
    .line 114
    iput v2, v0, Li0/p$b;->c:I

    .line 115
    .line 116
    iput v12, v0, Li0/p$b;->d:I

    .line 117
    .line 118
    invoke-virtual {v15, v4, v0}, LCf/k;->d(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    if-ne v4, v1, :cond_4

    .line 123
    .line 124
    goto/16 :goto_5

    .line 125
    .line 126
    :cond_4
    :goto_1
    add-int/2addr v13, v12

    .line 127
    goto :goto_0

    .line 128
    :cond_5
    move-object v2, v15

    .line 129
    :cond_6
    const-wide/16 v18, 0x1

    .line 130
    .line 131
    iget-object v4, v0, Li0/p$b;->f:Li0/p;

    .line 132
    .line 133
    invoke-static {v4}, Li0/p;->f(Li0/p;)J

    .line 134
    .line 135
    .line 136
    move-result-wide v4

    .line 137
    cmp-long v4, v4, v10

    .line 138
    .line 139
    if-eqz v4, :cond_9

    .line 140
    .line 141
    move-object v13, v2

    .line 142
    move v2, v9

    .line 143
    :goto_2
    if-ge v2, v8, :cond_8

    .line 144
    .line 145
    iget-object v4, v0, Li0/p$b;->f:Li0/p;

    .line 146
    .line 147
    invoke-static {v4}, Li0/p;->f(Li0/p;)J

    .line 148
    .line 149
    .line 150
    move-result-wide v4

    .line 151
    shl-long v14, v18, v2

    .line 152
    .line 153
    and-long/2addr v4, v14

    .line 154
    cmp-long v4, v4, v10

    .line 155
    .line 156
    if-eqz v4, :cond_7

    .line 157
    .line 158
    iget-object v4, v0, Li0/p$b;->f:Li0/p;

    .line 159
    .line 160
    invoke-static {v4}, Li0/p;->e(Li0/p;)J

    .line 161
    .line 162
    .line 163
    move-result-wide v4

    .line 164
    int-to-long v14, v2

    .line 165
    add-long/2addr v4, v14

    .line 166
    invoke-static {v4, v5}, Lkotlin/coroutines/jvm/internal/b;->e(J)Ljava/lang/Long;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    iput-object v13, v0, Li0/p$b;->e:Ljava/lang/Object;

    .line 171
    .line 172
    iput-object v3, v0, Li0/p$b;->a:Ljava/lang/Object;

    .line 173
    .line 174
    iput v2, v0, Li0/p$b;->b:I

    .line 175
    .line 176
    iput v7, v0, Li0/p$b;->d:I

    .line 177
    .line 178
    invoke-virtual {v13, v4, v0}, LCf/k;->d(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    if-ne v4, v1, :cond_7

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_7
    :goto_3
    add-int/2addr v2, v12

    .line 186
    goto :goto_2

    .line 187
    :cond_8
    move-object v2, v13

    .line 188
    :cond_9
    iget-object v4, v0, Li0/p$b;->f:Li0/p;

    .line 189
    .line 190
    invoke-static {v4}, Li0/p;->i(Li0/p;)J

    .line 191
    .line 192
    .line 193
    move-result-wide v4

    .line 194
    cmp-long v4, v4, v10

    .line 195
    .line 196
    if-eqz v4, :cond_c

    .line 197
    .line 198
    move-object v7, v2

    .line 199
    :goto_4
    if-ge v9, v8, :cond_c

    .line 200
    .line 201
    iget-object v2, v0, Li0/p$b;->f:Li0/p;

    .line 202
    .line 203
    invoke-static {v2}, Li0/p;->i(Li0/p;)J

    .line 204
    .line 205
    .line 206
    move-result-wide v4

    .line 207
    shl-long v13, v18, v9

    .line 208
    .line 209
    and-long/2addr v4, v13

    .line 210
    cmp-long v2, v4, v10

    .line 211
    .line 212
    if-eqz v2, :cond_b

    .line 213
    .line 214
    iget-object v2, v0, Li0/p$b;->f:Li0/p;

    .line 215
    .line 216
    invoke-static {v2}, Li0/p;->e(Li0/p;)J

    .line 217
    .line 218
    .line 219
    move-result-wide v4

    .line 220
    int-to-long v13, v9

    .line 221
    add-long/2addr v4, v13

    .line 222
    int-to-long v13, v8

    .line 223
    add-long/2addr v4, v13

    .line 224
    invoke-static {v4, v5}, Lkotlin/coroutines/jvm/internal/b;->e(J)Ljava/lang/Long;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    iput-object v7, v0, Li0/p$b;->e:Ljava/lang/Object;

    .line 229
    .line 230
    iput-object v3, v0, Li0/p$b;->a:Ljava/lang/Object;

    .line 231
    .line 232
    iput v9, v0, Li0/p$b;->b:I

    .line 233
    .line 234
    iput v6, v0, Li0/p$b;->d:I

    .line 235
    .line 236
    invoke-virtual {v7, v2, v0}, LCf/k;->d(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    if-ne v2, v1, :cond_a

    .line 241
    .line 242
    :goto_5
    return-object v1

    .line 243
    :cond_a
    move v2, v9

    .line 244
    :goto_6
    move v9, v2

    .line 245
    :cond_b
    add-int/2addr v9, v12

    .line 246
    goto :goto_4

    .line 247
    :cond_c
    sget-object v1, LTd/L;->a:LTd/L;

    .line 248
    .line 249
    return-object v1
.end method
