.class final LK/T$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/T;->a(Landroidx/compose/ui/e;LB/m;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/functions/Function1;

.field final synthetic b:LB/m;


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function1;LB/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/T$a;->a:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    iput-object p2, p0, LK/T$a;->b:LB/m;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LY/m;I)Landroidx/compose/ui/e;
    .locals 7

    .line 1
    const p1, -0x620472b

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
    const-string v1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)"

    .line 15
    .line 16
    invoke-static {p1, p3, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    sget-object p3, LY/m;->a:LY/m$a;

    .line 24
    .line 25
    invoke-virtual {p3}, LY/m$a;->a()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-ne p1, v0, :cond_1

    .line 30
    .line 31
    sget-object p1, LZd/j;->a:LZd/j;

    .line 32
    .line 33
    invoke-static {p1, p2}, LY/b0;->i(LZd/i;LY/m;)LGf/O;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v0, LY/L;

    .line 38
    .line 39
    invoke-direct {v0, p1}, LY/L;-><init>(LGf/O;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p2, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object p1, v0

    .line 46
    :cond_1
    check-cast p1, LY/L;

    .line 47
    .line 48
    invoke-virtual {p1}, LY/L;->a()LGf/O;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p3}, LY/m$a;->a()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-ne p1, v0, :cond_2

    .line 61
    .line 62
    const/4 p1, 0x2

    .line 63
    const/4 v0, 0x0

    .line 64
    invoke-static {v0, v0, p1, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-interface {p2, p1}, LY/m;->u(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    move-object v2, p1

    .line 72
    check-cast v2, LY/C0;

    .line 73
    .line 74
    iget-object p1, p0, LK/T$a;->a:Lkotlin/jvm/functions/Function1;

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    invoke-static {p1, p2, v0}, LY/U1;->o(Ljava/lang/Object;LY/m;I)LY/h2;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    iget-object p1, p0, LK/T$a;->b:LB/m;

    .line 82
    .line 83
    invoke-interface {p2, p1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    iget-object v5, p0, LK/T$a;->b:LB/m;

    .line 88
    .line 89
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    if-nez v3, :cond_3

    .line 94
    .line 95
    invoke-virtual {p3}, LY/m$a;->a()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    if-ne v6, v3, :cond_4

    .line 100
    .line 101
    :cond_3
    new-instance v6, LK/T$a$a;

    .line 102
    .line 103
    invoke-direct {v6, v2, v5}, LK/T$a$a;-><init>(LY/C0;LB/m;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {p2, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_4
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 110
    .line 111
    invoke-static {p1, v6, p2, v0}, LY/b0;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LY/m;I)V

    .line 112
    .line 113
    .line 114
    sget-object p1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 115
    .line 116
    iget-object v6, p0, LK/T$a;->b:LB/m;

    .line 117
    .line 118
    invoke-interface {p2, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    iget-object v3, p0, LK/T$a;->b:LB/m;

    .line 123
    .line 124
    invoke-interface {p2, v3}, LY/m;->U(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    or-int/2addr v0, v3

    .line 129
    invoke-interface {p2, v4}, LY/m;->U(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    or-int/2addr v0, v3

    .line 134
    iget-object v3, p0, LK/T$a;->b:LB/m;

    .line 135
    .line 136
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    if-nez v0, :cond_5

    .line 141
    .line 142
    invoke-virtual {p3}, LY/m$a;->a()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p3

    .line 146
    if-ne v5, p3, :cond_6

    .line 147
    .line 148
    :cond_5
    new-instance v0, LK/T$a$b;

    .line 149
    .line 150
    const/4 v5, 0x0

    .line 151
    invoke-direct/range {v0 .. v5}, LK/T$a$b;-><init>(LGf/O;LY/C0;LB/m;LY/h2;LZd/e;)V

    .line 152
    .line 153
    .line 154
    invoke-interface {p2, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    move-object v5, v0

    .line 158
    :cond_6
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 159
    .line 160
    invoke-static {p1, v6, v5}, LE0/V;->d(Landroidx/compose/ui/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/e;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-static {}, LY/w;->L()Z

    .line 165
    .line 166
    .line 167
    move-result p3

    .line 168
    if-eqz p3, :cond_7

    .line 169
    .line 170
    invoke-static {}, LY/w;->T()V

    .line 171
    .line 172
    .line 173
    :cond_7
    invoke-interface {p2}, LY/m;->O()V

    .line 174
    .line 175
    .line 176
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
    invoke-virtual {p0, p1, p2, p3}, LK/T$a;->a(Landroidx/compose/ui/e;LY/m;I)Landroidx/compose/ui/e;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
