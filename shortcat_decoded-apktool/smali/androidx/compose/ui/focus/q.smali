.class public abstract Landroidx/compose/ui/focus/q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/q$a;
    }
.end annotation


# direct methods
.method private static final a(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/focus/r;->f(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/focus/q;->b(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

.method public static final b(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->L1()Lq0/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/compose/ui/focus/q$a;->a:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eq v0, v2, :cond_6

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    if-eq v0, v3, :cond_4

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    if-eq v0, v1, :cond_1

    .line 22
    .line 23
    const/4 p0, 0x4

    .line 24
    if-ne v0, p0, :cond_0

    .line 25
    .line 26
    return v2

    .line 27
    :cond_0
    new-instance p0, LTd/r;

    .line 28
    .line 29
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 30
    .line 31
    .line 32
    throw p0

    .line 33
    :cond_1
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/focus/q;->a(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    if-eqz p2, :cond_2

    .line 40
    .line 41
    sget-object p1, Lq0/o;->b:Lq0/o;

    .line 42
    .line 43
    sget-object p2, Lq0/o;->d:Lq0/o;

    .line 44
    .line 45
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/focus/FocusTargetNode;->I1(Lq0/n;Lq0/n;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    return v2

    .line 49
    :cond_3
    const/4 p0, 0x0

    .line 50
    return p0

    .line 51
    :cond_4
    if-eqz p1, :cond_5

    .line 52
    .line 53
    invoke-static {p0}, LK0/k;->o(LK0/j;)LK0/p0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {v0}, LK0/p0;->getFocusOwner()Lq0/j;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {v0, v1}, Lq0/j;->s(Landroidx/compose/ui/focus/FocusTargetNode;)V

    .line 62
    .line 63
    .line 64
    if-eqz p2, :cond_5

    .line 65
    .line 66
    sget-object p2, Lq0/o;->c:Lq0/o;

    .line 67
    .line 68
    sget-object v0, Lq0/o;->d:Lq0/o;

    .line 69
    .line 70
    invoke-virtual {p0, p2, v0}, Landroidx/compose/ui/focus/FocusTargetNode;->I1(Lq0/n;Lq0/n;)V

    .line 71
    .line 72
    .line 73
    :cond_5
    return p1

    .line 74
    :cond_6
    invoke-static {p0}, LK0/k;->o(LK0/j;)LK0/p0;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-interface {p1}, LK0/p0;->getFocusOwner()Lq0/j;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-interface {p1, v1}, Lq0/j;->s(Landroidx/compose/ui/focus/FocusTargetNode;)V

    .line 83
    .line 84
    .line 85
    if-eqz p2, :cond_7

    .line 86
    .line 87
    sget-object p1, Lq0/o;->a:Lq0/o;

    .line 88
    .line 89
    sget-object p2, Lq0/o;->d:Lq0/o;

    .line 90
    .line 91
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/focus/FocusTargetNode;->I1(Lq0/n;Lq0/n;)V

    .line 92
    .line 93
    .line 94
    :cond_7
    return v2
.end method

.method public static synthetic c(Landroidx/compose/ui/focus/FocusTargetNode;ZZILjava/lang/Object;)Z
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/focus/q;->b(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method private static final d(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 3

    .line 1
    new-instance v0, Landroidx/compose/ui/focus/q$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/compose/ui/focus/q$b;-><init>(Landroidx/compose/ui/focus/FocusTargetNode;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, LK0/k0;->a(Landroidx/compose/ui/e$c;Lie/a;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->L1()Lq0/o;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Landroidx/compose/ui/focus/q$a;->a:[I

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    aget v0, v1, v0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    if-eq v0, v1, :cond_2

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    if-eq v0, v2, :cond_2

    .line 26
    .line 27
    const/4 v2, 0x3

    .line 28
    if-eq v0, v2, :cond_1

    .line 29
    .line 30
    const/4 v2, 0x4

    .line 31
    if-ne v0, v2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance p0, LTd/r;

    .line 35
    .line 36
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 37
    .line 38
    .line 39
    throw p0

    .line 40
    :cond_1
    :goto_0
    invoke-static {p0}, LK0/k;->o(LK0/j;)LK0/p0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {v0}, LK0/p0;->getFocusOwner()Lq0/j;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-interface {v0, p0}, Lq0/j;->s(Landroidx/compose/ui/focus/FocusTargetNode;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    return v1
.end method

.method public static final e(Landroidx/compose/ui/focus/FocusTargetNode;I)Lq0/b;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->L1()Lq0/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/compose/ui/focus/q$a;->a:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_5

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eq v0, v1, :cond_4

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    if-eq v0, v1, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x4

    .line 23
    if-ne v0, p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p0, LTd/r;

    .line 27
    .line 28
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 29
    .line 30
    .line 31
    throw p0

    .line 32
    :cond_1
    invoke-static {p0}, Landroidx/compose/ui/focus/q;->l(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0, p1}, Landroidx/compose/ui/focus/q;->e(Landroidx/compose/ui/focus/FocusTargetNode;I)Lq0/b;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget-object v1, Lq0/b;->a:Lq0/b;

    .line 41
    .line 42
    if-ne v0, v1, :cond_2

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    :cond_2
    if-nez v0, :cond_3

    .line 46
    .line 47
    invoke-static {p0, p1}, Landroidx/compose/ui/focus/q;->g(Landroidx/compose/ui/focus/FocusTargetNode;I)Lq0/b;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_3
    return-object v0

    .line 53
    :cond_4
    sget-object p0, Lq0/b;->b:Lq0/b;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_5
    :goto_0
    sget-object p0, Lq0/b;->a:Lq0/b;

    .line 57
    .line 58
    return-object p0
.end method

.method private static final f(Landroidx/compose/ui/focus/FocusTargetNode;I)Lq0/b;
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->E1(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-static {p0, v0}, Landroidx/compose/ui/focus/FocusTargetNode;->G1(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->J1()Landroidx/compose/ui/focus/i;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    new-instance v3, Lq0/a;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v3, p1, v4}, Lq0/a;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, LK0/k;->o(LK0/j;)LK0/p0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p1}, LK0/p0;->getFocusOwner()Lq0/j;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p1}, Lq0/j;->j()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-interface {v2}, Landroidx/compose/ui/focus/i;->k()Lkotlin/jvm/functions/Function1;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    invoke-interface {p1}, Lq0/j;->j()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v3}, Lq0/a;->c()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    sget-object p1, Landroidx/compose/ui/focus/k;->b:Landroidx/compose/ui/focus/k$a;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroidx/compose/ui/focus/k$a;->a()Landroidx/compose/ui/focus/k;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {p1}, Landroidx/compose/ui/focus/k$a;->a()Landroidx/compose/ui/focus/k;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-ne v2, v3, :cond_0

    .line 62
    .line 63
    sget-object p1, Lq0/b;->b:Lq0/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->G1(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 66
    .line 67
    .line 68
    return-object p1

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    goto :goto_2

    .line 71
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Landroidx/compose/ui/focus/k$a;->c()Landroidx/compose/ui/focus/k;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne v2, p1, :cond_1

    .line 76
    .line 77
    sget-object p1, Lq0/b;->c:Lq0/b;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    .line 79
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->G1(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_1
    :try_start_2
    invoke-static {v2, v1, v0, v4}, Landroidx/compose/ui/focus/k;->h(Landroidx/compose/ui/focus/k;IILjava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_2

    .line 88
    .line 89
    sget-object p1, Lq0/b;->c:Lq0/b;

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    sget-object p1, Lq0/b;->d:Lq0/b;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 93
    .line 94
    :goto_0
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->G1(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 95
    .line 96
    .line 97
    return-object p1

    .line 98
    :cond_3
    if-eq v5, p1, :cond_7

    .line 99
    .line 100
    if-eqz p1, :cond_7

    .line 101
    .line 102
    :try_start_3
    sget-object p1, Landroidx/compose/ui/focus/k;->b:Landroidx/compose/ui/focus/k$a;

    .line 103
    .line 104
    invoke-virtual {p1}, Landroidx/compose/ui/focus/k$a;->c()Landroidx/compose/ui/focus/k;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {p1}, Landroidx/compose/ui/focus/k$a;->a()Landroidx/compose/ui/focus/k;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    if-ne v2, v3, :cond_4

    .line 113
    .line 114
    sget-object p1, Lq0/b;->b:Lq0/b;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 115
    .line 116
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->G1(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 117
    .line 118
    .line 119
    return-object p1

    .line 120
    :cond_4
    :try_start_4
    invoke-virtual {p1}, Landroidx/compose/ui/focus/k$a;->c()Landroidx/compose/ui/focus/k;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-ne v2, p1, :cond_5

    .line 125
    .line 126
    sget-object p1, Lq0/b;->c:Lq0/b;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 127
    .line 128
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->G1(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 129
    .line 130
    .line 131
    return-object p1

    .line 132
    :cond_5
    :try_start_5
    invoke-static {v2, v1, v0, v4}, Landroidx/compose/ui/focus/k;->h(Landroidx/compose/ui/focus/k;IILjava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_6

    .line 137
    .line 138
    sget-object p1, Lq0/b;->c:Lq0/b;

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_6
    sget-object p1, Lq0/b;->d:Lq0/b;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 142
    .line 143
    :goto_1
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->G1(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 144
    .line 145
    .line 146
    return-object p1

    .line 147
    :cond_7
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->G1(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :goto_2
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->G1(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 152
    .line 153
    .line 154
    throw p1

    .line 155
    :cond_8
    :goto_3
    sget-object p0, Lq0/b;->a:Lq0/b;

    .line 156
    .line 157
    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/focus/FocusTargetNode;I)Lq0/b;
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->F1(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-static {p0, v0}, Landroidx/compose/ui/focus/FocusTargetNode;->H1(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->J1()Landroidx/compose/ui/focus/i;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    new-instance v3, Lq0/a;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v3, p1, v4}, Lq0/a;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, LK0/k;->o(LK0/j;)LK0/p0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p1}, LK0/p0;->getFocusOwner()Lq0/j;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p1}, Lq0/j;->j()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-interface {v2}, Landroidx/compose/ui/focus/i;->m()Lkotlin/jvm/functions/Function1;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    invoke-interface {p1}, Lq0/j;->j()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v3}, Lq0/a;->c()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    sget-object p1, Landroidx/compose/ui/focus/k;->b:Landroidx/compose/ui/focus/k$a;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroidx/compose/ui/focus/k$a;->a()Landroidx/compose/ui/focus/k;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {p1}, Landroidx/compose/ui/focus/k$a;->a()Landroidx/compose/ui/focus/k;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-ne v2, v3, :cond_0

    .line 62
    .line 63
    sget-object p1, Lq0/b;->b:Lq0/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->H1(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 66
    .line 67
    .line 68
    return-object p1

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    goto :goto_2

    .line 71
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Landroidx/compose/ui/focus/k$a;->c()Landroidx/compose/ui/focus/k;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne v2, p1, :cond_1

    .line 76
    .line 77
    sget-object p1, Lq0/b;->c:Lq0/b;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    .line 79
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->H1(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_1
    :try_start_2
    invoke-static {v2, v1, v0, v4}, Landroidx/compose/ui/focus/k;->h(Landroidx/compose/ui/focus/k;IILjava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_2

    .line 88
    .line 89
    sget-object p1, Lq0/b;->c:Lq0/b;

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    sget-object p1, Lq0/b;->d:Lq0/b;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 93
    .line 94
    :goto_0
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->H1(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 95
    .line 96
    .line 97
    return-object p1

    .line 98
    :cond_3
    if-eq v5, p1, :cond_7

    .line 99
    .line 100
    if-eqz p1, :cond_7

    .line 101
    .line 102
    :try_start_3
    sget-object p1, Landroidx/compose/ui/focus/k;->b:Landroidx/compose/ui/focus/k$a;

    .line 103
    .line 104
    invoke-virtual {p1}, Landroidx/compose/ui/focus/k$a;->c()Landroidx/compose/ui/focus/k;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {p1}, Landroidx/compose/ui/focus/k$a;->a()Landroidx/compose/ui/focus/k;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    if-ne v2, v3, :cond_4

    .line 113
    .line 114
    sget-object p1, Lq0/b;->b:Lq0/b;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 115
    .line 116
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->H1(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 117
    .line 118
    .line 119
    return-object p1

    .line 120
    :cond_4
    :try_start_4
    invoke-virtual {p1}, Landroidx/compose/ui/focus/k$a;->c()Landroidx/compose/ui/focus/k;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-ne v2, p1, :cond_5

    .line 125
    .line 126
    sget-object p1, Lq0/b;->c:Lq0/b;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 127
    .line 128
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->H1(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 129
    .line 130
    .line 131
    return-object p1

    .line 132
    :cond_5
    :try_start_5
    invoke-static {v2, v1, v0, v4}, Landroidx/compose/ui/focus/k;->h(Landroidx/compose/ui/focus/k;IILjava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_6

    .line 137
    .line 138
    sget-object p1, Lq0/b;->c:Lq0/b;

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_6
    sget-object p1, Lq0/b;->d:Lq0/b;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 142
    .line 143
    :goto_1
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->H1(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 144
    .line 145
    .line 146
    return-object p1

    .line 147
    :cond_7
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->H1(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :goto_2
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->H1(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 152
    .line 153
    .line 154
    throw p1

    .line 155
    :cond_8
    :goto_3
    sget-object p0, Lq0/b;->a:Lq0/b;

    .line 156
    .line 157
    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/focus/FocusTargetNode;I)Lq0/b;
    .locals 13

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->L1()Lq0/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/compose/ui/focus/q$a;->a:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_15

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    if-eq v0, v2, :cond_15

    .line 18
    .line 19
    const/4 v3, 0x3

    .line 20
    if-eq v0, v3, :cond_14

    .line 21
    .line 22
    const/4 v4, 0x4

    .line 23
    if-ne v0, v4, :cond_13

    .line 24
    .line 25
    const/16 v0, 0x400

    .line 26
    .line 27
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-nez v5, :cond_0

    .line 40
    .line 41
    const-string v5, "visitAncestors called on an unattached node"

    .line 42
    .line 43
    invoke-static {v5}, LH0/a;->b(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-static {p0}, LK0/k;->n(LK0/j;)LK0/J;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :goto_0
    const/4 v6, 0x0

    .line 59
    if-eqz p0, :cond_b

    .line 60
    .line 61
    invoke-virtual {p0}, LK0/J;->t0()LK0/c0;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-virtual {v7}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    and-int/2addr v7, v0

    .line 74
    if-eqz v7, :cond_9

    .line 75
    .line 76
    :goto_1
    if-eqz v5, :cond_9

    .line 77
    .line 78
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    and-int/2addr v7, v0

    .line 83
    if-eqz v7, :cond_8

    .line 84
    .line 85
    move-object v7, v5

    .line 86
    move-object v8, v6

    .line 87
    :goto_2
    if-eqz v7, :cond_8

    .line 88
    .line 89
    instance-of v9, v7, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 90
    .line 91
    if-eqz v9, :cond_1

    .line 92
    .line 93
    goto/16 :goto_5

    .line 94
    .line 95
    :cond_1
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    and-int/2addr v9, v0

    .line 100
    if-eqz v9, :cond_7

    .line 101
    .line 102
    instance-of v9, v7, LK0/m;

    .line 103
    .line 104
    if-eqz v9, :cond_7

    .line 105
    .line 106
    move-object v9, v7

    .line 107
    check-cast v9, LK0/m;

    .line 108
    .line 109
    invoke-virtual {v9}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 110
    .line 111
    .line 112
    move-result-object v9

    .line 113
    const/4 v10, 0x0

    .line 114
    move v11, v10

    .line 115
    :goto_3
    if-eqz v9, :cond_6

    .line 116
    .line 117
    invoke-virtual {v9}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    and-int/2addr v12, v0

    .line 122
    if-eqz v12, :cond_5

    .line 123
    .line 124
    add-int/lit8 v11, v11, 0x1

    .line 125
    .line 126
    if-ne v11, v1, :cond_2

    .line 127
    .line 128
    move-object v7, v9

    .line 129
    goto :goto_4

    .line 130
    :cond_2
    if-nez v8, :cond_3

    .line 131
    .line 132
    new-instance v8, La0/c;

    .line 133
    .line 134
    const/16 v12, 0x10

    .line 135
    .line 136
    new-array v12, v12, [Landroidx/compose/ui/e$c;

    .line 137
    .line 138
    invoke-direct {v8, v12, v10}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 139
    .line 140
    .line 141
    :cond_3
    if-eqz v7, :cond_4

    .line 142
    .line 143
    invoke-virtual {v8, v7}, La0/c;->c(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-object v7, v6

    .line 147
    :cond_4
    invoke-virtual {v8, v9}, La0/c;->c(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    :cond_5
    :goto_4
    invoke-virtual {v9}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    goto :goto_3

    .line 155
    :cond_6
    if-ne v11, v1, :cond_7

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_7
    invoke-static {v8}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    goto :goto_2

    .line 163
    :cond_8
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    goto :goto_1

    .line 168
    :cond_9
    invoke-virtual {p0}, LK0/J;->A0()LK0/J;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    if-eqz p0, :cond_a

    .line 173
    .line 174
    invoke-virtual {p0}, LK0/J;->t0()LK0/c0;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    if-eqz v5, :cond_a

    .line 179
    .line 180
    invoke-virtual {v5}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    goto :goto_0

    .line 185
    :cond_a
    move-object v5, v6

    .line 186
    goto/16 :goto_0

    .line 187
    .line 188
    :cond_b
    move-object v7, v6

    .line 189
    :goto_5
    check-cast v7, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 190
    .line 191
    if-nez v7, :cond_c

    .line 192
    .line 193
    sget-object p0, Lq0/b;->a:Lq0/b;

    .line 194
    .line 195
    return-object p0

    .line 196
    :cond_c
    invoke-virtual {v7}, Landroidx/compose/ui/focus/FocusTargetNode;->L1()Lq0/o;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    sget-object v0, Landroidx/compose/ui/focus/q$a;->a:[I

    .line 201
    .line 202
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 203
    .line 204
    .line 205
    move-result p0

    .line 206
    aget p0, v0, p0

    .line 207
    .line 208
    if-eq p0, v1, :cond_12

    .line 209
    .line 210
    if-eq p0, v2, :cond_11

    .line 211
    .line 212
    if-eq p0, v3, :cond_10

    .line 213
    .line 214
    if-ne p0, v4, :cond_f

    .line 215
    .line 216
    invoke-static {v7, p1}, Landroidx/compose/ui/focus/q;->h(Landroidx/compose/ui/focus/FocusTargetNode;I)Lq0/b;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    sget-object v0, Lq0/b;->a:Lq0/b;

    .line 221
    .line 222
    if-ne p0, v0, :cond_d

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_d
    move-object v6, p0

    .line 226
    :goto_6
    if-nez v6, :cond_e

    .line 227
    .line 228
    invoke-static {v7, p1}, Landroidx/compose/ui/focus/q;->f(Landroidx/compose/ui/focus/FocusTargetNode;I)Lq0/b;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    return-object p0

    .line 233
    :cond_e
    return-object v6

    .line 234
    :cond_f
    new-instance p0, LTd/r;

    .line 235
    .line 236
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 237
    .line 238
    .line 239
    throw p0

    .line 240
    :cond_10
    invoke-static {v7, p1}, Landroidx/compose/ui/focus/q;->h(Landroidx/compose/ui/focus/FocusTargetNode;I)Lq0/b;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    return-object p0

    .line 245
    :cond_11
    sget-object p0, Lq0/b;->b:Lq0/b;

    .line 246
    .line 247
    return-object p0

    .line 248
    :cond_12
    invoke-static {v7, p1}, Landroidx/compose/ui/focus/q;->f(Landroidx/compose/ui/focus/FocusTargetNode;I)Lq0/b;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    return-object p0

    .line 253
    :cond_13
    new-instance p0, LTd/r;

    .line 254
    .line 255
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 256
    .line 257
    .line 258
    throw p0

    .line 259
    :cond_14
    invoke-static {p0}, Landroidx/compose/ui/focus/q;->l(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    invoke-static {p0, p1}, Landroidx/compose/ui/focus/q;->e(Landroidx/compose/ui/focus/FocusTargetNode;I)Lq0/b;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    return-object p0

    .line 268
    :cond_15
    sget-object p0, Lq0/b;->a:Lq0/b;

    .line 269
    .line 270
    return-object p0
.end method

.method public static final i(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {v0}, LK0/k;->o(LK0/j;)LK0/p0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, LK0/p0;->getFocusOwner()Lq0/j;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, Lq0/j;->j()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTargetNode;->L1()Lq0/o;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/4 v4, 0x1

    .line 20
    if-ne v2, v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, v3, v3}, Landroidx/compose/ui/focus/FocusTargetNode;->I1(Lq0/n;Lq0/n;)V

    .line 23
    .line 24
    .line 25
    return v4

    .line 26
    :cond_0
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    const/4 v7, 0x3

    .line 31
    invoke-static {v0, v5, v5, v7, v5}, Landroidx/compose/ui/focus/q;->k(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/d;Lr0/h;ILjava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    if-nez v7, :cond_1

    .line 36
    .line 37
    return v6

    .line 38
    :cond_1
    const-string v7, "visitAncestors called on an unattached node"

    .line 39
    .line 40
    const/16 v8, 0x400

    .line 41
    .line 42
    const/16 v9, 0x10

    .line 43
    .line 44
    if-eqz v2, :cond_e

    .line 45
    .line 46
    new-instance v10, La0/c;

    .line 47
    .line 48
    new-array v11, v9, [Landroidx/compose/ui/focus/FocusTargetNode;

    .line 49
    .line 50
    invoke-direct {v10, v11, v6}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    invoke-static {v8}, LK0/g0;->a(I)I

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    invoke-interface {v2}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 58
    .line 59
    .line 60
    move-result-object v12

    .line 61
    invoke-virtual {v12}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 62
    .line 63
    .line 64
    move-result v12

    .line 65
    if-nez v12, :cond_2

    .line 66
    .line 67
    invoke-static {v7}, LH0/a;->b(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    invoke-interface {v2}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 71
    .line 72
    .line 73
    move-result-object v12

    .line 74
    invoke-virtual {v12}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 75
    .line 76
    .line 77
    move-result-object v12

    .line 78
    invoke-static {v2}, LK0/k;->n(LK0/j;)LK0/J;

    .line 79
    .line 80
    .line 81
    move-result-object v13

    .line 82
    :goto_0
    if-eqz v13, :cond_d

    .line 83
    .line 84
    invoke-virtual {v13}, LK0/J;->t0()LK0/c0;

    .line 85
    .line 86
    .line 87
    move-result-object v14

    .line 88
    invoke-virtual {v14}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 89
    .line 90
    .line 91
    move-result-object v14

    .line 92
    invoke-virtual {v14}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 93
    .line 94
    .line 95
    move-result v14

    .line 96
    and-int/2addr v14, v11

    .line 97
    if-eqz v14, :cond_b

    .line 98
    .line 99
    :goto_1
    if-eqz v12, :cond_b

    .line 100
    .line 101
    invoke-virtual {v12}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 102
    .line 103
    .line 104
    move-result v14

    .line 105
    and-int/2addr v14, v11

    .line 106
    if-eqz v14, :cond_a

    .line 107
    .line 108
    move-object v15, v5

    .line 109
    move-object v14, v12

    .line 110
    :goto_2
    if-eqz v14, :cond_a

    .line 111
    .line 112
    move/from16 v16, v8

    .line 113
    .line 114
    instance-of v8, v14, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 115
    .line 116
    if-eqz v8, :cond_3

    .line 117
    .line 118
    check-cast v14, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 119
    .line 120
    invoke-virtual {v10, v14}, La0/c;->c(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_6

    .line 124
    :cond_3
    invoke-virtual {v14}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    and-int/2addr v8, v11

    .line 129
    if-eqz v8, :cond_9

    .line 130
    .line 131
    instance-of v8, v14, LK0/m;

    .line 132
    .line 133
    if-eqz v8, :cond_9

    .line 134
    .line 135
    move-object v8, v14

    .line 136
    check-cast v8, LK0/m;

    .line 137
    .line 138
    invoke-virtual {v8}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    move v5, v6

    .line 143
    :goto_3
    if-eqz v8, :cond_8

    .line 144
    .line 145
    invoke-virtual {v8}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 146
    .line 147
    .line 148
    move-result v17

    .line 149
    and-int v17, v17, v11

    .line 150
    .line 151
    if-eqz v17, :cond_7

    .line 152
    .line 153
    add-int/lit8 v5, v5, 0x1

    .line 154
    .line 155
    if-ne v5, v4, :cond_4

    .line 156
    .line 157
    move-object v14, v8

    .line 158
    goto :goto_4

    .line 159
    :cond_4
    if-nez v15, :cond_5

    .line 160
    .line 161
    new-instance v15, La0/c;

    .line 162
    .line 163
    new-array v4, v9, [Landroidx/compose/ui/e$c;

    .line 164
    .line 165
    invoke-direct {v15, v4, v6}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 166
    .line 167
    .line 168
    :cond_5
    if-eqz v14, :cond_6

    .line 169
    .line 170
    invoke-virtual {v15, v14}, La0/c;->c(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    const/4 v14, 0x0

    .line 174
    :cond_6
    invoke-virtual {v15, v8}, La0/c;->c(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    :cond_7
    :goto_4
    invoke-virtual {v8}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    const/4 v4, 0x1

    .line 182
    goto :goto_3

    .line 183
    :cond_8
    if-ne v5, v4, :cond_9

    .line 184
    .line 185
    move/from16 v8, v16

    .line 186
    .line 187
    :goto_5
    const/4 v5, 0x0

    .line 188
    goto :goto_2

    .line 189
    :cond_9
    :goto_6
    invoke-static {v15}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 190
    .line 191
    .line 192
    move-result-object v14

    .line 193
    move/from16 v8, v16

    .line 194
    .line 195
    const/4 v4, 0x1

    .line 196
    goto :goto_5

    .line 197
    :cond_a
    move/from16 v16, v8

    .line 198
    .line 199
    invoke-virtual {v12}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 200
    .line 201
    .line 202
    move-result-object v12

    .line 203
    move/from16 v8, v16

    .line 204
    .line 205
    const/4 v4, 0x1

    .line 206
    const/4 v5, 0x0

    .line 207
    goto :goto_1

    .line 208
    :cond_b
    move/from16 v16, v8

    .line 209
    .line 210
    invoke-virtual {v13}, LK0/J;->A0()LK0/J;

    .line 211
    .line 212
    .line 213
    move-result-object v13

    .line 214
    if-eqz v13, :cond_c

    .line 215
    .line 216
    invoke-virtual {v13}, LK0/J;->t0()LK0/c0;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    if-eqz v4, :cond_c

    .line 221
    .line 222
    invoke-virtual {v4}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    move-object v12, v4

    .line 227
    goto :goto_7

    .line 228
    :cond_c
    const/4 v12, 0x0

    .line 229
    :goto_7
    move/from16 v8, v16

    .line 230
    .line 231
    const/4 v4, 0x1

    .line 232
    const/4 v5, 0x0

    .line 233
    goto/16 :goto_0

    .line 234
    .line 235
    :cond_d
    :goto_8
    move/from16 v16, v8

    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_e
    const/4 v10, 0x0

    .line 239
    goto :goto_8

    .line 240
    :goto_9
    new-instance v4, La0/c;

    .line 241
    .line 242
    new-array v5, v9, [Landroidx/compose/ui/focus/FocusTargetNode;

    .line 243
    .line 244
    invoke-direct {v4, v5, v6}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 245
    .line 246
    .line 247
    invoke-static/range {v16 .. v16}, LK0/g0;->a(I)I

    .line 248
    .line 249
    .line 250
    move-result v5

    .line 251
    invoke-interface {v0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 252
    .line 253
    .line 254
    move-result-object v8

    .line 255
    invoke-virtual {v8}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 256
    .line 257
    .line 258
    move-result v8

    .line 259
    if-nez v8, :cond_f

    .line 260
    .line 261
    invoke-static {v7}, LH0/a;->b(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    :cond_f
    invoke-interface {v0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 265
    .line 266
    .line 267
    move-result-object v7

    .line 268
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 269
    .line 270
    .line 271
    move-result-object v7

    .line 272
    invoke-static {v0}, LK0/k;->n(LK0/j;)LK0/J;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    const/4 v11, 0x1

    .line 277
    :goto_a
    if-eqz v8, :cond_1d

    .line 278
    .line 279
    invoke-virtual {v8}, LK0/J;->t0()LK0/c0;

    .line 280
    .line 281
    .line 282
    move-result-object v12

    .line 283
    invoke-virtual {v12}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 284
    .line 285
    .line 286
    move-result-object v12

    .line 287
    invoke-virtual {v12}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 288
    .line 289
    .line 290
    move-result v12

    .line 291
    and-int/2addr v12, v5

    .line 292
    if-eqz v12, :cond_1b

    .line 293
    .line 294
    :goto_b
    if-eqz v7, :cond_1b

    .line 295
    .line 296
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 297
    .line 298
    .line 299
    move-result v12

    .line 300
    and-int/2addr v12, v5

    .line 301
    if-eqz v12, :cond_1a

    .line 302
    .line 303
    move-object v13, v7

    .line 304
    const/4 v12, 0x0

    .line 305
    :goto_c
    if-eqz v13, :cond_1a

    .line 306
    .line 307
    instance-of v14, v13, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 308
    .line 309
    if-eqz v14, :cond_13

    .line 310
    .line 311
    check-cast v13, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 312
    .line 313
    if-eqz v10, :cond_10

    .line 314
    .line 315
    invoke-virtual {v10, v13}, La0/c;->w(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v14

    .line 319
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 320
    .line 321
    .line 322
    move-result-object v14

    .line 323
    goto :goto_d

    .line 324
    :cond_10
    const/4 v14, 0x0

    .line 325
    :goto_d
    if-eqz v14, :cond_11

    .line 326
    .line 327
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 328
    .line 329
    .line 330
    move-result v14

    .line 331
    if-nez v14, :cond_12

    .line 332
    .line 333
    :cond_11
    invoke-virtual {v4, v13}, La0/c;->c(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    :cond_12
    if-ne v13, v2, :cond_19

    .line 337
    .line 338
    move v11, v6

    .line 339
    goto :goto_11

    .line 340
    :cond_13
    invoke-virtual {v13}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 341
    .line 342
    .line 343
    move-result v14

    .line 344
    and-int/2addr v14, v5

    .line 345
    if-eqz v14, :cond_19

    .line 346
    .line 347
    instance-of v14, v13, LK0/m;

    .line 348
    .line 349
    if-eqz v14, :cond_19

    .line 350
    .line 351
    move-object v14, v13

    .line 352
    check-cast v14, LK0/m;

    .line 353
    .line 354
    invoke-virtual {v14}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 355
    .line 356
    .line 357
    move-result-object v14

    .line 358
    move v15, v6

    .line 359
    :goto_e
    if-eqz v14, :cond_18

    .line 360
    .line 361
    invoke-virtual {v14}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 362
    .line 363
    .line 364
    move-result v16

    .line 365
    and-int v16, v16, v5

    .line 366
    .line 367
    if-eqz v16, :cond_17

    .line 368
    .line 369
    add-int/lit8 v15, v15, 0x1

    .line 370
    .line 371
    const/4 v6, 0x1

    .line 372
    if-ne v15, v6, :cond_14

    .line 373
    .line 374
    move-object v13, v14

    .line 375
    goto :goto_f

    .line 376
    :cond_14
    if-nez v12, :cond_15

    .line 377
    .line 378
    new-instance v12, La0/c;

    .line 379
    .line 380
    new-array v6, v9, [Landroidx/compose/ui/e$c;

    .line 381
    .line 382
    const/4 v9, 0x0

    .line 383
    invoke-direct {v12, v6, v9}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 384
    .line 385
    .line 386
    :cond_15
    if-eqz v13, :cond_16

    .line 387
    .line 388
    invoke-virtual {v12, v13}, La0/c;->c(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    const/4 v13, 0x0

    .line 392
    :cond_16
    invoke-virtual {v12, v14}, La0/c;->c(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    :cond_17
    :goto_f
    invoke-virtual {v14}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 396
    .line 397
    .line 398
    move-result-object v14

    .line 399
    const/4 v6, 0x0

    .line 400
    const/16 v9, 0x10

    .line 401
    .line 402
    goto :goto_e

    .line 403
    :cond_18
    const/4 v6, 0x1

    .line 404
    if-ne v15, v6, :cond_19

    .line 405
    .line 406
    :goto_10
    const/4 v6, 0x0

    .line 407
    const/16 v9, 0x10

    .line 408
    .line 409
    goto :goto_c

    .line 410
    :cond_19
    :goto_11
    invoke-static {v12}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 411
    .line 412
    .line 413
    move-result-object v13

    .line 414
    goto :goto_10

    .line 415
    :cond_1a
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 416
    .line 417
    .line 418
    move-result-object v7

    .line 419
    const/4 v6, 0x0

    .line 420
    const/16 v9, 0x10

    .line 421
    .line 422
    goto/16 :goto_b

    .line 423
    .line 424
    :cond_1b
    invoke-virtual {v8}, LK0/J;->A0()LK0/J;

    .line 425
    .line 426
    .line 427
    move-result-object v8

    .line 428
    if-eqz v8, :cond_1c

    .line 429
    .line 430
    invoke-virtual {v8}, LK0/J;->t0()LK0/c0;

    .line 431
    .line 432
    .line 433
    move-result-object v6

    .line 434
    if-eqz v6, :cond_1c

    .line 435
    .line 436
    invoke-virtual {v6}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 437
    .line 438
    .line 439
    move-result-object v6

    .line 440
    move-object v7, v6

    .line 441
    goto :goto_12

    .line 442
    :cond_1c
    const/4 v7, 0x0

    .line 443
    :goto_12
    const/4 v6, 0x0

    .line 444
    const/16 v9, 0x10

    .line 445
    .line 446
    goto/16 :goto_a

    .line 447
    .line 448
    :cond_1d
    if-eqz v11, :cond_1e

    .line 449
    .line 450
    if-eqz v2, :cond_1e

    .line 451
    .line 452
    const/4 v5, 0x0

    .line 453
    const/4 v6, 0x1

    .line 454
    const/4 v9, 0x0

    .line 455
    invoke-static {v2, v9, v6, v6, v5}, Landroidx/compose/ui/focus/q;->c(Landroidx/compose/ui/focus/FocusTargetNode;ZZILjava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v7

    .line 459
    if-nez v7, :cond_1f

    .line 460
    .line 461
    return v9

    .line 462
    :cond_1e
    const/4 v6, 0x1

    .line 463
    :cond_1f
    invoke-static {v0}, Landroidx/compose/ui/focus/q;->d(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 464
    .line 465
    .line 466
    if-eqz v10, :cond_21

    .line 467
    .line 468
    invoke-virtual {v10}, La0/c;->p()I

    .line 469
    .line 470
    .line 471
    move-result v5

    .line 472
    sub-int/2addr v5, v6

    .line 473
    iget-object v6, v10, La0/c;->a:[Ljava/lang/Object;

    .line 474
    .line 475
    array-length v7, v6

    .line 476
    if-ge v5, v7, :cond_21

    .line 477
    .line 478
    :goto_13
    if-ltz v5, :cond_21

    .line 479
    .line 480
    aget-object v7, v6, v5

    .line 481
    .line 482
    check-cast v7, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 483
    .line 484
    invoke-interface {v1}, Lq0/j;->j()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 485
    .line 486
    .line 487
    move-result-object v8

    .line 488
    if-eq v8, v0, :cond_20

    .line 489
    .line 490
    const/16 v16, 0x0

    .line 491
    .line 492
    return v16

    .line 493
    :cond_20
    sget-object v8, Lq0/o;->b:Lq0/o;

    .line 494
    .line 495
    sget-object v9, Lq0/o;->d:Lq0/o;

    .line 496
    .line 497
    invoke-virtual {v7, v8, v9}, Landroidx/compose/ui/focus/FocusTargetNode;->I1(Lq0/n;Lq0/n;)V

    .line 498
    .line 499
    .line 500
    add-int/lit8 v5, v5, -0x1

    .line 501
    .line 502
    goto :goto_13

    .line 503
    :cond_21
    invoke-virtual {v4}, La0/c;->p()I

    .line 504
    .line 505
    .line 506
    move-result v5

    .line 507
    const/16 v17, 0x1

    .line 508
    .line 509
    add-int/lit8 v5, v5, -0x1

    .line 510
    .line 511
    iget-object v4, v4, La0/c;->a:[Ljava/lang/Object;

    .line 512
    .line 513
    array-length v6, v4

    .line 514
    if-ge v5, v6, :cond_24

    .line 515
    .line 516
    :goto_14
    if-ltz v5, :cond_24

    .line 517
    .line 518
    aget-object v6, v4, v5

    .line 519
    .line 520
    check-cast v6, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 521
    .line 522
    invoke-interface {v1}, Lq0/j;->j()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 523
    .line 524
    .line 525
    move-result-object v7

    .line 526
    if-eq v7, v0, :cond_22

    .line 527
    .line 528
    const/16 v16, 0x0

    .line 529
    .line 530
    return v16

    .line 531
    :cond_22
    if-ne v6, v2, :cond_23

    .line 532
    .line 533
    sget-object v7, Lq0/o;->a:Lq0/o;

    .line 534
    .line 535
    goto :goto_15

    .line 536
    :cond_23
    sget-object v7, Lq0/o;->d:Lq0/o;

    .line 537
    .line 538
    :goto_15
    sget-object v8, Lq0/o;->b:Lq0/o;

    .line 539
    .line 540
    invoke-virtual {v6, v7, v8}, Landroidx/compose/ui/focus/FocusTargetNode;->I1(Lq0/n;Lq0/n;)V

    .line 541
    .line 542
    .line 543
    add-int/lit8 v5, v5, -0x1

    .line 544
    .line 545
    goto :goto_14

    .line 546
    :cond_24
    invoke-interface {v1}, Lq0/j;->j()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    if-eq v2, v0, :cond_25

    .line 551
    .line 552
    const/16 v16, 0x0

    .line 553
    .line 554
    return v16

    .line 555
    :cond_25
    const/16 v16, 0x0

    .line 556
    .line 557
    sget-object v2, Lq0/o;->a:Lq0/o;

    .line 558
    .line 559
    invoke-virtual {v0, v3, v2}, Landroidx/compose/ui/focus/FocusTargetNode;->I1(Lq0/n;Lq0/n;)V

    .line 560
    .line 561
    .line 562
    invoke-interface {v1}, Lq0/j;->j()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 563
    .line 564
    .line 565
    move-result-object v1

    .line 566
    if-eq v1, v0, :cond_26

    .line 567
    .line 568
    return v16

    .line 569
    :cond_26
    sget-boolean v1, Ll0/h;->d:Z

    .line 570
    .line 571
    if-eqz v1, :cond_27

    .line 572
    .line 573
    invoke-static {v0}, LK0/k;->n(LK0/j;)LK0/J;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    invoke-virtual {v1}, LK0/J;->Z()Landroid/view/View;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    if-nez v1, :cond_27

    .line 582
    .line 583
    sget-object v1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    .line 584
    .line 585
    invoke-virtual {v1}, Landroidx/compose/ui/focus/d$a;->e()I

    .line 586
    .line 587
    .line 588
    move-result v1

    .line 589
    invoke-static {v1}, Landroidx/compose/ui/focus/d;->i(I)Landroidx/compose/ui/focus/d;

    .line 590
    .line 591
    .line 592
    move-result-object v1

    .line 593
    const/4 v5, 0x0

    .line 594
    invoke-static {v0, v1, v5}, Landroidx/compose/ui/focus/q;->j(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/d;Lr0/h;)Z

    .line 595
    .line 596
    .line 597
    :cond_27
    const/16 v17, 0x1

    .line 598
    .line 599
    return v17
.end method

.method private static final j(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/d;Lr0/h;)Z
    .locals 0

    .line 1
    invoke-static {p0}, LK0/k;->o(LK0/j;)LK0/p0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, LK0/p0;->getFocusOwner()Lq0/j;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0, p1, p2}, Lq0/j;->b(Landroidx/compose/ui/focus/d;Lr0/h;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method static synthetic k(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/d;Lr0/h;ILjava/lang/Object;)Z
    .locals 1

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/focus/q;->j(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/d;Lr0/h;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method private static final l(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;
    .locals 1

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/focus/r;->f(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    const-string v0, "ActiveParent with no focused child"

    .line 11
    .line 12
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p0
.end method
