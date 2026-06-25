.class public abstract LU/Z;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU/Z$f;
    }
.end annotation


# direct methods
.method private static final a(LU/W;Landroidx/compose/ui/e;Lie/o;LY/m;II)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    const v0, -0x4e7a54a0

    move-object/from16 v2, p3

    .line 1
    invoke-interface {v2, v0}, LY/m;->g(I)LY/m;

    move-result-object v2

    and-int/lit8 v5, p5, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v5, v4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    invoke-interface {v2, v1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_2
    move v5, v4

    :goto_1
    and-int/lit8 v6, p5, 0x2

    if-eqz v6, :cond_4

    or-int/lit8 v5, v5, 0x30

    :cond_3
    move-object/from16 v7, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-interface {v2, v7}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_2

    :cond_5
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v5, v8

    :goto_3
    and-int/lit8 v8, p5, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v5, v5, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_8

    invoke-interface {v2, v3}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v5, v8

    :cond_8
    :goto_5
    and-int/lit16 v8, v5, 0x93

    const/16 v9, 0x92

    if-ne v8, v9, :cond_a

    invoke-interface {v2}, LY/m;->i()Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_6

    .line 2
    :cond_9
    invoke-interface {v2}, LY/m;->K()V

    move-object v6, v7

    goto/16 :goto_c

    :cond_a
    :goto_6
    if-eqz v6, :cond_b

    .line 3
    sget-object v6, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    goto :goto_7

    :cond_b
    move-object v6, v7

    :goto_7
    invoke-static {}, LY/w;->L()Z

    move-result v7

    if-eqz v7, :cond_c

    const/4 v7, -0x1

    const-string v8, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:327)"

    .line 4
    invoke-static {v0, v5, v7, v8}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_c
    invoke-interface {v2}, LY/m;->D()Ljava/lang/Object;

    move-result-object v0

    .line 6
    sget-object v5, LY/m;->a:LY/m$a;

    invoke-virtual {v5}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v0, v5, :cond_d

    .line 7
    new-instance v0, LU/x;

    invoke-direct {v0}, LU/x;-><init>()V

    .line 8
    invoke-interface {v2, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 9
    :cond_d
    check-cast v0, LU/x;

    const v5, -0x4ae96be3

    invoke-interface {v2, v5}, LY/m;->V(I)V

    .line 10
    invoke-virtual {v0}, LU/x;->a()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/16 v7, 0x36

    const/4 v9, 0x1

    if-nez v5, :cond_10

    .line 11
    invoke-virtual {v0, v1}, LU/x;->d(Ljava/lang/Object;)V

    .line 12
    invoke-virtual {v0}, LU/x;->b()Ljava/util/List;

    move-result-object v5

    .line 13
    new-instance v10, Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v11

    const/4 v12, 0x0

    :goto_8
    if-ge v12, v11, :cond_e

    .line 15
    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 16
    check-cast v13, LU/w;

    .line 17
    invoke-virtual {v13}, LU/w;->c()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LU/W;

    .line 18
    invoke-interface {v10, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    goto :goto_8

    .line 19
    :cond_e
    invoke-static {v10}, LUd/u;->d1(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v5

    .line 20
    invoke-interface {v5, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_f

    .line 21
    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    :cond_f
    invoke-virtual {v0}, LU/x;->b()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->clear()V

    .line 23
    invoke-static {v5}, Lk1/a;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v10

    invoke-virtual {v0}, LU/x;->b()Ljava/util/List;

    move-result-object v11

    .line 24
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v12

    const/4 v13, 0x0

    :goto_9
    if-ge v13, v12, :cond_10

    .line 25
    invoke-interface {v10, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    .line 26
    check-cast v14, LU/W;

    .line 27
    new-instance v15, LU/w;

    new-instance v8, LU/Z$a;

    invoke-direct {v8, v14, v1, v5, v0}, LU/Z$a;-><init>(LU/W;LU/W;Ljava/util/List;LU/x;)V

    const v1, -0x62a075c5

    invoke-static {v1, v9, v8, v2, v7}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    move-result-object v1

    invoke-direct {v15, v14, v1}, LU/w;-><init>(Ljava/lang/Object;Lie/o;)V

    .line 28
    invoke-interface {v11, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v1, p0

    goto :goto_9

    .line 29
    :cond_10
    invoke-interface {v2}, LY/m;->O()V

    .line 30
    sget-object v1, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v1}, Ll0/e$a;->o()Ll0/e;

    move-result-object v1

    const/4 v5, 0x0

    .line 31
    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v1

    .line 32
    invoke-static {v2, v5}, LY/h;->a(LY/m;I)I

    move-result v8

    .line 33
    invoke-interface {v2}, LY/m;->r()LY/I;

    move-result-object v5

    .line 34
    invoke-static {v2, v6}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v10

    .line 35
    sget-object v11, LK0/g;->M:LK0/g$a;

    invoke-virtual {v11}, LK0/g$a;->a()Lie/a;

    move-result-object v12

    .line 36
    invoke-interface {v2}, LY/m;->j()LY/d;

    move-result-object v13

    if-nez v13, :cond_11

    invoke-static {}, LY/h;->d()V

    .line 37
    :cond_11
    invoke-interface {v2}, LY/m;->I()V

    .line 38
    invoke-interface {v2}, LY/m;->e()Z

    move-result v13

    if-eqz v13, :cond_12

    .line 39
    invoke-interface {v2, v12}, LY/m;->h(Lie/a;)V

    goto :goto_a

    .line 40
    :cond_12
    invoke-interface {v2}, LY/m;->s()V

    .line 41
    :goto_a
    invoke-static {v2}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v12

    .line 42
    invoke-virtual {v11}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v13

    invoke-static {v12, v1, v13}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 43
    invoke-virtual {v11}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v12, v5, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 44
    invoke-virtual {v11}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    .line 45
    invoke-interface {v12}, LY/m;->e()Z

    move-result v5

    if-nez v5, :cond_13

    invoke-interface {v12}, LY/m;->D()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v5, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_14

    .line 46
    :cond_13
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v12, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 47
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v12, v5, v1}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 48
    :cond_14
    invoke-virtual {v11}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v12, v10, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 49
    sget-object v1, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    const/4 v5, 0x0

    .line 50
    invoke-static {v2, v5}, LY/h;->c(LY/m;I)LY/d1;

    move-result-object v1

    invoke-virtual {v0, v1}, LU/x;->e(LY/d1;)V

    const v1, 0x6831aac1

    invoke-interface {v2, v1}, LY/m;->V(I)V

    .line 51
    invoke-virtual {v0}, LU/x;->b()Ljava/util/List;

    move-result-object v0

    .line 52
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    move v8, v5

    :goto_b
    if-ge v8, v1, :cond_15

    .line 53
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 54
    check-cast v5, LU/w;

    .line 55
    invoke-virtual {v5}, LU/w;->a()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LU/W;

    invoke-virtual {v5}, LU/w;->b()Lie/o;

    move-result-object v5

    const v11, 0x4796f93d

    invoke-interface {v2, v11, v10}, LY/m;->H(ILjava/lang/Object;)V

    new-instance v11, LU/Z$b;

    invoke-direct {v11, v3, v10}, LU/Z$b;-><init>(Lie/o;LU/W;)V

    const v10, -0x43ac567f

    invoke-static {v10, v9, v11, v2, v7}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    move-result-object v10

    const/4 v11, 0x6

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v5, v10, v2, v11}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2}, LY/m;->S()V

    add-int/lit8 v8, v8, 0x1

    goto :goto_b

    .line 56
    :cond_15
    invoke-interface {v2}, LY/m;->O()V

    .line 57
    invoke-interface {v2}, LY/m;->x()V

    .line 58
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {}, LY/w;->T()V

    .line 59
    :cond_16
    :goto_c
    invoke-interface {v2}, LY/m;->k()LY/B1;

    move-result-object v7

    if-eqz v7, :cond_17

    new-instance v0, LU/Z$c;

    move-object/from16 v1, p0

    move/from16 v5, p5

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, LU/Z$c;-><init>(LU/W;Landroidx/compose/ui/e;Lie/o;II)V

    invoke-interface {v7, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    :cond_17
    return-void
.end method

.method public static final b(LU/a0;Landroidx/compose/ui/e;Lie/o;LY/m;II)V
    .locals 11

    .line 1
    const v0, 0x1baacc01

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object v4

    .line 8
    and-int/lit8 p3, p5, 0x1

    .line 9
    .line 10
    if-eqz p3, :cond_0

    .line 11
    .line 12
    or-int/lit8 p3, p4, 0x6

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    and-int/lit8 p3, p4, 0x6

    .line 16
    .line 17
    if-nez p3, :cond_2

    .line 18
    .line 19
    invoke-interface {v4, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-eqz p3, :cond_1

    .line 24
    .line 25
    const/4 p3, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p3, 0x2

    .line 28
    :goto_0
    or-int/2addr p3, p4

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    move p3, p4

    .line 31
    :goto_1
    and-int/lit8 v1, p5, 0x2

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    or-int/lit8 p3, p3, 0x30

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_3
    and-int/lit8 v2, p4, 0x30

    .line 39
    .line 40
    if-nez v2, :cond_5

    .line 41
    .line 42
    invoke-interface {v4, p1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_4

    .line 47
    .line 48
    const/16 v2, 0x20

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_4
    const/16 v2, 0x10

    .line 52
    .line 53
    :goto_2
    or-int/2addr p3, v2

    .line 54
    :cond_5
    :goto_3
    and-int/lit8 v2, p5, 0x4

    .line 55
    .line 56
    if-eqz v2, :cond_6

    .line 57
    .line 58
    or-int/lit16 p3, p3, 0x180

    .line 59
    .line 60
    goto :goto_5

    .line 61
    :cond_6
    and-int/lit16 v3, p4, 0x180

    .line 62
    .line 63
    if-nez v3, :cond_8

    .line 64
    .line 65
    invoke-interface {v4, p2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_7

    .line 70
    .line 71
    const/16 v3, 0x100

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_7
    const/16 v3, 0x80

    .line 75
    .line 76
    :goto_4
    or-int/2addr p3, v3

    .line 77
    :cond_8
    :goto_5
    and-int/lit16 v3, p3, 0x93

    .line 78
    .line 79
    const/16 v5, 0x92

    .line 80
    .line 81
    if-ne v3, v5, :cond_a

    .line 82
    .line 83
    invoke-interface {v4}, LY/m;->i()Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-nez v3, :cond_9

    .line 88
    .line 89
    goto :goto_6

    .line 90
    :cond_9
    invoke-interface {v4}, LY/m;->K()V

    .line 91
    .line 92
    .line 93
    move-object v7, p1

    .line 94
    move-object v8, p2

    .line 95
    goto :goto_7

    .line 96
    :cond_a
    :goto_6
    if-eqz v1, :cond_b

    .line 97
    .line 98
    sget-object p1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 99
    .line 100
    :cond_b
    if-eqz v2, :cond_c

    .line 101
    .line 102
    sget-object p2, LU/q;->a:LU/q;

    .line 103
    .line 104
    invoke-virtual {p2}, LU/q;->a()Lie/o;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    :cond_c
    move-object v3, p2

    .line 109
    invoke-static {}, LY/w;->L()Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-eqz p2, :cond_d

    .line 114
    .line 115
    const/4 p2, -0x1

    .line 116
    const-string v1, "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:221)"

    .line 117
    .line 118
    invoke-static {v0, p3, p2, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 119
    .line 120
    .line 121
    :cond_d
    invoke-virtual {p0}, LU/a0;->b()LU/W;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-static {}, Landroidx/compose/ui/platform/w0;->c()LY/b1;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-interface {v4, v0}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, Landroidx/compose/ui/platform/i;

    .line 134
    .line 135
    invoke-interface {v4, p2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    invoke-interface {v4, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    or-int/2addr v1, v2

    .line 144
    invoke-interface {v4}, LY/m;->D()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    if-nez v1, :cond_e

    .line 149
    .line 150
    sget-object v1, LY/m;->a:LY/m$a;

    .line 151
    .line 152
    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    if-ne v2, v1, :cond_f

    .line 157
    .line 158
    :cond_e
    new-instance v2, LU/Z$d;

    .line 159
    .line 160
    const/4 v1, 0x0

    .line 161
    invoke-direct {v2, p2, v0, v1}, LU/Z$d;-><init>(LU/W;Landroidx/compose/ui/platform/i;LZd/e;)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v4, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :cond_f
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 168
    .line 169
    const/4 v0, 0x0

    .line 170
    invoke-static {p2, v2, v4, v0}, LY/b0;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, LU/a0;->b()LU/W;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    and-int/lit16 v5, p3, 0x3f0

    .line 178
    .line 179
    const/4 v6, 0x0

    .line 180
    move-object v2, p1

    .line 181
    invoke-static/range {v1 .. v6}, LU/Z;->a(LU/W;Landroidx/compose/ui/e;Lie/o;LY/m;II)V

    .line 182
    .line 183
    .line 184
    invoke-static {}, LY/w;->L()Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-eqz p1, :cond_10

    .line 189
    .line 190
    invoke-static {}, LY/w;->T()V

    .line 191
    .line 192
    .line 193
    :cond_10
    move-object v7, v2

    .line 194
    move-object v8, v3

    .line 195
    :goto_7
    invoke-interface {v4}, LY/m;->k()LY/B1;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    if-eqz p1, :cond_11

    .line 200
    .line 201
    new-instance v5, LU/Z$e;

    .line 202
    .line 203
    move-object v6, p0

    .line 204
    move v9, p4

    .line 205
    move/from16 v10, p5

    .line 206
    .line 207
    invoke-direct/range {v5 .. v10}, LU/Z$e;-><init>(LU/a0;Landroidx/compose/ui/e;Lie/o;II)V

    .line 208
    .line 209
    .line 210
    invoke-interface {p1, v5}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 211
    .line 212
    .line 213
    :cond_11
    return-void
.end method

.method public static final synthetic c(LU/W;Landroidx/compose/ui/e;Lie/o;LY/m;II)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, LU/Z;->a(LU/W;Landroidx/compose/ui/e;Lie/o;LY/m;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic d(Lw/i;ZLie/a;LY/m;II)LY/h2;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, LU/Z;->f(Lw/i;ZLie/a;LY/m;II)LY/h2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic e(Lw/i;ZLY/m;I)LY/h2;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LU/Z;->g(Lw/i;ZLY/m;I)LY/h2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final f(Lw/i;ZLie/a;LY/m;II)LY/h2;
    .locals 7

    .line 1
    and-int/lit8 p5, p5, 0x4

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p2, LU/Z$g;->a:LU/Z$g;

    .line 6
    .line 7
    :cond_0
    move-object v4, p2

    .line 8
    invoke-static {}, LY/w;->L()Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    const/4 p2, -0x1

    .line 15
    const-string p5, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:418)"

    .line 16
    .line 17
    const v0, 0x5558e4ee

    .line 18
    .line 19
    .line 20
    invoke-static {v0, p4, p2, p5}, LY/w;->U(IIILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-interface {p3}, LY/m;->D()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    sget-object p5, LY/m;->a:LY/m$a;

    .line 28
    .line 29
    invoke-virtual {p5}, LY/m$a;->a()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-ne p2, v0, :cond_3

    .line 34
    .line 35
    const/4 p2, 0x0

    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    const/high16 v0, 0x3f800000    # 1.0f

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move v0, p2

    .line 42
    :goto_0
    const/4 v1, 0x2

    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-static {v0, p2, v1, v2}, Lw/b;->b(FFILjava/lang/Object;)Lw/a;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-interface {p3, p2}, LY/m;->u(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_3
    move-object v1, p2

    .line 52
    check-cast v1, Lw/a;

    .line 53
    .line 54
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-interface {p3, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    and-int/lit8 v2, p4, 0x70

    .line 63
    .line 64
    xor-int/lit8 v2, v2, 0x30

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    const/4 v5, 0x1

    .line 68
    const/16 v6, 0x20

    .line 69
    .line 70
    if-le v2, v6, :cond_4

    .line 71
    .line 72
    invoke-interface {p3, p1}, LY/m;->a(Z)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-nez v2, :cond_5

    .line 77
    .line 78
    :cond_4
    and-int/lit8 v2, p4, 0x30

    .line 79
    .line 80
    if-ne v2, v6, :cond_6

    .line 81
    .line 82
    :cond_5
    move v2, v5

    .line 83
    goto :goto_1

    .line 84
    :cond_6
    move v2, v3

    .line 85
    :goto_1
    or-int/2addr v0, v2

    .line 86
    invoke-interface {p3, p0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    or-int/2addr v0, v2

    .line 91
    and-int/lit16 v2, p4, 0x380

    .line 92
    .line 93
    xor-int/lit16 v2, v2, 0x180

    .line 94
    .line 95
    const/16 v6, 0x100

    .line 96
    .line 97
    if-le v2, v6, :cond_7

    .line 98
    .line 99
    invoke-interface {p3, v4}, LY/m;->U(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-nez v2, :cond_8

    .line 104
    .line 105
    :cond_7
    and-int/lit16 v2, p4, 0x180

    .line 106
    .line 107
    if-ne v2, v6, :cond_9

    .line 108
    .line 109
    :cond_8
    move v3, v5

    .line 110
    :cond_9
    or-int/2addr v0, v3

    .line 111
    invoke-interface {p3}, LY/m;->D()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    if-nez v0, :cond_a

    .line 116
    .line 117
    invoke-virtual {p5}, LY/m$a;->a()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p5

    .line 121
    if-ne v2, p5, :cond_b

    .line 122
    .line 123
    :cond_a
    new-instance v0, LU/Z$h;

    .line 124
    .line 125
    const/4 v5, 0x0

    .line 126
    move-object v3, p0

    .line 127
    move v2, p1

    .line 128
    invoke-direct/range {v0 .. v5}, LU/Z$h;-><init>(Lw/a;ZLw/i;Lie/a;LZd/e;)V

    .line 129
    .line 130
    .line 131
    invoke-interface {p3, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    move-object v2, v0

    .line 135
    :cond_b
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 136
    .line 137
    shr-int/lit8 p0, p4, 0x3

    .line 138
    .line 139
    and-int/lit8 p0, p0, 0xe

    .line 140
    .line 141
    invoke-static {p2, v2, p3, p0}, LY/b0;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1}, Lw/a;->g()LY/h2;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-static {}, LY/w;->L()Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-eqz p1, :cond_c

    .line 153
    .line 154
    invoke-static {}, LY/w;->T()V

    .line 155
    .line 156
    .line 157
    :cond_c
    return-object p0
.end method

.method private static final g(Lw/i;ZLY/m;I)LY/h2;
    .locals 7

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
    const-string v1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:428)"

    .line 9
    .line 10
    const v2, 0x753b22a1

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p3, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, LY/m;->a:LY/m$a;

    .line 21
    .line 22
    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const/4 v3, 0x0

    .line 27
    if-ne v0, v2, :cond_2

    .line 28
    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    const/high16 v0, 0x3f800000    # 1.0f

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const v0, 0x3f4ccccd    # 0.8f

    .line 35
    .line 36
    .line 37
    :goto_0
    const/4 v2, 0x0

    .line 38
    const/4 v4, 0x2

    .line 39
    invoke-static {v0, v2, v4, v3}, Lw/b;->b(FFILjava/lang/Object;)Lw/a;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {p2, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    check-cast v0, Lw/a;

    .line 47
    .line 48
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-interface {p2, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    and-int/lit8 v5, p3, 0x70

    .line 57
    .line 58
    xor-int/lit8 v5, v5, 0x30

    .line 59
    .line 60
    const/16 v6, 0x20

    .line 61
    .line 62
    if-le v5, v6, :cond_3

    .line 63
    .line 64
    invoke-interface {p2, p1}, LY/m;->a(Z)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-nez v5, :cond_4

    .line 69
    .line 70
    :cond_3
    and-int/lit8 v5, p3, 0x30

    .line 71
    .line 72
    if-ne v5, v6, :cond_5

    .line 73
    .line 74
    :cond_4
    const/4 v5, 0x1

    .line 75
    goto :goto_1

    .line 76
    :cond_5
    const/4 v5, 0x0

    .line 77
    :goto_1
    or-int/2addr v4, v5

    .line 78
    invoke-interface {p2, p0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    or-int/2addr v4, v5

    .line 83
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    if-nez v4, :cond_6

    .line 88
    .line 89
    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    if-ne v5, v1, :cond_7

    .line 94
    .line 95
    :cond_6
    new-instance v5, LU/Z$i;

    .line 96
    .line 97
    invoke-direct {v5, v0, p1, p0, v3}, LU/Z$i;-><init>(Lw/a;ZLw/i;LZd/e;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {p2, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_7
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 104
    .line 105
    shr-int/lit8 p0, p3, 0x3

    .line 106
    .line 107
    and-int/lit8 p0, p0, 0xe

    .line 108
    .line 109
    invoke-static {v2, v5, p2, p0}, LY/b0;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Lw/a;->g()LY/h2;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-static {}, LY/w;->L()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz p1, :cond_8

    .line 121
    .line 122
    invoke-static {}, LY/w;->T()V

    .line 123
    .line 124
    .line 125
    :cond_8
    return-object p0
.end method

.method public static final h(LU/Y;ZLandroidx/compose/ui/platform/i;)J
    .locals 8

    .line 1
    sget-object v0, LU/Z$f;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    aget p0, v0, p0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p0, v0, :cond_2

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    if-eq p0, v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-ne p0, v0, :cond_0

    .line 17
    .line 18
    const-wide/16 v0, 0xfa0

    .line 19
    .line 20
    :goto_0
    move-wide v3, v0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    new-instance p0, LTd/r;

    .line 23
    .line 24
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 25
    .line 26
    .line 27
    throw p0

    .line 28
    :cond_1
    const-wide/16 v0, 0x2710

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const-wide v0, 0x7fffffffffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :goto_1
    if-nez p2, :cond_3

    .line 38
    .line 39
    return-wide v3

    .line 40
    :cond_3
    const/4 v5, 0x1

    .line 41
    const/4 v6, 0x1

    .line 42
    move v7, p1

    .line 43
    move-object v2, p2

    .line 44
    invoke-interface/range {v2 .. v7}, Landroidx/compose/ui/platform/i;->a(JZZZ)J

    .line 45
    .line 46
    .line 47
    move-result-wide p0

    .line 48
    return-wide p0
.end method
