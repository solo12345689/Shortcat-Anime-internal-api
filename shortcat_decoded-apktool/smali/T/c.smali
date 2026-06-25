.class public abstract LT/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lx/G;


# instance fields
.field private final a:Z

.field private final b:F

.field private final c:LY/h2;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(ZFLY/h2;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, LT/c;->a:Z

    .line 4
    iput p2, p0, LT/c;->b:F

    .line 5
    iput-object p3, p0, LT/c;->c:LY/h2;

    return-void
.end method

.method public synthetic constructor <init>(ZFLY/h2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LT/c;-><init>(ZFLY/h2;)V

    return-void
.end method


# virtual methods
.method public final b(LB/k;LY/m;I)Lx/H;
    .locals 11

    .line 1
    const v0, 0x3aef0613

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
    const-string v2, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:196)"

    .line 15
    .line 16
    invoke-static {v0, p3, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-static {}, LT/n;->d()LY/b1;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {p2, v0}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, LT/m;

    .line 28
    .line 29
    iget-object v1, p0, LT/c;->c:LY/h2;

    .line 30
    .line 31
    invoke-interface {v1}, LY/h2;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ls0/r0;

    .line 36
    .line 37
    invoke-virtual {v1}, Ls0/r0;->A()J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    sget-object v3, Ls0/r0;->b:Ls0/r0$a;

    .line 42
    .line 43
    invoke-virtual {v3}, Ls0/r0$a;->j()J

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    cmp-long v1, v1, v3

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    const v1, -0x12182286

    .line 53
    .line 54
    .line 55
    invoke-interface {p2, v1}, LY/m;->V(I)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p2}, LY/m;->O()V

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, LT/c;->c:LY/h2;

    .line 62
    .line 63
    invoke-interface {v1}, LY/h2;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ls0/r0;

    .line 68
    .line 69
    invoke-virtual {v1}, Ls0/r0;->A()J

    .line 70
    .line 71
    .line 72
    move-result-wide v3

    .line 73
    goto :goto_0

    .line 74
    :cond_1
    const v1, -0x12175dde    # -8.999566E27f

    .line 75
    .line 76
    .line 77
    invoke-interface {p2, v1}, LY/m;->V(I)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v0, p2, v2}, LT/m;->b(LY/m;I)J

    .line 81
    .line 82
    .line 83
    move-result-wide v3

    .line 84
    invoke-interface {p2}, LY/m;->O()V

    .line 85
    .line 86
    .line 87
    :goto_0
    invoke-static {v3, v4}, Ls0/r0;->m(J)Ls0/r0;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v1, p2, v2}, LY/U1;->o(Ljava/lang/Object;LY/m;I)LY/h2;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    invoke-interface {v0, p2, v2}, LT/m;->a(LY/m;I)LT/d;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0, p2, v2}, LY/U1;->o(Ljava/lang/Object;LY/m;I)LY/h2;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    iget-boolean v5, p0, LT/c;->a:Z

    .line 104
    .line 105
    iget v6, p0, LT/c;->b:F

    .line 106
    .line 107
    and-int/lit8 v0, p3, 0xe

    .line 108
    .line 109
    shl-int/lit8 v1, p3, 0xc

    .line 110
    .line 111
    const/high16 v3, 0x70000

    .line 112
    .line 113
    and-int/2addr v1, v3

    .line 114
    or-int v10, v0, v1

    .line 115
    .line 116
    move-object v3, p0

    .line 117
    move-object v4, p1

    .line 118
    move-object v9, p2

    .line 119
    invoke-virtual/range {v3 .. v10}, LT/c;->c(LB/k;ZFLY/h2;LY/h2;LY/m;I)Landroidx/compose/material/ripple/d;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    xor-int/lit8 p2, v0, 0x6

    .line 124
    .line 125
    const/4 v0, 0x4

    .line 126
    if-le p2, v0, :cond_2

    .line 127
    .line 128
    invoke-interface {v9, v4}, LY/m;->U(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    if-nez p2, :cond_3

    .line 133
    .line 134
    :cond_2
    and-int/lit8 p2, p3, 0x6

    .line 135
    .line 136
    if-ne p2, v0, :cond_4

    .line 137
    .line 138
    :cond_3
    const/4 v2, 0x1

    .line 139
    :cond_4
    invoke-interface {v9, p1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    or-int/2addr p2, v2

    .line 144
    invoke-interface {v9}, LY/m;->D()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-nez p2, :cond_5

    .line 149
    .line 150
    sget-object p2, LY/m;->a:LY/m$a;

    .line 151
    .line 152
    invoke-virtual {p2}, LY/m$a;->a()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    if-ne v0, p2, :cond_6

    .line 157
    .line 158
    :cond_5
    new-instance v0, LT/c$a;

    .line 159
    .line 160
    const/4 p2, 0x0

    .line 161
    invoke-direct {v0, v4, p1, p2}, LT/c$a;-><init>(LB/k;Landroidx/compose/material/ripple/d;LZd/e;)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v9, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :cond_6
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 168
    .line 169
    shl-int/lit8 p2, p3, 0x3

    .line 170
    .line 171
    and-int/lit8 p2, p2, 0x70

    .line 172
    .line 173
    invoke-static {p1, v4, v0, v9, p2}, LY/b0;->d(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 174
    .line 175
    .line 176
    invoke-static {}, LY/w;->L()Z

    .line 177
    .line 178
    .line 179
    move-result p2

    .line 180
    if-eqz p2, :cond_7

    .line 181
    .line 182
    invoke-static {}, LY/w;->T()V

    .line 183
    .line 184
    .line 185
    :cond_7
    invoke-interface {v9}, LY/m;->O()V

    .line 186
    .line 187
    .line 188
    return-object p1
.end method

.method public abstract c(LB/k;ZFLY/h2;LY/h2;LY/m;I)Landroidx/compose/material/ripple/d;
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, LT/c;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    iget-boolean v1, p0, LT/c;->a:Z

    .line 12
    .line 13
    check-cast p1, LT/c;

    .line 14
    .line 15
    iget-boolean v3, p1, LT/c;->a:Z

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, LT/c;->b:F

    .line 21
    .line 22
    iget v3, p1, LT/c;->b:F

    .line 23
    .line 24
    invoke-static {v1, v3}, Li1/h;->q(FF)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object v1, p0, LT/c;->c:LY/h2;

    .line 32
    .line 33
    iget-object p1, p1, LT/c;->c:LY/h2;

    .line 34
    .line 35
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-boolean v0, p0, LT/c;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, LT/c;->b:F

    .line 10
    .line 11
    invoke-static {v1}, Li1/h;->r(F)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-object v1, p0, LT/c;->c:LY/h2;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    return v0
.end method
