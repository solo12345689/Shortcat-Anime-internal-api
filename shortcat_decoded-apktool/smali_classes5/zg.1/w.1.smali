.class public Lzg/w;
.super Ljava/lang/Object;


# instance fields
.field private a:Ljava/io/OutputStream;


# direct methods
.method constructor <init>(Ljava/io/OutputStream;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzg/w;->a:Ljava/io/OutputStream;

    .line 5
    .line 6
    return-void
.end method

.method public static a(Ljava/io/OutputStream;)Lzg/w;
    .locals 1

    .line 1
    new-instance v0, Lzg/w;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lzg/w;-><init>(Ljava/io/OutputStream;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static b(Ljava/io/OutputStream;Ljava/lang/String;)Lzg/w;
    .locals 1

    .line 1
    const-string v0, "DER"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance p1, Lzg/p0;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Lzg/p0;-><init>(Ljava/io/OutputStream;)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    const-string v0, "DL"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    new-instance p1, Lzg/D0;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Lzg/D0;-><init>(Ljava/io/OutputStream;)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_1
    new-instance p1, Lzg/w;

    .line 30
    .line 31
    invoke-direct {p1, p0}, Lzg/w;-><init>(Ljava/io/OutputStream;)V

    .line 32
    .line 33
    .line 34
    return-object p1
.end method

.method static f(I)I
    .locals 1

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    if-ge p0, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 v0, 0x2

    .line 8
    :goto_0
    ushr-int/lit8 p0, p0, 0x8

    .line 9
    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    return v0
.end method

.method static g(ZI)I
    .locals 1

    .line 1
    invoke-static {p1}, Lzg/w;->f(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/2addr p0, v0

    .line 6
    add-int/2addr p0, p1

    .line 7
    return p0
.end method

.method static h(I)I
    .locals 1

    .line 1
    const/16 v0, 0x1f

    .line 2
    .line 3
    if-ge p0, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 v0, 0x2

    .line 8
    :goto_0
    ushr-int/lit8 p0, p0, 0x7

    .line 9
    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    return v0
.end method


# virtual methods
.method c()V
    .locals 0

    .line 1
    return-void
.end method

.method d()Lzg/p0;
    .locals 2

    .line 1
    new-instance v0, Lzg/p0;

    .line 2
    .line 3
    iget-object v1, p0, Lzg/w;->a:Ljava/io/OutputStream;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lzg/p0;-><init>(Ljava/io/OutputStream;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method e()Lzg/D0;
    .locals 2

    .line 1
    new-instance v0, Lzg/D0;

    .line 2
    .line 3
    iget-object v1, p0, Lzg/w;->a:Ljava/io/OutputStream;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lzg/D0;-><init>(Ljava/io/OutputStream;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method final i(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lzg/w;->a:Ljava/io/OutputStream;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method final j([BII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lzg/w;->a:Ljava/io/OutputStream;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method final k(I)V
    .locals 5

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lzg/w;->i(I)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v1, 0x5

    .line 10
    new-array v2, v1, [B

    .line 11
    .line 12
    :goto_0
    add-int/lit8 v3, v1, -0x1

    .line 13
    .line 14
    int-to-byte v4, p1

    .line 15
    aput-byte v4, v2, v3

    .line 16
    .line 17
    ushr-int/lit8 p1, p1, 0x8

    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    rsub-int/lit8 p1, v3, 0x5

    .line 22
    .line 23
    add-int/lit8 v1, v1, -0x2

    .line 24
    .line 25
    or-int/2addr p1, v0

    .line 26
    int-to-byte p1, p1

    .line 27
    aput-byte p1, v2, v1

    .line 28
    .line 29
    rsub-int/lit8 p1, v3, 0x6

    .line 30
    .line 31
    invoke-virtual {p0, v2, v1, p1}, Lzg/w;->j([BII)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    move v1, v3

    .line 36
    goto :goto_0
.end method

.method l([Lzg/e;)V
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    invoke-interface {v2}, Lzg/e;->e()Lzg/y;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-virtual {v2, p0, v3}, Lzg/y;->n(Lzg/w;Z)V

    .line 13
    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void
.end method

.method final m(ZIB)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lzg/w;->s(ZI)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    invoke-virtual {p0, p1}, Lzg/w;->k(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p3}, Lzg/w;->i(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method final n(ZIB[BII)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lzg/w;->s(ZI)V

    .line 2
    .line 3
    .line 4
    add-int/lit8 p1, p6, 0x1

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lzg/w;->k(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p3}, Lzg/w;->i(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p4, p5, p6}, Lzg/w;->j([BII)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method final o(ZI[B)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lzg/w;->s(ZI)V

    .line 2
    .line 3
    .line 4
    array-length p1, p3

    .line 5
    invoke-virtual {p0, p1}, Lzg/w;->k(I)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    array-length p2, p3

    .line 10
    invoke-virtual {p0, p3, p1, p2}, Lzg/w;->j([BII)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method final p(ZI[BII)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lzg/w;->s(ZI)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p5}, Lzg/w;->k(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p3, p4, p5}, Lzg/w;->j([BII)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method final q(ZI[BIIB)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lzg/w;->s(ZI)V

    .line 2
    .line 3
    .line 4
    add-int/lit8 p1, p5, 0x1

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lzg/w;->k(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p3, p4, p5}, Lzg/w;->j([BII)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p6}, Lzg/w;->i(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method final r(ZI[Lzg/e;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lzg/w;->s(ZI)V

    .line 2
    .line 3
    .line 4
    const/16 p1, 0x80

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lzg/w;->i(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p3}, Lzg/w;->l([Lzg/e;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {p0, p1}, Lzg/w;->i(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lzg/w;->i(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method final s(ZI)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lzg/w;->i(I)V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method final t(ZII)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/16 p1, 0x1f

    .line 5
    .line 6
    if-ge p3, p1, :cond_1

    .line 7
    .line 8
    or-int p1, p2, p3

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lzg/w;->i(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    const/4 v0, 0x6

    .line 15
    new-array v0, v0, [B

    .line 16
    .line 17
    and-int/lit8 v1, p3, 0x7f

    .line 18
    .line 19
    int-to-byte v1, v1

    .line 20
    const/4 v2, 0x5

    .line 21
    aput-byte v1, v0, v2

    .line 22
    .line 23
    :goto_0
    const/16 v1, 0x7f

    .line 24
    .line 25
    if-le p3, v1, :cond_2

    .line 26
    .line 27
    ushr-int/lit8 p3, p3, 0x7

    .line 28
    .line 29
    add-int/lit8 v2, v2, -0x1

    .line 30
    .line 31
    and-int/lit8 v1, p3, 0x7f

    .line 32
    .line 33
    or-int/lit16 v1, v1, 0x80

    .line 34
    .line 35
    int-to-byte v1, v1

    .line 36
    aput-byte v1, v0, v2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    add-int/lit8 v2, v2, -0x1

    .line 40
    .line 41
    or-int/2addr p1, p2

    .line 42
    int-to-byte p1, p1

    .line 43
    aput-byte p1, v0, v2

    .line 44
    .line 45
    rsub-int/lit8 p1, v2, 0x6

    .line 46
    .line 47
    invoke-virtual {p0, v0, v2, p1}, Lzg/w;->j([BII)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method u(Lzg/y;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0, p2}, Lzg/y;->n(Lzg/w;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method v([Lzg/y;)V
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-virtual {v2, p0, v3}, Lzg/y;->n(Lzg/w;Z)V

    .line 9
    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void
.end method
