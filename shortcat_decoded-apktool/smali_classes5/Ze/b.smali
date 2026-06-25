.class public abstract LZe/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/r;


# static fields
.field private static final a:LZe/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, LZe/g;->c()LZe/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, LZe/b;->a:LZe/g;

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private d(LZe/p;)LZe/p;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-interface {p1}, LZe/q;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-direct {p0, p1}, LZe/b;->e(LZe/p;)LZe/v;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, LZe/v;->a()LZe/k;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p1}, LZe/k;->i(LZe/p;)LZe/k;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    throw p1

    .line 23
    :cond_1
    :goto_0
    return-object p1
.end method

.method private e(LZe/p;)LZe/v;
    .locals 1

    .line 1
    instance-of v0, p1, LZe/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LZe/a;

    .line 6
    .line 7
    invoke-virtual {p1}, LZe/a;->b()LZe/v;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    new-instance v0, LZe/v;

    .line 13
    .line 14
    invoke-direct {v0, p1}, LZe/v;-><init>(LZe/p;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/io/InputStream;LZe/g;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LZe/b;->f(Ljava/io/InputStream;LZe/g;)LZe/p;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic c(Ljava/io/InputStream;LZe/g;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LZe/b;->g(Ljava/io/InputStream;LZe/g;)LZe/p;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public f(Ljava/io/InputStream;LZe/g;)LZe/p;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LZe/b;->h(Ljava/io/InputStream;LZe/g;)LZe/p;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, LZe/b;->d(LZe/p;)LZe/p;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public g(Ljava/io/InputStream;LZe/g;)LZe/p;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LZe/b;->i(Ljava/io/InputStream;LZe/g;)LZe/p;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, LZe/b;->d(LZe/p;)LZe/p;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public h(Ljava/io/InputStream;LZe/g;)LZe/p;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-static {v0, p1}, LZe/e;->A(ILjava/io/InputStream;)I

    .line 11
    .line 12
    .line 13
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    new-instance v1, LZe/a$a$a;

    .line 15
    .line 16
    invoke-direct {v1, p1, v0}, LZe/a$a$a;-><init>(Ljava/io/InputStream;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v1, p2}, LZe/b;->i(Ljava/io/InputStream;LZe/g;)LZe/p;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :catch_0
    move-exception p1

    .line 25
    new-instance p2, LZe/k;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {p2, p1}, LZe/k;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p2
.end method

.method public i(Ljava/io/InputStream;LZe/g;)LZe/p;
    .locals 1

    .line 1
    invoke-static {p1}, LZe/e;->g(Ljava/io/InputStream;)LZe/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1, p2}, LZe/r;->b(LZe/e;LZe/g;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p2, LZe/p;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :try_start_0
    invoke-virtual {p1, v0}, LZe/e;->a(I)V
    :try_end_0
    .catch LZe/k; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    return-object p2

    .line 16
    :catch_0
    move-exception p1

    .line 17
    invoke-virtual {p1, p2}, LZe/k;->i(LZe/p;)LZe/k;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    throw p1
.end method
