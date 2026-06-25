.class public final Lsh/y;
.super Lsh/p;

# interfaces
.implements LOh/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsh/y$b;
    }
.end annotation


# instance fields
.field private final c:Lsh/x;

.field private final d:[B

.field private final e:[B

.field private final f:[B

.field private final g:[B

.field private volatile h:Lsh/a;


# direct methods
.method private constructor <init>(Lsh/y$b;)V
    .locals 8

    .line 1
    invoke-static {p1}, Lsh/y$b;->a(Lsh/y$b;)Lsh/x;

    move-result-object v0

    invoke-virtual {v0}, Lsh/x;->f()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0}, Lsh/p;-><init>(ZLjava/lang/String;)V

    invoke-static {p1}, Lsh/y$b;->a(Lsh/y$b;)Lsh/x;

    move-result-object v3

    iput-object v3, p0, Lsh/y;->c:Lsh/x;

    if-eqz v3, :cond_f

    invoke-virtual {v3}, Lsh/x;->h()I

    move-result v0

    invoke-static {p1}, Lsh/y$b;->b(Lsh/y$b;)[B

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v3}, Lsh/x;->b()I

    move-result v1

    const/4 v3, 0x0

    invoke-static {v2, v3}, LOh/g;->a([BI)I

    move-result v3

    int-to-long v4, v3

    invoke-static {v1, v4, v5}, Lsh/A;->l(IJ)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    invoke-static {v2, v1, v0}, Lsh/A;->g([BII)[B

    move-result-object v4

    iput-object v4, p0, Lsh/y;->d:[B

    add-int/2addr v1, v0

    invoke-static {v2, v1, v0}, Lsh/A;->g([BII)[B

    move-result-object v4

    iput-object v4, p0, Lsh/y;->e:[B

    add-int/2addr v1, v0

    invoke-static {v2, v1, v0}, Lsh/A;->g([BII)[B

    move-result-object v4

    iput-object v4, p0, Lsh/y;->f:[B

    add-int/2addr v1, v0

    invoke-static {v2, v1, v0}, Lsh/A;->g([BII)[B

    move-result-object v4

    iput-object v4, p0, Lsh/y;->g:[B

    add-int/2addr v1, v0

    array-length v0, v2

    sub-int/2addr v0, v1

    invoke-static {v2, v1, v0}, Lsh/A;->g([BII)[B

    move-result-object v0

    :try_start_0
    const-class v1, Lsh/a;

    invoke-static {v0, v1}, Lsh/A;->f([BLjava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsh/a;

    invoke-virtual {v0}, Lsh/a;->b()I

    move-result v1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lsh/y$b;->a(Lsh/y$b;)Lsh/x;

    move-result-object p1

    invoke-virtual {p1}, Lsh/x;->g()Lzg/t;

    move-result-object p1

    invoke-virtual {v0, p1}, Lsh/a;->h(Lzg/t;)Lsh/a;

    move-result-object p1

    iput-object p1, p0, Lsh/y;->h:Lsh/a;

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :catch_1
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "serialized BDS has wrong index"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "index out of bounds"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lsh/y$b;->c(Lsh/y$b;)[B

    move-result-object v5

    if-eqz v5, :cond_4

    array-length v2, v5

    if-ne v2, v0, :cond_3

    iput-object v5, p0, Lsh/y;->d:[B

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "size of secretKeySeed needs to be equal size of digest"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-array v2, v0, [B

    iput-object v2, p0, Lsh/y;->d:[B

    :goto_2
    invoke-static {p1}, Lsh/y$b;->d(Lsh/y$b;)[B

    move-result-object v2

    if-eqz v2, :cond_6

    array-length v4, v2

    if-ne v4, v0, :cond_5

    iput-object v2, p0, Lsh/y;->e:[B

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "size of secretKeyPRF needs to be equal size of digest"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-array v2, v0, [B

    iput-object v2, p0, Lsh/y;->e:[B

    :goto_3
    invoke-static {p1}, Lsh/y$b;->e(Lsh/y$b;)[B

    move-result-object v4

    if-eqz v4, :cond_8

    array-length v2, v4

    if-ne v2, v0, :cond_7

    iput-object v4, p0, Lsh/y;->f:[B

    goto :goto_4

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "size of publicSeed needs to be equal size of digest"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-array v2, v0, [B

    iput-object v2, p0, Lsh/y;->f:[B

    :goto_4
    invoke-static {p1}, Lsh/y$b;->f(Lsh/y$b;)[B

    move-result-object v2

    if-eqz v2, :cond_a

    array-length v6, v2

    if-ne v6, v0, :cond_9

    iput-object v2, p0, Lsh/y;->g:[B

    goto :goto_5

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "size of root needs to be equal size of digest"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-array v0, v0, [B

    iput-object v0, p0, Lsh/y;->g:[B

    :goto_5
    invoke-static {p1}, Lsh/y$b;->g(Lsh/y$b;)Lsh/a;

    move-result-object v0

    if-eqz v0, :cond_b

    :goto_6
    iput-object v0, p0, Lsh/y;->h:Lsh/a;

    goto :goto_7

    :cond_b
    invoke-static {p1}, Lsh/y$b;->h(Lsh/y$b;)I

    move-result v0

    invoke-virtual {v3}, Lsh/x;->b()I

    move-result v2

    shl-int v2, v1, v2

    add-int/lit8 v2, v2, -0x2

    if-ge v0, v2, :cond_c

    if-eqz v4, :cond_c

    if-eqz v5, :cond_c

    new-instance v2, Lsh/a;

    new-instance v0, Lsh/j$b;

    invoke-direct {v0}, Lsh/j$b;-><init>()V

    invoke-virtual {v0}, Lsh/j$b;->l()Lsh/o;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lsh/j;

    invoke-static {p1}, Lsh/y$b;->h(Lsh/y$b;)I

    move-result v7

    invoke-direct/range {v2 .. v7}, Lsh/a;-><init>(Lsh/x;[B[BLsh/j;I)V

    iput-object v2, p0, Lsh/y;->h:Lsh/a;

    goto :goto_7

    :cond_c
    new-instance v0, Lsh/a;

    invoke-virtual {v3}, Lsh/x;->b()I

    move-result v2

    shl-int v2, v1, v2

    sub-int/2addr v2, v1

    invoke-static {p1}, Lsh/y$b;->h(Lsh/y$b;)I

    move-result v1

    invoke-direct {v0, v3, v2, v1}, Lsh/a;-><init>(Lsh/x;II)V

    goto :goto_6

    :goto_7
    invoke-static {p1}, Lsh/y$b;->i(Lsh/y$b;)I

    move-result v0

    if-ltz v0, :cond_e

    invoke-static {p1}, Lsh/y$b;->i(Lsh/y$b;)I

    move-result p1

    iget-object v0, p0, Lsh/y;->h:Lsh/a;

    invoke-virtual {v0}, Lsh/a;->c()I

    move-result v0

    if-ne p1, v0, :cond_d

    goto :goto_8

    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "maxIndex set but not reflected in state"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    :goto_8
    return-void

    :cond_f
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "params == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method synthetic constructor <init>(Lsh/y$b;Lsh/y$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lsh/y;-><init>(Lsh/y$b;)V

    return-void
.end method


# virtual methods
.method public c()Lsh/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lsh/y;->c:Lsh/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()[B
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lsh/y;->c:Lsh/x;

    .line 3
    .line 4
    invoke-virtual {v0}, Lsh/x;->h()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    add-int/lit8 v1, v0, 0x4

    .line 9
    .line 10
    add-int/2addr v1, v0

    .line 11
    add-int/2addr v1, v0

    .line 12
    add-int/2addr v1, v0

    .line 13
    new-array v1, v1, [B

    .line 14
    .line 15
    iget-object v2, p0, Lsh/y;->h:Lsh/a;

    .line 16
    .line 17
    invoke-virtual {v2}, Lsh/a;->b()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static {v2, v1, v3}, LOh/g;->c(I[BI)V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lsh/y;->d:[B

    .line 26
    .line 27
    const/4 v3, 0x4

    .line 28
    invoke-static {v1, v2, v3}, Lsh/A;->e([B[BI)V

    .line 29
    .line 30
    .line 31
    add-int/2addr v3, v0

    .line 32
    iget-object v2, p0, Lsh/y;->e:[B

    .line 33
    .line 34
    invoke-static {v1, v2, v3}, Lsh/A;->e([B[BI)V

    .line 35
    .line 36
    .line 37
    add-int/2addr v3, v0

    .line 38
    iget-object v2, p0, Lsh/y;->f:[B

    .line 39
    .line 40
    invoke-static {v1, v2, v3}, Lsh/A;->e([B[BI)V

    .line 41
    .line 42
    .line 43
    add-int/2addr v3, v0

    .line 44
    iget-object v0, p0, Lsh/y;->g:[B

    .line 45
    .line 46
    invoke-static {v1, v0, v3}, Lsh/A;->e([B[BI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    :try_start_1
    iget-object v0, p0, Lsh/y;->h:Lsh/a;

    .line 50
    .line 51
    invoke-static {v0}, Lsh/A;->p(Ljava/lang/Object;)[B

    .line 52
    .line 53
    .line 54
    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    :try_start_2
    invoke-static {v1, v0}, LOh/a;->h([B[B)[B

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    monitor-exit p0

    .line 60
    return-object v0

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    goto :goto_0

    .line 63
    :catch_0
    move-exception v0

    .line 64
    new-instance v1, Ljava/lang/RuntimeException;

    .line 65
    .line 66
    new-instance v2, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    const-string v3, "error serializing bds state: "

    .line 72
    .line 73
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v1

    .line 91
    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 92
    throw v0
.end method

.method public getEncoded()[B
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lsh/y;->d()[B

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    monitor-exit p0

    .line 7
    return-object v0

    .line 8
    :catchall_0
    move-exception v0

    .line 9
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v0
.end method
