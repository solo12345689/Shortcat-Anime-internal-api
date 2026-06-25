.class public final Lnf/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lve/b;


# instance fields
.field private final b:Lnf/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lnf/d;

    .line 5
    .line 6
    invoke-direct {v0}, Lnf/d;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lnf/b;->b:Lnf/d;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a(Lpf/n;Lye/H;Ljava/lang/Iterable;LAe/c;LAe/a;Z)Lye/O;
    .locals 10

    .line 1
    const-string v0, "storageManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "builtInsModule"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "classDescriptorFactories"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "platformDependentDeclarationFilter"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "additionalClassPartsProvider"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sget-object v4, Lve/o;->J:Ljava/util/Set;

    .line 27
    .line 28
    new-instance v9, Lnf/b$a;

    .line 29
    .line 30
    iget-object v0, p0, Lnf/b;->b:Lnf/d;

    .line 31
    .line 32
    invoke-direct {v9, v0}, Lnf/b$a;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    move-object v1, p0

    .line 36
    move-object v2, p1

    .line 37
    move-object v3, p2

    .line 38
    move-object v5, p3

    .line 39
    move-object v6, p4

    .line 40
    move-object v7, p5

    .line 41
    move/from16 v8, p6

    .line 42
    .line 43
    invoke-virtual/range {v1 .. v9}, Lnf/b;->b(Lpf/n;Lye/H;Ljava/util/Set;Ljava/lang/Iterable;LAe/c;LAe/a;ZLkotlin/jvm/functions/Function1;)Lye/O;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1
.end method

.method public final b(Lpf/n;Lye/H;Ljava/util/Set;Ljava/lang/Iterable;LAe/c;LAe/a;ZLkotlin/jvm/functions/Function1;)Lye/O;
    .locals 24

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    move-object/from16 v6, p8

    .line 8
    .line 9
    const-string v3, "storageManager"

    .line 10
    .line 11
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v3, "module"

    .line 15
    .line 16
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v3, "packageFqNames"

    .line 20
    .line 21
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v3, "classDescriptorFactories"

    .line 25
    .line 26
    move-object/from16 v11, p4

    .line 27
    .line 28
    invoke-static {v11, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v3, "platformDependentDeclarationFilter"

    .line 32
    .line 33
    move-object/from16 v15, p5

    .line 34
    .line 35
    invoke-static {v15, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v3, "additionalClassPartsProvider"

    .line 39
    .line 40
    move-object/from16 v14, p6

    .line 41
    .line 42
    invoke-static {v14, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string v3, "loadResource"

    .line 46
    .line 47
    invoke-static {v6, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    check-cast v0, Ljava/lang/Iterable;

    .line 51
    .line 52
    new-instance v7, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    :cond_0
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, LXe/c;

    .line 72
    .line 73
    sget-object v3, Lnf/a;->r:Lnf/a;

    .line 74
    .line 75
    invoke-virtual {v3, v0}, Lnf/a;->r(LXe/c;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-interface {v6, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    move-object v4, v3

    .line 84
    check-cast v4, Ljava/io/InputStream;

    .line 85
    .line 86
    if-eqz v4, :cond_1

    .line 87
    .line 88
    move-object v1, v0

    .line 89
    sget-object v0, Lnf/c;->o:Lnf/c$a;

    .line 90
    .line 91
    move/from16 v5, p7

    .line 92
    .line 93
    move-object v3, v2

    .line 94
    move-object/from16 v2, p1

    .line 95
    .line 96
    invoke-virtual/range {v0 .. v5}, Lnf/c$a;->a(LXe/c;Lpf/n;Lye/H;Ljava/io/InputStream;Z)Lnf/c;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    move-object v1, v2

    .line 101
    move-object v2, v3

    .line 102
    goto :goto_1

    .line 103
    :cond_1
    const/4 v0, 0x0

    .line 104
    :goto_1
    if-eqz v0, :cond_0

    .line 105
    .line 106
    invoke-interface {v7, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_2
    new-instance v6, Lye/S;

    .line 111
    .line 112
    invoke-direct {v6, v7}, Lye/S;-><init>(Ljava/util/Collection;)V

    .line 113
    .line 114
    .line 115
    new-instance v12, Lye/M;

    .line 116
    .line 117
    invoke-direct {v12, v1, v2}, Lye/M;-><init>(Lpf/n;Lye/H;)V

    .line 118
    .line 119
    .line 120
    new-instance v0, Lmf/n;

    .line 121
    .line 122
    sget-object v3, Lmf/o$a;->a:Lmf/o$a;

    .line 123
    .line 124
    new-instance v4, Lmf/q;

    .line 125
    .line 126
    invoke-direct {v4, v6}, Lmf/q;-><init>(Lye/O;)V

    .line 127
    .line 128
    .line 129
    new-instance v5, Lmf/f;

    .line 130
    .line 131
    sget-object v8, Lnf/a;->r:Lnf/a;

    .line 132
    .line 133
    invoke-direct {v5, v2, v12, v8}, Lmf/f;-><init>(Lye/H;Lye/M;Llf/a;)V

    .line 134
    .line 135
    .line 136
    move-object v9, v7

    .line 137
    sget-object v7, Lmf/B$a;->a:Lmf/B$a;

    .line 138
    .line 139
    move-object v10, v8

    .line 140
    sget-object v8, Lmf/w;->a:Lmf/w;

    .line 141
    .line 142
    const-string v13, "DO_NOTHING"

    .line 143
    .line 144
    invoke-static {v8, v13}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    move-object v13, v9

    .line 148
    sget-object v9, LGe/c$a;->a:LGe/c$a;

    .line 149
    .line 150
    move-object/from16 v16, v10

    .line 151
    .line 152
    sget-object v10, Lmf/x$a;->a:Lmf/x$a;

    .line 153
    .line 154
    sget-object v17, Lmf/m;->a:Lmf/m$a;

    .line 155
    .line 156
    invoke-virtual/range {v17 .. v17}, Lmf/m$a;->a()Lmf/m;

    .line 157
    .line 158
    .line 159
    move-result-object v17

    .line 160
    invoke-virtual/range {v16 .. v16}, Llf/a;->e()LZe/g;

    .line 161
    .line 162
    .line 163
    move-result-object v16

    .line 164
    move-object/from16 p3, v0

    .line 165
    .line 166
    new-instance v0, Lhf/b;

    .line 167
    .line 168
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-direct {v0, v1, v2}, Lhf/b;-><init>(Lpf/n;Ljava/lang/Iterable;)V

    .line 173
    .line 174
    .line 175
    const/high16 v21, 0xd0000

    .line 176
    .line 177
    const/16 v22, 0x0

    .line 178
    .line 179
    move-object v2, v13

    .line 180
    move-object/from16 v13, v17

    .line 181
    .line 182
    const/16 v17, 0x0

    .line 183
    .line 184
    const/16 v19, 0x0

    .line 185
    .line 186
    const/16 v20, 0x0

    .line 187
    .line 188
    move-object/from16 v18, v0

    .line 189
    .line 190
    move-object/from16 v23, v2

    .line 191
    .line 192
    move-object/from16 v2, p2

    .line 193
    .line 194
    move-object/from16 v0, p3

    .line 195
    .line 196
    invoke-direct/range {v0 .. v22}, Lmf/n;-><init>(Lpf/n;Lye/H;Lmf/o;Lmf/j;Lmf/e;Lye/O;Lmf/B;Lmf/w;LGe/c;Lmf/x;Ljava/lang/Iterable;Lye/M;Lmf/m;LAe/a;LAe/c;LZe/g;Lrf/p;Lhf/a;Ljava/util/List;Lmf/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 197
    .line 198
    .line 199
    invoke-interface/range {v23 .. v23}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    if-eqz v2, :cond_3

    .line 208
    .line 209
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    check-cast v2, Lnf/c;

    .line 214
    .line 215
    invoke-virtual {v2, v0}, Lmf/u;->L0(Lmf/n;)V

    .line 216
    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_3
    return-object v6
.end method
