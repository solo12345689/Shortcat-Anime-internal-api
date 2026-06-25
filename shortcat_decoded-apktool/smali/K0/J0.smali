.class public abstract LK0/J0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LK0/j;Ljava/lang/Object;)LK0/I0;
    .locals 10

    .line 1
    const/high16 v0, 0x40000

    .line 2
    .line 3
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const-string v1, "visitAncestors called on an unattached node"

    .line 18
    .line 19
    invoke-static {v1}, LH0/a;->b(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {p0}, LK0/k;->n(LK0/j;)LK0/J;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :goto_0
    const/4 v2, 0x0

    .line 35
    if-eqz p0, :cond_b

    .line 36
    .line 37
    invoke-virtual {p0}, LK0/J;->t0()LK0/c0;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    and-int/2addr v3, v0

    .line 50
    if-eqz v3, :cond_9

    .line 51
    .line 52
    :goto_1
    if-eqz v1, :cond_9

    .line 53
    .line 54
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    and-int/2addr v3, v0

    .line 59
    if-eqz v3, :cond_8

    .line 60
    .line 61
    move-object v3, v1

    .line 62
    move-object v4, v2

    .line 63
    :goto_2
    if-eqz v3, :cond_8

    .line 64
    .line 65
    instance-of v5, v3, LK0/I0;

    .line 66
    .line 67
    if-eqz v5, :cond_1

    .line 68
    .line 69
    check-cast v3, LK0/I0;

    .line 70
    .line 71
    invoke-interface {v3}, LK0/I0;->B()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-static {p1, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_7

    .line 80
    .line 81
    return-object v3

    .line 82
    :cond_1
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    and-int/2addr v5, v0

    .line 87
    if-eqz v5, :cond_7

    .line 88
    .line 89
    instance-of v5, v3, LK0/m;

    .line 90
    .line 91
    if-eqz v5, :cond_7

    .line 92
    .line 93
    move-object v5, v3

    .line 94
    check-cast v5, LK0/m;

    .line 95
    .line 96
    invoke-virtual {v5}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    const/4 v6, 0x0

    .line 101
    move v7, v6

    .line 102
    :goto_3
    const/4 v8, 0x1

    .line 103
    if-eqz v5, :cond_6

    .line 104
    .line 105
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    and-int/2addr v9, v0

    .line 110
    if-eqz v9, :cond_5

    .line 111
    .line 112
    add-int/lit8 v7, v7, 0x1

    .line 113
    .line 114
    if-ne v7, v8, :cond_2

    .line 115
    .line 116
    move-object v3, v5

    .line 117
    goto :goto_4

    .line 118
    :cond_2
    if-nez v4, :cond_3

    .line 119
    .line 120
    new-instance v4, La0/c;

    .line 121
    .line 122
    const/16 v8, 0x10

    .line 123
    .line 124
    new-array v8, v8, [Landroidx/compose/ui/e$c;

    .line 125
    .line 126
    invoke-direct {v4, v8, v6}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 127
    .line 128
    .line 129
    :cond_3
    if-eqz v3, :cond_4

    .line 130
    .line 131
    invoke-virtual {v4, v3}, La0/c;->c(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-object v3, v2

    .line 135
    :cond_4
    invoke-virtual {v4, v5}, La0/c;->c(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    :cond_5
    :goto_4
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    goto :goto_3

    .line 143
    :cond_6
    if-ne v7, v8, :cond_7

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_7
    invoke-static {v4}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    goto :goto_2

    .line 151
    :cond_8
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    goto :goto_1

    .line 156
    :cond_9
    invoke-virtual {p0}, LK0/J;->A0()LK0/J;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    if-eqz p0, :cond_a

    .line 161
    .line 162
    invoke-virtual {p0}, LK0/J;->t0()LK0/c0;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    if-eqz v1, :cond_a

    .line 167
    .line 168
    invoke-virtual {v1}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    goto/16 :goto_0

    .line 173
    .line 174
    :cond_a
    move-object v1, v2

    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_b
    return-object v2
.end method

.method public static final b(LK0/I0;)LK0/I0;
    .locals 11

    .line 1
    const/high16 v0, 0x40000

    .line 2
    .line 3
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const-string v1, "visitAncestors called on an unattached node"

    .line 18
    .line 19
    invoke-static {v1}, LH0/a;->b(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {p0}, LK0/k;->n(LK0/j;)LK0/J;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    :goto_0
    const/4 v3, 0x0

    .line 35
    if-eqz v2, :cond_b

    .line 36
    .line 37
    invoke-virtual {v2}, LK0/J;->t0()LK0/c0;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v4}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    and-int/2addr v4, v0

    .line 50
    if-eqz v4, :cond_9

    .line 51
    .line 52
    :goto_1
    if-eqz v1, :cond_9

    .line 53
    .line 54
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    and-int/2addr v4, v0

    .line 59
    if-eqz v4, :cond_8

    .line 60
    .line 61
    move-object v4, v1

    .line 62
    move-object v5, v3

    .line 63
    :goto_2
    if-eqz v4, :cond_8

    .line 64
    .line 65
    instance-of v6, v4, LK0/I0;

    .line 66
    .line 67
    if-eqz v6, :cond_1

    .line 68
    .line 69
    check-cast v4, LK0/I0;

    .line 70
    .line 71
    invoke-interface {p0}, LK0/I0;->B()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-interface {v4}, LK0/I0;->B()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-eqz v6, :cond_7

    .line 84
    .line 85
    invoke-static {p0, v4}, Ll0/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-eqz v6, :cond_7

    .line 90
    .line 91
    return-object v4

    .line 92
    :cond_1
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    and-int/2addr v6, v0

    .line 97
    if-eqz v6, :cond_7

    .line 98
    .line 99
    instance-of v6, v4, LK0/m;

    .line 100
    .line 101
    if-eqz v6, :cond_7

    .line 102
    .line 103
    move-object v6, v4

    .line 104
    check-cast v6, LK0/m;

    .line 105
    .line 106
    invoke-virtual {v6}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    const/4 v7, 0x0

    .line 111
    move v8, v7

    .line 112
    :goto_3
    const/4 v9, 0x1

    .line 113
    if-eqz v6, :cond_6

    .line 114
    .line 115
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    and-int/2addr v10, v0

    .line 120
    if-eqz v10, :cond_5

    .line 121
    .line 122
    add-int/lit8 v8, v8, 0x1

    .line 123
    .line 124
    if-ne v8, v9, :cond_2

    .line 125
    .line 126
    move-object v4, v6

    .line 127
    goto :goto_4

    .line 128
    :cond_2
    if-nez v5, :cond_3

    .line 129
    .line 130
    new-instance v5, La0/c;

    .line 131
    .line 132
    const/16 v9, 0x10

    .line 133
    .line 134
    new-array v9, v9, [Landroidx/compose/ui/e$c;

    .line 135
    .line 136
    invoke-direct {v5, v9, v7}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 137
    .line 138
    .line 139
    :cond_3
    if-eqz v4, :cond_4

    .line 140
    .line 141
    invoke-virtual {v5, v4}, La0/c;->c(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-object v4, v3

    .line 145
    :cond_4
    invoke-virtual {v5, v6}, La0/c;->c(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    :cond_5
    :goto_4
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    goto :goto_3

    .line 153
    :cond_6
    if-ne v8, v9, :cond_7

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_7
    invoke-static {v5}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    goto :goto_2

    .line 161
    :cond_8
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    goto :goto_1

    .line 166
    :cond_9
    invoke-virtual {v2}, LK0/J;->A0()LK0/J;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    if-eqz v2, :cond_a

    .line 171
    .line 172
    invoke-virtual {v2}, LK0/J;->t0()LK0/c0;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    if-eqz v1, :cond_a

    .line 177
    .line 178
    invoke-virtual {v1}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_a
    move-object v1, v3

    .line 185
    goto/16 :goto_0

    .line 186
    .line 187
    :cond_b
    return-object v3
.end method

.method public static final c(LK0/j;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 10

    .line 1
    const/high16 v0, 0x40000

    .line 2
    .line 3
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const-string v1, "visitAncestors called on an unattached node"

    .line 18
    .line 19
    invoke-static {v1}, LH0/a;->b(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {p0}, LK0/k;->n(LK0/j;)LK0/J;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :goto_0
    if-eqz p0, :cond_e

    .line 35
    .line 36
    invoke-virtual {p0}, LK0/J;->t0()LK0/c0;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    and-int/2addr v2, v0

    .line 49
    const/4 v3, 0x0

    .line 50
    if-eqz v2, :cond_c

    .line 51
    .line 52
    :goto_1
    if-eqz v1, :cond_c

    .line 53
    .line 54
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    and-int/2addr v2, v0

    .line 59
    if-eqz v2, :cond_b

    .line 60
    .line 61
    move-object v2, v1

    .line 62
    move-object v4, v3

    .line 63
    :goto_2
    if-eqz v2, :cond_b

    .line 64
    .line 65
    instance-of v5, v2, LK0/I0;

    .line 66
    .line 67
    const/4 v6, 0x1

    .line 68
    if-eqz v5, :cond_2

    .line 69
    .line 70
    check-cast v2, LK0/I0;

    .line 71
    .line 72
    invoke-interface {v2}, LK0/I0;->B()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-static {p1, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_1

    .line 81
    .line 82
    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Ljava/lang/Boolean;

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    :cond_1
    if-nez v6, :cond_a

    .line 93
    .line 94
    goto/16 :goto_7

    .line 95
    .line 96
    :cond_2
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    and-int/2addr v5, v0

    .line 101
    const/4 v7, 0x0

    .line 102
    if-eqz v5, :cond_3

    .line 103
    .line 104
    move v5, v6

    .line 105
    goto :goto_3

    .line 106
    :cond_3
    move v5, v7

    .line 107
    :goto_3
    if-eqz v5, :cond_a

    .line 108
    .line 109
    instance-of v5, v2, LK0/m;

    .line 110
    .line 111
    if-eqz v5, :cond_a

    .line 112
    .line 113
    move-object v5, v2

    .line 114
    check-cast v5, LK0/m;

    .line 115
    .line 116
    invoke-virtual {v5}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    move v8, v7

    .line 121
    :goto_4
    if-eqz v5, :cond_9

    .line 122
    .line 123
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    and-int/2addr v9, v0

    .line 128
    if-eqz v9, :cond_4

    .line 129
    .line 130
    move v9, v6

    .line 131
    goto :goto_5

    .line 132
    :cond_4
    move v9, v7

    .line 133
    :goto_5
    if-eqz v9, :cond_8

    .line 134
    .line 135
    add-int/lit8 v8, v8, 0x1

    .line 136
    .line 137
    if-ne v8, v6, :cond_5

    .line 138
    .line 139
    move-object v2, v5

    .line 140
    goto :goto_6

    .line 141
    :cond_5
    if-nez v4, :cond_6

    .line 142
    .line 143
    new-instance v4, La0/c;

    .line 144
    .line 145
    const/16 v9, 0x10

    .line 146
    .line 147
    new-array v9, v9, [Landroidx/compose/ui/e$c;

    .line 148
    .line 149
    invoke-direct {v4, v9, v7}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 150
    .line 151
    .line 152
    :cond_6
    if-eqz v2, :cond_7

    .line 153
    .line 154
    invoke-virtual {v4, v2}, La0/c;->c(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-object v2, v3

    .line 158
    :cond_7
    invoke-virtual {v4, v5}, La0/c;->c(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    :cond_8
    :goto_6
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    goto :goto_4

    .line 166
    :cond_9
    if-ne v8, v6, :cond_a

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_a
    invoke-static {v4}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    goto :goto_2

    .line 174
    :cond_b
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    goto :goto_1

    .line 179
    :cond_c
    invoke-virtual {p0}, LK0/J;->A0()LK0/J;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    if-eqz p0, :cond_d

    .line 184
    .line 185
    invoke-virtual {p0}, LK0/J;->t0()LK0/c0;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    if-eqz v1, :cond_d

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
    :cond_d
    move-object v1, v3

    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :cond_e
    :goto_7
    return-void
.end method

.method public static final d(LK0/I0;Lkotlin/jvm/functions/Function1;)V
    .locals 11

    .line 1
    const/high16 v0, 0x40000

    .line 2
    .line 3
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const-string v1, "visitAncestors called on an unattached node"

    .line 18
    .line 19
    invoke-static {v1}, LH0/a;->b(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {p0}, LK0/k;->n(LK0/j;)LK0/J;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    :goto_0
    if-eqz v2, :cond_e

    .line 35
    .line 36
    invoke-virtual {v2}, LK0/J;->t0()LK0/c0;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3}, LK0/c0;->k()Landroidx/compose/ui/e$c;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    and-int/2addr v3, v0

    .line 49
    const/4 v4, 0x0

    .line 50
    if-eqz v3, :cond_c

    .line 51
    .line 52
    :goto_1
    if-eqz v1, :cond_c

    .line 53
    .line 54
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    and-int/2addr v3, v0

    .line 59
    if-eqz v3, :cond_b

    .line 60
    .line 61
    move-object v3, v1

    .line 62
    move-object v5, v4

    .line 63
    :goto_2
    if-eqz v3, :cond_b

    .line 64
    .line 65
    instance-of v6, v3, LK0/I0;

    .line 66
    .line 67
    const/4 v7, 0x1

    .line 68
    if-eqz v6, :cond_2

    .line 69
    .line 70
    check-cast v3, LK0/I0;

    .line 71
    .line 72
    invoke-interface {p0}, LK0/I0;->B()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-interface {v3}, LK0/I0;->B()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-eqz v6, :cond_1

    .line 85
    .line 86
    invoke-static {p0, v3}, Ll0/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-eqz v6, :cond_1

    .line 91
    .line 92
    invoke-interface {p1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    :cond_1
    if-nez v7, :cond_a

    .line 103
    .line 104
    goto/16 :goto_7

    .line 105
    .line 106
    :cond_2
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    and-int/2addr v6, v0

    .line 111
    const/4 v8, 0x0

    .line 112
    if-eqz v6, :cond_3

    .line 113
    .line 114
    move v6, v7

    .line 115
    goto :goto_3

    .line 116
    :cond_3
    move v6, v8

    .line 117
    :goto_3
    if-eqz v6, :cond_a

    .line 118
    .line 119
    instance-of v6, v3, LK0/m;

    .line 120
    .line 121
    if-eqz v6, :cond_a

    .line 122
    .line 123
    move-object v6, v3

    .line 124
    check-cast v6, LK0/m;

    .line 125
    .line 126
    invoke-virtual {v6}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    move v9, v8

    .line 131
    :goto_4
    if-eqz v6, :cond_9

    .line 132
    .line 133
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    and-int/2addr v10, v0

    .line 138
    if-eqz v10, :cond_4

    .line 139
    .line 140
    move v10, v7

    .line 141
    goto :goto_5

    .line 142
    :cond_4
    move v10, v8

    .line 143
    :goto_5
    if-eqz v10, :cond_8

    .line 144
    .line 145
    add-int/lit8 v9, v9, 0x1

    .line 146
    .line 147
    if-ne v9, v7, :cond_5

    .line 148
    .line 149
    move-object v3, v6

    .line 150
    goto :goto_6

    .line 151
    :cond_5
    if-nez v5, :cond_6

    .line 152
    .line 153
    new-instance v5, La0/c;

    .line 154
    .line 155
    const/16 v10, 0x10

    .line 156
    .line 157
    new-array v10, v10, [Landroidx/compose/ui/e$c;

    .line 158
    .line 159
    invoke-direct {v5, v10, v8}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 160
    .line 161
    .line 162
    :cond_6
    if-eqz v3, :cond_7

    .line 163
    .line 164
    invoke-virtual {v5, v3}, La0/c;->c(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-object v3, v4

    .line 168
    :cond_7
    invoke-virtual {v5, v6}, La0/c;->c(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    :cond_8
    :goto_6
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    goto :goto_4

    .line 176
    :cond_9
    if-ne v9, v7, :cond_a

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_a
    invoke-static {v5}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    goto :goto_2

    .line 184
    :cond_b
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    goto/16 :goto_1

    .line 189
    .line 190
    :cond_c
    invoke-virtual {v2}, LK0/J;->A0()LK0/J;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    if-eqz v2, :cond_d

    .line 195
    .line 196
    invoke-virtual {v2}, LK0/J;->t0()LK0/c0;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    if-eqz v1, :cond_d

    .line 201
    .line 202
    invoke-virtual {v1}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :cond_d
    move-object v1, v4

    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :cond_e
    :goto_7
    return-void
.end method

.method public static final e(LK0/j;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 12

    .line 1
    const/high16 v0, 0x40000

    .line 2
    .line 3
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const-string v1, "visitSubtreeIf called on an unattached node"

    .line 18
    .line 19
    invoke-static {v1}, LH0/a;->b(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    new-instance v1, La0/c;

    .line 23
    .line 24
    const/16 v2, 0x10

    .line 25
    .line 26
    new-array v3, v2, [Landroidx/compose/ui/e$c;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-direct {v1, v3, v4}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    if-nez v3, :cond_1

    .line 41
    .line 42
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {v1, p0, v4}, LK0/k;->a(La0/c;Landroidx/compose/ui/e$c;Z)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v1, v3}, La0/c;->c(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_0
    invoke-virtual {v1}, La0/c;->p()I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_e

    .line 58
    .line 59
    invoke-virtual {v1}, La0/c;->p()I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    const/4 v3, 0x1

    .line 64
    sub-int/2addr p0, v3

    .line 65
    invoke-virtual {v1, p0}, La0/c;->y(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, Landroidx/compose/ui/e$c;

    .line 70
    .line 71
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    and-int/2addr v5, v0

    .line 76
    if-eqz v5, :cond_d

    .line 77
    .line 78
    move-object v5, p0

    .line 79
    :goto_1
    if-eqz v5, :cond_d

    .line 80
    .line 81
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    and-int/2addr v6, v0

    .line 86
    if-eqz v6, :cond_c

    .line 87
    .line 88
    const/4 v6, 0x0

    .line 89
    move-object v7, v5

    .line 90
    move-object v8, v6

    .line 91
    :goto_2
    if-eqz v7, :cond_c

    .line 92
    .line 93
    instance-of v9, v7, LK0/I0;

    .line 94
    .line 95
    if-eqz v9, :cond_5

    .line 96
    .line 97
    check-cast v7, LK0/I0;

    .line 98
    .line 99
    invoke-interface {v7}, LK0/I0;->B()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    invoke-static {p1, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    if-eqz v9, :cond_3

    .line 108
    .line 109
    invoke-interface {p2, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    check-cast v7, LK0/H0;

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_3
    sget-object v7, LK0/H0;->a:LK0/H0;

    .line 117
    .line 118
    :goto_3
    sget-object v9, LK0/H0;->c:LK0/H0;

    .line 119
    .line 120
    if-ne v7, v9, :cond_4

    .line 121
    .line 122
    return-void

    .line 123
    :cond_4
    sget-object v9, LK0/H0;->b:LK0/H0;

    .line 124
    .line 125
    if-eq v7, v9, :cond_2

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_5
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    and-int/2addr v9, v0

    .line 133
    if-eqz v9, :cond_b

    .line 134
    .line 135
    instance-of v9, v7, LK0/m;

    .line 136
    .line 137
    if-eqz v9, :cond_b

    .line 138
    .line 139
    move-object v9, v7

    .line 140
    check-cast v9, LK0/m;

    .line 141
    .line 142
    invoke-virtual {v9}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    move v10, v4

    .line 147
    :goto_4
    if-eqz v9, :cond_a

    .line 148
    .line 149
    invoke-virtual {v9}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 150
    .line 151
    .line 152
    move-result v11

    .line 153
    and-int/2addr v11, v0

    .line 154
    if-eqz v11, :cond_9

    .line 155
    .line 156
    add-int/lit8 v10, v10, 0x1

    .line 157
    .line 158
    if-ne v10, v3, :cond_6

    .line 159
    .line 160
    move-object v7, v9

    .line 161
    goto :goto_5

    .line 162
    :cond_6
    if-nez v8, :cond_7

    .line 163
    .line 164
    new-instance v8, La0/c;

    .line 165
    .line 166
    new-array v11, v2, [Landroidx/compose/ui/e$c;

    .line 167
    .line 168
    invoke-direct {v8, v11, v4}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 169
    .line 170
    .line 171
    :cond_7
    if-eqz v7, :cond_8

    .line 172
    .line 173
    invoke-virtual {v8, v7}, La0/c;->c(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-object v7, v6

    .line 177
    :cond_8
    invoke-virtual {v8, v9}, La0/c;->c(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    :cond_9
    :goto_5
    invoke-virtual {v9}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 181
    .line 182
    .line 183
    move-result-object v9

    .line 184
    goto :goto_4

    .line 185
    :cond_a
    if-ne v10, v3, :cond_b

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_b
    :goto_6
    invoke-static {v8}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    goto :goto_2

    .line 193
    :cond_c
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    goto :goto_1

    .line 198
    :cond_d
    invoke-static {v1, p0, v4}, LK0/k;->a(La0/c;Landroidx/compose/ui/e$c;Z)V

    .line 199
    .line 200
    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :cond_e
    return-void
.end method

.method public static final f(LK0/I0;Lkotlin/jvm/functions/Function1;)V
    .locals 13

    .line 1
    const/high16 v0, 0x40000

    .line 2
    .line 3
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const-string v1, "visitSubtreeIf called on an unattached node"

    .line 18
    .line 19
    invoke-static {v1}, LH0/a;->b(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    new-instance v1, La0/c;

    .line 23
    .line 24
    const/16 v2, 0x10

    .line 25
    .line 26
    new-array v3, v2, [Landroidx/compose/ui/e$c;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-direct {v1, v3, v4}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    if-nez v3, :cond_1

    .line 41
    .line 42
    invoke-interface {p0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {v1, v3, v4}, LK0/k;->a(La0/c;Landroidx/compose/ui/e$c;Z)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v1, v3}, La0/c;->c(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_0
    invoke-virtual {v1}, La0/c;->p()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_e

    .line 58
    .line 59
    invoke-virtual {v1}, La0/c;->p()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    const/4 v5, 0x1

    .line 64
    sub-int/2addr v3, v5

    .line 65
    invoke-virtual {v1, v3}, La0/c;->y(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Landroidx/compose/ui/e$c;

    .line 70
    .line 71
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->getAggregateChildKindSet$ui_release()I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    and-int/2addr v6, v0

    .line 76
    if-eqz v6, :cond_d

    .line 77
    .line 78
    move-object v6, v3

    .line 79
    :goto_1
    if-eqz v6, :cond_d

    .line 80
    .line 81
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    and-int/2addr v7, v0

    .line 86
    if-eqz v7, :cond_c

    .line 87
    .line 88
    const/4 v7, 0x0

    .line 89
    move-object v8, v6

    .line 90
    move-object v9, v7

    .line 91
    :goto_2
    if-eqz v8, :cond_c

    .line 92
    .line 93
    instance-of v10, v8, LK0/I0;

    .line 94
    .line 95
    if-eqz v10, :cond_5

    .line 96
    .line 97
    check-cast v8, LK0/I0;

    .line 98
    .line 99
    invoke-interface {p0}, LK0/I0;->B()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    invoke-interface {v8}, LK0/I0;->B()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v11

    .line 107
    invoke-static {v10, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    if-eqz v10, :cond_3

    .line 112
    .line 113
    invoke-static {p0, v8}, Ll0/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-eqz v10, :cond_3

    .line 118
    .line 119
    invoke-interface {p1, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    check-cast v8, LK0/H0;

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_3
    sget-object v8, LK0/H0;->a:LK0/H0;

    .line 127
    .line 128
    :goto_3
    sget-object v10, LK0/H0;->c:LK0/H0;

    .line 129
    .line 130
    if-ne v8, v10, :cond_4

    .line 131
    .line 132
    return-void

    .line 133
    :cond_4
    sget-object v10, LK0/H0;->b:LK0/H0;

    .line 134
    .line 135
    if-eq v8, v10, :cond_2

    .line 136
    .line 137
    goto :goto_6

    .line 138
    :cond_5
    invoke-virtual {v8}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 139
    .line 140
    .line 141
    move-result v10

    .line 142
    and-int/2addr v10, v0

    .line 143
    if-eqz v10, :cond_b

    .line 144
    .line 145
    instance-of v10, v8, LK0/m;

    .line 146
    .line 147
    if-eqz v10, :cond_b

    .line 148
    .line 149
    move-object v10, v8

    .line 150
    check-cast v10, LK0/m;

    .line 151
    .line 152
    invoke-virtual {v10}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    move v11, v4

    .line 157
    :goto_4
    if-eqz v10, :cond_a

    .line 158
    .line 159
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 160
    .line 161
    .line 162
    move-result v12

    .line 163
    and-int/2addr v12, v0

    .line 164
    if-eqz v12, :cond_9

    .line 165
    .line 166
    add-int/lit8 v11, v11, 0x1

    .line 167
    .line 168
    if-ne v11, v5, :cond_6

    .line 169
    .line 170
    move-object v8, v10

    .line 171
    goto :goto_5

    .line 172
    :cond_6
    if-nez v9, :cond_7

    .line 173
    .line 174
    new-instance v9, La0/c;

    .line 175
    .line 176
    new-array v12, v2, [Landroidx/compose/ui/e$c;

    .line 177
    .line 178
    invoke-direct {v9, v12, v4}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 179
    .line 180
    .line 181
    :cond_7
    if-eqz v8, :cond_8

    .line 182
    .line 183
    invoke-virtual {v9, v8}, La0/c;->c(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-object v8, v7

    .line 187
    :cond_8
    invoke-virtual {v9, v10}, La0/c;->c(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    :cond_9
    :goto_5
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 191
    .line 192
    .line 193
    move-result-object v10

    .line 194
    goto :goto_4

    .line 195
    :cond_a
    if-ne v11, v5, :cond_b

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_b
    :goto_6
    invoke-static {v9}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    goto :goto_2

    .line 203
    :cond_c
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    goto/16 :goto_1

    .line 208
    .line 209
    :cond_d
    invoke-static {v1, v3, v4}, LK0/k;->a(La0/c;Landroidx/compose/ui/e$c;Z)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :cond_e
    return-void
.end method
