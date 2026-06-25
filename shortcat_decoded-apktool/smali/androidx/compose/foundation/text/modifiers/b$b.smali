.class final Landroidx/compose/foundation/text/modifiers/b$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/modifiers/b;->Y(LR0/C;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/text/modifiers/b;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text/modifiers/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/b$b;->a:Landroidx/compose/foundation/text/modifiers/b;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/lang/Boolean;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/compose/foundation/text/modifiers/b$b;->a:Landroidx/compose/foundation/text/modifiers/b;

    .line 4
    .line 5
    invoke-static {v1}, Landroidx/compose/foundation/text/modifiers/b;->E1(Landroidx/compose/foundation/text/modifiers/b;)LP/e;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, LP/e;->b()LU0/T0;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    new-instance v3, LU0/S0;

    .line 16
    .line 17
    invoke-virtual {v2}, LU0/T0;->l()LU0/S0;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, LU0/S0;->j()LU0/e;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    iget-object v1, v0, Landroidx/compose/foundation/text/modifiers/b$b;->a:Landroidx/compose/foundation/text/modifiers/b;

    .line 26
    .line 27
    invoke-static {v1}, Landroidx/compose/foundation/text/modifiers/b;->H1(Landroidx/compose/foundation/text/modifiers/b;)LU0/Y0;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    iget-object v1, v0, Landroidx/compose/foundation/text/modifiers/b$b;->a:Landroidx/compose/foundation/text/modifiers/b;

    .line 32
    .line 33
    invoke-static {v1}, Landroidx/compose/foundation/text/modifiers/b;->G1(Landroidx/compose/foundation/text/modifiers/b;)Ls0/t0;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    invoke-interface {v1}, Ls0/t0;->a()J

    .line 40
    .line 41
    .line 42
    move-result-wide v6

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    sget-object v1, Ls0/r0;->b:Ls0/r0$a;

    .line 45
    .line 46
    invoke-virtual {v1}, Ls0/r0$a;->j()J

    .line 47
    .line 48
    .line 49
    move-result-wide v6

    .line 50
    :goto_0
    const v35, 0xfffffe

    .line 51
    .line 52
    .line 53
    const/16 v36, 0x0

    .line 54
    .line 55
    const-wide/16 v8, 0x0

    .line 56
    .line 57
    const/4 v10, 0x0

    .line 58
    const/4 v11, 0x0

    .line 59
    const/4 v12, 0x0

    .line 60
    const/4 v13, 0x0

    .line 61
    const/4 v14, 0x0

    .line 62
    const-wide/16 v15, 0x0

    .line 63
    .line 64
    const/16 v17, 0x0

    .line 65
    .line 66
    const/16 v18, 0x0

    .line 67
    .line 68
    const/16 v19, 0x0

    .line 69
    .line 70
    const-wide/16 v20, 0x0

    .line 71
    .line 72
    const/16 v22, 0x0

    .line 73
    .line 74
    const/16 v23, 0x0

    .line 75
    .line 76
    const/16 v24, 0x0

    .line 77
    .line 78
    const/16 v25, 0x0

    .line 79
    .line 80
    const/16 v26, 0x0

    .line 81
    .line 82
    const-wide/16 v27, 0x0

    .line 83
    .line 84
    const/16 v29, 0x0

    .line 85
    .line 86
    const/16 v30, 0x0

    .line 87
    .line 88
    const/16 v31, 0x0

    .line 89
    .line 90
    const/16 v32, 0x0

    .line 91
    .line 92
    const/16 v33, 0x0

    .line 93
    .line 94
    const/16 v34, 0x0

    .line 95
    .line 96
    invoke-static/range {v5 .. v36}, LU0/Y0;->M(LU0/Y0;JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;Lu0/g;IIJLg1/s;Lg1/h;IILU0/G;Lg1/u;ILjava/lang/Object;)LU0/Y0;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-virtual {v2}, LU0/T0;->l()LU0/S0;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v1}, LU0/S0;->g()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v2}, LU0/T0;->l()LU0/S0;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1}, LU0/S0;->e()I

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    invoke-virtual {v2}, LU0/T0;->l()LU0/S0;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v1}, LU0/S0;->h()Z

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    invoke-virtual {v2}, LU0/T0;->l()LU0/S0;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v1}, LU0/S0;->f()I

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    invoke-virtual {v2}, LU0/T0;->l()LU0/S0;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v1}, LU0/S0;->b()Li1/d;

    .line 137
    .line 138
    .line 139
    move-result-object v10

    .line 140
    invoke-virtual {v2}, LU0/T0;->l()LU0/S0;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-virtual {v1}, LU0/S0;->d()Li1/t;

    .line 145
    .line 146
    .line 147
    move-result-object v11

    .line 148
    invoke-virtual {v2}, LU0/T0;->l()LU0/S0;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1}, LU0/S0;->c()LY0/u$b;

    .line 153
    .line 154
    .line 155
    move-result-object v12

    .line 156
    invoke-virtual {v2}, LU0/T0;->l()LU0/S0;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v1}, LU0/S0;->a()J

    .line 161
    .line 162
    .line 163
    move-result-wide v13

    .line 164
    const/4 v15, 0x0

    .line 165
    invoke-direct/range {v3 .. v15}, LU0/S0;-><init>(LU0/e;LU0/Y0;Ljava/util/List;IZILi1/d;Li1/t;LY0/u$b;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 166
    .line 167
    .line 168
    const/4 v6, 0x2

    .line 169
    const/4 v7, 0x0

    .line 170
    const-wide/16 v4, 0x0

    .line 171
    .line 172
    invoke-static/range {v2 .. v7}, LU0/T0;->b(LU0/T0;LU0/S0;JILjava/lang/Object;)LU0/T0;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    if-eqz v1, :cond_1

    .line 177
    .line 178
    move-object/from16 v2, p1

    .line 179
    .line 180
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_1
    const/4 v1, 0x0

    .line 185
    :goto_1
    if-eqz v1, :cond_2

    .line 186
    .line 187
    const/4 v1, 0x1

    .line 188
    goto :goto_2

    .line 189
    :cond_2
    const/4 v1, 0x0

    .line 190
    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/modifiers/b$b;->a(Ljava/util/List;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
