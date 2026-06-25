.class public Lzg/z0;
.super Lzg/b;


# direct methods
.method constructor <init>([BZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lzg/b;-><init>([BZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static G(Lzg/w;ZB[BII)V
    .locals 7

    .line 1
    const/4 v2, 0x3

    .line 2
    move-object v0, p0

    .line 3
    move v1, p1

    .line 4
    move v3, p2

    .line 5
    move-object v4, p3

    .line 6
    move v5, p4

    .line 7
    move v6, p5

    .line 8
    invoke-virtual/range {v0 .. v6}, Lzg/w;->n(ZIB[BII)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method static I(Lzg/w;Z[BII)V
    .locals 6

    .line 1
    const/4 v2, 0x3

    .line 2
    move-object v0, p0

    .line 3
    move v1, p1

    .line 4
    move-object v3, p2

    .line 5
    move v4, p3

    .line 6
    move v5, p4

    .line 7
    invoke-virtual/range {v0 .. v5}, Lzg/w;->p(ZI[BII)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method static K(ZI)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lzg/w;->g(ZI)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method n(Lzg/w;Z)V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    iget-object v1, p0, Lzg/b;->a:[B

    .line 3
    .line 4
    invoke-virtual {p1, p2, v0, v1}, Lzg/w;->o(ZI[B)V

    .line 5
    .line 6
    .line 7
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
    iget-object v0, p0, Lzg/b;->a:[B

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

.method x()Lzg/y;
    .locals 0

    .line 1
    return-object p0
.end method
