.class public LUh/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lbi/a;


# instance fields
.field private final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, LUh/a;->a:Z

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()C
    .locals 1

    .line 1
    const/16 v0, 0x7e

    .line 2
    .line 3
    return v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget-boolean v0, p0, LUh/a;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    return v0
.end method

.method public c()C
    .locals 1

    .line 1
    const/16 v0, 0x7e

    .line 2
    .line 3
    return v0
.end method

.method public d(Lbi/b;Lbi/b;)I
    .locals 5

    .line 1
    invoke-interface {p1}, Lbi/b;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p2}, Lbi/b;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    invoke-interface {p1}, Lbi/b;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x2

    .line 16
    if-gt v0, v1, :cond_1

    .line 17
    .line 18
    invoke-interface {p1}, Lbi/b;->d()LYh/A;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, LTh/a;

    .line 23
    .line 24
    invoke-direct {v1}, LTh/a;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v2, LYh/y;

    .line 28
    .line 29
    invoke-direct {v2}, LYh/y;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Lbi/b;->length()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-interface {p1, v3}, Lbi/b;->a(I)Ljava/lang/Iterable;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v2, v3}, LYh/y;->b(Ljava/lang/Iterable;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p2}, Lbi/b;->b()LYh/A;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-static {v0, v3}, LYh/t;->a(LYh/s;LYh/s;)Ljava/lang/Iterable;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_0

    .line 60
    .line 61
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, LYh/s;

    .line 66
    .line 67
    invoke-virtual {v1, v4}, LYh/s;->b(LYh/s;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, LYh/s;->g()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v2, v4}, LYh/y;->a(Ljava/util/List;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-interface {p2}, Lbi/b;->length()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    invoke-interface {p2, v3}, Lbi/b;->e(I)Ljava/lang/Iterable;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-virtual {v2, p2}, LYh/y;->b(Ljava/lang/Iterable;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, LYh/y;->d()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-virtual {v1, p2}, LYh/s;->k(Ljava/util/List;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v1}, LYh/s;->h(LYh/s;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {p1}, Lbi/b;->length()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    return p1

    .line 104
    :cond_1
    const/4 p1, 0x0

    .line 105
    return p1
.end method
