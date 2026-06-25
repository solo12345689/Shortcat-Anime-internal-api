.class public abstract Lzg/y;
.super Lzg/r;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lzg/r;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static v([B)Lzg/y;
    .locals 1

    .line 1
    new-instance v0, Lzg/n;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lzg/n;-><init>([B)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {v0}, Lzg/n;->o()Lzg/y;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    new-instance p0, Ljava/io/IOException;

    .line 18
    .line 19
    const-string v0, "Extra data detected in stream"

    .line 20
    .line 21
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    :catch_0
    new-instance p0, Ljava/io/IOException;

    .line 26
    .line 27
    const-string v0, "cannot recognise object in stream"

    .line 28
    .line 29
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p0
.end method


# virtual methods
.method public final e()Lzg/y;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lzg/e;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Lzg/e;

    .line 10
    .line 11
    invoke-interface {p1}, Lzg/e;->e()Lzg/y;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Lzg/y;->l(Lzg/y;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    return v0

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    return p1
.end method

.method public abstract hashCode()I
.end method

.method abstract l(Lzg/y;)Z
.end method

.method abstract n(Lzg/w;Z)V
.end method

.method abstract p()Z
.end method

.method public r(Ljava/io/OutputStream;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lzg/w;->a(Ljava/io/OutputStream;)Lzg/w;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p1, p0, v0}, Lzg/w;->u(Lzg/y;Z)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lzg/w;->c()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public s(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lzg/w;->b(Ljava/io/OutputStream;Ljava/lang/String;)Lzg/w;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 p2, 0x1

    .line 6
    invoke-virtual {p1, p0, p2}, Lzg/w;->u(Lzg/y;Z)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lzg/w;->c()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method abstract t(Z)I
.end method

.method public final u(Lzg/y;)Z
    .locals 0

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lzg/y;->l(Lzg/y;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1

    .line 12
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 13
    return p1
.end method

.method w()Lzg/y;
    .locals 0

    .line 1
    return-object p0
.end method

.method x()Lzg/y;
    .locals 0

    .line 1
    return-object p0
.end method
