.class public LZg/e;
.super LZg/b;


# instance fields
.field final c:[B

.field final d:[B


# direct methods
.method public constructor <init>(LZg/c;[B)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0, p1}, LZg/b;-><init>(ZLZg/c;)V

    const/16 p1, 0x20

    invoke-static {p2, v0, p1}, LOh/a;->m([BII)[B

    move-result-object v0

    iput-object v0, p0, LZg/e;->c:[B

    array-length v0, p2

    invoke-static {p2, p1, v0}, LOh/a;->m([BII)[B

    move-result-object p1

    iput-object p1, p0, LZg/e;->d:[B

    return-void
.end method

.method public constructor <init>(LZg/c;[B[B)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0, p1}, LZg/b;-><init>(ZLZg/c;)V

    invoke-static {p2}, LOh/a;->f([B)[B

    move-result-object p1

    iput-object p1, p0, LZg/e;->c:[B

    invoke-static {p3}, LOh/a;->f([B)[B

    move-result-object p1

    iput-object p1, p0, LZg/e;->d:[B

    return-void
.end method

.method static c([B[B)[B
    .locals 0

    .line 1
    invoke-static {p0, p1}, LOh/a;->h([B[B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public d()[B
    .locals 1

    .line 1
    iget-object v0, p0, LZg/e;->d:[B

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

.method public getEncoded()[B
    .locals 2

    .line 1
    iget-object v0, p0, LZg/e;->c:[B

    .line 2
    .line 3
    iget-object v1, p0, LZg/e;->d:[B

    .line 4
    .line 5
    invoke-static {v0, v1}, LZg/e;->c([B[B)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
