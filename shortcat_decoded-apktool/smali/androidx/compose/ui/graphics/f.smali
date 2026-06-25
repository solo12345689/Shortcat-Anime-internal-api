.class public abstract Landroidx/compose/ui/graphics/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final synthetic b(Landroidx/compose/ui/e;FFFFFFFFFFJLs0/E1;ZLs0/u1;JJI)Landroidx/compose/ui/e;
    .locals 24

    .line 1
    sget-object v0, Landroidx/compose/ui/graphics/c;->b:Landroidx/compose/ui/graphics/c$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/c$a;->B()I

    .line 4
    .line 5
    .line 6
    move-result v22

    .line 7
    const/16 v23, 0x0

    .line 8
    .line 9
    move-object/from16 v1, p0

    .line 10
    .line 11
    move/from16 v2, p1

    .line 12
    .line 13
    move/from16 v3, p2

    .line 14
    .line 15
    move/from16 v4, p3

    .line 16
    .line 17
    move/from16 v5, p4

    .line 18
    .line 19
    move/from16 v6, p5

    .line 20
    .line 21
    move/from16 v7, p6

    .line 22
    .line 23
    move/from16 v8, p7

    .line 24
    .line 25
    move/from16 v9, p8

    .line 26
    .line 27
    move/from16 v10, p9

    .line 28
    .line 29
    move/from16 v11, p10

    .line 30
    .line 31
    move-wide/from16 v12, p11

    .line 32
    .line 33
    move-object/from16 v14, p13

    .line 34
    .line 35
    move/from16 v15, p14

    .line 36
    .line 37
    move-object/from16 v16, p15

    .line 38
    .line 39
    move-wide/from16 v17, p16

    .line 40
    .line 41
    move-wide/from16 v19, p18

    .line 42
    .line 43
    move/from16 v21, p20

    .line 44
    .line 45
    invoke-static/range {v1 .. v23}, Landroidx/compose/ui/graphics/f;->d(Landroidx/compose/ui/e;FFFFFFFFFFJLs0/E1;ZLs0/u1;JJIILandroidx/compose/ui/graphics/d;)Landroidx/compose/ui/e;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;FFFFFFFFFFJLs0/E1;ZLs0/u1;JJIILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 20

    move/from16 v0, p21

    and-int/lit8 v1, v0, 0x1

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    move/from16 v2, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    move v4, v5

    goto :goto_3

    :cond_3
    move/from16 v4, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    move v6, v5

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    move v7, v5

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    move v8, v5

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    move v9, v5

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    goto :goto_8

    :cond_8
    move/from16 v5, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    const/high16 v10, 0x41000000    # 8.0f

    goto :goto_9

    :cond_9
    move/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    .line 1
    sget-object v11, Landroidx/compose/ui/graphics/j;->b:Landroidx/compose/ui/graphics/j$a;

    invoke-virtual {v11}, Landroidx/compose/ui/graphics/j$a;->a()J

    move-result-wide v11

    goto :goto_a

    :cond_a
    move-wide/from16 v11, p11

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    .line 2
    invoke-static {}, Ls0/t1;->a()Ls0/E1;

    move-result-object v13

    goto :goto_b

    :cond_b
    move-object/from16 v13, p13

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    const/4 v14, 0x0

    goto :goto_c

    :cond_c
    move/from16 v14, p14

    :goto_c
    and-int/lit16 v15, v0, 0x2000

    if-eqz v15, :cond_d

    const/4 v15, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v15, p15

    :goto_d
    move/from16 p1, v1

    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_e

    .line 3
    invoke-static {}, Ls0/a1;->a()J

    move-result-wide v16

    goto :goto_e

    :cond_e
    move-wide/from16 v16, p16

    :goto_e
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    .line 4
    invoke-static {}, Ls0/a1;->a()J

    move-result-wide v18

    goto :goto_f

    :cond_f
    move-wide/from16 v18, p18

    :goto_f
    const/high16 v1, 0x10000

    and-int/2addr v0, v1

    if-eqz v0, :cond_10

    .line 5
    sget-object v0, Landroidx/compose/ui/graphics/e;->b:Landroidx/compose/ui/graphics/e$a;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/e$a;->a()I

    move-result v0

    move/from16 p21, v0

    :goto_10
    move/from16 p2, p1

    move/from16 p4, v2

    move/from16 p3, v3

    move/from16 p5, v4

    move/from16 p10, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p11, v10

    move-wide/from16 p12, v11

    move-object/from16 p14, v13

    move/from16 p15, v14

    move-object/from16 p16, v15

    move-wide/from16 p17, v16

    move-wide/from16 p19, v18

    move-object/from16 p1, p0

    goto :goto_11

    :cond_10
    move/from16 p21, p20

    goto :goto_10

    .line 6
    :goto_11
    invoke-static/range {p1 .. p21}, Landroidx/compose/ui/graphics/f;->b(Landroidx/compose/ui/e;FFFFFFFFFFJLs0/E1;ZLs0/u1;JJI)Landroidx/compose/ui/e;

    move-result-object v0

    return-object v0
.end method

.method public static final d(Landroidx/compose/ui/e;FFFFFFFFFFJLs0/E1;ZLs0/u1;JJIILandroidx/compose/ui/graphics/d;)Landroidx/compose/ui/e;
    .locals 24

    .line 1
    new-instance v0, Landroidx/compose/ui/graphics/GraphicsLayerElement;

    .line 2
    .line 3
    const/16 v23, 0x0

    .line 4
    .line 5
    move/from16 v1, p1

    .line 6
    .line 7
    move/from16 v2, p2

    .line 8
    .line 9
    move/from16 v3, p3

    .line 10
    .line 11
    move/from16 v4, p4

    .line 12
    .line 13
    move/from16 v5, p5

    .line 14
    .line 15
    move/from16 v6, p6

    .line 16
    .line 17
    move/from16 v7, p7

    .line 18
    .line 19
    move/from16 v8, p8

    .line 20
    .line 21
    move/from16 v9, p9

    .line 22
    .line 23
    move/from16 v10, p10

    .line 24
    .line 25
    move-wide/from16 v11, p11

    .line 26
    .line 27
    move-object/from16 v13, p13

    .line 28
    .line 29
    move/from16 v14, p14

    .line 30
    .line 31
    move-object/from16 v15, p15

    .line 32
    .line 33
    move-wide/from16 v16, p16

    .line 34
    .line 35
    move-wide/from16 v18, p18

    .line 36
    .line 37
    move/from16 v20, p20

    .line 38
    .line 39
    move/from16 v21, p21

    .line 40
    .line 41
    move-object/from16 v22, p22

    .line 42
    .line 43
    invoke-direct/range {v0 .. v23}, Landroidx/compose/ui/graphics/GraphicsLayerElement;-><init>(FFFFFFFFFFJLs0/E1;ZLs0/u1;JJIILandroidx/compose/ui/graphics/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 44
    .line 45
    .line 46
    move-object v1, v0

    .line 47
    move-object/from16 v0, p0

    .line 48
    .line 49
    invoke-interface {v0, v1}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0
.end method

.method public static synthetic e(Landroidx/compose/ui/e;FFFFFFFFFFJLs0/E1;ZLs0/u1;JJIILandroidx/compose/ui/graphics/d;ILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 23

    move/from16 v0, p23

    and-int/lit8 v1, v0, 0x1

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    move/from16 v2, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    move v4, v5

    goto :goto_3

    :cond_3
    move/from16 v4, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    move v6, v5

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    move v7, v5

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    move v8, v5

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    move v9, v5

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    goto :goto_8

    :cond_8
    move/from16 v5, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    const/high16 v10, 0x41000000    # 8.0f

    goto :goto_9

    :cond_9
    move/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    .line 1
    sget-object v11, Landroidx/compose/ui/graphics/j;->b:Landroidx/compose/ui/graphics/j$a;

    invoke-virtual {v11}, Landroidx/compose/ui/graphics/j$a;->a()J

    move-result-wide v11

    goto :goto_a

    :cond_a
    move-wide/from16 v11, p11

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    .line 2
    invoke-static {}, Ls0/t1;->a()Ls0/E1;

    move-result-object v13

    goto :goto_b

    :cond_b
    move-object/from16 v13, p13

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    const/4 v14, 0x0

    goto :goto_c

    :cond_c
    move/from16 v14, p14

    :goto_c
    and-int/lit16 v15, v0, 0x2000

    const/16 v16, 0x0

    if-eqz v15, :cond_d

    move-object/from16 v15, v16

    goto :goto_d

    :cond_d
    move-object/from16 v15, p15

    :goto_d
    move/from16 p1, v1

    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_e

    .line 3
    invoke-static {}, Ls0/a1;->a()J

    move-result-wide v17

    goto :goto_e

    :cond_e
    move-wide/from16 v17, p16

    :goto_e
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    .line 4
    invoke-static {}, Ls0/a1;->a()J

    move-result-wide v19

    goto :goto_f

    :cond_f
    move-wide/from16 v19, p18

    :goto_f
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    .line 5
    sget-object v1, Landroidx/compose/ui/graphics/e;->b:Landroidx/compose/ui/graphics/e$a;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/e$a;->a()I

    move-result v1

    goto :goto_10

    :cond_10
    move/from16 v1, p20

    :goto_10
    const/high16 v21, 0x20000

    and-int v21, v0, v21

    if-eqz v21, :cond_11

    .line 6
    sget-object v21, Landroidx/compose/ui/graphics/c;->b:Landroidx/compose/ui/graphics/c$a;

    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/graphics/c$a;->B()I

    move-result v21

    goto :goto_11

    :cond_11
    move/from16 v21, p21

    :goto_11
    const/high16 v22, 0x40000

    and-int v0, v0, v22

    if-eqz v0, :cond_12

    move-object/from16 p23, v16

    :goto_12
    move/from16 p2, p1

    move/from16 p21, v1

    move/from16 p4, v2

    move/from16 p3, v3

    move/from16 p5, v4

    move/from16 p10, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p11, v10

    move-wide/from16 p12, v11

    move-object/from16 p14, v13

    move/from16 p15, v14

    move-object/from16 p16, v15

    move-wide/from16 p17, v17

    move-wide/from16 p19, v19

    move/from16 p22, v21

    move-object/from16 p1, p0

    goto :goto_13

    :cond_12
    move-object/from16 p23, p22

    goto :goto_12

    .line 7
    :goto_13
    invoke-static/range {p1 .. p23}, Landroidx/compose/ui/graphics/f;->d(Landroidx/compose/ui/e;FFFFFFFFFFJLs0/E1;ZLs0/u1;JJIILandroidx/compose/ui/graphics/d;)Landroidx/compose/ui/e;

    move-result-object v0

    return-object v0
.end method

.method public static final f(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Landroidx/compose/ui/platform/T0;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 10
    .line 11
    const v25, 0x7ffff

    .line 12
    .line 13
    .line 14
    const/16 v26, 0x0

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x0

    .line 25
    const/4 v12, 0x0

    .line 26
    const-wide/16 v13, 0x0

    .line 27
    .line 28
    const/4 v15, 0x0

    .line 29
    const/16 v16, 0x0

    .line 30
    .line 31
    const/16 v17, 0x0

    .line 32
    .line 33
    const-wide/16 v18, 0x0

    .line 34
    .line 35
    const-wide/16 v20, 0x0

    .line 36
    .line 37
    const/16 v22, 0x0

    .line 38
    .line 39
    const/16 v23, 0x0

    .line 40
    .line 41
    const/16 v24, 0x0

    .line 42
    .line 43
    invoke-static/range {v2 .. v26}, Landroidx/compose/ui/graphics/f;->e(Landroidx/compose/ui/e;FFFFFFFFFFJLs0/E1;ZLs0/u1;JJIILandroidx/compose/ui/graphics/d;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-interface {v0, v1}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :cond_0
    return-object v0
.end method
