.class public final LAd/a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LAd/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LAd/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lexpo/modules/updates/reloadscreen/ReloadScreenOptions;)LAd/a;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Lexpo/modules/updates/reloadscreen/ReloadScreenOptions;->getImage()Lexpo/modules/updates/reloadscreen/ReloadScreenImageSource;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    :goto_0
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    move v1, v2

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move v1, v3

    .line 17
    :goto_1
    new-instance v4, LAd/a;

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p1}, Lexpo/modules/updates/reloadscreen/ReloadScreenOptions;->getBackgroundColor()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    if-eqz v5, :cond_2

    .line 26
    .line 27
    :goto_2
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    goto :goto_3

    .line 32
    :cond_2
    const-string v5, "#ffffff"

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :goto_3
    if-eqz p1, :cond_3

    .line 36
    .line 37
    invoke-virtual {p1}, Lexpo/modules/updates/reloadscreen/ReloadScreenOptions;->getImage()Lexpo/modules/updates/reloadscreen/ReloadScreenImageSource;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_3
    move-object v6, v0

    .line 42
    if-eqz p1, :cond_5

    .line 43
    .line 44
    invoke-virtual {p1}, Lexpo/modules/updates/reloadscreen/ReloadScreenOptions;->getImageResizeMode()Lexpo/modules/updates/reloadscreen/ImageResizeMode;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-nez v0, :cond_4

    .line 49
    .line 50
    goto :goto_5

    .line 51
    :cond_4
    :goto_4
    move-object v7, v0

    .line 52
    goto :goto_6

    .line 53
    :cond_5
    :goto_5
    sget-object v0, Lexpo/modules/updates/reloadscreen/ImageResizeMode;->CONTAIN:Lexpo/modules/updates/reloadscreen/ImageResizeMode;

    .line 54
    .line 55
    goto :goto_4

    .line 56
    :goto_6
    if-eqz p1, :cond_6

    .line 57
    .line 58
    invoke-virtual {p1}, Lexpo/modules/updates/reloadscreen/ReloadScreenOptions;->getImageFullScreen()Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-eqz v0, :cond_6

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    move v8, v0

    .line 69
    goto :goto_7

    .line 70
    :cond_6
    move v8, v3

    .line 71
    :goto_7
    if-eqz p1, :cond_7

    .line 72
    .line 73
    invoke-virtual {p1}, Lexpo/modules/updates/reloadscreen/ReloadScreenOptions;->getFade()Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-eqz v0, :cond_7

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    move v9, v0

    .line 84
    goto :goto_8

    .line 85
    :cond_7
    move v9, v3

    .line 86
    :goto_8
    new-instance v10, LAd/f;

    .line 87
    .line 88
    if-eqz p1, :cond_8

    .line 89
    .line 90
    invoke-virtual {p1}, Lexpo/modules/updates/reloadscreen/ReloadScreenOptions;->getSpinner()Lexpo/modules/updates/reloadscreen/SpinnerOptions;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-eqz v0, :cond_8

    .line 95
    .line 96
    invoke-virtual {v0}, Lexpo/modules/updates/reloadscreen/SpinnerOptions;->getEnabled()Ljava/lang/Boolean;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-eqz v0, :cond_8

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    goto :goto_9

    .line 107
    :cond_8
    if-nez v1, :cond_9

    .line 108
    .line 109
    goto :goto_9

    .line 110
    :cond_9
    move v2, v3

    .line 111
    :goto_9
    if-eqz p1, :cond_a

    .line 112
    .line 113
    invoke-virtual {p1}, Lexpo/modules/updates/reloadscreen/ReloadScreenOptions;->getSpinner()Lexpo/modules/updates/reloadscreen/SpinnerOptions;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-eqz v0, :cond_a

    .line 118
    .line 119
    invoke-virtual {v0}, Lexpo/modules/updates/reloadscreen/SpinnerOptions;->getColor()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-eqz v0, :cond_a

    .line 124
    .line 125
    :goto_a
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    goto :goto_b

    .line 130
    :cond_a
    const-string v0, "#007aff"

    .line 131
    .line 132
    goto :goto_a

    .line 133
    :goto_b
    if-eqz p1, :cond_b

    .line 134
    .line 135
    invoke-virtual {p1}, Lexpo/modules/updates/reloadscreen/ReloadScreenOptions;->getSpinner()Lexpo/modules/updates/reloadscreen/SpinnerOptions;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-eqz p1, :cond_b

    .line 140
    .line 141
    invoke-virtual {p1}, Lexpo/modules/updates/reloadscreen/SpinnerOptions;->getSize()Lexpo/modules/updates/reloadscreen/SpinnerSize;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    if-nez p1, :cond_c

    .line 146
    .line 147
    :cond_b
    sget-object p1, Lexpo/modules/updates/reloadscreen/SpinnerSize;->MEDIUM:Lexpo/modules/updates/reloadscreen/SpinnerSize;

    .line 148
    .line 149
    :cond_c
    invoke-direct {v10, v2, v0, p1}, LAd/f;-><init>(ZILexpo/modules/updates/reloadscreen/SpinnerSize;)V

    .line 150
    .line 151
    .line 152
    invoke-direct/range {v4 .. v10}, LAd/a;-><init>(ILexpo/modules/updates/reloadscreen/ReloadScreenImageSource;Lexpo/modules/updates/reloadscreen/ImageResizeMode;ZZLAd/f;)V

    .line 153
    .line 154
    .line 155
    return-object v4
.end method
