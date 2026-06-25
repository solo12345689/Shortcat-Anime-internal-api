.class final LF/t$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/t;->a(Lie/a;Landroidx/compose/ui/e;Landroidx/compose/foundation/lazy/layout/d;Lkotlin/jvm/functions/Function2;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/lazy/layout/d;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:Lkotlin/jvm/functions/Function2;

.field final synthetic d:LY/h2;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/lazy/layout/d;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LY/h2;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/t$a;->a:Landroidx/compose/foundation/lazy/layout/d;

    .line 2
    .line 3
    iput-object p2, p0, LF/t$a;->b:Landroidx/compose/ui/e;

    .line 4
    .line 5
    iput-object p3, p0, LF/t$a;->c:Lkotlin/jvm/functions/Function2;

    .line 6
    .line 7
    iput-object p4, p0, LF/t$a;->d:LY/h2;

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
.method public final a(Lh0/g;LY/m;I)V
    .locals 8

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:82)"

    .line 9
    .line 10
    const v2, -0x58c04be3

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p3, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object p3, p0, LF/t$a;->d:LY/h2;

    .line 17
    .line 18
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v1, LY/m;->a:LY/m$a;

    .line 23
    .line 24
    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-ne v0, v2, :cond_1

    .line 29
    .line 30
    new-instance v0, LF/o;

    .line 31
    .line 32
    new-instance v2, LF/t$a$c;

    .line 33
    .line 34
    invoke-direct {v2, p3}, LF/t$a$c;-><init>(LY/h2;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, p1, v2}, LF/o;-><init>(Lh0/g;Lie/a;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p2, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    check-cast v0, LF/o;

    .line 44
    .line 45
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    if-ne p1, p3, :cond_2

    .line 54
    .line 55
    new-instance p1, Landroidx/compose/ui/layout/C;

    .line 56
    .line 57
    new-instance p3, LF/s;

    .line 58
    .line 59
    invoke-direct {p3, v0}, LF/s;-><init>(LF/o;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p1, p3}, Landroidx/compose/ui/layout/C;-><init>(Landroidx/compose/ui/layout/D;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p2, p1}, LY/m;->u(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    move-object v2, p1

    .line 69
    check-cast v2, Landroidx/compose/ui/layout/C;

    .line 70
    .line 71
    iget-object p1, p0, LF/t$a;->a:Landroidx/compose/foundation/lazy/layout/d;

    .line 72
    .line 73
    if-eqz p1, :cond_6

    .line 74
    .line 75
    const p1, 0xc3c1857

    .line 76
    .line 77
    .line 78
    invoke-interface {p2, p1}, LY/m;->V(I)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, LF/t$a;->a:Landroidx/compose/foundation/lazy/layout/d;

    .line 82
    .line 83
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/layout/d;->d()LF/N;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const/4 p3, 0x0

    .line 88
    if-nez p1, :cond_3

    .line 89
    .line 90
    const p1, 0x650ec3

    .line 91
    .line 92
    .line 93
    invoke-interface {p2, p1}, LY/m;->V(I)V

    .line 94
    .line 95
    .line 96
    invoke-static {p2, p3}, LF/O;->a(LY/m;I)LF/N;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    :goto_0
    invoke-interface {p2}, LY/m;->O()V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    const v3, 0x650a86

    .line 105
    .line 106
    .line 107
    invoke-interface {p2, v3}, LY/m;->V(I)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :goto_1
    iget-object v3, p0, LF/t$a;->a:Landroidx/compose/foundation/lazy/layout/d;

    .line 112
    .line 113
    filled-new-array {v3, v0, v2, p1}, [Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-interface {p2, v3}, LY/m;->U(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    invoke-interface {p2, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    or-int/2addr v3, v5

    .line 126
    invoke-interface {p2, v2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    or-int/2addr v3, v5

    .line 131
    invoke-interface {p2, p1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    or-int/2addr v3, v5

    .line 136
    iget-object v5, p0, LF/t$a;->a:Landroidx/compose/foundation/lazy/layout/d;

    .line 137
    .line 138
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    if-nez v3, :cond_4

    .line 143
    .line 144
    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    if-ne v6, v3, :cond_5

    .line 149
    .line 150
    :cond_4
    new-instance v6, LF/t$a$a;

    .line 151
    .line 152
    invoke-direct {v6, v5, v0, v2, p1}, LF/t$a$a;-><init>(Landroidx/compose/foundation/lazy/layout/d;LF/o;Landroidx/compose/ui/layout/C;LF/N;)V

    .line 153
    .line 154
    .line 155
    invoke-interface {p2, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_5
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 159
    .line 160
    invoke-static {v4, v6, p2, p3}, LY/b0;->c([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LY/m;I)V

    .line 161
    .line 162
    .line 163
    invoke-interface {p2}, LY/m;->O()V

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_6
    const p1, 0xc452841

    .line 168
    .line 169
    .line 170
    invoke-interface {p2, p1}, LY/m;->V(I)V

    .line 171
    .line 172
    .line 173
    invoke-interface {p2}, LY/m;->O()V

    .line 174
    .line 175
    .line 176
    :goto_2
    iget-object p1, p0, LF/t$a;->b:Landroidx/compose/ui/e;

    .line 177
    .line 178
    iget-object p3, p0, LF/t$a;->a:Landroidx/compose/foundation/lazy/layout/d;

    .line 179
    .line 180
    invoke-static {p1, p3}, Landroidx/compose/foundation/lazy/layout/e;->b(Landroidx/compose/ui/e;Landroidx/compose/foundation/lazy/layout/d;)Landroidx/compose/ui/e;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-interface {p2, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    iget-object p3, p0, LF/t$a;->c:Lkotlin/jvm/functions/Function2;

    .line 189
    .line 190
    invoke-interface {p2, p3}, LY/m;->U(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result p3

    .line 194
    or-int/2addr p1, p3

    .line 195
    iget-object p3, p0, LF/t$a;->c:Lkotlin/jvm/functions/Function2;

    .line 196
    .line 197
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    if-nez p1, :cond_7

    .line 202
    .line 203
    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    if-ne v4, p1, :cond_8

    .line 208
    .line 209
    :cond_7
    new-instance v4, LF/t$a$b;

    .line 210
    .line 211
    invoke-direct {v4, v0, p3}, LF/t$a$b;-><init>(LF/o;Lkotlin/jvm/functions/Function2;)V

    .line 212
    .line 213
    .line 214
    invoke-interface {p2, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :cond_8
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 218
    .line 219
    sget v6, Landroidx/compose/ui/layout/C;->f:I

    .line 220
    .line 221
    const/4 v7, 0x0

    .line 222
    move-object v5, p2

    .line 223
    invoke-static/range {v2 .. v7}, Landroidx/compose/ui/layout/B;->b(Landroidx/compose/ui/layout/C;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LY/m;II)V

    .line 224
    .line 225
    .line 226
    invoke-static {}, LY/w;->L()Z

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    if-eqz p1, :cond_9

    .line 231
    .line 232
    invoke-static {}, LY/w;->T()V

    .line 233
    .line 234
    .line 235
    :cond_9
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lh0/g;

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
    invoke-virtual {p0, p1, p2, p3}, LF/t$a;->a(Lh0/g;LY/m;I)V

    .line 12
    .line 13
    .line 14
    sget-object p1, LTd/L;->a:LTd/L;

    .line 15
    .line 16
    return-object p1
.end method
