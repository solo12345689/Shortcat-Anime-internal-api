.class public final LLe/j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJe/g;


# static fields
.field static final synthetic i:[Lpe/m;


# instance fields
.field private final a:LKe/k;

.field private final b:LOe/a;

.field private final c:Lpf/j;

.field private final d:Lpf/i;

.field private final e:LNe/a;

.field private final f:Lpf/i;

.field private final g:Z

.field private final h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lkotlin/jvm/internal/F;

    .line 2
    .line 3
    const-class v1, LLe/j;

    .line 4
    .line 5
    const-string v2, "fqName"

    .line 6
    .line 7
    const-string v3, "getFqName()Lorg/jetbrains/kotlin/name/FqName;"

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
    new-instance v2, Lkotlin/jvm/internal/F;

    .line 18
    .line 19
    const-string v3, "type"

    .line 20
    .line 21
    const-string v5, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"

    .line 22
    .line 23
    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Lkotlin/jvm/internal/O;->k(Lkotlin/jvm/internal/E;)Lpe/o;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    new-instance v3, Lkotlin/jvm/internal/F;

    .line 31
    .line 32
    const-string v5, "allValueArguments"

    .line 33
    .line 34
    const-string v6, "getAllValueArguments()Ljava/util/Map;"

    .line 35
    .line 36
    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v3}, Lkotlin/jvm/internal/O;->k(Lkotlin/jvm/internal/E;)Lpe/o;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v3, 0x3

    .line 44
    new-array v3, v3, [Lpe/m;

    .line 45
    .line 46
    aput-object v0, v3, v4

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    aput-object v2, v3, v0

    .line 50
    .line 51
    const/4 v0, 0x2

    .line 52
    aput-object v1, v3, v0

    .line 53
    .line 54
    sput-object v3, LLe/j;->i:[Lpe/m;

    .line 55
    .line 56
    return-void
.end method

.method public constructor <init>(LKe/k;LOe/a;Z)V
    .locals 2

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaAnnotation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LLe/j;->a:LKe/k;

    .line 3
    iput-object p2, p0, LLe/j;->b:LOe/a;

    .line 4
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    move-result-object v0

    new-instance v1, LLe/g;

    invoke-direct {v1, p0}, LLe/g;-><init>(LLe/j;)V

    invoke-interface {v0, v1}, Lpf/n;->g(Lie/a;)Lpf/j;

    move-result-object v0

    iput-object v0, p0, LLe/j;->c:Lpf/j;

    .line 5
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    move-result-object v0

    new-instance v1, LLe/h;

    invoke-direct {v1, p0}, LLe/h;-><init>(LLe/j;)V

    invoke-interface {v0, v1}, Lpf/n;->c(Lie/a;)Lpf/i;

    move-result-object v0

    iput-object v0, p0, LLe/j;->d:Lpf/i;

    .line 6
    invoke-virtual {p1}, LKe/k;->a()LKe/d;

    move-result-object v0

    invoke-virtual {v0}, LKe/d;->t()LNe/b;

    move-result-object v0

    invoke-interface {v0, p2}, LNe/b;->a(LOe/l;)LNe/a;

    move-result-object v0

    iput-object v0, p0, LLe/j;->e:LNe/a;

    .line 7
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    move-result-object p1

    new-instance v0, LLe/i;

    invoke-direct {v0, p0}, LLe/i;-><init>(LLe/j;)V

    invoke-interface {p1, v0}, Lpf/n;->c(Lie/a;)Lpf/i;

    move-result-object p1

    iput-object p1, p0, LLe/j;->f:Lpf/i;

    .line 8
    invoke-interface {p2}, LOe/a;->d()Z

    move-result p1

    iput-boolean p1, p0, LLe/j;->g:Z

    .line 9
    invoke-interface {p2}, LOe/a;->G()Z

    move-result p1

    if-nez p1, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, LLe/j;->h:Z

    return-void
.end method

.method public synthetic constructor <init>(LKe/k;LOe/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2, p3}, LLe/j;-><init>(LKe/k;LOe/a;Z)V

    return-void
.end method

.method static synthetic b(LLe/j;)LXe/c;
    .locals 0

    .line 1
    invoke-static {p0}, LLe/j;->i(LLe/j;)LXe/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic c(LLe/j;)Lqf/d0;
    .locals 0

    .line 1
    invoke-static {p0}, LLe/j;->s(LLe/j;)Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic e(LLe/j;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-static {p0}, LLe/j;->g(LLe/j;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final g(LLe/j;)Ljava/util/Map;
    .locals 4

    .line 1
    iget-object v0, p0, LLe/j;->b:LOe/a;

    .line 2
    .line 3
    invoke-interface {v0}, LOe/a;->e()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Iterable;

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, LOe/b;

    .line 29
    .line 30
    invoke-interface {v2}, LOe/b;->getName()LXe/f;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    sget-object v3, LHe/I;->c:LXe/f;

    .line 37
    .line 38
    :cond_1
    invoke-direct {p0, v2}, LLe/j;->n(LOe/b;)Ldf/g;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    invoke-static {v3, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    const/4 v2, 0x0

    .line 50
    :goto_1
    if-eqz v2, :cond_0

    .line 51
    .line 52
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    invoke-static {v1}, LUd/S;->w(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method

.method private final h(LXe/c;)Lye/e;
    .locals 2

    .line 1
    iget-object v0, p0, LLe/j;->a:LKe/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LKe/k;->d()Lye/H;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, LXe/b;->d:LXe/b$a;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v1, p0, LLe/j;->a:LKe/k;

    .line 14
    .line 15
    invoke-virtual {v1}, LKe/k;->a()LKe/d;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, LKe/d;->b()LQe/n;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, LQe/n;->f()Lmf/n;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Lmf/n;->r()Lye/M;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0, p1, v1}, Lye/y;->d(Lye/H;LXe/b;Lye/M;)Lye/e;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method

.method private static final i(LLe/j;)LXe/c;
    .locals 0

    .line 1
    iget-object p0, p0, LLe/j;->b:LOe/a;

    .line 2
    .line 3
    invoke-interface {p0}, LOe/a;->g()LXe/b;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, LXe/b;->a()LXe/c;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method

.method private final n(LOe/b;)Ldf/g;
    .locals 3

    .line 1
    instance-of v0, p1, LOe/o;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Ldf/i;->a:Ldf/i;

    .line 7
    .line 8
    check-cast p1, LOe/o;

    .line 9
    .line 10
    invoke-interface {p1}, LOe/o;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v2, 0x2

    .line 15
    invoke-static {v0, p1, v1, v2, v1}, Ldf/i;->f(Ldf/i;Ljava/lang/Object;Lye/H;ILjava/lang/Object;)Ldf/g;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    instance-of v0, p1, LOe/m;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    check-cast p1, LOe/m;

    .line 25
    .line 26
    invoke-interface {p1}, LOe/m;->d()LXe/b;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {p1}, LOe/m;->e()LXe/f;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {p0, v0, p1}, LLe/j;->q(LXe/b;LXe/f;)Ldf/g;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :cond_1
    instance-of v0, p1, LOe/e;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    check-cast p1, LOe/e;

    .line 44
    .line 45
    invoke-interface {p1}, LOe/b;->getName()LXe/f;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    sget-object v0, LHe/I;->c:LXe/f;

    .line 52
    .line 53
    :cond_2
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p1}, LOe/e;->c()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {p0, v0, p1}, LLe/j;->p(LXe/f;Ljava/util/List;)Ldf/g;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1

    .line 65
    :cond_3
    instance-of v0, p1, LOe/c;

    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    check-cast p1, LOe/c;

    .line 70
    .line 71
    invoke-interface {p1}, LOe/c;->a()LOe/a;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-direct {p0, p1}, LLe/j;->o(LOe/a;)Ldf/g;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :cond_4
    instance-of v0, p1, LOe/h;

    .line 81
    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    check-cast p1, LOe/h;

    .line 85
    .line 86
    invoke-interface {p1}, LOe/h;->b()LOe/x;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-direct {p0, p1}, LLe/j;->r(LOe/x;)Ldf/g;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1

    .line 95
    :cond_5
    return-object v1
.end method

.method private final o(LOe/a;)Ldf/g;
    .locals 7

    .line 1
    new-instance v0, Ldf/a;

    .line 2
    .line 3
    new-instance v1, LLe/j;

    .line 4
    .line 5
    iget-object v2, p0, LLe/j;->a:LKe/k;

    .line 6
    .line 7
    const/4 v5, 0x4

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    move-object v3, p1

    .line 11
    invoke-direct/range {v1 .. v6}, LLe/j;-><init>(LKe/k;LOe/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Ldf/a;-><init>(Lze/c;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method private final p(LXe/f;Ljava/util/List;)Ldf/g;
    .locals 3

    .line 1
    invoke-virtual {p0}, LLe/j;->l()Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lqf/W;->a(Lqf/S;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1

    .line 13
    :cond_0
    invoke-static {p0}, Lff/e;->l(Lze/c;)Lye/e;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v0}, LIe/a;->b(LXe/f;Lye/e;)Lye/t0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, Lye/s0;->getType()Lqf/S;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-nez p1, :cond_2

    .line 31
    .line 32
    :cond_1
    iget-object p1, p0, LLe/j;->a:LKe/k;

    .line 33
    .line 34
    invoke-virtual {p1}, LKe/k;->a()LKe/d;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, LKe/d;->m()Lye/H;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p1}, Lye/H;->n()Lve/i;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object v0, Lqf/N0;->e:Lqf/N0;

    .line 47
    .line 48
    sget-object v1, Lsf/k;->c1:Lsf/k;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    new-array v2, v2, [Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v1, v2}, Lsf/l;->d(Lsf/k;[Ljava/lang/String;)Lsf/i;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {p1, v0, v1}, Lve/i;->m(Lqf/N0;Lqf/S;)Lqf/d0;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string v0, "getArrayType(...)"

    .line 62
    .line 63
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 67
    .line 68
    const/16 v1, 0xa

    .line 69
    .line 70
    invoke-static {p2, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_4

    .line 86
    .line 87
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, LOe/b;

    .line 92
    .line 93
    invoke-direct {p0, v1}, LLe/j;->n(LOe/b;)Ldf/g;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    if-nez v1, :cond_3

    .line 98
    .line 99
    new-instance v1, Ldf/u;

    .line 100
    .line 101
    invoke-direct {v1}, Ldf/u;-><init>()V

    .line 102
    .line 103
    .line 104
    :cond_3
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_4
    sget-object p2, Ldf/i;->a:Ldf/i;

    .line 109
    .line 110
    invoke-virtual {p2, v0, p1}, Ldf/i;->b(Ljava/util/List;Lqf/S;)Ldf/b;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1
.end method

.method private final q(LXe/b;LXe/f;)Ldf/g;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Ldf/k;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2}, Ldf/k;-><init>(LXe/b;LXe/f;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 13
    return-object p1
.end method

.method private final r(LOe/x;)Ldf/g;
    .locals 8

    .line 1
    sget-object v0, Ldf/s;->b:Ldf/s$a;

    .line 2
    .line 3
    iget-object v1, p0, LLe/j;->a:LKe/k;

    .line 4
    .line 5
    invoke-virtual {v1}, LKe/k;->g()LMe/e;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lqf/I0;->b:Lqf/I0;

    .line 10
    .line 11
    const/4 v6, 0x7

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-static/range {v2 .. v7}, LMe/b;->b(Lqf/I0;ZZLye/m0;ILjava/lang/Object;)LMe/a;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v1, p1, v2}, LMe/e;->p(LOe/x;LMe/a;)Lqf/S;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p1}, Ldf/s$a;->a(Lqf/S;)Ldf/g;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method private static final s(LLe/j;)Lqf/d0;
    .locals 6

    .line 1
    invoke-virtual {p0}, LLe/j;->f()LXe/c;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Lsf/k;->d1:Lsf/k;

    .line 8
    .line 9
    iget-object p0, p0, LLe/j;->b:LOe/a;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    filled-new-array {p0}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {v0, p0}, Lsf/l;->d(Lsf/k;[Ljava/lang/String;)Lsf/i;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    sget-object v0, Lxe/d;->a:Lxe/d;

    .line 25
    .line 26
    iget-object v2, p0, LLe/j;->a:LKe/k;

    .line 27
    .line 28
    invoke-virtual {v2}, LKe/k;->d()Lye/H;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {v2}, Lye/H;->n()Lve/i;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v4, 0x4

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-static/range {v0 .. v5}, Lxe/d;->f(Lxe/d;LXe/c;Lve/i;Ljava/lang/Integer;ILjava/lang/Object;)Lye/e;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    iget-object v0, p0, LLe/j;->b:LOe/a;

    .line 46
    .line 47
    invoke-interface {v0}, LOe/a;->b()LOe/g;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    iget-object v2, p0, LLe/j;->a:LKe/k;

    .line 54
    .line 55
    invoke-virtual {v2}, LKe/k;->a()LKe/d;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2}, LKe/d;->n()LKe/n;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-interface {v2, v0}, LKe/n;->a(LOe/g;)Lye/e;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    const/4 v0, 0x0

    .line 69
    :goto_0
    if-nez v0, :cond_2

    .line 70
    .line 71
    invoke-direct {p0, v1}, LLe/j;->h(LXe/c;)Lye/e;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :cond_2
    invoke-interface {v0}, Lye/e;->p()Lqf/d0;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 3

    .line 1
    iget-object v0, p0, LLe/j;->f:Lpf/i;

    .line 2
    .line 3
    sget-object v1, LLe/j;->i:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x2

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

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LLe/j;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public f()LXe/c;
    .locals 3

    .line 1
    iget-object v0, p0, LLe/j;->c:Lpf/j;

    .line 2
    .line 3
    sget-object v1, LLe/j;->i:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {v0, p0, v1}, Lpf/m;->b(Lpf/j;Ljava/lang/Object;Lpe/m;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, LXe/c;

    .line 13
    .line 14
    return-object v0
.end method

.method public bridge synthetic getType()Lqf/S;
    .locals 1

    .line 1
    invoke-virtual {p0}, LLe/j;->l()Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public j()LNe/a;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/j;->e:LNe/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic k()Lye/h0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LLe/j;->j()LNe/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public l()Lqf/d0;
    .locals 3

    .line 1
    iget-object v0, p0, LLe/j;->d:Lpf/i;

    .line 2
    .line 3
    sget-object v1, LLe/j;->i:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x1

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

.method public final m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LLe/j;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Laf/n;->h:Laf/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    invoke-static {v0, p0, v1, v2, v1}, Laf/n;->O(Laf/n;Lze/c;Lze/e;ILjava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
