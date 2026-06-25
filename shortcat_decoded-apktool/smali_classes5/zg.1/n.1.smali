.class public Lzg/n;
.super Ljava/io/FilterInputStream;


# instance fields
.field private final a:I

.field private final b:Z

.field private final c:[[B


# direct methods
.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lzg/n;-><init>(Ljava/io/InputStream;IZ)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;IZ)V
    .locals 1

    const/16 v0, 0xb

    .line 2
    new-array v0, v0, [[B

    invoke-direct {p0, p1, p2, p3, v0}, Lzg/n;-><init>(Ljava/io/InputStream;IZ[[B)V

    return-void
.end method

.method private constructor <init>(Ljava/io/InputStream;IZ[[B)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    iput p2, p0, Lzg/n;->a:I

    iput-boolean p3, p0, Lzg/n;->b:Z

    iput-object p4, p0, Lzg/n;->c:[[B

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 4
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    array-length p1, p1

    invoke-direct {p0, v0, p1}, Lzg/n;-><init>(Ljava/io/InputStream;I)V

    return-void
.end method

.method public constructor <init>([BZ)V
    .locals 1

    .line 5
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    array-length p1, p1

    invoke-direct {p0, v0, p1, p2}, Lzg/n;-><init>(Ljava/io/InputStream;IZ)V

    return-void
.end method

.method static h(ILzg/K0;[[B)Lzg/y;
    .locals 2

    .line 1
    const-string v0, " encountered"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :pswitch_0
    :try_start_0
    new-instance p1, Ljava/io/IOException;

    .line 8
    .line 9
    new-instance p2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, "unknown tag "

    .line 15
    .line 16
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :pswitch_1
    invoke-static {p1}, Lzg/n;->j(Lzg/K0;)[C

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Lzg/a;->z([C)Lzg/a;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :pswitch_2
    invoke-virtual {p1}, Lzg/K0;->j()[B

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0}, Lzg/K;->y([B)Lzg/K;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_3
    invoke-virtual {p1}, Lzg/K0;->j()[B

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Lzg/j;->y([B)Lzg/j;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_4
    invoke-virtual {p1}, Lzg/K0;->j()[B

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, Lzg/O;->y([B)Lzg/O;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :pswitch_5
    invoke-virtual {p1}, Lzg/K0;->j()[B

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {p0}, Lzg/l;->y([B)Lzg/l;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :pswitch_6
    invoke-virtual {p1}, Lzg/K0;->j()[B

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-static {p0}, Lzg/k;->y([B)Lzg/k;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :pswitch_7
    invoke-virtual {p1}, Lzg/K0;->j()[B

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p0}, Lzg/I;->y([B)Lzg/I;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :pswitch_8
    invoke-virtual {p1}, Lzg/K0;->j()[B

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {p0}, Lzg/m;->y([B)Lzg/m;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0

    .line 105
    :pswitch_9
    invoke-virtual {p1}, Lzg/K0;->j()[B

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p0}, Lzg/N;->y([B)Lzg/N;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0

    .line 114
    :pswitch_a
    invoke-virtual {p1}, Lzg/K0;->j()[B

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-static {p0}, Lzg/E;->y([B)Lzg/E;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0

    .line 123
    :pswitch_b
    invoke-virtual {p1}, Lzg/K0;->j()[B

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-static {p0}, Lzg/z;->y([B)Lzg/z;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0

    .line 132
    :pswitch_c
    invoke-virtual {p1}, Lzg/K0;->j()[B

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-static {p0}, Lzg/q;->y([B)Lzg/q;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    return-object p0

    .line 141
    :pswitch_d
    new-instance p1, Ljava/io/IOException;

    .line 142
    .line 143
    new-instance p2, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    .line 147
    .line 148
    const-string v1, "unsupported tag "

    .line 149
    .line 150
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw p1

    .line 167
    :pswitch_e
    invoke-virtual {p1}, Lzg/K0;->g()I

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    invoke-static {p0}, Lzg/A;->y(I)V

    .line 172
    .line 173
    .line 174
    invoke-static {p1, p2}, Lzg/n;->k(Lzg/K0;[[B)[B

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-static {p0, v1}, Lzg/A;->A([BZ)Lzg/A;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    return-object p0

    .line 183
    :pswitch_f
    invoke-virtual {p1}, Lzg/K0;->j()[B

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {p0}, Lzg/J;->y([B)Lzg/J;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    return-object p0

    .line 192
    :pswitch_10
    invoke-static {p1, p2}, Lzg/n;->k(Lzg/K0;[[B)[B

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-static {p0, v1}, Lzg/g;->y([BZ)Lzg/g;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    return-object p0

    .line 201
    :pswitch_11
    invoke-virtual {p1}, Lzg/K0;->j()[B

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-static {p0}, Lzg/s;->y([B)Lzg/s;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    return-object p0

    .line 210
    :pswitch_12
    invoke-virtual {p1}, Lzg/K0;->g()I

    .line 211
    .line 212
    .line 213
    move-result p0

    .line 214
    invoke-static {p0}, Lzg/t;->z(I)V

    .line 215
    .line 216
    .line 217
    invoke-static {p1, p2}, Lzg/n;->k(Lzg/K0;[[B)[B

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    invoke-static {p0, v1}, Lzg/t;->B([BZ)Lzg/t;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    return-object p0

    .line 226
    :pswitch_13
    invoke-virtual {p1}, Lzg/K0;->j()[B

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    invoke-static {p0}, Lzg/p;->y([B)Lzg/p;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    return-object p0

    .line 235
    :pswitch_14
    invoke-virtual {p1}, Lzg/K0;->j()[B

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-static {p0}, Lzg/u;->y([B)Lzg/u;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    return-object p0

    .line 244
    :pswitch_15
    invoke-virtual {p1}, Lzg/K0;->j()[B

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    invoke-static {p0}, Lzg/b;->y([B)Lzg/b;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    return-object p0

    .line 253
    :pswitch_16
    invoke-virtual {p1}, Lzg/K0;->j()[B

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    invoke-static {p0}, Lzg/o;->y([B)Lzg/o;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    return-object p0

    .line 262
    :pswitch_17
    invoke-static {p1, p2}, Lzg/n;->k(Lzg/K0;[[B)[B

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    invoke-static {p0}, Lzg/d;->y([B)Lzg/d;

    .line 267
    .line 268
    .line 269
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 270
    return-object p0

    .line 271
    :catch_0
    move-exception p0

    .line 272
    new-instance p1, Lzg/h;

    .line 273
    .line 274
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object p2

    .line 278
    invoke-direct {p1, p2, p0}, Lzg/h;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 279
    .line 280
    .line 281
    throw p1

    .line 282
    :catch_1
    move-exception p0

    .line 283
    new-instance p1, Lzg/h;

    .line 284
    .line 285
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p2

    .line 289
    invoke-direct {p1, p2, p0}, Lzg/h;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 290
    .line 291
    .line 292
    throw p1

    .line 293
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_0
        :pswitch_0
        :pswitch_10
        :pswitch_0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
    .end packed-switch
.end method

.method private static j(Lzg/K0;)[C
    .locals 11

    .line 1
    invoke-virtual {p0}, Lzg/K0;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v1, v0, 0x1

    .line 6
    .line 7
    if-nez v1, :cond_6

    .line 8
    .line 9
    div-int/lit8 v1, v0, 0x2

    .line 10
    .line 11
    new-array v2, v1, [C

    .line 12
    .line 13
    const/16 v3, 0x8

    .line 14
    .line 15
    new-array v4, v3, [B

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    move v6, v5

    .line 19
    :goto_0
    const-string v7, "EOF encountered in middle of BMPString"

    .line 20
    .line 21
    const/4 v8, 0x2

    .line 22
    if-lt v0, v3, :cond_1

    .line 23
    .line 24
    invoke-static {p0, v4, v5, v3}, LQh/a;->d(Ljava/io/InputStream;[BII)I

    .line 25
    .line 26
    .line 27
    move-result v9

    .line 28
    if-ne v9, v3, :cond_0

    .line 29
    .line 30
    aget-byte v7, v4, v5

    .line 31
    .line 32
    shl-int/2addr v7, v3

    .line 33
    const/4 v9, 0x1

    .line 34
    aget-byte v9, v4, v9

    .line 35
    .line 36
    and-int/lit16 v9, v9, 0xff

    .line 37
    .line 38
    or-int/2addr v7, v9

    .line 39
    int-to-char v7, v7

    .line 40
    aput-char v7, v2, v6

    .line 41
    .line 42
    add-int/lit8 v7, v6, 0x1

    .line 43
    .line 44
    aget-byte v8, v4, v8

    .line 45
    .line 46
    shl-int/2addr v8, v3

    .line 47
    const/4 v9, 0x3

    .line 48
    aget-byte v9, v4, v9

    .line 49
    .line 50
    and-int/lit16 v9, v9, 0xff

    .line 51
    .line 52
    or-int/2addr v8, v9

    .line 53
    int-to-char v8, v8

    .line 54
    aput-char v8, v2, v7

    .line 55
    .line 56
    add-int/lit8 v7, v6, 0x2

    .line 57
    .line 58
    const/4 v8, 0x4

    .line 59
    aget-byte v8, v4, v8

    .line 60
    .line 61
    shl-int/2addr v8, v3

    .line 62
    const/4 v9, 0x5

    .line 63
    aget-byte v9, v4, v9

    .line 64
    .line 65
    and-int/lit16 v9, v9, 0xff

    .line 66
    .line 67
    or-int/2addr v8, v9

    .line 68
    int-to-char v8, v8

    .line 69
    aput-char v8, v2, v7

    .line 70
    .line 71
    add-int/lit8 v7, v6, 0x3

    .line 72
    .line 73
    const/4 v8, 0x6

    .line 74
    aget-byte v8, v4, v8

    .line 75
    .line 76
    shl-int/2addr v8, v3

    .line 77
    const/4 v9, 0x7

    .line 78
    aget-byte v9, v4, v9

    .line 79
    .line 80
    and-int/lit16 v9, v9, 0xff

    .line 81
    .line 82
    or-int/2addr v8, v9

    .line 83
    int-to-char v8, v8

    .line 84
    aput-char v8, v2, v7

    .line 85
    .line 86
    add-int/lit8 v6, v6, 0x4

    .line 87
    .line 88
    add-int/lit8 v0, v0, -0x8

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    new-instance p0, Ljava/io/EOFException;

    .line 92
    .line 93
    invoke-direct {p0, v7}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p0

    .line 97
    :cond_1
    if-lez v0, :cond_4

    .line 98
    .line 99
    invoke-static {p0, v4, v5, v0}, LQh/a;->d(Ljava/io/InputStream;[BII)I

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    if-ne v9, v0, :cond_3

    .line 104
    .line 105
    :cond_2
    add-int/lit8 v7, v5, 0x1

    .line 106
    .line 107
    aget-byte v9, v4, v5

    .line 108
    .line 109
    shl-int/2addr v9, v3

    .line 110
    add-int/2addr v5, v8

    .line 111
    aget-byte v7, v4, v7

    .line 112
    .line 113
    and-int/lit16 v7, v7, 0xff

    .line 114
    .line 115
    add-int/lit8 v10, v6, 0x1

    .line 116
    .line 117
    or-int/2addr v7, v9

    .line 118
    int-to-char v7, v7

    .line 119
    aput-char v7, v2, v6

    .line 120
    .line 121
    move v6, v10

    .line 122
    if-lt v5, v0, :cond_2

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_3
    new-instance p0, Ljava/io/EOFException;

    .line 126
    .line 127
    invoke-direct {p0, v7}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p0

    .line 131
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lzg/K0;->g()I

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    if-nez p0, :cond_5

    .line 136
    .line 137
    if-ne v1, v6, :cond_5

    .line 138
    .line 139
    return-object v2

    .line 140
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 141
    .line 142
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 143
    .line 144
    .line 145
    throw p0

    .line 146
    :cond_6
    new-instance p0, Ljava/io/IOException;

    .line 147
    .line 148
    const-string v0, "malformed BMPString encoding encountered"

    .line 149
    .line 150
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw p0
.end method

.method private static k(Lzg/K0;[[B)[B
    .locals 2

    .line 1
    invoke-virtual {p0}, Lzg/K0;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    array-length v1, p1

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lzg/K0;->j()[B

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    aget-object v1, p1, v0

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    new-array v1, v0, [B

    .line 18
    .line 19
    aput-object v1, p1, v0

    .line 20
    .line 21
    :cond_1
    invoke-virtual {p0, v1}, Lzg/K0;->h([B)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method

.method static m(Ljava/io/InputStream;IZ)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    ushr-int/lit8 v1, v0, 0x7

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    const/16 v1, 0x80

    .line 11
    .line 12
    if-ne v1, v0, :cond_1

    .line 13
    .line 14
    const/4 p0, -0x1

    .line 15
    return p0

    .line 16
    :cond_1
    if-ltz v0, :cond_8

    .line 17
    .line 18
    const/16 v1, 0xff

    .line 19
    .line 20
    if-eq v1, v0, :cond_7

    .line 21
    .line 22
    and-int/lit8 v0, v0, 0x7f

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    move v2, v1

    .line 26
    :cond_2
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-ltz v3, :cond_6

    .line 31
    .line 32
    ushr-int/lit8 v4, v1, 0x17

    .line 33
    .line 34
    if-nez v4, :cond_5

    .line 35
    .line 36
    shl-int/lit8 v1, v1, 0x8

    .line 37
    .line 38
    add-int/2addr v1, v3

    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    if-lt v2, v0, :cond_2

    .line 42
    .line 43
    if-lt v1, p1, :cond_4

    .line 44
    .line 45
    if-eqz p2, :cond_3

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    new-instance p0, Ljava/io/IOException;

    .line 49
    .line 50
    new-instance p2, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v0, "corrupted stream - out of bounds length found: "

    .line 56
    .line 57
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, " >= "

    .line 64
    .line 65
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p0

    .line 79
    :cond_4
    :goto_0
    return v1

    .line 80
    :cond_5
    new-instance p0, Ljava/io/IOException;

    .line 81
    .line 82
    const-string p1, "long form definite-length more than 31 bits"

    .line 83
    .line 84
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p0

    .line 88
    :cond_6
    new-instance p0, Ljava/io/EOFException;

    .line 89
    .line 90
    const-string p1, "EOF found reading length"

    .line 91
    .line 92
    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p0

    .line 96
    :cond_7
    new-instance p0, Ljava/io/IOException;

    .line 97
    .line 98
    const-string p1, "invalid long form definite-length 0xFF"

    .line 99
    .line 100
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p0

    .line 104
    :cond_8
    new-instance p0, Ljava/io/EOFException;

    .line 105
    .line 106
    const-string p1, "EOF found when length expected"

    .line 107
    .line 108
    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p0
.end method

.method static q(Ljava/io/InputStream;I)I
    .locals 4

    .line 1
    const/16 v0, 0x1f

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    if-ne p1, v0, :cond_6

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const-string v1, "EOF found inside tag value."

    .line 11
    .line 12
    if-ge p1, v0, :cond_1

    .line 13
    .line 14
    if-gez p1, :cond_0

    .line 15
    .line 16
    new-instance p0, Ljava/io/EOFException;

    .line 17
    .line 18
    invoke-direct {p0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    :cond_0
    new-instance p0, Ljava/io/IOException;

    .line 23
    .line 24
    const-string p1, "corrupted stream - high tag number < 31 found"

    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0

    .line 30
    :cond_1
    and-int/lit8 v0, p1, 0x7f

    .line 31
    .line 32
    if-eqz v0, :cond_5

    .line 33
    .line 34
    :goto_0
    and-int/lit16 p1, p1, 0x80

    .line 35
    .line 36
    if-eqz p1, :cond_4

    .line 37
    .line 38
    ushr-int/lit8 p1, v0, 0x18

    .line 39
    .line 40
    if-nez p1, :cond_3

    .line 41
    .line 42
    shl-int/lit8 p1, v0, 0x7

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-ltz v0, :cond_2

    .line 49
    .line 50
    and-int/lit8 v2, v0, 0x7f

    .line 51
    .line 52
    or-int/2addr p1, v2

    .line 53
    move v3, v0

    .line 54
    move v0, p1

    .line 55
    move p1, v3

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    new-instance p0, Ljava/io/EOFException;

    .line 58
    .line 59
    invoke-direct {p0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p0

    .line 63
    :cond_3
    new-instance p0, Ljava/io/IOException;

    .line 64
    .line 65
    const-string p1, "Tag number more than 31 bits"

    .line 66
    .line 67
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p0

    .line 71
    :cond_4
    return v0

    .line 72
    :cond_5
    new-instance p0, Ljava/io/IOException;

    .line 73
    .line 74
    const-string p1, "corrupted stream - invalid high tag number found"

    .line 75
    .line 76
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p0

    .line 80
    :cond_6
    return p1
.end method


# virtual methods
.method C(Lzg/K0;)Lzg/f;
    .locals 4

    .line 1
    invoke-virtual {p1}, Lzg/K0;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    new-instance p1, Lzg/f;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {p1, v0}, Lzg/f;-><init>(I)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    new-instance v1, Lzg/n;

    .line 16
    .line 17
    iget-boolean v2, p0, Lzg/n;->b:Z

    .line 18
    .line 19
    iget-object v3, p0, Lzg/n;->c:[[B

    .line 20
    .line 21
    invoke-direct {v1, p1, v0, v2, v3}, Lzg/n;-><init>(Ljava/io/InputStream;IZ[[B)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lzg/n;->z()Lzg/f;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method a(Lzg/f;)Lzg/b;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lzg/f;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v1, v0, [Lzg/b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-eq v2, v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1, v2}, Lzg/f;->d(I)Lzg/e;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    instance-of v4, v3, Lzg/b;

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    check-cast v3, Lzg/b;

    .line 19
    .line 20
    aput-object v3, v1, v2

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Lzg/h;

    .line 26
    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v1, "unknown object encountered in constructed BIT STRING: "

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-direct {p1, v0}, Lzg/h;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_1
    new-instance p1, Lzg/P;

    .line 53
    .line 54
    invoke-direct {p1, v1}, Lzg/P;-><init>([Lzg/b;)V

    .line 55
    .line 56
    .line 57
    return-object p1
.end method

.method b(Lzg/f;)Lzg/u;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lzg/f;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v1, v0, [Lzg/u;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-eq v2, v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1, v2}, Lzg/f;->d(I)Lzg/e;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    instance-of v4, v3, Lzg/u;

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    check-cast v3, Lzg/u;

    .line 19
    .line 20
    aput-object v3, v1, v2

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Lzg/h;

    .line 26
    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v1, "unknown object encountered in constructed OCTET STRING: "

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-direct {p1, v0}, Lzg/h;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_1
    new-instance p1, Lzg/T;

    .line 53
    .line 54
    invoke-direct {p1, v1}, Lzg/T;-><init>([Lzg/u;)V

    .line 55
    .line 56
    .line 57
    return-object p1
.end method

.method protected g(III)Lzg/y;
    .locals 2

    .line 1
    new-instance v0, Lzg/K0;

    .line 2
    .line 3
    iget v1, p0, Lzg/n;->a:I

    .line 4
    .line 5
    invoke-direct {v0, p0, p3, v1}, Lzg/K0;-><init>(Ljava/io/InputStream;II)V

    .line 6
    .line 7
    .line 8
    and-int/lit16 p3, p1, 0xe0

    .line 9
    .line 10
    if-nez p3, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lzg/n;->c:[[B

    .line 13
    .line 14
    invoke-static {p2, v0, p1}, Lzg/n;->h(ILzg/K0;[[B)Lzg/y;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    and-int/lit16 p3, p1, 0xc0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    if-eqz p3, :cond_2

    .line 23
    .line 24
    and-int/lit8 p1, p1, 0x20

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    :goto_0
    invoke-virtual {p0, p3, p2, v1, v0}, Lzg/n;->w(IIZLzg/K0;)Lzg/y;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :cond_2
    const/4 p1, 0x3

    .line 36
    if-eq p2, p1, :cond_9

    .line 37
    .line 38
    const/4 p1, 0x4

    .line 39
    if-eq p2, p1, :cond_8

    .line 40
    .line 41
    const/16 p1, 0x8

    .line 42
    .line 43
    if-eq p2, p1, :cond_7

    .line 44
    .line 45
    const/16 p1, 0x10

    .line 46
    .line 47
    if-eq p2, p1, :cond_4

    .line 48
    .line 49
    const/16 p1, 0x11

    .line 50
    .line 51
    if-ne p2, p1, :cond_3

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Lzg/n;->C(Lzg/K0;)Lzg/f;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1}, Lzg/C0;->b(Lzg/f;)Lzg/G0;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 63
    .line 64
    new-instance p3, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    const-string v0, "unknown tag "

    .line 70
    .line 71
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string p2, " encountered"

    .line 78
    .line 79
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :cond_4
    invoke-virtual {v0}, Lzg/K0;->g()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-ge p1, v1, :cond_5

    .line 95
    .line 96
    sget-object p1, Lzg/C0;->a:Lzg/E0;

    .line 97
    .line 98
    return-object p1

    .line 99
    :cond_5
    iget-boolean p1, p0, Lzg/n;->b:Z

    .line 100
    .line 101
    if-eqz p1, :cond_6

    .line 102
    .line 103
    new-instance p1, Lzg/O0;

    .line 104
    .line 105
    invoke-virtual {v0}, Lzg/K0;->j()[B

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-direct {p1, p2}, Lzg/O0;-><init>([B)V

    .line 110
    .line 111
    .line 112
    return-object p1

    .line 113
    :cond_6
    invoke-virtual {p0, v0}, Lzg/n;->C(Lzg/K0;)Lzg/f;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-static {p1}, Lzg/C0;->a(Lzg/f;)Lzg/E0;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    return-object p1

    .line 122
    :cond_7
    invoke-virtual {p0, v0}, Lzg/n;->C(Lzg/K0;)Lzg/f;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-static {p1}, Lzg/C0;->a(Lzg/f;)Lzg/E0;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p1}, Lzg/E0;->G()Lzg/i;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    return-object p1

    .line 135
    :cond_8
    invoke-virtual {p0, v0}, Lzg/n;->C(Lzg/K0;)Lzg/f;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p0, p1}, Lzg/n;->b(Lzg/f;)Lzg/u;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    return-object p1

    .line 144
    :cond_9
    invoke-virtual {p0, v0}, Lzg/n;->C(Lzg/K0;)Lzg/f;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {p0, p1}, Lzg/n;->a(Lzg/f;)Lzg/b;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    return-object p1
.end method

.method protected l()I
    .locals 2

    .line 1
    iget v0, p0, Lzg/n;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, Lzg/n;->m(Ljava/io/InputStream;IZ)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public o()Lzg/y;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gtz v0, :cond_1

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 12
    .line 13
    const-string v1, "unexpected end-of-contents marker"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0

    .line 19
    :cond_1
    invoke-static {p0, v0}, Lzg/n;->q(Ljava/io/InputStream;I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p0}, Lzg/n;->l()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-ltz v2, :cond_2

    .line 28
    .line 29
    :try_start_0
    invoke-virtual {p0, v0, v1, v2}, Lzg/n;->g(III)Lzg/y;

    .line 30
    .line 31
    .line 32
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    return-object v0

    .line 34
    :catch_0
    move-exception v0

    .line 35
    new-instance v1, Lzg/h;

    .line 36
    .line 37
    const-string v2, "corrupted stream detected"

    .line 38
    .line 39
    invoke-direct {v1, v2, v0}, Lzg/h;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw v1

    .line 43
    :cond_2
    and-int/lit8 v2, v0, 0x20

    .line 44
    .line 45
    if-eqz v2, :cond_9

    .line 46
    .line 47
    new-instance v2, Lzg/M0;

    .line 48
    .line 49
    iget v3, p0, Lzg/n;->a:I

    .line 50
    .line 51
    invoke-direct {v2, p0, v3}, Lzg/M0;-><init>(Ljava/io/InputStream;I)V

    .line 52
    .line 53
    .line 54
    new-instance v3, Lzg/D;

    .line 55
    .line 56
    iget v4, p0, Lzg/n;->a:I

    .line 57
    .line 58
    iget-object v5, p0, Lzg/n;->c:[[B

    .line 59
    .line 60
    invoke-direct {v3, v2, v4, v5}, Lzg/D;-><init>(Ljava/io/InputStream;I[[B)V

    .line 61
    .line 62
    .line 63
    and-int/lit16 v0, v0, 0xc0

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    invoke-virtual {v3, v0, v1}, Lzg/D;->c(II)Lzg/y;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0

    .line 72
    :cond_3
    const/4 v0, 0x3

    .line 73
    if-eq v1, v0, :cond_8

    .line 74
    .line 75
    const/4 v0, 0x4

    .line 76
    if-eq v1, v0, :cond_7

    .line 77
    .line 78
    const/16 v0, 0x8

    .line 79
    .line 80
    if-eq v1, v0, :cond_6

    .line 81
    .line 82
    const/16 v0, 0x10

    .line 83
    .line 84
    if-eq v1, v0, :cond_5

    .line 85
    .line 86
    const/16 v0, 0x11

    .line 87
    .line 88
    if-ne v1, v0, :cond_4

    .line 89
    .line 90
    invoke-static {v3}, Lzg/Y;->a(Lzg/D;)Lzg/X;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    return-object v0

    .line 95
    :cond_4
    new-instance v0, Ljava/io/IOException;

    .line 96
    .line 97
    const-string v1, "unknown BER object encountered"

    .line 98
    .line 99
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v0

    .line 103
    :cond_5
    invoke-static {v3}, Lzg/W;->a(Lzg/D;)Lzg/V;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    return-object v0

    .line 108
    :cond_6
    invoke-static {v3}, Lzg/g0;->a(Lzg/D;)Lzg/B0;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    return-object v0

    .line 113
    :cond_7
    invoke-static {v3}, Lzg/U;->a(Lzg/D;)Lzg/T;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    return-object v0

    .line 118
    :cond_8
    invoke-static {v3}, Lzg/Q;->a(Lzg/D;)Lzg/P;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    return-object v0

    .line 123
    :cond_9
    new-instance v0, Ljava/io/IOException;

    .line 124
    .line 125
    const-string v1, "indefinite-length primitive encoding encountered"

    .line 126
    .line 127
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v0
.end method

.method w(IIZLzg/K0;)Lzg/y;
    .locals 0

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p4}, Lzg/K0;->j()[B

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    invoke-static {p1, p2, p3}, Lzg/G;->B(II[B)Lzg/y;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-virtual {p0, p4}, Lzg/n;->C(Lzg/K0;)Lzg/f;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    invoke-static {p1, p2, p3}, Lzg/G;->z(IILzg/f;)Lzg/y;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method z()Lzg/f;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lzg/n;->o()Lzg/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lzg/f;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, v1}, Lzg/f;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v1, Lzg/f;

    .line 15
    .line 16
    invoke-direct {v1}, Lzg/f;-><init>()V

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {v1, v0}, Lzg/f;->a(Lzg/e;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lzg/n;->o()Lzg/y;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    return-object v1
.end method
