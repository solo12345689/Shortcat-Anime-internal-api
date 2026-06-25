.class public abstract LG/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LG/C;Landroidx/compose/ui/e;LC/A;LG/g;IFLl0/e$c;Lz/B;ZZLkotlin/jvm/functions/Function1;LD0/a;LA/k;Lie/p;LY/m;III)V
    .locals 34

    move-object/from16 v1, p0

    move/from16 v9, p15

    move/from16 v10, p16

    move/from16 v11, p17

    const v12, 0x6f839c82

    move-object/from16 v0, p14

    .line 1
    invoke-interface {v0, v12}, LY/m;->g(I)LY/m;

    move-result-object v6

    and-int/lit8 v0, v11, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v0, v9, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v0, v9, 0x6

    if-nez v0, :cond_2

    invoke-interface {v6, v1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v9

    goto :goto_1

    :cond_2
    move v0, v9

    :goto_1
    and-int/lit8 v4, v11, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v8, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v8, v9, 0x30

    if-nez v8, :cond_3

    move-object/from16 v8, p1

    invoke-interface {v6, v8}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_5

    const/16 v13, 0x20

    goto :goto_2

    :cond_5
    const/16 v13, 0x10

    :goto_2
    or-int/2addr v0, v13

    :goto_3
    and-int/lit8 v13, v11, 0x4

    if-eqz v13, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v2, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v2, v9, 0x180

    if-nez v2, :cond_6

    move-object/from16 v2, p2

    invoke-interface {v6, v2}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_8

    const/16 v16, 0x100

    goto :goto_4

    :cond_8
    const/16 v16, 0x80

    :goto_4
    or-int v0, v0, v16

    :goto_5
    and-int/lit8 v16, v11, 0x8

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-eqz v16, :cond_a

    or-int/lit16 v0, v0, 0xc00

    :cond_9
    move-object/from16 v3, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v3, v9, 0xc00

    if-nez v3, :cond_9

    move-object/from16 v3, p3

    invoke-interface {v6, v3}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_b

    move/from16 v20, v18

    goto :goto_6

    :cond_b
    move/from16 v20, v17

    :goto_6
    or-int v0, v0, v20

    :goto_7
    and-int/lit8 v20, v11, 0x10

    if-eqz v20, :cond_d

    or-int/lit16 v0, v0, 0x6000

    :cond_c
    move/from16 v5, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v5, v9, 0x6000

    if-nez v5, :cond_c

    move/from16 v5, p4

    invoke-interface {v6, v5}, LY/m;->c(I)Z

    move-result v22

    if-eqz v22, :cond_e

    const/16 v22, 0x4000

    goto :goto_8

    :cond_e
    const/16 v22, 0x2000

    :goto_8
    or-int v0, v0, v22

    :goto_9
    and-int/lit8 v22, v11, 0x20

    const/high16 v23, 0x30000

    if-eqz v22, :cond_f

    or-int v0, v0, v23

    move/from16 v7, p5

    goto :goto_b

    :cond_f
    and-int v24, v9, v23

    move/from16 v7, p5

    if-nez v24, :cond_11

    invoke-interface {v6, v7}, LY/m;->b(F)Z

    move-result v25

    if-eqz v25, :cond_10

    const/high16 v25, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v25, 0x10000

    :goto_a
    or-int v0, v0, v25

    :cond_11
    :goto_b
    and-int/lit8 v25, v11, 0x40

    const/high16 v26, 0x180000

    if-eqz v25, :cond_12

    or-int v0, v0, v26

    move-object/from16 v14, p6

    goto :goto_d

    :cond_12
    and-int v26, v9, v26

    move-object/from16 v14, p6

    if-nez v26, :cond_14

    invoke-interface {v6, v14}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_13

    const/high16 v27, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v27, 0x80000

    :goto_c
    or-int v0, v0, v27

    :cond_14
    :goto_d
    const/high16 v27, 0xc00000

    and-int v27, v9, v27

    if-nez v27, :cond_17

    and-int/lit16 v15, v11, 0x80

    if-nez v15, :cond_15

    move-object/from16 v15, p7

    invoke-interface {v6, v15}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_16

    const/high16 v28, 0x800000

    goto :goto_e

    :cond_15
    move-object/from16 v15, p7

    :cond_16
    const/high16 v28, 0x400000

    :goto_e
    or-int v0, v0, v28

    goto :goto_f

    :cond_17
    move-object/from16 v15, p7

    :goto_f
    and-int/lit16 v12, v11, 0x100

    const/high16 v29, 0x6000000

    if-eqz v12, :cond_18

    or-int v0, v0, v29

    move/from16 v2, p8

    goto :goto_11

    :cond_18
    and-int v29, v9, v29

    move/from16 v2, p8

    if-nez v29, :cond_1a

    invoke-interface {v6, v2}, LY/m;->a(Z)Z

    move-result v29

    if-eqz v29, :cond_19

    const/high16 v29, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v29, 0x2000000

    :goto_10
    or-int v0, v0, v29

    :cond_1a
    :goto_11
    and-int/lit16 v2, v11, 0x200

    const/high16 v29, 0x30000000

    if-eqz v2, :cond_1b

    or-int v0, v0, v29

    move/from16 v30, v0

    move/from16 v29, v2

    move/from16 v2, p9

    goto :goto_14

    :cond_1b
    and-int v29, v9, v29

    if-nez v29, :cond_1d

    move/from16 v29, v2

    move/from16 v2, p9

    invoke-interface {v6, v2}, LY/m;->a(Z)Z

    move-result v30

    if-eqz v30, :cond_1c

    const/high16 v30, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v30, 0x10000000

    :goto_12
    or-int v0, v0, v30

    :goto_13
    move/from16 v30, v0

    goto :goto_14

    :cond_1d
    move/from16 v29, v2

    move/from16 v2, p9

    goto :goto_13

    :goto_14
    and-int/lit16 v0, v11, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v19, v10, 0x6

    move-object/from16 v2, p10

    goto :goto_16

    :cond_1e
    and-int/lit8 v31, v10, 0x6

    move-object/from16 v2, p10

    if-nez v31, :cond_20

    invoke-interface {v6, v2}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_1f

    const/16 v19, 0x4

    goto :goto_15

    :cond_1f
    const/16 v19, 0x2

    :goto_15
    or-int v19, v10, v19

    goto :goto_16

    :cond_20
    move/from16 v19, v10

    :goto_16
    and-int/lit8 v31, v10, 0x30

    if-nez v31, :cond_23

    move/from16 v31, v0

    and-int/lit16 v0, v11, 0x800

    if-nez v0, :cond_21

    move-object/from16 v0, p11

    invoke-interface {v6, v0}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_22

    const/16 v21, 0x20

    goto :goto_17

    :cond_21
    move-object/from16 v0, p11

    :cond_22
    const/16 v21, 0x10

    :goto_17
    or-int v19, v19, v21

    :goto_18
    move/from16 v0, v19

    goto :goto_19

    :cond_23
    move/from16 v31, v0

    move-object/from16 v0, p11

    goto :goto_18

    :goto_19
    and-int/lit16 v2, v11, 0x1000

    if-eqz v2, :cond_24

    or-int/lit16 v0, v0, 0x180

    goto :goto_1c

    :cond_24
    move/from16 v19, v0

    and-int/lit16 v0, v10, 0x180

    if-nez v0, :cond_26

    move-object/from16 v0, p12

    invoke-interface {v6, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_25

    const/16 v26, 0x100

    goto :goto_1a

    :cond_25
    const/16 v26, 0x80

    :goto_1a
    or-int v19, v19, v26

    :goto_1b
    move/from16 v0, v19

    goto :goto_1c

    :cond_26
    move-object/from16 v0, p12

    goto :goto_1b

    :goto_1c
    and-int/lit16 v1, v11, 0x2000

    if-eqz v1, :cond_28

    or-int/lit16 v0, v0, 0xc00

    :cond_27
    move-object/from16 v1, p13

    goto :goto_1d

    :cond_28
    and-int/lit16 v1, v10, 0xc00

    if-nez v1, :cond_27

    move-object/from16 v1, p13

    invoke-interface {v6, v1}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_29

    move/from16 v17, v18

    :cond_29
    or-int v0, v0, v17

    :goto_1d
    const v17, 0x12492493

    and-int v1, v30, v17

    move/from16 v17, v2

    const v2, 0x12492492

    if-ne v1, v2, :cond_2b

    and-int/lit16 v1, v0, 0x493

    const/16 v2, 0x492

    if-ne v1, v2, :cond_2b

    invoke-interface {v6}, LY/m;->i()Z

    move-result v1

    if-nez v1, :cond_2a

    goto :goto_1e

    .line 2
    :cond_2a
    invoke-interface {v6}, LY/m;->K()V

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object v4, v3

    move-object/from16 v16, v6

    move v6, v7

    move-object v2, v8

    move-object v7, v14

    move-object v8, v15

    move-object/from16 v3, p2

    goto/16 :goto_2e

    .line 3
    :cond_2b
    :goto_1e
    invoke-interface {v6}, LY/m;->G()V

    and-int/lit8 v1, v9, 0x1

    if-eqz v1, :cond_2f

    invoke-interface {v6}, LY/m;->N()Z

    move-result v1

    if-eqz v1, :cond_2c

    goto :goto_1f

    .line 4
    :cond_2c
    invoke-interface {v6}, LY/m;->K()V

    and-int/lit16 v1, v11, 0x80

    if-eqz v1, :cond_2d

    const v1, -0x1c00001

    and-int v30, v30, v1

    :cond_2d
    and-int/lit16 v1, v11, 0x800

    if-eqz v1, :cond_2e

    and-int/lit8 v0, v0, -0x71

    :cond_2e
    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v11, p10

    move-object/from16 v10, p11

    move v4, v0

    move-object v9, v3

    move-object/from16 v16, v6

    move-object v0, v8

    move-object v13, v14

    move/from16 v12, v30

    move/from16 v6, p8

    move/from16 v3, p9

    move-object/from16 v14, p12

    move v8, v7

    move v7, v5

    move-object v5, v15

    goto/16 :goto_2b

    :cond_2f
    :goto_1f
    if-eqz v4, :cond_30

    .line 5
    sget-object v1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    move-object/from16 v18, v1

    goto :goto_20

    :cond_30
    move-object/from16 v18, v8

    :goto_20
    const/4 v1, 0x0

    if-eqz v13, :cond_31

    int-to-float v2, v1

    .line 6
    invoke-static {v2}, Li1/h;->n(F)F

    move-result v2

    .line 7
    invoke-static {v2}, Landroidx/compose/foundation/layout/p;->a(F)LC/A;

    move-result-object v2

    move-object v13, v2

    goto :goto_21

    :cond_31
    move-object/from16 v13, p2

    :goto_21
    if-eqz v16, :cond_32

    .line 8
    sget-object v2, LG/g$a;->a:LG/g$a;

    move-object/from16 v16, v2

    goto :goto_22

    :cond_32
    move-object/from16 v16, v3

    :goto_22
    if-eqz v20, :cond_33

    move/from16 v19, v1

    goto :goto_23

    :cond_33
    move/from16 v19, v5

    :goto_23
    if-eqz v22, :cond_34

    int-to-float v2, v1

    .line 9
    invoke-static {v2}, Li1/h;->n(F)F

    move-result v2

    move/from16 v20, v2

    goto :goto_24

    :cond_34
    move/from16 v20, v7

    :goto_24
    if-eqz v25, :cond_35

    .line 10
    sget-object v2, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v2}, Ll0/e$a;->i()Ll0/e$c;

    move-result-object v2

    move-object v14, v2

    :cond_35
    and-int/lit16 v2, v11, 0x80

    if-eqz v2, :cond_36

    move v2, v0

    .line 11
    sget-object v0, LG/k;->a:LG/k;

    and-int/lit8 v3, v30, 0xe

    or-int v7, v3, v23

    const/16 v8, 0x1e

    move v3, v2

    const/4 v2, 0x0

    move v4, v3

    const/4 v3, 0x0

    move v5, v4

    const/4 v4, 0x0

    move v15, v5

    const/4 v5, 0x0

    move/from16 v22, v1

    move/from16 v21, v17

    move-object/from16 v1, p0

    move/from16 v17, v15

    invoke-virtual/range {v0 .. v8}, LG/k;->a(LG/C;LG/A;Lw/z;Lw/i;FLY/m;II)Lz/B;

    move-result-object v0

    const v2, -0x1c00001

    and-int v30, v30, v2

    move-object v15, v0

    goto :goto_25

    :cond_36
    move/from16 v22, v1

    move/from16 v21, v17

    move-object/from16 v1, p0

    move/from16 v17, v0

    :goto_25
    if-eqz v12, :cond_37

    const/4 v0, 0x1

    goto :goto_26

    :cond_37
    move/from16 v0, p8

    :goto_26
    if-eqz v29, :cond_38

    goto :goto_27

    :cond_38
    move/from16 v22, p9

    :goto_27
    if-eqz v31, :cond_39

    const/4 v2, 0x0

    goto :goto_28

    :cond_39
    move-object/from16 v2, p10

    :goto_28
    and-int/lit16 v3, v11, 0x800

    if-eqz v3, :cond_3a

    .line 12
    sget-object v3, LG/k;->a:LG/k;

    .line 13
    sget-object v4, Lz/q;->b:Lz/q;

    and-int/lit8 v5, v30, 0xe

    or-int/lit16 v5, v5, 0x1b0

    .line 14
    invoke-virtual {v3, v1, v4, v6, v5}, LG/k;->b(LG/C;Lz/q;LY/m;I)LD0/a;

    move-result-object v3

    and-int/lit8 v4, v17, -0x71

    move/from16 v17, v4

    goto :goto_29

    :cond_3a
    move-object/from16 v3, p11

    :goto_29
    if-eqz v21, :cond_3b

    .line 15
    sget-object v4, LA/k$a;->a:LA/k$a;

    move-object v11, v2

    move-object v10, v3

    move-object v2, v13

    move-object v13, v14

    move-object v5, v15

    move-object/from16 v9, v16

    move/from16 v7, v19

    move/from16 v8, v20

    move/from16 v3, v22

    move/from16 v12, v30

    move-object v14, v4

    move-object/from16 v16, v6

    move/from16 v4, v17

    :goto_2a
    move v6, v0

    move-object/from16 v0, v18

    goto :goto_2b

    :cond_3b
    move-object v11, v2

    move-object v10, v3

    move-object v2, v13

    move-object v13, v14

    move-object v5, v15

    move-object/from16 v9, v16

    move/from16 v4, v17

    move/from16 v7, v19

    move/from16 v8, v20

    move/from16 v3, v22

    move/from16 v12, v30

    move-object/from16 v14, p12

    move-object/from16 v16, v6

    goto :goto_2a

    :goto_2b
    invoke-interface/range {v16 .. v16}, LY/m;->y()V

    invoke-static {}, LY/w;->L()Z

    move-result v15

    if-eqz v15, :cond_3c

    const-string v15, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:124)"

    move-object/from16 p1, v0

    const v0, 0x6f839c82

    .line 16
    invoke-static {v0, v12, v4, v15}, LY/w;->U(IIILjava/lang/String;)V

    :goto_2c
    move v0, v4

    goto :goto_2d

    :cond_3c
    move-object/from16 p1, v0

    goto :goto_2c

    .line 17
    :goto_2d
    sget-object v4, Lz/q;->b:Lz/q;

    .line 18
    sget-object v15, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v15}, Ll0/e$a;->g()Ll0/e$b;

    move-result-object v15

    shr-int/lit8 v17, v12, 0x3

    move/from16 p2, v0

    and-int/lit8 v0, v17, 0xe

    or-int/lit16 v0, v0, 0x6000

    shl-int/lit8 v17, v12, 0x3

    and-int/lit8 v17, v17, 0x70

    or-int v0, v0, v17

    move/from16 p3, v0

    and-int/lit16 v0, v12, 0x380

    or-int v0, p3, v0

    move/from16 p3, v0

    shr-int/lit8 v0, v12, 0x12

    and-int/lit16 v0, v0, 0x1c00

    or-int v0, p3, v0

    shr-int/lit8 v17, v12, 0x6

    const/high16 v18, 0x70000

    and-int v18, v17, v18

    or-int v0, v0, v18

    const/high16 v18, 0x380000

    and-int v17, v17, v18

    or-int v0, v0, v17

    shl-int/lit8 v17, v12, 0x9

    const/high16 v18, 0x1c00000

    and-int v18, v17, v18

    or-int v0, v0, v18

    const/high16 v18, 0xe000000

    and-int v17, v17, v18

    or-int v0, v0, v17

    shl-int/lit8 v17, v12, 0x12

    const/high16 v18, 0x70000000

    and-int v17, v17, v18

    or-int v17, v0, v17

    shr-int/lit8 v0, p2, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v0, v0, 0x180

    shl-int/lit8 v18, p2, 0x3

    and-int/lit8 v18, v18, 0x70

    or-int v0, v0, v18

    shr-int/lit8 v12, v12, 0x9

    and-int/lit16 v12, v12, 0x1c00

    or-int/2addr v0, v12

    shl-int/lit8 v12, p2, 0x6

    const v18, 0xe000

    and-int v18, v12, v18

    or-int v0, v0, v18

    const/high16 v18, 0x70000

    and-int v12, v12, v18

    or-int v18, v0, v12

    const/16 v19, 0x0

    move-object/from16 v0, p1

    move-object v12, v15

    move-object/from16 v15, p13

    .line 19
    invoke-static/range {v0 .. v19}, LG/c;->a(Landroidx/compose/ui/e;LG/C;LC/A;ZLz/q;Lz/B;ZIFLG/g;LD0/a;Lkotlin/jvm/functions/Function1;Ll0/e$b;Ll0/e$c;LA/k;Lie/p;LY/m;III)V

    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_3d

    invoke-static {}, LY/w;->T()V

    :cond_3d
    move-object v4, v9

    move-object v12, v10

    move v10, v3

    move v9, v6

    move v6, v8

    move-object v3, v2

    move-object v8, v5

    move v5, v7

    move-object v7, v13

    move-object v13, v14

    move-object v2, v0

    .line 20
    :goto_2e
    invoke-interface/range {v16 .. v16}, LY/m;->k()LY/B1;

    move-result-object v0

    if-eqz v0, :cond_3e

    move-object v1, v0

    new-instance v0, LG/m$a;

    move-object/from16 v14, p13

    move/from16 v15, p15

    move/from16 v16, p16

    move/from16 v17, p17

    move-object/from16 v33, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v17}, LG/m$a;-><init>(LG/C;Landroidx/compose/ui/e;LC/A;LG/g;IFLl0/e$c;Lz/B;ZZLkotlin/jvm/functions/Function1;LD0/a;LA/k;Lie/p;III)V

    move-object/from16 v1, v33

    invoke-interface {v1, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    :cond_3e
    return-void
.end method

.method public static final synthetic b(LG/C;LGf/O;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, LG/m;->f(LG/C;LGf/O;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic c(LG/C;LGf/O;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, LG/m;->g(LG/C;LGf/O;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final d(LA/k;IIIIIIFI)I
    .locals 7

    .line 1
    move-object v0, p0

    .line 2
    move v1, p1

    .line 3
    move v2, p2

    .line 4
    move v3, p4

    .line 5
    move v4, p5

    .line 6
    move v5, p6

    .line 7
    move v6, p8

    .line 8
    invoke-interface/range {v0 .. v6}, LA/k;->a(IIIIII)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    int-to-float p0, p0

    .line 13
    add-int p2, v2, p3

    .line 14
    .line 15
    int-to-float p1, p2

    .line 16
    mul-float/2addr p7, p1

    .line 17
    sub-float/2addr p0, p7

    .line 18
    invoke-static {p0}, Lke/a;->d(F)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public static final e(Landroidx/compose/ui/e;LG/C;ZLGf/O;Z)Landroidx/compose/ui/e;
    .locals 1

    .line 1
    if-eqz p4, :cond_0

    .line 2
    .line 3
    sget-object p4, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 4
    .line 5
    new-instance v0, LG/m$b;

    .line 6
    .line 7
    invoke-direct {v0, p2, p1, p3}, LG/m$b;-><init>(ZLG/C;LGf/O;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    const/4 p2, 0x0

    .line 12
    const/4 p3, 0x0

    .line 13
    invoke-static {p4, p3, v0, p1, p2}, LR0/r;->f(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p0, p1}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 23
    .line 24
    invoke-interface {p0, p1}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method private static final f(LG/C;LGf/O;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, LG/C;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v4, LG/m$c;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {v4, p0, v0}, LG/m$c;-><init>(LG/C;LZd/e;)V

    .line 11
    .line 12
    .line 13
    const/4 v5, 0x3

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    move-object v1, p1

    .line 18
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method private static final g(LG/C;LGf/O;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, LG/C;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v4, LG/m$d;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {v4, p0, v0}, LG/m$d;-><init>(LG/C;LZd/e;)V

    .line 11
    .line 12
    .line 13
    const/4 v5, 0x3

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    move-object v1, p1

    .line 18
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method
