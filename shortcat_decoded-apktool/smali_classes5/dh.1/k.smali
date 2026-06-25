.class public Ldh/k;
.super Ldh/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldh/k$a;
    }
.end annotation


# static fields
.field private static l:Ldh/k$a;

.field private static m:[Ldh/k$a;


# instance fields
.field private final b:[B

.field private final c:Ldh/n;

.field private final d:Ldh/e;

.field private final e:I

.field private final f:[B

.field private final g:Ljava/util/Map;

.field private final h:I

.field private final i:LFg/j;

.field private j:I

.field private k:Ldh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ldh/k$a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Ldh/k$a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldh/k;->l:Ldh/k$a;

    .line 8
    .line 9
    const/16 v2, 0x81

    .line 10
    .line 11
    new-array v2, v2, [Ldh/k$a;

    .line 12
    .line 13
    sput-object v2, Ldh/k;->m:[Ldh/k$a;

    .line 14
    .line 15
    aput-object v0, v2, v1

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    :goto_0
    sget-object v1, Ldh/k;->m:[Ldh/k$a;

    .line 19
    .line 20
    array-length v2, v1

    .line 21
    if-ge v0, v2, :cond_0

    .line 22
    .line 23
    new-instance v2, Ldh/k$a;

    .line 24
    .line 25
    invoke-direct {v2, v0}, Ldh/k$a;-><init>(I)V

    .line 26
    .line 27
    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
.end method

.method public constructor <init>(Ldh/n;Ldh/e;I[BI[B)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Ldh/j;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Ldh/k;->c:Ldh/n;

    .line 6
    .line 7
    iput-object p2, p0, Ldh/k;->d:Ldh/e;

    .line 8
    .line 9
    iput p3, p0, Ldh/k;->j:I

    .line 10
    .line 11
    invoke-static {p4}, LOh/a;->f([B)[B

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    iput-object p2, p0, Ldh/k;->b:[B

    .line 16
    .line 17
    iput p5, p0, Ldh/k;->e:I

    .line 18
    .line 19
    invoke-static {p6}, LOh/a;->f([B)[B

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iput-object p2, p0, Ldh/k;->f:[B

    .line 24
    .line 25
    invoke-virtual {p1}, Ldh/n;->c()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    add-int/2addr p2, v0

    .line 30
    shl-int p2, v0, p2

    .line 31
    .line 32
    iput p2, p0, Ldh/k;->h:I

    .line 33
    .line 34
    new-instance p2, Ljava/util/WeakHashMap;

    .line 35
    .line 36
    invoke-direct {p2}, Ljava/util/WeakHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p2, p0, Ldh/k;->g:Ljava/util/Map;

    .line 40
    .line 41
    invoke-static {p1}, Ldh/b;->d(Ldh/n;)LFg/j;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Ldh/k;->i:LFg/j;

    .line 46
    .line 47
    return-void
.end method

.method private b(I)[B
    .locals 5

    .line 1
    invoke-virtual {p0}, Ldh/k;->n()Ldh/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ldh/n;->c()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    shl-int v0, v1, v0

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-lt p1, v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ldh/k;->f()[B

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v3, p0, Ldh/k;->i:LFg/j;

    .line 20
    .line 21
    invoke-static {v1, v3}, Ldh/p;->a([BLFg/j;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Ldh/k;->i:LFg/j;

    .line 25
    .line 26
    invoke-static {p1, v1}, Ldh/p;->c(ILFg/j;)V

    .line 27
    .line 28
    .line 29
    const/16 v1, -0x7d7e

    .line 30
    .line 31
    iget-object v3, p0, Ldh/k;->i:LFg/j;

    .line 32
    .line 33
    invoke-static {v1, v3}, Ldh/p;->b(SLFg/j;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Ldh/k;->l()Ldh/e;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {p0}, Ldh/k;->f()[B

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    sub-int/2addr p1, v0

    .line 45
    invoke-virtual {p0}, Ldh/k;->j()[B

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v1, v3, p1, v0}, Ldh/o;->d(Ldh/e;[BI[B)[B

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object v0, p0, Ldh/k;->i:LFg/j;

    .line 54
    .line 55
    invoke-static {p1, v0}, Ldh/p;->a([BLFg/j;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Ldh/k;->i:LFg/j;

    .line 59
    .line 60
    invoke-interface {p1}, LFg/j;->d()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    new-array p1, p1, [B

    .line 65
    .line 66
    iget-object v0, p0, Ldh/k;->i:LFg/j;

    .line 67
    .line 68
    invoke-interface {v0, p1, v2}, LFg/j;->a([BI)I

    .line 69
    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_0
    mul-int/lit8 v0, p1, 0x2

    .line 73
    .line 74
    invoke-virtual {p0, v0}, Ldh/k;->c(I)[B

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    add-int/2addr v0, v1

    .line 79
    invoke-virtual {p0, v0}, Ldh/k;->c(I)[B

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p0}, Ldh/k;->f()[B

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iget-object v4, p0, Ldh/k;->i:LFg/j;

    .line 88
    .line 89
    invoke-static {v1, v4}, Ldh/p;->a([BLFg/j;)V

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, Ldh/k;->i:LFg/j;

    .line 93
    .line 94
    invoke-static {p1, v1}, Ldh/p;->c(ILFg/j;)V

    .line 95
    .line 96
    .line 97
    const/16 p1, -0x7c7d

    .line 98
    .line 99
    iget-object v1, p0, Ldh/k;->i:LFg/j;

    .line 100
    .line 101
    invoke-static {p1, v1}, Ldh/p;->b(SLFg/j;)V

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Ldh/k;->i:LFg/j;

    .line 105
    .line 106
    invoke-static {v3, p1}, Ldh/p;->a([BLFg/j;)V

    .line 107
    .line 108
    .line 109
    iget-object p1, p0, Ldh/k;->i:LFg/j;

    .line 110
    .line 111
    invoke-static {v0, p1}, Ldh/p;->a([BLFg/j;)V

    .line 112
    .line 113
    .line 114
    iget-object p1, p0, Ldh/k;->i:LFg/j;

    .line 115
    .line 116
    invoke-interface {p1}, LFg/j;->d()I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    new-array p1, p1, [B

    .line 121
    .line 122
    iget-object v0, p0, Ldh/k;->i:LFg/j;

    .line 123
    .line 124
    invoke-interface {v0, p1, v2}, LFg/j;->a([BI)I

    .line 125
    .line 126
    .line 127
    return-object p1
.end method

.method private d(Ldh/k$a;)[B
    .locals 3

    .line 1
    iget-object v0, p0, Ldh/k;->g:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ldh/k;->g:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, [B

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    :goto_0
    monitor-exit v0

    .line 15
    return-object v1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-static {p1}, Ldh/k$a;->a(Ldh/k$a;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-direct {p0, v1}, Ldh/k;->b(I)[B

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, p0, Ldh/k;->g:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    throw p1
.end method

.method public static i(Ljava/lang/Object;)Ldh/k;
    .locals 8

    .line 1
    instance-of v0, p0, Ldh/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ldh/k;

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
    check-cast p0, Ljava/io/DataInputStream;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_3

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-static {v0}, Ldh/n;->e(I)Ldh/n;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-static {v0}, Ldh/e;->f(I)Ldh/e;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    const/16 v0, 0x10

    .line 37
    .line 38
    new-array v5, v0, [B

    .line 39
    .line 40
    invoke-virtual {p0, v5}, Ljava/io/DataInputStream;->readFully([B)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-ltz v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-gt v0, v1, :cond_1

    .line 62
    .line 63
    new-array v7, v0, [B

    .line 64
    .line 65
    invoke-virtual {p0, v7}, Ljava/io/DataInputStream;->readFully([B)V

    .line 66
    .line 67
    .line 68
    new-instance v1, Ldh/k;

    .line 69
    .line 70
    invoke-direct/range {v1 .. v7}, Ldh/k;-><init>(Ldh/n;Ldh/e;I[BI[B)V

    .line 71
    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 75
    .line 76
    new-instance v1, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    const-string v2, "secret length exceeded "

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v0

    .line 101
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 102
    .line 103
    const-string v0, "secret length less than zero"

    .line 104
    .line 105
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p0

    .line 109
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 110
    .line 111
    const-string v0, "expected version 0 lms private key"

    .line 112
    .line 113
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw p0

    .line 117
    :cond_4
    instance-of v0, p0, [B

    .line 118
    .line 119
    if-eqz v0, :cond_6

    .line 120
    .line 121
    const/4 v1, 0x0

    .line 122
    :try_start_0
    new-instance v2, Ljava/io/DataInputStream;

    .line 123
    .line 124
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 125
    .line 126
    check-cast p0, [B

    .line 127
    .line 128
    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 129
    .line 130
    .line 131
    invoke-direct {v2, v0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 132
    .line 133
    .line 134
    :try_start_1
    invoke-static {v2}, Ldh/k;->i(Ljava/lang/Object;)Ldh/k;

    .line 135
    .line 136
    .line 137
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 138
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 139
    .line 140
    .line 141
    return-object p0

    .line 142
    :catchall_0
    move-exception v0

    .line 143
    move-object p0, v0

    .line 144
    move-object v1, v2

    .line 145
    goto :goto_0

    .line 146
    :catchall_1
    move-exception v0

    .line 147
    move-object p0, v0

    .line 148
    :goto_0
    if-eqz v1, :cond_5

    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 151
    .line 152
    .line 153
    :cond_5
    throw p0

    .line 154
    :cond_6
    instance-of v0, p0, Ljava/io/InputStream;

    .line 155
    .line 156
    if-eqz v0, :cond_7

    .line 157
    .line 158
    check-cast p0, Ljava/io/InputStream;

    .line 159
    .line 160
    invoke-static {p0}, LQh/a;->c(Ljava/io/InputStream;)[B

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-static {p0}, Ldh/k;->i(Ljava/lang/Object;)Ldh/k;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    return-object p0

    .line 169
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 170
    .line 171
    new-instance v1, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 174
    .line 175
    .line 176
    const-string v2, "cannot parse "

    .line 177
    .line 178
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw v0
.end method


# virtual methods
.method c(I)[B
    .locals 2

    .line 1
    iget v0, p0, Ldh/k;->h:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Ldh/k;->m:[Ldh/k$a;

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    if-ge p1, v1, :cond_0

    .line 9
    .line 10
    aget-object p1, v0, p1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Ldh/k$a;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Ldh/k$a;-><init>(I)V

    .line 16
    .line 17
    .line 18
    move-object p1, v0

    .line 19
    :goto_0
    invoke-direct {p0, p1}, Ldh/k;->d(Ldh/k$a;)[B

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_1
    invoke-direct {p0, p1}, Ldh/k;->b(I)[B

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public e()Ldh/i;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ldh/k;->n()Ldh/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ldh/n;->c()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Ldh/k;->g()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p0}, Ldh/k;->k()Ldh/f;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x1

    .line 18
    shl-int v4, v3, v0

    .line 19
    .line 20
    add-int/2addr v4, v1

    .line 21
    new-array v1, v0, [[B

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    :goto_0
    if-ge v5, v0, :cond_0

    .line 25
    .line 26
    shl-int v6, v3, v5

    .line 27
    .line 28
    div-int v6, v4, v6

    .line 29
    .line 30
    xor-int/2addr v6, v3

    .line 31
    invoke-virtual {p0, v6}, Ldh/k;->c(I)[B

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    aput-object v6, v1, v5

    .line 36
    .line 37
    add-int/lit8 v5, v5, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p0}, Ldh/k;->n()Ldh/n;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v2, v0, v1}, Ldh/f;->e(Ldh/n;[[B)Ldh/i;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_a

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eq v2, v3, :cond_1

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_1
    check-cast p1, Ldh/k;

    .line 20
    .line 21
    iget v2, p0, Ldh/k;->j:I

    .line 22
    .line 23
    iget v3, p1, Ldh/k;->j:I

    .line 24
    .line 25
    if-eq v2, v3, :cond_2

    .line 26
    .line 27
    return v1

    .line 28
    :cond_2
    iget v2, p0, Ldh/k;->e:I

    .line 29
    .line 30
    iget v3, p1, Ldh/k;->e:I

    .line 31
    .line 32
    if-eq v2, v3, :cond_3

    .line 33
    .line 34
    return v1

    .line 35
    :cond_3
    iget-object v2, p0, Ldh/k;->b:[B

    .line 36
    .line 37
    iget-object v3, p1, Ldh/k;->b:[B

    .line 38
    .line 39
    invoke-static {v2, v3}, LOh/a;->c([B[B)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_4

    .line 44
    .line 45
    return v1

    .line 46
    :cond_4
    iget-object v2, p0, Ldh/k;->c:Ldh/n;

    .line 47
    .line 48
    if-eqz v2, :cond_5

    .line 49
    .line 50
    iget-object v3, p1, Ldh/k;->c:Ldh/n;

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_6

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_5
    iget-object v2, p1, Ldh/k;->c:Ldh/n;

    .line 60
    .line 61
    if-eqz v2, :cond_6

    .line 62
    .line 63
    :goto_0
    return v1

    .line 64
    :cond_6
    iget-object v2, p0, Ldh/k;->d:Ldh/e;

    .line 65
    .line 66
    if-eqz v2, :cond_7

    .line 67
    .line 68
    iget-object v3, p1, Ldh/k;->d:Ldh/e;

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_8

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_7
    iget-object v2, p1, Ldh/k;->d:Ldh/e;

    .line 78
    .line 79
    if-eqz v2, :cond_8

    .line 80
    .line 81
    :goto_1
    return v1

    .line 82
    :cond_8
    iget-object v2, p0, Ldh/k;->f:[B

    .line 83
    .line 84
    iget-object p1, p1, Ldh/k;->f:[B

    .line 85
    .line 86
    invoke-static {v2, p1}, LOh/a;->c([B[B)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-nez p1, :cond_9

    .line 91
    .line 92
    return v1

    .line 93
    :cond_9
    return v0

    .line 94
    :cond_a
    :goto_2
    return v1
.end method

.method public f()[B
    .locals 1

    .line 1
    iget-object v0, p0, Ldh/k;->b:[B

    .line 2
    .line 3
    invoke-static {v0}, LOh/a;->f([B)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public declared-synchronized g()I
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Ldh/k;->j:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return v0

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

.method public getEncoded()[B
    .locals 2

    .line 1
    invoke-static {}, Ldh/a;->f()Ldh/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Ldh/a;->i(I)Ldh/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Ldh/k;->c:Ldh/n;

    .line 11
    .line 12
    invoke-virtual {v1}, Ldh/n;->f()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Ldh/a;->i(I)Ldh/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Ldh/k;->d:Ldh/e;

    .line 21
    .line 22
    invoke-virtual {v1}, Ldh/e;->g()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0, v1}, Ldh/a;->i(I)Ldh/a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Ldh/k;->b:[B

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ldh/a;->d([B)Ldh/a;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget v1, p0, Ldh/k;->j:I

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ldh/a;->i(I)Ldh/a;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget v1, p0, Ldh/k;->e:I

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ldh/a;->i(I)Ldh/a;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, p0, Ldh/k;->f:[B

    .line 49
    .line 50
    array-length v1, v1

    .line 51
    invoke-virtual {v0, v1}, Ldh/a;->i(I)Ldh/a;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v1, p0, Ldh/k;->f:[B

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ldh/a;->d([B)Ldh/a;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Ldh/a;->b()[B

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Ldh/k;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Ldh/k;->j:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-object v1, p0, Ldh/k;->b:[B

    .line 6
    .line 7
    invoke-static {v1}, LOh/a;->q([B)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/2addr v0, v1

    .line 12
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object v1, p0, Ldh/k;->c:Ldh/n;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v1, v2

    .line 25
    :goto_0
    add-int/2addr v0, v1

    .line 26
    mul-int/lit8 v0, v0, 0x1f

    .line 27
    .line 28
    iget-object v1, p0, Ldh/k;->d:Ldh/e;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    :cond_1
    add-int/2addr v0, v2

    .line 37
    mul-int/lit8 v0, v0, 0x1f

    .line 38
    .line 39
    iget v1, p0, Ldh/k;->e:I

    .line 40
    .line 41
    add-int/2addr v0, v1

    .line 42
    mul-int/lit8 v0, v0, 0x1f

    .line 43
    .line 44
    iget-object v1, p0, Ldh/k;->f:[B

    .line 45
    .line 46
    invoke-static {v1}, LOh/a;->q([B)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    add-int/2addr v0, v1

    .line 51
    return v0
.end method

.method public j()[B
    .locals 1

    .line 1
    iget-object v0, p0, Ldh/k;->f:[B

    .line 2
    .line 3
    invoke-static {v0}, LOh/a;->f([B)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method k()Ldh/f;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Ldh/k;->j:I

    .line 3
    .line 4
    iget v1, p0, Ldh/k;->e:I

    .line 5
    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Ldh/f;

    .line 9
    .line 10
    iget-object v2, p0, Ldh/k;->d:Ldh/e;

    .line 11
    .line 12
    iget-object v3, p0, Ldh/k;->b:[B

    .line 13
    .line 14
    iget-object v4, p0, Ldh/k;->f:[B

    .line 15
    .line 16
    invoke-direct {v1, v2, v3, v0, v4}, Ldh/f;-><init>(Ldh/e;[BI[B)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ldh/k;->o()V

    .line 20
    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-object v1

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v0, LWg/a;

    .line 27
    .line 28
    const-string v1, "ots private key exhausted"

    .line 29
    .line 30
    invoke-direct {v0, v1}, LWg/a;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    throw v0
.end method

.method public l()Ldh/e;
    .locals 1

    .line 1
    iget-object v0, p0, Ldh/k;->d:Ldh/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public m()Ldh/l;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ldh/k;->k:Ldh/l;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Ldh/l;

    .line 7
    .line 8
    iget-object v1, p0, Ldh/k;->c:Ldh/n;

    .line 9
    .line 10
    iget-object v2, p0, Ldh/k;->d:Ldh/e;

    .line 11
    .line 12
    sget-object v3, Ldh/k;->l:Ldh/k$a;

    .line 13
    .line 14
    invoke-direct {p0, v3}, Ldh/k;->d(Ldh/k$a;)[B

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    iget-object v4, p0, Ldh/k;->b:[B

    .line 19
    .line 20
    invoke-direct {v0, v1, v2, v3, v4}, Ldh/l;-><init>(Ldh/n;Ldh/e;[B[B)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Ldh/k;->k:Ldh/l;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    iget-object v0, p0, Ldh/k;->k:Ldh/l;

    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return-object v0

    .line 32
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    throw v0
.end method

.method public n()Ldh/n;
    .locals 1

    .line 1
    iget-object v0, p0, Ldh/k;->c:Ldh/n;

    .line 2
    .line 3
    return-object v0
.end method

.method declared-synchronized o()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Ldh/k;->j:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Ldh/k;->j:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw v0
.end method
