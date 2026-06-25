.class public abstract LKd/n;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final synthetic a(Lq2/h0;Landroidx/media3/exoplayer/hls/d;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LKd/n;->b(Lq2/h0;Landroidx/media3/exoplayer/hls/d;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final b(Lq2/h0;Landroidx/media3/exoplayer/hls/d;)Ljava/util/List;
    .locals 11

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lq2/h0;->b()LP9/u;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, LP9/u;->l()LP9/X;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v1, "iterator(...)"

    .line 15
    .line 16
    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_6

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lq2/h0$a;

    .line 30
    .line 31
    iget v2, v1, Lq2/h0$a;->a:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    :goto_0
    if-ge v3, v2, :cond_0

    .line 35
    .line 36
    invoke-virtual {v1, v3}, Lq2/h0$a;->d(I)Lq2/x;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    const-string v5, "getTrackFormat(...)"

    .line 41
    .line 42
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v3}, Lq2/h0$a;->j(I)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    const/4 v6, 0x0

    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    iget-object v7, p1, Landroidx/media3/exoplayer/hls/d;->a:LH2/i;

    .line 53
    .line 54
    if-eqz v7, :cond_3

    .line 55
    .line 56
    iget-object v7, v7, LH2/i;->e:Ljava/util/List;

    .line 57
    .line 58
    if-eqz v7, :cond_3

    .line 59
    .line 60
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    :cond_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    if-eqz v8, :cond_2

    .line 69
    .line 70
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    move-object v9, v8

    .line 75
    check-cast v9, LH2/i$b;

    .line 76
    .line 77
    iget-object v9, v9, LH2/i$b;->b:Lq2/x;

    .line 78
    .line 79
    iget-object v9, v9, Lq2/x;->a:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v10, v4, Lq2/x;->a:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v9, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    if-eqz v9, :cond_1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    move-object v8, v6

    .line 91
    :goto_1
    check-cast v8, LH2/i$b;

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    move-object v8, v6

    .line 95
    :goto_2
    if-eqz v8, :cond_4

    .line 96
    .line 97
    iget-object v6, v8, LH2/i$b;->a:Landroid/net/Uri;

    .line 98
    .line 99
    :cond_4
    iget-object v7, v4, Lq2/x;->o:Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {v7}, Lq2/K;->t(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-nez v7, :cond_5

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_5
    sget-object v7, Lexpo/modules/video/records/VideoTrack;->Companion:Lexpo/modules/video/records/VideoTrack$a;

    .line 109
    .line 110
    invoke-virtual {v7, v4, v5, v6}, Lexpo/modules/video/records/VideoTrack$a;->a(Lq2/x;ZLandroid/net/Uri;)Lexpo/modules/video/records/VideoTrack;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_6
    invoke-static {v0}, LUd/u;->j0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0
.end method
