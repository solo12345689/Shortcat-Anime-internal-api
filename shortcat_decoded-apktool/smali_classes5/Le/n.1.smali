.class public final LLe/n;
.super LBe/j;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJe/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLe/n$a;,
        LLe/n$b;
    }
.end annotation


# static fields
.field public static final y:LLe/n$a;

.field private static final z:Ljava/util/Set;


# instance fields
.field private final i:LKe/k;

.field private final j:LOe/g;

.field private final k:Lye/e;

.field private final l:LKe/k;

.field private final m:Lkotlin/Lazy;

.field private final n:Lye/f;

.field private final o:Lye/E;

.field private final p:Lye/x0;

.field private final q:Z

.field private final r:LLe/n$b;

.field private final s:LLe/z;

.field private final t:Lye/f0;

.field private final u:Ljf/g;

.field private final v:LLe/a0;

.field private final w:Lze/h;

.field private final x:Lpf/i;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, LLe/n$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LLe/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LLe/n;->y:LLe/n$a;

    .line 8
    .line 9
    const-string v7, "notifyAll"

    .line 10
    .line 11
    const-string v8, "toString"

    .line 12
    .line 13
    const-string v2, "equals"

    .line 14
    .line 15
    const-string v3, "hashCode"

    .line 16
    .line 17
    const-string v4, "getClass"

    .line 18
    .line 19
    const-string v5, "wait"

    .line 20
    .line 21
    const-string v6, "notify"

    .line 22
    .line 23
    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, LUd/a0;->h([Ljava/lang/Object;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, LLe/n;->z:Ljava/util/Set;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(LKe/k;Lye/m;LOe/g;Lye/e;)V
    .locals 9

    const-string v0, "outerContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jClass"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    move-result-object v1

    invoke-interface {p3}, LOe/t;->getName()LXe/f;

    move-result-object v3

    .line 3
    invoke-virtual {p1}, LKe/k;->a()LKe/d;

    move-result-object v0

    invoke-virtual {v0}, LKe/d;->t()LNe/b;

    move-result-object v0

    invoke-interface {v0, p3}, LNe/b;->a(LOe/l;)LNe/a;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p2

    .line 4
    invoke-direct/range {v0 .. v5}, LBe/j;-><init>(Lpf/n;Lye/m;LXe/f;Lye/h0;Z)V

    .line 5
    iput-object p1, p0, LLe/n;->i:LKe/k;

    .line 6
    iput-object p3, p0, LLe/n;->j:LOe/g;

    .line 7
    iput-object p4, p0, LLe/n;->k:Lye/e;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v0, p1

    move-object v2, p3

    .line 8
    invoke-static/range {v0 .. v5}, LKe/c;->f(LKe/k;Lye/g;LOe/z;IILjava/lang/Object;)LKe/k;

    move-result-object v0

    iput-object v0, p0, LLe/n;->l:LKe/k;

    .line 9
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    move-result-object v3

    invoke-virtual {v3}, LKe/d;->h()LIe/j;

    move-result-object v3

    invoke-interface {v3, p3, p0}, LIe/j;->d(LOe/g;Lye/e;)V

    .line 10
    invoke-interface {p3}, LOe/g;->K()LOe/D;

    .line 11
    new-instance v3, LLe/k;

    invoke-direct {v3, p0}, LLe/k;-><init>(LLe/n;)V

    invoke-static {v3}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    move-result-object v3

    iput-object v3, p0, LLe/n;->m:Lkotlin/Lazy;

    .line 12
    invoke-interface {p3}, LOe/g;->o()Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Lye/f;->f:Lye/f;

    goto :goto_0

    .line 13
    :cond_0
    invoke-interface {p3}, LOe/g;->J()Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v3, Lye/f;->c:Lye/f;

    goto :goto_0

    .line 14
    :cond_1
    invoke-interface {p3}, LOe/g;->v()Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, Lye/f;->d:Lye/f;

    goto :goto_0

    .line 15
    :cond_2
    sget-object v3, Lye/f;->b:Lye/f;

    .line 16
    :goto_0
    iput-object v3, p0, LLe/n;->n:Lye/f;

    .line 17
    invoke-interface {p3}, LOe/g;->o()Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_6

    invoke-interface {p3}, LOe/g;->v()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_3

    .line 18
    :cond_3
    sget-object v3, Lye/E;->a:Lye/E$a;

    .line 19
    invoke-interface {p3}, LOe/g;->y()Z

    move-result v6

    .line 20
    invoke-interface {p3}, LOe/g;->y()Z

    move-result v7

    if-nez v7, :cond_5

    invoke-interface {p3}, LOe/s;->isAbstract()Z

    move-result v7

    if-nez v7, :cond_5

    invoke-interface {p3}, LOe/g;->J()Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_1

    :cond_4
    move v7, v4

    goto :goto_2

    :cond_5
    :goto_1
    move v7, v5

    .line 21
    :goto_2
    invoke-interface {p3}, LOe/s;->isFinal()Z

    move-result v8

    xor-int/2addr v8, v5

    .line 22
    invoke-virtual {v3, v6, v7, v8}, Lye/E$a;->a(ZZZ)Lye/E;

    move-result-object v3

    goto :goto_4

    .line 23
    :cond_6
    :goto_3
    sget-object v3, Lye/E;->b:Lye/E;

    :goto_4
    iput-object v3, p0, LLe/n;->o:Lye/E;

    .line 24
    invoke-interface {p3}, LOe/s;->getVisibility()Lye/x0;

    move-result-object v3

    iput-object v3, p0, LLe/n;->p:Lye/x0;

    .line 25
    invoke-interface {p3}, LOe/g;->l()LOe/g;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-interface {p3}, LOe/s;->P()Z

    move-result v3

    if-nez v3, :cond_7

    move v3, v5

    goto :goto_5

    :cond_7
    move v3, v4

    :goto_5
    iput-boolean v3, p0, LLe/n;->q:Z

    .line 26
    new-instance v3, LLe/n$b;

    invoke-direct {v3, p0}, LLe/n$b;-><init>(LLe/n;)V

    iput-object v3, p0, LLe/n;->r:LLe/n$b;

    move-object v1, v0

    .line 27
    new-instance v0, LLe/z;

    if-eqz p4, :cond_8

    move v4, v5

    :cond_8
    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v3, p3

    invoke-direct/range {v0 .. v7}, LLe/z;-><init>(LKe/k;Lye/e;LOe/g;ZLLe/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v0

    iput-object v3, p0, LLe/n;->s:LLe/z;

    .line 28
    sget-object v4, Lye/f0;->e:Lye/f0$a;

    invoke-virtual {v1}, LKe/k;->e()Lpf/n;

    move-result-object v5

    invoke-virtual {v1}, LKe/k;->a()LKe/d;

    move-result-object v6

    invoke-virtual {v6}, LKe/d;->k()Lrf/p;

    move-result-object v6

    invoke-interface {v6}, Lrf/p;->d()Lrf/g;

    move-result-object v6

    new-instance v7, LLe/l;

    invoke-direct {v7, p0}, LLe/l;-><init>(LLe/n;)V

    invoke-virtual {v4, p0, v5, v6, v7}, Lye/f0$a;->a(Lye/e;Lpf/n;Lrf/g;Lkotlin/jvm/functions/Function1;)Lye/f0;

    move-result-object v4

    iput-object v4, p0, LLe/n;->t:Lye/f0;

    .line 29
    new-instance v4, Ljf/g;

    invoke-direct {v4, v3}, Ljf/g;-><init>(Ljf/k;)V

    iput-object v4, p0, LLe/n;->u:Ljf/g;

    .line 30
    new-instance v3, LLe/a0;

    invoke-direct {v3, v1, p3, p0}, LLe/a0;-><init>(LKe/k;LOe/g;LJe/c;)V

    iput-object v3, p0, LLe/n;->v:LLe/a0;

    .line 31
    invoke-static {v1, p3}, LKe/h;->a(LKe/k;LOe/d;)Lze/h;

    move-result-object v2

    iput-object v2, p0, LLe/n;->w:Lze/h;

    .line 32
    invoke-virtual {v1}, LKe/k;->e()Lpf/n;

    move-result-object v1

    new-instance v2, LLe/m;

    invoke-direct {v2, p0}, LLe/m;-><init>(LLe/n;)V

    invoke-interface {v1, v2}, Lpf/n;->c(Lie/a;)Lpf/i;

    move-result-object v1

    iput-object v1, p0, LLe/n;->x:Lpf/i;

    return-void
.end method

.method public synthetic constructor <init>(LKe/k;Lye/m;LOe/g;Lye/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, LLe/n;-><init>(LKe/k;Lye/m;LOe/g;Lye/e;)V

    return-void
.end method

.method public static final synthetic K0(LLe/n;)Lye/e;
    .locals 0

    .line 1
    iget-object p0, p0, LLe/n;->k:Lye/e;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic L0(LLe/n;)LKe/k;
    .locals 0

    .line 1
    iget-object p0, p0, LLe/n;->l:LKe/k;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic M0(LLe/n;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, LLe/n;->W0(LLe/n;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic N0(LLe/n;Lrf/g;)LLe/z;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LLe/n;->X0(LLe/n;Lrf/g;)LLe/z;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic O0(LLe/n;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, LLe/n;->Q0(LLe/n;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final Q0(LLe/n;)Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, LLe/n;->j:LOe/g;

    .line 2
    .line 3
    invoke-interface {v0}, LOe/z;->getTypeParameters()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/16 v2, 0xa

    .line 10
    .line 11
    invoke-static {v0, v2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, LOe/y;

    .line 33
    .line 34
    iget-object v3, p0, LLe/n;->l:LKe/k;

    .line 35
    .line 36
    invoke-virtual {v3}, LKe/k;->f()LKe/p;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-interface {v3, v2}, LKe/p;->a(LOe/y;)Lye/m0;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 51
    .line 52
    new-instance v1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v3, "Parameter "

    .line 58
    .line 59
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v2, " surely belongs to class "

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-object p0, p0, LLe/n;->j:LOe/g;

    .line 71
    .line 72
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string p0, ", so it must be resolved"

    .line 76
    .line 77
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    throw v0

    .line 88
    :cond_1
    return-object v1
.end method

.method private static final W0(LLe/n;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {p0}, Lff/e;->n(Lye/h;)LXe/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, LLe/n;->i:LKe/k;

    .line 8
    .line 9
    invoke-virtual {p0}, LKe/k;->a()LKe/d;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, LKe/d;->f()LHe/A;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0, v0}, LHe/A;->a(LXe/b;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method private static final X0(LLe/n;Lrf/g;)LLe/z;
    .locals 7

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, LLe/z;

    .line 7
    .line 8
    iget-object v2, p0, LLe/n;->l:LKe/k;

    .line 9
    .line 10
    iget-object v4, p0, LLe/n;->j:LOe/g;

    .line 11
    .line 12
    iget-object p1, p0, LLe/n;->k:Lye/e;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    :goto_0
    move v5, p1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    goto :goto_0

    .line 21
    :goto_1
    iget-object v6, p0, LLe/n;->s:LLe/z;

    .line 22
    .line 23
    move-object v3, p0

    .line 24
    invoke-direct/range {v1 .. v6}, LLe/z;-><init>(LKe/k;Lye/e;LOe/g;ZLLe/z;)V

    .line 25
    .line 26
    .line 27
    return-object v1
.end method


# virtual methods
.method public A()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LLe/n;->q:Z

    .line 2
    .line 3
    return v0
.end method

.method public D()Lye/d;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public I0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final P0(LIe/j;Lye/e;)LLe/n;
    .locals 3

    .line 1
    const-string v0, "javaResolverCache"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LLe/n;

    .line 7
    .line 8
    iget-object v1, p0, LLe/n;->l:LKe/k;

    .line 9
    .line 10
    invoke-virtual {v1}, LKe/k;->a()LKe/d;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2, p1}, LKe/d;->x(LIe/j;)LKe/d;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {v1, p1}, LKe/c;->m(LKe/k;LKe/d;)LKe/k;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0}, LBe/j;->b()Lye/m;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "getContainingDeclaration(...)"

    .line 27
    .line 28
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, LLe/n;->j:LOe/g;

    .line 32
    .line 33
    invoke-direct {v0, p1, v1, v2, p2}, LLe/n;-><init>(LKe/k;Lye/m;LOe/g;Lye/e;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public R0()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/n;->s:LLe/z;

    .line 2
    .line 3
    invoke-virtual {v0}, LLe/z;->a1()Lpf/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/util/List;

    .line 12
    .line 13
    return-object v0
.end method

.method public final S0()LOe/g;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/n;->j:LOe/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final T0()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/n;->m:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    return-object v0
.end method

.method public U()Ljf/k;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/n;->u:Ljf/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public U0()LLe/z;
    .locals 2

    .line 1
    invoke-super {p0}, LBe/a;->X()Ljf/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, LLe/z;

    .line 11
    .line 12
    return-object v0
.end method

.method public V()Lye/r0;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method protected V0(Lrf/g;)LLe/z;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LLe/n;->t:Lye/f0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lye/f0;->c(Lrf/g;)Ljf/k;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, LLe/z;

    .line 13
    .line 14
    return-object p1
.end method

.method public bridge synthetic X()Ljf/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, LLe/n;->U0()LLe/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public Y()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public c0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public g0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public getAnnotations()Lze/h;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/n;->w:Lze/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVisibility()Lye/u;
    .locals 2

    .line 1
    iget-object v0, p0, LLe/n;->p:Lye/x0;

    .line 2
    .line 3
    sget-object v1, Lye/t;->a:Lye/u;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LLe/n;->j:LOe/g;

    .line 12
    .line 13
    invoke-interface {v0}, LOe/g;->l()LOe/g;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    sget-object v0, LHe/y;->a:Lye/u;

    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    iget-object v0, p0, LLe/n;->p:Lye/x0;

    .line 26
    .line 27
    invoke-static {v0}, LHe/V;->d(Lye/x0;)Lye/u;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method

.method public h()Lye/f;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/n;->n:Lye/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic i()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p0}, LLe/n;->R0()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public isInline()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public bridge synthetic j0(Lrf/g;)Ljf/k;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LLe/n;->V0(Lrf/g;)LLe/z;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public l()Lqf/v0;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/n;->r:LLe/n$b;

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

.method public o0()Ljf/k;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/n;->v:LLe/a0;

    .line 2
    .line 3
    return-object v0
.end method

.method public p0()Lye/e;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public q()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/n;->x:Lpf/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    return-object v0
.end method

.method public r()Lye/E;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/n;->o:Lye/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public s()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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
    const-string v1, "Lazy Java class "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lff/e;->p(Lye/m;)LXe/d;

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

.method public z()Ljava/util/Collection;
    .locals 8

    .line 1
    iget-object v0, p0, LLe/n;->o:Lye/E;

    .line 2
    .line 3
    sget-object v1, Lye/E;->c:Lye/E;

    .line 4
    .line 5
    if-ne v0, v1, :cond_3

    .line 6
    .line 7
    sget-object v2, Lqf/I0;->b:Lqf/I0;

    .line 8
    .line 9
    const/4 v6, 0x7

    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    invoke-static/range {v2 .. v7}, LMe/b;->b(Lqf/I0;ZZLye/m0;ILjava/lang/Object;)LMe/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, LLe/n;->j:LOe/g;

    .line 19
    .line 20
    invoke-interface {v1}, LOe/g;->C()LCf/i;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {v1}, LCf/i;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, LOe/j;

    .line 44
    .line 45
    iget-object v4, p0, LLe/n;->l:LKe/k;

    .line 46
    .line 47
    invoke-virtual {v4}, LKe/k;->g()LMe/e;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v4, v3, v0}, LMe/e;->p(LOe/x;LMe/a;)Lqf/S;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, Lqf/S;->N0()Lqf/v0;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-interface {v3}, Lqf/v0;->p()Lye/h;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    instance-of v4, v3, Lye/e;

    .line 64
    .line 65
    if-eqz v4, :cond_1

    .line 66
    .line 67
    check-cast v3, Lye/e;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    const/4 v3, 0x0

    .line 71
    :goto_1
    if-eqz v3, :cond_0

    .line 72
    .line 73
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    new-instance v0, LLe/n$c;

    .line 78
    .line 79
    invoke-direct {v0}, LLe/n$c;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-static {v2, v0}, LUd/u;->R0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    :cond_3
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    return-object v0
.end method
