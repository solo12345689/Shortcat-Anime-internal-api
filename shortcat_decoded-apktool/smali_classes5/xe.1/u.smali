.class public final Lxe/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LAe/a;
.implements LAe/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/u$a;,
        Lxe/u$b;
    }
.end annotation


# static fields
.field static final synthetic i:[Lpe/m;


# instance fields
.field private final a:Lye/H;

.field private final b:Lxe/d;

.field private final c:Lpf/i;

.field private final d:Lqf/S;

.field private final e:Lpf/i;

.field private final f:Lpf/a;

.field private final g:Lpf/i;

.field private final h:Lpf/g;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lkotlin/jvm/internal/F;

    .line 2
    .line 3
    const-class v1, Lxe/u;

    .line 4
    .line 5
    const-string v2, "settings"

    .line 6
    .line 7
    const-string v3, "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;"

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
    const-string v3, "cloneableType"

    .line 20
    .line 21
    const-string v5, "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;"

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
    const-string v5, "notConsideredDeprecation"

    .line 33
    .line 34
    const-string v6, "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"

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
    sput-object v3, Lxe/u;->i:[Lpe/m;

    .line 55
    .line 56
    return-void
.end method

.method public constructor <init>(Lye/H;Lpf/n;Lie/a;)V
    .locals 1

    .line 1
    const-string v0, "moduleDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "storageManager"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "settingsComputation"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lxe/u;->a:Lye/H;

    .line 20
    .line 21
    sget-object p1, Lxe/d;->a:Lxe/d;

    .line 22
    .line 23
    iput-object p1, p0, Lxe/u;->b:Lxe/d;

    .line 24
    .line 25
    invoke-interface {p2, p3}, Lpf/n;->c(Lie/a;)Lpf/i;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lxe/u;->c:Lpf/i;

    .line 30
    .line 31
    invoke-direct {p0, p2}, Lxe/u;->q(Lpf/n;)Lqf/S;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lxe/u;->d:Lqf/S;

    .line 36
    .line 37
    new-instance p1, Lxe/l;

    .line 38
    .line 39
    invoke-direct {p1, p0, p2}, Lxe/l;-><init>(Lxe/u;Lpf/n;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p2, p1}, Lpf/n;->c(Lie/a;)Lpf/i;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lxe/u;->e:Lpf/i;

    .line 47
    .line 48
    invoke-interface {p2}, Lpf/n;->a()Lpf/a;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lxe/u;->f:Lpf/a;

    .line 53
    .line 54
    new-instance p1, Lxe/m;

    .line 55
    .line 56
    invoke-direct {p1, p0}, Lxe/m;-><init>(Lxe/u;)V

    .line 57
    .line 58
    .line 59
    invoke-interface {p2, p1}, Lpf/n;->c(Lie/a;)Lpf/i;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Lxe/u;->g:Lpf/i;

    .line 64
    .line 65
    new-instance p1, Lxe/n;

    .line 66
    .line 67
    invoke-direct {p1, p0}, Lxe/n;-><init>(Lxe/u;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p2, p1}, Lpf/n;->h(Lkotlin/jvm/functions/Function1;)Lpf/g;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p1, p0, Lxe/u;->h:Lpf/g;

    .line 75
    .line 76
    return-void
.end method

.method private final A(Lye/z;)Lxe/u$a;
    .locals 4

    .line 1
    invoke-interface {p1}, Lye/z;->b()Lye/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, Lye/e;

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static {p1, v3, v3, v1, v2}, LQe/C;->c(Lye/z;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v1, Lkotlin/jvm/internal/N;

    .line 20
    .line 21
    invoke-direct {v1}, Lkotlin/jvm/internal/N;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v2, Lxe/t;

    .line 29
    .line 30
    invoke-direct {v2, p0}, Lxe/t;-><init>(Lxe/u;)V

    .line 31
    .line 32
    .line 33
    new-instance v3, Lxe/u$d;

    .line 34
    .line 35
    invoke-direct {v3, p1, v1}, Lxe/u$d;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/N;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v2, v3}, LAf/b;->b(Ljava/util/Collection;LAf/b$c;LAf/b$d;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string v0, "dfs(...)"

    .line 43
    .line 44
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    check-cast p1, Lxe/u$a;

    .line 48
    .line 49
    return-object p1
.end method

.method private static final B(Lxe/u;Lye/e;)Ljava/lang/Iterable;
    .locals 4

    .line 1
    invoke-interface {p1}, Lye/h;->l()Lqf/v0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Lqf/v0;->k()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "getSupertypes(...)"

    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Iterable;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_5

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lqf/S;

    .line 36
    .line 37
    invoke-virtual {v1}, Lqf/S;->N0()Lqf/v0;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v1}, Lqf/v0;->p()Lye/h;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const/4 v2, 0x0

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-interface {v1}, Lye/h;->a()Lye/h;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move-object v1, v2

    .line 54
    :goto_1
    instance-of v3, v1, Lye/e;

    .line 55
    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    check-cast v1, Lye/e;

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    move-object v1, v2

    .line 62
    :goto_2
    if-nez v1, :cond_3

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_3
    invoke-direct {p0, v1}, Lxe/u;->z(Lye/e;)LLe/n;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-eqz v2, :cond_4

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    move-object v2, v1

    .line 73
    :goto_3
    if-eqz v2, :cond_0

    .line 74
    .line 75
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    return-object v0
.end method

.method private final C()Lze/h;
    .locals 3

    .line 1
    iget-object v0, p0, Lxe/u;->g:Lpf/i;

    .line 2
    .line 3
    sget-object v1, Lxe/u;->i:[Lpe/m;

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
    check-cast v0, Lze/h;

    .line 13
    .line 14
    return-object v0
.end method

.method private final D()Lxe/k$b;
    .locals 3

    .line 1
    iget-object v0, p0, Lxe/u;->c:Lpf/i;

    .line 2
    .line 3
    sget-object v1, Lxe/u;->i:[Lpe/m;

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
    check-cast v0, Lxe/k$b;

    .line 13
    .line 14
    return-object v0
.end method

.method private final E(Lye/g0;Z)Z
    .locals 4

    .line 1
    invoke-interface {p1}, Lye/z;->b()Lye/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, Lye/e;

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static {p1, v3, v3, v1, v2}, LQe/C;->c(Lye/z;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sget-object v2, Lxe/x;->a:Lxe/x;

    .line 20
    .line 21
    invoke-virtual {v2}, Lxe/x;->g()Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    sget-object v3, LQe/F;->a:LQe/F;

    .line 26
    .line 27
    invoke-static {v3, v0, v1}, LQe/B;->a(LQe/F;Lye/e;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    xor-int/2addr p2, v0

    .line 36
    if-eqz p2, :cond_0

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    return p1

    .line 40
    :cond_0
    invoke-static {p1}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    sget-object p2, Lxe/r;->a:Lxe/r;

    .line 45
    .line 46
    new-instance v0, Lxe/s;

    .line 47
    .line 48
    invoke-direct {v0, p0}, Lxe/s;-><init>(Lxe/u;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1, p2, v0}, LAf/b;->e(Ljava/util/Collection;LAf/b$c;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string p2, "ifAny(...)"

    .line 56
    .line 57
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    return p1
.end method

.method private static final F(Lye/b;)Ljava/lang/Iterable;
    .locals 0

    .line 1
    invoke-interface {p0}, Lye/b;->a()Lye/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lye/b;->e()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Iterable;

    .line 10
    .line 11
    return-object p0
.end method

.method private static final G(Lxe/u;Lye/b;)Ljava/lang/Boolean;
    .locals 2

    .line 1
    invoke-interface {p1}, Lye/b;->h()Lye/b$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lye/b$a;->a:Lye/b$a;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lxe/u;->b:Lxe/d;

    .line 10
    .line 11
    invoke-interface {p1}, Lye/n;->b()Lye/m;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    .line 16
    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    check-cast p1, Lye/e;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lxe/d;->c(Lye/e;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method private final H(Lye/l;Lye/e;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Lye/a;->j()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p1}, Lye/a;->j()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "getValueParameters(...)"

    .line 17
    .line 18
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, LUd/u;->M0(Ljava/util/List;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lye/t0;

    .line 26
    .line 27
    invoke-interface {p1}, Lye/s0;->getType()Lqf/S;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lqf/S;->N0()Lqf/v0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p1}, Lqf/v0;->p()Lye/h;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    invoke-static {p1}, Lff/e;->p(Lye/m;)LXe/d;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 p1, 0x0

    .line 47
    :goto_0
    invoke-static {p2}, Lff/e;->p(Lye/m;)LXe/d;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    return v1

    .line 58
    :cond_1
    const/4 p1, 0x0

    .line 59
    return p1
.end method

.method private static final I(Lxe/u;)Lze/h;
    .locals 7

    .line 1
    iget-object p0, p0, Lxe/u;->a:Lye/H;

    .line 2
    .line 3
    invoke-interface {p0}, Lye/H;->n()Lve/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v5, 0x6

    .line 8
    const/4 v6, 0x0

    .line 9
    const-string v1, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version"

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    invoke-static/range {v0 .. v6}, Lze/g;->c(Lve/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lze/c;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object v0, Lze/h;->k0:Lze/h$a;

    .line 19
    .line 20
    invoke-static {p0}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {v0, p0}, Lze/h$a;->a(Ljava/util/List;)Lze/h;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method static synthetic f(Lxe/u;Lpf/n;)Lqf/d0;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxe/u;->o(Lxe/u;Lpf/n;)Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic g(Lxe/u;)Lze/h;
    .locals 0

    .line 1
    invoke-static {p0}, Lxe/u;->I(Lxe/u;)Lze/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic h(Lxe/u;Lkotlin/Pair;)Lze/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxe/u;->s(Lxe/u;Lkotlin/Pair;)Lze/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic i(Lxe/u;)Lqf/S;
    .locals 0

    .line 1
    invoke-static {p0}, Lxe/u;->r(Lxe/u;)Lqf/S;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic j(LXe/f;Ljf/k;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxe/u;->x(LXe/f;Ljf/k;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic k(LLe/n;Lye/e;)Lye/e;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxe/u;->u(LLe/n;Lye/e;)Lye/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic l(Lye/b;)Ljava/lang/Iterable;
    .locals 0

    .line 1
    invoke-static {p0}, Lxe/u;->F(Lye/b;)Ljava/lang/Iterable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic m(Lxe/u;Lye/b;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxe/u;->G(Lxe/u;Lye/b;)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic n(Lxe/u;Lye/e;)Ljava/lang/Iterable;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxe/u;->B(Lxe/u;Lye/e;)Ljava/lang/Iterable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final o(Lxe/u;Lpf/n;)Lqf/d0;
    .locals 3

    .line 1
    invoke-direct {p0}, Lxe/u;->D()Lxe/k$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lxe/k$b;->a()Lye/H;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lxe/g;->d:Lxe/g$a;

    .line 10
    .line 11
    invoke-virtual {v1}, Lxe/g$a;->a()LXe/b;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Lye/M;

    .line 16
    .line 17
    invoke-direct {p0}, Lxe/u;->D()Lxe/k$b;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lxe/k$b;->a()Lye/H;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-direct {v2, p1, p0}, Lye/M;-><init>(Lpf/n;Lye/H;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1, v2}, Lye/y;->d(Lye/H;LXe/b;Lye/M;)Lye/e;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-interface {p0}, Lye/e;->p()Lqf/d0;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method private final p(Lof/m;Lye/g0;)Lye/g0;
    .locals 1

    .line 1
    invoke-interface {p2}, Lye/g0;->v()Lye/z$a;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2, p1}, Lye/z$a;->n(Lye/m;)Lye/z$a;

    .line 6
    .line 7
    .line 8
    sget-object v0, Lye/t;->e:Lye/u;

    .line 9
    .line 10
    invoke-interface {p2, v0}, Lye/z$a;->h(Lye/u;)Lye/z$a;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, LBe/a;->p()Lqf/d0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {p2, v0}, Lye/z$a;->o(Lqf/S;)Lye/z$a;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, LBe/a;->J0()Lye/c0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p2, p1}, Lye/z$a;->c(Lye/c0;)Lye/z$a;

    .line 25
    .line 26
    .line 27
    invoke-interface {p2}, Lye/z$a;->build()Lye/z;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    check-cast p1, Lye/g0;

    .line 35
    .line 36
    return-object p1
.end method

.method private final q(Lpf/n;)Lqf/S;
    .locals 12

    .line 1
    iget-object v0, p0, Lxe/u;->a:Lye/H;

    .line 2
    .line 3
    new-instance v1, LXe/c;

    .line 4
    .line 5
    const-string v2, "java.io"

    .line 6
    .line 7
    invoke-direct {v1, v2}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v4, Lxe/u$c;

    .line 11
    .line 12
    invoke-direct {v4, v0, v1}, Lxe/u$c;-><init>(Lye/H;LXe/c;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lqf/Y;

    .line 16
    .line 17
    new-instance v1, Lxe/o;

    .line 18
    .line 19
    invoke-direct {v1, p0}, Lxe/o;-><init>(Lxe/u;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, p1, v1}, Lqf/Y;-><init>(Lpf/n;Lie/a;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    new-instance v3, LBe/k;

    .line 30
    .line 31
    const-string v0, "Serializable"

    .line 32
    .line 33
    invoke-static {v0}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    sget-object v6, Lye/E;->e:Lye/E;

    .line 38
    .line 39
    sget-object v7, Lye/f;->c:Lye/f;

    .line 40
    .line 41
    sget-object v9, Lye/h0;->a:Lye/h0;

    .line 42
    .line 43
    const/4 v10, 0x0

    .line 44
    move-object v11, p1

    .line 45
    invoke-direct/range {v3 .. v11}, LBe/k;-><init>(Lye/m;LXe/f;Lye/E;Lye/f;Ljava/util/Collection;Lye/h0;ZLpf/n;)V

    .line 46
    .line 47
    .line 48
    sget-object p1, Ljf/k$b;->b:Ljf/k$b;

    .line 49
    .line 50
    invoke-static {}, LUd/a0;->d()Ljava/util/Set;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-virtual {v3, p1, v0, v1}, LBe/k;->K0(Ljf/k;Ljava/util/Set;Lye/d;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, LBe/a;->p()Lqf/d0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const-string v0, "getDefaultType(...)"

    .line 63
    .line 64
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object p1
.end method

.method private static final r(Lxe/u;)Lqf/S;
    .locals 1

    .line 1
    iget-object p0, p0, Lxe/u;->a:Lye/H;

    .line 2
    .line 3
    invoke-interface {p0}, Lye/H;->n()Lve/i;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lve/i;->i()Lqf/d0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "getAnyType(...)"

    .line 12
    .line 13
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method private static final s(Lxe/u;Lkotlin/Pair;)Lze/h;
    .locals 3

    .line 1
    const-string v0, "<destruct>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/lang/String;

    .line 17
    .line 18
    iget-object p0, p0, Lxe/u;->a:Lye/H;

    .line 19
    .line 20
    invoke-interface {p0}, Lye/H;->n()Lve/i;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const/16 v2, 0x27

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, "()\' member of List is redundant in Kotlin and might be removed soon. Please use \'"

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, "()\' stdlib extension instead"

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string p1, "()"

    .line 63
    .line 64
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-string v1, "HIDDEN"

    .line 72
    .line 73
    const/4 v2, 0x0

    .line 74
    invoke-static {p0, v0, p1, v1, v2}, Lze/g;->b(Lve/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lze/c;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    sget-object p1, Lze/h;->k0:Lze/h$a;

    .line 79
    .line 80
    invoke-static {p0}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p1, p0}, Lze/h$a;->a(Ljava/util/List;)Lze/h;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
.end method

.method private final t(Lye/e;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 7

    .line 1
    invoke-direct {p0, p1}, Lxe/u;->z(Lye/e;)LLe/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object v1, p0, Lxe/u;->b:Lxe/d;

    .line 13
    .line 14
    invoke-static {v0}, Lff/e;->o(Lye/m;)LXe/c;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    sget-object v3, Lxe/b;->h:Lxe/b$a;

    .line 19
    .line 20
    invoke-virtual {v3}, Lxe/b$a;->a()Lve/i;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v1, v2, v3}, Lxe/d;->g(LXe/c;Lve/i;)Ljava/util/Collection;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/Iterable;

    .line 29
    .line 30
    invoke-static {v1}, LUd/u;->z0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lye/e;

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_1
    sget-object v3, LAf/k;->c:LAf/k$b;

    .line 44
    .line 45
    new-instance v4, Ljava/util/ArrayList;

    .line 46
    .line 47
    const/16 v5, 0xa

    .line 48
    .line 49
    invoke-static {v1, v5}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_2

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    check-cast v5, Lye/e;

    .line 71
    .line 72
    invoke-static {v5}, Lff/e;->o(Lye/m;)LXe/c;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    invoke-virtual {v3, v4}, LAf/k$b;->b(Ljava/util/Collection;)LAf/k;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iget-object v3, p0, Lxe/u;->b:Lxe/d;

    .line 85
    .line 86
    invoke-virtual {v3, p1}, Lxe/d;->c(Lye/e;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    iget-object v3, p0, Lxe/u;->f:Lpf/a;

    .line 91
    .line 92
    invoke-static {v0}, Lff/e;->o(Lye/m;)LXe/c;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    new-instance v5, Lxe/q;

    .line 97
    .line 98
    invoke-direct {v5, v0, v2}, Lxe/q;-><init>(LLe/n;Lye/e;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v3, v4, v5}, Lpf/a;->a(Ljava/lang/Object;Lie/a;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, Lye/e;

    .line 106
    .line 107
    invoke-interface {v0}, Lye/e;->X()Ljf/k;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    const-string v2, "getUnsubstitutedMemberScope(...)"

    .line 112
    .line 113
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    check-cast p2, Ljava/lang/Iterable;

    .line 121
    .line 122
    new-instance v0, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_a

    .line 136
    .line 137
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    move-object v3, v2

    .line 142
    check-cast v3, Lye/g0;

    .line 143
    .line 144
    invoke-interface {v3}, Lye/b;->h()Lye/b$a;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    sget-object v5, Lye/b$a;->a:Lye/b$a;

    .line 149
    .line 150
    if-eq v4, v5, :cond_4

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_4
    invoke-interface {v3}, Lye/D;->getVisibility()Lye/u;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-virtual {v4}, Lye/u;->d()Z

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    if-nez v4, :cond_5

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_5
    invoke-static {v3}, Lve/i;->l0(Lye/m;)Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-eqz v4, :cond_6

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_6
    invoke-interface {v3}, Lye/z;->e()Ljava/util/Collection;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    const-string v5, "getOverriddenDescriptors(...)"

    .line 176
    .line 177
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    check-cast v4, Ljava/lang/Iterable;

    .line 181
    .line 182
    instance-of v5, v4, Ljava/util/Collection;

    .line 183
    .line 184
    if-eqz v5, :cond_7

    .line 185
    .line 186
    move-object v5, v4

    .line 187
    check-cast v5, Ljava/util/Collection;

    .line 188
    .line 189
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-eqz v5, :cond_7

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_7
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    :cond_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    if-eqz v5, :cond_9

    .line 205
    .line 206
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    check-cast v5, Lye/z;

    .line 211
    .line 212
    invoke-interface {v5}, Lye/z;->b()Lye/m;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    const-string v6, "getContainingDeclaration(...)"

    .line 217
    .line 218
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-static {v5}, Lff/e;->o(Lye/m;)LXe/c;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    invoke-virtual {v1, v5}, LAf/k;->contains(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    if-eqz v5, :cond_8

    .line 230
    .line 231
    goto :goto_1

    .line 232
    :cond_9
    :goto_2
    invoke-direct {p0, v3, p1}, Lxe/u;->E(Lye/g0;Z)Z

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    if-nez v3, :cond_3

    .line 237
    .line 238
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    goto :goto_1

    .line 242
    :cond_a
    return-object v0
.end method

.method private static final u(LLe/n;Lye/e;)Lye/e;
    .locals 2

    .line 1
    sget-object v0, LIe/j;->a:LIe/j;

    .line 2
    .line 3
    const-string v1, "EMPTY"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0, p1}, LLe/n;->P0(LIe/j;Lye/e;)LLe/n;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method private final v()Lqf/d0;
    .locals 3

    .line 1
    iget-object v0, p0, Lxe/u;->e:Lpf/i;

    .line 2
    .line 3
    sget-object v1, Lxe/u;->i:[Lpe/m;

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

.method private static final w(Lye/l;Lqf/G0;Lye/l;)Z
    .locals 0

    .line 1
    invoke-interface {p2, p1}, Lye/l;->c(Lqf/G0;)Lye/l;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p0, p1}, Lbf/o;->x(Lye/a;Lye/a;)Lbf/o$i$a;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object p1, Lbf/o$i$a;->a:Lbf/o$i$a;

    .line 10
    .line 11
    if-ne p0, p1, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method private static final x(LXe/f;Ljf/k;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LGe/d;->d:LGe/d;

    .line 7
    .line 8
    invoke-interface {p1, p0, v0}, Ljf/k;->c(LXe/f;LGe/b;)Ljava/util/Collection;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method private final z(Lye/e;)LLe/n;
    .locals 3

    .line 1
    invoke-static {p1}, Lve/i;->b0(Lye/e;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-static {p1}, Lve/i;->C0(Lye/m;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_1
    invoke-static {p1}, Lff/e;->p(Lye/m;)LXe/d;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, LXe/d;->f()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_2
    sget-object v0, Lxe/c;->a:Lxe/c;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lxe/c;->n(LXe/d;)LXe/b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_4

    .line 34
    .line 35
    invoke-virtual {p1}, LXe/b;->a()LXe/c;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-nez p1, :cond_3

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    invoke-direct {p0}, Lxe/u;->D()Lxe/k$b;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Lxe/k$b;->a()Lye/H;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sget-object v2, LGe/d;->d:LGe/d;

    .line 51
    .line 52
    invoke-static {v0, p1, v2}, Lye/s;->d(Lye/H;LXe/c;LGe/b;)Lye/e;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    instance-of v0, p1, LLe/n;

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    check-cast p1, LLe/n;

    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_4
    :goto_0
    return-object v1
.end method


# virtual methods
.method public a(Lye/e;)Ljava/util/Collection;
    .locals 3

    .line 1
    const-string v0, "classDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lff/e;->p(Lye/m;)LXe/d;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object v0, Lxe/x;->a:Lxe/x;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lxe/x;->j(LXe/d;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-direct {p0}, Lxe/u;->v()Lqf/d0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object v0, p0, Lxe/u;->d:Lqf/S;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    new-array v1, v1, [Lqf/S;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    aput-object p1, v1, v2

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    aput-object v0, v1, p1

    .line 32
    .line 33
    invoke-static {v1}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_0
    invoke-virtual {v0, p1}, Lxe/x;->k(LXe/d;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    iget-object p1, p0, Lxe/u;->d:Lqf/S;

    .line 45
    .line 46
    invoke-static {p1}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :cond_1
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1
.end method

.method public b(Lye/e;Lye/g0;)Z
    .locals 6

    .line 1
    const-string v0, "classDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "functionDescriptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Lxe/u;->z(Lye/e;)LLe/n;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v0, 0x1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    return v0

    .line 19
    :cond_0
    invoke-interface {p2}, Lze/a;->getAnnotations()Lze/h;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {}, LAe/d;->a()LXe/c;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v1, v2}, Lze/h;->k0(LXe/c;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    return v0

    .line 34
    :cond_1
    invoke-direct {p0}, Lxe/u;->D()Lxe/k$b;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Lxe/k$b;->b()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x0

    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    return v2

    .line 46
    :cond_2
    const/4 v1, 0x3

    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-static {p2, v2, v2, v1, v3}, LQe/C;->c(Lye/z;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {p1}, LLe/n;->U0()LLe/z;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-interface {p2}, Lye/J;->getName()LXe/f;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    const-string v5, "getName(...)"

    .line 61
    .line 62
    invoke-static {p2, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    sget-object v5, LGe/d;->d:LGe/d;

    .line 66
    .line 67
    invoke-virtual {p1, p2, v5}, LLe/z;->c(LXe/f;LGe/b;)Ljava/util/Collection;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, Ljava/lang/Iterable;

    .line 72
    .line 73
    instance-of p2, p1, Ljava/util/Collection;

    .line 74
    .line 75
    if-eqz p2, :cond_3

    .line 76
    .line 77
    move-object p2, p1

    .line 78
    check-cast p2, Ljava/util/Collection;

    .line 79
    .line 80
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-eqz p2, :cond_3

    .line 85
    .line 86
    return v2

    .line 87
    :cond_3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    if-eqz p2, :cond_5

    .line 96
    .line 97
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    check-cast p2, Lye/g0;

    .line 102
    .line 103
    invoke-static {p2, v2, v2, v1, v3}, LQe/C;->c(Lye/z;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-static {p2, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    if-eqz p2, :cond_4

    .line 112
    .line 113
    return v0

    .line 114
    :cond_5
    return v2
.end method

.method public c(LXe/f;Lye/e;)Ljava/util/Collection;
    .locals 6

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "classDescriptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lxe/a;->e:Lxe/a$a;

    .line 12
    .line 13
    invoke-virtual {v0}, Lxe/a$a;->a()LXe/f;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    instance-of v0, p2, Lof/m;

    .line 24
    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    invoke-static {p2}, Lve/i;->f0(Lye/e;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    check-cast p2, Lof/m;

    .line 34
    .line 35
    invoke-virtual {p2}, Lof/m;->e1()LSe/c;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, LSe/c;->M0()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "getFunctionList(...)"

    .line 44
    .line 45
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, LSe/j;

    .line 72
    .line 73
    invoke-virtual {p2}, Lof/m;->d1()Lmf/p;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, Lmf/p;->g()LUe/d;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v1}, LSe/j;->i0()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-static {v2, v1}, Lmf/L;->b(LUe/d;I)LXe/f;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    sget-object v2, Lxe/a;->e:Lxe/a$a;

    .line 90
    .line 91
    invoke-virtual {v2}, Lxe/a$a;->a()LXe/f;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_1

    .line 100
    .line 101
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    return-object p1

    .line 106
    :cond_2
    :goto_0
    invoke-direct {p0}, Lxe/u;->v()Lqf/d0;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0}, Lqf/S;->o()Ljf/k;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    sget-object v1, LGe/d;->d:LGe/d;

    .line 115
    .line 116
    invoke-interface {v0, p1, v1}, Ljf/k;->c(LXe/f;LGe/b;)Ljava/util/Collection;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    check-cast p1, Ljava/lang/Iterable;

    .line 121
    .line 122
    invoke-static {p1}, LUd/u;->L0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    check-cast p1, Lye/g0;

    .line 127
    .line 128
    invoke-direct {p0, p2, p1}, Lxe/u;->p(Lof/m;Lye/g0;)Lye/g0;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-static {p1}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    return-object p1

    .line 137
    :cond_3
    invoke-direct {p0}, Lxe/u;->D()Lxe/k$b;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, Lxe/k$b;->b()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-nez v0, :cond_4

    .line 146
    .line 147
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    return-object p1

    .line 152
    :cond_4
    new-instance v0, Lxe/p;

    .line 153
    .line 154
    invoke-direct {v0, p1}, Lxe/p;-><init>(LXe/f;)V

    .line 155
    .line 156
    .line 157
    invoke-direct {p0, p2, v0}, Lxe/u;->t(Lye/e;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    check-cast p1, Ljava/lang/Iterable;

    .line 162
    .line 163
    new-instance v0, Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    :cond_5
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_e

    .line 177
    .line 178
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    check-cast v1, Lye/g0;

    .line 183
    .line 184
    invoke-interface {v1}, Lye/z;->b()Lye/m;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    const-string v3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    .line 189
    .line 190
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    check-cast v2, Lye/e;

    .line 194
    .line 195
    invoke-static {v2, p2}, Lxe/y;->a(Lye/e;Lye/e;)Lqf/w0;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-virtual {v2}, Lqf/E0;->c()Lqf/G0;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-interface {v1, v2}, Lye/z;->c(Lqf/G0;)Lye/z;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    const-string v3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor"

    .line 208
    .line 209
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    check-cast v2, Lye/g0;

    .line 213
    .line 214
    invoke-interface {v2}, Lye/g0;->v()Lye/z$a;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-interface {v2, p2}, Lye/z$a;->n(Lye/m;)Lye/z$a;

    .line 219
    .line 220
    .line 221
    invoke-interface {p2}, Lye/e;->J0()Lye/c0;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-interface {v2, v3}, Lye/z$a;->c(Lye/c0;)Lye/z$a;

    .line 226
    .line 227
    .line 228
    invoke-interface {v2}, Lye/z$a;->l()Lye/z$a;

    .line 229
    .line 230
    .line 231
    invoke-direct {p0, v1}, Lxe/u;->A(Lye/z;)Lxe/u$a;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    sget-object v4, Lxe/u$b;->a:[I

    .line 236
    .line 237
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    aget v3, v4, v3

    .line 242
    .line 243
    const/4 v4, 0x1

    .line 244
    const/4 v5, 0x0

    .line 245
    if-eq v3, v4, :cond_b

    .line 246
    .line 247
    const/4 v4, 0x2

    .line 248
    if-eq v3, v4, :cond_8

    .line 249
    .line 250
    const/4 v1, 0x3

    .line 251
    if-eq v3, v1, :cond_7

    .line 252
    .line 253
    const/4 v1, 0x4

    .line 254
    if-eq v3, v1, :cond_d

    .line 255
    .line 256
    const/4 v1, 0x5

    .line 257
    if-ne v3, v1, :cond_6

    .line 258
    .line 259
    sget-object v1, LTd/L;->a:LTd/L;

    .line 260
    .line 261
    goto/16 :goto_3

    .line 262
    .line 263
    :cond_6
    new-instance p1, LTd/r;

    .line 264
    .line 265
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 266
    .line 267
    .line 268
    throw p1

    .line 269
    :cond_7
    invoke-direct {p0}, Lxe/u;->C()Lze/h;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-interface {v2, v1}, Lye/z$a;->s(Lze/h;)Lye/z$a;

    .line 274
    .line 275
    .line 276
    goto :goto_3

    .line 277
    :cond_8
    invoke-interface {v1}, Lye/J;->getName()LXe/f;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    invoke-static {}, Lxe/v;->a()LXe/f;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    if-eqz v4, :cond_9

    .line 290
    .line 291
    iget-object v3, p0, Lxe/u;->h:Lpf/g;

    .line 292
    .line 293
    invoke-interface {v1}, Lye/J;->getName()LXe/f;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    invoke-virtual {v1}, LXe/f;->b()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    const-string v4, "first"

    .line 302
    .line 303
    invoke-static {v1, v4}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-interface {v3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    check-cast v1, Lze/h;

    .line 312
    .line 313
    goto :goto_2

    .line 314
    :cond_9
    invoke-static {}, Lxe/v;->b()LXe/f;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    if-eqz v3, :cond_a

    .line 323
    .line 324
    iget-object v3, p0, Lxe/u;->h:Lpf/g;

    .line 325
    .line 326
    invoke-interface {v1}, Lye/J;->getName()LXe/f;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    invoke-virtual {v1}, LXe/f;->b()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    const-string v4, "last"

    .line 335
    .line 336
    invoke-static {v1, v4}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    invoke-interface {v3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    check-cast v1, Lze/h;

    .line 345
    .line 346
    :goto_2
    invoke-interface {v2, v1}, Lye/z$a;->s(Lze/h;)Lye/z$a;

    .line 347
    .line 348
    .line 349
    goto :goto_3

    .line 350
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 351
    .line 352
    new-instance p2, Ljava/lang/StringBuilder;

    .line 353
    .line 354
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 355
    .line 356
    .line 357
    const-string v0, "Unexpected name: "

    .line 358
    .line 359
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-interface {v1}, Lye/J;->getName()LXe/f;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object p2

    .line 373
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object p2

    .line 377
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    throw p1

    .line 381
    :cond_b
    invoke-static {p2}, Lye/F;->a(Lye/e;)Z

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    if-eqz v1, :cond_c

    .line 386
    .line 387
    goto :goto_4

    .line 388
    :cond_c
    invoke-interface {v2}, Lye/z$a;->f()Lye/z$a;

    .line 389
    .line 390
    .line 391
    :goto_3
    invoke-interface {v2}, Lye/z$a;->build()Lye/z;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    move-object v5, v1

    .line 399
    check-cast v5, Lye/g0;

    .line 400
    .line 401
    :cond_d
    :goto_4
    if-eqz v5, :cond_5

    .line 402
    .line 403
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    goto/16 :goto_1

    .line 407
    .line 408
    :cond_e
    return-object v0
.end method

.method public d(Lye/e;)Ljava/util/Collection;
    .locals 12

    .line 1
    const-string v0, "classDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lye/e;->h()Lye/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lye/f;->b:Lye/f;

    .line 11
    .line 12
    if-ne v0, v1, :cond_a

    .line 13
    .line 14
    invoke-direct {p0}, Lxe/u;->D()Lxe/k$b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lxe/k$b;->b()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_0
    invoke-direct {p0, p1}, Lxe/u;->z(Lye/e;)LLe/n;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_1
    iget-object v1, p0, Lxe/u;->b:Lxe/d;

    .line 38
    .line 39
    invoke-static {v0}, Lff/e;->o(Lye/m;)LXe/c;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    sget-object v3, Lxe/b;->h:Lxe/b$a;

    .line 44
    .line 45
    invoke-virtual {v3}, Lxe/b$a;->a()Lve/i;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    const/4 v5, 0x4

    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-static/range {v1 .. v6}, Lxe/d;->f(Lxe/d;LXe/c;Lve/i;Ljava/lang/Integer;ILjava/lang/Object;)Lye/e;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-nez v1, :cond_2

    .line 57
    .line 58
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :cond_2
    invoke-static {v1, v0}, Lxe/y;->a(Lye/e;Lye/e;)Lqf/w0;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2}, Lqf/E0;->c()Lqf/G0;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v0}, LLe/n;->R0()Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    new-instance v4, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    :cond_3
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    const/4 v6, 0x0

    .line 89
    const/4 v7, 0x3

    .line 90
    const/4 v8, 0x0

    .line 91
    if-eqz v5, :cond_7

    .line 92
    .line 93
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    move-object v9, v5

    .line 98
    check-cast v9, Lye/d;

    .line 99
    .line 100
    invoke-interface {v9}, Lye/D;->getVisibility()Lye/u;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    invoke-virtual {v10}, Lye/u;->d()Z

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    if-eqz v10, :cond_3

    .line 109
    .line 110
    invoke-interface {v1}, Lye/e;->i()Ljava/util/Collection;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    const-string v11, "getConstructors(...)"

    .line 115
    .line 116
    invoke-static {v10, v11}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    check-cast v10, Ljava/lang/Iterable;

    .line 120
    .line 121
    instance-of v11, v10, Ljava/util/Collection;

    .line 122
    .line 123
    if-eqz v11, :cond_4

    .line 124
    .line 125
    move-object v11, v10

    .line 126
    check-cast v11, Ljava/util/Collection;

    .line 127
    .line 128
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 129
    .line 130
    .line 131
    move-result v11

    .line 132
    if-eqz v11, :cond_4

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_4
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    :cond_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v11

    .line 143
    if-eqz v11, :cond_6

    .line 144
    .line 145
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v11

    .line 149
    check-cast v11, Lye/d;

    .line 150
    .line 151
    invoke-static {v11}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v11, v2, v9}, Lxe/u;->w(Lye/l;Lqf/G0;Lye/l;)Z

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    if-eqz v11, :cond_5

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_6
    :goto_1
    invoke-direct {p0, v9, p1}, Lxe/u;->H(Lye/l;Lye/e;)Z

    .line 162
    .line 163
    .line 164
    move-result v10

    .line 165
    if-nez v10, :cond_3

    .line 166
    .line 167
    invoke-static {v9}, Lve/i;->l0(Lye/m;)Z

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    if-nez v10, :cond_3

    .line 172
    .line 173
    sget-object v10, Lxe/x;->a:Lxe/x;

    .line 174
    .line 175
    invoke-virtual {v10}, Lxe/x;->e()Ljava/util/Set;

    .line 176
    .line 177
    .line 178
    move-result-object v10

    .line 179
    sget-object v11, LQe/F;->a:LQe/F;

    .line 180
    .line 181
    invoke-static {v9, v8, v8, v7, v6}, LQe/C;->c(Lye/z;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    invoke-static {v11, v0, v6}, LQe/B;->a(LQe/F;Lye/e;Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    invoke-interface {v10, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    if-nez v6, :cond_3

    .line 194
    .line 195
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    goto :goto_0

    .line 199
    :cond_7
    new-instance v1, Ljava/util/ArrayList;

    .line 200
    .line 201
    const/16 v3, 0xa

    .line 202
    .line 203
    invoke-static {v4, v3}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 208
    .line 209
    .line 210
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    if-eqz v4, :cond_9

    .line 219
    .line 220
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    check-cast v4, Lye/d;

    .line 225
    .line 226
    invoke-interface {v4}, Lye/z;->v()Lye/z$a;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    invoke-interface {v5, p1}, Lye/z$a;->n(Lye/m;)Lye/z$a;

    .line 231
    .line 232
    .line 233
    invoke-interface {p1}, Lye/e;->p()Lqf/d0;

    .line 234
    .line 235
    .line 236
    move-result-object v9

    .line 237
    invoke-interface {v5, v9}, Lye/z$a;->o(Lqf/S;)Lye/z$a;

    .line 238
    .line 239
    .line 240
    invoke-interface {v5}, Lye/z$a;->l()Lye/z$a;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2}, Lqf/G0;->j()Lqf/E0;

    .line 244
    .line 245
    .line 246
    move-result-object v9

    .line 247
    invoke-interface {v5, v9}, Lye/z$a;->p(Lqf/E0;)Lye/z$a;

    .line 248
    .line 249
    .line 250
    sget-object v9, Lxe/x;->a:Lxe/x;

    .line 251
    .line 252
    invoke-virtual {v9}, Lxe/x;->h()Ljava/util/Set;

    .line 253
    .line 254
    .line 255
    move-result-object v9

    .line 256
    sget-object v10, LQe/F;->a:LQe/F;

    .line 257
    .line 258
    invoke-static {v4, v8, v8, v7, v6}, LQe/C;->c(Lye/z;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    invoke-static {v10, v0, v4}, LQe/B;->a(LQe/F;Lye/e;Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    invoke-interface {v9, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    if-nez v4, :cond_8

    .line 271
    .line 272
    invoke-direct {p0}, Lxe/u;->C()Lze/h;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    invoke-interface {v5, v4}, Lye/z$a;->s(Lze/h;)Lye/z$a;

    .line 277
    .line 278
    .line 279
    :cond_8
    invoke-interface {v5}, Lye/z$a;->build()Lye/z;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    const-string v5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor"

    .line 284
    .line 285
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    check-cast v4, Lye/d;

    .line 289
    .line 290
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    goto :goto_2

    .line 294
    :cond_9
    return-object v1

    .line 295
    :cond_a
    :goto_3
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    return-object p1
.end method

.method public bridge synthetic e(Lye/e;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lxe/u;->y(Lye/e;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/util/Collection;

    .line 6
    .line 7
    return-object p1
.end method

.method public y(Lye/e;)Ljava/util/Set;
    .locals 1

    .line 1
    const-string v0, "classDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lxe/u;->D()Lxe/k$b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lxe/k$b;->b()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-static {}, LUd/a0;->d()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_0
    invoke-direct {p0, p1}, Lxe/u;->z(Lye/e;)LLe/n;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, LLe/n;->U0()LLe/z;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1}, LLe/U;->b()Ljava/util/Set;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    return-object p1

    .line 41
    :cond_2
    :goto_0
    invoke-static {}, LUd/a0;->d()Ljava/util/Set;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1
.end method
