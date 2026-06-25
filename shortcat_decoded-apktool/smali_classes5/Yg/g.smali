.class public LYg/g;
.super LYg/e;


# instance fields
.field private final c:[B


# direct methods
.method public constructor <init>(LYg/f;[B[B[B[B[B)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0, p1}, LYg/e;-><init>(ZLYg/f;)V

    .line 3
    .line 4
    .line 5
    array-length p1, p2

    .line 6
    array-length v0, p3

    .line 7
    add-int/2addr p1, v0

    .line 8
    array-length v0, p4

    .line 9
    add-int/2addr p1, v0

    .line 10
    array-length v0, p5

    .line 11
    add-int/2addr p1, v0

    .line 12
    array-length v0, p6

    .line 13
    add-int/2addr p1, v0

    .line 14
    new-array p1, p1, [B

    .line 15
    .line 16
    iput-object p1, p0, LYg/g;->c:[B

    .line 17
    .line 18
    array-length v0, p2

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-static {p2, v1, p1, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 21
    .line 22
    .line 23
    array-length p2, p2

    .line 24
    array-length v0, p3

    .line 25
    invoke-static {p3, v1, p1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 26
    .line 27
    .line 28
    array-length p3, p3

    .line 29
    add-int/2addr p2, p3

    .line 30
    array-length p3, p4

    .line 31
    invoke-static {p4, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 32
    .line 33
    .line 34
    array-length p3, p4

    .line 35
    add-int/2addr p2, p3

    .line 36
    array-length p3, p5

    .line 37
    invoke-static {p5, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 38
    .line 39
    .line 40
    array-length p3, p5

    .line 41
    add-int/2addr p2, p3

    .line 42
    array-length p3, p6

    .line 43
    invoke-static {p6, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public c()[B
    .locals 3

    .line 1
    iget-object v0, p0, LYg/g;->c:[B

    .line 2
    .line 3
    invoke-virtual {p0}, LYg/e;->b()LYg/f;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, LYg/f;->c()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    mul-int/lit8 v1, v1, 0x2

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x28

    .line 14
    .line 15
    iget-object v2, p0, LYg/g;->c:[B

    .line 16
    .line 17
    array-length v2, v2

    .line 18
    add-int/lit8 v2, v2, -0x20

    .line 19
    .line 20
    invoke-static {v0, v1, v2}, LOh/a;->m([BII)[B

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public d()[B
    .locals 3

    .line 1
    iget-object v0, p0, LYg/g;->c:[B

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    const/16 v2, 0x28

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LOh/a;->m([BII)[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public e()[B
    .locals 3

    .line 1
    iget-object v0, p0, LYg/g;->c:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x20

    .line 5
    .line 6
    invoke-static {v0, v1, v2}, LOh/a;->m([BII)[B

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public f()[B
    .locals 3

    .line 1
    iget-object v0, p0, LYg/g;->c:[B

    .line 2
    .line 3
    invoke-virtual {p0}, LYg/e;->b()LYg/f;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, LYg/f;->c()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    mul-int/lit8 v1, v1, 0x2

    .line 12
    .line 13
    const/16 v2, 0x28

    .line 14
    .line 15
    add-int/2addr v1, v2

    .line 16
    invoke-static {v0, v2, v1}, LOh/a;->m([BII)[B

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method

.method public g()[B
    .locals 3

    .line 1
    iget-object v0, p0, LYg/g;->c:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    add-int/lit8 v1, v1, -0x20

    .line 5
    .line 6
    array-length v2, v0

    .line 7
    invoke-static {v0, v1, v2}, LOh/a;->m([BII)[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public getEncoded()[B
    .locals 1

    .line 1
    iget-object v0, p0, LYg/g;->c:[B

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

.method public h()[B
    .locals 3

    .line 1
    invoke-virtual {p0}, LYg/e;->b()LYg/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LYg/f;->a()LYg/d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, LYg/d;->d()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    new-array v1, v1, [B

    .line 14
    .line 15
    iget-object v2, p0, LYg/g;->c:[B

    .line 16
    .line 17
    invoke-virtual {v0, v2}, LYg/d;->c([B)[B

    .line 18
    .line 19
    .line 20
    return-object v1
.end method
