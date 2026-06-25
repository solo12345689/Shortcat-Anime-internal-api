.class public final Ldf/q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lqf/v0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/q$a;
    }
.end annotation


# static fields
.field public static final f:Ldf/q$a;


# instance fields
.field private final a:J

.field private final b:Lye/H;

.field private final c:Ljava/util/Set;

.field private final d:Lqf/d0;

.field private final e:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldf/q$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldf/q$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldf/q;->f:Ldf/q$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(JLye/H;Ljava/util/Set;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lqf/r0;->b:Lqf/r0$a;

    invoke-virtual {v0}, Lqf/r0$a;->k()Lqf/r0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lqf/V;->f(Lqf/r0;Ldf/q;Z)Lqf/d0;

    move-result-object v0

    iput-object v0, p0, Ldf/q;->d:Lqf/d0;

    .line 4
    new-instance v0, Ldf/o;

    invoke-direct {v0, p0}, Ldf/o;-><init>(Ldf/q;)V

    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Ldf/q;->e:Lkotlin/Lazy;

    .line 5
    iput-wide p1, p0, Ldf/q;->a:J

    .line 6
    iput-object p3, p0, Ldf/q;->b:Lye/H;

    .line 7
    iput-object p4, p0, Ldf/q;->c:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(JLye/H;Ljava/util/Set;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Ldf/q;-><init>(JLye/H;Ljava/util/Set;)V

    return-void
.end method

.method public static final synthetic b(Ldf/q;)Lye/H;
    .locals 0

    .line 1
    iget-object p0, p0, Ldf/q;->b:Lye/H;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(Ldf/q;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Ldf/q;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method static synthetic d(Ldf/q;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Ldf/q;->i(Ldf/q;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic e(Lqf/S;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Ldf/q;->l(Lqf/S;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final g()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ldf/q;->e:Lkotlin/Lazy;

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

.method private final h()Z
    .locals 4

    .line 1
    iget-object v0, p0, Ldf/q;->b:Lye/H;

    .line 2
    .line 3
    invoke-static {v0}, Ldf/v;->a(Lye/H;)Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Iterable;

    .line 8
    .line 9
    instance-of v1, v0, Ljava/util/Collection;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    move-object v1, v0

    .line 15
    check-cast v1, Ljava/util/Collection;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    return v2

    .line 24
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lqf/S;

    .line 39
    .line 40
    iget-object v3, p0, Ldf/q;->c:Ljava/util/Set;

    .line 41
    .line 42
    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    return v0

    .line 50
    :cond_2
    return v2
.end method

.method private static final i(Ldf/q;)Ljava/util/List;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldf/q;->n()Lve/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lve/i;->y()Lye/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lye/e;->p()Lqf/d0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "getDefaultType(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Lqf/D0;

    .line 19
    .line 20
    sget-object v2, Lqf/N0;->f:Lqf/N0;

    .line 21
    .line 22
    iget-object v3, p0, Ldf/q;->d:Lqf/d0;

    .line 23
    .line 24
    invoke-direct {v1, v2, v3}, Lqf/D0;-><init>(Lqf/N0;Lqf/S;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x2

    .line 33
    invoke-static {v0, v1, v2, v3, v2}, Lqf/F0;->f(Lqf/d0;Ljava/util/List;Lqf/r0;ILjava/lang/Object;)Lqf/d0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    filled-new-array {v0}, [Lqf/d0;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, LUd/u;->s([Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-direct {p0}, Ldf/q;->h()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_0

    .line 50
    .line 51
    invoke-virtual {p0}, Ldf/q;->n()Lve/i;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Lve/i;->M()Lqf/d0;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-interface {v0, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    :cond_0
    return-object v0
.end method

.method private final j()Ljava/lang/String;
    .locals 11

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x5b

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Ldf/q;->c:Ljava/util/Set;

    .line 12
    .line 13
    move-object v2, v1

    .line 14
    check-cast v2, Ljava/lang/Iterable;

    .line 15
    .line 16
    sget-object v8, Ldf/p;->a:Ldf/p;

    .line 17
    .line 18
    const/16 v9, 0x1e

    .line 19
    .line 20
    const/4 v10, 0x0

    .line 21
    const-string v3, ","

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v7, 0x0

    .line 27
    invoke-static/range {v2 .. v10}, LUd/u;->w0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const/16 v1, 0x5d

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0
.end method

.method private static final l(Lqf/S;)Ljava/lang/CharSequence;
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


# virtual methods
.method public final f()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Ldf/q;->c:Ljava/util/Set;

    .line 2
    .line 3
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

.method public k()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-direct {p0}, Ldf/q;->g()Ljava/util/List;

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
    iget-object v0, p0, Ldf/q;->b:Lye/H;

    .line 2
    .line 3
    invoke-interface {v0}, Lye/H;->n()Lve/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
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
    return-object p0
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
    const-string v1, "IntegerLiteralType"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ldf/q;->j()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
