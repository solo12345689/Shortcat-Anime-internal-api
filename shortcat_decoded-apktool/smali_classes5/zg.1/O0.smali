.class Lzg/O0;
.super Lzg/B;


# instance fields
.field private c:[B


# direct methods
.method constructor <init>([B)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lzg/B;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lzg/O0;->c:[B

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 10
    .line 11
    const-string v0, "\'encoded\' cannot be null"

    .line 12
    .line 13
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p1
.end method

.method private declared-synchronized M()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lzg/O0;->c:[B

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lzg/n;

    .line 7
    .line 8
    iget-object v1, p0, Lzg/O0;->c:[B

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-direct {v0, v1, v2}, Lzg/n;-><init>([BZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    :try_start_1
    invoke-virtual {v0}, Lzg/n;->z()Lzg/f;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lzg/f;->g()[Lzg/e;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lzg/B;->a:[Lzg/e;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, Lzg/O0;->c:[B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto :goto_1

    .line 33
    :catch_0
    move-exception v0

    .line 34
    :try_start_2
    new-instance v1, Lzg/x;

    .line 35
    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v3, "malformed ASN.1: "

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-direct {v1, v2, v0}, Lzg/x;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    :cond_0
    :goto_0
    monitor-exit p0

    .line 58
    return-void

    .line 59
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 60
    throw v0
.end method

.method private declared-synchronized N()[B
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lzg/O0;->c:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method


# virtual methods
.method public B(I)Lzg/e;
    .locals 0

    .line 1
    invoke-direct {p0}, Lzg/O0;->M()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Lzg/B;->B(I)Lzg/e;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public D()Ljava/util/Enumeration;
    .locals 2

    .line 1
    invoke-direct {p0}, Lzg/O0;->N()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, Lzg/N0;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lzg/N0;-><init>([B)V

    .line 10
    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    invoke-super {p0}, Lzg/B;->D()Ljava/util/Enumeration;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method F()Lzg/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzg/O0;->x()Lzg/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lzg/B;

    .line 6
    .line 7
    invoke-virtual {v0}, Lzg/B;->F()Lzg/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method G()Lzg/i;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzg/O0;->x()Lzg/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lzg/B;

    .line 6
    .line 7
    invoke-virtual {v0}, Lzg/B;->G()Lzg/i;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method I()Lzg/u;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzg/O0;->x()Lzg/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lzg/B;

    .line 6
    .line 7
    invoke-virtual {v0}, Lzg/B;->I()Lzg/u;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method K()Lzg/C;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzg/O0;->x()Lzg/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lzg/B;

    .line 6
    .line 7
    invoke-virtual {v0}, Lzg/B;->K()Lzg/C;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lzg/O0;->M()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Lzg/B;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-direct {p0}, Lzg/O0;->M()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Lzg/B;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method n(Lzg/w;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lzg/O0;->N()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x30

    .line 8
    .line 9
    invoke-virtual {p1, p2, v1, v0}, Lzg/w;->o(ZI[B)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-super {p0}, Lzg/B;->x()Lzg/y;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1, p2}, Lzg/y;->n(Lzg/w;Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public size()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lzg/O0;->M()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Lzg/B;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method t(Z)I
    .locals 1

    .line 1
    invoke-direct {p0}, Lzg/O0;->N()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    array-length v0, v0

    .line 8
    invoke-static {p1, v0}, Lzg/w;->g(ZI)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1

    .line 13
    :cond_0
    invoke-super {p0}, Lzg/B;->x()Lzg/y;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1}, Lzg/y;->t(Z)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method w()Lzg/y;
    .locals 1

    .line 1
    invoke-direct {p0}, Lzg/O0;->M()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Lzg/B;->w()Lzg/y;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method x()Lzg/y;
    .locals 1

    .line 1
    invoke-direct {p0}, Lzg/O0;->M()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Lzg/B;->x()Lzg/y;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method
