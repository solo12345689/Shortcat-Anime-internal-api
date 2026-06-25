.class public abstract LE/r;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Landroidx/compose/ui/e;LE/I;LE/F;LC/A;ZZLz/n;ZLC/b$m;LC/b$e;Lkotlin/jvm/functions/Function1;LY/m;III)V
    .locals 24

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v5, p5

    move-object/from16 v12, p10

    move/from16 v13, p12

    move/from16 v14, p14

    const v0, -0x26b96c2e

    move-object/from16 v3, p11

    .line 1
    invoke-interface {v3, v0}, LY/m;->g(I)LY/m;

    move-result-object v8

    and-int/lit8 v3, v14, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v7, v13, 0x6

    move v9, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v13, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-interface {v8, v7}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x4

    goto :goto_0

    :cond_1
    const/4 v9, 0x2

    :goto_0
    or-int/2addr v9, v13

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v9, v13

    :goto_1
    and-int/lit8 v10, v14, 0x2

    if-eqz v10, :cond_3

    or-int/lit8 v9, v9, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v10, v13, 0x30

    if-nez v10, :cond_5

    invoke-interface {v8, v1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x20

    goto :goto_2

    :cond_4
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v9, v10

    :cond_5
    :goto_3
    and-int/lit8 v10, v14, 0x4

    if-eqz v10, :cond_6

    or-int/lit16 v9, v9, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v10, v13, 0x180

    if-nez v10, :cond_9

    and-int/lit16 v10, v13, 0x200

    if-nez v10, :cond_7

    invoke-interface {v8, v2}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v10

    goto :goto_4

    :cond_7
    invoke-interface {v8, v2}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v10

    :goto_4
    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_5

    :cond_8
    const/16 v10, 0x80

    :goto_5
    or-int/2addr v9, v10

    :cond_9
    :goto_6
    and-int/lit8 v10, v14, 0x8

    if-eqz v10, :cond_b

    or-int/lit16 v9, v9, 0xc00

    :cond_a
    move-object/from16 v11, p3

    goto :goto_8

    :cond_b
    and-int/lit16 v11, v13, 0xc00

    if-nez v11, :cond_a

    move-object/from16 v11, p3

    invoke-interface {v8, v11}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_c

    const/16 v15, 0x800

    goto :goto_7

    :cond_c
    const/16 v15, 0x400

    :goto_7
    or-int/2addr v9, v15

    :goto_8
    and-int/lit8 v15, v14, 0x10

    if-eqz v15, :cond_e

    or-int/lit16 v9, v9, 0x6000

    :cond_d
    move/from16 v4, p4

    goto :goto_a

    :cond_e
    and-int/lit16 v4, v13, 0x6000

    if-nez v4, :cond_d

    move/from16 v4, p4

    invoke-interface {v8, v4}, LY/m;->a(Z)Z

    move-result v16

    if-eqz v16, :cond_f

    const/16 v16, 0x4000

    goto :goto_9

    :cond_f
    const/16 v16, 0x2000

    :goto_9
    or-int v9, v9, v16

    :goto_a
    and-int/lit8 v16, v14, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_10

    or-int v9, v9, v17

    goto :goto_c

    :cond_10
    and-int v16, v13, v17

    if-nez v16, :cond_12

    invoke-interface {v8, v5}, LY/m;->a(Z)Z

    move-result v16

    if-eqz v16, :cond_11

    const/high16 v16, 0x20000

    goto :goto_b

    :cond_11
    const/high16 v16, 0x10000

    :goto_b
    or-int v9, v9, v16

    :cond_12
    :goto_c
    const/high16 v16, 0x180000

    and-int v16, v13, v16

    if-nez v16, :cond_14

    and-int/lit8 v16, v14, 0x40

    move-object/from16 v0, p6

    if-nez v16, :cond_13

    invoke-interface {v8, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_13

    const/high16 v17, 0x100000

    goto :goto_d

    :cond_13
    const/high16 v17, 0x80000

    :goto_d
    or-int v9, v9, v17

    goto :goto_e

    :cond_14
    move-object/from16 v0, p6

    :goto_e
    and-int/lit16 v6, v14, 0x80

    const/high16 v18, 0xc00000

    if-eqz v6, :cond_16

    or-int v9, v9, v18

    :cond_15
    move/from16 v6, p7

    goto :goto_10

    :cond_16
    and-int v6, v13, v18

    if-nez v6, :cond_15

    move/from16 v6, p7

    invoke-interface {v8, v6}, LY/m;->a(Z)Z

    move-result v18

    if-eqz v18, :cond_17

    const/high16 v18, 0x800000

    goto :goto_f

    :cond_17
    const/high16 v18, 0x400000

    :goto_f
    or-int v9, v9, v18

    :goto_10
    and-int/lit16 v0, v14, 0x100

    const/high16 v18, 0x6000000

    if-eqz v0, :cond_19

    or-int v9, v9, v18

    :cond_18
    move-object/from16 v0, p8

    goto :goto_12

    :cond_19
    and-int v0, v13, v18

    if-nez v0, :cond_18

    move-object/from16 v0, p8

    invoke-interface {v8, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1a

    const/high16 v18, 0x4000000

    goto :goto_11

    :cond_1a
    const/high16 v18, 0x2000000

    :goto_11
    or-int v9, v9, v18

    :goto_12
    and-int/lit16 v0, v14, 0x200

    const/high16 v18, 0x30000000

    if-eqz v0, :cond_1c

    or-int v9, v9, v18

    :cond_1b
    move-object/from16 v0, p9

    goto :goto_14

    :cond_1c
    and-int v0, v13, v18

    if-nez v0, :cond_1b

    move-object/from16 v0, p9

    invoke-interface {v8, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1d

    const/high16 v18, 0x20000000

    goto :goto_13

    :cond_1d
    const/high16 v18, 0x10000000

    :goto_13
    or-int v9, v9, v18

    :goto_14
    and-int/lit16 v0, v14, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v0, p13, 0x6

    goto :goto_16

    :cond_1e
    and-int/lit8 v0, p13, 0x6

    if-nez v0, :cond_20

    invoke-interface {v8, v12}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1f

    const/4 v0, 0x4

    goto :goto_15

    :cond_1f
    const/4 v0, 0x2

    :goto_15
    or-int v0, p13, v0

    goto :goto_16

    :cond_20
    move/from16 v0, p13

    :goto_16
    const v18, 0x12492493

    and-int v2, v9, v18

    move/from16 p11, v3

    const v3, 0x12492492

    if-ne v2, v3, :cond_22

    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_22

    invoke-interface {v8}, LY/m;->i()Z

    move-result v2

    if-nez v2, :cond_21

    goto :goto_17

    .line 2
    :cond_21
    invoke-interface {v8}, LY/m;->K()V

    move v5, v4

    move-object v1, v7

    move-object v4, v11

    move-object/from16 v7, p6

    goto/16 :goto_1d

    .line 3
    :cond_22
    :goto_17
    invoke-interface {v8}, LY/m;->G()V

    and-int/lit8 v2, v13, 0x1

    const/4 v3, 0x6

    if-eqz v2, :cond_25

    invoke-interface {v8}, LY/m;->N()Z

    move-result v2

    if-eqz v2, :cond_23

    goto :goto_18

    .line 4
    :cond_23
    invoke-interface {v8}, LY/m;->K()V

    and-int/lit8 v2, v14, 0x40

    if-eqz v2, :cond_24

    const v2, -0x380001

    and-int/2addr v9, v2

    :cond_24
    move-object/from16 v17, p6

    move-object v15, v7

    move v2, v9

    move v7, v3

    move-object v3, v11

    goto :goto_1b

    :cond_25
    :goto_18
    if-eqz p11, :cond_26

    .line 5
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    goto :goto_19

    :cond_26
    move-object v2, v7

    :goto_19
    if-eqz v10, :cond_27

    const/4 v7, 0x0

    int-to-float v7, v7

    .line 6
    invoke-static {v7}, Li1/h;->n(F)F

    move-result v7

    .line 7
    invoke-static {v7}, Landroidx/compose/foundation/layout/p;->a(F)LC/A;

    move-result-object v7

    goto :goto_1a

    :cond_27
    move-object v7, v11

    :goto_1a
    if-eqz v15, :cond_28

    const/4 v4, 0x0

    :cond_28
    and-int/lit8 v10, v14, 0x40

    if-eqz v10, :cond_29

    .line 8
    sget-object v10, Lz/w;->a:Lz/w;

    invoke-virtual {v10, v8, v3}, Lz/w;->a(LY/m;I)Lz/n;

    move-result-object v10

    const v11, -0x380001

    and-int/2addr v9, v11

    move-object v15, v7

    move v7, v3

    move-object v3, v15

    move-object v15, v2

    move v2, v9

    move-object/from16 v17, v10

    goto :goto_1b

    :cond_29
    move-object v15, v7

    move v7, v3

    move-object v3, v15

    move-object/from16 v17, p6

    move-object v15, v2

    move v2, v9

    :goto_1b
    invoke-interface {v8}, LY/m;->y()V

    invoke-static {}, LY/w;->L()Z

    move-result v9

    if-eqz v9, :cond_2a

    const-string v9, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)"

    const v10, -0x26b96c2e

    .line 9
    invoke-static {v10, v2, v0, v9}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2a
    shr-int/lit8 v9, v2, 0x3

    and-int/lit8 v10, v9, 0xe

    shl-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v10

    .line 10
    invoke-static {v1, v12, v8, v0}, LE/n;->a(LE/I;Lkotlin/jvm/functions/Function1;LY/m;I)Lie/a;

    move-result-object v0

    shr-int/lit8 v16, v2, 0x9

    and-int/lit8 v11, v16, 0x70

    or-int/2addr v11, v10

    .line 11
    invoke-static {v1, v4, v8, v11}, LE/K;->a(LE/I;ZLY/m;I)LF/C;

    move-result-object v18

    .line 12
    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    move-result-object v11

    .line 13
    sget-object v19, LY/m;->a:LY/m$a;

    invoke-virtual/range {v19 .. v19}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v11, v7, :cond_2b

    .line 14
    sget-object v7, LZd/j;->a:LZd/j;

    .line 15
    invoke-static {v7, v8}, LY/b0;->i(LZd/i;LY/m;)LGf/O;

    move-result-object v7

    .line 16
    new-instance v11, LY/L;

    invoke-direct {v11, v7}, LY/L;-><init>(LGf/O;)V

    .line 17
    invoke-interface {v8, v11}, LY/m;->u(Ljava/lang/Object;)V

    .line 18
    :cond_2b
    check-cast v11, LY/L;

    .line 19
    invoke-virtual {v11}, LY/L;->a()LGf/O;

    move-result-object v7

    .line 20
    invoke-static {}, Landroidx/compose/ui/platform/w0;->h()LY/b1;

    move-result-object v11

    .line 21
    invoke-interface {v8, v11}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v11

    .line 22
    check-cast v11, Ls0/Z0;

    and-int/lit8 v19, v2, 0x70

    const v20, 0xe000

    and-int v20, v2, v20

    const v21, 0x7fff0

    and-int v21, v2, v21

    const/high16 v22, 0x380000

    and-int v22, v16, v22

    or-int v21, v21, v22

    const/high16 v22, 0x1c00000

    and-int v22, v9, v22

    or-int v21, v21, v22

    move-object/from16 v6, p9

    move v12, v9

    move v13, v10

    move-object v9, v11

    move/from16 v11, v21

    const/16 v22, 0x6

    move/from16 v21, v2

    move-object v10, v8

    move-object/from16 v2, p2

    move-object v8, v7

    move-object/from16 v7, p8

    .line 23
    invoke-static/range {v0 .. v11}, LE/r;->b(Lie/a;LE/I;LE/F;LC/A;ZZLC/b$e;LC/b$m;LGf/O;Ls0/Z0;LY/m;I)Lkotlin/jvm/functions/Function2;

    move-result-object v11

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    move-object/from16 v23, v3

    move-object v8, v10

    if-eqz p5, :cond_2c

    .line 24
    sget-object v2, Lz/q;->a:Lz/q;

    goto :goto_1c

    :cond_2c
    sget-object v2, Lz/q;->b:Lz/q;

    .line 25
    :goto_1c
    invoke-virtual {v0}, LE/I;->z()LI0/L;

    move-result-object v3

    invoke-interface {v15, v3}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    .line 26
    invoke-virtual {v0}, LE/I;->m()LF/b;

    move-result-object v5

    invoke-interface {v3, v5}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    const v5, 0xe000

    and-int v5, v16, v5

    shl-int/lit8 v6, v21, 0x3

    const/high16 v7, 0x70000

    and-int/2addr v6, v7

    or-int/2addr v5, v6

    move v6, v4

    move-object v7, v8

    move-object v4, v2

    move v8, v5

    move/from16 v5, p7

    move-object v2, v1

    move-object v1, v3

    move-object/from16 v3, v18

    .line 27
    invoke-static/range {v1 .. v8}, Landroidx/compose/foundation/lazy/layout/f;->c(Landroidx/compose/ui/e;Lie/a;LF/C;Lz/q;ZZLY/m;I)Landroidx/compose/ui/e;

    move-result-object v1

    move-object/from16 v16, v2

    move-object v2, v4

    move v4, v6

    move-object v8, v7

    .line 28
    invoke-static {v0, v8, v13}, LE/f;->a(LE/I;LY/m;I)LF/k;

    move-result-object v3

    move-object v6, v2

    move-object v2, v3

    .line 29
    invoke-virtual {v0}, LE/I;->n()LF/h;

    move-result-object v3

    .line 30
    invoke-static {}, Landroidx/compose/ui/platform/w0;->k()LY/b1;

    move-result-object v5

    .line 31
    invoke-interface {v8, v5}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li1/t;

    .line 32
    sget v7, La0/c;->d:I

    shl-int/lit8 v7, v7, 0x6

    and-int/lit16 v9, v12, 0x1c00

    or-int/2addr v7, v9

    const/high16 v9, 0x380000

    and-int/2addr v9, v12

    or-int/2addr v9, v7

    move/from16 v7, p7

    .line 33
    invoke-static/range {v1 .. v9}, LF/j;->b(Landroidx/compose/ui/e;LF/k;LF/h;ZLi1/t;Lz/q;ZLY/m;I)Landroidx/compose/ui/e;

    move-result-object v1

    move-object v2, v6

    .line 34
    invoke-virtual {v0}, LE/I;->r()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->i()Landroidx/compose/ui/e;

    move-result-object v3

    invoke-interface {v1, v3}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 35
    invoke-virtual {v0}, LE/I;->q()LB/m;

    move-result-object v6

    shr-int/lit8 v3, v21, 0xc

    and-int/lit16 v3, v3, 0x1c00

    or-int v3, v19, v3

    or-int v3, v3, v20

    const/high16 v5, 0x70000

    and-int/2addr v5, v12

    or-int v9, v3, v5

    const/16 v10, 0x40

    const/4 v7, 0x0

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    move/from16 v3, p7

    move-object/from16 v5, v17

    .line 36
    invoke-static/range {v0 .. v10}, Lx/a0;->a(Landroidx/compose/ui/e;Lz/x;Lz/q;ZZLz/n;LB/m;Lz/d;LY/m;II)Landroidx/compose/ui/e;

    move-result-object v2

    move v0, v4

    move-object v10, v5

    .line 37
    invoke-virtual/range {p1 .. p1}, LE/I;->x()Landroidx/compose/foundation/lazy/layout/d;

    move-result-object v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, v8

    move-object v4, v11

    move-object/from16 v1, v16

    .line 38
    invoke-static/range {v1 .. v7}, LF/t;->a(Lie/a;Landroidx/compose/ui/e;Landroidx/compose/foundation/lazy/layout/d;Lkotlin/jvm/functions/Function2;LY/m;II)V

    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_2d

    invoke-static {}, LY/w;->T()V

    :cond_2d
    move v5, v0

    move-object v7, v10

    move-object v1, v15

    move-object/from16 v4, v23

    .line 39
    :goto_1d
    invoke-interface {v8}, LY/m;->k()LY/B1;

    move-result-object v15

    if-eqz v15, :cond_2e

    new-instance v0, LE/r$a;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v6, p5

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p12

    move/from16 v13, p13

    invoke-direct/range {v0 .. v14}, LE/r$a;-><init>(Landroidx/compose/ui/e;LE/I;LE/F;LC/A;ZZLz/n;ZLC/b$m;LC/b$e;Lkotlin/jvm/functions/Function1;III)V

    invoke-interface {v15, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    :cond_2e
    return-void
.end method

.method private static final b(Lie/a;LE/I;LE/F;LC/A;ZZLC/b$e;LC/b$m;LGf/O;Ls0/Z0;LY/m;I)Lkotlin/jvm/functions/Function2;
    .locals 17

    .line 1
    move-object/from16 v0, p10

    .line 2
    .line 3
    move/from16 v1, p11

    .line 4
    .line 5
    invoke-static {}, LY/w;->L()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    const-string v3, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:161)"

    .line 13
    .line 14
    const v4, -0x5e7a3ec5

    .line 15
    .line 16
    .line 17
    invoke-static {v4, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    and-int/lit8 v2, v1, 0x70

    .line 21
    .line 22
    xor-int/lit8 v2, v2, 0x30

    .line 23
    .line 24
    const/16 v3, 0x20

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x1

    .line 28
    move-object/from16 v7, p1

    .line 29
    .line 30
    if-le v2, v3, :cond_1

    .line 31
    .line 32
    invoke-interface {v0, v7}, LY/m;->U(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_2

    .line 37
    .line 38
    :cond_1
    and-int/lit8 v2, v1, 0x30

    .line 39
    .line 40
    if-ne v2, v3, :cond_3

    .line 41
    .line 42
    :cond_2
    move v2, v5

    .line 43
    goto :goto_0

    .line 44
    :cond_3
    move v2, v4

    .line 45
    :goto_0
    and-int/lit16 v3, v1, 0x380

    .line 46
    .line 47
    xor-int/lit16 v3, v3, 0x180

    .line 48
    .line 49
    const/16 v6, 0x100

    .line 50
    .line 51
    move-object/from16 v12, p2

    .line 52
    .line 53
    if-le v3, v6, :cond_4

    .line 54
    .line 55
    invoke-interface {v0, v12}, LY/m;->U(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-nez v3, :cond_5

    .line 60
    .line 61
    :cond_4
    and-int/lit16 v3, v1, 0x180

    .line 62
    .line 63
    if-ne v3, v6, :cond_6

    .line 64
    .line 65
    :cond_5
    move v3, v5

    .line 66
    goto :goto_1

    .line 67
    :cond_6
    move v3, v4

    .line 68
    :goto_1
    or-int/2addr v2, v3

    .line 69
    and-int/lit16 v3, v1, 0x1c00

    .line 70
    .line 71
    xor-int/lit16 v3, v3, 0xc00

    .line 72
    .line 73
    const/16 v6, 0x800

    .line 74
    .line 75
    move-object/from16 v9, p3

    .line 76
    .line 77
    if-le v3, v6, :cond_7

    .line 78
    .line 79
    invoke-interface {v0, v9}, LY/m;->U(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-nez v3, :cond_8

    .line 84
    .line 85
    :cond_7
    and-int/lit16 v3, v1, 0xc00

    .line 86
    .line 87
    if-ne v3, v6, :cond_9

    .line 88
    .line 89
    :cond_8
    move v3, v5

    .line 90
    goto :goto_2

    .line 91
    :cond_9
    move v3, v4

    .line 92
    :goto_2
    or-int/2addr v2, v3

    .line 93
    const v3, 0xe000

    .line 94
    .line 95
    .line 96
    and-int/2addr v3, v1

    .line 97
    xor-int/lit16 v3, v3, 0x6000

    .line 98
    .line 99
    const/16 v6, 0x4000

    .line 100
    .line 101
    move/from16 v10, p4

    .line 102
    .line 103
    if-le v3, v6, :cond_a

    .line 104
    .line 105
    invoke-interface {v0, v10}, LY/m;->a(Z)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-nez v3, :cond_b

    .line 110
    .line 111
    :cond_a
    and-int/lit16 v3, v1, 0x6000

    .line 112
    .line 113
    if-ne v3, v6, :cond_c

    .line 114
    .line 115
    :cond_b
    move v3, v5

    .line 116
    goto :goto_3

    .line 117
    :cond_c
    move v3, v4

    .line 118
    :goto_3
    or-int/2addr v2, v3

    .line 119
    const/high16 v3, 0x70000

    .line 120
    .line 121
    and-int/2addr v3, v1

    .line 122
    const/high16 v6, 0x30000

    .line 123
    .line 124
    xor-int/2addr v3, v6

    .line 125
    const/high16 v8, 0x20000

    .line 126
    .line 127
    if-le v3, v8, :cond_d

    .line 128
    .line 129
    move/from16 v3, p5

    .line 130
    .line 131
    invoke-interface {v0, v3}, LY/m;->a(Z)Z

    .line 132
    .line 133
    .line 134
    move-result v11

    .line 135
    if-nez v11, :cond_e

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_d
    move/from16 v3, p5

    .line 139
    .line 140
    :goto_4
    and-int/2addr v6, v1

    .line 141
    if-ne v6, v8, :cond_f

    .line 142
    .line 143
    :cond_e
    move v6, v5

    .line 144
    goto :goto_5

    .line 145
    :cond_f
    move v6, v4

    .line 146
    :goto_5
    or-int/2addr v2, v6

    .line 147
    const/high16 v6, 0x380000

    .line 148
    .line 149
    and-int/2addr v6, v1

    .line 150
    const/high16 v8, 0x180000

    .line 151
    .line 152
    xor-int/2addr v6, v8

    .line 153
    const/high16 v11, 0x100000

    .line 154
    .line 155
    move-object/from16 v14, p6

    .line 156
    .line 157
    if-le v6, v11, :cond_10

    .line 158
    .line 159
    invoke-interface {v0, v14}, LY/m;->U(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    if-nez v6, :cond_11

    .line 164
    .line 165
    :cond_10
    and-int v6, v1, v8

    .line 166
    .line 167
    if-ne v6, v11, :cond_12

    .line 168
    .line 169
    :cond_11
    move v6, v5

    .line 170
    goto :goto_6

    .line 171
    :cond_12
    move v6, v4

    .line 172
    :goto_6
    or-int/2addr v2, v6

    .line 173
    const/high16 v6, 0x1c00000

    .line 174
    .line 175
    and-int/2addr v6, v1

    .line 176
    const/high16 v8, 0xc00000

    .line 177
    .line 178
    xor-int/2addr v6, v8

    .line 179
    const/high16 v11, 0x800000

    .line 180
    .line 181
    move-object/from16 v13, p7

    .line 182
    .line 183
    if-le v6, v11, :cond_13

    .line 184
    .line 185
    invoke-interface {v0, v13}, LY/m;->U(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    if-nez v6, :cond_14

    .line 190
    .line 191
    :cond_13
    and-int/2addr v1, v8

    .line 192
    if-ne v1, v11, :cond_15

    .line 193
    .line 194
    :cond_14
    move v4, v5

    .line 195
    :cond_15
    or-int v1, v2, v4

    .line 196
    .line 197
    move-object/from16 v2, p9

    .line 198
    .line 199
    invoke-interface {v0, v2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    or-int/2addr v1, v4

    .line 204
    invoke-interface {v0}, LY/m;->D()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    if-nez v1, :cond_16

    .line 209
    .line 210
    sget-object v1, LY/m;->a:LY/m$a;

    .line 211
    .line 212
    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    if-ne v4, v1, :cond_17

    .line 217
    .line 218
    :cond_16
    new-instance v6, LE/r$b;

    .line 219
    .line 220
    move-object/from16 v11, p0

    .line 221
    .line 222
    move-object/from16 v15, p8

    .line 223
    .line 224
    move-object/from16 v16, v2

    .line 225
    .line 226
    move v8, v3

    .line 227
    invoke-direct/range {v6 .. v16}, LE/r$b;-><init>(LE/I;ZLC/A;ZLie/a;LE/F;LC/b$m;LC/b$e;LGf/O;Ls0/Z0;)V

    .line 228
    .line 229
    .line 230
    invoke-interface {v0, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    move-object v4, v6

    .line 234
    :cond_17
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 235
    .line 236
    invoke-static {}, LY/w;->L()Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-eqz v0, :cond_18

    .line 241
    .line 242
    invoke-static {}, LY/w;->T()V

    .line 243
    .line 244
    .line 245
    :cond_18
    return-object v4
.end method
