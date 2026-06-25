.class public final Landroidx/compose/animation/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/compose/animation/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/animation/e$a;,
        Landroidx/compose/animation/e$b;
    }
.end annotation


# instance fields
.field private final a:Lw/o0;

.field private b:Ll0/e;

.field private c:Li1/t;

.field private final d:LY/C0;

.field private final e:Lt/P;

.field private f:LY/h2;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lw/o0;Ll0/e;Li1/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/animation/e;->a:Lw/o0;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/animation/e;->b:Ll0/e;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/animation/e;->c:Li1/t;

    .line 9
    .line 10
    sget-object p1, Li1/r;->b:Li1/r$a;

    .line 11
    .line 12
    invoke-virtual {p1}, Li1/r$a;->a()J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    invoke-static {p1, p2}, Li1/r;->b(J)Li1/r;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 p2, 0x0

    .line 21
    const/4 p3, 0x2

    .line 22
    invoke-static {p1, p2, p3, p2}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Landroidx/compose/animation/e;->d:LY/C0;

    .line 27
    .line 28
    invoke-static {}, Lt/d0;->b()Lt/P;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Landroidx/compose/animation/e;->e:Lt/P;

    .line 33
    .line 34
    return-void
.end method

.method private static final e(LY/C0;)Z
    .locals 0

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final f(LY/C0;Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/e;->a:Lw/o0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw/o0;->m()Lw/o0$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lw/o0$b;->a()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/e;->a:Lw/o0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw/o0;->m()Lw/o0$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lw/o0$b;->b()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final d(Lv/j;LY/m;I)Landroidx/compose/ui/e;
    .locals 6

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
    const-string v1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:573)"

    .line 9
    .line 10
    const v2, 0x59699de

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p3, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-interface {p2, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x0

    .line 25
    if-nez p3, :cond_1

    .line 26
    .line 27
    sget-object p3, LY/m;->a:LY/m$a;

    .line 28
    .line 29
    invoke-virtual {p3}, LY/m$a;->a()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    if-ne v0, p3, :cond_2

    .line 34
    .line 35
    :cond_1
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 36
    .line 37
    const/4 v0, 0x2

    .line 38
    invoke-static {p3, v1, v0, v1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {p2, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    check-cast v0, LY/C0;

    .line 46
    .line 47
    invoke-virtual {p1}, Lv/j;->b()Lv/w;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const/4 p3, 0x0

    .line 52
    invoke-static {p1, p2, p3}, LY/U1;->o(Ljava/lang/Object;LY/m;I)LY/h2;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object v2, p0, Landroidx/compose/animation/e;->a:Lw/o0;

    .line 57
    .line 58
    invoke-virtual {v2}, Lw/o0;->h()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iget-object v3, p0, Landroidx/compose/animation/e;->a:Lw/o0;

    .line 63
    .line 64
    invoke-virtual {v3}, Lw/o0;->o()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_3

    .line 73
    .line 74
    invoke-static {v0, p3}, Landroidx/compose/animation/e;->f(LY/C0;Z)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    invoke-interface {p1}, LY/h2;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    if-eqz p3, :cond_4

    .line 83
    .line 84
    const/4 p3, 0x1

    .line 85
    invoke-static {v0, p3}, Landroidx/compose/animation/e;->f(LY/C0;Z)V

    .line 86
    .line 87
    .line 88
    :cond_4
    :goto_0
    invoke-static {v0}, Landroidx/compose/animation/e;->e(LY/C0;)Z

    .line 89
    .line 90
    .line 91
    move-result p3

    .line 92
    if-eqz p3, :cond_8

    .line 93
    .line 94
    const p3, 0xed801fd

    .line 95
    .line 96
    .line 97
    invoke-interface {p2, p3}, LY/m;->V(I)V

    .line 98
    .line 99
    .line 100
    iget-object v0, p0, Landroidx/compose/animation/e;->a:Lw/o0;

    .line 101
    .line 102
    sget-object p3, Li1/r;->b:Li1/r$a;

    .line 103
    .line 104
    invoke-static {p3}, Lw/u0;->e(Li1/r$a;)Lw/s0;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    const/4 v4, 0x0

    .line 109
    const/4 v5, 0x2

    .line 110
    const/4 v2, 0x0

    .line 111
    move-object v3, p2

    .line 112
    invoke-static/range {v0 .. v5}, Lw/p0;->b(Lw/o0;Lw/s0;Ljava/lang/String;LY/m;II)Lw/o0$a;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-interface {v3, p2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result p3

    .line 120
    invoke-interface {v3}, LY/m;->D()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-nez p3, :cond_5

    .line 125
    .line 126
    sget-object p3, LY/m;->a:LY/m$a;

    .line 127
    .line 128
    invoke-virtual {p3}, LY/m$a;->a()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p3

    .line 132
    if-ne v0, p3, :cond_7

    .line 133
    .line 134
    :cond_5
    invoke-interface {p1}, LY/h2;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    check-cast p3, Lv/w;

    .line 139
    .line 140
    if-eqz p3, :cond_6

    .line 141
    .line 142
    invoke-interface {p3}, Lv/w;->l()Z

    .line 143
    .line 144
    .line 145
    move-result p3

    .line 146
    if-nez p3, :cond_6

    .line 147
    .line 148
    sget-object p3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_6
    sget-object p3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 152
    .line 153
    invoke-static {p3}, Lp0/g;->b(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 154
    .line 155
    .line 156
    move-result-object p3

    .line 157
    :goto_1
    new-instance v0, Landroidx/compose/animation/e$b;

    .line 158
    .line 159
    invoke-direct {v0, p0, p2, p1}, Landroidx/compose/animation/e$b;-><init>(Landroidx/compose/animation/e;Lw/o0$a;LY/h2;)V

    .line 160
    .line 161
    .line 162
    invoke-interface {p3, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-interface {v3, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    :cond_7
    check-cast v0, Landroidx/compose/ui/e;

    .line 170
    .line 171
    invoke-interface {v3}, LY/m;->O()V

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_8
    move-object v3, p2

    .line 176
    const p1, 0xedcd5fe

    .line 177
    .line 178
    .line 179
    invoke-interface {v3, p1}, LY/m;->V(I)V

    .line 180
    .line 181
    .line 182
    invoke-interface {v3}, LY/m;->O()V

    .line 183
    .line 184
    .line 185
    iput-object v1, p0, Landroidx/compose/animation/e;->f:LY/h2;

    .line 186
    .line 187
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 188
    .line 189
    :goto_2
    invoke-static {}, LY/w;->L()Z

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    if-eqz p1, :cond_9

    .line 194
    .line 195
    invoke-static {}, LY/w;->T()V

    .line 196
    .line 197
    .line 198
    :cond_9
    return-object v0
.end method

.method public g()Ll0/e;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/e;->b:Ll0/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lt/P;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/e;->e:Lt/P;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i(LY/h2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/e;->f:LY/h2;

    .line 2
    .line 3
    return-void
.end method

.method public j(Ll0/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/e;->b:Ll0/e;

    .line 2
    .line 3
    return-void
.end method

.method public final k(Li1/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/e;->c:Li1/t;

    .line 2
    .line 3
    return-void
.end method

.method public final l(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/e;->d:LY/C0;

    .line 2
    .line 3
    invoke-static {p1, p2}, Li1/r;->b(J)Li1/r;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
