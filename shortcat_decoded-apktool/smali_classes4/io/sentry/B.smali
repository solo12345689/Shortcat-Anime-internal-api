.class public final Lio/sentry/B;
.super Lio/sentry/t;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/Q;


# instance fields
.field private final e:Lio/sentry/a0;

.field private final f:Lio/sentry/f0;

.field private final g:Lio/sentry/ILogger;


# direct methods
.method public constructor <init>(Lio/sentry/a0;Lio/sentry/f0;Lio/sentry/ILogger;JI)V
    .locals 6

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    move-object v2, p3

    .line 4
    move-wide v3, p4

    .line 5
    move v5, p6

    .line 6
    invoke-direct/range {v0 .. v5}, Lio/sentry/t;-><init>(Lio/sentry/a0;Lio/sentry/ILogger;JI)V

    .line 7
    .line 8
    .line 9
    const-string p1, "Scopes are required."

    .line 10
    .line 11
    invoke-static {v1, p1}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lio/sentry/a0;

    .line 16
    .line 17
    iput-object p1, v0, Lio/sentry/B;->e:Lio/sentry/a0;

    .line 18
    .line 19
    const-string p1, "Serializer is required."

    .line 20
    .line 21
    invoke-static {p2, p1}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lio/sentry/f0;

    .line 26
    .line 27
    iput-object p1, v0, Lio/sentry/B;->f:Lio/sentry/f0;

    .line 28
    .line 29
    const-string p1, "Logger is required."

    .line 30
    .line 31
    invoke-static {v2, p1}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lio/sentry/ILogger;

    .line 36
    .line 37
    iput-object p1, v0, Lio/sentry/B;->g:Lio/sentry/ILogger;

    .line 38
    .line 39
    return-void
.end method

.method public static synthetic f(Lio/sentry/B;Lio/sentry/hints/i;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Lio/sentry/hints/i;->g()Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Lio/sentry/B;->g:Lio/sentry/ILogger;

    .line 11
    .line 12
    sget-object p1, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    new-array v0, v0, [Ljava/lang/Object;

    .line 16
    .line 17
    const-string v1, "Timed out waiting for envelope submission."

    .line 18
    .line 19
    invoke-interface {p0, p1, v1, v0}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public static synthetic g(Lio/sentry/B;Ljava/io/File;Lio/sentry/hints/l;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p2}, Lio/sentry/hints/l;->a()Z

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    const-string p2, "after trying to capture it"

    .line 11
    .line 12
    invoke-direct {p0, p1, p2}, Lio/sentry/B;->i(Ljava/io/File;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lio/sentry/B;->g:Lio/sentry/ILogger;

    .line 16
    .line 17
    sget-object p2, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v0, "Deleted file %s."

    .line 28
    .line 29
    invoke-interface {p0, p2, v0, p1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    iget-object p0, p0, Lio/sentry/B;->g:Lio/sentry/ILogger;

    .line 34
    .line 35
    sget-object p2, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v0, "File not deleted since retry was marked. %s."

    .line 46
    .line 47
    invoke-interface {p0, p2, v0, p1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static synthetic h(Lio/sentry/B;Ljava/lang/Throwable;Ljava/io/File;Lio/sentry/hints/l;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-interface {p3, v0}, Lio/sentry/hints/l;->d(Z)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lio/sentry/B;->g:Lio/sentry/ILogger;

    .line 9
    .line 10
    sget-object p3, Lio/sentry/i3;->INFO:Lio/sentry/i3;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const-string v0, "File \'%s\' won\'t retry."

    .line 21
    .line 22
    invoke-interface {p0, p3, p1, v0, p2}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private i(Ljava/io/File;Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "Failed to delete \'%s\' %s"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lio/sentry/B;->g:Lio/sentry/ILogger;

    .line 10
    .line 11
    sget-object v2, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    filled-new-array {v3, p2}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-interface {v1, v2, v0, v3}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void

    .line 28
    :goto_0
    iget-object v2, p0, Lio/sentry/B;->g:Lio/sentry/ILogger;

    .line 29
    .line 30
    sget-object v3, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {v2, v3, v1, v0, p1}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lio/sentry/H;)V
    .locals 1

    .line 1
    const-string v0, "Path is required."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0, p2}, Lio/sentry/B;->e(Ljava/io/File;Lio/sentry/H;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method protected c(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, ".envelope"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic d(Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lio/sentry/t;->d(Ljava/io/File;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method protected e(Ljava/io/File;Lio/sentry/H;)V
    .locals 6

    .line 1
    const-class v0, Lio/sentry/hints/l;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, Lio/sentry/B;->g:Lio/sentry/ILogger;

    .line 10
    .line 11
    sget-object v0, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v1, "\'%s\' is not a file."

    .line 22
    .line 23
    invoke-interface {p2, v0, v1, p1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {p0, v1}, Lio/sentry/B;->c(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    iget-object p2, p0, Lio/sentry/B;->g:Lio/sentry/ILogger;

    .line 38
    .line 39
    sget-object v0, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string v1, "File \'%s\' doesn\'t match extension expected."

    .line 50
    .line 51
    invoke-interface {p2, v0, v1, p1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Ljava/io/File;->canWrite()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-nez v1, :cond_2

    .line 64
    .line 65
    iget-object p2, p0, Lio/sentry/B;->g:Lio/sentry/ILogger;

    .line 66
    .line 67
    sget-object v0, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const-string v1, "File \'%s\' cannot be deleted so it will not be processed."

    .line 78
    .line 79
    invoke-interface {p2, v0, v1, p1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_2
    :try_start_0
    new-instance v1, Ljava/io/BufferedInputStream;

    .line 84
    .line 85
    new-instance v2, Ljava/io/FileInputStream;

    .line 86
    .line 87
    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 88
    .line 89
    .line 90
    invoke-direct {v1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 91
    .line 92
    .line 93
    :try_start_1
    iget-object v2, p0, Lio/sentry/B;->f:Lio/sentry/f0;

    .line 94
    .line 95
    invoke-interface {v2, v1}, Lio/sentry/f0;->d(Ljava/io/InputStream;)Lio/sentry/q2;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    if-nez v2, :cond_3

    .line 100
    .line 101
    iget-object v2, p0, Lio/sentry/B;->g:Lio/sentry/ILogger;

    .line 102
    .line 103
    sget-object v3, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 104
    .line 105
    const-string v4, "Failed to deserialize cached envelope %s"

    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-interface {v2, v3, v4, v5}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :catchall_0
    move-exception v2

    .line 120
    goto :goto_1

    .line 121
    :cond_3
    iget-object v3, p0, Lio/sentry/B;->e:Lio/sentry/a0;

    .line 122
    .line 123
    invoke-interface {v3, v2, p2}, Lio/sentry/a0;->o(Lio/sentry/q2;Lio/sentry/H;)Lio/sentry/protocol/x;

    .line 124
    .line 125
    .line 126
    :goto_0
    const-class v2, Lio/sentry/hints/i;

    .line 127
    .line 128
    iget-object v3, p0, Lio/sentry/B;->g:Lio/sentry/ILogger;

    .line 129
    .line 130
    new-instance v4, Lio/sentry/y;

    .line 131
    .line 132
    invoke-direct {v4, p0}, Lio/sentry/y;-><init>(Lio/sentry/B;)V

    .line 133
    .line 134
    .line 135
    invoke-static {p2, v2, v3, v4}, Lio/sentry/util/l;->j(Lio/sentry/H;Ljava/lang/Class;Lio/sentry/ILogger;Lio/sentry/util/l$a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    .line 137
    .line 138
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 139
    .line 140
    .line 141
    iget-object v1, p0, Lio/sentry/B;->g:Lio/sentry/ILogger;

    .line 142
    .line 143
    new-instance v2, Lio/sentry/z;

    .line 144
    .line 145
    invoke-direct {v2, p0, p1}, Lio/sentry/z;-><init>(Lio/sentry/B;Ljava/io/File;)V

    .line 146
    .line 147
    .line 148
    invoke-static {p2, v0, v1, v2}, Lio/sentry/util/l;->j(Lio/sentry/H;Ljava/lang/Class;Lio/sentry/ILogger;Lio/sentry/util/l$a;)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :catchall_1
    move-exception v1

    .line 153
    goto :goto_3

    .line 154
    :catch_0
    move-exception v1

    .line 155
    goto :goto_5

    .line 156
    :catch_1
    move-exception v1

    .line 157
    goto :goto_6

    .line 158
    :goto_1
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :catchall_2
    move-exception v1

    .line 163
    :try_start_4
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    :goto_2
    throw v2
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 167
    :goto_3
    :try_start_5
    iget-object v2, p0, Lio/sentry/B;->g:Lio/sentry/ILogger;

    .line 168
    .line 169
    sget-object v3, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 170
    .line 171
    const-string v4, "Failed to capture cached envelope %s"

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    invoke-interface {v2, v3, v1, v4, v5}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    iget-object v2, p0, Lio/sentry/B;->g:Lio/sentry/ILogger;

    .line 185
    .line 186
    new-instance v3, Lio/sentry/A;

    .line 187
    .line 188
    invoke-direct {v3, p0, v1, p1}, Lio/sentry/A;-><init>(Lio/sentry/B;Ljava/lang/Throwable;Ljava/io/File;)V

    .line 189
    .line 190
    .line 191
    invoke-static {p2, v0, v2, v3}, Lio/sentry/util/l;->j(Lio/sentry/H;Ljava/lang/Class;Lio/sentry/ILogger;Lio/sentry/util/l$a;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 192
    .line 193
    .line 194
    iget-object v1, p0, Lio/sentry/B;->g:Lio/sentry/ILogger;

    .line 195
    .line 196
    new-instance v2, Lio/sentry/z;

    .line 197
    .line 198
    invoke-direct {v2, p0, p1}, Lio/sentry/z;-><init>(Lio/sentry/B;Ljava/io/File;)V

    .line 199
    .line 200
    .line 201
    :goto_4
    invoke-static {p2, v0, v1, v2}, Lio/sentry/util/l;->j(Lio/sentry/H;Ljava/lang/Class;Lio/sentry/ILogger;Lio/sentry/util/l$a;)V

    .line 202
    .line 203
    .line 204
    goto :goto_7

    .line 205
    :catchall_3
    move-exception v1

    .line 206
    goto :goto_8

    .line 207
    :goto_5
    :try_start_6
    iget-object v2, p0, Lio/sentry/B;->g:Lio/sentry/ILogger;

    .line 208
    .line 209
    sget-object v3, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 210
    .line 211
    const-string v4, "I/O on file \'%s\' failed."

    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    invoke-interface {v2, v3, v1, v4, v5}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 222
    .line 223
    .line 224
    iget-object v1, p0, Lio/sentry/B;->g:Lio/sentry/ILogger;

    .line 225
    .line 226
    new-instance v2, Lio/sentry/z;

    .line 227
    .line 228
    invoke-direct {v2, p0, p1}, Lio/sentry/z;-><init>(Lio/sentry/B;Ljava/io/File;)V

    .line 229
    .line 230
    .line 231
    goto :goto_4

    .line 232
    :goto_6
    :try_start_7
    iget-object v2, p0, Lio/sentry/B;->g:Lio/sentry/ILogger;

    .line 233
    .line 234
    sget-object v3, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 235
    .line 236
    const-string v4, "File \'%s\' cannot be found."

    .line 237
    .line 238
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    invoke-interface {v2, v3, v1, v4, v5}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 247
    .line 248
    .line 249
    iget-object v1, p0, Lio/sentry/B;->g:Lio/sentry/ILogger;

    .line 250
    .line 251
    new-instance v2, Lio/sentry/z;

    .line 252
    .line 253
    invoke-direct {v2, p0, p1}, Lio/sentry/z;-><init>(Lio/sentry/B;Ljava/io/File;)V

    .line 254
    .line 255
    .line 256
    goto :goto_4

    .line 257
    :goto_7
    return-void

    .line 258
    :goto_8
    iget-object v2, p0, Lio/sentry/B;->g:Lio/sentry/ILogger;

    .line 259
    .line 260
    new-instance v3, Lio/sentry/z;

    .line 261
    .line 262
    invoke-direct {v3, p0, p1}, Lio/sentry/z;-><init>(Lio/sentry/B;Ljava/io/File;)V

    .line 263
    .line 264
    .line 265
    invoke-static {p2, v0, v2, v3}, Lio/sentry/util/l;->j(Lio/sentry/H;Ljava/lang/Class;Lio/sentry/ILogger;Lio/sentry/util/l$a;)V

    .line 266
    .line 267
    .line 268
    throw v1
.end method
