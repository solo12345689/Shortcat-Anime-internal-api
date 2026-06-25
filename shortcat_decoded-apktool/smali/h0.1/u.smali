.class public final Lh0/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lh0/p;
.implements LP3/i;


# instance fields
.field private final synthetic a:Lh0/p;

.field private final b:LP3/h;

.field private final c:Landroidx/lifecycle/t;

.field private final d:LP3/f;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lh0/p;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh0/u;->a:Lh0/p;

    .line 5
    .line 6
    sget-object p1, LP3/h;->c:LP3/h$a;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, LP3/h$a;->b(LP3/i;)LP3/h;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lh0/u;->b:LP3/h;

    .line 13
    .line 14
    sget-object v0, Landroidx/lifecycle/t;->j:Landroidx/lifecycle/t$a;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Landroidx/lifecycle/t$a;->a(Landroidx/lifecycle/r;)Landroidx/lifecycle/t;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lh0/u;->c:Landroidx/lifecycle/t;

    .line 21
    .line 22
    invoke-virtual {p1}, LP3/h;->b()LP3/f;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lh0/u;->d:LP3/f;

    .line 27
    .line 28
    const-string v0, "androidx.savedstate.SavedStateRegistry"

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lh0/u;->e(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    instance-of v2, v1, Landroid/os/Bundle;

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    check-cast v1, Landroid/os/Bundle;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v1, 0x0

    .line 42
    :goto_0
    invoke-virtual {p1, v1}, LP3/h;->d(Landroid/os/Bundle;)V

    .line 43
    .line 44
    .line 45
    new-instance p1, Lh0/t;

    .line 46
    .line 47
    invoke-direct {p1, p0}, Lh0/t;-><init>(Lh0/u;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0, p1}, Lh0/u;->f(Ljava/lang/String;Lie/a;)Lh0/p$a;

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static synthetic b(Lh0/u;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lh0/u;->c(Lh0/u;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c(Lh0/u;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-array v0, v2, [Lkotlin/Pair;

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/util/Map$Entry;

    .line 43
    .line 44
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Ljava/lang/String;

    .line 49
    .line 50
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-static {v4, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    new-array v0, v2, [Lkotlin/Pair;

    .line 63
    .line 64
    invoke-interface {v1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, [Lkotlin/Pair;

    .line 69
    .line 70
    :goto_1
    array-length v1, v0

    .line 71
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, [Lkotlin/Pair;

    .line 76
    .line 77
    invoke-static {v0}, LG1/c;->a([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v0}, LP3/j;->a(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 82
    .line 83
    .line 84
    iget-object p0, p0, Lh0/u;->b:LP3/h;

    .line 85
    .line 86
    invoke-virtual {p0, v0}, LP3/h;->e(Landroid/os/Bundle;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v0}, LP3/c;->a(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {p0}, LP3/c;->f(Landroid/os/Bundle;)Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-eqz p0, :cond_2

    .line 98
    .line 99
    const/4 p0, 0x0

    .line 100
    return-object p0

    .line 101
    :cond_2
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh0/u;->a:Lh0/p;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lh0/p;->a(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public d()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lh0/u;->a:Lh0/p;

    .line 2
    .line 3
    invoke-interface {v0}, Lh0/p;->d()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public e(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lh0/u;->a:Lh0/p;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lh0/p;->e(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public f(Ljava/lang/String;Lie/a;)Lh0/p$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lh0/u;->a:Lh0/p;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lh0/p;->f(Ljava/lang/String;Lie/a;)Lh0/p$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public g()Landroidx/lifecycle/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lh0/u;->c:Landroidx/lifecycle/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic getLifecycle()Landroidx/lifecycle/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh0/u;->g()Landroidx/lifecycle/t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getSavedStateRegistry()LP3/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lh0/u;->d:LP3/f;

    .line 2
    .line 3
    return-object v0
.end method
