.class public final Landroidx/room/c$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/c;-><init>(LM3/q;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/room/c;


# direct methods
.method constructor <init>(Landroidx/room/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/room/c$e;->a:Landroidx/room/c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final a()Ljava/util/Set;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/room/c$e;->a:Landroidx/room/c;

    .line 2
    .line 3
    invoke-static {}, LUd/a0;->b()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Landroidx/room/c;->f()LM3/q;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v2, LS3/a;

    .line 12
    .line 13
    const-string v3, "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"

    .line 14
    .line 15
    invoke-direct {v2, v3}, LS3/a;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-static {v0, v2, v4, v3, v4}, LM3/q;->y(LM3/q;LS3/j;Landroid/os/CancellationSignal;ILjava/lang/Object;)Landroid/database/Cursor;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v1

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    sget-object v2, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    invoke-static {v0, v4}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, LUd/a0;->a(Ljava/util/Set;)Ljava/util/Set;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    move-object v1, v0

    .line 55
    check-cast v1, Ljava/util/Collection;

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_3

    .line 62
    .line 63
    iget-object v1, p0, Landroidx/room/c$e;->a:Landroidx/room/c;

    .line 64
    .line 65
    invoke-virtual {v1}, Landroidx/room/c;->e()LS3/k;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    const-string v2, "Required value was null."

    .line 70
    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    iget-object v1, p0, Landroidx/room/c$e;->a:Landroidx/room/c;

    .line 74
    .line 75
    invoke-virtual {v1}, Landroidx/room/c;->e()LS3/k;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-eqz v1, :cond_1

    .line 80
    .line 81
    invoke-interface {v1}, LS3/k;->Z()I

    .line 82
    .line 83
    .line 84
    return-object v0

    .line 85
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 86
    .line 87
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v0

    .line 91
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 92
    .line 93
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v0

    .line 97
    :cond_3
    return-object v0

    .line 98
    :goto_1
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 99
    :catchall_1
    move-exception v2

    .line 100
    invoke-static {v0, v1}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    throw v2
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/room/c$e;->a:Landroidx/room/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/c;->f()LM3/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LM3/q;->k()Ljava/util/concurrent/locks/Lock;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 12
    .line 13
    .line 14
    :try_start_0
    iget-object v1, p0, Landroidx/room/c$e;->a:Landroidx/room/c;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroidx/room/c;->d()Z

    .line 17
    .line 18
    .line 19
    move-result v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Landroidx/room/c$e;->a:Landroidx/room/c;

    .line 26
    .line 27
    invoke-static {v0}, Landroidx/room/c;->b(Landroidx/room/c;)LM3/c;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_5

    .line 32
    .line 33
    invoke-virtual {v0}, LM3/c;->e()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    :try_start_1
    iget-object v1, p0, Landroidx/room/c$e;->a:Landroidx/room/c;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroidx/room/c;->h()Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v2, 0x1

    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 46
    .line 47
    .line 48
    move-result v1
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Landroidx/room/c$e;->a:Landroidx/room/c;

    .line 55
    .line 56
    invoke-static {v0}, Landroidx/room/c;->b(Landroidx/room/c;)LM3/c;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_5

    .line 61
    .line 62
    invoke-virtual {v0}, LM3/c;->e()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    :try_start_2
    iget-object v1, p0, Landroidx/room/c$e;->a:Landroidx/room/c;

    .line 67
    .line 68
    invoke-virtual {v1}, Landroidx/room/c;->f()LM3/q;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, LM3/q;->q()Z

    .line 73
    .line 74
    .line 75
    move-result v1
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Landroidx/room/c$e;->a:Landroidx/room/c;

    .line 82
    .line 83
    invoke-static {v0}, Landroidx/room/c;->b(Landroidx/room/c;)LM3/c;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    invoke-virtual {v0}, LM3/c;->e()V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_2
    :try_start_3
    iget-object v1, p0, Landroidx/room/c$e;->a:Landroidx/room/c;

    .line 94
    .line 95
    invoke-virtual {v1}, Landroidx/room/c;->f()LM3/q;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, LM3/q;->m()LS3/h;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-interface {v1}, LS3/h;->getWritableDatabase()LS3/g;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-interface {v1}, LS3/g;->n0()V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 108
    .line 109
    .line 110
    :try_start_4
    invoke-direct {p0}, Landroidx/room/c$e;->a()Ljava/util/Set;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-interface {v1}, LS3/g;->l0()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 115
    .line 116
    .line 117
    :try_start_5
    invoke-interface {v1}, LS3/g;->v0()V
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 118
    .line 119
    .line 120
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Landroidx/room/c$e;->a:Landroidx/room/c;

    .line 124
    .line 125
    invoke-static {v0}, Landroidx/room/c;->b(Landroidx/room/c;)LM3/c;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-eqz v0, :cond_3

    .line 130
    .line 131
    :goto_0
    invoke-virtual {v0}, LM3/c;->e()V

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :catchall_0
    move-exception v1

    .line 136
    goto/16 :goto_7

    .line 137
    .line 138
    :catch_0
    move-exception v1

    .line 139
    goto :goto_1

    .line 140
    :catch_1
    move-exception v1

    .line 141
    goto :goto_2

    .line 142
    :catchall_1
    move-exception v2

    .line 143
    :try_start_6
    invoke-interface {v1}, LS3/g;->v0()V

    .line 144
    .line 145
    .line 146
    throw v2
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 147
    :goto_1
    :try_start_7
    const-string v2, "ROOM"

    .line 148
    .line 149
    const-string v3, "Cannot run invalidation tracker. Is the db closed?"

    .line 150
    .line 151
    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 152
    .line 153
    .line 154
    invoke-static {}, LUd/a0;->d()Ljava/util/Set;

    .line 155
    .line 156
    .line 157
    move-result-object v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 158
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 159
    .line 160
    .line 161
    iget-object v0, p0, Landroidx/room/c$e;->a:Landroidx/room/c;

    .line 162
    .line 163
    invoke-static {v0}, Landroidx/room/c;->b(Landroidx/room/c;)LM3/c;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    if-eqz v0, :cond_3

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :goto_2
    :try_start_8
    const-string v2, "ROOM"

    .line 171
    .line 172
    const-string v3, "Cannot run invalidation tracker. Is the db closed?"

    .line 173
    .line 174
    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 175
    .line 176
    .line 177
    invoke-static {}, LUd/a0;->d()Ljava/util/Set;

    .line 178
    .line 179
    .line 180
    move-result-object v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 181
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 182
    .line 183
    .line 184
    iget-object v0, p0, Landroidx/room/c$e;->a:Landroidx/room/c;

    .line 185
    .line 186
    invoke-static {v0}, Landroidx/room/c;->b(Landroidx/room/c;)LM3/c;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    if-eqz v0, :cond_3

    .line 191
    .line 192
    goto :goto_0

    .line 193
    :cond_3
    :goto_3
    move-object v0, v2

    .line 194
    check-cast v0, Ljava/util/Collection;

    .line 195
    .line 196
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-nez v0, :cond_5

    .line 201
    .line 202
    iget-object v0, p0, Landroidx/room/c$e;->a:Landroidx/room/c;

    .line 203
    .line 204
    invoke-virtual {v0}, Landroidx/room/c;->g()Lp/b;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    iget-object v1, p0, Landroidx/room/c$e;->a:Landroidx/room/c;

    .line 209
    .line 210
    monitor-enter v0

    .line 211
    :try_start_9
    invoke-virtual {v1}, Landroidx/room/c;->g()Lp/b;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    if-eqz v3, :cond_4

    .line 224
    .line 225
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    check-cast v3, Ljava/util/Map$Entry;

    .line 230
    .line 231
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    check-cast v3, Landroidx/room/c$d;

    .line 236
    .line 237
    invoke-virtual {v3, v2}, Landroidx/room/c$d;->b(Ljava/util/Set;)V

    .line 238
    .line 239
    .line 240
    goto :goto_4

    .line 241
    :catchall_2
    move-exception v1

    .line 242
    goto :goto_5

    .line 243
    :cond_4
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 244
    .line 245
    monitor-exit v0

    .line 246
    goto :goto_6

    .line 247
    :goto_5
    monitor-exit v0

    .line 248
    throw v1

    .line 249
    :cond_5
    :goto_6
    return-void

    .line 250
    :goto_7
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 251
    .line 252
    .line 253
    iget-object v0, p0, Landroidx/room/c$e;->a:Landroidx/room/c;

    .line 254
    .line 255
    invoke-static {v0}, Landroidx/room/c;->b(Landroidx/room/c;)LM3/c;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    if-eqz v0, :cond_6

    .line 260
    .line 261
    invoke-virtual {v0}, LM3/c;->e()V

    .line 262
    .line 263
    .line 264
    :cond_6
    throw v1
.end method
