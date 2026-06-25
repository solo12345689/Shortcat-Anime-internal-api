.class public Ldh/c;
.super Ldh/j;


# instance fields
.field private final b:I

.field private final c:Z

.field private d:Ljava/util/List;

.field private e:Ljava/util/List;

.field private final f:J

.field private g:J

.field private h:Ldh/d;


# direct methods
.method private constructor <init>(ILjava/util/List;Ljava/util/List;JJZ)V
    .locals 2

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Ldh/j;-><init>(Z)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Ldh/c;->g:J

    iput p1, p0, Ldh/c;->b:I

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ldh/c;->d:Ljava/util/List;

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ldh/c;->e:Ljava/util/List;

    iput-wide p4, p0, Ldh/c;->g:J

    iput-wide p6, p0, Ldh/c;->f:J

    iput-boolean p8, p0, Ldh/c;->c:Z

    return-void
.end method

.method public constructor <init>(Ldh/k;JJ)V
    .locals 3

    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Ldh/j;-><init>(Z)V

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Ldh/c;->g:J

    iput v0, p0, Ldh/c;->b:I

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ldh/c;->d:Ljava/util/List;

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ldh/c;->e:Ljava/util/List;

    iput-wide p2, p0, Ldh/c;->g:J

    iput-wide p4, p0, Ldh/c;->f:J

    const/4 p1, 0x0

    iput-boolean p1, p0, Ldh/c;->c:Z

    invoke-virtual {p0}, Ldh/c;->j()V

    return-void
.end method

.method public static c(Ljava/lang/Object;)Ldh/c;
    .locals 11

    .line 1
    instance-of v0, p0, Ldh/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ldh/c;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/io/DataInputStream;

    .line 9
    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    move-object v0, p0

    .line 13
    check-cast v0, Ljava/io/DataInputStream;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_3

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readLong()J

    .line 26
    .line 27
    .line 28
    move-result-wide v6

    .line 29
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readLong()J

    .line 30
    .line 31
    .line 32
    move-result-wide v8

    .line 33
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readBoolean()Z

    .line 34
    .line 35
    .line 36
    move-result v10

    .line 37
    new-instance v4, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v5, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    move v1, v0

    .line 49
    :goto_0
    if-ge v1, v3, :cond_1

    .line 50
    .line 51
    invoke-static {p0}, Ldh/k;->i(Ljava/lang/Object;)Ldh/k;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    :goto_1
    add-int/lit8 v1, v3, -0x1

    .line 62
    .line 63
    if-ge v0, v1, :cond_2

    .line 64
    .line 65
    invoke-static {p0}, Ldh/m;->a(Ljava/lang/Object;)Ldh/m;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    add-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    new-instance v2, Ldh/c;

    .line 76
    .line 77
    invoke-direct/range {v2 .. v10}, Ldh/c;-><init>(ILjava/util/List;Ljava/util/List;JJZ)V

    .line 78
    .line 79
    .line 80
    return-object v2

    .line 81
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    const-string v0, "unknown version for hss private key"

    .line 84
    .line 85
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p0

    .line 89
    :cond_4
    instance-of v0, p0, [B

    .line 90
    .line 91
    if-eqz v0, :cond_6

    .line 92
    .line 93
    const/4 v1, 0x0

    .line 94
    :try_start_0
    new-instance v2, Ljava/io/DataInputStream;

    .line 95
    .line 96
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 97
    .line 98
    move-object v3, p0

    .line 99
    check-cast v3, [B

    .line 100
    .line 101
    invoke-direct {v0, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 102
    .line 103
    .line 104
    invoke-direct {v2, v0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 105
    .line 106
    .line 107
    :try_start_1
    invoke-static {v2}, Ldh/c;->c(Ljava/lang/Object;)Ldh/c;

    .line 108
    .line 109
    .line 110
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 112
    .line 113
    .line 114
    return-object p0

    .line 115
    :catchall_0
    move-exception v0

    .line 116
    move-object p0, v0

    .line 117
    move-object v1, v2

    .line 118
    goto :goto_2

    .line 119
    :catch_0
    :try_start_2
    invoke-static {p0}, Ldh/k;->i(Ljava/lang/Object;)Ldh/k;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    new-instance v3, Ldh/c;

    .line 124
    .line 125
    invoke-virtual {v4}, Ldh/k;->g()I

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    int-to-long v5, p0

    .line 130
    invoke-virtual {v4}, Ldh/k;->h()I

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    int-to-long v7, p0

    .line 135
    invoke-direct/range {v3 .. v8}, Ldh/c;-><init>(Ldh/k;JJ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 139
    .line 140
    .line 141
    return-object v3

    .line 142
    :catchall_1
    move-exception v0

    .line 143
    move-object p0, v0

    .line 144
    :goto_2
    if-eqz v1, :cond_5

    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 147
    .line 148
    .line 149
    :cond_5
    throw p0

    .line 150
    :cond_6
    instance-of v0, p0, Ljava/io/InputStream;

    .line 151
    .line 152
    if-eqz v0, :cond_7

    .line 153
    .line 154
    check-cast p0, Ljava/io/InputStream;

    .line 155
    .line 156
    invoke-static {p0}, LQh/a;->c(Ljava/io/InputStream;)[B

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-static {p0}, Ldh/c;->c(Ljava/lang/Object;)Ldh/c;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    return-object p0

    .line 165
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 166
    .line 167
    new-instance v1, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 170
    .line 171
    .line 172
    const-string v2, "cannot parse "

    .line 173
    .line 174
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw v0
.end method

.method public static d([B[B)Ldh/c;
    .locals 0

    .line 1
    invoke-static {p0}, Ldh/c;->c(Ljava/lang/Object;)Ldh/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1}, Ldh/d;->b(Ljava/lang/Object;)Ldh/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Ldh/c;->h:Ldh/d;

    .line 10
    .line 11
    return-object p0
.end method

.method private static i(Ldh/c;)Ldh/c;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ldh/c;->getEncoded()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Ldh/c;->c(Ljava/lang/Object;)Ldh/c;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p0

    .line 10
    :catch_0
    move-exception p0

    .line 11
    new-instance v0, Ljava/lang/RuntimeException;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    throw v0
.end method


# virtual methods
.method public declared-synchronized b()J
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Ldh/c;->g:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-wide v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method protected clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p0}, Ldh/c;->i(Ldh/c;)Ldh/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method declared-synchronized e()Ljava/util/List;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ldh/c;->d:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_7

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eq v1, v2, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    check-cast p1, Ldh/c;

    .line 20
    .line 21
    iget v1, p0, Ldh/c;->b:I

    .line 22
    .line 23
    iget v2, p1, Ldh/c;->b:I

    .line 24
    .line 25
    if-eq v1, v2, :cond_2

    .line 26
    .line 27
    return v0

    .line 28
    :cond_2
    iget-boolean v1, p0, Ldh/c;->c:Z

    .line 29
    .line 30
    iget-boolean v2, p1, Ldh/c;->c:Z

    .line 31
    .line 32
    if-eq v1, v2, :cond_3

    .line 33
    .line 34
    return v0

    .line 35
    :cond_3
    iget-wide v1, p0, Ldh/c;->f:J

    .line 36
    .line 37
    iget-wide v3, p1, Ldh/c;->f:J

    .line 38
    .line 39
    cmp-long v1, v1, v3

    .line 40
    .line 41
    if-eqz v1, :cond_4

    .line 42
    .line 43
    return v0

    .line 44
    :cond_4
    iget-wide v1, p0, Ldh/c;->g:J

    .line 45
    .line 46
    iget-wide v3, p1, Ldh/c;->g:J

    .line 47
    .line 48
    cmp-long v1, v1, v3

    .line 49
    .line 50
    if-eqz v1, :cond_5

    .line 51
    .line 52
    return v0

    .line 53
    :cond_5
    iget-object v1, p0, Ldh/c;->d:Ljava/util/List;

    .line 54
    .line 55
    iget-object v2, p1, Ldh/c;->d:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_6

    .line 62
    .line 63
    return v0

    .line 64
    :cond_6
    iget-object v0, p0, Ldh/c;->e:Ljava/util/List;

    .line 65
    .line 66
    iget-object p1, p1, Ldh/c;->e:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    return p1

    .line 73
    :cond_7
    :goto_0
    return v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Ldh/c;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public declared-synchronized g()Ldh/d;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ldh/d;

    .line 3
    .line 4
    iget v1, p0, Ldh/c;->b:I

    .line 5
    .line 6
    invoke-virtual {p0}, Ldh/c;->h()Ldh/k;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v2}, Ldh/k;->m()Ldh/l;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-direct {v0, v1, v2}, Ldh/d;-><init>(ILdh/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-object v0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v0
.end method

.method public declared-synchronized getEncoded()[B
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {}, Ldh/a;->f()Ldh/a;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Ldh/a;->i(I)Ldh/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Ldh/c;->b:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ldh/a;->i(I)Ldh/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-wide v1, p0, Ldh/c;->g:J

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Ldh/a;->j(J)Ldh/a;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-wide v1, p0, Ldh/c;->f:J

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Ldh/a;->j(J)Ldh/a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-boolean v1, p0, Ldh/c;->c:Z

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ldh/a;->a(Z)Ldh/a;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v1, p0, Ldh/c;->d:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Ldh/k;

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ldh/a;->c(LOh/c;)Ldh/a;

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    goto :goto_2

    .line 59
    :cond_0
    iget-object v1, p0, Ldh/c;->e:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Ldh/m;

    .line 76
    .line 77
    invoke-virtual {v0, v2}, Ldh/a;->c(LOh/c;)Ldh/a;

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-virtual {v0}, Ldh/a;->b()[B

    .line 82
    .line 83
    .line 84
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    monitor-exit p0

    .line 86
    return-object v0

    .line 87
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    throw v0
.end method

.method h()Ldh/k;
    .locals 2

    .line 1
    iget-object v0, p0, Ldh/c;->d:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ldh/k;

    .line 9
    .line 10
    return-object v0
.end method

.method public hashCode()I
    .locals 6

    .line 1
    iget v0, p0, Ldh/c;->b:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-boolean v1, p0, Ldh/c;->c:Z

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    mul-int/lit8 v0, v0, 0x1f

    .line 9
    .line 10
    iget-object v1, p0, Ldh/c;->d:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    add-int/2addr v0, v1

    .line 17
    mul-int/lit8 v0, v0, 0x1f

    .line 18
    .line 19
    iget-object v1, p0, Ldh/c;->e:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    add-int/2addr v0, v1

    .line 26
    mul-int/lit8 v0, v0, 0x1f

    .line 27
    .line 28
    iget-wide v1, p0, Ldh/c;->f:J

    .line 29
    .line 30
    const/16 v3, 0x20

    .line 31
    .line 32
    ushr-long v4, v1, v3

    .line 33
    .line 34
    xor-long/2addr v1, v4

    .line 35
    long-to-int v1, v1

    .line 36
    add-int/2addr v0, v1

    .line 37
    mul-int/lit8 v0, v0, 0x1f

    .line 38
    .line 39
    iget-wide v1, p0, Ldh/c;->g:J

    .line 40
    .line 41
    ushr-long v3, v1, v3

    .line 42
    .line 43
    xor-long/2addr v1, v3

    .line 44
    long-to-int v1, v1

    .line 45
    add-int/2addr v0, v1

    .line 46
    return v0
.end method

.method j()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ldh/c;->e()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    new-array v3, v2, [J

    .line 12
    .line 13
    invoke-virtual {v0}, Ldh/c;->b()J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    const/4 v7, 0x1

    .line 22
    sub-int/2addr v6, v7

    .line 23
    :goto_0
    if-ltz v6, :cond_0

    .line 24
    .line 25
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    check-cast v8, Ldh/k;

    .line 30
    .line 31
    invoke-virtual {v8}, Ldh/k;->n()Ldh/n;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    invoke-virtual {v8}, Ldh/n;->c()I

    .line 36
    .line 37
    .line 38
    move-result v9

    .line 39
    shl-int v9, v7, v9

    .line 40
    .line 41
    sub-int/2addr v9, v7

    .line 42
    int-to-long v9, v9

    .line 43
    and-long/2addr v9, v4

    .line 44
    aput-wide v9, v3, v6

    .line 45
    .line 46
    invoke-virtual {v8}, Ldh/n;->c()I

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    ushr-long/2addr v4, v8

    .line 51
    add-int/lit8 v6, v6, -0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    new-array v4, v4, [Ldh/k;

    .line 59
    .line 60
    invoke-interface {v1, v4}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, [Ldh/k;

    .line 65
    .line 66
    iget-object v5, v0, Ldh/c;->e:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    new-array v6, v6, [Ldh/m;

    .line 73
    .line 74
    invoke-interface {v5, v6}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, [Ldh/m;

    .line 79
    .line 80
    invoke-virtual {v0}, Ldh/c;->h()Ldh/k;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    const/4 v8, 0x0

    .line 85
    aget-object v9, v4, v8

    .line 86
    .line 87
    invoke-virtual {v9}, Ldh/k;->g()I

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    sub-int/2addr v9, v7

    .line 92
    int-to-long v9, v9

    .line 93
    aget-wide v11, v3, v8

    .line 94
    .line 95
    cmp-long v9, v9, v11

    .line 96
    .line 97
    if-eqz v9, :cond_1

    .line 98
    .line 99
    invoke-virtual {v6}, Ldh/k;->n()Ldh/n;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    invoke-virtual {v6}, Ldh/k;->l()Ldh/e;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    aget-wide v11, v3, v8

    .line 108
    .line 109
    long-to-int v11, v11

    .line 110
    invoke-virtual {v6}, Ldh/k;->f()[B

    .line 111
    .line 112
    .line 113
    move-result-object v12

    .line 114
    invoke-virtual {v6}, Ldh/k;->j()[B

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    invoke-static {v9, v10, v11, v12, v6}, Ldh/h;->a(Ldh/n;Ldh/e;I[B[B)Ldh/k;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    aput-object v6, v4, v8

    .line 123
    .line 124
    move v6, v7

    .line 125
    goto :goto_1

    .line 126
    :cond_1
    move v6, v8

    .line 127
    :goto_1
    move v9, v7

    .line 128
    :goto_2
    if-ge v9, v2, :cond_6

    .line 129
    .line 130
    add-int/lit8 v10, v9, -0x1

    .line 131
    .line 132
    aget-object v11, v4, v10

    .line 133
    .line 134
    invoke-virtual {v11}, Ldh/k;->l()Ldh/e;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    invoke-virtual {v12}, Ldh/e;->d()I

    .line 139
    .line 140
    .line 141
    move-result v12

    .line 142
    const/16 v13, 0x10

    .line 143
    .line 144
    new-array v14, v13, [B

    .line 145
    .line 146
    new-array v15, v12, [B

    .line 147
    .line 148
    new-instance v13, Ldh/q;

    .line 149
    .line 150
    invoke-virtual {v11}, Ldh/k;->f()[B

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    invoke-virtual {v11}, Ldh/k;->j()[B

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    invoke-virtual {v11}, Ldh/k;->l()Ldh/e;

    .line 159
    .line 160
    .line 161
    move-result-object v11

    .line 162
    invoke-static {v11}, Ldh/b;->c(Ldh/e;)LFg/j;

    .line 163
    .line 164
    .line 165
    move-result-object v11

    .line 166
    invoke-direct {v13, v8, v7, v11}, Ldh/q;-><init>([B[BLFg/j;)V

    .line 167
    .line 168
    .line 169
    aget-wide v7, v3, v10

    .line 170
    .line 171
    long-to-int v7, v7

    .line 172
    invoke-virtual {v13, v7}, Ldh/q;->e(I)V

    .line 173
    .line 174
    .line 175
    const/4 v7, -0x2

    .line 176
    invoke-virtual {v13, v7}, Ldh/q;->d(I)V

    .line 177
    .line 178
    .line 179
    const/4 v7, 0x1

    .line 180
    invoke-virtual {v13, v15, v7}, Ldh/q;->a([BZ)V

    .line 181
    .line 182
    .line 183
    new-array v8, v12, [B

    .line 184
    .line 185
    const/4 v11, 0x0

    .line 186
    invoke-virtual {v13, v8, v11}, Ldh/q;->a([BZ)V

    .line 187
    .line 188
    .line 189
    const/16 v12, 0x10

    .line 190
    .line 191
    invoke-static {v8, v11, v14, v11, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 192
    .line 193
    .line 194
    add-int/lit8 v8, v2, -0x1

    .line 195
    .line 196
    if-ge v9, v8, :cond_3

    .line 197
    .line 198
    aget-wide v12, v3, v9

    .line 199
    .line 200
    aget-object v8, v4, v9

    .line 201
    .line 202
    invoke-virtual {v8}, Ldh/k;->g()I

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    sub-int/2addr v8, v7

    .line 207
    int-to-long v7, v8

    .line 208
    cmp-long v7, v12, v7

    .line 209
    .line 210
    if-nez v7, :cond_2

    .line 211
    .line 212
    :goto_3
    const/4 v7, 0x1

    .line 213
    goto :goto_4

    .line 214
    :cond_2
    move v7, v11

    .line 215
    goto :goto_4

    .line 216
    :cond_3
    aget-wide v7, v3, v9

    .line 217
    .line 218
    aget-object v12, v4, v9

    .line 219
    .line 220
    invoke-virtual {v12}, Ldh/k;->g()I

    .line 221
    .line 222
    .line 223
    move-result v12

    .line 224
    int-to-long v12, v12

    .line 225
    cmp-long v7, v7, v12

    .line 226
    .line 227
    if-nez v7, :cond_2

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :goto_4
    aget-object v8, v4, v9

    .line 231
    .line 232
    invoke-virtual {v8}, Ldh/k;->f()[B

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    invoke-static {v14, v8}, LOh/a;->c([B[B)Z

    .line 237
    .line 238
    .line 239
    move-result v8

    .line 240
    if-eqz v8, :cond_4

    .line 241
    .line 242
    aget-object v8, v4, v9

    .line 243
    .line 244
    invoke-virtual {v8}, Ldh/k;->j()[B

    .line 245
    .line 246
    .line 247
    move-result-object v8

    .line 248
    invoke-static {v15, v8}, LOh/a;->c([B[B)Z

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    if-eqz v8, :cond_4

    .line 253
    .line 254
    if-nez v7, :cond_5

    .line 255
    .line 256
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    check-cast v6, Ldh/k;

    .line 261
    .line 262
    invoke-virtual {v6}, Ldh/k;->n()Ldh/n;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    check-cast v7, Ldh/k;

    .line 271
    .line 272
    invoke-virtual {v7}, Ldh/k;->l()Ldh/e;

    .line 273
    .line 274
    .line 275
    move-result-object v7

    .line 276
    aget-wide v12, v3, v9

    .line 277
    .line 278
    long-to-int v8, v12

    .line 279
    invoke-static {v6, v7, v8, v14, v15}, Ldh/h;->a(Ldh/n;Ldh/e;I[B[B)Ldh/k;

    .line 280
    .line 281
    .line 282
    move-result-object v6

    .line 283
    aput-object v6, v4, v9

    .line 284
    .line 285
    :goto_5
    const/4 v6, 0x1

    .line 286
    goto :goto_6

    .line 287
    :cond_4
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    check-cast v6, Ldh/k;

    .line 292
    .line 293
    invoke-virtual {v6}, Ldh/k;->n()Ldh/n;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v7

    .line 301
    check-cast v7, Ldh/k;

    .line 302
    .line 303
    invoke-virtual {v7}, Ldh/k;->l()Ldh/e;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    aget-wide v12, v3, v9

    .line 308
    .line 309
    long-to-int v8, v12

    .line 310
    invoke-static {v6, v7, v8, v14, v15}, Ldh/h;->a(Ldh/n;Ldh/e;I[B[B)Ldh/k;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    aput-object v6, v4, v9

    .line 315
    .line 316
    aget-object v7, v4, v10

    .line 317
    .line 318
    invoke-virtual {v6}, Ldh/k;->m()Ldh/l;

    .line 319
    .line 320
    .line 321
    move-result-object v6

    .line 322
    invoke-virtual {v6}, Ldh/l;->c()[B

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    invoke-static {v7, v6}, Ldh/h;->c(Ldh/k;[B)Ldh/m;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    aput-object v6, v5, v10

    .line 331
    .line 332
    goto :goto_5

    .line 333
    :cond_5
    :goto_6
    add-int/lit8 v9, v9, 0x1

    .line 334
    .line 335
    move v8, v11

    .line 336
    const/4 v7, 0x1

    .line 337
    goto/16 :goto_2

    .line 338
    .line 339
    :cond_6
    if-eqz v6, :cond_7

    .line 340
    .line 341
    invoke-virtual {v0, v4, v5}, Ldh/c;->k([Ldh/k;[Ldh/m;)V

    .line 342
    .line 343
    .line 344
    :cond_7
    return-void
.end method

.method protected k([Ldh/k;[Ldh/m;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Ldh/c;->d:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Ldh/c;->e:Ljava/util/List;

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p1
.end method
