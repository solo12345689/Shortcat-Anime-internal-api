.class public abstract LD/p;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Landroidx/compose/ui/e;LD/B;LC/A;ZZLz/n;ZILl0/e$b;LC/b$m;Ll0/e$c;LC/b$e;Lkotlin/jvm/functions/Function1;LY/m;III)V
    .locals 29

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move/from16 v5, p4

    move-object/from16 v0, p12

    move/from16 v2, p14

    move/from16 v4, p15

    move/from16 v6, p16

    const v7, 0x25001c13

    move-object/from16 v8, p13

    .line 1
    invoke-interface {v8, v7}, LY/m;->g(I)LY/m;

    move-result-object v15

    and-int/lit8 v8, v6, 0x1

    if-eqz v8, :cond_0

    or-int/lit8 v8, v2, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v8, v2, 0x6

    if-nez v8, :cond_2

    invoke-interface {v15, v1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_1
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v2

    goto :goto_1

    :cond_2
    move v8, v2

    :goto_1
    and-int/lit8 v11, v6, 0x2

    if-eqz v11, :cond_3

    or-int/lit8 v8, v8, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v11, v2, 0x30

    if-nez v11, :cond_5

    invoke-interface {v15, v3}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    const/16 v11, 0x20

    goto :goto_2

    :cond_4
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v8, v11

    :cond_5
    :goto_3
    and-int/lit8 v11, v6, 0x4

    const/16 v16, 0x100

    if-eqz v11, :cond_7

    or-int/lit16 v8, v8, 0x180

    :cond_6
    move-object/from16 v11, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v11, v2, 0x180

    if-nez v11, :cond_6

    move-object/from16 v11, p2

    invoke-interface {v15, v11}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_8

    move/from16 v17, v16

    goto :goto_4

    :cond_8
    const/16 v17, 0x80

    :goto_4
    or-int v8, v8, v17

    :goto_5
    and-int/lit8 v17, v6, 0x8

    if-eqz v17, :cond_a

    or-int/lit16 v8, v8, 0xc00

    :cond_9
    move/from16 v9, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v9, v2, 0xc00

    if-nez v9, :cond_9

    move/from16 v9, p3

    invoke-interface {v15, v9}, LY/m;->a(Z)Z

    move-result v17

    if-eqz v17, :cond_b

    const/16 v17, 0x800

    goto :goto_6

    :cond_b
    const/16 v17, 0x400

    :goto_6
    or-int v8, v8, v17

    :goto_7
    and-int/lit8 v17, v6, 0x10

    if-eqz v17, :cond_c

    or-int/lit16 v8, v8, 0x6000

    goto :goto_9

    :cond_c
    and-int/lit16 v10, v2, 0x6000

    if-nez v10, :cond_e

    invoke-interface {v15, v5}, LY/m;->a(Z)Z

    move-result v10

    if-eqz v10, :cond_d

    const/16 v10, 0x4000

    goto :goto_8

    :cond_d
    const/16 v10, 0x2000

    :goto_8
    or-int/2addr v8, v10

    :cond_e
    :goto_9
    and-int/lit8 v10, v6, 0x20

    const/high16 v18, 0x30000

    if-eqz v10, :cond_10

    or-int v8, v8, v18

    :cond_f
    move-object/from16 v10, p5

    goto :goto_b

    :cond_10
    and-int v10, v2, v18

    if-nez v10, :cond_f

    move-object/from16 v10, p5

    invoke-interface {v15, v10}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_11

    const/high16 v18, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v18, 0x10000

    :goto_a
    or-int v8, v8, v18

    :goto_b
    and-int/lit8 v18, v6, 0x40

    const/high16 v19, 0x180000

    if-eqz v18, :cond_12

    or-int v8, v8, v19

    move/from16 v7, p6

    goto :goto_d

    :cond_12
    and-int v18, v2, v19

    move/from16 v7, p6

    if-nez v18, :cond_14

    invoke-interface {v15, v7}, LY/m;->a(Z)Z

    move-result v19

    if-eqz v19, :cond_13

    const/high16 v19, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v19, 0x80000

    :goto_c
    or-int v8, v8, v19

    :cond_14
    :goto_d
    and-int/lit16 v12, v6, 0x80

    const/high16 v20, 0xc00000

    if-eqz v12, :cond_15

    or-int v8, v8, v20

    move/from16 v13, p7

    goto :goto_f

    :cond_15
    and-int v20, v2, v20

    move/from16 v13, p7

    if-nez v20, :cond_17

    invoke-interface {v15, v13}, LY/m;->c(I)Z

    move-result v21

    if-eqz v21, :cond_16

    const/high16 v21, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v21, 0x400000

    :goto_e
    or-int v8, v8, v21

    :cond_17
    :goto_f
    and-int/lit16 v14, v6, 0x100

    const/high16 v22, 0x6000000

    if-eqz v14, :cond_18

    or-int v8, v8, v22

    move-object/from16 v2, p8

    goto :goto_11

    :cond_18
    and-int v22, v2, v22

    move-object/from16 v2, p8

    if-nez v22, :cond_1a

    invoke-interface {v15, v2}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_19

    const/high16 v22, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v22, 0x2000000

    :goto_10
    or-int v8, v8, v22

    :cond_1a
    :goto_11
    and-int/lit16 v2, v6, 0x200

    const/high16 v22, 0x30000000

    if-eqz v2, :cond_1c

    or-int v8, v8, v22

    :cond_1b
    move/from16 v22, v2

    move-object/from16 v2, p9

    goto :goto_13

    :cond_1c
    and-int v22, p14, v22

    if-nez v22, :cond_1b

    move/from16 v22, v2

    move-object/from16 v2, p9

    invoke-interface {v15, v2}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_1d

    const/high16 v23, 0x20000000

    goto :goto_12

    :cond_1d
    const/high16 v23, 0x10000000

    :goto_12
    or-int v8, v8, v23

    :goto_13
    and-int/lit16 v2, v6, 0x400

    if-eqz v2, :cond_1e

    or-int/lit8 v17, v4, 0x6

    move/from16 v23, v2

    move-object/from16 v2, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v23, v4, 0x6

    if-nez v23, :cond_20

    move/from16 v23, v2

    move-object/from16 v2, p10

    invoke-interface {v15, v2}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_1f

    const/16 v17, 0x4

    goto :goto_14

    :cond_1f
    const/16 v17, 0x2

    :goto_14
    or-int v17, v4, v17

    goto :goto_15

    :cond_20
    move/from16 v23, v2

    move-object/from16 v2, p10

    move/from16 v17, v4

    :goto_15
    and-int/lit16 v2, v6, 0x800

    if-eqz v2, :cond_21

    or-int/lit8 v17, v17, 0x30

    move/from16 v24, v2

    :goto_16
    move/from16 v2, v17

    goto :goto_18

    :cond_21
    and-int/lit8 v24, v4, 0x30

    if-nez v24, :cond_23

    move/from16 v24, v2

    move-object/from16 v2, p11

    invoke-interface {v15, v2}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_22

    const/16 v19, 0x20

    goto :goto_17

    :cond_22
    const/16 v19, 0x10

    :goto_17
    or-int v17, v17, v19

    goto :goto_16

    :cond_23
    move/from16 v24, v2

    move-object/from16 v2, p11

    goto :goto_16

    :goto_18
    and-int/lit16 v7, v6, 0x1000

    if-eqz v7, :cond_24

    or-int/lit16 v2, v2, 0x180

    goto :goto_1a

    :cond_24
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_26

    invoke-interface {v15, v0}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_25

    goto :goto_19

    :cond_25
    const/16 v16, 0x80

    :goto_19
    or-int v2, v2, v16

    :cond_26
    :goto_1a
    const v7, 0x12492493

    and-int/2addr v7, v8

    const v4, 0x12492492

    if-ne v7, v4, :cond_28

    and-int/lit16 v4, v2, 0x93

    const/16 v7, 0x92

    if-ne v4, v7, :cond_28

    invoke-interface {v15}, LY/m;->i()Z

    move-result v4

    if-nez v4, :cond_27

    goto :goto_1b

    .line 2
    :cond_27
    invoke-interface {v15}, LY/m;->K()V

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move v8, v13

    goto/16 :goto_22

    :cond_28
    :goto_1b
    if-eqz v12, :cond_29

    const/4 v4, 0x0

    move v7, v4

    goto :goto_1c

    :cond_29
    move v7, v13

    :goto_1c
    const/4 v4, 0x0

    if-eqz v14, :cond_2a

    move-object v12, v4

    goto :goto_1d

    :cond_2a
    move-object/from16 v12, p8

    :goto_1d
    if-eqz v22, :cond_2b

    move-object v13, v4

    goto :goto_1e

    :cond_2b
    move-object/from16 v13, p9

    :goto_1e
    if-eqz v23, :cond_2c

    move-object v14, v4

    goto :goto_1f

    :cond_2c
    move-object/from16 v14, p10

    :goto_1f
    if-eqz v24, :cond_2d

    goto :goto_20

    :cond_2d
    move-object/from16 v4, p11

    .line 3
    :goto_20
    invoke-static {}, LY/w;->L()Z

    move-result v16

    move-object/from16 p7, v4

    if-eqz v16, :cond_2e

    const-string v4, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:80)"

    const v6, 0x25001c13

    .line 4
    invoke-static {v6, v8, v2, v4}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2e
    shr-int/lit8 v4, v8, 0x3

    and-int/lit8 v18, v4, 0xe

    shr-int/lit8 v4, v2, 0x3

    and-int/lit8 v4, v4, 0x70

    or-int v4, v18, v4

    .line 5
    invoke-static {v3, v0, v15, v4}, LD/o;->a(LD/B;Lkotlin/jvm/functions/Function1;LY/m;I)Lie/a;

    move-result-object v4

    shr-int/lit8 v6, v8, 0x9

    and-int/lit8 v16, v6, 0x70

    or-int v0, v18, v16

    .line 6
    invoke-static {v3, v5, v15, v0}, LD/A;->a(LD/B;ZLY/m;I)LF/C;

    move-result-object v0

    move-object/from16 p8, v0

    .line 7
    invoke-interface {v15}, LY/m;->D()Ljava/lang/Object;

    move-result-object v0

    .line 8
    sget-object v16, LY/m;->a:LY/m$a;

    move/from16 v17, v2

    invoke-virtual/range {v16 .. v16}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_2f

    .line 9
    sget-object v0, LZd/j;->a:LZd/j;

    .line 10
    invoke-static {v0, v15}, LY/b0;->i(LZd/i;LY/m;)LGf/O;

    move-result-object v0

    .line 11
    new-instance v2, LY/L;

    invoke-direct {v2, v0}, LY/L;-><init>(LGf/O;)V

    .line 12
    invoke-interface {v15, v2}, LY/m;->u(Ljava/lang/Object;)V

    move-object v0, v2

    .line 13
    :cond_2f
    check-cast v0, LY/L;

    .line 14
    invoke-virtual {v0}, LY/L;->a()LGf/O;

    move-result-object v0

    .line 15
    invoke-static {}, Landroidx/compose/ui/platform/w0;->h()LY/b1;

    move-result-object v2

    .line 16
    invoke-interface {v15, v2}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v2

    .line 17
    check-cast v2, Ls0/Z0;

    move-object/from16 p9, v0

    .line 18
    invoke-static {}, Landroidx/compose/ui/platform/w0;->n()LY/D;

    move-result-object v0

    .line 19
    invoke-interface {v15, v0}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v0

    .line 20
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    and-int/lit8 v19, v8, 0x70

    move/from16 p10, v0

    and-int/lit16 v0, v8, 0x1c00

    const v16, 0xfff0

    and-int v16, v8, v16

    shr-int/lit8 v20, v8, 0x6

    const/high16 v21, 0x70000

    and-int v22, v20, v21

    or-int v16, v16, v22

    const/high16 v22, 0x380000

    and-int v22, v20, v22

    or-int v16, v16, v22

    shl-int/lit8 v17, v17, 0x15

    const/high16 v22, 0x1c00000

    and-int v22, v17, v22

    or-int v16, v16, v22

    const/high16 v22, 0xe000000

    and-int v17, v17, v22

    or-int v16, v16, v17

    const/high16 v17, 0x70000000

    and-int v17, v8, v17

    or-int v16, v16, v17

    const/16 v17, 0x0

    move-object v10, v13

    move-object v13, v2

    move-object v2, v4

    move-object v4, v11

    move-object v11, v10

    move-object/from16 v10, p7

    move/from16 v23, v0

    move v0, v6

    move/from16 v22, v8

    move-object v8, v12

    move-object/from16 v12, p9

    move v6, v5

    move v5, v9

    move-object v9, v14

    move/from16 v14, p10

    .line 21
    invoke-static/range {v2 .. v17}, LD/p;->b(Lie/a;LD/B;LC/A;ZZILl0/e$b;Ll0/e$c;LC/b$e;LC/b$m;LGf/O;Ls0/Z0;ZLY/m;II)Lkotlin/jvm/functions/Function2;

    move-result-object v17

    move-object/from16 v24, v8

    move-object/from16 v26, v9

    move-object/from16 v27, v10

    move-object/from16 v25, v11

    move-object v8, v2

    move v2, v7

    if-eqz p4, :cond_30

    .line 22
    sget-object v4, Lz/q;->a:Lz/q;

    goto :goto_21

    :cond_30
    sget-object v4, Lz/q;->b:Lz/q;

    .line 23
    :goto_21
    invoke-virtual {v3}, LD/B;->C()LI0/L;

    move-result-object v5

    invoke-interface {v1, v5}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    .line 24
    invoke-virtual {v3}, LD/B;->n()LF/b;

    move-result-object v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    const v6, 0xe000

    and-int v6, v20, v6

    shl-int/lit8 v7, v22, 0x6

    and-int v7, v7, v21

    or-int/2addr v6, v7

    move/from16 v13, p3

    move/from16 v12, p6

    move-object/from16 v10, p8

    move-object v11, v4

    move-object v9, v8

    move-object v14, v15

    move-object v8, v5

    move v15, v6

    .line 25
    invoke-static/range {v8 .. v15}, Landroidx/compose/foundation/lazy/layout/f;->c(Landroidx/compose/ui/e;Lie/a;LF/C;Lz/q;ZZLY/m;I)Landroidx/compose/ui/e;

    move-result-object v8

    move-object/from16 v20, v9

    move-object v15, v14

    shr-int/lit8 v5, v22, 0x12

    and-int/lit8 v5, v5, 0x70

    or-int v5, v18, v5

    .line 26
    invoke-static {v3, v2, v15, v5}, LD/g;->a(LD/B;ILY/m;I)LF/k;

    move-result-object v9

    .line 27
    invoke-virtual {v3}, LD/B;->o()LF/h;

    move-result-object v10

    .line 28
    invoke-static {}, Landroidx/compose/ui/platform/w0;->k()LY/b1;

    move-result-object v5

    .line 29
    invoke-interface {v15, v5}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v5

    move-object v12, v5

    check-cast v12, Li1/t;

    .line 30
    sget v5, La0/c;->d:I

    shl-int/lit8 v5, v5, 0x6

    or-int v5, v5, v23

    const/high16 v6, 0x380000

    and-int v6, v22, v6

    or-int v16, v5, v6

    move/from16 v11, p3

    move/from16 v14, p6

    move-object v13, v4

    .line 31
    invoke-static/range {v8 .. v16}, LF/j;->b(Landroidx/compose/ui/e;LF/k;LF/h;ZLi1/t;Lz/q;ZLY/m;I)Landroidx/compose/ui/e;

    move-result-object v4

    move-object v11, v13

    .line 32
    invoke-virtual {v3}, LD/B;->t()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->i()Landroidx/compose/ui/e;

    move-result-object v5

    invoke-interface {v4, v5}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    .line 33
    invoke-virtual {v3}, LD/B;->s()LB/m;

    move-result-object v8

    and-int/lit16 v0, v0, 0x1c00

    or-int v0, v19, v0

    const v5, 0xe000

    shl-int/lit8 v6, v22, 0x3

    and-int/2addr v5, v6

    or-int/2addr v0, v5

    and-int v5, v22, v21

    or-int/2addr v0, v5

    const/16 v12, 0x40

    const/4 v9, 0x0

    move-object v5, v11

    move v11, v0

    move v0, v2

    move-object v2, v4

    move-object v4, v5

    move/from16 v6, p3

    move-object/from16 v7, p5

    move/from16 v5, p6

    move-object v10, v15

    .line 34
    invoke-static/range {v2 .. v12}, Lx/a0;->a(Landroidx/compose/ui/e;Lz/x;Lz/q;ZZLz/n;LB/m;Lz/d;LY/m;II)Landroidx/compose/ui/e;

    move-result-object v9

    .line 35
    invoke-virtual/range {p1 .. p1}, LD/B;->A()Landroidx/compose/foundation/lazy/layout/d;

    move-result-object v10

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v12, v15

    move-object/from16 v11, v17

    move-object/from16 v8, v20

    .line 36
    invoke-static/range {v8 .. v14}, LF/t;->a(Lie/a;Landroidx/compose/ui/e;Landroidx/compose/foundation/lazy/layout/d;Lkotlin/jvm/functions/Function2;LY/m;II)V

    invoke-static {}, LY/w;->L()Z

    move-result v2

    if-eqz v2, :cond_31

    invoke-static {}, LY/w;->T()V

    :cond_31
    move v8, v0

    move-object/from16 v9, v24

    move-object/from16 v10, v25

    move-object/from16 v11, v26

    move-object/from16 v12, v27

    .line 37
    :goto_22
    invoke-interface {v15}, LY/m;->k()LY/B1;

    move-result-object v0

    if-eqz v0, :cond_32

    move-object v2, v0

    new-instance v0, LD/p$a;

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v13, p12

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    move-object/from16 v28, v2

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v16}, LD/p$a;-><init>(Landroidx/compose/ui/e;LD/B;LC/A;ZZLz/n;ZILl0/e$b;LC/b$m;Ll0/e$c;LC/b$e;Lkotlin/jvm/functions/Function1;III)V

    move-object/from16 v2, v28

    invoke-interface {v2, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    :cond_32
    return-void
.end method

.method private static final b(Lie/a;LD/B;LC/A;ZZILl0/e$b;Ll0/e$c;LC/b$e;LC/b$m;LGf/O;Ls0/Z0;ZLY/m;II)Lkotlin/jvm/functions/Function2;
    .locals 21

    .line 1
    move-object/from16 v0, p13

    .line 2
    .line 3
    move/from16 v1, p14

    .line 4
    .line 5
    move/from16 v2, p15

    .line 6
    .line 7
    invoke-static {}, LY/w;->L()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    const v3, 0x758fa0a6

    .line 14
    .line 15
    .line 16
    const-string v4, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:170)"

    .line 17
    .line 18
    invoke-static {v3, v1, v2, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    and-int/lit8 v3, v1, 0x70

    .line 22
    .line 23
    xor-int/lit8 v3, v3, 0x30

    .line 24
    .line 25
    const/16 v4, 0x20

    .line 26
    .line 27
    const/4 v6, 0x1

    .line 28
    move-object/from16 v8, p1

    .line 29
    .line 30
    if-le v3, v4, :cond_1

    .line 31
    .line 32
    invoke-interface {v0, v8}, LY/m;->U(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    :cond_1
    and-int/lit8 v3, v1, 0x30

    .line 39
    .line 40
    if-ne v3, v4, :cond_3

    .line 41
    .line 42
    :cond_2
    move v3, v6

    .line 43
    goto :goto_0

    .line 44
    :cond_3
    const/4 v3, 0x0

    .line 45
    :goto_0
    and-int/lit16 v4, v1, 0x380

    .line 46
    .line 47
    xor-int/lit16 v4, v4, 0x180

    .line 48
    .line 49
    const/16 v7, 0x100

    .line 50
    .line 51
    move-object/from16 v10, p2

    .line 52
    .line 53
    if-le v4, v7, :cond_4

    .line 54
    .line 55
    invoke-interface {v0, v10}, LY/m;->U(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-nez v4, :cond_5

    .line 60
    .line 61
    :cond_4
    and-int/lit16 v4, v1, 0x180

    .line 62
    .line 63
    if-ne v4, v7, :cond_6

    .line 64
    .line 65
    :cond_5
    move v4, v6

    .line 66
    goto :goto_1

    .line 67
    :cond_6
    const/4 v4, 0x0

    .line 68
    :goto_1
    or-int/2addr v3, v4

    .line 69
    and-int/lit16 v4, v1, 0x1c00

    .line 70
    .line 71
    xor-int/lit16 v4, v4, 0xc00

    .line 72
    .line 73
    const/16 v9, 0x800

    .line 74
    .line 75
    move/from16 v11, p3

    .line 76
    .line 77
    if-le v4, v9, :cond_7

    .line 78
    .line 79
    invoke-interface {v0, v11}, LY/m;->a(Z)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-nez v4, :cond_8

    .line 84
    .line 85
    :cond_7
    and-int/lit16 v4, v1, 0xc00

    .line 86
    .line 87
    if-ne v4, v9, :cond_9

    .line 88
    .line 89
    :cond_8
    move v4, v6

    .line 90
    goto :goto_2

    .line 91
    :cond_9
    const/4 v4, 0x0

    .line 92
    :goto_2
    or-int/2addr v3, v4

    .line 93
    const v4, 0xe000

    .line 94
    .line 95
    .line 96
    and-int/2addr v4, v1

    .line 97
    xor-int/lit16 v4, v4, 0x6000

    .line 98
    .line 99
    const/16 v9, 0x4000

    .line 100
    .line 101
    if-le v4, v9, :cond_a

    .line 102
    .line 103
    move/from16 v4, p4

    .line 104
    .line 105
    invoke-interface {v0, v4}, LY/m;->a(Z)Z

    .line 106
    .line 107
    .line 108
    move-result v12

    .line 109
    if-nez v12, :cond_b

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_a
    move/from16 v4, p4

    .line 113
    .line 114
    :goto_3
    and-int/lit16 v12, v1, 0x6000

    .line 115
    .line 116
    if-ne v12, v9, :cond_c

    .line 117
    .line 118
    :cond_b
    move v9, v6

    .line 119
    goto :goto_4

    .line 120
    :cond_c
    const/4 v9, 0x0

    .line 121
    :goto_4
    or-int/2addr v3, v9

    .line 122
    const/high16 v9, 0x380000

    .line 123
    .line 124
    and-int/2addr v9, v1

    .line 125
    const/high16 v12, 0x180000

    .line 126
    .line 127
    xor-int/2addr v9, v12

    .line 128
    const/high16 v13, 0x100000

    .line 129
    .line 130
    if-le v9, v13, :cond_d

    .line 131
    .line 132
    move-object/from16 v9, p6

    .line 133
    .line 134
    invoke-interface {v0, v9}, LY/m;->U(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v14

    .line 138
    if-nez v14, :cond_e

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_d
    move-object/from16 v9, p6

    .line 142
    .line 143
    :goto_5
    and-int/2addr v12, v1

    .line 144
    if-ne v12, v13, :cond_f

    .line 145
    .line 146
    :cond_e
    move v12, v6

    .line 147
    goto :goto_6

    .line 148
    :cond_f
    const/4 v12, 0x0

    .line 149
    :goto_6
    or-int/2addr v3, v12

    .line 150
    const/high16 v12, 0x1c00000

    .line 151
    .line 152
    and-int/2addr v12, v1

    .line 153
    const/high16 v13, 0xc00000

    .line 154
    .line 155
    xor-int/2addr v12, v13

    .line 156
    const/high16 v14, 0x800000

    .line 157
    .line 158
    if-le v12, v14, :cond_10

    .line 159
    .line 160
    move-object/from16 v12, p7

    .line 161
    .line 162
    invoke-interface {v0, v12}, LY/m;->U(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v15

    .line 166
    if-nez v15, :cond_11

    .line 167
    .line 168
    goto :goto_7

    .line 169
    :cond_10
    move-object/from16 v12, p7

    .line 170
    .line 171
    :goto_7
    and-int/2addr v13, v1

    .line 172
    if-ne v13, v14, :cond_12

    .line 173
    .line 174
    :cond_11
    move v13, v6

    .line 175
    goto :goto_8

    .line 176
    :cond_12
    const/4 v13, 0x0

    .line 177
    :goto_8
    or-int/2addr v3, v13

    .line 178
    const/high16 v13, 0xe000000

    .line 179
    .line 180
    and-int/2addr v13, v1

    .line 181
    const/high16 v14, 0x6000000

    .line 182
    .line 183
    xor-int/2addr v13, v14

    .line 184
    const/high16 v15, 0x4000000

    .line 185
    .line 186
    if-le v13, v15, :cond_13

    .line 187
    .line 188
    move-object/from16 v13, p8

    .line 189
    .line 190
    invoke-interface {v0, v13}, LY/m;->U(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v16

    .line 194
    if-nez v16, :cond_14

    .line 195
    .line 196
    goto :goto_9

    .line 197
    :cond_13
    move-object/from16 v13, p8

    .line 198
    .line 199
    :goto_9
    and-int/2addr v14, v1

    .line 200
    if-ne v14, v15, :cond_15

    .line 201
    .line 202
    :cond_14
    move v14, v6

    .line 203
    goto :goto_a

    .line 204
    :cond_15
    const/4 v14, 0x0

    .line 205
    :goto_a
    or-int/2addr v3, v14

    .line 206
    const/high16 v14, 0x70000000

    .line 207
    .line 208
    and-int/2addr v14, v1

    .line 209
    const/high16 v15, 0x30000000

    .line 210
    .line 211
    xor-int/2addr v14, v15

    .line 212
    const/high16 v5, 0x20000000

    .line 213
    .line 214
    if-le v14, v5, :cond_16

    .line 215
    .line 216
    move-object/from16 v14, p9

    .line 217
    .line 218
    invoke-interface {v0, v14}, LY/m;->U(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v17

    .line 222
    if-nez v17, :cond_17

    .line 223
    .line 224
    goto :goto_b

    .line 225
    :cond_16
    move-object/from16 v14, p9

    .line 226
    .line 227
    :goto_b
    and-int/2addr v1, v15

    .line 228
    if-ne v1, v5, :cond_18

    .line 229
    .line 230
    :cond_17
    move v1, v6

    .line 231
    goto :goto_c

    .line 232
    :cond_18
    const/4 v1, 0x0

    .line 233
    :goto_c
    or-int/2addr v1, v3

    .line 234
    move-object/from16 v3, p11

    .line 235
    .line 236
    invoke-interface {v0, v3}, LY/m;->U(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    or-int/2addr v1, v5

    .line 241
    and-int/lit16 v5, v2, 0x380

    .line 242
    .line 243
    xor-int/lit16 v5, v5, 0x180

    .line 244
    .line 245
    move/from16 v15, p12

    .line 246
    .line 247
    if-le v5, v7, :cond_19

    .line 248
    .line 249
    invoke-interface {v0, v15}, LY/m;->a(Z)Z

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    if-nez v5, :cond_1a

    .line 254
    .line 255
    :cond_19
    and-int/lit16 v2, v2, 0x180

    .line 256
    .line 257
    if-ne v2, v7, :cond_1b

    .line 258
    .line 259
    :cond_1a
    move v5, v6

    .line 260
    goto :goto_d

    .line 261
    :cond_1b
    const/4 v5, 0x0

    .line 262
    :goto_d
    or-int/2addr v1, v5

    .line 263
    invoke-interface {v0}, LY/m;->D()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    if-nez v1, :cond_1c

    .line 268
    .line 269
    sget-object v1, LY/m;->a:LY/m$a;

    .line 270
    .line 271
    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    if-ne v2, v1, :cond_1d

    .line 276
    .line 277
    :cond_1c
    new-instance v7, LD/p$b;

    .line 278
    .line 279
    move-object/from16 v16, v14

    .line 280
    .line 281
    move-object v14, v13

    .line 282
    move-object/from16 v13, v16

    .line 283
    .line 284
    move/from16 v16, p5

    .line 285
    .line 286
    move-object/from16 v17, p10

    .line 287
    .line 288
    move-object/from16 v18, v3

    .line 289
    .line 290
    move-object/from16 v19, v9

    .line 291
    .line 292
    move-object/from16 v20, v12

    .line 293
    .line 294
    move-object/from16 v12, p0

    .line 295
    .line 296
    move v9, v4

    .line 297
    invoke-direct/range {v7 .. v20}, LD/p$b;-><init>(LD/B;ZLC/A;ZLie/a;LC/b$m;LC/b$e;ZILGf/O;Ls0/Z0;Ll0/e$b;Ll0/e$c;)V

    .line 298
    .line 299
    .line 300
    invoke-interface {v0, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    move-object v2, v7

    .line 304
    :cond_1d
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 305
    .line 306
    invoke-static {}, LY/w;->L()Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-eqz v0, :cond_1e

    .line 311
    .line 312
    invoke-static {}, LY/w;->T()V

    .line 313
    .line 314
    .line 315
    :cond_1e
    return-object v2
.end method
