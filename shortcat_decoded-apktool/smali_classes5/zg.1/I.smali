.class public Lzg/I;
.super Lzg/y;


# static fields
.field static final b:Lzg/L;


# instance fields
.field final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lzg/I$a;

    .line 2
    .line 3
    const-class v1, Lzg/I;

    .line 4
    .line 5
    const/16 v2, 0x17

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lzg/I$a;-><init>(Ljava/lang/Class;I)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lzg/I;->b:Lzg/L;

    .line 11
    .line 12
    return-void
.end method

.method constructor <init>([B)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lzg/y;-><init>()V

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    const/4 v1, 0x2

    .line 6
    if-lt v0, v1, :cond_1

    .line 7
    .line 8
    iput-object p1, p0, Lzg/I;->a:[B

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-direct {p0, p1}, Lzg/I;->z(I)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-direct {p0, p1}, Lzg/I;->z(I)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 26
    .line 27
    const-string v0, "illegal characters in UTCTime string"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    const-string v0, "UTCTime string too short"

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method

.method static y([B)Lzg/I;
    .locals 1

    .line 1
    new-instance v0, Lzg/I;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lzg/I;-><init>([B)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private z(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lzg/I;->a:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-le v1, p1, :cond_0

    .line 5
    .line 6
    aget-byte p1, v0, p1

    .line 7
    .line 8
    const/16 v0, 0x30

    .line 9
    .line 10
    if-lt p1, v0, :cond_0

    .line 11
    .line 12
    const/16 v0, 0x39

    .line 13
    .line 14
    if-gt p1, v0, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1
.end method


# virtual methods
.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lzg/I;->a:[B

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
    instance-of v0, p1, Lzg/I;

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
    iget-object v0, p0, Lzg/I;->a:[B

    .line 8
    .line 9
    check-cast p1, Lzg/I;

    .line 10
    .line 11
    iget-object p1, p1, Lzg/I;->a:[B

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
    const/16 v0, 0x17

    .line 2
    .line 3
    iget-object v1, p0, Lzg/I;->a:[B

    .line 4
    .line 5
    invoke-virtual {p1, p2, v0, v1}, Lzg/w;->o(ZI[B)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method final p()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method t(Z)I
    .locals 1

    .line 1
    iget-object v0, p0, Lzg/I;->a:[B

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
    iget-object v0, p0, Lzg/I;->a:[B

    .line 2
    .line 3
    invoke-static {v0}, LOh/i;->b([B)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
