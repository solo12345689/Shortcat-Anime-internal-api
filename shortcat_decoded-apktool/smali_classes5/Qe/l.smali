.class public abstract LQe/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Lye/H;Lpf/n;Lye/M;LKe/j;LQe/v;LQe/n;Lmf/w;LUe/c;)LQe/k;
    .locals 13

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    move-object/from16 v2, p7

    .line 6
    .line 7
    const-string v3, "module"

    .line 8
    .line 9
    invoke-static {p0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "storageManager"

    .line 13
    .line 14
    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v3, "notFoundClasses"

    .line 18
    .line 19
    invoke-static {p2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v3, "lazyJavaPackageFragmentProvider"

    .line 23
    .line 24
    move-object/from16 v6, p3

    .line 25
    .line 26
    invoke-static {v6, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v3, "reflectKotlinClassFinder"

    .line 30
    .line 31
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v3, "deserializedDescriptorResolver"

    .line 35
    .line 36
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v3, "errorReporter"

    .line 40
    .line 41
    move-object/from16 v8, p6

    .line 42
    .line 43
    invoke-static {v8, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v3, "metadataVersion"

    .line 47
    .line 48
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v4, LQe/o;

    .line 52
    .line 53
    invoke-direct {v4, v0, v1}, LQe/o;-><init>(LQe/v;LQe/n;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0, p2, p1, v0, v2}, LQe/i;->a(Lye/H;Lye/M;Lpf/n;LQe/v;LUe/c;)LQe/h;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    new-instance v0, LQe/k;

    .line 61
    .line 62
    sget-object v3, Lmf/o$a;->a:Lmf/o$a;

    .line 63
    .line 64
    sget-object v9, LGe/c$a;->a:LGe/c$a;

    .line 65
    .line 66
    sget-object v1, Lmf/m;->a:Lmf/m$a;

    .line 67
    .line 68
    invoke-virtual {v1}, Lmf/m$a;->a()Lmf/m;

    .line 69
    .line 70
    .line 71
    move-result-object v10

    .line 72
    sget-object v1, Lrf/p;->b:Lrf/p$a;

    .line 73
    .line 74
    invoke-virtual {v1}, Lrf/p$a;->a()Lrf/q;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    new-instance v12, Ltf/a;

    .line 79
    .line 80
    sget-object v1, Lqf/x;->a:Lqf/x;

    .line 81
    .line 82
    invoke-static {v1}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-direct {v12, v1}, Ltf/a;-><init>(Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    move-object v2, p0

    .line 90
    move-object v1, p1

    .line 91
    move-object v7, p2

    .line 92
    invoke-direct/range {v0 .. v12}, LQe/k;-><init>(Lpf/n;Lye/H;Lmf/o;LQe/o;LQe/h;LKe/j;Lye/M;Lmf/w;LGe/c;Lmf/m;Lrf/p;Ltf/a;)V

    .line 93
    .line 94
    .line 95
    return-object v0
.end method

.method public static final b(LHe/u;Lye/H;Lpf/n;Lye/M;LQe/v;LQe/n;Lmf/w;LNe/b;LKe/n;LQe/D;)LKe/j;
    .locals 27

    .line 1
    move-object/from16 v15, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    const-string v2, "javaClassFinder"

    .line 8
    .line 9
    move-object/from16 v3, p0

    .line 10
    .line 11
    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v2, "module"

    .line 15
    .line 16
    invoke-static {v15, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v2, "storageManager"

    .line 20
    .line 21
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v2, "notFoundClasses"

    .line 25
    .line 26
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v2, "reflectKotlinClassFinder"

    .line 30
    .line 31
    move-object/from16 v4, p4

    .line 32
    .line 33
    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v2, "deserializedDescriptorResolver"

    .line 37
    .line 38
    move-object/from16 v5, p5

    .line 39
    .line 40
    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string v2, "errorReporter"

    .line 44
    .line 45
    move-object/from16 v6, p6

    .line 46
    .line 47
    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v2, "javaSourceElementFactory"

    .line 51
    .line 52
    move-object/from16 v10, p7

    .line 53
    .line 54
    invoke-static {v10, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v2, "singleModuleClassResolver"

    .line 58
    .line 59
    move-object/from16 v11, p8

    .line 60
    .line 61
    invoke-static {v11, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v2, "packagePartProvider"

    .line 65
    .line 66
    move-object/from16 v12, p9

    .line 67
    .line 68
    invoke-static {v12, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    new-instance v2, LKe/d;

    .line 72
    .line 73
    sget-object v5, LIe/o;->a:LIe/o;

    .line 74
    .line 75
    const-string v7, "DO_NOTHING"

    .line 76
    .line 77
    invoke-static {v5, v7}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    sget-object v7, LIe/j;->a:LIe/j;

    .line 81
    .line 82
    const-string v8, "EMPTY"

    .line 83
    .line 84
    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    sget-object v8, LIe/i$a;->a:LIe/i$a;

    .line 88
    .line 89
    new-instance v9, Lhf/b;

    .line 90
    .line 91
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v13

    .line 95
    invoke-direct {v9, v1, v13}, Lhf/b;-><init>(Lpf/n;Ljava/lang/Iterable;)V

    .line 96
    .line 97
    .line 98
    sget-object v13, Lye/k0$a;->a:Lye/k0$a;

    .line 99
    .line 100
    sget-object v14, LGe/c$a;->a:LGe/c$a;

    .line 101
    .line 102
    new-instance v1, Lve/n;

    .line 103
    .line 104
    invoke-direct {v1, v15, v0}, Lve/n;-><init>(Lye/H;Lye/M;)V

    .line 105
    .line 106
    .line 107
    new-instance v0, LHe/d;

    .line 108
    .line 109
    sget-object v16, LHe/D;->d:LHe/D$b;

    .line 110
    .line 111
    move-object/from16 v17, v1

    .line 112
    .line 113
    invoke-virtual/range {v16 .. v16}, LHe/D$b;->a()LHe/D;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-direct {v0, v1}, LHe/d;-><init>(LHe/D;)V

    .line 118
    .line 119
    .line 120
    new-instance v1, LPe/m0;

    .line 121
    .line 122
    move-object/from16 p3, v0

    .line 123
    .line 124
    new-instance v0, LPe/g;

    .line 125
    .line 126
    move-object/from16 v18, v2

    .line 127
    .line 128
    sget-object v2, LKe/e$a;->a:LKe/e$a;

    .line 129
    .line 130
    invoke-direct {v0, v2}, LPe/g;-><init>(LKe/e;)V

    .line 131
    .line 132
    .line 133
    invoke-direct {v1, v0}, LPe/m0;-><init>(LPe/g;)V

    .line 134
    .line 135
    .line 136
    sget-object v19, LHe/v$a;->a:LHe/v$a;

    .line 137
    .line 138
    sget-object v0, Lrf/p;->b:Lrf/p$a;

    .line 139
    .line 140
    invoke-virtual {v0}, Lrf/p$a;->a()Lrf/q;

    .line 141
    .line 142
    .line 143
    move-result-object v21

    .line 144
    invoke-virtual/range {v16 .. v16}, LHe/D$b;->a()LHe/D;

    .line 145
    .line 146
    .line 147
    move-result-object v22

    .line 148
    new-instance v23, LQe/l$a;

    .line 149
    .line 150
    invoke-direct/range {v23 .. v23}, LQe/l$a;-><init>()V

    .line 151
    .line 152
    .line 153
    const/high16 v25, 0x800000

    .line 154
    .line 155
    const/16 v26, 0x0

    .line 156
    .line 157
    const/16 v24, 0x0

    .line 158
    .line 159
    move-object/from16 v20, v2

    .line 160
    .line 161
    move-object v2, v3

    .line 162
    move-object v3, v4

    .line 163
    move-object/from16 v16, v17

    .line 164
    .line 165
    move-object/from16 v0, v18

    .line 166
    .line 167
    move-object/from16 v17, p3

    .line 168
    .line 169
    move-object/from16 v4, p5

    .line 170
    .line 171
    move-object/from16 v18, v1

    .line 172
    .line 173
    move-object/from16 v1, p2

    .line 174
    .line 175
    invoke-direct/range {v0 .. v26}, LKe/d;-><init>(Lpf/n;LHe/u;LQe/v;LQe/n;LIe/o;Lmf/w;LIe/j;LIe/i;Lhf/a;LNe/b;LKe/n;LQe/D;Lye/k0;LGe/c;Lye/H;Lve/n;LHe/d;LPe/m0;LHe/v;LKe/e;Lrf/p;LHe/D;LHe/A;Lgf/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 176
    .line 177
    .line 178
    new-instance v1, LKe/j;

    .line 179
    .line 180
    invoke-direct {v1, v0}, LKe/j;-><init>(LKe/d;)V

    .line 181
    .line 182
    .line 183
    return-object v1
.end method

.method public static synthetic c(LHe/u;Lye/H;Lpf/n;Lye/M;LQe/v;LQe/n;Lmf/w;LNe/b;LKe/n;LQe/D;ILjava/lang/Object;)LKe/j;
    .locals 11

    .line 1
    move/from16 v0, p10

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x200

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, LQe/D$a;->a:LQe/D$a;

    .line 8
    .line 9
    move-object v10, v0

    .line 10
    :goto_0
    move-object v1, p0

    .line 11
    move-object v2, p1

    .line 12
    move-object v3, p2

    .line 13
    move-object v4, p3

    .line 14
    move-object v5, p4

    .line 15
    move-object/from16 v6, p5

    .line 16
    .line 17
    move-object/from16 v7, p6

    .line 18
    .line 19
    move-object/from16 v8, p7

    .line 20
    .line 21
    move-object/from16 v9, p8

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move-object/from16 v10, p9

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    invoke-static/range {v1 .. v10}, LQe/l;->b(LHe/u;Lye/H;Lpf/n;Lye/M;LQe/v;LQe/n;Lmf/w;LNe/b;LKe/n;LQe/D;)LKe/j;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method
