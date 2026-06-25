.class public final Lsf/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lye/H;


# static fields
.field public static final a:Lsf/e;

.field private static final b:LXe/f;

.field private static final c:Ljava/util/List;

.field private static final d:Ljava/util/List;

.field private static final e:Ljava/util/Set;

.field private static final f:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lsf/e;

    .line 2
    .line 3
    invoke-direct {v0}, Lsf/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsf/e;->a:Lsf/e;

    .line 7
    .line 8
    sget-object v0, Lsf/b;->e:Lsf/b;

    .line 9
    .line 10
    invoke-virtual {v0}, Lsf/b;->b()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, LXe/f;->q(Ljava/lang/String;)LXe/f;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "special(...)"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lsf/e;->b:LXe/f;

    .line 24
    .line 25
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lsf/e;->c:Ljava/util/List;

    .line 30
    .line 31
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lsf/e;->d:Ljava/util/List;

    .line 36
    .line 37
    invoke-static {}, LUd/a0;->d()Ljava/util/Set;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lsf/e;->e:Ljava/util/Set;

    .line 42
    .line 43
    sget-object v0, Lsf/d;->a:Lsf/d;

    .line 44
    .line 45
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Lsf/e;->f:Lkotlin/Lazy;

    .line 50
    .line 51
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

.method static synthetic T()Lve/g;
    .locals 1

    .line 1
    invoke-static {}, Lsf/e;->j0()Lve/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final j0()Lve/g;
    .locals 1

    .line 1
    sget-object v0, Lve/g;->h:Lve/g$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lve/g$a;->a()Lve/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public A0()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lsf/e;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public F0()LXe/f;
    .locals 1

    .line 1
    sget-object v0, Lsf/e;->b:LXe/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public S(LXe/c;)Lye/V;
    .locals 1

    .line 1
    const-string v0, "fqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v0, "Should not be called!"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public a()Lye/m;
    .locals 0

    .line 1
    return-object p0
.end method

.method public a0(Lye/G;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "capability"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1
.end method

.method public b()Lye/m;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public b0(Lye/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    const-string p2, "visitor"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1
.end method

.method public getAnnotations()Lze/h;
    .locals 1

    .line 1
    sget-object v0, Lze/h;->k0:Lze/h$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lze/h$a;->b()Lze/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getName()LXe/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsf/e;->F0()LXe/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public n()Lve/i;
    .locals 1

    .line 1
    sget-object v0, Lsf/e;->f:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lve/i;

    .line 8
    .line 9
    return-object v0
.end method

.method public t(LXe/c;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "fqName"

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
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public x0(Lye/H;)Z
    .locals 1

    .line 1
    const-string v0, "targetModule"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1
.end method
