.class public final Lw/S;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lw/C;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/S$a;,
        Lw/S$b;
    }
.end annotation


# instance fields
.field private final a:Lw/S$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lw/S$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw/S;->a:Lw/S$b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lw/s0;)Lw/v0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lw/S;->f(Lw/s0;)Lw/E0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Lw/s0;)Lw/y0;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lw/S;->f(Lw/s0;)Lw/E0;

    move-result-object p1

    return-object p1
.end method

.method public f(Lw/s0;)Lw/E0;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v2, Lt/E;

    .line 4
    .line 5
    iget-object v1, v0, Lw/S;->a:Lw/S$b;

    .line 6
    .line 7
    invoke-virtual {v1}, Lw/T;->c()Lt/F;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Lt/o;->e()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/lit8 v1, v1, 0x2

    .line 16
    .line 17
    invoke-direct {v2, v1}, Lt/E;-><init>(I)V

    .line 18
    .line 19
    .line 20
    new-instance v3, Lt/F;

    .line 21
    .line 22
    iget-object v1, v0, Lw/S;->a:Lw/S$b;

    .line 23
    .line 24
    invoke-virtual {v1}, Lw/T;->c()Lt/F;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Lt/o;->e()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-direct {v3, v1}, Lt/F;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iget-object v1, v0, Lw/S;->a:Lw/S$b;

    .line 36
    .line 37
    invoke-virtual {v1}, Lw/T;->c()Lt/F;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v4, v1, Lt/o;->b:[I

    .line 42
    .line 43
    iget-object v5, v1, Lt/o;->c:[Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v1, v1, Lt/o;->a:[J

    .line 46
    .line 47
    array-length v6, v1

    .line 48
    add-int/lit8 v6, v6, -0x2

    .line 49
    .line 50
    if-ltz v6, :cond_3

    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    :goto_0
    aget-wide v9, v1, v8

    .line 54
    .line 55
    not-long v11, v9

    .line 56
    const/4 v13, 0x7

    .line 57
    shl-long/2addr v11, v13

    .line 58
    and-long/2addr v11, v9

    .line 59
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    and-long/2addr v11, v13

    .line 65
    cmp-long v11, v11, v13

    .line 66
    .line 67
    if-eqz v11, :cond_2

    .line 68
    .line 69
    sub-int v11, v8, v6

    .line 70
    .line 71
    not-int v11, v11

    .line 72
    ushr-int/lit8 v11, v11, 0x1f

    .line 73
    .line 74
    const/16 v12, 0x8

    .line 75
    .line 76
    rsub-int/lit8 v11, v11, 0x8

    .line 77
    .line 78
    const/4 v13, 0x0

    .line 79
    :goto_1
    if-ge v13, v11, :cond_1

    .line 80
    .line 81
    const-wide/16 v14, 0xff

    .line 82
    .line 83
    and-long/2addr v14, v9

    .line 84
    const-wide/16 v16, 0x80

    .line 85
    .line 86
    cmp-long v14, v14, v16

    .line 87
    .line 88
    if-gez v14, :cond_0

    .line 89
    .line 90
    shl-int/lit8 v14, v8, 0x3

    .line 91
    .line 92
    add-int/2addr v14, v13

    .line 93
    aget v15, v4, v14

    .line 94
    .line 95
    aget-object v14, v5, v14

    .line 96
    .line 97
    check-cast v14, Lw/S$a;

    .line 98
    .line 99
    invoke-virtual {v2, v15}, Lt/E;->h(I)Z

    .line 100
    .line 101
    .line 102
    new-instance v7, Lw/D0;

    .line 103
    .line 104
    move/from16 v17, v12

    .line 105
    .line 106
    invoke-interface/range {p1 .. p1}, Lw/s0;->a()Lkotlin/jvm/functions/Function1;

    .line 107
    .line 108
    .line 109
    move-result-object v12

    .line 110
    move-object/from16 v18, v1

    .line 111
    .line 112
    invoke-virtual {v14}, Lw/Q;->b()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-interface {v12, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, Lw/q;

    .line 121
    .line 122
    invoke-virtual {v14}, Lw/Q;->a()Lw/D;

    .line 123
    .line 124
    .line 125
    move-result-object v12

    .line 126
    invoke-virtual {v14}, Lw/S$a;->d()I

    .line 127
    .line 128
    .line 129
    move-result v14

    .line 130
    move-object/from16 v19, v4

    .line 131
    .line 132
    const/4 v4, 0x0

    .line 133
    invoke-direct {v7, v1, v12, v14, v4}, Lw/D0;-><init>(Lw/q;Lw/D;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3, v15, v7}, Lt/F;->s(ILjava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_0
    move-object/from16 v18, v1

    .line 141
    .line 142
    move-object/from16 v19, v4

    .line 143
    .line 144
    move/from16 v17, v12

    .line 145
    .line 146
    :goto_2
    shr-long v9, v9, v17

    .line 147
    .line 148
    add-int/lit8 v13, v13, 0x1

    .line 149
    .line 150
    move/from16 v12, v17

    .line 151
    .line 152
    move-object/from16 v1, v18

    .line 153
    .line 154
    move-object/from16 v4, v19

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_1
    move-object/from16 v18, v1

    .line 158
    .line 159
    move-object/from16 v19, v4

    .line 160
    .line 161
    move v1, v12

    .line 162
    if-ne v11, v1, :cond_3

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_2
    move-object/from16 v18, v1

    .line 166
    .line 167
    move-object/from16 v19, v4

    .line 168
    .line 169
    :goto_3
    if-eq v8, v6, :cond_3

    .line 170
    .line 171
    add-int/lit8 v8, v8, 0x1

    .line 172
    .line 173
    move-object/from16 v1, v18

    .line 174
    .line 175
    move-object/from16 v4, v19

    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_3
    iget-object v1, v0, Lw/S;->a:Lw/S$b;

    .line 179
    .line 180
    invoke-virtual {v1}, Lw/T;->c()Lt/F;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    const/4 v4, 0x0

    .line 185
    invoke-virtual {v1, v4}, Lt/o;->a(I)Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-nez v1, :cond_4

    .line 190
    .line 191
    invoke-virtual {v2, v4, v4}, Lt/E;->g(II)V

    .line 192
    .line 193
    .line 194
    :cond_4
    iget-object v1, v0, Lw/S;->a:Lw/S$b;

    .line 195
    .line 196
    invoke-virtual {v1}, Lw/T;->c()Lt/F;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    iget-object v4, v0, Lw/S;->a:Lw/S$b;

    .line 201
    .line 202
    invoke-virtual {v4}, Lw/T;->b()I

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    invoke-virtual {v1, v4}, Lt/o;->a(I)Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-nez v1, :cond_5

    .line 211
    .line 212
    iget-object v1, v0, Lw/S;->a:Lw/S$b;

    .line 213
    .line 214
    invoke-virtual {v1}, Lw/T;->b()I

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    invoke-virtual {v2, v1}, Lt/E;->h(I)Z

    .line 219
    .line 220
    .line 221
    :cond_5
    invoke-virtual {v2}, Lt/E;->o()V

    .line 222
    .line 223
    .line 224
    new-instance v1, Lw/E0;

    .line 225
    .line 226
    iget-object v4, v0, Lw/S;->a:Lw/S$b;

    .line 227
    .line 228
    invoke-virtual {v4}, Lw/T;->b()I

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    iget-object v5, v0, Lw/S;->a:Lw/S$b;

    .line 233
    .line 234
    invoke-virtual {v5}, Lw/T;->a()I

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    invoke-static {}, Lw/F;->e()Lw/D;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    sget-object v7, Lw/t;->a:Lw/t$a;

    .line 243
    .line 244
    invoke-virtual {v7}, Lw/t$a;->a()I

    .line 245
    .line 246
    .line 247
    move-result v7

    .line 248
    const/4 v8, 0x0

    .line 249
    invoke-direct/range {v1 .. v8}, Lw/E0;-><init>(Lt/m;Lt/o;IILw/D;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 250
    .line 251
    .line 252
    return-object v1
.end method
