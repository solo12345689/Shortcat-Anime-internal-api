.class public final Ldf/q$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/q$a$a;,
        Ldf/q$a$b;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldf/q$a;-><init>()V

    return-void
.end method

.method private final a(Ljava/util/Collection;Ldf/q$a$a;)Lqf/d0;
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lqf/d0;

    .line 36
    .line 37
    check-cast v0, Lqf/d0;

    .line 38
    .line 39
    sget-object v2, Ldf/q;->f:Ldf/q$a;

    .line 40
    .line 41
    invoke-direct {v2, v0, v1, p2}, Ldf/q$a;->e(Lqf/d0;Lqf/d0;Ldf/q$a$a;)Lqf/d0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    check-cast v0, Lqf/d0;

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 50
    .line 51
    const-string p2, "Empty collection can\'t be reduced."

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1
.end method

.method private final c(Ldf/q;Ldf/q;Ldf/q$a$a;)Lqf/d0;
    .locals 6

    .line 1
    sget-object v0, Ldf/q$a$b;->a:[I

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    aget p3, v0, p3

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p3, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    if-ne p3, v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Ldf/q;->f()Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    check-cast p3, Ljava/lang/Iterable;

    .line 20
    .line 21
    invoke-virtual {p2}, Ldf/q;->f()Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    check-cast p2, Ljava/lang/Iterable;

    .line 26
    .line 27
    invoke-static {p3, p2}, LUd/u;->g1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    :goto_0
    move-object v4, p2

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    new-instance p1, LTd/r;

    .line 34
    .line 35
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_1
    invoke-virtual {p1}, Ldf/q;->f()Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    check-cast p3, Ljava/lang/Iterable;

    .line 44
    .line 45
    invoke-virtual {p2}, Ldf/q;->f()Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    check-cast p2, Ljava/lang/Iterable;

    .line 50
    .line 51
    invoke-static {p3, p2}, LUd/u;->s0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    goto :goto_0

    .line 56
    :goto_1
    new-instance v0, Ldf/q;

    .line 57
    .line 58
    invoke-static {p1}, Ldf/q;->c(Ldf/q;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v1

    .line 62
    invoke-static {p1}, Ldf/q;->b(Ldf/q;)Lye/H;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    const/4 v5, 0x0

    .line 67
    invoke-direct/range {v0 .. v5}, Ldf/q;-><init>(JLye/H;Ljava/util/Set;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 68
    .line 69
    .line 70
    sget-object p1, Lqf/r0;->b:Lqf/r0$a;

    .line 71
    .line 72
    invoke-virtual {p1}, Lqf/r0$a;->k()Lqf/r0;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const/4 p2, 0x0

    .line 77
    invoke-static {p1, v0, p2}, Lqf/V;->f(Lqf/r0;Ldf/q;Z)Lqf/d0;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    return-object p1
.end method

.method private final d(Ldf/q;Lqf/d0;)Lqf/d0;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ldf/q;->f()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    return-object p2

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return-object p1
.end method

.method private final e(Lqf/d0;Lqf/d0;Ldf/q$a$a;)Lqf/d0;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p1}, Lqf/S;->N0()Lqf/v0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p2}, Lqf/S;->N0()Lqf/v0;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    instance-of v3, v1, Ldf/q;

    .line 16
    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    instance-of v4, v2, Ldf/q;

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    check-cast v1, Ldf/q;

    .line 24
    .line 25
    check-cast v2, Ldf/q;

    .line 26
    .line 27
    invoke-direct {p0, v1, v2, p3}, Ldf/q$a;->c(Ldf/q;Ldf/q;Ldf/q$a$a;)Lqf/d0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_1
    if-eqz v3, :cond_2

    .line 33
    .line 34
    check-cast v1, Ldf/q;

    .line 35
    .line 36
    invoke-direct {p0, v1, p2}, Ldf/q$a;->d(Ldf/q;Lqf/d0;)Lqf/d0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1

    .line 41
    :cond_2
    instance-of p2, v2, Ldf/q;

    .line 42
    .line 43
    if-eqz p2, :cond_3

    .line 44
    .line 45
    check-cast v2, Ldf/q;

    .line 46
    .line 47
    invoke-direct {p0, v2, p1}, Ldf/q$a;->d(Ldf/q;Lqf/d0;)Lqf/d0;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1

    .line 52
    :cond_3
    :goto_0
    return-object v0
.end method


# virtual methods
.method public final b(Ljava/util/Collection;)Lqf/d0;
    .locals 1

    .line 1
    const-string v0, "types"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ldf/q$a$a;->b:Ldf/q$a$a;

    .line 7
    .line 8
    invoke-direct {p0, p1, v0}, Ldf/q$a;->a(Ljava/util/Collection;Ldf/q$a$a;)Lqf/d0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method
