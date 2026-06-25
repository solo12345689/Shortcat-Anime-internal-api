.class final LK/K$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/K;->a(Landroidx/compose/ui/e;LK/y;La1/U;La1/J;Ls0/h0;Z)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls0/h0;

.field final synthetic b:LK/y;

.field final synthetic c:La1/U;

.field final synthetic d:La1/J;


# direct methods
.method constructor <init>(Ls0/h0;LK/y;La1/U;La1/J;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/K$a;->a:Ls0/h0;

    .line 2
    .line 3
    iput-object p2, p0, LK/K$a;->b:LK/y;

    .line 4
    .line 5
    iput-object p3, p0, LK/K$a;->c:La1/U;

    .line 6
    .line 7
    iput-object p4, p0, LK/K$a;->d:La1/J;

    .line 8
    .line 9
    const/4 p1, 0x3

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LY/m;I)Landroidx/compose/ui/e;
    .locals 8

    .line 1
    const v0, -0x5097aed    # -6.4000205E35f

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, LY/m;->V(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, LY/w;->L()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    const-string v2, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)"

    .line 15
    .line 16
    invoke-static {v0, p3, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    sget-object v0, LY/m;->a:LY/m$a;

    .line 24
    .line 25
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-ne p3, v1, :cond_1

    .line 30
    .line 31
    new-instance p3, LN/o;

    .line 32
    .line 33
    invoke-direct {p3}, LN/o;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-interface {p2, p3}, LY/m;->u(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    move-object v2, p3

    .line 40
    check-cast v2, LN/o;

    .line 41
    .line 42
    iget-object p3, p0, LK/K$a;->a:Ls0/h0;

    .line 43
    .line 44
    instance-of v1, p3, Ls0/F1;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    check-cast p3, Ls0/F1;

    .line 50
    .line 51
    invoke-virtual {p3}, Ls0/F1;->a()J

    .line 52
    .line 53
    .line 54
    move-result-wide v4

    .line 55
    const-wide/16 v6, 0x10

    .line 56
    .line 57
    cmp-long p3, v4, v6

    .line 58
    .line 59
    if-nez p3, :cond_2

    .line 60
    .line 61
    move p3, v3

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    const/4 p3, 0x1

    .line 64
    :goto_0
    invoke-static {}, Landroidx/compose/ui/platform/w0;->s()LY/b1;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-interface {p2, v1}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Landroidx/compose/ui/platform/F1;

    .line 73
    .line 74
    invoke-interface {v1}, Landroidx/compose/ui/platform/F1;->a()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_7

    .line 79
    .line 80
    iget-object v1, p0, LK/K$a;->b:LK/y;

    .line 81
    .line 82
    invoke-virtual {v1}, LK/y;->e()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_7

    .line 87
    .line 88
    iget-object v1, p0, LK/K$a;->c:La1/U;

    .line 89
    .line 90
    invoke-virtual {v1}, La1/U;->k()J

    .line 91
    .line 92
    .line 93
    move-result-wide v4

    .line 94
    invoke-static {v4, v5}, LU0/W0;->h(J)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_7

    .line 99
    .line 100
    if-eqz p3, :cond_7

    .line 101
    .line 102
    const p3, 0x302dfc9d

    .line 103
    .line 104
    .line 105
    invoke-interface {p2, p3}, LY/m;->V(I)V

    .line 106
    .line 107
    .line 108
    iget-object p3, p0, LK/K$a;->c:La1/U;

    .line 109
    .line 110
    invoke-virtual {p3}, La1/U;->i()LU0/e;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    iget-object v1, p0, LK/K$a;->c:La1/U;

    .line 115
    .line 116
    invoke-virtual {v1}, La1/U;->k()J

    .line 117
    .line 118
    .line 119
    move-result-wide v4

    .line 120
    invoke-static {v4, v5}, LU0/W0;->b(J)LU0/W0;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-interface {p2, v2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    if-nez v4, :cond_3

    .line 133
    .line 134
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    if-ne v5, v4, :cond_4

    .line 139
    .line 140
    :cond_3
    new-instance v5, LK/K$a$a;

    .line 141
    .line 142
    const/4 v4, 0x0

    .line 143
    invoke-direct {v5, v2, v4}, LK/K$a$a;-><init>(LN/o;LZd/e;)V

    .line 144
    .line 145
    .line 146
    invoke-interface {p2, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :cond_4
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 150
    .line 151
    invoke-static {p3, v1, v5, p2, v3}, LY/b0;->d(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 152
    .line 153
    .line 154
    invoke-interface {p2, v2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result p3

    .line 158
    iget-object v1, p0, LK/K$a;->d:La1/J;

    .line 159
    .line 160
    invoke-interface {p2, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    or-int/2addr p3, v1

    .line 165
    iget-object v1, p0, LK/K$a;->c:La1/U;

    .line 166
    .line 167
    invoke-interface {p2, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    or-int/2addr p3, v1

    .line 172
    iget-object v1, p0, LK/K$a;->b:LK/y;

    .line 173
    .line 174
    invoke-interface {p2, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    or-int/2addr p3, v1

    .line 179
    iget-object v1, p0, LK/K$a;->a:Ls0/h0;

    .line 180
    .line 181
    invoke-interface {p2, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    or-int/2addr p3, v1

    .line 186
    iget-object v3, p0, LK/K$a;->d:La1/J;

    .line 187
    .line 188
    iget-object v4, p0, LK/K$a;->c:La1/U;

    .line 189
    .line 190
    iget-object v5, p0, LK/K$a;->b:LK/y;

    .line 191
    .line 192
    iget-object v6, p0, LK/K$a;->a:Ls0/h0;

    .line 193
    .line 194
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    if-nez p3, :cond_5

    .line 199
    .line 200
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p3

    .line 204
    if-ne v1, p3, :cond_6

    .line 205
    .line 206
    :cond_5
    new-instance v1, LK/K$a$b;

    .line 207
    .line 208
    invoke-direct/range {v1 .. v6}, LK/K$a$b;-><init>(LN/o;La1/J;La1/U;LK/y;Ls0/h0;)V

    .line 209
    .line 210
    .line 211
    invoke-interface {p2, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    :cond_6
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 215
    .line 216
    invoke-static {p1, v1}, Landroidx/compose/ui/draw/b;->d(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-interface {p2}, LY/m;->O()V

    .line 221
    .line 222
    .line 223
    goto :goto_1

    .line 224
    :cond_7
    const p1, 0x3040856e

    .line 225
    .line 226
    .line 227
    invoke-interface {p2, p1}, LY/m;->V(I)V

    .line 228
    .line 229
    .line 230
    invoke-interface {p2}, LY/m;->O()V

    .line 231
    .line 232
    .line 233
    sget-object p1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 234
    .line 235
    :goto_1
    invoke-static {}, LY/w;->L()Z

    .line 236
    .line 237
    .line 238
    move-result p3

    .line 239
    if-eqz p3, :cond_8

    .line 240
    .line 241
    invoke-static {}, LY/w;->T()V

    .line 242
    .line 243
    .line 244
    :cond_8
    invoke-interface {p2}, LY/m;->O()V

    .line 245
    .line 246
    .line 247
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/e;

    .line 2
    .line 3
    check-cast p2, LY/m;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    invoke-virtual {p0, p1, p2, p3}, LK/K$a;->a(Landroidx/compose/ui/e;LY/m;I)Landroidx/compose/ui/e;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
