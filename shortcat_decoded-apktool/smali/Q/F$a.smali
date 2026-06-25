.class public final LQ/F$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK/J;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/F;->r()LK/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ/F;


# direct methods
.method constructor <init>(LQ/F;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ/F$a;->a:LQ/F;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, LQ/F$a;->a:LQ/F;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, LQ/F;->i(LQ/F;LK/l;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LQ/F$a;->a:LQ/F;

    .line 8
    .line 9
    invoke-static {v0, v1}, LQ/F;->e(LQ/F;Lr0/f;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public b(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(J)V
    .locals 2

    .line 1
    iget-object p1, p0, LQ/F$a;->a:LQ/F;

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    invoke-virtual {p1, p2}, LQ/F;->G(Z)J

    .line 5
    .line 6
    .line 7
    move-result-wide p1

    .line 8
    invoke-static {p1, p2}, LQ/v;->a(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    iget-object v0, p0, LQ/F$a;->a:LQ/F;

    .line 13
    .line 14
    invoke-virtual {v0}, LQ/F;->L()LK/y;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, LK/y;->j()LK/Z;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v0, p1, p2}, LK/Z;->k(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    iget-object v0, p0, LQ/F$a;->a:LQ/F;

    .line 32
    .line 33
    invoke-static {v0, p1, p2}, LQ/F;->g(LQ/F;J)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, LQ/F$a;->a:LQ/F;

    .line 37
    .line 38
    invoke-static {p1, p2}, Lr0/f;->d(J)Lr0/f;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {v0, p1}, LQ/F;->e(LQ/F;Lr0/f;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, LQ/F$a;->a:LQ/F;

    .line 46
    .line 47
    sget-object p2, Lr0/f;->b:Lr0/f$a;

    .line 48
    .line 49
    invoke-virtual {p2}, Lr0/f$a;->c()J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    invoke-static {p1, v0, v1}, LQ/F;->h(LQ/F;J)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, LQ/F$a;->a:LQ/F;

    .line 57
    .line 58
    sget-object p2, LK/l;->a:LK/l;

    .line 59
    .line 60
    invoke-static {p1, p2}, LQ/F;->i(LQ/F;LK/l;)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, LQ/F$a;->a:LQ/F;

    .line 64
    .line 65
    const/4 p2, 0x0

    .line 66
    invoke-static {p1, p2}, LQ/F;->l(LQ/F;Z)V

    .line 67
    .line 68
    .line 69
    :cond_1
    :goto_0
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, LQ/F$a;->a:LQ/F;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, LQ/F;->i(LQ/F;LK/l;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LQ/F$a;->a:LQ/F;

    .line 8
    .line 9
    invoke-static {v0, v1}, LQ/F;->e(LQ/F;Lr0/f;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public e(J)V
    .locals 6

    .line 1
    iget-object v0, p0, LQ/F$a;->a:LQ/F;

    .line 2
    .line 3
    invoke-static {v0}, LQ/F;->d(LQ/F;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-static {v1, v2, p1, p2}, Lr0/f;->q(JJ)J

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    invoke-static {v0, p1, p2}, LQ/F;->h(LQ/F;J)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, LQ/F$a;->a:LQ/F;

    .line 15
    .line 16
    invoke-virtual {p1}, LQ/F;->L()LK/y;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_3

    .line 21
    .line 22
    invoke-virtual {p1}, LK/y;->j()LK/Z;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    iget-object p1, p0, LQ/F$a;->a:LQ/F;

    .line 29
    .line 30
    invoke-static {p1}, LQ/F;->c(LQ/F;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    invoke-static {p1}, LQ/F;->d(LQ/F;)J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    invoke-static {v1, v2, v3, v4}, Lr0/f;->q(JJ)J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    invoke-static {v1, v2}, Lr0/f;->d(J)Lr0/f;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-static {p1, p2}, LQ/F;->e(LQ/F;Lr0/f;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, LQ/F;->J()La1/J;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p1}, LQ/F;->A()Lr0/f;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Lr0/f;->u()J

    .line 61
    .line 62
    .line 63
    move-result-wide v1

    .line 64
    const/4 v4, 0x2

    .line 65
    const/4 v5, 0x0

    .line 66
    const/4 v3, 0x0

    .line 67
    invoke-static/range {v0 .. v5}, LK/Z;->e(LK/Z;JZILjava/lang/Object;)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-interface {p2, v0}, La1/J;->a(I)I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    invoke-static {p2, p2}, LU0/X0;->b(II)J

    .line 76
    .line 77
    .line 78
    move-result-wide v0

    .line 79
    invoke-virtual {p1}, LQ/F;->O()La1/U;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-virtual {p2}, La1/U;->k()J

    .line 84
    .line 85
    .line 86
    move-result-wide v2

    .line 87
    invoke-static {v0, v1, v2, v3}, LU0/W0;->g(JJ)Z

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    if-eqz p2, :cond_0

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_0
    invoke-virtual {p1}, LQ/F;->L()LK/y;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    if-eqz p2, :cond_1

    .line 99
    .line 100
    invoke-virtual {p2}, LK/y;->y()Z

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    if-nez p2, :cond_1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    invoke-virtual {p1}, LQ/F;->H()Lz0/a;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    if-eqz p2, :cond_2

    .line 112
    .line 113
    sget-object v2, Lz0/b;->a:Lz0/b$a;

    .line 114
    .line 115
    invoke-virtual {v2}, Lz0/b$a;->j()I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    invoke-interface {p2, v2}, Lz0/a;->a(I)V

    .line 120
    .line 121
    .line 122
    :cond_2
    :goto_0
    invoke-virtual {p1}, LQ/F;->K()Lkotlin/jvm/functions/Function1;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-virtual {p1}, LQ/F;->O()La1/U;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v2}, La1/U;->i()LU0/e;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-static {p1, v2, v0, v1}, LQ/F;->a(LQ/F;LU0/e;J)La1/U;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    :cond_3
    :goto_1
    return-void
.end method

.method public onCancel()V
    .locals 0

    .line 1
    return-void
.end method
