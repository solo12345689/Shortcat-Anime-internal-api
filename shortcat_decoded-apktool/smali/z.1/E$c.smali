.class final Lz/E$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/E;->h(Lkotlin/jvm/functions/Function1;Lie/a;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz/E;

.field final synthetic b:F

.field final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method constructor <init>(Lz/E;FLkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz/E$c;->a:Lz/E;

    .line 2
    .line 3
    iput p2, p0, Lz/E$c;->b:F

    .line 4
    .line 5
    iput-object p3, p0, Lz/E$c;->c:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 8

    .line 1
    iget-object v0, p0, Lz/E$c;->a:Lz/E;

    .line 2
    .line 3
    invoke-static {v0}, Lz/E;->b(Lz/E;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/high16 v2, -0x8000000000000000L

    .line 8
    .line 9
    cmp-long v0, v0, v2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lz/E$c;->a:Lz/E;

    .line 14
    .line 15
    invoke-static {v0, p1, p2}, Lz/E;->f(Lz/E;J)V

    .line 16
    .line 17
    .line 18
    :cond_0
    new-instance v4, Lw/m;

    .line 19
    .line 20
    iget-object v0, p0, Lz/E$c;->a:Lz/E;

    .line 21
    .line 22
    invoke-virtual {v0}, Lz/E;->i()F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-direct {v4, v0}, Lw/m;-><init>(F)V

    .line 27
    .line 28
    .line 29
    iget v0, p0, Lz/E$c;->b:F

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    cmpg-float v0, v0, v1

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lz/E$c;->a:Lz/E;

    .line 37
    .line 38
    invoke-static {v0}, Lz/E;->d(Lz/E;)Lw/v0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, Lw/m;

    .line 43
    .line 44
    iget-object v2, p0, Lz/E$c;->a:Lz/E;

    .line 45
    .line 46
    invoke-virtual {v2}, Lz/E;->i()F

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-direct {v1, v2}, Lw/m;-><init>(F)V

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lz/E;->a()Lz/E$a;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2}, Lz/E$a;->a()Lw/m;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iget-object v3, p0, Lz/E$c;->a:Lz/E;

    .line 62
    .line 63
    invoke-static {v3}, Lz/E;->c(Lz/E;)Lw/m;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-interface {v0, v1, v2, v3}, Lw/v0;->b(Lw/q;Lw/q;Lw/q;)J

    .line 68
    .line 69
    .line 70
    move-result-wide v0

    .line 71
    :goto_0
    move-wide v2, v0

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    iget-object v0, p0, Lz/E$c;->a:Lz/E;

    .line 74
    .line 75
    invoke-static {v0}, Lz/E;->b(Lz/E;)J

    .line 76
    .line 77
    .line 78
    move-result-wide v0

    .line 79
    sub-long v0, p1, v0

    .line 80
    .line 81
    long-to-float v0, v0

    .line 82
    iget v1, p0, Lz/E$c;->b:F

    .line 83
    .line 84
    div-float/2addr v0, v1

    .line 85
    invoke-static {v0}, Lke/a;->f(F)J

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    goto :goto_0

    .line 90
    :goto_1
    iget-object v0, p0, Lz/E$c;->a:Lz/E;

    .line 91
    .line 92
    invoke-static {v0}, Lz/E;->d(Lz/E;)Lw/v0;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {}, Lz/E;->a()Lz/E$a;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Lz/E$a;->a()Lw/m;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    iget-object v0, p0, Lz/E$c;->a:Lz/E;

    .line 105
    .line 106
    invoke-static {v0}, Lz/E;->c(Lz/E;)Lw/m;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-interface/range {v1 .. v6}, Lw/v0;->d(JLw/q;Lw/q;Lw/q;)Lw/q;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, Lw/m;

    .line 115
    .line 116
    invoke-virtual {v0}, Lw/m;->f()F

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    iget-object v7, p0, Lz/E$c;->a:Lz/E;

    .line 121
    .line 122
    invoke-static {v7}, Lz/E;->d(Lz/E;)Lw/v0;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-static {}, Lz/E;->a()Lz/E$a;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-virtual {v5}, Lz/E$a;->a()Lw/m;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    iget-object v6, p0, Lz/E$c;->a:Lz/E;

    .line 135
    .line 136
    invoke-static {v6}, Lz/E;->c(Lz/E;)Lw/m;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    invoke-interface/range {v1 .. v6}, Lw/v0;->e(JLw/q;Lw/q;Lw/q;)Lw/q;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    check-cast v1, Lw/m;

    .line 145
    .line 146
    invoke-static {v7, v1}, Lz/E;->g(Lz/E;Lw/m;)V

    .line 147
    .line 148
    .line 149
    iget-object v1, p0, Lz/E$c;->a:Lz/E;

    .line 150
    .line 151
    invoke-static {v1, p1, p2}, Lz/E;->f(Lz/E;J)V

    .line 152
    .line 153
    .line 154
    iget-object p1, p0, Lz/E$c;->a:Lz/E;

    .line 155
    .line 156
    invoke-virtual {p1}, Lz/E;->i()F

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    sub-float/2addr p1, v0

    .line 161
    iget-object p2, p0, Lz/E$c;->a:Lz/E;

    .line 162
    .line 163
    invoke-virtual {p2, v0}, Lz/E;->j(F)V

    .line 164
    .line 165
    .line 166
    iget-object p2, p0, Lz/E$c;->c:Lkotlin/jvm/functions/Function1;

    .line 167
    .line 168
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p0, v0, v1}, Lz/E$c;->a(J)V

    .line 8
    .line 9
    .line 10
    sget-object p1, LTd/L;->a:LTd/L;

    .line 11
    .line 12
    return-object p1
.end method
