.class public final Landroidx/compose/ui/focus/FocusOwnerImpl;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lq0/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/FocusOwnerImpl$a;
    }
.end annotation


# instance fields
.field private final a:Lq0/q;

.field private final b:LK0/p0;

.field private c:Landroidx/compose/ui/focus/FocusTargetNode;

.field private final d:Lq0/f;

.field private final e:Landroidx/compose/ui/e;

.field private f:Lt/J;

.field private final g:Lt/L;

.field private h:Landroidx/compose/ui/focus/FocusTargetNode;

.field private i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lq0/q;LK0/p0;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Lq0/q;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->b:LK0/p0;

    .line 7
    .line 8
    new-instance v0, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 9
    .line 10
    sget-object p1, Landroidx/compose/ui/focus/s;->a:Landroidx/compose/ui/focus/s$a;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroidx/compose/ui/focus/s$a;->b()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v4, 0x6

    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/focus/FocusTargetNode;-><init>(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->c:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 24
    .line 25
    new-instance p1, Lq0/f;

    .line 26
    .line 27
    invoke-direct {p1, p0, p2}, Lq0/f;-><init>(Lq0/j;LK0/p0;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->d:Lq0/f;

    .line 31
    .line 32
    new-instance p1, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;

    .line 33
    .line 34
    invoke-direct {p1, p0}, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;-><init>(Landroidx/compose/ui/focus/FocusOwnerImpl;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->e:Landroidx/compose/ui/e;

    .line 38
    .line 39
    new-instance p1, Lt/L;

    .line 40
    .line 41
    const/4 p2, 0x1

    .line 42
    invoke-direct {p1, p2}, Lt/L;-><init>(I)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->g:Lt/L;

    .line 46
    .line 47
    return-void
.end method

.method private final C(Landroid/view/KeyEvent;)Z
    .locals 5

    .line 1
    invoke-static {p1}, LC0/d;->a(Landroid/view/KeyEvent;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {p1}, LC0/d;->b(Landroid/view/KeyEvent;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    sget-object v2, LC0/c;->a:LC0/c$a;

    .line 10
    .line 11
    invoke-virtual {v2}, LC0/c$a;->a()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-static {p1, v3}, LC0/c;->e(II)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v4, 0x1

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->f:Lt/J;

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    new-instance p1, Lt/J;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {p1, v2}, Lt/J;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->f:Lt/J;

    .line 33
    .line 34
    :cond_0
    invoke-virtual {p1, v0, v1}, Lt/J;->l(J)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {v2}, LC0/c$a;->b()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-static {p1, v2}, LC0/c;->e(II)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->f:Lt/J;

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1, v0, v1}, Lt/v;->a(J)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-ne p1, v4, :cond_2

    .line 57
    .line 58
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->f:Lt/J;

    .line 59
    .line 60
    if-eqz p1, :cond_3

    .line 61
    .line 62
    invoke-virtual {p1, v0, v1}, Lt/J;->m(J)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    const/4 p1, 0x0

    .line 67
    return p1

    .line 68
    :cond_3
    :goto_0
    return v4
.end method

.method private final w(ZZ)Z
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->j()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->o()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    return v2

    .line 19
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->j()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->s(Landroidx/compose/ui/focus/FocusTargetNode;)V

    .line 25
    .line 26
    .line 27
    if-eqz p2, :cond_e

    .line 28
    .line 29
    if-eqz p1, :cond_e

    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->o()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    sget-object p2, Lq0/o;->c:Lq0/o;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    sget-object p2, Lq0/o;->a:Lq0/o;

    .line 41
    .line 42
    :goto_0
    sget-object v3, Lq0/o;->d:Lq0/o;

    .line 43
    .line 44
    invoke-virtual {p1, p2, v3}, Landroidx/compose/ui/focus/FocusTargetNode;->I1(Lq0/n;Lq0/n;)V

    .line 45
    .line 46
    .line 47
    const/16 p2, 0x400

    .line 48
    .line 49
    invoke-static {p2}, LK0/g0;->a(I)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    invoke-interface {p1}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_3

    .line 62
    .line 63
    const-string v3, "visitAncestors called on an unattached node"

    .line 64
    .line 65
    invoke-static {v3}, LH0/a;->b(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    invoke-interface {p1}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-static {p1}, LK0/k;->n(LK0/j;)LK0/J;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    :goto_1
    if-eqz p1, :cond_e

    .line 81
    .line 82
    invoke-virtual {p1}, LK0/J;->t0()LK0/c0;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-virtual {v4}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    and-int/2addr v4, p2

    .line 95
    if-eqz v4, :cond_c

    .line 96
    .line 97
    :goto_2
    if-eqz v3, :cond_c

    .line 98
    .line 99
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    and-int/2addr v4, p2

    .line 104
    if-eqz v4, :cond_b

    .line 105
    .line 106
    move-object v5, v0

    .line 107
    move-object v4, v3

    .line 108
    :goto_3
    if-eqz v4, :cond_b

    .line 109
    .line 110
    instance-of v6, v4, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 111
    .line 112
    if-eqz v6, :cond_4

    .line 113
    .line 114
    check-cast v4, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 115
    .line 116
    sget-object v6, Lq0/o;->b:Lq0/o;

    .line 117
    .line 118
    sget-object v7, Lq0/o;->d:Lq0/o;

    .line 119
    .line 120
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/focus/FocusTargetNode;->I1(Lq0/n;Lq0/n;)V

    .line 121
    .line 122
    .line 123
    goto :goto_6

    .line 124
    :cond_4
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    and-int/2addr v6, p2

    .line 129
    if-eqz v6, :cond_a

    .line 130
    .line 131
    instance-of v6, v4, LK0/m;

    .line 132
    .line 133
    if-eqz v6, :cond_a

    .line 134
    .line 135
    move-object v6, v4

    .line 136
    check-cast v6, LK0/m;

    .line 137
    .line 138
    invoke-virtual {v6}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    move v7, v2

    .line 143
    :goto_4
    if-eqz v6, :cond_9

    .line 144
    .line 145
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    and-int/2addr v8, p2

    .line 150
    if-eqz v8, :cond_8

    .line 151
    .line 152
    add-int/lit8 v7, v7, 0x1

    .line 153
    .line 154
    if-ne v7, v1, :cond_5

    .line 155
    .line 156
    move-object v4, v6

    .line 157
    goto :goto_5

    .line 158
    :cond_5
    if-nez v5, :cond_6

    .line 159
    .line 160
    new-instance v5, La0/c;

    .line 161
    .line 162
    const/16 v8, 0x10

    .line 163
    .line 164
    new-array v8, v8, [Landroidx/compose/ui/e$c;

    .line 165
    .line 166
    invoke-direct {v5, v8, v2}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 167
    .line 168
    .line 169
    :cond_6
    if-eqz v4, :cond_7

    .line 170
    .line 171
    invoke-virtual {v5, v4}, La0/c;->c(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-object v4, v0

    .line 175
    :cond_7
    invoke-virtual {v5, v6}, La0/c;->c(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    :cond_8
    :goto_5
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    goto :goto_4

    .line 183
    :cond_9
    if-ne v7, v1, :cond_a

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_a
    :goto_6
    invoke-static {v5}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    goto :goto_3

    .line 191
    :cond_b
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    goto :goto_2

    .line 196
    :cond_c
    invoke-virtual {p1}, LK0/J;->A0()LK0/J;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    if-eqz p1, :cond_d

    .line 201
    .line 202
    invoke-virtual {p1}, LK0/J;->t0()LK0/c0;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    if-eqz v3, :cond_d

    .line 207
    .line 208
    invoke-virtual {v3}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    goto/16 :goto_1

    .line 213
    .line 214
    :cond_d
    move-object v3, v0

    .line 215
    goto/16 :goto_1

    .line 216
    .line 217
    :cond_e
    return v1
.end method

.method private final x()Landroidx/compose/ui/focus/FocusTargetNode;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->c:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/focus/r;->b(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private final z(LK0/j;)Landroidx/compose/ui/e$c;
    .locals 5

    .line 1
    const/16 v0, 0x400

    .line 2
    .line 3
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v2, 0x2000

    .line 8
    .line 9
    invoke-static {v2}, LK0/g0;->a(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    or-int/2addr v1, v2

    .line 14
    invoke-interface {p1}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    const-string v2, "visitLocalDescendants called on an unattached node"

    .line 25
    .line 26
    invoke-static {v2}, LH0/a;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-interface {p1}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    and-int/2addr v2, v1

    .line 38
    const/4 v3, 0x0

    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :goto_0
    if-eqz p1, :cond_3

    .line 46
    .line 47
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    and-int/2addr v2, v1

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    and-int/2addr v2, v4

    .line 63
    if-eqz v2, :cond_1

    .line 64
    .line 65
    return-object v3

    .line 66
    :cond_1
    move-object v3, p1

    .line 67
    :cond_2
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    goto :goto_0

    .line 72
    :cond_3
    return-object v3
.end method


# virtual methods
.method public A(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->j()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 13
    :goto_1
    if-nez v0, :cond_2

    .line 14
    .line 15
    const-string v0, "Cannot capture focus when the active focus target node is unset"

    .line 16
    .line 17
    invoke-static {v0}, LH0/a;->a(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_2
    iput-boolean p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->i:Z

    .line 21
    .line 22
    return-void
.end method

.method public B(ILr0/h;)Z
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/ui/focus/FocusOwnerImpl$d;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl$d;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, v0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->e(ILr0/h;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Lq0/q;

    .line 2
    .line 3
    invoke-interface {v0}, Lq0/q;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Landroidx/compose/ui/focus/d;Lr0/h;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Lq0/q;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lq0/q;->b(Landroidx/compose/ui/focus/d;Lr0/h;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public d(Landroid/view/KeyEvent;Lie/a;)Z
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "FocusOwnerImpl:dispatchKeyEvent"

    .line 6
    .line 7
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget-object v2, v1, Landroidx/compose/ui/focus/FocusOwnerImpl;->d:Lq0/f;

    .line 11
    .line 12
    invoke-virtual {v2}, Lq0/f;->b()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    const-string v0, "FocusRelatedWarning: Dispatching key event while focus system is invalidated."

    .line 20
    .line 21
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 22
    .line 23
    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 27
    .line 28
    .line 29
    return v3

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto/16 :goto_1c

    .line 32
    .line 33
    :cond_0
    :try_start_1
    invoke-direct/range {p0 .. p1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->C(Landroid/view/KeyEvent;)Z

    .line 34
    .line 35
    .line 36
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 40
    .line 41
    .line 42
    return v3

    .line 43
    :cond_1
    :try_start_2
    invoke-direct {v1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->x()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 44
    .line 45
    .line 46
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    const-string v4, "visitAncestors called on an unattached node"

    .line 48
    .line 49
    const/16 v5, 0x2000

    .line 50
    .line 51
    const/16 v6, 0x10

    .line 52
    .line 53
    const/4 v7, 0x0

    .line 54
    const/4 v8, 0x1

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    :try_start_3
    invoke-direct {v1, v2}, Landroidx/compose/ui/focus/FocusOwnerImpl;->z(LK0/j;)Landroidx/compose/ui/e$c;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    if-nez v9, :cond_1d

    .line 62
    .line 63
    :cond_2
    if-eqz v2, :cond_f

    .line 64
    .line 65
    invoke-static {v5}, LK0/g0;->a(I)I

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    invoke-interface {v2}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 74
    .line 75
    .line 76
    move-result v10

    .line 77
    if-nez v10, :cond_3

    .line 78
    .line 79
    invoke-static {v4}, LH0/a;->b(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    invoke-interface {v2}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    invoke-static {v2}, LK0/k;->n(LK0/j;)LK0/J;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    :goto_0
    if-eqz v2, :cond_e

    .line 91
    .line 92
    invoke-virtual {v2}, LK0/J;->t0()LK0/c0;

    .line 93
    .line 94
    .line 95
    move-result-object v11

    .line 96
    invoke-virtual {v11}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 97
    .line 98
    .line 99
    move-result-object v11

    .line 100
    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 101
    .line 102
    .line 103
    move-result v11

    .line 104
    and-int/2addr v11, v9

    .line 105
    if-eqz v11, :cond_c

    .line 106
    .line 107
    :goto_1
    if-eqz v10, :cond_c

    .line 108
    .line 109
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 110
    .line 111
    .line 112
    move-result v11

    .line 113
    and-int/2addr v11, v9

    .line 114
    if-eqz v11, :cond_b

    .line 115
    .line 116
    move-object v12, v7

    .line 117
    move-object v11, v10

    .line 118
    :goto_2
    if-eqz v11, :cond_b

    .line 119
    .line 120
    instance-of v13, v11, LC0/e;

    .line 121
    .line 122
    if-eqz v13, :cond_4

    .line 123
    .line 124
    goto/16 :goto_5

    .line 125
    .line 126
    :cond_4
    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 127
    .line 128
    .line 129
    move-result v13

    .line 130
    and-int/2addr v13, v9

    .line 131
    if-eqz v13, :cond_a

    .line 132
    .line 133
    instance-of v13, v11, LK0/m;

    .line 134
    .line 135
    if-eqz v13, :cond_a

    .line 136
    .line 137
    move-object v13, v11

    .line 138
    check-cast v13, LK0/m;

    .line 139
    .line 140
    invoke-virtual {v13}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 141
    .line 142
    .line 143
    move-result-object v13

    .line 144
    move v14, v3

    .line 145
    :goto_3
    if-eqz v13, :cond_9

    .line 146
    .line 147
    invoke-virtual {v13}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 148
    .line 149
    .line 150
    move-result v15

    .line 151
    and-int/2addr v15, v9

    .line 152
    if-eqz v15, :cond_8

    .line 153
    .line 154
    add-int/lit8 v14, v14, 0x1

    .line 155
    .line 156
    if-ne v14, v8, :cond_5

    .line 157
    .line 158
    sget-object v11, LTd/L;->a:LTd/L;

    .line 159
    .line 160
    move-object v11, v13

    .line 161
    goto :goto_4

    .line 162
    :cond_5
    if-nez v12, :cond_6

    .line 163
    .line 164
    new-instance v12, La0/c;

    .line 165
    .line 166
    new-array v15, v6, [Landroidx/compose/ui/e$c;

    .line 167
    .line 168
    invoke-direct {v12, v15, v3}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 169
    .line 170
    .line 171
    :cond_6
    if-eqz v11, :cond_7

    .line 172
    .line 173
    invoke-virtual {v12, v11}, La0/c;->c(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-object v11, v7

    .line 177
    :cond_7
    invoke-virtual {v12, v13}, La0/c;->c(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    :cond_8
    :goto_4
    invoke-virtual {v13}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 181
    .line 182
    .line 183
    move-result-object v13

    .line 184
    goto :goto_3

    .line 185
    :cond_9
    if-ne v14, v8, :cond_a

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_a
    invoke-static {v12}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 189
    .line 190
    .line 191
    move-result-object v11

    .line 192
    goto :goto_2

    .line 193
    :cond_b
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 194
    .line 195
    .line 196
    move-result-object v10

    .line 197
    goto :goto_1

    .line 198
    :cond_c
    invoke-virtual {v2}, LK0/J;->A0()LK0/J;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    if-eqz v2, :cond_d

    .line 203
    .line 204
    invoke-virtual {v2}, LK0/J;->t0()LK0/c0;

    .line 205
    .line 206
    .line 207
    move-result-object v10

    .line 208
    if-eqz v10, :cond_d

    .line 209
    .line 210
    invoke-virtual {v10}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    goto :goto_0

    .line 215
    :cond_d
    move-object v10, v7

    .line 216
    goto :goto_0

    .line 217
    :cond_e
    move-object v11, v7

    .line 218
    :goto_5
    check-cast v11, LC0/e;

    .line 219
    .line 220
    if-eqz v11, :cond_f

    .line 221
    .line 222
    invoke-interface {v11}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 223
    .line 224
    .line 225
    move-result-object v9

    .line 226
    goto/16 :goto_c

    .line 227
    .line 228
    :cond_f
    iget-object v2, v1, Landroidx/compose/ui/focus/FocusOwnerImpl;->c:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 229
    .line 230
    invoke-static {v5}, LK0/g0;->a(I)I

    .line 231
    .line 232
    .line 233
    move-result v9

    .line 234
    invoke-interface {v2}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 235
    .line 236
    .line 237
    move-result-object v10

    .line 238
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 239
    .line 240
    .line 241
    move-result v10

    .line 242
    if-nez v10, :cond_10

    .line 243
    .line 244
    invoke-static {v4}, LH0/a;->b(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    :cond_10
    invoke-interface {v2}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 252
    .line 253
    .line 254
    move-result-object v10

    .line 255
    invoke-static {v2}, LK0/k;->n(LK0/j;)LK0/J;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    :goto_6
    if-eqz v2, :cond_1b

    .line 260
    .line 261
    invoke-virtual {v2}, LK0/J;->t0()LK0/c0;

    .line 262
    .line 263
    .line 264
    move-result-object v11

    .line 265
    invoke-virtual {v11}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 266
    .line 267
    .line 268
    move-result-object v11

    .line 269
    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 270
    .line 271
    .line 272
    move-result v11

    .line 273
    and-int/2addr v11, v9

    .line 274
    if-eqz v11, :cond_19

    .line 275
    .line 276
    :goto_7
    if-eqz v10, :cond_19

    .line 277
    .line 278
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 279
    .line 280
    .line 281
    move-result v11

    .line 282
    and-int/2addr v11, v9

    .line 283
    if-eqz v11, :cond_18

    .line 284
    .line 285
    move-object v12, v7

    .line 286
    move-object v11, v10

    .line 287
    :goto_8
    if-eqz v11, :cond_18

    .line 288
    .line 289
    instance-of v13, v11, LC0/e;

    .line 290
    .line 291
    if-eqz v13, :cond_11

    .line 292
    .line 293
    goto/16 :goto_b

    .line 294
    .line 295
    :cond_11
    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 296
    .line 297
    .line 298
    move-result v13

    .line 299
    and-int/2addr v13, v9

    .line 300
    if-eqz v13, :cond_17

    .line 301
    .line 302
    instance-of v13, v11, LK0/m;

    .line 303
    .line 304
    if-eqz v13, :cond_17

    .line 305
    .line 306
    move-object v13, v11

    .line 307
    check-cast v13, LK0/m;

    .line 308
    .line 309
    invoke-virtual {v13}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 310
    .line 311
    .line 312
    move-result-object v13

    .line 313
    move v14, v3

    .line 314
    :goto_9
    if-eqz v13, :cond_16

    .line 315
    .line 316
    invoke-virtual {v13}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 317
    .line 318
    .line 319
    move-result v15

    .line 320
    and-int/2addr v15, v9

    .line 321
    if-eqz v15, :cond_15

    .line 322
    .line 323
    add-int/lit8 v14, v14, 0x1

    .line 324
    .line 325
    if-ne v14, v8, :cond_12

    .line 326
    .line 327
    sget-object v11, LTd/L;->a:LTd/L;

    .line 328
    .line 329
    move-object v11, v13

    .line 330
    goto :goto_a

    .line 331
    :cond_12
    if-nez v12, :cond_13

    .line 332
    .line 333
    new-instance v12, La0/c;

    .line 334
    .line 335
    new-array v15, v6, [Landroidx/compose/ui/e$c;

    .line 336
    .line 337
    invoke-direct {v12, v15, v3}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 338
    .line 339
    .line 340
    :cond_13
    if-eqz v11, :cond_14

    .line 341
    .line 342
    invoke-virtual {v12, v11}, La0/c;->c(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-object v11, v7

    .line 346
    :cond_14
    invoke-virtual {v12, v13}, La0/c;->c(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    :cond_15
    :goto_a
    invoke-virtual {v13}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 350
    .line 351
    .line 352
    move-result-object v13

    .line 353
    goto :goto_9

    .line 354
    :cond_16
    if-ne v14, v8, :cond_17

    .line 355
    .line 356
    goto :goto_8

    .line 357
    :cond_17
    invoke-static {v12}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 358
    .line 359
    .line 360
    move-result-object v11

    .line 361
    goto :goto_8

    .line 362
    :cond_18
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 363
    .line 364
    .line 365
    move-result-object v10

    .line 366
    goto :goto_7

    .line 367
    :cond_19
    invoke-virtual {v2}, LK0/J;->A0()LK0/J;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    if-eqz v2, :cond_1a

    .line 372
    .line 373
    invoke-virtual {v2}, LK0/J;->t0()LK0/c0;

    .line 374
    .line 375
    .line 376
    move-result-object v10

    .line 377
    if-eqz v10, :cond_1a

    .line 378
    .line 379
    invoke-virtual {v10}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 380
    .line 381
    .line 382
    move-result-object v10

    .line 383
    goto :goto_6

    .line 384
    :cond_1a
    move-object v10, v7

    .line 385
    goto :goto_6

    .line 386
    :cond_1b
    move-object v11, v7

    .line 387
    :goto_b
    check-cast v11, LC0/e;

    .line 388
    .line 389
    if-eqz v11, :cond_1c

    .line 390
    .line 391
    invoke-interface {v11}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 392
    .line 393
    .line 394
    move-result-object v9

    .line 395
    goto :goto_c

    .line 396
    :cond_1c
    move-object v9, v7

    .line 397
    :cond_1d
    :goto_c
    if-eqz v9, :cond_43

    .line 398
    .line 399
    invoke-static {v5}, LK0/g0;->a(I)I

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    invoke-interface {v9}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 404
    .line 405
    .line 406
    move-result-object v5

    .line 407
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 408
    .line 409
    .line 410
    move-result v5

    .line 411
    if-nez v5, :cond_1e

    .line 412
    .line 413
    invoke-static {v4}, LH0/a;->b(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    :cond_1e
    invoke-interface {v9}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 417
    .line 418
    .line 419
    move-result-object v4

    .line 420
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 421
    .line 422
    .line 423
    move-result-object v4

    .line 424
    invoke-static {v9}, LK0/k;->n(LK0/j;)LK0/J;

    .line 425
    .line 426
    .line 427
    move-result-object v5

    .line 428
    move-object v10, v7

    .line 429
    :goto_d
    if-eqz v5, :cond_2a

    .line 430
    .line 431
    invoke-virtual {v5}, LK0/J;->t0()LK0/c0;

    .line 432
    .line 433
    .line 434
    move-result-object v11

    .line 435
    invoke-virtual {v11}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 436
    .line 437
    .line 438
    move-result-object v11

    .line 439
    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 440
    .line 441
    .line 442
    move-result v11

    .line 443
    and-int/2addr v11, v2

    .line 444
    if-eqz v11, :cond_28

    .line 445
    .line 446
    :goto_e
    if-eqz v4, :cond_28

    .line 447
    .line 448
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 449
    .line 450
    .line 451
    move-result v11

    .line 452
    and-int/2addr v11, v2

    .line 453
    if-eqz v11, :cond_27

    .line 454
    .line 455
    move-object v11, v4

    .line 456
    move-object v12, v7

    .line 457
    :goto_f
    if-eqz v11, :cond_27

    .line 458
    .line 459
    instance-of v13, v11, LC0/e;

    .line 460
    .line 461
    if-eqz v13, :cond_20

    .line 462
    .line 463
    if-nez v10, :cond_1f

    .line 464
    .line 465
    new-instance v10, Ljava/util/ArrayList;

    .line 466
    .line 467
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 468
    .line 469
    .line 470
    :cond_1f
    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    goto :goto_12

    .line 474
    :cond_20
    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 475
    .line 476
    .line 477
    move-result v13

    .line 478
    and-int/2addr v13, v2

    .line 479
    if-eqz v13, :cond_26

    .line 480
    .line 481
    instance-of v13, v11, LK0/m;

    .line 482
    .line 483
    if-eqz v13, :cond_26

    .line 484
    .line 485
    move-object v13, v11

    .line 486
    check-cast v13, LK0/m;

    .line 487
    .line 488
    invoke-virtual {v13}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 489
    .line 490
    .line 491
    move-result-object v13

    .line 492
    move v14, v3

    .line 493
    :goto_10
    if-eqz v13, :cond_25

    .line 494
    .line 495
    invoke-virtual {v13}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 496
    .line 497
    .line 498
    move-result v15

    .line 499
    and-int/2addr v15, v2

    .line 500
    if-eqz v15, :cond_24

    .line 501
    .line 502
    add-int/lit8 v14, v14, 0x1

    .line 503
    .line 504
    if-ne v14, v8, :cond_21

    .line 505
    .line 506
    sget-object v11, LTd/L;->a:LTd/L;

    .line 507
    .line 508
    move-object v11, v13

    .line 509
    goto :goto_11

    .line 510
    :cond_21
    if-nez v12, :cond_22

    .line 511
    .line 512
    new-instance v12, La0/c;

    .line 513
    .line 514
    new-array v15, v6, [Landroidx/compose/ui/e$c;

    .line 515
    .line 516
    invoke-direct {v12, v15, v3}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 517
    .line 518
    .line 519
    :cond_22
    if-eqz v11, :cond_23

    .line 520
    .line 521
    invoke-virtual {v12, v11}, La0/c;->c(Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    move-object v11, v7

    .line 525
    :cond_23
    invoke-virtual {v12, v13}, La0/c;->c(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    :cond_24
    :goto_11
    invoke-virtual {v13}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 529
    .line 530
    .line 531
    move-result-object v13

    .line 532
    goto :goto_10

    .line 533
    :cond_25
    if-ne v14, v8, :cond_26

    .line 534
    .line 535
    goto :goto_f

    .line 536
    :cond_26
    :goto_12
    invoke-static {v12}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 537
    .line 538
    .line 539
    move-result-object v11

    .line 540
    goto :goto_f

    .line 541
    :cond_27
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 542
    .line 543
    .line 544
    move-result-object v4

    .line 545
    goto :goto_e

    .line 546
    :cond_28
    invoke-virtual {v5}, LK0/J;->A0()LK0/J;

    .line 547
    .line 548
    .line 549
    move-result-object v5

    .line 550
    if-eqz v5, :cond_29

    .line 551
    .line 552
    invoke-virtual {v5}, LK0/J;->t0()LK0/c0;

    .line 553
    .line 554
    .line 555
    move-result-object v4

    .line 556
    if-eqz v4, :cond_29

    .line 557
    .line 558
    invoke-virtual {v4}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 559
    .line 560
    .line 561
    move-result-object v4

    .line 562
    goto/16 :goto_d

    .line 563
    .line 564
    :cond_29
    move-object v4, v7

    .line 565
    goto/16 :goto_d

    .line 566
    .line 567
    :cond_2a
    if-eqz v10, :cond_2e

    .line 568
    .line 569
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 570
    .line 571
    .line 572
    move-result v4

    .line 573
    add-int/lit8 v4, v4, -0x1

    .line 574
    .line 575
    if-ltz v4, :cond_2d

    .line 576
    .line 577
    :goto_13
    add-int/lit8 v5, v4, -0x1

    .line 578
    .line 579
    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v4

    .line 583
    check-cast v4, LC0/e;

    .line 584
    .line 585
    invoke-interface {v4, v0}, LC0/e;->E0(Landroid/view/KeyEvent;)Z

    .line 586
    .line 587
    .line 588
    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 589
    if-eqz v4, :cond_2b

    .line 590
    .line 591
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 592
    .line 593
    .line 594
    return v8

    .line 595
    :cond_2b
    if-gez v5, :cond_2c

    .line 596
    .line 597
    goto :goto_14

    .line 598
    :cond_2c
    move v4, v5

    .line 599
    goto :goto_13

    .line 600
    :cond_2d
    :goto_14
    :try_start_4
    sget-object v4, LTd/L;->a:LTd/L;

    .line 601
    .line 602
    :cond_2e
    invoke-interface {v9}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 603
    .line 604
    .line 605
    move-result-object v4

    .line 606
    new-instance v5, Lkotlin/jvm/internal/N;

    .line 607
    .line 608
    invoke-direct {v5}, Lkotlin/jvm/internal/N;-><init>()V

    .line 609
    .line 610
    .line 611
    new-instance v11, Lkotlin/jvm/internal/N;

    .line 612
    .line 613
    invoke-direct {v11}, Lkotlin/jvm/internal/N;-><init>()V

    .line 614
    .line 615
    .line 616
    iput-object v4, v11, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 617
    .line 618
    :goto_15
    iget-object v4, v11, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 619
    .line 620
    if-eqz v4, :cond_36

    .line 621
    .line 622
    instance-of v12, v4, LC0/e;

    .line 623
    .line 624
    if-eqz v12, :cond_2f

    .line 625
    .line 626
    check-cast v4, LC0/e;

    .line 627
    .line 628
    invoke-interface {v4, v0}, LC0/e;->E0(Landroid/view/KeyEvent;)Z

    .line 629
    .line 630
    .line 631
    move-result v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 632
    if-eqz v4, :cond_35

    .line 633
    .line 634
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 635
    .line 636
    .line 637
    return v8

    .line 638
    :cond_2f
    :try_start_5
    check-cast v4, Landroidx/compose/ui/e$c;

    .line 639
    .line 640
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 641
    .line 642
    .line 643
    move-result v4

    .line 644
    and-int/2addr v4, v2

    .line 645
    if-eqz v4, :cond_35

    .line 646
    .line 647
    iget-object v4, v11, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 648
    .line 649
    instance-of v12, v4, LK0/m;

    .line 650
    .line 651
    if-eqz v12, :cond_35

    .line 652
    .line 653
    check-cast v4, LK0/m;

    .line 654
    .line 655
    invoke-virtual {v4}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 656
    .line 657
    .line 658
    move-result-object v4

    .line 659
    move v12, v3

    .line 660
    :goto_16
    if-eqz v4, :cond_34

    .line 661
    .line 662
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 663
    .line 664
    .line 665
    move-result v13

    .line 666
    and-int/2addr v13, v2

    .line 667
    if-eqz v13, :cond_33

    .line 668
    .line 669
    add-int/lit8 v12, v12, 0x1

    .line 670
    .line 671
    if-ne v12, v8, :cond_30

    .line 672
    .line 673
    iput-object v4, v11, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 674
    .line 675
    sget-object v13, LTd/L;->a:LTd/L;

    .line 676
    .line 677
    goto :goto_17

    .line 678
    :cond_30
    iget-object v13, v5, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 679
    .line 680
    check-cast v13, La0/c;

    .line 681
    .line 682
    if-nez v13, :cond_31

    .line 683
    .line 684
    new-instance v13, La0/c;

    .line 685
    .line 686
    new-array v14, v6, [Landroidx/compose/ui/e$c;

    .line 687
    .line 688
    invoke-direct {v13, v14, v3}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 689
    .line 690
    .line 691
    :cond_31
    iput-object v13, v5, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 692
    .line 693
    iget-object v14, v11, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 694
    .line 695
    check-cast v14, Landroidx/compose/ui/e$c;

    .line 696
    .line 697
    if-eqz v14, :cond_32

    .line 698
    .line 699
    invoke-virtual {v13, v14}, La0/c;->c(Ljava/lang/Object;)Z

    .line 700
    .line 701
    .line 702
    iput-object v7, v11, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 703
    .line 704
    :cond_32
    iget-object v13, v5, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 705
    .line 706
    check-cast v13, La0/c;

    .line 707
    .line 708
    if-eqz v13, :cond_33

    .line 709
    .line 710
    invoke-virtual {v13, v4}, La0/c;->c(Ljava/lang/Object;)Z

    .line 711
    .line 712
    .line 713
    :cond_33
    :goto_17
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 714
    .line 715
    .line 716
    move-result-object v4

    .line 717
    goto :goto_16

    .line 718
    :cond_34
    if-ne v12, v8, :cond_35

    .line 719
    .line 720
    goto :goto_15

    .line 721
    :cond_35
    iget-object v4, v5, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 722
    .line 723
    check-cast v4, La0/c;

    .line 724
    .line 725
    invoke-static {v4}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 726
    .line 727
    .line 728
    move-result-object v4

    .line 729
    iput-object v4, v11, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 730
    .line 731
    goto :goto_15

    .line 732
    :cond_36
    invoke-interface/range {p2 .. p2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v4

    .line 736
    check-cast v4, Ljava/lang/Boolean;

    .line 737
    .line 738
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 739
    .line 740
    .line 741
    move-result v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 742
    if-eqz v4, :cond_37

    .line 743
    .line 744
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 745
    .line 746
    .line 747
    return v8

    .line 748
    :cond_37
    :try_start_6
    invoke-interface {v9}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 749
    .line 750
    .line 751
    move-result-object v4

    .line 752
    new-instance v5, Lkotlin/jvm/internal/N;

    .line 753
    .line 754
    invoke-direct {v5}, Lkotlin/jvm/internal/N;-><init>()V

    .line 755
    .line 756
    .line 757
    new-instance v9, Lkotlin/jvm/internal/N;

    .line 758
    .line 759
    invoke-direct {v9}, Lkotlin/jvm/internal/N;-><init>()V

    .line 760
    .line 761
    .line 762
    iput-object v4, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 763
    .line 764
    :goto_18
    iget-object v4, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 765
    .line 766
    if-eqz v4, :cond_3f

    .line 767
    .line 768
    instance-of v11, v4, LC0/e;

    .line 769
    .line 770
    if-eqz v11, :cond_38

    .line 771
    .line 772
    check-cast v4, LC0/e;

    .line 773
    .line 774
    invoke-interface {v4, v0}, LC0/e;->T0(Landroid/view/KeyEvent;)Z

    .line 775
    .line 776
    .line 777
    move-result v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 778
    if-eqz v4, :cond_3e

    .line 779
    .line 780
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 781
    .line 782
    .line 783
    return v8

    .line 784
    :cond_38
    :try_start_7
    check-cast v4, Landroidx/compose/ui/e$c;

    .line 785
    .line 786
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 787
    .line 788
    .line 789
    move-result v4

    .line 790
    and-int/2addr v4, v2

    .line 791
    if-eqz v4, :cond_3e

    .line 792
    .line 793
    iget-object v4, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 794
    .line 795
    instance-of v11, v4, LK0/m;

    .line 796
    .line 797
    if-eqz v11, :cond_3e

    .line 798
    .line 799
    check-cast v4, LK0/m;

    .line 800
    .line 801
    invoke-virtual {v4}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 802
    .line 803
    .line 804
    move-result-object v4

    .line 805
    move v11, v3

    .line 806
    :goto_19
    if-eqz v4, :cond_3d

    .line 807
    .line 808
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 809
    .line 810
    .line 811
    move-result v12

    .line 812
    and-int/2addr v12, v2

    .line 813
    if-eqz v12, :cond_3c

    .line 814
    .line 815
    add-int/lit8 v11, v11, 0x1

    .line 816
    .line 817
    if-ne v11, v8, :cond_39

    .line 818
    .line 819
    iput-object v4, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 820
    .line 821
    sget-object v12, LTd/L;->a:LTd/L;

    .line 822
    .line 823
    goto :goto_1a

    .line 824
    :cond_39
    iget-object v12, v5, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 825
    .line 826
    check-cast v12, La0/c;

    .line 827
    .line 828
    if-nez v12, :cond_3a

    .line 829
    .line 830
    new-instance v12, La0/c;

    .line 831
    .line 832
    new-array v13, v6, [Landroidx/compose/ui/e$c;

    .line 833
    .line 834
    invoke-direct {v12, v13, v3}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 835
    .line 836
    .line 837
    :cond_3a
    iput-object v12, v5, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 838
    .line 839
    iget-object v13, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 840
    .line 841
    check-cast v13, Landroidx/compose/ui/e$c;

    .line 842
    .line 843
    if-eqz v13, :cond_3b

    .line 844
    .line 845
    invoke-virtual {v12, v13}, La0/c;->c(Ljava/lang/Object;)Z

    .line 846
    .line 847
    .line 848
    iput-object v7, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 849
    .line 850
    :cond_3b
    iget-object v12, v5, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 851
    .line 852
    check-cast v12, La0/c;

    .line 853
    .line 854
    if-eqz v12, :cond_3c

    .line 855
    .line 856
    invoke-virtual {v12, v4}, La0/c;->c(Ljava/lang/Object;)Z

    .line 857
    .line 858
    .line 859
    :cond_3c
    :goto_1a
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 860
    .line 861
    .line 862
    move-result-object v4

    .line 863
    goto :goto_19

    .line 864
    :cond_3d
    if-ne v11, v8, :cond_3e

    .line 865
    .line 866
    goto :goto_18

    .line 867
    :cond_3e
    iget-object v4, v5, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 868
    .line 869
    check-cast v4, La0/c;

    .line 870
    .line 871
    invoke-static {v4}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 872
    .line 873
    .line 874
    move-result-object v4

    .line 875
    iput-object v4, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 876
    .line 877
    goto :goto_18

    .line 878
    :cond_3f
    if-eqz v10, :cond_42

    .line 879
    .line 880
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 881
    .line 882
    .line 883
    move-result v2

    .line 884
    move v4, v3

    .line 885
    :goto_1b
    if-ge v4, v2, :cond_41

    .line 886
    .line 887
    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 888
    .line 889
    .line 890
    move-result-object v5

    .line 891
    check-cast v5, LC0/e;

    .line 892
    .line 893
    invoke-interface {v5, v0}, LC0/e;->T0(Landroid/view/KeyEvent;)Z

    .line 894
    .line 895
    .line 896
    move-result v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 897
    if-eqz v5, :cond_40

    .line 898
    .line 899
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 900
    .line 901
    .line 902
    return v8

    .line 903
    :cond_40
    add-int/lit8 v4, v4, 0x1

    .line 904
    .line 905
    goto :goto_1b

    .line 906
    :cond_41
    :try_start_8
    sget-object v0, LTd/L;->a:LTd/L;

    .line 907
    .line 908
    :cond_42
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 909
    .line 910
    :cond_43
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 911
    .line 912
    .line 913
    return v3

    .line 914
    :goto_1c
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 915
    .line 916
    .line 917
    throw v0
.end method

.method public e(ILr0/h;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;
    .locals 5

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->x()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->b:LK0/p0;

    .line 9
    .line 10
    invoke-interface {v2}, LK0/p0;->getLayoutDirection()Li1/t;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-static {v0, p1, v2}, Landroidx/compose/ui/focus/r;->a(Landroidx/compose/ui/focus/FocusTargetNode;ILi1/t;)Landroidx/compose/ui/focus/k;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    sget-object v3, Landroidx/compose/ui/focus/k;->b:Landroidx/compose/ui/focus/k$a;

    .line 19
    .line 20
    invoke-virtual {v3}, Landroidx/compose/ui/focus/k$a;->a()Landroidx/compose/ui/focus/k;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_0
    invoke-virtual {v3}, Landroidx/compose/ui/focus/k$a;->c()Landroidx/compose/ui/focus/k;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->x()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Ljava/lang/Boolean;

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_1
    return-object v1

    .line 55
    :cond_2
    invoke-virtual {v3}, Landroidx/compose/ui/focus/k$a;->b()Landroidx/compose/ui/focus/k;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-nez v1, :cond_4

    .line 64
    .line 65
    invoke-virtual {v2, p3}, Landroidx/compose/ui/focus/k;->d(Lkotlin/jvm/functions/Function1;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :cond_3
    move-object v0, v1

    .line 75
    :cond_4
    iget-object v1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->c:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 76
    .line 77
    iget-object v2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->b:LK0/p0;

    .line 78
    .line 79
    invoke-interface {v2}, LK0/p0;->getLayoutDirection()Li1/t;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    new-instance v3, Landroidx/compose/ui/focus/FocusOwnerImpl$b;

    .line 84
    .line 85
    invoke-direct {v3, v0, p0, p3}, Landroidx/compose/ui/focus/FocusOwnerImpl$b;-><init>(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusOwnerImpl;Lkotlin/jvm/functions/Function1;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v1, p1, v2, p2, v3}, Landroidx/compose/ui/focus/r;->e(Landroidx/compose/ui/focus/FocusTargetNode;ILi1/t;Lr0/h;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1
.end method

.method public f(LG0/b;Lie/a;)Z
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v2, v1, Landroidx/compose/ui/focus/FocusOwnerImpl;->d:Lq0/f;

    .line 6
    .line 7
    invoke-virtual {v2}, Lq0/f;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const-string v0, "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated."

    .line 15
    .line 16
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 17
    .line 18
    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return v3

    .line 22
    :cond_0
    invoke-direct {v1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->x()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v4, "visitAncestors called on an unattached node"

    .line 27
    .line 28
    const/16 v5, 0x4000

    .line 29
    .line 30
    const/16 v6, 0x10

    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v8, 0x1

    .line 34
    if-eqz v2, :cond_d

    .line 35
    .line 36
    invoke-static {v5}, LK0/g0;->a(I)I

    .line 37
    .line 38
    .line 39
    move-result v9

    .line 40
    invoke-interface {v2}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 41
    .line 42
    .line 43
    move-result-object v10

    .line 44
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 45
    .line 46
    .line 47
    move-result v10

    .line 48
    if-nez v10, :cond_1

    .line 49
    .line 50
    invoke-static {v4}, LH0/a;->b(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-interface {v2}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    invoke-static {v2}, LK0/k;->n(LK0/j;)LK0/J;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    :goto_0
    if-eqz v2, :cond_c

    .line 62
    .line 63
    invoke-virtual {v2}, LK0/J;->t0()LK0/c0;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    invoke-virtual {v11}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 68
    .line 69
    .line 70
    move-result-object v11

    .line 71
    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    and-int/2addr v11, v9

    .line 76
    if-eqz v11, :cond_a

    .line 77
    .line 78
    :goto_1
    if-eqz v10, :cond_a

    .line 79
    .line 80
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    and-int/2addr v11, v9

    .line 85
    if-eqz v11, :cond_9

    .line 86
    .line 87
    move-object v12, v7

    .line 88
    move-object v11, v10

    .line 89
    :goto_2
    if-eqz v11, :cond_9

    .line 90
    .line 91
    instance-of v13, v11, LG0/a;

    .line 92
    .line 93
    if-eqz v13, :cond_2

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_2
    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    and-int/2addr v13, v9

    .line 101
    if-eqz v13, :cond_8

    .line 102
    .line 103
    instance-of v13, v11, LK0/m;

    .line 104
    .line 105
    if-eqz v13, :cond_8

    .line 106
    .line 107
    move-object v13, v11

    .line 108
    check-cast v13, LK0/m;

    .line 109
    .line 110
    invoke-virtual {v13}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    move v14, v3

    .line 115
    :goto_3
    if-eqz v13, :cond_7

    .line 116
    .line 117
    invoke-virtual {v13}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 118
    .line 119
    .line 120
    move-result v15

    .line 121
    and-int/2addr v15, v9

    .line 122
    if-eqz v15, :cond_6

    .line 123
    .line 124
    add-int/lit8 v14, v14, 0x1

    .line 125
    .line 126
    if-ne v14, v8, :cond_3

    .line 127
    .line 128
    move-object v11, v13

    .line 129
    goto :goto_4

    .line 130
    :cond_3
    if-nez v12, :cond_4

    .line 131
    .line 132
    new-instance v12, La0/c;

    .line 133
    .line 134
    new-array v15, v6, [Landroidx/compose/ui/e$c;

    .line 135
    .line 136
    invoke-direct {v12, v15, v3}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 137
    .line 138
    .line 139
    :cond_4
    if-eqz v11, :cond_5

    .line 140
    .line 141
    invoke-virtual {v12, v11}, La0/c;->c(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-object v11, v7

    .line 145
    :cond_5
    invoke-virtual {v12, v13}, La0/c;->c(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    :cond_6
    :goto_4
    invoke-virtual {v13}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 149
    .line 150
    .line 151
    move-result-object v13

    .line 152
    goto :goto_3

    .line 153
    :cond_7
    if-ne v14, v8, :cond_8

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_8
    invoke-static {v12}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 157
    .line 158
    .line 159
    move-result-object v11

    .line 160
    goto :goto_2

    .line 161
    :cond_9
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    goto :goto_1

    .line 166
    :cond_a
    invoke-virtual {v2}, LK0/J;->A0()LK0/J;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    if-eqz v2, :cond_b

    .line 171
    .line 172
    invoke-virtual {v2}, LK0/J;->t0()LK0/c0;

    .line 173
    .line 174
    .line 175
    move-result-object v10

    .line 176
    if-eqz v10, :cond_b

    .line 177
    .line 178
    invoke-virtual {v10}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    goto :goto_0

    .line 183
    :cond_b
    move-object v10, v7

    .line 184
    goto :goto_0

    .line 185
    :cond_c
    move-object v11, v7

    .line 186
    :goto_5
    check-cast v11, LG0/a;

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_d
    move-object v11, v7

    .line 190
    :goto_6
    if-eqz v11, :cond_30

    .line 191
    .line 192
    invoke-static {v5}, LK0/g0;->a(I)I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    invoke-interface {v11}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    if-nez v5, :cond_e

    .line 205
    .line 206
    invoke-static {v4}, LH0/a;->b(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    :cond_e
    invoke-interface {v11}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-static {v11}, LK0/k;->n(LK0/j;)LK0/J;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    move-object v9, v7

    .line 222
    :goto_7
    if-eqz v5, :cond_1a

    .line 223
    .line 224
    invoke-virtual {v5}, LK0/J;->t0()LK0/c0;

    .line 225
    .line 226
    .line 227
    move-result-object v10

    .line 228
    invoke-virtual {v10}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 233
    .line 234
    .line 235
    move-result v10

    .line 236
    and-int/2addr v10, v2

    .line 237
    if-eqz v10, :cond_18

    .line 238
    .line 239
    :goto_8
    if-eqz v4, :cond_18

    .line 240
    .line 241
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    and-int/2addr v10, v2

    .line 246
    if-eqz v10, :cond_17

    .line 247
    .line 248
    move-object v10, v4

    .line 249
    move-object v12, v7

    .line 250
    :goto_9
    if-eqz v10, :cond_17

    .line 251
    .line 252
    instance-of v13, v10, LG0/a;

    .line 253
    .line 254
    if-eqz v13, :cond_10

    .line 255
    .line 256
    if-nez v9, :cond_f

    .line 257
    .line 258
    new-instance v9, Ljava/util/ArrayList;

    .line 259
    .line 260
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 261
    .line 262
    .line 263
    :cond_f
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    goto :goto_c

    .line 267
    :cond_10
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 268
    .line 269
    .line 270
    move-result v13

    .line 271
    and-int/2addr v13, v2

    .line 272
    if-eqz v13, :cond_16

    .line 273
    .line 274
    instance-of v13, v10, LK0/m;

    .line 275
    .line 276
    if-eqz v13, :cond_16

    .line 277
    .line 278
    move-object v13, v10

    .line 279
    check-cast v13, LK0/m;

    .line 280
    .line 281
    invoke-virtual {v13}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 282
    .line 283
    .line 284
    move-result-object v13

    .line 285
    move v14, v3

    .line 286
    :goto_a
    if-eqz v13, :cond_15

    .line 287
    .line 288
    invoke-virtual {v13}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 289
    .line 290
    .line 291
    move-result v15

    .line 292
    and-int/2addr v15, v2

    .line 293
    if-eqz v15, :cond_14

    .line 294
    .line 295
    add-int/lit8 v14, v14, 0x1

    .line 296
    .line 297
    if-ne v14, v8, :cond_11

    .line 298
    .line 299
    move-object v10, v13

    .line 300
    goto :goto_b

    .line 301
    :cond_11
    if-nez v12, :cond_12

    .line 302
    .line 303
    new-instance v12, La0/c;

    .line 304
    .line 305
    new-array v15, v6, [Landroidx/compose/ui/e$c;

    .line 306
    .line 307
    invoke-direct {v12, v15, v3}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 308
    .line 309
    .line 310
    :cond_12
    if-eqz v10, :cond_13

    .line 311
    .line 312
    invoke-virtual {v12, v10}, La0/c;->c(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-object v10, v7

    .line 316
    :cond_13
    invoke-virtual {v12, v13}, La0/c;->c(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    :cond_14
    :goto_b
    invoke-virtual {v13}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 320
    .line 321
    .line 322
    move-result-object v13

    .line 323
    goto :goto_a

    .line 324
    :cond_15
    if-ne v14, v8, :cond_16

    .line 325
    .line 326
    goto :goto_9

    .line 327
    :cond_16
    :goto_c
    invoke-static {v12}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 328
    .line 329
    .line 330
    move-result-object v10

    .line 331
    goto :goto_9

    .line 332
    :cond_17
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 333
    .line 334
    .line 335
    move-result-object v4

    .line 336
    goto :goto_8

    .line 337
    :cond_18
    invoke-virtual {v5}, LK0/J;->A0()LK0/J;

    .line 338
    .line 339
    .line 340
    move-result-object v5

    .line 341
    if-eqz v5, :cond_19

    .line 342
    .line 343
    invoke-virtual {v5}, LK0/J;->t0()LK0/c0;

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    if-eqz v4, :cond_19

    .line 348
    .line 349
    invoke-virtual {v4}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    goto/16 :goto_7

    .line 354
    .line 355
    :cond_19
    move-object v4, v7

    .line 356
    goto/16 :goto_7

    .line 357
    .line 358
    :cond_1a
    if-eqz v9, :cond_1d

    .line 359
    .line 360
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 361
    .line 362
    .line 363
    move-result v4

    .line 364
    add-int/lit8 v4, v4, -0x1

    .line 365
    .line 366
    if-ltz v4, :cond_1d

    .line 367
    .line 368
    :goto_d
    add-int/lit8 v5, v4, -0x1

    .line 369
    .line 370
    invoke-interface {v9, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    check-cast v4, LG0/a;

    .line 375
    .line 376
    invoke-interface {v4, v0}, LG0/a;->V(LG0/b;)Z

    .line 377
    .line 378
    .line 379
    move-result v4

    .line 380
    if-eqz v4, :cond_1b

    .line 381
    .line 382
    return v8

    .line 383
    :cond_1b
    if-gez v5, :cond_1c

    .line 384
    .line 385
    goto :goto_e

    .line 386
    :cond_1c
    move v4, v5

    .line 387
    goto :goto_d

    .line 388
    :cond_1d
    :goto_e
    invoke-interface {v11}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 389
    .line 390
    .line 391
    move-result-object v4

    .line 392
    move-object v5, v7

    .line 393
    :goto_f
    if-eqz v4, :cond_25

    .line 394
    .line 395
    instance-of v10, v4, LG0/a;

    .line 396
    .line 397
    if-eqz v10, :cond_1e

    .line 398
    .line 399
    check-cast v4, LG0/a;

    .line 400
    .line 401
    invoke-interface {v4, v0}, LG0/a;->V(LG0/b;)Z

    .line 402
    .line 403
    .line 404
    move-result v4

    .line 405
    if-eqz v4, :cond_24

    .line 406
    .line 407
    return v8

    .line 408
    :cond_1e
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 409
    .line 410
    .line 411
    move-result v10

    .line 412
    and-int/2addr v10, v2

    .line 413
    if-eqz v10, :cond_24

    .line 414
    .line 415
    instance-of v10, v4, LK0/m;

    .line 416
    .line 417
    if-eqz v10, :cond_24

    .line 418
    .line 419
    move-object v10, v4

    .line 420
    check-cast v10, LK0/m;

    .line 421
    .line 422
    invoke-virtual {v10}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 423
    .line 424
    .line 425
    move-result-object v10

    .line 426
    move v12, v3

    .line 427
    :goto_10
    if-eqz v10, :cond_23

    .line 428
    .line 429
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 430
    .line 431
    .line 432
    move-result v13

    .line 433
    and-int/2addr v13, v2

    .line 434
    if-eqz v13, :cond_22

    .line 435
    .line 436
    add-int/lit8 v12, v12, 0x1

    .line 437
    .line 438
    if-ne v12, v8, :cond_1f

    .line 439
    .line 440
    move-object v4, v10

    .line 441
    goto :goto_11

    .line 442
    :cond_1f
    if-nez v5, :cond_20

    .line 443
    .line 444
    new-instance v5, La0/c;

    .line 445
    .line 446
    new-array v13, v6, [Landroidx/compose/ui/e$c;

    .line 447
    .line 448
    invoke-direct {v5, v13, v3}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 449
    .line 450
    .line 451
    :cond_20
    if-eqz v4, :cond_21

    .line 452
    .line 453
    invoke-virtual {v5, v4}, La0/c;->c(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    move-object v4, v7

    .line 457
    :cond_21
    invoke-virtual {v5, v10}, La0/c;->c(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    :cond_22
    :goto_11
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 461
    .line 462
    .line 463
    move-result-object v10

    .line 464
    goto :goto_10

    .line 465
    :cond_23
    if-ne v12, v8, :cond_24

    .line 466
    .line 467
    goto :goto_f

    .line 468
    :cond_24
    invoke-static {v5}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 469
    .line 470
    .line 471
    move-result-object v4

    .line 472
    goto :goto_f

    .line 473
    :cond_25
    invoke-interface/range {p2 .. p2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v4

    .line 477
    check-cast v4, Ljava/lang/Boolean;

    .line 478
    .line 479
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 480
    .line 481
    .line 482
    move-result v4

    .line 483
    if-eqz v4, :cond_26

    .line 484
    .line 485
    return v8

    .line 486
    :cond_26
    invoke-interface {v11}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 487
    .line 488
    .line 489
    move-result-object v4

    .line 490
    move-object v5, v7

    .line 491
    :goto_12
    if-eqz v4, :cond_2e

    .line 492
    .line 493
    instance-of v10, v4, LG0/a;

    .line 494
    .line 495
    if-eqz v10, :cond_27

    .line 496
    .line 497
    check-cast v4, LG0/a;

    .line 498
    .line 499
    invoke-interface {v4, v0}, LG0/a;->x0(LG0/b;)Z

    .line 500
    .line 501
    .line 502
    move-result v4

    .line 503
    if-eqz v4, :cond_2d

    .line 504
    .line 505
    return v8

    .line 506
    :cond_27
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 507
    .line 508
    .line 509
    move-result v10

    .line 510
    and-int/2addr v10, v2

    .line 511
    if-eqz v10, :cond_2d

    .line 512
    .line 513
    instance-of v10, v4, LK0/m;

    .line 514
    .line 515
    if-eqz v10, :cond_2d

    .line 516
    .line 517
    move-object v10, v4

    .line 518
    check-cast v10, LK0/m;

    .line 519
    .line 520
    invoke-virtual {v10}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 521
    .line 522
    .line 523
    move-result-object v10

    .line 524
    move v11, v3

    .line 525
    :goto_13
    if-eqz v10, :cond_2c

    .line 526
    .line 527
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 528
    .line 529
    .line 530
    move-result v12

    .line 531
    and-int/2addr v12, v2

    .line 532
    if-eqz v12, :cond_2b

    .line 533
    .line 534
    add-int/lit8 v11, v11, 0x1

    .line 535
    .line 536
    if-ne v11, v8, :cond_28

    .line 537
    .line 538
    move-object v4, v10

    .line 539
    goto :goto_14

    .line 540
    :cond_28
    if-nez v5, :cond_29

    .line 541
    .line 542
    new-instance v5, La0/c;

    .line 543
    .line 544
    new-array v12, v6, [Landroidx/compose/ui/e$c;

    .line 545
    .line 546
    invoke-direct {v5, v12, v3}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 547
    .line 548
    .line 549
    :cond_29
    if-eqz v4, :cond_2a

    .line 550
    .line 551
    invoke-virtual {v5, v4}, La0/c;->c(Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    move-object v4, v7

    .line 555
    :cond_2a
    invoke-virtual {v5, v10}, La0/c;->c(Ljava/lang/Object;)Z

    .line 556
    .line 557
    .line 558
    :cond_2b
    :goto_14
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 559
    .line 560
    .line 561
    move-result-object v10

    .line 562
    goto :goto_13

    .line 563
    :cond_2c
    if-ne v11, v8, :cond_2d

    .line 564
    .line 565
    goto :goto_12

    .line 566
    :cond_2d
    invoke-static {v5}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 567
    .line 568
    .line 569
    move-result-object v4

    .line 570
    goto :goto_12

    .line 571
    :cond_2e
    if-eqz v9, :cond_30

    .line 572
    .line 573
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 574
    .line 575
    .line 576
    move-result v2

    .line 577
    move v4, v3

    .line 578
    :goto_15
    if-ge v4, v2, :cond_30

    .line 579
    .line 580
    invoke-interface {v9, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v5

    .line 584
    check-cast v5, LG0/a;

    .line 585
    .line 586
    invoke-interface {v5, v0}, LG0/a;->x0(LG0/b;)Z

    .line 587
    .line 588
    .line 589
    move-result v5

    .line 590
    if-eqz v5, :cond_2f

    .line 591
    .line 592
    return v8

    .line 593
    :cond_2f
    add-int/lit8 v4, v4, 0x1

    .line 594
    .line 595
    goto :goto_15

    .line 596
    :cond_30
    return v3
.end method

.method public g(LB0/c;Lie/a;)Z
    .locals 9

    .line 1
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->d:Lq0/f;

    .line 2
    .line 3
    invoke-virtual {p1}, Lq0/f;->b()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 p2, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const-string p1, "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated."

    .line 11
    .line 12
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return p2

    .line 18
    :cond_0
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->x()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_c

    .line 23
    .line 24
    const/high16 v0, 0x200000

    .line 25
    .line 26
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-interface {p1}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    const-string v1, "visitAncestors called on an unattached node"

    .line 41
    .line 42
    invoke-static {v1}, LH0/a;->b(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-interface {p1}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {p1}, LK0/k;->n(LK0/j;)LK0/J;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :goto_0
    const/4 v2, 0x0

    .line 54
    if-eqz p1, :cond_b

    .line 55
    .line 56
    invoke-virtual {p1}, LK0/J;->t0()LK0/c0;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v3}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    and-int/2addr v3, v0

    .line 69
    if-eqz v3, :cond_9

    .line 70
    .line 71
    :goto_1
    if-eqz v1, :cond_9

    .line 72
    .line 73
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    and-int/2addr v3, v0

    .line 78
    if-eqz v3, :cond_8

    .line 79
    .line 80
    move-object v3, v1

    .line 81
    move-object v4, v2

    .line 82
    :goto_2
    if-eqz v3, :cond_8

    .line 83
    .line 84
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    and-int/2addr v5, v0

    .line 89
    if-eqz v5, :cond_7

    .line 90
    .line 91
    instance-of v5, v3, LK0/m;

    .line 92
    .line 93
    if-eqz v5, :cond_7

    .line 94
    .line 95
    move-object v5, v3

    .line 96
    check-cast v5, LK0/m;

    .line 97
    .line 98
    invoke-virtual {v5}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    move v6, p2

    .line 103
    :goto_3
    const/4 v7, 0x1

    .line 104
    if-eqz v5, :cond_6

    .line 105
    .line 106
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    and-int/2addr v8, v0

    .line 111
    if-eqz v8, :cond_5

    .line 112
    .line 113
    add-int/lit8 v6, v6, 0x1

    .line 114
    .line 115
    if-ne v6, v7, :cond_2

    .line 116
    .line 117
    move-object v3, v5

    .line 118
    goto :goto_4

    .line 119
    :cond_2
    if-nez v4, :cond_3

    .line 120
    .line 121
    new-instance v4, La0/c;

    .line 122
    .line 123
    const/16 v7, 0x10

    .line 124
    .line 125
    new-array v7, v7, [Landroidx/compose/ui/e$c;

    .line 126
    .line 127
    invoke-direct {v4, v7, p2}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 128
    .line 129
    .line 130
    :cond_3
    if-eqz v3, :cond_4

    .line 131
    .line 132
    invoke-virtual {v4, v3}, La0/c;->c(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-object v3, v2

    .line 136
    :cond_4
    invoke-virtual {v4, v5}, La0/c;->c(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    :cond_5
    :goto_4
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    goto :goto_3

    .line 144
    :cond_6
    if-ne v6, v7, :cond_7

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_7
    invoke-static {v4}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    goto :goto_2

    .line 152
    :cond_8
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    goto :goto_1

    .line 157
    :cond_9
    invoke-virtual {p1}, LK0/J;->A0()LK0/J;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    if-eqz p1, :cond_a

    .line 162
    .line 163
    invoke-virtual {p1}, LK0/J;->t0()LK0/c0;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    if-eqz v1, :cond_a

    .line 168
    .line 169
    invoke-virtual {v1}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    goto :goto_0

    .line 174
    :cond_a
    move-object v1, v2

    .line 175
    goto :goto_0

    .line 176
    :cond_b
    invoke-static {v2}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    :cond_c
    return p2
.end method

.method public h(I)Z
    .locals 5

    .line 1
    sget-boolean v0, Ll0/h;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Lq0/q;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lq0/q;->d(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    new-instance v0, Lkotlin/jvm/internal/N;

    .line 16
    .line 17
    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    .line 18
    .line 19
    .line 20
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 21
    .line 22
    iput-object v2, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->j()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v3, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Lq0/q;

    .line 29
    .line 30
    invoke-interface {v3}, Lq0/q;->getEmbeddedViewFocusRect()Lr0/h;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    new-instance v4, Landroidx/compose/ui/focus/FocusOwnerImpl$c;

    .line 35
    .line 36
    invoke-direct {v4, v0, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl$c;-><init>(Lkotlin/jvm/internal/N;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1, v3, v4}, Landroidx/compose/ui/focus/FocusOwnerImpl;->e(ILr0/h;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->j()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    if-eq v2, v4, :cond_1

    .line 56
    .line 57
    return v1

    .line 58
    :cond_1
    const/4 v2, 0x0

    .line 59
    if-eqz v3, :cond_6

    .line 60
    .line 61
    iget-object v4, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 62
    .line 63
    if-nez v4, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_3

    .line 71
    .line 72
    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    return v1

    .line 83
    :cond_3
    invoke-static {p1}, Landroidx/compose/ui/focus/h;->a(I)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    invoke-virtual {p0, v2, v1, v2, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->p(ZZZI)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    const/4 v0, 0x0

    .line 96
    invoke-virtual {p0, p1, v0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->B(ILr0/h;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_4

    .line 101
    .line 102
    return v1

    .line 103
    :cond_4
    return v2

    .line 104
    :cond_5
    sget-boolean v0, Ll0/h;->d:Z

    .line 105
    .line 106
    if-nez v0, :cond_6

    .line 107
    .line 108
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Lq0/q;

    .line 109
    .line 110
    invoke-interface {v0, p1}, Lq0/q;->d(I)Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-eqz p1, :cond_6

    .line 115
    .line 116
    return v1

    .line 117
    :cond_6
    :goto_0
    return v2
.end method

.method public i(Landroid/view/KeyEvent;)Z
    .locals 10

    .line 1
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->d:Lq0/f;

    .line 2
    .line 3
    invoke-virtual {p1}, Lq0/f;->b()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const-string p1, "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated."

    .line 11
    .line 12
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return v0

    .line 18
    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->c:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 19
    .line 20
    invoke-static {p1}, Landroidx/compose/ui/focus/r;->b(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_c

    .line 25
    .line 26
    const/high16 v1, 0x20000

    .line 27
    .line 28
    invoke-static {v1}, LK0/g0;->a(I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-interface {p1}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    const-string v2, "visitAncestors called on an unattached node"

    .line 43
    .line 44
    invoke-static {v2}, LH0/a;->b(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-interface {p1}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {p1}, LK0/k;->n(LK0/j;)LK0/J;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :goto_0
    const/4 v3, 0x0

    .line 56
    if-eqz p1, :cond_b

    .line 57
    .line 58
    invoke-virtual {p1}, LK0/J;->t0()LK0/c0;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v4}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    and-int/2addr v4, v1

    .line 71
    if-eqz v4, :cond_9

    .line 72
    .line 73
    :goto_1
    if-eqz v2, :cond_9

    .line 74
    .line 75
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    and-int/2addr v4, v1

    .line 80
    if-eqz v4, :cond_8

    .line 81
    .line 82
    move-object v4, v2

    .line 83
    move-object v5, v3

    .line 84
    :goto_2
    if-eqz v4, :cond_8

    .line 85
    .line 86
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    and-int/2addr v6, v1

    .line 91
    if-eqz v6, :cond_7

    .line 92
    .line 93
    instance-of v6, v4, LK0/m;

    .line 94
    .line 95
    if-eqz v6, :cond_7

    .line 96
    .line 97
    move-object v6, v4

    .line 98
    check-cast v6, LK0/m;

    .line 99
    .line 100
    invoke-virtual {v6}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    move v7, v0

    .line 105
    :goto_3
    const/4 v8, 0x1

    .line 106
    if-eqz v6, :cond_6

    .line 107
    .line 108
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 109
    .line 110
    .line 111
    move-result v9

    .line 112
    and-int/2addr v9, v1

    .line 113
    if-eqz v9, :cond_5

    .line 114
    .line 115
    add-int/lit8 v7, v7, 0x1

    .line 116
    .line 117
    if-ne v7, v8, :cond_2

    .line 118
    .line 119
    move-object v4, v6

    .line 120
    goto :goto_4

    .line 121
    :cond_2
    if-nez v5, :cond_3

    .line 122
    .line 123
    new-instance v5, La0/c;

    .line 124
    .line 125
    const/16 v8, 0x10

    .line 126
    .line 127
    new-array v8, v8, [Landroidx/compose/ui/e$c;

    .line 128
    .line 129
    invoke-direct {v5, v8, v0}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 130
    .line 131
    .line 132
    :cond_3
    if-eqz v4, :cond_4

    .line 133
    .line 134
    invoke-virtual {v5, v4}, La0/c;->c(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-object v4, v3

    .line 138
    :cond_4
    invoke-virtual {v5, v6}, La0/c;->c(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    :cond_5
    :goto_4
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    goto :goto_3

    .line 146
    :cond_6
    if-ne v7, v8, :cond_7

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_7
    invoke-static {v5}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    goto :goto_2

    .line 154
    :cond_8
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    goto :goto_1

    .line 159
    :cond_9
    invoke-virtual {p1}, LK0/J;->A0()LK0/J;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    if-eqz p1, :cond_a

    .line 164
    .line 165
    invoke-virtual {p1}, LK0/J;->t0()LK0/c0;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    if-eqz v2, :cond_a

    .line 170
    .line 171
    invoke-virtual {v2}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    goto :goto_0

    .line 176
    :cond_a
    move-object v2, v3

    .line 177
    goto :goto_0

    .line 178
    :cond_b
    invoke-static {v3}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_c
    return v0
.end method

.method public j()Landroidx/compose/ui/focus/FocusTargetNode;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->h:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    return-object v0
.end method

.method public k(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->d:Lq0/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lq0/f;->f(Landroidx/compose/ui/focus/FocusTargetNode;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public l()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->d:Lq0/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq0/f;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public m()Landroidx/compose/ui/e;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->e:Landroidx/compose/ui/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public n(Lq0/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->d:Lq0/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lq0/f;->g(Lq0/d;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public p(ZZZI)Z
    .locals 1

    .line 1
    if-nez p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->c:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 4
    .line 5
    invoke-static {v0, p4}, Landroidx/compose/ui/focus/q;->e(Landroidx/compose/ui/focus/FocusTargetNode;I)Lq0/b;

    .line 6
    .line 7
    .line 8
    move-result-object p4

    .line 9
    sget-object v0, Landroidx/compose/ui/focus/FocusOwnerImpl$a;->a:[I

    .line 10
    .line 11
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result p4

    .line 15
    aget p4, v0, p4

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    if-eq p4, v0, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    if-eq p4, v0, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x3

    .line 24
    if-eq p4, v0, :cond_1

    .line 25
    .line 26
    const/4 v0, 0x4

    .line 27
    if-ne p4, v0, :cond_0

    .line 28
    .line 29
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/focus/FocusOwnerImpl;->w(ZZ)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance p1, LTd/r;

    .line 35
    .line 36
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/focus/FocusOwnerImpl;->w(ZZ)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    :goto_0
    if-eqz p1, :cond_3

    .line 47
    .line 48
    if-eqz p3, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->a()V

    .line 51
    .line 52
    .line 53
    :cond_3
    return p1
.end method

.method public q()Lq0/n;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->c:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTargetNode;->L1()Lq0/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public r()Lr0/h;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->x()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, Landroidx/compose/ui/focus/r;->d(Landroidx/compose/ui/focus/FocusTargetNode;)Lr0/h;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public s(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->h:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->h:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    if-eq v0, p1, :cond_1

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0, v1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->A(Z)V

    .line 11
    .line 12
    .line 13
    :cond_1
    sget-boolean v2, Ll0/h;->c:Z

    .line 14
    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->u()Lt/L;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v3, v2, Lt/V;->a:[Ljava/lang/Object;

    .line 22
    .line 23
    iget v2, v2, Lt/V;->b:I

    .line 24
    .line 25
    :goto_0
    if-ge v1, v2, :cond_2

    .line 26
    .line 27
    aget-object v4, v3, v1

    .line 28
    .line 29
    check-cast v4, Lq0/g;

    .line 30
    .line 31
    invoke-interface {v4, v0, p1}, Lq0/g;->b(Landroidx/compose/ui/focus/o;Landroidx/compose/ui/focus/o;)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    return-void
.end method

.method public t()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->c:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1, v1}, Landroidx/compose/ui/focus/q;->b(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public u()Lt/L;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->g:Lt/L;

    .line 2
    .line 3
    return-object v0
.end method

.method public v(Z)V
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {p0, p1, v1, v1, v0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->p(ZZZI)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final y()Landroidx/compose/ui/focus/FocusTargetNode;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->c:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    return-object v0
.end method
