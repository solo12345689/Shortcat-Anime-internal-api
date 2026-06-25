.class public final Lqf/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Lqf/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lqf/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lqf/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lqf/c;->a:Lqf/c;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final c(Lqf/u0;Luf/j;Luf/p;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Lqf/u0;->j()Luf/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p2}, Luf/r;->w(Luf/i;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    invoke-interface {v0, p2}, Luf/r;->b0(Luf/i;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    return p1

    .line 21
    :cond_1
    invoke-virtual {p1}, Lqf/u0;->o()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    invoke-interface {v0, p2}, Luf/r;->s(Luf/j;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    return v2

    .line 34
    :cond_2
    invoke-interface {v0, p2}, Luf/r;->e(Luf/j;)Luf/p;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-interface {v0, p1, p3}, Luf/r;->j0(Luf/p;Luf/p;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    return p1
.end method

.method private final e(Lqf/u0;Luf/j;Luf/j;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Lqf/u0;->j()Luf/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-boolean v1, Lqf/g;->b:Z

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-interface {v0, p2}, Luf/r;->a(Luf/j;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, p2}, Luf/r;->e(Luf/j;)Luf/p;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v0, v1}, Luf/r;->y(Luf/p;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Lqf/u0;->l(Luf/i;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    :cond_0
    invoke-interface {v0, p3}, Luf/r;->a(Luf/j;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1, p3}, Lqf/u0;->l(Luf/i;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    :cond_1
    invoke-interface {v0, p3}, Luf/r;->b0(Luf/i;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v2, 0x1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    return v2

    .line 47
    :cond_2
    invoke-interface {v0, p2}, Luf/r;->q(Luf/j;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_9

    .line 52
    .line 53
    invoke-interface {v0, p2}, Luf/r;->T(Luf/i;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    instance-of v1, p2, Luf/d;

    .line 61
    .line 62
    if-eqz v1, :cond_4

    .line 63
    .line 64
    move-object v1, p2

    .line 65
    check-cast v1, Luf/d;

    .line 66
    .line 67
    invoke-interface {v0, v1}, Luf/r;->C0(Luf/d;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    return v2

    .line 74
    :cond_4
    sget-object v1, Lqf/c;->a:Lqf/c;

    .line 75
    .line 76
    sget-object v3, Lqf/u0$c$b;->a:Lqf/u0$c$b;

    .line 77
    .line 78
    invoke-virtual {v1, p1, p2, v3}, Lqf/c;->a(Lqf/u0;Luf/j;Lqf/u0$c;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_5

    .line 83
    .line 84
    return v2

    .line 85
    :cond_5
    invoke-interface {v0, p3}, Luf/r;->q(Luf/j;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    const/4 v3, 0x0

    .line 90
    if-eqz v2, :cond_6

    .line 91
    .line 92
    return v3

    .line 93
    :cond_6
    sget-object v2, Lqf/u0$c$d;->a:Lqf/u0$c$d;

    .line 94
    .line 95
    invoke-virtual {v1, p1, p3, v2}, Lqf/c;->a(Lqf/u0;Luf/j;Lqf/u0$c;)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_7

    .line 100
    .line 101
    return v3

    .line 102
    :cond_7
    invoke-interface {v0, p2}, Luf/r;->x(Luf/j;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_8

    .line 107
    .line 108
    return v3

    .line 109
    :cond_8
    invoke-interface {v0, p3}, Luf/r;->e(Luf/j;)Luf/p;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    invoke-virtual {v1, p1, p2, p3}, Lqf/c;->b(Lqf/u0;Luf/j;Luf/p;)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    return p1

    .line 118
    :cond_9
    :goto_0
    return v2
.end method


# virtual methods
.method public final a(Lqf/u0;Luf/j;Lqf/u0$c;)Z
    .locals 7

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "type"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "supertypesPolicy"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lqf/u0;->j()Luf/r;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0, p2}, Luf/r;->x(Luf/j;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {v0, p2}, Luf/r;->b0(Luf/i;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    :cond_0
    invoke-interface {v0, p2}, Luf/r;->q(Luf/j;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    :cond_1
    return v2

    .line 40
    :cond_2
    invoke-virtual {p1}, Lqf/u0;->k()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lqf/u0;->h()Ljava/util/ArrayDeque;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lqf/u0;->i()Ljava/util/Set;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, p2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-nez p2, :cond_a

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    check-cast p2, Luf/j;

    .line 71
    .line 72
    invoke-static {p2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v3, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_3

    .line 80
    .line 81
    invoke-interface {v0, p2}, Luf/r;->b0(Luf/i;)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_4

    .line 86
    .line 87
    sget-object v4, Lqf/u0$c$c;->a:Lqf/u0$c$c;

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    move-object v4, p3

    .line 91
    :goto_1
    sget-object v5, Lqf/u0$c$c;->a:Lqf/u0$c$c;

    .line 92
    .line 93
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-nez v5, :cond_5

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    const/4 v4, 0x0

    .line 101
    :goto_2
    if-nez v4, :cond_6

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_6
    invoke-virtual {p1}, Lqf/u0;->j()Luf/r;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-interface {v5, p2}, Luf/r;->e(Luf/j;)Luf/p;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-interface {v5, p2}, Luf/r;->E(Luf/p;)Ljava/util/Collection;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_3

    .line 125
    .line 126
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    check-cast v5, Luf/i;

    .line 131
    .line 132
    invoke-virtual {v4, p1, v5}, Lqf/u0$c;->a(Lqf/u0;Luf/i;)Luf/j;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-interface {v0, v5}, Luf/r;->x(Luf/j;)Z

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    if-eqz v6, :cond_7

    .line 141
    .line 142
    invoke-interface {v0, v5}, Luf/r;->b0(Luf/i;)Z

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    if-eqz v6, :cond_8

    .line 147
    .line 148
    :cond_7
    invoke-interface {v0, v5}, Luf/r;->q(Luf/j;)Z

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    if-eqz v6, :cond_9

    .line 153
    .line 154
    :cond_8
    invoke-virtual {p1}, Lqf/u0;->e()V

    .line 155
    .line 156
    .line 157
    return v2

    .line 158
    :cond_9
    invoke-virtual {v1, v5}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_a
    invoke-virtual {p1}, Lqf/u0;->e()V

    .line 163
    .line 164
    .line 165
    const/4 p1, 0x0

    .line 166
    return p1
.end method

.method public final b(Lqf/u0;Luf/j;Luf/p;)Z
    .locals 7

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "start"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "end"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lqf/u0;->j()Luf/r;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, Lqf/c;->a:Lqf/c;

    .line 21
    .line 22
    invoke-direct {v1, p1, p2, p3}, Lqf/c;->c(Lqf/u0;Luf/j;Luf/p;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    return v2

    .line 30
    :cond_0
    invoke-virtual {p1}, Lqf/u0;->k()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lqf/u0;->h()Ljava/util/ArrayDeque;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lqf/u0;->i()Ljava/util/Set;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-nez p2, :cond_6

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    check-cast p2, Luf/j;

    .line 61
    .line 62
    invoke-static {p2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v3, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_1

    .line 70
    .line 71
    invoke-interface {v0, p2}, Luf/r;->b0(Luf/i;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_2

    .line 76
    .line 77
    sget-object v4, Lqf/u0$c$c;->a:Lqf/u0$c$c;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    sget-object v4, Lqf/u0$c$b;->a:Lqf/u0$c$b;

    .line 81
    .line 82
    :goto_1
    sget-object v5, Lqf/u0$c$c;->a:Lqf/u0$c$c;

    .line 83
    .line 84
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-nez v5, :cond_3

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    const/4 v4, 0x0

    .line 92
    :goto_2
    if-nez v4, :cond_4

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_4
    invoke-virtual {p1}, Lqf/u0;->j()Luf/r;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-interface {v5, p2}, Luf/r;->e(Luf/j;)Luf/p;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-interface {v5, p2}, Luf/r;->E(Luf/p;)Ljava/util/Collection;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-eqz v5, :cond_1

    .line 116
    .line 117
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    check-cast v5, Luf/i;

    .line 122
    .line 123
    invoke-virtual {v4, p1, v5}, Lqf/u0$c;->a(Lqf/u0;Luf/i;)Luf/j;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    sget-object v6, Lqf/c;->a:Lqf/c;

    .line 128
    .line 129
    invoke-direct {v6, p1, v5, p3}, Lqf/c;->c(Lqf/u0;Luf/j;Luf/p;)Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-eqz v6, :cond_5

    .line 134
    .line 135
    invoke-virtual {p1}, Lqf/u0;->e()V

    .line 136
    .line 137
    .line 138
    return v2

    .line 139
    :cond_5
    invoke-virtual {v1, v5}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_6
    invoke-virtual {p1}, Lqf/u0;->e()V

    .line 144
    .line 145
    .line 146
    const/4 p1, 0x0

    .line 147
    return p1
.end method

.method public final d(Lqf/u0;Luf/j;Luf/j;)Z
    .locals 1

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "subType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "superType"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, p2, p3}, Lqf/c;->e(Lqf/u0;Luf/j;Luf/j;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
.end method
