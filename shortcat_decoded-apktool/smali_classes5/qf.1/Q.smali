.class public final Lqf/Q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lqf/v0;
.implements Luf/h;


# instance fields
.field private a:Lqf/S;

.field private final b:Ljava/util/LinkedHashSet;

.field private final c:I


# direct methods
.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1

    const-string v0, "typesToIntersect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 3
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqf/Q;->b:Ljava/util/LinkedHashSet;

    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result p1

    iput p1, p0, Lqf/Q;->c:I

    return-void
.end method

.method private constructor <init>(Ljava/util/Collection;Lqf/S;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lqf/Q;-><init>(Ljava/util/Collection;)V

    .line 6
    iput-object p2, p0, Lqf/Q;->a:Lqf/S;

    return-void
.end method

.method static synthetic b(Lkotlin/jvm/functions/Function1;Lqf/S;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lqf/Q;->m(Lkotlin/jvm/functions/Function1;Lqf/S;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic c(Lqf/S;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lqf/Q;->l(Lqf/S;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic d(Lqf/Q;Lrf/g;)Lqf/d0;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lqf/Q;->g(Lqf/Q;Lrf/g;)Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final g(Lqf/Q;Lrf/g;)Lqf/d0;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lqf/Q;->r(Lrf/g;)Lqf/Q;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lqf/Q;->f()Lqf/d0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static synthetic j(Lqf/Q;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    sget-object p1, Lqf/O;->a:Lqf/O;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1}, Lqf/Q;->i(Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private static final l(Lqf/S;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;Lqf/S;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method


# virtual methods
.method public final e()Ljf/k;
    .locals 3

    .line 1
    sget-object v0, Ljf/x;->d:Ljf/x$a;

    .line 2
    .line 3
    const-string v1, "member scope for intersection type"

    .line 4
    .line 5
    iget-object v2, p0, Lqf/Q;->b:Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Ljf/x$a;->a(Ljava/lang/String;Ljava/util/Collection;)Ljf/k;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lqf/Q;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    iget-object v0, p0, Lqf/Q;->b:Ljava/util/LinkedHashSet;

    .line 12
    .line 13
    check-cast p1, Lqf/Q;

    .line 14
    .line 15
    iget-object p1, p1, Lqf/Q;->b:Ljava/util/LinkedHashSet;

    .line 16
    .line 17
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final f()Lqf/d0;
    .locals 7

    .line 1
    sget-object v0, Lqf/r0;->b:Lqf/r0$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqf/r0$a;->k()Lqf/r0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {p0}, Lqf/Q;->e()Ljf/k;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    new-instance v6, Lqf/P;

    .line 16
    .line 17
    invoke-direct {v6, p0}, Lqf/P;-><init>(Lqf/Q;)V

    .line 18
    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    move-object v2, p0

    .line 22
    invoke-static/range {v1 .. v6}, Lqf/V;->n(Lqf/r0;Lqf/v0;Ljava/util/List;ZLjf/k;Lkotlin/jvm/functions/Function1;)Lqf/d0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method

.method public getParameters()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final h()Lqf/S;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/Q;->a:Lqf/S;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lqf/Q;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final i(Lkotlin/jvm/functions/Function1;)Ljava/lang/String;
    .locals 11

    .line 1
    const-string v0, "getProperTypeRelatedToStringify"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqf/Q;->b:Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    new-instance v1, Lqf/Q$a;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Lqf/Q$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, LUd/u;->R0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v8, Lqf/N;

    .line 18
    .line 19
    invoke-direct {v8, p1}, Lqf/N;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 20
    .line 21
    .line 22
    const/16 v9, 0x18

    .line 23
    .line 24
    const/4 v10, 0x0

    .line 25
    const-string v3, " & "

    .line 26
    .line 27
    const-string v4, "{"

    .line 28
    .line 29
    const-string v5, "}"

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x0

    .line 33
    invoke-static/range {v2 .. v10}, LUd/u;->w0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
.end method

.method public k()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/Q;->b:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    return-object v0
.end method

.method public n()Lve/i;
    .locals 2

    .line 1
    iget-object v0, p0, Lqf/Q;->b:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lqf/S;

    .line 12
    .line 13
    invoke-virtual {v0}, Lqf/S;->N0()Lqf/v0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Lqf/v0;->n()Lve/i;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "getBuiltIns(...)"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public bridge synthetic o(Lrf/g;)Lqf/v0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lqf/Q;->r(Lrf/g;)Lqf/Q;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public p()Lye/h;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public q()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public r(Lrf/g;)Lqf/Q;
    .locals 4

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lqf/Q;->k()Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Iterable;

    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    const/16 v2, 0xa

    .line 15
    .line 16
    invoke-static {v0, v2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v2, 0x0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Lqf/S;

    .line 39
    .line 40
    invoke-virtual {v2, p1}, Lqf/S;->P0(Lrf/g;)Lqf/S;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 v0, 0x0

    .line 50
    if-nez v2, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-virtual {p0}, Lqf/Q;->h()Lqf/S;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    invoke-virtual {v2, p1}, Lqf/S;->P0(Lrf/g;)Lqf/S;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :cond_2
    new-instance p1, Lqf/Q;

    .line 64
    .line 65
    invoke-direct {p1, v1}, Lqf/Q;-><init>(Ljava/util/Collection;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v0}, Lqf/Q;->s(Lqf/S;)Lqf/Q;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    :goto_1
    if-nez v0, :cond_3

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_3
    return-object v0
.end method

.method public final s(Lqf/S;)Lqf/Q;
    .locals 2

    .line 1
    new-instance v0, Lqf/Q;

    .line 2
    .line 3
    iget-object v1, p0, Lqf/Q;->b:Ljava/util/LinkedHashSet;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lqf/Q;-><init>(Ljava/util/Collection;Lqf/S;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, v0, v1, v0}, Lqf/Q;->j(Lqf/Q;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
