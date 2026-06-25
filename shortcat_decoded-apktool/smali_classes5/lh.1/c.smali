.class Llh/c;
.super Ljava/security/SecureRandom;


# instance fields
.field private a:[B

.field private b:[B

.field private c:[B

.field private d:LFg/j;


# direct methods
.method public constructor <init>([BLFg/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/security/SecureRandom;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llh/c;->a:[B

    .line 5
    .line 6
    iput-object p2, p0, Llh/c;->d:LFg/j;

    .line 7
    .line 8
    const/16 p1, 0x100

    .line 9
    .line 10
    invoke-direct {p0, p1}, Llh/c;->c(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private a([B[B[B)V
    .locals 8

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    const/4 v4, 0x3

    .line 8
    if-ge v3, v4, :cond_2

    .line 9
    .line 10
    const/16 v4, 0xf

    .line 11
    .line 12
    :goto_1
    if-ltz v4, :cond_1

    .line 13
    .line 14
    aget-byte v5, p3, v4

    .line 15
    .line 16
    and-int/lit16 v6, v5, 0xff

    .line 17
    .line 18
    const/16 v7, 0xff

    .line 19
    .line 20
    if-ne v6, v7, :cond_0

    .line 21
    .line 22
    aput-byte v2, p3, v4

    .line 23
    .line 24
    add-int/lit8 v4, v4, -0x1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 28
    .line 29
    int-to-byte v5, v5

    .line 30
    aput-byte v5, p3, v4

    .line 31
    .line 32
    :cond_1
    mul-int/lit8 v4, v3, 0x10

    .line 33
    .line 34
    invoke-direct {p0, p2, p3, v1, v4}, Llh/c;->b([B[B[BI)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    if-eqz p1, :cond_3

    .line 41
    .line 42
    move v3, v2

    .line 43
    :goto_2
    if-ge v3, v0, :cond_3

    .line 44
    .line 45
    aget-byte v4, v1, v3

    .line 46
    .line 47
    aget-byte v5, p1, v3

    .line 48
    .line 49
    xor-int/2addr v4, v5

    .line 50
    int-to-byte v4, v4

    .line 51
    aput-byte v4, v1, v3

    .line 52
    .line 53
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    array-length p1, p2

    .line 57
    invoke-static {v1, v2, p2, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    const/16 p1, 0x20

    .line 61
    .line 62
    array-length p2, p3

    .line 63
    invoke-static {v1, p1, p3, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method private b([B[B[BI)V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, LIg/a;

    .line 2
    .line 3
    invoke-direct {v0}, LIg/a;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LKg/f;

    .line 7
    .line 8
    invoke-direct {v1, p1}, LKg/f;-><init>([B)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {v0, p1, v1}, LIg/a;->i(ZLFg/b;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    :goto_0
    array-length v1, p2

    .line 17
    if-eq p1, v1, :cond_0

    .line 18
    .line 19
    add-int v1, p4, p1

    .line 20
    .line 21
    invoke-virtual {v0, p2, p1, p3, v1}, LIg/a;->l([BI[BI)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x10

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    return-void

    .line 30
    :goto_1
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    new-instance p3, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string p4, "drbg failure: "

    .line 38
    .line 39
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p4

    .line 46
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    throw p2
.end method

.method private c(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Llh/c;->a:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/16 v2, 0x30

    .line 5
    .line 6
    if-lt v1, v2, :cond_0

    .line 7
    .line 8
    invoke-direct {p0, v0, p1}, Llh/c;->d([BI)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v1, p0, Llh/c;->d:LFg/j;

    .line 13
    .line 14
    array-length v3, v0

    .line 15
    sub-int/2addr v2, v3

    .line 16
    invoke-static {v1, v0, v2}, Llh/i;->g(LFg/j;[BI)[B

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Llh/c;->a:[B

    .line 21
    .line 22
    invoke-static {v1, v0}, LOh/a;->h([B[B)[B

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-direct {p0, v0, p1}, Llh/c;->d([BI)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private d([BI)V
    .locals 2

    .line 1
    const/16 p2, 0x30

    .line 2
    .line 3
    new-array v0, p2, [B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {p1, v1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 7
    .line 8
    .line 9
    const/16 p1, 0x20

    .line 10
    .line 11
    new-array p1, p1, [B

    .line 12
    .line 13
    iput-object p1, p0, Llh/c;->b:[B

    .line 14
    .line 15
    const/16 p2, 0x10

    .line 16
    .line 17
    new-array p2, p2, [B

    .line 18
    .line 19
    iput-object p2, p0, Llh/c;->c:[B

    .line 20
    .line 21
    invoke-direct {p0, v0, p1, p2}, Llh/c;->a([B[B[B)V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public nextBytes([B)V
    .locals 11

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    array-length v2, p1

    .line 6
    const/4 v3, 0x0

    .line 7
    move v4, v3

    .line 8
    :goto_0
    if-lez v2, :cond_3

    .line 9
    .line 10
    const/16 v5, 0xf

    .line 11
    .line 12
    move v6, v5

    .line 13
    :goto_1
    if-ltz v6, :cond_1

    .line 14
    .line 15
    iget-object v7, p0, Llh/c;->c:[B

    .line 16
    .line 17
    aget-byte v8, v7, v6

    .line 18
    .line 19
    and-int/lit16 v9, v8, 0xff

    .line 20
    .line 21
    const/16 v10, 0xff

    .line 22
    .line 23
    if-ne v9, v10, :cond_0

    .line 24
    .line 25
    aput-byte v3, v7, v6

    .line 26
    .line 27
    add-int/lit8 v6, v6, -0x1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    add-int/lit8 v8, v8, 0x1

    .line 31
    .line 32
    int-to-byte v8, v8

    .line 33
    aput-byte v8, v7, v6

    .line 34
    .line 35
    :cond_1
    iget-object v6, p0, Llh/c;->b:[B

    .line 36
    .line 37
    iget-object v7, p0, Llh/c;->c:[B

    .line 38
    .line 39
    invoke-direct {p0, v6, v7, v1, v3}, Llh/c;->b([B[B[BI)V

    .line 40
    .line 41
    .line 42
    if-le v2, v5, :cond_2

    .line 43
    .line 44
    invoke-static {v1, v3, p1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v4, v4, 0x10

    .line 48
    .line 49
    add-int/lit8 v2, v2, -0x10

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-static {v1, v3, p1, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 53
    .line 54
    .line 55
    move v2, v3

    .line 56
    goto :goto_0

    .line 57
    :cond_3
    iget-object p1, p0, Llh/c;->b:[B

    .line 58
    .line 59
    iget-object v0, p0, Llh/c;->c:[B

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    invoke-direct {p0, v1, p1, v0}, Llh/c;->a([B[B[B)V

    .line 63
    .line 64
    .line 65
    return-void
.end method
