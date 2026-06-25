.class public final Lcom/facebook/react/views/scroll/x;
.super Lcom/facebook/react/views/scroll/v;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final j:Z

.field private final k:Lcom/facebook/react/views/scroll/d;

.field private l:Ljava/util/Set;

.field private m:Ljava/util/Set;

.field private n:Ljava/util/Set;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    const-string v0, "scrollView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/v;-><init>(Landroid/view/ViewGroup;)V

    .line 7
    .line 8
    .line 9
    instance-of v0, p1, Lcom/facebook/react/views/scroll/k;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of p1, p1, Lcom/facebook/react/views/scroll/j;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    :cond_1
    :goto_0
    iput-boolean v1, p0, Lcom/facebook/react/views/scroll/x;->j:Z

    .line 21
    .line 22
    new-instance p1, Lcom/facebook/react/views/scroll/d;

    .line 23
    .line 24
    invoke-direct {p1, v1}, Lcom/facebook/react/views/scroll/d;-><init>(Z)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lcom/facebook/react/views/scroll/x;->k:Lcom/facebook/react/views/scroll/d;

    .line 28
    .line 29
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/facebook/react/views/scroll/x;->l:Ljava/util/Set;

    .line 35
    .line 36
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lcom/facebook/react/views/scroll/x;->m:Ljava/util/Set;

    .line 42
    .line 43
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lcom/facebook/react/views/scroll/x;->n:Ljava/util/Set;

    .line 49
    .line 50
    return-void
.end method

.method private final u(Lcom/facebook/react/views/scroll/r;)V
    .locals 7

    .line 1
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LQ7/a;->d:LQ7/a;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->d()Landroid/graphics/Rect;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->l()Landroid/graphics/Rect;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-static {v0, v3}, Lcom/facebook/react/views/scroll/t;->b(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->l()Landroid/graphics/Rect;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->g()Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->j()Landroid/view/ViewGroup;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Landroid/view/View;->hasWindowFocus()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    sget-object v0, LQ7/a;->b:LQ7/a;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    sget-object v0, LQ7/a;->c:LQ7/a;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    sget-object v0, LQ7/a;->b:LQ7/a;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->i()Landroid/graphics/Rect;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-static {v0, v3}, Lcom/facebook/react/views/scroll/t;->b(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    sget-object v0, LQ7/a;->c:LQ7/a;

    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->i()Landroid/graphics/Rect;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    goto :goto_0

    .line 67
    :cond_3
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->e()D

    .line 68
    .line 69
    .line 70
    move-result-wide v3

    .line 71
    const-wide/16 v5, 0x0

    .line 72
    .line 73
    cmpl-double v3, v3, v5

    .line 74
    .line 75
    if-lez v3, :cond_4

    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->f()Landroid/graphics/Rect;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-static {v0, v3}, Lcom/facebook/react/views/scroll/t;->b(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    const/4 v0, 0x0

    .line 88
    goto :goto_0

    .line 89
    :cond_4
    move-object v0, v1

    .line 90
    :goto_0
    if-eqz v0, :cond_5

    .line 91
    .line 92
    invoke-interface {p1, v0, v2}, Lcom/facebook/react/views/scroll/r;->i(LQ7/a;Landroid/graphics/Rect;)V

    .line 93
    .line 94
    .line 95
    :cond_5
    sget-object v2, LQ7/a;->b:LQ7/a;

    .line 96
    .line 97
    if-ne v0, v2, :cond_6

    .line 98
    .line 99
    iget-object v0, p0, Lcom/facebook/react/views/scroll/x;->l:Ljava/util/Set;

    .line 100
    .line 101
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Lcom/facebook/react/views/scroll/x;->m:Ljava/util/Set;

    .line 109
    .line 110
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, Lcom/facebook/react/views/scroll/x;->n:Ljava/util/Set;

    .line 118
    .line 119
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_6
    sget-object v2, LQ7/a;->c:LQ7/a;

    .line 128
    .line 129
    if-ne v0, v2, :cond_7

    .line 130
    .line 131
    iget-object v0, p0, Lcom/facebook/react/views/scroll/x;->l:Ljava/util/Set;

    .line 132
    .line 133
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    iget-object v0, p0, Lcom/facebook/react/views/scroll/x;->m:Ljava/util/Set;

    .line 141
    .line 142
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    iget-object v0, p0, Lcom/facebook/react/views/scroll/x;->n:Ljava/util/Set;

    .line 150
    .line 151
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_7
    if-ne v0, v1, :cond_8

    .line 160
    .line 161
    iget-object v0, p0, Lcom/facebook/react/views/scroll/x;->l:Ljava/util/Set;

    .line 162
    .line 163
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    iget-object v0, p0, Lcom/facebook/react/views/scroll/x;->m:Ljava/util/Set;

    .line 171
    .line 172
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    iget-object v0, p0, Lcom/facebook/react/views/scroll/x;->n:Ljava/util/Set;

    .line 180
    .line 181
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_8
    iget-object v0, p0, Lcom/facebook/react/views/scroll/x;->l:Ljava/util/Set;

    .line 190
    .line 191
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    iget-object v0, p0, Lcom/facebook/react/views/scroll/x;->m:Ljava/util/Set;

    .line 199
    .line 200
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    iget-object v0, p0, Lcom/facebook/react/views/scroll/x;->n:Ljava/util/Set;

    .line 208
    .line 209
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    return-void
.end method

.method private final v()V
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/x;->t()Lcom/facebook/react/views/scroll/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->l()Landroid/graphics/Rect;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/facebook/react/views/scroll/d;->w(Landroid/graphics/Rect;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/x;->t()Lcom/facebook/react/views/scroll/d;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->i()Landroid/graphics/Rect;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Lcom/facebook/react/views/scroll/d;->w(Landroid/graphics/Rect;)Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/x;->t()Lcom/facebook/react/views/scroll/d;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->f()Landroid/graphics/Rect;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v2, v3}, Lcom/facebook/react/views/scroll/d;->w(Landroid/graphics/Rect;)Ljava/util/Set;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {}, Lcom/facebook/react/views/scroll/t;->a()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const-string v4, "VirtualViewContainerStateExperimental:"

    .line 42
    .line 43
    const-string v5, "updateModes"

    .line 44
    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-static {}, Lh7/b;->B()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    new-instance v3, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    iget-object v6, p0, Lcom/facebook/react/views/scroll/x;->n:Ljava/util/Set;

    .line 69
    .line 70
    iget-object v7, p0, Lcom/facebook/react/views/scroll/x;->m:Ljava/util/Set;

    .line 71
    .line 72
    iget-object v8, p0, Lcom/facebook/react/views/scroll/x;->l:Ljava/util/Set;

    .line 73
    .line 74
    new-instance v9, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string v10, "V: "

    .line 80
    .line 81
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v6, ", P: "

    .line 88
    .line 89
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v6, ", HPV: "

    .line 96
    .line 97
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    invoke-static {v3, v6}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :cond_0
    move-object v3, v0

    .line 111
    check-cast v3, Ljava/lang/Iterable;

    .line 112
    .line 113
    invoke-static {v1, v3}, LUd/a0;->j(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-static {}, Lcom/facebook/react/views/scroll/t;->a()Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_1

    .line 122
    .line 123
    invoke-static {}, Lh7/b;->B()Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-eqz v3, :cond_1

    .line 128
    .line 129
    new-instance v3, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    new-instance v6, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 147
    .line 148
    .line 149
    const-string v7, "V\': "

    .line 150
    .line 151
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v7, ", P\': "

    .line 158
    .line 159
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const-string v7, ", HPV\': "

    .line 166
    .line 167
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-static {v3, v6}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    :cond_1
    iget-object v3, p0, Lcom/facebook/react/views/scroll/x;->n:Ljava/util/Set;

    .line 181
    .line 182
    check-cast v3, Ljava/lang/Iterable;

    .line 183
    .line 184
    invoke-static {v0, v3}, LUd/a0;->j(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    iget-object v6, p0, Lcom/facebook/react/views/scroll/x;->m:Ljava/util/Set;

    .line 189
    .line 190
    check-cast v6, Ljava/lang/Iterable;

    .line 191
    .line 192
    invoke-static {v1, v6}, LUd/a0;->j(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    iget-object v7, p0, Lcom/facebook/react/views/scroll/x;->l:Ljava/util/Set;

    .line 197
    .line 198
    check-cast v2, Ljava/lang/Iterable;

    .line 199
    .line 200
    invoke-static {v7, v2}, LUd/a0;->j(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    invoke-static {}, Lcom/facebook/react/views/scroll/t;->a()Z

    .line 205
    .line 206
    .line 207
    move-result v8

    .line 208
    if-eqz v8, :cond_2

    .line 209
    .line 210
    invoke-static {}, Lh7/b;->B()Z

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    if-eqz v8, :cond_2

    .line 215
    .line 216
    new-instance v8, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    new-instance v5, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 234
    .line 235
    .line 236
    const-string v8, "toV: "

    .line 237
    .line 238
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const-string v8, ", toP: "

    .line 245
    .line 246
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v8, ", toH: "

    .line 253
    .line 254
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    invoke-static {v4, v5}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    :cond_2
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    :cond_3
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    if-eqz v4, :cond_4

    .line 276
    .line 277
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    check-cast v4, Ljava/lang/String;

    .line 282
    .line 283
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/x;->t()Lcom/facebook/react/views/scroll/d;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    invoke-virtual {v5, v4}, Lcom/facebook/react/views/scroll/d;->r(Ljava/lang/String;)Lcom/facebook/react/views/scroll/r;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    if-eqz v4, :cond_3

    .line 292
    .line 293
    sget-object v5, LQ7/a;->b:LQ7/a;

    .line 294
    .line 295
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->l()Landroid/graphics/Rect;

    .line 296
    .line 297
    .line 298
    move-result-object v8

    .line 299
    invoke-interface {v4, v5, v8}, Lcom/facebook/react/views/scroll/r;->i(LQ7/a;Landroid/graphics/Rect;)V

    .line 300
    .line 301
    .line 302
    goto :goto_0

    .line 303
    :cond_4
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    :cond_5
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    if-eqz v4, :cond_6

    .line 312
    .line 313
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v4

    .line 317
    check-cast v4, Ljava/lang/String;

    .line 318
    .line 319
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/x;->t()Lcom/facebook/react/views/scroll/d;

    .line 320
    .line 321
    .line 322
    move-result-object v5

    .line 323
    invoke-virtual {v5, v4}, Lcom/facebook/react/views/scroll/d;->r(Ljava/lang/String;)Lcom/facebook/react/views/scroll/r;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    if-eqz v4, :cond_5

    .line 328
    .line 329
    sget-object v5, LQ7/a;->c:LQ7/a;

    .line 330
    .line 331
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->i()Landroid/graphics/Rect;

    .line 332
    .line 333
    .line 334
    move-result-object v6

    .line 335
    invoke-interface {v4, v5, v6}, Lcom/facebook/react/views/scroll/r;->i(LQ7/a;Landroid/graphics/Rect;)V

    .line 336
    .line 337
    .line 338
    goto :goto_1

    .line 339
    :cond_6
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    :cond_7
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    if-eqz v4, :cond_8

    .line 348
    .line 349
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    check-cast v4, Ljava/lang/String;

    .line 354
    .line 355
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/x;->t()Lcom/facebook/react/views/scroll/d;

    .line 356
    .line 357
    .line 358
    move-result-object v5

    .line 359
    invoke-virtual {v5, v4}, Lcom/facebook/react/views/scroll/d;->r(Ljava/lang/String;)Lcom/facebook/react/views/scroll/r;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    if-eqz v4, :cond_7

    .line 364
    .line 365
    sget-object v5, LQ7/a;->d:LQ7/a;

    .line 366
    .line 367
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->d()Landroid/graphics/Rect;

    .line 368
    .line 369
    .line 370
    move-result-object v6

    .line 371
    invoke-interface {v4, v5, v6}, Lcom/facebook/react/views/scroll/r;->i(LQ7/a;Landroid/graphics/Rect;)V

    .line 372
    .line 373
    .line 374
    goto :goto_2

    .line 375
    :cond_8
    iput-object v0, p0, Lcom/facebook/react/views/scroll/x;->n:Ljava/util/Set;

    .line 376
    .line 377
    check-cast v1, Ljava/lang/Iterable;

    .line 378
    .line 379
    invoke-static {v1}, LUd/u;->e1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    iput-object v0, p0, Lcom/facebook/react/views/scroll/x;->m:Ljava/util/Set;

    .line 384
    .line 385
    invoke-static {v2}, LUd/u;->e1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    iput-object v0, p0, Lcom/facebook/react/views/scroll/x;->l:Ljava/util/Set;

    .line 390
    .line 391
    return-void
.end method


# virtual methods
.method public bridge synthetic k()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/x;->t()Lcom/facebook/react/views/scroll/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public m(Lcom/facebook/react/views/scroll/r;)V
    .locals 4

    .line 1
    const-string v0, "virtualView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/x;->t()Lcom/facebook/react/views/scroll/d;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/scroll/d;->b(Lcom/facebook/react/views/scroll/r;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const-string v1, "virtualViewID="

    .line 15
    .line 16
    const-string v2, "VirtualViewContainerStateExperimental:"

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-static {}, Lcom/facebook/react/views/scroll/t;->a()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-static {}, Lh7/b;->B()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v2, "add"

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    new-instance v3, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v0, v1}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    invoke-static {}, Lcom/facebook/react/views/scroll/t;->a()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    invoke-static {}, Lh7/b;->B()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_1

    .line 83
    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v2, "update"

    .line 93
    .line 94
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    new-instance v3, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-static {v0, v1}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/scroll/x;->p(Lcom/facebook/react/views/scroll/r;)V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method protected p(Lcom/facebook/react/views/scroll/r;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->r()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/x;->u(Lcom/facebook/react/views/scroll/r;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/x;->v()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method protected t()Lcom/facebook/react/views/scroll/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/x;->k:Lcom/facebook/react/views/scroll/d;

    .line 2
    .line 3
    return-object v0
.end method
