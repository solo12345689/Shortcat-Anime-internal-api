.class public final LIe/n;
.super LIe/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field static final synthetic h:[Lpe/m;


# instance fields
.field private final g:Lpf/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lkotlin/jvm/internal/F;

    .line 2
    .line 3
    const-class v1, LIe/n;

    .line 4
    .line 5
    const-string v2, "allValueArguments"

    .line 6
    .line 7
    const-string v3, "getAllValueArguments()Ljava/util/Map;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/O;->k(Lkotlin/jvm/internal/E;)Lpe/o;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    new-array v1, v1, [Lpe/m;

    .line 19
    .line 20
    aput-object v0, v1, v4

    .line 21
    .line 22
    sput-object v1, LIe/n;->h:[Lpe/m;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(LOe/a;LKe/k;)V
    .locals 1

    .line 1
    const-string v0, "annotation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "c"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lve/o$a;->H:LXe/c;

    .line 12
    .line 13
    invoke-direct {p0, p2, p1, v0}, LIe/c;-><init>(LKe/k;LOe/a;LXe/c;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, LKe/k;->e()Lpf/n;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance p2, LIe/m;

    .line 21
    .line 22
    invoke-direct {p2, p0}, LIe/m;-><init>(LIe/n;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, p2}, Lpf/n;->c(Lie/a;)Lpf/i;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, LIe/n;->g:Lpf/i;

    .line 30
    .line 31
    return-void
.end method

.method static synthetic h(LIe/n;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-static {p0}, LIe/n;->i(LIe/n;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final i(LIe/n;)Ljava/util/Map;
    .locals 3

    .line 1
    invoke-virtual {p0}, LIe/c;->c()LOe/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, LOe/e;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    sget-object v0, LIe/f;->a:LIe/f;

    .line 11
    .line 12
    invoke-virtual {p0}, LIe/c;->c()LOe/b;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, LOe/e;

    .line 17
    .line 18
    invoke-interface {p0}, LOe/e;->c()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v0, p0}, LIe/f;->d(Ljava/util/List;)Ldf/g;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    instance-of v0, v0, LOe/m;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    sget-object v0, LIe/f;->a:LIe/f;

    .line 32
    .line 33
    invoke-virtual {p0}, LIe/c;->c()LOe/b;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {v0, p0}, LIe/f;->d(Ljava/util/List;)Ldf/g;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move-object p0, v2

    .line 47
    :goto_0
    if-eqz p0, :cond_2

    .line 48
    .line 49
    sget-object v0, LIe/d;->a:LIe/d;

    .line 50
    .line 51
    invoke-virtual {v0}, LIe/d;->d()LXe/f;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0, p0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p0}, LUd/S;->f(Lkotlin/Pair;)Ljava/util/Map;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    :cond_2
    if-nez v2, :cond_3

    .line 64
    .line 65
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :cond_3
    return-object v2
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 3

    .line 1
    iget-object v0, p0, LIe/n;->g:Lpf/i;

    .line 2
    .line 3
    sget-object v1, LIe/n;->h:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {v0, p0, v1}, Lpf/m;->a(Lpf/i;Ljava/lang/Object;Lpe/m;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/Map;

    .line 13
    .line 14
    return-object v0
.end method
