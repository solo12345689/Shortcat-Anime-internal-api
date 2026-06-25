.class public final Lcom/swmansion/rnscreens/gamma/stack/host/h;
.super Landroidx/coordinatorlayout/widget/CoordinatorLayout;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/fragment/app/K$o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/gamma/stack/host/h$a;
    }
.end annotation


# static fields
.field public static final E:Lcom/swmansion/rnscreens/gamma/stack/host/h$a;


# instance fields
.field private final A:Ljava/util/List;

.field private final B:Ljava/util/List;

.field private final C:Ljava/util/List;

.field private final D:Lcom/swmansion/rnscreens/gamma/stack/host/c;

.field private final y:Ljava/lang/ref/WeakReference;

.field private z:Landroidx/fragment/app/K;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/swmansion/rnscreens/gamma/stack/host/h$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/gamma/stack/host/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->E:Lcom/swmansion/rnscreens/gamma/stack/host/h$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/ref/WeakReference;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "delegate"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->y:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->A:Ljava/util/List;

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->B:Ljava/util/List;

    .line 29
    .line 30
    new-instance p1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->C:Ljava/util/List;

    .line 36
    .line 37
    new-instance p1, Lcom/swmansion/rnscreens/gamma/stack/host/c;

    .line 38
    .line 39
    invoke-direct {p1}, Lcom/swmansion/rnscreens/gamma/stack/host/c;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->D:Lcom/swmansion/rnscreens/gamma/stack/host/c;

    .line 43
    .line 44
    sget-object p1, LXa/g;->a:LXa/g;

    .line 45
    .line 46
    invoke-virtual {p1}, LXa/g;->a()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-virtual {p0, p1}, Landroid/view/View;->setId(I)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method private final f0()Ljava/util/List;
    .locals 11

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->B:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x1

    .line 17
    if-eqz v2, :cond_5

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lcom/swmansion/rnscreens/gamma/stack/host/e;

    .line 24
    .line 25
    iget-object v4, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->A:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_1

    .line 36
    .line 37
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    move-object v6, v5

    .line 42
    check-cast v6, Lcom/swmansion/rnscreens/gamma/stack/screen/d;

    .line 43
    .line 44
    invoke-virtual {v6}, Lcom/swmansion/rnscreens/gamma/stack/screen/d;->w()Lcom/swmansion/rnscreens/gamma/stack/screen/a;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/gamma/stack/host/e;->a()Lcom/swmansion/rnscreens/gamma/stack/screen/a;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    if-ne v6, v7, :cond_0

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const/4 v5, 0x0

    .line 56
    :goto_1
    if-eqz v5, :cond_4

    .line 57
    .line 58
    check-cast v5, Lcom/swmansion/rnscreens/gamma/stack/screen/d;

    .line 59
    .line 60
    iget-object v2, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->A:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-le v2, v3, :cond_3

    .line 67
    .line 68
    new-instance v2, Lcom/swmansion/rnscreens/gamma/stack/host/d;

    .line 69
    .line 70
    invoke-direct {v2, v5}, Lcom/swmansion/rnscreens/gamma/stack/host/d;-><init>(Lcom/swmansion/rnscreens/gamma/stack/screen/d;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->A:Ljava/util/List;

    .line 77
    .line 78
    invoke-static {v2}, LUd/u;->o(Ljava/util/List;)I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    invoke-interface {v2, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    if-ne v2, v5, :cond_2

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    const-string v1, "[RNScreens] Attempt to pop non-top screen"

    .line 92
    .line 93
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v0

    .line 97
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    const-string v1, "[RNScreens] Attempt to pop last screen from the stack"

    .line 100
    .line 101
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw v0

    .line 105
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 106
    .line 107
    const-string v1, "[RNScreens] Unable to find a fragment to pop"

    .line 108
    .line 109
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v0

    .line 113
    :cond_5
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->C:Ljava/util/List;

    .line 114
    .line 115
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_6

    .line 124
    .line 125
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    check-cast v2, Lcom/swmansion/rnscreens/gamma/stack/host/f;

    .line 130
    .line 131
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/gamma/stack/host/f;->a()Lcom/swmansion/rnscreens/gamma/stack/screen/a;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-direct {p0, v2}, Lcom/swmansion/rnscreens/gamma/stack/host/h;->g0(Lcom/swmansion/rnscreens/gamma/stack/screen/a;)Lcom/swmansion/rnscreens/gamma/stack/screen/d;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    new-instance v4, Lcom/swmansion/rnscreens/gamma/stack/host/a;

    .line 140
    .line 141
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    iget-object v2, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->A:Ljava/util/List;

    .line 146
    .line 147
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    xor-int/lit8 v7, v2, 0x1

    .line 152
    .line 153
    const/16 v9, 0x8

    .line 154
    .line 155
    const/4 v10, 0x0

    .line 156
    const/4 v8, 0x0

    .line 157
    invoke-direct/range {v4 .. v10}, Lcom/swmansion/rnscreens/gamma/stack/host/a;-><init>(Lcom/swmansion/rnscreens/gamma/stack/screen/d;IZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 158
    .line 159
    .line 160
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    iget-object v2, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->A:Ljava/util/List;

    .line 164
    .line 165
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_6
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->A:Ljava/util/List;

    .line 170
    .line 171
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-nez v1, :cond_7

    .line 176
    .line 177
    new-instance v1, Lcom/swmansion/rnscreens/gamma/stack/host/g;

    .line 178
    .line 179
    iget-object v2, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->A:Ljava/util/List;

    .line 180
    .line 181
    invoke-static {v2}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    check-cast v2, Lcom/swmansion/rnscreens/gamma/stack/screen/d;

    .line 186
    .line 187
    invoke-direct {v1, v2}, Lcom/swmansion/rnscreens/gamma/stack/host/g;-><init>(Lcom/swmansion/rnscreens/gamma/stack/screen/d;)V

    .line 188
    .line 189
    .line 190
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->B:Ljava/util/List;

    .line 194
    .line 195
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 196
    .line 197
    .line 198
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->C:Ljava/util/List;

    .line 199
    .line 200
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 201
    .line 202
    .line 203
    return-object v0

    .line 204
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 205
    .line 206
    const-string v1, "[RNScreens] Stack should never be empty after updates"

    .line 207
    .line 208
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    throw v0
.end method

.method private final g0(Lcom/swmansion/rnscreens/gamma/stack/screen/a;)Lcom/swmansion/rnscreens/gamma/stack/screen/d;
    .locals 3

    .line 1
    new-instance v0, Lcom/swmansion/rnscreens/gamma/stack/screen/d;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/swmansion/rnscreens/gamma/stack/screen/d;-><init>(Lcom/swmansion/rnscreens/gamma/stack/screen/a;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/stack/screen/a;->getScreenKey()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v2, "Created Fragment "

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, " for screen "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string v1, "StackContainer"

    .line 36
    .line 37
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    return-object v0
.end method

.method private final getHasPendingOperations()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->C:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->B:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    return v0
.end method

.method private final h0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "StackContainer ["

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v0, "] MODEL BEGIN"

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "StackContainer"

    .line 28
    .line 29
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->A:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Lcom/swmansion/rnscreens/gamma/stack/screen/d;

    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/gamma/stack/screen/d;->w()Lcom/swmansion/rnscreens/gamma/stack/screen/a;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/gamma/stack/screen/a;->getScreenKey()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    return-void
.end method

.method private final k0(Lcom/swmansion/rnscreens/gamma/stack/screen/d;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/stack/screen/d;->w()Lcom/swmansion/rnscreens/gamma/stack/screen/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/swmansion/rnscreens/gamma/stack/screen/a;->getScreenKey()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v3, "StackContainer ["

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v0, "] natively removed fragment "

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "StackContainer"

    .line 39
    .line 40
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->A:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->A:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/stack/host/h;->n0()Landroidx/fragment/app/K;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v2}, Landroidx/fragment/app/K;->H0()Landroidx/fragment/app/q;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-ne v0, p1, :cond_0

    .line 68
    .line 69
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->D:Lcom/swmansion/rnscreens/gamma/stack/host/c;

    .line 70
    .line 71
    new-instance p1, Lcom/swmansion/rnscreens/gamma/stack/host/g;

    .line 72
    .line 73
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->A:Ljava/util/List;

    .line 74
    .line 75
    invoke-static {v0}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Lcom/swmansion/rnscreens/gamma/stack/screen/d;

    .line 80
    .line 81
    invoke-direct {p1, v0}, Lcom/swmansion/rnscreens/gamma/stack/host/g;-><init>(Lcom/swmansion/rnscreens/gamma/stack/screen/d;)V

    .line 82
    .line 83
    .line 84
    invoke-static {p1}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    const/4 v5, 0x4

    .line 89
    const/4 v6, 0x0

    .line 90
    const/4 v4, 0x0

    .line 91
    invoke-static/range {v1 .. v6}, Lcom/swmansion/rnscreens/gamma/stack/host/c;->g(Lcom/swmansion/rnscreens/gamma/stack/host/c;Landroidx/fragment/app/K;Ljava/util/List;ZILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_0
    return-void

    .line 95
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 96
    .line 97
    const-string v0, "[RNScreens] Stack model should not be empty after a native pop"

    .line 98
    .line 99
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 104
    .line 105
    const-string v0, "[RNScreens] onNativeFragmentPop must be called with the fragment present in stack model"

    .line 106
    .line 107
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p1
.end method

.method private final m0(Landroidx/fragment/app/K;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/stack/host/h;->f0()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->D:Lcom/swmansion/rnscreens/gamma/stack/host/c;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v1, p1, v0, v2}, Lcom/swmansion/rnscreens/gamma/stack/host/c;->f(Landroidx/fragment/app/K;Ljava/util/List;Z)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/stack/host/h;->h0()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final n0()Landroidx/fragment/app/K;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->z:Landroidx/fragment/app/K;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "[RNScreens] Attempt to use nullish FragmentManager"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method


# virtual methods
.method public b(Landroidx/fragment/app/q;Z)V
    .locals 1

    .line 1
    const-string v0, "fragment"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/swmansion/rnscreens/gamma/stack/screen/d;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance p2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v0, "[RNScreens] Unexpected type of fragment: "

    .line 24
    .line 25
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string p2, "StackContainer"

    .line 36
    .line 37
    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    if-eqz p2, :cond_2

    .line 42
    .line 43
    iget-object p2, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->y:Ljava/lang/ref/WeakReference;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    check-cast p2, Lcom/swmansion/rnscreens/gamma/stack/host/i;

    .line 50
    .line 51
    if-eqz p2, :cond_1

    .line 52
    .line 53
    move-object v0, p1

    .line 54
    check-cast v0, Lcom/swmansion/rnscreens/gamma/stack/screen/d;

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/gamma/stack/screen/d;->w()Lcom/swmansion/rnscreens/gamma/stack/screen/a;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {p2, v0}, Lcom/swmansion/rnscreens/gamma/stack/host/i;->a(Lcom/swmansion/rnscreens/gamma/stack/screen/a;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    iget-object p2, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->A:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {p2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    if-eqz p2, :cond_2

    .line 70
    .line 71
    check-cast p1, Lcom/swmansion/rnscreens/gamma/stack/screen/d;

    .line 72
    .line 73
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/gamma/stack/host/h;->k0(Lcom/swmansion/rnscreens/gamma/stack/screen/d;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    return-void
.end method

.method public final i0(Lcom/swmansion/rnscreens/gamma/stack/screen/a;)V
    .locals 2

    .line 1
    const-string v0, "stackScreen"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->B:Ljava/util/List;

    .line 7
    .line 8
    new-instance v1, Lcom/swmansion/rnscreens/gamma/stack/host/e;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Lcom/swmansion/rnscreens/gamma/stack/host/e;-><init>(Lcom/swmansion/rnscreens/gamma/stack/screen/a;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final j0(Lcom/swmansion/rnscreens/gamma/stack/screen/a;)V
    .locals 2

    .line 1
    const-string v0, "stackScreen"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->C:Ljava/util/List;

    .line 7
    .line 8
    new-instance v1, Lcom/swmansion/rnscreens/gamma/stack/host/f;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Lcom/swmansion/rnscreens/gamma/stack/host/f;-><init>(Lcom/swmansion/rnscreens/gamma/stack/screen/a;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final l0()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/stack/host/h;->getHasPendingOperations()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/stack/host/h;->n0()Landroidx/fragment/app/K;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/gamma/stack/host/h;->m0(Landroidx/fragment/app/K;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final o0()V
    .locals 2

    .line 1
    sget-object v0, LXa/b;->a:LXa/b;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LXa/b;->a(Landroid/view/ViewGroup;)Landroidx/fragment/app/K;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Landroidx/fragment/app/K;->n(Landroidx/fragment/app/K$o;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->z:Landroidx/fragment/app/K;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v1, "[RNScreens] Nullish fragment manager - can\'t run container operations"

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw v0
.end method

.method public onAttachedToWindow()V
    .locals 4

    .line 1
    sget-object v0, Lfb/e;->a:Lfb/e;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v3, "StackContainer ["

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, "] attached to window"

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "StackContainer"

    .line 30
    .line 31
    invoke-virtual {v0, v2, v1}, Lfb/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-super {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onAttachedToWindow()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/stack/host/h;->o0()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/stack/host/h;->l0()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public onBackStackChanged()V
    .locals 0

    .line 1
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/stack/host/h;->n0()Landroidx/fragment/app/K;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p0}, Landroidx/fragment/app/K;->p1(Landroidx/fragment/app/K$o;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/swmansion/rnscreens/gamma/stack/host/h;->z:Landroidx/fragment/app/K;

    .line 13
    .line 14
    return-void
.end method
