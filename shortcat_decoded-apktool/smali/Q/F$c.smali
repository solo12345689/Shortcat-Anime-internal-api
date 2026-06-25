.class public final LQ/F$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LQ/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/F;-><init>(LK/j0;)V
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
    iput-object p1, p0, LQ/F$c;->a:LQ/F;

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
    .locals 0

    .line 1
    return-void
.end method

.method public b(J)Z
    .locals 7

    .line 1
    iget-object v0, p0, LQ/F$c;->a:LQ/F;

    .line 2
    .line 3
    invoke-virtual {v0}, LQ/F;->E()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-object v0, p0, LQ/F$c;->a:LQ/F;

    .line 11
    .line 12
    invoke-virtual {v0}, LQ/F;->O()La1/U;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, La1/U;->l()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p0, LQ/F$c;->a:LQ/F;

    .line 28
    .line 29
    invoke-virtual {v0}, LQ/F;->L()LK/y;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0}, LK/y;->j()LK/Z;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object v0, p0, LQ/F$c;->a:LQ/F;

    .line 43
    .line 44
    invoke-virtual {v0}, LQ/F;->O()La1/U;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    sget-object v0, LQ/q;->a:LQ/q$a;

    .line 49
    .line 50
    invoke-virtual {v0}, LQ/q$a;->l()LQ/q;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    const/4 v5, 0x0

    .line 55
    move-object v1, p0

    .line 56
    move-wide v3, p1

    .line 57
    invoke-virtual/range {v1 .. v6}, LQ/F$c;->f(La1/U;JZLQ/q;)V

    .line 58
    .line 59
    .line 60
    const/4 p1, 0x1

    .line 61
    return p1

    .line 62
    :cond_2
    :goto_0
    return v1
.end method

.method public c(JLQ/q;)Z
    .locals 7

    .line 1
    iget-object v0, p0, LQ/F$c;->a:LQ/F;

    .line 2
    .line 3
    invoke-virtual {v0}, LQ/F;->E()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-object v0, p0, LQ/F$c;->a:LQ/F;

    .line 11
    .line 12
    invoke-virtual {v0}, LQ/F;->O()La1/U;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, La1/U;->l()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p0, LQ/F$c;->a:LQ/F;

    .line 28
    .line 29
    invoke-virtual {v0}, LQ/F;->L()LK/y;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0}, LK/y;->j()LK/Z;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object v0, p0, LQ/F$c;->a:LQ/F;

    .line 43
    .line 44
    invoke-virtual {v0}, LQ/F;->O()La1/U;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const/4 v5, 0x0

    .line 49
    move-object v1, p0

    .line 50
    move-wide v3, p1

    .line 51
    move-object v6, p3

    .line 52
    invoke-virtual/range {v1 .. v6}, LQ/F$c;->f(La1/U;JZLQ/q;)V

    .line 53
    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    return p1

    .line 57
    :cond_2
    :goto_0
    return v1
.end method

.method public d(JLQ/q;)Z
    .locals 7

    .line 1
    iget-object v0, p0, LQ/F$c;->a:LQ/F;

    .line 2
    .line 3
    invoke-virtual {v0}, LQ/F;->E()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    iget-object v0, p0, LQ/F$c;->a:LQ/F;

    .line 11
    .line 12
    invoke-virtual {v0}, LQ/F;->O()La1/U;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, La1/U;->l()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p0, LQ/F$c;->a:LQ/F;

    .line 28
    .line 29
    invoke-virtual {v0}, LQ/F;->L()LK/y;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    invoke-virtual {v0}, LK/y;->j()LK/Z;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object v0, p0, LQ/F$c;->a:LQ/F;

    .line 43
    .line 44
    invoke-virtual {v0}, LQ/F;->F()Landroidx/compose/ui/focus/k;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {v0}, Landroidx/compose/ui/focus/k;->f()V

    .line 51
    .line 52
    .line 53
    :cond_2
    iget-object v0, p0, LQ/F$c;->a:LQ/F;

    .line 54
    .line 55
    invoke-static {v0, p1, p2}, LQ/F;->g(LQ/F;J)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, LQ/F$c;->a:LQ/F;

    .line 59
    .line 60
    const/4 p2, -0x1

    .line 61
    invoke-static {p1, p2}, LQ/F;->k(LQ/F;I)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, LQ/F$c;->a:LQ/F;

    .line 65
    .line 66
    const/4 p2, 0x0

    .line 67
    const/4 v0, 0x1

    .line 68
    invoke-static {p1, v1, v0, p2}, LQ/F;->w(LQ/F;ZILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, LQ/F$c;->a:LQ/F;

    .line 72
    .line 73
    invoke-virtual {p1}, LQ/F;->O()La1/U;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    iget-object p1, p0, LQ/F$c;->a:LQ/F;

    .line 78
    .line 79
    invoke-static {p1}, LQ/F;->c(LQ/F;)J

    .line 80
    .line 81
    .line 82
    move-result-wide v3

    .line 83
    const/4 v5, 0x1

    .line 84
    move-object v1, p0

    .line 85
    move-object v6, p3

    .line 86
    invoke-virtual/range {v1 .. v6}, LQ/F$c;->f(La1/U;JZLQ/q;)V

    .line 87
    .line 88
    .line 89
    return v0

    .line 90
    :cond_3
    :goto_0
    return v1
.end method

.method public e(J)Z
    .locals 7

    .line 1
    iget-object v0, p0, LQ/F$c;->a:LQ/F;

    .line 2
    .line 3
    invoke-virtual {v0}, LQ/F;->L()LK/y;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    invoke-virtual {v0}, LK/y;->j()LK/Z;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p0, LQ/F$c;->a:LQ/F;

    .line 18
    .line 19
    invoke-virtual {v0}, LQ/F;->E()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    return v1

    .line 26
    :cond_1
    iget-object v0, p0, LQ/F$c;->a:LQ/F;

    .line 27
    .line 28
    const/4 v1, -0x1

    .line 29
    invoke-static {v0, v1}, LQ/F;->k(LQ/F;I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, LQ/F$c;->a:LQ/F;

    .line 33
    .line 34
    invoke-virtual {v0}, LQ/F;->O()La1/U;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    sget-object v0, LQ/q;->a:LQ/q$a;

    .line 39
    .line 40
    invoke-virtual {v0}, LQ/q$a;->l()LQ/q;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    const/4 v5, 0x0

    .line 45
    move-object v1, p0

    .line 46
    move-wide v3, p1

    .line 47
    invoke-virtual/range {v1 .. v6}, LQ/F$c;->f(La1/U;JZLQ/q;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    return p1

    .line 52
    :cond_2
    :goto_0
    return v1
.end method

.method public final f(La1/U;JZLQ/q;)V
    .locals 8

    .line 1
    iget-object v0, p0, LQ/F$c;->a:LQ/F;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v7, 0x0

    .line 5
    move-object v1, p1

    .line 6
    move-wide v2, p2

    .line 7
    move v4, p4

    .line 8
    move-object v6, p5

    .line 9
    invoke-static/range {v0 .. v7}, LQ/F;->m(LQ/F;La1/U;JZZLQ/q;Z)J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    iget-object p3, p0, LQ/F$c;->a:LQ/F;

    .line 14
    .line 15
    invoke-static {p1, p2}, LU0/W0;->h(J)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    sget-object p1, LK/m;->c:LK/m;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object p1, LK/m;->b:LK/m;

    .line 25
    .line 26
    :goto_0
    invoke-static {p3, p1}, LQ/F;->j(LQ/F;LK/m;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
