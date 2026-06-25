.class public LCg/b;
.super Lzg/r;


# instance fields
.field private a:Lzg/o;

.field private b:LDg/a;

.field private c:Lzg/u;

.field private d:Lzg/C;

.field private e:Lzg/b;


# direct methods
.method public constructor <init>(LDg/a;Lzg/e;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0, v0}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;[B)V

    return-void
.end method

.method public constructor <init>(LDg/a;Lzg/e;Lzg/C;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;[B)V

    return-void
.end method

.method public constructor <init>(LDg/a;Lzg/e;Lzg/C;[B)V
    .locals 1

    .line 3
    invoke-interface {p2}, Lzg/e;->e()Lzg/y;

    move-result-object p2

    const-string v0, "DER"

    invoke-virtual {p2, v0}, Lzg/r;->i(Ljava/lang/String;)[B

    move-result-object p2

    invoke-direct {p0, p1, p2, p3, p4}, LCg/b;-><init>(LDg/a;[BLzg/C;[B)V

    return-void
.end method

.method public constructor <init>(LDg/a;[BLzg/C;)V
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, p2, p3, v0}, LCg/b;-><init>(LDg/a;[BLzg/C;[B)V

    return-void
.end method

.method public constructor <init>(LDg/a;[BLzg/C;[B)V
    .locals 2

    .line 5
    invoke-direct {p0}, Lzg/r;-><init>()V

    new-instance v0, Lzg/o;

    if-eqz p4, :cond_0

    sget-object v1, LOh/b;->b:Ljava/math/BigInteger;

    goto :goto_0

    :cond_0
    sget-object v1, LOh/b;->a:Ljava/math/BigInteger;

    :goto_0
    invoke-direct {v0, v1}, Lzg/o;-><init>(Ljava/math/BigInteger;)V

    iput-object v0, p0, LCg/b;->a:Lzg/o;

    iput-object p1, p0, LCg/b;->b:LDg/a;

    new-instance p1, Lzg/n0;

    invoke-direct {p1, p2}, Lzg/n0;-><init>([B)V

    iput-object p1, p0, LCg/b;->c:Lzg/u;

    iput-object p3, p0, LCg/b;->d:Lzg/C;

    if-nez p4, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    new-instance p1, Lzg/e0;

    invoke-direct {p1, p4}, Lzg/e0;-><init>([B)V

    :goto_1
    iput-object p1, p0, LCg/b;->e:Lzg/b;

    return-void
.end method

.method private constructor <init>(Lzg/B;)V
    .locals 5

    .line 6
    invoke-direct {p0}, Lzg/r;-><init>()V

    invoke-virtual {p1}, Lzg/B;->D()Ljava/util/Enumeration;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lzg/o;->z(Ljava/lang/Object;)Lzg/o;

    move-result-object v0

    iput-object v0, p0, LCg/b;->a:Lzg/o;

    invoke-static {v0}, LCg/b;->t(Lzg/o;)I

    move-result v0

    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, LDg/a;->n(Ljava/lang/Object;)LDg/a;

    move-result-object v1

    iput-object v1, p0, LCg/b;->b:LDg/a;

    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    move-result-object v1

    iput-object v1, p0, LCg/b;->c:Lzg/u;

    const/4 v1, -0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzg/G;

    invoke-virtual {v2}, Lzg/G;->K()I

    move-result v3

    if-le v3, v1, :cond_3

    const/4 v1, 0x0

    if-eqz v3, :cond_2

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    if-lt v0, v4, :cond_0

    invoke-static {v2, v1}, Lzg/b;->B(Lzg/G;Z)Lzg/b;

    move-result-object v1

    iput-object v1, p0, LCg/b;->e:Lzg/b;

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'publicKey\' requires version v2(1) or later"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "unknown optional field in private key info"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v2, v1}, Lzg/C;->z(Lzg/G;Z)Lzg/C;

    move-result-object v1

    iput-object v1, p0, LCg/b;->d:Lzg/C;

    :goto_1
    move v1, v3

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid optional field in private key info"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-void
.end method

.method public static n(Ljava/lang/Object;)LCg/b;
    .locals 1

    .line 1
    instance-of v0, p0, LCg/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LCg/b;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    if-eqz p0, :cond_1

    .line 9
    .line 10
    new-instance v0, LCg/b;

    .line 11
    .line 12
    invoke-static {p0}, Lzg/B;->A(Ljava/lang/Object;)Lzg/B;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-direct {v0, p0}, LCg/b;-><init>(Lzg/B;)V

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

.method private static t(Lzg/o;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzg/o;->G()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-ltz p0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-gt p0, v0, :cond_0

    .line 9
    .line 10
    return p0

    .line 11
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    const-string v0, "invalid version for private key info"

    .line 14
    .line 15
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p0
.end method


# virtual methods
.method public e()Lzg/y;
    .locals 5

    .line 1
    new-instance v0, Lzg/f;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Lzg/f;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LCg/b;->a:Lzg/o;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, LCg/b;->b:LDg/a;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, LCg/b;->c:Lzg/u;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, LCg/b;->d:Lzg/C;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    new-instance v3, Lzg/u0;

    .line 28
    .line 29
    invoke-direct {v3, v2, v2, v1}, Lzg/u0;-><init>(ZILzg/e;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v3}, Lzg/f;->a(Lzg/e;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object v1, p0, LCg/b;->e:Lzg/b;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    new-instance v3, Lzg/u0;

    .line 40
    .line 41
    const/4 v4, 0x1

    .line 42
    invoke-direct {v3, v2, v4, v1}, Lzg/u0;-><init>(ZILzg/e;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v3}, Lzg/f;->a(Lzg/e;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    new-instance v1, Lzg/r0;

    .line 49
    .line 50
    invoke-direct {v1, v0}, Lzg/r0;-><init>(Lzg/f;)V

    .line 51
    .line 52
    .line 53
    return-object v1
.end method

.method public l()Lzg/C;
    .locals 1

    .line 1
    iget-object v0, p0, LCg/b;->d:Lzg/C;

    .line 2
    .line 3
    return-object v0
.end method

.method public p()Lzg/u;
    .locals 2

    .line 1
    new-instance v0, Lzg/n0;

    .line 2
    .line 3
    iget-object v1, p0, LCg/b;->c:Lzg/u;

    .line 4
    .line 5
    invoke-virtual {v1}, Lzg/u;->B()[B

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lzg/n0;-><init>([B)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public r()LDg/a;
    .locals 1

    .line 1
    iget-object v0, p0, LCg/b;->b:LDg/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public s()Lzg/b;
    .locals 1

    .line 1
    iget-object v0, p0, LCg/b;->e:Lzg/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public u()Lzg/e;
    .locals 1

    .line 1
    iget-object v0, p0, LCg/b;->c:Lzg/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lzg/y;->v([B)Lzg/y;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
