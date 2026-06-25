.class public abstract LFd/x;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Landroidx/media3/ui/PlayerView;Lexpo/modules/video/records/ButtonOptions;Z)V
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "config"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-nez p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Lexpo/modules/video/records/ButtonOptions;->getShowSeekForward()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    move v2, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v2, v0

    .line 24
    :goto_0
    invoke-virtual {p0, v2}, Landroidx/media3/ui/PlayerView;->setShowFastForwardButton(Z)V

    .line 25
    .line 26
    .line 27
    if-nez p2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, Lexpo/modules/video/records/ButtonOptions;->getShowSeekBackward()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    move v2, v1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v2, v0

    .line 38
    :goto_1
    invoke-virtual {p0, v2}, Landroidx/media3/ui/PlayerView;->setShowRewindButton(Z)V

    .line 39
    .line 40
    .line 41
    if-nez p2, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1}, Lexpo/modules/video/records/ButtonOptions;->getShowPrevious()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    move v2, v1

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move v2, v0

    .line 52
    :goto_2
    invoke-virtual {p0, v2}, Landroidx/media3/ui/PlayerView;->setShowPreviousButton(Z)V

    .line 53
    .line 54
    .line 55
    if-nez p2, :cond_3

    .line 56
    .line 57
    invoke-virtual {p1}, Lexpo/modules/video/records/ButtonOptions;->getShowNext()Z

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-eqz p2, :cond_3

    .line 62
    .line 63
    move v0, v1

    .line 64
    :cond_3
    invoke-virtual {p0, v0}, Landroidx/media3/ui/PlayerView;->setShowNextButton(Z)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lexpo/modules/video/records/ButtonOptions;->getShowSettings()Z

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    invoke-static {p0, p2}, LFd/x;->f(Landroidx/media3/ui/PlayerView;Z)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Lexpo/modules/video/records/ButtonOptions;->getShowPlayPause()Z

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    invoke-static {p0, p2}, LFd/x;->e(Landroidx/media3/ui/PlayerView;Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Lexpo/modules/video/records/ButtonOptions;->getShowBottomBar()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    invoke-static {p0, p1}, LFd/x;->c(Landroidx/media3/ui/PlayerView;Z)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public static final b(Landroidx/media3/ui/PlayerView;Z)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    xor-int/lit8 v0, p1, 0x1

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/media3/ui/PlayerView;->setShowFastForwardButton(Z)V

    .line 9
    .line 10
    .line 11
    xor-int/lit8 v0, p1, 0x1

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroidx/media3/ui/PlayerView;->setShowRewindButton(Z)V

    .line 14
    .line 15
    .line 16
    xor-int/lit8 v0, p1, 0x1

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroidx/media3/ui/PlayerView;->setShowPreviousButton(Z)V

    .line 19
    .line 20
    .line 21
    xor-int/lit8 v0, p1, 0x1

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroidx/media3/ui/PlayerView;->setShowNextButton(Z)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, p1}, LFd/x;->g(Landroidx/media3/ui/PlayerView;Z)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static final c(Landroidx/media3/ui/PlayerView;Z)V
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, LG3/x;->e:I

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroid/view/ViewGroup;

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    move v3, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v3, v1

    .line 24
    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    :cond_1
    sget v0, LG3/x;->G:I

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Landroidx/media3/ui/b;

    .line 34
    .line 35
    if-eqz p0, :cond_3

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    move v1, v2

    .line 40
    :cond_2
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 41
    .line 42
    .line 43
    :cond_3
    return-void
.end method

.method public static final d(Landroidx/media3/ui/PlayerView;Z)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, LG3/x;->s:I

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Landroid/widget/ImageButton;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 p1, 0x8

    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public static final e(Landroidx/media3/ui/PlayerView;Z)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, LG3/x;->C:I

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Landroid/widget/ImageButton;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 p1, 0x8

    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public static final f(Landroidx/media3/ui/PlayerView;Z)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, LG3/x;->L:I

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Landroid/widget/ImageButton;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 p1, 0x8

    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public static final g(Landroidx/media3/ui/PlayerView;Z)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, LG3/x;->G:I

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Landroidx/media3/ui/b;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroidx/media3/ui/b;->setScrubberColor(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    if-eqz p0, :cond_3

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroidx/media3/ui/b;->setEnabled(Z)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    if-eqz p0, :cond_2

    .line 29
    .line 30
    const/4 p1, -0x1

    .line 31
    invoke-virtual {p0, p1}, Landroidx/media3/ui/b;->setScrubberColor(I)V

    .line 32
    .line 33
    .line 34
    :cond_2
    if-eqz p0, :cond_3

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    invoke-virtual {p0, p1}, Landroidx/media3/ui/b;->setEnabled(Z)V

    .line 38
    .line 39
    .line 40
    :cond_3
    return-void
.end method
