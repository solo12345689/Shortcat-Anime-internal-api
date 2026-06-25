.class public abstract Lio/sentry/util/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/util/l$a;,
        Lio/sentry/util/l$b;
    }
.end annotation


# direct methods
.method public static synthetic a(Lio/sentry/ILogger;Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-static {p2, p1, p0}, Lio/sentry/util/t;->a(Ljava/lang/Class;Ljava/lang/Object;Lio/sentry/ILogger;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static c(Ljava/lang/Object;)Lio/sentry/H;
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/H;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/H;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p0}, Lio/sentry/util/l;->m(Lio/sentry/H;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static d(Lio/sentry/H;)Lio/sentry/hints/h;
    .locals 2

    .line 1
    const-string v0, "sentry:eventDropReason"

    .line 2
    .line 3
    const-class v1, Lio/sentry/hints/h;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lio/sentry/H;->d(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lio/sentry/hints/h;

    .line 10
    .line 11
    return-object p0
.end method

.method public static e(Lio/sentry/H;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "sentry:typeCheckHint"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lio/sentry/H;->c(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static f(Lio/sentry/H;Ljava/lang/Class;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lio/sentry/util/l;->e(Lio/sentry/H;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public static g(Lio/sentry/H;)Z
    .locals 3

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    const-string v1, "sentry:isFromHybridSdk"

    .line 4
    .line 5
    const-class v2, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0, v1, v2}, Lio/sentry/H;->d(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public static h(Lio/sentry/H;Ljava/lang/Class;Lio/sentry/util/l$a;)V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/util/j;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/util/j;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, p2, v0}, Lio/sentry/util/l;->i(Lio/sentry/H;Ljava/lang/Class;Lio/sentry/util/l$a;Lio/sentry/util/l$b;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static i(Lio/sentry/H;Ljava/lang/Class;Lio/sentry/util/l$a;Lio/sentry/util/l$b;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lio/sentry/util/l;->e(Lio/sentry/H;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, p1}, Lio/sentry/util/l;->f(Lio/sentry/H;Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p2, v0}, Lio/sentry/util/l$a;->accept(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-interface {p3, v0, p1}, Lio/sentry/util/l$b;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static j(Lio/sentry/H;Ljava/lang/Class;Lio/sentry/ILogger;Lio/sentry/util/l$a;)V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/util/k;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Lio/sentry/util/k;-><init>(Lio/sentry/ILogger;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, p3, v0}, Lio/sentry/util/l;->i(Lio/sentry/H;Ljava/lang/Class;Lio/sentry/util/l$a;Lio/sentry/util/l$b;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static k(Lio/sentry/H;Lio/sentry/hints/h;)V
    .locals 1

    .line 1
    const-string v0, "sentry:eventDropReason"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lio/sentry/H;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static l(Lio/sentry/H;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "sentry.javascript"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "sentry.dart"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-string v0, "sentry.dotnet"

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void

    .line 27
    :cond_1
    :goto_0
    const-string p1, "sentry:isFromHybridSdk"

    .line 28
    .line 29
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p0, p1, v0}, Lio/sentry/H;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static m(Lio/sentry/H;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "sentry:typeCheckHint"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lio/sentry/H;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static n(Lio/sentry/H;)Z
    .locals 1

    .line 1
    const-class v0, Lio/sentry/hints/e;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lio/sentry/util/l;->f(Lio/sentry/H;Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-class v0, Lio/sentry/hints/c;

    .line 10
    .line 11
    invoke-static {p0, v0}, Lio/sentry/util/l;->f(Lio/sentry/H;Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    :cond_0
    const-class v0, Lio/sentry/hints/b;

    .line 18
    .line 19
    invoke-static {p0, v0}, Lio/sentry/util/l;->f(Lio/sentry/H;Ljava/lang/Class;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    :cond_1
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_2
    const/4 p0, 0x0

    .line 28
    return p0
.end method
