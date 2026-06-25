.class public Lnh/g;
.super Lnh/d;


# instance fields
.field private final c:Lnh/a;


# direct methods
.method public constructor <init>(Lnh/e;[B)V
    .locals 3

    .line 1
    const/4 v0, 0x0

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
    array-length v1, p2

    .line 10
    mul-int/lit8 v2, p1, 0x2

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    new-instance v1, Lnh/a;

    .line 15
    .line 16
    invoke-static {p2, v0, p1}, LOh/a;->m([BII)[B

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {p2, p1, v2}, LOh/a;->m([BII)[B

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-direct {v1, v0, p1}, Lnh/a;-><init>([B[B)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lnh/g;->c:Lnh/a;

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    const-string p2, "public key encoding does not match parameters"

    .line 33
    .line 34
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1
.end method


# virtual methods
.method public getEncoded()[B
    .locals 2

    .line 1
    iget-object v0, p0, Lnh/g;->c:Lnh/a;

    .line 2
    .line 3
    iget-object v1, v0, Lnh/a;->a:[B

    .line 4
    .line 5
    iget-object v0, v0, Lnh/a;->b:[B

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
