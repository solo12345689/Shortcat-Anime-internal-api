.class public final Lz6/W;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz6/W$a;
    }
.end annotation


# static fields
.field public static final K:Lz6/W$a;


# instance fields
.field private final A:Lkotlin/Lazy;

.field private final B:Lkotlin/Lazy;

.field private final C:Lkotlin/Lazy;

.field private final D:Lkotlin/Lazy;

.field private final E:Lkotlin/Lazy;

.field private final F:Lkotlin/Lazy;

.field private final G:Lkotlin/Lazy;

.field private final H:Lkotlin/Lazy;

.field private final I:Lkotlin/Lazy;

.field private final J:Lkotlin/Lazy;

.field private final a:Landroid/content/ContentResolver;

.field private final b:Lz6/C;

.field private final c:Lcom/facebook/imagepipeline/producers/X;

.field private final d:Z

.field private final e:Z

.field private final f:Lcom/facebook/imagepipeline/producers/p0;

.field private final g:Lz6/n;

.field private final h:Z

.field private final i:Z

.field private final j:Z

.field private final k:LM6/d;

.field private final l:Z

.field private final m:Z

.field private final n:Z

.field private final o:Ljava/util/Set;

.field private p:Ljava/util/Map;

.field private q:Ljava/util/Map;

.field private r:Ljava/util/Map;

.field private final s:Lkotlin/Lazy;

.field private final t:Lkotlin/Lazy;

.field private final u:Lkotlin/Lazy;

.field private final v:Lkotlin/Lazy;

.field private final w:Lkotlin/Lazy;

.field private final x:Lkotlin/Lazy;

.field private final y:Lkotlin/Lazy;

.field private final z:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lz6/W$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lz6/W$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lz6/W;->K:Lz6/W$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/ContentResolver;Lz6/C;Lcom/facebook/imagepipeline/producers/X;ZZLcom/facebook/imagepipeline/producers/p0;Lz6/n;ZZZLM6/d;ZZZLjava/util/Set;)V
    .locals 1

    .line 1
    const-string v0, "contentResolver"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "producerFactory"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "networkFetcher"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "threadHandoffProducerQueue"

    .line 17
    .line 18
    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "downsampleMode"

    .line 22
    .line 23
    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "imageTranscoderFactory"

    .line 27
    .line 28
    invoke-static {p11, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lz6/W;->a:Landroid/content/ContentResolver;

    .line 35
    .line 36
    iput-object p2, p0, Lz6/W;->b:Lz6/C;

    .line 37
    .line 38
    iput-object p3, p0, Lz6/W;->c:Lcom/facebook/imagepipeline/producers/X;

    .line 39
    .line 40
    iput-boolean p4, p0, Lz6/W;->d:Z

    .line 41
    .line 42
    iput-boolean p5, p0, Lz6/W;->e:Z

    .line 43
    .line 44
    iput-object p6, p0, Lz6/W;->f:Lcom/facebook/imagepipeline/producers/p0;

    .line 45
    .line 46
    iput-object p7, p0, Lz6/W;->g:Lz6/n;

    .line 47
    .line 48
    iput-boolean p8, p0, Lz6/W;->h:Z

    .line 49
    .line 50
    iput-boolean p9, p0, Lz6/W;->i:Z

    .line 51
    .line 52
    iput-boolean p10, p0, Lz6/W;->j:Z

    .line 53
    .line 54
    iput-object p11, p0, Lz6/W;->k:LM6/d;

    .line 55
    .line 56
    iput-boolean p12, p0, Lz6/W;->l:Z

    .line 57
    .line 58
    iput-boolean p13, p0, Lz6/W;->m:Z

    .line 59
    .line 60
    iput-boolean p14, p0, Lz6/W;->n:Z

    .line 61
    .line 62
    move-object/from16 p1, p15

    .line 63
    .line 64
    iput-object p1, p0, Lz6/W;->o:Ljava/util/Set;

    .line 65
    .line 66
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Lz6/W;->p:Ljava/util/Map;

    .line 72
    .line 73
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 74
    .line 75
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lz6/W;->q:Ljava/util/Map;

    .line 79
    .line 80
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 81
    .line 82
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, Lz6/W;->r:Ljava/util/Map;

    .line 86
    .line 87
    new-instance p1, Lz6/D;

    .line 88
    .line 89
    invoke-direct {p1, p0}, Lz6/D;-><init>(Lz6/W;)V

    .line 90
    .line 91
    .line 92
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iput-object p1, p0, Lz6/W;->s:Lkotlin/Lazy;

    .line 97
    .line 98
    new-instance p1, Lz6/V;

    .line 99
    .line 100
    invoke-direct {p1, p0}, Lz6/V;-><init>(Lz6/W;)V

    .line 101
    .line 102
    .line 103
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iput-object p1, p0, Lz6/W;->t:Lkotlin/Lazy;

    .line 108
    .line 109
    new-instance p1, Lz6/E;

    .line 110
    .line 111
    invoke-direct {p1, p0}, Lz6/E;-><init>(Lz6/W;)V

    .line 112
    .line 113
    .line 114
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    iput-object p1, p0, Lz6/W;->u:Lkotlin/Lazy;

    .line 119
    .line 120
    new-instance p1, Lz6/F;

    .line 121
    .line 122
    invoke-direct {p1, p0}, Lz6/F;-><init>(Lz6/W;)V

    .line 123
    .line 124
    .line 125
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    iput-object p1, p0, Lz6/W;->v:Lkotlin/Lazy;

    .line 130
    .line 131
    new-instance p1, Lz6/G;

    .line 132
    .line 133
    invoke-direct {p1, p0}, Lz6/G;-><init>(Lz6/W;)V

    .line 134
    .line 135
    .line 136
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    iput-object p1, p0, Lz6/W;->w:Lkotlin/Lazy;

    .line 141
    .line 142
    new-instance p1, Lz6/H;

    .line 143
    .line 144
    invoke-direct {p1, p0}, Lz6/H;-><init>(Lz6/W;)V

    .line 145
    .line 146
    .line 147
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    iput-object p1, p0, Lz6/W;->x:Lkotlin/Lazy;

    .line 152
    .line 153
    new-instance p1, Lz6/I;

    .line 154
    .line 155
    invoke-direct {p1, p0}, Lz6/I;-><init>(Lz6/W;)V

    .line 156
    .line 157
    .line 158
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    iput-object p1, p0, Lz6/W;->y:Lkotlin/Lazy;

    .line 163
    .line 164
    new-instance p1, Lz6/J;

    .line 165
    .line 166
    invoke-direct {p1, p0}, Lz6/J;-><init>(Lz6/W;)V

    .line 167
    .line 168
    .line 169
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    iput-object p1, p0, Lz6/W;->z:Lkotlin/Lazy;

    .line 174
    .line 175
    new-instance p1, Lz6/K;

    .line 176
    .line 177
    invoke-direct {p1, p0}, Lz6/K;-><init>(Lz6/W;)V

    .line 178
    .line 179
    .line 180
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    iput-object p1, p0, Lz6/W;->A:Lkotlin/Lazy;

    .line 185
    .line 186
    new-instance p1, Lz6/L;

    .line 187
    .line 188
    invoke-direct {p1, p0}, Lz6/L;-><init>(Lz6/W;)V

    .line 189
    .line 190
    .line 191
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    iput-object p1, p0, Lz6/W;->B:Lkotlin/Lazy;

    .line 196
    .line 197
    new-instance p1, Lz6/M;

    .line 198
    .line 199
    invoke-direct {p1, p0}, Lz6/M;-><init>(Lz6/W;)V

    .line 200
    .line 201
    .line 202
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    iput-object p1, p0, Lz6/W;->C:Lkotlin/Lazy;

    .line 207
    .line 208
    new-instance p1, Lz6/N;

    .line 209
    .line 210
    invoke-direct {p1, p0}, Lz6/N;-><init>(Lz6/W;)V

    .line 211
    .line 212
    .line 213
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    iput-object p1, p0, Lz6/W;->D:Lkotlin/Lazy;

    .line 218
    .line 219
    new-instance p1, Lz6/O;

    .line 220
    .line 221
    invoke-direct {p1, p0}, Lz6/O;-><init>(Lz6/W;)V

    .line 222
    .line 223
    .line 224
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    iput-object p1, p0, Lz6/W;->E:Lkotlin/Lazy;

    .line 229
    .line 230
    new-instance p1, Lz6/P;

    .line 231
    .line 232
    invoke-direct {p1, p0}, Lz6/P;-><init>(Lz6/W;)V

    .line 233
    .line 234
    .line 235
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    iput-object p1, p0, Lz6/W;->F:Lkotlin/Lazy;

    .line 240
    .line 241
    new-instance p1, Lz6/Q;

    .line 242
    .line 243
    invoke-direct {p1, p0}, Lz6/Q;-><init>(Lz6/W;)V

    .line 244
    .line 245
    .line 246
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    iput-object p1, p0, Lz6/W;->G:Lkotlin/Lazy;

    .line 251
    .line 252
    new-instance p1, Lz6/S;

    .line 253
    .line 254
    invoke-direct {p1, p0}, Lz6/S;-><init>(Lz6/W;)V

    .line 255
    .line 256
    .line 257
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    iput-object p1, p0, Lz6/W;->H:Lkotlin/Lazy;

    .line 262
    .line 263
    new-instance p1, Lz6/T;

    .line 264
    .line 265
    invoke-direct {p1, p0}, Lz6/T;-><init>(Lz6/W;)V

    .line 266
    .line 267
    .line 268
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    iput-object p1, p0, Lz6/W;->I:Lkotlin/Lazy;

    .line 273
    .line 274
    new-instance p1, Lz6/U;

    .line 275
    .line 276
    invoke-direct {p1, p0}, Lz6/U;-><init>(Lz6/W;)V

    .line 277
    .line 278
    .line 279
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    iput-object p1, p0, Lz6/W;->J:Lkotlin/Lazy;

    .line 284
    .line 285
    return-void
.end method

.method private final A(LK6/b;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 5

    .line 1
    invoke-static {}, LL6/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "Unsupported uri scheme! Uri is: "

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const-string v3, "Uri is null."

    .line 9
    .line 10
    const-string v4, "getSourceUri(...)"

    .line 11
    .line 12
    if-nez v0, :cond_7

    .line 13
    .line 14
    invoke-virtual {p1}, LK6/b;->v()Landroid/net/Uri;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    if-eqz v0, :cond_6

    .line 22
    .line 23
    invoke-virtual {p1}, LK6/b;->w()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_5

    .line 28
    .line 29
    packed-switch v3, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lz6/W;->o:Ljava/util/Set;

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    throw v2

    .line 54
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 55
    .line 56
    sget-object v2, Lz6/W;->K:Lz6/W$a;

    .line 57
    .line 58
    invoke-static {v2, v0}, Lz6/W$a;->a(Lz6/W$a;Landroid/net/Uri;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-instance v2, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :pswitch_0
    invoke-virtual {p0}, Lz6/W;->R()Lcom/facebook/imagepipeline/producers/d0;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    return-object p1

    .line 86
    :pswitch_1
    invoke-virtual {p0}, Lz6/W;->D()Lcom/facebook/imagepipeline/producers/d0;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1

    .line 91
    :pswitch_2
    invoke-virtual {p0}, Lz6/W;->L()Lcom/facebook/imagepipeline/producers/d0;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    return-object p1

    .line 96
    :pswitch_3
    invoke-virtual {p0}, Lz6/W;->H()Lcom/facebook/imagepipeline/producers/d0;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    return-object p1

    .line 101
    :pswitch_4
    invoke-virtual {p1}, LK6/b;->i()Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_1

    .line 106
    .line 107
    invoke-virtual {p0}, Lz6/W;->M()Lcom/facebook/imagepipeline/producers/d0;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    return-object p1

    .line 112
    :cond_1
    iget-object p1, p0, Lz6/W;->a:Landroid/content/ContentResolver;

    .line 113
    .line 114
    invoke-virtual {p1, v0}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {p1}, LA5/a;->c(Ljava/lang/String;)Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-eqz p1, :cond_2

    .line 123
    .line 124
    invoke-virtual {p0}, Lz6/W;->N()Lcom/facebook/imagepipeline/producers/d0;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    return-object p1

    .line 129
    :cond_2
    invoke-virtual {p0}, Lz6/W;->I()Lcom/facebook/imagepipeline/producers/d0;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    return-object p1

    .line 134
    :pswitch_5
    invoke-virtual {p1}, LK6/b;->i()Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_3

    .line 139
    .line 140
    invoke-virtual {p0}, Lz6/W;->M()Lcom/facebook/imagepipeline/producers/d0;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    return-object p1

    .line 145
    :cond_3
    invoke-virtual {p0}, Lz6/W;->K()Lcom/facebook/imagepipeline/producers/d0;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    return-object p1

    .line 150
    :pswitch_6
    invoke-virtual {p1}, LK6/b;->i()Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_4

    .line 155
    .line 156
    invoke-virtual {p0}, Lz6/W;->M()Lcom/facebook/imagepipeline/producers/d0;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    return-object p1

    .line 161
    :cond_4
    invoke-virtual {p0}, Lz6/W;->N()Lcom/facebook/imagepipeline/producers/d0;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    return-object p1

    .line 166
    :cond_5
    invoke-virtual {p0}, Lz6/W;->O()Lcom/facebook/imagepipeline/producers/d0;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    return-object p1

    .line 171
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 172
    .line 173
    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw p1

    .line 177
    :cond_7
    const-string v0, "ProducerSequenceFactory#getBasicDecodedImageSequence"

    .line 178
    .line 179
    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    :try_start_0
    invoke-virtual {p1}, LK6/b;->v()Landroid/net/Uri;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    if-eqz v0, :cond_e

    .line 190
    .line 191
    invoke-virtual {p1}, LK6/b;->w()I

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    if-eqz v3, :cond_d

    .line 196
    .line 197
    packed-switch v3, :pswitch_data_1

    .line 198
    .line 199
    .line 200
    iget-object p1, p0, Lz6/W;->o:Ljava/util/Set;

    .line 201
    .line 202
    if-eqz p1, :cond_8

    .line 203
    .line 204
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    if-eqz v3, :cond_8

    .line 213
    .line 214
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    throw v2

    .line 222
    :catchall_0
    move-exception p1

    .line 223
    goto/16 :goto_1

    .line 224
    .line 225
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 226
    .line 227
    sget-object v2, Lz6/W;->K:Lz6/W$a;

    .line 228
    .line 229
    invoke-static {v2, v0}, Lz6/W$a;->a(Lz6/W$a;Landroid/net/Uri;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    new-instance v2, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw p1

    .line 252
    :pswitch_7
    invoke-virtual {p0}, Lz6/W;->R()Lcom/facebook/imagepipeline/producers/d0;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    goto :goto_0

    .line 257
    :pswitch_8
    invoke-virtual {p0}, Lz6/W;->D()Lcom/facebook/imagepipeline/producers/d0;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    goto :goto_0

    .line 262
    :pswitch_9
    invoke-virtual {p0}, Lz6/W;->L()Lcom/facebook/imagepipeline/producers/d0;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    goto :goto_0

    .line 267
    :pswitch_a
    invoke-virtual {p0}, Lz6/W;->H()Lcom/facebook/imagepipeline/producers/d0;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    goto :goto_0

    .line 272
    :pswitch_b
    invoke-virtual {p1}, LK6/b;->i()Z

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    if-eqz p1, :cond_9

    .line 277
    .line 278
    invoke-virtual {p0}, Lz6/W;->M()Lcom/facebook/imagepipeline/producers/d0;

    .line 279
    .line 280
    .line 281
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 282
    invoke-static {}, LL6/b;->b()V

    .line 283
    .line 284
    .line 285
    return-object p1

    .line 286
    :cond_9
    :try_start_1
    iget-object p1, p0, Lz6/W;->a:Landroid/content/ContentResolver;

    .line 287
    .line 288
    invoke-virtual {p1, v0}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    invoke-static {p1}, LA5/a;->c(Ljava/lang/String;)Z

    .line 293
    .line 294
    .line 295
    move-result p1

    .line 296
    if-eqz p1, :cond_a

    .line 297
    .line 298
    invoke-virtual {p0}, Lz6/W;->N()Lcom/facebook/imagepipeline/producers/d0;

    .line 299
    .line 300
    .line 301
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 302
    invoke-static {}, LL6/b;->b()V

    .line 303
    .line 304
    .line 305
    return-object p1

    .line 306
    :cond_a
    :try_start_2
    invoke-virtual {p0}, Lz6/W;->I()Lcom/facebook/imagepipeline/producers/d0;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    goto :goto_0

    .line 311
    :pswitch_c
    invoke-virtual {p1}, LK6/b;->i()Z

    .line 312
    .line 313
    .line 314
    move-result p1

    .line 315
    if-eqz p1, :cond_b

    .line 316
    .line 317
    invoke-virtual {p0}, Lz6/W;->M()Lcom/facebook/imagepipeline/producers/d0;

    .line 318
    .line 319
    .line 320
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 321
    invoke-static {}, LL6/b;->b()V

    .line 322
    .line 323
    .line 324
    return-object p1

    .line 325
    :cond_b
    :try_start_3
    invoke-virtual {p0}, Lz6/W;->K()Lcom/facebook/imagepipeline/producers/d0;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    goto :goto_0

    .line 330
    :pswitch_d
    invoke-virtual {p1}, LK6/b;->i()Z

    .line 331
    .line 332
    .line 333
    move-result p1

    .line 334
    if-eqz p1, :cond_c

    .line 335
    .line 336
    invoke-virtual {p0}, Lz6/W;->M()Lcom/facebook/imagepipeline/producers/d0;

    .line 337
    .line 338
    .line 339
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 340
    invoke-static {}, LL6/b;->b()V

    .line 341
    .line 342
    .line 343
    return-object p1

    .line 344
    :cond_c
    :try_start_4
    invoke-virtual {p0}, Lz6/W;->N()Lcom/facebook/imagepipeline/producers/d0;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    goto :goto_0

    .line 349
    :cond_d
    invoke-virtual {p0}, Lz6/W;->O()Lcom/facebook/imagepipeline/producers/d0;

    .line 350
    .line 351
    .line 352
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 353
    :goto_0
    invoke-static {}, LL6/b;->b()V

    .line 354
    .line 355
    .line 356
    return-object p1

    .line 357
    :cond_e
    :try_start_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 358
    .line 359
    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 363
    :goto_1
    invoke-static {}, LL6/b;->b()V

    .line 364
    .line 365
    .line 366
    throw p1

    .line 367
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch
.end method

.method private final declared-synchronized B(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lz6/W;->r:Ljava/util/Map;

    .line 3
    .line 4
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lz6/C;->f(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/j;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lz6/W;->r:Ljava/util/Map;

    .line 19
    .line 20
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    monitor-exit p0

    .line 27
    return-object v0

    .line 28
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    throw p1
.end method

.method private final declared-synchronized F(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Lz6/C;->k(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/s;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const-string v0, "newDelayProducer(...)"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    monitor-exit p0

    .line 14
    return-object p1

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw p1
.end method

.method private final declared-synchronized Q(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lz6/W;->p:Ljava/util/Map;

    .line 3
    .line 4
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lz6/C;->B(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/b0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "newPostprocessorProducer(...)"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lz6/W;->b:Lz6/C;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lz6/C;->A(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/a0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lz6/W;->p:Ljava/util/Map;

    .line 30
    .line 31
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    monitor-exit p0

    .line 38
    return-object v0

    .line 39
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    throw p1
.end method

.method private static final S(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 7
    .line 8
    invoke-virtual {v0}, Lz6/C;->q()Lcom/facebook/imagepipeline/producers/H;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "newLocalAssetFetchProducer(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0}, Lz6/W;->g0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method private static final T(Lz6/W;)Lcom/facebook/imagepipeline/producers/j0;
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LL6/b;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lcom/facebook/imagepipeline/producers/j0;

    .line 13
    .line 14
    invoke-virtual {p0}, Lz6/W;->x()Lcom/facebook/imagepipeline/producers/d0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {v0, p0}, Lcom/facebook/imagepipeline/producers/j0;-><init>(Lcom/facebook/imagepipeline/producers/d0;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    const-string v0, "ProducerSequenceFactory#getLocalContentUriFetchEncodedImageProducerSequence:init"

    .line 23
    .line 24
    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :try_start_0
    new-instance v0, Lcom/facebook/imagepipeline/producers/j0;

    .line 28
    .line 29
    invoke-virtual {p0}, Lz6/W;->x()Lcom/facebook/imagepipeline/producers/d0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v0, p0}, Lcom/facebook/imagepipeline/producers/j0;-><init>(Lcom/facebook/imagepipeline/producers/d0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    invoke-static {}, LL6/b;->b()V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    invoke-static {}, LL6/b;->b()V

    .line 42
    .line 43
    .line 44
    throw p0
.end method

.method private static final U(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 5

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 7
    .line 8
    invoke-virtual {v0}, Lz6/C;->r()Lcom/facebook/imagepipeline/producers/I;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "newLocalContentUriFetchProducer(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lz6/W;->b:Lz6/C;

    .line 18
    .line 19
    invoke-virtual {v1}, Lz6/C;->s()Lcom/facebook/imagepipeline/producers/J;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v2, p0, Lz6/W;->b:Lz6/C;

    .line 24
    .line 25
    invoke-virtual {v2}, Lz6/C;->t()Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v3, 0x2

    .line 30
    new-array v3, v3, [Lcom/facebook/imagepipeline/producers/u0;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    aput-object v1, v3, v4

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    aput-object v2, v3, v1

    .line 37
    .line 38
    invoke-direct {p0, v0, v3}, Lz6/W;->h0(Lcom/facebook/imagepipeline/producers/d0;[Lcom/facebook/imagepipeline/producers/u0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method private static final V(Lz6/W;)Lcom/facebook/imagepipeline/producers/j0;
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LL6/b;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lcom/facebook/imagepipeline/producers/j0;

    .line 13
    .line 14
    invoke-virtual {p0}, Lz6/W;->y()Lcom/facebook/imagepipeline/producers/d0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {v0, p0}, Lcom/facebook/imagepipeline/producers/j0;-><init>(Lcom/facebook/imagepipeline/producers/d0;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    const-string v0, "ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init"

    .line 23
    .line 24
    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :try_start_0
    new-instance v0, Lcom/facebook/imagepipeline/producers/j0;

    .line 28
    .line 29
    invoke-virtual {p0}, Lz6/W;->y()Lcom/facebook/imagepipeline/producers/d0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v0, p0}, Lcom/facebook/imagepipeline/producers/j0;-><init>(Lcom/facebook/imagepipeline/producers/d0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    invoke-static {}, LL6/b;->b()V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    invoke-static {}, LL6/b;->b()V

    .line 42
    .line 43
    .line 44
    throw p0
.end method

.method private static final W(Lz6/W;)Lcom/facebook/imagepipeline/producers/n0;
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LL6/b;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 13
    .line 14
    invoke-virtual {p0}, Lz6/W;->y()Lcom/facebook/imagepipeline/producers/d0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {v0, p0}, Lz6/C;->E(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/n0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_0
    const-string v0, "ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init"

    .line 24
    .line 25
    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :try_start_0
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 29
    .line 30
    invoke-virtual {p0}, Lz6/W;->y()Lcom/facebook/imagepipeline/producers/d0;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v0, p0}, Lz6/C;->E(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/n0;

    .line 35
    .line 36
    .line 37
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    invoke-static {}, LL6/b;->b()V

    .line 39
    .line 40
    .line 41
    return-object p0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    invoke-static {}, LL6/b;->b()V

    .line 44
    .line 45
    .line 46
    throw p0
.end method

.method private static final X(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 7
    .line 8
    invoke-virtual {v0}, Lz6/C;->u()Lcom/facebook/imagepipeline/producers/M;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "newLocalFileFetchProducer(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0}, Lz6/W;->g0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method private static final Y(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 7
    .line 8
    invoke-virtual {v0}, Lz6/C;->v()Lcom/facebook/imagepipeline/producers/N;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "newLocalResourceFetchProducer(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0}, Lz6/W;->g0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method private static final Z(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1d

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 13
    .line 14
    invoke-virtual {v0}, Lz6/C;->w()Lcom/facebook/imagepipeline/producers/S;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "newLocalThumbnailBitmapSdk29Producer(...)"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, Lz6/W;->e0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_0
    new-instance p0, Ljava/lang/Throwable;

    .line 29
    .line 30
    const-string v0, "Unreachable exception. Just to make linter happy for the lazy block."

    .line 31
    .line 32
    invoke-direct {p0, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p0
.end method

.method public static synthetic a(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    invoke-static {p0}, Lz6/W;->n0(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final a0(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 7
    .line 8
    invoke-virtual {v0}, Lz6/C;->x()Lcom/facebook/imagepipeline/producers/T;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "newLocalVideoThumbnailProducer(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0}, Lz6/W;->e0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static synthetic b(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    invoke-static {p0}, Lz6/W;->u(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final b0(Lz6/W;)Lcom/facebook/imagepipeline/producers/j0;
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LL6/b;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lcom/facebook/imagepipeline/producers/j0;

    .line 13
    .line 14
    invoke-virtual {p0}, Lz6/W;->z()Lcom/facebook/imagepipeline/producers/d0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {v0, p0}, Lcom/facebook/imagepipeline/producers/j0;-><init>(Lcom/facebook/imagepipeline/producers/d0;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    const-string v0, "ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init"

    .line 23
    .line 24
    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :try_start_0
    new-instance v0, Lcom/facebook/imagepipeline/producers/j0;

    .line 28
    .line 29
    invoke-virtual {p0}, Lz6/W;->z()Lcom/facebook/imagepipeline/producers/d0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v0, p0}, Lcom/facebook/imagepipeline/producers/j0;-><init>(Lcom/facebook/imagepipeline/producers/d0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    invoke-static {}, LL6/b;->b()V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    invoke-static {}, LL6/b;->b()V

    .line 42
    .line 43
    .line 44
    throw p0
.end method

.method public static synthetic c(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    invoke-static {p0}, Lz6/W;->s(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c0(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LL6/b;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lz6/W;->C()Lcom/facebook/imagepipeline/producers/d0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0, v0}, Lz6/W;->f0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    const-string v0, "ProducerSequenceFactory#getNetworkFetchSequence:init"

    .line 22
    .line 23
    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :try_start_0
    invoke-virtual {p0}, Lz6/W;->C()Lcom/facebook/imagepipeline/producers/d0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0, v0}, Lz6/W;->f0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 31
    .line 32
    .line 33
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    invoke-static {}, LL6/b;->b()V

    .line 35
    .line 36
    .line 37
    return-object p0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    invoke-static {}, LL6/b;->b()V

    .line 40
    .line 41
    .line 42
    throw p0
.end method

.method public static synthetic d(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    invoke-static {p0}, Lz6/W;->w(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final d0(Lz6/W;)Lcom/facebook/imagepipeline/producers/n0;
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LL6/b;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 13
    .line 14
    invoke-virtual {p0}, Lz6/W;->z()Lcom/facebook/imagepipeline/producers/d0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {v0, p0}, Lz6/C;->E(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/n0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_0
    const-string v0, "ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence"

    .line 24
    .line 25
    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :try_start_0
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 29
    .line 30
    invoke-virtual {p0}, Lz6/W;->z()Lcom/facebook/imagepipeline/producers/d0;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v0, p0}, Lz6/C;->E(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/n0;

    .line 35
    .line 36
    .line 37
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    invoke-static {}, LL6/b;->b()V

    .line 39
    .line 40
    .line 41
    return-object p0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    invoke-static {}, LL6/b;->b()V

    .line 44
    .line 45
    .line 46
    throw p0
.end method

.method public static synthetic e(Lz6/W;)Lcom/facebook/imagepipeline/producers/j0;
    .locals 0

    .line 1
    invoke-static {p0}, Lz6/W;->b0(Lz6/W;)Lcom/facebook/imagepipeline/producers/j0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final e0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz6/C;->e(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/i;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "newBitmapMemoryCacheProducer(...)"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lz6/C;->d(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/h;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "newBitmapMemoryCacheKeyMultiplexProducer(...)"

    .line 19
    .line 20
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 24
    .line 25
    iget-object v1, p0, Lz6/W;->f:Lcom/facebook/imagepipeline/producers/p0;

    .line 26
    .line 27
    invoke-virtual {v0, p1, v1}, Lz6/C;->b(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/p0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v0, "newBackgroundThreadHandoffProducer(...)"

    .line 32
    .line 33
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-boolean v0, p0, Lz6/W;->l:Z

    .line 37
    .line 38
    const-string v1, "newBitmapMemoryCacheGetProducer(...)"

    .line 39
    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    iget-boolean v0, p0, Lz6/W;->m:Z

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Lz6/C;->c(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/g;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object p1

    .line 57
    :cond_1
    :goto_0
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Lz6/C;->c(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/g;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 67
    .line 68
    invoke-virtual {v0, p1}, Lz6/C;->g(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/k;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const-string v0, "newBitmapProbeProducer(...)"

    .line 73
    .line 74
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-object p1
.end method

.method public static synthetic f(Lz6/W;)Lcom/facebook/imagepipeline/producers/n0;
    .locals 0

    .line 1
    invoke-static {p0}, Lz6/W;->d0(Lz6/W;)Lcom/facebook/imagepipeline/producers/n0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic g(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    invoke-static {p0}, Lz6/W;->U(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final g0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 3

    .line 1
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz6/C;->t()Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    new-array v1, v1, [Lcom/facebook/imagepipeline/producers/u0;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aput-object v0, v1, v2

    .line 12
    .line 13
    invoke-direct {p0, p1, v1}, Lz6/W;->h0(Lcom/facebook/imagepipeline/producers/d0;[Lcom/facebook/imagepipeline/producers/u0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public static synthetic h(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    invoke-static {p0}, Lz6/W;->Z(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final h0(Lcom/facebook/imagepipeline/producers/d0;[Lcom/facebook/imagepipeline/producers/u0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lz6/W;->k0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1, p2}, Lz6/W;->m0(Lcom/facebook/imagepipeline/producers/d0;[Lcom/facebook/imagepipeline/producers/u0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lz6/W;->f0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public static synthetic i(Lz6/W;)Lcom/facebook/imagepipeline/producers/j0;
    .locals 0

    .line 1
    invoke-static {p0}, Lz6/W;->T(Lz6/W;)Lcom/facebook/imagepipeline/producers/j0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic j(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    invoke-static {p0}, Lz6/W;->t(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final j0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 3

    .line 1
    invoke-static {}, LL6/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "newDiskCacheReadProducer(...)"

    .line 6
    .line 7
    const-string v2, "newPartialDiskCacheProducer(...)"

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, Lz6/W;->i:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lz6/C;->z(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/Y;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lz6/C;->m(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/w;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lz6/C;->m(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/w;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :goto_0
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lz6/C;->l(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/v;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_1
    const-string v0, "ProducerSequenceFactory#newDiskCacheSequence"

    .line 51
    .line 52
    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :try_start_0
    iget-boolean v0, p0, Lz6/W;->i:Z

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Lz6/C;->z(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/Y;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 69
    .line 70
    invoke-virtual {v0, p1}, Lz6/C;->m(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/w;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    goto :goto_1

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 78
    .line 79
    invoke-virtual {v0, p1}, Lz6/C;->m(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/w;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    :goto_1
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 87
    .line 88
    invoke-virtual {v0, p1}, Lz6/C;->l(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/v;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    .line 95
    invoke-static {}, LL6/b;->b()V

    .line 96
    .line 97
    .line 98
    return-object p1

    .line 99
    :goto_2
    invoke-static {}, LL6/b;->b()V

    .line 100
    .line 101
    .line 102
    throw p1
.end method

.method public static synthetic k(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    invoke-static {p0}, Lz6/W;->v(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final k0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lz6/W;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lz6/W;->j0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lz6/C;->o(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "newEncodedMemoryCacheProducer(...)"

    .line 16
    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-boolean v0, p0, Lz6/W;->m:Z

    .line 21
    .line 22
    const-string v1, "newEncodedCacheKeyMultiplexProducer(...)"

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lz6/C;->p(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/A;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v0, "newEncodedProbeProducer(...)"

    .line 33
    .line 34
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Lz6/C;->n(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/y;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_1
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Lz6/C;->n(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/y;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object p1
.end method

.method public static synthetic l(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    invoke-static {p0}, Lz6/W;->X(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final l0([Lcom/facebook/imagepipeline/producers/u0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 3

    .line 1
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz6/C;->G([Lcom/facebook/imagepipeline/producers/u0;)Lcom/facebook/imagepipeline/producers/t0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "newThumbnailBranchProducer(...)"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iget-object v2, p0, Lz6/W;->k:LM6/d;

    .line 16
    .line 17
    invoke-virtual {v0, p1, v1, v2}, Lz6/C;->D(Lcom/facebook/imagepipeline/producers/d0;ZLM6/d;)Lcom/facebook/imagepipeline/producers/k0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "newResizeAndRotateProducer(...)"

    .line 22
    .line 23
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method public static synthetic m(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    invoke-static {p0}, Lz6/W;->S(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final m0(Lcom/facebook/imagepipeline/producers/d0;[Lcom/facebook/imagepipeline/producers/u0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 3

    .line 1
    invoke-static {p1}, Lz6/C;->a(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "newAddImageTransformMetaDataProducer(...)"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    iget-object v2, p0, Lz6/W;->k:LM6/d;

    .line 14
    .line 15
    invoke-virtual {v0, p1, v1, v2}, Lz6/C;->D(Lcom/facebook/imagepipeline/producers/d0;ZLM6/d;)Lcom/facebook/imagepipeline/producers/k0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lz6/C;->F(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/r0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "newThrottlingProducer(...)"

    .line 26
    .line 27
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, p2}, Lz6/W;->l0([Lcom/facebook/imagepipeline/producers/u0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-static {p2, p1}, Lz6/C;->h(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/l;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string p2, "newBranchOnSeparateImagesProducer(...)"

    .line 39
    .line 40
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object p1
.end method

.method public static synthetic n(Lz6/W;)Lcom/facebook/imagepipeline/producers/n0;
    .locals 0

    .line 1
    invoke-static {p0}, Lz6/W;->W(Lz6/W;)Lcom/facebook/imagepipeline/producers/n0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final n0(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 7
    .line 8
    invoke-virtual {v0}, Lz6/C;->C()Lcom/facebook/imagepipeline/producers/i0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "newQualifiedResourceFetchProducer(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0}, Lz6/W;->g0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static synthetic o(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    invoke-static {p0}, Lz6/W;->a0(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic p(Lz6/W;)Lcom/facebook/imagepipeline/producers/j0;
    .locals 0

    .line 1
    invoke-static {p0}, Lz6/W;->V(Lz6/W;)Lcom/facebook/imagepipeline/producers/j0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic q(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    invoke-static {p0}, Lz6/W;->Y(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic r(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    invoke-static {p0}, Lz6/W;->c0(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final s(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LL6/b;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const-string v1, "newLocalContentUriFetchProducer(...)"

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 15
    .line 16
    invoke-virtual {v0}, Lz6/C;->r()Lcom/facebook/imagepipeline/producers/I;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, Lz6/W;->k0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v1, p0, Lz6/W;->b:Lz6/C;

    .line 28
    .line 29
    iget-object p0, p0, Lz6/W;->f:Lcom/facebook/imagepipeline/producers/p0;

    .line 30
    .line 31
    invoke-virtual {v1, v0, p0}, Lz6/C;->b(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/p0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_0
    const-string v0, "ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence:init"

    .line 37
    .line 38
    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :try_start_0
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 42
    .line 43
    invoke-virtual {v0}, Lz6/C;->r()Lcom/facebook/imagepipeline/producers/I;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, v0}, Lz6/W;->k0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v1, p0, Lz6/W;->b:Lz6/C;

    .line 55
    .line 56
    iget-object p0, p0, Lz6/W;->f:Lcom/facebook/imagepipeline/producers/p0;

    .line 57
    .line 58
    invoke-virtual {v1, v0, p0}, Lz6/C;->b(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/p0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 59
    .line 60
    .line 61
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    invoke-static {}, LL6/b;->b()V

    .line 63
    .line 64
    .line 65
    return-object p0

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    invoke-static {}, LL6/b;->b()V

    .line 68
    .line 69
    .line 70
    throw p0
.end method

.method private static final t(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LL6/b;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const-string v1, "newLocalFileFetchProducer(...)"

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 15
    .line 16
    invoke-virtual {v0}, Lz6/C;->u()Lcom/facebook/imagepipeline/producers/M;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, Lz6/W;->k0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v1, p0, Lz6/W;->b:Lz6/C;

    .line 28
    .line 29
    iget-object p0, p0, Lz6/W;->f:Lcom/facebook/imagepipeline/producers/p0;

    .line 30
    .line 31
    invoke-virtual {v1, v0, p0}, Lz6/C;->b(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/p0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_0
    const-string v0, "ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence"

    .line 37
    .line 38
    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :try_start_0
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 42
    .line 43
    invoke-virtual {v0}, Lz6/C;->u()Lcom/facebook/imagepipeline/producers/M;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, v0}, Lz6/W;->k0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v1, p0, Lz6/W;->b:Lz6/C;

    .line 55
    .line 56
    iget-object p0, p0, Lz6/W;->f:Lcom/facebook/imagepipeline/producers/p0;

    .line 57
    .line 58
    invoke-virtual {v1, v0, p0}, Lz6/C;->b(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/p0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 59
    .line 60
    .line 61
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    invoke-static {}, LL6/b;->b()V

    .line 63
    .line 64
    .line 65
    return-object p0

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    invoke-static {}, LL6/b;->b()V

    .line 68
    .line 69
    .line 70
    throw p0
.end method

.method private static final u(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LL6/b;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 13
    .line 14
    invoke-virtual {p0}, Lz6/W;->C()Lcom/facebook/imagepipeline/producers/d0;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object p0, p0, Lz6/W;->f:Lcom/facebook/imagepipeline/producers/p0;

    .line 19
    .line 20
    invoke-virtual {v0, v1, p0}, Lz6/C;->b(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/p0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_0
    const-string v0, "ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init"

    .line 26
    .line 27
    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :try_start_0
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 31
    .line 32
    invoke-virtual {p0}, Lz6/W;->C()Lcom/facebook/imagepipeline/producers/d0;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object p0, p0, Lz6/W;->f:Lcom/facebook/imagepipeline/producers/p0;

    .line 37
    .line 38
    invoke-virtual {v0, v1, p0}, Lz6/C;->b(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/p0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 39
    .line 40
    .line 41
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    invoke-static {}, LL6/b;->b()V

    .line 43
    .line 44
    .line 45
    return-object p0

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    invoke-static {}, LL6/b;->b()V

    .line 48
    .line 49
    .line 50
    throw p0
.end method

.method private static final v(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LL6/b;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lz6/W;->c:Lcom/facebook/imagepipeline/producers/X;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lz6/W;->i0(Lcom/facebook/imagepipeline/producers/X;)Lcom/facebook/imagepipeline/producers/d0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    const-string v0, "ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence"

    .line 20
    .line 21
    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :try_start_0
    iget-object v0, p0, Lz6/W;->c:Lcom/facebook/imagepipeline/producers/X;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lz6/W;->i0(Lcom/facebook/imagepipeline/producers/X;)Lcom/facebook/imagepipeline/producers/d0;

    .line 27
    .line 28
    .line 29
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    invoke-static {}, LL6/b;->b()V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    invoke-static {}, LL6/b;->b()V

    .line 36
    .line 37
    .line 38
    throw p0
.end method

.method private static final w(Lz6/W;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 4

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 7
    .line 8
    invoke-virtual {v0}, Lz6/C;->i()Lcom/facebook/imagepipeline/producers/o;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "newDataFetchProducer(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lz6/C;->a(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Lz6/W;->b:Lz6/C;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    iget-object v3, p0, Lz6/W;->k:LM6/d;

    .line 25
    .line 26
    invoke-virtual {v1, v0, v2, v3}, Lz6/C;->D(Lcom/facebook/imagepipeline/producers/d0;ZLM6/d;)Lcom/facebook/imagepipeline/producers/k0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0, v0}, Lz6/W;->f0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method


# virtual methods
.method public final C()Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lz6/W;->y:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final D()Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lz6/W;->J:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final E(LK6/b;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    const-string v0, "imageRequest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LL6/b;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    invoke-direct {p0, p1}, Lz6/W;->A(LK6/b;)Lcom/facebook/imagepipeline/producers/d0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1}, LK6/b;->l()LK6/d;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-direct {p0, v0}, Lz6/W;->Q(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    iget-boolean v1, p0, Lz6/W;->h:Z

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-direct {p0, v0}, Lz6/W;->B(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_1
    iget-boolean v1, p0, Lz6/W;->n:Z

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1}, LK6/b;->e()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-lez p1, :cond_2

    .line 43
    .line 44
    invoke-direct {p0, v0}, Lz6/W;->F(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_2
    return-object v0

    .line 50
    :cond_3
    const-string v0, "ProducerSequenceFactory#getDecodedImageProducerSequence"

    .line 51
    .line 52
    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :try_start_0
    invoke-direct {p0, p1}, Lz6/W;->A(LK6/b;)Lcom/facebook/imagepipeline/producers/d0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p1}, LK6/b;->l()LK6/d;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    if-eqz v1, :cond_4

    .line 64
    .line 65
    invoke-direct {p0, v0}, Lz6/W;->Q(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    goto :goto_1

    .line 72
    :cond_4
    :goto_0
    iget-boolean v1, p0, Lz6/W;->h:Z

    .line 73
    .line 74
    if-eqz v1, :cond_5

    .line 75
    .line 76
    invoke-direct {p0, v0}, Lz6/W;->B(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    :cond_5
    iget-boolean v1, p0, Lz6/W;->n:Z

    .line 81
    .line 82
    if-eqz v1, :cond_6

    .line 83
    .line 84
    invoke-virtual {p1}, LK6/b;->e()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-lez p1, :cond_6

    .line 89
    .line 90
    invoke-direct {p0, v0}, Lz6/W;->F(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 91
    .line 92
    .line 93
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    :cond_6
    invoke-static {}, LL6/b;->b()V

    .line 95
    .line 96
    .line 97
    return-object v0

    .line 98
    :goto_1
    invoke-static {}, LL6/b;->b()V

    .line 99
    .line 100
    .line 101
    throw p1
.end method

.method public final G(LK6/b;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 3

    .line 1
    const-string v0, "imageRequest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lz6/W;->K:Lz6/W$a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lz6/W$a;->b(Lz6/W$a;LK6/b;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, LK6/b;->w()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    if-eq v1, v2, :cond_1

    .line 19
    .line 20
    const/4 v2, 0x3

    .line 21
    if-ne v1, v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p1}, LK6/b;->v()Landroid/net/Uri;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v1, "getSourceUri(...)"

    .line 29
    .line 30
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    invoke-static {v0, p1}, Lz6/W$a;->a(Lz6/W$a;Landroid/net/Uri;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v2, "Unsupported uri scheme for encoded image fetch! Uri is: "

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v1

    .line 60
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lz6/W;->J()Lcom/facebook/imagepipeline/producers/d0;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1

    .line 65
    :cond_2
    invoke-virtual {p0}, Lz6/W;->P()Lcom/facebook/imagepipeline/producers/d0;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1
.end method

.method public final H()Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lz6/W;->I:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final I()Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lz6/W;->E:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final J()Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    iget-object v0, p0, Lz6/W;->z:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getValue(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 13
    .line 14
    return-object v0
.end method

.method public final K()Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lz6/W;->C:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final L()Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lz6/W;->H:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final M()Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lz6/W;->F:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final N()Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lz6/W;->D:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final O()Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lz6/W;->v:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final P()Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    iget-object v0, p0, Lz6/W;->x:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getValue(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 13
    .line 14
    return-object v0
.end method

.method public final R()Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lz6/W;->G:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final f0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    const-string v0, "inputProducer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LL6/b;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const-string v1, "newDecodeProducer(...)"

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lz6/C;->j(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/p;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p1}, Lz6/W;->e0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_0
    const-string v0, "ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence"

    .line 29
    .line 30
    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :try_start_0
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Lz6/C;->j(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/p;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, p1}, Lz6/W;->e0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 43
    .line 44
    .line 45
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    invoke-static {}, LL6/b;->b()V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    invoke-static {}, LL6/b;->b()V

    .line 52
    .line 53
    .line 54
    throw p1
.end method

.method public final declared-synchronized i0(Lcom/facebook/imagepipeline/producers/X;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "networkFetcher"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "ProducerSequenceFactory#createCommonNetworkFetchToEncodedMemorySequence"

    .line 8
    .line 9
    invoke-static {}, LL6/b;->d()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lz6/C;->y(Lcom/facebook/imagepipeline/producers/X;)Lcom/facebook/imagepipeline/producers/d0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, "newNetworkFetchProducer(...)"

    .line 24
    .line 25
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, p1}, Lz6/W;->k0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, Lz6/C;->a(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/a;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string v0, "newAddImageTransformMetaDataProducer(...)"

    .line 37
    .line 38
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 42
    .line 43
    iget-boolean v1, p0, Lz6/W;->d:Z

    .line 44
    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    iget-object v1, p0, Lz6/W;->g:Lz6/n;

    .line 48
    .line 49
    sget-object v4, Lz6/n;->c:Lz6/n;

    .line 50
    .line 51
    if-eq v1, v4, :cond_0

    .line 52
    .line 53
    move v2, v3

    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto :goto_3

    .line 57
    :cond_0
    :goto_0
    iget-object v1, p0, Lz6/W;->k:LM6/d;

    .line 58
    .line 59
    invoke-virtual {v0, p1, v2, v1}, Lz6/C;->D(Lcom/facebook/imagepipeline/producers/d0;ZLM6/d;)Lcom/facebook/imagepipeline/producers/k0;

    .line 60
    .line 61
    .line 62
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    monitor-exit p0

    .line 64
    return-object p1

    .line 65
    :cond_1
    :try_start_1
    invoke-static {v0}, LL6/b;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    .line 68
    :try_start_2
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 69
    .line 70
    invoke-virtual {v0, p1}, Lz6/C;->y(Lcom/facebook/imagepipeline/producers/X;)Lcom/facebook/imagepipeline/producers/d0;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const-string v0, "newNetworkFetchProducer(...)"

    .line 75
    .line 76
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-direct {p0, p1}, Lz6/W;->k0(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1}, Lz6/C;->a(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/a;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const-string v0, "newAddImageTransformMetaDataProducer(...)"

    .line 88
    .line 89
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lz6/W;->b:Lz6/C;

    .line 93
    .line 94
    iget-boolean v1, p0, Lz6/W;->d:Z

    .line 95
    .line 96
    if-eqz v1, :cond_2

    .line 97
    .line 98
    iget-object v1, p0, Lz6/W;->g:Lz6/n;

    .line 99
    .line 100
    sget-object v4, Lz6/n;->c:Lz6/n;

    .line 101
    .line 102
    if-eq v1, v4, :cond_2

    .line 103
    .line 104
    move v2, v3

    .line 105
    goto :goto_1

    .line 106
    :catchall_1
    move-exception p1

    .line 107
    goto :goto_2

    .line 108
    :cond_2
    :goto_1
    iget-object v1, p0, Lz6/W;->k:LM6/d;

    .line 109
    .line 110
    invoke-virtual {v0, p1, v2, v1}, Lz6/C;->D(Lcom/facebook/imagepipeline/producers/d0;ZLM6/d;)Lcom/facebook/imagepipeline/producers/k0;

    .line 111
    .line 112
    .line 113
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 114
    :try_start_3
    invoke-static {}, LL6/b;->b()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 115
    .line 116
    .line 117
    monitor-exit p0

    .line 118
    return-object p1

    .line 119
    :goto_2
    :try_start_4
    invoke-static {}, LL6/b;->b()V

    .line 120
    .line 121
    .line 122
    throw p1

    .line 123
    :goto_3
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 124
    throw p1
.end method

.method public final x()Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    iget-object v0, p0, Lz6/W;->B:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getValue(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 13
    .line 14
    return-object v0
.end method

.method public final y()Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    iget-object v0, p0, Lz6/W;->A:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getValue(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 13
    .line 14
    return-object v0
.end method

.method public final z()Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    iget-object v0, p0, Lz6/W;->w:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getValue(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 13
    .line 14
    return-object v0
.end method
