.class public Lqh/f;
.super Lqh/d;


# instance fields
.field final c:Lqh/b;

.field final d:Lqh/a;


# direct methods
.method public constructor <init>(Lqh/e;[B)V
    .locals 5

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0, p1}, Lqh/d;-><init>(ZLqh/e;)V

    invoke-virtual {p1}, Lqh/e;->b()I

    move-result p1

    array-length v0, p2

    mul-int/lit8 v1, p1, 0x4

    if-ne v0, v1, :cond_0

    new-instance v0, Lqh/b;

    const/4 v2, 0x0

    invoke-static {p2, v2, p1}, LOh/a;->m([BII)[B

    move-result-object v2

    mul-int/lit8 v3, p1, 0x2

    invoke-static {p2, p1, v3}, LOh/a;->m([BII)[B

    move-result-object v4

    invoke-direct {v0, v2, v4}, Lqh/b;-><init>([B[B)V

    iput-object v0, p0, Lqh/f;->c:Lqh/b;

    new-instance v0, Lqh/a;

    mul-int/lit8 p1, p1, 0x3

    invoke-static {p2, v3, p1}, LOh/a;->m([BII)[B

    move-result-object v2

    invoke-static {p2, p1, v1}, LOh/a;->m([BII)[B

    move-result-object p1

    invoke-direct {v0, v2, p1}, Lqh/a;-><init>([B[B)V

    iput-object v0, p0, Lqh/f;->d:Lqh/a;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "private key encoding does not match parameters"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lqh/e;[B[B[B[B)V
    .locals 1

    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0, p1}, Lqh/d;-><init>(ZLqh/e;)V

    new-instance p1, Lqh/b;

    invoke-direct {p1, p2, p3}, Lqh/b;-><init>([B[B)V

    iput-object p1, p0, Lqh/f;->c:Lqh/b;

    new-instance p1, Lqh/a;

    invoke-direct {p1, p4, p5}, Lqh/a;-><init>([B[B)V

    iput-object p1, p0, Lqh/f;->d:Lqh/a;

    return-void
.end method


# virtual methods
.method public c()[B
    .locals 2

    .line 1
    iget-object v0, p0, Lqh/f;->d:Lqh/a;

    .line 2
    .line 3
    iget-object v1, v0, Lqh/a;->a:[B

    .line 4
    .line 5
    iget-object v0, v0, Lqh/a;->b:[B

    .line 6
    .line 7
    invoke-static {v1, v0}, LOh/a;->h([B[B)[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public getEncoded()[B
    .locals 4

    .line 1
    iget-object v0, p0, Lqh/f;->c:Lqh/b;

    .line 2
    .line 3
    iget-object v1, v0, Lqh/b;->a:[B

    .line 4
    .line 5
    iget-object v0, v0, Lqh/b;->b:[B

    .line 6
    .line 7
    iget-object v2, p0, Lqh/f;->d:Lqh/a;

    .line 8
    .line 9
    iget-object v3, v2, Lqh/a;->a:[B

    .line 10
    .line 11
    iget-object v2, v2, Lqh/a;->b:[B

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
