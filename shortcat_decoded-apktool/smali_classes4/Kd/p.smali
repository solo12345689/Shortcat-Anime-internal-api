.class public final LKd/p;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LHd/b;


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;

.field private final b:Ljava/util/Map;

.field private c:Lq2/x;

.field private d:Lq2/b0;

.field private final e:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lexpo/modules/video/player/VideoPlayer;)V
    .locals 1

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LKd/p;->a:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, LKd/p;->b:Ljava/util/Map;

    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, LKd/p;->e:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {p1, p0}, Lexpo/modules/video/player/VideoPlayer;->a2(LHd/b;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method private final a(Lexpo/modules/video/records/SubtitleTrack;)V
    .locals 8

    .line 1
    invoke-direct {p0}, LKd/p;->e()Lexpo/modules/video/player/VideoPlayer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    invoke-virtual {v0}, Lexpo/modules/video/player/VideoPlayer;->y2()Landroidx/media3/exoplayer/ExoPlayer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_0

    .line 14
    .line 15
    :cond_0
    invoke-interface {v0}, Lq2/P;->j0()Lq2/d0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "getTrackSelectionParameters(...)"

    .line 20
    .line 21
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, LKd/p;->d:Lq2/b0;

    .line 25
    .line 26
    const-string v3, "build(...)"

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Lq2/d0;->I()Lq2/d0$c;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v2, 0x3

    .line 35
    invoke-virtual {v1, v2}, Lq2/d0$c;->I(I)Lq2/d0$c;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Lq2/d0$c;->G()Lq2/d0;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    const/4 v2, 0x0

    .line 47
    if-nez p1, :cond_2

    .line 48
    .line 49
    invoke-interface {v0, v1}, Lq2/P;->P(Lq2/d0;)V

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    invoke-virtual {p0, p1}, LKd/p;->g(Z)V

    .line 54
    .line 55
    .line 56
    iput-object v2, p0, LKd/p;->d:Lq2/b0;

    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    iget-object v4, p0, LKd/p;->b:Ljava/util/Map;

    .line 60
    .line 61
    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Ljava/lang/Iterable;

    .line 66
    .line 67
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-eqz v5, :cond_4

    .line 76
    .line 77
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    move-object v6, v5

    .line 82
    check-cast v6, Lq2/x;

    .line 83
    .line 84
    iget-object v6, v6, Lq2/x;->a:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {p1}, Lexpo/modules/video/records/SubtitleTrack;->getId()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-eqz v6, :cond_3

    .line 95
    .line 96
    move-object v2, v5

    .line 97
    :cond_4
    check-cast v2, Lq2/x;

    .line 98
    .line 99
    if-eqz v2, :cond_5

    .line 100
    .line 101
    iget-object p1, p0, LKd/p;->b:Ljava/util/Map;

    .line 102
    .line 103
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    check-cast p1, Lkotlin/Pair;

    .line 108
    .line 109
    if-eqz p1, :cond_5

    .line 110
    .line 111
    new-instance v2, Lq2/b0;

    .line 112
    .line 113
    invoke-virtual {p1}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    check-cast v4, Lq2/a0;

    .line 118
    .line 119
    invoke-virtual {p1}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    check-cast p1, Ljava/lang/Number;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    invoke-direct {v2, v4, p1}, Lq2/b0;-><init>(Lq2/a0;I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Lq2/d0;->I()Lq2/d0$c;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p1, v2}, Lq2/d0$c;->F(Lq2/b0;)Lq2/d0$c;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {p1}, Lq2/d0$c;->G()Lq2/d0;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-interface {v0, p1}, Lq2/P;->P(Lq2/d0;)V

    .line 148
    .line 149
    .line 150
    const/4 p1, 0x1

    .line 151
    invoke-virtual {p0, p1}, LKd/p;->g(Z)V

    .line 152
    .line 153
    .line 154
    iput-object v2, p0, LKd/p;->d:Lq2/b0;

    .line 155
    .line 156
    :cond_5
    :goto_0
    return-void
.end method

.method private final b()Lq2/x;
    .locals 7

    .line 1
    invoke-direct {p0}, LKd/p;->e()Lexpo/modules/video/player/VideoPlayer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lexpo/modules/video/player/VideoPlayer;->y2()Landroidx/media3/exoplayer/ExoPlayer;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Lq2/P;->j0()Lq2/d0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, v1

    .line 20
    :goto_0
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v2, v0, Lq2/d0;->v:LP9/u;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object v2, v1

    .line 26
    :goto_1
    if-eqz v0, :cond_3

    .line 27
    .line 28
    iget-object v0, v0, Lq2/d0;->D:LP9/v;

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_3

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Ljava/util/Map$Entry;

    .line 51
    .line 52
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Lq2/a0;

    .line 57
    .line 58
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Lq2/b0;

    .line 63
    .line 64
    iget v5, v4, Lq2/a0;->c:I

    .line 65
    .line 66
    const/4 v6, 0x3

    .line 67
    if-ne v5, v6, :cond_2

    .line 68
    .line 69
    iget-object v0, v3, Lq2/b0;->b:LP9/u;

    .line 70
    .line 71
    const-string v3, "trackIndices"

    .line 72
    .line 73
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, LUd/u;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Ljava/lang/Integer;

    .line 81
    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-virtual {v4, v0}, Lq2/a0;->c(I)Lq2/x;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    goto :goto_2

    .line 93
    :cond_3
    move-object v0, v1

    .line 94
    :goto_2
    if-eqz v2, :cond_6

    .line 95
    .line 96
    invoke-virtual {v2}, LP9/u;->l()LP9/X;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    const-string v3, "iterator(...)"

    .line 101
    .line 102
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_6

    .line 110
    .line 111
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, Ljava/lang/String;

    .line 116
    .line 117
    iget-object v3, p0, LKd/p;->b:Ljava/util/Map;

    .line 118
    .line 119
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    check-cast v3, Ljava/lang/Iterable;

    .line 124
    .line 125
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-eqz v4, :cond_5

    .line 134
    .line 135
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    move-object v5, v4

    .line 140
    check-cast v5, Lq2/x;

    .line 141
    .line 142
    iget-object v5, v5, Lq2/x;->d:Ljava/lang/String;

    .line 143
    .line 144
    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-eqz v5, :cond_4

    .line 149
    .line 150
    move-object v1, v4

    .line 151
    :cond_5
    check-cast v1, Lq2/x;

    .line 152
    .line 153
    :cond_6
    if-nez v0, :cond_7

    .line 154
    .line 155
    return-object v1

    .line 156
    :cond_7
    return-object v0
.end method

.method private final e()Lexpo/modules/video/player/VideoPlayer;
    .locals 1

    .line 1
    iget-object v0, p0, LKd/p;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/video/player/VideoPlayer;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final c()Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, LKd/p;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Lexpo/modules/video/records/SubtitleTrack;
    .locals 2

    .line 1
    sget-object v0, Lexpo/modules/video/records/SubtitleTrack;->Companion:Lexpo/modules/video/records/SubtitleTrack$a;

    .line 2
    .line 3
    iget-object v1, p0, LKd/p;->c:Lq2/x;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lexpo/modules/video/records/SubtitleTrack$a;->a(Lq2/x;)Lexpo/modules/video/records/SubtitleTrack;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final f(Lexpo/modules/video/records/SubtitleTrack;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LKd/p;->a(Lexpo/modules/video/records/SubtitleTrack;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final g(Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, LKd/p;->e()Lexpo/modules/video/player/VideoPlayer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Lexpo/modules/video/player/VideoPlayer;->y2()Landroidx/media3/exoplayer/ExoPlayer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-interface {v0}, Lq2/P;->j0()Lq2/d0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v0}, Lq2/d0;->I()Lq2/d0$c;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    xor-int/lit8 v1, p1, 0x1

    .line 25
    .line 26
    const/4 v2, 0x3

    .line 27
    invoke-virtual {v0, v2, v1}, Lq2/d0$c;->V(IZ)Lq2/d0$c;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lq2/d0$c;->G()Lq2/d0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "build(...)"

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    invoke-virtual {v0}, Lq2/d0;->I()Lq2/d0$c;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1, v2}, Lq2/d0$c;->I(I)Lq2/d0$c;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lq2/d0$c;->G()Lq2/d0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-direct {p0}, LKd/p;->e()Lexpo/modules/video/player/VideoPlayer;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    invoke-virtual {p1}, Lexpo/modules/video/player/VideoPlayer;->y2()Landroidx/media3/exoplayer/ExoPlayer;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    invoke-interface {p1, v0}, Lq2/P;->P(Lq2/d0;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    :goto_0
    return-void
.end method

.method public onAudioMixingModeChanged(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/enums/AudioMixingMode;Lexpo/modules/video/enums/AudioMixingMode;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHd/b$a;->a(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/enums/AudioMixingMode;Lexpo/modules/video/enums/AudioMixingMode;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onIsPlayingChanged(Lexpo/modules/video/player/VideoPlayer;ZLjava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHd/b$a;->b(LHd/b;Lexpo/modules/video/player/VideoPlayer;ZLjava/lang/Boolean;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onMutedChanged(Lexpo/modules/video/player/VideoPlayer;ZLjava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHd/b$a;->c(LHd/b;Lexpo/modules/video/player/VideoPlayer;ZLjava/lang/Boolean;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onPlaybackRateChanged(Lexpo/modules/video/player/VideoPlayer;FLjava/lang/Float;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHd/b$a;->d(LHd/b;Lexpo/modules/video/player/VideoPlayer;FLjava/lang/Float;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onPlayedToEnd(Lexpo/modules/video/player/VideoPlayer;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LHd/b$a;->e(LHd/b;Lexpo/modules/video/player/VideoPlayer;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onRenderedFirstFrame(Lexpo/modules/video/player/VideoPlayer;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LHd/b$a;->f(LHd/b;Lexpo/modules/video/player/VideoPlayer;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onSourceChanged(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;Lexpo/modules/video/records/VideoSource;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHd/b$a;->g(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;Lexpo/modules/video/records/VideoSource;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onStatusChanged(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/records/PlaybackError;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, LHd/b$a;->h(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/records/PlaybackError;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onTargetViewChanged(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/VideoView;Lexpo/modules/video/VideoView;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHd/b$a;->i(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/VideoView;Lexpo/modules/video/VideoView;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onTimeUpdate(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/TimeUpdate;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LHd/b$a;->j(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/TimeUpdate;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onTrackSelectionParametersChanged(Lexpo/modules/video/player/VideoPlayer;Lq2/d0;)V
    .locals 1

    .line 1
    const-string v0, "player"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "trackSelectionParameters"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, LKd/p;->b()Lq2/x;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LKd/p;->c:Lq2/x;

    .line 16
    .line 17
    invoke-static {p0, p1, p2}, LHd/b$a;->k(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lq2/d0;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onTracksChanged(Lexpo/modules/video/player/VideoPlayer;Lq2/h0;)V
    .locals 9

    .line 1
    const-string v0, "player"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "tracks"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LKd/p;->b:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LKd/p;->e:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Lq2/h0;->b()LP9/u;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, LP9/u;->l()LP9/X;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "iterator(...)"

    .line 30
    .line 31
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lq2/h0$a;

    .line 45
    .line 46
    iget v2, v1, Lq2/h0$a;->a:I

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    :goto_0
    if-ge v3, v2, :cond_0

    .line 50
    .line 51
    invoke-virtual {v1, v3}, Lq2/h0$a;->d(I)Lq2/x;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    const-string v5, "getTrackFormat(...)"

    .line 56
    .line 57
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-object v5, v4, Lq2/x;->o:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v5}, Lq2/K;->s(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_2

    .line 67
    .line 68
    iget-object v5, p0, LKd/p;->b:Ljava/util/Map;

    .line 69
    .line 70
    new-instance v6, Lkotlin/Pair;

    .line 71
    .line 72
    invoke-virtual {v1}, Lq2/h0$a;->c()Lq2/a0;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    invoke-direct {v6, v7, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v5, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    sget-object v5, Lexpo/modules/video/records/SubtitleTrack;->Companion:Lexpo/modules/video/records/SubtitleTrack$a;

    .line 87
    .line 88
    invoke-virtual {v5, v4}, Lexpo/modules/video/records/SubtitleTrack$a;->a(Lq2/x;)Lexpo/modules/video/records/SubtitleTrack;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    if-nez v4, :cond_1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    iget-object v5, p0, LKd/p;->e:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_3
    invoke-direct {p0}, LKd/p;->b()Lq2/x;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iput-object v0, p0, LKd/p;->c:Lq2/x;

    .line 108
    .line 109
    invoke-static {p0, p1, p2}, LHd/b$a;->l(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lq2/h0;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public onVideoSourceLoaded(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, LHd/b$a;->m(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVideoTrackChanged(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoTrack;Lexpo/modules/video/records/VideoTrack;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHd/b$a;->n(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoTrack;Lexpo/modules/video/records/VideoTrack;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVolumeChanged(Lexpo/modules/video/player/VideoPlayer;FLjava/lang/Float;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHd/b$a;->o(LHd/b;Lexpo/modules/video/player/VideoPlayer;FLjava/lang/Float;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
