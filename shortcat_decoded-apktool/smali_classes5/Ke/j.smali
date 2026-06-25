.class public final LKe/j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lye/U;


# instance fields
.field private final a:LKe/k;

.field private final b:Lpf/a;


# direct methods
.method public constructor <init>(LKe/d;)V
    .locals 3

    .line 1
    const-string v0, "components"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, LKe/k;

    .line 10
    .line 11
    sget-object v1, LKe/p$a;->a:LKe/p$a;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v2}, LTd/n;->c(Ljava/lang/Object;)Lkotlin/Lazy;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-direct {v0, p1, v1, v2}, LKe/k;-><init>(LKe/d;LKe/p;Lkotlin/Lazy;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, LKe/j;->a:LKe/k;

    .line 22
    .line 23
    invoke-virtual {v0}, LKe/k;->e()Lpf/n;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, Lpf/n;->a()Lpf/a;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, LKe/j;->b:Lpf/a;

    .line 32
    .line 33
    return-void
.end method

.method static synthetic d(LKe/j;LOe/u;)LLe/D;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LKe/j;->f(LKe/j;LOe/u;)LLe/D;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final e(LXe/c;)LLe/D;
    .locals 4

    .line 1
    iget-object v0, p0, LKe/j;->a:LKe/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LKe/d;->d()LHe/u;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x2

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {v0, p1, v1, v2, v3}, LHe/t;->a(LHe/u;LXe/c;ZILjava/lang/Object;)LOe/u;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    return-object v3

    .line 21
    :cond_0
    iget-object v1, p0, LKe/j;->b:Lpf/a;

    .line 22
    .line 23
    new-instance v2, LKe/i;

    .line 24
    .line 25
    invoke-direct {v2, p0, v0}, LKe/i;-><init>(LKe/j;LOe/u;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v1, p1, v2}, Lpf/a;->a(Ljava/lang/Object;Lie/a;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, LLe/D;

    .line 33
    .line 34
    return-object p1
.end method

.method private static final f(LKe/j;LOe/u;)LLe/D;
    .locals 1

    .line 1
    new-instance v0, LLe/D;

    .line 2
    .line 3
    iget-object p0, p0, LKe/j;->a:LKe/k;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, LLe/D;-><init>(LKe/k;LOe/u;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method


# virtual methods
.method public a(LXe/c;Ljava/util/Collection;)V
    .locals 1

    .line 1
    const-string v0, "fqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "packageFragments"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, LKe/j;->e(LXe/c;)LLe/D;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p2, p1}, LAf/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public b(LXe/c;)Z
    .locals 4

    .line 1
    const-string v0, "fqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LKe/j;->a:LKe/k;

    .line 7
    .line 8
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, LKe/d;->d()LHe/u;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-static {v0, p1, v3, v1, v2}, LHe/t;->a(LHe/u;LXe/c;ZILjava/lang/Object;)LOe/u;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_0
    return v3
.end method

.method public c(LXe/c;)Ljava/util/List;
    .locals 1

    .line 1
    const-string v0, "fqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, LKe/j;->e(LXe/c;)LLe/D;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, LUd/u;->q(Ljava/lang/Object;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public g(LXe/c;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 1

    .line 1
    const-string v0, "fqName"

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
    invoke-direct {p0, p1}, LKe/j;->e(LXe/c;)LLe/D;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, LLe/D;->Q0()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    :goto_0
    if-nez p1, :cond_1

    .line 24
    .line 25
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :cond_1
    return-object p1
.end method

.method public bridge synthetic t(LXe/c;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LKe/j;->g(LXe/c;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
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
    const-string v1, "LazyJavaPackageFragmentProvider of module "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LKe/j;->a:LKe/k;

    .line 12
    .line 13
    invoke-virtual {v1}, LKe/k;->a()LKe/d;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, LKe/d;->m()Lye/H;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method
