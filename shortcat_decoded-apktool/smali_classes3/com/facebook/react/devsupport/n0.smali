.class public final Lcom/facebook/react/devsupport/n0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/n0$a;,
        Lcom/facebook/react/devsupport/n0$b;
    }
.end annotation


# static fields
.field public static final d:Lcom/facebook/react/devsupport/n0$b;


# instance fields
.field private final a:Ltg/j;

.field private final b:Ljava/lang/String;

.field private c:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/n0$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/n0$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/devsupport/n0;->d:Lcom/facebook/react/devsupport/n0$b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ltg/j;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "boundary"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/facebook/react/devsupport/n0;->a:Ltg/j;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/facebook/react/devsupport/n0;->b:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method

.method private final a(Ltg/h;ZLcom/facebook/react/devsupport/n0$a;)V
    .locals 5

    .line 1
    sget-object v0, Ltg/k;->d:Ltg/k$a;

    .line 2
    .line 3
    const-string v1, "\r\n\r\n"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ltg/k$a;->b(Ljava/lang/String;)Ltg/k;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Ltg/h;->H(Ltg/k;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    const-wide/16 v3, -0x1

    .line 14
    .line 15
    cmp-long v3, v1, v3

    .line 16
    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {p3, v0, p1, p2}, Lcom/facebook/react/devsupport/n0$a;->b(Ljava/util/Map;Ltg/h;Z)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    new-instance v3, Ltg/h;

    .line 28
    .line 29
    invoke-direct {v3}, Ltg/h;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v4, Ltg/h;

    .line 33
    .line 34
    invoke-direct {v4}, Ltg/h;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v3, v1, v2}, Ltg/h;->N0(Ltg/h;J)J

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ltg/k;->a()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    int-to-long v0, v0

    .line 45
    invoke-virtual {p1, v0, v1}, Ltg/h;->skip(J)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v4}, Ltg/h;->U(Ltg/X;)J

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, v3}, Lcom/facebook/react/devsupport/n0;->c(Ltg/h;)Ljava/util/Map;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-interface {p3, p1, v4, p2}, Lcom/facebook/react/devsupport/n0$a;->b(Ljava/util/Map;Ltg/h;Z)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method private final b(Ljava/util/Map;JZLcom/facebook/react/devsupport/n0$a;)V
    .locals 6

    .line 1
    if-eqz p5, :cond_2

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget-wide v2, p0, Lcom/facebook/react/devsupport/n0;->c:J

    .line 11
    .line 12
    sub-long v2, v0, v2

    .line 13
    .line 14
    const-wide/16 v4, 0x10

    .line 15
    .line 16
    cmp-long v2, v2, v4

    .line 17
    .line 18
    if-gtz v2, :cond_1

    .line 19
    .line 20
    if-eqz p4, :cond_2

    .line 21
    .line 22
    :cond_1
    iput-wide v0, p0, Lcom/facebook/react/devsupport/n0;->c:J

    .line 23
    .line 24
    const-string p4, "Content-Length"

    .line 25
    .line 26
    const-string v0, "0"

    .line 27
    .line 28
    invoke-interface {p1, p4, v0}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p4

    .line 32
    check-cast p4, Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {p4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 35
    .line 36
    .line 37
    move-result-wide v4

    .line 38
    move-object v1, p1

    .line 39
    move-wide v2, p2

    .line 40
    move-object v0, p5

    .line 41
    invoke-interface/range {v0 .. v5}, Lcom/facebook/react/devsupport/n0$a;->a(Ljava/util/Map;JJ)V

    .line 42
    .line 43
    .line 44
    :cond_2
    :goto_0
    return-void
.end method

.method private final c(Ltg/h;)Ljava/util/Map;
    .locals 14

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ltg/h;->M1()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance v1, LDf/p;

    .line 11
    .line 12
    const-string v2, "\r\n"

    .line 13
    .line 14
    invoke-direct {v1, v2}, LDf/p;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v1, p1, v2}, LDf/p;->l(Ljava/lang/CharSequence;I)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v3, 0x1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-interface {p1, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :goto_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Ljava/lang/String;

    .line 48
    .line 49
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-interface {v1}, Ljava/util/ListIterator;->nextIndex()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/2addr v1, v3

    .line 61
    invoke-static {p1, v1}, LUd/u;->T0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    :goto_1
    new-array v1, v2, [Ljava/lang/String;

    .line 71
    .line 72
    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, [Ljava/lang/String;

    .line 77
    .line 78
    array-length v1, p1

    .line 79
    move v4, v2

    .line 80
    :goto_2
    if-ge v4, v1, :cond_f

    .line 81
    .line 82
    aget-object v5, p1, v4

    .line 83
    .line 84
    const/4 v9, 0x6

    .line 85
    const/4 v10, 0x0

    .line 86
    const-string v6, ":"

    .line 87
    .line 88
    const/4 v7, 0x0

    .line 89
    const/4 v8, 0x0

    .line 90
    invoke-static/range {v5 .. v10}, LDf/r;->j0(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    const/4 v7, -0x1

    .line 95
    if-ne v6, v7, :cond_2

    .line 96
    .line 97
    goto/16 :goto_b

    .line 98
    .line 99
    :cond_2
    invoke-virtual {v5, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    const-string v8, "substring(...)"

    .line 104
    .line 105
    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 109
    .line 110
    .line 111
    move-result v9

    .line 112
    sub-int/2addr v9, v3

    .line 113
    move v10, v2

    .line 114
    move v11, v10

    .line 115
    :goto_3
    const/16 v12, 0x20

    .line 116
    .line 117
    if-gt v10, v9, :cond_8

    .line 118
    .line 119
    if-nez v11, :cond_3

    .line 120
    .line 121
    move v13, v10

    .line 122
    goto :goto_4

    .line 123
    :cond_3
    move v13, v9

    .line 124
    :goto_4
    invoke-interface {v7, v13}, Ljava/lang/CharSequence;->charAt(I)C

    .line 125
    .line 126
    .line 127
    move-result v13

    .line 128
    invoke-static {v13, v12}, Lkotlin/jvm/internal/s;->i(II)I

    .line 129
    .line 130
    .line 131
    move-result v13

    .line 132
    if-gtz v13, :cond_4

    .line 133
    .line 134
    move v13, v3

    .line 135
    goto :goto_5

    .line 136
    :cond_4
    move v13, v2

    .line 137
    :goto_5
    if-nez v11, :cond_6

    .line 138
    .line 139
    if-nez v13, :cond_5

    .line 140
    .line 141
    move v11, v3

    .line 142
    goto :goto_3

    .line 143
    :cond_5
    add-int/lit8 v10, v10, 0x1

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_6
    if-nez v13, :cond_7

    .line 147
    .line 148
    goto :goto_6

    .line 149
    :cond_7
    add-int/lit8 v9, v9, -0x1

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_8
    :goto_6
    add-int/lit8 v9, v9, 0x1

    .line 153
    .line 154
    invoke-interface {v7, v10, v9}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    add-int/lit8 v6, v6, 0x1

    .line 163
    .line 164
    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    sub-int/2addr v6, v3

    .line 176
    move v8, v2

    .line 177
    move v9, v8

    .line 178
    :goto_7
    if-gt v8, v6, :cond_e

    .line 179
    .line 180
    if-nez v9, :cond_9

    .line 181
    .line 182
    move v10, v8

    .line 183
    goto :goto_8

    .line 184
    :cond_9
    move v10, v6

    .line 185
    :goto_8
    invoke-interface {v5, v10}, Ljava/lang/CharSequence;->charAt(I)C

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    invoke-static {v10, v12}, Lkotlin/jvm/internal/s;->i(II)I

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    if-gtz v10, :cond_a

    .line 194
    .line 195
    move v10, v3

    .line 196
    goto :goto_9

    .line 197
    :cond_a
    move v10, v2

    .line 198
    :goto_9
    if-nez v9, :cond_c

    .line 199
    .line 200
    if-nez v10, :cond_b

    .line 201
    .line 202
    move v9, v3

    .line 203
    goto :goto_7

    .line 204
    :cond_b
    add-int/lit8 v8, v8, 0x1

    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_c
    if-nez v10, :cond_d

    .line 208
    .line 209
    goto :goto_a

    .line 210
    :cond_d
    add-int/lit8 v6, v6, -0x1

    .line 211
    .line 212
    goto :goto_7

    .line 213
    :cond_e
    :goto_a
    add-int/lit8 v6, v6, 0x1

    .line 214
    .line 215
    invoke-interface {v5, v8, v6}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    invoke-interface {v0, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    :goto_b
    add-int/lit8 v4, v4, 0x1

    .line 227
    .line 228
    goto/16 :goto_2

    .line 229
    .line 230
    :cond_f
    return-object v0
.end method


# virtual methods
.method public final d(Lcom/facebook/react/devsupport/n0$a;)Z
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    const-string v1, "listener"

    .line 6
    .line 7
    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget-object v1, Ltg/k;->d:Ltg/k$a;

    .line 11
    .line 12
    iget-object v2, v0, Lcom/facebook/react/devsupport/n0;->b:Ljava/lang/String;

    .line 13
    .line 14
    new-instance v3, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v4, "\r\n--"

    .line 20
    .line 21
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v2, "\r\n"

    .line 28
    .line 29
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v1, v2}, Ltg/k$a;->b(Ljava/lang/String;)Ltg/k;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    iget-object v2, v0, Lcom/facebook/react/devsupport/n0;->b:Ljava/lang/String;

    .line 41
    .line 42
    new-instance v3, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v2, "--\r\n"

    .line 54
    .line 55
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v1, v2}, Ltg/k$a;->b(Ljava/lang/String;)Ltg/k;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    const-string v2, "\r\n\r\n"

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Ltg/k$a;->b(Ljava/lang/String;)Ltg/k;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    new-instance v9, Ltg/h;

    .line 73
    .line 74
    invoke-direct {v9}, Ltg/h;-><init>()V

    .line 75
    .line 76
    .line 77
    const/16 v17, 0x0

    .line 78
    .line 79
    move-object/from16 v10, v17

    .line 80
    .line 81
    const-wide/16 v1, 0x0

    .line 82
    .line 83
    const-wide/16 v3, 0x0

    .line 84
    .line 85
    const-wide/16 v11, 0x0

    .line 86
    .line 87
    :goto_0
    invoke-virtual {v7}, Ltg/k;->a()I

    .line 88
    .line 89
    .line 90
    move-result v13

    .line 91
    int-to-long v13, v13

    .line 92
    sub-long/2addr v1, v13

    .line 93
    long-to-double v1, v1

    .line 94
    long-to-double v13, v3

    .line 95
    invoke-static {v1, v2, v13, v14}, Ljava/lang/Math;->max(DD)D

    .line 96
    .line 97
    .line 98
    move-result-wide v1

    .line 99
    double-to-long v1, v1

    .line 100
    invoke-virtual {v9, v6, v1, v2}, Ltg/h;->J(Ltg/k;J)J

    .line 101
    .line 102
    .line 103
    move-result-wide v13

    .line 104
    const-wide/16 v18, -0x1

    .line 105
    .line 106
    cmp-long v20, v13, v18

    .line 107
    .line 108
    const/16 v21, 0x1

    .line 109
    .line 110
    const/16 v22, 0x0

    .line 111
    .line 112
    if-nez v20, :cond_0

    .line 113
    .line 114
    invoke-virtual {v9, v7, v1, v2}, Ltg/h;->J(Ltg/k;J)J

    .line 115
    .line 116
    .line 117
    move-result-wide v13

    .line 118
    move/from16 v15, v21

    .line 119
    .line 120
    :goto_1
    const-wide/16 v23, 0x0

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_0
    move/from16 v15, v22

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :goto_2
    cmp-long v16, v13, v18

    .line 127
    .line 128
    if-nez v16, :cond_4

    .line 129
    .line 130
    invoke-virtual {v9}, Ltg/h;->a()J

    .line 131
    .line 132
    .line 133
    move-result-wide v15

    .line 134
    if-nez v10, :cond_2

    .line 135
    .line 136
    invoke-virtual {v9, v8, v1, v2}, Ltg/h;->J(Ltg/k;J)J

    .line 137
    .line 138
    .line 139
    move-result-wide v13

    .line 140
    cmp-long v18, v13, v23

    .line 141
    .line 142
    if-ltz v18, :cond_1

    .line 143
    .line 144
    iget-object v10, v0, Lcom/facebook/react/devsupport/n0;->a:Ltg/j;

    .line 145
    .line 146
    invoke-interface {v10, v9, v13, v14}, Ltg/Z;->N0(Ltg/h;J)J

    .line 147
    .line 148
    .line 149
    new-instance v10, Ltg/h;

    .line 150
    .line 151
    invoke-direct {v10}, Ltg/h;-><init>()V

    .line 152
    .line 153
    .line 154
    sub-long/2addr v13, v1

    .line 155
    move-wide v11, v1

    .line 156
    invoke-virtual/range {v9 .. v14}, Ltg/h;->m(Ltg/h;JJ)Ltg/h;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v10}, Ltg/h;->a()J

    .line 160
    .line 161
    .line 162
    move-result-wide v1

    .line 163
    invoke-virtual {v8}, Ltg/k;->a()I

    .line 164
    .line 165
    .line 166
    move-result v11

    .line 167
    int-to-long v11, v11

    .line 168
    add-long/2addr v11, v1

    .line 169
    invoke-direct {v0, v10}, Lcom/facebook/react/devsupport/n0;->c(Ltg/h;)Ljava/util/Map;

    .line 170
    .line 171
    .line 172
    move-result-object v10

    .line 173
    move-wide v13, v3

    .line 174
    goto :goto_4

    .line 175
    :cond_1
    move-wide v13, v3

    .line 176
    move-object v1, v10

    .line 177
    goto :goto_3

    .line 178
    :cond_2
    invoke-virtual {v9}, Ltg/h;->a()J

    .line 179
    .line 180
    .line 181
    move-result-wide v1

    .line 182
    sub-long/2addr v1, v11

    .line 183
    move-wide v13, v3

    .line 184
    const/4 v4, 0x0

    .line 185
    move-wide v2, v1

    .line 186
    move-object v1, v10

    .line 187
    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/devsupport/n0;->b(Ljava/util/Map;JZLcom/facebook/react/devsupport/n0$a;)V

    .line 188
    .line 189
    .line 190
    :goto_3
    move-object v10, v1

    .line 191
    :goto_4
    iget-object v1, v0, Lcom/facebook/react/devsupport/n0;->a:Ltg/j;

    .line 192
    .line 193
    const/16 v2, 0x1000

    .line 194
    .line 195
    int-to-long v2, v2

    .line 196
    invoke-interface {v1, v9, v2, v3}, Ltg/Z;->N0(Ltg/h;J)J

    .line 197
    .line 198
    .line 199
    move-result-wide v1

    .line 200
    cmp-long v1, v1, v23

    .line 201
    .line 202
    if-gtz v1, :cond_3

    .line 203
    .line 204
    return v22

    .line 205
    :cond_3
    move-object/from16 v5, p1

    .line 206
    .line 207
    move-wide v3, v13

    .line 208
    move-wide v1, v15

    .line 209
    goto :goto_0

    .line 210
    :cond_4
    move-wide v2, v3

    .line 211
    move-object v1, v10

    .line 212
    sub-long v4, v13, v2

    .line 213
    .line 214
    cmp-long v10, v2, v23

    .line 215
    .line 216
    if-lez v10, :cond_5

    .line 217
    .line 218
    new-instance v10, Ltg/h;

    .line 219
    .line 220
    invoke-direct {v10}, Ltg/h;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v9, v2, v3}, Ltg/h;->skip(J)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v9, v10, v4, v5}, Ltg/h;->N0(Ltg/h;J)J

    .line 227
    .line 228
    .line 229
    invoke-virtual {v10}, Ltg/h;->a()J

    .line 230
    .line 231
    .line 232
    move-result-wide v2

    .line 233
    sub-long/2addr v2, v11

    .line 234
    const/4 v4, 0x1

    .line 235
    move-object/from16 v5, p1

    .line 236
    .line 237
    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/devsupport/n0;->b(Ljava/util/Map;JZLcom/facebook/react/devsupport/n0$a;)V

    .line 238
    .line 239
    .line 240
    invoke-direct {v0, v10, v15, v5}, Lcom/facebook/react/devsupport/n0;->a(Ltg/h;ZLcom/facebook/react/devsupport/n0$a;)V

    .line 241
    .line 242
    .line 243
    move-object/from16 v10, v17

    .line 244
    .line 245
    move-wide/from16 v11, v23

    .line 246
    .line 247
    goto :goto_5

    .line 248
    :cond_5
    move-object/from16 v5, p1

    .line 249
    .line 250
    invoke-virtual {v9, v13, v14}, Ltg/h;->skip(J)V

    .line 251
    .line 252
    .line 253
    move-object v10, v1

    .line 254
    :goto_5
    if-eqz v15, :cond_6

    .line 255
    .line 256
    return v21

    .line 257
    :cond_6
    invoke-virtual {v6}, Ltg/k;->a()I

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    int-to-long v3, v1

    .line 262
    move-wide v1, v3

    .line 263
    goto/16 :goto_0
.end method
