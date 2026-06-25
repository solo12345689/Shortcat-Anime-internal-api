.class public interface abstract LJ0/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJ0/k;
.implements LK0/j;


# virtual methods
.method public h0()LJ0/g;
    .locals 1

    .line 1
    sget-object v0, LJ0/b;->a:LJ0/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public j(LJ0/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "ModifierLocal accessed from an unattached node"

    .line 12
    .line 13
    invoke-static {v0}, LH0/a;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/16 v0, 0x20

    .line 17
    .line 18
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    const-string v1, "visitAncestors called on an unattached node"

    .line 33
    .line 34
    invoke-static {v1}, LH0/a;->b(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {p0}, LK0/k;->n(LK0/j;)LK0/J;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :goto_0
    if-eqz v2, :cond_c

    .line 50
    .line 51
    invoke-virtual {v2}, LK0/J;->t0()LK0/c0;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    and-int/2addr v3, v0

    .line 64
    const/4 v4, 0x0

    .line 65
    if-eqz v3, :cond_a

    .line 66
    .line 67
    :goto_1
    if-eqz v1, :cond_a

    .line 68
    .line 69
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    and-int/2addr v3, v0

    .line 74
    if-eqz v3, :cond_9

    .line 75
    .line 76
    move-object v3, v1

    .line 77
    move-object v5, v4

    .line 78
    :goto_2
    if-eqz v3, :cond_9

    .line 79
    .line 80
    instance-of v6, v3, LJ0/h;

    .line 81
    .line 82
    if-eqz v6, :cond_2

    .line 83
    .line 84
    check-cast v3, LJ0/h;

    .line 85
    .line 86
    invoke-interface {v3}, LJ0/h;->h0()LJ0/g;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-virtual {v6, p1}, LJ0/g;->a(LJ0/c;)Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-eqz v6, :cond_8

    .line 95
    .line 96
    invoke-interface {v3}, LJ0/h;->h0()LJ0/g;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0, p1}, LJ0/g;->b(LJ0/c;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    return-object p1

    .line 105
    :cond_2
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    and-int/2addr v6, v0

    .line 110
    if-eqz v6, :cond_8

    .line 111
    .line 112
    instance-of v6, v3, LK0/m;

    .line 113
    .line 114
    if-eqz v6, :cond_8

    .line 115
    .line 116
    move-object v6, v3

    .line 117
    check-cast v6, LK0/m;

    .line 118
    .line 119
    invoke-virtual {v6}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    const/4 v7, 0x0

    .line 124
    move v8, v7

    .line 125
    :goto_3
    const/4 v9, 0x1

    .line 126
    if-eqz v6, :cond_7

    .line 127
    .line 128
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    and-int/2addr v10, v0

    .line 133
    if-eqz v10, :cond_6

    .line 134
    .line 135
    add-int/lit8 v8, v8, 0x1

    .line 136
    .line 137
    if-ne v8, v9, :cond_3

    .line 138
    .line 139
    move-object v3, v6

    .line 140
    goto :goto_4

    .line 141
    :cond_3
    if-nez v5, :cond_4

    .line 142
    .line 143
    new-instance v5, La0/c;

    .line 144
    .line 145
    const/16 v9, 0x10

    .line 146
    .line 147
    new-array v9, v9, [Landroidx/compose/ui/e$c;

    .line 148
    .line 149
    invoke-direct {v5, v9, v7}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 150
    .line 151
    .line 152
    :cond_4
    if-eqz v3, :cond_5

    .line 153
    .line 154
    invoke-virtual {v5, v3}, La0/c;->c(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-object v3, v4

    .line 158
    :cond_5
    invoke-virtual {v5, v6}, La0/c;->c(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    :cond_6
    :goto_4
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    goto :goto_3

    .line 166
    :cond_7
    if-ne v8, v9, :cond_8

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_8
    invoke-static {v5}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    goto :goto_2

    .line 174
    :cond_9
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    goto :goto_1

    .line 179
    :cond_a
    invoke-virtual {v2}, LK0/J;->A0()LK0/J;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    if-eqz v2, :cond_b

    .line 184
    .line 185
    invoke-virtual {v2}, LK0/J;->t0()LK0/c0;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    if-eqz v1, :cond_b

    .line 190
    .line 191
    invoke-virtual {v1}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :cond_b
    move-object v1, v4

    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :cond_c
    invoke-virtual {p1}, LJ0/c;->a()Lie/a;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    return-object p1
.end method
