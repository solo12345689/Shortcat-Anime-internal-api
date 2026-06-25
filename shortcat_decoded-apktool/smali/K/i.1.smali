.class public abstract LK/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(La1/U;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LU0/Y0;La1/f0;Lkotlin/jvm/functions/Function1;LB/m;Ls0/h0;ZIILa1/t;LK/w;ZZLie/o;LY/m;III)V
    .locals 47

    move-object/from16 v1, p0

    move/from16 v0, p17

    move/from16 v2, p18

    move/from16 v3, p19

    const v4, -0x3924b996

    move-object/from16 v5, p16

    .line 1
    invoke-interface {v5, v4}, LY/m;->g(I)LY/m;

    move-result-object v5

    and-int/lit8 v6, v3, 0x1

    if-eqz v6, :cond_0

    or-int/lit8 v6, v0, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v0, 0x6

    if-nez v6, :cond_2

    invoke-interface {v5, v1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v0

    goto :goto_1

    :cond_2
    move v6, v0

    :goto_1
    and-int/lit8 v9, v3, 0x2

    if-eqz v9, :cond_4

    or-int/lit8 v6, v6, 0x30

    :cond_3
    move-object/from16 v9, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v9, v0, 0x30

    if-nez v9, :cond_3

    move-object/from16 v9, p1

    invoke-interface {v5, v9}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    const/16 v12, 0x20

    goto :goto_2

    :cond_5
    const/16 v12, 0x10

    :goto_2
    or-int/2addr v6, v12

    :goto_3
    and-int/lit8 v12, v3, 0x4

    if-eqz v12, :cond_7

    or-int/lit16 v6, v6, 0x180

    :cond_6
    move-object/from16 v15, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v15, v0, 0x180

    if-nez v15, :cond_6

    move-object/from16 v15, p2

    invoke-interface {v5, v15}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_8

    const/16 v16, 0x100

    goto :goto_4

    :cond_8
    const/16 v16, 0x80

    :goto_4
    or-int v6, v6, v16

    :goto_5
    and-int/lit8 v16, v3, 0x8

    const/16 v17, 0x400

    if-eqz v16, :cond_a

    or-int/lit16 v6, v6, 0xc00

    :cond_9
    move-object/from16 v13, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v13, v0, 0xc00

    if-nez v13, :cond_9

    move-object/from16 v13, p3

    invoke-interface {v5, v13}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_b

    const/16 v19, 0x800

    goto :goto_6

    :cond_b
    move/from16 v19, v17

    :goto_6
    or-int v6, v6, v19

    :goto_7
    and-int/lit8 v19, v3, 0x10

    const/16 v20, 0x2000

    if-eqz v19, :cond_d

    or-int/lit16 v6, v6, 0x6000

    :cond_c
    move-object/from16 v7, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v7, v0, 0x6000

    if-nez v7, :cond_c

    move-object/from16 v7, p4

    invoke-interface {v5, v7}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_e

    const/16 v23, 0x4000

    goto :goto_8

    :cond_e
    move/from16 v23, v20

    :goto_8
    or-int v6, v6, v23

    :goto_9
    and-int/lit8 v23, v3, 0x20

    const/high16 v24, 0x10000

    const/high16 v25, 0x20000

    const/high16 v26, 0x30000

    if-eqz v23, :cond_f

    or-int v6, v6, v26

    move-object/from16 v11, p5

    goto :goto_b

    :cond_f
    and-int v27, v0, v26

    move-object/from16 v11, p5

    if-nez v27, :cond_11

    invoke-interface {v5, v11}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_10

    move/from16 v28, v25

    goto :goto_a

    :cond_10
    move/from16 v28, v24

    :goto_a
    or-int v6, v6, v28

    :cond_11
    :goto_b
    and-int/lit8 v28, v3, 0x40

    const/high16 v29, 0x180000

    if-eqz v28, :cond_12

    or-int v6, v6, v29

    move-object/from16 v10, p6

    goto :goto_d

    :cond_12
    and-int v29, v0, v29

    move-object/from16 v10, p6

    if-nez v29, :cond_14

    invoke-interface {v5, v10}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_13

    const/high16 v30, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v30, 0x80000

    :goto_c
    or-int v6, v6, v30

    :cond_14
    :goto_d
    and-int/lit16 v14, v3, 0x80

    const/high16 v31, 0xc00000

    if-eqz v14, :cond_15

    or-int v6, v6, v31

    move-object/from16 v8, p7

    goto :goto_f

    :cond_15
    and-int v31, v0, v31

    move-object/from16 v8, p7

    if-nez v31, :cond_17

    invoke-interface {v5, v8}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_16

    const/high16 v32, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v32, 0x400000

    :goto_e
    or-int v6, v6, v32

    :cond_17
    :goto_f
    and-int/lit16 v4, v3, 0x100

    const/high16 v33, 0x6000000

    if-eqz v4, :cond_18

    or-int v6, v6, v33

    move/from16 v0, p8

    goto :goto_11

    :cond_18
    and-int v33, v0, v33

    move/from16 v0, p8

    if-nez v33, :cond_1a

    invoke-interface {v5, v0}, LY/m;->a(Z)Z

    move-result v33

    if-eqz v33, :cond_19

    const/high16 v33, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v33, 0x2000000

    :goto_10
    or-int v6, v6, v33

    :cond_1a
    :goto_11
    and-int/lit16 v0, v3, 0x200

    const/high16 v33, 0x30000000

    if-eqz v0, :cond_1c

    or-int v6, v6, v33

    :cond_1b
    move/from16 v33, v0

    move/from16 v0, p9

    goto :goto_13

    :cond_1c
    and-int v33, p17, v33

    if-nez v33, :cond_1b

    move/from16 v33, v0

    move/from16 v0, p9

    invoke-interface {v5, v0}, LY/m;->c(I)Z

    move-result v34

    if-eqz v34, :cond_1d

    const/high16 v34, 0x20000000

    goto :goto_12

    :cond_1d
    const/high16 v34, 0x10000000

    :goto_12
    or-int v6, v6, v34

    :goto_13
    and-int/lit16 v0, v3, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v34, v2, 0x6

    move/from16 v35, v34

    move/from16 v34, v0

    move/from16 v0, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v34, v2, 0x6

    if-nez v34, :cond_20

    move/from16 v34, v0

    move/from16 v0, p10

    invoke-interface {v5, v0}, LY/m;->c(I)Z

    move-result v35

    if-eqz v35, :cond_1f

    const/16 v35, 0x4

    goto :goto_14

    :cond_1f
    const/16 v35, 0x2

    :goto_14
    or-int v35, v2, v35

    goto :goto_15

    :cond_20
    move/from16 v34, v0

    move/from16 v0, p10

    move/from16 v35, v2

    :goto_15
    and-int/lit8 v36, v2, 0x30

    if-nez v36, :cond_23

    and-int/lit16 v0, v3, 0x800

    if-nez v0, :cond_21

    move-object/from16 v0, p11

    invoke-interface {v5, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v36

    if-eqz v36, :cond_22

    const/16 v36, 0x20

    goto :goto_16

    :cond_21
    move-object/from16 v0, p11

    :cond_22
    const/16 v36, 0x10

    :goto_16
    or-int v35, v35, v36

    :goto_17
    move/from16 v0, v35

    goto :goto_18

    :cond_23
    move-object/from16 v0, p11

    goto :goto_17

    :goto_18
    move/from16 v35, v4

    and-int/lit16 v4, v3, 0x1000

    if-eqz v4, :cond_24

    or-int/lit16 v0, v0, 0x180

    goto :goto_1a

    :cond_24
    move/from16 v36, v0

    and-int/lit16 v0, v2, 0x180

    if-nez v0, :cond_26

    move-object/from16 v0, p12

    invoke-interface {v5, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v37

    if-eqz v37, :cond_25

    const/16 v18, 0x100

    goto :goto_19

    :cond_25
    const/16 v18, 0x80

    :goto_19
    or-int v18, v36, v18

    move/from16 v0, v18

    goto :goto_1a

    :cond_26
    move-object/from16 v0, p12

    move/from16 v0, v36

    :goto_1a
    move/from16 v18, v4

    and-int/lit16 v4, v3, 0x2000

    if-eqz v4, :cond_27

    or-int/lit16 v0, v0, 0xc00

    goto :goto_1b

    :cond_27
    move/from16 v21, v0

    and-int/lit16 v0, v2, 0xc00

    if-nez v0, :cond_29

    move/from16 v0, p13

    invoke-interface {v5, v0}, LY/m;->a(Z)Z

    move-result v36

    if-eqz v36, :cond_28

    const/16 v17, 0x800

    :cond_28
    or-int v17, v21, v17

    move/from16 v0, v17

    goto :goto_1b

    :cond_29
    move/from16 v0, p13

    move/from16 v0, v21

    :goto_1b
    move/from16 v17, v4

    and-int/lit16 v4, v3, 0x4000

    if-eqz v4, :cond_2a

    or-int/lit16 v0, v0, 0x6000

    move/from16 v20, v0

    move/from16 v0, p14

    goto :goto_1c

    :cond_2a
    move/from16 v21, v0

    and-int/lit16 v0, v2, 0x6000

    if-nez v0, :cond_2c

    move/from16 v0, p14

    invoke-interface {v5, v0}, LY/m;->a(Z)Z

    move-result v36

    if-eqz v36, :cond_2b

    const/16 v20, 0x4000

    :cond_2b
    or-int v20, v21, v20

    goto :goto_1c

    :cond_2c
    move/from16 v0, p14

    move/from16 v20, v21

    :goto_1c
    const v21, 0x8000

    and-int v21, v3, v21

    if-eqz v21, :cond_2d

    or-int v20, v20, v26

    move-object/from16 v0, p15

    goto :goto_1d

    :cond_2d
    and-int v26, v2, v26

    move-object/from16 v0, p15

    if-nez v26, :cond_2f

    invoke-interface {v5, v0}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_2e

    move/from16 v24, v25

    :cond_2e
    or-int v20, v20, v24

    :cond_2f
    :goto_1d
    const v24, 0x12492493

    and-int v0, v6, v24

    const v2, 0x12492492

    if-ne v0, v2, :cond_31

    const v0, 0x12493

    and-int v0, v20, v0

    const v2, 0x12492

    if-ne v0, v2, :cond_31

    invoke-interface {v5}, LY/m;->i()Z

    move-result v0

    if-nez v0, :cond_30

    goto :goto_1e

    .line 2
    :cond_30
    invoke-interface {v5}, LY/m;->K()V

    move/from16 v9, p8

    move-object/from16 v12, p11

    move/from16 v14, p13

    move-object/from16 v16, p15

    move-object/from16 v44, v5

    move-object v5, v7

    move-object v7, v10

    move-object v6, v11

    move-object v4, v13

    move-object v3, v15

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v13, p12

    move/from16 v15, p14

    goto/16 :goto_5d

    .line 3
    :cond_31
    :goto_1e
    invoke-interface {v5}, LY/m;->G()V

    and-int/lit8 v0, p17, 0x1

    if-eqz v0, :cond_34

    invoke-interface {v5}, LY/m;->N()Z

    move-result v0

    if-eqz v0, :cond_32

    goto :goto_1f

    .line 4
    :cond_32
    invoke-interface {v5}, LY/m;->K()V

    and-int/lit16 v0, v3, 0x800

    if-eqz v0, :cond_33

    and-int/lit8 v20, v20, -0x71

    :cond_33
    move/from16 v12, p9

    move/from16 v14, p10

    move-object/from16 v18, p12

    move-object/from16 v19, p15

    move-object v4, v8

    move-object v2, v10

    move-object/from16 v17, v11

    move-object v0, v15

    move/from16 v3, v20

    move/from16 v11, p8

    move/from16 v10, p13

    move/from16 v15, p14

    move-object v8, v7

    move-object/from16 v7, p11

    goto/16 :goto_2a

    :cond_34
    :goto_1f
    if-eqz v12, :cond_35

    .line 5
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    move-object v15, v0

    :cond_35
    if-eqz v16, :cond_36

    .line 6
    sget-object v0, LU0/Y0;->d:LU0/Y0$a;

    invoke-virtual {v0}, LU0/Y0$a;->a()LU0/Y0;

    move-result-object v0

    move-object v13, v0

    :cond_36
    if-eqz v19, :cond_37

    .line 7
    sget-object v0, La1/f0;->a:La1/f0$a;

    invoke-virtual {v0}, La1/f0$a;->c()La1/f0;

    move-result-object v0

    goto :goto_20

    :cond_37
    move-object v0, v7

    :goto_20
    if-eqz v23, :cond_38

    .line 8
    sget-object v7, LK/i$a;->a:LK/i$a;

    goto :goto_21

    :cond_38
    move-object v7, v11

    :goto_21
    if-eqz v28, :cond_39

    const/4 v10, 0x0

    :cond_39
    if-eqz v14, :cond_3a

    .line 9
    new-instance v8, Ls0/F1;

    sget-object v11, Ls0/r0;->b:Ls0/r0$a;

    invoke-virtual {v11}, Ls0/r0$a;->j()J

    move-result-wide v11

    const/4 v14, 0x0

    invoke-direct {v8, v11, v12, v14}, Ls0/F1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_3a
    if-eqz v35, :cond_3b

    const/4 v11, 0x1

    goto :goto_22

    :cond_3b
    move/from16 v11, p8

    :goto_22
    if-eqz v33, :cond_3c

    const v12, 0x7fffffff

    goto :goto_23

    :cond_3c
    move/from16 v12, p9

    :goto_23
    if-eqz v34, :cond_3d

    const/4 v14, 0x1

    goto :goto_24

    :cond_3d
    move/from16 v14, p10

    :goto_24
    and-int/lit16 v2, v3, 0x800

    if-eqz v2, :cond_3e

    .line 10
    sget-object v2, La1/t;->g:La1/t$a;

    invoke-virtual {v2}, La1/t$a;->a()La1/t;

    move-result-object v2

    and-int/lit8 v20, v20, -0x71

    goto :goto_25

    :cond_3e
    move-object/from16 v2, p11

    :goto_25
    if-eqz v18, :cond_3f

    .line 11
    sget-object v18, LK/w;->g:LK/w$a;

    invoke-virtual/range {v18 .. v18}, LK/w$a;->a()LK/w;

    move-result-object v18

    goto :goto_26

    :cond_3f
    move-object/from16 v18, p12

    :goto_26
    if-eqz v17, :cond_40

    const/16 v17, 0x1

    goto :goto_27

    :cond_40
    move/from16 v17, p13

    :goto_27
    if-eqz v4, :cond_41

    const/4 v4, 0x0

    goto :goto_28

    :cond_41
    move/from16 v4, p14

    :goto_28
    if-eqz v21, :cond_42

    .line 12
    sget-object v19, LK/f;->a:LK/f;

    invoke-virtual/range {v19 .. v19}, LK/f;->a()Lie/o;

    move-result-object v19

    move-object v3, v8

    move-object v8, v0

    move-object v0, v15

    move v15, v4

    move-object v4, v3

    move-object v3, v7

    move-object v7, v2

    move-object v2, v10

    move/from16 v10, v17

    move-object/from16 v17, v3

    :goto_29
    move/from16 v3, v20

    goto :goto_2a

    :cond_42
    move-object v3, v8

    move-object v8, v0

    move-object v0, v15

    move v15, v4

    move-object v4, v3

    move-object v3, v7

    move-object v7, v2

    move-object v2, v10

    move/from16 v10, v17

    move-object/from16 v17, v3

    move-object/from16 v19, p15

    goto :goto_29

    :goto_2a
    invoke-interface {v5}, LY/m;->y()V

    invoke-static {}, LY/w;->L()Z

    move-result v20

    move-object/from16 p14, v4

    if-eqz v20, :cond_43

    const-string v4, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:220)"

    const v9, -0x3924b996

    .line 13
    invoke-static {v9, v6, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    :cond_43
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v4

    .line 15
    sget-object v9, LY/m;->a:LY/m$a;

    move/from16 v20, v6

    invoke-virtual {v9}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v4, v6, :cond_44

    .line 16
    new-instance v4, Landroidx/compose/ui/focus/k;

    invoke-direct {v4}, Landroidx/compose/ui/focus/k;-><init>()V

    .line 17
    invoke-interface {v5, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 18
    :cond_44
    check-cast v4, Landroidx/compose/ui/focus/k;

    .line 19
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 p15, v9

    .line 20
    invoke-virtual/range {p15 .. p15}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v6, v9, :cond_45

    .line 21
    invoke-static {}, LN/r0;->b()LN/q0;

    move-result-object v6

    .line 22
    invoke-interface {v5, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 23
    :cond_45
    check-cast v6, LN/q0;

    .line 24
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v9

    move/from16 p9, v11

    .line 25
    invoke-virtual/range {p15 .. p15}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v9, v11, :cond_46

    .line 26
    new-instance v9, La1/W;

    invoke-direct {v9, v6}, La1/W;-><init>(La1/M;)V

    .line 27
    invoke-interface {v5, v9}, LY/m;->u(Ljava/lang/Object;)V

    .line 28
    :cond_46
    check-cast v9, La1/W;

    .line 29
    invoke-static {}, Landroidx/compose/ui/platform/w0;->e()LY/b1;

    move-result-object v11

    .line 30
    invoke-interface {v5, v11}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v11

    .line 31
    check-cast v11, Li1/d;

    move-object/from16 p10, v11

    .line 32
    invoke-static {}, Landroidx/compose/ui/platform/w0;->g()LY/b1;

    move-result-object v11

    .line 33
    invoke-interface {v5, v11}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v11

    .line 34
    check-cast v11, LY0/u$b;

    move-object/from16 p11, v11

    .line 35
    invoke-static {}, LQ/K;->b()LY/b1;

    move-result-object v11

    .line 36
    invoke-interface {v5, v11}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LQ/J;

    .line 37
    invoke-virtual {v11}, LQ/J;->a()J

    move-result-wide v25

    .line 38
    invoke-static {}, Landroidx/compose/ui/platform/w0;->f()LY/b1;

    move-result-object v11

    .line 39
    invoke-interface {v5, v11}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v11

    .line 40
    check-cast v11, Lq0/h;

    move-object/from16 v21, v11

    .line 41
    invoke-static {}, Landroidx/compose/ui/platform/w0;->s()LY/b1;

    move-result-object v11

    .line 42
    invoke-interface {v5, v11}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v11

    .line 43
    check-cast v11, Landroidx/compose/ui/platform/F1;

    move-object/from16 p12, v13

    .line 44
    invoke-static {}, Landroidx/compose/ui/platform/w0;->o()LY/b1;

    move-result-object v13

    .line 45
    invoke-interface {v5, v13}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v13

    .line 46
    check-cast v13, Landroidx/compose/ui/platform/o1;

    move/from16 v23, v14

    const/4 v14, 0x1

    if-ne v12, v14, :cond_47

    if-nez p9, :cond_47

    .line 47
    invoke-virtual {v7}, La1/t;->h()Z

    move-result v14

    if-eqz v14, :cond_47

    .line 48
    sget-object v14, Lz/q;->b:Lz/q;

    goto :goto_2b

    :cond_47
    sget-object v14, Lz/q;->a:Lz/q;

    .line 49
    :goto_2b
    filled-new-array {v14}, [Ljava/lang/Object;

    move-result-object v28

    .line 50
    sget-object v32, LK/V;->f:LK/V$c;

    invoke-virtual/range {v32 .. v32}, LK/V$c;->a()Lh0/v;

    move-result-object v32

    .line 51
    invoke-interface {v5, v14}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v33

    move/from16 v34, v15

    .line 52
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v15

    if-nez v33, :cond_48

    move-object/from16 v33, v0

    .line 53
    invoke-virtual/range {p15 .. p15}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v15, v0, :cond_49

    goto :goto_2c

    :cond_48
    move-object/from16 v33, v0

    .line 54
    :goto_2c
    new-instance v15, LK/i$m;

    invoke-direct {v15, v14}, LK/i$m;-><init>(Lz/q;)V

    .line 55
    invoke-interface {v5, v15}, LY/m;->u(Ljava/lang/Object;)V

    .line 56
    :cond_49
    check-cast v15, Lie/a;

    const/4 v0, 0x0

    const/4 v14, 0x4

    const/16 v35, 0x0

    move/from16 p7, v0

    move-object/from16 p6, v5

    move/from16 p8, v14

    move-object/from16 p5, v15

    move-object/from16 p2, v28

    move-object/from16 p3, v32

    move-object/from16 p4, v35

    .line 57
    invoke-static/range {p2 .. p8}, Lh0/d;->e([Ljava/lang/Object;Lh0/v;Ljava/lang/String;Lie/a;LY/m;II)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK/V;

    and-int/lit8 v14, v20, 0xe

    const/4 v15, 0x4

    if-ne v14, v15, :cond_4a

    const/4 v15, 0x1

    goto :goto_2d

    :cond_4a
    const/4 v15, 0x0

    :goto_2d
    const v28, 0xe000

    move/from16 p2, v15

    and-int v15, v20, v28

    move-object/from16 v20, v0

    const/16 v0, 0x4000

    if-ne v15, v0, :cond_4b

    const/4 v0, 0x1

    goto :goto_2e

    :cond_4b
    const/4 v0, 0x0

    :goto_2e
    or-int v0, p2, v0

    .line 58
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v15

    if-nez v0, :cond_4d

    .line 59
    invoke-virtual/range {p15 .. p15}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v15, v0, :cond_4c

    goto :goto_2f

    :cond_4c
    move-object/from16 v32, v11

    move/from16 v28, v12

    goto :goto_32

    .line 60
    :cond_4d
    :goto_2f
    invoke-virtual {v1}, La1/U;->i()LU0/e;

    move-result-object v0

    invoke-static {v8, v0}, LK/n0;->c(La1/f0;LU0/e;)La1/d0;

    move-result-object v0

    .line 61
    invoke-virtual {v1}, La1/U;->j()LU0/W0;

    move-result-object v15

    move-object/from16 v32, v11

    move/from16 v28, v12

    if-eqz v15, :cond_4f

    invoke-virtual {v15}, LU0/W0;->r()J

    move-result-wide v11

    .line 62
    sget-object v15, LK/L;->a:LK/L$a;

    invoke-virtual {v15, v11, v12, v0}, LK/L$a;->a(JLa1/d0;)La1/d0;

    move-result-object v11

    if-nez v11, :cond_4e

    goto :goto_30

    :cond_4e
    move-object v15, v11

    goto :goto_31

    :cond_4f
    :goto_30
    move-object v15, v0

    .line 63
    :goto_31
    invoke-interface {v5, v15}, LY/m;->u(Ljava/lang/Object;)V

    .line 64
    :goto_32
    check-cast v15, La1/d0;

    .line 65
    invoke-virtual {v15}, La1/d0;->b()LU0/e;

    move-result-object v0

    .line 66
    invoke-virtual {v15}, La1/d0;->a()La1/J;

    move-result-object v11

    move-object/from16 p3, v0

    const/4 v12, 0x0

    .line 67
    invoke-static {v5, v12}, LY/h;->c(LY/m;I)LY/d1;

    move-result-object v0

    .line 68
    invoke-interface {v5, v13}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v12

    move/from16 p2, v12

    .line 69
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v35, v6

    if-nez p2, :cond_51

    .line 70
    invoke-virtual/range {p15 .. p15}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v12, v6, :cond_50

    goto :goto_33

    :cond_50
    move-object/from16 v39, p3

    move-object/from16 v37, p10

    move-object/from16 v38, p11

    move-object/from16 v36, p12

    goto :goto_34

    .line 71
    :cond_51
    :goto_33
    new-instance v12, LK/y;

    .line 72
    new-instance v6, LK/H;

    const/16 v36, 0x12c

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    move/from16 p7, p9

    move-object/from16 p9, p10

    move-object/from16 p10, p11

    move-object/from16 p4, p12

    move-object/from16 p2, v6

    move/from16 p12, v36

    move-object/from16 p13, v37

    move/from16 p5, v38

    move/from16 p6, v39

    move/from16 p8, v40

    move-object/from16 p11, v41

    invoke-direct/range {p2 .. p13}, LK/H;-><init>(LU0/e;LU0/Y0;IIZILi1/d;LY0/u$b;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v39, p3

    move-object/from16 v36, p4

    move-object/from16 v37, p9

    move-object/from16 v38, p10

    move/from16 p9, p7

    .line 73
    invoke-direct {v12, v6, v0, v13}, LK/y;-><init>(LK/H;LY/d1;Landroidx/compose/ui/platform/o1;)V

    .line 74
    invoke-interface {v5, v12}, LY/m;->u(Ljava/lang/Object;)V

    .line 75
    :goto_34
    check-cast v12, LK/y;

    .line 76
    invoke-virtual {v1}, La1/U;->i()LU0/e;

    move-result-object v0

    move/from16 p6, p9

    move-object/from16 p3, v0

    move-object/from16 p2, v12

    move-object/from16 p10, v18

    move-object/from16 p11, v21

    move-wide/from16 p12, v25

    move-object/from16 p5, v36

    move-object/from16 p7, v37

    move-object/from16 p8, v38

    move-object/from16 p4, v39

    move-object/from16 p9, p1

    .line 77
    invoke-virtual/range {p2 .. p13}, LK/y;->N(LU0/e;LU0/e;LU0/Y0;ZLi1/d;LY0/u$b;Lkotlin/jvm/functions/Function1;LK/w;Lq0/h;J)V

    move/from16 v21, p6

    move-object/from16 v25, p10

    move-object/from16 v0, p11

    .line 78
    invoke-virtual {v12}, LK/y;->n()La1/l;

    move-result-object v6

    invoke-virtual {v12}, LK/y;->g()La1/c0;

    move-result-object v13

    invoke-virtual {v6, v1, v13}, La1/l;->e(La1/U;La1/c0;)V

    .line 79
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v6

    .line 80
    invoke-virtual/range {p15 .. p15}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v13

    if-ne v6, v13, :cond_52

    .line 81
    new-instance v6, LK/j0;

    move-object/from16 v18, v0

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v13, 0x0

    invoke-direct {v6, v1, v0, v13}, LK/j0;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 82
    invoke-interface {v5, v6}, LY/m;->u(Ljava/lang/Object;)V

    goto :goto_35

    :cond_52
    move-object/from16 v18, v0

    .line 83
    :goto_35
    check-cast v6, LK/j0;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-wide/16 v38, 0x0

    move-object/from16 p3, p0

    move/from16 p6, v0

    move-object/from16 p7, v1

    move-object/from16 p2, v6

    move-wide/from16 p4, v38

    .line 84
    invoke-static/range {p2 .. p7}, LK/j0;->f(LK/j0;La1/U;JILjava/lang/Object;)V

    move-object/from16 v1, p3

    .line 85
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v0

    .line 86
    invoke-virtual/range {p15 .. p15}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v13

    if-ne v0, v13, :cond_53

    .line 87
    new-instance v0, LQ/F;

    invoke-direct {v0, v6}, LQ/F;-><init>(LK/j0;)V

    .line 88
    invoke-interface {v5, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 89
    :cond_53
    check-cast v0, LQ/F;

    .line 90
    invoke-virtual {v0, v11}, LQ/F;->e0(La1/J;)V

    .line 91
    invoke-virtual {v0, v8}, LQ/F;->k0(La1/f0;)V

    .line 92
    invoke-virtual {v12}, LK/y;->m()Lkotlin/jvm/functions/Function1;

    move-result-object v13

    invoke-virtual {v0, v13}, LQ/F;->f0(Lkotlin/jvm/functions/Function1;)V

    .line 93
    invoke-virtual {v0, v12}, LQ/F;->h0(LK/y;)V

    .line 94
    invoke-virtual {v0, v1}, LQ/F;->j0(La1/U;)V

    .line 95
    invoke-static {}, Landroidx/compose/ui/platform/w0;->d()LY/b1;

    move-result-object v13

    .line 96
    invoke-interface {v5, v13}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroidx/compose/ui/platform/t0;

    .line 97
    invoke-virtual {v0, v13}, LQ/F;->V(Landroidx/compose/ui/platform/t0;)V

    .line 98
    invoke-static {}, Landroidx/compose/ui/platform/w0;->p()LY/b1;

    move-result-object v13

    .line 99
    invoke-interface {v5, v13}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroidx/compose/ui/platform/s1;

    .line 100
    invoke-virtual {v0, v13}, LQ/F;->i0(Landroidx/compose/ui/platform/s1;)V

    .line 101
    invoke-static {}, Landroidx/compose/ui/platform/w0;->i()LY/b1;

    move-result-object v13

    .line 102
    invoke-interface {v5, v13}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lz0/a;

    .line 103
    invoke-virtual {v0, v13}, LQ/F;->d0(Lz0/a;)V

    .line 104
    invoke-virtual {v0, v4}, LQ/F;->b0(Landroidx/compose/ui/focus/k;)V

    xor-int/lit8 v13, v34, 0x1

    .line 105
    invoke-virtual {v0, v13}, LQ/F;->Z(Z)V

    .line 106
    invoke-virtual {v0, v10}, LQ/F;->a0(Z)V

    .line 107
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v13

    .line 108
    invoke-virtual/range {p15 .. p15}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v13, v1, :cond_54

    .line 109
    sget-object v1, LZd/j;->a:LZd/j;

    .line 110
    invoke-static {v1, v5}, LY/b0;->i(LZd/i;LY/m;)LGf/O;

    move-result-object v1

    .line 111
    new-instance v13, LY/L;

    invoke-direct {v13, v1}, LY/L;-><init>(LGf/O;)V

    .line 112
    invoke-interface {v5, v13}, LY/m;->u(Ljava/lang/Object;)V

    .line 113
    :cond_54
    check-cast v13, LY/L;

    .line 114
    invoke-virtual {v13}, LY/L;->a()LGf/O;

    move-result-object v1

    .line 115
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v26, v6

    .line 116
    invoke-virtual/range {p15 .. p15}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v13, v6, :cond_55

    .line 117
    invoke-static {}, Landroidx/compose/foundation/relocation/b;->a()LH/b;

    move-result-object v13

    .line 118
    invoke-interface {v5, v13}, LY/m;->u(Ljava/lang/Object;)V

    .line 119
    :cond_55
    check-cast v13, LH/b;

    .line 120
    sget-object v6, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 121
    invoke-interface {v5, v12}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v38

    move-object/from16 v39, v8

    and-int/lit16 v8, v3, 0x1c00

    move/from16 v40, v3

    const/16 v3, 0x800

    if-ne v8, v3, :cond_56

    const/4 v3, 0x1

    goto :goto_36

    :cond_56
    const/4 v3, 0x0

    :goto_36
    or-int v3, v38, v3

    const v38, 0xe000

    move/from16 p2, v3

    and-int v3, v40, v38

    move/from16 p4, v10

    const/16 v10, 0x4000

    if-ne v3, v10, :cond_57

    const/4 v10, 0x1

    goto :goto_37

    :cond_57
    const/4 v10, 0x0

    :goto_37
    or-int v10, p2, v10

    invoke-interface {v5, v9}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v38

    or-int v10, v10, v38

    move-object/from16 p6, v9

    const/4 v9, 0x4

    if-ne v14, v9, :cond_58

    const/4 v9, 0x1

    goto :goto_38

    :cond_58
    const/4 v9, 0x0

    :goto_38
    or-int/2addr v9, v10

    and-int/lit8 v10, v40, 0x70

    xor-int/lit8 v10, v10, 0x30

    move/from16 p2, v9

    const/16 v9, 0x20

    if-le v10, v9, :cond_5a

    invoke-interface {v5, v7}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v27

    if-nez v27, :cond_59

    goto :goto_39

    :cond_59
    move-object/from16 p8, v7

    goto :goto_3a

    :cond_5a
    :goto_39
    move-object/from16 p8, v7

    and-int/lit8 v7, v40, 0x30

    if-ne v7, v9, :cond_5b

    :goto_3a
    const/4 v7, 0x1

    goto :goto_3b

    :cond_5b
    const/4 v7, 0x0

    :goto_3b
    or-int v7, p2, v7

    invoke-interface {v5, v11}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-interface {v5, v1}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-interface {v5, v13}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-interface {v5, v0}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    .line 122
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_5d

    .line 123
    invoke-virtual/range {p15 .. p15}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v9, v7, :cond_5c

    goto :goto_3c

    :cond_5c
    move-object/from16 v1, p0

    move/from16 v7, p4

    move-object/from16 v38, v13

    move-object/from16 p9, v15

    move-object v15, v0

    move-object v13, v12

    move-object/from16 v0, p8

    move-object v12, v11

    move-object/from16 v11, p6

    goto :goto_3d

    .line 124
    :cond_5d
    :goto_3c
    new-instance v7, LK/i$i;

    move-object/from16 p7, p0

    move-object/from16 p10, v0

    move-object/from16 p11, v1

    move-object/from16 p2, v7

    move-object/from16 p9, v11

    move-object/from16 p3, v12

    move-object/from16 p12, v13

    move/from16 p5, v34

    invoke-direct/range {p2 .. p12}, LK/i$i;-><init>(LK/y;ZZLa1/W;La1/U;La1/t;La1/J;LQ/F;LGf/O;LH/b;)V

    move-object/from16 v9, p2

    move-object/from16 v13, p3

    move/from16 v7, p4

    move-object/from16 v11, p6

    move-object/from16 v1, p7

    move-object/from16 v0, p8

    move-object/from16 v12, p9

    move-object/from16 v38, p12

    move-object/from16 p9, v15

    move-object/from16 v15, p10

    .line 125
    invoke-interface {v5, v9}, LY/m;->u(Ljava/lang/Object;)V

    .line 126
    :goto_3d
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 127
    invoke-static {v6, v7, v4, v2, v9}, LK/O;->a(Landroidx/compose/ui/e;ZLandroidx/compose/ui/focus/k;LB/m;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object v9

    if-eqz v7, :cond_5e

    if-nez v34, :cond_5e

    const/16 v41, 0x1

    :goto_3e
    move-object/from16 p12, v4

    goto :goto_3f

    :cond_5e
    const/16 v41, 0x0

    goto :goto_3e

    .line 128
    :goto_3f
    invoke-static/range {v41 .. v41}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    move/from16 v41, v7

    const/4 v7, 0x0

    invoke-static {v4, v5, v7}, LY/U1;->o(Ljava/lang/Object;LY/m;I)LY/h2;

    move-result-object v4

    .line 129
    sget-object v7, LTd/L;->a:LTd/L;

    invoke-interface {v5, v4}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v42

    invoke-interface {v5, v13}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v43

    or-int v42, v42, v43

    invoke-interface {v5, v11}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v43

    or-int v42, v42, v43

    invoke-interface {v5, v15}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v43

    or-int v42, v42, v43

    move-object/from16 p4, v4

    const/16 v4, 0x20

    if-le v10, v4, :cond_60

    invoke-interface {v5, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v27

    if-nez v27, :cond_5f

    goto :goto_40

    :cond_5f
    move-object/from16 p8, v0

    goto :goto_41

    :cond_60
    :goto_40
    move-object/from16 p8, v0

    and-int/lit8 v0, v40, 0x30

    if-ne v0, v4, :cond_61

    :goto_41
    const/4 v0, 0x1

    goto :goto_42

    :cond_61
    const/4 v0, 0x0

    :goto_42
    or-int v0, v42, v0

    .line 130
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_63

    .line 131
    invoke-virtual/range {p15 .. p15}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_62

    goto :goto_43

    :cond_62
    move-object/from16 v42, p4

    move-object/from16 v0, p8

    goto :goto_44

    .line 132
    :cond_63
    :goto_43
    new-instance v0, LK/i$b;

    const/4 v4, 0x0

    move-object/from16 p7, p8

    move-object/from16 p2, v0

    move-object/from16 p8, v4

    move-object/from16 p5, v11

    move-object/from16 p3, v13

    move-object/from16 p6, v15

    invoke-direct/range {p2 .. p8}, LK/i$b;-><init>(LK/y;LY/h2;La1/W;LQ/F;La1/t;LZd/e;)V

    move-object/from16 v4, p2

    move-object/from16 v42, p4

    move-object/from16 v0, p7

    .line 133
    invoke-interface {v5, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 134
    :goto_44
    check-cast v4, Lkotlin/jvm/functions/Function2;

    move-object/from16 p13, v9

    const/4 v9, 0x6

    invoke-static {v7, v4, v5, v9}, LY/b0;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 135
    invoke-interface {v5, v13}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v4

    .line 136
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_64

    .line 137
    invoke-virtual/range {p15 .. p15}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v7, v4, :cond_65

    .line 138
    :cond_64
    new-instance v7, LK/i$k;

    invoke-direct {v7, v13}, LK/i$k;-><init>(LK/y;)V

    .line 139
    invoke-interface {v5, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 140
    :cond_65
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v7}, LQ/s;->k(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object v4

    .line 141
    invoke-interface {v5, v13}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v7

    const/16 v9, 0x4000

    if-ne v3, v9, :cond_66

    const/4 v9, 0x1

    goto :goto_45

    :cond_66
    const/4 v9, 0x0

    :goto_45
    or-int/2addr v7, v9

    const/16 v9, 0x800

    if-ne v8, v9, :cond_67

    const/4 v9, 0x1

    goto :goto_46

    :cond_67
    const/4 v9, 0x0

    :goto_46
    or-int/2addr v7, v9

    invoke-interface {v5, v12}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-interface {v5, v15}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    .line 142
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_69

    .line 143
    invoke-virtual/range {p15 .. p15}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v9, v7, :cond_68

    goto :goto_47

    :cond_68
    move-object/from16 p10, v15

    move/from16 v7, v41

    move-object v15, v13

    move-object v13, v12

    move-object/from16 v12, p12

    goto :goto_48

    .line 144
    :cond_69
    :goto_47
    new-instance v7, LK/i$l;

    move-object/from16 p4, p12

    move-object/from16 p2, v7

    move-object/from16 p8, v12

    move-object/from16 p3, v13

    move-object/from16 p7, v15

    move/from16 p5, v34

    move/from16 p6, v41

    invoke-direct/range {p2 .. p8}, LK/i$l;-><init>(LK/y;Landroidx/compose/ui/focus/k;ZZLQ/F;La1/J;)V

    move-object/from16 v9, p2

    move-object/from16 v15, p3

    move-object/from16 v12, p4

    move/from16 v7, p6

    move-object/from16 p10, p7

    move-object/from16 v13, p8

    .line 145
    invoke-interface {v5, v9}, LY/m;->u(Ljava/lang/Object;)V

    .line 146
    :goto_48
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v4, v2, v7, v9}, LK/T;->a(Landroidx/compose/ui/e;LB/m;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object v4

    .line 147
    invoke-virtual/range {p10 .. p10}, LQ/F;->I()LQ/h;

    move-result-object v9

    move/from16 p4, v7

    .line 148
    invoke-virtual/range {p10 .. p10}, LQ/F;->M()LK/J;

    move-result-object v7

    .line 149
    invoke-static {v4, v9, v7}, LQ/s;->i(Landroidx/compose/ui/e;LQ/h;LK/J;)Landroidx/compose/ui/e;

    move-result-object v4

    .line 150
    invoke-static {}, LK/e0;->a()LE0/x;

    move-result-object v7

    move-object/from16 v22, v2

    move-object/from16 p12, v12

    const/4 v2, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x2

    invoke-static {v4, v7, v2, v12, v9}, LE0/y;->b(Landroidx/compose/ui/e;LE0/x;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    .line 151
    invoke-interface {v5, v15}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v2

    const/4 v9, 0x4

    if-ne v14, v9, :cond_6a

    const/4 v7, 0x1

    goto :goto_49

    :cond_6a
    const/4 v7, 0x0

    :goto_49
    or-int/2addr v2, v7

    invoke-interface {v5, v13}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v2, v7

    .line 152
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_6b

    .line 153
    invoke-virtual/range {p15 .. p15}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v7, v2, :cond_6c

    .line 154
    :cond_6b
    new-instance v7, LK/i$h;

    invoke-direct {v7, v15, v1, v13}, LK/i$h;-><init>(LK/y;La1/U;La1/J;)V

    .line 155
    invoke-interface {v5, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 156
    :cond_6c
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v7}, Landroidx/compose/ui/draw/b;->b(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object v2

    .line 157
    invoke-interface {v5, v15}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v7

    const/16 v9, 0x800

    if-ne v8, v9, :cond_6d

    const/4 v9, 0x1

    goto :goto_4a

    :cond_6d
    const/4 v9, 0x0

    :goto_4a
    or-int/2addr v7, v9

    move-object/from16 v9, v32

    invoke-interface {v5, v9}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v7, v12

    move-object/from16 v12, p10

    invoke-interface {v5, v12}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v32

    or-int v7, v7, v32

    const/4 v1, 0x4

    if-ne v14, v1, :cond_6e

    const/4 v1, 0x1

    goto :goto_4b

    :cond_6e
    const/4 v1, 0x0

    :goto_4b
    or-int/2addr v1, v7

    invoke-interface {v5, v13}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v1, v7

    .line 158
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_70

    .line 159
    invoke-virtual/range {p15 .. p15}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v7, v1, :cond_6f

    goto :goto_4c

    :cond_6f
    move-object/from16 v32, v15

    move-object v15, v12

    move-object v12, v13

    move-object/from16 v13, v32

    move/from16 v41, p4

    move-object/from16 v32, v9

    goto :goto_4d

    .line 160
    :cond_70
    :goto_4c
    new-instance v1, LK/i$j;

    move-object/from16 p7, p0

    move-object/from16 p2, v1

    move-object/from16 p5, v9

    move-object/from16 p6, v12

    move-object/from16 p8, v13

    move-object/from16 p3, v15

    invoke-direct/range {p2 .. p8}, LK/i$j;-><init>(LK/y;ZLandroidx/compose/ui/platform/F1;LQ/F;La1/U;La1/J;)V

    move-object/from16 v7, p2

    move-object/from16 v13, p3

    move/from16 v41, p4

    move-object/from16 v32, p5

    move-object/from16 v15, p6

    move-object/from16 v12, p8

    .line 161
    invoke-interface {v5, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 162
    :goto_4d
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v7}, Landroidx/compose/ui/layout/n;->a(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object v1

    move-object/from16 v7, p9

    .line 163
    invoke-interface {v5, v7}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v9

    move-object/from16 p16, v1

    const/4 v1, 0x4

    if-ne v14, v1, :cond_71

    const/4 v1, 0x1

    goto :goto_4e

    :cond_71
    const/4 v1, 0x0

    :goto_4e
    or-int/2addr v1, v9

    const/16 v9, 0x800

    if-ne v8, v9, :cond_72

    const/4 v8, 0x1

    goto :goto_4f

    :cond_72
    const/4 v8, 0x0

    :goto_4f
    or-int/2addr v1, v8

    const/4 v8, 0x0

    invoke-interface {v5, v8}, LY/m;->a(Z)Z

    move-result v9

    or-int/2addr v1, v9

    const/16 v9, 0x4000

    if-ne v3, v9, :cond_73

    const/4 v3, 0x1

    goto :goto_50

    :cond_73
    const/4 v3, 0x0

    :goto_50
    or-int/2addr v1, v3

    invoke-interface {v5, v13}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-interface {v5, v12}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-interface {v5, v15}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    const/16 v9, 0x20

    if-le v10, v9, :cond_74

    invoke-interface {v5, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_75

    :cond_74
    and-int/lit8 v3, v40, 0x30

    if-ne v3, v9, :cond_76

    :cond_75
    const/4 v3, 0x1

    goto :goto_51

    :cond_76
    const/4 v3, 0x0

    :goto_51
    or-int/2addr v1, v3

    .line 164
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_78

    .line 165
    invoke-virtual/range {p15 .. p15}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_77

    goto :goto_52

    :cond_77
    move-object v7, v15

    move/from16 v1, v41

    move-object v15, v13

    move-object v13, v12

    move-object/from16 v12, p12

    goto :goto_53

    .line 166
    :cond_78
    :goto_52
    new-instance v1, LK/i$n;

    move-object/from16 p4, p0

    move-object/from16 p8, v0

    move-object/from16 p2, v1

    move-object/from16 p3, v7

    move/from16 p6, v8

    move-object/from16 p10, v12

    move-object/from16 p9, v13

    move-object/from16 p11, v15

    move/from16 p7, v34

    move/from16 p5, v41

    invoke-direct/range {p2 .. p12}, LK/i$n;-><init>(La1/d0;La1/U;ZZZLa1/t;LK/y;La1/J;LQ/F;Landroidx/compose/ui/focus/k;)V

    move-object/from16 v3, p2

    move/from16 v1, p5

    move-object/from16 v15, p9

    move-object/from16 v13, p10

    move-object/from16 v7, p11

    move-object/from16 v12, p12

    .line 167
    invoke-interface {v5, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 168
    :goto_53
    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x1

    invoke-static {v6, v8, v3}, LR0/r;->e(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object v3

    if-eqz v1, :cond_79

    if-nez v34, :cond_79

    .line 169
    invoke-interface/range {v32 .. v32}, Landroidx/compose/ui/platform/F1;->a()Z

    move-result v8

    if-eqz v8, :cond_79

    invoke-virtual {v15}, LK/y;->x()Z

    move-result v8

    if-nez v8, :cond_79

    const/16 p7, 0x1

    :goto_54
    move-object/from16 p4, p0

    move-object/from16 p6, p14

    move-object/from16 p2, v6

    move-object/from16 p5, v13

    move-object/from16 p3, v15

    goto :goto_55

    :cond_79
    const/16 p7, 0x0

    goto :goto_54

    .line 170
    :goto_55
    invoke-static/range {p2 .. p7}, LK/K;->a(Landroidx/compose/ui/e;LK/y;La1/U;La1/J;Ls0/h0;Z)Landroidx/compose/ui/e;

    move-result-object v9

    move-object/from16 v8, p2

    move-object/from16 v15, p3

    move-object/from16 v6, p4

    move-object/from16 v13, p5

    move-object/from16 v29, p6

    .line 171
    invoke-interface {v5, v7}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v30

    move-object/from16 p12, v2

    .line 172
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v2

    if-nez v30, :cond_7a

    .line 173
    invoke-virtual/range {p15 .. p15}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v2, v8, :cond_7b

    .line 174
    :cond_7a
    new-instance v2, LK/i$c;

    invoke-direct {v2, v7}, LK/i$c;-><init>(LQ/F;)V

    .line 175
    invoke-interface {v5, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 176
    :cond_7b
    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    invoke-static {v7, v2, v5, v8}, LY/b0;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LY/m;I)V

    .line 177
    invoke-interface {v5, v15}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v5, v11}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v24

    or-int v2, v2, v24

    const/4 v8, 0x4

    if-ne v14, v8, :cond_7c

    const/4 v14, 0x1

    goto :goto_56

    :cond_7c
    const/4 v14, 0x0

    :goto_56
    or-int/2addr v2, v14

    const/16 v8, 0x20

    if-le v10, v8, :cond_7d

    invoke-interface {v5, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_7e

    :cond_7d
    and-int/lit8 v14, v40, 0x30

    if-ne v14, v8, :cond_7f

    :cond_7e
    const/4 v14, 0x1

    goto :goto_57

    :cond_7f
    const/4 v14, 0x0

    :goto_57
    or-int/2addr v2, v14

    .line 178
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v8

    if-nez v2, :cond_80

    .line 179
    invoke-virtual/range {p15 .. p15}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v8, v2, :cond_81

    .line 180
    :cond_80
    new-instance v8, LK/i$d;

    invoke-direct {v8, v15, v11, v6, v0}, LK/i$d;-><init>(LK/y;La1/W;La1/U;La1/t;)V

    .line 181
    invoke-interface {v5, v8}, LY/m;->u(Ljava/lang/Object;)V

    .line 182
    :cond_81
    check-cast v8, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v2, v40, 0x3

    and-int/lit8 v2, v2, 0xe

    invoke-static {v0, v8, v5, v2}, LY/b0;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LY/m;I)V

    .line 183
    invoke-virtual {v15}, LK/y;->m()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    xor-int/lit8 v8, v34, 0x1

    move/from16 v11, v28

    const/4 v14, 0x1

    if-ne v11, v14, :cond_82

    move/from16 v16, v14

    goto :goto_58

    :cond_82
    const/16 v16, 0x0

    .line 184
    :goto_58
    invoke-virtual {v0}, La1/t;->e()I

    move-result v28

    move-object/from16 p6, v2

    move-object/from16 p5, v6

    move-object/from16 p4, v7

    move/from16 p7, v8

    move-object/from16 p9, v13

    move-object/from16 p3, v15

    move/from16 p8, v16

    move-object/from16 p10, v26

    move/from16 p11, v28

    .line 185
    invoke-static/range {p2 .. p11}, LK/Q;->a(Landroidx/compose/ui/e;LK/y;LQ/F;La1/U;Lkotlin/jvm/functions/Function1;ZZLa1/J;LK/j0;I)Landroidx/compose/ui/e;

    move-result-object v2

    move-object/from16 v8, p2

    .line 186
    invoke-static/range {v42 .. v42}, LK/i;->b(LY/h2;)Z

    move-result v6

    invoke-interface {v5, v15}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v16

    const/16 v14, 0x20

    if-le v10, v14, :cond_83

    invoke-interface {v5, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_84

    :cond_83
    and-int/lit8 v10, v40, 0x30

    if-ne v10, v14, :cond_85

    :cond_84
    const/4 v14, 0x1

    goto :goto_59

    :cond_85
    const/4 v14, 0x0

    :goto_59
    or-int v10, v16, v14

    move-object/from16 v14, v35

    invoke-interface {v5, v14}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v16

    or-int v10, v10, v16

    move-object/from16 p2, v9

    .line 187
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v9

    if-nez v10, :cond_86

    .line 188
    invoke-virtual/range {p15 .. p15}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v9, v10, :cond_87

    .line 189
    :cond_86
    new-instance v9, LK/i$o;

    invoke-direct {v9, v15, v12, v0, v14}, LK/i$o;-><init>(LK/y;Landroidx/compose/ui/focus/k;La1/t;LN/q0;)V

    .line 190
    invoke-interface {v5, v9}, LY/m;->u(Ljava/lang/Object;)V

    .line 191
    :cond_87
    check-cast v9, Lie/a;

    invoke-static {v8, v6, v9}, Landroidx/compose/foundation/text/handwriting/a;->c(Landroidx/compose/ui/e;ZLie/a;)Landroidx/compose/ui/e;

    move-result-object v6

    move-object/from16 v9, v33

    .line 192
    invoke-static {v9, v14, v15, v7}, Landroidx/compose/foundation/text/input/internal/a;->a(Landroidx/compose/ui/e;LN/q0;LK/y;LQ/F;)Landroidx/compose/ui/e;

    move-result-object v10

    .line 193
    invoke-interface {v10, v6}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    move-object/from16 v10, p13

    .line 194
    invoke-interface {v6, v10}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    move-object/from16 v10, v18

    .line 195
    invoke-static {v6, v15, v10}, LK/N;->b(Landroidx/compose/ui/e;LK/y;Lq0/h;)Landroidx/compose/ui/e;

    move-result-object v6

    .line 196
    invoke-static {v6, v15, v7}, LK/i;->p(Landroidx/compose/ui/e;LK/y;LQ/F;)Landroidx/compose/ui/e;

    move-result-object v6

    .line 197
    invoke-interface {v6, v2}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    move-object/from16 v6, v20

    move-object/from16 v10, v22

    .line 198
    invoke-static {v2, v6, v10, v1}, LK/U;->d(Landroidx/compose/ui/e;LK/V;LB/m;Z)Landroidx/compose/ui/e;

    move-result-object v2

    .line 199
    invoke-interface {v2, v4}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    .line 200
    invoke-interface {v2, v3}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    .line 201
    new-instance v3, LK/i$g;

    invoke-direct {v3, v15}, LK/i$g;-><init>(LK/y;)V

    invoke-static {v2, v3}, Landroidx/compose/ui/layout/n;->a(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object v2

    if-eqz v1, :cond_88

    .line 202
    invoke-virtual {v15}, LK/y;->e()Z

    move-result v3

    if-eqz v3, :cond_88

    invoke-virtual {v15}, LK/y;->y()Z

    move-result v3

    if-eqz v3, :cond_88

    invoke-interface/range {v32 .. v32}, Landroidx/compose/ui/platform/F1;->a()Z

    move-result v3

    if-eqz v3, :cond_88

    const/16 v24, 0x1

    goto :goto_5a

    :cond_88
    const/16 v24, 0x0

    :goto_5a
    if-eqz v24, :cond_89

    .line 203
    invoke-static {v8, v7}, LQ/H;->c(Landroidx/compose/ui/e;LQ/F;)Landroidx/compose/ui/e;

    move-result-object v3

    move-object v12, v3

    :goto_5b
    move-object v3, v0

    goto :goto_5c

    :cond_89
    move-object v12, v8

    goto :goto_5b

    .line 204
    :goto_5c
    new-instance v0, LK/i$e;

    move/from16 v41, v1

    move-object/from16 v45, v2

    move-object/from16 v20, v3

    move-object/from16 v44, v5

    move-object v14, v7

    move-object/from16 v33, v9

    move-object/from16 v22, v10

    move v5, v11

    move-object/from16 v18, v13

    move-object v2, v15

    move-object/from16 v1, v19

    move/from16 v4, v23

    move/from16 v15, v24

    move/from16 v16, v34

    move-object/from16 v3, v36

    move-object/from16 v19, v37

    move-object/from16 v13, v38

    move-object/from16 v8, v39

    move-object/from16 v7, p0

    move-object/from16 v9, p2

    move-object/from16 v10, p12

    move-object/from16 v11, p16

    invoke-direct/range {v0 .. v19}, LK/i$e;-><init>(Lie/o;LK/y;LU0/Y0;IILK/V;La1/U;La1/f0;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;LH/b;LQ/F;ZZLkotlin/jvm/functions/Function1;La1/J;Li1/d;)V

    move/from16 v28, v5

    move-object v15, v14

    const/16 v2, 0x36

    const v3, -0x164ff220

    move-object/from16 v5, v44

    const/4 v14, 0x1

    invoke-static {v3, v14, v0, v5, v2}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    move-result-object v0

    const/16 v2, 0x180

    move-object/from16 v3, v45

    invoke-static {v3, v15, v0, v5, v2}, LK/i;->c(Landroidx/compose/ui/e;LQ/F;Lkotlin/jvm/functions/Function2;LY/m;I)V

    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_8a

    invoke-static {}, LY/w;->T()V

    :cond_8a
    move-object/from16 v16, v1

    move v11, v4

    move-object/from16 v44, v5

    move-object/from16 v6, v17

    move-object/from16 v12, v20

    move/from16 v9, v21

    move-object/from16 v7, v22

    move-object/from16 v13, v25

    move/from16 v10, v28

    move-object/from16 v8, v29

    move-object/from16 v3, v33

    move/from16 v15, v34

    move-object/from16 v4, v36

    move-object/from16 v5, v39

    move/from16 v14, v41

    .line 205
    :goto_5d
    invoke-interface/range {v44 .. v44}, LY/m;->k()LY/B1;

    move-result-object v0

    if-eqz v0, :cond_8b

    move-object v1, v0

    new-instance v0, LK/i$f;

    move-object/from16 v2, p1

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    move-object/from16 v46, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v19}, LK/i$f;-><init>(La1/U;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LU0/Y0;La1/f0;Lkotlin/jvm/functions/Function1;LB/m;Ls0/h0;ZIILa1/t;LK/w;ZZLie/o;III)V

    move-object/from16 v1, v46

    invoke-interface {v1, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    :cond_8b
    return-void
.end method

.method private static final b(LY/h2;)Z
    .locals 0

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final c(Landroidx/compose/ui/e;LQ/F;Lkotlin/jvm/functions/Function2;LY/m;I)V
    .locals 8

    .line 1
    const v0, -0x1399887

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    and-int/lit8 v1, p4, 0x6

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p3, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x2

    .line 21
    :goto_0
    or-int/2addr v1, p4

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v1, p4

    .line 24
    :goto_1
    and-int/lit8 v2, p4, 0x30

    .line 25
    .line 26
    if-nez v2, :cond_3

    .line 27
    .line 28
    invoke-interface {p3, p1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    const/16 v2, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v2, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr v1, v2

    .line 40
    :cond_3
    and-int/lit16 v2, p4, 0x180

    .line 41
    .line 42
    if-nez v2, :cond_5

    .line 43
    .line 44
    invoke-interface {p3, p2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_4

    .line 49
    .line 50
    const/16 v2, 0x100

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    const/16 v2, 0x80

    .line 54
    .line 55
    :goto_3
    or-int/2addr v1, v2

    .line 56
    :cond_5
    and-int/lit16 v2, v1, 0x93

    .line 57
    .line 58
    const/16 v3, 0x92

    .line 59
    .line 60
    if-ne v2, v3, :cond_7

    .line 61
    .line 62
    invoke-interface {p3}, LY/m;->i()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_6

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_6
    invoke-interface {p3}, LY/m;->K()V

    .line 70
    .line 71
    .line 72
    goto/16 :goto_6

    .line 73
    .line 74
    :cond_7
    :goto_4
    invoke-static {}, LY/w;->L()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_8

    .line 79
    .line 80
    const/4 v2, -0x1

    .line 81
    const-string v3, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:801)"

    .line 82
    .line 83
    invoke-static {v0, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_8
    sget-object v0, Ll0/e;->a:Ll0/e$a;

    .line 87
    .line 88
    invoke-virtual {v0}, Ll0/e$a;->o()Ll0/e;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const/4 v2, 0x1

    .line 93
    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const/4 v2, 0x0

    .line 98
    invoke-static {p3, v2}, LY/h;->a(LY/m;I)I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    invoke-interface {p3}, LY/m;->r()LY/I;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-static {p3, p0}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    sget-object v5, LK0/g;->M:LK0/g$a;

    .line 111
    .line 112
    invoke-virtual {v5}, LK0/g$a;->a()Lie/a;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-interface {p3}, LY/m;->j()LY/d;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    if-nez v7, :cond_9

    .line 121
    .line 122
    invoke-static {}, LY/h;->d()V

    .line 123
    .line 124
    .line 125
    :cond_9
    invoke-interface {p3}, LY/m;->I()V

    .line 126
    .line 127
    .line 128
    invoke-interface {p3}, LY/m;->e()Z

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    if-eqz v7, :cond_a

    .line 133
    .line 134
    invoke-interface {p3, v6}, LY/m;->h(Lie/a;)V

    .line 135
    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_a
    invoke-interface {p3}, LY/m;->s()V

    .line 139
    .line 140
    .line 141
    :goto_5
    invoke-static {p3}, LY/m2;->b(LY/m;)LY/m;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    invoke-virtual {v5}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    invoke-static {v6, v0, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v5}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {v6, v3, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v5}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-interface {v6}, LY/m;->e()Z

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    if-nez v3, :cond_b

    .line 168
    .line 169
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    invoke-static {v3, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    if-nez v3, :cond_c

    .line 182
    .line 183
    :cond_b
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-interface {v6, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-interface {v6, v2, v0}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 195
    .line 196
    .line 197
    :cond_c
    invoke-virtual {v5}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-static {v6, v4, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 202
    .line 203
    .line 204
    sget-object v0, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 205
    .line 206
    shr-int/lit8 v0, v1, 0x3

    .line 207
    .line 208
    and-int/lit8 v0, v0, 0x7e

    .line 209
    .line 210
    invoke-static {p1, p2, p3, v0}, LK/g;->a(LQ/F;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 211
    .line 212
    .line 213
    invoke-interface {p3}, LY/m;->x()V

    .line 214
    .line 215
    .line 216
    invoke-static {}, LY/w;->L()Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_d

    .line 221
    .line 222
    invoke-static {}, LY/w;->T()V

    .line 223
    .line 224
    .line 225
    :cond_d
    :goto_6
    invoke-interface {p3}, LY/m;->k()LY/B1;

    .line 226
    .line 227
    .line 228
    move-result-object p3

    .line 229
    if-eqz p3, :cond_e

    .line 230
    .line 231
    new-instance v0, LK/i$p;

    .line 232
    .line 233
    invoke-direct {v0, p0, p1, p2, p4}, LK/i$p;-><init>(Landroidx/compose/ui/e;LQ/F;Lkotlin/jvm/functions/Function2;I)V

    .line 234
    .line 235
    .line 236
    invoke-interface {p3, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 237
    .line 238
    .line 239
    :cond_e
    return-void
.end method

.method private static final d(LQ/F;ZLY/m;I)V
    .locals 8

    .line 1
    const v0, 0x25552d88

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    and-int/lit8 v1, p3, 0x6

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p2, p0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x2

    .line 21
    :goto_0
    or-int/2addr v1, p3

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v1, p3

    .line 24
    :goto_1
    and-int/lit8 v2, p3, 0x30

    .line 25
    .line 26
    if-nez v2, :cond_3

    .line 27
    .line 28
    invoke-interface {p2, p1}, LY/m;->a(Z)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    const/16 v2, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v2, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr v1, v2

    .line 40
    :cond_3
    and-int/lit8 v2, v1, 0x13

    .line 41
    .line 42
    const/16 v3, 0x12

    .line 43
    .line 44
    if-ne v2, v3, :cond_5

    .line 45
    .line 46
    invoke-interface {p2}, LY/m;->i()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_4

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    invoke-interface {p2}, LY/m;->K()V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_c

    .line 57
    .line 58
    :cond_5
    :goto_3
    invoke-static {}, LY/w;->L()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_6

    .line 63
    .line 64
    const/4 v2, -0x1

    .line 65
    const-string v3, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1146)"

    .line 66
    .line 67
    invoke-static {v0, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_6
    if-eqz p1, :cond_11

    .line 71
    .line 72
    const v0, -0x4caa8122

    .line 73
    .line 74
    .line 75
    invoke-interface {p2, v0}, LY/m;->V(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, LQ/F;->L()LK/y;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const/4 v2, 0x0

    .line 83
    const/4 v3, 0x1

    .line 84
    if-eqz v0, :cond_8

    .line 85
    .line 86
    invoke-virtual {v0}, LK/y;->j()LK/Z;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-eqz v0, :cond_8

    .line 91
    .line 92
    invoke-virtual {v0}, LK/Z;->f()LU0/T0;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    if-eqz v0, :cond_8

    .line 97
    .line 98
    invoke-virtual {p0}, LQ/F;->L()LK/y;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    if-eqz v4, :cond_7

    .line 103
    .line 104
    invoke-virtual {v4}, LK/y;->z()Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    goto :goto_4

    .line 109
    :cond_7
    move v4, v3

    .line 110
    :goto_4
    if-nez v4, :cond_8

    .line 111
    .line 112
    move-object v2, v0

    .line 113
    :cond_8
    if-nez v2, :cond_a

    .line 114
    .line 115
    const v0, -0x4ca6908c

    .line 116
    .line 117
    .line 118
    invoke-interface {p2, v0}, LY/m;->V(I)V

    .line 119
    .line 120
    .line 121
    :cond_9
    :goto_5
    invoke-interface {p2}, LY/m;->O()V

    .line 122
    .line 123
    .line 124
    goto/16 :goto_a

    .line 125
    .line 126
    :cond_a
    const v0, -0x4ca6908b

    .line 127
    .line 128
    .line 129
    invoke-interface {p2, v0}, LY/m;->V(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, LQ/F;->O()La1/U;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v0}, La1/U;->k()J

    .line 137
    .line 138
    .line 139
    move-result-wide v4

    .line 140
    invoke-static {v4, v5}, LU0/W0;->h(J)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    const/4 v4, 0x0

    .line 145
    if-nez v0, :cond_d

    .line 146
    .line 147
    const v0, -0x642c2aa0

    .line 148
    .line 149
    .line 150
    invoke-interface {p2, v0}, LY/m;->V(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, LQ/F;->J()La1/J;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {p0}, LQ/F;->O()La1/U;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-virtual {v5}, La1/U;->k()J

    .line 162
    .line 163
    .line 164
    move-result-wide v5

    .line 165
    invoke-static {v5, v6}, LU0/W0;->n(J)I

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    invoke-interface {v0, v5}, La1/J;->b(I)I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    invoke-virtual {p0}, LQ/F;->J()La1/J;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-virtual {p0}, LQ/F;->O()La1/U;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-virtual {v6}, La1/U;->k()J

    .line 182
    .line 183
    .line 184
    move-result-wide v6

    .line 185
    invoke-static {v6, v7}, LU0/W0;->i(J)I

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    invoke-interface {v5, v6}, La1/J;->b(I)I

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    invoke-virtual {v2, v0}, LU0/T0;->c(I)Lg1/i;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    sub-int/2addr v5, v3

    .line 198
    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    invoke-virtual {v2, v5}, LU0/T0;->c(I)Lg1/i;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {p0}, LQ/F;->L()LK/y;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    if-eqz v5, :cond_b

    .line 211
    .line 212
    invoke-virtual {v5}, LK/y;->u()Z

    .line 213
    .line 214
    .line 215
    move-result v5

    .line 216
    if-ne v5, v3, :cond_b

    .line 217
    .line 218
    const v5, -0x642610e1

    .line 219
    .line 220
    .line 221
    invoke-interface {p2, v5}, LY/m;->V(I)V

    .line 222
    .line 223
    .line 224
    shl-int/lit8 v5, v1, 0x6

    .line 225
    .line 226
    and-int/lit16 v5, v5, 0x380

    .line 227
    .line 228
    or-int/lit8 v5, v5, 0x6

    .line 229
    .line 230
    invoke-static {v3, v0, p0, p2, v5}, LQ/G;->a(ZLg1/i;LQ/F;LY/m;I)V

    .line 231
    .line 232
    .line 233
    invoke-interface {p2}, LY/m;->O()V

    .line 234
    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_b
    const v0, -0x642262a6

    .line 238
    .line 239
    .line 240
    invoke-interface {p2, v0}, LY/m;->V(I)V

    .line 241
    .line 242
    .line 243
    invoke-interface {p2}, LY/m;->O()V

    .line 244
    .line 245
    .line 246
    :goto_6
    invoke-virtual {p0}, LQ/F;->L()LK/y;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    if-eqz v0, :cond_c

    .line 251
    .line 252
    invoke-virtual {v0}, LK/y;->t()Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-ne v0, v3, :cond_c

    .line 257
    .line 258
    const v0, -0x64212d60

    .line 259
    .line 260
    .line 261
    invoke-interface {p2, v0}, LY/m;->V(I)V

    .line 262
    .line 263
    .line 264
    shl-int/lit8 v0, v1, 0x6

    .line 265
    .line 266
    and-int/lit16 v0, v0, 0x380

    .line 267
    .line 268
    or-int/lit8 v0, v0, 0x6

    .line 269
    .line 270
    invoke-static {v4, v2, p0, p2, v0}, LQ/G;->a(ZLg1/i;LQ/F;LY/m;I)V

    .line 271
    .line 272
    .line 273
    invoke-interface {p2}, LY/m;->O()V

    .line 274
    .line 275
    .line 276
    goto :goto_7

    .line 277
    :cond_c
    const v0, -0x641d82e6

    .line 278
    .line 279
    .line 280
    invoke-interface {p2, v0}, LY/m;->V(I)V

    .line 281
    .line 282
    .line 283
    invoke-interface {p2}, LY/m;->O()V

    .line 284
    .line 285
    .line 286
    :goto_7
    invoke-interface {p2}, LY/m;->O()V

    .line 287
    .line 288
    .line 289
    goto :goto_8

    .line 290
    :cond_d
    const v0, -0x641d3d26

    .line 291
    .line 292
    .line 293
    invoke-interface {p2, v0}, LY/m;->V(I)V

    .line 294
    .line 295
    .line 296
    invoke-interface {p2}, LY/m;->O()V

    .line 297
    .line 298
    .line 299
    :goto_8
    invoke-virtual {p0}, LQ/F;->L()LK/y;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    if-eqz v0, :cond_9

    .line 304
    .line 305
    invoke-virtual {p0}, LQ/F;->S()Z

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    if-eqz v1, :cond_e

    .line 310
    .line 311
    invoke-virtual {v0, v4}, LK/y;->K(Z)V

    .line 312
    .line 313
    .line 314
    :cond_e
    invoke-virtual {v0}, LK/y;->e()Z

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    if-eqz v1, :cond_10

    .line 319
    .line 320
    invoke-virtual {v0}, LK/y;->s()Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-eqz v0, :cond_f

    .line 325
    .line 326
    invoke-virtual {p0}, LQ/F;->l0()V

    .line 327
    .line 328
    .line 329
    goto :goto_9

    .line 330
    :cond_f
    invoke-virtual {p0}, LQ/F;->R()V

    .line 331
    .line 332
    .line 333
    :cond_10
    :goto_9
    sget-object v0, LTd/L;->a:LTd/L;

    .line 334
    .line 335
    goto/16 :goto_5

    .line 336
    .line 337
    :goto_a
    invoke-interface {p2}, LY/m;->O()V

    .line 338
    .line 339
    .line 340
    goto :goto_b

    .line 341
    :cond_11
    const v0, 0x26d2223f

    .line 342
    .line 343
    .line 344
    invoke-interface {p2, v0}, LY/m;->V(I)V

    .line 345
    .line 346
    .line 347
    invoke-interface {p2}, LY/m;->O()V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p0}, LQ/F;->R()V

    .line 351
    .line 352
    .line 353
    :goto_b
    invoke-static {}, LY/w;->L()Z

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    if-eqz v0, :cond_12

    .line 358
    .line 359
    invoke-static {}, LY/w;->T()V

    .line 360
    .line 361
    .line 362
    :cond_12
    :goto_c
    invoke-interface {p2}, LY/m;->k()LY/B1;

    .line 363
    .line 364
    .line 365
    move-result-object p2

    .line 366
    if-eqz p2, :cond_13

    .line 367
    .line 368
    new-instance v0, LK/i$q;

    .line 369
    .line 370
    invoke-direct {v0, p0, p1, p3}, LK/i$q;-><init>(LQ/F;ZI)V

    .line 371
    .line 372
    .line 373
    invoke-interface {p2, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 374
    .line 375
    .line 376
    :cond_13
    return-void
.end method

.method public static final e(LQ/F;LY/m;I)V
    .locals 9

    .line 1
    const v0, -0x5597ad88

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object v5

    .line 8
    and-int/lit8 p1, p2, 0x6

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    invoke-interface {v5, p0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move p1, v1

    .line 22
    :goto_0
    or-int/2addr p1, p2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move p1, p2

    .line 25
    :goto_1
    and-int/lit8 v2, p1, 0x3

    .line 26
    .line 27
    if-ne v2, v1, :cond_3

    .line 28
    .line 29
    invoke-interface {v5}, LY/m;->i()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    invoke-interface {v5}, LY/m;->K()V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_4

    .line 46
    .line 47
    const/4 v1, -0x1

    .line 48
    const-string v2, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1189)"

    .line 49
    .line 50
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_4
    invoke-virtual {p0}, LQ/F;->L()LK/y;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz p1, :cond_d

    .line 58
    .line 59
    invoke-virtual {p1}, LK/y;->r()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    const/4 v0, 0x1

    .line 64
    if-ne p1, v0, :cond_d

    .line 65
    .line 66
    invoke-virtual {p0}, LQ/F;->N()LU0/e;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-eqz p1, :cond_d

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-lez p1, :cond_d

    .line 77
    .line 78
    const p1, -0x11039298

    .line 79
    .line 80
    .line 81
    invoke-interface {v5, p1}, LY/m;->V(I)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v5, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    if-nez p1, :cond_5

    .line 93
    .line 94
    sget-object p1, LY/m;->a:LY/m$a;

    .line 95
    .line 96
    invoke-virtual {p1}, LY/m$a;->a()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    if-ne v1, p1, :cond_6

    .line 101
    .line 102
    :cond_5
    invoke-virtual {p0}, LQ/F;->r()LK/J;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-interface {v5, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_6
    check-cast v1, LK/J;

    .line 110
    .line 111
    invoke-static {}, Landroidx/compose/ui/platform/w0;->e()LY/b1;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-interface {v5, p1}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, Li1/d;

    .line 120
    .line 121
    invoke-virtual {p0, p1}, LQ/F;->B(Li1/d;)J

    .line 122
    .line 123
    .line 124
    move-result-wide v2

    .line 125
    invoke-interface {v5, v2, v3}, LY/m;->d(J)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    if-nez p1, :cond_7

    .line 134
    .line 135
    sget-object p1, LY/m;->a:LY/m$a;

    .line 136
    .line 137
    invoke-virtual {p1}, LY/m$a;->a()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-ne v4, p1, :cond_8

    .line 142
    .line 143
    :cond_7
    new-instance v4, LK/i$r;

    .line 144
    .line 145
    invoke-direct {v4, v2, v3}, LK/i$r;-><init>(J)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v5, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :cond_8
    check-cast v4, LQ/i;

    .line 152
    .line 153
    sget-object p1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 154
    .line 155
    invoke-interface {v5, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    invoke-interface {v5, p0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    or-int/2addr v6, v7

    .line 164
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    const/4 v8, 0x0

    .line 169
    if-nez v6, :cond_9

    .line 170
    .line 171
    sget-object v6, LY/m;->a:LY/m$a;

    .line 172
    .line 173
    invoke-virtual {v6}, LY/m$a;->a()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    if-ne v7, v6, :cond_a

    .line 178
    .line 179
    :cond_9
    new-instance v7, LK/i$s;

    .line 180
    .line 181
    invoke-direct {v7, v1, p0, v8}, LK/i$s;-><init>(LK/J;LQ/F;LZd/e;)V

    .line 182
    .line 183
    .line 184
    invoke-interface {v5, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 188
    .line 189
    invoke-static {p1, v1, v7}, LE0/V;->d(Landroidx/compose/ui/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/e;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-interface {v5, v2, v3}, LY/m;->d(J)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    if-nez v1, :cond_b

    .line 202
    .line 203
    sget-object v1, LY/m;->a:LY/m$a;

    .line 204
    .line 205
    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    if-ne v6, v1, :cond_c

    .line 210
    .line 211
    :cond_b
    new-instance v6, LK/i$t;

    .line 212
    .line 213
    invoke-direct {v6, v2, v3}, LK/i$t;-><init>(J)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v5, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    :cond_c
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 220
    .line 221
    const/4 v1, 0x0

    .line 222
    invoke-static {p1, v1, v6, v0, v8}, LR0/r;->f(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    const/4 v6, 0x0

    .line 227
    const/4 v7, 0x4

    .line 228
    move-object v1, v4

    .line 229
    const-wide/16 v3, 0x0

    .line 230
    .line 231
    invoke-static/range {v1 .. v7}, LK/a;->a(LQ/i;Landroidx/compose/ui/e;JLY/m;II)V

    .line 232
    .line 233
    .line 234
    invoke-interface {v5}, LY/m;->O()V

    .line 235
    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_d
    const p1, -0x10f16b42

    .line 239
    .line 240
    .line 241
    invoke-interface {v5, p1}, LY/m;->V(I)V

    .line 242
    .line 243
    .line 244
    invoke-interface {v5}, LY/m;->O()V

    .line 245
    .line 246
    .line 247
    :goto_3
    invoke-static {}, LY/w;->L()Z

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    if-eqz p1, :cond_e

    .line 252
    .line 253
    invoke-static {}, LY/w;->T()V

    .line 254
    .line 255
    .line 256
    :cond_e
    :goto_4
    invoke-interface {v5}, LY/m;->k()LY/B1;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    if-eqz p1, :cond_f

    .line 261
    .line 262
    new-instance v0, LK/i$u;

    .line 263
    .line 264
    invoke-direct {v0, p0, p2}, LK/i$u;-><init>(LQ/F;I)V

    .line 265
    .line 266
    .line 267
    invoke-interface {p1, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 268
    .line 269
    .line 270
    :cond_f
    return-void
.end method

.method public static final synthetic f(LY/h2;)Z
    .locals 0

    .line 1
    invoke-static {p0}, LK/i;->b(LY/h2;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic g(Landroidx/compose/ui/e;LQ/F;Lkotlin/jvm/functions/Function2;LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, LK/i;->c(Landroidx/compose/ui/e;LQ/F;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic h(LQ/F;ZLY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LK/i;->d(LQ/F;ZLY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic i(LK/y;)V
    .locals 0

    .line 1
    invoke-static {p0}, LK/i;->n(LK/y;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic j(LK/y;La1/U;La1/J;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LK/i;->o(LK/y;La1/U;La1/J;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic k(La1/W;LK/y;La1/U;La1/t;La1/J;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, LK/i;->q(La1/W;LK/y;La1/U;La1/t;La1/J;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic l(LK/y;Landroidx/compose/ui/focus/k;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LK/i;->r(LK/y;Landroidx/compose/ui/focus/k;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final m(LH/b;La1/U;LK/H;LU0/T0;La1/J;LZd/e;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p1}, La1/U;->k()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, LU0/W0;->k(J)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-interface {p4, p1}, La1/J;->b(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p3}, LU0/T0;->l()LU0/S0;

    .line 14
    .line 15
    .line 16
    move-result-object p4

    .line 17
    invoke-virtual {p4}, LU0/S0;->j()LU0/e;

    .line 18
    .line 19
    .line 20
    move-result-object p4

    .line 21
    invoke-virtual {p4}, LU0/e;->length()I

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    if-ge p1, p4, :cond_0

    .line 26
    .line 27
    invoke-virtual {p3, p1}, LU0/T0;->d(I)Lr0/h;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    if-eqz p1, :cond_1

    .line 33
    .line 34
    add-int/lit8 p1, p1, -0x1

    .line 35
    .line 36
    invoke-virtual {p3, p1}, LU0/T0;->d(I)Lr0/h;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p2}, LK/H;->j()LU0/Y0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p2}, LK/H;->a()Li1/d;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {p2}, LK/H;->b()LY0/u$b;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const/16 v5, 0x18

    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    const/4 v3, 0x0

    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-static/range {v0 .. v6}, LK/M;->b(LU0/Y0;Li1/d;LY0/u$b;Ljava/lang/String;IILjava/lang/Object;)J

    .line 59
    .line 60
    .line 61
    move-result-wide p1

    .line 62
    new-instance p3, Lr0/h;

    .line 63
    .line 64
    invoke-static {p1, p2}, Li1/r;->f(J)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    int-to-float p1, p1

    .line 69
    const/4 p2, 0x0

    .line 70
    const/high16 p4, 0x3f800000    # 1.0f

    .line 71
    .line 72
    invoke-direct {p3, p2, p2, p4, p1}, Lr0/h;-><init>(FFFF)V

    .line 73
    .line 74
    .line 75
    move-object p1, p3

    .line 76
    :goto_0
    invoke-interface {p0, p1, p5}, LH/b;->a(Lr0/h;LZd/e;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-ne p0, p1, :cond_2

    .line 85
    .line 86
    return-object p0

    .line 87
    :cond_2
    sget-object p0, LTd/L;->a:LTd/L;

    .line 88
    .line 89
    return-object p0
.end method

.method private static final n(LK/y;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LK/y;->g()La1/c0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v1, LK/L;->a:LK/L$a;

    .line 8
    .line 9
    invoke-virtual {p0}, LK/y;->n()La1/l;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, LK/y;->m()Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v1, v0, v2, v3}, LK/L$a;->f(La1/c0;La1/l;Lkotlin/jvm/functions/Function1;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, v0}, LK/y;->E(La1/c0;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private static final o(LK/y;La1/U;La1/J;)V
    .locals 13

    .line 1
    sget-object v1, Li0/l;->e:Li0/l$a;

    .line 2
    .line 3
    invoke-virtual {v1}, Li0/l$a;->d()Li0/l;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v2}, Li0/l;->g()Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    move-object v3, v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    goto :goto_0

    .line 17
    :goto_1
    invoke-virtual {v1, v2}, Li0/l$a;->e(Li0/l;)Li0/l;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    :try_start_0
    invoke-virtual {p0}, LK/y;->j()LK/Z;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1, v2, v4, v3}, Li0/l$a;->l(Li0/l;Li0/l;Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    :try_start_1
    invoke-virtual {p0}, LK/y;->g()La1/c0;

    .line 32
    .line 33
    .line 34
    move-result-object v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    if-nez v10, :cond_2

    .line 36
    .line 37
    invoke-virtual {v1, v2, v4, v3}, Li0/l$a;->l(Li0/l;Li0/l;Lkotlin/jvm/functions/Function1;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    :try_start_2
    invoke-virtual {p0}, LK/y;->i()LI0/p;

    .line 42
    .line 43
    .line 44
    move-result-object v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 45
    if-nez v9, :cond_3

    .line 46
    .line 47
    invoke-virtual {v1, v2, v4, v3}, Li0/l$a;->l(Li0/l;Li0/l;Lkotlin/jvm/functions/Function1;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    :try_start_3
    sget-object v5, LK/L;->a:LK/L$a;

    .line 52
    .line 53
    invoke-virtual {p0}, LK/y;->v()LK/H;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-virtual {v0}, LK/Z;->f()LU0/T0;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    invoke-virtual {p0}, LK/y;->e()Z

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    move-object v6, p1

    .line 66
    move-object v12, p2

    .line 67
    invoke-virtual/range {v5 .. v12}, LK/L$a;->e(La1/U;LK/H;LU0/T0;LI0/p;La1/c0;ZLa1/J;)V

    .line 68
    .line 69
    .line 70
    sget-object p0, LTd/L;->a:LTd/L;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 71
    .line 72
    invoke-virtual {v1, v2, v4, v3}, Li0/l$a;->l(Li0/l;Li0/l;Lkotlin/jvm/functions/Function1;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    move-object p0, v0

    .line 78
    invoke-virtual {v1, v2, v4, v3}, Li0/l$a;->l(Li0/l;Li0/l;Lkotlin/jvm/functions/Function1;)V

    .line 79
    .line 80
    .line 81
    throw p0
.end method

.method private static final p(Landroidx/compose/ui/e;LK/y;LQ/F;)Landroidx/compose/ui/e;
    .locals 1

    .line 1
    new-instance v0, LK/i$v;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, LK/i$v;-><init>(LK/y;LQ/F;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Landroidx/compose/ui/input/key/a;->b(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final q(La1/W;LK/y;La1/U;La1/t;La1/J;)V
    .locals 7

    .line 1
    sget-object v0, LK/L;->a:LK/L$a;

    .line 2
    .line 3
    invoke-virtual {p1}, LK/y;->n()La1/l;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    invoke-virtual {p1}, LK/y;->m()Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    invoke-virtual {p1}, LK/y;->l()Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    .line 14
    move-result-object v6

    .line 15
    move-object v1, p0

    .line 16
    move-object v2, p2

    .line 17
    move-object v4, p3

    .line 18
    invoke-virtual/range {v0 .. v6}, LK/L$a;->h(La1/W;La1/U;La1/l;La1/t;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La1/c0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p1, p0}, LK/y;->E(La1/c0;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1, v2, p4}, LK/i;->o(LK/y;La1/U;La1/J;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private static final r(LK/y;Landroidx/compose/ui/focus/k;Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LK/y;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/compose/ui/focus/k;->f()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    if-eqz p2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, LK/y;->h()Landroidx/compose/ui/platform/o1;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    invoke-interface {p0}, Landroidx/compose/ui/platform/o1;->c()V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method
