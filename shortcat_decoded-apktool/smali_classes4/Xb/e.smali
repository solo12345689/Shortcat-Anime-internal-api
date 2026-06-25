.class public final LXb/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Ljava/lang/reflect/Constructor;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, LXb/e;->f(Ljava/lang/reflect/Constructor;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(LXb/i;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, LXb/e;->j(LXb/i;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Lpe/h;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, LXb/e;->h(Lpe/h;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final e(Ljava/lang/Class;)LXb/a;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance v1, LXb/c;

    .line 17
    .line 18
    invoke-direct {v1, p1}, LXb/c;-><init>(Ljava/lang/reflect/Constructor;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :catch_0
    return-object v0
.end method

.method private static final f(Ljava/lang/reflect/Constructor;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method private final g(Lpe/d;)LXb/a;
    .locals 6

    .line 1
    invoke-interface {p1}, Lpe/d;->i()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Iterable;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    move-object v2, v0

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_4

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    move-object v4, v3

    .line 25
    check-cast v4, Lpe/h;

    .line 26
    .line 27
    invoke-interface {v4}, Lpe/c;->getParameters()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_2

    .line 49
    .line 50
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    check-cast v5, Lpe/l;

    .line 55
    .line 56
    invoke-interface {v5}, Lpe/l;->p()Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-nez v5, :cond_1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    .line 64
    .line 65
    :goto_2
    move-object v2, v0

    .line 66
    goto :goto_3

    .line 67
    :cond_3
    const/4 v1, 0x1

    .line 68
    move-object v2, v3

    .line 69
    goto :goto_0

    .line 70
    :cond_4
    if-nez v1, :cond_5

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_5
    :goto_3
    check-cast v2, Lpe/h;

    .line 74
    .line 75
    if-nez v2, :cond_6

    .line 76
    .line 77
    return-object v0

    .line 78
    :cond_6
    new-instance p1, LXb/d;

    .line 79
    .line 80
    invoke-direct {p1, v2}, LXb/d;-><init>(Lpe/h;)V

    .line 81
    .line 82
    .line 83
    return-object p1
.end method

.method private static final h(Lpe/h;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0, v0}, Lpe/c;->callBy(Ljava/util/Map;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method private final i(Ljava/lang/Class;)LXb/a;
    .locals 1

    .line 1
    sget-object v0, LXb/i;->a:LXb/i$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LXb/i$a;->d(Ljava/lang/Class;)LXb/i;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v0, LXb/b;

    .line 8
    .line 9
    invoke-direct {v0, p1}, LXb/b;-><init>(LXb/i;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method private static final j(LXb/i;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p0}, LXb/i;->b()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final d(Lpe/d;)LXb/a;
    .locals 1

    .line 1
    const-string v0, "clazz"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lhe/a;->b(Lpe/d;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p0, v0}, LXb/e;->e(Ljava/lang/Class;)LXb/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, p1}, LXb/e;->g(Lpe/d;)LXb/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, Lhe/a;->b(Lpe/d;)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {p0, p1}, LXb/e;->i(Ljava/lang/Class;)LXb/a;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :cond_0
    return-object v0
.end method
