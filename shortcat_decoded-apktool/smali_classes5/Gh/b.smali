.class public LGh/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/PublicKey;
.implements Ljava/security/Key;


# instance fields
.field private transient a:Lzg/t;

.field private transient b:Lph/c;


# direct methods
.method public constructor <init>(LDg/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, LGh/b;->a(LDg/b;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private a(LDg/b;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, LDg/b;->l()LDg/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LDg/a;->p()Lzg/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, LVg/h;->l(Ljava/lang/Object;)LVg/h;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, LVg/h;->n()LDg/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, LDg/a;->l()Lzg/t;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, LGh/b;->a:Lzg/t;

    .line 22
    .line 23
    invoke-static {p1}, Lrh/c;->a(LDg/b;)LKg/a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lph/c;

    .line 28
    .line 29
    iput-object p1, p0, LGh/b;->b:Lph/c;

    .line 30
    .line 31
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
    instance-of v1, p1, LGh/b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    check-cast p1, LGh/b;

    .line 11
    .line 12
    iget-object v1, p0, LGh/b;->a:Lzg/t;

    .line 13
    .line 14
    iget-object v3, p1, LGh/b;->a:Lzg/t;

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
    iget-object v1, p0, LGh/b;->b:Lph/c;

    .line 23
    .line 24
    invoke-virtual {v1}, Lph/c;->c()[B

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object p1, p1, LGh/b;->b:Lph/c;

    .line 29
    .line 30
    invoke-virtual {p1}, Lph/c;->c()[B

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
    iget-object v0, p0, LGh/b;->b:Lph/c;

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
    iget-object v0, p0, LGh/b;->b:Lph/c;

    .line 10
    .line 11
    invoke-static {v0}, Lrh/d;->a(LKg/a;)LDg/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, LDg/a;

    .line 17
    .line 18
    sget-object v1, LVg/g;->r:Lzg/t;

    .line 19
    .line 20
    new-instance v2, LVg/h;

    .line 21
    .line 22
    new-instance v3, LDg/a;

    .line 23
    .line 24
    iget-object v4, p0, LGh/b;->a:Lzg/t;

    .line 25
    .line 26
    invoke-direct {v3, v4}, LDg/a;-><init>(Lzg/t;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v2, v3}, LVg/h;-><init>(LDg/a;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1, v2}, LDg/a;-><init>(Lzg/t;Lzg/e;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, LDg/b;

    .line 36
    .line 37
    iget-object v2, p0, LGh/b;->b:Lph/c;

    .line 38
    .line 39
    invoke-virtual {v2}, Lph/c;->c()[B

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-direct {v1, v0, v2}, LDg/b;-><init>(LDg/a;[B)V

    .line 44
    .line 45
    .line 46
    move-object v0, v1

    .line 47
    :goto_0
    invoke-virtual {v0}, Lzg/r;->getEncoded()[B

    .line 48
    .line 49
    .line 50
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    return-object v0

    .line 52
    :catch_0
    const/4 v0, 0x0

    .line 53
    return-object v0
.end method

.method public getFormat()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "X.509"

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, LGh/b;->a:Lzg/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Lzg/t;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, LGh/b;->b:Lph/c;

    .line 8
    .line 9
    invoke-virtual {v1}, Lph/c;->c()[B

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
