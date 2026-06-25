.class public Lzg/r0;
.super Lzg/B;


# instance fields
.field private c:I


# direct methods
.method public constructor <init>(Lzg/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lzg/B;-><init>(Lzg/e;)V

    const/4 p1, -0x1

    iput p1, p0, Lzg/r0;->c:I

    return-void
.end method

.method public constructor <init>(Lzg/e;Lzg/e;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lzg/B;-><init>(Lzg/e;Lzg/e;)V

    const/4 p1, -0x1

    iput p1, p0, Lzg/r0;->c:I

    return-void
.end method

.method public constructor <init>(Lzg/f;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lzg/B;-><init>(Lzg/f;)V

    const/4 p1, -0x1

    iput p1, p0, Lzg/r0;->c:I

    return-void
.end method

.method constructor <init>([Lzg/e;Z)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Lzg/B;-><init>([Lzg/e;Z)V

    const/4 p1, -0x1

    iput p1, p0, Lzg/r0;->c:I

    return-void
.end method

.method private M()I
    .locals 5

    .line 1
    iget v0, p0, Lzg/r0;->c:I

    .line 2
    .line 3
    if-gez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lzg/B;->a:[Lzg/e;

    .line 6
    .line 7
    array-length v0, v0

    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    if-ge v1, v0, :cond_0

    .line 11
    .line 12
    iget-object v3, p0, Lzg/B;->a:[Lzg/e;

    .line 13
    .line 14
    aget-object v3, v3, v1

    .line 15
    .line 16
    invoke-interface {v3}, Lzg/e;->e()Lzg/y;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3}, Lzg/y;->w()Lzg/y;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const/4 v4, 0x1

    .line 25
    invoke-virtual {v3, v4}, Lzg/y;->t(Z)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    add-int/2addr v2, v3

    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iput v2, p0, Lzg/r0;->c:I

    .line 34
    .line 35
    :cond_1
    iget v0, p0, Lzg/r0;->c:I

    .line 36
    .line 37
    return v0
.end method


# virtual methods
.method F()Lzg/b;
    .locals 3

    .line 1
    new-instance v0, Lzg/e0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzg/B;->y()[Lzg/b;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Lzg/P;->G([Lzg/b;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v0, v1, v2}, Lzg/e0;-><init>([BZ)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method G()Lzg/i;
    .locals 1

    .line 1
    new-instance v0, Lzg/f0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lzg/f0;-><init>(Lzg/r0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method I()Lzg/u;
    .locals 2

    .line 1
    new-instance v0, Lzg/n0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzg/B;->z()[Lzg/u;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Lzg/T;->D([Lzg/u;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lzg/n0;-><init>([B)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method K()Lzg/C;
    .locals 3

    .line 1
    new-instance v0, Lzg/G0;

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
    invoke-direct {v0, v1, v2}, Lzg/G0;-><init>(Z[Lzg/e;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method n(Lzg/w;Z)V
    .locals 7

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Lzg/w;->s(ZI)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lzg/w;->d()Lzg/p0;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    iget-object v0, p0, Lzg/B;->a:[Lzg/e;

    .line 11
    .line 12
    array-length v0, v0

    .line 13
    iget v1, p0, Lzg/r0;->c:I

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x1

    .line 17
    if-gez v1, :cond_2

    .line 18
    .line 19
    const/16 v1, 0x10

    .line 20
    .line 21
    if-le v0, v1, :cond_0

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    new-array v1, v0, [Lzg/y;

    .line 25
    .line 26
    move v4, v2

    .line 27
    move v5, v4

    .line 28
    :goto_0
    if-ge v4, v0, :cond_1

    .line 29
    .line 30
    iget-object v6, p0, Lzg/B;->a:[Lzg/e;

    .line 31
    .line 32
    aget-object v6, v6, v4

    .line 33
    .line 34
    invoke-interface {v6}, Lzg/e;->e()Lzg/y;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-virtual {v6}, Lzg/y;->w()Lzg/y;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    aput-object v6, v1, v4

    .line 43
    .line 44
    invoke-virtual {v6, v3}, Lzg/y;->t(Z)I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    add-int/2addr v5, v6

    .line 49
    add-int/lit8 v4, v4, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iput v5, p0, Lzg/r0;->c:I

    .line 53
    .line 54
    invoke-virtual {p1, v5}, Lzg/w;->k(I)V

    .line 55
    .line 56
    .line 57
    :goto_1
    if-ge v2, v0, :cond_3

    .line 58
    .line 59
    aget-object p1, v1, v2

    .line 60
    .line 61
    invoke-virtual {p1, p2, v3}, Lzg/y;->n(Lzg/w;Z)V

    .line 62
    .line 63
    .line 64
    add-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    :goto_2
    invoke-direct {p0}, Lzg/r0;->M()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-virtual {p1, v1}, Lzg/w;->k(I)V

    .line 72
    .line 73
    .line 74
    :goto_3
    if-ge v2, v0, :cond_3

    .line 75
    .line 76
    iget-object p1, p0, Lzg/B;->a:[Lzg/e;

    .line 77
    .line 78
    aget-object p1, p1, v2

    .line 79
    .line 80
    invoke-interface {p1}, Lzg/e;->e()Lzg/y;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Lzg/y;->w()Lzg/y;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1, p2, v3}, Lzg/y;->n(Lzg/w;Z)V

    .line 89
    .line 90
    .line 91
    add-int/lit8 v2, v2, 0x1

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_3
    return-void
.end method

.method t(Z)I
    .locals 1

    .line 1
    invoke-direct {p0}, Lzg/r0;->M()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, v0}, Lzg/w;->g(ZI)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method w()Lzg/y;
    .locals 0

    .line 1
    return-object p0
.end method

.method x()Lzg/y;
    .locals 0

    .line 1
    return-object p0
.end method
