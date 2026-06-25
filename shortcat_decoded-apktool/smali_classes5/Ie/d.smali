.class public final LIe/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LIe/d;

.field private static final b:LXe/f;

.field private static final c:LXe/f;

.field private static final d:LXe/f;

.field private static final e:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LIe/d;

    .line 2
    .line 3
    invoke-direct {v0}, LIe/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LIe/d;->a:LIe/d;

    .line 7
    .line 8
    const-string v0, "message"

    .line 9
    .line 10
    invoke-static {v0}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "identifier(...)"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LIe/d;->b:LXe/f;

    .line 20
    .line 21
    const-string v0, "allowedTargets"

    .line 22
    .line 23
    invoke-static {v0}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    sput-object v0, LIe/d;->c:LXe/f;

    .line 31
    .line 32
    const-string v0, "value"

    .line 33
    .line 34
    invoke-static {v0}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, LIe/d;->d:LXe/f;

    .line 42
    .line 43
    sget-object v0, Lve/o$a;->H:LXe/c;

    .line 44
    .line 45
    sget-object v1, LHe/I;->d:LXe/c;

    .line 46
    .line 47
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sget-object v1, Lve/o$a;->L:LXe/c;

    .line 52
    .line 53
    sget-object v2, LHe/I;->f:LXe/c;

    .line 54
    .line 55
    invoke-static {v1, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    sget-object v2, Lve/o$a;->P:LXe/c;

    .line 60
    .line 61
    sget-object v3, LHe/I;->i:LXe/c;

    .line 62
    .line 63
    invoke-static {v2, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    filled-new-array {v0, v1, v2}, [Lkotlin/Pair;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, LIe/d;->e:Ljava/util/Map;

    .line 76
    .line 77
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(LIe/d;LOe/a;LKe/k;ZILjava/lang/Object;)Lze/c;
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
    invoke-virtual {p0, p1, p2, p3}, LIe/d;->e(LOe/a;LKe/k;Z)Lze/c;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public final a(LXe/c;LOe/d;LKe/k;)Lze/c;
    .locals 7

    .line 1
    const-string v0, "kotlinName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "annotationOwner"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "c"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lve/o$a;->y:LXe/c;

    .line 17
    .line 18
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    sget-object v0, LHe/I;->h:LXe/c;

    .line 25
    .line 26
    const-string v1, "DEPRECATED_ANNOTATION"

    .line 27
    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p2, v0}, LOe/d;->h(LXe/c;)LOe/a;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    invoke-interface {p2}, LOe/d;->D()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    :cond_0
    new-instance p1, LIe/h;

    .line 44
    .line 45
    invoke-direct {p1, v0, p3}, LIe/h;-><init>(LOe/a;LKe/k;)V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_1
    sget-object v0, LIe/d;->e:Ljava/util/Map;

    .line 50
    .line 51
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, LXe/c;

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    invoke-interface {p2, p1}, LOe/d;->h(LXe/c;)LOe/a;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    sget-object v1, LIe/d;->a:LIe/d;

    .line 67
    .line 68
    const/4 v5, 0x4

    .line 69
    const/4 v6, 0x0

    .line 70
    const/4 v4, 0x0

    .line 71
    move-object v3, p3

    .line 72
    invoke-static/range {v1 .. v6}, LIe/d;->f(LIe/d;LOe/a;LKe/k;ZILjava/lang/Object;)Lze/c;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1

    .line 77
    :cond_2
    return-object v0
.end method

.method public final b()LXe/f;
    .locals 1

    .line 1
    sget-object v0, LIe/d;->b:LXe/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()LXe/f;
    .locals 1

    .line 1
    sget-object v0, LIe/d;->d:LXe/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LXe/f;
    .locals 1

    .line 1
    sget-object v0, LIe/d;->c:LXe/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(LOe/a;LKe/k;Z)Lze/c;
    .locals 4

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
    invoke-interface {p1}, LOe/a;->g()LXe/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, LXe/b;->d:LXe/b$a;

    .line 16
    .line 17
    sget-object v2, LHe/I;->d:LXe/c;

    .line 18
    .line 19
    const-string v3, "TARGET_ANNOTATION"

    .line 20
    .line 21
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    new-instance p3, LIe/n;

    .line 35
    .line 36
    invoke-direct {p3, p1, p2}, LIe/n;-><init>(LOe/a;LKe/k;)V

    .line 37
    .line 38
    .line 39
    return-object p3

    .line 40
    :cond_0
    sget-object v2, LHe/I;->f:LXe/c;

    .line 41
    .line 42
    const-string v3, "RETENTION_ANNOTATION"

    .line 43
    .line 44
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    new-instance p3, LIe/l;

    .line 58
    .line 59
    invoke-direct {p3, p1, p2}, LIe/l;-><init>(LOe/a;LKe/k;)V

    .line 60
    .line 61
    .line 62
    return-object p3

    .line 63
    :cond_1
    sget-object v2, LHe/I;->i:LXe/c;

    .line 64
    .line 65
    const-string v3, "DOCUMENTED_ANNOTATION"

    .line 66
    .line 67
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v2}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_2

    .line 79
    .line 80
    new-instance p3, LIe/c;

    .line 81
    .line 82
    sget-object v0, Lve/o$a;->P:LXe/c;

    .line 83
    .line 84
    invoke-direct {p3, p2, p1, v0}, LIe/c;-><init>(LKe/k;LOe/a;LXe/c;)V

    .line 85
    .line 86
    .line 87
    return-object p3

    .line 88
    :cond_2
    sget-object v2, LHe/I;->h:LXe/c;

    .line 89
    .line 90
    const-string v3, "DEPRECATED_ANNOTATION"

    .line 91
    .line 92
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v2}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_3

    .line 104
    .line 105
    const/4 p1, 0x0

    .line 106
    return-object p1

    .line 107
    :cond_3
    new-instance v0, LLe/j;

    .line 108
    .line 109
    invoke-direct {v0, p2, p1, p3}, LLe/j;-><init>(LKe/k;LOe/a;Z)V

    .line 110
    .line 111
    .line 112
    return-object v0
.end method
