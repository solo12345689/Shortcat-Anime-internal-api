.class public LJe/b;
.super LBe/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJe/a;


# instance fields
.field private F:Ljava/lang/Boolean;

.field private G:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method protected constructor <init>(Lye/e;LJe/b;Lze/h;ZLye/b$a;Lye/h0;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {v0}, LJe/b;->T(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    if-nez p3, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {v0}, LJe/b;->T(I)V

    .line 11
    .line 12
    .line 13
    :cond_1
    if-nez p5, :cond_2

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    invoke-static {v0}, LJe/b;->T(I)V

    .line 17
    .line 18
    .line 19
    :cond_2
    if-nez p6, :cond_3

    .line 20
    .line 21
    const/4 v0, 0x3

    .line 22
    invoke-static {v0}, LJe/b;->T(I)V

    .line 23
    .line 24
    .line 25
    :cond_3
    invoke-direct/range {p0 .. p6}, LBe/i;-><init>(Lye/e;Lye/l;Lze/h;ZLye/b$a;Lye/h0;)V

    .line 26
    .line 27
    .line 28
    move-object p1, p0

    .line 29
    const/4 p2, 0x0

    .line 30
    iput-object p2, p1, LJe/b;->F:Ljava/lang/Boolean;

    .line 31
    .line 32
    iput-object p2, p1, LJe/b;->G:Ljava/lang/Boolean;

    .line 33
    .line 34
    return-void
.end method

.method private static synthetic T(I)V
    .locals 9

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    if-eq p0, v1, :cond_0

    .line 6
    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    const-string v2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v2, "@NotNull method %s.%s must not return null"

    .line 13
    .line 14
    :goto_0
    const/4 v3, 0x2

    .line 15
    if-eq p0, v1, :cond_1

    .line 16
    .line 17
    if-eq p0, v0, :cond_1

    .line 18
    .line 19
    const/4 v4, 0x3

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move v4, v3

    .line 22
    :goto_1
    new-array v4, v4, [Ljava/lang/Object;

    .line 23
    .line 24
    const-string v5, "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor"

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    packed-switch p0, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    :pswitch_0
    const-string v7, "containingDeclaration"

    .line 31
    .line 32
    aput-object v7, v4, v6

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :pswitch_1
    const-string v7, "enhancedReturnType"

    .line 36
    .line 37
    aput-object v7, v4, v6

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :pswitch_2
    const-string v7, "enhancedValueParameterTypes"

    .line 41
    .line 42
    aput-object v7, v4, v6

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :pswitch_3
    const-string v7, "sourceElement"

    .line 46
    .line 47
    aput-object v7, v4, v6

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :pswitch_4
    aput-object v5, v4, v6

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :pswitch_5
    const-string v7, "newOwner"

    .line 54
    .line 55
    aput-object v7, v4, v6

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :pswitch_6
    const-string v7, "source"

    .line 59
    .line 60
    aput-object v7, v4, v6

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :pswitch_7
    const-string v7, "kind"

    .line 64
    .line 65
    aput-object v7, v4, v6

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :pswitch_8
    const-string v7, "annotations"

    .line 69
    .line 70
    aput-object v7, v4, v6

    .line 71
    .line 72
    :goto_2
    const-string v6, "createSubstitutedCopy"

    .line 73
    .line 74
    const-string v7, "enhance"

    .line 75
    .line 76
    const/4 v8, 0x1

    .line 77
    if-eq p0, v1, :cond_3

    .line 78
    .line 79
    if-eq p0, v0, :cond_2

    .line 80
    .line 81
    aput-object v5, v4, v8

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_2
    aput-object v7, v4, v8

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    aput-object v6, v4, v8

    .line 88
    .line 89
    :goto_3
    packed-switch p0, :pswitch_data_1

    .line 90
    .line 91
    .line 92
    const-string v5, "<init>"

    .line 93
    .line 94
    aput-object v5, v4, v3

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :pswitch_9
    aput-object v7, v4, v3

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :pswitch_a
    const-string v5, "createDescriptor"

    .line 101
    .line 102
    aput-object v5, v4, v3

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :pswitch_b
    aput-object v6, v4, v3

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :pswitch_c
    const-string v5, "createJavaConstructor"

    .line 109
    .line 110
    aput-object v5, v4, v3

    .line 111
    .line 112
    :goto_4
    :pswitch_d
    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    if-eq p0, v1, :cond_4

    .line 117
    .line 118
    if-eq p0, v0, :cond_4

    .line 119
    .line 120
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 121
    .line 122
    invoke-direct {p0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 127
    .line 128
    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :goto_5
    throw p0

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_8
        :pswitch_6
        :pswitch_5
        :pswitch_7
        :pswitch_8
        :pswitch_6
        :pswitch_4
        :pswitch_5
        :pswitch_7
        :pswitch_3
        :pswitch_8
        :pswitch_2
        :pswitch_1
        :pswitch_4
    .end packed-switch

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    :pswitch_data_1
    .packed-switch 0x4
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_d
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_d
    .end packed-switch
.end method

.method public static t1(Lye/e;Lze/h;ZLye/h0;)LJe/b;
    .locals 8

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    invoke-static {v0}, LJe/b;->T(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    if-nez p1, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x5

    .line 10
    invoke-static {v0}, LJe/b;->T(I)V

    .line 11
    .line 12
    .line 13
    :cond_1
    if-nez p3, :cond_2

    .line 14
    .line 15
    const/4 v0, 0x6

    .line 16
    invoke-static {v0}, LJe/b;->T(I)V

    .line 17
    .line 18
    .line 19
    :cond_2
    new-instance v1, LJe/b;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    sget-object v6, Lye/b$a;->a:Lye/b$a;

    .line 23
    .line 24
    move-object v2, p0

    .line 25
    move-object v4, p1

    .line 26
    move v5, p2

    .line 27
    move-object v7, p3

    .line 28
    invoke-direct/range {v1 .. v7}, LJe/b;-><init>(Lye/e;LJe/b;Lze/h;ZLye/b$a;Lye/h0;)V

    .line 29
    .line 30
    .line 31
    return-object v1
.end method


# virtual methods
.method protected bridge synthetic L0(Lye/m;Lye/z;Lye/b$a;LXe/f;Lze/h;Lye/h0;)LBe/s;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, LJe/b;->u1(Lye/m;Lye/z;Lye/b$a;LXe/f;Lze/h;Lye/h0;)LJe/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public Q0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LJe/b;->F:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public Y0(Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, LJe/b;->F:Ljava/lang/Boolean;

    .line 6
    .line 7
    return-void
.end method

.method public Z0(Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, LJe/b;->G:Ljava/lang/Boolean;

    .line 6
    .line 7
    return-void
.end method

.method public i0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LJe/b;->G:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method protected bridge synthetic o1(Lye/m;Lye/z;Lye/b$a;LXe/f;Lze/h;Lye/h0;)LBe/i;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, LJe/b;->u1(Lye/m;Lye/z;Lye/b$a;LXe/f;Lze/h;Lye/h0;)LJe/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected s1(Lye/e;LJe/b;Lye/b$a;Lye/h0;Lze/h;)LJe/b;
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0xc

    .line 4
    .line 5
    invoke-static {v0}, LJe/b;->T(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    if-nez p3, :cond_1

    .line 9
    .line 10
    const/16 v0, 0xd

    .line 11
    .line 12
    invoke-static {v0}, LJe/b;->T(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    if-nez p4, :cond_2

    .line 16
    .line 17
    const/16 v0, 0xe

    .line 18
    .line 19
    invoke-static {v0}, LJe/b;->T(I)V

    .line 20
    .line 21
    .line 22
    :cond_2
    if-nez p5, :cond_3

    .line 23
    .line 24
    const/16 v0, 0xf

    .line 25
    .line 26
    invoke-static {v0}, LJe/b;->T(I)V

    .line 27
    .line 28
    .line 29
    :cond_3
    new-instance v1, LJe/b;

    .line 30
    .line 31
    iget-boolean v5, p0, LBe/i;->E:Z

    .line 32
    .line 33
    move-object v2, p1

    .line 34
    move-object v3, p2

    .line 35
    move-object v6, p3

    .line 36
    move-object v7, p4

    .line 37
    move-object v4, p5

    .line 38
    invoke-direct/range {v1 .. v7}, LJe/b;-><init>(Lye/e;LJe/b;Lze/h;ZLye/b$a;Lye/h0;)V

    .line 39
    .line 40
    .line 41
    return-object v1
.end method

.method protected u1(Lye/m;Lye/z;Lye/b$a;LXe/f;Lze/h;Lye/h0;)LJe/b;
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p4, 0x7

    .line 4
    invoke-static {p4}, LJe/b;->T(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    if-nez p3, :cond_1

    .line 8
    .line 9
    const/16 p4, 0x8

    .line 10
    .line 11
    invoke-static {p4}, LJe/b;->T(I)V

    .line 12
    .line 13
    .line 14
    :cond_1
    if-nez p5, :cond_2

    .line 15
    .line 16
    const/16 p4, 0x9

    .line 17
    .line 18
    invoke-static {p4}, LJe/b;->T(I)V

    .line 19
    .line 20
    .line 21
    :cond_2
    if-nez p6, :cond_3

    .line 22
    .line 23
    const/16 p4, 0xa

    .line 24
    .line 25
    invoke-static {p4}, LJe/b;->T(I)V

    .line 26
    .line 27
    .line 28
    :cond_3
    sget-object p4, Lye/b$a;->a:Lye/b$a;

    .line 29
    .line 30
    if-eq p3, p4, :cond_5

    .line 31
    .line 32
    sget-object p4, Lye/b$a;->d:Lye/b$a;

    .line 33
    .line 34
    if-ne p3, p4, :cond_4

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    new-instance p4, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string p5, "Attempt at creating a constructor that is not a declaration: \ncopy from: "

    .line 45
    .line 46
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p5, "\nnewOwner: "

    .line 53
    .line 54
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string p1, "\nkind: "

    .line 61
    .line 62
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p2

    .line 76
    :cond_5
    :goto_0
    move-object v1, p1

    .line 77
    check-cast v1, Lye/e;

    .line 78
    .line 79
    move-object v2, p2

    .line 80
    check-cast v2, LJe/b;

    .line 81
    .line 82
    move-object v0, p0

    .line 83
    move-object v3, p3

    .line 84
    move-object v5, p5

    .line 85
    move-object v4, p6

    .line 86
    invoke-virtual/range {v0 .. v5}, LJe/b;->s1(Lye/e;LJe/b;Lye/b$a;Lye/h0;Lze/h;)LJe/b;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p0}, LJe/b;->Q0()Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    invoke-virtual {p1, p2}, LJe/b;->Y0(Z)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, LJe/b;->i0()Z

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    invoke-virtual {p1, p2}, LJe/b;->Z0(Z)V

    .line 102
    .line 103
    .line 104
    return-object p1
.end method

.method public v1(Lqf/S;Ljava/util/List;Lqf/S;Lkotlin/Pair;)LJe/b;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/16 v2, 0x10

    .line 8
    .line 9
    invoke-static {v2}, LJe/b;->T(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    if-nez p3, :cond_1

    .line 13
    .line 14
    const/16 v2, 0x11

    .line 15
    .line 16
    invoke-static {v2}, LJe/b;->T(I)V

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual/range {p0 .. p0}, LBe/i;->p1()Lye/e;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual/range {p0 .. p0}, LBe/s;->h()Lye/b$a;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-virtual/range {p0 .. p0}, Lze/b;->getAnnotations()Lze/h;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    invoke-virtual/range {p0 .. p0}, LBe/n;->k()Lye/h0;

    .line 32
    .line 33
    .line 34
    move-result-object v9

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    move-object/from16 v3, p0

    .line 38
    .line 39
    invoke-virtual/range {v3 .. v9}, LJe/b;->u1(Lye/m;Lye/z;Lye/b$a;LXe/f;Lze/h;Lye/h0;)LJe/b;

    .line 40
    .line 41
    .line 42
    move-result-object v10

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    :goto_0
    move-object v11, v0

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    sget-object v2, Lze/h;->k0:Lze/h$a;

    .line 49
    .line 50
    invoke-virtual {v2}, Lze/h$a;->b()Lze/h;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-static {v10, v0, v2}, Lbf/h;->i(Lye/a;Lqf/S;Lze/h;)Lye/c0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    goto :goto_0

    .line 59
    :goto_1
    invoke-virtual/range {p0 .. p0}, LBe/s;->K()Lye/c0;

    .line 60
    .line 61
    .line 62
    move-result-object v12

    .line 63
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v13

    .line 67
    invoke-virtual/range {p0 .. p0}, LBe/s;->getTypeParameters()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v14

    .line 71
    invoke-virtual/range {p0 .. p0}, LBe/s;->j()Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v1, v0, v10}, LJe/h;->a(Ljava/util/Collection;Ljava/util/Collection;Lye/a;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v15

    .line 79
    invoke-virtual/range {p0 .. p0}, LBe/s;->r()Lye/E;

    .line 80
    .line 81
    .line 82
    move-result-object v17

    .line 83
    invoke-virtual/range {p0 .. p0}, LBe/s;->getVisibility()Lye/u;

    .line 84
    .line 85
    .line 86
    move-result-object v18

    .line 87
    move-object/from16 v16, p3

    .line 88
    .line 89
    invoke-virtual/range {v10 .. v18}, LBe/s;->R0(Lye/c0;Lye/c0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lqf/S;Lye/E;Lye/u;)LBe/s;

    .line 90
    .line 91
    .line 92
    if-eqz p4, :cond_3

    .line 93
    .line 94
    invoke-virtual/range {p4 .. p4}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Lye/a$a;

    .line 99
    .line 100
    invoke-virtual/range {p4 .. p4}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v10, v0, v1}, LBe/s;->U0(Lye/a$a;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_3
    return-object v10
.end method

.method public bridge synthetic x(Lqf/S;Ljava/util/List;Lqf/S;Lkotlin/Pair;)LJe/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, LJe/b;->v1(Lqf/S;Ljava/util/List;Lqf/S;Lkotlin/Pair;)LJe/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
