.class public final Lcom/facebook/react/views/text/q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/text/q$a;
    }
.end annotation


# static fields
.field public static final C:Lcom/facebook/react/views/text/q$a;

.field private static final D:I


# instance fields
.field private A:F

.field private B:I

.field private a:F

.field private b:Z

.field private c:Z

.field private d:F

.field private e:Z

.field private f:F

.field private g:I

.field private h:I

.field private i:F

.field private j:F

.field private k:F

.field private l:I

.field private m:Lcom/facebook/react/views/text/t;

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Lcom/facebook/react/uimanager/D$b;

.field private r:Lcom/facebook/react/uimanager/D$d;

.field private s:I

.field private t:I

.field private u:Ljava/lang/String;

.field private v:Ljava/lang/String;

.field private w:Ljava/lang/Integer;

.field private x:Ljava/lang/Integer;

.field private y:F

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/text/q$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/q$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/text/q;->C:Lcom/facebook/react/views/text/q$a;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    sput v0, Lcom/facebook/react/views/text/q;->D:I

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 3
    iput v0, p0, Lcom/facebook/react/views/text/q;->a:F

    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lcom/facebook/react/views/text/q;->c:Z

    .line 5
    iput v0, p0, Lcom/facebook/react/views/text/q;->d:F

    .line 6
    iput v0, p0, Lcom/facebook/react/views/text/q;->f:F

    const/4 v2, -0x1

    .line 7
    iput v2, p0, Lcom/facebook/react/views/text/q;->g:I

    .line 8
    iput v2, p0, Lcom/facebook/react/views/text/q;->h:I

    const/high16 v3, -0x40800000    # -1.0f

    .line 9
    iput v3, p0, Lcom/facebook/react/views/text/q;->i:F

    .line 10
    iput v3, p0, Lcom/facebook/react/views/text/q;->j:F

    .line 11
    iput v0, p0, Lcom/facebook/react/views/text/q;->k:F

    .line 12
    iput v2, p0, Lcom/facebook/react/views/text/q;->l:I

    .line 13
    sget-object v0, Lcom/facebook/react/views/text/t;->b:Lcom/facebook/react/views/text/t;

    iput-object v0, p0, Lcom/facebook/react/views/text/q;->m:Lcom/facebook/react/views/text/t;

    .line 14
    iput-boolean v1, p0, Lcom/facebook/react/views/text/q;->p:Z

    .line 15
    iput v2, p0, Lcom/facebook/react/views/text/q;->s:I

    .line 16
    iput v2, p0, Lcom/facebook/react/views/text/q;->t:I

    const/4 v0, 0x0

    .line 17
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/views/text/q;->x:Ljava/lang/Integer;

    const/high16 v0, 0x55000000

    .line 18
    iput v0, p0, Lcom/facebook/react/views/text/q;->B:I

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/text/q;-><init>()V

    return-void
.end method

.method private final R(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    sget-object v0, Lcom/facebook/react/uimanager/D$b;->a:Lcom/facebook/react/uimanager/D$b$a;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/D$b$a;->b(Ljava/lang/String;)Lcom/facebook/react/uimanager/D$b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :goto_0
    iput-object p1, p0, Lcom/facebook/react/views/text/q;->q:Lcom/facebook/react/uimanager/D$b;

    .line 12
    .line 13
    return-void
.end method

.method private final S(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/text/q;->c:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/facebook/react/views/text/q;->c:Z

    .line 6
    .line 7
    iget p1, p0, Lcom/facebook/react/views/text/q;->i:F

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->V(F)V

    .line 10
    .line 11
    .line 12
    iget p1, p0, Lcom/facebook/react/views/text/q;->j:F

    .line 13
    .line 14
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->b0(F)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method private final T(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    iput-boolean v0, p0, Lcom/facebook/react/views/text/q;->e:Z

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    iput-object p1, p0, Lcom/facebook/react/views/text/q;->x:Ljava/lang/Integer;

    .line 11
    .line 12
    :cond_1
    return-void
.end method

.method private final U(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    iput-boolean v0, p0, Lcom/facebook/react/views/text/q;->b:Z

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    iput-object p1, p0, Lcom/facebook/react/views/text/q;->w:Ljava/lang/Integer;

    .line 11
    .line 12
    :cond_1
    return-void
.end method

.method private final V(F)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/facebook/react/views/text/q;->i:F

    .line 2
    .line 3
    const/high16 v0, -0x40800000    # -1.0f

    .line 4
    .line 5
    cmpg-float v0, p1, v0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/views/text/q;->c:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget v0, p0, Lcom/facebook/react/views/text/q;->d:F

    .line 15
    .line 16
    invoke-static {p1, v0}, Lcom/facebook/react/uimanager/B;->l(FF)F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    float-to-double v0, p1

    .line 21
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    :goto_0
    double-to-float p1, v0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-static {p1}, Lcom/facebook/react/uimanager/B;->i(F)F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    float-to-double v0, p1

    .line 32
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    goto :goto_0

    .line 37
    :goto_1
    float-to-int p1, p1

    .line 38
    iput p1, p0, Lcom/facebook/react/views/text/q;->h:I

    .line 39
    .line 40
    return-void
.end method

.method private final W(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/facebook/react/views/text/p;->b(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lcom/facebook/react/views/text/q;->s:I

    .line 6
    .line 7
    return-void
.end method

.method private final X(Lcom/facebook/react/common/mapbuffer/a;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1c

    .line 2
    .line 3
    invoke-interface {p1}, Lcom/facebook/react/common/mapbuffer/a;->getCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1b

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/facebook/react/common/mapbuffer/a$c;

    .line 31
    .line 32
    invoke-interface {v1}, Lcom/facebook/react/common/mapbuffer/a$c;->d()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    sparse-switch v2, :sswitch_data_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :sswitch_0
    const-string v2, "stylistic-seventeen"

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    const-string v1, "\'ss17\'"

    .line 56
    .line 57
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :sswitch_1
    const-string v2, "stylistic-fourteen"

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_3

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    const-string v1, "\'ss14\'"

    .line 71
    .line 72
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :sswitch_2
    const-string v2, "stylistic-nineteen"

    .line 77
    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_4

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    const-string v1, "\'ss19\'"

    .line 86
    .line 87
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :sswitch_3
    const-string v2, "small-caps"

    .line 92
    .line 93
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_5

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_5
    const-string v1, "\'smcp\'"

    .line 101
    .line 102
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :sswitch_4
    const-string v2, "stylistic-twenty"

    .line 107
    .line 108
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-nez v1, :cond_6

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_6
    const-string v1, "\'ss20\'"

    .line 116
    .line 117
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :sswitch_5
    const-string v2, "stylistic-twelve"

    .line 122
    .line 123
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-nez v1, :cond_7

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_7
    const-string v1, "\'ss12\'"

    .line 131
    .line 132
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :sswitch_6
    const-string v2, "stylistic-sixteen"

    .line 137
    .line 138
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-nez v1, :cond_8

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_8
    const-string v1, "\'ss16\'"

    .line 146
    .line 147
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :sswitch_7
    const-string v2, "stylistic-two"

    .line 153
    .line 154
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-nez v1, :cond_9

    .line 159
    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :cond_9
    const-string v1, "\'ss02\'"

    .line 163
    .line 164
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    :sswitch_8
    const-string v2, "stylistic-ten"

    .line 170
    .line 171
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-nez v1, :cond_a

    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :cond_a
    const-string v1, "\'ss10\'"

    .line 180
    .line 181
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :sswitch_9
    const-string v2, "stylistic-six"

    .line 187
    .line 188
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-nez v1, :cond_b

    .line 193
    .line 194
    goto/16 :goto_0

    .line 195
    .line 196
    :cond_b
    const-string v1, "\'ss06\'"

    .line 197
    .line 198
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :sswitch_a
    const-string v2, "stylistic-one"

    .line 204
    .line 205
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    if-nez v1, :cond_c

    .line 210
    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :cond_c
    const-string v1, "\'ss01\'"

    .line 214
    .line 215
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    goto/16 :goto_0

    .line 219
    .line 220
    :sswitch_b
    const-string v2, "stylistic-nine"

    .line 221
    .line 222
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-nez v1, :cond_d

    .line 227
    .line 228
    goto/16 :goto_0

    .line 229
    .line 230
    :cond_d
    const-string v1, "\'ss09\'"

    .line 231
    .line 232
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    goto/16 :goto_0

    .line 236
    .line 237
    :sswitch_c
    const-string v2, "stylistic-four"

    .line 238
    .line 239
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-nez v1, :cond_e

    .line 244
    .line 245
    goto/16 :goto_0

    .line 246
    .line 247
    :cond_e
    const-string v1, "\'ss04\'"

    .line 248
    .line 249
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :sswitch_d
    const-string v2, "stylistic-five"

    .line 255
    .line 256
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    if-nez v1, :cond_f

    .line 261
    .line 262
    goto/16 :goto_0

    .line 263
    .line 264
    :cond_f
    const-string v1, "\'ss05\'"

    .line 265
    .line 266
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    goto/16 :goto_0

    .line 270
    .line 271
    :sswitch_e
    const-string v2, "stylistic-eleven"

    .line 272
    .line 273
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    if-nez v1, :cond_10

    .line 278
    .line 279
    goto/16 :goto_0

    .line 280
    .line 281
    :cond_10
    const-string v1, "\'ss11\'"

    .line 282
    .line 283
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    goto/16 :goto_0

    .line 287
    .line 288
    :sswitch_f
    const-string v2, "stylistic-three"

    .line 289
    .line 290
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    if-nez v1, :cond_11

    .line 295
    .line 296
    goto/16 :goto_0

    .line 297
    .line 298
    :cond_11
    const-string v1, "\'ss03\'"

    .line 299
    .line 300
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    goto/16 :goto_0

    .line 304
    .line 305
    :sswitch_10
    const-string v2, "stylistic-seven"

    .line 306
    .line 307
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    if-nez v1, :cond_12

    .line 312
    .line 313
    goto/16 :goto_0

    .line 314
    .line 315
    :cond_12
    const-string v1, "\'ss07\'"

    .line 316
    .line 317
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    goto/16 :goto_0

    .line 321
    .line 322
    :sswitch_11
    const-string v2, "stylistic-eight"

    .line 323
    .line 324
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    if-nez v1, :cond_13

    .line 329
    .line 330
    goto/16 :goto_0

    .line 331
    .line 332
    :cond_13
    const-string v1, "\'ss08\'"

    .line 333
    .line 334
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    goto/16 :goto_0

    .line 338
    .line 339
    :sswitch_12
    const-string v2, "oldstyle-nums"

    .line 340
    .line 341
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    if-nez v1, :cond_14

    .line 346
    .line 347
    goto/16 :goto_0

    .line 348
    .line 349
    :cond_14
    const-string v1, "\'onum\'"

    .line 350
    .line 351
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    goto/16 :goto_0

    .line 355
    .line 356
    :sswitch_13
    const-string v2, "tabular-nums"

    .line 357
    .line 358
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v1

    .line 362
    if-nez v1, :cond_15

    .line 363
    .line 364
    goto/16 :goto_0

    .line 365
    .line 366
    :cond_15
    const-string v1, "\'tnum\'"

    .line 367
    .line 368
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    goto/16 :goto_0

    .line 372
    .line 373
    :sswitch_14
    const-string v2, "lining-nums"

    .line 374
    .line 375
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    if-nez v1, :cond_16

    .line 380
    .line 381
    goto/16 :goto_0

    .line 382
    .line 383
    :cond_16
    const-string v1, "\'lnum\'"

    .line 384
    .line 385
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    goto/16 :goto_0

    .line 389
    .line 390
    :sswitch_15
    const-string v2, "proportional-nums"

    .line 391
    .line 392
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    if-nez v1, :cond_17

    .line 397
    .line 398
    goto/16 :goto_0

    .line 399
    .line 400
    :cond_17
    const-string v1, "\'pnum\'"

    .line 401
    .line 402
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    goto/16 :goto_0

    .line 406
    .line 407
    :sswitch_16
    const-string v2, "stylistic-eighteen"

    .line 408
    .line 409
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v1

    .line 413
    if-nez v1, :cond_18

    .line 414
    .line 415
    goto/16 :goto_0

    .line 416
    .line 417
    :cond_18
    const-string v1, "\'ss18\'"

    .line 418
    .line 419
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    goto/16 :goto_0

    .line 423
    .line 424
    :sswitch_17
    const-string v2, "stylistic-fifteen"

    .line 425
    .line 426
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result v1

    .line 430
    if-nez v1, :cond_19

    .line 431
    .line 432
    goto/16 :goto_0

    .line 433
    .line 434
    :cond_19
    const-string v1, "\'ss15\'"

    .line 435
    .line 436
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    goto/16 :goto_0

    .line 440
    .line 441
    :sswitch_18
    const-string v2, "stylistic-thirteen"

    .line 442
    .line 443
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v1

    .line 447
    if-nez v1, :cond_1a

    .line 448
    .line 449
    goto/16 :goto_0

    .line 450
    .line 451
    :cond_1a
    const-string v1, "\'ss13\'"

    .line 452
    .line 453
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    goto/16 :goto_0

    .line 457
    .line 458
    :cond_1b
    const-string p1, ", "

    .line 459
    .line 460
    invoke-static {p1, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object p1

    .line 464
    iput-object p1, p0, Lcom/facebook/react/views/text/q;->v:Ljava/lang/String;

    .line 465
    .line 466
    return-void

    .line 467
    :cond_1c
    :goto_1
    const/4 p1, 0x0

    .line 468
    iput-object p1, p0, Lcom/facebook/react/views/text/q;->v:Ljava/lang/String;

    .line 469
    .line 470
    return-void

    .line 471
    :sswitch_data_0
    .sparse-switch
        -0x7634064c -> :sswitch_18
        -0x733f3500 -> :sswitch_17
        -0x5b760864 -> :sswitch_16
        -0x473fc7cb -> :sswitch_15
        -0x3f4391b7 -> :sswitch_14
        -0x2e038ca3 -> :sswitch_13
        -0x2751e650 -> :sswitch_12
        0x11ac52f2 -> :sswitch_11
        0x12700270 -> :sswitch_10
        0x127f6801 -> :sswitch_f
        0x24079c3e -> :sswitch_e
        0x3a60dbef -> :sswitch_d
        0x3a60f263 -> :sswitch_c
        0x3a647def -> :sswitch_b
        0x3bb0ad89 -> :sswitch_a
        0x3bb0bc05 -> :sswitch_9
        0x3bb0bf40 -> :sswitch_8
        0x3bb0c16f -> :sswitch_7
        0x3d6f745f -> :sswitch_6
        0x3e3b2c96 -> :sswitch_5
        0x3e3b33ee -> :sswitch_4
        0x468813e7 -> :sswitch_3
        0x573c3149 -> :sswitch_2
        0x62414bbd -> :sswitch_1
        0x7cff8d4a -> :sswitch_0
    .end sparse-switch
.end method

.method private final Y(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/facebook/react/views/text/p;->d(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lcom/facebook/react/views/text/q;->t:I

    .line 6
    .line 7
    return-void
.end method

.method private final Z(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/text/q;->C:Lcom/facebook/react/views/text/q$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/text/q$a;->e(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, Lcom/facebook/react/views/text/q;->l:I

    .line 8
    .line 9
    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    .line 1
    sget v0, Lcom/facebook/react/views/text/q;->D:I

    .line 2
    .line 3
    return v0
.end method

.method private final a0(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/text/q;->k:F

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic b(Lcom/facebook/react/views/text/q;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->R(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final b0(F)V
    .locals 3

    .line 1
    iput p1, p0, Lcom/facebook/react/views/text/q;->j:F

    .line 2
    .line 3
    const/high16 v0, -0x40800000    # -1.0f

    .line 4
    .line 5
    cmpg-float v0, p1, v0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/views/text/q;->c:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static {p1, v2, v0, v1}, Lcom/facebook/react/uimanager/B;->m(FFILjava/lang/Object;)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {p1}, Lcom/facebook/react/uimanager/B;->i(F)F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    :goto_0
    iput p1, p0, Lcom/facebook/react/views/text/q;->a:F

    .line 29
    .line 30
    return-void
.end method

.method public static final synthetic c(Lcom/facebook/react/views/text/q;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->S(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final c0(F)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/q;->d:F

    .line 2
    .line 3
    cmpg-float v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iput p1, p0, Lcom/facebook/react/views/text/q;->d:F

    .line 9
    .line 10
    iget p1, p0, Lcom/facebook/react/views/text/q;->i:F

    .line 11
    .line 12
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->V(F)V

    .line 13
    .line 14
    .line 15
    iget p1, p0, Lcom/facebook/react/views/text/q;->j:F

    .line 16
    .line 17
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->b0(F)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static final synthetic d(Lcom/facebook/react/views/text/q;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->T(Ljava/lang/Integer;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final d0(Lcom/facebook/react/uimanager/D$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/text/q;->r:Lcom/facebook/react/uimanager/D$d;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic e(Lcom/facebook/react/views/text/q;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->U(Ljava/lang/Integer;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final e0(Ljava/lang/String;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/facebook/react/views/text/q;->n:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lcom/facebook/react/views/text/q;->o:Z

    .line 5
    .line 6
    if-eqz p1, :cond_4

    .line 7
    .line 8
    new-instance v1, LDf/p;

    .line 9
    .line 10
    const-string v2, "-"

    .line 11
    .line 12
    invoke-direct {v1, v2}, LDf/p;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1, v0}, LDf/p;->l(Ljava/lang/CharSequence;I)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-interface {p1, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Ljava/lang/String;

    .line 45
    .line 46
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-nez v3, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-interface {v1}, Ljava/util/ListIterator;->nextIndex()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    add-int/2addr v1, v2

    .line 58
    invoke-static {p1, v1}, LUd/u;->T0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    :goto_1
    new-array v1, v0, [Ljava/lang/String;

    .line 68
    .line 69
    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, [Ljava/lang/String;

    .line 74
    .line 75
    array-length v1, p1

    .line 76
    :goto_2
    if-ge v0, v1, :cond_4

    .line 77
    .line 78
    aget-object v3, p1, v0

    .line 79
    .line 80
    const-string v4, "underline"

    .line 81
    .line 82
    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_2

    .line 87
    .line 88
    iput-boolean v2, p0, Lcom/facebook/react/views/text/q;->n:Z

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_2
    const-string v4, "strikethrough"

    .line 92
    .line 93
    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_3

    .line 98
    .line 99
    iput-boolean v2, p0, Lcom/facebook/react/views/text/q;->o:Z

    .line 100
    .line 101
    :cond_3
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    return-void
.end method

.method public static final synthetic f(Lcom/facebook/react/views/text/q;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/text/q;->u:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method private final f0(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/q;->B:I

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/facebook/react/views/text/q;->B:I

    .line 6
    .line 7
    :cond_0
    return-void
.end method

.method public static final synthetic g(Lcom/facebook/react/views/text/q;F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->V(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final g0(F)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/facebook/react/uimanager/B;->i(F)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lcom/facebook/react/views/text/q;->y:F

    .line 6
    .line 7
    return-void
.end method

.method public static final synthetic h(Lcom/facebook/react/views/text/q;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->W(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final h0(F)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/facebook/react/uimanager/B;->i(F)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lcom/facebook/react/views/text/q;->z:F

    .line 6
    .line 7
    return-void
.end method

.method public static final synthetic i(Lcom/facebook/react/views/text/q;Lcom/facebook/react/common/mapbuffer/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->X(Lcom/facebook/react/common/mapbuffer/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final i0(F)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/q;->A:F

    .line 2
    .line 3
    cmpg-float v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iput p1, p0, Lcom/facebook/react/views/text/q;->A:F

    .line 9
    .line 10
    return-void
.end method

.method public static final synthetic j(Lcom/facebook/react/views/text/q;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->Y(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final j0(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sparse-switch v0, :sswitch_data_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :sswitch_0
    const-string v0, "uppercase"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object p1, Lcom/facebook/react/views/text/t;->c:Lcom/facebook/react/views/text/t;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :sswitch_1
    const-string v0, "none"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :sswitch_2
    const-string v0, "lowercase"

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    sget-object p1, Lcom/facebook/react/views/text/t;->d:Lcom/facebook/react/views/text/t;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :sswitch_3
    const-string v0, "capitalize"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v1, "Invalid textTransform: "

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const-string v0, "ReactNative"

    .line 70
    .line 71
    invoke-static {v0, p1}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    sget-object p1, Lcom/facebook/react/views/text/t;->b:Lcom/facebook/react/views/text/t;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    sget-object p1, Lcom/facebook/react/views/text/t;->e:Lcom/facebook/react/views/text/t;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    sget-object p1, Lcom/facebook/react/views/text/t;->b:Lcom/facebook/react/views/text/t;

    .line 81
    .line 82
    :goto_1
    iput-object p1, p0, Lcom/facebook/react/views/text/q;->m:Lcom/facebook/react/views/text/t;

    .line 83
    .line 84
    return-void

    .line 85
    :sswitch_data_0
    .sparse-switch
        -0x693d8114 -> :sswitch_3
        -0x1eaac24f -> :sswitch_2
        0x33af38 -> :sswitch_1
        0xd52b2d2 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final synthetic k(Lcom/facebook/react/views/text/q;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->Z(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic l(Lcom/facebook/react/views/text/q;F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->a0(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic m(Lcom/facebook/react/views/text/q;F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->b0(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic n(Lcom/facebook/react/views/text/q;F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->c0(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic o(Lcom/facebook/react/views/text/q;F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/text/q;->f:F

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic p(Lcom/facebook/react/views/text/q;Lcom/facebook/react/uimanager/D$d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->d0(Lcom/facebook/react/uimanager/D$d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic q(Lcom/facebook/react/views/text/q;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->e0(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic r(Lcom/facebook/react/views/text/q;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->f0(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic s(Lcom/facebook/react/views/text/q;F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->g0(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic t(Lcom/facebook/react/views/text/q;F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->h0(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic u(Lcom/facebook/react/views/text/q;F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->i0(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic v(Lcom/facebook/react/views/text/q;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/q;->j0(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/q;->v:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final B()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/q;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public final C()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/q;->s:I

    .line 2
    .line 3
    return v0
.end method

.method public final D()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/q;->t:I

    .line 2
    .line 3
    return v0
.end method

.method public final E()F
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/text/q;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/facebook/react/views/text/q;->k:F

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-static {v0, v3, v1, v2}, Lcom/facebook/react/uimanager/B;->m(FFILjava/lang/Object;)F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget v0, p0, Lcom/facebook/react/views/text/q;->k:F

    .line 16
    .line 17
    invoke-static {v0}, Lcom/facebook/react/uimanager/B;->i(F)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :goto_0
    iget v1, p0, Lcom/facebook/react/views/text/q;->h:I

    .line 22
    .line 23
    if-lez v1, :cond_1

    .line 24
    .line 25
    int-to-float v1, v1

    .line 26
    div-float/2addr v0, v1

    .line 27
    return v0

    .line 28
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v2, "FontSize should be a positive value. Current value: "

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v1
.end method

.method public final F()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/q;->a:F

    .line 2
    .line 3
    return v0
.end method

.method public final G()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/q;->f:F

    .line 2
    .line 3
    return v0
.end method

.method public final H()Lcom/facebook/react/uimanager/D$d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/q;->r:Lcom/facebook/react/uimanager/D$d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final I()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/q;->B:I

    .line 2
    .line 3
    return v0
.end method

.method public final J()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/q;->y:F

    .line 2
    .line 3
    return v0
.end method

.method public final K()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/q;->z:F

    .line 2
    .line 3
    return v0
.end method

.method public final L()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/q;->A:F

    .line 2
    .line 3
    return v0
.end method

.method public final M()Lcom/facebook/react/views/text/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/q;->m:Lcom/facebook/react/views/text/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public final N()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/text/q;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public final O()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/text/q;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public final P()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/text/q;->o:Z

    .line 2
    .line 3
    return v0
.end method

.method public final Q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/text/q;->n:Z

    .line 2
    .line 3
    return v0
.end method

.method public final w()Lcom/facebook/react/uimanager/D$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/q;->q:Lcom/facebook/react/uimanager/D$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/q;->x:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/q;->w:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/q;->u:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
