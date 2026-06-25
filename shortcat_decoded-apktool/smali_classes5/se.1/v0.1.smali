.class public final Lse/v0;
.super Lse/d0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lse/v0$a;
    }
.end annotation


# instance fields
.field private final d:Ljava/lang/Class;

.field private final e:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    .line 1
    const-string v0, "jClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lse/d0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lse/v0;->d:Ljava/lang/Class;

    .line 10
    .line 11
    sget-object p1, LTd/q;->b:LTd/q;

    .line 12
    .line 13
    new-instance v0, Lse/p0;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lse/p0;-><init>(Lse/v0;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lse/v0;->e:Lkotlin/Lazy;

    .line 23
    .line 24
    return-void
.end method

.method static synthetic T(Lse/v0;)Lse/v0$a;
    .locals 0

    .line 1
    invoke-static {p0}, Lse/v0;->U(Lse/v0;)Lse/v0$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final U(Lse/v0;)Lse/v0$a;
    .locals 1

    .line 1
    new-instance v0, Lse/v0$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lse/v0$a;-><init>(Lse/v0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final V()Ljf/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lse/v0;->e:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lse/v0$a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lse/v0$a;->l()Ljf/k;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method


# virtual methods
.method public I()Ljava/util/Collection;
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

.method public J(LXe/f;)Ljava/util/Collection;
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lse/v0;->V()Ljf/k;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, LGe/d;->h:LGe/d;

    .line 11
    .line 12
    invoke-interface {v0, p1, v1}, Ljf/k;->c(LXe/f;LGe/b;)Ljava/util/Collection;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public K(I)Lye/Z;
    .locals 9

    .line 1
    iget-object v0, p0, Lse/v0;->e:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lse/v0$a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lse/v0$a;->j()LTd/y;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, LTd/y;->a()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    move-object v5, v2

    .line 21
    check-cast v5, LWe/e;

    .line 22
    .line 23
    invoke-virtual {v0}, LTd/y;->b()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, LSe/m;

    .line 28
    .line 29
    invoke-virtual {v0}, LTd/y;->c()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    move-object v7, v0

    .line 34
    check-cast v7, LUe/c;

    .line 35
    .line 36
    sget-object v0, LVe/a;->n:LZe/i$f;

    .line 37
    .line 38
    const-string v3, "packageLocalVariable"

    .line 39
    .line 40
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v2, v0, p1}, LUe/f;->b(LZe/i$d;LZe/i$f;I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    move-object v4, p1

    .line 48
    check-cast v4, LSe/o;

    .line 49
    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    invoke-virtual {p0}, Lse/v0;->j()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    new-instance v6, LUe/h;

    .line 57
    .line 58
    invoke-virtual {v2}, LSe/m;->W()LSe/u;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const-string v0, "getTypeTable(...)"

    .line 63
    .line 64
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-direct {v6, p1}, LUe/h;-><init>(LSe/u;)V

    .line 68
    .line 69
    .line 70
    sget-object v8, Lse/v0$b;->a:Lse/v0$b;

    .line 71
    .line 72
    invoke-static/range {v3 .. v8}, Lse/j1;->h(Ljava/lang/Class;LZe/p;LUe/d;LUe/h;LUe/a;Lkotlin/jvm/functions/Function2;)Lye/a;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, Lye/Z;

    .line 77
    .line 78
    return-object p1

    .line 79
    :cond_0
    return-object v1
.end method

.method protected M()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lse/v0;->e:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lse/v0$a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lse/v0$a;->k()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lse/v0;->j()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_0
    return-object v0
.end method

.method public N(LXe/f;)Ljava/util/Collection;
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lse/v0;->V()Ljf/k;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, LGe/d;->h:LGe/d;

    .line 11
    .line 12
    invoke-interface {v0, p1, v1}, Ljf/k;->a(LXe/f;LGe/b;)Ljava/util/Collection;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lse/v0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lse/v0;->j()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast p1, Lse/v0;

    .line 10
    .line 11
    invoke-virtual {p1}, Lse/v0;->j()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lse/v0;->j()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public j()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lse/v0;->d:Ljava/lang/Class;

    .line 2
    .line 3
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
    const-string v1, "file class "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lse/v0;->j()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, LEe/f;->e(Ljava/lang/Class;)LXe/b;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, LXe/b;->a()LXe/c;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0
.end method
