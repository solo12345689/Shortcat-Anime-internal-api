.class LZg/a;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/security/SecureRandom;

.field private final b:LHg/h;

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:I

.field private final h:I

.field private final i:I

.field private final j:I

.field private final k:I

.field private final l:I

.field private final m:I

.field private final n:I

.field private final o:I

.field private final p:I

.field private final q:I

.field private final r:I

.field private final s:I

.field private final t:I

.field private final u:LZg/f;


# direct methods
.method constructor <init>(ILjava/security/SecureRandom;Z)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LHg/h;

    .line 5
    .line 6
    const/16 v1, 0x100

    .line 7
    .line 8
    invoke-direct {v0, v1}, LHg/h;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LZg/a;->b:LHg/h;

    .line 12
    .line 13
    iput p1, p0, LZg/a;->g:I

    .line 14
    .line 15
    const/16 v0, 0x20

    .line 16
    .line 17
    const/high16 v1, 0x20000

    .line 18
    .line 19
    const/16 v2, 0x60

    .line 20
    .line 21
    const/4 v3, 0x4

    .line 22
    const/high16 v4, 0x80000

    .line 23
    .line 24
    const/16 v5, 0x80

    .line 25
    .line 26
    const/4 v6, 0x2

    .line 27
    if-eq p1, v6, :cond_2

    .line 28
    .line 29
    const/4 v7, 0x3

    .line 30
    const/16 v8, 0x280

    .line 31
    .line 32
    const v9, 0x3ff00

    .line 33
    .line 34
    .line 35
    const/4 v10, 0x5

    .line 36
    if-eq p1, v7, :cond_1

    .line 37
    .line 38
    if-ne p1, v10, :cond_0

    .line 39
    .line 40
    const/16 p1, 0x8

    .line 41
    .line 42
    iput p1, p0, LZg/a;->h:I

    .line 43
    .line 44
    const/4 p1, 0x7

    .line 45
    iput p1, p0, LZg/a;->i:I

    .line 46
    .line 47
    iput v6, p0, LZg/a;->j:I

    .line 48
    .line 49
    const/16 p1, 0x3c

    .line 50
    .line 51
    iput p1, p0, LZg/a;->k:I

    .line 52
    .line 53
    const/16 p1, 0x78

    .line 54
    .line 55
    iput p1, p0, LZg/a;->l:I

    .line 56
    .line 57
    iput v4, p0, LZg/a;->m:I

    .line 58
    .line 59
    iput v9, p0, LZg/a;->n:I

    .line 60
    .line 61
    const/16 p1, 0x4b

    .line 62
    .line 63
    iput p1, p0, LZg/a;->o:I

    .line 64
    .line 65
    iput v8, p0, LZg/a;->d:I

    .line 66
    .line 67
    iput v5, p0, LZg/a;->e:I

    .line 68
    .line 69
    iput v2, p0, LZg/a;->f:I

    .line 70
    .line 71
    const/16 p1, 0x40

    .line 72
    .line 73
    :goto_0
    iput p1, p0, LZg/a;->p:I

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 77
    .line 78
    new-instance p3, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v0, "The mode "

    .line 84
    .line 85
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string p1, "is not supported by Crystals Dilithium!"

    .line 92
    .line 93
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p2

    .line 104
    :cond_1
    const/4 p1, 0x6

    .line 105
    iput p1, p0, LZg/a;->h:I

    .line 106
    .line 107
    iput v10, p0, LZg/a;->i:I

    .line 108
    .line 109
    iput v3, p0, LZg/a;->j:I

    .line 110
    .line 111
    const/16 p1, 0x31

    .line 112
    .line 113
    iput p1, p0, LZg/a;->k:I

    .line 114
    .line 115
    const/16 p1, 0xc4

    .line 116
    .line 117
    iput p1, p0, LZg/a;->l:I

    .line 118
    .line 119
    iput v4, p0, LZg/a;->m:I

    .line 120
    .line 121
    iput v9, p0, LZg/a;->n:I

    .line 122
    .line 123
    const/16 p1, 0x37

    .line 124
    .line 125
    iput p1, p0, LZg/a;->o:I

    .line 126
    .line 127
    iput v8, p0, LZg/a;->d:I

    .line 128
    .line 129
    iput v5, p0, LZg/a;->e:I

    .line 130
    .line 131
    iput v5, p0, LZg/a;->f:I

    .line 132
    .line 133
    const/16 p1, 0x30

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_2
    iput v3, p0, LZg/a;->h:I

    .line 137
    .line 138
    iput v3, p0, LZg/a;->i:I

    .line 139
    .line 140
    iput v6, p0, LZg/a;->j:I

    .line 141
    .line 142
    const/16 p1, 0x27

    .line 143
    .line 144
    iput p1, p0, LZg/a;->k:I

    .line 145
    .line 146
    const/16 p1, 0x4e

    .line 147
    .line 148
    iput p1, p0, LZg/a;->l:I

    .line 149
    .line 150
    iput v1, p0, LZg/a;->m:I

    .line 151
    .line 152
    const p1, 0x17400

    .line 153
    .line 154
    .line 155
    iput p1, p0, LZg/a;->n:I

    .line 156
    .line 157
    const/16 p1, 0x50

    .line 158
    .line 159
    iput p1, p0, LZg/a;->o:I

    .line 160
    .line 161
    const/16 p1, 0x240

    .line 162
    .line 163
    iput p1, p0, LZg/a;->d:I

    .line 164
    .line 165
    const/16 p1, 0xc0

    .line 166
    .line 167
    iput p1, p0, LZg/a;->e:I

    .line 168
    .line 169
    iput v2, p0, LZg/a;->f:I

    .line 170
    .line 171
    iput v0, p0, LZg/a;->p:I

    .line 172
    .line 173
    :goto_1
    if-eqz p3, :cond_3

    .line 174
    .line 175
    new-instance p1, LZg/f$a;

    .line 176
    .line 177
    invoke-direct {p1}, LZg/f$a;-><init>()V

    .line 178
    .line 179
    .line 180
    :goto_2
    iput-object p1, p0, LZg/a;->u:LZg/f;

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_3
    new-instance p1, LZg/f$b;

    .line 184
    .line 185
    invoke-direct {p1}, LZg/f$b;-><init>()V

    .line 186
    .line 187
    .line 188
    goto :goto_2

    .line 189
    :goto_3
    iput-object p2, p0, LZg/a;->a:Ljava/security/SecureRandom;

    .line 190
    .line 191
    iget p1, p0, LZg/a;->o:I

    .line 192
    .line 193
    iget p2, p0, LZg/a;->h:I

    .line 194
    .line 195
    add-int/2addr p1, p2

    .line 196
    iput p1, p0, LZg/a;->c:I

    .line 197
    .line 198
    mul-int/lit16 p3, p2, 0x140

    .line 199
    .line 200
    add-int/2addr p3, v0

    .line 201
    iput p3, p0, LZg/a;->q:I

    .line 202
    .line 203
    iget p3, p0, LZg/a;->i:I

    .line 204
    .line 205
    iget v0, p0, LZg/a;->f:I

    .line 206
    .line 207
    mul-int v2, p3, v0

    .line 208
    .line 209
    add-int/2addr v2, v5

    .line 210
    mul-int/2addr v0, p2

    .line 211
    add-int/2addr v2, v0

    .line 212
    mul-int/lit16 p2, p2, 0x1a0

    .line 213
    .line 214
    add-int/2addr v2, p2

    .line 215
    iput v2, p0, LZg/a;->r:I

    .line 216
    .line 217
    iget p2, p0, LZg/a;->p:I

    .line 218
    .line 219
    iget v0, p0, LZg/a;->d:I

    .line 220
    .line 221
    mul-int/2addr p3, v0

    .line 222
    add-int/2addr p2, p3

    .line 223
    add-int/2addr p2, p1

    .line 224
    iput p2, p0, LZg/a;->s:I

    .line 225
    .line 226
    iget p1, p0, LZg/a;->m:I

    .line 227
    .line 228
    if-ne p1, v1, :cond_4

    .line 229
    .line 230
    iget-object p1, p0, LZg/a;->u:LZg/f;

    .line 231
    .line 232
    iget p1, p1, LZg/f;->b:I

    .line 233
    .line 234
    add-int/lit16 p2, p1, 0x23f

    .line 235
    .line 236
    :goto_4
    div-int/2addr p2, p1

    .line 237
    iput p2, p0, LZg/a;->t:I

    .line 238
    .line 239
    return-void

    .line 240
    :cond_4
    if-ne p1, v4, :cond_5

    .line 241
    .line 242
    iget-object p1, p0, LZg/a;->u:LZg/f;

    .line 243
    .line 244
    iget p1, p1, LZg/f;->b:I

    .line 245
    .line 246
    add-int/lit16 p2, p1, 0x27f

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    .line 250
    .line 251
    const-string p2, "Wrong Dilithium Gamma1!"

    .line 252
    .line 253
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw p1
.end method


# virtual methods
.method a()I
    .locals 1

    .line 1
    iget v0, p0, LZg/a;->h:I

    .line 2
    .line 3
    return v0
.end method

.method b()I
    .locals 1

    .line 1
    iget v0, p0, LZg/a;->i:I

    .line 2
    .line 3
    return v0
.end method

.method c()I
    .locals 1

    .line 1
    iget v0, p0, LZg/a;->f:I

    .line 2
    .line 3
    return v0
.end method
