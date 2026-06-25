.class public LOg/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/PrivateKey;
.implements Ljava/security/Key;


# instance fields
.field private transient a:Lgh/f;

.field private transient b:Ljava/lang/String;

.field private transient c:Lzg/C;

.field private transient d:[B


# direct methods
.method public constructor <init>(LCg/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1}, LOg/a;->e(LCg/b;)V

    return-void
.end method

.method public constructor <init>(Lgh/f;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOg/a;->a:Lgh/f;

    invoke-virtual {p1}, Lgh/d;->b()Lgh/e;

    move-result-object p1

    invoke-virtual {p1}, Lgh/e;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LOh/i;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LOg/a;->b:Ljava/lang/String;

    return-void
.end method

.method private e(LCg/b;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, LCg/b;->l()Lzg/C;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, LOg/a;->c:Lzg/C;

    .line 6
    .line 7
    invoke-virtual {p1}, Lzg/r;->getEncoded()[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, LOg/a;->d:[B

    .line 12
    .line 13
    invoke-static {p1}, Lrh/a;->b(LCg/b;)LKg/a;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lgh/f;

    .line 18
    .line 19
    iput-object p1, p0, LOg/a;->a:Lgh/f;

    .line 20
    .line 21
    invoke-virtual {p1}, Lgh/d;->b()Lgh/e;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lgh/e;->b()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, LSg/a;->a(Ljava/lang/String;)LSg/a;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, LSg/a;->b()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, LOh/i;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, LOg/a;->b:Ljava/lang/String;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public a()LSg/a;
    .locals 1

    .line 1
    iget-object v0, p0, LOg/a;->a:Lgh/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lgh/d;->b()Lgh/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lgh/e;->b()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, LSg/a;->a(Ljava/lang/String;)LSg/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public b()[B
    .locals 1

    .line 1
    iget-object v0, p0, LOg/a;->a:Lgh/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lgh/f;->getEncoded()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public c()LNg/a;
    .locals 2

    .line 1
    new-instance v0, LOg/b;

    .line 2
    .line 3
    iget-object v1, p0, LOg/a;->a:Lgh/f;

    .line 4
    .line 5
    invoke-virtual {v1}, Lgh/f;->e()Lgh/g;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, LOg/b;-><init>(Lgh/g;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public d()[B
    .locals 1

    .line 1
    iget-object v0, p0, LOg/a;->a:Lgh/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lgh/f;->f()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, LOg/a;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p1, LOg/a;

    .line 10
    .line 11
    iget-object v0, p0, LOg/a;->a:Lgh/f;

    .line 12
    .line 13
    invoke-virtual {v0}, Lgh/f;->getEncoded()[B

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object p1, p1, LOg/a;->a:Lgh/f;

    .line 18
    .line 19
    invoke-virtual {p1}, Lgh/f;->getEncoded()[B

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {v0, p1}, LOh/a;->c([B[B)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    return p1
.end method

.method public final getAlgorithm()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LOg/a;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEncoded()[B
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, LOg/a;->d:[B

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, LOg/a;->a:Lgh/f;

    .line 7
    .line 8
    iget-object v1, p0, LOg/a;->c:Lzg/C;

    .line 9
    .line 10
    invoke-static {v0, v1}, Lrh/b;->a(LKg/a;Lzg/C;)LCg/b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lzg/r;->getEncoded()[B

    .line 15
    .line 16
    .line 17
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    return-object v0

    .line 19
    :catch_0
    const/4 v0, 0x0

    .line 20
    return-object v0
.end method

.method public getFormat()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "PKCS#8"

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LOg/a;->a:Lgh/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lgh/f;->getEncoded()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, LOh/a;->q([B)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LOh/i;->d()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v2, p0, LOg/a;->a:Lgh/f;

    .line 11
    .line 12
    invoke-virtual {v2}, Lgh/f;->d()[B

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {p0}, LOg/a;->getAlgorithm()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v3, " "

    .line 24
    .line 25
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v3, "Private Key"

    .line 29
    .line 30
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v3, " ["

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    new-instance v3, LOh/d;

    .line 39
    .line 40
    invoke-direct {v3, v2}, LOh/d;-><init>([B)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, LOh/d;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v3, "]"

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v3, "    public data: "

    .line 59
    .line 60
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-static {v2}, LPh/c;->d([B)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    return-object v0
.end method
