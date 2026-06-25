.class public LGh/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/PrivateKey;
.implements Ljava/security/Key;


# instance fields
.field private transient a:Lzg/t;

.field private transient b:Lph/b;

.field private transient c:Lzg/C;


# direct methods
.method public constructor <init>(LCg/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, LGh/a;->a(LCg/b;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private a(LCg/b;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, LCg/b;->l()Lzg/C;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, LGh/a;->c:Lzg/C;

    .line 6
    .line 7
    invoke-virtual {p1}, LCg/b;->r()LDg/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LDg/a;->p()Lzg/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, LVg/h;->l(Ljava/lang/Object;)LVg/h;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, LVg/h;->n()LDg/a;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, LDg/a;->l()Lzg/t;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, LGh/a;->a:Lzg/t;

    .line 28
    .line 29
    invoke-static {p1}, Lrh/a;->b(LCg/b;)LKg/a;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lph/b;

    .line 34
    .line 35
    iput-object p1, p0, LGh/a;->b:Lph/b;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, LGh/a;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    check-cast p1, LGh/a;

    .line 11
    .line 12
    iget-object v1, p0, LGh/a;->a:Lzg/t;

    .line 13
    .line 14
    iget-object v3, p1, LGh/a;->a:Lzg/t;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Lzg/y;->u(Lzg/y;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, LGh/a;->b:Lph/b;

    .line 23
    .line 24
    invoke-virtual {v1}, Lph/b;->c()[B

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object p1, p1, LGh/a;->b:Lph/b;

    .line 29
    .line 30
    invoke-virtual {p1}, Lph/b;->c()[B

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {v1, p1}, LOh/a;->c([B[B)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    return v0

    .line 41
    :cond_1
    return v2
.end method

.method public final getAlgorithm()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "SPHINCS-256"

    .line 2
    .line 3
    return-object v0
.end method

.method public getEncoded()[B
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, LGh/a;->b:Lph/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lph/a;->b()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LGh/a;->b:Lph/b;

    .line 10
    .line 11
    iget-object v1, p0, LGh/a;->c:Lzg/C;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lrh/b;->a(LKg/a;Lzg/C;)LCg/b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, LDg/a;

    .line 19
    .line 20
    sget-object v1, LVg/g;->r:Lzg/t;

    .line 21
    .line 22
    new-instance v2, LVg/h;

    .line 23
    .line 24
    new-instance v3, LDg/a;

    .line 25
    .line 26
    iget-object v4, p0, LGh/a;->a:Lzg/t;

    .line 27
    .line 28
    invoke-direct {v3, v4}, LDg/a;-><init>(Lzg/t;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v2, v3}, LVg/h;-><init>(LDg/a;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, v1, v2}, LDg/a;-><init>(Lzg/t;Lzg/e;)V

    .line 35
    .line 36
    .line 37
    new-instance v1, LCg/b;

    .line 38
    .line 39
    new-instance v2, Lzg/n0;

    .line 40
    .line 41
    iget-object v3, p0, LGh/a;->b:Lph/b;

    .line 42
    .line 43
    invoke-virtual {v3}, Lph/b;->c()[B

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-direct {v2, v3}, Lzg/n0;-><init>([B)V

    .line 48
    .line 49
    .line 50
    iget-object v3, p0, LGh/a;->c:Lzg/C;

    .line 51
    .line 52
    invoke-direct {v1, v0, v2, v3}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    .line 53
    .line 54
    .line 55
    move-object v0, v1

    .line 56
    :goto_0
    invoke-virtual {v0}, Lzg/r;->getEncoded()[B

    .line 57
    .line 58
    .line 59
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    return-object v0

    .line 61
    :catch_0
    const/4 v0, 0x0

    .line 62
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
    .locals 2

    .line 1
    iget-object v0, p0, LGh/a;->a:Lzg/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Lzg/t;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, LGh/a;->b:Lph/b;

    .line 8
    .line 9
    invoke-virtual {v1}, Lph/b;->c()[B

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, LOh/a;->q([B)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    mul-int/lit8 v1, v1, 0x25

    .line 18
    .line 19
    add-int/2addr v0, v1

    .line 20
    return v0
.end method
