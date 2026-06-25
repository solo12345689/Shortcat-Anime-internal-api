.class public abstract Lse/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lse/a;

.field private static final b:Lse/a;

.field private static final c:Lse/a;

.field private static final d:Lse/a;

.field private static final e:Lse/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lse/c;->a:Lse/c;

    .line 2
    .line 3
    invoke-static {v0}, Lse/b;->a(Lkotlin/jvm/functions/Function1;)Lse/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lse/h;->a:Lse/a;

    .line 8
    .line 9
    sget-object v0, Lse/d;->a:Lse/d;

    .line 10
    .line 11
    invoke-static {v0}, Lse/b;->a(Lkotlin/jvm/functions/Function1;)Lse/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lse/h;->b:Lse/a;

    .line 16
    .line 17
    sget-object v0, Lse/e;->a:Lse/e;

    .line 18
    .line 19
    invoke-static {v0}, Lse/b;->a(Lkotlin/jvm/functions/Function1;)Lse/a;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lse/h;->c:Lse/a;

    .line 24
    .line 25
    sget-object v0, Lse/f;->a:Lse/f;

    .line 26
    .line 27
    invoke-static {v0}, Lse/b;->a(Lkotlin/jvm/functions/Function1;)Lse/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lse/h;->d:Lse/a;

    .line 32
    .line 33
    sget-object v0, Lse/g;->a:Lse/g;

    .line 34
    .line 35
    invoke-static {v0}, Lse/b;->a(Lkotlin/jvm/functions/Function1;)Lse/a;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lse/h;->e:Lse/a;

    .line 40
    .line 41
    return-void
.end method

.method private static final a(Ljava/lang/Class;)Lpe/q;
    .locals 3

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lse/h;->m(Ljava/lang/Class;)Lse/X;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {p0, v0, v1, v2}, Lqe/d;->b(Lpe/f;Ljava/util/List;ZLjava/util/List;)Lpe/q;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method private static final b(Ljava/lang/Class;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method private static final c(Ljava/lang/Class;)Lpe/q;
    .locals 3

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lse/h;->m(Ljava/lang/Class;)Lse/X;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {p0, v0, v1, v2}, Lqe/d;->b(Lpe/f;Ljava/util/List;ZLjava/util/List;)Lpe/q;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method private static final d(Ljava/lang/Class;)Lse/X;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lse/X;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lse/X;-><init>(Ljava/lang/Class;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method private static final e(Ljava/lang/Class;)Lse/v0;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lse/v0;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lse/v0;-><init>(Ljava/lang/Class;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method static synthetic f(Ljava/lang/Class;)Lse/X;
    .locals 0

    .line 1
    invoke-static {p0}, Lse/h;->d(Ljava/lang/Class;)Lse/X;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic g(Ljava/lang/Class;)Lse/v0;
    .locals 0

    .line 1
    invoke-static {p0}, Lse/h;->e(Ljava/lang/Class;)Lse/v0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic h(Ljava/lang/Class;)Lpe/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lse/h;->a(Ljava/lang/Class;)Lpe/q;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic i(Ljava/lang/Class;)Lpe/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lse/h;->c(Ljava/lang/Class;)Lpe/q;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic j(Ljava/lang/Class;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 0

    .line 1
    invoke-static {p0}, Lse/h;->b(Ljava/lang/Class;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final k(Ljava/lang/Class;Ljava/util/List;Z)Lpe/q;
    .locals 1

    .line 1
    const-string v0, "jClass"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "arguments"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    sget-object p1, Lse/h;->d:Lse/a;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Lse/a;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lpe/q;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    sget-object p1, Lse/h;->c:Lse/a;

    .line 29
    .line 30
    invoke-virtual {p1, p0}, Lse/a;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Lpe/q;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    invoke-static {p0, p1, p2}, Lse/h;->l(Ljava/lang/Class;Ljava/util/List;Z)Lpe/q;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method private static final l(Ljava/lang/Class;Ljava/util/List;Z)Lpe/q;
    .locals 3

    .line 1
    sget-object v0, Lse/h;->e:Lse/a;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lse/a;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {p1, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    invoke-static {p0}, Lse/h;->m(Ljava/lang/Class;)Lse/X;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {p0, p1, p2, v2}, Lqe/d;->b(Lpe/f;Ljava/util/List;ZLjava/util/List;)Lpe/q;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-interface {v0, v1, p0}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-nez p1, :cond_0

    .line 40
    .line 41
    move-object v2, p0

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move-object v2, p1

    .line 44
    :cond_1
    :goto_0
    const-string p0, "getOrPut(...)"

    .line 45
    .line 46
    invoke-static {v2, p0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    check-cast v2, Lpe/q;

    .line 50
    .line 51
    return-object v2
.end method

.method public static final m(Ljava/lang/Class;)Lse/X;
    .locals 1

    .line 1
    const-string v0, "jClass"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lse/h;->a:Lse/a;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lse/a;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string v0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>"

    .line 13
    .line 14
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast p0, Lse/X;

    .line 18
    .line 19
    return-object p0
.end method

.method public static final n(Ljava/lang/Class;)Lpe/g;
    .locals 1

    .line 1
    const-string v0, "jClass"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lse/h;->b:Lse/a;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lse/a;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lpe/g;

    .line 13
    .line 14
    return-object p0
.end method
