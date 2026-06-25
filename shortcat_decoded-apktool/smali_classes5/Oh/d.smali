.class public LOh/d;
.super Ljava/lang/Object;


# static fields
.field private static b:[C


# instance fields
.field private final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LOh/d;->b:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method public constructor <init>([B)V
    .locals 1

    const/16 v0, 0xa0

    .line 1
    invoke-direct {p0, p1, v0}, LOh/d;-><init>([BI)V

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, p2}, LOh/d;->a([BI)[B

    move-result-object p1

    iput-object p1, p0, LOh/d;->a:[B

    return-void
.end method

.method public static a([BI)[B
    .locals 3

    .line 1
    rem-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LHg/h;

    .line 6
    .line 7
    const/16 v1, 0x100

    .line 8
    .line 9
    invoke-direct {v0, v1}, LHg/h;-><init>(I)V

    .line 10
    .line 11
    .line 12
    array-length v1, p0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v0, p0, v2, v1}, LHg/b;->update([BII)V

    .line 15
    .line 16
    .line 17
    div-int/lit8 p1, p1, 0x8

    .line 18
    .line 19
    new-array p0, p1, [B

    .line 20
    .line 21
    invoke-virtual {v0, p0, v2, p1}, LHg/h;->e([BII)I

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 26
    .line 27
    const-string p1, "bitLength must be a multiple of 8"

    .line 28
    .line 29
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, LOh/d;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p1, LOh/d;

    .line 10
    .line 11
    iget-object p1, p1, LOh/d;->a:[B

    .line 12
    .line 13
    iget-object v0, p0, LOh/d;->a:[B

    .line 14
    .line 15
    invoke-static {p1, v0}, LOh/a;->c([B[B)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LOh/d;->a:[B

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

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    iget-object v2, p0, LOh/d;->a:[B

    .line 8
    .line 9
    array-length v2, v2

    .line 10
    if-eq v1, v2, :cond_1

    .line 11
    .line 12
    if-lez v1, :cond_0

    .line 13
    .line 14
    const-string v2, ":"

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 17
    .line 18
    .line 19
    :cond_0
    sget-object v2, LOh/d;->b:[C

    .line 20
    .line 21
    iget-object v3, p0, LOh/d;->a:[B

    .line 22
    .line 23
    aget-byte v3, v3, v1

    .line 24
    .line 25
    ushr-int/lit8 v3, v3, 0x4

    .line 26
    .line 27
    and-int/lit8 v3, v3, 0xf

    .line 28
    .line 29
    aget-char v2, v2, v3

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 32
    .line 33
    .line 34
    sget-object v2, LOh/d;->b:[C

    .line 35
    .line 36
    iget-object v3, p0, LOh/d;->a:[B

    .line 37
    .line 38
    aget-byte v3, v3, v1

    .line 39
    .line 40
    and-int/lit8 v3, v3, 0xf

    .line 41
    .line 42
    aget-char v2, v2, v3

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 45
    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    return-object v0
.end method
