.class public final Lwd/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwd/g$a;,
        Lwd/g$b;,
        Lwd/g$c;,
        Lwd/g$d;,
        Lwd/g$e;
    }
.end annotation


# static fields
.field public static final h:Lwd/g$b;


# instance fields
.field private final a:Ljava/io/File;

.field private final b:Ljava/lang/String;

.field private final c:Lexpo/modules/updates/d;

.field private final d:Lxd/g;

.field private final e:Lexpo/modules/updates/db/UpdatesDatabase;

.field private f:Ldg/A;

.field private g:Lie/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwd/g$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lwd/g$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lwd/g;->h:Lwd/g$b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/lang/String;Lexpo/modules/updates/d;Lxd/g;Lexpo/modules/updates/db/UpdatesDatabase;)V
    .locals 2

    .line 1
    const-string v0, "filesDirectory"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "easClientID"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "configuration"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "logger"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "database"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lwd/g;->a:Ljava/io/File;

    .line 30
    .line 31
    iput-object p2, p0, Lwd/g;->b:Ljava/lang/String;

    .line 32
    .line 33
    iput-object p3, p0, Lwd/g;->c:Lexpo/modules/updates/d;

    .line 34
    .line 35
    iput-object p4, p0, Lwd/g;->d:Lxd/g;

    .line 36
    .line 37
    iput-object p5, p0, Lwd/g;->e:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 38
    .line 39
    new-instance p1, Ldg/A$a;

    .line 40
    .line 41
    invoke-direct {p1}, Ldg/A$a;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-direct {p0}, Lwd/g;->t()Ldg/c;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p1, p2}, Ldg/A$a;->d(Ldg/c;)Ldg/A$a;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p3}, Lexpo/modules/updates/d;->l()I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    int-to-long p4, p2

    .line 57
    const-wide/16 v0, 0x2710

    .line 58
    .line 59
    invoke-static {p4, p5, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 60
    .line 61
    .line 62
    move-result-wide p4

    .line 63
    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 64
    .line 65
    invoke-virtual {p1, p4, p5, p2}, Ldg/A$a;->f(JLjava/util/concurrent/TimeUnit;)Ldg/A$a;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p3}, Lexpo/modules/updates/d;->l()I

    .line 70
    .line 71
    .line 72
    move-result p3

    .line 73
    int-to-long p3, p3

    .line 74
    invoke-static {p3, p4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 75
    .line 76
    .line 77
    move-result-wide p3

    .line 78
    invoke-virtual {p1, p3, p4, p2}, Ldg/A$a;->P(JLjava/util/concurrent/TimeUnit;)Ldg/A$a;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    sget-object p2, Leg/a;->a:Leg/a;

    .line 83
    .line 84
    invoke-virtual {p1, p2}, Ldg/A$a;->a(Ldg/v;)Ldg/A$a;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Ldg/A$a;->c()Ldg/A;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iput-object p1, p0, Lwd/g;->f:Ldg/A;

    .line 93
    .line 94
    new-instance p1, Lwd/e;

    .line 95
    .line 96
    invoke-direct {p1}, Lwd/e;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object p1, p0, Lwd/g;->g:Lie/o;

    .line 100
    .line 101
    return-void
.end method

.method private final B(Lrd/a;Ljava/io/File;Lrd/d;)Lwd/g$d;
    .locals 8

    .line 1
    invoke-virtual {p1}, Lrd/a;->t()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    invoke-virtual {p3}, Lrd/d;->d()Ljava/util/UUID;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    iget-object v0, p0, Lwd/g;->e:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 12
    .line 13
    invoke-virtual {v0}, Lexpo/modules/updates/db/UpdatesDatabase;->Q()Lqd/e;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p3}, Lqd/e;->j(Ljava/util/UUID;)Lrd/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_4

    .line 22
    .line 23
    invoke-virtual {v0}, Lrd/a;->m()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_3

    .line 28
    .line 29
    new-instance v2, Ljava/io/File;

    .line 30
    .line 31
    invoke-direct {v2, p2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    :try_start_0
    sget-object p2, Lexpo/modules/updates/g;->a:Lexpo/modules/updates/g;

    .line 41
    .line 42
    invoke-virtual {p2, v2}, Lexpo/modules/updates/g;->i(Ljava/io/File;)[B

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p2, v1}, Lexpo/modules/updates/g;->k([B)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    goto :goto_0

    .line 51
    :catch_0
    const/4 p2, 0x0

    .line 52
    :goto_0
    invoke-virtual {v0}, Lrd/a;->c()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    if-eqz p2, :cond_1

    .line 59
    .line 60
    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_0

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_0
    iget-object v1, p0, Lwd/g;->d:Lxd/g;

    .line 68
    .line 69
    new-instance v2, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v3, "Asset hash mismatch for update "

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v4, "; expected="

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v5, " actual="

    .line 91
    .line 92
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    sget-object v6, Lxd/b;->i:Lxd/b;

    .line 103
    .line 104
    invoke-virtual {p3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-virtual {p1}, Lrd/a;->j()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {v1, v2, v6, v7, p1}, Lxd/g;->p(Ljava/lang/String;Lxd/b;Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    new-instance p1, Ljava/io/IOException;

    .line 116
    .line 117
    new-instance v1, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw p1

    .line 148
    :cond_1
    :goto_1
    new-instance p1, Lwd/g$d;

    .line 149
    .line 150
    invoke-direct {p1, v2}, Lwd/g$d;-><init>(Ljava/io/File;)V

    .line 151
    .line 152
    .line 153
    return-object p1

    .line 154
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 155
    .line 156
    new-instance p2, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    const-string p3, "Base asset "

    .line 162
    .line 163
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string p3, " is missing; cannot apply patch"

    .line 170
    .line 171
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw p1

    .line 182
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 183
    .line 184
    new-instance p2, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 187
    .line 188
    .line 189
    const-string v0, "Launch asset for update "

    .line 190
    .line 191
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    const-string p3, " is missing a relative path"

    .line 198
    .line 199
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw p1

    .line 210
    :cond_4
    new-instance p1, Ljava/io/IOException;

    .line 211
    .line 212
    new-instance p2, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    const-string v0, "Launch asset not found for current update "

    .line 218
    .line 219
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw p1

    .line 233
    :cond_5
    new-instance p2, Ljava/io/IOException;

    .line 234
    .line 235
    invoke-virtual {p1}, Lrd/a;->j()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    new-instance p3, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    const-string v0, "Received patch for non-launch asset "

    .line 245
    .line 246
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    throw p2
.end method

.method private final C(Lwd/g$e;Lrd/d;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "toLowerCase(...)"

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-virtual {p2}, Lrd/d;->d()Ljava/util/UUID;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 19
    .line 20
    invoke-virtual {p2, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object p2, v0

    .line 29
    :goto_0
    invoke-virtual {p1}, Lwd/g$e;->a()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-virtual {p1}, Lwd/g$e;->b()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    const/4 v2, 0x0

    .line 49
    if-nez v1, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1}, Lwd/g$e;->c()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    const/16 v1, 0xe2

    .line 56
    .line 57
    if-eq p1, v1, :cond_2

    .line 58
    .line 59
    return v2

    .line 60
    :cond_2
    if-nez v0, :cond_3

    .line 61
    .line 62
    return v2

    .line 63
    :cond_3
    if-eqz p2, :cond_4

    .line 64
    .line 65
    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-nez p1, :cond_4

    .line 70
    .line 71
    return v2

    .line 72
    :cond_4
    const/4 p1, 0x1

    .line 73
    return p1
.end method

.method public static synthetic a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lwd/g;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;D)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lwd/g;->n(Lkotlin/jvm/functions/Function1;D)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic c(Lwd/g;Lrd/a;Lorg/json/JSONObject;Lwd/b;Ljava/io/File;Ljava/lang/String;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lwd/g;->s(Lrd/a;Lorg/json/JSONObject;Lwd/b;Ljava/io/File;Ljava/lang/String;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic d(Lwd/g;)Ldg/A;
    .locals 0

    .line 1
    iget-object p0, p0, Lwd/g;->f:Ldg/A;

    .line 2
    .line 3
    return-object p0
.end method

.method private final e(Ldg/C$a;Lorg/json/JSONObject;)Ldg/C$a;
    .locals 5

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto/16 :goto_2

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "keys(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, LCf/l;->g(Ljava/util/Iterator;)LCf/i;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, LCf/i;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_c

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const-class v2, Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const-class v3, Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v3}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    const-string v4, "null cannot be cast to non-null type kotlin.Any"

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    goto/16 :goto_1

    .line 64
    .line 65
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 66
    .line 67
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_2
    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 72
    .line 73
    invoke-static {v3}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_3

    .line 82
    .line 83
    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 84
    .line 85
    .line 86
    move-result-wide v2

    .line 87
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    goto/16 :goto_1

    .line 92
    .line 93
    :cond_3
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 94
    .line 95
    invoke-static {v3}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_4

    .line 104
    .line 105
    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    goto :goto_1

    .line 114
    :cond_4
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 115
    .line 116
    invoke-static {v3}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-eqz v3, :cond_5

    .line 125
    .line 126
    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 127
    .line 128
    .line 129
    move-result-wide v2

    .line 130
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    goto :goto_1

    .line 135
    :cond_5
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 136
    .line 137
    invoke-static {v3}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    if-eqz v3, :cond_6

    .line 146
    .line 147
    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    goto :goto_1

    .line 156
    :cond_6
    const-class v3, Lorg/json/JSONArray;

    .line 157
    .line 158
    invoke-static {v3}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-eqz v3, :cond_8

    .line 167
    .line 168
    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    if-eqz v2, :cond_7

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_7
    new-instance p1, Ljava/lang/NullPointerException;

    .line 176
    .line 177
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw p1

    .line 181
    :cond_8
    const-class v3, Lorg/json/JSONObject;

    .line 182
    .line 183
    invoke-static {v3}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    if-eqz v2, :cond_a

    .line 192
    .line 193
    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    if-eqz v2, :cond_9

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_9
    new-instance p1, Ljava/lang/NullPointerException;

    .line 201
    .line 202
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw p1

    .line 206
    :cond_a
    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    if-eqz v2, :cond_b

    .line 211
    .line 212
    :goto_1
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-virtual {p1, v1, v2}, Ldg/C$a;->e(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 217
    .line 218
    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :cond_b
    new-instance p1, Ljava/lang/NullPointerException;

    .line 222
    .line 223
    invoke-direct {p1, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw p1

    .line 227
    :cond_c
    :goto_2
    return-object p1
.end method

.method private static final g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    const-string v0, "baseFilePath"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "newFilePath"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "patchFilePath"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0, p1, p2}, Lexpo/modules/updates/BSPatch;->applyPatch(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method private final h(Lrd/a;Ldg/F;Ljava/io/File;Ljava/io/File;Lrd/d;Lrd/d;Ljava/lang/String;)[B
    .locals 7

    .line 1
    invoke-virtual {p0, p1, p2, p4, p5}, Lwd/g;->A(Lrd/a;Ldg/F;Ljava/io/File;Lrd/d;)Lwd/g$d;

    .line 2
    .line 3
    .line 4
    move-result-object p4

    .line 5
    invoke-virtual {p4}, Lwd/g$d;->a()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz p6, :cond_0

    .line 10
    .line 11
    invoke-virtual {p6}, Lrd/d;->d()Ljava/util/UUID;

    .line 12
    .line 13
    .line 14
    move-result-object p4

    .line 15
    if-eqz p4, :cond_0

    .line 16
    .line 17
    invoke-virtual {p4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p4

    .line 21
    :goto_0
    move-object v0, p0

    .line 22
    move-object v5, p1

    .line 23
    move-object v2, p2

    .line 24
    move-object v3, p3

    .line 25
    move-object v6, p4

    .line 26
    move-object v4, p7

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    const/4 p4, 0x0

    .line 29
    goto :goto_0

    .line 30
    :goto_1
    invoke-virtual/range {v0 .. v6}, Lwd/g;->f(Ljava/io/File;Ldg/F;Ljava/io/File;Ljava/lang/String;Lrd/a;Ljava/lang/String;)[B

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method

.method private final i(Ljava/lang/String;Lorg/json/JSONObject;Lyd/n;Lyd/o;Lorg/json/JSONObject;Ljava/lang/String;Lexpo/modules/updates/d;Lxd/g;)Lwd/w$b;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "isVerified"

    .line 3
    .line 4
    invoke-virtual {p2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p7}, Lexpo/modules/updates/d;->f()Lod/f;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    invoke-virtual {p4}, Lyd/o;->a()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p4

    .line 17
    sget-object v2, LDf/d;->b:Ljava/nio/charset/Charset;

    .line 18
    .line 19
    invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v2, "getBytes(...)"

    .line 24
    .line 25
    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p4, p1, p6}, Lod/f;->h(Ljava/lang/String;[BLjava/lang/String;)Lod/i;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Lod/i;->b()Lod/j;

    .line 33
    .line 34
    .line 35
    move-result-object p4

    .line 36
    sget-object p6, Lod/j;->b:Lod/j;

    .line 37
    .line 38
    if-eq p4, p6, :cond_2

    .line 39
    .line 40
    invoke-virtual {p1}, Lod/i;->b()Lod/j;

    .line 41
    .line 42
    .line 43
    move-result-object p4

    .line 44
    sget-object p6, Lod/j;->c:Lod/j;

    .line 45
    .line 46
    if-eq p4, p6, :cond_3

    .line 47
    .line 48
    sget-object p4, Lyd/r;->a:Lyd/r;

    .line 49
    .line 50
    invoke-virtual {p4, p2, p3, p5, p7}, Lyd/r;->b(Lorg/json/JSONObject;Lyd/n;Lorg/json/JSONObject;Lexpo/modules/updates/d;)Lyd/q;

    .line 51
    .line 52
    .line 53
    move-result-object p4

    .line 54
    invoke-interface {p4}, Lyd/q;->d()LAc/e;

    .line 55
    .line 56
    .line 57
    move-result-object p4

    .line 58
    invoke-virtual {p1}, Lod/i;->a()Lod/g;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_1

    .line 63
    .line 64
    invoke-virtual {p1}, Lod/g;->a()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p6

    .line 68
    invoke-virtual {p4}, LAc/e;->b()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p6

    .line 76
    if-eqz p6, :cond_0

    .line 77
    .line 78
    invoke-virtual {p1}, Lod/g;->b()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p4}, LAc/e;->j()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p4

    .line 86
    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_0

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :catch_0
    move-exception p1

    .line 94
    goto :goto_2

    .line 95
    :cond_0
    new-instance p1, Ljava/security/cert/CertificateException;

    .line 96
    .line 97
    const-string p2, "Code signing certificate project ID or scope key does not match project ID or scope key in response"

    .line 98
    .line 99
    invoke-direct {p1, p2}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :cond_1
    :goto_0
    const-string p1, "Manifest code signing signature verified successfully"

    .line 104
    .line 105
    const/4 p4, 0x2

    .line 106
    const/4 p6, 0x0

    .line 107
    invoke-static {p8, p1, p6, p4, p6}, Lxd/g;->k(Lxd/g;Ljava/lang/String;Lxd/b;ILjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    const/4 p1, 0x1

    .line 111
    invoke-virtual {p2, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 116
    .line 117
    const-string p2, "Incorrect signature"

    .line 118
    .line 119
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    :cond_3
    :goto_1
    sget-object p1, Lyd/r;->a:Lyd/r;

    .line 124
    .line 125
    invoke-virtual {p1, p2, p3, p5, p7}, Lyd/r;->b(Lorg/json/JSONObject;Lyd/n;Lorg/json/JSONObject;Lexpo/modules/updates/d;)Lyd/q;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    sget-object p2, LBd/g;->a:LBd/g;

    .line 130
    .line 131
    invoke-interface {p1}, Lyd/q;->c()Lrd/d;

    .line 132
    .line 133
    .line 134
    move-result-object p4

    .line 135
    invoke-static {p4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p3}, Lyd/n;->d()Lorg/json/JSONObject;

    .line 139
    .line 140
    .line 141
    move-result-object p3

    .line 142
    invoke-virtual {p2, p4, p3}, LBd/g;->a(Lrd/d;Lorg/json/JSONObject;)Z

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    if-eqz p2, :cond_4

    .line 147
    .line 148
    new-instance p2, Lwd/w$b;

    .line 149
    .line 150
    invoke-direct {p2, p1}, Lwd/w$b;-><init>(Lyd/q;)V

    .line 151
    .line 152
    .line 153
    return-object p2

    .line 154
    :cond_4
    new-instance p1, Ljava/lang/Exception;

    .line 155
    .line 156
    const-string p2, "Manifest filters do not match manifest content for downloaded manifest"

    .line 157
    .line 158
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw p1

    .line 162
    :goto_2
    sget-object p2, Lxd/b;->g:Lxd/b;

    .line 163
    .line 164
    const-string p3, "Code signing verification failed for manifest"

    .line 165
    .line 166
    invoke-virtual {p8, p3, p1, p2}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 167
    .line 168
    .line 169
    new-instance p2, Ljava/io/IOException;

    .line 170
    .line 171
    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    throw p2
.end method

.method public static synthetic m(Lwd/g;Lrd/a;Ljava/io/File;Lorg/json/JSONObject;Lrd/d;Lrd/d;Lkotlin/jvm/functions/Function1;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    and-int/lit8 v0, p8, 0x20

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p6, 0x0

    .line 6
    :cond_0
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move-object v2, p2

    .line 9
    move-object v3, p3

    .line 10
    move-object v4, p4

    .line 11
    move-object v5, p5

    .line 12
    move-object v6, p6

    .line 13
    move-object v7, p7

    .line 14
    invoke-virtual/range {v0 .. v7}, Lwd/g;->l(Lrd/a;Ljava/io/File;Lorg/json/JSONObject;Lrd/d;Lrd/d;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;D)LTd/L;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    sget-object p0, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object p0
.end method

.method private final p(Ldg/C;Lwd/b;LZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, LGf/p;

    .line 2
    .line 3
    invoke-static {p3}, Lae/b;->c(LZd/e;)LZd/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, LGf/p;-><init>(LZd/e;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LGf/p;->C()V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lwd/g;->d(Lwd/g;)Ldg/A;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1, p1}, Ldg/A;->a(Ldg/C;)Ldg/e;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v1, Lwd/g$h;

    .line 23
    .line 24
    invoke-direct {v1, p1}, Lwd/g$h;-><init>(Ldg/e;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1}, LGf/n;->p(Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    .line 30
    :try_start_0
    invoke-interface {p1}, Ldg/e;->b()Ldg/E;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/4 v1, 0x0

    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    invoke-virtual {p1}, Ldg/E;->j()Ldg/F;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    new-instance v1, Lwd/d;

    .line 44
    .line 45
    invoke-direct {v1, v2, p2}, Lwd/d;-><init>(Ldg/F;Lwd/b;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ldg/E;->Y()Ldg/E$a;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-virtual {p2, v1}, Ldg/E$a;->b(Ldg/F;)Ldg/E$a;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {p2}, Ldg/E$a;->c()Ldg/E;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    goto :goto_0

    .line 61
    :catch_0
    move-exception p1

    .line 62
    goto :goto_2

    .line 63
    :cond_0
    :goto_0
    sget-object p2, LTd/u;->b:LTd/u$a;

    .line 64
    .line 65
    if-nez v1, :cond_1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    move-object p1, v1

    .line 69
    :goto_1
    invoke-static {p1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-interface {v0, p1}, LZd/e;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    .line 75
    .line 76
    goto :goto_3

    .line 77
    :goto_2
    sget-object p2, LTd/u;->b:LTd/u$a;

    .line 78
    .line 79
    invoke-static {p1}, LTd/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-interface {v0, p1}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :goto_3
    invoke-virtual {v0}, LGf/p;->v()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    if-ne p1, p2, :cond_2

    .line 99
    .line 100
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 101
    .line 102
    .line 103
    :cond_2
    return-object p1
.end method

.method static synthetic q(Lwd/g;Ldg/C;Lwd/b;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lwd/g;->p(Ldg/C;Lwd/b;LZd/e;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final s(Lrd/a;Lorg/json/JSONObject;Lwd/b;Ljava/io/File;Ljava/lang/String;LZd/e;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p6, Lwd/g$j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, Lwd/g$j;

    .line 7
    .line 8
    iget v1, v0, Lwd/g$j;->f:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lwd/g$j;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lwd/g$j;

    .line 21
    .line 22
    invoke-direct {v0, p0, p6}, Lwd/g$j;-><init>(Lwd/g;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, Lwd/g$j;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lwd/g$j;->f:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lwd/g$j;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Ldg/C;

    .line 41
    .line 42
    iget-object p2, v0, Lwd/g$j;->b:Ljava/lang/Object;

    .line 43
    .line 44
    move-object p5, p2

    .line 45
    check-cast p5, Ljava/lang/String;

    .line 46
    .line 47
    iget-object p2, v0, Lwd/g$j;->a:Ljava/lang/Object;

    .line 48
    .line 49
    move-object p4, p2

    .line 50
    check-cast p4, Ljava/io/File;

    .line 51
    .line 52
    invoke-static {p6}, LTd/v;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_2
    invoke-static {p6}, LTd/v;->b(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object p6, p0, Lwd/g;->c:Lexpo/modules/updates/d;

    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    invoke-virtual {p0, p1, p2, p6, v2}, Lwd/g;->j(Lrd/a;Lorg/json/JSONObject;Lexpo/modules/updates/d;Z)Ldg/C;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p4, v0, Lwd/g$j;->a:Ljava/lang/Object;

    .line 75
    .line 76
    iput-object p5, v0, Lwd/g$j;->b:Ljava/lang/Object;

    .line 77
    .line 78
    iput-object p1, v0, Lwd/g$j;->c:Ljava/lang/Object;

    .line 79
    .line 80
    iput v3, v0, Lwd/g$j;->f:I

    .line 81
    .line 82
    invoke-direct {p0, p1, p3, v0}, Lwd/g;->p(Ldg/C;Lwd/b;LZd/e;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p6

    .line 86
    if-ne p6, v1, :cond_3

    .line 87
    .line 88
    return-object v1

    .line 89
    :cond_3
    :goto_1
    check-cast p6, Ldg/E;

    .line 90
    .line 91
    :try_start_0
    invoke-virtual {p6}, Ldg/E;->j()Ldg/F;

    .line 92
    .line 93
    .line 94
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    if-eqz p2, :cond_5

    .line 96
    .line 97
    :try_start_1
    invoke-virtual {p6}, Ldg/E;->J()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_4

    .line 102
    .line 103
    invoke-virtual {p2}, Ldg/F;->a()Ljava/io/InputStream;

    .line 104
    .line 105
    .line 106
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 107
    :try_start_2
    sget-object p3, Lexpo/modules/updates/g;->a:Lexpo/modules/updates/g;

    .line 108
    .line 109
    invoke-virtual {p3, p1, p4, p5}, Lexpo/modules/updates/g;->l(Ljava/io/InputStream;Ljava/io/File;Ljava/lang/String;)[B

    .line 110
    .line 111
    .line 112
    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 113
    const/4 p4, 0x0

    .line 114
    :try_start_3
    invoke-static {p1, p4}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 115
    .line 116
    .line 117
    :try_start_4
    invoke-static {p2, p4}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 118
    .line 119
    .line 120
    invoke-static {p6, p4}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    return-object p3

    .line 124
    :catchall_0
    move-exception p1

    .line 125
    goto :goto_3

    .line 126
    :catchall_1
    move-exception p1

    .line 127
    goto :goto_2

    .line 128
    :catchall_2
    move-exception p3

    .line 129
    :try_start_5
    throw p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 130
    :catchall_3
    move-exception p4

    .line 131
    :try_start_6
    invoke-static {p1, p3}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    throw p4

    .line 135
    :cond_4
    new-instance p1, Ljava/io/IOException;

    .line 136
    .line 137
    invoke-virtual {p2}, Ldg/F;->l()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p3

    .line 141
    invoke-direct {p1, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 145
    :goto_2
    :try_start_7
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 146
    :catchall_4
    move-exception p3

    .line 147
    :try_start_8
    invoke-static {p2, p1}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    throw p3

    .line 151
    :cond_5
    new-instance p2, Ljava/io/IOException;

    .line 152
    .line 153
    invoke-virtual {p1}, Ldg/C;->p()Ldg/u;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    new-instance p3, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 160
    .line 161
    .line 162
    const-string p4, "Fallback asset download response from "

    .line 163
    .line 164
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string p1, " had no body"

    .line 171
    .line 172
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 183
    :goto_3
    :try_start_9
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 184
    :catchall_5
    move-exception p2

    .line 185
    invoke-static {p6, p1}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    throw p2
.end method

.method private final t()Ldg/c;
    .locals 4

    .line 1
    new-instance v0, Ldg/c;

    .line 2
    .line 3
    invoke-direct {p0}, Lwd/g;->u()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/high16 v2, 0x3200000

    .line 8
    .line 9
    int-to-long v2, v2

    .line 10
    invoke-direct {v0, v1, v2, v3}, Ldg/c;-><init>(Ljava/io/File;J)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method private final u()Ljava/io/File;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lwd/g;->a:Ljava/io/File;

    .line 4
    .line 5
    const-string v2, "okhttp"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private final v(Lyd/p;Ljava/lang/String;)Lwd/w$a;
    .locals 4

    .line 1
    invoke-virtual {p1}, Lyd/p;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    iget-object v1, p0, Lwd/g;->c:Lexpo/modules/updates/d;

    .line 6
    .line 7
    invoke-virtual {v1}, Lexpo/modules/updates/d;->f()Lod/f;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    invoke-virtual {p1}, Lyd/p;->c()Lyd/o;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lyd/o;->a()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object v2, LDf/d;->b:Ljava/nio/charset/Charset;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, "getBytes(...)"

    .line 28
    .line 29
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p1, v2, p2}, Lod/f;->h(Ljava/lang/String;[BLjava/lang/String;)Lod/i;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lod/i;->b()Lod/j;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    sget-object v1, Lod/j;->b:Lod/j;

    .line 41
    .line 42
    if-eq p2, v1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1}, Lod/i;->b()Lod/j;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    sget-object v1, Lod/j;->c:Lod/j;

    .line 49
    .line 50
    if-eq p2, v1, :cond_3

    .line 51
    .line 52
    sget-object p2, Lwd/u;->b:Lwd/u$a;

    .line 53
    .line 54
    invoke-virtual {p2, v0}, Lwd/u$a;->a(Ljava/lang/String;)Lwd/u;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-virtual {p1}, Lod/i;->a()Lod/g;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    invoke-virtual {p1}, Lod/g;->a()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {p2}, Lwd/u;->a()Lwd/t;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    if-eqz v2, :cond_0

    .line 73
    .line 74
    invoke-virtual {v2}, Lwd/t;->a()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    goto :goto_0

    .line 79
    :catch_0
    move-exception p1

    .line 80
    goto :goto_2

    .line 81
    :cond_0
    const/4 v2, 0x0

    .line 82
    :goto_0
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_1

    .line 87
    .line 88
    invoke-virtual {p1}, Lod/g;->b()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p2}, Lwd/u;->a()Lwd/t;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-virtual {p2}, Lwd/t;->b()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_1

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    new-instance p1, Ljava/security/cert/CertificateException;

    .line 108
    .line 109
    const-string p2, "Code signing certificate project ID or scope key does not match project ID or scope key in response part"

    .line 110
    .line 111
    invoke-direct {p1, p2}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw p1

    .line 115
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 116
    .line 117
    const-string p2, "Incorrect signature"

    .line 118
    .line 119
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    :cond_3
    :goto_1
    new-instance p1, Lwd/w$a;

    .line 124
    .line 125
    sget-object p2, Lwd/u;->b:Lwd/u$a;

    .line 126
    .line 127
    invoke-virtual {p2, v0}, Lwd/u$a;->a(Ljava/lang/String;)Lwd/u;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    invoke-direct {p1, p2}, Lwd/w$a;-><init>(Lwd/u;)V

    .line 132
    .line 133
    .line 134
    return-object p1

    .line 135
    :goto_2
    iget-object p2, p0, Lwd/g;->d:Lxd/g;

    .line 136
    .line 137
    sget-object v0, Lxd/b;->g:Lxd/b;

    .line 138
    .line 139
    const-string v1, "Code signing verification failed for directive"

    .line 140
    .line 141
    invoke-virtual {p2, v1, p1, v0}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 142
    .line 143
    .line 144
    new-instance p2, Ljava/io/IOException;

    .line 145
    .line 146
    invoke-direct {p2, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    throw p2
.end method

.method private final w(Lyd/p;Lorg/json/JSONObject;Ljava/lang/String;)Lwd/w$b;
    .locals 9

    .line 1
    invoke-virtual {p1}, Lyd/p;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    new-instance v2, Lorg/json/JSONObject;

    .line 6
    .line 7
    invoke-virtual {p1}, Lyd/p;->a()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lyd/p;->b()Lyd/n;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {p1}, Lyd/p;->c()Lyd/o;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    iget-object v7, p0, Lwd/g;->c:Lexpo/modules/updates/d;

    .line 23
    .line 24
    iget-object v8, p0, Lwd/g;->d:Lxd/g;

    .line 25
    .line 26
    move-object v0, p0

    .line 27
    move-object v5, p2

    .line 28
    move-object v6, p3

    .line 29
    invoke-direct/range {v0 .. v8}, Lwd/g;->i(Ljava/lang/String;Lorg/json/JSONObject;Lyd/n;Lyd/o;Lorg/json/JSONObject;Ljava/lang/String;Lexpo/modules/updates/d;Lxd/g;)Lwd/w$b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method private final x(Ldg/E;Ldg/F;Lyd/n;)Lwd/v;
    .locals 9

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    invoke-virtual {p1, v0, v1}, Ldg/E;->h0(J)Ldg/F;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ldg/F;->b()[B

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    array-length p1, p1

    .line 12
    const/4 v0, 0x0

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    move-object p2, v0

    .line 16
    move-object v1, p2

    .line 17
    move-object v2, v1

    .line 18
    move-object v3, v2

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :try_start_0
    new-instance p1, Ldg/z;

    .line 21
    .line 22
    invoke-direct {p1, p2}, Ldg/z;-><init>(Ldg/F;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 23
    .line 24
    .line 25
    move-object p2, v0

    .line 26
    move-object v1, p2

    .line 27
    move-object v2, v1

    .line 28
    move-object v3, v2

    .line 29
    :goto_0
    :try_start_1
    invoke-virtual {p1}, Ldg/z;->k()Ldg/z$b;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    if-nez v4, :cond_9

    .line 34
    .line 35
    sget-object v4, LTd/L;->a:LTd/L;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    :try_start_2
    invoke-static {p1, v0}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 38
    .line 39
    .line 40
    :goto_1
    if-eqz v1, :cond_1

    .line 41
    .line 42
    :try_start_3
    new-instance p1, Lorg/json/JSONObject;

    .line 43
    .line 44
    invoke-direct {p1, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :catch_0
    move-exception p1

    .line 49
    iget-object p2, p0, Lwd/g;->d:Lxd/g;

    .line 50
    .line 51
    sget-object p3, Lxd/b;->h:Lxd/b;

    .line 52
    .line 53
    const-string v0, "Failed to parse multipart remote update extensions part"

    .line 54
    .line 55
    invoke-virtual {p2, v0, p1, p3}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 56
    .line 57
    .line 58
    new-instance p2, Ljava/io/IOException;

    .line 59
    .line 60
    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    throw p2

    .line 64
    :cond_1
    move-object p1, v0

    .line 65
    :goto_2
    iget-object v1, p0, Lwd/g;->c:Lexpo/modules/updates/d;

    .line 66
    .line 67
    invoke-virtual {v1}, Lexpo/modules/updates/d;->i()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    if-eqz p2, :cond_2

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 77
    .line 78
    const-string p2, "Multipart response missing manifest part. Manifest is required in version 0 of the expo-updates protocol. This may be due to the response being for a different protocol version."

    .line 79
    .line 80
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iget-object p2, p0, Lwd/g;->d:Lxd/g;

    .line 84
    .line 85
    sget-object p3, Lxd/b;->h:Lxd/b;

    .line 86
    .line 87
    const-string v0, "Invalid update response"

    .line 88
    .line 89
    invoke-virtual {p2, v0, p1, p3}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 90
    .line 91
    .line 92
    new-instance p2, Ljava/io/IOException;

    .line 93
    .line 94
    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    throw p2

    .line 98
    :cond_3
    :goto_3
    const-string v1, "expo-signature"

    .line 99
    .line 100
    if-eqz p2, :cond_4

    .line 101
    .line 102
    new-instance v4, Lyd/p;

    .line 103
    .line 104
    new-instance v5, Lyd/o;

    .line 105
    .line 106
    invoke-virtual {p2}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    check-cast v6, Ldg/t;

    .line 111
    .line 112
    invoke-virtual {v6, v1}, Ldg/t;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-direct {v5, v6}, Lyd/o;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    check-cast p2, Ljava/lang/String;

    .line 124
    .line 125
    invoke-direct {v4, p3, v5, p2}, Lyd/p;-><init>(Lyd/n;Lyd/o;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_4
    move-object v4, v0

    .line 130
    :goto_4
    iget-object p2, p0, Lwd/g;->c:Lexpo/modules/updates/d;

    .line 131
    .line 132
    invoke-virtual {p2}, Lexpo/modules/updates/d;->i()Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-eqz p2, :cond_6

    .line 137
    .line 138
    :cond_5
    move-object p2, v0

    .line 139
    goto :goto_5

    .line 140
    :cond_6
    if-eqz v3, :cond_5

    .line 141
    .line 142
    new-instance p2, Lyd/p;

    .line 143
    .line 144
    new-instance v5, Lyd/o;

    .line 145
    .line 146
    invoke-virtual {v3}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    check-cast v6, Ldg/t;

    .line 151
    .line 152
    invoke-virtual {v6, v1}, Ldg/t;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-direct {v5, v1}, Lyd/o;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    check-cast v1, Ljava/lang/String;

    .line 164
    .line 165
    invoke-direct {p2, p3, v5, v1}, Lyd/p;-><init>(Lyd/n;Lyd/o;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    :goto_5
    if-eqz v4, :cond_7

    .line 169
    .line 170
    invoke-direct {p0, v4, p1, v2}, Lwd/g;->w(Lyd/p;Lorg/json/JSONObject;Ljava/lang/String;)Lwd/w$b;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    goto :goto_6

    .line 175
    :cond_7
    move-object p1, v0

    .line 176
    :goto_6
    if-eqz p2, :cond_8

    .line 177
    .line 178
    invoke-direct {p0, p2, v2}, Lwd/g;->v(Lyd/p;Ljava/lang/String;)Lwd/w$a;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    :cond_8
    new-instance p2, Lwd/v;

    .line 183
    .line 184
    invoke-direct {p2, p3, p1, v0}, Lwd/v;-><init>(Lyd/n;Lwd/w$b;Lwd/w$a;)V

    .line 185
    .line 186
    .line 187
    return-object p2

    .line 188
    :catch_1
    move-exception p1

    .line 189
    goto/16 :goto_a

    .line 190
    .line 191
    :catchall_0
    move-exception p2

    .line 192
    goto/16 :goto_9

    .line 193
    .line 194
    :cond_9
    :try_start_4
    invoke-virtual {v4}, Ldg/z$b;->b()Ldg/t;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    invoke-virtual {v4}, Ldg/z$b;->a()Ltg/j;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    const-string v7, "content-disposition"

    .line 203
    .line 204
    invoke-virtual {v5, v7}, Ldg/t;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    if-eqz v7, :cond_e

    .line 209
    .line 210
    sget-object v8, Lexpo/modules/updates/g;->a:Lexpo/modules/updates/g;

    .line 211
    .line 212
    invoke-virtual {v8, v7}, Lexpo/modules/updates/g;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    if-eqz v7, :cond_e

    .line 217
    .line 218
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 219
    .line 220
    .line 221
    move-result v8

    .line 222
    sparse-switch v8, :sswitch_data_0

    .line 223
    .line 224
    .line 225
    goto :goto_7

    .line 226
    :sswitch_0
    const-string v8, "manifest"

    .line 227
    .line 228
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v7

    .line 232
    if-nez v7, :cond_a

    .line 233
    .line 234
    goto :goto_7

    .line 235
    :cond_a
    new-instance p2, Lkotlin/Pair;

    .line 236
    .line 237
    invoke-interface {v6}, Ltg/j;->M1()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    invoke-direct {p2, v6, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    goto :goto_7

    .line 245
    :catchall_1
    move-exception p2

    .line 246
    goto :goto_8

    .line 247
    :sswitch_1
    const-string v8, "directive"

    .line 248
    .line 249
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v7

    .line 253
    if-nez v7, :cond_b

    .line 254
    .line 255
    goto :goto_7

    .line 256
    :cond_b
    new-instance v3, Lkotlin/Pair;

    .line 257
    .line 258
    invoke-interface {v6}, Ltg/j;->M1()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v6

    .line 262
    invoke-direct {v3, v6, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    goto :goto_7

    .line 266
    :sswitch_2
    const-string v5, "certificate_chain"

    .line 267
    .line 268
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v5

    .line 272
    if-nez v5, :cond_c

    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_c
    invoke-interface {v6}, Ltg/j;->M1()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    goto :goto_7

    .line 280
    :sswitch_3
    const-string v5, "extensions"

    .line 281
    .line 282
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v5

    .line 286
    if-nez v5, :cond_d

    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_d
    invoke-interface {v6}, Ltg/j;->M1()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    :cond_e
    :goto_7
    sget-object v5, LTd/L;->a:LTd/L;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 294
    .line 295
    :try_start_5
    invoke-static {v4, v0}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 296
    .line 297
    .line 298
    goto/16 :goto_0

    .line 299
    .line 300
    :goto_8
    :try_start_6
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 301
    :catchall_2
    move-exception p3

    .line 302
    :try_start_7
    invoke-static {v4, p2}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 303
    .line 304
    .line 305
    throw p3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 306
    :goto_9
    :try_start_8
    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 307
    :catchall_3
    move-exception p3

    .line 308
    :try_start_9
    invoke-static {p1, p2}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 309
    .line 310
    .line 311
    throw p3
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    .line 312
    :goto_a
    iget-object p2, p0, Lwd/g;->d:Lxd/g;

    .line 313
    .line 314
    sget-object p3, Lxd/b;->h:Lxd/b;

    .line 315
    .line 316
    const-string v0, "Error while reading multipart remote update response"

    .line 317
    .line 318
    invoke-virtual {p2, v0, p1, p3}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 319
    .line 320
    .line 321
    new-instance p2, Ljava/io/IOException;

    .line 322
    .line 323
    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 324
    .line 325
    .line 326
    throw p2

    .line 327
    :sswitch_data_0
    .sparse-switch
        -0x6bd993ec -> :sswitch_3
        -0x3e4851e7 -> :sswitch_2
        -0x395ff7b1 -> :sswitch_1
        0x7c92e2f -> :sswitch_0
    .end sparse-switch
.end method

.method private final y(Ldg/E;)Lwd/g$e;
    .locals 10

    .line 1
    const-string v0, "im"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    invoke-static {p1, v0, v1, v2, v1}, Ldg/E;->D(Ldg/E;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz v3, :cond_3

    .line 11
    .line 12
    const/4 v9, 0x1

    .line 13
    new-array v4, v9, [C

    .line 14
    .line 15
    const/16 v5, 0x2c

    .line 16
    .line 17
    aput-char v5, v4, v0

    .line 18
    .line 19
    const/4 v7, 0x6

    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    invoke-static/range {v3 .. v8}, LDf/r;->M0(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-eqz v3, :cond_3

    .line 28
    .line 29
    new-instance v4, Ljava/util/ArrayList;

    .line 30
    .line 31
    const/16 v5, 0xa

    .line 32
    .line 33
    invoke-static {v3, v5}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_0

    .line 49
    .line 50
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    check-cast v5, Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v5}, LDf/r;->k1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-eqz v4, :cond_3

    .line 84
    .line 85
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    check-cast v4, Ljava/lang/String;

    .line 90
    .line 91
    const-string v5, "bsdiff"

    .line 92
    .line 93
    invoke-static {v4, v5, v9}, LDf/r;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-eqz v4, :cond_2

    .line 98
    .line 99
    move v0, v9

    .line 100
    :cond_3
    :goto_1
    invoke-virtual {p1}, Ldg/E;->o()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-nez v0, :cond_4

    .line 105
    .line 106
    const/16 v4, 0xe2

    .line 107
    .line 108
    if-eq v3, v4, :cond_4

    .line 109
    .line 110
    return-object v1

    .line 111
    :cond_4
    new-instance v4, Lwd/g$e;

    .line 112
    .line 113
    const-string v5, "expo-base-update-id"

    .line 114
    .line 115
    invoke-static {p1, v5, v1, v2, v1}, Ldg/E;->D(Ldg/E;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-direct {v4, v0, v3, p1}, Lwd/g$e;-><init>(ZILjava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-object v4
.end method


# virtual methods
.method public final A(Lrd/a;Ldg/F;Ljava/io/File;Lrd/d;)Lwd/g$d;
    .locals 1

    .line 1
    const-string v0, "asset"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "responseBody"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "updatesDirectory"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "launchedUpdate"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :try_start_0
    invoke-direct {p0, p1, p3, p4}, Lwd/g;->B(Lrd/a;Ljava/io/File;Lrd/d;)Lwd/g$d;

    .line 22
    .line 23
    .line 24
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    return-object p1

    .line 26
    :catch_0
    move-exception p1

    .line 27
    invoke-virtual {p2}, Ldg/F;->close()V

    .line 28
    .line 29
    .line 30
    instance-of p2, p1, Ljava/io/IOException;

    .line 31
    .line 32
    if-eqz p2, :cond_0

    .line 33
    .line 34
    throw p1

    .line 35
    :cond_0
    new-instance p2, Ljava/io/IOException;

    .line 36
    .line 37
    const-string p3, "Failed to prepare asset for diff"

    .line 38
    .line 39
    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw p2
.end method

.method public final f(Ljava/io/File;Ldg/F;Ljava/io/File;Ljava/lang/String;Lrd/a;Ljava/lang/String;)[B
    .locals 7

    .line 1
    const-string v0, "getAbsolutePath(...)"

    .line 2
    .line 3
    const-string v1, "baseFile"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "diffBody"

    .line 9
    .line 10
    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "destination"

    .line 14
    .line 15
    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "asset"

    .line 19
    .line 20
    invoke-static {p5, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Ljava/io/File;

    .line 24
    .line 25
    invoke-virtual {p3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    new-instance v3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v2, ".patch"

    .line 38
    .line 39
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance v2, Ljava/io/File;

    .line 50
    .line 51
    invoke-virtual {p3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    new-instance v4, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v3, ".patched"

    .line 64
    .line 65
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    if-eqz v4, :cond_0

    .line 81
    .line 82
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :catchall_0
    move-exception p1

    .line 87
    goto/16 :goto_3

    .line 88
    .line 89
    :catch_0
    move-exception p1

    .line 90
    goto/16 :goto_2

    .line 91
    .line 92
    :cond_0
    :goto_0
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    if-eqz v4, :cond_1

    .line 97
    .line 98
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    .line 99
    .line 100
    .line 101
    :cond_1
    invoke-virtual {p2}, Ldg/F;->a()Ljava/io/InputStream;

    .line 102
    .line 103
    .line 104
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    :try_start_1
    new-instance v4, Ljava/io/FileOutputStream;

    .line 106
    .line 107
    invoke-direct {v4, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 108
    .line 109
    .line 110
    const/4 v5, 0x0

    .line 111
    const/4 v6, 0x2

    .line 112
    :try_start_2
    invoke-static {p2, v4, v5, v6, v3}, Lfe/b;->b(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 113
    .line 114
    .line 115
    :try_start_3
    invoke-static {v4, v3}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 116
    .line 117
    .line 118
    :try_start_4
    invoke-static {p2, v3}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    iget-object p2, p0, Lwd/g;->g:Lie/o;

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {p2, p1, v4, v5}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    check-cast p1, Ljava/lang/Number;

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-nez p1, :cond_4

    .line 155
    .line 156
    new-instance p1, Ljava/io/FileInputStream;

    .line 157
    .line 158
    invoke-direct {p1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 159
    .line 160
    .line 161
    :try_start_5
    sget-object p2, Lexpo/modules/updates/g;->a:Lexpo/modules/updates/g;

    .line 162
    .line 163
    invoke-virtual {p2, p1, p3, p4}, Lexpo/modules/updates/g;->l(Ljava/io/InputStream;Ljava/io/File;Ljava/lang/String;)[B

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    iget-object p3, p0, Lwd/g;->d:Lxd/g;

    .line 168
    .line 169
    invoke-virtual {p5}, Lrd/a;->j()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p4

    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    const-string v4, "Applied diff for asset "

    .line 179
    .line 180
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p4

    .line 190
    sget-object v0, Lxd/b;->b:Lxd/b;

    .line 191
    .line 192
    invoke-virtual {p5}, Lrd/a;->j()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    invoke-virtual {p3, p4, v0, p6, v4}, Lxd/g;->j(Ljava/lang/String;Lxd/b;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 197
    .line 198
    .line 199
    :try_start_6
    invoke-static {p1, v3}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    if-eqz p1, :cond_2

    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 209
    .line 210
    .line 211
    :cond_2
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    if-eqz p1, :cond_3

    .line 216
    .line 217
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 218
    .line 219
    .line 220
    :cond_3
    return-object p2

    .line 221
    :catchall_1
    move-exception p2

    .line 222
    :try_start_7
    throw p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 223
    :catchall_2
    move-exception p3

    .line 224
    :try_start_8
    invoke-static {p1, p2}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 225
    .line 226
    .line 227
    throw p3

    .line 228
    :cond_4
    new-instance p2, Ljava/io/IOException;

    .line 229
    .line 230
    new-instance p3, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 233
    .line 234
    .line 235
    const-string p4, "BSPatch exited with code "

    .line 236
    .line 237
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    const-string p1, " while applying patch"

    .line 244
    .line 245
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw p2
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 256
    :catchall_3
    move-exception p1

    .line 257
    goto :goto_1

    .line 258
    :catchall_4
    move-exception p1

    .line 259
    :try_start_9
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 260
    :catchall_5
    move-exception p3

    .line 261
    :try_start_a
    invoke-static {v4, p1}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 262
    .line 263
    .line 264
    throw p3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 265
    :goto_1
    :try_start_b
    throw p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 266
    :catchall_6
    move-exception p3

    .line 267
    :try_start_c
    invoke-static {p2, p1}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 268
    .line 269
    .line 270
    throw p3
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 271
    :goto_2
    :try_start_d
    instance-of p2, p1, Ljava/io/IOException;

    .line 272
    .line 273
    if-eqz p2, :cond_5

    .line 274
    .line 275
    move-object v3, p1

    .line 276
    check-cast v3, Ljava/io/IOException;

    .line 277
    .line 278
    :cond_5
    if-nez v3, :cond_6

    .line 279
    .line 280
    new-instance v3, Ljava/io/IOException;

    .line 281
    .line 282
    const-string p2, "Failed to apply patch"

    .line 283
    .line 284
    invoke-direct {v3, p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 285
    .line 286
    .line 287
    :cond_6
    iget-object p1, p0, Lwd/g;->d:Lxd/g;

    .line 288
    .line 289
    invoke-virtual {p5}, Lrd/a;->j()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p2

    .line 293
    new-instance p3, Ljava/lang/StringBuilder;

    .line 294
    .line 295
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 296
    .line 297
    .line 298
    const-string p4, "Failed to apply patch for asset "

    .line 299
    .line 300
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object p2

    .line 310
    sget-object p3, Lxd/b;->i:Lxd/b;

    .line 311
    .line 312
    invoke-virtual {p1, p2, v3, p3}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 313
    .line 314
    .line 315
    throw v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 316
    :goto_3
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 317
    .line 318
    .line 319
    move-result p2

    .line 320
    if-eqz p2, :cond_7

    .line 321
    .line 322
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 323
    .line 324
    .line 325
    :cond_7
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 326
    .line 327
    .line 328
    move-result p2

    .line 329
    if-eqz p2, :cond_8

    .line 330
    .line 331
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 332
    .line 333
    .line 334
    :cond_8
    throw p1
.end method

.method public final j(Lrd/a;Lorg/json/JSONObject;Lexpo/modules/updates/d;Z)Ldg/C;
    .locals 3

    .line 1
    const-string v0, "assetEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "extraHeaders"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "configuration"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ldg/C$a;

    .line 17
    .line 18
    invoke-direct {v0}, Ldg/C$a;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lrd/a;->s()Landroid/net/Uri;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "toString(...)"

    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ldg/C$a;->m(Ljava/lang/String;)Ldg/C$a;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p1}, Lrd/a;->d()Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-direct {p0, v0, v1}, Lwd/g;->e(Ldg/C$a;Lorg/json/JSONObject;)Ldg/C$a;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-direct {p0, v0, p2}, Lwd/g;->e(Ldg/C$a;Lorg/json/JSONObject;)Ldg/C$a;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const-string v1, "Expo-Platform"

    .line 54
    .line 55
    const-string v2, "android"

    .line 56
    .line 57
    invoke-virtual {v0, v1, v2}, Ldg/C$a;->e(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "Expo-Protocol-Version"

    .line 62
    .line 63
    const-string v2, "1"

    .line 64
    .line 65
    invoke-virtual {v0, v1, v2}, Ldg/C$a;->e(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-string v1, "Expo-API-Version"

    .line 70
    .line 71
    invoke-virtual {v0, v1, v2}, Ldg/C$a;->e(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-string v1, "Expo-Updates-Environment"

    .line 76
    .line 77
    const-string v2, "BARE"

    .line 78
    .line 79
    invoke-virtual {v0, v1, v2}, Ldg/C$a;->e(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v1, "EAS-Client-ID"

    .line 84
    .line 85
    iget-object v2, p0, Lwd/g;->b:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v0, v1, v2}, Ldg/C$a;->e(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-eqz p4, :cond_0

    .line 92
    .line 93
    invoke-virtual {p1}, Lrd/a;->t()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_0

    .line 98
    .line 99
    invoke-virtual {p3}, Lexpo/modules/updates/d;->h()Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_0

    .line 104
    .line 105
    const/4 p1, 0x1

    .line 106
    goto :goto_0

    .line 107
    :cond_0
    const/4 p1, 0x0

    .line 108
    :goto_0
    const-string p4, "Expo-Current-Update-ID"

    .line 109
    .line 110
    const-string v1, ""

    .line 111
    .line 112
    invoke-virtual {p2, p4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    const-string p4, "Expo-Requested-Update-ID"

    .line 116
    .line 117
    invoke-virtual {p2, p4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    const-string p2, "Accept"

    .line 121
    .line 122
    const-string p4, "*/*"

    .line 123
    .line 124
    invoke-virtual {v0, p2, p4}, Ldg/C$a;->e(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 125
    .line 126
    .line 127
    const-string p2, "A-IM"

    .line 128
    .line 129
    if-eqz p1, :cond_1

    .line 130
    .line 131
    const-string p1, "bsdiff"

    .line 132
    .line 133
    invoke-virtual {v0, p2, p1}, Ldg/C$a;->e(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_1
    invoke-virtual {v0, p2}, Ldg/C$a;->i(Ljava/lang/String;)Ldg/C$a;

    .line 138
    .line 139
    .line 140
    :goto_1
    invoke-virtual {p3}, Lexpo/modules/updates/d;->p()Ljava/util/Map;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result p2

    .line 156
    if-eqz p2, :cond_2

    .line 157
    .line 158
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    check-cast p2, Ljava/util/Map$Entry;

    .line 163
    .line 164
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p3

    .line 168
    check-cast p3, Ljava/lang/String;

    .line 169
    .line 170
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    check-cast p2, Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {v0, p3, p2}, Ldg/C$a;->e(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_2
    invoke-virtual {v0}, Ldg/C$a;->b()Ldg/C;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    return-object p1
.end method

.method public final k(Lorg/json/JSONObject;Lexpo/modules/updates/d;Lxd/g;)Ldg/C;
    .locals 3

    .line 1
    const-string v0, "configuration"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "logger"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ldg/C$a;

    .line 12
    .line 13
    invoke-direct {v0}, Ldg/C$a;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Lexpo/modules/updates/d;->t()Landroid/net/Uri;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "toString(...)"

    .line 25
    .line 26
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ldg/C$a;->m(Ljava/lang/String;)Ldg/C$a;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-direct {p0, v0, p1}, Lwd/g;->e(Ldg/C$a;Lorg/json/JSONObject;)Ldg/C$a;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string v0, "Accept"

    .line 38
    .line 39
    const-string v1, "multipart/mixed,application/expo+json,application/json"

    .line 40
    .line 41
    invoke-virtual {p1, v0, v1}, Ldg/C$a;->e(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v0, "Expo-Platform"

    .line 46
    .line 47
    const-string v1, "android"

    .line 48
    .line 49
    invoke-virtual {p1, v0, v1}, Ldg/C$a;->e(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v0, "Expo-Protocol-Version"

    .line 54
    .line 55
    const-string v1, "1"

    .line 56
    .line 57
    invoke-virtual {p1, v0, v1}, Ldg/C$a;->e(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string v0, "Expo-API-Version"

    .line 62
    .line 63
    invoke-virtual {p1, v0, v1}, Ldg/C$a;->e(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-string v0, "Expo-Updates-Environment"

    .line 68
    .line 69
    const-string v1, "BARE"

    .line 70
    .line 71
    invoke-virtual {p1, v0, v1}, Ldg/C$a;->e(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const-string v0, "Expo-JSON-Error"

    .line 76
    .line 77
    const-string v1, "true"

    .line 78
    .line 79
    invoke-virtual {p1, v0, v1}, Ldg/C$a;->e(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const-string v0, "EAS-Client-ID"

    .line 84
    .line 85
    iget-object v1, p0, Lwd/g;->b:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {p1, v0, v1}, Ldg/C$a;->e(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p2}, Lexpo/modules/updates/d;->r()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    if-eqz v0, :cond_1

    .line 96
    .line 97
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-nez v1, :cond_0

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    const-string v1, "Expo-Runtime-Version"

    .line 105
    .line 106
    invoke-virtual {p1, v1, v0}, Ldg/C$a;->e(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 107
    .line 108
    .line 109
    :cond_1
    :goto_0
    sget-object v0, Lvd/c;->h:Lvd/c$b;

    .line 110
    .line 111
    iget-object v1, p0, Lwd/g;->a:Ljava/io/File;

    .line 112
    .line 113
    invoke-virtual {v0, v1, p3}, Lvd/c$b;->a(Ljava/io/File;Lxd/g;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p3

    .line 117
    if-eqz p3, :cond_2

    .line 118
    .line 119
    const/16 v0, 0x400

    .line 120
    .line 121
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    const/4 v1, 0x0

    .line 130
    invoke-virtual {p3, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p3

    .line 134
    const-string v0, "substring(...)"

    .line 135
    .line 136
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    const-string v0, "Expo-Fatal-Error"

    .line 140
    .line 141
    invoke-virtual {p1, v0, p3}, Ldg/C$a;->e(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 142
    .line 143
    .line 144
    :cond_2
    invoke-virtual {p2}, Lexpo/modules/updates/d;->p()Ljava/util/Map;

    .line 145
    .line 146
    .line 147
    move-result-object p3

    .line 148
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 149
    .line 150
    .line 151
    move-result-object p3

    .line 152
    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object p3

    .line 156
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_3

    .line 161
    .line 162
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    check-cast v0, Ljava/util/Map$Entry;

    .line 167
    .line 168
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    check-cast v1, Ljava/lang/String;

    .line 173
    .line 174
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, Ljava/lang/String;

    .line 179
    .line 180
    invoke-virtual {p1, v1, v0}, Ldg/C$a;->e(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 181
    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_3
    invoke-virtual {p2}, Lexpo/modules/updates/d;->f()Lod/f;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    if-eqz p2, :cond_4

    .line 189
    .line 190
    const-string p3, "expo-expect-signature"

    .line 191
    .line 192
    invoke-virtual {p2}, Lod/f;->d()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    invoke-virtual {p1, p3, p2}, Ldg/C$a;->e(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 197
    .line 198
    .line 199
    :cond_4
    invoke-virtual {p1}, Ldg/C$a;->b()Ldg/C;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    return-object p1
.end method

.method public final l(Lrd/a;Ljava/io/File;Lorg/json/JSONObject;Lrd/d;Lrd/d;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p6

    .line 6
    .line 7
    move-object/from16 v3, p7

    .line 8
    .line 9
    instance-of v4, v3, Lwd/g$f;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, Lwd/g$f;

    .line 15
    .line 16
    iget v5, v4, Lwd/g$f;->e:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lwd/g$f;->e:I

    .line 26
    .line 27
    :goto_0
    move-object v12, v4

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v4, Lwd/g$f;

    .line 30
    .line 31
    invoke-direct {v4, v1, v3}, Lwd/g$f;-><init>(Lwd/g;LZd/e;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object v3, v12, Lwd/g$f;->c:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v13

    .line 41
    iget v4, v12, Lwd/g$f;->e:I

    .line 42
    .line 43
    const-string v14, "Failed to download asset "

    .line 44
    .line 45
    const/4 v15, 0x1

    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    if-ne v4, v15, :cond_1

    .line 49
    .line 50
    iget-object v0, v12, Lwd/g$f;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Ljava/lang/String;

    .line 53
    .line 54
    iget-object v2, v12, Lwd/g$f;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Lrd/a;

    .line 57
    .line 58
    :try_start_0
    invoke-static {v3}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    goto/16 :goto_5

    .line 62
    .line 63
    :catch_0
    move-exception v0

    .line 64
    goto/16 :goto_6

    .line 65
    .line 66
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v0

    .line 74
    :cond_2
    invoke-static {v3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Lrd/a;->s()Landroid/net/Uri;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    if-eqz v3, :cond_7

    .line 82
    .line 83
    sget-object v3, Lexpo/modules/updates/g;->a:Lexpo/modules/updates/g;

    .line 84
    .line 85
    invoke-virtual {v3, v2}, Lexpo/modules/updates/g;->c(Lrd/a;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    new-instance v6, Ljava/io/File;

    .line 90
    .line 91
    move-object/from16 v7, p2

    .line 92
    .line 93
    invoke-direct {v6, v7, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    const/4 v5, 0x0

    .line 101
    if-eqz v4, :cond_3

    .line 102
    .line 103
    invoke-virtual {v2, v3}, Lrd/a;->F(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    new-instance v0, Lwd/g$a;

    .line 107
    .line 108
    invoke-direct {v0, v2, v5}, Lwd/g$a;-><init>(Lrd/a;Z)V

    .line 109
    .line 110
    .line 111
    return-object v0

    .line 112
    :cond_3
    invoke-virtual {v2}, Lrd/a;->t()Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-eqz v4, :cond_4

    .line 117
    .line 118
    if-eqz p4, :cond_4

    .line 119
    .line 120
    if-eqz p5, :cond_4

    .line 121
    .line 122
    invoke-virtual/range {p4 .. p4}, Lrd/d;->d()Ljava/util/UUID;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-virtual/range {p5 .. p5}, Lrd/d;->d()Ljava/util/UUID;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    invoke-static {v4, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-nez v4, :cond_4

    .line 135
    .line 136
    move v9, v15

    .line 137
    goto :goto_2

    .line 138
    :cond_4
    move v9, v5

    .line 139
    :goto_2
    :try_start_1
    iget-object v4, v1, Lwd/g;->c:Lexpo/modules/updates/d;

    .line 140
    .line 141
    move-object/from16 v5, p3

    .line 142
    .line 143
    invoke-virtual {v1, v2, v5, v4, v9}, Lwd/g;->j(Lrd/a;Lorg/json/JSONObject;Lexpo/modules/updates/d;Z)Ldg/C;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-virtual {v2}, Lrd/a;->c()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 151
    if-eqz v0, :cond_5

    .line 152
    .line 153
    :try_start_2
    new-instance v8, Lwd/f;

    .line 154
    .line 155
    invoke-direct {v8, v0}, Lwd/f;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 156
    .line 157
    .line 158
    new-instance v0, Lwd/h;

    .line 159
    .line 160
    invoke-direct {v0, v8}, Lwd/h;-><init>(Lkotlin/jvm/functions/Function1;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 161
    .line 162
    .line 163
    :goto_3
    move-object v8, v0

    .line 164
    goto :goto_4

    .line 165
    :cond_5
    const/4 v0, 0x0

    .line 166
    goto :goto_3

    .line 167
    :goto_4
    :try_start_3
    iput-object v2, v12, Lwd/g$f;->a:Ljava/lang/Object;

    .line 168
    .line 169
    iput-object v3, v12, Lwd/g$f;->b:Ljava/lang/Object;

    .line 170
    .line 171
    iput v15, v12, Lwd/g$f;->e:I

    .line 172
    .line 173
    move-object/from16 v10, p4

    .line 174
    .line 175
    move-object/from16 v11, p5

    .line 176
    .line 177
    move-object v0, v3

    .line 178
    move-object/from16 v3, p3

    .line 179
    .line 180
    invoke-virtual/range {v1 .. v12}, Lwd/g;->o(Lrd/a;Lorg/json/JSONObject;Ldg/C;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Lwd/b;ZLrd/d;Lrd/d;LZd/e;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 184
    if-ne v3, v13, :cond_6

    .line 185
    .line 186
    return-object v13

    .line 187
    :cond_6
    move-object/from16 v2, p1

    .line 188
    .line 189
    :goto_5
    :try_start_4
    check-cast v3, Lwd/g$c;

    .line 190
    .line 191
    new-instance v4, Ljava/util/Date;

    .line 192
    .line 193
    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v4}, Lrd/a;->u(Ljava/util/Date;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v0}, Lrd/a;->F(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v3}, Lwd/g$c;->a()[B

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v2, v0}, Lrd/a;->y([B)V

    .line 207
    .line 208
    .line 209
    new-instance v0, Lwd/g$a;

    .line 210
    .line 211
    invoke-direct {v0, v2, v15}, Lwd/g$a;-><init>(Lrd/a;Z)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 212
    .line 213
    .line 214
    return-object v0

    .line 215
    :catch_1
    move-exception v0

    .line 216
    move-object/from16 v2, p1

    .line 217
    .line 218
    :goto_6
    invoke-virtual {v2}, Lrd/a;->j()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    new-instance v3, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    iget-object v3, v1, Lwd/g;->d:Lxd/g;

    .line 238
    .line 239
    sget-object v4, Lxd/b;->i:Lxd/b;

    .line 240
    .line 241
    invoke-virtual {v3, v2, v0, v4}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 242
    .line 243
    .line 244
    new-instance v3, Ljava/io/IOException;

    .line 245
    .line 246
    invoke-direct {v3, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 247
    .line 248
    .line 249
    throw v3

    .line 250
    :cond_7
    invoke-virtual/range {p1 .. p1}, Lrd/a;->j()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    new-instance v2, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    new-instance v2, Ljava/lang/Exception;

    .line 270
    .line 271
    const-string v3, "Asset missing URL"

    .line 272
    .line 273
    invoke-direct {v2, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    iget-object v3, v1, Lwd/g;->d:Lxd/g;

    .line 277
    .line 278
    sget-object v4, Lxd/b;->i:Lxd/b;

    .line 279
    .line 280
    invoke-virtual {v3, v0, v2, v4}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 281
    .line 282
    .line 283
    new-instance v3, Ljava/io/IOException;

    .line 284
    .line 285
    invoke-direct {v3, v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 286
    .line 287
    .line 288
    throw v3
.end method

.method public final o(Lrd/a;Lorg/json/JSONObject;Ldg/C;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Lwd/b;ZLrd/d;Lrd/d;LZd/e;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p3

    .line 4
    .line 5
    move-object/from16 v0, p7

    .line 6
    .line 7
    move-object/from16 v3, p11

    .line 8
    .line 9
    instance-of v4, v3, Lwd/g$g;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, Lwd/g$g;

    .line 15
    .line 16
    iget v5, v4, Lwd/g$g;->m:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lwd/g$g;->m:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Lwd/g$g;

    .line 29
    .line 30
    invoke-direct {v4, v1, v3}, Lwd/g$g;-><init>(Lwd/g;LZd/e;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v3, v4, Lwd/g$g;->k:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    iget v6, v4, Lwd/g$g;->m:I

    .line 40
    .line 41
    const/4 v7, 0x4

    .line 42
    const/4 v8, 0x3

    .line 43
    const/4 v9, 0x2

    .line 44
    const/4 v10, 0x1

    .line 45
    if-eqz v6, :cond_5

    .line 46
    .line 47
    if-eq v6, v10, :cond_4

    .line 48
    .line 49
    if-eq v6, v9, :cond_3

    .line 50
    .line 51
    if-eq v6, v8, :cond_2

    .line 52
    .line 53
    if-ne v6, v7, :cond_1

    .line 54
    .line 55
    iget-object v0, v4, Lwd/g$g;->d:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v2, v0

    .line 58
    check-cast v2, Ljava/io/Closeable;

    .line 59
    .line 60
    iget-object v0, v4, Lwd/g$g;->c:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v5, v0

    .line 63
    check-cast v5, Ljava/io/Closeable;

    .line 64
    .line 65
    iget-object v0, v4, Lwd/g$g;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Ljava/io/File;

    .line 68
    .line 69
    iget-object v4, v4, Lwd/g$g;->a:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v4, Ldg/C;

    .line 72
    .line 73
    :try_start_0
    invoke-static {v3}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    .line 76
    goto/16 :goto_c

    .line 77
    .line 78
    :catchall_0
    move-exception v0

    .line 79
    :goto_1
    move-object v10, v2

    .line 80
    :goto_2
    move-object v2, v0

    .line 81
    goto/16 :goto_14

    .line 82
    .line 83
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 84
    .line 85
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 86
    .line 87
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v0

    .line 91
    :cond_2
    iget-object v0, v4, Lwd/g$g;->d:Ljava/lang/Object;

    .line 92
    .line 93
    move-object v2, v0

    .line 94
    check-cast v2, Ljava/io/Closeable;

    .line 95
    .line 96
    iget-object v0, v4, Lwd/g$g;->c:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v5, v0

    .line 99
    check-cast v5, Ljava/io/Closeable;

    .line 100
    .line 101
    iget-object v0, v4, Lwd/g$g;->b:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Ljava/io/File;

    .line 104
    .line 105
    iget-object v4, v4, Lwd/g$g;->a:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v4, Ldg/C;

    .line 108
    .line 109
    :try_start_1
    invoke-static {v3}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    .line 111
    .line 112
    goto/16 :goto_9

    .line 113
    .line 114
    :cond_3
    iget-object v0, v4, Lwd/g$g;->d:Ljava/lang/Object;

    .line 115
    .line 116
    move-object v2, v0

    .line 117
    check-cast v2, Ljava/io/Closeable;

    .line 118
    .line 119
    iget-object v0, v4, Lwd/g$g;->c:Ljava/lang/Object;

    .line 120
    .line 121
    move-object v5, v0

    .line 122
    check-cast v5, Ljava/io/Closeable;

    .line 123
    .line 124
    iget-object v0, v4, Lwd/g$g;->b:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v0, Ljava/io/File;

    .line 127
    .line 128
    iget-object v4, v4, Lwd/g$g;->a:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v4, Ldg/C;

    .line 131
    .line 132
    :try_start_2
    invoke-static {v3}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 133
    .line 134
    .line 135
    goto/16 :goto_12

    .line 136
    .line 137
    :cond_4
    iget-boolean v0, v4, Lwd/g$g;->j:Z

    .line 138
    .line 139
    iget-object v2, v4, Lwd/g$g;->i:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v2, Lrd/d;

    .line 142
    .line 143
    iget-object v6, v4, Lwd/g$g;->h:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v6, Lrd/d;

    .line 146
    .line 147
    iget-object v12, v4, Lwd/g$g;->g:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v12, Lwd/b;

    .line 150
    .line 151
    iget-object v13, v4, Lwd/g$g;->f:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v13, Ljava/io/File;

    .line 154
    .line 155
    iget-object v14, v4, Lwd/g$g;->e:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v14, Ljava/io/File;

    .line 158
    .line 159
    iget-object v15, v4, Lwd/g$g;->d:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v15, Ljava/lang/String;

    .line 162
    .line 163
    iget-object v9, v4, Lwd/g$g;->c:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v9, Ldg/C;

    .line 166
    .line 167
    iget-object v7, v4, Lwd/g$g;->b:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v7, Lorg/json/JSONObject;

    .line 170
    .line 171
    iget-object v8, v4, Lwd/g$g;->a:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v8, Lrd/a;

    .line 174
    .line 175
    :try_start_3
    invoke-static {v3}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 176
    .line 177
    .line 178
    move-object/from16 v18, v3

    .line 179
    .line 180
    move-object v3, v2

    .line 181
    move-object v2, v6

    .line 182
    move-object v6, v7

    .line 183
    move-object v7, v15

    .line 184
    move-object/from16 v15, v18

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :catch_0
    move-exception v0

    .line 188
    move-object v2, v9

    .line 189
    goto/16 :goto_16

    .line 190
    .line 191
    :cond_5
    invoke-static {v3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    move-object/from16 v3, p1

    .line 195
    .line 196
    :try_start_4
    iput-object v3, v4, Lwd/g$g;->a:Ljava/lang/Object;

    .line 197
    .line 198
    move-object/from16 v6, p2

    .line 199
    .line 200
    iput-object v6, v4, Lwd/g$g;->b:Ljava/lang/Object;

    .line 201
    .line 202
    iput-object v2, v4, Lwd/g$g;->c:Ljava/lang/Object;

    .line 203
    .line 204
    move-object/from16 v7, p4

    .line 205
    .line 206
    iput-object v7, v4, Lwd/g$g;->d:Ljava/lang/Object;

    .line 207
    .line 208
    move-object/from16 v8, p5

    .line 209
    .line 210
    iput-object v8, v4, Lwd/g$g;->e:Ljava/lang/Object;

    .line 211
    .line 212
    move-object/from16 v9, p6

    .line 213
    .line 214
    iput-object v9, v4, Lwd/g$g;->f:Ljava/lang/Object;

    .line 215
    .line 216
    iput-object v0, v4, Lwd/g$g;->g:Ljava/lang/Object;

    .line 217
    .line 218
    move-object/from16 v12, p9

    .line 219
    .line 220
    iput-object v12, v4, Lwd/g$g;->h:Ljava/lang/Object;

    .line 221
    .line 222
    move-object/from16 v13, p10

    .line 223
    .line 224
    iput-object v13, v4, Lwd/g$g;->i:Ljava/lang/Object;

    .line 225
    .line 226
    move/from16 v14, p8

    .line 227
    .line 228
    iput-boolean v14, v4, Lwd/g$g;->j:Z

    .line 229
    .line 230
    iput v10, v4, Lwd/g$g;->m:I

    .line 231
    .line 232
    invoke-direct {v1, v2, v0, v4}, Lwd/g;->p(Ldg/C;Lwd/b;LZd/e;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v15
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 236
    if-ne v15, v5, :cond_6

    .line 237
    .line 238
    goto/16 :goto_11

    .line 239
    .line 240
    :cond_6
    move-object/from16 v18, v12

    .line 241
    .line 242
    move-object v12, v0

    .line 243
    move v0, v14

    .line 244
    move-object v14, v8

    .line 245
    move-object v8, v3

    .line 246
    move-object v3, v13

    .line 247
    move-object v13, v9

    .line 248
    move-object v9, v2

    .line 249
    move-object/from16 v2, v18

    .line 250
    .line 251
    :goto_3
    :try_start_5
    check-cast v15, Ldg/E;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 252
    .line 253
    :try_start_6
    invoke-virtual {v15}, Ldg/E;->J()Z

    .line 254
    .line 255
    .line 256
    move-result v16

    .line 257
    if-nez v16, :cond_9

    .line 258
    .line 259
    const-string v0, "Asset download request not successful"

    .line 260
    .line 261
    new-instance v2, Ljava/io/IOException;

    .line 262
    .line 263
    invoke-virtual {v15}, Ldg/E;->j()Ldg/F;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    if-eqz v3, :cond_7

    .line 268
    .line 269
    invoke-virtual {v3}, Ldg/F;->l()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    if-nez v3, :cond_8

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :catchall_1
    move-exception v0

    .line 277
    move-object v2, v0

    .line 278
    goto/16 :goto_15

    .line 279
    .line 280
    :cond_7
    :goto_4
    const-string v3, "Unknown error"

    .line 281
    .line 282
    :cond_8
    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    iget-object v3, v1, Lwd/g;->d:Lxd/g;

    .line 286
    .line 287
    sget-object v4, Lxd/b;->i:Lxd/b;

    .line 288
    .line 289
    invoke-virtual {v3, v0, v2, v4}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 290
    .line 291
    .line 292
    new-instance v3, Ljava/io/IOException;

    .line 293
    .line 294
    invoke-direct {v3, v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 295
    .line 296
    .line 297
    throw v3

    .line 298
    :cond_9
    invoke-virtual {v15}, Ldg/E;->j()Ldg/F;

    .line 299
    .line 300
    .line 301
    move-result-object v10
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 302
    if-eqz v10, :cond_14

    .line 303
    .line 304
    :try_start_7
    invoke-direct {v1, v15}, Lwd/g;->y(Ldg/E;)Lwd/g$e;

    .line 305
    .line 306
    .line 307
    move-result-object v11
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_c

    .line 308
    if-nez v11, :cond_a

    .line 309
    .line 310
    :try_start_8
    invoke-virtual {v10}, Ldg/F;->a()Ljava/io/InputStream;

    .line 311
    .line 312
    .line 313
    move-result-object v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 314
    :try_start_9
    sget-object v0, Lexpo/modules/updates/g;->a:Lexpo/modules/updates/g;

    .line 315
    .line 316
    invoke-virtual {v0, v2, v14, v7}, Lexpo/modules/updates/g;->l(Ljava/io/InputStream;Ljava/io/File;Ljava/lang/String;)[B

    .line 317
    .line 318
    .line 319
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 320
    const/4 v3, 0x0

    .line 321
    :try_start_a
    invoke-static {v2, v3}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 322
    .line 323
    .line 324
    move-object v4, v9

    .line 325
    :goto_5
    const/4 v3, 0x0

    .line 326
    goto/16 :goto_13

    .line 327
    .line 328
    :catchall_2
    move-exception v0

    .line 329
    :goto_6
    move-object v2, v0

    .line 330
    move-object v4, v9

    .line 331
    move-object v5, v15

    .line 332
    goto/16 :goto_14

    .line 333
    .line 334
    :catchall_3
    move-exception v0

    .line 335
    move-object v3, v0

    .line 336
    :try_start_b
    throw v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 337
    :catchall_4
    move-exception v0

    .line 338
    :try_start_c
    invoke-static {v2, v3}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 339
    .line 340
    .line 341
    throw v0

    .line 342
    :cond_a
    if-eqz v3, :cond_b

    .line 343
    .line 344
    invoke-virtual {v3}, Lrd/d;->d()Ljava/util/UUID;

    .line 345
    .line 346
    .line 347
    move-result-object v17

    .line 348
    if-eqz v17, :cond_b

    .line 349
    .line 350
    invoke-virtual/range {v17 .. v17}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v17

    .line 354
    move-object/from16 p7, v3

    .line 355
    .line 356
    move-object/from16 v3, v17

    .line 357
    .line 358
    goto :goto_7

    .line 359
    :cond_b
    move-object/from16 p7, v3

    .line 360
    .line 361
    const/4 v3, 0x0

    .line 362
    :goto_7
    if-eqz v2, :cond_c

    .line 363
    .line 364
    if-eqz p7, :cond_c

    .line 365
    .line 366
    move/from16 p1, v0

    .line 367
    .line 368
    invoke-virtual {v2}, Lrd/d;->d()Ljava/util/UUID;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    move-object/from16 p3, v6

    .line 373
    .line 374
    invoke-virtual/range {p7 .. p7}, Lrd/d;->d()Ljava/util/UUID;

    .line 375
    .line 376
    .line 377
    move-result-object v6

    .line 378
    invoke-static {v0, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 382
    if-nez v0, :cond_d

    .line 383
    .line 384
    const/4 v0, 0x1

    .line 385
    goto :goto_8

    .line 386
    :cond_c
    move/from16 p1, v0

    .line 387
    .line 388
    move-object/from16 p3, v6

    .line 389
    .line 390
    :cond_d
    const/4 v0, 0x0

    .line 391
    :goto_8
    if-eqz p1, :cond_12

    .line 392
    .line 393
    :try_start_d
    invoke-virtual {v8}, Lrd/a;->t()Z

    .line 394
    .line 395
    .line 396
    move-result v6

    .line 397
    if-eqz v6, :cond_12

    .line 398
    .line 399
    if-eqz v0, :cond_12

    .line 400
    .line 401
    invoke-direct {v1, v11, v2}, Lwd/g;->C(Lwd/g$e;Lrd/d;)Z

    .line 402
    .line 403
    .line 404
    move-result v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_c

    .line 405
    if-nez v0, :cond_f

    .line 406
    .line 407
    :try_start_e
    iget-object v0, v1, Lwd/g;->d:Lxd/g;

    .line 408
    .line 409
    const-string v2, "Patch response missing required headers or had mismatched identifiers; retrying with full asset download"

    .line 410
    .line 411
    sget-object v6, Lxd/b;->i:Lxd/b;

    .line 412
    .line 413
    invoke-virtual {v8}, Lrd/a;->j()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v11

    .line 417
    invoke-virtual {v0, v2, v6, v3, v11}, Lxd/g;->p(Ljava/lang/String;Lxd/b;Ljava/lang/String;Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    iput-object v9, v4, Lwd/g$g;->a:Ljava/lang/Object;

    .line 421
    .line 422
    iput-object v14, v4, Lwd/g$g;->b:Ljava/lang/Object;

    .line 423
    .line 424
    iput-object v15, v4, Lwd/g$g;->c:Ljava/lang/Object;

    .line 425
    .line 426
    iput-object v10, v4, Lwd/g$g;->d:Ljava/lang/Object;

    .line 427
    .line 428
    const/4 v3, 0x0

    .line 429
    iput-object v3, v4, Lwd/g$g;->e:Ljava/lang/Object;

    .line 430
    .line 431
    iput-object v3, v4, Lwd/g$g;->f:Ljava/lang/Object;

    .line 432
    .line 433
    iput-object v3, v4, Lwd/g$g;->g:Ljava/lang/Object;

    .line 434
    .line 435
    iput-object v3, v4, Lwd/g$g;->h:Ljava/lang/Object;

    .line 436
    .line 437
    iput-object v3, v4, Lwd/g$g;->i:Ljava/lang/Object;

    .line 438
    .line 439
    const/4 v0, 0x3

    .line 440
    iput v0, v4, Lwd/g$g;->m:I

    .line 441
    .line 442
    move-object/from16 p1, v1

    .line 443
    .line 444
    move-object/from16 p7, v4

    .line 445
    .line 446
    move-object/from16 p6, v7

    .line 447
    .line 448
    move-object/from16 p2, v8

    .line 449
    .line 450
    move-object/from16 p4, v12

    .line 451
    .line 452
    move-object/from16 p5, v14

    .line 453
    .line 454
    invoke-direct/range {p1 .. p7}, Lwd/g;->s(Lrd/a;Lorg/json/JSONObject;Lwd/b;Ljava/io/File;Ljava/lang/String;LZd/e;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 458
    move-object/from16 v8, p5

    .line 459
    .line 460
    if-ne v3, v5, :cond_e

    .line 461
    .line 462
    move-object/from16 v1, p0

    .line 463
    .line 464
    goto/16 :goto_11

    .line 465
    .line 466
    :cond_e
    move-object v0, v8

    .line 467
    move-object v4, v9

    .line 468
    move-object v2, v10

    .line 469
    move-object v5, v15

    .line 470
    :goto_9
    :try_start_f
    move-object v1, v3

    .line 471
    check-cast v1, [B
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 472
    .line 473
    const/4 v3, 0x0

    .line 474
    move-object v14, v0

    .line 475
    move-object v0, v1

    .line 476
    move-object v10, v2

    .line 477
    move-object v15, v5

    .line 478
    move-object/from16 v1, p0

    .line 479
    .line 480
    goto/16 :goto_13

    .line 481
    .line 482
    :catchall_5
    move-exception v0

    .line 483
    move-object/from16 v1, p0

    .line 484
    .line 485
    goto/16 :goto_1

    .line 486
    .line 487
    :catchall_6
    move-exception v0

    .line 488
    move-object/from16 v1, p0

    .line 489
    .line 490
    goto/16 :goto_6

    .line 491
    .line 492
    :cond_f
    move-object/from16 v6, p3

    .line 493
    .line 494
    move-object v1, v8

    .line 495
    move-object v8, v14

    .line 496
    :try_start_10
    sget-object v0, LTd/u;->b:LTd/u$a;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 497
    .line 498
    move-object/from16 p1, p0

    .line 499
    .line 500
    move-object/from16 p2, v1

    .line 501
    .line 502
    move-object/from16 p6, v2

    .line 503
    .line 504
    move-object/from16 p8, v7

    .line 505
    .line 506
    move-object/from16 p4, v8

    .line 507
    .line 508
    move-object/from16 p3, v10

    .line 509
    .line 510
    move-object/from16 p5, v13

    .line 511
    .line 512
    :try_start_11
    invoke-direct/range {p1 .. p8}, Lwd/g;->h(Lrd/a;Ldg/F;Ljava/io/File;Ljava/io/File;Lrd/d;Lrd/d;Ljava/lang/String;)[B

    .line 513
    .line 514
    .line 515
    move-result-object v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 516
    move-object/from16 v1, p1

    .line 517
    .line 518
    move-object/from16 v10, p2

    .line 519
    .line 520
    move-object/from16 v2, p3

    .line 521
    .line 522
    move-object/from16 v8, p4

    .line 523
    .line 524
    move-object/from16 v7, p8

    .line 525
    .line 526
    :try_start_12
    invoke-static {v0}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 530
    goto :goto_b

    .line 531
    :catchall_7
    move-exception v0

    .line 532
    goto :goto_a

    .line 533
    :catchall_8
    move-exception v0

    .line 534
    move-object/from16 v1, p1

    .line 535
    .line 536
    move-object/from16 v10, p2

    .line 537
    .line 538
    move-object/from16 v2, p3

    .line 539
    .line 540
    move-object/from16 v8, p4

    .line 541
    .line 542
    move-object/from16 v7, p8

    .line 543
    .line 544
    goto :goto_a

    .line 545
    :catchall_9
    move-exception v0

    .line 546
    move-object v2, v10

    .line 547
    move-object v10, v1

    .line 548
    move-object/from16 v1, p0

    .line 549
    .line 550
    :goto_a
    :try_start_13
    sget-object v11, LTd/u;->b:LTd/u$a;

    .line 551
    .line 552
    invoke-static {v0}, LTd/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    invoke-static {v0}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    :goto_b
    invoke-static {v0}, LTd/u;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 561
    .line 562
    .line 563
    move-result-object v11

    .line 564
    if-nez v11, :cond_10

    .line 565
    .line 566
    move-object v14, v8

    .line 567
    move-object v4, v9

    .line 568
    move-object v5, v15

    .line 569
    goto :goto_d

    .line 570
    :cond_10
    iget-object v0, v1, Lwd/g;->d:Lxd/g;

    .line 571
    .line 572
    invoke-virtual {v10}, Lrd/a;->j()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v11

    .line 576
    new-instance v13, Ljava/lang/StringBuilder;

    .line 577
    .line 578
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 579
    .line 580
    .line 581
    const-string v14, "Patch application failed for asset "

    .line 582
    .line 583
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 587
    .line 588
    .line 589
    const-string v11, "; retrying with full asset download"

    .line 590
    .line 591
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v11

    .line 598
    sget-object v13, Lxd/b;->i:Lxd/b;

    .line 599
    .line 600
    invoke-virtual {v10}, Lrd/a;->j()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v14

    .line 604
    invoke-virtual {v0, v11, v13, v3, v14}, Lxd/g;->p(Ljava/lang/String;Lxd/b;Ljava/lang/String;Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    iput-object v9, v4, Lwd/g$g;->a:Ljava/lang/Object;

    .line 608
    .line 609
    iput-object v8, v4, Lwd/g$g;->b:Ljava/lang/Object;

    .line 610
    .line 611
    iput-object v15, v4, Lwd/g$g;->c:Ljava/lang/Object;

    .line 612
    .line 613
    iput-object v2, v4, Lwd/g$g;->d:Ljava/lang/Object;

    .line 614
    .line 615
    const/4 v3, 0x0

    .line 616
    iput-object v3, v4, Lwd/g$g;->e:Ljava/lang/Object;

    .line 617
    .line 618
    iput-object v3, v4, Lwd/g$g;->f:Ljava/lang/Object;

    .line 619
    .line 620
    iput-object v3, v4, Lwd/g$g;->g:Ljava/lang/Object;

    .line 621
    .line 622
    iput-object v3, v4, Lwd/g$g;->h:Ljava/lang/Object;

    .line 623
    .line 624
    iput-object v3, v4, Lwd/g$g;->i:Ljava/lang/Object;

    .line 625
    .line 626
    const/4 v3, 0x4

    .line 627
    iput v3, v4, Lwd/g$g;->m:I
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_b

    .line 628
    .line 629
    move-object/from16 p1, v1

    .line 630
    .line 631
    move-object/from16 p7, v4

    .line 632
    .line 633
    move-object/from16 p3, v6

    .line 634
    .line 635
    move-object/from16 p6, v7

    .line 636
    .line 637
    move-object/from16 p5, v8

    .line 638
    .line 639
    move-object/from16 p2, v10

    .line 640
    .line 641
    move-object/from16 p4, v12

    .line 642
    .line 643
    :try_start_14
    invoke-direct/range {p1 .. p7}, Lwd/g;->s(Lrd/a;Lorg/json/JSONObject;Lwd/b;Ljava/io/File;Ljava/lang/String;LZd/e;)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v3
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_a

    .line 647
    move-object/from16 v1, p1

    .line 648
    .line 649
    move-object/from16 v8, p5

    .line 650
    .line 651
    if-ne v3, v5, :cond_11

    .line 652
    .line 653
    goto/16 :goto_11

    .line 654
    .line 655
    :cond_11
    move-object v0, v8

    .line 656
    move-object v4, v9

    .line 657
    move-object v5, v15

    .line 658
    :goto_c
    :try_start_15
    check-cast v3, [B

    .line 659
    .line 660
    move-object v14, v0

    .line 661
    move-object v0, v3

    .line 662
    :goto_d
    check-cast v0, [B
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    .line 663
    .line 664
    move-object v10, v2

    .line 665
    :goto_e
    move-object v15, v5

    .line 666
    goto/16 :goto_5

    .line 667
    .line 668
    :catchall_a
    move-exception v0

    .line 669
    move-object/from16 v1, p1

    .line 670
    .line 671
    :goto_f
    move-object v10, v2

    .line 672
    :goto_10
    move-object v4, v9

    .line 673
    move-object v5, v15

    .line 674
    goto/16 :goto_2

    .line 675
    .line 676
    :catchall_b
    move-exception v0

    .line 677
    goto :goto_f

    .line 678
    :catchall_c
    move-exception v0

    .line 679
    move-object v2, v10

    .line 680
    goto :goto_10

    .line 681
    :cond_12
    move-object/from16 v6, p3

    .line 682
    .line 683
    move-object v2, v10

    .line 684
    move-object v10, v8

    .line 685
    move-object v8, v14

    .line 686
    :try_start_16
    iget-object v0, v1, Lwd/g;->d:Lxd/g;

    .line 687
    .line 688
    const-string v11, "Received patch response even though patch application is disabled; retrying with full asset download"

    .line 689
    .line 690
    sget-object v13, Lxd/b;->i:Lxd/b;

    .line 691
    .line 692
    invoke-virtual {v10}, Lrd/a;->j()Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v14

    .line 696
    invoke-virtual {v0, v11, v13, v3, v14}, Lxd/g;->p(Ljava/lang/String;Lxd/b;Ljava/lang/String;Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    iput-object v9, v4, Lwd/g$g;->a:Ljava/lang/Object;

    .line 700
    .line 701
    iput-object v8, v4, Lwd/g$g;->b:Ljava/lang/Object;

    .line 702
    .line 703
    iput-object v15, v4, Lwd/g$g;->c:Ljava/lang/Object;

    .line 704
    .line 705
    iput-object v2, v4, Lwd/g$g;->d:Ljava/lang/Object;

    .line 706
    .line 707
    const/4 v3, 0x0

    .line 708
    iput-object v3, v4, Lwd/g$g;->e:Ljava/lang/Object;

    .line 709
    .line 710
    iput-object v3, v4, Lwd/g$g;->f:Ljava/lang/Object;

    .line 711
    .line 712
    iput-object v3, v4, Lwd/g$g;->g:Ljava/lang/Object;

    .line 713
    .line 714
    iput-object v3, v4, Lwd/g$g;->h:Ljava/lang/Object;

    .line 715
    .line 716
    iput-object v3, v4, Lwd/g$g;->i:Ljava/lang/Object;

    .line 717
    .line 718
    const/4 v0, 0x2

    .line 719
    iput v0, v4, Lwd/g$g;->m:I
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_b

    .line 720
    .line 721
    move-object/from16 p1, v1

    .line 722
    .line 723
    move-object/from16 p7, v4

    .line 724
    .line 725
    move-object/from16 p3, v6

    .line 726
    .line 727
    move-object/from16 p6, v7

    .line 728
    .line 729
    move-object/from16 p5, v8

    .line 730
    .line 731
    move-object/from16 p2, v10

    .line 732
    .line 733
    move-object/from16 p4, v12

    .line 734
    .line 735
    :try_start_17
    invoke-direct/range {p1 .. p7}, Lwd/g;->s(Lrd/a;Lorg/json/JSONObject;Lwd/b;Ljava/io/File;Ljava/lang/String;LZd/e;)Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object v3
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_a

    .line 739
    move-object/from16 v1, p1

    .line 740
    .line 741
    move-object/from16 v8, p5

    .line 742
    .line 743
    if-ne v3, v5, :cond_13

    .line 744
    .line 745
    :goto_11
    return-object v5

    .line 746
    :cond_13
    move-object v0, v8

    .line 747
    move-object v4, v9

    .line 748
    move-object v5, v15

    .line 749
    :goto_12
    :try_start_18
    check-cast v3, [B
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_0

    .line 750
    .line 751
    move-object v14, v0

    .line 752
    move-object v10, v2

    .line 753
    move-object v0, v3

    .line 754
    goto :goto_e

    .line 755
    :goto_13
    :try_start_19
    invoke-static {v10, v3}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_d

    .line 756
    .line 757
    .line 758
    :try_start_1a
    invoke-static {v15, v3}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 759
    .line 760
    .line 761
    new-instance v2, Lwd/g$c;

    .line 762
    .line 763
    invoke-direct {v2, v14, v0}, Lwd/g$c;-><init>(Ljava/io/File;[B)V
    :try_end_1a
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_1

    .line 764
    .line 765
    .line 766
    return-object v2

    .line 767
    :catch_1
    move-exception v0

    .line 768
    move-object v2, v4

    .line 769
    goto :goto_16

    .line 770
    :catchall_d
    move-exception v0

    .line 771
    move-object v2, v0

    .line 772
    move-object v9, v4

    .line 773
    goto :goto_15

    .line 774
    :goto_14
    :try_start_1b
    throw v2
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_e

    .line 775
    :catchall_e
    move-exception v0

    .line 776
    :try_start_1c
    invoke-static {v10, v2}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 777
    .line 778
    .line 779
    throw v0
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_f

    .line 780
    :catchall_f
    move-exception v0

    .line 781
    move-object v2, v0

    .line 782
    move-object v9, v4

    .line 783
    move-object v15, v5

    .line 784
    goto :goto_15

    .line 785
    :cond_14
    :try_start_1d
    new-instance v0, Ljava/io/IOException;

    .line 786
    .line 787
    invoke-virtual {v9}, Ldg/C;->p()Ldg/u;

    .line 788
    .line 789
    .line 790
    move-result-object v2

    .line 791
    new-instance v3, Ljava/lang/StringBuilder;

    .line 792
    .line 793
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 794
    .line 795
    .line 796
    const-string v4, "Asset download response from "

    .line 797
    .line 798
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 802
    .line 803
    .line 804
    const-string v2, " had no body"

    .line 805
    .line 806
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v2

    .line 813
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 814
    .line 815
    .line 816
    throw v0
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_1

    .line 817
    :goto_15
    :try_start_1e
    throw v2
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_10

    .line 818
    :catchall_10
    move-exception v0

    .line 819
    :try_start_1f
    invoke-static {v15, v2}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 820
    .line 821
    .line 822
    throw v0
    :try_end_1f
    .catch Ljava/io/IOException; {:try_start_1f .. :try_end_1f} :catch_0

    .line 823
    :catch_2
    move-exception v0

    .line 824
    :goto_16
    invoke-virtual {v2}, Ldg/C;->p()Ldg/u;

    .line 825
    .line 826
    .line 827
    move-result-object v2

    .line 828
    new-instance v3, Ljava/lang/StringBuilder;

    .line 829
    .line 830
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 831
    .line 832
    .line 833
    const-string v4, "Failed to download asset from URL "

    .line 834
    .line 835
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 836
    .line 837
    .line 838
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 839
    .line 840
    .line 841
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 842
    .line 843
    .line 844
    move-result-object v2

    .line 845
    iget-object v3, v1, Lwd/g;->d:Lxd/g;

    .line 846
    .line 847
    sget-object v4, Lxd/b;->i:Lxd/b;

    .line 848
    .line 849
    invoke-virtual {v3, v2, v0, v4}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 850
    .line 851
    .line 852
    new-instance v3, Ljava/io/IOException;

    .line 853
    .line 854
    invoke-direct {v3, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 855
    .line 856
    .line 857
    throw v3
.end method

.method public final r(Lorg/json/JSONObject;LZd/e;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lwd/g$i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lwd/g$i;

    .line 7
    .line 8
    iget v1, v0, Lwd/g$i;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lwd/g$i;->c:I

    .line 18
    .line 19
    :goto_0
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lwd/g$i;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Lwd/g$i;-><init>(Lwd/g;LZd/e;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v4, Lwd/g$i;->a:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v4, Lwd/g$i;->c:I

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    :try_start_0
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    move-object v1, p0

    .line 44
    goto :goto_2

    .line 45
    :catch_0
    move-exception v0

    .line 46
    move-object p1, v0

    .line 47
    move-object v1, p0

    .line 48
    goto :goto_5

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :try_start_1
    iget-object p2, p0, Lwd/g;->c:Lexpo/modules/updates/d;

    .line 61
    .line 62
    iget-object v1, p0, Lwd/g;->d:Lxd/g;

    .line 63
    .line 64
    invoke-virtual {p0, p1, p2, v1}, Lwd/g;->k(Lorg/json/JSONObject;Lexpo/modules/updates/d;Lxd/g;)Ldg/C;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput v2, v4, Lwd/g$i;->c:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    const/4 v5, 0x2

    .line 72
    const/4 v6, 0x0

    .line 73
    move-object v1, p0

    .line 74
    move-object v2, p1

    .line 75
    :try_start_2
    invoke-static/range {v1 .. v6}, Lwd/g;->q(Lwd/g;Ldg/C;Lwd/b;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    if-ne p2, v0, :cond_3

    .line 80
    .line 81
    return-object v0

    .line 82
    :cond_3
    :goto_2
    check-cast p2, Ldg/E;

    .line 83
    .line 84
    invoke-virtual {p2}, Ldg/E;->J()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-nez p1, :cond_6

    .line 89
    .line 90
    const-string p1, "Remote update request not successful"

    .line 91
    .line 92
    new-instance v0, Ljava/io/IOException;

    .line 93
    .line 94
    invoke-virtual {p2}, Ldg/E;->j()Ldg/F;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    if-eqz p2, :cond_4

    .line 99
    .line 100
    invoke-virtual {p2}, Ldg/F;->l()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    if-nez p2, :cond_5

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :catch_1
    move-exception v0

    .line 108
    :goto_3
    move-object p1, v0

    .line 109
    goto :goto_5

    .line 110
    :cond_4
    :goto_4
    const-string p2, "Unknown error"

    .line 111
    .line 112
    :cond_5
    invoke-direct {v0, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iget-object p2, v1, Lwd/g;->d:Lxd/g;

    .line 116
    .line 117
    sget-object v2, Lxd/b;->h:Lxd/b;

    .line 118
    .line 119
    invoke-virtual {p2, p1, v0, v2}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 120
    .line 121
    .line 122
    new-instance p2, Ljava/io/IOException;

    .line 123
    .line 124
    invoke-direct {p2, p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    throw p2

    .line 128
    :cond_6
    invoke-virtual {p0, p2}, Lwd/g;->z(Ldg/E;)Lwd/v;

    .line 129
    .line 130
    .line 131
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 132
    return-object p1

    .line 133
    :catch_2
    move-exception v0

    .line 134
    move-object v1, p0

    .line 135
    goto :goto_3

    .line 136
    :goto_5
    iget-object p2, v1, Lwd/g;->d:Lxd/g;

    .line 137
    .line 138
    sget-object v0, Lxd/b;->h:Lxd/b;

    .line 139
    .line 140
    const-string v2, "Failed to download remote update"

    .line 141
    .line 142
    invoke-virtual {p2, v2, p1, v0}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 143
    .line 144
    .line 145
    new-instance p2, Ljava/io/IOException;

    .line 146
    .line 147
    invoke-direct {p2, v2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    throw p2
.end method

.method public final z(Ldg/E;)Lwd/v;
    .locals 6

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ldg/E;->E()Ldg/t;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "expo-protocol-version"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ldg/t;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "expo-manifest-filters"

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ldg/t;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v3, "expo-server-defined-headers"

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Ldg/t;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    new-instance v4, Lyd/n;

    .line 29
    .line 30
    invoke-direct {v4, v1, v3, v2}, Lyd/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ldg/E;->j()Ldg/F;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {p1}, Ldg/E;->o()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const/16 v3, 0xcc

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    if-eq v2, v3, :cond_3

    .line 45
    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    invoke-virtual {v1}, Ldg/F;->j()Ldg/x;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    invoke-virtual {v2}, Ldg/x;->f()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move-object v2, v5

    .line 61
    :goto_0
    const-string v3, "multipart"

    .line 62
    .line 63
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_2

    .line 68
    .line 69
    invoke-direct {p0, p1, v1, v4}, Lwd/g;->x(Ldg/E;Ldg/F;Lyd/n;)Lwd/v;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :cond_2
    new-instance v1, Lyd/p;

    .line 75
    .line 76
    new-instance v2, Lyd/o;

    .line 77
    .line 78
    const-string v3, "expo-signature"

    .line 79
    .line 80
    invoke-virtual {v0, v3}, Ldg/t;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-direct {v2, v0}, Lyd/o;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Ldg/E;->j()Ldg/F;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Ldg/F;->l()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-direct {v1, v4, v2, p1}, Lyd/p;-><init>(Lyd/n;Lyd/o;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-direct {p0, v1, v5, v5}, Lwd/g;->w(Lyd/p;Lorg/json/JSONObject;Ljava/lang/String;)Lwd/w$b;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    new-instance v0, Lwd/v;

    .line 106
    .line 107
    invoke-direct {v0, v4, p1, v5}, Lwd/v;-><init>(Lyd/n;Lwd/w$b;Lwd/w$a;)V

    .line 108
    .line 109
    .line 110
    return-object v0

    .line 111
    :cond_3
    :goto_1
    invoke-virtual {v4}, Lyd/n;->e()Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-eqz p1, :cond_4

    .line 116
    .line 117
    invoke-virtual {v4}, Lyd/n;->e()Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-lez p1, :cond_4

    .line 126
    .line 127
    new-instance p1, Lwd/v;

    .line 128
    .line 129
    invoke-direct {p1, v4, v5, v5}, Lwd/v;-><init>(Lyd/n;Lwd/w$b;Lwd/w$a;)V

    .line 130
    .line 131
    .line 132
    return-object p1

    .line 133
    :cond_4
    new-instance p1, Ljava/io/IOException;

    .line 134
    .line 135
    const-string v0, "Empty body"

    .line 136
    .line 137
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iget-object v0, p0, Lwd/g;->d:Lxd/g;

    .line 141
    .line 142
    sget-object v1, Lxd/b;->h:Lxd/b;

    .line 143
    .line 144
    const-string v2, "Invalid update response"

    .line 145
    .line 146
    invoke-virtual {v0, v2, p1, v1}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 147
    .line 148
    .line 149
    new-instance v0, Ljava/io/IOException;

    .line 150
    .line 151
    invoke-direct {v0, v2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    throw v0
.end method
