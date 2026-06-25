.class public Lzg/f0;
.super Lzg/i;


# direct methods
.method public constructor <init>(Lzg/r0;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lzg/i;-><init>(Lzg/B;)V

    return-void
.end method

.method public constructor <init>(Lzg/t;Lzg/o;Lzg/y;ILzg/y;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lzg/i;-><init>(Lzg/t;Lzg/o;Lzg/y;ILzg/y;)V

    return-void
.end method


# virtual methods
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

.method y()Lzg/B;
    .locals 5

    .line 1
    new-instance v0, Lzg/f;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lzg/f;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lzg/i;->a:Lzg/t;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, Lzg/i;->b:Lzg/o;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-object v1, p0, Lzg/i;->c:Lzg/y;

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    invoke-virtual {v1}, Lzg/y;->w()Lzg/y;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    .line 30
    .line 31
    .line 32
    :cond_2
    new-instance v1, Lzg/u0;

    .line 33
    .line 34
    iget v2, p0, Lzg/i;->d:I

    .line 35
    .line 36
    if-nez v2, :cond_3

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_3
    const/4 v3, 0x0

    .line 41
    :goto_0
    iget-object v4, p0, Lzg/i;->e:Lzg/y;

    .line 42
    .line 43
    invoke-direct {v1, v3, v2, v4}, Lzg/u0;-><init>(ZILzg/e;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    .line 47
    .line 48
    .line 49
    new-instance v1, Lzg/r0;

    .line 50
    .line 51
    invoke-direct {v1, v0}, Lzg/r0;-><init>(Lzg/f;)V

    .line 52
    .line 53
    .line 54
    return-object v1
.end method
