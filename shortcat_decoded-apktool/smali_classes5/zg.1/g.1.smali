.class public Lzg/g;
.super Lzg/y;


# static fields
.field static final c:Lzg/L;

.field private static final d:[Lzg/g;


# instance fields
.field private final a:[B

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lzg/g$a;

    .line 2
    .line 3
    const-class v1, Lzg/g;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lzg/g$a;-><init>(Ljava/lang/Class;I)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lzg/g;->c:Lzg/L;

    .line 11
    .line 12
    const/16 v0, 0xc

    .line 13
    .line 14
    new-array v0, v0, [Lzg/g;

    .line 15
    .line 16
    sput-object v0, Lzg/g;->d:[Lzg/g;

    .line 17
    .line 18
    return-void
.end method

.method constructor <init>([BZ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lzg/y;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lzg/o;->I([B)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    aget-byte v0, p1, v0

    .line 12
    .line 13
    and-int/lit16 v0, v0, 0x80

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, LOh/a;->f([B)[B

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object p2, p1

    .line 25
    :goto_0
    iput-object p2, p0, Lzg/g;->a:[B

    .line 26
    .line 27
    invoke-static {p1}, Lzg/o;->M([B)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iput p1, p0, Lzg/g;->b:I

    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 35
    .line 36
    const-string p2, "enumerated must be non-negative"

    .line 37
    .line 38
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 43
    .line 44
    const-string p2, "malformed enumerated"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1
.end method

.method static y([BZ)Lzg/g;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-le v0, v1, :cond_0

    .line 4
    .line 5
    new-instance v0, Lzg/g;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, Lzg/g;-><init>([BZ)V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    array-length v0, p0

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    aget-byte v0, p0, v0

    .line 16
    .line 17
    and-int/lit16 v0, v0, 0xff

    .line 18
    .line 19
    sget-object v1, Lzg/g;->d:[Lzg/g;

    .line 20
    .line 21
    array-length v2, v1

    .line 22
    if-lt v0, v2, :cond_1

    .line 23
    .line 24
    new-instance v0, Lzg/g;

    .line 25
    .line 26
    invoke-direct {v0, p0, p1}, Lzg/g;-><init>([BZ)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_1
    aget-object v2, v1, v0

    .line 31
    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    new-instance v2, Lzg/g;

    .line 35
    .line 36
    invoke-direct {v2, p0, p1}, Lzg/g;-><init>([BZ)V

    .line 37
    .line 38
    .line 39
    aput-object v2, v1, v0

    .line 40
    .line 41
    :cond_2
    return-object v2

    .line 42
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 43
    .line 44
    const-string p1, "ENUMERATED has zero length"

    .line 45
    .line 46
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p0
.end method


# virtual methods
.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lzg/g;->a:[B

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
    instance-of v0, p1, Lzg/g;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Lzg/g;

    .line 8
    .line 9
    iget-object v0, p0, Lzg/g;->a:[B

    .line 10
    .line 11
    iget-object p1, p1, Lzg/g;->a:[B

    .line 12
    .line 13
    invoke-static {v0, p1}, LOh/a;->c([B[B)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method n(Lzg/w;Z)V
    .locals 2

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    iget-object v1, p0, Lzg/g;->a:[B

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
    iget-object v0, p0, Lzg/g;->a:[B

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
