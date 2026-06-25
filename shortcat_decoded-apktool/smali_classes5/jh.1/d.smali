.class public Ljh/d;
.super Ljh/a;


# instance fields
.field private final c:[B

.field private final d:[B


# direct methods
.method public constructor <init>(Ljh/b;[B)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0, p1}, Ljh/a;-><init>(ZLjh/b;)V

    .line 3
    .line 4
    .line 5
    const/16 p1, 0x20

    .line 6
    .line 7
    invoke-static {p2, v0, p1}, LOh/a;->m([BII)[B

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Ljh/d;->c:[B

    .line 12
    .line 13
    array-length p1, p1

    .line 14
    array-length v0, p2

    .line 15
    invoke-static {p2, p1, v0}, LOh/a;->m([BII)[B

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Ljh/d;->d:[B

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public getEncoded()[B
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljh/a;->b()Ljh/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljh/b;->a()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-array v0, v0, [B

    .line 10
    .line 11
    iget-object v1, p0, Ljh/d;->c:[B

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Ljh/d;->d:[B

    .line 19
    .line 20
    iget-object v2, p0, Ljh/d;->c:[B

    .line 21
    .line 22
    array-length v2, v2

    .line 23
    array-length v4, v1

    .line 24
    invoke-static {v1, v3, v0, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method
