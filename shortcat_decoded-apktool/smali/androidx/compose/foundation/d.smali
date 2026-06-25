.class public abstract Landroidx/compose/foundation/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Landroidx/compose/ui/e;LB/m;Lx/G;ZLjava/lang/String;LR0/h;Lie/a;)Landroidx/compose/ui/e;
    .locals 9

    .line 1
    instance-of v0, p2, Lx/I;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v2, p2

    .line 6
    check-cast v2, Lx/I;

    .line 7
    .line 8
    new-instance v0, Landroidx/compose/foundation/ClickableElement;

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    move-object v1, p1

    .line 12
    move v3, p3

    .line 13
    move-object v4, p4

    .line 14
    move-object v5, p5

    .line 15
    move-object v6, p6

    .line 16
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/ClickableElement;-><init>(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-nez p2, :cond_1

    .line 21
    .line 22
    new-instance v0, Landroidx/compose/foundation/ClickableElement;

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    const/4 v2, 0x0

    .line 26
    move-object v1, p1

    .line 27
    move v3, p3

    .line 28
    move-object v4, p4

    .line 29
    move-object v5, p5

    .line 30
    move-object v6, p6

    .line 31
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/ClickableElement;-><init>(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    if-eqz p1, :cond_2

    .line 36
    .line 37
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 38
    .line 39
    invoke-static {v2, p1, p2}, Landroidx/compose/foundation/j;->b(Landroidx/compose/ui/e;LB/k;Lx/G;)Landroidx/compose/ui/e;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    new-instance v0, Landroidx/compose/foundation/ClickableElement;

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    const/4 v2, 0x0

    .line 47
    move-object v1, p1

    .line 48
    move v3, p3

    .line 49
    move-object v4, p4

    .line 50
    move-object v5, p5

    .line 51
    move-object v6, p6

    .line 52
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/ClickableElement;-><init>(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v8, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    sget-object v6, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 61
    .line 62
    new-instance v0, Landroidx/compose/foundation/d$b;

    .line 63
    .line 64
    move-object v1, p2

    .line 65
    move v2, p3

    .line 66
    move-object v3, p4

    .line 67
    move-object v4, p5

    .line 68
    move-object v5, p6

    .line 69
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/d$b;-><init>(Lx/G;ZLjava/lang/String;LR0/h;Lie/a;)V

    .line 70
    .line 71
    .line 72
    const/4 v1, 0x1

    .line 73
    const/4 v2, 0x0

    .line 74
    invoke-static {v6, v2, v0, v1, v2}, Landroidx/compose/ui/c;->c(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lie/o;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :goto_0
    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;LB/m;Lx/G;ZLjava/lang/String;LR0/h;Lie/a;ILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 7

    .line 1
    and-int/lit8 p8, p7, 0x4

    .line 2
    .line 3
    if-eqz p8, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x1

    .line 6
    :cond_0
    move v3, p3

    .line 7
    and-int/lit8 p3, p7, 0x8

    .line 8
    .line 9
    const/4 p8, 0x0

    .line 10
    if-eqz p3, :cond_1

    .line 11
    .line 12
    move-object v4, p8

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    move-object v4, p4

    .line 15
    :goto_0
    and-int/lit8 p3, p7, 0x10

    .line 16
    .line 17
    if-eqz p3, :cond_2

    .line 18
    .line 19
    move-object v5, p8

    .line 20
    :goto_1
    move-object v0, p0

    .line 21
    move-object v1, p1

    .line 22
    move-object v2, p2

    .line 23
    move-object v6, p6

    .line 24
    goto :goto_2

    .line 25
    :cond_2
    move-object v5, p5

    .line 26
    goto :goto_1

    .line 27
    :goto_2
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/d;->a(Landroidx/compose/ui/e;LB/m;Lx/G;ZLjava/lang/String;LR0/h;Lie/a;)Landroidx/compose/ui/e;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;ZLjava/lang/String;LR0/h;Lie/a;)Landroidx/compose/ui/e;
    .locals 2

    .line 1
    invoke-static {}, Landroidx/compose/ui/platform/T0;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroidx/compose/foundation/d$c;

    .line 8
    .line 9
    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/compose/foundation/d$c;-><init>(ZLjava/lang/String;LR0/h;Lie/a;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/T0;->a()Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :goto_0
    new-instance v1, Landroidx/compose/foundation/d$a;

    .line 18
    .line 19
    invoke-direct {v1, p1, p2, p3, p4}, Landroidx/compose/foundation/d$a;-><init>(ZLjava/lang/String;LR0/h;Lie/a;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v0, v1}, Landroidx/compose/ui/c;->b(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lie/o;)Landroidx/compose/ui/e;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/e;ZLjava/lang/String;LR0/h;Lie/a;ILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    and-int/lit8 p5, p5, 0x4

    .line 13
    .line 14
    if-eqz p5, :cond_2

    .line 15
    .line 16
    move-object p3, v0

    .line 17
    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/d;->c(Landroidx/compose/ui/e;ZLjava/lang/String;LR0/h;Lie/a;)Landroidx/compose/ui/e;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/e;LB/m;Lx/G;ZLjava/lang/String;LR0/h;Ljava/lang/String;Lie/a;Lie/a;Lie/a;)Landroidx/compose/ui/e;
    .locals 12

    .line 1
    instance-of v0, p2, Lx/I;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v2, p2

    .line 6
    check-cast v2, Lx/I;

    .line 7
    .line 8
    new-instance v0, Landroidx/compose/foundation/CombinedClickableElement;

    .line 9
    .line 10
    const/4 v10, 0x0

    .line 11
    move-object v1, p1

    .line 12
    move v3, p3

    .line 13
    move-object/from16 v4, p4

    .line 14
    .line 15
    move-object/from16 v5, p5

    .line 16
    .line 17
    move-object/from16 v7, p6

    .line 18
    .line 19
    move-object/from16 v8, p7

    .line 20
    .line 21
    move-object/from16 v9, p8

    .line 22
    .line 23
    move-object/from16 v6, p9

    .line 24
    .line 25
    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/CombinedClickableElement;-><init>(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;Ljava/lang/String;Lie/a;Lie/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    if-nez p2, :cond_1

    .line 30
    .line 31
    new-instance v0, Landroidx/compose/foundation/CombinedClickableElement;

    .line 32
    .line 33
    const/4 v10, 0x0

    .line 34
    const/4 v2, 0x0

    .line 35
    move-object v1, p1

    .line 36
    move v3, p3

    .line 37
    move-object/from16 v4, p4

    .line 38
    .line 39
    move-object/from16 v5, p5

    .line 40
    .line 41
    move-object/from16 v7, p6

    .line 42
    .line 43
    move-object/from16 v8, p7

    .line 44
    .line 45
    move-object/from16 v9, p8

    .line 46
    .line 47
    move-object/from16 v6, p9

    .line 48
    .line 49
    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/CombinedClickableElement;-><init>(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;Ljava/lang/String;Lie/a;Lie/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    if-eqz p1, :cond_2

    .line 54
    .line 55
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 56
    .line 57
    invoke-static {v2, p1, p2}, Landroidx/compose/foundation/j;->b(Landroidx/compose/ui/e;LB/k;Lx/G;)Landroidx/compose/ui/e;

    .line 58
    .line 59
    .line 60
    move-result-object v11

    .line 61
    new-instance v0, Landroidx/compose/foundation/CombinedClickableElement;

    .line 62
    .line 63
    const/4 v10, 0x0

    .line 64
    const/4 v2, 0x0

    .line 65
    move-object v1, p1

    .line 66
    move v3, p3

    .line 67
    move-object/from16 v4, p4

    .line 68
    .line 69
    move-object/from16 v5, p5

    .line 70
    .line 71
    move-object/from16 v7, p6

    .line 72
    .line 73
    move-object/from16 v8, p7

    .line 74
    .line 75
    move-object/from16 v9, p8

    .line 76
    .line 77
    move-object/from16 v6, p9

    .line 78
    .line 79
    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/CombinedClickableElement;-><init>(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;Ljava/lang/String;Lie/a;Lie/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v11, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    goto :goto_0

    .line 87
    :cond_2
    sget-object v9, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 88
    .line 89
    new-instance v0, Landroidx/compose/foundation/d$d;

    .line 90
    .line 91
    move-object v1, p2

    .line 92
    move v2, p3

    .line 93
    move-object/from16 v3, p4

    .line 94
    .line 95
    move-object/from16 v4, p5

    .line 96
    .line 97
    move-object/from16 v6, p6

    .line 98
    .line 99
    move-object/from16 v7, p7

    .line 100
    .line 101
    move-object/from16 v8, p8

    .line 102
    .line 103
    move-object/from16 v5, p9

    .line 104
    .line 105
    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/d$d;-><init>(Lx/G;ZLjava/lang/String;LR0/h;Lie/a;Ljava/lang/String;Lie/a;Lie/a;)V

    .line 106
    .line 107
    .line 108
    const/4 v1, 0x1

    .line 109
    const/4 v2, 0x0

    .line 110
    invoke-static {v9, v2, v0, v1, v2}, Landroidx/compose/ui/c;->c(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lie/o;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    :goto_0
    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    return-object v0
.end method

.method public static synthetic f(Landroidx/compose/ui/e;LB/m;Lx/G;ZLjava/lang/String;LR0/h;Ljava/lang/String;Lie/a;Lie/a;Lie/a;ILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 10

    .line 1
    move/from16 v0, p10

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x4

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const/4 p3, 0x1

    .line 8
    :cond_0
    move v3, p3

    .line 9
    and-int/lit8 p3, v0, 0x8

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz p3, :cond_1

    .line 13
    .line 14
    move-object v4, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move-object v4, p4

    .line 17
    :goto_0
    and-int/lit8 p3, v0, 0x10

    .line 18
    .line 19
    if-eqz p3, :cond_2

    .line 20
    .line 21
    move-object v5, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_2
    move-object v5, p5

    .line 24
    :goto_1
    and-int/lit8 p3, v0, 0x20

    .line 25
    .line 26
    if-eqz p3, :cond_3

    .line 27
    .line 28
    move-object v6, v1

    .line 29
    goto :goto_2

    .line 30
    :cond_3
    move-object/from16 v6, p6

    .line 31
    .line 32
    :goto_2
    and-int/lit8 p3, v0, 0x40

    .line 33
    .line 34
    if-eqz p3, :cond_4

    .line 35
    .line 36
    move-object v7, v1

    .line 37
    goto :goto_3

    .line 38
    :cond_4
    move-object/from16 v7, p7

    .line 39
    .line 40
    :goto_3
    and-int/lit16 p3, v0, 0x80

    .line 41
    .line 42
    if-eqz p3, :cond_5

    .line 43
    .line 44
    move-object v8, v1

    .line 45
    move-object v0, p0

    .line 46
    move-object v2, p2

    .line 47
    move-object/from16 v9, p9

    .line 48
    .line 49
    move-object v1, p1

    .line 50
    goto :goto_4

    .line 51
    :cond_5
    move-object/from16 v8, p8

    .line 52
    .line 53
    move-object v0, p0

    .line 54
    move-object v1, p1

    .line 55
    move-object v2, p2

    .line 56
    move-object/from16 v9, p9

    .line 57
    .line 58
    :goto_4
    invoke-static/range {v0 .. v9}, Landroidx/compose/foundation/d;->e(Landroidx/compose/ui/e;LB/m;Lx/G;ZLjava/lang/String;LR0/h;Ljava/lang/String;Lie/a;Lie/a;Lie/a;)Landroidx/compose/ui/e;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

.method public static final g(LK0/I0;)Z
    .locals 3

    .line 1
    new-instance v0, Lkotlin/jvm/internal/J;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/J;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lz/v;->c:Lz/v$a;

    .line 7
    .line 8
    new-instance v2, Landroidx/compose/foundation/d$e;

    .line 9
    .line 10
    invoke-direct {v2, v0}, Landroidx/compose/foundation/d$e;-><init>(Lkotlin/jvm/internal/J;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1, v2}, LK0/J0;->c(LK0/j;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    iget-boolean p0, v0, Lkotlin/jvm/internal/J;->a:Z

    .line 17
    .line 18
    return p0
.end method
