.class public abstract Lw/p0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lkotlin/jvm/functions/Function1;

.field private static final b:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lw/p0$b;->a:Lw/p0$b;

    .line 2
    .line 3
    sput-object v0, Lw/p0;->a:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    sget-object v0, LTd/q;->c:LTd/q;

    .line 6
    .line 7
    sget-object v1, Lw/p0$a;->a:Lw/p0$a;

    .line 8
    .line 9
    invoke-static {v0, v1}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lw/p0;->b:Lkotlin/Lazy;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(Lw/o0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;LY/m;I)Lw/o0;
    .locals 8

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1825)"

    .line 9
    .line 10
    const v2, -0xbd1ef36

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p5, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    and-int/lit8 v0, p5, 0xe

    .line 17
    .line 18
    xor-int/lit8 v0, v0, 0x6

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x4

    .line 23
    if-le v0, v3, :cond_1

    .line 24
    .line 25
    invoke-interface {p4, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_2

    .line 30
    .line 31
    :cond_1
    and-int/lit8 v4, p5, 0x6

    .line 32
    .line 33
    if-ne v4, v3, :cond_3

    .line 34
    .line 35
    :cond_2
    move v4, v1

    .line 36
    goto :goto_0

    .line 37
    :cond_3
    move v4, v2

    .line 38
    :goto_0
    invoke-interface {p4}, LY/m;->D()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    if-nez v4, :cond_4

    .line 43
    .line 44
    sget-object v4, LY/m;->a:LY/m$a;

    .line 45
    .line 46
    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-ne v5, v4, :cond_5

    .line 51
    .line 52
    :cond_4
    new-instance v5, Lw/o0;

    .line 53
    .line 54
    new-instance v4, Lw/V;

    .line 55
    .line 56
    invoke-direct {v4, p1}, Lw/V;-><init>(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance v6, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lw/o0;->j()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v7, " > "

    .line 72
    .line 73
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    invoke-direct {v5, v4, p0, p3}, Lw/o0;-><init>(Lw/q0;Lw/o0;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p4, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :cond_5
    check-cast v5, Lw/o0;

    .line 90
    .line 91
    if-le v0, v3, :cond_6

    .line 92
    .line 93
    invoke-interface {p4, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    if-nez p3, :cond_8

    .line 98
    .line 99
    :cond_6
    and-int/lit8 p3, p5, 0x6

    .line 100
    .line 101
    if-ne p3, v3, :cond_7

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_7
    move v1, v2

    .line 105
    :cond_8
    :goto_1
    invoke-interface {p4, v5}, LY/m;->U(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p3

    .line 109
    or-int/2addr p3, v1

    .line 110
    invoke-interface {p4}, LY/m;->D()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p5

    .line 114
    if-nez p3, :cond_9

    .line 115
    .line 116
    sget-object p3, LY/m;->a:LY/m$a;

    .line 117
    .line 118
    invoke-virtual {p3}, LY/m$a;->a()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p3

    .line 122
    if-ne p5, p3, :cond_a

    .line 123
    .line 124
    :cond_9
    new-instance p5, Lw/p0$c;

    .line 125
    .line 126
    invoke-direct {p5, p0, v5}, Lw/p0$c;-><init>(Lw/o0;Lw/o0;)V

    .line 127
    .line 128
    .line 129
    invoke-interface {p4, p5}, LY/m;->u(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_a
    check-cast p5, Lkotlin/jvm/functions/Function1;

    .line 133
    .line 134
    invoke-static {v5, p5, p4, v2}, LY/b0;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LY/m;I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Lw/o0;->s()Z

    .line 138
    .line 139
    .line 140
    move-result p3

    .line 141
    if-eqz p3, :cond_b

    .line 142
    .line 143
    invoke-virtual {p0}, Lw/o0;->k()J

    .line 144
    .line 145
    .line 146
    move-result-wide p3

    .line 147
    invoke-virtual {v5, p1, p2, p3, p4}, Lw/o0;->D(Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_b
    invoke-virtual {v5, p2}, Lw/o0;->L(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v5, v2}, Lw/o0;->F(Z)V

    .line 155
    .line 156
    .line 157
    :goto_2
    invoke-static {}, LY/w;->L()Z

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    if-eqz p0, :cond_c

    .line 162
    .line 163
    invoke-static {}, LY/w;->T()V

    .line 164
    .line 165
    .line 166
    :cond_c
    return-object v5
.end method

.method public static final b(Lw/o0;Lw/s0;Ljava/lang/String;LY/m;II)Lw/o0$a;
    .locals 5

    .line 1
    and-int/lit8 p5, p5, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const-string p2, "DeferredAnimation"

    .line 6
    .line 7
    :cond_0
    invoke-static {}, LY/w;->L()Z

    .line 8
    .line 9
    .line 10
    move-result p5

    .line 11
    if-eqz p5, :cond_1

    .line 12
    .line 13
    const/4 p5, -0x1

    .line 14
    const-string v0, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1779)"

    .line 15
    .line 16
    const v1, -0x662b6f20

    .line 17
    .line 18
    .line 19
    invoke-static {v1, p4, p5, v0}, LY/w;->U(IIILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    and-int/lit8 p5, p4, 0xe

    .line 23
    .line 24
    xor-int/lit8 p5, p5, 0x6

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    const/4 v1, 0x0

    .line 28
    const/4 v2, 0x4

    .line 29
    if-le p5, v2, :cond_2

    .line 30
    .line 31
    invoke-interface {p3, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_3

    .line 36
    .line 37
    :cond_2
    and-int/lit8 v3, p4, 0x6

    .line 38
    .line 39
    if-ne v3, v2, :cond_4

    .line 40
    .line 41
    :cond_3
    move v3, v0

    .line 42
    goto :goto_0

    .line 43
    :cond_4
    move v3, v1

    .line 44
    :goto_0
    invoke-interface {p3}, LY/m;->D()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    if-nez v3, :cond_5

    .line 49
    .line 50
    sget-object v3, LY/m;->a:LY/m$a;

    .line 51
    .line 52
    invoke-virtual {v3}, LY/m$a;->a()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    if-ne v4, v3, :cond_6

    .line 57
    .line 58
    :cond_5
    new-instance v4, Lw/o0$a;

    .line 59
    .line 60
    invoke-direct {v4, p0, p1, p2}, Lw/o0$a;-><init>(Lw/o0;Lw/s0;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p3, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_6
    check-cast v4, Lw/o0$a;

    .line 67
    .line 68
    if-le p5, v2, :cond_7

    .line 69
    .line 70
    invoke-interface {p3, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_9

    .line 75
    .line 76
    :cond_7
    and-int/lit8 p1, p4, 0x6

    .line 77
    .line 78
    if-ne p1, v2, :cond_8

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_8
    move v0, v1

    .line 82
    :cond_9
    :goto_1
    invoke-interface {p3, v4}, LY/m;->F(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    or-int/2addr p1, v0

    .line 87
    invoke-interface {p3}, LY/m;->D()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    if-nez p1, :cond_a

    .line 92
    .line 93
    sget-object p1, LY/m;->a:LY/m$a;

    .line 94
    .line 95
    invoke-virtual {p1}, LY/m$a;->a()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-ne p2, p1, :cond_b

    .line 100
    .line 101
    :cond_a
    new-instance p2, Lw/p0$d;

    .line 102
    .line 103
    invoke-direct {p2, p0, v4}, Lw/p0$d;-><init>(Lw/o0;Lw/o0$a;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {p3, p2}, LY/m;->u(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_b
    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 110
    .line 111
    invoke-static {v4, p2, p3, v1}, LY/b0;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LY/m;I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Lw/o0;->s()Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-eqz p0, :cond_c

    .line 119
    .line 120
    invoke-virtual {v4}, Lw/o0$a;->d()V

    .line 121
    .line 122
    .line 123
    :cond_c
    invoke-static {}, LY/w;->L()Z

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    if-eqz p0, :cond_d

    .line 128
    .line 129
    invoke-static {}, LY/w;->T()V

    .line 130
    .line 131
    .line 132
    :cond_d
    return-object v4
.end method

.method public static final c(Lw/o0;Ljava/lang/Object;Ljava/lang/Object;Lw/G;Lw/s0;Ljava/lang/String;LY/m;I)LY/h2;
    .locals 14

    .line 1
    move-object/from16 v6, p2

    .line 2
    .line 3
    move-object/from16 v7, p3

    .line 4
    .line 5
    move-object/from16 v8, p6

    .line 6
    .line 7
    move/from16 v9, p7

    .line 8
    .line 9
    invoke-static {}, LY/w;->L()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, -0x1

    .line 16
    const-string v2, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1900)"

    .line 17
    .line 18
    const v3, -0x122b33ce

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v9, v0, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    and-int/lit8 v0, v9, 0xe

    .line 25
    .line 26
    xor-int/lit8 v10, v0, 0x6

    .line 27
    .line 28
    const/4 v11, 0x1

    .line 29
    const/4 v12, 0x0

    .line 30
    const/4 v13, 0x4

    .line 31
    if-le v10, v13, :cond_1

    .line 32
    .line 33
    invoke-interface {v8, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    :cond_1
    and-int/lit8 v0, v9, 0x6

    .line 40
    .line 41
    if-ne v0, v13, :cond_3

    .line 42
    .line 43
    :cond_2
    move v0, v11

    .line 44
    goto :goto_0

    .line 45
    :cond_3
    move v0, v12

    .line 46
    :goto_0
    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-nez v0, :cond_4

    .line 51
    .line 52
    sget-object v0, LY/m;->a:LY/m$a;

    .line 53
    .line 54
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-ne v2, v0, :cond_5

    .line 59
    .line 60
    :cond_4
    new-instance v0, Lw/o0$d;

    .line 61
    .line 62
    move-object/from16 v4, p4

    .line 63
    .line 64
    invoke-static {v4, v6}, Lw/l;->i(Lw/s0;Ljava/lang/Object;)Lw/q;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    move-object v1, p0

    .line 69
    move-object v2, p1

    .line 70
    move-object/from16 v5, p5

    .line 71
    .line 72
    invoke-direct/range {v0 .. v5}, Lw/o0$d;-><init>(Lw/o0;Ljava/lang/Object;Lw/q;Lw/s0;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v8, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move-object v2, v0

    .line 79
    :cond_5
    check-cast v2, Lw/o0$d;

    .line 80
    .line 81
    invoke-virtual {p0}, Lw/o0;->s()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_6

    .line 86
    .line 87
    invoke-virtual {v2, p1, v6, v7}, Lw/o0$d;->F(Ljava/lang/Object;Ljava/lang/Object;Lw/G;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_6
    invoke-virtual {v2, v6, v7}, Lw/o0$d;->G(Ljava/lang/Object;Lw/G;)V

    .line 92
    .line 93
    .line 94
    :goto_1
    if-le v10, v13, :cond_7

    .line 95
    .line 96
    invoke-interface {v8, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_9

    .line 101
    .line 102
    :cond_7
    and-int/lit8 v0, v9, 0x6

    .line 103
    .line 104
    if-ne v0, v13, :cond_8

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_8
    move v11, v12

    .line 108
    :cond_9
    :goto_2
    invoke-interface {v8, v2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    or-int/2addr v0, v11

    .line 113
    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    if-nez v0, :cond_a

    .line 118
    .line 119
    sget-object v0, LY/m;->a:LY/m$a;

    .line 120
    .line 121
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-ne v3, v0, :cond_b

    .line 126
    .line 127
    :cond_a
    new-instance v3, Lw/p0$e;

    .line 128
    .line 129
    invoke-direct {v3, p0, v2}, Lw/p0$e;-><init>(Lw/o0;Lw/o0$d;)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v8, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_b
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 136
    .line 137
    invoke-static {v2, v3, v8, v12}, LY/b0;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LY/m;I)V

    .line 138
    .line 139
    .line 140
    invoke-static {}, LY/w;->L()Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_c

    .line 145
    .line 146
    invoke-static {}, LY/w;->T()V

    .line 147
    .line 148
    .line 149
    :cond_c
    return-object v2
.end method

.method public static final d(Ljava/lang/Object;Ljava/lang/String;LY/m;II)Lw/o0;
    .locals 2

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-static {}, LY/w;->L()Z

    .line 7
    .line 8
    .line 9
    move-result p4

    .line 10
    if-eqz p4, :cond_1

    .line 11
    .line 12
    const/4 p4, -0x1

    .line 13
    const-string v0, "androidx.compose.animation.core.updateTransition (Transition.kt:91)"

    .line 14
    .line 15
    const v1, 0x78f2a0ad

    .line 16
    .line 17
    .line 18
    invoke-static {v1, p3, p4, v0}, LY/w;->U(IIILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p4

    .line 25
    sget-object v0, LY/m;->a:LY/m$a;

    .line 26
    .line 27
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-ne p4, v1, :cond_2

    .line 32
    .line 33
    new-instance p4, Lw/o0;

    .line 34
    .line 35
    invoke-direct {p4, p0, p1}, Lw/o0;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p2, p4}, LY/m;->u(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    check-cast p4, Lw/o0;

    .line 42
    .line 43
    and-int/lit8 p1, p3, 0x8

    .line 44
    .line 45
    or-int/lit8 p1, p1, 0x30

    .line 46
    .line 47
    and-int/lit8 p3, p3, 0xe

    .line 48
    .line 49
    or-int/2addr p1, p3

    .line 50
    invoke-virtual {p4, p0, p2, p1}, Lw/o0;->e(Ljava/lang/Object;LY/m;I)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p0, p1, :cond_3

    .line 62
    .line 63
    new-instance p0, Lw/p0$f;

    .line 64
    .line 65
    invoke-direct {p0, p4}, Lw/p0$f;-><init>(Lw/o0;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p2, p0}, LY/m;->u(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 72
    .line 73
    const/16 p1, 0x36

    .line 74
    .line 75
    invoke-static {p4, p0, p2, p1}, LY/b0;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LY/m;I)V

    .line 76
    .line 77
    .line 78
    invoke-static {}, LY/w;->L()Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eqz p0, :cond_4

    .line 83
    .line 84
    invoke-static {}, LY/w;->T()V

    .line 85
    .line 86
    .line 87
    :cond_4
    return-object p4
.end method
