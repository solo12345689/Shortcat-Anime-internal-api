.class public abstract LU/j0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LY/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, LY/U1;->q()LY/T1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LU/j0$a;->a:LU/j0$a;

    .line 6
    .line 7
    invoke-static {v0, v1}, LY/H;->g(LY/T1;Lie/a;)LY/b1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, LU/j0;->a:LY/b1;

    .line 12
    .line 13
    return-void
.end method

.method public static final a(LU0/Y0;Lkotlin/jvm/functions/Function2;LY/m;I)V
    .locals 4

    .line 1
    const v0, -0x1b6f9f5f

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
    invoke-interface {p2, p0}, LY/m;->U(Ljava/lang/Object;)Z

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
    invoke-interface {p2, p1}, LY/m;->F(Ljava/lang/Object;)Z

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
    goto :goto_4

    .line 57
    :cond_5
    :goto_3
    invoke-static {}, LY/w;->L()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_6

    .line 62
    .line 63
    const/4 v2, -0x1

    .line 64
    const-string v3, "androidx.compose.material3.ProvideTextStyle (Text.kt:346)"

    .line 65
    .line 66
    invoke-static {v0, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_6
    sget-object v0, LU/j0;->a:LY/b1;

    .line 70
    .line 71
    invoke-interface {p2, v0}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, LU0/Y0;

    .line 76
    .line 77
    invoke-virtual {v2, p0}, LU0/Y0;->K(LU0/Y0;)LU0/Y0;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v0, v2}, LY/b1;->d(Ljava/lang/Object;)LY/c1;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sget v2, LY/c1;->i:I

    .line 86
    .line 87
    and-int/lit8 v1, v1, 0x70

    .line 88
    .line 89
    or-int/2addr v1, v2

    .line 90
    invoke-static {v0, p1, p2, v1}, LY/H;->c(LY/c1;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 91
    .line 92
    .line 93
    invoke-static {}, LY/w;->L()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_7

    .line 98
    .line 99
    invoke-static {}, LY/w;->T()V

    .line 100
    .line 101
    .line 102
    :cond_7
    :goto_4
    invoke-interface {p2}, LY/m;->k()LY/B1;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    if-eqz p2, :cond_8

    .line 107
    .line 108
    new-instance v0, LU/j0$b;

    .line 109
    .line 110
    invoke-direct {v0, p0, p1, p3}, LU/j0$b;-><init>(LU0/Y0;Lkotlin/jvm/functions/Function2;I)V

    .line 111
    .line 112
    .line 113
    invoke-interface {p2, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 114
    .line 115
    .line 116
    :cond_8
    return-void
.end method

.method public static final b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V
    .locals 67

    move/from16 v0, p22

    move/from16 v1, p23

    move/from16 v2, p24

    const v3, -0x7a7e7926

    move-object/from16 v4, p21

    .line 1
    invoke-interface {v4, v3}, LY/m;->g(I)LY/m;

    move-result-object v4

    and-int/lit8 v5, v2, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v5, v0, 0x6

    move v8, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-interface {v4, v5}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_1
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v0

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v8, v0

    :goto_1
    and-int/lit8 v9, v2, 0x2

    if-eqz v9, :cond_4

    or-int/lit8 v8, v8, 0x30

    :cond_3
    move-object/from16 v12, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v12, v0, 0x30

    if-nez v12, :cond_3

    move-object/from16 v12, p1

    invoke-interface {v4, v12}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_5

    const/16 v13, 0x20

    goto :goto_2

    :cond_5
    const/16 v13, 0x10

    :goto_2
    or-int/2addr v8, v13

    :goto_3
    and-int/lit8 v13, v2, 0x4

    if-eqz v13, :cond_6

    or-int/lit16 v8, v8, 0x180

    move v6, v8

    move-wide/from16 v7, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v0, 0x180

    move/from16 v16, v8

    move-wide/from16 v7, p2

    if-nez v6, :cond_8

    invoke-interface {v4, v7, v8}, LY/m;->d(J)Z

    move-result v17

    if-eqz v17, :cond_7

    const/16 v17, 0x100

    goto :goto_4

    :cond_7
    const/16 v17, 0x80

    :goto_4
    or-int v16, v16, v17

    :cond_8
    move/from16 v6, v16

    :goto_5
    and-int/lit8 v16, v2, 0x8

    const/16 v18, 0x400

    const/16 v19, 0x800

    if-eqz v16, :cond_9

    or-int/lit16 v6, v6, 0xc00

    move-wide/from16 v11, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v0, 0xc00

    move-wide/from16 v11, p4

    if-nez v10, :cond_b

    invoke-interface {v4, v11, v12}, LY/m;->d(J)Z

    move-result v21

    if-eqz v21, :cond_a

    move/from16 v21, v19

    goto :goto_6

    :cond_a
    move/from16 v21, v18

    :goto_6
    or-int v6, v6, v21

    :cond_b
    :goto_7
    and-int/lit8 v21, v2, 0x10

    const/16 v22, 0x2000

    const/16 v23, 0x4000

    if-eqz v21, :cond_d

    or-int/lit16 v6, v6, 0x6000

    :cond_c
    move-object/from16 v10, p6

    goto :goto_9

    :cond_d
    and-int/lit16 v10, v0, 0x6000

    if-nez v10, :cond_c

    move-object/from16 v10, p6

    invoke-interface {v4, v10}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_e

    move/from16 v25, v23

    goto :goto_8

    :cond_e
    move/from16 v25, v22

    :goto_8
    or-int v6, v6, v25

    :goto_9
    and-int/lit8 v25, v2, 0x20

    const/high16 v26, 0x20000

    const/high16 v27, 0x30000

    const/high16 v28, 0x10000

    if-eqz v25, :cond_f

    or-int v6, v6, v27

    move-object/from16 v14, p7

    goto :goto_b

    :cond_f
    and-int v29, v0, v27

    move-object/from16 v14, p7

    if-nez v29, :cond_11

    invoke-interface {v4, v14}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_10

    move/from16 v30, v26

    goto :goto_a

    :cond_10
    move/from16 v30, v28

    :goto_a
    or-int v6, v6, v30

    :cond_11
    :goto_b
    and-int/lit8 v30, v2, 0x40

    const/high16 v31, 0x180000

    if-eqz v30, :cond_12

    or-int v6, v6, v31

    move-object/from16 v15, p8

    goto :goto_d

    :cond_12
    and-int v32, v0, v31

    move-object/from16 v15, p8

    if-nez v32, :cond_14

    invoke-interface {v4, v15}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_13

    const/high16 v33, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v33, 0x80000

    :goto_c
    or-int v6, v6, v33

    :cond_14
    :goto_d
    and-int/lit16 v3, v2, 0x80

    const/high16 v34, 0xc00000

    if-eqz v3, :cond_16

    or-int v6, v6, v34

    :cond_15
    move/from16 v34, v6

    move-wide/from16 v5, p9

    goto :goto_f

    :cond_16
    and-int v34, v0, v34

    if-nez v34, :cond_15

    move/from16 v34, v6

    move-wide/from16 v5, p9

    invoke-interface {v4, v5, v6}, LY/m;->d(J)Z

    move-result v35

    if-eqz v35, :cond_17

    const/high16 v35, 0x800000

    goto :goto_e

    :cond_17
    const/high16 v35, 0x400000

    :goto_e
    or-int v34, v34, v35

    :goto_f
    and-int/lit16 v0, v2, 0x100

    const/high16 v35, 0x6000000

    if-eqz v0, :cond_19

    or-int v34, v34, v35

    :cond_18
    move/from16 v35, v0

    move-object/from16 v0, p11

    goto :goto_11

    :cond_19
    and-int v35, p22, v35

    if-nez v35, :cond_18

    move/from16 v35, v0

    move-object/from16 v0, p11

    invoke-interface {v4, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v36

    if-eqz v36, :cond_1a

    const/high16 v36, 0x4000000

    goto :goto_10

    :cond_1a
    const/high16 v36, 0x2000000

    :goto_10
    or-int v34, v34, v36

    :goto_11
    and-int/lit16 v0, v2, 0x200

    const/high16 v36, 0x30000000

    if-eqz v0, :cond_1b

    or-int v34, v34, v36

    move/from16 v36, v0

    :goto_12
    move/from16 v0, v34

    goto :goto_14

    :cond_1b
    and-int v36, p22, v36

    if-nez v36, :cond_1d

    move/from16 v36, v0

    move-object/from16 v0, p12

    invoke-interface {v4, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v37

    if-eqz v37, :cond_1c

    const/high16 v37, 0x20000000

    goto :goto_13

    :cond_1c
    const/high16 v37, 0x10000000

    :goto_13
    or-int v34, v34, v37

    goto :goto_12

    :cond_1d
    move/from16 v36, v0

    move-object/from16 v0, p12

    goto :goto_12

    :goto_14
    move/from16 v34, v3

    and-int/lit16 v3, v2, 0x400

    if-eqz v3, :cond_1e

    or-int/lit8 v17, v1, 0x6

    move-wide/from16 v5, p13

    goto :goto_16

    :cond_1e
    and-int/lit8 v37, v1, 0x6

    move-wide/from16 v5, p13

    if-nez v37, :cond_20

    invoke-interface {v4, v5, v6}, LY/m;->d(J)Z

    move-result v37

    if-eqz v37, :cond_1f

    const/16 v17, 0x4

    goto :goto_15

    :cond_1f
    const/16 v17, 0x2

    :goto_15
    or-int v17, v1, v17

    goto :goto_16

    :cond_20
    move/from16 v17, v1

    :goto_16
    move/from16 v37, v3

    and-int/lit16 v3, v2, 0x800

    if-eqz v3, :cond_21

    or-int/lit8 v17, v17, 0x30

    move/from16 v38, v3

    :goto_17
    move/from16 v3, v17

    goto :goto_19

    :cond_21
    and-int/lit8 v38, v1, 0x30

    if-nez v38, :cond_23

    move/from16 v38, v3

    move/from16 v3, p15

    invoke-interface {v4, v3}, LY/m;->c(I)Z

    move-result v39

    if-eqz v39, :cond_22

    const/16 v24, 0x20

    goto :goto_18

    :cond_22
    const/16 v24, 0x10

    :goto_18
    or-int v17, v17, v24

    goto :goto_17

    :cond_23
    move/from16 v38, v3

    move/from16 v3, p15

    goto :goto_17

    :goto_19
    and-int/lit16 v5, v2, 0x1000

    if-eqz v5, :cond_25

    or-int/lit16 v3, v3, 0x180

    :cond_24
    move/from16 v6, p16

    goto :goto_1b

    :cond_25
    and-int/lit16 v6, v1, 0x180

    if-nez v6, :cond_24

    move/from16 v6, p16

    invoke-interface {v4, v6}, LY/m;->a(Z)Z

    move-result v17

    if-eqz v17, :cond_26

    const/16 v29, 0x100

    goto :goto_1a

    :cond_26
    const/16 v29, 0x80

    :goto_1a
    or-int v3, v3, v29

    :goto_1b
    move/from16 v17, v5

    and-int/lit16 v5, v2, 0x2000

    if-eqz v5, :cond_27

    or-int/lit16 v3, v3, 0xc00

    goto :goto_1c

    :cond_27
    move/from16 v20, v3

    and-int/lit16 v3, v1, 0xc00

    if-nez v3, :cond_29

    move/from16 v3, p17

    invoke-interface {v4, v3}, LY/m;->c(I)Z

    move-result v24

    if-eqz v24, :cond_28

    move/from16 v18, v19

    :cond_28
    or-int v18, v20, v18

    move/from16 v3, v18

    goto :goto_1c

    :cond_29
    move/from16 v3, p17

    move/from16 v3, v20

    :goto_1c
    move/from16 v18, v5

    and-int/lit16 v5, v2, 0x4000

    if-eqz v5, :cond_2b

    or-int/lit16 v3, v3, 0x6000

    :cond_2a
    move/from16 v2, p18

    goto :goto_1d

    :cond_2b
    and-int/lit16 v2, v1, 0x6000

    if-nez v2, :cond_2a

    move/from16 v2, p18

    invoke-interface {v4, v2}, LY/m;->c(I)Z

    move-result v19

    if-eqz v19, :cond_2c

    move/from16 v22, v23

    :cond_2c
    or-int v3, v3, v22

    :goto_1d
    const v19, 0x8000

    and-int v19, p24, v19

    if-eqz v19, :cond_2d

    or-int v3, v3, v27

    move-object/from16 v1, p19

    goto :goto_1f

    :cond_2d
    and-int v20, v1, v27

    move-object/from16 v1, p19

    if-nez v20, :cond_2f

    invoke-interface {v4, v1}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_2e

    goto :goto_1e

    :cond_2e
    move/from16 v26, v28

    :goto_1e
    or-int v3, v3, v26

    :cond_2f
    :goto_1f
    and-int v20, p23, v31

    if-nez v20, :cond_31

    and-int v20, p24, v28

    move-object/from16 v1, p20

    if-nez v20, :cond_30

    invoke-interface {v4, v1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_30

    const/high16 v20, 0x100000

    goto :goto_20

    :cond_30
    const/high16 v20, 0x80000

    :goto_20
    or-int v3, v3, v20

    goto :goto_21

    :cond_31
    move-object/from16 v1, p20

    :goto_21
    const v20, 0x12492493

    and-int v1, v0, v20

    const v2, 0x12492492

    if-ne v1, v2, :cond_33

    const v1, 0x92493

    and-int/2addr v1, v3

    const v2, 0x92492

    if-ne v1, v2, :cond_33

    invoke-interface {v4}, LY/m;->i()Z

    move-result v1

    if-nez v1, :cond_32

    goto :goto_22

    .line 2
    :cond_32
    invoke-interface {v4}, LY/m;->K()V

    move-object/from16 v2, p1

    move-object/from16 v13, p12

    move/from16 v16, p15

    move/from16 v18, p17

    move/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object v0, v4

    move/from16 v17, v6

    move-wide v3, v7

    move-object v7, v10

    move-wide v5, v11

    move-object v8, v14

    move-object v9, v15

    move-wide/from16 v10, p9

    move-object/from16 v12, p11

    move-wide/from16 v14, p13

    goto/16 :goto_33

    .line 3
    :cond_33
    :goto_22
    invoke-interface {v4}, LY/m;->G()V

    and-int/lit8 v1, p22, 0x1

    if-eqz v1, :cond_36

    invoke-interface {v4}, LY/m;->N()Z

    move-result v1

    if-eqz v1, :cond_34

    goto :goto_23

    .line 4
    :cond_34
    invoke-interface {v4}, LY/m;->K()V

    and-int v1, p24, v28

    if-eqz v1, :cond_35

    const v1, -0x380001

    and-int/2addr v3, v1

    :cond_35
    move-object/from16 v1, p1

    move-wide/from16 v44, p9

    move-object/from16 v51, p11

    move-object/from16 v13, p12

    move-wide/from16 v56, p13

    move/from16 v16, p15

    move/from16 v17, p17

    move/from16 v24, p18

    move-object/from16 v2, p19

    move-object/from16 v34, p20

    move-object/from16 v40, v10

    move-wide/from16 v37, v11

    move-object/from16 v39, v14

    move-object/from16 v42, v15

    goto/16 :goto_2e

    :cond_36
    :goto_23
    if-eqz v9, :cond_37

    .line 5
    sget-object v1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    goto :goto_24

    :cond_37
    move-object/from16 v1, p1

    :goto_24
    if-eqz v13, :cond_38

    .line 6
    sget-object v2, Ls0/r0;->b:Ls0/r0$a;

    invoke-virtual {v2}, Ls0/r0$a;->j()J

    move-result-wide v7

    :cond_38
    if-eqz v16, :cond_39

    .line 7
    sget-object v2, Li1/v;->b:Li1/v$a;

    invoke-virtual {v2}, Li1/v$a;->a()J

    move-result-wide v11

    :cond_39
    const/4 v2, 0x0

    if-eqz v21, :cond_3a

    move-object v10, v2

    :cond_3a
    if-eqz v25, :cond_3b

    move-object v14, v2

    :cond_3b
    if-eqz v30, :cond_3c

    move-object v15, v2

    :cond_3c
    if-eqz v34, :cond_3d

    .line 8
    sget-object v9, Li1/v;->b:Li1/v$a;

    invoke-virtual {v9}, Li1/v$a;->a()J

    move-result-wide v20

    goto :goto_25

    :cond_3d
    move-wide/from16 v20, p9

    :goto_25
    if-eqz v35, :cond_3e

    move-object v9, v2

    goto :goto_26

    :cond_3e
    move-object/from16 v9, p11

    :goto_26
    if-eqz v36, :cond_3f

    move-object v13, v2

    goto :goto_27

    :cond_3f
    move-object/from16 v13, p12

    :goto_27
    if-eqz v37, :cond_40

    .line 9
    sget-object v16, Li1/v;->b:Li1/v$a;

    invoke-virtual/range {v16 .. v16}, Li1/v$a;->a()J

    move-result-wide v22

    goto :goto_28

    :cond_40
    move-wide/from16 v22, p13

    :goto_28
    if-eqz v38, :cond_41

    .line 10
    sget-object v16, Lg1/v;->a:Lg1/v$a;

    invoke-virtual/range {v16 .. v16}, Lg1/v$a;->a()I

    move-result v16

    goto :goto_29

    :cond_41
    move/from16 v16, p15

    :goto_29
    const/16 v24, 0x1

    if-eqz v17, :cond_42

    move/from16 v6, v24

    :cond_42
    if-eqz v18, :cond_43

    const v17, 0x7fffffff

    goto :goto_2a

    :cond_43
    move/from16 v17, p17

    :goto_2a
    if-eqz v5, :cond_44

    goto :goto_2b

    :cond_44
    move/from16 v24, p18

    :goto_2b
    if-eqz v19, :cond_45

    goto :goto_2c

    :cond_45
    move-object/from16 v2, p19

    :goto_2c
    and-int v5, p24, v28

    if-eqz v5, :cond_46

    .line 11
    sget-object v5, LU/j0;->a:LY/b1;

    .line 12
    invoke-interface {v4, v5}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LU0/Y0;

    const v18, -0x380001

    and-int v3, v3, v18

    move-object/from16 v34, v5

    :goto_2d
    move-object/from16 v51, v9

    move-object/from16 v40, v10

    move-wide/from16 v37, v11

    move-object/from16 v39, v14

    move-object/from16 v42, v15

    move-wide/from16 v44, v20

    move-wide/from16 v56, v22

    goto :goto_2e

    :cond_46
    move-object/from16 v34, p20

    goto :goto_2d

    :goto_2e
    invoke-interface {v4}, LY/m;->y()V

    invoke-static {}, LY/w;->L()Z

    move-result v5

    if-eqz v5, :cond_47

    const-string v5, "androidx.compose.material3.Text (Text.kt:109)"

    const v9, -0x7a7e7926

    .line 13
    invoke-static {v9, v0, v3, v5}, LY/w;->U(IIILjava/lang/String;)V

    :cond_47
    const v5, -0x6cf36ecd

    invoke-interface {v4, v5}, LY/m;->V(I)V

    const-wide/16 v9, 0x10

    cmp-long v5, v7, v9

    if-eqz v5, :cond_48

    move-wide/from16 v35, v7

    goto :goto_30

    :cond_48
    const v5, -0x6cf36bc8

    .line 14
    invoke-interface {v4, v5}, LY/m;->V(I)V

    .line 15
    invoke-virtual/range {v34 .. v34}, LU0/Y0;->j()J

    move-result-wide v9

    const-wide/16 v11, 0x10

    cmp-long v5, v9, v11

    if-eqz v5, :cond_49

    goto :goto_2f

    :cond_49
    invoke-static {}, LU/s;->a()LY/b1;

    move-result-object v5

    .line 16
    invoke-interface {v4, v5}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v5

    .line 17
    check-cast v5, Ls0/r0;

    invoke-virtual {v5}, Ls0/r0;->A()J

    move-result-wide v9

    :goto_2f
    invoke-interface {v4}, LY/m;->O()V

    move-wide/from16 v35, v9

    :goto_30
    invoke-interface {v4}, LY/m;->O()V

    if-eqz v13, :cond_4a

    .line 18
    invoke-virtual {v13}, Lg1/j;->n()I

    move-result v5

    :goto_31
    move/from16 v54, v5

    goto :goto_32

    :cond_4a
    sget-object v5, Lg1/j;->b:Lg1/j$a;

    invoke-virtual {v5}, Lg1/j$a;->g()I

    move-result v5

    goto :goto_31

    :goto_32
    const v64, 0xfd6f50

    const/16 v65, 0x0

    const/16 v41, 0x0

    const/16 v43, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const-wide/16 v49, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    .line 19
    invoke-static/range {v34 .. v65}, LU0/Y0;->M(LU0/Y0;JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;Lu0/g;IIJLg1/s;Lg1/h;IILU0/G;Lg1/u;ILjava/lang/Object;)LU0/Y0;

    move-result-object v5

    and-int/lit8 v0, v0, 0x7e

    shr-int/lit8 v9, v3, 0x6

    and-int/lit16 v9, v9, 0x1c00

    or-int/2addr v0, v9

    shl-int/lit8 v3, v3, 0x9

    const v9, 0xe000

    and-int/2addr v9, v3

    or-int/2addr v0, v9

    const/high16 v9, 0x70000

    and-int/2addr v9, v3

    or-int/2addr v0, v9

    const/high16 v9, 0x380000

    and-int/2addr v9, v3

    or-int/2addr v0, v9

    const/high16 v9, 0x1c00000

    and-int/2addr v3, v9

    or-int/2addr v0, v3

    const/16 v3, 0x100

    const/4 v9, 0x0

    move-object/from16 p1, p0

    move/from16 p11, v0

    move-object/from16 p2, v1

    move-object/from16 p4, v2

    move/from16 p12, v3

    move-object/from16 p10, v4

    move-object/from16 p3, v5

    move/from16 p6, v6

    move-object/from16 p9, v9

    move/from16 p5, v16

    move/from16 p7, v17

    move/from16 p8, v24

    .line 20
    invoke-static/range {p1 .. p12}, LK/d;->b(Ljava/lang/String;Landroidx/compose/ui/e;LU0/Y0;Lkotlin/jvm/functions/Function1;IZIILs0/t0;LY/m;II)V

    move-object/from16 v0, p10

    invoke-static {}, LY/w;->L()Z

    move-result v3

    if-eqz v3, :cond_4b

    invoke-static {}, LY/w;->T()V

    :cond_4b
    move-object/from16 v20, v2

    move-wide v3, v7

    move/from16 v18, v17

    move/from16 v19, v24

    move-object/from16 v21, v34

    move-object/from16 v8, v39

    move-object/from16 v7, v40

    move-object/from16 v9, v42

    move-wide/from16 v10, v44

    move-object/from16 v12, v51

    move-wide/from16 v14, v56

    move-object v2, v1

    move/from16 v17, v6

    move-wide/from16 v5, v37

    .line 21
    :goto_33
    invoke-interface {v0}, LY/m;->k()LY/B1;

    move-result-object v0

    if-eqz v0, :cond_4c

    move-object v1, v0

    new-instance v0, LU/j0$c;

    move/from16 v22, p22

    move/from16 v23, p23

    move/from16 v24, p24

    move-object/from16 v66, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v24}, LU/j0$c;-><init>(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;III)V

    move-object/from16 v1, v66

    invoke-interface {v1, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    :cond_4c
    return-void
.end method

.method public static final c(LU0/e;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V
    .locals 60

    move/from16 v0, p23

    move/from16 v1, p24

    move/from16 v2, p25

    const v3, 0x78d1974c

    move-object/from16 v4, p22

    .line 1
    invoke-interface {v4, v3}, LY/m;->g(I)LY/m;

    move-result-object v3

    and-int/lit8 v4, v2, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v4, v0, 0x6

    move v7, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v3, v4}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v0

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v7, v0

    :goto_1
    and-int/lit8 v8, v2, 0x2

    if-eqz v8, :cond_4

    or-int/lit8 v7, v7, 0x30

    :cond_3
    move-object/from16 v11, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v11, v0, 0x30

    if-nez v11, :cond_3

    move-object/from16 v11, p1

    invoke-interface {v3, v11}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    const/16 v12, 0x20

    goto :goto_2

    :cond_5
    const/16 v12, 0x10

    :goto_2
    or-int/2addr v7, v12

    :goto_3
    and-int/lit8 v12, v2, 0x4

    if-eqz v12, :cond_6

    or-int/lit16 v7, v7, 0x180

    move-wide/from16 v5, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v15, v0, 0x180

    move-wide/from16 v5, p2

    if-nez v15, :cond_8

    invoke-interface {v3, v5, v6}, LY/m;->d(J)Z

    move-result v16

    if-eqz v16, :cond_7

    const/16 v16, 0x100

    goto :goto_4

    :cond_7
    const/16 v16, 0x80

    :goto_4
    or-int v7, v7, v16

    :cond_8
    :goto_5
    and-int/lit8 v16, v2, 0x8

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-eqz v16, :cond_9

    or-int/lit16 v7, v7, 0xc00

    move-wide/from16 v10, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v0, 0xc00

    move-wide/from16 v10, p4

    if-nez v9, :cond_b

    invoke-interface {v3, v10, v11}, LY/m;->d(J)Z

    move-result v20

    if-eqz v20, :cond_a

    move/from16 v20, v18

    goto :goto_6

    :cond_a
    move/from16 v20, v17

    :goto_6
    or-int v7, v7, v20

    :cond_b
    :goto_7
    and-int/lit8 v20, v2, 0x10

    const/16 v21, 0x2000

    const/16 v22, 0x4000

    if-eqz v20, :cond_d

    or-int/lit16 v7, v7, 0x6000

    :cond_c
    move-object/from16 v9, p6

    goto :goto_9

    :cond_d
    and-int/lit16 v9, v0, 0x6000

    if-nez v9, :cond_c

    move-object/from16 v9, p6

    invoke-interface {v3, v9}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_e

    move/from16 v24, v22

    goto :goto_8

    :cond_e
    move/from16 v24, v21

    :goto_8
    or-int v7, v7, v24

    :goto_9
    and-int/lit8 v24, v2, 0x20

    const/high16 v25, 0x10000

    const/high16 v26, 0x30000

    const/high16 v27, 0x20000

    if-eqz v24, :cond_f

    or-int v7, v7, v26

    move-object/from16 v13, p7

    goto :goto_b

    :cond_f
    and-int v28, v0, v26

    move-object/from16 v13, p7

    if-nez v28, :cond_11

    invoke-interface {v3, v13}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_10

    move/from16 v29, v27

    goto :goto_a

    :cond_10
    move/from16 v29, v25

    :goto_a
    or-int v7, v7, v29

    :cond_11
    :goto_b
    and-int/lit8 v29, v2, 0x40

    const/high16 v30, 0x180000

    if-eqz v29, :cond_12

    or-int v7, v7, v30

    move-object/from16 v14, p8

    goto :goto_d

    :cond_12
    and-int v31, v0, v30

    move-object/from16 v14, p8

    if-nez v31, :cond_14

    invoke-interface {v3, v14}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_13

    const/high16 v32, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v32, 0x80000

    :goto_c
    or-int v7, v7, v32

    :cond_14
    :goto_d
    and-int/lit16 v15, v2, 0x80

    const/high16 v33, 0xc00000

    if-eqz v15, :cond_15

    or-int v7, v7, v33

    move-wide/from16 v4, p9

    goto :goto_f

    :cond_15
    and-int v34, v0, v33

    move-wide/from16 v4, p9

    if-nez v34, :cond_17

    invoke-interface {v3, v4, v5}, LY/m;->d(J)Z

    move-result v6

    if-eqz v6, :cond_16

    const/high16 v6, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v6, 0x400000

    :goto_e
    or-int/2addr v7, v6

    :cond_17
    :goto_f
    and-int/lit16 v6, v2, 0x100

    const/high16 v34, 0x6000000

    if-eqz v6, :cond_18

    or-int v7, v7, v34

    move-object/from16 v0, p11

    goto :goto_11

    :cond_18
    and-int v34, v0, v34

    move-object/from16 v0, p11

    if-nez v34, :cond_1a

    invoke-interface {v3, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_19

    const/high16 v34, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v34, 0x2000000

    :goto_10
    or-int v7, v7, v34

    :cond_1a
    :goto_11
    and-int/lit16 v0, v2, 0x200

    const/high16 v34, 0x30000000

    if-eqz v0, :cond_1c

    or-int v7, v7, v34

    :cond_1b
    move/from16 v34, v0

    move-object/from16 v0, p12

    goto :goto_13

    :cond_1c
    and-int v34, p23, v34

    if-nez v34, :cond_1b

    move/from16 v34, v0

    move-object/from16 v0, p12

    invoke-interface {v3, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v35

    if-eqz v35, :cond_1d

    const/high16 v35, 0x20000000

    goto :goto_12

    :cond_1d
    const/high16 v35, 0x10000000

    :goto_12
    or-int v7, v7, v35

    :goto_13
    and-int/lit16 v0, v2, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v32, v1, 0x6

    move-wide/from16 v4, p13

    goto :goto_15

    :cond_1e
    and-int/lit8 v35, v1, 0x6

    move-wide/from16 v4, p13

    if-nez v35, :cond_20

    invoke-interface {v3, v4, v5}, LY/m;->d(J)Z

    move-result v35

    if-eqz v35, :cond_1f

    const/16 v32, 0x4

    goto :goto_14

    :cond_1f
    const/16 v32, 0x2

    :goto_14
    or-int v32, v1, v32

    goto :goto_15

    :cond_20
    move/from16 v32, v1

    :goto_15
    move/from16 v35, v0

    and-int/lit16 v0, v2, 0x800

    if-eqz v0, :cond_21

    or-int/lit8 v32, v32, 0x30

    move/from16 v36, v0

    :goto_16
    move/from16 v0, v32

    goto :goto_18

    :cond_21
    and-int/lit8 v36, v1, 0x30

    if-nez v36, :cond_23

    move/from16 v36, v0

    move/from16 v0, p15

    invoke-interface {v3, v0}, LY/m;->c(I)Z

    move-result v37

    if-eqz v37, :cond_22

    const/16 v23, 0x20

    goto :goto_17

    :cond_22
    const/16 v23, 0x10

    :goto_17
    or-int v32, v32, v23

    goto :goto_16

    :cond_23
    move/from16 v36, v0

    move/from16 v0, p15

    goto :goto_16

    :goto_18
    and-int/lit16 v4, v2, 0x1000

    if-eqz v4, :cond_25

    or-int/lit16 v0, v0, 0x180

    :cond_24
    move/from16 v5, p16

    goto :goto_1a

    :cond_25
    and-int/lit16 v5, v1, 0x180

    if-nez v5, :cond_24

    move/from16 v5, p16

    invoke-interface {v3, v5}, LY/m;->a(Z)Z

    move-result v19

    if-eqz v19, :cond_26

    const/16 v28, 0x100

    goto :goto_19

    :cond_26
    const/16 v28, 0x80

    :goto_19
    or-int v0, v0, v28

    :goto_1a
    move/from16 v19, v4

    and-int/lit16 v4, v2, 0x2000

    if-eqz v4, :cond_27

    or-int/lit16 v0, v0, 0xc00

    goto :goto_1b

    :cond_27
    move/from16 v23, v0

    and-int/lit16 v0, v1, 0xc00

    if-nez v0, :cond_29

    move/from16 v0, p17

    invoke-interface {v3, v0}, LY/m;->c(I)Z

    move-result v28

    if-eqz v28, :cond_28

    move/from16 v17, v18

    :cond_28
    or-int v17, v23, v17

    move/from16 v0, v17

    goto :goto_1b

    :cond_29
    move/from16 v0, p17

    move/from16 v0, v23

    :goto_1b
    move/from16 v17, v4

    and-int/lit16 v4, v2, 0x4000

    if-eqz v4, :cond_2b

    or-int/lit16 v0, v0, 0x6000

    move/from16 v18, v0

    :cond_2a
    move/from16 v0, p18

    goto :goto_1c

    :cond_2b
    move/from16 v18, v0

    and-int/lit16 v0, v1, 0x6000

    if-nez v0, :cond_2a

    move/from16 v0, p18

    invoke-interface {v3, v0}, LY/m;->c(I)Z

    move-result v23

    if-eqz v23, :cond_2c

    move/from16 v21, v22

    :cond_2c
    or-int v18, v18, v21

    :goto_1c
    const v21, 0x8000

    and-int v21, v2, v21

    if-eqz v21, :cond_2d

    or-int v18, v18, v26

    move-object/from16 v0, p19

    goto :goto_1e

    :cond_2d
    and-int v22, v1, v26

    move-object/from16 v0, p19

    if-nez v22, :cond_2f

    invoke-interface {v3, v0}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_2e

    move/from16 v22, v27

    goto :goto_1d

    :cond_2e
    move/from16 v22, v25

    :goto_1d
    or-int v18, v18, v22

    :cond_2f
    :goto_1e
    and-int v22, v2, v25

    if-eqz v22, :cond_30

    or-int v18, v18, v30

    move-object/from16 v0, p20

    goto :goto_20

    :cond_30
    and-int v23, v1, v30

    move-object/from16 v0, p20

    if-nez v23, :cond_32

    invoke-interface {v3, v0}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_31

    const/high16 v23, 0x100000

    goto :goto_1f

    :cond_31
    const/high16 v23, 0x80000

    :goto_1f
    or-int v18, v18, v23

    :cond_32
    :goto_20
    and-int v23, v1, v33

    if-nez v23, :cond_34

    and-int v23, v2, v27

    move-object/from16 v0, p21

    if-nez v23, :cond_33

    invoke-interface {v3, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_33

    const/high16 v23, 0x800000

    goto :goto_21

    :cond_33
    const/high16 v23, 0x400000

    :goto_21
    or-int v18, v18, v23

    goto :goto_22

    :cond_34
    move-object/from16 v0, p21

    :goto_22
    const v23, 0x12492493

    and-int v0, v7, v23

    const v1, 0x12492492

    if-ne v0, v1, :cond_36

    const v0, 0x492493

    and-int v0, v18, v0

    const v1, 0x492492

    if-ne v0, v1, :cond_36

    invoke-interface {v3}, LY/m;->i()Z

    move-result v0

    if-nez v0, :cond_35

    goto :goto_23

    .line 2
    :cond_35
    invoke-interface {v3}, LY/m;->K()V

    move-wide/from16 v25, p2

    move-object/from16 v12, p11

    move/from16 v16, p15

    move/from16 v18, p17

    move/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object v0, v3

    move/from16 v17, v5

    move-object v7, v9

    move-wide v5, v10

    move-object v8, v13

    move-object v9, v14

    move-object/from16 v3, p1

    move-wide/from16 v10, p9

    move-object/from16 v13, p12

    move-wide/from16 v14, p13

    goto/16 :goto_35

    .line 3
    :cond_36
    :goto_23
    invoke-interface {v3}, LY/m;->G()V

    and-int/lit8 v0, p23, 0x1

    if-eqz v0, :cond_39

    invoke-interface {v3}, LY/m;->N()Z

    move-result v0

    if-eqz v0, :cond_37

    goto :goto_24

    .line 4
    :cond_37
    invoke-interface {v3}, LY/m;->K()V

    and-int v0, v2, v27

    if-eqz v0, :cond_38

    const v0, -0x1c00001

    and-int v18, v18, v0

    :cond_38
    move-object/from16 v0, p1

    move-wide/from16 v25, p2

    move-wide/from16 v37, p9

    move-object/from16 v44, p11

    move-object/from16 v1, p12

    move-wide/from16 v49, p13

    move/from16 v8, p15

    move/from16 v17, p17

    move/from16 v12, p18

    move-object/from16 v4, p19

    move-object/from16 v19, p20

    move-object/from16 v27, p21

    move-object/from16 v33, v9

    move-wide/from16 v30, v10

    move-object/from16 v32, v13

    move-object/from16 v35, v14

    move/from16 v6, v18

    goto/16 :goto_30

    :cond_39
    :goto_24
    if-eqz v8, :cond_3a

    .line 5
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    goto :goto_25

    :cond_3a
    move-object/from16 v0, p1

    :goto_25
    if-eqz v12, :cond_3b

    .line 6
    sget-object v1, Ls0/r0;->b:Ls0/r0$a;

    invoke-virtual {v1}, Ls0/r0$a;->j()J

    move-result-wide v25

    goto :goto_26

    :cond_3b
    move-wide/from16 v25, p2

    :goto_26
    if-eqz v16, :cond_3c

    .line 7
    sget-object v1, Li1/v;->b:Li1/v$a;

    invoke-virtual {v1}, Li1/v$a;->a()J

    move-result-wide v10

    :cond_3c
    const/4 v1, 0x0

    if-eqz v20, :cond_3d

    move-object v9, v1

    :cond_3d
    if-eqz v24, :cond_3e

    move-object v13, v1

    :cond_3e
    if-eqz v29, :cond_3f

    move-object v14, v1

    :cond_3f
    if-eqz v15, :cond_40

    .line 8
    sget-object v8, Li1/v;->b:Li1/v$a;

    invoke-virtual {v8}, Li1/v$a;->a()J

    move-result-wide v15

    goto :goto_27

    :cond_40
    move-wide/from16 v15, p9

    :goto_27
    if-eqz v6, :cond_41

    move-object v6, v1

    goto :goto_28

    :cond_41
    move-object/from16 v6, p11

    :goto_28
    if-eqz v34, :cond_42

    goto :goto_29

    :cond_42
    move-object/from16 v1, p12

    :goto_29
    if-eqz v35, :cond_43

    .line 9
    sget-object v8, Li1/v;->b:Li1/v$a;

    invoke-virtual {v8}, Li1/v$a;->a()J

    move-result-wide v23

    goto :goto_2a

    :cond_43
    move-wide/from16 v23, p13

    :goto_2a
    if-eqz v36, :cond_44

    .line 10
    sget-object v8, Lg1/v;->a:Lg1/v$a;

    invoke-virtual {v8}, Lg1/v$a;->a()I

    move-result v8

    goto :goto_2b

    :cond_44
    move/from16 v8, p15

    :goto_2b
    const/4 v12, 0x1

    if-eqz v19, :cond_45

    move v5, v12

    :cond_45
    if-eqz v17, :cond_46

    const v17, 0x7fffffff

    goto :goto_2c

    :cond_46
    move/from16 v17, p17

    :goto_2c
    if-eqz v4, :cond_47

    goto :goto_2d

    :cond_47
    move/from16 v12, p18

    :goto_2d
    if-eqz v21, :cond_48

    .line 11
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    move-result-object v4

    goto :goto_2e

    :cond_48
    move-object/from16 v4, p19

    :goto_2e
    if-eqz v22, :cond_49

    .line 12
    sget-object v19, LU/j0$d;->a:LU/j0$d;

    goto :goto_2f

    :cond_49
    move-object/from16 v19, p20

    :goto_2f
    and-int v20, v2, v27

    move-object/from16 p1, v0

    if-eqz v20, :cond_4a

    .line 13
    sget-object v0, LU/j0;->a:LY/b1;

    .line 14
    invoke-interface {v3, v0}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LU0/Y0;

    const v20, -0x1c00001

    and-int v18, v18, v20

    move-object/from16 v27, v0

    move-object/from16 v44, v6

    move-object/from16 v33, v9

    move-wide/from16 v30, v10

    move-object/from16 v32, v13

    move-object/from16 v35, v14

    move-wide/from16 v37, v15

    move/from16 v6, v18

    move-wide/from16 v49, v23

    move-object/from16 v0, p1

    goto :goto_30

    :cond_4a
    move-object/from16 v27, p21

    move-object/from16 v44, v6

    move-object/from16 v33, v9

    move-wide/from16 v30, v10

    move-object/from16 v32, v13

    move-object/from16 v35, v14

    move-wide/from16 v37, v15

    move/from16 v6, v18

    move-wide/from16 v49, v23

    :goto_30
    invoke-interface {v3}, LY/m;->y()V

    invoke-static {}, LY/w;->L()Z

    move-result v9

    if-eqz v9, :cond_4b

    const v9, 0x78d1974c

    const-string v10, "androidx.compose.material3.Text (Text.kt:255)"

    .line 15
    invoke-static {v9, v7, v6, v10}, LY/w;->U(IIILjava/lang/String;)V

    :cond_4b
    const v9, -0x6cf073ad

    invoke-interface {v3, v9}, LY/m;->V(I)V

    const-wide/16 v9, 0x10

    cmp-long v9, v25, v9

    if-eqz v9, :cond_4c

    move-wide/from16 v28, v25

    goto :goto_32

    :cond_4c
    const v9, -0x6cf070a8

    .line 16
    invoke-interface {v3, v9}, LY/m;->V(I)V

    .line 17
    invoke-virtual/range {v27 .. v27}, LU0/Y0;->j()J

    move-result-wide v9

    const-wide/16 v13, 0x10

    cmp-long v11, v9, v13

    if-eqz v11, :cond_4d

    goto :goto_31

    :cond_4d
    invoke-static {}, LU/s;->a()LY/b1;

    move-result-object v9

    .line 18
    invoke-interface {v3, v9}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v9

    .line 19
    check-cast v9, Ls0/r0;

    invoke-virtual {v9}, Ls0/r0;->A()J

    move-result-wide v9

    :goto_31
    invoke-interface {v3}, LY/m;->O()V

    move-wide/from16 v28, v9

    :goto_32
    invoke-interface {v3}, LY/m;->O()V

    if-eqz v1, :cond_4e

    .line 20
    invoke-virtual {v1}, Lg1/j;->n()I

    move-result v9

    :goto_33
    move/from16 v47, v9

    goto :goto_34

    :cond_4e
    sget-object v9, Lg1/j;->b:Lg1/j$a;

    invoke-virtual {v9}, Lg1/j$a;->g()I

    move-result v9

    goto :goto_33

    :goto_34
    const v57, 0xfd6f50

    const/16 v58, 0x0

    const/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const-wide/16 v42, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v48, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    .line 21
    invoke-static/range {v27 .. v58}, LU0/Y0;->M(LU0/Y0;JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;Lu0/g;IIJLg1/s;Lg1/h;IILU0/G;Lg1/u;ILjava/lang/Object;)LU0/Y0;

    move-result-object v9

    and-int/lit8 v7, v7, 0x7e

    shr-int/lit8 v10, v6, 0x9

    and-int/lit16 v10, v10, 0x1c00

    or-int/2addr v7, v10

    shl-int/lit8 v6, v6, 0x9

    const v10, 0xe000

    and-int/2addr v10, v6

    or-int/2addr v7, v10

    const/high16 v10, 0x70000

    and-int/2addr v10, v6

    or-int/2addr v7, v10

    const/high16 v10, 0x380000

    and-int/2addr v10, v6

    or-int/2addr v7, v10

    const/high16 v10, 0x1c00000

    and-int/2addr v10, v6

    or-int/2addr v7, v10

    const/high16 v10, 0xe000000

    and-int/2addr v6, v10

    or-int/2addr v6, v7

    const/16 v7, 0x200

    const/4 v10, 0x0

    move-object/from16 p1, p0

    move-object/from16 p2, v0

    move-object/from16 p11, v3

    move-object/from16 p9, v4

    move/from16 p6, v5

    move/from16 p12, v6

    move/from16 p13, v7

    move/from16 p5, v8

    move-object/from16 p3, v9

    move-object/from16 p10, v10

    move/from16 p8, v12

    move/from16 p7, v17

    move-object/from16 p4, v19

    .line 22
    invoke-static/range {p1 .. p13}, LK/d;->a(LU0/e;Landroidx/compose/ui/e;LU0/Y0;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Ls0/t0;LY/m;II)V

    move-object/from16 v3, p2

    move-object/from16 v0, p11

    invoke-static {}, LY/w;->L()Z

    move-result v6

    if-eqz v6, :cond_4f

    invoke-static {}, LY/w;->T()V

    :cond_4f
    move-object v13, v1

    move-object/from16 v20, v4

    move/from16 v16, v8

    move/from16 v18, v17

    move-object/from16 v21, v19

    move-object/from16 v22, v27

    move-object/from16 v8, v32

    move-object/from16 v7, v33

    move-object/from16 v9, v35

    move-wide/from16 v10, v37

    move-wide/from16 v14, v49

    move/from16 v17, v5

    move/from16 v19, v12

    move-wide/from16 v5, v30

    move-object/from16 v12, v44

    .line 23
    :goto_35
    invoke-interface {v0}, LY/m;->k()LY/B1;

    move-result-object v0

    if-eqz v0, :cond_50

    move-object v1, v0

    new-instance v0, LU/j0$e;

    move-wide/from16 v23, v25

    move/from16 v25, v2

    move-object v2, v3

    move-wide/from16 v3, v23

    move/from16 v23, p23

    move/from16 v24, p24

    move-object/from16 v59, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v25}, LU/j0$e;-><init>(LU0/e;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;LU0/Y0;III)V

    move-object/from16 v1, v59

    invoke-interface {v1, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    :cond_50
    return-void
.end method

.method public static final d()LY/b1;
    .locals 1

    .line 1
    sget-object v0, LU/j0;->a:LY/b1;

    .line 2
    .line 3
    return-object v0
.end method
