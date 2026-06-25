.class public abstract Lug/j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method private static final a(Ljava/util/List;)Ljava/util/Map;
    .locals 21

    .line 1
    sget-object v0, Ltg/P;->b:Ltg/P$a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "/"

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    invoke-static {v0, v3, v4, v1, v2}, Ltg/P$a;->e(Ltg/P$a;Ljava/lang/String;ZILjava/lang/Object;)Ltg/P;

    .line 9
    .line 10
    .line 11
    move-result-object v6

    .line 12
    new-instance v5, Lug/i;

    .line 13
    .line 14
    const/16 v19, 0x1fc

    .line 15
    .line 16
    const/16 v20, 0x0

    .line 17
    .line 18
    const/4 v7, 0x1

    .line 19
    const/4 v8, 0x0

    .line 20
    const-wide/16 v9, 0x0

    .line 21
    .line 22
    const-wide/16 v11, 0x0

    .line 23
    .line 24
    const-wide/16 v13, 0x0

    .line 25
    .line 26
    const/4 v15, 0x0

    .line 27
    const/16 v16, 0x0

    .line 28
    .line 29
    const-wide/16 v17, 0x0

    .line 30
    .line 31
    invoke-direct/range {v5 .. v20}, Lug/i;-><init>(Ltg/P;ZLjava/lang/String;JJJILjava/lang/Long;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v6, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, LUd/S;->n([Lkotlin/Pair;)Ljava/util/Map;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v1, Lug/j$a;

    .line 47
    .line 48
    invoke-direct {v1}, Lug/j$a;-><init>()V

    .line 49
    .line 50
    .line 51
    move-object/from16 v2, p0

    .line 52
    .line 53
    invoke-static {v2, v1}, LUd/u;->R0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Lug/i;

    .line 72
    .line 73
    invoke-virtual {v2}, Lug/i;->a()Ltg/P;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    check-cast v3, Lug/i;

    .line 82
    .line 83
    if-nez v3, :cond_0

    .line 84
    .line 85
    :goto_1
    invoke-virtual {v2}, Lug/i;->a()Ltg/P;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v3}, Ltg/P;->n()Ltg/P;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    if-nez v5, :cond_1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    check-cast v3, Lug/i;

    .line 101
    .line 102
    if-eqz v3, :cond_2

    .line 103
    .line 104
    invoke-virtual {v3}, Lug/i;->b()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v2}, Lug/i;->a()Ltg/P;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_2
    new-instance v4, Lug/i;

    .line 117
    .line 118
    const/16 v18, 0x1fc

    .line 119
    .line 120
    const/16 v19, 0x0

    .line 121
    .line 122
    const/4 v6, 0x1

    .line 123
    const/4 v7, 0x0

    .line 124
    const-wide/16 v8, 0x0

    .line 125
    .line 126
    const-wide/16 v10, 0x0

    .line 127
    .line 128
    const-wide/16 v12, 0x0

    .line 129
    .line 130
    const/4 v14, 0x0

    .line 131
    const/4 v15, 0x0

    .line 132
    const-wide/16 v16, 0x0

    .line 133
    .line 134
    invoke-direct/range {v4 .. v19}, Lug/i;-><init>(Ltg/P;ZLjava/lang/String;JJJILjava/lang/Long;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 135
    .line 136
    .line 137
    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4}, Lug/i;->b()Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-virtual {v2}, Lug/i;->a()Ltg/P;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-object v2, v4

    .line 152
    goto :goto_1

    .line 153
    :cond_3
    return-object v0
.end method

.method private static final b(II)Ljava/lang/Long;
    .locals 7

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/util/GregorianCalendar;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/GregorianCalendar;-><init>()V

    .line 9
    .line 10
    .line 11
    const/16 v1, 0xe

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 15
    .line 16
    .line 17
    shr-int/lit8 v1, p0, 0x9

    .line 18
    .line 19
    and-int/lit8 v1, v1, 0x7f

    .line 20
    .line 21
    add-int/lit16 v1, v1, 0x7bc

    .line 22
    .line 23
    shr-int/lit8 v2, p0, 0x5

    .line 24
    .line 25
    and-int/lit8 v2, v2, 0xf

    .line 26
    .line 27
    and-int/lit8 v3, p0, 0x1f

    .line 28
    .line 29
    shr-int/lit8 p0, p1, 0xb

    .line 30
    .line 31
    and-int/lit8 v4, p0, 0x1f

    .line 32
    .line 33
    shr-int/lit8 p0, p1, 0x5

    .line 34
    .line 35
    and-int/lit8 v5, p0, 0x3f

    .line 36
    .line 37
    and-int/lit8 p0, p1, 0x1f

    .line 38
    .line 39
    shl-int/lit8 v6, p0, 0x1

    .line 40
    .line 41
    add-int/lit8 v2, v2, -0x1

    .line 42
    .line 43
    invoke-virtual/range {v0 .. v6}, Ljava/util/Calendar;->set(IIIIII)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    .line 51
    .line 52
    .line 53
    move-result-wide p0

    .line 54
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method private static final c(I)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "0x"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x10

    .line 12
    .line 13
    invoke-static {v1}, LDf/a;->a(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {p0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v1, "toString(this, checkRadix(radix))"

    .line 22
    .line 23
    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public static final d(Ltg/P;Ltg/o;Lkotlin/jvm/functions/Function1;)Ltg/c0;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "zipPath"

    .line 8
    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "fileSystem"

    .line 13
    .line 14
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v3, "predicate"

    .line 18
    .line 19
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ltg/o;->n(Ltg/P;)Ltg/m;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    :try_start_0
    invoke-virtual {v3}, Ltg/m;->size()J

    .line 27
    .line 28
    .line 29
    move-result-wide v4

    .line 30
    const/16 v6, 0x16

    .line 31
    .line 32
    int-to-long v6, v6

    .line 33
    sub-long/2addr v4, v6

    .line 34
    const-wide/16 v6, 0x0

    .line 35
    .line 36
    cmp-long v8, v4, v6

    .line 37
    .line 38
    if-ltz v8, :cond_9

    .line 39
    .line 40
    const-wide/32 v8, 0x10000

    .line 41
    .line 42
    .line 43
    sub-long v8, v4, v8

    .line 44
    .line 45
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide v8

    .line 49
    :goto_0
    invoke-virtual {v3, v4, v5}, Ltg/m;->q(J)Ltg/Z;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    invoke-static {v10}, Ltg/K;->d(Ltg/Z;)Ltg/j;

    .line 54
    .line 55
    .line 56
    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 57
    :try_start_1
    invoke-interface {v10}, Ltg/j;->J1()I

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    const v12, 0x6054b50

    .line 62
    .line 63
    .line 64
    if-ne v11, v12, :cond_7

    .line 65
    .line 66
    invoke-static {v10}, Lug/j;->f(Ltg/j;)Lug/f;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    invoke-virtual {v8}, Lug/f;->b()I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    int-to-long v11, v9

    .line 75
    invoke-interface {v10, v11, v12}, Ltg/j;->V0(J)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    .line 79
    :try_start_2
    invoke-interface {v10}, Ltg/Z;->close()V

    .line 80
    .line 81
    .line 82
    const/16 v10, 0x14

    .line 83
    .line 84
    int-to-long v10, v10

    .line 85
    sub-long/2addr v4, v10

    .line 86
    cmp-long v10, v4, v6

    .line 87
    .line 88
    const/4 v11, 0x0

    .line 89
    if-lez v10, :cond_3

    .line 90
    .line 91
    invoke-virtual {v3, v4, v5}, Ltg/m;->q(J)Ltg/Z;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-static {v4}, Ltg/K;->d(Ltg/Z;)Ltg/j;

    .line 96
    .line 97
    .line 98
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 99
    :try_start_3
    invoke-interface {v4}, Ltg/j;->J1()I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    const v10, 0x7064b50

    .line 104
    .line 105
    .line 106
    if-ne v5, v10, :cond_2

    .line 107
    .line 108
    invoke-interface {v4}, Ltg/j;->J1()I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    invoke-interface {v4}, Ltg/j;->K0()J

    .line 113
    .line 114
    .line 115
    move-result-wide v12

    .line 116
    invoke-interface {v4}, Ltg/j;->J1()I

    .line 117
    .line 118
    .line 119
    move-result v10

    .line 120
    const/4 v14, 0x1

    .line 121
    if-ne v10, v14, :cond_1

    .line 122
    .line 123
    if-nez v5, :cond_1

    .line 124
    .line 125
    invoke-virtual {v3, v12, v13}, Ltg/m;->q(J)Ltg/Z;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-static {v5}, Ltg/K;->d(Ltg/Z;)Ltg/j;

    .line 130
    .line 131
    .line 132
    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 133
    :try_start_4
    invoke-interface {v5}, Ltg/j;->J1()I

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    const v12, 0x6064b50

    .line 138
    .line 139
    .line 140
    if-ne v10, v12, :cond_0

    .line 141
    .line 142
    invoke-static {v5, v8}, Lug/j;->j(Ltg/j;Lug/f;)Lug/f;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    sget-object v10, LTd/L;->a:LTd/L;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 147
    .line 148
    :try_start_5
    invoke-static {v5, v11}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :catchall_0
    move-exception v0

    .line 153
    move-object v1, v0

    .line 154
    goto :goto_3

    .line 155
    :catchall_1
    move-exception v0

    .line 156
    move-object v1, v0

    .line 157
    goto :goto_1

    .line 158
    :cond_0
    :try_start_6
    new-instance v0, Ljava/io/IOException;

    .line 159
    .line 160
    new-instance v1, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    const-string v2, "bad zip: expected "

    .line 166
    .line 167
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-static {v12}, Lug/j;->c(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const-string v2, " but was "

    .line 178
    .line 179
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-static {v10}, Lug/j;->c(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 197
    :goto_1
    :try_start_7
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 198
    :catchall_2
    move-exception v0

    .line 199
    :try_start_8
    invoke-static {v5, v1}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 200
    .line 201
    .line 202
    throw v0

    .line 203
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 204
    .line 205
    const-string v1, "unsupported zip: spanned"

    .line 206
    .line 207
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw v0

    .line 211
    :cond_2
    :goto_2
    sget-object v5, LTd/L;->a:LTd/L;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 212
    .line 213
    :try_start_9
    invoke-static {v4, v11}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 214
    .line 215
    .line 216
    goto :goto_4

    .line 217
    :catchall_3
    move-exception v0

    .line 218
    move-object v1, v0

    .line 219
    goto/16 :goto_9

    .line 220
    .line 221
    :goto_3
    :try_start_a
    throw v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 222
    :catchall_4
    move-exception v0

    .line 223
    :try_start_b
    invoke-static {v4, v1}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 224
    .line 225
    .line 226
    throw v0

    .line 227
    :cond_3
    :goto_4
    new-instance v4, Ljava/util/ArrayList;

    .line 228
    .line 229
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v8}, Lug/f;->a()J

    .line 233
    .line 234
    .line 235
    move-result-wide v12

    .line 236
    invoke-virtual {v3, v12, v13}, Ltg/m;->q(J)Ltg/Z;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    invoke-static {v5}, Ltg/K;->d(Ltg/Z;)Ltg/j;

    .line 241
    .line 242
    .line 243
    move-result-object v5
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 244
    :try_start_c
    invoke-virtual {v8}, Lug/f;->c()J

    .line 245
    .line 246
    .line 247
    move-result-wide v12

    .line 248
    :goto_5
    cmp-long v10, v6, v12

    .line 249
    .line 250
    if-gez v10, :cond_6

    .line 251
    .line 252
    invoke-static {v5}, Lug/j;->e(Ltg/j;)Lug/i;

    .line 253
    .line 254
    .line 255
    move-result-object v10

    .line 256
    invoke-virtual {v10}, Lug/i;->f()J

    .line 257
    .line 258
    .line 259
    move-result-wide v14

    .line 260
    invoke-virtual {v8}, Lug/f;->a()J

    .line 261
    .line 262
    .line 263
    move-result-wide v16

    .line 264
    cmp-long v14, v14, v16

    .line 265
    .line 266
    if-gez v14, :cond_5

    .line 267
    .line 268
    invoke-interface {v2, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v14

    .line 272
    check-cast v14, Ljava/lang/Boolean;

    .line 273
    .line 274
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 275
    .line 276
    .line 277
    move-result v14

    .line 278
    if-eqz v14, :cond_4

    .line 279
    .line 280
    invoke-interface {v4, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    goto :goto_6

    .line 284
    :catchall_5
    move-exception v0

    .line 285
    move-object v1, v0

    .line 286
    goto :goto_7

    .line 287
    :cond_4
    :goto_6
    const-wide/16 v14, 0x1

    .line 288
    .line 289
    add-long/2addr v6, v14

    .line 290
    goto :goto_5

    .line 291
    :cond_5
    new-instance v0, Ljava/io/IOException;

    .line 292
    .line 293
    const-string v1, "bad zip: local file header offset >= central directory offset"

    .line 294
    .line 295
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    throw v0

    .line 299
    :cond_6
    sget-object v2, LTd/L;->a:LTd/L;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 300
    .line 301
    :try_start_d
    invoke-static {v5, v11}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 302
    .line 303
    .line 304
    invoke-static {v4}, Lug/j;->a(Ljava/util/List;)Ljava/util/Map;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    new-instance v4, Ltg/c0;

    .line 309
    .line 310
    invoke-direct {v4, v0, v1, v2, v9}, Ltg/c0;-><init>(Ltg/P;Ltg/o;Ljava/util/Map;Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 311
    .line 312
    .line 313
    invoke-static {v3, v11}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 314
    .line 315
    .line 316
    return-object v4

    .line 317
    :goto_7
    :try_start_e
    throw v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 318
    :catchall_6
    move-exception v0

    .line 319
    :try_start_f
    invoke-static {v5, v1}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 320
    .line 321
    .line 322
    throw v0

    .line 323
    :catchall_7
    move-exception v0

    .line 324
    goto :goto_8

    .line 325
    :cond_7
    invoke-interface {v10}, Ltg/Z;->close()V

    .line 326
    .line 327
    .line 328
    const-wide/16 v10, -0x1

    .line 329
    .line 330
    add-long/2addr v4, v10

    .line 331
    cmp-long v10, v4, v8

    .line 332
    .line 333
    if-ltz v10, :cond_8

    .line 334
    .line 335
    goto/16 :goto_0

    .line 336
    .line 337
    :cond_8
    new-instance v0, Ljava/io/IOException;

    .line 338
    .line 339
    const-string v1, "not a zip: end of central directory signature not found"

    .line 340
    .line 341
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    throw v0

    .line 345
    :goto_8
    invoke-interface {v10}, Ltg/Z;->close()V

    .line 346
    .line 347
    .line 348
    throw v0

    .line 349
    :cond_9
    new-instance v0, Ljava/io/IOException;

    .line 350
    .line 351
    new-instance v1, Ljava/lang/StringBuilder;

    .line 352
    .line 353
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 354
    .line 355
    .line 356
    const-string v2, "not a zip: size="

    .line 357
    .line 358
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v3}, Ltg/m;->size()J

    .line 362
    .line 363
    .line 364
    move-result-wide v4

    .line 365
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 376
    :goto_9
    :try_start_10
    throw v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 377
    :catchall_8
    move-exception v0

    .line 378
    invoke-static {v3, v1}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 379
    .line 380
    .line 381
    throw v0
.end method

.method public static final e(Ltg/j;)Lug/i;
    .locals 25

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    const-string v0, "<this>"

    .line 4
    .line 5
    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v5}, Ltg/j;->J1()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const v1, 0x2014b50

    .line 13
    .line 14
    .line 15
    if-ne v0, v1, :cond_7

    .line 16
    .line 17
    const-wide/16 v0, 0x4

    .line 18
    .line 19
    invoke-interface {v5, v0, v1}, Ltg/j;->skip(J)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v5}, Ltg/j;->J0()S

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const v1, 0xffff

    .line 27
    .line 28
    .line 29
    and-int v2, v0, v1

    .line 30
    .line 31
    const/4 v8, 0x1

    .line 32
    and-int/2addr v0, v8

    .line 33
    if-nez v0, :cond_6

    .line 34
    .line 35
    invoke-interface {v5}, Ltg/j;->J0()S

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    and-int v19, v0, v1

    .line 40
    .line 41
    invoke-interface {v5}, Ltg/j;->J0()S

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    and-int/2addr v0, v1

    .line 46
    invoke-interface {v5}, Ltg/j;->J0()S

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    and-int/2addr v2, v1

    .line 51
    invoke-static {v2, v0}, Lug/j;->b(II)Ljava/lang/Long;

    .line 52
    .line 53
    .line 54
    move-result-object v20

    .line 55
    invoke-interface {v5}, Ltg/j;->J1()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    int-to-long v2, v0

    .line 60
    const-wide v6, 0xffffffffL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    and-long v13, v2, v6

    .line 66
    .line 67
    move-wide v2, v6

    .line 68
    new-instance v6, Lkotlin/jvm/internal/M;

    .line 69
    .line 70
    invoke-direct {v6}, Lkotlin/jvm/internal/M;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-interface {v5}, Ltg/j;->J1()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    int-to-long v9, v0

    .line 78
    and-long/2addr v9, v2

    .line 79
    iput-wide v9, v6, Lkotlin/jvm/internal/M;->a:J

    .line 80
    .line 81
    new-instance v4, Lkotlin/jvm/internal/M;

    .line 82
    .line 83
    invoke-direct {v4}, Lkotlin/jvm/internal/M;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-interface {v5}, Ltg/j;->J1()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    int-to-long v9, v0

    .line 91
    and-long/2addr v9, v2

    .line 92
    iput-wide v9, v4, Lkotlin/jvm/internal/M;->a:J

    .line 93
    .line 94
    invoke-interface {v5}, Ltg/j;->J0()S

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    and-int/2addr v0, v1

    .line 99
    invoke-interface {v5}, Ltg/j;->J0()S

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    and-int v9, v7, v1

    .line 104
    .line 105
    invoke-interface {v5}, Ltg/j;->J0()S

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    and-int v10, v7, v1

    .line 110
    .line 111
    const-wide/16 v11, 0x8

    .line 112
    .line 113
    invoke-interface {v5, v11, v12}, Ltg/j;->skip(J)V

    .line 114
    .line 115
    .line 116
    new-instance v7, Lkotlin/jvm/internal/M;

    .line 117
    .line 118
    invoke-direct {v7}, Lkotlin/jvm/internal/M;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-interface {v5}, Ltg/j;->J1()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    int-to-long v11, v1

    .line 126
    and-long/2addr v11, v2

    .line 127
    iput-wide v11, v7, Lkotlin/jvm/internal/M;->a:J

    .line 128
    .line 129
    int-to-long v0, v0

    .line 130
    invoke-interface {v5, v0, v1}, Ltg/j;->V0(J)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    const/4 v12, 0x0

    .line 135
    const/4 v15, 0x2

    .line 136
    const/4 v0, 0x0

    .line 137
    invoke-static {v11, v12, v12, v15, v0}, LDf/r;->V(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-nez v1, :cond_5

    .line 142
    .line 143
    iget-wide v0, v4, Lkotlin/jvm/internal/M;->a:J

    .line 144
    .line 145
    cmp-long v0, v0, v2

    .line 146
    .line 147
    const-wide/16 v17, 0x0

    .line 148
    .line 149
    const/16 v1, 0x8

    .line 150
    .line 151
    move-wide/from16 v21, v2

    .line 152
    .line 153
    if-nez v0, :cond_0

    .line 154
    .line 155
    int-to-long v2, v1

    .line 156
    :goto_0
    move-wide/from16 v23, v13

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_0
    move-wide/from16 v2, v17

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :goto_1
    iget-wide v12, v6, Lkotlin/jvm/internal/M;->a:J

    .line 163
    .line 164
    cmp-long v0, v12, v21

    .line 165
    .line 166
    if-nez v0, :cond_1

    .line 167
    .line 168
    int-to-long v12, v1

    .line 169
    add-long/2addr v2, v12

    .line 170
    :cond_1
    iget-wide v12, v7, Lkotlin/jvm/internal/M;->a:J

    .line 171
    .line 172
    cmp-long v0, v12, v21

    .line 173
    .line 174
    if-nez v0, :cond_2

    .line 175
    .line 176
    int-to-long v0, v1

    .line 177
    add-long/2addr v2, v0

    .line 178
    :cond_2
    new-instance v1, Lkotlin/jvm/internal/J;

    .line 179
    .line 180
    invoke-direct {v1}, Lkotlin/jvm/internal/J;-><init>()V

    .line 181
    .line 182
    .line 183
    new-instance v0, Lug/j$b;

    .line 184
    .line 185
    const/4 v12, 0x0

    .line 186
    invoke-direct/range {v0 .. v7}, Lug/j$b;-><init>(Lkotlin/jvm/internal/J;JLkotlin/jvm/internal/M;Ltg/j;Lkotlin/jvm/internal/M;Lkotlin/jvm/internal/M;)V

    .line 187
    .line 188
    .line 189
    invoke-static {v5, v9, v0}, Lug/j;->g(Ltg/j;ILkotlin/jvm/functions/Function2;)V

    .line 190
    .line 191
    .line 192
    cmp-long v0, v2, v17

    .line 193
    .line 194
    if-lez v0, :cond_4

    .line 195
    .line 196
    iget-boolean v0, v1, Lkotlin/jvm/internal/J;->a:Z

    .line 197
    .line 198
    if-eqz v0, :cond_3

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_3
    new-instance v0, Ljava/io/IOException;

    .line 202
    .line 203
    const-string v1, "bad zip: zip64 extra required but absent"

    .line 204
    .line 205
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v0

    .line 209
    :cond_4
    :goto_2
    int-to-long v0, v10

    .line 210
    invoke-interface {v5, v0, v1}, Ltg/j;->V0(J)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    sget-object v1, Ltg/P;->b:Ltg/P$a;

    .line 215
    .line 216
    const-string v2, "/"

    .line 217
    .line 218
    const/4 v14, 0x0

    .line 219
    invoke-static {v1, v2, v14, v8, v12}, Ltg/P$a;->e(Ltg/P$a;Ljava/lang/String;ZILjava/lang/Object;)Ltg/P;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-virtual {v1, v11}, Ltg/P;->q(Ljava/lang/String;)Ltg/P;

    .line 224
    .line 225
    .line 226
    move-result-object v10

    .line 227
    invoke-static {v11, v2, v14, v15, v12}, LDf/r;->A(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v11

    .line 231
    new-instance v9, Lug/i;

    .line 232
    .line 233
    iget-wide v1, v6, Lkotlin/jvm/internal/M;->a:J

    .line 234
    .line 235
    iget-wide v3, v4, Lkotlin/jvm/internal/M;->a:J

    .line 236
    .line 237
    iget-wide v5, v7, Lkotlin/jvm/internal/M;->a:J

    .line 238
    .line 239
    move-object v12, v0

    .line 240
    move-wide v15, v1

    .line 241
    move-wide/from16 v17, v3

    .line 242
    .line 243
    move-wide/from16 v21, v5

    .line 244
    .line 245
    move-wide/from16 v13, v23

    .line 246
    .line 247
    invoke-direct/range {v9 .. v22}, Lug/i;-><init>(Ltg/P;ZLjava/lang/String;JJJILjava/lang/Long;J)V

    .line 248
    .line 249
    .line 250
    return-object v9

    .line 251
    :cond_5
    new-instance v0, Ljava/io/IOException;

    .line 252
    .line 253
    const-string v1, "bad zip: filename contains 0x00"

    .line 254
    .line 255
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw v0

    .line 259
    :cond_6
    new-instance v0, Ljava/io/IOException;

    .line 260
    .line 261
    new-instance v1, Ljava/lang/StringBuilder;

    .line 262
    .line 263
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 264
    .line 265
    .line 266
    const-string v3, "unsupported zip: general purpose bit flag="

    .line 267
    .line 268
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-static {v2}, Lug/j;->c(I)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    throw v0

    .line 286
    :cond_7
    new-instance v2, Ljava/io/IOException;

    .line 287
    .line 288
    new-instance v3, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 291
    .line 292
    .line 293
    const-string v4, "bad zip: expected "

    .line 294
    .line 295
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-static {v1}, Lug/j;->c(I)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    const-string v1, " but was "

    .line 306
    .line 307
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-static {v0}, Lug/j;->c(I)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    throw v2
.end method

.method private static final f(Ltg/j;)Lug/f;
    .locals 10

    .line 1
    invoke-interface {p0}, Ltg/j;->J0()S

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0xffff

    .line 6
    .line 7
    .line 8
    and-int/2addr v0, v1

    .line 9
    invoke-interface {p0}, Ltg/j;->J0()S

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    and-int/2addr v2, v1

    .line 14
    invoke-interface {p0}, Ltg/j;->J0()S

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    and-int/2addr v3, v1

    .line 19
    int-to-long v5, v3

    .line 20
    invoke-interface {p0}, Ltg/j;->J0()S

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    and-int/2addr v3, v1

    .line 25
    int-to-long v3, v3

    .line 26
    cmp-long v3, v5, v3

    .line 27
    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    const-wide/16 v2, 0x4

    .line 35
    .line 36
    invoke-interface {p0, v2, v3}, Ltg/j;->skip(J)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p0}, Ltg/j;->J1()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    int-to-long v2, v0

    .line 44
    const-wide v7, 0xffffffffL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    and-long/2addr v7, v2

    .line 50
    invoke-interface {p0}, Ltg/j;->J0()S

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    and-int v9, p0, v1

    .line 55
    .line 56
    new-instance v4, Lug/f;

    .line 57
    .line 58
    invoke-direct/range {v4 .. v9}, Lug/f;-><init>(JJI)V

    .line 59
    .line 60
    .line 61
    return-object v4

    .line 62
    :cond_0
    new-instance p0, Ljava/io/IOException;

    .line 63
    .line 64
    const-string v0, "unsupported zip: spanned"

    .line 65
    .line 66
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p0
.end method

.method private static final g(Ltg/j;ILkotlin/jvm/functions/Function2;)V
    .locals 10

    .line 1
    int-to-long v0, p1

    .line 2
    :goto_0
    const-wide/16 v2, 0x0

    .line 3
    .line 4
    cmp-long p1, v0, v2

    .line 5
    .line 6
    if-eqz p1, :cond_4

    .line 7
    .line 8
    const-wide/16 v4, 0x4

    .line 9
    .line 10
    cmp-long p1, v0, v4

    .line 11
    .line 12
    if-ltz p1, :cond_3

    .line 13
    .line 14
    invoke-interface {p0}, Ltg/j;->J0()S

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const v4, 0xffff

    .line 19
    .line 20
    .line 21
    and-int/2addr p1, v4

    .line 22
    invoke-interface {p0}, Ltg/j;->J0()S

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    int-to-long v4, v4

    .line 27
    const-wide/32 v6, 0xffff

    .line 28
    .line 29
    .line 30
    and-long/2addr v4, v6

    .line 31
    const/4 v6, 0x4

    .line 32
    int-to-long v6, v6

    .line 33
    sub-long/2addr v0, v6

    .line 34
    cmp-long v6, v0, v4

    .line 35
    .line 36
    if-ltz v6, :cond_2

    .line 37
    .line 38
    invoke-interface {p0, v4, v5}, Ltg/j;->R0(J)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p0}, Ltg/j;->s()Ltg/h;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-virtual {v6}, Ltg/h;->size()J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    invoke-interface {p2, v8, v9}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    invoke-interface {p0}, Ltg/j;->s()Ltg/h;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-virtual {v8}, Ltg/h;->size()J

    .line 65
    .line 66
    .line 67
    move-result-wide v8

    .line 68
    add-long/2addr v8, v4

    .line 69
    sub-long/2addr v8, v6

    .line 70
    cmp-long v2, v8, v2

    .line 71
    .line 72
    if-ltz v2, :cond_1

    .line 73
    .line 74
    if-lez v2, :cond_0

    .line 75
    .line 76
    invoke-interface {p0}, Ltg/j;->s()Ltg/h;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1, v8, v9}, Ltg/h;->skip(J)V

    .line 81
    .line 82
    .line 83
    :cond_0
    sub-long/2addr v0, v4

    .line 84
    goto :goto_0

    .line 85
    :cond_1
    new-instance p0, Ljava/io/IOException;

    .line 86
    .line 87
    new-instance p2, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string v0, "unsupported zip: too many bytes processed for "

    .line 93
    .line 94
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p0

    .line 108
    :cond_2
    new-instance p0, Ljava/io/IOException;

    .line 109
    .line 110
    const-string p1, "bad zip: truncated value in extra field"

    .line 111
    .line 112
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p0

    .line 116
    :cond_3
    new-instance p0, Ljava/io/IOException;

    .line 117
    .line 118
    const-string p1, "bad zip: truncated header in extra field"

    .line 119
    .line 120
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p0

    .line 124
    :cond_4
    return-void
.end method

.method public static final h(Ltg/j;Ltg/n;)Ltg/n;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "basicMetadata"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, Lug/j;->i(Ltg/j;Ltg/n;)Ltg/n;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method private static final i(Ltg/j;Ltg/n;)Ltg/n;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lkotlin/jvm/internal/N;

    .line 4
    .line 5
    invoke-direct {v1}, Lkotlin/jvm/internal/N;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual/range {p1 .. p1}, Ltg/n;->c()Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v3, v2

    .line 17
    :goto_0
    iput-object v3, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 18
    .line 19
    new-instance v3, Lkotlin/jvm/internal/N;

    .line 20
    .line 21
    invoke-direct {v3}, Lkotlin/jvm/internal/N;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance v4, Lkotlin/jvm/internal/N;

    .line 25
    .line 26
    invoke-direct {v4}, Lkotlin/jvm/internal/N;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ltg/j;->J1()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const v6, 0x4034b50

    .line 34
    .line 35
    .line 36
    if-ne v5, v6, :cond_3

    .line 37
    .line 38
    const-wide/16 v5, 0x2

    .line 39
    .line 40
    invoke-interface {v0, v5, v6}, Ltg/j;->skip(J)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v0}, Ltg/j;->J0()S

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    const v6, 0xffff

    .line 48
    .line 49
    .line 50
    and-int v7, v5, v6

    .line 51
    .line 52
    and-int/lit8 v5, v5, 0x1

    .line 53
    .line 54
    if-nez v5, :cond_2

    .line 55
    .line 56
    const-wide/16 v7, 0x12

    .line 57
    .line 58
    invoke-interface {v0, v7, v8}, Ltg/j;->skip(J)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v0}, Ltg/j;->J0()S

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    int-to-long v7, v5

    .line 66
    const-wide/32 v9, 0xffff

    .line 67
    .line 68
    .line 69
    and-long/2addr v7, v9

    .line 70
    invoke-interface {v0}, Ltg/j;->J0()S

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    and-int/2addr v5, v6

    .line 75
    invoke-interface {v0, v7, v8}, Ltg/j;->skip(J)V

    .line 76
    .line 77
    .line 78
    if-nez p1, :cond_1

    .line 79
    .line 80
    int-to-long v3, v5

    .line 81
    invoke-interface {v0, v3, v4}, Ltg/j;->skip(J)V

    .line 82
    .line 83
    .line 84
    return-object v2

    .line 85
    :cond_1
    new-instance v2, Lug/j$c;

    .line 86
    .line 87
    invoke-direct {v2, v0, v1, v3, v4}, Lug/j$c;-><init>(Ltg/j;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v0, v5, v2}, Lug/j;->g(Ltg/j;ILkotlin/jvm/functions/Function2;)V

    .line 91
    .line 92
    .line 93
    new-instance v6, Ltg/n;

    .line 94
    .line 95
    invoke-virtual/range {p1 .. p1}, Ltg/n;->g()Z

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    invoke-virtual/range {p1 .. p1}, Ltg/n;->f()Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    invoke-virtual/range {p1 .. p1}, Ltg/n;->d()Ljava/lang/Long;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    iget-object v0, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 108
    .line 109
    move-object v11, v0

    .line 110
    check-cast v11, Ljava/lang/Long;

    .line 111
    .line 112
    iget-object v0, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 113
    .line 114
    move-object v12, v0

    .line 115
    check-cast v12, Ljava/lang/Long;

    .line 116
    .line 117
    iget-object v0, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 118
    .line 119
    move-object v13, v0

    .line 120
    check-cast v13, Ljava/lang/Long;

    .line 121
    .line 122
    const/16 v15, 0x80

    .line 123
    .line 124
    const/16 v16, 0x0

    .line 125
    .line 126
    const/4 v9, 0x0

    .line 127
    const/4 v14, 0x0

    .line 128
    invoke-direct/range {v6 .. v16}, Ltg/n;-><init>(ZZLtg/P;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 129
    .line 130
    .line 131
    return-object v6

    .line 132
    :cond_2
    new-instance v0, Ljava/io/IOException;

    .line 133
    .line 134
    new-instance v1, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 137
    .line 138
    .line 139
    const-string v2, "unsupported zip: general purpose bit flag="

    .line 140
    .line 141
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-static {v7}, Lug/j;->c(I)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw v0

    .line 159
    :cond_3
    new-instance v0, Ljava/io/IOException;

    .line 160
    .line 161
    new-instance v1, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    const-string v2, "bad zip: expected "

    .line 167
    .line 168
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-static {v6}, Lug/j;->c(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v2, " but was "

    .line 179
    .line 180
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-static {v5}, Lug/j;->c(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw v0
.end method

.method private static final j(Ltg/j;Lug/f;)Lug/f;
    .locals 8

    .line 1
    const-wide/16 v0, 0xc

    .line 2
    .line 3
    invoke-interface {p0, v0, v1}, Ltg/j;->skip(J)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ltg/j;->J1()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-interface {p0}, Ltg/j;->J1()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-interface {p0}, Ltg/j;->K0()J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    invoke-interface {p0}, Ltg/j;->K0()J

    .line 19
    .line 20
    .line 21
    move-result-wide v5

    .line 22
    cmp-long v2, v3, v5

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    const-wide/16 v0, 0x8

    .line 31
    .line 32
    invoke-interface {p0, v0, v1}, Ltg/j;->skip(J)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p0}, Ltg/j;->K0()J

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    new-instance v2, Lug/f;

    .line 40
    .line 41
    invoke-virtual {p1}, Lug/f;->b()I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    invoke-direct/range {v2 .. v7}, Lug/f;-><init>(JJI)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_0
    new-instance p0, Ljava/io/IOException;

    .line 50
    .line 51
    const-string p1, "unsupported zip: spanned"

    .line 52
    .line 53
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p0
.end method

.method public static final k(Ltg/j;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-static {p0, v0}, Lug/j;->i(Ltg/j;Ltg/n;)Ltg/n;

    .line 8
    .line 9
    .line 10
    return-void
.end method
