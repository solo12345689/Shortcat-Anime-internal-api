.class public final Lxe/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LAe/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/g$a;
    }
.end annotation


# static fields
.field public static final d:Lxe/g$a;

.field static final synthetic e:[Lpe/m;

.field private static final f:LXe/c;

.field private static final g:LXe/f;

.field private static final h:LXe/b;


# instance fields
.field private final a:Lye/H;

.field private final b:Lkotlin/jvm/functions/Function1;

.field private final c:Lpf/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lkotlin/jvm/internal/F;

    .line 2
    .line 3
    const-class v1, Lxe/g;

    .line 4
    .line 5
    const-string v2, "cloneable"

    .line 6
    .line 7
    const-string v3, "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"

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
    sput-object v1, Lxe/g;->e:[Lpe/m;

    .line 23
    .line 24
    new-instance v0, Lxe/g$a;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {v0, v1}, Lxe/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lxe/g;->d:Lxe/g$a;

    .line 31
    .line 32
    sget-object v0, Lve/o;->A:LXe/c;

    .line 33
    .line 34
    sput-object v0, Lxe/g;->f:LXe/c;

    .line 35
    .line 36
    sget-object v0, Lve/o$a;->d:LXe/d;

    .line 37
    .line 38
    invoke-virtual {v0}, LXe/d;->j()LXe/f;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    sput-object v1, Lxe/g;->g:LXe/f;

    .line 43
    .line 44
    sget-object v1, LXe/b;->d:LXe/b$a;

    .line 45
    .line 46
    invoke-virtual {v0}, LXe/d;->m()LXe/c;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v1, v0}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, Lxe/g;->h:LXe/b;

    .line 55
    .line 56
    return-void
.end method

.method public constructor <init>(Lpf/n;Lye/H;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleDescriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "computeContainingDeclaration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lxe/g;->a:Lye/H;

    .line 3
    iput-object p3, p0, Lxe/g;->b:Lkotlin/jvm/functions/Function1;

    .line 4
    new-instance p2, Lxe/e;

    invoke-direct {p2, p0, p1}, Lxe/e;-><init>(Lxe/g;Lpf/n;)V

    invoke-interface {p1, p2}, Lpf/n;->c(Lie/a;)Lpf/i;

    move-result-object p1

    iput-object p1, p0, Lxe/g;->c:Lpf/i;

    return-void
.end method

.method public synthetic constructor <init>(Lpf/n;Lye/H;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Lxe/f;->a:Lxe/f;

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lxe/g;-><init>(Lpf/n;Lye/H;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final d(Lye/H;)Lve/c;
    .locals 3

    .line 1
    const-string v0, "module"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lxe/g;->f:LXe/c;

    .line 7
    .line 8
    invoke-interface {p0, v0}, Lye/H;->S(LXe/c;)Lye/V;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Lye/V;->k0()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    instance-of v2, v1, Lve/c;

    .line 36
    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-static {v0}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Lve/c;

    .line 48
    .line 49
    return-object p0
.end method

.method public static final synthetic e()LXe/b;
    .locals 1

    .line 1
    sget-object v0, Lxe/g;->h:LXe/b;

    .line 2
    .line 3
    return-object v0
.end method

.method static synthetic f(Lxe/g;Lpf/n;)LBe/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxe/g;->h(Lxe/g;Lpf/n;)LBe/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic g(Lye/H;)Lve/c;
    .locals 0

    .line 1
    invoke-static {p0}, Lxe/g;->d(Lye/H;)Lve/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final h(Lxe/g;Lpf/n;)LBe/k;
    .locals 9

    .line 1
    new-instance v0, LBe/k;

    .line 2
    .line 3
    iget-object v1, p0, Lxe/g;->b:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iget-object v2, p0, Lxe/g;->a:Lye/H;

    .line 6
    .line 7
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lye/m;

    .line 12
    .line 13
    sget-object v2, Lxe/g;->g:LXe/f;

    .line 14
    .line 15
    sget-object v3, Lye/E;->e:Lye/E;

    .line 16
    .line 17
    sget-object v4, Lye/f;->c:Lye/f;

    .line 18
    .line 19
    iget-object p0, p0, Lxe/g;->a:Lye/H;

    .line 20
    .line 21
    invoke-interface {p0}, Lye/H;->n()Lve/i;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Lve/i;->i()Lqf/d0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    sget-object v6, Lye/h0;->a:Lye/h0;

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    move-object v8, p1

    .line 37
    invoke-direct/range {v0 .. v8}, LBe/k;-><init>(Lye/m;LXe/f;Lye/E;Lye/f;Ljava/util/Collection;Lye/h0;ZLpf/n;)V

    .line 38
    .line 39
    .line 40
    new-instance p0, Lxe/a;

    .line 41
    .line 42
    invoke-direct {p0, v8, v0}, Lxe/a;-><init>(Lpf/n;Lye/e;)V

    .line 43
    .line 44
    .line 45
    invoke-static {}, LUd/a0;->d()Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-virtual {v0, p0, p1, v1}, LBe/k;->K0(Ljf/k;Ljava/util/Set;Lye/d;)V

    .line 51
    .line 52
    .line 53
    return-object v0
.end method

.method private final i()LBe/k;
    .locals 3

    .line 1
    iget-object v0, p0, Lxe/g;->c:Lpf/i;

    .line 2
    .line 3
    sget-object v1, Lxe/g;->e:[Lpe/m;

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
    check-cast v0, LBe/k;

    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public a(LXe/b;)Lye/e;
    .locals 1

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lxe/g;->h:LXe/b;

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-direct {p0}, Lxe/g;->i()LBe/k;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return-object p1
.end method

.method public b(LXe/c;LXe/f;)Z
    .locals 1

    .line 1
    const-string v0, "packageFqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "name"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lxe/g;->g:LXe/f;

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    sget-object p2, Lxe/g;->f:LXe/c;

    .line 20
    .line 21
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    return p1
.end method

.method public c(LXe/c;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "packageFqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lxe/g;->f:LXe/c;

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-direct {p0}, Lxe/g;->i()LBe/k;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, LUd/a0;->c(Ljava/lang/Object;)Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Ljava/util/Collection;

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    invoke-static {}, LUd/a0;->d()Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ljava/util/Collection;

    .line 30
    .line 31
    return-object p1
.end method
