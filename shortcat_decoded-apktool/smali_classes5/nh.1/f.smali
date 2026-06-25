.class public Lnh/f;
.super Lnh/d;


# instance fields
.field final c:Lnh/b;

.field final d:Lnh/a;


# direct methods
.method public constructor <init>(Lnh/e;[B)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0, p1}, Lnh/d;-><init>(ZLnh/e;)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lnh/e;->a()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    array-length v0, p2

    .line 10
    mul-int/lit8 v1, p1, 0x4

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    new-instance v0, Lnh/b;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {p2, v2, p1}, LOh/a;->m([BII)[B

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    mul-int/lit8 v3, p1, 0x2

    .line 22
    .line 23
    invoke-static {p2, p1, v3}, LOh/a;->m([BII)[B

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-direct {v0, v2, v4}, Lnh/b;-><init>([B[B)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lnh/f;->c:Lnh/b;

    .line 31
    .line 32
    new-instance v0, Lnh/a;

    .line 33
    .line 34
    mul-int/lit8 p1, p1, 0x3

    .line 35
    .line 36
    invoke-static {p2, v3, p1}, LOh/a;->m([BII)[B

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-static {p2, p1, v1}, LOh/a;->m([BII)[B

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {v0, v2, p1}, Lnh/a;-><init>([B[B)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lnh/f;->d:Lnh/a;

    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 51
    .line 52
    const-string p2, "private key encoding does not match parameters"

    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1
.end method


# virtual methods
.method public getEncoded()[B
    .locals 4

    .line 1
    iget-object v0, p0, Lnh/f;->c:Lnh/b;

    .line 2
    .line 3
    iget-object v1, v0, Lnh/b;->a:[B

    .line 4
    .line 5
    iget-object v0, v0, Lnh/b;->b:[B

    .line 6
    .line 7
    iget-object v2, p0, Lnh/f;->d:Lnh/a;

    .line 8
    .line 9
    iget-object v3, v2, Lnh/a;->a:[B

    .line 10
    .line 11
    iget-object v2, v2, Lnh/a;->b:[B

    .line 12
    .line 13
    filled-new-array {v1, v0, v3, v2}, [[B

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, LOh/a;->j([[B)[B

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method
