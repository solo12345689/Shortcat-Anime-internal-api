.class public LIe/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJe/g;


# static fields
.field static final synthetic f:[Lpe/m;


# instance fields
.field private final a:LXe/c;

.field private final b:Lye/h0;

.field private final c:Lpf/i;

.field private final d:LOe/b;

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lkotlin/jvm/internal/F;

    .line 2
    .line 3
    const-class v1, LIe/c;

    .line 4
    .line 5
    const-string v2, "type"

    .line 6
    .line 7
    const-string v3, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"

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
    sput-object v1, LIe/c;->f:[Lpe/m;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(LKe/k;LOe/a;LXe/c;)V
    .locals 1

    .line 1
    const-string v0, "c"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fqName"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p3, p0, LIe/c;->a:LXe/c;

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, LKe/k;->a()LKe/d;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-virtual {p3}, LKe/d;->t()LNe/b;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-interface {p3, p2}, LNe/b;->a(LOe/l;)LNe/a;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    if-eqz p3, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget-object p3, Lye/h0;->a:Lye/h0;

    .line 34
    .line 35
    const-string v0, "NO_SOURCE"

    .line 36
    .line 37
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iput-object p3, p0, LIe/c;->b:Lye/h0;

    .line 41
    .line 42
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    new-instance v0, LIe/b;

    .line 47
    .line 48
    invoke-direct {v0, p1, p0}, LIe/b;-><init>(LKe/k;LIe/c;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p3, v0}, Lpf/n;->c(Lie/a;)Lpf/i;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, LIe/c;->c:Lpf/i;

    .line 56
    .line 57
    if-eqz p2, :cond_1

    .line 58
    .line 59
    invoke-interface {p2}, LOe/a;->e()Ljava/util/Collection;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    check-cast p1, Ljava/lang/Iterable;

    .line 66
    .line 67
    invoke-static {p1}, LUd/u;->n0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, LOe/b;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    const/4 p1, 0x0

    .line 75
    :goto_1
    iput-object p1, p0, LIe/c;->d:LOe/b;

    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    if-eqz p2, :cond_2

    .line 79
    .line 80
    invoke-interface {p2}, LOe/a;->d()Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    const/4 p3, 0x1

    .line 85
    if-ne p2, p3, :cond_2

    .line 86
    .line 87
    move p1, p3

    .line 88
    :cond_2
    iput-boolean p1, p0, LIe/c;->e:Z

    .line 89
    .line 90
    return-void
.end method

.method static synthetic b(LKe/k;LIe/c;)Lqf/d0;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LIe/c;->g(LKe/k;LIe/c;)Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final g(LKe/k;LIe/c;)Lqf/d0;
    .locals 0

    .line 1
    invoke-virtual {p0}, LKe/k;->d()Lye/H;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lye/H;->n()Lve/i;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p1}, LIe/c;->f()LXe/c;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Lve/i;->p(LXe/c;)Lye/e;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Lye/e;->p()Lqf/d0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "getDefaultType(...)"

    .line 22
    .line 23
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected final c()LOe/b;
    .locals 1

    .line 1
    iget-object v0, p0, LIe/c;->d:LOe/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LIe/c;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public e()Lqf/d0;
    .locals 3

    .line 1
    iget-object v0, p0, LIe/c;->c:Lpf/i;

    .line 2
    .line 3
    sget-object v1, LIe/c;->f:[Lpe/m;

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
    check-cast v0, Lqf/d0;

    .line 13
    .line 14
    return-object v0
.end method

.method public f()LXe/c;
    .locals 1

    .line 1
    iget-object v0, p0, LIe/c;->a:LXe/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic getType()Lqf/S;
    .locals 1

    .line 1
    invoke-virtual {p0}, LIe/c;->e()Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public k()Lye/h0;
    .locals 1

    .line 1
    iget-object v0, p0, LIe/c;->b:Lye/h0;

    .line 2
    .line 3
    return-object v0
.end method
