.class public final LY/R0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/Q0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY/R0$a;
    }
.end annotation


# instance fields
.field private final a:LY/B;

.field private final b:LY/y;

.field private final c:LY/s;

.field private final d:Lkotlin/jvm/functions/Function2;

.field private final e:Z

.field private final f:LY/d;

.field private final g:Ljava/lang/Object;

.field private h:Ljava/util/concurrent/atomic/AtomicReference;

.field private i:Lt/e0;

.field private final j:Lg0/q;

.field private final k:LY/r1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LY/B;LY/y;LY/s;Ljava/util/Set;Lkotlin/jvm/functions/Function2;ZLY/d;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY/R0;->a:LY/B;

    .line 5
    .line 6
    iput-object p2, p0, LY/R0;->b:LY/y;

    .line 7
    .line 8
    iput-object p3, p0, LY/R0;->c:LY/s;

    .line 9
    .line 10
    iput-object p5, p0, LY/R0;->d:Lkotlin/jvm/functions/Function2;

    .line 11
    .line 12
    iput-boolean p6, p0, LY/R0;->e:Z

    .line 13
    .line 14
    iput-object p7, p0, LY/R0;->f:LY/d;

    .line 15
    .line 16
    iput-object p8, p0, LY/R0;->g:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 19
    .line 20
    sget-object p2, LY/S0;->c:LY/S0;

    .line 21
    .line 22
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, LY/R0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 26
    .line 27
    invoke-static {}, Lt/f0;->a()Lt/e0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, LY/R0;->i:Lt/e0;

    .line 32
    .line 33
    new-instance p1, Lg0/q;

    .line 34
    .line 35
    invoke-direct {p1}, Lg0/q;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3}, LY/s;->K0()Lk0/h;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p1, p4, p2}, Lg0/q;->r(Ljava/util/Set;Lk0/f;)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, LY/R0;->j:Lg0/q;

    .line 46
    .line 47
    new-instance p1, LY/r1;

    .line 48
    .line 49
    invoke-interface {p7}, LY/d;->a()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-direct {p1, p2}, LY/r1;-><init>(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, LY/R0;->k:LY/r1;

    .line 57
    .line 58
    return-void
.end method

.method private final b()V
    .locals 5

    .line 1
    iget-object v0, p0, LY/R0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iget-object v2, p0, LY/R0;->k:LY/r1;

    .line 6
    .line 7
    iget-object v3, p0, LY/R0;->f:LY/d;

    .line 8
    .line 9
    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>"

    .line 10
    .line 11
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v4, p0, LY/R0;->j:Lg0/q;

    .line 15
    .line 16
    invoke-virtual {v2, v3, v4}, LY/r1;->l(LY/d;Lg0/q;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, LY/R0;->j:Lg0/q;

    .line 20
    .line 21
    invoke-virtual {v2}, Lg0/q;->m()V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, LY/R0;->j:Lg0/q;

    .line 25
    .line 26
    invoke-virtual {v2}, Lg0/q;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 27
    .line 28
    .line 29
    :try_start_1
    iget-object v2, p0, LY/R0;->j:Lg0/q;

    .line 30
    .line 31
    invoke-virtual {v2}, Lg0/q;->j()V

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, LY/R0;->a:LY/B;

    .line 35
    .line 36
    invoke-virtual {v2, v1}, LY/B;->T(Lt/e0;)V

    .line 37
    .line 38
    .line 39
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    monitor-exit v0

    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception v1

    .line 44
    goto :goto_0

    .line 45
    :catchall_1
    move-exception v2

    .line 46
    :try_start_2
    iget-object v3, p0, LY/R0;->j:Lg0/q;

    .line 47
    .line 48
    invoke-virtual {v3}, Lg0/q;->j()V

    .line 49
    .line 50
    .line 51
    iget-object v3, p0, LY/R0;->a:LY/B;

    .line 52
    .line 53
    invoke-virtual {v3, v1}, LY/B;->T(Lt/e0;)V

    .line 54
    .line 55
    .line 56
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    :goto_0
    monitor-exit v0

    .line 58
    throw v1
.end method

.method private final f()V
    .locals 4

    .line 1
    sget-object v0, LY/S0;->d:LY/S0;

    .line 2
    .line 3
    sget-object v1, LY/S0;->f:LY/S0;

    .line 4
    .line 5
    iget-object v2, p0, LY/R0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Lw/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v3, "Unexpected state change from: "

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v0, " to: "

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const/16 v0, 0x2e

    .line 35
    .line 36
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, LY/V0;->b(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method


# virtual methods
.method public a(LY/C1;)Z
    .locals 8

    .line 1
    :try_start_0
    iget-object v0, p0, LY/R0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LY/S0;

    .line 8
    .line 9
    sget-object v1, LY/R0$a;->a:[I

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    aget v0, v1, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    const/16 v1, 0x2e

    .line 18
    .line 19
    const-string v2, " to: "

    .line 20
    .line 21
    const-string v3, "Unexpected state change from: "

    .line 22
    .line 23
    packed-switch v0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    :try_start_1
    new-instance p1, LTd/r;

    .line 27
    .line 28
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :catch_0
    move-exception p1

    .line 33
    goto/16 :goto_1

    .line 34
    .line 35
    :pswitch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    const-string v0, "The paused composition is invalid because of a previous exception"

    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :pswitch_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v0, "The paused composition has been cancelled"

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :pswitch_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v0, "The paused composition has been applied"

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :pswitch_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string v0, "Pausable composition is complete and apply() should be applied"

    .line 62
    .line 63
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :pswitch_4
    const-string p1, "Recursive call to resume()"

    .line 68
    .line 69
    invoke-static {p1}, LY/w;->u(Ljava/lang/String;)Ljava/lang/Void;

    .line 70
    .line 71
    .line 72
    new-instance p1, LTd/k;

    .line 73
    .line 74
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :pswitch_5
    sget-object v0, LY/S0;->d:LY/S0;

    .line 79
    .line 80
    sget-object v4, LY/S0;->e:LY/S0;

    .line 81
    .line 82
    iget-object v5, p0, LY/R0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 83
    .line 84
    invoke-static {v5, v0, v4}, Lw/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-nez v5, :cond_0

    .line 89
    .line 90
    new-instance v5, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-static {v5}, LY/V0;->b(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 115
    .line 116
    .line 117
    :cond_0
    :try_start_2
    iget-object v5, p0, LY/R0;->b:LY/y;

    .line 118
    .line 119
    iget-object v6, p0, LY/R0;->a:LY/B;

    .line 120
    .line 121
    iget-object v7, p0, LY/R0;->i:Lt/e0;

    .line 122
    .line 123
    invoke-virtual {v5, v6, p1, v7}, LY/y;->o(LY/Q;LY/C1;Lt/e0;)Lt/e0;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    iput-object p1, p0, LY/R0;->i:Lt/e0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 128
    .line 129
    :try_start_3
    iget-object p1, p0, LY/R0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 130
    .line 131
    invoke-static {p1, v4, v0}, Lw/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    if-nez p1, :cond_1

    .line 136
    .line 137
    new-instance p1, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-static {p1}, LY/V0;->b(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :cond_1
    iget-object p1, p0, LY/R0;->i:Lt/e0;

    .line 165
    .line 166
    invoke-virtual {p1}, Lt/e0;->d()Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    if-eqz p1, :cond_6

    .line 171
    .line 172
    invoke-direct {p0}, LY/R0;->f()V

    .line 173
    .line 174
    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :catchall_0
    move-exception p1

    .line 178
    sget-object v0, LY/S0;->e:LY/S0;

    .line 179
    .line 180
    sget-object v4, LY/S0;->d:LY/S0;

    .line 181
    .line 182
    iget-object v5, p0, LY/R0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 183
    .line 184
    invoke-static {v5, v0, v4}, Lw/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    if-nez v5, :cond_2

    .line 189
    .line 190
    new-instance v5, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-static {v0}, LY/V0;->b(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    :cond_2
    throw p1

    .line 218
    :pswitch_6
    iget-boolean v0, p0, LY/R0;->e:Z

    .line 219
    .line 220
    if-eqz v0, :cond_3

    .line 221
    .line 222
    iget-object v0, p0, LY/R0;->c:LY/s;

    .line 223
    .line 224
    invoke-virtual {v0}, LY/s;->z1()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 225
    .line 226
    .line 227
    :cond_3
    :try_start_4
    iget-object v0, p0, LY/R0;->b:LY/y;

    .line 228
    .line 229
    iget-object v4, p0, LY/R0;->a:LY/B;

    .line 230
    .line 231
    iget-object v5, p0, LY/R0;->d:Lkotlin/jvm/functions/Function2;

    .line 232
    .line 233
    invoke-virtual {v0, v4, p1, v5}, LY/y;->b(LY/Q;LY/C1;Lkotlin/jvm/functions/Function2;)Lt/e0;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    iput-object p1, p0, LY/R0;->i:Lt/e0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 238
    .line 239
    :try_start_5
    iget-boolean p1, p0, LY/R0;->e:Z

    .line 240
    .line 241
    if-eqz p1, :cond_4

    .line 242
    .line 243
    iget-object p1, p0, LY/R0;->c:LY/s;

    .line 244
    .line 245
    invoke-virtual {p1}, LY/s;->x0()V

    .line 246
    .line 247
    .line 248
    :cond_4
    sget-object p1, LY/S0;->c:LY/S0;

    .line 249
    .line 250
    sget-object v0, LY/S0;->d:LY/S0;

    .line 251
    .line 252
    iget-object v4, p0, LY/R0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 253
    .line 254
    invoke-static {v4, p1, v0}, Lw/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    if-nez v4, :cond_5

    .line 259
    .line 260
    new-instance v4, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    invoke-static {p1}, LY/V0;->b(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    :cond_5
    iget-object p1, p0, LY/R0;->i:Lt/e0;

    .line 288
    .line 289
    invoke-virtual {p1}, Lt/e0;->d()Z

    .line 290
    .line 291
    .line 292
    move-result p1

    .line 293
    if-eqz p1, :cond_6

    .line 294
    .line 295
    invoke-direct {p0}, LY/R0;->f()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 296
    .line 297
    .line 298
    :cond_6
    :goto_0
    invoke-virtual {p0}, LY/R0;->isComplete()Z

    .line 299
    .line 300
    .line 301
    move-result p1

    .line 302
    return p1

    .line 303
    :catchall_1
    move-exception p1

    .line 304
    :try_start_6
    iget-boolean v0, p0, LY/R0;->e:Z

    .line 305
    .line 306
    if-eqz v0, :cond_7

    .line 307
    .line 308
    iget-object v0, p0, LY/R0;->c:LY/s;

    .line 309
    .line 310
    invoke-virtual {v0}, LY/s;->x0()V

    .line 311
    .line 312
    .line 313
    :cond_7
    throw p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 314
    :goto_1
    iget-object v0, p0, LY/R0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 315
    .line 316
    sget-object v1, LY/S0;->a:LY/S0;

    .line 317
    .line 318
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    throw p1

    .line 322
    nop

    .line 323
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public apply()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, LY/R0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LY/S0;

    .line 8
    .line 9
    sget-object v1, LY/R0$a;->a:[I

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    aget v0, v1, v0

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    new-instance v0, LTd/r;

    .line 21
    .line 22
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :catch_0
    move-exception v0

    .line 27
    goto :goto_0

    .line 28
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v1, "The paused composition is invalid because of a previous exception"

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :pswitch_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string v1, "The paused composition has been cancelled"

    .line 39
    .line 40
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :pswitch_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v1, "The paused composition has already been applied"

    .line 47
    .line 48
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0

    .line 52
    :pswitch_3
    invoke-direct {p0}, LY/R0;->b()V

    .line 53
    .line 54
    .line 55
    sget-object v0, LY/S0;->f:LY/S0;

    .line 56
    .line 57
    sget-object v1, LY/S0;->g:LY/S0;

    .line 58
    .line 59
    iget-object v2, p0, LY/R0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 60
    .line 61
    invoke-static {v2, v0, v1}, Lw/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_0

    .line 66
    .line 67
    new-instance v2, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v3, "Unexpected state change from: "

    .line 73
    .line 74
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v0, " to: "

    .line 81
    .line 82
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const/16 v0, 0x2e

    .line 89
    .line 90
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v0}, LY/V0;->b(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :cond_0
    return-void

    .line 101
    :pswitch_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 102
    .line 103
    const-string v1, "The paused composition has not completed yet"

    .line 104
    .line 105
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    :goto_0
    iget-object v1, p0, LY/R0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 110
    .line 111
    sget-object v2, LY/S0;->a:LY/S0;

    .line 112
    .line 113
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    throw v0

    .line 117
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c()LY/r1;
    .locals 1

    .line 1
    iget-object v0, p0, LY/R0;->k:LY/r1;

    .line 2
    .line 3
    return-object v0
.end method

.method public cancel()V
    .locals 2

    .line 1
    iget-object v0, p0, LY/R0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    sget-object v1, LY/S0;->b:LY/S0;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LY/R0;->j:Lg0/q;

    .line 9
    .line 10
    invoke-virtual {v0}, Lg0/q;->o()Lt/e0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, LY/R0;->j:Lg0/q;

    .line 15
    .line 16
    invoke-virtual {v1}, Lg0/q;->j()V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, LY/R0;->a:LY/B;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, LY/B;->T(Lt/e0;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final d()Lg0/q;
    .locals 1

    .line 1
    iget-object v0, p0, LY/R0;->j:Lg0/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Z
    .locals 2

    .line 1
    iget-object v0, p0, LY/R0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, LY/S0;->e:LY/S0;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final g()V
    .locals 4

    .line 1
    iget-object v0, p0, LY/R0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, LY/S0;->d:LY/S0;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, LY/S0;->f:LY/S0;

    .line 13
    .line 14
    iget-object v2, p0, LY/R0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 15
    .line 16
    invoke-static {v2, v0, v1}, Lw/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v3, "Unexpected state change from: "

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v0, " to: "

    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const/16 v0, 0x2e

    .line 44
    .line 45
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, LY/V0;->b(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    :goto_0
    return-void
.end method

.method public isComplete()Z
    .locals 2

    .line 1
    iget-object v0, p0, LY/R0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LY/S0;

    .line 8
    .line 9
    sget-object v1, LY/S0;->f:LY/S0;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-ltz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method
