.class abstract LCf/s;
.super LCf/n;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, LCf/s;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(LCf/i;)Ljava/util/Iterator;
    .locals 0

    .line 1
    invoke-static {p0}, LCf/s;->l(LCf/i;)Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Lie/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LCf/s;->q(Lie/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, LCf/s;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static g(Ljava/util/Iterator;)LCf/i;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LCf/s$a;

    .line 7
    .line 8
    invoke-direct {v0, p0}, LCf/s$a;-><init>(Ljava/util/Iterator;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, LCf/s;->h(LCf/i;)LCf/i;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static h(LCf/i;)LCf/i;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, LCf/a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, LCf/a;

    .line 12
    .line 13
    invoke-direct {v0, p0}, LCf/a;-><init>(LCf/i;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static i()LCf/i;
    .locals 1

    .line 1
    sget-object v0, LCf/e;->a:LCf/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final j(LCf/i;)LCf/i;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LCf/q;

    .line 7
    .line 8
    invoke-direct {v0}, LCf/q;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0}, LCf/s;->k(LCf/i;Lkotlin/jvm/functions/Function1;)LCf/i;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method private static final k(LCf/i;Lkotlin/jvm/functions/Function1;)LCf/i;
    .locals 2

    .line 1
    instance-of v0, p0, LCf/z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LCf/z;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, LCf/z;->e(Lkotlin/jvm/functions/Function1;)LCf/i;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, LCf/g;

    .line 13
    .line 14
    new-instance v1, LCf/r;

    .line 15
    .line 16
    invoke-direct {v1}, LCf/r;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0, v1, p1}, LCf/g;-><init>(LCf/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method private static final l(LCf/i;)Ljava/util/Iterator;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, LCf/i;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p0
.end method

.method public static n(Lie/a;)LCf/i;
    .locals 2

    .line 1
    const-string v0, "nextFunction"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LCf/h;

    .line 7
    .line 8
    new-instance v1, LCf/p;

    .line 9
    .line 10
    invoke-direct {v1, p0}, LCf/p;-><init>(Lie/a;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, LCf/h;-><init>(Lie/a;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, LCf/s;->h(LCf/i;)LCf/i;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static o(Lie/a;Lkotlin/jvm/functions/Function1;)LCf/i;
    .locals 1

    .line 1
    const-string v0, "seedFunction"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "nextFunction"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, LCf/h;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, LCf/h;-><init>(Lie/a;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static p(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)LCf/i;
    .locals 2

    .line 1
    const-string v0, "nextFunction"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    sget-object p0, LCf/e;->a:LCf/e;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, LCf/h;

    .line 12
    .line 13
    new-instance v1, LCf/o;

    .line 14
    .line 15
    invoke-direct {v1, p0}, LCf/o;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, p1}, LCf/h;-><init>(Lie/a;Lkotlin/jvm/functions/Function1;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method private static final q(Lie/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p0
.end method

.method public static varargs s([Ljava/lang/Object;)LCf/i;
    .locals 1

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, LUd/n;->M([Ljava/lang/Object;)LCf/i;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
