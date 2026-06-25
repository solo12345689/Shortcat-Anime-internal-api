.class final LQ/H$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/H;->a(LQ/F;Ly/i;)Lkotlin/jvm/functions/Function1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ/F;

.field final synthetic b:Ly/i;


# direct methods
.method constructor <init>(LQ/F;Ly/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ/H$a;->a:LQ/F;

    .line 2
    .line 3
    iput-object p2, p0, LQ/H$a;->b:Ly/i;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Ly/g;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LQ/H$a;->a:LQ/F;

    .line 4
    .line 5
    invoke-virtual {v1}, LQ/F;->P()La1/f0;

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, LQ/H$a;->a:LQ/F;

    .line 9
    .line 10
    invoke-virtual {v1}, LQ/F;->O()La1/U;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, La1/U;->k()J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    invoke-static {v1, v2}, LU0/W0;->h(J)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-object v2, v0, LQ/H$a;->b:Ly/i;

    .line 23
    .line 24
    sget-object v3, LK/G;->b:LK/G;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    iget-object v6, v0, LQ/H$a;->a:LQ/F;

    .line 31
    .line 32
    invoke-virtual {v6}, LQ/F;->D()Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_0

    .line 37
    .line 38
    move v10, v5

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v10, v4

    .line 41
    :goto_0
    iget-object v6, v0, LQ/H$a;->a:LQ/F;

    .line 42
    .line 43
    new-instance v8, LK/h;

    .line 44
    .line 45
    invoke-direct {v8, v3}, LK/h;-><init>(LK/G;)V

    .line 46
    .line 47
    .line 48
    new-instance v12, LQ/H$a$a;

    .line 49
    .line 50
    invoke-direct {v12, v2, v6}, LQ/H$a$a;-><init>(Ly/i;LQ/F;)V

    .line 51
    .line 52
    .line 53
    const/16 v13, 0xa

    .line 54
    .line 55
    const/4 v14, 0x0

    .line 56
    const/4 v9, 0x0

    .line 57
    const/4 v11, 0x0

    .line 58
    move-object/from16 v7, p1

    .line 59
    .line 60
    invoke-static/range {v7 .. v14}, Ly/g;->d(Ly/g;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;ZLie/o;Lie/a;ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v2, v0, LQ/H$a;->b:Ly/i;

    .line 64
    .line 65
    sget-object v3, LK/G;->c:LK/G;

    .line 66
    .line 67
    xor-int/lit8 v18, v1, 0x1

    .line 68
    .line 69
    iget-object v1, v0, LQ/H$a;->a:LQ/F;

    .line 70
    .line 71
    new-instance v6, LK/h;

    .line 72
    .line 73
    invoke-direct {v6, v3}, LK/h;-><init>(LK/G;)V

    .line 74
    .line 75
    .line 76
    new-instance v3, LQ/H$a$b;

    .line 77
    .line 78
    invoke-direct {v3, v2, v1}, LQ/H$a$b;-><init>(Ly/i;LQ/F;)V

    .line 79
    .line 80
    .line 81
    const/16 v21, 0xa

    .line 82
    .line 83
    const/16 v22, 0x0

    .line 84
    .line 85
    const/16 v17, 0x0

    .line 86
    .line 87
    const/16 v19, 0x0

    .line 88
    .line 89
    move-object/from16 v15, p1

    .line 90
    .line 91
    move-object/from16 v20, v3

    .line 92
    .line 93
    move-object/from16 v16, v6

    .line 94
    .line 95
    invoke-static/range {v15 .. v22}, Ly/g;->d(Ly/g;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;ZLie/o;Lie/a;ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object v1, v0, LQ/H$a;->b:Ly/i;

    .line 99
    .line 100
    sget-object v2, LK/G;->d:LK/G;

    .line 101
    .line 102
    iget-object v3, v0, LQ/H$a;->a:LQ/F;

    .line 103
    .line 104
    invoke-virtual {v3}, LQ/F;->D()Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_1

    .line 109
    .line 110
    iget-object v3, v0, LQ/H$a;->a:LQ/F;

    .line 111
    .line 112
    invoke-virtual {v3}, LQ/F;->y()Landroidx/compose/ui/platform/t0;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    if-eqz v3, :cond_1

    .line 117
    .line 118
    invoke-interface {v3}, Landroidx/compose/ui/platform/t0;->b()Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-ne v3, v5, :cond_1

    .line 123
    .line 124
    move/from16 v18, v5

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_1
    move/from16 v18, v4

    .line 128
    .line 129
    :goto_1
    iget-object v3, v0, LQ/H$a;->a:LQ/F;

    .line 130
    .line 131
    new-instance v6, LK/h;

    .line 132
    .line 133
    invoke-direct {v6, v2}, LK/h;-><init>(LK/G;)V

    .line 134
    .line 135
    .line 136
    new-instance v2, LQ/H$a$c;

    .line 137
    .line 138
    invoke-direct {v2, v1, v3}, LQ/H$a$c;-><init>(Ly/i;LQ/F;)V

    .line 139
    .line 140
    .line 141
    const/16 v21, 0xa

    .line 142
    .line 143
    const/16 v22, 0x0

    .line 144
    .line 145
    const/16 v17, 0x0

    .line 146
    .line 147
    const/16 v19, 0x0

    .line 148
    .line 149
    move-object/from16 v15, p1

    .line 150
    .line 151
    move-object/from16 v20, v2

    .line 152
    .line 153
    move-object/from16 v16, v6

    .line 154
    .line 155
    invoke-static/range {v15 .. v22}, Ly/g;->d(Ly/g;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;ZLie/o;Lie/a;ILjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    iget-object v1, v0, LQ/H$a;->b:Ly/i;

    .line 159
    .line 160
    sget-object v2, LK/G;->e:LK/G;

    .line 161
    .line 162
    iget-object v3, v0, LQ/H$a;->a:LQ/F;

    .line 163
    .line 164
    invoke-virtual {v3}, LQ/F;->O()La1/U;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-virtual {v3}, La1/U;->k()J

    .line 169
    .line 170
    .line 171
    move-result-wide v6

    .line 172
    invoke-static {v6, v7}, LU0/W0;->j(J)I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    iget-object v6, v0, LQ/H$a;->a:LQ/F;

    .line 177
    .line 178
    invoke-virtual {v6}, LQ/F;->O()La1/U;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    invoke-virtual {v6}, La1/U;->l()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    if-eq v3, v6, :cond_2

    .line 191
    .line 192
    move/from16 v18, v5

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_2
    move/from16 v18, v4

    .line 196
    .line 197
    :goto_2
    iget-object v3, v0, LQ/H$a;->a:LQ/F;

    .line 198
    .line 199
    new-instance v4, LK/h;

    .line 200
    .line 201
    invoke-direct {v4, v2}, LK/h;-><init>(LK/G;)V

    .line 202
    .line 203
    .line 204
    new-instance v2, LQ/H$a$d;

    .line 205
    .line 206
    invoke-direct {v2, v1, v3}, LQ/H$a$d;-><init>(Ly/i;LQ/F;)V

    .line 207
    .line 208
    .line 209
    const/16 v21, 0xa

    .line 210
    .line 211
    const/16 v22, 0x0

    .line 212
    .line 213
    const/16 v17, 0x0

    .line 214
    .line 215
    const/16 v19, 0x0

    .line 216
    .line 217
    move-object/from16 v15, p1

    .line 218
    .line 219
    move-object/from16 v20, v2

    .line 220
    .line 221
    move-object/from16 v16, v4

    .line 222
    .line 223
    invoke-static/range {v15 .. v22}, Ly/g;->d(Ly/g;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;ZLie/o;Lie/a;ILjava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ly/g;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LQ/H$a;->a(Ly/g;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
