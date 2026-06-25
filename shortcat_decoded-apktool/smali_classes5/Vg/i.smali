.class public LVg/i;
.super Lzg/r;


# instance fields
.field private a:I

.field private b:[B

.field private c:[B

.field private d:LVg/j;


# direct methods
.method public constructor <init>(Lzg/B;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lzg/r;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, Lzg/B;->B(I)Lzg/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lzg/o;->z(Ljava/lang/Object;)Lzg/o;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lzg/o;->G()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, LVg/i;->a:I

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-virtual {p1, v0}, Lzg/B;->B(I)Lzg/e;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, LOh/a;->f([B)[B

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, LVg/i;->b:[B

    .line 39
    .line 40
    const/4 v0, 0x2

    .line 41
    invoke-virtual {p1, v0}, Lzg/B;->B(I)Lzg/e;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, LOh/a;->f([B)[B

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, LVg/i;->c:[B

    .line 58
    .line 59
    invoke-virtual {p1}, Lzg/B;->size()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    const/4 v1, 0x4

    .line 64
    if-ne v0, v1, :cond_0

    .line 65
    .line 66
    const/4 v0, 0x3

    .line 67
    invoke-virtual {p1, v0}, Lzg/B;->B(I)Lzg/e;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p1}, LVg/j;->l(Ljava/lang/Object;)LVg/j;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iput-object p1, p0, LVg/i;->d:LVg/j;

    .line 76
    .line 77
    :cond_0
    return-void

    .line 78
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 79
    .line 80
    const-string v0, "unrecognized version"

    .line 81
    .line 82
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p1
.end method

.method public static l(Ljava/lang/Object;)LVg/i;
    .locals 1

    .line 1
    instance-of v0, p0, LVg/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LVg/i;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    if-eqz p0, :cond_1

    .line 9
    .line 10
    new-instance v0, LVg/i;

    .line 11
    .line 12
    invoke-static {p0}, Lzg/B;->A(Ljava/lang/Object;)Lzg/B;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-direct {v0, p0}, LVg/i;-><init>(Lzg/B;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_1
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method


# virtual methods
.method public e()Lzg/y;
    .locals 4

    .line 1
    new-instance v0, Lzg/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lzg/f;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lzg/o;

    .line 7
    .line 8
    iget v2, p0, LVg/i;->a:I

    .line 9
    .line 10
    int-to-long v2, v2

    .line 11
    invoke-direct {v1, v2, v3}, Lzg/o;-><init>(J)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lzg/n0;

    .line 18
    .line 19
    iget-object v2, p0, LVg/i;->b:[B

    .line 20
    .line 21
    invoke-direct {v1, v2}, Lzg/n0;-><init>([B)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Lzg/n0;

    .line 28
    .line 29
    iget-object v2, p0, LVg/i;->c:[B

    .line 30
    .line 31
    invoke-direct {v1, v2}, Lzg/n0;-><init>([B)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, LVg/i;->d:LVg/j;

    .line 38
    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    new-instance v2, LVg/j;

    .line 42
    .line 43
    invoke-virtual {v1}, LVg/j;->p()[B

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget-object v3, p0, LVg/i;->d:LVg/j;

    .line 48
    .line 49
    invoke-virtual {v3}, LVg/j;->n()[B

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-direct {v2, v1, v3}, LVg/j;-><init>([B[B)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v2}, Lzg/f;->a(Lzg/e;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    new-instance v1, Lzg/r0;

    .line 60
    .line 61
    invoke-direct {v1, v0}, Lzg/r0;-><init>(Lzg/f;)V

    .line 62
    .line 63
    .line 64
    return-object v1
.end method

.method public n()LVg/j;
    .locals 1

    .line 1
    iget-object v0, p0, LVg/i;->d:LVg/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public p()[B
    .locals 1

    .line 1
    iget-object v0, p0, LVg/i;->c:[B

    .line 2
    .line 3
    invoke-static {v0}, LOh/a;->f([B)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public r()[B
    .locals 1

    .line 1
    iget-object v0, p0, LVg/i;->b:[B

    .line 2
    .line 3
    invoke-static {v0}, LOh/a;->f([B)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
