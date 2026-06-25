.class public abstract LBe/g;
.super LBe/n;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lye/l0;


# static fields
.field static final synthetic j:[Lpe/m;


# instance fields
.field private final e:Lpf/n;

.field private final f:Lye/u;

.field private final g:Lpf/i;

.field private h:Ljava/util/List;

.field private final i:LBe/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lkotlin/jvm/internal/F;

    .line 2
    .line 3
    const-class v1, LBe/g;

    .line 4
    .line 5
    const-string v2, "constructors"

    .line 6
    .line 7
    const-string v3, "getConstructors()Ljava/util/Collection;"

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
    sput-object v1, LBe/g;->j:[Lpe/m;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Lpf/n;Lye/m;Lze/h;LXe/f;Lye/h0;Lye/u;)V
    .locals 1

    .line 1
    const-string v0, "storageManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "containingDeclaration"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "annotations"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "name"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "sourceElement"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "visibilityImpl"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, p2, p3, p4, p5}, LBe/n;-><init>(Lye/m;Lze/h;LXe/f;Lye/h0;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, LBe/g;->e:Lpf/n;

    .line 35
    .line 36
    iput-object p6, p0, LBe/g;->f:Lye/u;

    .line 37
    .line 38
    new-instance p2, LBe/d;

    .line 39
    .line 40
    invoke-direct {p2, p0}, LBe/d;-><init>(LBe/g;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, p2}, Lpf/n;->c(Lie/a;)Lpf/i;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, LBe/g;->g:Lpf/i;

    .line 48
    .line 49
    new-instance p1, LBe/g$a;

    .line 50
    .line 51
    invoke-direct {p1, p0}, LBe/g$a;-><init>(LBe/g;)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, LBe/g;->i:LBe/g$a;

    .line 55
    .line 56
    return-void
.end method

.method static synthetic H0(LBe/g;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0}, LBe/g;->O0(LBe/g;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic K0(LBe/g;Lqf/M0;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LBe/g;->T0(LBe/g;Lqf/M0;)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic L0(LBe/g;Lrf/g;)Lqf/d0;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LBe/g;->N0(LBe/g;Lrf/g;)Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final N0(LBe/g;Lrf/g;)Lqf/d0;
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Lrf/g;->f(Lye/m;)Lye/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, Lye/h;->p()Lqf/d0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method private static final O0(LBe/g;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p0}, LBe/g;->Q0()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final T0(LBe/g;Lqf/M0;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lqf/W;->a(Lqf/S;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Lqf/S;->N0()Lqf/v0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Lqf/v0;->p()Lye/h;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    instance-of v0, p1, Lye/m0;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    check-cast p1, Lye/m0;

    .line 23
    .line 24
    invoke-interface {p1}, Lye/n;->b()Lye/m;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_0

    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method


# virtual methods
.method public A()Z
    .locals 2

    .line 1
    invoke-interface {p0}, Lye/l0;->u0()Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LBe/e;

    .line 6
    .line 7
    invoke-direct {v1, p0}, LBe/e;-><init>(LBe/g;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lqf/J0;->c(Lqf/S;Lkotlin/jvm/functions/Function1;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method

.method public bridge synthetic F0()Lye/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LBe/g;->P0()Lye/l0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected final M()Lpf/n;
    .locals 1

    .line 1
    iget-object v0, p0, LBe/g;->e:Lpf/n;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final M0()Lqf/d0;
    .locals 2

    .line 1
    invoke-interface {p0}, Lye/l0;->u()Lye/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Lye/e;->X()Ljf/k;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    :cond_0
    sget-object v0, Ljf/k$b;->b:Ljf/k$b;

    .line 14
    .line 15
    :cond_1
    new-instance v1, LBe/f;

    .line 16
    .line 17
    invoke-direct {v1, p0}, LBe/f;-><init>(LBe/g;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v0, v1}, Lqf/J0;->v(Lye/h;Ljf/k;Lkotlin/jvm/functions/Function1;)Lqf/d0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "makeUnsubstitutedType(...)"

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public P0()Lye/l0;
    .locals 2

    .line 1
    invoke-super {p0}, LBe/n;->F0()Lye/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, Lye/l0;

    .line 11
    .line 12
    return-object v0
.end method

.method public final Q0()Ljava/util/Collection;
    .locals 5

    .line 1
    invoke-interface {p0}, Lye/l0;->u()Lye/e;

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
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-interface {v0}, Lye/e;->i()Ljava/util/Collection;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "getConstructors(...)"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    check-cast v0, Ljava/lang/Iterable;

    .line 22
    .line 23
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Lye/d;

    .line 43
    .line 44
    sget-object v3, LBe/T;->I:LBe/T$a;

    .line 45
    .line 46
    iget-object v4, p0, LBe/g;->e:Lpf/n;

    .line 47
    .line 48
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v4, p0, v2}, LBe/T$a;->b(Lpf/n;Lye/l0;Lye/d;)LBe/Q;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    return-object v1
.end method

.method protected abstract R0()Ljava/util/List;
.end method

.method public final S0(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "declaredTypeParameters"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LBe/g;->h:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public Y()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public bridge synthetic a()Lye/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, LBe/g;->P0()Lye/l0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lye/m;
    .locals 1

    .line 2
    invoke-virtual {p0}, LBe/g;->P0()Lye/l0;

    move-result-object v0

    return-object v0
.end method

.method public b0(Lye/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "visitor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p0, p2}, Lye/o;->e(Lye/l0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public getVisibility()Lye/u;
    .locals 1

    .line 1
    iget-object v0, p0, LBe/g;->f:Lye/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public isExternal()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public l()Lqf/v0;
    .locals 1

    .line 1
    iget-object v0, p0, LBe/g;->i:LBe/g$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public m0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public q()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LBe/g;->h:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "declaredTypeParametersImpl"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    return-object v0
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
    const-string v1, "typealias "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LBe/m;->getName()LXe/f;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, LXe/f;->b()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method
