.class public Lzg/V;
.super Lzg/B;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lzg/B;-><init>()V

    return-void
.end method

.method public constructor <init>(Lzg/e;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lzg/B;-><init>(Lzg/e;)V

    return-void
.end method

.method public constructor <init>(Lzg/f;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lzg/B;-><init>(Lzg/f;)V

    return-void
.end method


# virtual methods
.method F()Lzg/b;
    .locals 2

    .line 1
    new-instance v0, Lzg/P;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzg/B;->y()[Lzg/b;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lzg/P;-><init>([Lzg/b;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method G()Lzg/i;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzg/B;->x()Lzg/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lzg/B;

    .line 6
    .line 7
    invoke-virtual {v0}, Lzg/B;->G()Lzg/i;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method I()Lzg/u;
    .locals 2

    .line 1
    new-instance v0, Lzg/T;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzg/B;->z()[Lzg/u;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lzg/T;-><init>([Lzg/u;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method K()Lzg/C;
    .locals 3

    .line 1
    new-instance v0, Lzg/X;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0}, Lzg/B;->L()[Lzg/e;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    invoke-direct {v0, v1, v2}, Lzg/X;-><init>(Z[Lzg/e;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method n(Lzg/w;Z)V
    .locals 2

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    iget-object v1, p0, Lzg/B;->a:[Lzg/e;

    .line 4
    .line 5
    invoke-virtual {p1, p2, v0, v1}, Lzg/w;->r(ZI[Lzg/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method t(Z)I
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x4

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 p1, 0x3

    .line 6
    :goto_0
    iget-object v0, p0, Lzg/B;->a:[Lzg/e;

    .line 7
    .line 8
    array-length v0, v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_1
    if-ge v1, v0, :cond_1

    .line 11
    .line 12
    iget-object v2, p0, Lzg/B;->a:[Lzg/e;

    .line 13
    .line 14
    aget-object v2, v2, v1

    .line 15
    .line 16
    invoke-interface {v2}, Lzg/e;->e()Lzg/y;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v3, 0x1

    .line 21
    invoke-virtual {v2, v3}, Lzg/y;->t(Z)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    add-int/2addr p1, v2

    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    return p1
.end method
