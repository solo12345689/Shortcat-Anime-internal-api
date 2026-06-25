.class public abstract Lkotlin/jvm/internal/O;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lkotlin/jvm/internal/P;

.field private static final b:[Lpe/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-class v1, Lse/b1;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Lkotlin/jvm/internal/P;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    move-object v0, v1

    .line 11
    :catch_0
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Lkotlin/jvm/internal/P;

    .line 15
    .line 16
    invoke-direct {v0}, Lkotlin/jvm/internal/P;-><init>()V

    .line 17
    .line 18
    .line 19
    :goto_0
    sput-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    new-array v0, v0, [Lpe/d;

    .line 23
    .line 24
    sput-object v0, Lkotlin/jvm/internal/O;->b:[Lpe/d;

    .line 25
    .line 26
    return-void
.end method

.method public static a(Lkotlin/jvm/internal/o;)Lpe/h;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/P;->a(Lkotlin/jvm/internal/o;)Lpe/h;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static b(Ljava/lang/Class;)Lpe/d;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/P;->b(Ljava/lang/Class;)Lpe/d;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static c(Ljava/lang/Class;)Lpe/g;
    .locals 2

    .line 1
    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1}, Lkotlin/jvm/internal/P;->c(Ljava/lang/Class;Ljava/lang/String;)Lpe/g;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static d(Lkotlin/jvm/internal/w;)Lpe/j;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/P;->d(Lkotlin/jvm/internal/w;)Lpe/j;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static e(Lkotlin/jvm/internal/y;)Lpe/k;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/P;->e(Lkotlin/jvm/internal/y;)Lpe/k;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static f(Ljava/lang/Class;)Lpe/q;
    .locals 3

    .line 1
    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    .line 2
    .line 3
    invoke-static {p0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {v0, p0, v1, v2}, Lkotlin/jvm/internal/P;->k(Lpe/f;Ljava/util/List;Z)Lpe/q;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static g(Ljava/lang/Class;Lpe/s;)Lpe/q;
    .locals 2

    .line 1
    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    .line 2
    .line 3
    invoke-static {p0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, p0, p1, v1}, Lkotlin/jvm/internal/P;->k(Lpe/f;Ljava/util/List;Z)Lpe/q;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static h(Ljava/lang/Class;Lpe/s;Lpe/s;)Lpe/q;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    .line 2
    .line 3
    invoke-static {p0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    filled-new-array {p1, p2}, [Lpe/s;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-virtual {v0, p0, p1, p2}, Lkotlin/jvm/internal/P;->k(Lpe/f;Ljava/util/List;Z)Lpe/q;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static varargs i(Ljava/lang/Class;[Lpe/s;)Lpe/q;
    .locals 2

    .line 1
    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    .line 2
    .line 3
    invoke-static {p0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1}, LUd/n;->V0([Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, p0, p1, v1}, Lkotlin/jvm/internal/P;->k(Lpe/f;Ljava/util/List;Z)Lpe/q;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static j(Lkotlin/jvm/internal/C;)Lpe/n;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/P;->f(Lkotlin/jvm/internal/C;)Lpe/n;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static k(Lkotlin/jvm/internal/E;)Lpe/o;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/P;->g(Lkotlin/jvm/internal/E;)Lpe/o;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static l(Lkotlin/jvm/internal/G;)Lpe/p;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/P;->h(Lkotlin/jvm/internal/G;)Lpe/p;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static m(Lkotlin/jvm/internal/n;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/P;->i(Lkotlin/jvm/internal/n;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static n(Lkotlin/jvm/internal/u;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/P;->j(Lkotlin/jvm/internal/u;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static o(Ljava/lang/Class;)Lpe/q;
    .locals 3

    .line 1
    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    .line 2
    .line 3
    invoke-static {p0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, p0, v1, v2}, Lkotlin/jvm/internal/P;->k(Lpe/f;Ljava/util/List;Z)Lpe/q;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static p(Ljava/lang/Class;Lpe/s;)Lpe/q;
    .locals 2

    .line 1
    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    .line 2
    .line 3
    invoke-static {p0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p0, p1, v1}, Lkotlin/jvm/internal/P;->k(Lpe/f;Ljava/util/List;Z)Lpe/q;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static q(Ljava/lang/Class;Lpe/s;Lpe/s;)Lpe/q;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    .line 2
    .line 3
    invoke-static {p0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    filled-new-array {p1, p2}, [Lpe/s;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-virtual {v0, p0, p1, p2}, Lkotlin/jvm/internal/P;->k(Lpe/f;Ljava/util/List;Z)Lpe/q;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method
