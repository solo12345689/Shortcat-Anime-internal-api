.class public abstract LV/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Ljava/util/List;)LV/d;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lc4/c;

    .line 22
    .line 23
    invoke-interface {v2}, Lc4/c;->a()Lc4/c$b;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    sget-object v4, Lc4/c$b;->d:Lc4/c$b;

    .line 28
    .line 29
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-interface {v2}, Lc4/c;->getState()Lc4/c$c;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    sget-object v4, Lc4/c$c;->d:Lc4/c$c;

    .line 40
    .line 41
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    :cond_0
    new-instance v3, LV/c;

    .line 49
    .line 50
    invoke-interface {v2}, Lc4/a;->getBounds()Landroid/graphics/Rect;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-static {v4}, Ls0/s1;->e(Landroid/graphics/Rect;)Lr0/h;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-interface {v2}, Lc4/c;->getState()Lc4/c$c;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    sget-object v6, Lc4/c$c;->c:Lc4/c$c;

    .line 63
    .line 64
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-interface {v2}, Lc4/c;->a()Lc4/c$b;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    sget-object v7, Lc4/c$b;->c:Lc4/c$b;

    .line 73
    .line 74
    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    invoke-interface {v2}, Lc4/c;->b()Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    invoke-interface {v2}, Lc4/c;->c()Lc4/c$a;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    sget-object v8, Lc4/c$a;->d:Lc4/c$a;

    .line 87
    .line 88
    invoke-static {v2, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    invoke-direct/range {v3 .. v8}, LV/c;-><init>(Lr0/h;ZZZZ)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    new-instance p0, LV/d;

    .line 100
    .line 101
    invoke-direct {p0, v1, v0}, LV/d;-><init>(ZLjava/util/List;)V

    .line 102
    .line 103
    .line 104
    return-object p0
.end method
