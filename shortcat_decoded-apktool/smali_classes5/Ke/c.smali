.class public abstract LKe/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method static synthetic a(LKe/k;Lye/g;)LHe/E;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LKe/c;->g(LKe/k;Lye/g;)LHe/E;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic b(LKe/k;Lze/h;)LHe/E;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LKe/c;->l(LKe/k;Lze/h;)LHe/E;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final c(LKe/k;LKe/p;)LKe/k;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "typeParameterResolver"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, LKe/k;

    .line 12
    .line 13
    invoke-virtual {p0}, LKe/k;->a()LKe/d;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0}, LKe/k;->c()Lkotlin/Lazy;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v0, v1, p1, p0}, LKe/k;-><init>(LKe/d;LKe/p;Lkotlin/Lazy;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method private static final d(LKe/k;Lye/m;LOe/z;ILkotlin/Lazy;)LKe/k;
    .locals 2

    .line 1
    invoke-virtual {p0}, LKe/k;->a()LKe/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    new-instance v1, LKe/m;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1, p2, p3}, LKe/m;-><init>(LKe/k;Lye/m;LOe/z;I)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0}, LKe/k;->f()LKe/p;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :goto_0
    new-instance p0, LKe/k;

    .line 18
    .line 19
    invoke-direct {p0, v0, v1, p4}, LKe/k;-><init>(LKe/d;LKe/p;Lkotlin/Lazy;)V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public static final e(LKe/k;Lye/g;LOe/z;I)LKe/k;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "containingDeclaration"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LTd/q;->c:LTd/q;

    .line 12
    .line 13
    new-instance v1, LKe/a;

    .line 14
    .line 15
    invoke-direct {v1, p0, p1}, LKe/a;-><init>(LKe/k;Lye/g;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {p0, p1, p2, p3, v0}, LKe/c;->d(LKe/k;Lye/m;LOe/z;ILkotlin/Lazy;)LKe/k;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static synthetic f(LKe/k;Lye/g;LOe/z;IILjava/lang/Object;)LKe/k;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 7
    .line 8
    if-eqz p4, :cond_1

    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    :cond_1
    invoke-static {p0, p1, p2, p3}, LKe/c;->e(LKe/k;Lye/g;LOe/z;I)LKe/k;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method private static final g(LKe/k;Lye/g;)LHe/E;
    .locals 0

    .line 1
    invoke-interface {p1}, Lze/a;->getAnnotations()Lze/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p0, p1}, LKe/c;->j(LKe/k;Lze/h;)LHe/E;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static final h(LKe/k;Lye/m;LOe/z;I)LKe/k;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "containingDeclaration"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "typeParameterOwner"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, LKe/k;->c()Lkotlin/Lazy;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {p0, p1, p2, p3, v0}, LKe/c;->d(LKe/k;Lye/m;LOe/z;ILkotlin/Lazy;)LKe/k;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static synthetic i(LKe/k;Lye/m;LOe/z;IILjava/lang/Object;)LKe/k;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1, p2, p3}, LKe/c;->h(LKe/k;Lye/m;LOe/z;I)LKe/k;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final j(LKe/k;Lze/h;)LHe/E;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "additionalAnnotations"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LKe/k;->a()LKe/d;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, LKe/d;->a()LHe/d;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0}, LKe/k;->b()LHe/E;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {v0, p0, p1}, LHe/b;->d(LHe/E;Ljava/lang/Iterable;)LHe/E;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public static final k(LKe/k;Lze/h;)LKe/k;
    .locals 5

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "additionalAnnotations"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lze/h;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    new-instance v0, LKe/k;

    .line 19
    .line 20
    invoke-virtual {p0}, LKe/k;->a()LKe/d;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p0}, LKe/k;->f()LKe/p;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    sget-object v3, LTd/q;->c:LTd/q;

    .line 29
    .line 30
    new-instance v4, LKe/b;

    .line 31
    .line 32
    invoke-direct {v4, p0, p1}, LKe/b;-><init>(LKe/k;Lze/h;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v3, v4}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-direct {v0, v1, v2, p0}, LKe/k;-><init>(LKe/d;LKe/p;Lkotlin/Lazy;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method private static final l(LKe/k;Lze/h;)LHe/E;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LKe/c;->j(LKe/k;Lze/h;)LHe/E;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final m(LKe/k;LKe/d;)LKe/k;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "components"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, LKe/k;

    .line 12
    .line 13
    invoke-virtual {p0}, LKe/k;->f()LKe/p;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0}, LKe/k;->c()Lkotlin/Lazy;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v0, p1, v1, p0}, LKe/k;-><init>(LKe/d;LKe/p;Lkotlin/Lazy;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method
