.class public abstract LLe/U;
.super Ljf/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLe/U$a;,
        LLe/U$b;
    }
.end annotation


# static fields
.field static final synthetic m:[Lpe/m;


# instance fields
.field private final b:LKe/k;

.field private final c:LLe/U;

.field private final d:Lpf/i;

.field private final e:Lpf/i;

.field private final f:Lpf/g;

.field private final g:Lpf/h;

.field private final h:Lpf/g;

.field private final i:Lpf/i;

.field private final j:Lpf/i;

.field private final k:Lpf/i;

.field private final l:Lpf/g;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lkotlin/jvm/internal/F;

    .line 2
    .line 3
    const-class v1, LLe/U;

    .line 4
    .line 5
    const-string v2, "functionNamesLazy"

    .line 6
    .line 7
    const-string v3, "getFunctionNamesLazy()Ljava/util/Set;"

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
    const-string v3, "propertyNamesLazy"

    .line 20
    .line 21
    const-string v5, "getPropertyNamesLazy()Ljava/util/Set;"

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
    const-string v5, "classNamesLazy"

    .line 33
    .line 34
    const-string v6, "getClassNamesLazy()Ljava/util/Set;"

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
    sput-object v3, LLe/U;->m:[Lpe/m;

    .line 55
    .line 56
    return-void
.end method

.method public constructor <init>(LKe/k;LLe/U;)V
    .locals 2

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljf/l;-><init>()V

    .line 3
    iput-object p1, p0, LLe/U;->b:LKe/k;

    .line 4
    iput-object p2, p0, LLe/U;->c:LLe/U;

    .line 5
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    move-result-object p2

    new-instance v0, LLe/H;

    invoke-direct {v0, p0}, LLe/H;-><init>(LLe/U;)V

    .line 6
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    move-result-object v1

    .line 7
    invoke-interface {p2, v0, v1}, Lpf/n;->i(Lie/a;Ljava/lang/Object;)Lpf/i;

    move-result-object p2

    iput-object p2, p0, LLe/U;->d:Lpf/i;

    .line 8
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    move-result-object p2

    new-instance v0, LLe/K;

    invoke-direct {v0, p0}, LLe/K;-><init>(LLe/U;)V

    invoke-interface {p2, v0}, Lpf/n;->c(Lie/a;)Lpf/i;

    move-result-object p2

    iput-object p2, p0, LLe/U;->e:Lpf/i;

    .line 9
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    move-result-object p2

    new-instance v0, LLe/L;

    invoke-direct {v0, p0}, LLe/L;-><init>(LLe/U;)V

    invoke-interface {p2, v0}, Lpf/n;->h(Lkotlin/jvm/functions/Function1;)Lpf/g;

    move-result-object p2

    iput-object p2, p0, LLe/U;->f:Lpf/g;

    .line 10
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    move-result-object p2

    new-instance v0, LLe/M;

    invoke-direct {v0, p0}, LLe/M;-><init>(LLe/U;)V

    invoke-interface {p2, v0}, Lpf/n;->d(Lkotlin/jvm/functions/Function1;)Lpf/h;

    move-result-object p2

    iput-object p2, p0, LLe/U;->g:Lpf/h;

    .line 11
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    move-result-object p2

    new-instance v0, LLe/N;

    invoke-direct {v0, p0}, LLe/N;-><init>(LLe/U;)V

    invoke-interface {p2, v0}, Lpf/n;->h(Lkotlin/jvm/functions/Function1;)Lpf/g;

    move-result-object p2

    iput-object p2, p0, LLe/U;->h:Lpf/g;

    .line 12
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    move-result-object p2

    new-instance v0, LLe/O;

    invoke-direct {v0, p0}, LLe/O;-><init>(LLe/U;)V

    invoke-interface {p2, v0}, Lpf/n;->c(Lie/a;)Lpf/i;

    move-result-object p2

    iput-object p2, p0, LLe/U;->i:Lpf/i;

    .line 13
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    move-result-object p2

    new-instance v0, LLe/P;

    invoke-direct {v0, p0}, LLe/P;-><init>(LLe/U;)V

    invoke-interface {p2, v0}, Lpf/n;->c(Lie/a;)Lpf/i;

    move-result-object p2

    iput-object p2, p0, LLe/U;->j:Lpf/i;

    .line 14
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    move-result-object p2

    new-instance v0, LLe/Q;

    invoke-direct {v0, p0}, LLe/Q;-><init>(LLe/U;)V

    invoke-interface {p2, v0}, Lpf/n;->c(Lie/a;)Lpf/i;

    move-result-object p2

    iput-object p2, p0, LLe/U;->k:Lpf/i;

    .line 15
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    move-result-object p1

    new-instance p2, LLe/S;

    invoke-direct {p2, p0}, LLe/S;-><init>(LLe/U;)V

    invoke-interface {p1, p2}, Lpf/n;->h(Lkotlin/jvm/functions/Function1;)Lpf/g;

    move-result-object p1

    iput-object p1, p0, LLe/U;->l:Lpf/g;

    return-void
.end method

.method public synthetic constructor <init>(LKe/k;LLe/U;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, LLe/U;-><init>(LKe/k;LLe/U;)V

    return-void
.end method

.method private final E(LOe/n;)LBe/K;
    .locals 9

    .line 1
    invoke-interface {p1}, LOe/s;->isFinal()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v5, v0, 0x1

    .line 6
    .line 7
    iget-object v0, p0, LLe/U;->b:LKe/k;

    .line 8
    .line 9
    invoke-static {v0, p1}, LKe/h;->a(LKe/k;LOe/d;)Lze/h;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, LLe/U;->R()Lye/m;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget-object v3, Lye/E;->b:Lye/E;

    .line 18
    .line 19
    invoke-interface {p1}, LOe/s;->getVisibility()Lye/x0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, LHe/V;->d(Lye/x0;)Lye/u;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-interface {p1}, LOe/t;->getName()LXe/f;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    iget-object v0, p0, LLe/U;->b:LKe/k;

    .line 32
    .line 33
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, LKe/d;->t()LNe/b;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {v0, p1}, LNe/b;->a(LOe/l;)LNe/a;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-direct {p0, p1}, LLe/U;->U(LOe/n;)Z

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    invoke-static/range {v1 .. v8}, LJe/f;->f1(Lye/m;Lze/h;Lye/E;Lye/u;ZLXe/f;Lye/h0;Z)LJe/f;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v0, "create(...)"

    .line 54
    .line 55
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object p1
.end method

.method private static final F(LLe/U;LXe/f;)Lye/Z;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LLe/U;->c:LLe/U;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object p0, v0, LLe/U;->g:Lpf/h;

    .line 11
    .line 12
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lye/Z;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    iget-object v0, p0, LLe/U;->e:Lpf/i;

    .line 20
    .line 21
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, LLe/c;

    .line 26
    .line 27
    invoke-interface {v0, p1}, LLe/c;->f(LXe/f;)LOe/n;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-interface {p1}, LOe/n;->I()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    invoke-direct {p0, p1}, LLe/U;->a0(LOe/n;)Lye/Z;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_1
    const/4 p0, 0x0

    .line 45
    return-object p0
.end method

.method private static final G(LLe/U;LXe/f;)Ljava/util/Collection;
    .locals 5

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LLe/U;->c:LLe/U;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object p0, v0, LLe/U;->f:Lpf/g;

    .line 11
    .line 12
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/util/Collection;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, LLe/U;->e:Lpf/i;

    .line 25
    .line 26
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, LLe/c;

    .line 31
    .line 32
    invoke-interface {v1, p1}, LLe/c;->c(LXe/f;)Ljava/util/Collection;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, LOe/r;

    .line 51
    .line 52
    invoke-virtual {p0, v2}, LLe/U;->Z(LOe/r;)LJe/e;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {p0, v3}, LLe/U;->V(LJe/e;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    iget-object v4, p0, LLe/U;->b:LKe/k;

    .line 63
    .line 64
    invoke-virtual {v4}, LKe/k;->a()LKe/d;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-virtual {v4}, LKe/d;->h()LIe/j;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-interface {v4, v2, v3}, LIe/j;->a(LOe/q;Lye/g0;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    invoke-virtual {p0, v0, p1}, LLe/U;->y(Ljava/util/Collection;LXe/f;)V

    .line 80
    .line 81
    .line 82
    return-object v0
.end method

.method private static final H(LLe/U;)LLe/c;
    .locals 0

    .line 1
    invoke-virtual {p0}, LLe/U;->z()LLe/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final I(LLe/U;)Ljava/util/Set;
    .locals 2

    .line 1
    sget-object v0, Ljf/d;->v:Ljf/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, LLe/U;->x(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method private static final J(LLe/U;LXe/f;)Ljava/util/Collection;
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    iget-object v1, p0, LLe/U;->f:Lpf/g;

    .line 9
    .line 10
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/util/Collection;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0}, LLe/U;->e0(Ljava/util/Set;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0, p1}, LLe/U;->B(Ljava/util/Collection;LXe/f;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, LLe/U;->b:LKe/k;

    .line 26
    .line 27
    invoke-virtual {p1}, LKe/k;->a()LKe/d;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, LKe/d;->r()LPe/m0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object p0, p0, LLe/U;->b:LKe/k;

    .line 36
    .line 37
    invoke-virtual {p1, p0, v0}, LPe/m0;->p(LKe/k;Ljava/util/Collection;)Ljava/util/Collection;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Ljava/lang/Iterable;

    .line 42
    .line 43
    invoke-static {p0}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method private final M()Ljava/util/Set;
    .locals 3

    .line 1
    iget-object v0, p0, LLe/U;->k:Lpf/i;

    .line 2
    .line 3
    sget-object v1, LLe/U;->m:[Lpe/m;

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
    check-cast v0, Ljava/util/Set;

    .line 13
    .line 14
    return-object v0
.end method

.method private final P()Ljava/util/Set;
    .locals 3

    .line 1
    iget-object v0, p0, LLe/U;->i:Lpf/i;

    .line 2
    .line 3
    sget-object v1, LLe/U;->m:[Lpe/m;

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
    check-cast v0, Ljava/util/Set;

    .line 13
    .line 14
    return-object v0
.end method

.method private final S()Ljava/util/Set;
    .locals 3

    .line 1
    iget-object v0, p0, LLe/U;->j:Lpf/i;

    .line 2
    .line 3
    sget-object v1, LLe/U;->m:[Lpe/m;

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
    check-cast v0, Ljava/util/Set;

    .line 13
    .line 14
    return-object v0
.end method

.method private final T(LOe/n;)Lqf/S;
    .locals 8

    .line 1
    iget-object v0, p0, LLe/U;->b:LKe/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LKe/k;->g()LMe/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {p1}, LOe/n;->getType()LOe/x;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lqf/I0;->b:Lqf/I0;

    .line 12
    .line 13
    const/4 v6, 0x7

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    invoke-static/range {v2 .. v7}, LMe/b;->b(Lqf/I0;ZZLye/m0;ILjava/lang/Object;)LMe/a;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v0, v1, v2}, LMe/e;->p(LOe/x;LMe/a;)Lqf/S;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Lve/i;->t0(Lqf/S;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    invoke-static {v0}, Lve/i;->w0(Lqf/S;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    :cond_0
    invoke-direct {p0, p1}, LLe/U;->U(LOe/n;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-interface {p1}, LOe/n;->N()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    invoke-static {v0}, Lqf/J0;->n(Lqf/S;)Lqf/S;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const-string v0, "makeNotNullable(...)"

    .line 55
    .line 56
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_1
    return-object v0
.end method

.method private final U(LOe/n;)Z
    .locals 1

    .line 1
    invoke-interface {p1}, LOe/s;->isFinal()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, LOe/s;->P()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1
.end method

.method private static final W(LLe/U;LXe/f;)Ljava/util/List;
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LLe/U;->g:Lpf/h;

    .line 12
    .line 13
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v0, v1}, LAf/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1, v0}, LLe/U;->C(LXe/f;Ljava/util/Collection;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, LLe/U;->R()Lye/m;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Lbf/i;->t(Lye/m;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-static {v0}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_0
    iget-object p1, p0, LLe/U;->b:LKe/k;

    .line 39
    .line 40
    invoke-virtual {p1}, LKe/k;->a()LKe/d;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, LKe/d;->r()LPe/m0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object p0, p0, LLe/U;->b:LKe/k;

    .line 49
    .line 50
    invoke-virtual {p1, p0, v0}, LPe/m0;->p(LKe/k;Ljava/util/Collection;)Ljava/util/Collection;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Ljava/lang/Iterable;

    .line 55
    .line 56
    invoke-static {p0}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method

.method private static final X(LLe/U;)Ljava/util/Set;
    .locals 2

    .line 1
    sget-object v0, Ljf/d;->w:Ljf/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, LLe/U;->D(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method private final a0(LOe/n;)Lye/Z;
    .locals 9

    .line 1
    new-instance v0, Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, LLe/U;->E(LOe/n;)LBe/K;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v1, v2, v2, v2, v2}, LBe/K;->V0(LBe/L;Lye/b0;Lye/w;Lye/w;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, LLe/U;->T(LOe/n;)Lqf/S;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    iget-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v3, v1

    .line 23
    check-cast v3, LBe/K;

    .line 24
    .line 25
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {p0}, LLe/U;->O()Lye/c0;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    const/4 v7, 0x0

    .line 34
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    invoke-virtual/range {v3 .. v8}, LBe/K;->b1(Lqf/S;Ljava/util/List;Lye/c0;Lye/c0;Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, LLe/U;->R()Lye/m;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    instance-of v3, v1, Lye/e;

    .line 46
    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    move-object v2, v1

    .line 50
    check-cast v2, Lye/e;

    .line 51
    .line 52
    :cond_0
    if-eqz v2, :cond_1

    .line 53
    .line 54
    iget-object v1, p0, LLe/U;->b:LKe/k;

    .line 55
    .line 56
    invoke-virtual {v1}, LKe/k;->a()LKe/d;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, LKe/d;->w()Lgf/f;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v3, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v3, LBe/K;

    .line 67
    .line 68
    iget-object v4, p0, LLe/U;->b:LKe/k;

    .line 69
    .line 70
    invoke-interface {v1, v2, v3, v4}, Lgf/f;->e(Lye/e;LBe/K;LKe/k;)LBe/K;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iput-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 75
    .line 76
    :cond_1
    iget-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 77
    .line 78
    move-object v2, v1

    .line 79
    check-cast v2, Lye/u0;

    .line 80
    .line 81
    check-cast v1, LBe/K;

    .line 82
    .line 83
    invoke-virtual {v1}, LBe/X;->getType()Lqf/S;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-static {v2, v1}, Lbf/i;->K(Lye/u0;Lqf/S;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_2

    .line 92
    .line 93
    iget-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, LBe/K;

    .line 96
    .line 97
    new-instance v2, LLe/I;

    .line 98
    .line 99
    invoke-direct {v2, p0, p1, v0}, LLe/I;-><init>(LLe/U;LOe/n;Lkotlin/jvm/internal/N;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v2}, LBe/Y;->L0(Lie/a;)V

    .line 103
    .line 104
    .line 105
    :cond_2
    iget-object v1, p0, LLe/U;->b:LKe/k;

    .line 106
    .line 107
    invoke-virtual {v1}, LKe/k;->a()LKe/d;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v1}, LKe/d;->h()LIe/j;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    iget-object v2, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v2, Lye/Z;

    .line 118
    .line 119
    invoke-interface {v1, p1, v2}, LIe/j;->e(LOe/n;Lye/Z;)V

    .line 120
    .line 121
    .line 122
    iget-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast p1, Lye/Z;

    .line 125
    .line 126
    return-object p1
.end method

.method private static final b0(LLe/U;LOe/n;Lkotlin/jvm/internal/N;)Lpf/j;
    .locals 2

    .line 1
    iget-object v0, p0, LLe/U;->b:LKe/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LKe/k;->e()Lpf/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LLe/J;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1, p2}, LLe/J;-><init>(LLe/U;LOe/n;Lkotlin/jvm/internal/N;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Lpf/n;->g(Lie/a;)Lpf/j;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method private static final c0(LLe/U;LOe/n;Lkotlin/jvm/internal/N;)Ldf/g;
    .locals 0

    .line 1
    iget-object p0, p0, LLe/U;->b:LKe/k;

    .line 2
    .line 3
    invoke-virtual {p0}, LKe/k;->a()LKe/d;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, LKe/d;->g()LIe/i;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object p2, p2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p2, Lye/Z;

    .line 14
    .line 15
    invoke-interface {p0, p1, p2}, LIe/i;->a(LOe/n;Lye/Z;)Ldf/g;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method private final e0(Ljava/util/Set;)V
    .locals 7

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Ljava/lang/Iterable;

    .line 3
    .line 4
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    move-object v3, v2

    .line 24
    check-cast v3, Lye/g0;

    .line 25
    .line 26
    const/4 v4, 0x2

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    invoke-static {v3, v6, v6, v4, v5}, LQe/C;->c(Lye/z;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    if-nez v4, :cond_0

    .line 38
    .line 39
    new-instance v4, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    :cond_0
    check-cast v4, Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_3

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Ljava/util/List;

    .line 72
    .line 73
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    const/4 v3, 0x1

    .line 78
    if-eq v2, v3, :cond_2

    .line 79
    .line 80
    sget-object v2, LLe/T;->a:LLe/T;

    .line 81
    .line 82
    invoke-static {v1, v2}, Lbf/r;->b(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-interface {p1, v1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 87
    .line 88
    .line 89
    invoke-interface {p1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    return-void
.end method

.method private static final f0(Lye/g0;)Lye/a;
    .locals 1

    .line 1
    const-string v0, "$this$selectMostSpecificInEachOverridableGroup"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method static synthetic h(LLe/U;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0}, LLe/U;->t(LLe/U;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic i(LLe/U;)LLe/c;
    .locals 0

    .line 1
    invoke-static {p0}, LLe/U;->H(LLe/U;)LLe/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic j(LLe/U;LOe/n;Lkotlin/jvm/internal/N;)Lpf/j;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LLe/U;->b0(LLe/U;LOe/n;Lkotlin/jvm/internal/N;)Lpf/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic k(LLe/U;LOe/n;Lkotlin/jvm/internal/N;)Ldf/g;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LLe/U;->c0(LLe/U;LOe/n;Lkotlin/jvm/internal/N;)Ldf/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic l(LLe/U;LXe/f;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LLe/U;->G(LLe/U;LXe/f;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic m(LLe/U;LXe/f;)Lye/Z;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LLe/U;->F(LLe/U;LXe/f;)Lye/Z;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic n(LLe/U;LXe/f;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LLe/U;->J(LLe/U;LXe/f;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic o(LLe/U;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-static {p0}, LLe/U;->I(LLe/U;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic p(LLe/U;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-static {p0}, LLe/U;->X(LLe/U;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic q(LLe/U;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-static {p0}, LLe/U;->u(LLe/U;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic r(LLe/U;LXe/f;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LLe/U;->W(LLe/U;LXe/f;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic s(Lye/g0;)Lye/a;
    .locals 0

    .line 1
    invoke-static {p0}, LLe/U;->f0(Lye/g0;)Lye/a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final t(LLe/U;)Ljava/util/Collection;
    .locals 2

    .line 1
    sget-object v0, Ljf/d;->o:Ljf/d;

    .line 2
    .line 3
    sget-object v1, Ljf/k;->a:Ljf/k$a;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljf/k$a;->c()Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0, v0, v1}, LLe/U;->w(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method private static final u(LLe/U;)Ljava/util/Set;
    .locals 2

    .line 1
    sget-object v0, Ljf/d;->t:Ljf/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, LLe/U;->v(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method


# virtual methods
.method protected final A(LOe/r;LKe/k;)Lqf/S;
    .locals 7

    .line 1
    const-string v0, "method"

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
    invoke-interface {p1}, LOe/q;->O()LOe/g;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, LOe/g;->o()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    sget-object v1, Lqf/I0;->b:Lqf/I0;

    .line 20
    .line 21
    const/4 v5, 0x6

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, LMe/b;->b(Lqf/I0;ZZLye/m0;ILjava/lang/Object;)LMe/a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p2}, LKe/k;->g()LMe/e;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-interface {p1}, LOe/r;->getReturnType()LOe/x;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p2, p1, v0}, LMe/e;->p(LOe/x;LMe/a;)Lqf/S;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1
.end method

.method protected abstract B(Ljava/util/Collection;LXe/f;)V
.end method

.method protected abstract C(LXe/f;Ljava/util/Collection;)V
.end method

.method protected abstract D(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
.end method

.method protected final K()Lpf/i;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/U;->d:Lpf/i;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final L()LKe/k;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/U;->b:LKe/k;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final N()Lpf/i;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/U;->e:Lpf/i;

    .line 2
    .line 3
    return-object v0
.end method

.method protected abstract O()Lye/c0;
.end method

.method protected final Q()LLe/U;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/U;->c:LLe/U;

    .line 2
    .line 3
    return-object v0
.end method

.method protected abstract R()Lye/m;
.end method

.method protected V(LJe/e;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    return p1
.end method

.method protected abstract Y(LOe/r;Ljava/util/List;Lqf/S;Ljava/util/List;)LLe/U$a;
.end method

.method protected final Z(LOe/r;)LJe/e;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    const-string v1, "method"

    .line 6
    .line 7
    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, LLe/U;->b:LKe/k;

    .line 11
    .line 12
    invoke-static {v1, v3}, LKe/h;->a(LKe/k;LOe/d;)Lze/h;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0}, LLe/U;->R()Lye/m;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v3}, LOe/t;->getName()LXe/f;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    iget-object v5, v0, LLe/U;->b:LKe/k;

    .line 25
    .line 26
    invoke-virtual {v5}, LKe/k;->a()LKe/d;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {v5}, LKe/d;->t()LNe/b;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-interface {v5, v3}, LNe/b;->a(LOe/l;)LNe/a;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    iget-object v6, v0, LLe/U;->e:Lpf/i;

    .line 39
    .line 40
    invoke-interface {v6}, Lie/a;->invoke()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    check-cast v6, LLe/c;

    .line 45
    .line 46
    invoke-interface {v3}, LOe/t;->getName()LXe/f;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    invoke-interface {v6, v7}, LLe/c;->b(LXe/f;)LOe/w;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    const/4 v7, 0x0

    .line 55
    const/4 v8, 0x1

    .line 56
    if-eqz v6, :cond_0

    .line 57
    .line 58
    invoke-interface {v3}, LOe/r;->j()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_0

    .line 67
    .line 68
    move v6, v8

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    move v6, v7

    .line 71
    :goto_0
    invoke-static {v2, v1, v4, v5, v6}, LJe/e;->p1(Lye/m;Lze/h;LXe/f;Lye/h0;Z)LJe/e;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    const-string v1, "createJavaMethod(...)"

    .line 76
    .line 77
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object v1, v0, LLe/U;->b:LKe/k;

    .line 81
    .line 82
    const/4 v5, 0x4

    .line 83
    const/4 v6, 0x0

    .line 84
    const/4 v4, 0x0

    .line 85
    invoke-static/range {v1 .. v6}, LKe/c;->i(LKe/k;Lye/m;LOe/z;IILjava/lang/Object;)LKe/k;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-interface {v3}, LOe/z;->getTypeParameters()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    new-instance v5, Ljava/util/ArrayList;

    .line 94
    .line 95
    const/16 v6, 0xa

    .line 96
    .line 97
    invoke-static {v4, v6}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    if-eqz v6, :cond_1

    .line 113
    .line 114
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    check-cast v6, LOe/y;

    .line 119
    .line 120
    invoke-virtual {v1}, LKe/k;->f()LKe/p;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    invoke-interface {v9, v6}, LKe/p;->a(LOe/y;)Lye/m0;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    invoke-static {v6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_1
    invoke-interface {v3}, LOe/r;->j()Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-virtual {v0, v1, v2, v4}, LLe/U;->d0(LKe/k;Lye/z;Ljava/util/List;)LLe/U$b;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-virtual {v0, v3, v1}, LLe/U;->A(LOe/r;LKe/k;)Lqf/S;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    invoke-virtual {v4}, LLe/U$b;->a()Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    invoke-virtual {v0, v3, v5, v6, v9}, LLe/U;->Y(LOe/r;Ljava/util/List;Lqf/S;Ljava/util/List;)LLe/U$a;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    invoke-virtual {v5}, LLe/U$a;->c()Lqf/S;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    if-eqz v6, :cond_2

    .line 160
    .line 161
    sget-object v9, Lze/h;->k0:Lze/h$a;

    .line 162
    .line 163
    invoke-virtual {v9}, Lze/h$a;->b()Lze/h;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    invoke-static {v2, v6, v9}, Lbf/h;->i(Lye/a;Lqf/S;Lze/h;)Lye/c0;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    :goto_2
    move-object v10, v6

    .line 172
    goto :goto_3

    .line 173
    :cond_2
    const/4 v6, 0x0

    .line 174
    goto :goto_2

    .line 175
    :goto_3
    invoke-virtual {v0}, LLe/U;->O()Lye/c0;

    .line 176
    .line 177
    .line 178
    move-result-object v11

    .line 179
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    invoke-virtual {v5}, LLe/U$a;->e()Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v13

    .line 187
    invoke-virtual {v5}, LLe/U$a;->f()Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v14

    .line 191
    invoke-virtual {v5}, LLe/U$a;->d()Lqf/S;

    .line 192
    .line 193
    .line 194
    move-result-object v15

    .line 195
    sget-object v6, Lye/E;->a:Lye/E$a;

    .line 196
    .line 197
    invoke-interface {v3}, LOe/s;->isAbstract()Z

    .line 198
    .line 199
    .line 200
    move-result v9

    .line 201
    invoke-interface {v3}, LOe/s;->isFinal()Z

    .line 202
    .line 203
    .line 204
    move-result v16

    .line 205
    xor-int/lit8 v8, v16, 0x1

    .line 206
    .line 207
    invoke-virtual {v6, v7, v9, v8}, Lye/E$a;->a(ZZZ)Lye/E;

    .line 208
    .line 209
    .line 210
    move-result-object v16

    .line 211
    invoke-interface {v3}, LOe/s;->getVisibility()Lye/x0;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-static {v3}, LHe/V;->d(Lye/x0;)Lye/u;

    .line 216
    .line 217
    .line 218
    move-result-object v17

    .line 219
    invoke-virtual {v5}, LLe/U$a;->c()Lqf/S;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    if-eqz v3, :cond_3

    .line 224
    .line 225
    sget-object v3, LJe/e;->G:Lye/a$a;

    .line 226
    .line 227
    invoke-virtual {v4}, LLe/U$b;->a()Ljava/util/List;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    invoke-static {v6}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v6

    .line 235
    invoke-static {v3, v6}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-static {v3}, LUd/S;->f(Lkotlin/Pair;)Ljava/util/Map;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    :goto_4
    move-object v9, v2

    .line 244
    move-object/from16 v18, v3

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_3
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    goto :goto_4

    .line 252
    :goto_5
    invoke-virtual/range {v9 .. v18}, LJe/e;->o1(Lye/c0;Lye/c0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lqf/S;Lye/E;Lye/u;Ljava/util/Map;)LBe/O;

    .line 253
    .line 254
    .line 255
    move-object v2, v9

    .line 256
    invoke-virtual {v5}, LLe/U$a;->b()Z

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    invoke-virtual {v4}, LLe/U$b;->b()Z

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    invoke-virtual {v2, v3, v4}, LJe/e;->s1(ZZ)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v5}, LLe/U$a;->a()Ljava/util/List;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    if-nez v3, :cond_4

    .line 276
    .line 277
    invoke-virtual {v1}, LKe/k;->a()LKe/d;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    invoke-virtual {v1}, LKe/d;->s()LIe/o;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    invoke-virtual {v5}, LLe/U$a;->a()Ljava/util/List;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-interface {v1, v2, v3}, LIe/o;->b(Lye/b;Ljava/util/List;)V

    .line 290
    .line 291
    .line 292
    :cond_4
    return-object v2
.end method

.method public a(LXe/f;LGe/b;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "location"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LLe/U;->d()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_0
    iget-object p2, p0, LLe/U;->l:Lpf/g;

    .line 27
    .line 28
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Ljava/util/Collection;

    .line 33
    .line 34
    return-object p1
.end method

.method public b()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-direct {p0}, LLe/U;->P()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c(LXe/f;LGe/b;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "location"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LLe/U;->b()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_0
    iget-object p2, p0, LLe/U;->h:Lpf/g;

    .line 27
    .line 28
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Ljava/util/Collection;

    .line 33
    .line 34
    return-object p1
.end method

.method public d()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-direct {p0}, LLe/U;->S()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected final d0(LKe/k;Lye/z;Ljava/util/List;)LLe/U$b;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "c"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "function"

    .line 9
    .line 10
    move-object/from16 v3, p2

    .line 11
    .line 12
    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "jValueParameters"

    .line 16
    .line 17
    move-object/from16 v14, p3

    .line 18
    .line 19
    invoke-static {v14, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v14}, LUd/u;->h1(Ljava/lang/Iterable;)Ljava/lang/Iterable;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v15, Ljava/util/ArrayList;

    .line 27
    .line 28
    const/16 v2, 0xa

    .line 29
    .line 30
    invoke-static {v1, v2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-direct {v15, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const/4 v2, 0x0

    .line 42
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_6

    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    check-cast v4, LUd/L;

    .line 53
    .line 54
    invoke-virtual {v4}, LUd/L;->a()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    invoke-virtual {v4}, LUd/L;->b()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, LOe/B;

    .line 63
    .line 64
    invoke-static {v0, v4}, LKe/h;->a(LKe/k;LOe/d;)Lze/h;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    sget-object v7, Lqf/I0;->b:Lqf/I0;

    .line 69
    .line 70
    const/4 v11, 0x7

    .line 71
    const/4 v12, 0x0

    .line 72
    const/4 v8, 0x0

    .line 73
    const/4 v9, 0x0

    .line 74
    const/4 v10, 0x0

    .line 75
    invoke-static/range {v7 .. v12}, LMe/b;->b(Lqf/I0;ZZLye/m0;ILjava/lang/Object;)LMe/a;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-interface {v4}, LOe/B;->a()Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    const/4 v9, 0x0

    .line 84
    const/4 v10, 0x1

    .line 85
    if-eqz v8, :cond_2

    .line 86
    .line 87
    invoke-interface {v4}, LOe/B;->getType()LOe/x;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    instance-of v11, v8, LOe/f;

    .line 92
    .line 93
    if-eqz v11, :cond_0

    .line 94
    .line 95
    move-object v9, v8

    .line 96
    check-cast v9, LOe/f;

    .line 97
    .line 98
    :cond_0
    if-eqz v9, :cond_1

    .line 99
    .line 100
    invoke-virtual {v0}, LKe/k;->g()LMe/e;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    invoke-virtual {v8, v9, v7, v10}, LMe/e;->l(LOe/f;LMe/a;Z)Lqf/S;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-virtual {v0}, LKe/k;->d()Lye/H;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    invoke-interface {v8}, Lye/H;->n()Lve/i;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    invoke-virtual {v8, v7}, Lve/i;->k(Lqf/S;)Lqf/S;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    invoke-static {v7, v8}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    goto :goto_1

    .line 125
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 126
    .line 127
    new-instance v1, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    .line 131
    .line 132
    const-string v2, "Vararg parameter should be an array: "

    .line 133
    .line 134
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    throw v0

    .line 148
    :cond_2
    invoke-virtual {v0}, LKe/k;->g()LMe/e;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    invoke-interface {v4}, LOe/B;->getType()LOe/x;

    .line 153
    .line 154
    .line 155
    move-result-object v11

    .line 156
    invoke-virtual {v8, v11, v7}, LMe/e;->p(LOe/x;LMe/a;)Lqf/S;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    invoke-static {v7, v9}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    :goto_1
    invoke-virtual {v7}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    check-cast v8, Lqf/S;

    .line 169
    .line 170
    invoke-virtual {v7}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    move-object v12, v7

    .line 175
    check-cast v12, Lqf/S;

    .line 176
    .line 177
    invoke-interface {v3}, Lye/J;->getName()LXe/f;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    invoke-virtual {v7}, LXe/f;->b()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    const-string v9, "equals"

    .line 186
    .line 187
    invoke-static {v7, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v7

    .line 191
    if-eqz v7, :cond_4

    .line 192
    .line 193
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 194
    .line 195
    .line 196
    move-result v7

    .line 197
    if-ne v7, v10, :cond_4

    .line 198
    .line 199
    invoke-virtual {v0}, LKe/k;->d()Lye/H;

    .line 200
    .line 201
    .line 202
    move-result-object v7

    .line 203
    invoke-interface {v7}, Lye/H;->n()Lve/i;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    invoke-virtual {v7}, Lve/i;->J()Lqf/d0;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    if-eqz v7, :cond_4

    .line 216
    .line 217
    const-string v7, "other"

    .line 218
    .line 219
    invoke-static {v7}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    :cond_3
    :goto_2
    move/from16 v16, v2

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_4
    invoke-interface {v4}, LOe/B;->getName()LXe/f;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    if-nez v7, :cond_5

    .line 231
    .line 232
    move v2, v10

    .line 233
    :cond_5
    if-nez v7, :cond_3

    .line 234
    .line 235
    new-instance v7, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 238
    .line 239
    .line 240
    const/16 v9, 0x70

    .line 241
    .line 242
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    invoke-static {v7}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    const-string v9, "identifier(...)"

    .line 257
    .line 258
    invoke-static {v7, v9}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    goto :goto_2

    .line 262
    :goto_3
    invoke-static {v7}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    new-instance v2, LBe/V;

    .line 266
    .line 267
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 268
    .line 269
    .line 270
    move-result-object v9

    .line 271
    invoke-virtual {v9}, LKe/d;->t()LNe/b;

    .line 272
    .line 273
    .line 274
    move-result-object v9

    .line 275
    invoke-interface {v9, v4}, LNe/b;->a(LOe/l;)LNe/a;

    .line 276
    .line 277
    .line 278
    move-result-object v13

    .line 279
    const/4 v4, 0x0

    .line 280
    const/4 v9, 0x0

    .line 281
    const/4 v10, 0x0

    .line 282
    const/4 v11, 0x0

    .line 283
    invoke-direct/range {v2 .. v13}, LBe/V;-><init>(Lye/a;Lye/t0;ILze/h;LXe/f;Lqf/S;ZZZLqf/S;Lye/h0;)V

    .line 284
    .line 285
    .line 286
    invoke-interface {v15, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-object/from16 v3, p2

    .line 290
    .line 291
    move/from16 v2, v16

    .line 292
    .line 293
    goto/16 :goto_0

    .line 294
    .line 295
    :cond_6
    invoke-static {v15}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    new-instance v1, LLe/U$b;

    .line 300
    .line 301
    invoke-direct {v1, v0, v2}, LLe/U$b;-><init>(Ljava/util/List;Z)V

    .line 302
    .line 303
    .line 304
    return-object v1
.end method

.method public f()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-direct {p0}, LLe/U;->M()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public g(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "kindFilter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "nameFilter"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, LLe/U;->d:Lpf/i;

    .line 12
    .line 13
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/util/Collection;

    .line 18
    .line 19
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Lazy scope for "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LLe/U;->R()Lye/m;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method protected abstract v(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
.end method

.method protected final w(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 5

    .line 1
    const-string v0, "kindFilter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "nameFilter"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LGe/d;->m:LGe/d;

    .line 12
    .line 13
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 16
    .line 17
    .line 18
    sget-object v2, Ljf/d;->c:Ljf/d$a;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljf/d$a;->c()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {p1, v2}, Ljf/d;->a(I)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, LLe/U;->v(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, LXe/f;

    .line 49
    .line 50
    invoke-interface {p2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_0

    .line 61
    .line 62
    invoke-virtual {p0, v3, v0}, Ljf/l;->e(LXe/f;LGe/b;)Lye/h;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-static {v1, v3}, LAf/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    sget-object v2, Ljf/d;->c:Ljf/d$a;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljf/d$a;->d()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-virtual {p1, v2}, Ljf/d;->a(I)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_3

    .line 81
    .line 82
    invoke-virtual {p1}, Ljf/d;->l()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    sget-object v3, Ljf/c$a;->a:Ljf/c$a;

    .line 87
    .line 88
    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-nez v2, :cond_3

    .line 93
    .line 94
    invoke-virtual {p0, p1, p2}, LLe/U;->x(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_3

    .line 107
    .line 108
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    check-cast v3, LXe/f;

    .line 113
    .line 114
    invoke-interface {p2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    check-cast v4, Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-eqz v4, :cond_2

    .line 125
    .line 126
    invoke-virtual {p0, v3, v0}, LLe/U;->c(LXe/f;LGe/b;)Ljava/util/Collection;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    sget-object v2, Ljf/d;->c:Ljf/d$a;

    .line 135
    .line 136
    invoke-virtual {v2}, Ljf/d$a;->i()I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    invoke-virtual {p1, v2}, Ljf/d;->a(I)Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-eqz v2, :cond_5

    .line 145
    .line 146
    invoke-virtual {p1}, Ljf/d;->l()Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    sget-object v3, Ljf/c$a;->a:Ljf/c$a;

    .line 151
    .line 152
    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-nez v2, :cond_5

    .line 157
    .line 158
    invoke-virtual {p0, p1, p2}, LLe/U;->D(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-eqz v2, :cond_5

    .line 171
    .line 172
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    check-cast v2, LXe/f;

    .line 177
    .line 178
    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    check-cast v3, Ljava/lang/Boolean;

    .line 183
    .line 184
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    if-eqz v3, :cond_4

    .line 189
    .line 190
    invoke-virtual {p0, v2, v0}, LLe/U;->a(LXe/f;LGe/b;)Ljava/util/Collection;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 195
    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_5
    invoke-static {v1}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    return-object p1
.end method

.method protected abstract x(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
.end method

.method protected y(Ljava/util/Collection;LXe/f;)V
    .locals 1

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "name"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method protected abstract z()LLe/c;
.end method
