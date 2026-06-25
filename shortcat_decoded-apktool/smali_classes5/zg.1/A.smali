.class public Lzg/A;
.super Lzg/y;


# static fields
.field static final c:Lzg/L;

.field private static final d:Ljava/util/concurrent/ConcurrentMap;


# instance fields
.field private final a:[B

.field private b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lzg/A$a;

    .line 2
    .line 3
    const-class v1, Lzg/A;

    .line 4
    .line 5
    const/16 v2, 0xd

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lzg/A$a;-><init>(Ljava/lang/Class;I)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lzg/A;->c:Lzg/L;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lzg/A;->d:Ljava/util/concurrent/ConcurrentMap;

    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>([BLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lzg/y;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzg/A;->a:[B

    .line 5
    .line 6
    iput-object p2, p0, Lzg/A;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method static A([BZ)Lzg/A;
    .locals 2

    .line 1
    array-length v0, p0

    .line 2
    invoke-static {v0}, Lzg/A;->y(I)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lzg/t$b;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lzg/t$b;-><init>([B)V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lzg/A;->d:Ljava/util/concurrent/ConcurrentMap;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lzg/A;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    invoke-static {p0}, Lzg/A;->D([B)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    new-instance v0, Lzg/A;

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-static {p0}, LOh/a;->f([B)[B

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :cond_1
    const/4 p1, 0x0

    .line 36
    invoke-direct {v0, p0, p1}, Lzg/A;-><init>([BLjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 41
    .line 42
    const-string p1, "invalid relative OID contents"

    .line 43
    .line 44
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p0
.end method

.method static D([B)Z
    .locals 5

    .line 1
    const-string v0, "org.bouncycastle.asn1.allow_wrong_oid_enc"

    .line 2
    .line 3
    invoke-static {v0}, LOh/h;->b(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    array-length v0, p0

    .line 12
    const/4 v2, 0x0

    .line 13
    if-ge v0, v1, :cond_1

    .line 14
    .line 15
    return v2

    .line 16
    :cond_1
    move v3, v1

    .line 17
    move v0, v2

    .line 18
    :goto_0
    array-length v4, p0

    .line 19
    if-ge v0, v4, :cond_4

    .line 20
    .line 21
    const/16 v4, 0x80

    .line 22
    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    aget-byte v3, p0, v0

    .line 26
    .line 27
    and-int/lit16 v3, v3, 0xff

    .line 28
    .line 29
    if-ne v3, v4, :cond_2

    .line 30
    .line 31
    return v2

    .line 32
    :cond_2
    aget-byte v3, p0, v0

    .line 33
    .line 34
    and-int/2addr v3, v4

    .line 35
    if-nez v3, :cond_3

    .line 36
    .line 37
    move v3, v1

    .line 38
    goto :goto_1

    .line 39
    :cond_3
    move v3, v2

    .line 40
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    return v3
.end method

.method static F(Ljava/lang/String;I)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    add-int/lit8 v3, v0, -0x1

    .line 8
    .line 9
    const/16 v4, 0x30

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    if-lt v3, p1, :cond_4

    .line 13
    .line 14
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v6

    .line 18
    const/16 v7, 0x2e

    .line 19
    .line 20
    if-ne v6, v7, :cond_2

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    if-le v2, v5, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-ne v0, v4, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    move v2, v1

    .line 34
    goto :goto_2

    .line 35
    :cond_1
    :goto_1
    return v1

    .line 36
    :cond_2
    if-gt v4, v6, :cond_3

    .line 37
    .line 38
    const/16 v0, 0x39

    .line 39
    .line 40
    if-gt v6, v0, :cond_3

    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    :goto_2
    move v0, v3

    .line 45
    goto :goto_0

    .line 46
    :cond_3
    return v1

    .line 47
    :cond_4
    if-eqz v2, :cond_6

    .line 48
    .line 49
    if-le v2, v5, :cond_5

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-ne p0, v4, :cond_5

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_5
    return v5

    .line 59
    :cond_6
    :goto_3
    return v1
.end method

.method static G([B)Ljava/lang/String;
    .locals 15

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x1

    .line 8
    const/4 v6, 0x0

    .line 9
    move-object v10, v4

    .line 10
    move v7, v6

    .line 11
    const-wide/16 v8, 0x0

    .line 12
    .line 13
    :goto_0
    array-length v11, p0

    .line 14
    if-eq v7, v11, :cond_6

    .line 15
    .line 16
    aget-byte v11, p0, v7

    .line 17
    .line 18
    const-wide v12, 0xffffffffffff80L

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long v12, v8, v12

    .line 24
    .line 25
    const/4 v13, 0x7

    .line 26
    const/16 v14, 0x2e

    .line 27
    .line 28
    if-gtz v12, :cond_2

    .line 29
    .line 30
    and-int/lit8 v12, v11, 0x7f

    .line 31
    .line 32
    int-to-long v2, v12

    .line 33
    add-long/2addr v8, v2

    .line 34
    and-int/lit16 v2, v11, 0x80

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    if-eqz v5, :cond_0

    .line 39
    .line 40
    move v5, v6

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    :goto_1
    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    :goto_2
    const-wide/16 v8, 0x0

    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_1
    shl-long/2addr v8, v13

    .line 52
    goto :goto_4

    .line 53
    :cond_2
    if-nez v10, :cond_3

    .line 54
    .line 55
    invoke-static {v8, v9}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    :cond_3
    and-int/lit8 v2, v11, 0x7f

    .line 60
    .line 61
    int-to-long v2, v2

    .line 62
    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v10, v2}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    and-int/lit16 v3, v11, 0x80

    .line 71
    .line 72
    if-nez v3, :cond_5

    .line 73
    .line 74
    if-eqz v5, :cond_4

    .line 75
    .line 76
    move v5, v6

    .line 77
    goto :goto_3

    .line 78
    :cond_4
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    :goto_3
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    move-object v10, v4

    .line 85
    goto :goto_2

    .line 86
    :cond_5
    invoke-virtual {v2, v13}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_6
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    return-object v0
.end method

.method static I(Ljava/lang/String;)[B
    .locals 4

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lzg/Q0;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lzg/Q0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-virtual {v1}, Lzg/Q0;->a()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1}, Lzg/Q0;->b()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/16 v3, 0x12

    .line 26
    .line 27
    if-gt v2, v3, :cond_0

    .line 28
    .line 29
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    invoke-static {v0, v2, v3}, Lzg/A;->K(Ljava/io/ByteArrayOutputStream;J)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v2, Ljava/math/BigInteger;

    .line 38
    .line 39
    invoke-direct {v2, p0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v2}, Lzg/A;->L(Ljava/io/ByteArrayOutputStream;Ljava/math/BigInteger;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method static K(Ljava/io/ByteArrayOutputStream;J)V
    .locals 5

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    long-to-int v1, p1

    .line 6
    and-int/lit8 v1, v1, 0x7f

    .line 7
    .line 8
    int-to-byte v1, v1

    .line 9
    const/16 v2, 0x8

    .line 10
    .line 11
    aput-byte v1, v0, v2

    .line 12
    .line 13
    :goto_0
    const-wide/16 v3, 0x80

    .line 14
    .line 15
    cmp-long v1, p1, v3

    .line 16
    .line 17
    if-ltz v1, :cond_0

    .line 18
    .line 19
    const/4 v1, 0x7

    .line 20
    shr-long/2addr p1, v1

    .line 21
    add-int/lit8 v2, v2, -0x1

    .line 22
    .line 23
    long-to-int v1, p1

    .line 24
    or-int/lit16 v1, v1, 0x80

    .line 25
    .line 26
    int-to-byte v1, v1

    .line 27
    aput-byte v1, v0, v2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    rsub-int/lit8 p1, v2, 0x9

    .line 31
    .line 32
    invoke-virtual {p0, v0, v2, p1}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method static L(Ljava/io/ByteArrayOutputStream;Ljava/math/BigInteger;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, 0x6

    .line 6
    .line 7
    const/4 v1, 0x7

    .line 8
    div-int/2addr v0, v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-array v3, v0, [B

    .line 17
    .line 18
    add-int/lit8 v4, v0, -0x1

    .line 19
    .line 20
    move v5, v4

    .line 21
    :goto_0
    if-ltz v5, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/math/BigInteger;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    or-int/lit16 v6, v6, 0x80

    .line 28
    .line 29
    int-to-byte v6, v6

    .line 30
    aput-byte v6, v3, v5

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Ljava/math/BigInteger;->shiftRight(I)Ljava/math/BigInteger;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    add-int/lit8 v5, v5, -0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    aget-byte p1, v3, v4

    .line 40
    .line 41
    and-int/lit8 p1, p1, 0x7f

    .line 42
    .line 43
    int-to-byte p1, p1

    .line 44
    aput-byte p1, v3, v4

    .line 45
    .line 46
    invoke-virtual {p0, v3, v2, v0}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method static y(I)V
    .locals 1

    .line 1
    const/16 v0, 0x1000

    .line 2
    .line 3
    if-gt p0, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 7
    .line 8
    const-string v0, "exceeded relative OID contents length limit"

    .line 9
    .line 10
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0
.end method

.method static z(Ljava/lang/String;)V
    .locals 3

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x3fff

    .line 8
    .line 9
    if-gt v0, v1, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p0, v0}, Lzg/A;->F(Ljava/lang/String;I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v2, "string "

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p0, " not a valid relative OID"

    .line 35
    .line 36
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    const-string v0, "exceeded relative OID contents length limit"

    .line 50
    .line 51
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    .line 56
    .line 57
    const-string v0, "\'identifier\' cannot be null"

    .line 58
    .line 59
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p0
.end method


# virtual methods
.method public declared-synchronized B()Ljava/lang/String;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lzg/A;->b:Ljava/lang/String;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lzg/A;->a:[B

    .line 7
    .line 8
    invoke-static {v0}, Lzg/A;->G([B)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lzg/A;->b:Ljava/lang/String;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    :goto_0
    iget-object v0, p0, Lzg/A;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-object v0

    .line 21
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lzg/A;->a:[B

    .line 2
    .line 3
    invoke-static {v0}, LOh/a;->q([B)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method l(Lzg/y;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lzg/A;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, Lzg/A;

    .line 12
    .line 13
    iget-object v0, p0, Lzg/A;->a:[B

    .line 14
    .line 15
    iget-object p1, p1, Lzg/A;->a:[B

    .line 16
    .line 17
    invoke-static {v0, p1}, LOh/a;->c([B[B)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method n(Lzg/w;Z)V
    .locals 2

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    iget-object v1, p0, Lzg/A;->a:[B

    .line 4
    .line 5
    invoke-virtual {p1, p2, v0, v1}, Lzg/w;->o(ZI[B)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method p()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method t(Z)I
    .locals 1

    .line 1
    iget-object v0, p0, Lzg/A;->a:[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    invoke-static {p1, v0}, Lzg/w;->g(ZI)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzg/A;->B()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
