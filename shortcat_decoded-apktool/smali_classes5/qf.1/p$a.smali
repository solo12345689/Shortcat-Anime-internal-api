.class final Lqf/p$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lqf/v0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqf/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Lrf/g;

.field private final b:Lkotlin/Lazy;

.field final synthetic c:Lqf/p;


# direct methods
.method public constructor <init>(Lqf/p;Lrf/g;)V
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lqf/p$a;->c:Lqf/p;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lqf/p$a;->a:Lrf/g;

    .line 12
    .line 13
    sget-object p2, LTd/q;->b:LTd/q;

    .line 14
    .line 15
    new-instance v0, Lqf/o;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1}, Lqf/o;-><init>(Lqf/p$a;Lqf/p;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p2, v0}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lqf/p$a;->b:Lkotlin/Lazy;

    .line 25
    .line 26
    return-void
.end method

.method static synthetic b(Lqf/p$a;Lqf/p;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lqf/p$a;->e(Lqf/p$a;Lqf/p;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final c()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/p$a;->b:Lkotlin/Lazy;

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

.method private static final e(Lqf/p$a;Lqf/p;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lqf/p$a;->a:Lrf/g;

    .line 2
    .line 3
    invoke-virtual {p1}, Lqf/p;->w()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p0, p1}, Lrf/h;->b(Lrf/g;Ljava/lang/Iterable;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method


# virtual methods
.method public d()Ljava/util/List;
    .locals 1

    .line 1
    invoke-direct {p0}, Lqf/p$a;->c()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/p$a;->c:Lqf/p;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lqf/v;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getParameters()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lqf/p$a;->c:Lqf/p;

    .line 2
    .line 3
    invoke-interface {v0}, Lqf/v0;->getParameters()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getParameters(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/p$a;->c:Lqf/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqf/v;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public bridge synthetic k()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqf/p$a;->d()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public n()Lve/i;
    .locals 2

    .line 1
    iget-object v0, p0, Lqf/p$a;->c:Lqf/p;

    .line 2
    .line 3
    invoke-interface {v0}, Lqf/v0;->n()Lve/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getBuiltIns(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public o(Lrf/g;)Lqf/v0;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqf/p$a;->c:Lqf/p;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lqf/p;->o(Lrf/g;)Lqf/v0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public p()Lye/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/p$a;->c:Lqf/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqf/v;->p()Lye/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/p$a;->c:Lqf/p;

    .line 2
    .line 3
    invoke-interface {v0}, Lqf/v0;->q()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/p$a;->c:Lqf/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
