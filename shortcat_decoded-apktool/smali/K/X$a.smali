.class final LK/X$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/X;->a(Landroidx/compose/ui/e;LU0/Y0;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LU0/Y0;


# direct methods
.method constructor <init>(LU0/Y0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/X$a;->a:LU0/Y0;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private static final b(LY/h2;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LY/m;I)Landroidx/compose/ui/e;
    .locals 7

    .line 1
    const p1, 0x5e56a525

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, p1}, LY/m;->V(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, LY/w;->L()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, -0x1

    .line 14
    const-string v1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:37)"

    .line 15
    .line 16
    invoke-static {p1, p3, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/w0;->e()LY/b1;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {p2, p1}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    move-object v2, p1

    .line 28
    check-cast v2, Li1/d;

    .line 29
    .line 30
    invoke-static {}, Landroidx/compose/ui/platform/w0;->g()LY/b1;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-interface {p2, p1}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    move-object v3, p1

    .line 39
    check-cast v3, LY0/u$b;

    .line 40
    .line 41
    invoke-static {}, Landroidx/compose/ui/platform/w0;->k()LY/b1;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-interface {p2, p1}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    move-object v1, p1

    .line 50
    check-cast v1, Li1/t;

    .line 51
    .line 52
    iget-object p1, p0, LK/X$a;->a:LU0/Y0;

    .line 53
    .line 54
    invoke-interface {p2, p1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    invoke-interface {p2, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p3

    .line 62
    or-int/2addr p1, p3

    .line 63
    iget-object p3, p0, LK/X$a;->a:LU0/Y0;

    .line 64
    .line 65
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-nez p1, :cond_1

    .line 70
    .line 71
    sget-object p1, LY/m;->a:LY/m$a;

    .line 72
    .line 73
    invoke-virtual {p1}, LY/m$a;->a()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-ne v0, p1, :cond_2

    .line 78
    .line 79
    :cond_1
    invoke-static {p3, v1}, LU0/Z0;->d(LU0/Y0;Li1/t;)LU0/Y0;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-interface {p2, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_2
    move-object p1, v0

    .line 87
    check-cast p1, LU0/Y0;

    .line 88
    .line 89
    invoke-interface {p2, v3}, LY/m;->U(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    invoke-interface {p2, p1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    or-int/2addr p3, v0

    .line 98
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-nez p3, :cond_3

    .line 103
    .line 104
    sget-object p3, LY/m;->a:LY/m$a;

    .line 105
    .line 106
    invoke-virtual {p3}, LY/m$a;->a()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    if-ne v0, p3, :cond_7

    .line 111
    .line 112
    :cond_3
    invoke-virtual {p1}, LU0/Y0;->l()LY0/u;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    invoke-virtual {p1}, LU0/Y0;->q()LY0/L;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    if-nez v0, :cond_4

    .line 121
    .line 122
    sget-object v0, LY0/L;->b:LY0/L$a;

    .line 123
    .line 124
    invoke-virtual {v0}, LY0/L$a;->g()LY0/L;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    :cond_4
    invoke-virtual {p1}, LU0/Y0;->o()LY0/H;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    if-eqz v4, :cond_5

    .line 133
    .line 134
    invoke-virtual {v4}, LY0/H;->i()I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    goto :goto_0

    .line 139
    :cond_5
    sget-object v4, LY0/H;->b:LY0/H$a;

    .line 140
    .line 141
    invoke-virtual {v4}, LY0/H$a;->b()I

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    :goto_0
    invoke-virtual {p1}, LU0/Y0;->p()LY0/I;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    if-eqz v5, :cond_6

    .line 150
    .line 151
    invoke-virtual {v5}, LY0/I;->m()I

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    goto :goto_1

    .line 156
    :cond_6
    sget-object v5, LY0/I;->b:LY0/I$a;

    .line 157
    .line 158
    invoke-virtual {v5}, LY0/I$a;->a()I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    :goto_1
    invoke-interface {v3, p3, v0, v4, v5}, LY0/u$b;->b(LY0/u;LY0/L;II)LY/h2;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-interface {p2, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    :cond_7
    move-object p3, v0

    .line 170
    check-cast p3, LY/h2;

    .line 171
    .line 172
    iget-object v4, p0, LK/X$a;->a:LU0/Y0;

    .line 173
    .line 174
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    sget-object v6, LY/m;->a:LY/m$a;

    .line 179
    .line 180
    invoke-virtual {v6}, LY/m$a;->a()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    if-ne v0, v5, :cond_8

    .line 185
    .line 186
    new-instance v0, LK/W;

    .line 187
    .line 188
    invoke-static {p3}, LK/X$a;->b(LY/h2;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    invoke-direct/range {v0 .. v5}, LK/W;-><init>(Li1/t;Li1/d;LY0/u$b;LU0/Y0;Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    invoke-interface {p2, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_8
    check-cast v0, LK/W;

    .line 199
    .line 200
    invoke-static {p3}, LK/X$a;->b(LY/h2;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    move-object v4, p1

    .line 205
    invoke-virtual/range {v0 .. v5}, LK/W;->c(Li1/t;Li1/d;LY0/u$b;LU0/Y0;Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    sget-object p1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 209
    .line 210
    invoke-interface {p2, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result p3

    .line 214
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    if-nez p3, :cond_9

    .line 219
    .line 220
    invoke-virtual {v6}, LY/m$a;->a()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p3

    .line 224
    if-ne v1, p3, :cond_a

    .line 225
    .line 226
    :cond_9
    new-instance v1, LK/X$a$a;

    .line 227
    .line 228
    invoke-direct {v1, v0}, LK/X$a$a;-><init>(LK/W;)V

    .line 229
    .line 230
    .line 231
    invoke-interface {p2, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    :cond_a
    check-cast v1, Lie/o;

    .line 235
    .line 236
    invoke-static {p1, v1}, Landroidx/compose/ui/layout/i;->a(Landroidx/compose/ui/e;Lie/o;)Landroidx/compose/ui/e;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-static {}, LY/w;->L()Z

    .line 241
    .line 242
    .line 243
    move-result p3

    .line 244
    if-eqz p3, :cond_b

    .line 245
    .line 246
    invoke-static {}, LY/w;->T()V

    .line 247
    .line 248
    .line 249
    :cond_b
    invoke-interface {p2}, LY/m;->O()V

    .line 250
    .line 251
    .line 252
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
    invoke-virtual {p0, p1, p2, p3}, LK/X$a;->a(Landroidx/compose/ui/e;LY/m;I)Landroidx/compose/ui/e;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
